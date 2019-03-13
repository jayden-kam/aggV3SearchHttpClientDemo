// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.types.searchresponsetype.v3.proto

package com.ctrip.flight.intl.agg.types.searchresponsetype.v3;

/**
 * Protobuf type {@code com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType}
 */
public  final class FlightRefType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType)
    FlightRefTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FlightRefType.newBuilder() to construct.
  private FlightRefType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FlightRefType() {
    flightID_ = "";
    segmentNo_ = 0;
    sequenceNo_ = 0;
    marrySeg_ = "";
    mainSegment_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FlightRefType(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            flightID_ = s;
            break;
          }
          case 16: {

            segmentNo_ = input.readInt32();
            break;
          }
          case 24: {

            sequenceNo_ = input.readInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            marrySeg_ = s;
            break;
          }
          case 40: {

            mainSegment_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ctrip.flight.intl.agg.types.searchresponsetype.v3.AggTypesSearchresponsetypeV3.internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_FlightRefType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.intl.agg.types.searchresponsetype.v3.AggTypesSearchresponsetypeV3.internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_FlightRefType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType.class, com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType.Builder.class);
  }

  public static final int FLIGHTID_FIELD_NUMBER = 1;
  private volatile java.lang.Object flightID_;
  /**
   * <code>string FlightID = 1;</code>
   */
  public java.lang.String getFlightID() {
    java.lang.Object ref = flightID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      flightID_ = s;
      return s;
    }
  }
  /**
   * <code>string FlightID = 1;</code>
   */
  public com.google.protobuf.ByteString
      getFlightIDBytes() {
    java.lang.Object ref = flightID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      flightID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SEGMENTNO_FIELD_NUMBER = 2;
  private int segmentNo_;
  /**
   * <code>int32 SegmentNo = 2;</code>
   */
  public int getSegmentNo() {
    return segmentNo_;
  }

  public static final int SEQUENCENO_FIELD_NUMBER = 3;
  private int sequenceNo_;
  /**
   * <code>int32 SequenceNo = 3;</code>
   */
  public int getSequenceNo() {
    return sequenceNo_;
  }

  public static final int MARRYSEG_FIELD_NUMBER = 4;
  private volatile java.lang.Object marrySeg_;
  /**
   * <code>string MarrySeg = 4;</code>
   */
  public java.lang.String getMarrySeg() {
    java.lang.Object ref = marrySeg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      marrySeg_ = s;
      return s;
    }
  }
  /**
   * <code>string MarrySeg = 4;</code>
   */
  public com.google.protobuf.ByteString
      getMarrySegBytes() {
    java.lang.Object ref = marrySeg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      marrySeg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MAINSEGMENT_FIELD_NUMBER = 5;
  private boolean mainSegment_;
  /**
   * <pre>
   *变化 int改为bool
   * </pre>
   *
   * <code>bool mainSegment = 5;</code>
   */
  public boolean getMainSegment() {
    return mainSegment_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getFlightIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, flightID_);
    }
    if (segmentNo_ != 0) {
      output.writeInt32(2, segmentNo_);
    }
    if (sequenceNo_ != 0) {
      output.writeInt32(3, sequenceNo_);
    }
    if (!getMarrySegBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, marrySeg_);
    }
    if (mainSegment_ != false) {
      output.writeBool(5, mainSegment_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFlightIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, flightID_);
    }
    if (segmentNo_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, segmentNo_);
    }
    if (sequenceNo_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, sequenceNo_);
    }
    if (!getMarrySegBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, marrySeg_);
    }
    if (mainSegment_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, mainSegment_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType other = (com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType) obj;

    boolean result = true;
    result = result && getFlightID()
        .equals(other.getFlightID());
    result = result && (getSegmentNo()
        == other.getSegmentNo());
    result = result && (getSequenceNo()
        == other.getSequenceNo());
    result = result && getMarrySeg()
        .equals(other.getMarrySeg());
    result = result && (getMainSegment()
        == other.getMainSegment());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FLIGHTID_FIELD_NUMBER;
    hash = (53 * hash) + getFlightID().hashCode();
    hash = (37 * hash) + SEGMENTNO_FIELD_NUMBER;
    hash = (53 * hash) + getSegmentNo();
    hash = (37 * hash) + SEQUENCENO_FIELD_NUMBER;
    hash = (53 * hash) + getSequenceNo();
    hash = (37 * hash) + MARRYSEG_FIELD_NUMBER;
    hash = (53 * hash) + getMarrySeg().hashCode();
    hash = (37 * hash) + MAINSEGMENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMainSegment());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType)
      com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.intl.agg.types.searchresponsetype.v3.AggTypesSearchresponsetypeV3.internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_FlightRefType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.intl.agg.types.searchresponsetype.v3.AggTypesSearchresponsetypeV3.internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_FlightRefType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType.class, com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType.Builder.class);
    }

    // Construct using com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      flightID_ = "";

      segmentNo_ = 0;

      sequenceNo_ = 0;

      marrySeg_ = "";

      mainSegment_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.intl.agg.types.searchresponsetype.v3.AggTypesSearchresponsetypeV3.internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_FlightRefType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType getDefaultInstanceForType() {
      return com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType build() {
      com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType buildPartial() {
      com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType result = new com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType(this);
      result.flightID_ = flightID_;
      result.segmentNo_ = segmentNo_;
      result.sequenceNo_ = sequenceNo_;
      result.marrySeg_ = marrySeg_;
      result.mainSegment_ = mainSegment_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType) {
        return mergeFrom((com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType other) {
      if (other == com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType.getDefaultInstance()) return this;
      if (!other.getFlightID().isEmpty()) {
        flightID_ = other.flightID_;
        onChanged();
      }
      if (other.getSegmentNo() != 0) {
        setSegmentNo(other.getSegmentNo());
      }
      if (other.getSequenceNo() != 0) {
        setSequenceNo(other.getSequenceNo());
      }
      if (!other.getMarrySeg().isEmpty()) {
        marrySeg_ = other.marrySeg_;
        onChanged();
      }
      if (other.getMainSegment() != false) {
        setMainSegment(other.getMainSegment());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object flightID_ = "";
    /**
     * <code>string FlightID = 1;</code>
     */
    public java.lang.String getFlightID() {
      java.lang.Object ref = flightID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        flightID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string FlightID = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFlightIDBytes() {
      java.lang.Object ref = flightID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        flightID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string FlightID = 1;</code>
     */
    public Builder setFlightID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      flightID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string FlightID = 1;</code>
     */
    public Builder clearFlightID() {
      
      flightID_ = getDefaultInstance().getFlightID();
      onChanged();
      return this;
    }
    /**
     * <code>string FlightID = 1;</code>
     */
    public Builder setFlightIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      flightID_ = value;
      onChanged();
      return this;
    }

    private int segmentNo_ ;
    /**
     * <code>int32 SegmentNo = 2;</code>
     */
    public int getSegmentNo() {
      return segmentNo_;
    }
    /**
     * <code>int32 SegmentNo = 2;</code>
     */
    public Builder setSegmentNo(int value) {
      
      segmentNo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 SegmentNo = 2;</code>
     */
    public Builder clearSegmentNo() {
      
      segmentNo_ = 0;
      onChanged();
      return this;
    }

    private int sequenceNo_ ;
    /**
     * <code>int32 SequenceNo = 3;</code>
     */
    public int getSequenceNo() {
      return sequenceNo_;
    }
    /**
     * <code>int32 SequenceNo = 3;</code>
     */
    public Builder setSequenceNo(int value) {
      
      sequenceNo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 SequenceNo = 3;</code>
     */
    public Builder clearSequenceNo() {
      
      sequenceNo_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object marrySeg_ = "";
    /**
     * <code>string MarrySeg = 4;</code>
     */
    public java.lang.String getMarrySeg() {
      java.lang.Object ref = marrySeg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        marrySeg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string MarrySeg = 4;</code>
     */
    public com.google.protobuf.ByteString
        getMarrySegBytes() {
      java.lang.Object ref = marrySeg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        marrySeg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string MarrySeg = 4;</code>
     */
    public Builder setMarrySeg(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      marrySeg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string MarrySeg = 4;</code>
     */
    public Builder clearMarrySeg() {
      
      marrySeg_ = getDefaultInstance().getMarrySeg();
      onChanged();
      return this;
    }
    /**
     * <code>string MarrySeg = 4;</code>
     */
    public Builder setMarrySegBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      marrySeg_ = value;
      onChanged();
      return this;
    }

    private boolean mainSegment_ ;
    /**
     * <pre>
     *变化 int改为bool
     * </pre>
     *
     * <code>bool mainSegment = 5;</code>
     */
    public boolean getMainSegment() {
      return mainSegment_;
    }
    /**
     * <pre>
     *变化 int改为bool
     * </pre>
     *
     * <code>bool mainSegment = 5;</code>
     */
    public Builder setMainSegment(boolean value) {
      
      mainSegment_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *变化 int改为bool
     * </pre>
     *
     * <code>bool mainSegment = 5;</code>
     */
    public Builder clearMainSegment() {
      
      mainSegment_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType)
  private static final com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType();
  }

  public static com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FlightRefType>
      PARSER = new com.google.protobuf.AbstractParser<FlightRefType>() {
    @java.lang.Override
    public FlightRefType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FlightRefType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FlightRefType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FlightRefType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
