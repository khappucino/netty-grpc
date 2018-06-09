// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apikey.proto

package com.nordstrom.gtm.apikey;

/**
 * Protobuf type {@code apikey.ApiKeyList}
 */
public  final class ApiKeyList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:apikey.ApiKeyList)
    ApiKeyListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ApiKeyList.newBuilder() to construct.
  private ApiKeyList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ApiKeyList() {
    key_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ApiKeyList(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              key_ = new java.util.ArrayList<com.nordstrom.gtm.apikey.ApiKey>();
              mutable_bitField0_ |= 0x00000001;
            }
            key_.add(
                input.readMessage(com.nordstrom.gtm.apikey.ApiKey.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        key_ = java.util.Collections.unmodifiableList(key_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.nordstrom.gtm.apikey.ApiKeyProto.internal_static_apikey_ApiKeyList_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.nordstrom.gtm.apikey.ApiKeyProto.internal_static_apikey_ApiKeyList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.nordstrom.gtm.apikey.ApiKeyList.class, com.nordstrom.gtm.apikey.ApiKeyList.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private java.util.List<com.nordstrom.gtm.apikey.ApiKey> key_;
  /**
   * <code>repeated .apikey.ApiKey key = 1;</code>
   */
  public java.util.List<com.nordstrom.gtm.apikey.ApiKey> getKeyList() {
    return key_;
  }
  /**
   * <code>repeated .apikey.ApiKey key = 1;</code>
   */
  public java.util.List<? extends com.nordstrom.gtm.apikey.ApiKeyOrBuilder> 
      getKeyOrBuilderList() {
    return key_;
  }
  /**
   * <code>repeated .apikey.ApiKey key = 1;</code>
   */
  public int getKeyCount() {
    return key_.size();
  }
  /**
   * <code>repeated .apikey.ApiKey key = 1;</code>
   */
  public com.nordstrom.gtm.apikey.ApiKey getKey(int index) {
    return key_.get(index);
  }
  /**
   * <code>repeated .apikey.ApiKey key = 1;</code>
   */
  public com.nordstrom.gtm.apikey.ApiKeyOrBuilder getKeyOrBuilder(
      int index) {
    return key_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < key_.size(); i++) {
      output.writeMessage(1, key_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < key_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, key_.get(i));
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
    if (!(obj instanceof com.nordstrom.gtm.apikey.ApiKeyList)) {
      return super.equals(obj);
    }
    com.nordstrom.gtm.apikey.ApiKeyList other = (com.nordstrom.gtm.apikey.ApiKeyList) obj;

    boolean result = true;
    result = result && getKeyList()
        .equals(other.getKeyList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getKeyCount() > 0) {
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKeyList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.nordstrom.gtm.apikey.ApiKeyList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nordstrom.gtm.apikey.ApiKeyList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nordstrom.gtm.apikey.ApiKeyList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nordstrom.gtm.apikey.ApiKeyList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nordstrom.gtm.apikey.ApiKeyList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nordstrom.gtm.apikey.ApiKeyList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nordstrom.gtm.apikey.ApiKeyList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.nordstrom.gtm.apikey.ApiKeyList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.nordstrom.gtm.apikey.ApiKeyList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.nordstrom.gtm.apikey.ApiKeyList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.nordstrom.gtm.apikey.ApiKeyList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.nordstrom.gtm.apikey.ApiKeyList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.nordstrom.gtm.apikey.ApiKeyList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code apikey.ApiKeyList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:apikey.ApiKeyList)
      com.nordstrom.gtm.apikey.ApiKeyListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.nordstrom.gtm.apikey.ApiKeyProto.internal_static_apikey_ApiKeyList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.nordstrom.gtm.apikey.ApiKeyProto.internal_static_apikey_ApiKeyList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.nordstrom.gtm.apikey.ApiKeyList.class, com.nordstrom.gtm.apikey.ApiKeyList.Builder.class);
    }

    // Construct using com.nordstrom.gtm.apikey.ApiKeyList.newBuilder()
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
        getKeyFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (keyBuilder_ == null) {
        key_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        keyBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.nordstrom.gtm.apikey.ApiKeyProto.internal_static_apikey_ApiKeyList_descriptor;
    }

    public com.nordstrom.gtm.apikey.ApiKeyList getDefaultInstanceForType() {
      return com.nordstrom.gtm.apikey.ApiKeyList.getDefaultInstance();
    }

    public com.nordstrom.gtm.apikey.ApiKeyList build() {
      com.nordstrom.gtm.apikey.ApiKeyList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.nordstrom.gtm.apikey.ApiKeyList buildPartial() {
      com.nordstrom.gtm.apikey.ApiKeyList result = new com.nordstrom.gtm.apikey.ApiKeyList(this);
      int from_bitField0_ = bitField0_;
      if (keyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          key_ = java.util.Collections.unmodifiableList(key_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.key_ = key_;
      } else {
        result.key_ = keyBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.nordstrom.gtm.apikey.ApiKeyList) {
        return mergeFrom((com.nordstrom.gtm.apikey.ApiKeyList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.nordstrom.gtm.apikey.ApiKeyList other) {
      if (other == com.nordstrom.gtm.apikey.ApiKeyList.getDefaultInstance()) return this;
      if (keyBuilder_ == null) {
        if (!other.key_.isEmpty()) {
          if (key_.isEmpty()) {
            key_ = other.key_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureKeyIsMutable();
            key_.addAll(other.key_);
          }
          onChanged();
        }
      } else {
        if (!other.key_.isEmpty()) {
          if (keyBuilder_.isEmpty()) {
            keyBuilder_.dispose();
            keyBuilder_ = null;
            key_ = other.key_;
            bitField0_ = (bitField0_ & ~0x00000001);
            keyBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getKeyFieldBuilder() : null;
          } else {
            keyBuilder_.addAllMessages(other.key_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.nordstrom.gtm.apikey.ApiKeyList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.nordstrom.gtm.apikey.ApiKeyList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.nordstrom.gtm.apikey.ApiKey> key_ =
      java.util.Collections.emptyList();
    private void ensureKeyIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        key_ = new java.util.ArrayList<com.nordstrom.gtm.apikey.ApiKey>(key_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.nordstrom.gtm.apikey.ApiKey, com.nordstrom.gtm.apikey.ApiKey.Builder, com.nordstrom.gtm.apikey.ApiKeyOrBuilder> keyBuilder_;

    /**
     * <code>repeated .apikey.ApiKey key = 1;</code>
     */
    public java.util.List<com.nordstrom.gtm.apikey.ApiKey> getKeyList() {
      if (keyBuilder_ == null) {
        return java.util.Collections.unmodifiableList(key_);
      } else {
        return keyBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .apikey.ApiKey key = 1;</code>
     */
    public int getKeyCount() {
      if (keyBuilder_ == null) {
        return key_.size();
      } else {
        return keyBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .apikey.ApiKey key = 1;</code>
     */
    public com.nordstrom.gtm.apikey.ApiKey getKey(int index) {
      if (keyBuilder_ == null) {
        return key_.get(index);
      } else {
        return keyBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .apikey.ApiKey key = 1;</code>
     */
    public Builder setKey(
        int index, com.nordstrom.gtm.apikey.ApiKey value) {
      if (keyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeyIsMutable();
        key_.set(index, value);
        onChanged();
      } else {
        keyBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .apikey.ApiKey key = 1;</code>
     */
    public Builder setKey(
        int index, com.nordstrom.gtm.apikey.ApiKey.Builder builderForValue) {
      if (keyBuilder_ == null) {
        ensureKeyIsMutable();
        key_.set(index, builderForValue.build());
        onChanged();
      } else {
        keyBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .apikey.ApiKey key = 1;</code>
     */
    public Builder addKey(com.nordstrom.gtm.apikey.ApiKey value) {
      if (keyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeyIsMutable();
        key_.add(value);
        onChanged();
      } else {
        keyBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .apikey.ApiKey key = 1;</code>
     */
    public Builder addKey(
        int index, com.nordstrom.gtm.apikey.ApiKey value) {
      if (keyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeyIsMutable();
        key_.add(index, value);
        onChanged();
      } else {
        keyBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .apikey.ApiKey key = 1;</code>
     */
    public Builder addKey(
        com.nordstrom.gtm.apikey.ApiKey.Builder builderForValue) {
      if (keyBuilder_ == null) {
        ensureKeyIsMutable();
        key_.add(builderForValue.build());
        onChanged();
      } else {
        keyBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .apikey.ApiKey key = 1;</code>
     */
    public Builder addKey(
        int index, com.nordstrom.gtm.apikey.ApiKey.Builder builderForValue) {
      if (keyBuilder_ == null) {
        ensureKeyIsMutable();
        key_.add(index, builderForValue.build());
        onChanged();
      } else {
        keyBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .apikey.ApiKey key = 1;</code>
     */
    public Builder addAllKey(
        java.lang.Iterable<? extends com.nordstrom.gtm.apikey.ApiKey> values) {
      if (keyBuilder_ == null) {
        ensureKeyIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, key_);
        onChanged();
      } else {
        keyBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .apikey.ApiKey key = 1;</code>
     */
    public Builder clearKey() {
      if (keyBuilder_ == null) {
        key_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        keyBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .apikey.ApiKey key = 1;</code>
     */
    public Builder removeKey(int index) {
      if (keyBuilder_ == null) {
        ensureKeyIsMutable();
        key_.remove(index);
        onChanged();
      } else {
        keyBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .apikey.ApiKey key = 1;</code>
     */
    public com.nordstrom.gtm.apikey.ApiKey.Builder getKeyBuilder(
        int index) {
      return getKeyFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .apikey.ApiKey key = 1;</code>
     */
    public com.nordstrom.gtm.apikey.ApiKeyOrBuilder getKeyOrBuilder(
        int index) {
      if (keyBuilder_ == null) {
        return key_.get(index);  } else {
        return keyBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .apikey.ApiKey key = 1;</code>
     */
    public java.util.List<? extends com.nordstrom.gtm.apikey.ApiKeyOrBuilder> 
         getKeyOrBuilderList() {
      if (keyBuilder_ != null) {
        return keyBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(key_);
      }
    }
    /**
     * <code>repeated .apikey.ApiKey key = 1;</code>
     */
    public com.nordstrom.gtm.apikey.ApiKey.Builder addKeyBuilder() {
      return getKeyFieldBuilder().addBuilder(
          com.nordstrom.gtm.apikey.ApiKey.getDefaultInstance());
    }
    /**
     * <code>repeated .apikey.ApiKey key = 1;</code>
     */
    public com.nordstrom.gtm.apikey.ApiKey.Builder addKeyBuilder(
        int index) {
      return getKeyFieldBuilder().addBuilder(
          index, com.nordstrom.gtm.apikey.ApiKey.getDefaultInstance());
    }
    /**
     * <code>repeated .apikey.ApiKey key = 1;</code>
     */
    public java.util.List<com.nordstrom.gtm.apikey.ApiKey.Builder> 
         getKeyBuilderList() {
      return getKeyFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.nordstrom.gtm.apikey.ApiKey, com.nordstrom.gtm.apikey.ApiKey.Builder, com.nordstrom.gtm.apikey.ApiKeyOrBuilder> 
        getKeyFieldBuilder() {
      if (keyBuilder_ == null) {
        keyBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.nordstrom.gtm.apikey.ApiKey, com.nordstrom.gtm.apikey.ApiKey.Builder, com.nordstrom.gtm.apikey.ApiKeyOrBuilder>(
                key_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        key_ = null;
      }
      return keyBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:apikey.ApiKeyList)
  }

  // @@protoc_insertion_point(class_scope:apikey.ApiKeyList)
  private static final com.nordstrom.gtm.apikey.ApiKeyList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.nordstrom.gtm.apikey.ApiKeyList();
  }

  public static com.nordstrom.gtm.apikey.ApiKeyList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApiKeyList>
      PARSER = new com.google.protobuf.AbstractParser<ApiKeyList>() {
    public ApiKeyList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ApiKeyList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ApiKeyList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApiKeyList> getParserForType() {
    return PARSER;
  }

  public com.nordstrom.gtm.apikey.ApiKeyList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

