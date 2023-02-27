// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_block.proto

package ai.sapper.hcdc.common.model;

/**
 * Protobuf type {@code ai_sapper_hcdc_common_model.DFSIgnoreTx}
 */
public final class DFSIgnoreTx extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ai_sapper_hcdc_common_model.DFSIgnoreTx)
    DFSIgnoreTxOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DFSIgnoreTx.newBuilder() to construct.
  private DFSIgnoreTx(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DFSIgnoreTx() {
    opCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DFSIgnoreTx();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DFSIgnoreTx(
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
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000002;
            opCode_ = bs;
            break;
          }
          case 26: {
            ai.sapper.hcdc.common.model.DFSFile.Builder subBuilder = null;
            if (((bitField0_ & 0x00000004) != 0)) {
              subBuilder = file_.toBuilder();
            }
            file_ = input.readMessage(ai.sapper.hcdc.common.model.DFSFile.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(file_);
              file_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000004;
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
    return ai.sapper.hcdc.common.model.DFSBlockProto.internal_static_ai_sapper_hcdc_common_model_DFSIgnoreTx_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.sapper.hcdc.common.model.DFSBlockProto.internal_static_ai_sapper_hcdc_common_model_DFSIgnoreTx_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.sapper.hcdc.common.model.DFSIgnoreTx.class, ai.sapper.hcdc.common.model.DFSIgnoreTx.Builder.class);
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

  public static final int OPCODE_FIELD_NUMBER = 2;
  private volatile java.lang.Object opCode_;
  /**
   * <code>required string opCode = 2;</code>
   * @return Whether the opCode field is set.
   */
  @java.lang.Override
  public boolean hasOpCode() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>required string opCode = 2;</code>
   * @return The opCode.
   */
  @java.lang.Override
  public java.lang.String getOpCode() {
    java.lang.Object ref = opCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        opCode_ = s;
      }
      return s;
    }
  }
  /**
   * <code>required string opCode = 2;</code>
   * @return The bytes for opCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOpCodeBytes() {
    java.lang.Object ref = opCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      opCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILE_FIELD_NUMBER = 3;
  private ai.sapper.hcdc.common.model.DFSFile file_;
  /**
   * <code>optional .ai_sapper_hcdc_common_model.DFSFile file = 3;</code>
   * @return Whether the file field is set.
   */
  @java.lang.Override
  public boolean hasFile() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional .ai_sapper_hcdc_common_model.DFSFile file = 3;</code>
   * @return The file.
   */
  @java.lang.Override
  public ai.sapper.hcdc.common.model.DFSFile getFile() {
    return file_ == null ? ai.sapper.hcdc.common.model.DFSFile.getDefaultInstance() : file_;
  }
  /**
   * <code>optional .ai_sapper_hcdc_common_model.DFSFile file = 3;</code>
   */
  @java.lang.Override
  public ai.sapper.hcdc.common.model.DFSFileOrBuilder getFileOrBuilder() {
    return file_ == null ? ai.sapper.hcdc.common.model.DFSFile.getDefaultInstance() : file_;
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
    if (!hasOpCode()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getTransaction().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (hasFile()) {
      if (!getFile().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, opCode_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(3, getFile());
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
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, opCode_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getFile());
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
    if (!(obj instanceof ai.sapper.hcdc.common.model.DFSIgnoreTx)) {
      return super.equals(obj);
    }
    ai.sapper.hcdc.common.model.DFSIgnoreTx other = (ai.sapper.hcdc.common.model.DFSIgnoreTx) obj;

    if (hasTransaction() != other.hasTransaction()) return false;
    if (hasTransaction()) {
      if (!getTransaction()
          .equals(other.getTransaction())) return false;
    }
    if (hasOpCode() != other.hasOpCode()) return false;
    if (hasOpCode()) {
      if (!getOpCode()
          .equals(other.getOpCode())) return false;
    }
    if (hasFile() != other.hasFile()) return false;
    if (hasFile()) {
      if (!getFile()
          .equals(other.getFile())) return false;
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
    if (hasOpCode()) {
      hash = (37 * hash) + OPCODE_FIELD_NUMBER;
      hash = (53 * hash) + getOpCode().hashCode();
    }
    if (hasFile()) {
      hash = (37 * hash) + FILE_FIELD_NUMBER;
      hash = (53 * hash) + getFile().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.sapper.hcdc.common.model.DFSIgnoreTx parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sapper.hcdc.common.model.DFSIgnoreTx parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sapper.hcdc.common.model.DFSIgnoreTx parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sapper.hcdc.common.model.DFSIgnoreTx parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sapper.hcdc.common.model.DFSIgnoreTx parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sapper.hcdc.common.model.DFSIgnoreTx parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sapper.hcdc.common.model.DFSIgnoreTx parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sapper.hcdc.common.model.DFSIgnoreTx parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sapper.hcdc.common.model.DFSIgnoreTx parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.sapper.hcdc.common.model.DFSIgnoreTx parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sapper.hcdc.common.model.DFSIgnoreTx parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sapper.hcdc.common.model.DFSIgnoreTx parseFrom(
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
  public static Builder newBuilder(ai.sapper.hcdc.common.model.DFSIgnoreTx prototype) {
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
   * Protobuf type {@code ai_sapper_hcdc_common_model.DFSIgnoreTx}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ai_sapper_hcdc_common_model.DFSIgnoreTx)
      ai.sapper.hcdc.common.model.DFSIgnoreTxOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.sapper.hcdc.common.model.DFSBlockProto.internal_static_ai_sapper_hcdc_common_model_DFSIgnoreTx_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.sapper.hcdc.common.model.DFSBlockProto.internal_static_ai_sapper_hcdc_common_model_DFSIgnoreTx_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.sapper.hcdc.common.model.DFSIgnoreTx.class, ai.sapper.hcdc.common.model.DFSIgnoreTx.Builder.class);
    }

    // Construct using ai.sapper.hcdc.common.model.DFSIgnoreTx.newBuilder()
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
      opCode_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      if (fileBuilder_ == null) {
        file_ = null;
      } else {
        fileBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.sapper.hcdc.common.model.DFSBlockProto.internal_static_ai_sapper_hcdc_common_model_DFSIgnoreTx_descriptor;
    }

    @java.lang.Override
    public ai.sapper.hcdc.common.model.DFSIgnoreTx getDefaultInstanceForType() {
      return ai.sapper.hcdc.common.model.DFSIgnoreTx.getDefaultInstance();
    }

    @java.lang.Override
    public ai.sapper.hcdc.common.model.DFSIgnoreTx build() {
      ai.sapper.hcdc.common.model.DFSIgnoreTx result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.sapper.hcdc.common.model.DFSIgnoreTx buildPartial() {
      ai.sapper.hcdc.common.model.DFSIgnoreTx result = new ai.sapper.hcdc.common.model.DFSIgnoreTx(this);
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
        to_bitField0_ |= 0x00000002;
      }
      result.opCode_ = opCode_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        if (fileBuilder_ == null) {
          result.file_ = file_;
        } else {
          result.file_ = fileBuilder_.build();
        }
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof ai.sapper.hcdc.common.model.DFSIgnoreTx) {
        return mergeFrom((ai.sapper.hcdc.common.model.DFSIgnoreTx)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.sapper.hcdc.common.model.DFSIgnoreTx other) {
      if (other == ai.sapper.hcdc.common.model.DFSIgnoreTx.getDefaultInstance()) return this;
      if (other.hasTransaction()) {
        mergeTransaction(other.getTransaction());
      }
      if (other.hasOpCode()) {
        bitField0_ |= 0x00000002;
        opCode_ = other.opCode_;
        onChanged();
      }
      if (other.hasFile()) {
        mergeFile(other.getFile());
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
      if (!hasOpCode()) {
        return false;
      }
      if (!getTransaction().isInitialized()) {
        return false;
      }
      if (hasFile()) {
        if (!getFile().isInitialized()) {
          return false;
        }
      }
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ai.sapper.hcdc.common.model.DFSIgnoreTx parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.sapper.hcdc.common.model.DFSIgnoreTx) e.getUnfinishedMessage();
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

    private java.lang.Object opCode_ = "";
    /**
     * <code>required string opCode = 2;</code>
     * @return Whether the opCode field is set.
     */
    public boolean hasOpCode() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required string opCode = 2;</code>
     * @return The opCode.
     */
    public java.lang.String getOpCode() {
      java.lang.Object ref = opCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          opCode_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>required string opCode = 2;</code>
     * @return The bytes for opCode.
     */
    public com.google.protobuf.ByteString
        getOpCodeBytes() {
      java.lang.Object ref = opCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        opCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>required string opCode = 2;</code>
     * @param value The opCode to set.
     * @return This builder for chaining.
     */
    public Builder setOpCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      opCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required string opCode = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOpCode() {
      bitField0_ = (bitField0_ & ~0x00000002);
      opCode_ = getDefaultInstance().getOpCode();
      onChanged();
      return this;
    }
    /**
     * <code>required string opCode = 2;</code>
     * @param value The bytes for opCode to set.
     * @return This builder for chaining.
     */
    public Builder setOpCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      opCode_ = value;
      onChanged();
      return this;
    }

    private ai.sapper.hcdc.common.model.DFSFile file_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.sapper.hcdc.common.model.DFSFile, ai.sapper.hcdc.common.model.DFSFile.Builder, ai.sapper.hcdc.common.model.DFSFileOrBuilder> fileBuilder_;
    /**
     * <code>optional .ai_sapper_hcdc_common_model.DFSFile file = 3;</code>
     * @return Whether the file field is set.
     */
    public boolean hasFile() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional .ai_sapper_hcdc_common_model.DFSFile file = 3;</code>
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
     * <code>optional .ai_sapper_hcdc_common_model.DFSFile file = 3;</code>
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
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .ai_sapper_hcdc_common_model.DFSFile file = 3;</code>
     */
    public Builder setFile(
        ai.sapper.hcdc.common.model.DFSFile.Builder builderForValue) {
      if (fileBuilder_ == null) {
        file_ = builderForValue.build();
        onChanged();
      } else {
        fileBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .ai_sapper_hcdc_common_model.DFSFile file = 3;</code>
     */
    public Builder mergeFile(ai.sapper.hcdc.common.model.DFSFile value) {
      if (fileBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
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
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .ai_sapper_hcdc_common_model.DFSFile file = 3;</code>
     */
    public Builder clearFile() {
      if (fileBuilder_ == null) {
        file_ = null;
        onChanged();
      } else {
        fileBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }
    /**
     * <code>optional .ai_sapper_hcdc_common_model.DFSFile file = 3;</code>
     */
    public ai.sapper.hcdc.common.model.DFSFile.Builder getFileBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getFileFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .ai_sapper_hcdc_common_model.DFSFile file = 3;</code>
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
     * <code>optional .ai_sapper_hcdc_common_model.DFSFile file = 3;</code>
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


    // @@protoc_insertion_point(builder_scope:ai_sapper_hcdc_common_model.DFSIgnoreTx)
  }

  // @@protoc_insertion_point(class_scope:ai_sapper_hcdc_common_model.DFSIgnoreTx)
  private static final ai.sapper.hcdc.common.model.DFSIgnoreTx DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.sapper.hcdc.common.model.DFSIgnoreTx();
  }

  public static ai.sapper.hcdc.common.model.DFSIgnoreTx getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<DFSIgnoreTx>
      PARSER = new com.google.protobuf.AbstractParser<DFSIgnoreTx>() {
    @java.lang.Override
    public DFSIgnoreTx parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DFSIgnoreTx(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DFSIgnoreTx> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DFSIgnoreTx> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.sapper.hcdc.common.model.DFSIgnoreTx getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

