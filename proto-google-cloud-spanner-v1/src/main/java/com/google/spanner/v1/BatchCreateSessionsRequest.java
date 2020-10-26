/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/spanner.proto

package com.google.spanner.v1;

/**
 *
 *
 * <pre>
 * The request for [BatchCreateSessions][google.spanner.v1.Spanner.BatchCreateSessions].
 * </pre>
 *
 * Protobuf type {@code google.spanner.v1.BatchCreateSessionsRequest}
 */
public final class BatchCreateSessionsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.spanner.v1.BatchCreateSessionsRequest)
    BatchCreateSessionsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchCreateSessionsRequest.newBuilder() to construct.
  private BatchCreateSessionsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchCreateSessionsRequest() {
    database_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(UnusedPrivateParameter unused) {
    return new BatchCreateSessionsRequest();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BatchCreateSessionsRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
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
          case 10:
            {
              String s = input.readStringRequireUtf8();

              database_ = s;
              break;
            }
          case 18:
            {
              Session.Builder subBuilder = null;
              if (sessionTemplate_ != null) {
                subBuilder = sessionTemplate_.toBuilder();
              }
              sessionTemplate_ = input.readMessage(Session.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(sessionTemplate_);
                sessionTemplate_ = subBuilder.buildPartial();
              }

              break;
            }
          case 24:
            {
              sessionCount_ = input.readInt32();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return SpannerProto.internal_static_google_spanner_v1_BatchCreateSessionsRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable internalGetFieldAccessorTable() {
    return SpannerProto
        .internal_static_google_spanner_v1_BatchCreateSessionsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(BatchCreateSessionsRequest.class, Builder.class);
  }

  public static final int DATABASE_FIELD_NUMBER = 1;
  private volatile Object database_;
  /**
   *
   *
   * <pre>
   * Required. The database in which the new sessions are created.
   * </pre>
   *
   * <code>
   * string database = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The database.
   */
  @Override
  public String getDatabase() {
    Object ref = database_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      database_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The database in which the new sessions are created.
   * </pre>
   *
   * <code>
   * string database = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for database.
   */
  @Override
  public com.google.protobuf.ByteString getDatabaseBytes() {
    Object ref = database_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((String) ref);
      database_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SESSION_TEMPLATE_FIELD_NUMBER = 2;
  private Session sessionTemplate_;
  /**
   *
   *
   * <pre>
   * Parameters to be applied to each created session.
   * </pre>
   *
   * <code>.google.spanner.v1.Session session_template = 2;</code>
   *
   * @return Whether the sessionTemplate field is set.
   */
  @Override
  public boolean hasSessionTemplate() {
    return sessionTemplate_ != null;
  }
  /**
   *
   *
   * <pre>
   * Parameters to be applied to each created session.
   * </pre>
   *
   * <code>.google.spanner.v1.Session session_template = 2;</code>
   *
   * @return The sessionTemplate.
   */
  @Override
  public Session getSessionTemplate() {
    return sessionTemplate_ == null ? Session.getDefaultInstance() : sessionTemplate_;
  }
  /**
   *
   *
   * <pre>
   * Parameters to be applied to each created session.
   * </pre>
   *
   * <code>.google.spanner.v1.Session session_template = 2;</code>
   */
  @Override
  public SessionOrBuilder getSessionTemplateOrBuilder() {
    return getSessionTemplate();
  }

  public static final int SESSION_COUNT_FIELD_NUMBER = 3;
  private int sessionCount_;
  /**
   *
   *
   * <pre>
   * Required. The number of sessions to be created in this batch call.
   * The API may return fewer than the requested number of sessions. If a
   * specific number of sessions are desired, the client can make additional
   * calls to BatchCreateSessions (adjusting
   * [session_count][google.spanner.v1.BatchCreateSessionsRequest.session_count] as necessary).
   * </pre>
   *
   * <code>int32 session_count = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The sessionCount.
   */
  @Override
  public int getSessionCount() {
    return sessionCount_;
  }

  private byte memoizedIsInitialized = -1;

  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getDatabaseBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, database_);
    }
    if (sessionTemplate_ != null) {
      output.writeMessage(2, getSessionTemplate());
    }
    if (sessionCount_ != 0) {
      output.writeInt32(3, sessionCount_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDatabaseBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, database_);
    }
    if (sessionTemplate_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSessionTemplate());
    }
    if (sessionCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, sessionCount_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof BatchCreateSessionsRequest)) {
      return super.equals(obj);
    }
    BatchCreateSessionsRequest other = (BatchCreateSessionsRequest) obj;

    if (!getDatabase().equals(other.getDatabase())) return false;
    if (hasSessionTemplate() != other.hasSessionTemplate()) return false;
    if (hasSessionTemplate()) {
      if (!getSessionTemplate().equals(other.getSessionTemplate())) return false;
    }
    if (getSessionCount() != other.getSessionCount()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DATABASE_FIELD_NUMBER;
    hash = (53 * hash) + getDatabase().hashCode();
    if (hasSessionTemplate()) {
      hash = (37 * hash) + SESSION_TEMPLATE_FIELD_NUMBER;
      hash = (53 * hash) + getSessionTemplate().hashCode();
    }
    hash = (37 * hash) + SESSION_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getSessionCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static BatchCreateSessionsRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static BatchCreateSessionsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static BatchCreateSessionsRequest parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static BatchCreateSessionsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static BatchCreateSessionsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static BatchCreateSessionsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static BatchCreateSessionsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static BatchCreateSessionsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static BatchCreateSessionsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static BatchCreateSessionsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static BatchCreateSessionsRequest parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static BatchCreateSessionsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(BatchCreateSessionsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The request for [BatchCreateSessions][google.spanner.v1.Spanner.BatchCreateSessions].
   * </pre>
   *
   * Protobuf type {@code google.spanner.v1.BatchCreateSessionsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.spanner.v1.BatchCreateSessionsRequest)
      BatchCreateSessionsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return SpannerProto.internal_static_google_spanner_v1_BatchCreateSessionsRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SpannerProto
          .internal_static_google_spanner_v1_BatchCreateSessionsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(BatchCreateSessionsRequest.class, Builder.class);
    }

    // Construct using com.google.spanner.v1.BatchCreateSessionsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @Override
    public Builder clear() {
      super.clear();
      database_ = "";

      if (sessionTemplateBuilder_ == null) {
        sessionTemplate_ = null;
      } else {
        sessionTemplate_ = null;
        sessionTemplateBuilder_ = null;
      }
      sessionCount_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return SpannerProto.internal_static_google_spanner_v1_BatchCreateSessionsRequest_descriptor;
    }

    @Override
    public BatchCreateSessionsRequest getDefaultInstanceForType() {
      return BatchCreateSessionsRequest.getDefaultInstance();
    }

    @Override
    public BatchCreateSessionsRequest build() {
      BatchCreateSessionsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public BatchCreateSessionsRequest buildPartial() {
      BatchCreateSessionsRequest result = new BatchCreateSessionsRequest(this);
      result.database_ = database_;
      if (sessionTemplateBuilder_ == null) {
        result.sessionTemplate_ = sessionTemplate_;
      } else {
        result.sessionTemplate_ = sessionTemplateBuilder_.build();
      }
      result.sessionCount_ = sessionCount_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }

    @Override
    public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
      return super.setField(field, value);
    }

    @Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
      return super.addRepeatedField(field, value);
    }

    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof BatchCreateSessionsRequest) {
        return mergeFrom((BatchCreateSessionsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(BatchCreateSessionsRequest other) {
      if (other == BatchCreateSessionsRequest.getDefaultInstance()) return this;
      if (!other.getDatabase().isEmpty()) {
        database_ = other.database_;
        onChanged();
      }
      if (other.hasSessionTemplate()) {
        mergeSessionTemplate(other.getSessionTemplate());
      }
      if (other.getSessionCount() != 0) {
        setSessionCount(other.getSessionCount());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      BatchCreateSessionsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (BatchCreateSessionsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object database_ = "";
    /**
     *
     *
     * <pre>
     * Required. The database in which the new sessions are created.
     * </pre>
     *
     * <code>
     * string database = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The database.
     */
    public String getDatabase() {
      Object ref = database_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        database_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The database in which the new sessions are created.
     * </pre>
     *
     * <code>
     * string database = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for database.
     */
    public com.google.protobuf.ByteString getDatabaseBytes() {
      Object ref = database_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        database_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The database in which the new sessions are created.
     * </pre>
     *
     * <code>
     * string database = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The database to set.
     * @return This builder for chaining.
     */
    public Builder setDatabase(String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      database_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The database in which the new sessions are created.
     * </pre>
     *
     * <code>
     * string database = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDatabase() {

      database_ = getDefaultInstance().getDatabase();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The database in which the new sessions are created.
     * </pre>
     *
     * <code>
     * string database = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for database to set.
     * @return This builder for chaining.
     */
    public Builder setDatabaseBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      database_ = value;
      onChanged();
      return this;
    }

    private Session sessionTemplate_;
    private com.google.protobuf.SingleFieldBuilderV3<Session, Session.Builder, SessionOrBuilder>
        sessionTemplateBuilder_;
    /**
     *
     *
     * <pre>
     * Parameters to be applied to each created session.
     * </pre>
     *
     * <code>.google.spanner.v1.Session session_template = 2;</code>
     *
     * @return Whether the sessionTemplate field is set.
     */
    public boolean hasSessionTemplate() {
      return sessionTemplateBuilder_ != null || sessionTemplate_ != null;
    }
    /**
     *
     *
     * <pre>
     * Parameters to be applied to each created session.
     * </pre>
     *
     * <code>.google.spanner.v1.Session session_template = 2;</code>
     *
     * @return The sessionTemplate.
     */
    public Session getSessionTemplate() {
      if (sessionTemplateBuilder_ == null) {
        return sessionTemplate_ == null ? Session.getDefaultInstance() : sessionTemplate_;
      } else {
        return sessionTemplateBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Parameters to be applied to each created session.
     * </pre>
     *
     * <code>.google.spanner.v1.Session session_template = 2;</code>
     */
    public Builder setSessionTemplate(Session value) {
      if (sessionTemplateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sessionTemplate_ = value;
        onChanged();
      } else {
        sessionTemplateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Parameters to be applied to each created session.
     * </pre>
     *
     * <code>.google.spanner.v1.Session session_template = 2;</code>
     */
    public Builder setSessionTemplate(Session.Builder builderForValue) {
      if (sessionTemplateBuilder_ == null) {
        sessionTemplate_ = builderForValue.build();
        onChanged();
      } else {
        sessionTemplateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Parameters to be applied to each created session.
     * </pre>
     *
     * <code>.google.spanner.v1.Session session_template = 2;</code>
     */
    public Builder mergeSessionTemplate(Session value) {
      if (sessionTemplateBuilder_ == null) {
        if (sessionTemplate_ != null) {
          sessionTemplate_ = Session.newBuilder(sessionTemplate_).mergeFrom(value).buildPartial();
        } else {
          sessionTemplate_ = value;
        }
        onChanged();
      } else {
        sessionTemplateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Parameters to be applied to each created session.
     * </pre>
     *
     * <code>.google.spanner.v1.Session session_template = 2;</code>
     */
    public Builder clearSessionTemplate() {
      if (sessionTemplateBuilder_ == null) {
        sessionTemplate_ = null;
        onChanged();
      } else {
        sessionTemplate_ = null;
        sessionTemplateBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Parameters to be applied to each created session.
     * </pre>
     *
     * <code>.google.spanner.v1.Session session_template = 2;</code>
     */
    public Session.Builder getSessionTemplateBuilder() {

      onChanged();
      return getSessionTemplateFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Parameters to be applied to each created session.
     * </pre>
     *
     * <code>.google.spanner.v1.Session session_template = 2;</code>
     */
    public SessionOrBuilder getSessionTemplateOrBuilder() {
      if (sessionTemplateBuilder_ != null) {
        return sessionTemplateBuilder_.getMessageOrBuilder();
      } else {
        return sessionTemplate_ == null ? Session.getDefaultInstance() : sessionTemplate_;
      }
    }
    /**
     *
     *
     * <pre>
     * Parameters to be applied to each created session.
     * </pre>
     *
     * <code>.google.spanner.v1.Session session_template = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<Session, Session.Builder, SessionOrBuilder>
        getSessionTemplateFieldBuilder() {
      if (sessionTemplateBuilder_ == null) {
        sessionTemplateBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                Session, Session.Builder, SessionOrBuilder>(
                getSessionTemplate(), getParentForChildren(), isClean());
        sessionTemplate_ = null;
      }
      return sessionTemplateBuilder_;
    }

    private int sessionCount_;
    /**
     *
     *
     * <pre>
     * Required. The number of sessions to be created in this batch call.
     * The API may return fewer than the requested number of sessions. If a
     * specific number of sessions are desired, the client can make additional
     * calls to BatchCreateSessions (adjusting
     * [session_count][google.spanner.v1.BatchCreateSessionsRequest.session_count] as necessary).
     * </pre>
     *
     * <code>int32 session_count = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The sessionCount.
     */
    @Override
    public int getSessionCount() {
      return sessionCount_;
    }
    /**
     *
     *
     * <pre>
     * Required. The number of sessions to be created in this batch call.
     * The API may return fewer than the requested number of sessions. If a
     * specific number of sessions are desired, the client can make additional
     * calls to BatchCreateSessions (adjusting
     * [session_count][google.spanner.v1.BatchCreateSessionsRequest.session_count] as necessary).
     * </pre>
     *
     * <code>int32 session_count = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The sessionCount to set.
     * @return This builder for chaining.
     */
    public Builder setSessionCount(int value) {

      sessionCount_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The number of sessions to be created in this batch call.
     * The API may return fewer than the requested number of sessions. If a
     * specific number of sessions are desired, the client can make additional
     * calls to BatchCreateSessions (adjusting
     * [session_count][google.spanner.v1.BatchCreateSessionsRequest.session_count] as necessary).
     * </pre>
     *
     * <code>int32 session_count = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSessionCount() {

      sessionCount_ = 0;
      onChanged();
      return this;
    }

    @Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.spanner.v1.BatchCreateSessionsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.v1.BatchCreateSessionsRequest)
  private static final BatchCreateSessionsRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new BatchCreateSessionsRequest();
  }

  public static BatchCreateSessionsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchCreateSessionsRequest> PARSER =
      new com.google.protobuf.AbstractParser<BatchCreateSessionsRequest>() {
        @Override
        public BatchCreateSessionsRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BatchCreateSessionsRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BatchCreateSessionsRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<BatchCreateSessionsRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public BatchCreateSessionsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
