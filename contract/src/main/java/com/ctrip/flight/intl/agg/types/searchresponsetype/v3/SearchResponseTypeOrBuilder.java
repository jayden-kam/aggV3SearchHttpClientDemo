// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.types.searchresponsetype.v3.proto

package com.ctrip.flight.intl.agg.types.searchresponsetype.v3;

public interface SearchResponseTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.intl.agg.types.searchresponsetype.v3.SearchResponseType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.ctrip.soa.ResponseStatusType ResponseStatus = 1;</code>
   */
  boolean hasResponseStatus();
  /**
   * <code>.com.ctrip.soa.ResponseStatusType ResponseStatus = 1;</code>
   */
  com.ctrip.soa.ResponseStatusType getResponseStatus();
  /**
   * <code>.com.ctrip.soa.ResponseStatusType ResponseStatus = 1;</code>
   */
  com.ctrip.soa.ResponseStatusTypeOrBuilder getResponseStatusOrBuilder();

  /**
   * <code>.com.ctrip.flight.intl.agg.messagetypes.v3.ResponseHeaderType ResponseHeader = 2;</code>
   */
  boolean hasResponseHeader();
  /**
   * <code>.com.ctrip.flight.intl.agg.messagetypes.v3.ResponseHeaderType ResponseHeader = 2;</code>
   */
  com.ctrip.flight.intl.agg.messagetypes.v3.ResponseHeaderType getResponseHeader();
  /**
   * <code>.com.ctrip.flight.intl.agg.messagetypes.v3.ResponseHeaderType ResponseHeader = 2;</code>
   */
  com.ctrip.flight.intl.agg.messagetypes.v3.ResponseHeaderTypeOrBuilder getResponseHeaderOrBuilder();

  /**
   * <code>.com.ctrip.flight.intl.agg.types.searchresponsetype.v3.SearchResultType SearchResult = 3;</code>
   */
  boolean hasSearchResult();
  /**
   * <code>.com.ctrip.flight.intl.agg.types.searchresponsetype.v3.SearchResultType SearchResult = 3;</code>
   */
  com.ctrip.flight.intl.agg.types.searchresponsetype.v3.SearchResultType getSearchResult();
  /**
   * <code>.com.ctrip.flight.intl.agg.types.searchresponsetype.v3.SearchResultType SearchResult = 3;</code>
   */
  com.ctrip.flight.intl.agg.types.searchresponsetype.v3.SearchResultTypeOrBuilder getSearchResultOrBuilder();

  /**
   * <pre>
   *变化 删除responseID
   * </pre>
   *
   * <code>.com.ctrip.flight.intl.agg.messagetypes.v3.ErrorResultType ErrorResult = 4;</code>
   */
  boolean hasErrorResult();
  /**
   * <pre>
   *变化 删除responseID
   * </pre>
   *
   * <code>.com.ctrip.flight.intl.agg.messagetypes.v3.ErrorResultType ErrorResult = 4;</code>
   */
  com.ctrip.flight.intl.agg.messagetypes.v3.ErrorResultType getErrorResult();
  /**
   * <pre>
   *变化 删除responseID
   * </pre>
   *
   * <code>.com.ctrip.flight.intl.agg.messagetypes.v3.ErrorResultType ErrorResult = 4;</code>
   */
  com.ctrip.flight.intl.agg.messagetypes.v3.ErrorResultTypeOrBuilder getErrorResultOrBuilder();
}