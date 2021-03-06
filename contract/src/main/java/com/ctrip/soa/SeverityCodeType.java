// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BaijiCommonTypes.proto

package com.ctrip.soa;

/**
 * Protobuf enum {@code com.ctrip.soa.SeverityCodeType}
 */
public enum SeverityCodeType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * prefix Severity to avoid conflict with AckCodeType's Warning
   * </pre>
   *
   * <code>SeverityError = 0;</code>
   */
  SeverityError(0),
  /**
   * <code>SeverityWarning = 1;</code>
   */
  SeverityWarning(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * prefix Severity to avoid conflict with AckCodeType's Warning
   * </pre>
   *
   * <code>SeverityError = 0;</code>
   */
  public static final int SeverityError_VALUE = 0;
  /**
   * <code>SeverityWarning = 1;</code>
   */
  public static final int SeverityWarning_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static SeverityCodeType valueOf(int value) {
    return forNumber(value);
  }

  public static SeverityCodeType forNumber(int value) {
    switch (value) {
      case 0: return SeverityError;
      case 1: return SeverityWarning;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SeverityCodeType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SeverityCodeType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SeverityCodeType>() {
          public SeverityCodeType findValueByNumber(int number) {
            return SeverityCodeType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.ctrip.soa.BaijiCommonTypes.getDescriptor().getEnumTypes().get(2);
  }

  private static final SeverityCodeType[] VALUES = values();

  public static SeverityCodeType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private SeverityCodeType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.ctrip.soa.SeverityCodeType)
}

