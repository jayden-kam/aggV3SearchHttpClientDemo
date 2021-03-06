// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.flighttypes.v3.proto

package com.ctrip.flight.intl.agg.flighttypes.v3;

/**
 * Protobuf type {@code com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType}
 */
public  final class PenaltyRulesType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType)
    PenaltyRulesTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PenaltyRulesType.newBuilder() to construct.
  private PenaltyRulesType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PenaltyRulesType() {
    isReplaceCtripRule_ = false;
    penaltyRemark_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PenaltyRulesType(
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

            isReplaceCtripRule_ = input.readBool();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              penaltyRemark_ = new java.util.ArrayList<com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType>();
              mutable_bitField0_ |= 0x00000002;
            }
            penaltyRemark_.add(
                input.readMessage(com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        penaltyRemark_ = java.util.Collections.unmodifiableList(penaltyRemark_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.internal_static_com_ctrip_flight_intl_agg_flighttypes_v3_PenaltyRulesType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.internal_static_com_ctrip_flight_intl_agg_flighttypes_v3_PenaltyRulesType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType.class, com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType.Builder.class);
  }

  private int bitField0_;
  public static final int ISREPLACECTRIPRULE_FIELD_NUMBER = 1;
  private boolean isReplaceCtripRule_;
  /**
   * <code>bool IsReplaceCtripRule = 1;</code>
   */
  public boolean getIsReplaceCtripRule() {
    return isReplaceCtripRule_;
  }

  public static final int PENALTYREMARK_FIELD_NUMBER = 2;
  private java.util.List<com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType> penaltyRemark_;
  /**
   * <pre>
   * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
   */
  public java.util.List<com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType> getPenaltyRemarkList() {
    return penaltyRemark_;
  }
  /**
   * <pre>
   * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
   */
  public java.util.List<? extends com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkTypeOrBuilder> 
      getPenaltyRemarkOrBuilderList() {
    return penaltyRemark_;
  }
  /**
   * <pre>
   * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
   */
  public int getPenaltyRemarkCount() {
    return penaltyRemark_.size();
  }
  /**
   * <pre>
   * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
   */
  public com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType getPenaltyRemark(int index) {
    return penaltyRemark_.get(index);
  }
  /**
   * <pre>
   * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
   */
  public com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkTypeOrBuilder getPenaltyRemarkOrBuilder(
      int index) {
    return penaltyRemark_.get(index);
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
    if (isReplaceCtripRule_ != false) {
      output.writeBool(1, isReplaceCtripRule_);
    }
    for (int i = 0; i < penaltyRemark_.size(); i++) {
      output.writeMessage(2, penaltyRemark_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isReplaceCtripRule_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, isReplaceCtripRule_);
    }
    for (int i = 0; i < penaltyRemark_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, penaltyRemark_.get(i));
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
    if (!(obj instanceof com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType other = (com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType) obj;

    boolean result = true;
    result = result && (getIsReplaceCtripRule()
        == other.getIsReplaceCtripRule());
    result = result && getPenaltyRemarkList()
        .equals(other.getPenaltyRemarkList());
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
    hash = (37 * hash) + ISREPLACECTRIPRULE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsReplaceCtripRule());
    if (getPenaltyRemarkCount() > 0) {
      hash = (37 * hash) + PENALTYREMARK_FIELD_NUMBER;
      hash = (53 * hash) + getPenaltyRemarkList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType prototype) {
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
   * Protobuf type {@code com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType)
      com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.internal_static_com_ctrip_flight_intl_agg_flighttypes_v3_PenaltyRulesType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.internal_static_com_ctrip_flight_intl_agg_flighttypes_v3_PenaltyRulesType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType.class, com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType.Builder.class);
    }

    // Construct using com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType.newBuilder()
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
        getPenaltyRemarkFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      isReplaceCtripRule_ = false;

      if (penaltyRemarkBuilder_ == null) {
        penaltyRemark_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        penaltyRemarkBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.internal_static_com_ctrip_flight_intl_agg_flighttypes_v3_PenaltyRulesType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType getDefaultInstanceForType() {
      return com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType build() {
      com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType buildPartial() {
      com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType result = new com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.isReplaceCtripRule_ = isReplaceCtripRule_;
      if (penaltyRemarkBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          penaltyRemark_ = java.util.Collections.unmodifiableList(penaltyRemark_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.penaltyRemark_ = penaltyRemark_;
      } else {
        result.penaltyRemark_ = penaltyRemarkBuilder_.build();
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
      if (other instanceof com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType) {
        return mergeFrom((com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType other) {
      if (other == com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType.getDefaultInstance()) return this;
      if (other.getIsReplaceCtripRule() != false) {
        setIsReplaceCtripRule(other.getIsReplaceCtripRule());
      }
      if (penaltyRemarkBuilder_ == null) {
        if (!other.penaltyRemark_.isEmpty()) {
          if (penaltyRemark_.isEmpty()) {
            penaltyRemark_ = other.penaltyRemark_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensurePenaltyRemarkIsMutable();
            penaltyRemark_.addAll(other.penaltyRemark_);
          }
          onChanged();
        }
      } else {
        if (!other.penaltyRemark_.isEmpty()) {
          if (penaltyRemarkBuilder_.isEmpty()) {
            penaltyRemarkBuilder_.dispose();
            penaltyRemarkBuilder_ = null;
            penaltyRemark_ = other.penaltyRemark_;
            bitField0_ = (bitField0_ & ~0x00000002);
            penaltyRemarkBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPenaltyRemarkFieldBuilder() : null;
          } else {
            penaltyRemarkBuilder_.addAllMessages(other.penaltyRemark_);
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
      com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean isReplaceCtripRule_ ;
    /**
     * <code>bool IsReplaceCtripRule = 1;</code>
     */
    public boolean getIsReplaceCtripRule() {
      return isReplaceCtripRule_;
    }
    /**
     * <code>bool IsReplaceCtripRule = 1;</code>
     */
    public Builder setIsReplaceCtripRule(boolean value) {
      
      isReplaceCtripRule_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool IsReplaceCtripRule = 1;</code>
     */
    public Builder clearIsReplaceCtripRule() {
      
      isReplaceCtripRule_ = false;
      onChanged();
      return this;
    }

    private java.util.List<com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType> penaltyRemark_ =
      java.util.Collections.emptyList();
    private void ensurePenaltyRemarkIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        penaltyRemark_ = new java.util.ArrayList<com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType>(penaltyRemark_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType, com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType.Builder, com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkTypeOrBuilder> penaltyRemarkBuilder_;

    /**
     * <pre>
     * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
     */
    public java.util.List<com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType> getPenaltyRemarkList() {
      if (penaltyRemarkBuilder_ == null) {
        return java.util.Collections.unmodifiableList(penaltyRemark_);
      } else {
        return penaltyRemarkBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
     */
    public int getPenaltyRemarkCount() {
      if (penaltyRemarkBuilder_ == null) {
        return penaltyRemark_.size();
      } else {
        return penaltyRemarkBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
     */
    public com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType getPenaltyRemark(int index) {
      if (penaltyRemarkBuilder_ == null) {
        return penaltyRemark_.get(index);
      } else {
        return penaltyRemarkBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
     */
    public Builder setPenaltyRemark(
        int index, com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType value) {
      if (penaltyRemarkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePenaltyRemarkIsMutable();
        penaltyRemark_.set(index, value);
        onChanged();
      } else {
        penaltyRemarkBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
     */
    public Builder setPenaltyRemark(
        int index, com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType.Builder builderForValue) {
      if (penaltyRemarkBuilder_ == null) {
        ensurePenaltyRemarkIsMutable();
        penaltyRemark_.set(index, builderForValue.build());
        onChanged();
      } else {
        penaltyRemarkBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
     */
    public Builder addPenaltyRemark(com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType value) {
      if (penaltyRemarkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePenaltyRemarkIsMutable();
        penaltyRemark_.add(value);
        onChanged();
      } else {
        penaltyRemarkBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
     */
    public Builder addPenaltyRemark(
        int index, com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType value) {
      if (penaltyRemarkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePenaltyRemarkIsMutable();
        penaltyRemark_.add(index, value);
        onChanged();
      } else {
        penaltyRemarkBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
     */
    public Builder addPenaltyRemark(
        com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType.Builder builderForValue) {
      if (penaltyRemarkBuilder_ == null) {
        ensurePenaltyRemarkIsMutable();
        penaltyRemark_.add(builderForValue.build());
        onChanged();
      } else {
        penaltyRemarkBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
     */
    public Builder addPenaltyRemark(
        int index, com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType.Builder builderForValue) {
      if (penaltyRemarkBuilder_ == null) {
        ensurePenaltyRemarkIsMutable();
        penaltyRemark_.add(index, builderForValue.build());
        onChanged();
      } else {
        penaltyRemarkBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
     */
    public Builder addAllPenaltyRemark(
        java.lang.Iterable<? extends com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType> values) {
      if (penaltyRemarkBuilder_ == null) {
        ensurePenaltyRemarkIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, penaltyRemark_);
        onChanged();
      } else {
        penaltyRemarkBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
     */
    public Builder clearPenaltyRemark() {
      if (penaltyRemarkBuilder_ == null) {
        penaltyRemark_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        penaltyRemarkBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
     */
    public Builder removePenaltyRemark(int index) {
      if (penaltyRemarkBuilder_ == null) {
        ensurePenaltyRemarkIsMutable();
        penaltyRemark_.remove(index);
        onChanged();
      } else {
        penaltyRemarkBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
     */
    public com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType.Builder getPenaltyRemarkBuilder(
        int index) {
      return getPenaltyRemarkFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
     */
    public com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkTypeOrBuilder getPenaltyRemarkOrBuilder(
        int index) {
      if (penaltyRemarkBuilder_ == null) {
        return penaltyRemark_.get(index);  } else {
        return penaltyRemarkBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
     */
    public java.util.List<? extends com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkTypeOrBuilder> 
         getPenaltyRemarkOrBuilderList() {
      if (penaltyRemarkBuilder_ != null) {
        return penaltyRemarkBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(penaltyRemark_);
      }
    }
    /**
     * <pre>
     * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
     */
    public com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType.Builder addPenaltyRemarkBuilder() {
      return getPenaltyRemarkFieldBuilder().addBuilder(
          com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType.getDefaultInstance());
    }
    /**
     * <pre>
     * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
     */
    public com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType.Builder addPenaltyRemarkBuilder(
        int index) {
      return getPenaltyRemarkFieldBuilder().addBuilder(
          index, com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType.getDefaultInstance());
    }
    /**
     * <pre>
     * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
     */
    public java.util.List<com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType.Builder> 
         getPenaltyRemarkBuilderList() {
      return getPenaltyRemarkFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType, com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType.Builder, com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkTypeOrBuilder> 
        getPenaltyRemarkFieldBuilder() {
      if (penaltyRemarkBuilder_ == null) {
        penaltyRemarkBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType, com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType.Builder, com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkTypeOrBuilder>(
                penaltyRemark_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        penaltyRemark_ = null;
      }
      return penaltyRemarkBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType)
  private static final com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType();
  }

  public static com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PenaltyRulesType>
      PARSER = new com.google.protobuf.AbstractParser<PenaltyRulesType>() {
    @java.lang.Override
    public PenaltyRulesType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PenaltyRulesType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PenaltyRulesType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PenaltyRulesType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

