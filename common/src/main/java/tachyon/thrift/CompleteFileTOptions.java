/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package tachyon.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-10-28")
public class CompleteFileTOptions implements org.apache.thrift.TBase<CompleteFileTOptions, CompleteFileTOptions._Fields>, java.io.Serializable, Cloneable, Comparable<CompleteFileTOptions> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CompleteFileTOptions");

  private static final org.apache.thrift.protocol.TField LENGTH_FIELD_DESC = new org.apache.thrift.protocol.TField("length", org.apache.thrift.protocol.TType.I64, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CompleteFileTOptionsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CompleteFileTOptionsTupleSchemeFactory());
  }

  public long length; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LENGTH((short)1, "length");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // LENGTH
          return LENGTH;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __LENGTH_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.LENGTH};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LENGTH, new org.apache.thrift.meta_data.FieldMetaData("length", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CompleteFileTOptions.class, metaDataMap);
  }

  public CompleteFileTOptions() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CompleteFileTOptions(CompleteFileTOptions other) {
    __isset_bitfield = other.__isset_bitfield;
    this.length = other.length;
  }

  public CompleteFileTOptions deepCopy() {
    return new CompleteFileTOptions(this);
  }

  @Override
  public void clear() {
    setLengthIsSet(false);
    this.length = 0;
  }

  public long getLength() {
    return this.length;
  }

  public CompleteFileTOptions setLength(long length) {
    this.length = length;
    setLengthIsSet(true);
    return this;
  }

  public void unsetLength() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LENGTH_ISSET_ID);
  }

  /** Returns true if field length is set (has been assigned a value) and false otherwise */
  public boolean isSetLength() {
    return EncodingUtils.testBit(__isset_bitfield, __LENGTH_ISSET_ID);
  }

  public void setLengthIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LENGTH_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LENGTH:
      if (value == null) {
        unsetLength();
      } else {
        setLength((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LENGTH:
      return Long.valueOf(getLength());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LENGTH:
      return isSetLength();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CompleteFileTOptions)
      return this.equals((CompleteFileTOptions)that);
    return false;
  }

  public boolean equals(CompleteFileTOptions that) {
    if (that == null)
      return false;

    boolean this_present_length = true && this.isSetLength();
    boolean that_present_length = true && that.isSetLength();
    if (this_present_length || that_present_length) {
      if (!(this_present_length && that_present_length))
        return false;
      if (this.length != that.length)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_length = true && (isSetLength());
    list.add(present_length);
    if (present_length)
      list.add(length);

    return list.hashCode();
  }

  @Override
  public int compareTo(CompleteFileTOptions other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetLength()).compareTo(other.isSetLength());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLength()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.length, other.length);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("CompleteFileTOptions(");
    boolean first = true;

    if (isSetLength()) {
      sb.append("length:");
      sb.append(this.length);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CompleteFileTOptionsStandardSchemeFactory implements SchemeFactory {
    public CompleteFileTOptionsStandardScheme getScheme() {
      return new CompleteFileTOptionsStandardScheme();
    }
  }

  private static class CompleteFileTOptionsStandardScheme extends StandardScheme<CompleteFileTOptions> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CompleteFileTOptions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LENGTH
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.length = iprot.readI64();
              struct.setLengthIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CompleteFileTOptions struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetLength()) {
        oprot.writeFieldBegin(LENGTH_FIELD_DESC);
        oprot.writeI64(struct.length);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CompleteFileTOptionsTupleSchemeFactory implements SchemeFactory {
    public CompleteFileTOptionsTupleScheme getScheme() {
      return new CompleteFileTOptionsTupleScheme();
    }
  }

  private static class CompleteFileTOptionsTupleScheme extends TupleScheme<CompleteFileTOptions> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CompleteFileTOptions struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetLength()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetLength()) {
        oprot.writeI64(struct.length);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CompleteFileTOptions struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.length = iprot.readI64();
        struct.setLengthIsSet(true);
      }
    }
  }

}

