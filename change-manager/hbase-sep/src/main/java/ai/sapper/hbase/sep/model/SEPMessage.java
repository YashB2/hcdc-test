// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hbase-sep.proto

package ai.sapper.hbase.sep.model;

/**
 * Protobuf type {@code ai_sapper_hbase_sep_model.SEPMessage}
 */
public final class SEPMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ai_sapper_hbase_sep_model.SEPMessage)
    SEPMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SEPMessage.newBuilder() to construct.
  private SEPMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SEPMessage() {
    row_ = com.google.protobuf.ByteString.EMPTY;
    value_ = com.google.protobuf.ByteString.EMPTY;
    columnFamily_ = com.google.protobuf.ByteString.EMPTY;
    qualifier_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SEPMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SEPMessage(
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
            bitField0_ |= 0x00000001;
            row_ = input.readBytes();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            timestamp_ = input.readUInt64();
            break;
          }
          case 26: {
            bitField0_ |= 0x00000004;
            value_ = input.readBytes();
            break;
          }
          case 34: {
            ai.sapper.hbase.sep.model.SEPTableName.Builder subBuilder = null;
            if (((bitField0_ & 0x00000008) != 0)) {
              subBuilder = table_.toBuilder();
            }
            table_ = input.readMessage(ai.sapper.hbase.sep.model.SEPTableName.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(table_);
              table_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000008;
            break;
          }
          case 42: {
            bitField0_ |= 0x00000010;
            columnFamily_ = input.readBytes();
            break;
          }
          case 50: {
            bitField0_ |= 0x00000020;
            qualifier_ = input.readBytes();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return ai.sapper.hbase.sep.model.HBaseSEPModel.internal_static_ai_sapper_hbase_sep_model_SEPMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.sapper.hbase.sep.model.HBaseSEPModel.internal_static_ai_sapper_hbase_sep_model_SEPMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.sapper.hbase.sep.model.SEPMessage.class, ai.sapper.hbase.sep.model.SEPMessage.Builder.class);
  }

  private int bitField0_;
  public static final int ROW_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString row_;
  /**
   * <code>required bytes row = 1;</code>
   * @return Whether the row field is set.
   */
  @java.lang.Override
  public boolean hasRow() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>required bytes row = 1;</code>
   * @return The row.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRow() {
    return row_;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 2;
  private long timestamp_;
  /**
   * <code>required uint64 timestamp = 2;</code>
   * @return Whether the timestamp field is set.
   */
  @java.lang.Override
  public boolean hasTimestamp() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>required uint64 timestamp = 2;</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public long getTimestamp() {
    return timestamp_;
  }

  public static final int VALUE_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString value_;
  /**
   * <code>required bytes value = 3;</code>
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>required bytes value = 3;</code>
   * @return The value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getValue() {
    return value_;
  }

  public static final int TABLE_FIELD_NUMBER = 4;
  private ai.sapper.hbase.sep.model.SEPTableName table_;
  /**
   * <code>required .ai_sapper_hbase_sep_model.SEPTableName table = 4;</code>
   * @return Whether the table field is set.
   */
  @java.lang.Override
  public boolean hasTable() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>required .ai_sapper_hbase_sep_model.SEPTableName table = 4;</code>
   * @return The table.
   */
  @java.lang.Override
  public ai.sapper.hbase.sep.model.SEPTableName getTable() {
    return table_ == null ? ai.sapper.hbase.sep.model.SEPTableName.getDefaultInstance() : table_;
  }
  /**
   * <code>required .ai_sapper_hbase_sep_model.SEPTableName table = 4;</code>
   */
  @java.lang.Override
  public ai.sapper.hbase.sep.model.SEPTableNameOrBuilder getTableOrBuilder() {
    return table_ == null ? ai.sapper.hbase.sep.model.SEPTableName.getDefaultInstance() : table_;
  }

  public static final int COLUMNFAMILY_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString columnFamily_;
  /**
   * <code>optional bytes columnFamily = 5;</code>
   * @return Whether the columnFamily field is set.
   */
  @java.lang.Override
  public boolean hasColumnFamily() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <code>optional bytes columnFamily = 5;</code>
   * @return The columnFamily.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getColumnFamily() {
    return columnFamily_;
  }

  public static final int QUALIFIER_FIELD_NUMBER = 6;
  private com.google.protobuf.ByteString qualifier_;
  /**
   * <code>optional bytes qualifier = 6;</code>
   * @return Whether the qualifier field is set.
   */
  @java.lang.Override
  public boolean hasQualifier() {
    return ((bitField0_ & 0x00000020) != 0);
  }
  /**
   * <code>optional bytes qualifier = 6;</code>
   * @return The qualifier.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getQualifier() {
    return qualifier_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasRow()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasTimestamp()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasValue()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasTable()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getTable().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBytes(1, row_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeUInt64(2, timestamp_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeBytes(3, value_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeMessage(4, getTable());
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      output.writeBytes(5, columnFamily_);
    }
    if (((bitField0_ & 0x00000020) != 0)) {
      output.writeBytes(6, qualifier_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, row_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, timestamp_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, value_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getTable());
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, columnFamily_);
    }
    if (((bitField0_ & 0x00000020) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(6, qualifier_);
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
    if (!(obj instanceof ai.sapper.hbase.sep.model.SEPMessage)) {
      return super.equals(obj);
    }
    ai.sapper.hbase.sep.model.SEPMessage other = (ai.sapper.hbase.sep.model.SEPMessage) obj;

    if (hasRow() != other.hasRow()) return false;
    if (hasRow()) {
      if (!getRow()
          .equals(other.getRow())) return false;
    }
    if (hasTimestamp() != other.hasTimestamp()) return false;
    if (hasTimestamp()) {
      if (getTimestamp()
          != other.getTimestamp()) return false;
    }
    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue()
          .equals(other.getValue())) return false;
    }
    if (hasTable() != other.hasTable()) return false;
    if (hasTable()) {
      if (!getTable()
          .equals(other.getTable())) return false;
    }
    if (hasColumnFamily() != other.hasColumnFamily()) return false;
    if (hasColumnFamily()) {
      if (!getColumnFamily()
          .equals(other.getColumnFamily())) return false;
    }
    if (hasQualifier() != other.hasQualifier()) return false;
    if (hasQualifier()) {
      if (!getQualifier()
          .equals(other.getQualifier())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasRow()) {
      hash = (37 * hash) + ROW_FIELD_NUMBER;
      hash = (53 * hash) + getRow().hashCode();
    }
    if (hasTimestamp()) {
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTimestamp());
    }
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    if (hasTable()) {
      hash = (37 * hash) + TABLE_FIELD_NUMBER;
      hash = (53 * hash) + getTable().hashCode();
    }
    if (hasColumnFamily()) {
      hash = (37 * hash) + COLUMNFAMILY_FIELD_NUMBER;
      hash = (53 * hash) + getColumnFamily().hashCode();
    }
    if (hasQualifier()) {
      hash = (37 * hash) + QUALIFIER_FIELD_NUMBER;
      hash = (53 * hash) + getQualifier().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.sapper.hbase.sep.model.SEPMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sapper.hbase.sep.model.SEPMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sapper.hbase.sep.model.SEPMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sapper.hbase.sep.model.SEPMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sapper.hbase.sep.model.SEPMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sapper.hbase.sep.model.SEPMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sapper.hbase.sep.model.SEPMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sapper.hbase.sep.model.SEPMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sapper.hbase.sep.model.SEPMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.sapper.hbase.sep.model.SEPMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sapper.hbase.sep.model.SEPMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sapper.hbase.sep.model.SEPMessage parseFrom(
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
  public static Builder newBuilder(ai.sapper.hbase.sep.model.SEPMessage prototype) {
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
   * Protobuf type {@code ai_sapper_hbase_sep_model.SEPMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ai_sapper_hbase_sep_model.SEPMessage)
      ai.sapper.hbase.sep.model.SEPMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.sapper.hbase.sep.model.HBaseSEPModel.internal_static_ai_sapper_hbase_sep_model_SEPMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.sapper.hbase.sep.model.HBaseSEPModel.internal_static_ai_sapper_hbase_sep_model_SEPMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.sapper.hbase.sep.model.SEPMessage.class, ai.sapper.hbase.sep.model.SEPMessage.Builder.class);
    }

    // Construct using ai.sapper.hbase.sep.model.SEPMessage.newBuilder()
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
        getTableFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      row_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      timestamp_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      value_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      if (tableBuilder_ == null) {
        table_ = null;
      } else {
        tableBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      columnFamily_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      qualifier_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000020);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.sapper.hbase.sep.model.HBaseSEPModel.internal_static_ai_sapper_hbase_sep_model_SEPMessage_descriptor;
    }

    @java.lang.Override
    public ai.sapper.hbase.sep.model.SEPMessage getDefaultInstanceForType() {
      return ai.sapper.hbase.sep.model.SEPMessage.getDefaultInstance();
    }

    @java.lang.Override
    public ai.sapper.hbase.sep.model.SEPMessage build() {
      ai.sapper.hbase.sep.model.SEPMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.sapper.hbase.sep.model.SEPMessage buildPartial() {
      ai.sapper.hbase.sep.model.SEPMessage result = new ai.sapper.hbase.sep.model.SEPMessage(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.row_ = row_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.timestamp_ = timestamp_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.value_ = value_;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        if (tableBuilder_ == null) {
          result.table_ = table_;
        } else {
          result.table_ = tableBuilder_.build();
        }
        to_bitField0_ |= 0x00000008;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        to_bitField0_ |= 0x00000010;
      }
      result.columnFamily_ = columnFamily_;
      if (((from_bitField0_ & 0x00000020) != 0)) {
        to_bitField0_ |= 0x00000020;
      }
      result.qualifier_ = qualifier_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.sapper.hbase.sep.model.SEPMessage) {
        return mergeFrom((ai.sapper.hbase.sep.model.SEPMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.sapper.hbase.sep.model.SEPMessage other) {
      if (other == ai.sapper.hbase.sep.model.SEPMessage.getDefaultInstance()) return this;
      if (other.hasRow()) {
        setRow(other.getRow());
      }
      if (other.hasTimestamp()) {
        setTimestamp(other.getTimestamp());
      }
      if (other.hasValue()) {
        setValue(other.getValue());
      }
      if (other.hasTable()) {
        mergeTable(other.getTable());
      }
      if (other.hasColumnFamily()) {
        setColumnFamily(other.getColumnFamily());
      }
      if (other.hasQualifier()) {
        setQualifier(other.getQualifier());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      if (!hasRow()) {
        return false;
      }
      if (!hasTimestamp()) {
        return false;
      }
      if (!hasValue()) {
        return false;
      }
      if (!hasTable()) {
        return false;
      }
      if (!getTable().isInitialized()) {
        return false;
      }
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ai.sapper.hbase.sep.model.SEPMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.sapper.hbase.sep.model.SEPMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.ByteString row_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>required bytes row = 1;</code>
     * @return Whether the row field is set.
     */
    @java.lang.Override
    public boolean hasRow() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required bytes row = 1;</code>
     * @return The row.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getRow() {
      return row_;
    }
    /**
     * <code>required bytes row = 1;</code>
     * @param value The row to set.
     * @return This builder for chaining.
     */
    public Builder setRow(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      row_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required bytes row = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRow() {
      bitField0_ = (bitField0_ & ~0x00000001);
      row_ = getDefaultInstance().getRow();
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <code>required uint64 timestamp = 2;</code>
     * @return Whether the timestamp field is set.
     */
    @java.lang.Override
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required uint64 timestamp = 2;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>required uint64 timestamp = 2;</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(long value) {
      bitField0_ |= 0x00000002;
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required uint64 timestamp = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000002);
      timestamp_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>required bytes value = 3;</code>
     * @return Whether the value field is set.
     */
    @java.lang.Override
    public boolean hasValue() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required bytes value = 3;</code>
     * @return The value.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getValue() {
      return value_;
    }
    /**
     * <code>required bytes value = 3;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required bytes value = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000004);
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }

    private ai.sapper.hbase.sep.model.SEPTableName table_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.sapper.hbase.sep.model.SEPTableName, ai.sapper.hbase.sep.model.SEPTableName.Builder, ai.sapper.hbase.sep.model.SEPTableNameOrBuilder> tableBuilder_;
    /**
     * <code>required .ai_sapper_hbase_sep_model.SEPTableName table = 4;</code>
     * @return Whether the table field is set.
     */
    public boolean hasTable() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>required .ai_sapper_hbase_sep_model.SEPTableName table = 4;</code>
     * @return The table.
     */
    public ai.sapper.hbase.sep.model.SEPTableName getTable() {
      if (tableBuilder_ == null) {
        return table_ == null ? ai.sapper.hbase.sep.model.SEPTableName.getDefaultInstance() : table_;
      } else {
        return tableBuilder_.getMessage();
      }
    }
    /**
     * <code>required .ai_sapper_hbase_sep_model.SEPTableName table = 4;</code>
     */
    public Builder setTable(ai.sapper.hbase.sep.model.SEPTableName value) {
      if (tableBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        table_ = value;
        onChanged();
      } else {
        tableBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <code>required .ai_sapper_hbase_sep_model.SEPTableName table = 4;</code>
     */
    public Builder setTable(
        ai.sapper.hbase.sep.model.SEPTableName.Builder builderForValue) {
      if (tableBuilder_ == null) {
        table_ = builderForValue.build();
        onChanged();
      } else {
        tableBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <code>required .ai_sapper_hbase_sep_model.SEPTableName table = 4;</code>
     */
    public Builder mergeTable(ai.sapper.hbase.sep.model.SEPTableName value) {
      if (tableBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
            table_ != null &&
            table_ != ai.sapper.hbase.sep.model.SEPTableName.getDefaultInstance()) {
          table_ =
            ai.sapper.hbase.sep.model.SEPTableName.newBuilder(table_).mergeFrom(value).buildPartial();
        } else {
          table_ = value;
        }
        onChanged();
      } else {
        tableBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <code>required .ai_sapper_hbase_sep_model.SEPTableName table = 4;</code>
     */
    public Builder clearTable() {
      if (tableBuilder_ == null) {
        table_ = null;
        onChanged();
      } else {
        tableBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }
    /**
     * <code>required .ai_sapper_hbase_sep_model.SEPTableName table = 4;</code>
     */
    public ai.sapper.hbase.sep.model.SEPTableName.Builder getTableBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getTableFieldBuilder().getBuilder();
    }
    /**
     * <code>required .ai_sapper_hbase_sep_model.SEPTableName table = 4;</code>
     */
    public ai.sapper.hbase.sep.model.SEPTableNameOrBuilder getTableOrBuilder() {
      if (tableBuilder_ != null) {
        return tableBuilder_.getMessageOrBuilder();
      } else {
        return table_ == null ?
            ai.sapper.hbase.sep.model.SEPTableName.getDefaultInstance() : table_;
      }
    }
    /**
     * <code>required .ai_sapper_hbase_sep_model.SEPTableName table = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.sapper.hbase.sep.model.SEPTableName, ai.sapper.hbase.sep.model.SEPTableName.Builder, ai.sapper.hbase.sep.model.SEPTableNameOrBuilder> 
        getTableFieldBuilder() {
      if (tableBuilder_ == null) {
        tableBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.sapper.hbase.sep.model.SEPTableName, ai.sapper.hbase.sep.model.SEPTableName.Builder, ai.sapper.hbase.sep.model.SEPTableNameOrBuilder>(
                getTable(),
                getParentForChildren(),
                isClean());
        table_ = null;
      }
      return tableBuilder_;
    }

    private com.google.protobuf.ByteString columnFamily_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes columnFamily = 5;</code>
     * @return Whether the columnFamily field is set.
     */
    @java.lang.Override
    public boolean hasColumnFamily() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>optional bytes columnFamily = 5;</code>
     * @return The columnFamily.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getColumnFamily() {
      return columnFamily_;
    }
    /**
     * <code>optional bytes columnFamily = 5;</code>
     * @param value The columnFamily to set.
     * @return This builder for chaining.
     */
    public Builder setColumnFamily(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
      columnFamily_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes columnFamily = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearColumnFamily() {
      bitField0_ = (bitField0_ & ~0x00000010);
      columnFamily_ = getDefaultInstance().getColumnFamily();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString qualifier_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes qualifier = 6;</code>
     * @return Whether the qualifier field is set.
     */
    @java.lang.Override
    public boolean hasQualifier() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <code>optional bytes qualifier = 6;</code>
     * @return The qualifier.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getQualifier() {
      return qualifier_;
    }
    /**
     * <code>optional bytes qualifier = 6;</code>
     * @param value The qualifier to set.
     * @return This builder for chaining.
     */
    public Builder setQualifier(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
      qualifier_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes qualifier = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearQualifier() {
      bitField0_ = (bitField0_ & ~0x00000020);
      qualifier_ = getDefaultInstance().getQualifier();
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ai_sapper_hbase_sep_model.SEPMessage)
  }

  // @@protoc_insertion_point(class_scope:ai_sapper_hbase_sep_model.SEPMessage)
  private static final ai.sapper.hbase.sep.model.SEPMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.sapper.hbase.sep.model.SEPMessage();
  }

  public static ai.sapper.hbase.sep.model.SEPMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<SEPMessage>
      PARSER = new com.google.protobuf.AbstractParser<SEPMessage>() {
    @java.lang.Override
    public SEPMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SEPMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SEPMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SEPMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.sapper.hbase.sep.model.SEPMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

