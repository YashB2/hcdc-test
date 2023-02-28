// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_block.proto

package ai.sapper.hcdc.common.model;

/**
 * Protobuf type {@code ai_sapper_hcdc_common_model.DFSBlockTruncate}
 */
public final class DFSBlockTruncate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ai_sapper_hcdc_common_model.DFSBlockTruncate)
    DFSBlockTruncateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DFSBlockTruncate.newBuilder() to construct.
  private DFSBlockTruncate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DFSBlockTruncate() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DFSBlockTruncate();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DFSBlockTruncate(
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
            ai.sapper.hcdc.common.model.DFSTransaction.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = transaction_.toBuilder();
            }
            transaction_ = input.readMessage(ai.sapper.hcdc.common.model.DFSTransaction.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(transaction_);
              transaction_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 18: {
            ai.sapper.hcdc.common.model.DFSFile.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) != 0)) {
              subBuilder = file_.toBuilder();
            }
            file_ = input.readMessage(ai.sapper.hcdc.common.model.DFSFile.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(file_);
              file_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
            break;
          }
          case 26: {
            ai.sapper.hcdc.common.model.DFSBlock.Builder subBuilder = null;
            if (((bitField0_ & 0x00000004) != 0)) {
              subBuilder = block_.toBuilder();
            }
            block_ = input.readMessage(ai.sapper.hcdc.common.model.DFSBlock.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(block_);
              block_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000004;
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            newLength_ = input.readUInt64();
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
    return ai.sapper.hcdc.common.model.DFSBlockProto.internal_static_ai_sapper_hcdc_common_model_DFSBlockTruncate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.sapper.hcdc.common.model.DFSBlockProto.internal_static_ai_sapper_hcdc_common_model_DFSBlockTruncate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.sapper.hcdc.common.model.DFSBlockTruncate.class, ai.sapper.hcdc.common.model.DFSBlockTruncate.Builder.class);
  }

  private int bitField0_;
  public static final int TRANSACTION_FIELD_NUMBER = 1;
  private ai.sapper.hcdc.common.model.DFSTransaction transaction_;
  /**
   * <code>required .ai_sapper_hcdc_common_model.DFSTransaction transaction = 1;</code>
   * @return Whether the transaction field is set.
   */
  @java.lang.Override
  public boolean hasTransaction() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>required .ai_sapper_hcdc_common_model.DFSTransaction transaction = 1;</code>
   * @return The transaction.
   */
  @java.lang.Override
  public ai.sapper.hcdc.common.model.DFSTransaction getTransaction() {
    return transaction_ == null ? ai.sapper.hcdc.common.model.DFSTransaction.getDefaultInstance() : transaction_;
  }
  /**
   * <code>required .ai_sapper_hcdc_common_model.DFSTransaction transaction = 1;</code>
   */
  @java.lang.Override
  public ai.sapper.hcdc.common.model.DFSTransactionOrBuilder getTransactionOrBuilder() {
    return transaction_ == null ? ai.sapper.hcdc.common.model.DFSTransaction.getDefaultInstance() : transaction_;
  }

  public static final int FILE_FIELD_NUMBER = 2;
  private ai.sapper.hcdc.common.model.DFSFile file_;
  /**
   * <code>required .ai_sapper_hcdc_common_model.DFSFile file = 2;</code>
   * @return Whether the file field is set.
   */
  @java.lang.Override
  public boolean hasFile() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>required .ai_sapper_hcdc_common_model.DFSFile file = 2;</code>
   * @return The file.
   */
  @java.lang.Override
  public ai.sapper.hcdc.common.model.DFSFile getFile() {
    return file_ == null ? ai.sapper.hcdc.common.model.DFSFile.getDefaultInstance() : file_;
  }
  /**
   * <code>required .ai_sapper_hcdc_common_model.DFSFile file = 2;</code>
   */
  @java.lang.Override
  public ai.sapper.hcdc.common.model.DFSFileOrBuilder getFileOrBuilder() {
    return file_ == null ? ai.sapper.hcdc.common.model.DFSFile.getDefaultInstance() : file_;
  }

  public static final int BLOCK_FIELD_NUMBER = 3;
  private ai.sapper.hcdc.common.model.DFSBlock block_;
  /**
   * <code>required .ai_sapper_hcdc_common_model.DFSBlock block = 3;</code>
   * @return Whether the block field is set.
   */
  @java.lang.Override
  public boolean hasBlock() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>required .ai_sapper_hcdc_common_model.DFSBlock block = 3;</code>
   * @return The block.
   */
  @java.lang.Override
  public ai.sapper.hcdc.common.model.DFSBlock getBlock() {
    return block_ == null ? ai.sapper.hcdc.common.model.DFSBlock.getDefaultInstance() : block_;
  }
  /**
   * <code>required .ai_sapper_hcdc_common_model.DFSBlock block = 3;</code>
   */
  @java.lang.Override
  public ai.sapper.hcdc.common.model.DFSBlockOrBuilder getBlockOrBuilder() {
    return block_ == null ? ai.sapper.hcdc.common.model.DFSBlock.getDefaultInstance() : block_;
  }

  public static final int NEWLENGTH_FIELD_NUMBER = 4;
  private long newLength_;
  /**
   * <code>required uint64 newLength = 4;</code>
   * @return Whether the newLength field is set.
   */
  @java.lang.Override
  public boolean hasNewLength() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>required uint64 newLength = 4;</code>
   * @return The newLength.
   */
  @java.lang.Override
  public long getNewLength() {
    return newLength_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasTransaction()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasFile()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasBlock()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasNewLength()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getTransaction().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getFile().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getBlock().isInitialized()) {
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
      output.writeMessage(1, getTransaction());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getFile());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(3, getBlock());
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeUInt64(4, newLength_);
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
        .computeMessageSize(1, getTransaction());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFile());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getBlock());
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, newLength_);
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
    if (!(obj instanceof ai.sapper.hcdc.common.model.DFSBlockTruncate)) {
      return super.equals(obj);
    }
    ai.sapper.hcdc.common.model.DFSBlockTruncate other = (ai.sapper.hcdc.common.model.DFSBlockTruncate) obj;

    if (hasTransaction() != other.hasTransaction()) return false;
    if (hasTransaction()) {
      if (!getTransaction()
          .equals(other.getTransaction())) return false;
    }
    if (hasFile() != other.hasFile()) return false;
    if (hasFile()) {
      if (!getFile()
          .equals(other.getFile())) return false;
    }
    if (hasBlock() != other.hasBlock()) return false;
    if (hasBlock()) {
      if (!getBlock()
          .equals(other.getBlock())) return false;
    }
    if (hasNewLength() != other.hasNewLength()) return false;
    if (hasNewLength()) {
      if (getNewLength()
          != other.getNewLength()) return false;
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
    if (hasTransaction()) {
      hash = (37 * hash) + TRANSACTION_FIELD_NUMBER;
      hash = (53 * hash) + getTransaction().hashCode();
    }
    if (hasFile()) {
      hash = (37 * hash) + FILE_FIELD_NUMBER;
      hash = (53 * hash) + getFile().hashCode();
    }
    if (hasBlock()) {
      hash = (37 * hash) + BLOCK_FIELD_NUMBER;
      hash = (53 * hash) + getBlock().hashCode();
    }
    if (hasNewLength()) {
      hash = (37 * hash) + NEWLENGTH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getNewLength());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.sapper.hcdc.common.model.DFSBlockTruncate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sapper.hcdc.common.model.DFSBlockTruncate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sapper.hcdc.common.model.DFSBlockTruncate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sapper.hcdc.common.model.DFSBlockTruncate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sapper.hcdc.common.model.DFSBlockTruncate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sapper.hcdc.common.model.DFSBlockTruncate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sapper.hcdc.common.model.DFSBlockTruncate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sapper.hcdc.common.model.DFSBlockTruncate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sapper.hcdc.common.model.DFSBlockTruncate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.sapper.hcdc.common.model.DFSBlockTruncate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sapper.hcdc.common.model.DFSBlockTruncate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sapper.hcdc.common.model.DFSBlockTruncate parseFrom(
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
  public static Builder newBuilder(ai.sapper.hcdc.common.model.DFSBlockTruncate prototype) {
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
   * Protobuf type {@code ai_sapper_hcdc_common_model.DFSBlockTruncate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ai_sapper_hcdc_common_model.DFSBlockTruncate)
      ai.sapper.hcdc.common.model.DFSBlockTruncateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.sapper.hcdc.common.model.DFSBlockProto.internal_static_ai_sapper_hcdc_common_model_DFSBlockTruncate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.sapper.hcdc.common.model.DFSBlockProto.internal_static_ai_sapper_hcdc_common_model_DFSBlockTruncate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.sapper.hcdc.common.model.DFSBlockTruncate.class, ai.sapper.hcdc.common.model.DFSBlockTruncate.Builder.class);
    }

    // Construct using ai.sapper.hcdc.common.model.DFSBlockTruncate.newBuilder()
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
        getTransactionFieldBuilder();
        getFileFieldBuilder();
        getBlockFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (transactionBuilder_ == null) {
        transaction_ = null;
      } else {
        transactionBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      if (fileBuilder_ == null) {
        file_ = null;
      } else {
        fileBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      if (blockBuilder_ == null) {
        block_ = null;
      } else {
        blockBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      newLength_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.sapper.hcdc.common.model.DFSBlockProto.internal_static_ai_sapper_hcdc_common_model_DFSBlockTruncate_descriptor;
    }

    @java.lang.Override
    public ai.sapper.hcdc.common.model.DFSBlockTruncate getDefaultInstanceForType() {
      return ai.sapper.hcdc.common.model.DFSBlockTruncate.getDefaultInstance();
    }

    @java.lang.Override
    public ai.sapper.hcdc.common.model.DFSBlockTruncate build() {
      ai.sapper.hcdc.common.model.DFSBlockTruncate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.sapper.hcdc.common.model.DFSBlockTruncate buildPartial() {
      ai.sapper.hcdc.common.model.DFSBlockTruncate result = new ai.sapper.hcdc.common.model.DFSBlockTruncate(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (transactionBuilder_ == null) {
          result.transaction_ = transaction_;
        } else {
          result.transaction_ = transactionBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        if (fileBuilder_ == null) {
          result.file_ = file_;
        } else {
          result.file_ = fileBuilder_.build();
        }
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        if (blockBuilder_ == null) {
          result.block_ = block_;
        } else {
          result.block_ = blockBuilder_.build();
        }
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.newLength_ = newLength_;
        to_bitField0_ |= 0x00000008;
      }
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
      if (other instanceof ai.sapper.hcdc.common.model.DFSBlockTruncate) {
        return mergeFrom((ai.sapper.hcdc.common.model.DFSBlockTruncate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.sapper.hcdc.common.model.DFSBlockTruncate other) {
      if (other == ai.sapper.hcdc.common.model.DFSBlockTruncate.getDefaultInstance()) return this;
      if (other.hasTransaction()) {
        mergeTransaction(other.getTransaction());
      }
      if (other.hasFile()) {
        mergeFile(other.getFile());
      }
      if (other.hasBlock()) {
        mergeBlock(other.getBlock());
      }
      if (other.hasNewLength()) {
        setNewLength(other.getNewLength());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      if (!hasTransaction()) {
        return false;
      }
      if (!hasFile()) {
        return false;
      }
      if (!hasBlock()) {
        return false;
      }
      if (!hasNewLength()) {
        return false;
      }
      if (!getTransaction().isInitialized()) {
        return false;
      }
      if (!getFile().isInitialized()) {
        return false;
      }
      if (!getBlock().isInitialized()) {
        return false;
      }
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ai.sapper.hcdc.common.model.DFSBlockTruncate parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.sapper.hcdc.common.model.DFSBlockTruncate) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private ai.sapper.hcdc.common.model.DFSTransaction transaction_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.sapper.hcdc.common.model.DFSTransaction, ai.sapper.hcdc.common.model.DFSTransaction.Builder, ai.sapper.hcdc.common.model.DFSTransactionOrBuilder> transactionBuilder_;
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSTransaction transaction = 1;</code>
     * @return Whether the transaction field is set.
     */
    public boolean hasTransaction() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSTransaction transaction = 1;</code>
     * @return The transaction.
     */
    public ai.sapper.hcdc.common.model.DFSTransaction getTransaction() {
      if (transactionBuilder_ == null) {
        return transaction_ == null ? ai.sapper.hcdc.common.model.DFSTransaction.getDefaultInstance() : transaction_;
      } else {
        return transactionBuilder_.getMessage();
      }
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSTransaction transaction = 1;</code>
     */
    public Builder setTransaction(ai.sapper.hcdc.common.model.DFSTransaction value) {
      if (transactionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        transaction_ = value;
        onChanged();
      } else {
        transactionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSTransaction transaction = 1;</code>
     */
    public Builder setTransaction(
        ai.sapper.hcdc.common.model.DFSTransaction.Builder builderForValue) {
      if (transactionBuilder_ == null) {
        transaction_ = builderForValue.build();
        onChanged();
      } else {
        transactionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSTransaction transaction = 1;</code>
     */
    public Builder mergeTransaction(ai.sapper.hcdc.common.model.DFSTransaction value) {
      if (transactionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            transaction_ != null &&
            transaction_ != ai.sapper.hcdc.common.model.DFSTransaction.getDefaultInstance()) {
          transaction_ =
            ai.sapper.hcdc.common.model.DFSTransaction.newBuilder(transaction_).mergeFrom(value).buildPartial();
        } else {
          transaction_ = value;
        }
        onChanged();
      } else {
        transactionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSTransaction transaction = 1;</code>
     */
    public Builder clearTransaction() {
      if (transactionBuilder_ == null) {
        transaction_ = null;
        onChanged();
      } else {
        transactionBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSTransaction transaction = 1;</code>
     */
    public ai.sapper.hcdc.common.model.DFSTransaction.Builder getTransactionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTransactionFieldBuilder().getBuilder();
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSTransaction transaction = 1;</code>
     */
    public ai.sapper.hcdc.common.model.DFSTransactionOrBuilder getTransactionOrBuilder() {
      if (transactionBuilder_ != null) {
        return transactionBuilder_.getMessageOrBuilder();
      } else {
        return transaction_ == null ?
            ai.sapper.hcdc.common.model.DFSTransaction.getDefaultInstance() : transaction_;
      }
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSTransaction transaction = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.sapper.hcdc.common.model.DFSTransaction, ai.sapper.hcdc.common.model.DFSTransaction.Builder, ai.sapper.hcdc.common.model.DFSTransactionOrBuilder> 
        getTransactionFieldBuilder() {
      if (transactionBuilder_ == null) {
        transactionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.sapper.hcdc.common.model.DFSTransaction, ai.sapper.hcdc.common.model.DFSTransaction.Builder, ai.sapper.hcdc.common.model.DFSTransactionOrBuilder>(
                getTransaction(),
                getParentForChildren(),
                isClean());
        transaction_ = null;
      }
      return transactionBuilder_;
    }

    private ai.sapper.hcdc.common.model.DFSFile file_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.sapper.hcdc.common.model.DFSFile, ai.sapper.hcdc.common.model.DFSFile.Builder, ai.sapper.hcdc.common.model.DFSFileOrBuilder> fileBuilder_;
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSFile file = 2;</code>
     * @return Whether the file field is set.
     */
    public boolean hasFile() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSFile file = 2;</code>
     * @return The file.
     */
    public ai.sapper.hcdc.common.model.DFSFile getFile() {
      if (fileBuilder_ == null) {
        return file_ == null ? ai.sapper.hcdc.common.model.DFSFile.getDefaultInstance() : file_;
      } else {
        return fileBuilder_.getMessage();
      }
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSFile file = 2;</code>
     */
    public Builder setFile(ai.sapper.hcdc.common.model.DFSFile value) {
      if (fileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        file_ = value;
        onChanged();
      } else {
        fileBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSFile file = 2;</code>
     */
    public Builder setFile(
        ai.sapper.hcdc.common.model.DFSFile.Builder builderForValue) {
      if (fileBuilder_ == null) {
        file_ = builderForValue.build();
        onChanged();
      } else {
        fileBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSFile file = 2;</code>
     */
    public Builder mergeFile(ai.sapper.hcdc.common.model.DFSFile value) {
      if (fileBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
            file_ != null &&
            file_ != ai.sapper.hcdc.common.model.DFSFile.getDefaultInstance()) {
          file_ =
            ai.sapper.hcdc.common.model.DFSFile.newBuilder(file_).mergeFrom(value).buildPartial();
        } else {
          file_ = value;
        }
        onChanged();
      } else {
        fileBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSFile file = 2;</code>
     */
    public Builder clearFile() {
      if (fileBuilder_ == null) {
        file_ = null;
        onChanged();
      } else {
        fileBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSFile file = 2;</code>
     */
    public ai.sapper.hcdc.common.model.DFSFile.Builder getFileBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getFileFieldBuilder().getBuilder();
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSFile file = 2;</code>
     */
    public ai.sapper.hcdc.common.model.DFSFileOrBuilder getFileOrBuilder() {
      if (fileBuilder_ != null) {
        return fileBuilder_.getMessageOrBuilder();
      } else {
        return file_ == null ?
            ai.sapper.hcdc.common.model.DFSFile.getDefaultInstance() : file_;
      }
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSFile file = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.sapper.hcdc.common.model.DFSFile, ai.sapper.hcdc.common.model.DFSFile.Builder, ai.sapper.hcdc.common.model.DFSFileOrBuilder> 
        getFileFieldBuilder() {
      if (fileBuilder_ == null) {
        fileBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.sapper.hcdc.common.model.DFSFile, ai.sapper.hcdc.common.model.DFSFile.Builder, ai.sapper.hcdc.common.model.DFSFileOrBuilder>(
                getFile(),
                getParentForChildren(),
                isClean());
        file_ = null;
      }
      return fileBuilder_;
    }

    private ai.sapper.hcdc.common.model.DFSBlock block_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.sapper.hcdc.common.model.DFSBlock, ai.sapper.hcdc.common.model.DFSBlock.Builder, ai.sapper.hcdc.common.model.DFSBlockOrBuilder> blockBuilder_;
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSBlock block = 3;</code>
     * @return Whether the block field is set.
     */
    public boolean hasBlock() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSBlock block = 3;</code>
     * @return The block.
     */
    public ai.sapper.hcdc.common.model.DFSBlock getBlock() {
      if (blockBuilder_ == null) {
        return block_ == null ? ai.sapper.hcdc.common.model.DFSBlock.getDefaultInstance() : block_;
      } else {
        return blockBuilder_.getMessage();
      }
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSBlock block = 3;</code>
     */
    public Builder setBlock(ai.sapper.hcdc.common.model.DFSBlock value) {
      if (blockBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        block_ = value;
        onChanged();
      } else {
        blockBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSBlock block = 3;</code>
     */
    public Builder setBlock(
        ai.sapper.hcdc.common.model.DFSBlock.Builder builderForValue) {
      if (blockBuilder_ == null) {
        block_ = builderForValue.build();
        onChanged();
      } else {
        blockBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSBlock block = 3;</code>
     */
    public Builder mergeBlock(ai.sapper.hcdc.common.model.DFSBlock value) {
      if (blockBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
            block_ != null &&
            block_ != ai.sapper.hcdc.common.model.DFSBlock.getDefaultInstance()) {
          block_ =
            ai.sapper.hcdc.common.model.DFSBlock.newBuilder(block_).mergeFrom(value).buildPartial();
        } else {
          block_ = value;
        }
        onChanged();
      } else {
        blockBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSBlock block = 3;</code>
     */
    public Builder clearBlock() {
      if (blockBuilder_ == null) {
        block_ = null;
        onChanged();
      } else {
        blockBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSBlock block = 3;</code>
     */
    public ai.sapper.hcdc.common.model.DFSBlock.Builder getBlockBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getBlockFieldBuilder().getBuilder();
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSBlock block = 3;</code>
     */
    public ai.sapper.hcdc.common.model.DFSBlockOrBuilder getBlockOrBuilder() {
      if (blockBuilder_ != null) {
        return blockBuilder_.getMessageOrBuilder();
      } else {
        return block_ == null ?
            ai.sapper.hcdc.common.model.DFSBlock.getDefaultInstance() : block_;
      }
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSBlock block = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.sapper.hcdc.common.model.DFSBlock, ai.sapper.hcdc.common.model.DFSBlock.Builder, ai.sapper.hcdc.common.model.DFSBlockOrBuilder> 
        getBlockFieldBuilder() {
      if (blockBuilder_ == null) {
        blockBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.sapper.hcdc.common.model.DFSBlock, ai.sapper.hcdc.common.model.DFSBlock.Builder, ai.sapper.hcdc.common.model.DFSBlockOrBuilder>(
                getBlock(),
                getParentForChildren(),
                isClean());
        block_ = null;
      }
      return blockBuilder_;
    }

    private long newLength_ ;
    /**
     * <code>required uint64 newLength = 4;</code>
     * @return Whether the newLength field is set.
     */
    @java.lang.Override
    public boolean hasNewLength() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>required uint64 newLength = 4;</code>
     * @return The newLength.
     */
    @java.lang.Override
    public long getNewLength() {
      return newLength_;
    }
    /**
     * <code>required uint64 newLength = 4;</code>
     * @param value The newLength to set.
     * @return This builder for chaining.
     */
    public Builder setNewLength(long value) {
      bitField0_ |= 0x00000008;
      newLength_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required uint64 newLength = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearNewLength() {
      bitField0_ = (bitField0_ & ~0x00000008);
      newLength_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:ai_sapper_hcdc_common_model.DFSBlockTruncate)
  }

  // @@protoc_insertion_point(class_scope:ai_sapper_hcdc_common_model.DFSBlockTruncate)
  private static final ai.sapper.hcdc.common.model.DFSBlockTruncate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.sapper.hcdc.common.model.DFSBlockTruncate();
  }

  public static ai.sapper.hcdc.common.model.DFSBlockTruncate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<DFSBlockTruncate>
      PARSER = new com.google.protobuf.AbstractParser<DFSBlockTruncate>() {
    @java.lang.Override
    public DFSBlockTruncate parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DFSBlockTruncate(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DFSBlockTruncate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DFSBlockTruncate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.sapper.hcdc.common.model.DFSBlockTruncate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
