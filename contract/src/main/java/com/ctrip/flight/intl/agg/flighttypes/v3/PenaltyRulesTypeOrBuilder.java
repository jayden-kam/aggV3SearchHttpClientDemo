// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.flighttypes.v3.proto

package com.ctrip.flight.intl.agg.flighttypes.v3;

public interface PenaltyRulesTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool IsReplaceCtripRule = 1;</code>
   */
  boolean getIsReplaceCtripRule();

  /**
   * <pre>
   * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
   */
  java.util.List<com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType> 
      getPenaltyRemarkList();
  /**
   * <pre>
   * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType getPenaltyRemark(int index);
  /**
   * <pre>
   * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
   */
  int getPenaltyRemarkCount();
  /**
   * <pre>
   * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
   */
  java.util.List<? extends com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkTypeOrBuilder> 
      getPenaltyRemarkOrBuilderList();
  /**
   * <pre>
   * 五个直连引擎还吐出PenaltyRules：CS-WS/JS-WS/IJ-WS/GSD-WS/G5D-WS
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkType PenaltyRemark = 2;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRemarkTypeOrBuilder getPenaltyRemarkOrBuilder(
      int index);
}