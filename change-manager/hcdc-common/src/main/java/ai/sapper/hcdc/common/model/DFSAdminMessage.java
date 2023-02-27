// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_block.proto

package ai.sapper.hcdc.common.model;

/**
 * Protobuf type {@code ai_sapper_hcdc_common_model.DFSAdminMessage}
 */
public final class DFSAdminMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ai_sapper_hcdc_common_model.DFSAdminMessage)
    DFSAdminMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DFSAdminMessage.newBuilder() to construct.
  private DFSAdminMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DFSAdminMessage() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DFSAdminMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DFSAdminMessage(
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
            int rawValue = input.readEnum();
              @SuppressWarnings("deprecation")
            ai.sapper.hcdc.common.model.DFSAdminMessage.AdminMessageType value = ai.sapper.hcdc.common.model.DFSAdminMessage.AdminMessageType.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(1, rawValue);
            } else {
              bitField0_ |= 0x00000001;
              type_ = rawValue;
            }
            break;
          }
          case 18: {
            ai.sapper.hcdc.common.model.DFSSchemaEntity.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) != 0)) {
              subBuilder = entity_.toBuilder();
            }
            entity_ = input.readMessage(ai.sapper.hcdc.common.model.DFSSchemaEntity.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(entity_);
              entity_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
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
    return ai.sapper.hcdc.common.model.DFSBlockProto.internal_static_ai_sapper_hcdc_common_model_DFSAdminMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.sapper.hcdc.common.model.DFSBlockProto.internal_static_ai_sapper_hcdc_common_model_DFSAdminMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.sapper.hcdc.common.model.DFSAdminMessage.class, ai.sapper.hcdc.common.model.DFSAdminMessage.Builder.class);
  }

  /**
   * Protobuf enum {@code ai_sapper_hcdc_common_model.DFSAdminMessage.AdminMessageType}
   */
  public enum AdminMessageType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PAUSE = 0;</code>
     */
    PAUSE(0),
    /**
     * <code>RESUME = 1;</code>
     */
    RESUME(1),
    /**
     * <code>DELETE = 2;</code>
     */
    DELETE(2),
    ;

    /**
     * <code>PAUSE = 0;</code>
     */
    public static final int PAUSE_VALUE = 0;
    /**
     * <code>RESUME = 1;</code>
     */
    public static final int RESUME_VALUE = 1;
    /**
     * <code>DELETE = 2;</code>
     */
    public static final int DELETE_VALUE = 2;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AdminMessageType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AdminMessageType forNumber(int value) {
      switch (value) {
        case 0: return PAUSE;
        case 1: return RESUME;
        case 2: return DELETE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AdminMessageType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AdminMessageType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AdminMessageType>() {
            public AdminMessageType findValueByNumber(int number) {
              return AdminMessageType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return ai.sapper.hcdc.common.model.DFSAdminMessage.getDescriptor().getEnumTypes().get(0);
    }

    private static final AdminMessageType[] VALUES = values();

    public static AdminMessageType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AdminMessageType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ai_sapper_hcdc_common_model.DFSAdminMessage.AdminMessageType)
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>required .ai_sapper_hcdc_common_model.DFSAdminMessage.AdminMessageType type = 1;</code>
   * @return Whether the type field is set.
   */
  @java.lang.Override public boolean hasType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>required .ai_sapper_hcdc_common_model.DFSAdminMessage.AdminMessageType type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public ai.sapper.hcdc.common.model.DFSAdminMessage.AdminMessageType getType() {
    @SuppressWarnings("deprecation")
    ai.sapper.hcdc.common.model.DFSAdminMessage.AdminMessageType result = ai.sapper.hcdc.common.model.DFSAdminMessage.AdminMessageType.valueOf(type_);
    return result == null ? ai.sapper.hcdc.common.model.DFSAdminMessage.AdminMessageType.PAUSE : result;
  }

  public static final int ENTITY_FIELD_NUMBER = 2;
  private ai.sapper.hcdc.common.model.DFSSchemaEntity entity_;
  /**
   * <code>required .ai_sapper_hcdc_common_model.DFSSchemaEntity entity = 2;</code>
   * @return Whether the entity field is set.
   */
  @java.lang.Override
  public boolean hasEntity() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>required .ai_sapper_hcdc_common_model.DFSSchemaEntity entity = 2;</code>
   * @return The entity.
   */
  @java.lang.Override
  public ai.sapper.hcdc.common.model.DFSSchemaEntity getEntity() {
    return entity_ == null ? ai.sapper.hcdc.common.model.DFSSchemaEntity.getDefaultInstance() : entity_;
  }
  /**
   * <code>required .ai_sapper_hcdc_common_model.DFSSchemaEntity entity = 2;</code>
   */
  @java.lang.Override
  public ai.sapper.hcdc.common.model.DFSSchemaEntityOrBuilder getEntityOrBuilder() {
    return entity_ == null ? ai.sapper.hcdc.common.model.DFSSchemaEntity.getDefaultInstance() : entity_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasType()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasEntity()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getEntity().isInitialized()) {
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
      output.writeEnum(1, type_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getEntity());
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
        .computeEnumSize(1, type_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEntity());
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
    if (!(obj instanceof ai.sapper.hcdc.common.model.DFSAdminMessage)) {
      return super.equals(obj);
    }
    ai.sapper.hcdc.common.model.DFSAdminMessage other = (ai.sapper.hcdc.common.model.DFSAdminMessage) obj;

    if (hasType() != other.hasType()) return false;
    if (hasType()) {
      if (type_ != other.type_) return false;
    }
    if (hasEntity() != other.hasEntity()) return false;
    if (hasEntity()) {
      if (!getEntity()
          .equals(other.getEntity())) return false;
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
    if (hasType()) {
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
    }
    if (hasEntity()) {
      hash = (37 * hash) + ENTITY_FIELD_NUMBER;
      hash = (53 * hash) + getEntity().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.sapper.hcdc.common.model.DFSAdminMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sapper.hcdc.common.model.DFSAdminMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sapper.hcdc.common.model.DFSAdminMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sapper.hcdc.common.model.DFSAdminMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sapper.hcdc.common.model.DFSAdminMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sapper.hcdc.common.model.DFSAdminMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sapper.hcdc.common.model.DFSAdminMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sapper.hcdc.common.model.DFSAdminMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sapper.hcdc.common.model.DFSAdminMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.sapper.hcdc.common.model.DFSAdminMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sapper.hcdc.common.model.DFSAdminMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sapper.hcdc.common.model.DFSAdminMessage parseFrom(
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
  public static Builder newBuilder(ai.sapper.hcdc.common.model.DFSAdminMessage prototype) {
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
   * Protobuf type {@code ai_sapper_hcdc_common_model.DFSAdminMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ai_sapper_hcdc_common_model.DFSAdminMessage)
      ai.sapper.hcdc.common.model.DFSAdminMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.sapper.hcdc.common.model.DFSBlockProto.internal_static_ai_sapper_hcdc_common_model_DFSAdminMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.sapper.hcdc.common.model.DFSBlockProto.internal_static_ai_sapper_hcdc_common_model_DFSAdminMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.sapper.hcdc.common.model.DFSAdminMessage.class, ai.sapper.hcdc.common.model.DFSAdminMessage.Builder.class);
    }

    // Construct using ai.sapper.hcdc.common.model.DFSAdminMessage.newBuilder()
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
        getEntityFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (entityBuilder_ == null) {
        entity_ = null;
      } else {
        entityBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.sapper.hcdc.common.model.DFSBlockProto.internal_static_ai_sapper_hcdc_common_model_DFSAdminMessage_descriptor;
    }

    @java.lang.Override
    public ai.sapper.hcdc.common.model.DFSAdminMessage getDefaultInstanceForType() {
      return ai.sapper.hcdc.common.model.DFSAdminMessage.getDefaultInstance();
    }

    @java.lang.Override
    public ai.sapper.hcdc.common.model.DFSAdminMessage build() {
      ai.sapper.hcdc.common.model.DFSAdminMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.sapper.hcdc.common.model.DFSAdminMessage buildPartial() {
      ai.sapper.hcdc.common.model.DFSAdminMessage result = new ai.sapper.hcdc.common.model.DFSAdminMessage(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.type_ = type_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        if (entityBuilder_ == null) {
          result.entity_ = entity_;
        } else {
          result.entity_ = entityBuilder_.build();
        }
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof ai.sapper.hcdc.common.model.DFSAdminMessage) {
        return mergeFrom((ai.sapper.hcdc.common.model.DFSAdminMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.sapper.hcdc.common.model.DFSAdminMessage other) {
      if (other == ai.sapper.hcdc.common.model.DFSAdminMessage.getDefaultInstance()) return this;
      if (other.hasType()) {
        setType(other.getType());
      }
      if (other.hasEntity()) {
        mergeEntity(other.getEntity());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      if (!hasType()) {
        return false;
      }
      if (!hasEntity()) {
        return false;
      }
      if (!getEntity().isInitialized()) {
        return false;
      }
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ai.sapper.hcdc.common.model.DFSAdminMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.sapper.hcdc.common.model.DFSAdminMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int type_ = 0;
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSAdminMessage.AdminMessageType type = 1;</code>
     * @return Whether the type field is set.
     */
    @java.lang.Override public boolean hasType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSAdminMessage.AdminMessageType type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public ai.sapper.hcdc.common.model.DFSAdminMessage.AdminMessageType getType() {
      @SuppressWarnings("deprecation")
      ai.sapper.hcdc.common.model.DFSAdminMessage.AdminMessageType result = ai.sapper.hcdc.common.model.DFSAdminMessage.AdminMessageType.valueOf(type_);
      return result == null ? ai.sapper.hcdc.common.model.DFSAdminMessage.AdminMessageType.PAUSE : result;
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSAdminMessage.AdminMessageType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(ai.sapper.hcdc.common.model.DFSAdminMessage.AdminMessageType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSAdminMessage.AdminMessageType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private ai.sapper.hcdc.common.model.DFSSchemaEntity entity_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.sapper.hcdc.common.model.DFSSchemaEntity, ai.sapper.hcdc.common.model.DFSSchemaEntity.Builder, ai.sapper.hcdc.common.model.DFSSchemaEntityOrBuilder> entityBuilder_;
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSSchemaEntity entity = 2;</code>
     * @return Whether the entity field is set.
     */
    public boolean hasEntity() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSSchemaEntity entity = 2;</code>
     * @return The entity.
     */
    public ai.sapper.hcdc.common.model.DFSSchemaEntity getEntity() {
      if (entityBuilder_ == null) {
        return entity_ == null ? ai.sapper.hcdc.common.model.DFSSchemaEntity.getDefaultInstance() : entity_;
      } else {
        return entityBuilder_.getMessage();
      }
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSSchemaEntity entity = 2;</code>
     */
    public Builder setEntity(ai.sapper.hcdc.common.model.DFSSchemaEntity value) {
      if (entityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entity_ = value;
        onChanged();
      } else {
        entityBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSSchemaEntity entity = 2;</code>
     */
    public Builder setEntity(
        ai.sapper.hcdc.common.model.DFSSchemaEntity.Builder builderForValue) {
      if (entityBuilder_ == null) {
        entity_ = builderForValue.build();
        onChanged();
      } else {
        entityBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSSchemaEntity entity = 2;</code>
     */
    public Builder mergeEntity(ai.sapper.hcdc.common.model.DFSSchemaEntity value) {
      if (entityBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
            entity_ != null &&
            entity_ != ai.sapper.hcdc.common.model.DFSSchemaEntity.getDefaultInstance()) {
          entity_ =
            ai.sapper.hcdc.common.model.DFSSchemaEntity.newBuilder(entity_).mergeFrom(value).buildPartial();
        } else {
          entity_ = value;
        }
        onChanged();
      } else {
        entityBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSSchemaEntity entity = 2;</code>
     */
    public Builder clearEntity() {
      if (entityBuilder_ == null) {
        entity_ = null;
        onChanged();
      } else {
        entityBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSSchemaEntity entity = 2;</code>
     */
    public ai.sapper.hcdc.common.model.DFSSchemaEntity.Builder getEntityBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEntityFieldBuilder().getBuilder();
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSSchemaEntity entity = 2;</code>
     */
    public ai.sapper.hcdc.common.model.DFSSchemaEntityOrBuilder getEntityOrBuilder() {
      if (entityBuilder_ != null) {
        return entityBuilder_.getMessageOrBuilder();
      } else {
        return entity_ == null ?
            ai.sapper.hcdc.common.model.DFSSchemaEntity.getDefaultInstance() : entity_;
      }
    }
    /**
     * <code>required .ai_sapper_hcdc_common_model.DFSSchemaEntity entity = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.sapper.hcdc.common.model.DFSSchemaEntity, ai.sapper.hcdc.common.model.DFSSchemaEntity.Builder, ai.sapper.hcdc.common.model.DFSSchemaEntityOrBuilder> 
        getEntityFieldBuilder() {
      if (entityBuilder_ == null) {
        entityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.sapper.hcdc.common.model.DFSSchemaEntity, ai.sapper.hcdc.common.model.DFSSchemaEntity.Builder, ai.sapper.hcdc.common.model.DFSSchemaEntityOrBuilder>(
                getEntity(),
                getParentForChildren(),
                isClean());
        entity_ = null;
      }
      return entityBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ai_sapper_hcdc_common_model.DFSAdminMessage)
  }

  // @@protoc_insertion_point(class_scope:ai_sapper_hcdc_common_model.DFSAdminMessage)
  private static final ai.sapper.hcdc.common.model.DFSAdminMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.sapper.hcdc.common.model.DFSAdminMessage();
  }

  public static ai.sapper.hcdc.common.model.DFSAdminMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<DFSAdminMessage>
      PARSER = new com.google.protobuf.AbstractParser<DFSAdminMessage>() {
    @java.lang.Override
    public DFSAdminMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DFSAdminMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DFSAdminMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DFSAdminMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.sapper.hcdc.common.model.DFSAdminMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

