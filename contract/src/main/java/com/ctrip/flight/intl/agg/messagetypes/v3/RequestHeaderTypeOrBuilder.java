// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.messagetypes.v3.proto

package com.ctrip.flight.intl.agg.messagetypes.v3;

public interface RequestHeaderTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.intl.agg.messagetypes.v3.RequestHeaderType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.ctrip.flight.intl.agg.messagetypes.v3.MessageHeaderType MessageHeader = 1;</code>
   */
  boolean hasMessageHeader();
  /**
   * <code>.com.ctrip.flight.intl.agg.messagetypes.v3.MessageHeaderType MessageHeader = 1;</code>
   */
  com.ctrip.flight.intl.agg.messagetypes.v3.MessageHeaderType getMessageHeader();
  /**
   * <code>.com.ctrip.flight.intl.agg.messagetypes.v3.MessageHeaderType MessageHeader = 1;</code>
   */
  com.ctrip.flight.intl.agg.messagetypes.v3.MessageHeaderTypeOrBuilder getMessageHeaderOrBuilder();

  /**
   * <code>int32 LoggingLevel = 2;</code>
   */
  int getLoggingLevel();

  /**
   * <code>string DiagInput = 3;</code>
   */
  java.lang.String getDiagInput();
  /**
   * <code>string DiagInput = 3;</code>
   */
  com.google.protobuf.ByteString
      getDiagInputBytes();
}