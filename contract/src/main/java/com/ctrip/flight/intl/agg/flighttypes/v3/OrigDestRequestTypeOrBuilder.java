// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.flighttypes.v3.proto

package com.ctrip.flight.intl.agg.flighttypes.v3;

public interface OrigDestRequestTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.intl.agg.flighttypes.v3.OrigDestRequestType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 客户端需要指定日期格式
   * </pre>
   *
   * <code>string Date = 1;</code>
   */
  java.lang.String getDate();
  /**
   * <pre>
   * 客户端需要指定日期格式
   * </pre>
   *
   * <code>string Date = 1;</code>
   */
  com.google.protobuf.ByteString
      getDateBytes();

  /**
   * <code>string ORIG = 2;</code>
   */
  java.lang.String getORIG();
  /**
   * <code>string ORIG = 2;</code>
   */
  com.google.protobuf.ByteString
      getORIGBytes();

  /**
   * <code>string DEST = 3;</code>
   */
  java.lang.String getDEST();
  /**
   * <code>string DEST = 3;</code>
   */
  com.google.protobuf.ByteString
      getDESTBytes();
}