/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.navercorp.pinpoint.thrift.dto;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-03-16")
public class TCpuLoad implements org.apache.thrift.TBase<TCpuLoad, TCpuLoad._Fields>, java.io.Serializable, Cloneable, Comparable<TCpuLoad> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCpuLoad");

  private static final org.apache.thrift.protocol.TField JVM_CPU_LOAD_FIELD_DESC = new org.apache.thrift.protocol.TField("jvmCpuLoad", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField SYSTEM_CPU_LOAD_FIELD_DESC = new org.apache.thrift.protocol.TField("systemCpuLoad", org.apache.thrift.protocol.TType.DOUBLE, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TCpuLoadStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TCpuLoadTupleSchemeFactory();

  private double jvmCpuLoad; // optional
  private double systemCpuLoad; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    JVM_CPU_LOAD((short)1, "jvmCpuLoad"),
    SYSTEM_CPU_LOAD((short)2, "systemCpuLoad");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // JVM_CPU_LOAD
          return JVM_CPU_LOAD;
        case 2: // SYSTEM_CPU_LOAD
          return SYSTEM_CPU_LOAD;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __JVMCPULOAD_ISSET_ID = 0;
  private static final int __SYSTEMCPULOAD_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.JVM_CPU_LOAD,_Fields.SYSTEM_CPU_LOAD};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JVM_CPU_LOAD, new org.apache.thrift.meta_data.FieldMetaData("jvmCpuLoad", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.SYSTEM_CPU_LOAD, new org.apache.thrift.meta_data.FieldMetaData("systemCpuLoad", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCpuLoad.class, metaDataMap);
  }

  public TCpuLoad() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCpuLoad(TCpuLoad other) {
    __isset_bitfield = other.__isset_bitfield;
    this.jvmCpuLoad = other.jvmCpuLoad;
    this.systemCpuLoad = other.systemCpuLoad;
  }

  public TCpuLoad deepCopy() {
    return new TCpuLoad(this);
  }

  @Override
  public void clear() {
    setJvmCpuLoadIsSet(false);
    this.jvmCpuLoad = 0.0;
    setSystemCpuLoadIsSet(false);
    this.systemCpuLoad = 0.0;
  }

  public double getJvmCpuLoad() {
    return this.jvmCpuLoad;
  }

  public void setJvmCpuLoad(double jvmCpuLoad) {
    this.jvmCpuLoad = jvmCpuLoad;
    setJvmCpuLoadIsSet(true);
  }

  public void unsetJvmCpuLoad() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __JVMCPULOAD_ISSET_ID);
  }

  /** Returns true if field jvmCpuLoad is set (has been assigned a value) and false otherwise */
  public boolean isSetJvmCpuLoad() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __JVMCPULOAD_ISSET_ID);
  }

  public void setJvmCpuLoadIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __JVMCPULOAD_ISSET_ID, value);
  }

  public double getSystemCpuLoad() {
    return this.systemCpuLoad;
  }

  public void setSystemCpuLoad(double systemCpuLoad) {
    this.systemCpuLoad = systemCpuLoad;
    setSystemCpuLoadIsSet(true);
  }

  public void unsetSystemCpuLoad() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SYSTEMCPULOAD_ISSET_ID);
  }

  /** Returns true if field systemCpuLoad is set (has been assigned a value) and false otherwise */
  public boolean isSetSystemCpuLoad() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SYSTEMCPULOAD_ISSET_ID);
  }

  public void setSystemCpuLoadIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SYSTEMCPULOAD_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case JVM_CPU_LOAD:
      if (value == null) {
        unsetJvmCpuLoad();
      } else {
        setJvmCpuLoad((java.lang.Double)value);
      }
      break;

    case SYSTEM_CPU_LOAD:
      if (value == null) {
        unsetSystemCpuLoad();
      } else {
        setSystemCpuLoad((java.lang.Double)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case JVM_CPU_LOAD:
      return getJvmCpuLoad();

    case SYSTEM_CPU_LOAD:
      return getSystemCpuLoad();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case JVM_CPU_LOAD:
      return isSetJvmCpuLoad();
    case SYSTEM_CPU_LOAD:
      return isSetSystemCpuLoad();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TCpuLoad)
      return this.equals((TCpuLoad)that);
    return false;
  }

  public boolean equals(TCpuLoad that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_jvmCpuLoad = true && this.isSetJvmCpuLoad();
    boolean that_present_jvmCpuLoad = true && that.isSetJvmCpuLoad();
    if (this_present_jvmCpuLoad || that_present_jvmCpuLoad) {
      if (!(this_present_jvmCpuLoad && that_present_jvmCpuLoad))
        return false;
      if (this.jvmCpuLoad != that.jvmCpuLoad)
        return false;
    }

    boolean this_present_systemCpuLoad = true && this.isSetSystemCpuLoad();
    boolean that_present_systemCpuLoad = true && that.isSetSystemCpuLoad();
    if (this_present_systemCpuLoad || that_present_systemCpuLoad) {
      if (!(this_present_systemCpuLoad && that_present_systemCpuLoad))
        return false;
      if (this.systemCpuLoad != that.systemCpuLoad)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetJvmCpuLoad()) ? 131071 : 524287);
    if (isSetJvmCpuLoad())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(jvmCpuLoad);

    hashCode = hashCode * 8191 + ((isSetSystemCpuLoad()) ? 131071 : 524287);
    if (isSetSystemCpuLoad())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(systemCpuLoad);

    return hashCode;
  }

  @Override
  public int compareTo(TCpuLoad other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetJvmCpuLoad()).compareTo(other.isSetJvmCpuLoad());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJvmCpuLoad()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jvmCpuLoad, other.jvmCpuLoad);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSystemCpuLoad()).compareTo(other.isSetSystemCpuLoad());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSystemCpuLoad()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.systemCpuLoad, other.systemCpuLoad);
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
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TCpuLoad(");
    boolean first = true;

    if (isSetJvmCpuLoad()) {
      sb.append("jvmCpuLoad:");
      sb.append(this.jvmCpuLoad);
      first = false;
    }
    if (isSetSystemCpuLoad()) {
      if (!first) sb.append(", ");
      sb.append("systemCpuLoad:");
      sb.append(this.systemCpuLoad);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TCpuLoadStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TCpuLoadStandardScheme getScheme() {
      return new TCpuLoadStandardScheme();
    }
  }

  private static class TCpuLoadStandardScheme extends org.apache.thrift.scheme.StandardScheme<TCpuLoad> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TCpuLoad struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JVM_CPU_LOAD
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.jvmCpuLoad = iprot.readDouble();
              struct.setJvmCpuLoadIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SYSTEM_CPU_LOAD
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.systemCpuLoad = iprot.readDouble();
              struct.setSystemCpuLoadIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TCpuLoad struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetJvmCpuLoad()) {
        oprot.writeFieldBegin(JVM_CPU_LOAD_FIELD_DESC);
        oprot.writeDouble(struct.jvmCpuLoad);
        oprot.writeFieldEnd();
      }
      if (struct.isSetSystemCpuLoad()) {
        oprot.writeFieldBegin(SYSTEM_CPU_LOAD_FIELD_DESC);
        oprot.writeDouble(struct.systemCpuLoad);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TCpuLoadTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TCpuLoadTupleScheme getScheme() {
      return new TCpuLoadTupleScheme();
    }
  }

  private static class TCpuLoadTupleScheme extends org.apache.thrift.scheme.TupleScheme<TCpuLoad> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCpuLoad struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetJvmCpuLoad()) {
        optionals.set(0);
      }
      if (struct.isSetSystemCpuLoad()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetJvmCpuLoad()) {
        oprot.writeDouble(struct.jvmCpuLoad);
      }
      if (struct.isSetSystemCpuLoad()) {
        oprot.writeDouble(struct.systemCpuLoad);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCpuLoad struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.jvmCpuLoad = iprot.readDouble();
        struct.setJvmCpuLoadIsSet(true);
      }
      if (incoming.get(1)) {
        struct.systemCpuLoad = iprot.readDouble();
        struct.setSystemCpuLoadIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
