/*
 * The Alluxio Open Foundation licenses this work under the Apache License, version 2.0
 * (the "License"). You may not use this work except in compliance with the License, which is
 * available at www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied, as more fully set forth in the License.
 *
 * See the NOTICE file distributed with this work for information regarding copyright ownership.
 */

package alluxio.thread;

import alluxio.util.ExceptionUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/**
 * This thread is able to capture uncaught exceptions from {@code run()}
 * so other classes can check the status of the thread and know why it crashed.
 */
public class AutopsyThread extends Thread {
  private static final Logger LOG = LoggerFactory.getLogger(AutopsyThread.class);

  /** If the thread meets an uncaught exception, this field will be set. */
  private final AtomicReference<Throwable> mThrowable = new AtomicReference<>(null);

  /**
   * Constructor.
   */
  public AutopsyThread() {
    setUncaughtExceptionHandler((thread, t) -> {
      onError(t);
    });
  }

  /**
   * Checks if the thread has crashed.
   *
   * @return true if the thread crashed due to an uncaught exception
   */
  public boolean crashed() {
    return mThrowable.get() != null;
  }

  /**
   * Sets the error before exiting.
   *
   * @param t the crashing error
   */
  public void setError(Throwable t) {
    mThrowable.set(t);
  }

  /**
   * Handles the uncaught error on thread crashing.
   * By default, just log the error for further analysis.
   *
   * @param t the crashing error
   */
  public void onError(Throwable t) {
    if (ExceptionUtils.containsInterruptedException(t)) {
      // Tolerate interruption when the master is failing over or closing
      // so we don't extra-crash
      LOG.warn("Thread {} interrupted, assume the master is failing over or shutting down",
          Thread.currentThread().getId());
      return;
    }
    LOG.error("Uncaught exception from thread {}", Thread.currentThread().getId(), t);
    setError(t);
  }

  /**
   * Gets the crashing error.
   *
   * @return the error
   */
  @Nullable
  public Throwable getError() {
    return mThrowable.get();
  }
}
