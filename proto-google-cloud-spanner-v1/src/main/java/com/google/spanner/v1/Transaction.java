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
// source: google/spanner/v1/transaction.proto

package com.google.spanner.v1;

/**
 *
 *
 * <pre>
 * A transaction.
 * </pre>
 *
 * Protobuf type {@code google.spanner.v1.Transaction}
 */
public final class Transaction extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.spanner.v1.Transaction)
    TransactionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Transaction.newBuilder() to construct.
  private Transaction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Transaction() {
    id_ = com.google.protobuf.ByteString.EMPTY;
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(UnusedPrivateParameter unused) {
    return new Transaction();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Transaction(
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
              id_ = input.readBytes();
              break;
            }
          case 18:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (readTimestamp_ != null) {
                subBuilder = readTimestamp_.toBuilder();
              }
              readTimestamp_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(readTimestamp_);
                readTimestamp_ = subBuilder.buildPartial();
              }

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
    return TransactionProto.internal_static_google_spanner_v1_Transaction_descriptor;
  }

  @Override
  protected FieldAccessorTable internalGetFieldAccessorTable() {
    return TransactionProto.internal_static_google_spanner_v1_Transaction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(Transaction.class, Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString id_;
  /**
   *
   *
   * <pre>
   * `id` may be used to identify the transaction in subsequent
   * [Read][google.spanner.v1.Spanner.Read],
   * [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql],
   * [Commit][google.spanner.v1.Spanner.Commit], or
   * [Rollback][google.spanner.v1.Spanner.Rollback] calls.
   * Single-use read-only transactions do not have IDs, because
   * single-use transactions do not support multiple requests.
   * </pre>
   *
   * <code>bytes id = 1;</code>
   *
   * @return The id.
   */
  @Override
  public com.google.protobuf.ByteString getId() {
    return id_;
  }

  public static final int READ_TIMESTAMP_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp readTimestamp_;
  /**
   *
   *
   * <pre>
   * For snapshot read-only transactions, the read timestamp chosen
   * for the transaction. Not returned by default: see
   * [TransactionOptions.ReadOnly.return_read_timestamp][google.spanner.v1.TransactionOptions.ReadOnly.return_read_timestamp].
   * A timestamp in RFC3339 UTC &#92;"Zulu&#92;" format, accurate to nanoseconds.
   * Example: `"2014-10-02T15:01:23.045123456Z"`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_timestamp = 2;</code>
   *
   * @return Whether the readTimestamp field is set.
   */
  @Override
  public boolean hasReadTimestamp() {
    return readTimestamp_ != null;
  }
  /**
   *
   *
   * <pre>
   * For snapshot read-only transactions, the read timestamp chosen
   * for the transaction. Not returned by default: see
   * [TransactionOptions.ReadOnly.return_read_timestamp][google.spanner.v1.TransactionOptions.ReadOnly.return_read_timestamp].
   * A timestamp in RFC3339 UTC &#92;"Zulu&#92;" format, accurate to nanoseconds.
   * Example: `"2014-10-02T15:01:23.045123456Z"`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_timestamp = 2;</code>
   *
   * @return The readTimestamp.
   */
  @Override
  public com.google.protobuf.Timestamp getReadTimestamp() {
    return readTimestamp_ == null
        ? com.google.protobuf.Timestamp.getDefaultInstance()
        : readTimestamp_;
  }
  /**
   *
   *
   * <pre>
   * For snapshot read-only transactions, the read timestamp chosen
   * for the transaction. Not returned by default: see
   * [TransactionOptions.ReadOnly.return_read_timestamp][google.spanner.v1.TransactionOptions.ReadOnly.return_read_timestamp].
   * A timestamp in RFC3339 UTC &#92;"Zulu&#92;" format, accurate to nanoseconds.
   * Example: `"2014-10-02T15:01:23.045123456Z"`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_timestamp = 2;</code>
   */
  @Override
  public com.google.protobuf.TimestampOrBuilder getReadTimestampOrBuilder() {
    return getReadTimestamp();
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
    if (!id_.isEmpty()) {
      output.writeBytes(1, id_);
    }
    if (readTimestamp_ != null) {
      output.writeMessage(2, getReadTimestamp());
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!id_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, id_);
    }
    if (readTimestamp_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getReadTimestamp());
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
    if (!(obj instanceof Transaction)) {
      return super.equals(obj);
    }
    Transaction other = (Transaction) obj;

    if (!getId().equals(other.getId())) return false;
    if (hasReadTimestamp() != other.hasReadTimestamp()) return false;
    if (hasReadTimestamp()) {
      if (!getReadTimestamp().equals(other.getReadTimestamp())) return false;
    }
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    if (hasReadTimestamp()) {
      hash = (37 * hash) + READ_TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getReadTimestamp().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Transaction parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static Transaction parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static Transaction parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static Transaction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static Transaction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static Transaction parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static Transaction parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static Transaction parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static Transaction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static Transaction parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static Transaction parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static Transaction parseFrom(
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

  public static Builder newBuilder(Transaction prototype) {
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
   * A transaction.
   * </pre>
   *
   * Protobuf type {@code google.spanner.v1.Transaction}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.spanner.v1.Transaction)
      TransactionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return TransactionProto.internal_static_google_spanner_v1_Transaction_descriptor;
    }

    @Override
    protected FieldAccessorTable internalGetFieldAccessorTable() {
      return TransactionProto.internal_static_google_spanner_v1_Transaction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(Transaction.class, Builder.class);
    }

    // Construct using com.google.spanner.v1.Transaction.newBuilder()
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
      id_ = com.google.protobuf.ByteString.EMPTY;

      if (readTimestampBuilder_ == null) {
        readTimestamp_ = null;
      } else {
        readTimestamp_ = null;
        readTimestampBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return TransactionProto.internal_static_google_spanner_v1_Transaction_descriptor;
    }

    @Override
    public Transaction getDefaultInstanceForType() {
      return Transaction.getDefaultInstance();
    }

    @Override
    public Transaction build() {
      Transaction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Transaction buildPartial() {
      Transaction result = new Transaction(this);
      result.id_ = id_;
      if (readTimestampBuilder_ == null) {
        result.readTimestamp_ = readTimestamp_;
      } else {
        result.readTimestamp_ = readTimestampBuilder_.build();
      }
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
      if (other instanceof Transaction) {
        return mergeFrom((Transaction) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Transaction other) {
      if (other == Transaction.getDefaultInstance()) return this;
      if (other.getId() != com.google.protobuf.ByteString.EMPTY) {
        setId(other.getId());
      }
      if (other.hasReadTimestamp()) {
        mergeReadTimestamp(other.getReadTimestamp());
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
      Transaction parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Transaction) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString id_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * `id` may be used to identify the transaction in subsequent
     * [Read][google.spanner.v1.Spanner.Read],
     * [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql],
     * [Commit][google.spanner.v1.Spanner.Commit], or
     * [Rollback][google.spanner.v1.Spanner.Rollback] calls.
     * Single-use read-only transactions do not have IDs, because
     * single-use transactions do not support multiple requests.
     * </pre>
     *
     * <code>bytes id = 1;</code>
     *
     * @return The id.
     */
    @Override
    public com.google.protobuf.ByteString getId() {
      return id_;
    }
    /**
     *
     *
     * <pre>
     * `id` may be used to identify the transaction in subsequent
     * [Read][google.spanner.v1.Spanner.Read],
     * [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql],
     * [Commit][google.spanner.v1.Spanner.Commit], or
     * [Rollback][google.spanner.v1.Spanner.Rollback] calls.
     * Single-use read-only transactions do not have IDs, because
     * single-use transactions do not support multiple requests.
     * </pre>
     *
     * <code>bytes id = 1;</code>
     *
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      id_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * `id` may be used to identify the transaction in subsequent
     * [Read][google.spanner.v1.Spanner.Read],
     * [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql],
     * [Commit][google.spanner.v1.Spanner.Commit], or
     * [Rollback][google.spanner.v1.Spanner.Rollback] calls.
     * Single-use read-only transactions do not have IDs, because
     * single-use transactions do not support multiple requests.
     * </pre>
     *
     * <code>bytes id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearId() {

      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp readTimestamp_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        readTimestampBuilder_;
    /**
     *
     *
     * <pre>
     * For snapshot read-only transactions, the read timestamp chosen
     * for the transaction. Not returned by default: see
     * [TransactionOptions.ReadOnly.return_read_timestamp][google.spanner.v1.TransactionOptions.ReadOnly.return_read_timestamp].
     * A timestamp in RFC3339 UTC &#92;"Zulu&#92;" format, accurate to nanoseconds.
     * Example: `"2014-10-02T15:01:23.045123456Z"`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp read_timestamp = 2;</code>
     *
     * @return Whether the readTimestamp field is set.
     */
    public boolean hasReadTimestamp() {
      return readTimestampBuilder_ != null || readTimestamp_ != null;
    }
    /**
     *
     *
     * <pre>
     * For snapshot read-only transactions, the read timestamp chosen
     * for the transaction. Not returned by default: see
     * [TransactionOptions.ReadOnly.return_read_timestamp][google.spanner.v1.TransactionOptions.ReadOnly.return_read_timestamp].
     * A timestamp in RFC3339 UTC &#92;"Zulu&#92;" format, accurate to nanoseconds.
     * Example: `"2014-10-02T15:01:23.045123456Z"`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp read_timestamp = 2;</code>
     *
     * @return The readTimestamp.
     */
    public com.google.protobuf.Timestamp getReadTimestamp() {
      if (readTimestampBuilder_ == null) {
        return readTimestamp_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : readTimestamp_;
      } else {
        return readTimestampBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * For snapshot read-only transactions, the read timestamp chosen
     * for the transaction. Not returned by default: see
     * [TransactionOptions.ReadOnly.return_read_timestamp][google.spanner.v1.TransactionOptions.ReadOnly.return_read_timestamp].
     * A timestamp in RFC3339 UTC &#92;"Zulu&#92;" format, accurate to nanoseconds.
     * Example: `"2014-10-02T15:01:23.045123456Z"`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp read_timestamp = 2;</code>
     */
    public Builder setReadTimestamp(com.google.protobuf.Timestamp value) {
      if (readTimestampBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        readTimestamp_ = value;
        onChanged();
      } else {
        readTimestampBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * For snapshot read-only transactions, the read timestamp chosen
     * for the transaction. Not returned by default: see
     * [TransactionOptions.ReadOnly.return_read_timestamp][google.spanner.v1.TransactionOptions.ReadOnly.return_read_timestamp].
     * A timestamp in RFC3339 UTC &#92;"Zulu&#92;" format, accurate to nanoseconds.
     * Example: `"2014-10-02T15:01:23.045123456Z"`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp read_timestamp = 2;</code>
     */
    public Builder setReadTimestamp(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (readTimestampBuilder_ == null) {
        readTimestamp_ = builderForValue.build();
        onChanged();
      } else {
        readTimestampBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * For snapshot read-only transactions, the read timestamp chosen
     * for the transaction. Not returned by default: see
     * [TransactionOptions.ReadOnly.return_read_timestamp][google.spanner.v1.TransactionOptions.ReadOnly.return_read_timestamp].
     * A timestamp in RFC3339 UTC &#92;"Zulu&#92;" format, accurate to nanoseconds.
     * Example: `"2014-10-02T15:01:23.045123456Z"`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp read_timestamp = 2;</code>
     */
    public Builder mergeReadTimestamp(com.google.protobuf.Timestamp value) {
      if (readTimestampBuilder_ == null) {
        if (readTimestamp_ != null) {
          readTimestamp_ =
              com.google.protobuf.Timestamp.newBuilder(readTimestamp_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          readTimestamp_ = value;
        }
        onChanged();
      } else {
        readTimestampBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * For snapshot read-only transactions, the read timestamp chosen
     * for the transaction. Not returned by default: see
     * [TransactionOptions.ReadOnly.return_read_timestamp][google.spanner.v1.TransactionOptions.ReadOnly.return_read_timestamp].
     * A timestamp in RFC3339 UTC &#92;"Zulu&#92;" format, accurate to nanoseconds.
     * Example: `"2014-10-02T15:01:23.045123456Z"`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp read_timestamp = 2;</code>
     */
    public Builder clearReadTimestamp() {
      if (readTimestampBuilder_ == null) {
        readTimestamp_ = null;
        onChanged();
      } else {
        readTimestamp_ = null;
        readTimestampBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * For snapshot read-only transactions, the read timestamp chosen
     * for the transaction. Not returned by default: see
     * [TransactionOptions.ReadOnly.return_read_timestamp][google.spanner.v1.TransactionOptions.ReadOnly.return_read_timestamp].
     * A timestamp in RFC3339 UTC &#92;"Zulu&#92;" format, accurate to nanoseconds.
     * Example: `"2014-10-02T15:01:23.045123456Z"`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp read_timestamp = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getReadTimestampBuilder() {

      onChanged();
      return getReadTimestampFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * For snapshot read-only transactions, the read timestamp chosen
     * for the transaction. Not returned by default: see
     * [TransactionOptions.ReadOnly.return_read_timestamp][google.spanner.v1.TransactionOptions.ReadOnly.return_read_timestamp].
     * A timestamp in RFC3339 UTC &#92;"Zulu&#92;" format, accurate to nanoseconds.
     * Example: `"2014-10-02T15:01:23.045123456Z"`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp read_timestamp = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getReadTimestampOrBuilder() {
      if (readTimestampBuilder_ != null) {
        return readTimestampBuilder_.getMessageOrBuilder();
      } else {
        return readTimestamp_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : readTimestamp_;
      }
    }
    /**
     *
     *
     * <pre>
     * For snapshot read-only transactions, the read timestamp chosen
     * for the transaction. Not returned by default: see
     * [TransactionOptions.ReadOnly.return_read_timestamp][google.spanner.v1.TransactionOptions.ReadOnly.return_read_timestamp].
     * A timestamp in RFC3339 UTC &#92;"Zulu&#92;" format, accurate to nanoseconds.
     * Example: `"2014-10-02T15:01:23.045123456Z"`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp read_timestamp = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getReadTimestampFieldBuilder() {
      if (readTimestampBuilder_ == null) {
        readTimestampBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getReadTimestamp(), getParentForChildren(), isClean());
        readTimestamp_ = null;
      }
      return readTimestampBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.spanner.v1.Transaction)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.v1.Transaction)
  private static final Transaction DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new Transaction();
  }

  public static Transaction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Transaction> PARSER =
      new com.google.protobuf.AbstractParser<Transaction>() {
        @Override
        public Transaction parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Transaction(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Transaction> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Transaction> getParserForType() {
    return PARSER;
  }

  @Override
  public Transaction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
