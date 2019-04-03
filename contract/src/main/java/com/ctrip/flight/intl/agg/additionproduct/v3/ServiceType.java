// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.additionproduct.v3.proto

package com.ctrip.flight.intl.agg.additionproduct.v3;

/**
 * <pre>
 * 权益详情
 * </pre>
 *
 * Protobuf type {@code com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType}
 */
public  final class ServiceType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType)
    ServiceTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ServiceType.newBuilder() to construct.
  private ServiceType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServiceType() {
    refNum_ = 0;
    brandName_ = "";
    brandTier_ = 0;
    serviceDetail_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ServiceType(
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
          case 8: {

            refNum_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            brandName_ = s;
            break;
          }
          case 24: {

            brandTier_ = input.readInt32();
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              serviceDetail_ = new java.util.ArrayList<com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType>();
              mutable_bitField0_ |= 0x00000008;
            }
            serviceDetail_.add(
                input.readMessage(com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        serviceDetail_ = java.util.Collections.unmodifiableList(serviceDetail_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ctrip.flight.intl.agg.additionproduct.v3.AggAdditionproductV3.internal_static_com_ctrip_flight_intl_agg_additionproduct_v3_ServiceType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.intl.agg.additionproduct.v3.AggAdditionproductV3.internal_static_com_ctrip_flight_intl_agg_additionproduct_v3_ServiceType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType.class, com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType.Builder.class);
  }

  private int bitField0_;
  public static final int REFNUM_FIELD_NUMBER = 1;
  private int refNum_;
  /**
   * <code>int32 RefNum = 1;</code>
   */
  public int getRefNum() {
    return refNum_;
  }

  public static final int BRANDNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object brandName_;
  /**
   * <pre>
   * 品牌名字	没有品牌运价传默认值
   * </pre>
   *
   * <code>string BrandName = 2;</code>
   */
  public java.lang.String getBrandName() {
    java.lang.Object ref = brandName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      brandName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 品牌名字	没有品牌运价传默认值
   * </pre>
   *
   * <code>string BrandName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getBrandNameBytes() {
    java.lang.Object ref = brandName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      brandName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BRANDTIER_FIELD_NUMBER = 3;
  private int brandTier_;
  /**
   * <pre>
   * 品牌等级	没有品牌运价传默认值
   * </pre>
   *
   * <code>int32 BrandTier = 3;</code>
   */
  public int getBrandTier() {
    return brandTier_;
  }

  public static final int SERVICEDETAIL_FIELD_NUMBER = 4;
  private java.util.List<com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType> serviceDetail_;
  /**
   * <pre>
   * 具体权益信息列表
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ServiceDetail = 4;</code>
   */
  public java.util.List<com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType> getServiceDetailList() {
    return serviceDetail_;
  }
  /**
   * <pre>
   * 具体权益信息列表
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ServiceDetail = 4;</code>
   */
  public java.util.List<? extends com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairTypeOrBuilder> 
      getServiceDetailOrBuilderList() {
    return serviceDetail_;
  }
  /**
   * <pre>
   * 具体权益信息列表
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ServiceDetail = 4;</code>
   */
  public int getServiceDetailCount() {
    return serviceDetail_.size();
  }
  /**
   * <pre>
   * 具体权益信息列表
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ServiceDetail = 4;</code>
   */
  public com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType getServiceDetail(int index) {
    return serviceDetail_.get(index);
  }
  /**
   * <pre>
   * 具体权益信息列表
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ServiceDetail = 4;</code>
   */
  public com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairTypeOrBuilder getServiceDetailOrBuilder(
      int index) {
    return serviceDetail_.get(index);
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
    if (refNum_ != 0) {
      output.writeInt32(1, refNum_);
    }
    if (!getBrandNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, brandName_);
    }
    if (brandTier_ != 0) {
      output.writeInt32(3, brandTier_);
    }
    for (int i = 0; i < serviceDetail_.size(); i++) {
      output.writeMessage(4, serviceDetail_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (refNum_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, refNum_);
    }
    if (!getBrandNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, brandName_);
    }
    if (brandTier_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, brandTier_);
    }
    for (int i = 0; i < serviceDetail_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, serviceDetail_.get(i));
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
    if (!(obj instanceof com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType other = (com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType) obj;

    boolean result = true;
    result = result && (getRefNum()
        == other.getRefNum());
    result = result && getBrandName()
        .equals(other.getBrandName());
    result = result && (getBrandTier()
        == other.getBrandTier());
    result = result && getServiceDetailList()
        .equals(other.getServiceDetailList());
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
    hash = (37 * hash) + REFNUM_FIELD_NUMBER;
    hash = (53 * hash) + getRefNum();
    hash = (37 * hash) + BRANDNAME_FIELD_NUMBER;
    hash = (53 * hash) + getBrandName().hashCode();
    hash = (37 * hash) + BRANDTIER_FIELD_NUMBER;
    hash = (53 * hash) + getBrandTier();
    if (getServiceDetailCount() > 0) {
      hash = (37 * hash) + SERVICEDETAIL_FIELD_NUMBER;
      hash = (53 * hash) + getServiceDetailList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType prototype) {
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
   * <pre>
   * 权益详情
   * </pre>
   *
   * Protobuf type {@code com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType)
      com.ctrip.flight.intl.agg.additionproduct.v3.ServiceTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.intl.agg.additionproduct.v3.AggAdditionproductV3.internal_static_com_ctrip_flight_intl_agg_additionproduct_v3_ServiceType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.intl.agg.additionproduct.v3.AggAdditionproductV3.internal_static_com_ctrip_flight_intl_agg_additionproduct_v3_ServiceType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType.class, com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType.Builder.class);
    }

    // Construct using com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType.newBuilder()
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
        getServiceDetailFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      refNum_ = 0;

      brandName_ = "";

      brandTier_ = 0;

      if (serviceDetailBuilder_ == null) {
        serviceDetail_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        serviceDetailBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.intl.agg.additionproduct.v3.AggAdditionproductV3.internal_static_com_ctrip_flight_intl_agg_additionproduct_v3_ServiceType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType getDefaultInstanceForType() {
      return com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType build() {
      com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType buildPartial() {
      com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType result = new com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.refNum_ = refNum_;
      result.brandName_ = brandName_;
      result.brandTier_ = brandTier_;
      if (serviceDetailBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          serviceDetail_ = java.util.Collections.unmodifiableList(serviceDetail_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.serviceDetail_ = serviceDetail_;
      } else {
        result.serviceDetail_ = serviceDetailBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType) {
        return mergeFrom((com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType other) {
      if (other == com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType.getDefaultInstance()) return this;
      if (other.getRefNum() != 0) {
        setRefNum(other.getRefNum());
      }
      if (!other.getBrandName().isEmpty()) {
        brandName_ = other.brandName_;
        onChanged();
      }
      if (other.getBrandTier() != 0) {
        setBrandTier(other.getBrandTier());
      }
      if (serviceDetailBuilder_ == null) {
        if (!other.serviceDetail_.isEmpty()) {
          if (serviceDetail_.isEmpty()) {
            serviceDetail_ = other.serviceDetail_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureServiceDetailIsMutable();
            serviceDetail_.addAll(other.serviceDetail_);
          }
          onChanged();
        }
      } else {
        if (!other.serviceDetail_.isEmpty()) {
          if (serviceDetailBuilder_.isEmpty()) {
            serviceDetailBuilder_.dispose();
            serviceDetailBuilder_ = null;
            serviceDetail_ = other.serviceDetail_;
            bitField0_ = (bitField0_ & ~0x00000008);
            serviceDetailBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getServiceDetailFieldBuilder() : null;
          } else {
            serviceDetailBuilder_.addAllMessages(other.serviceDetail_);
          }
        }
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
      com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int refNum_ ;
    /**
     * <code>int32 RefNum = 1;</code>
     */
    public int getRefNum() {
      return refNum_;
    }
    /**
     * <code>int32 RefNum = 1;</code>
     */
    public Builder setRefNum(int value) {
      
      refNum_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 RefNum = 1;</code>
     */
    public Builder clearRefNum() {
      
      refNum_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object brandName_ = "";
    /**
     * <pre>
     * 品牌名字	没有品牌运价传默认值
     * </pre>
     *
     * <code>string BrandName = 2;</code>
     */
    public java.lang.String getBrandName() {
      java.lang.Object ref = brandName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        brandName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 品牌名字	没有品牌运价传默认值
     * </pre>
     *
     * <code>string BrandName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getBrandNameBytes() {
      java.lang.Object ref = brandName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        brandName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 品牌名字	没有品牌运价传默认值
     * </pre>
     *
     * <code>string BrandName = 2;</code>
     */
    public Builder setBrandName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      brandName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 品牌名字	没有品牌运价传默认值
     * </pre>
     *
     * <code>string BrandName = 2;</code>
     */
    public Builder clearBrandName() {
      
      brandName_ = getDefaultInstance().getBrandName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 品牌名字	没有品牌运价传默认值
     * </pre>
     *
     * <code>string BrandName = 2;</code>
     */
    public Builder setBrandNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      brandName_ = value;
      onChanged();
      return this;
    }

    private int brandTier_ ;
    /**
     * <pre>
     * 品牌等级	没有品牌运价传默认值
     * </pre>
     *
     * <code>int32 BrandTier = 3;</code>
     */
    public int getBrandTier() {
      return brandTier_;
    }
    /**
     * <pre>
     * 品牌等级	没有品牌运价传默认值
     * </pre>
     *
     * <code>int32 BrandTier = 3;</code>
     */
    public Builder setBrandTier(int value) {
      
      brandTier_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 品牌等级	没有品牌运价传默认值
     * </pre>
     *
     * <code>int32 BrandTier = 3;</code>
     */
    public Builder clearBrandTier() {
      
      brandTier_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType> serviceDetail_ =
      java.util.Collections.emptyList();
    private void ensureServiceDetailIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        serviceDetail_ = new java.util.ArrayList<com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType>(serviceDetail_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType, com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType.Builder, com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairTypeOrBuilder> serviceDetailBuilder_;

    /**
     * <pre>
     * 具体权益信息列表
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ServiceDetail = 4;</code>
     */
    public java.util.List<com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType> getServiceDetailList() {
      if (serviceDetailBuilder_ == null) {
        return java.util.Collections.unmodifiableList(serviceDetail_);
      } else {
        return serviceDetailBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 具体权益信息列表
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ServiceDetail = 4;</code>
     */
    public int getServiceDetailCount() {
      if (serviceDetailBuilder_ == null) {
        return serviceDetail_.size();
      } else {
        return serviceDetailBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 具体权益信息列表
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ServiceDetail = 4;</code>
     */
    public com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType getServiceDetail(int index) {
      if (serviceDetailBuilder_ == null) {
        return serviceDetail_.get(index);
      } else {
        return serviceDetailBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 具体权益信息列表
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ServiceDetail = 4;</code>
     */
    public Builder setServiceDetail(
        int index, com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType value) {
      if (serviceDetailBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServiceDetailIsMutable();
        serviceDetail_.set(index, value);
        onChanged();
      } else {
        serviceDetailBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 具体权益信息列表
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ServiceDetail = 4;</code>
     */
    public Builder setServiceDetail(
        int index, com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType.Builder builderForValue) {
      if (serviceDetailBuilder_ == null) {
        ensureServiceDetailIsMutable();
        serviceDetail_.set(index, builderForValue.build());
        onChanged();
      } else {
        serviceDetailBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 具体权益信息列表
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ServiceDetail = 4;</code>
     */
    public Builder addServiceDetail(com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType value) {
      if (serviceDetailBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServiceDetailIsMutable();
        serviceDetail_.add(value);
        onChanged();
      } else {
        serviceDetailBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 具体权益信息列表
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ServiceDetail = 4;</code>
     */
    public Builder addServiceDetail(
        int index, com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType value) {
      if (serviceDetailBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServiceDetailIsMutable();
        serviceDetail_.add(index, value);
        onChanged();
      } else {
        serviceDetailBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 具体权益信息列表
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ServiceDetail = 4;</code>
     */
    public Builder addServiceDetail(
        com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType.Builder builderForValue) {
      if (serviceDetailBuilder_ == null) {
        ensureServiceDetailIsMutable();
        serviceDetail_.add(builderForValue.build());
        onChanged();
      } else {
        serviceDetailBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 具体权益信息列表
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ServiceDetail = 4;</code>
     */
    public Builder addServiceDetail(
        int index, com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType.Builder builderForValue) {
      if (serviceDetailBuilder_ == null) {
        ensureServiceDetailIsMutable();
        serviceDetail_.add(index, builderForValue.build());
        onChanged();
      } else {
        serviceDetailBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 具体权益信息列表
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ServiceDetail = 4;</code>
     */
    public Builder addAllServiceDetail(
        java.lang.Iterable<? extends com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType> values) {
      if (serviceDetailBuilder_ == null) {
        ensureServiceDetailIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, serviceDetail_);
        onChanged();
      } else {
        serviceDetailBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 具体权益信息列表
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ServiceDetail = 4;</code>
     */
    public Builder clearServiceDetail() {
      if (serviceDetailBuilder_ == null) {
        serviceDetail_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        serviceDetailBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 具体权益信息列表
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ServiceDetail = 4;</code>
     */
    public Builder removeServiceDetail(int index) {
      if (serviceDetailBuilder_ == null) {
        ensureServiceDetailIsMutable();
        serviceDetail_.remove(index);
        onChanged();
      } else {
        serviceDetailBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 具体权益信息列表
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ServiceDetail = 4;</code>
     */
    public com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType.Builder getServiceDetailBuilder(
        int index) {
      return getServiceDetailFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 具体权益信息列表
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ServiceDetail = 4;</code>
     */
    public com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairTypeOrBuilder getServiceDetailOrBuilder(
        int index) {
      if (serviceDetailBuilder_ == null) {
        return serviceDetail_.get(index);  } else {
        return serviceDetailBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 具体权益信息列表
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ServiceDetail = 4;</code>
     */
    public java.util.List<? extends com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairTypeOrBuilder> 
         getServiceDetailOrBuilderList() {
      if (serviceDetailBuilder_ != null) {
        return serviceDetailBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(serviceDetail_);
      }
    }
    /**
     * <pre>
     * 具体权益信息列表
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ServiceDetail = 4;</code>
     */
    public com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType.Builder addServiceDetailBuilder() {
      return getServiceDetailFieldBuilder().addBuilder(
          com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType.getDefaultInstance());
    }
    /**
     * <pre>
     * 具体权益信息列表
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ServiceDetail = 4;</code>
     */
    public com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType.Builder addServiceDetailBuilder(
        int index) {
      return getServiceDetailFieldBuilder().addBuilder(
          index, com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType.getDefaultInstance());
    }
    /**
     * <pre>
     * 具体权益信息列表
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ServiceDetail = 4;</code>
     */
    public java.util.List<com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType.Builder> 
         getServiceDetailBuilderList() {
      return getServiceDetailFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType, com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType.Builder, com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairTypeOrBuilder> 
        getServiceDetailFieldBuilder() {
      if (serviceDetailBuilder_ == null) {
        serviceDetailBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType, com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType.Builder, com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairTypeOrBuilder>(
                serviceDetail_,
                ((bitField0_ & 0x00000008) == 0x00000008),
                getParentForChildren(),
                isClean());
        serviceDetail_ = null;
      }
      return serviceDetailBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType)
  private static final com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType();
  }

  public static com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServiceType>
      PARSER = new com.google.protobuf.AbstractParser<ServiceType>() {
    @java.lang.Override
    public ServiceType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ServiceType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ServiceType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServiceType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.intl.agg.additionproduct.v3.ServiceType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

