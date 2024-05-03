// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aaiextraction/service/imagePreprocessingService.proto

package processdiscovery;

/**
 * Protobuf type {@code processdiscovery.ImagePreprocessingEngineRequest}
 */
public final class ImagePreprocessingEngineRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:processdiscovery.ImagePreprocessingEngineRequest)
    ImagePreprocessingEngineRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImagePreprocessingEngineRequest.newBuilder() to construct.
  private ImagePreprocessingEngineRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImagePreprocessingEngineRequest() {
    filepath_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ImagePreprocessingEngineRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ImagePreprocessingEngineRequest(
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
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              filepath_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            filepath_.add(s);
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        filepath_ = filepath_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return processdiscovery.ImagePreprocessingServiceOuterClass.internal_static_processdiscovery_ImagePreprocessingEngineRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return processdiscovery.ImagePreprocessingServiceOuterClass.internal_static_processdiscovery_ImagePreprocessingEngineRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            processdiscovery.ImagePreprocessingEngineRequest.class, processdiscovery.ImagePreprocessingEngineRequest.Builder.class);
  }

  public static final int FILEPATH_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList filepath_;
  /**
   * <code>repeated string filepath = 1;</code>
   * @return A list containing the filepath.
   */
  public com.google.protobuf.ProtocolStringList
      getFilepathList() {
    return filepath_;
  }
  /**
   * <code>repeated string filepath = 1;</code>
   * @return The count of filepath.
   */
  public int getFilepathCount() {
    return filepath_.size();
  }
  /**
   * <code>repeated string filepath = 1;</code>
   * @param index The index of the element to return.
   * @return The filepath at the given index.
   */
  public java.lang.String getFilepath(int index) {
    return filepath_.get(index);
  }
  /**
   * <code>repeated string filepath = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the filepath at the given index.
   */
  public com.google.protobuf.ByteString
      getFilepathBytes(int index) {
    return filepath_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < filepath_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, filepath_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < filepath_.size(); i++) {
        dataSize += computeStringSizeNoTag(filepath_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getFilepathList().size();
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
    if (!(obj instanceof processdiscovery.ImagePreprocessingEngineRequest)) {
      return super.equals(obj);
    }
    processdiscovery.ImagePreprocessingEngineRequest other = (processdiscovery.ImagePreprocessingEngineRequest) obj;

    if (!getFilepathList()
        .equals(other.getFilepathList())) return false;
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
    if (getFilepathCount() > 0) {
      hash = (37 * hash) + FILEPATH_FIELD_NUMBER;
      hash = (53 * hash) + getFilepathList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static processdiscovery.ImagePreprocessingEngineRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static processdiscovery.ImagePreprocessingEngineRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static processdiscovery.ImagePreprocessingEngineRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static processdiscovery.ImagePreprocessingEngineRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static processdiscovery.ImagePreprocessingEngineRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static processdiscovery.ImagePreprocessingEngineRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static processdiscovery.ImagePreprocessingEngineRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static processdiscovery.ImagePreprocessingEngineRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static processdiscovery.ImagePreprocessingEngineRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static processdiscovery.ImagePreprocessingEngineRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static processdiscovery.ImagePreprocessingEngineRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static processdiscovery.ImagePreprocessingEngineRequest parseFrom(
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
  public static Builder newBuilder(processdiscovery.ImagePreprocessingEngineRequest prototype) {
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
   * Protobuf type {@code processdiscovery.ImagePreprocessingEngineRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:processdiscovery.ImagePreprocessingEngineRequest)
      processdiscovery.ImagePreprocessingEngineRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return processdiscovery.ImagePreprocessingServiceOuterClass.internal_static_processdiscovery_ImagePreprocessingEngineRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return processdiscovery.ImagePreprocessingServiceOuterClass.internal_static_processdiscovery_ImagePreprocessingEngineRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              processdiscovery.ImagePreprocessingEngineRequest.class, processdiscovery.ImagePreprocessingEngineRequest.Builder.class);
    }

    // Construct using processdiscovery.ImagePreprocessingEngineRequest.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      filepath_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return processdiscovery.ImagePreprocessingServiceOuterClass.internal_static_processdiscovery_ImagePreprocessingEngineRequest_descriptor;
    }

    @java.lang.Override
    public processdiscovery.ImagePreprocessingEngineRequest getDefaultInstanceForType() {
      return processdiscovery.ImagePreprocessingEngineRequest.getDefaultInstance();
    }

    @java.lang.Override
    public processdiscovery.ImagePreprocessingEngineRequest build() {
      processdiscovery.ImagePreprocessingEngineRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public processdiscovery.ImagePreprocessingEngineRequest buildPartial() {
      processdiscovery.ImagePreprocessingEngineRequest result = new processdiscovery.ImagePreprocessingEngineRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        filepath_ = filepath_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.filepath_ = filepath_;
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
      if (other instanceof processdiscovery.ImagePreprocessingEngineRequest) {
        return mergeFrom((processdiscovery.ImagePreprocessingEngineRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(processdiscovery.ImagePreprocessingEngineRequest other) {
      if (other == processdiscovery.ImagePreprocessingEngineRequest.getDefaultInstance()) return this;
      if (!other.filepath_.isEmpty()) {
        if (filepath_.isEmpty()) {
          filepath_ = other.filepath_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureFilepathIsMutable();
          filepath_.addAll(other.filepath_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      processdiscovery.ImagePreprocessingEngineRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (processdiscovery.ImagePreprocessingEngineRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList filepath_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureFilepathIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        filepath_ = new com.google.protobuf.LazyStringArrayList(filepath_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string filepath = 1;</code>
     * @return A list containing the filepath.
     */
    public com.google.protobuf.ProtocolStringList
        getFilepathList() {
      return filepath_.getUnmodifiableView();
    }
    /**
     * <code>repeated string filepath = 1;</code>
     * @return The count of filepath.
     */
    public int getFilepathCount() {
      return filepath_.size();
    }
    /**
     * <code>repeated string filepath = 1;</code>
     * @param index The index of the element to return.
     * @return The filepath at the given index.
     */
    public java.lang.String getFilepath(int index) {
      return filepath_.get(index);
    }
    /**
     * <code>repeated string filepath = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the filepath at the given index.
     */
    public com.google.protobuf.ByteString
        getFilepathBytes(int index) {
      return filepath_.getByteString(index);
    }
    /**
     * <code>repeated string filepath = 1;</code>
     * @param index The index to set the value at.
     * @param value The filepath to set.
     * @return This builder for chaining.
     */
    public Builder setFilepath(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureFilepathIsMutable();
      filepath_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string filepath = 1;</code>
     * @param value The filepath to add.
     * @return This builder for chaining.
     */
    public Builder addFilepath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureFilepathIsMutable();
      filepath_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string filepath = 1;</code>
     * @param values The filepath to add.
     * @return This builder for chaining.
     */
    public Builder addAllFilepath(
        java.lang.Iterable<java.lang.String> values) {
      ensureFilepathIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, filepath_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string filepath = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFilepath() {
      filepath_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string filepath = 1;</code>
     * @param value The bytes of the filepath to add.
     * @return This builder for chaining.
     */
    public Builder addFilepathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureFilepathIsMutable();
      filepath_.add(value);
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


    // @@protoc_insertion_point(builder_scope:processdiscovery.ImagePreprocessingEngineRequest)
  }

  // @@protoc_insertion_point(class_scope:processdiscovery.ImagePreprocessingEngineRequest)
  private static final processdiscovery.ImagePreprocessingEngineRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new processdiscovery.ImagePreprocessingEngineRequest();
  }

  public static processdiscovery.ImagePreprocessingEngineRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImagePreprocessingEngineRequest>
      PARSER = new com.google.protobuf.AbstractParser<ImagePreprocessingEngineRequest>() {
    @java.lang.Override
    public ImagePreprocessingEngineRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ImagePreprocessingEngineRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ImagePreprocessingEngineRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImagePreprocessingEngineRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public processdiscovery.ImagePreprocessingEngineRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
