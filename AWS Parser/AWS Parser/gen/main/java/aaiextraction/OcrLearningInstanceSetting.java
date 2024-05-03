// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aaiextraction/dto/ocr.proto

package aaiextraction;

/**
 * Protobuf type {@code aaiextraction.OcrLearningInstanceSetting}
 */
public final class OcrLearningInstanceSetting extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aaiextraction.OcrLearningInstanceSetting)
    OcrLearningInstanceSettingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OcrLearningInstanceSetting.newBuilder() to construct.
  private OcrLearningInstanceSetting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OcrLearningInstanceSetting() {
    provider_ = "";
    version_ = "";
    langCodes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OcrLearningInstanceSetting();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OcrLearningInstanceSetting(
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

            provider_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            version_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              langCodes_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            langCodes_.add(s);
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
        langCodes_ = langCodes_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return aaiextraction.Ocr.internal_static_aaiextraction_OcrLearningInstanceSetting_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return aaiextraction.Ocr.internal_static_aaiextraction_OcrLearningInstanceSetting_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            aaiextraction.OcrLearningInstanceSetting.class, aaiextraction.OcrLearningInstanceSetting.Builder.class);
  }

  public static final int PROVIDER_FIELD_NUMBER = 1;
  private volatile java.lang.Object provider_;
  /**
   * <code>string provider = 1;</code>
   * @return The provider.
   */
  @java.lang.Override
  public java.lang.String getProvider() {
    java.lang.Object ref = provider_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      provider_ = s;
      return s;
    }
  }
  /**
   * <code>string provider = 1;</code>
   * @return The bytes for provider.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProviderBytes() {
    java.lang.Object ref = provider_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      provider_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private volatile java.lang.Object version_;
  /**
   * <code>string version = 2;</code>
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   * <code>string version = 2;</code>
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LANG_CODES_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList langCodes_;
  /**
   * <code>repeated string lang_codes = 3;</code>
   * @return A list containing the langCodes.
   */
  public com.google.protobuf.ProtocolStringList
      getLangCodesList() {
    return langCodes_;
  }
  /**
   * <code>repeated string lang_codes = 3;</code>
   * @return The count of langCodes.
   */
  public int getLangCodesCount() {
    return langCodes_.size();
  }
  /**
   * <code>repeated string lang_codes = 3;</code>
   * @param index The index of the element to return.
   * @return The langCodes at the given index.
   */
  public java.lang.String getLangCodes(int index) {
    return langCodes_.get(index);
  }
  /**
   * <code>repeated string lang_codes = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the langCodes at the given index.
   */
  public com.google.protobuf.ByteString
      getLangCodesBytes(int index) {
    return langCodes_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(provider_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, provider_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, version_);
    }
    for (int i = 0; i < langCodes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, langCodes_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(provider_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, provider_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, version_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < langCodes_.size(); i++) {
        dataSize += computeStringSizeNoTag(langCodes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getLangCodesList().size();
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
    if (!(obj instanceof aaiextraction.OcrLearningInstanceSetting)) {
      return super.equals(obj);
    }
    aaiextraction.OcrLearningInstanceSetting other = (aaiextraction.OcrLearningInstanceSetting) obj;

    if (!getProvider()
        .equals(other.getProvider())) return false;
    if (!getVersion()
        .equals(other.getVersion())) return false;
    if (!getLangCodesList()
        .equals(other.getLangCodesList())) return false;
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
    hash = (37 * hash) + PROVIDER_FIELD_NUMBER;
    hash = (53 * hash) + getProvider().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    if (getLangCodesCount() > 0) {
      hash = (37 * hash) + LANG_CODES_FIELD_NUMBER;
      hash = (53 * hash) + getLangCodesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static aaiextraction.OcrLearningInstanceSetting parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static aaiextraction.OcrLearningInstanceSetting parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static aaiextraction.OcrLearningInstanceSetting parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static aaiextraction.OcrLearningInstanceSetting parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static aaiextraction.OcrLearningInstanceSetting parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static aaiextraction.OcrLearningInstanceSetting parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static aaiextraction.OcrLearningInstanceSetting parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static aaiextraction.OcrLearningInstanceSetting parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static aaiextraction.OcrLearningInstanceSetting parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static aaiextraction.OcrLearningInstanceSetting parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static aaiextraction.OcrLearningInstanceSetting parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static aaiextraction.OcrLearningInstanceSetting parseFrom(
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
  public static Builder newBuilder(aaiextraction.OcrLearningInstanceSetting prototype) {
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
   * Protobuf type {@code aaiextraction.OcrLearningInstanceSetting}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aaiextraction.OcrLearningInstanceSetting)
      aaiextraction.OcrLearningInstanceSettingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return aaiextraction.Ocr.internal_static_aaiextraction_OcrLearningInstanceSetting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return aaiextraction.Ocr.internal_static_aaiextraction_OcrLearningInstanceSetting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              aaiextraction.OcrLearningInstanceSetting.class, aaiextraction.OcrLearningInstanceSetting.Builder.class);
    }

    // Construct using aaiextraction.OcrLearningInstanceSetting.newBuilder()
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
      provider_ = "";

      version_ = "";

      langCodes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return aaiextraction.Ocr.internal_static_aaiextraction_OcrLearningInstanceSetting_descriptor;
    }

    @java.lang.Override
    public aaiextraction.OcrLearningInstanceSetting getDefaultInstanceForType() {
      return aaiextraction.OcrLearningInstanceSetting.getDefaultInstance();
    }

    @java.lang.Override
    public aaiextraction.OcrLearningInstanceSetting build() {
      aaiextraction.OcrLearningInstanceSetting result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public aaiextraction.OcrLearningInstanceSetting buildPartial() {
      aaiextraction.OcrLearningInstanceSetting result = new aaiextraction.OcrLearningInstanceSetting(this);
      int from_bitField0_ = bitField0_;
      result.provider_ = provider_;
      result.version_ = version_;
      if (((bitField0_ & 0x00000001) != 0)) {
        langCodes_ = langCodes_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.langCodes_ = langCodes_;
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
      if (other instanceof aaiextraction.OcrLearningInstanceSetting) {
        return mergeFrom((aaiextraction.OcrLearningInstanceSetting)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(aaiextraction.OcrLearningInstanceSetting other) {
      if (other == aaiextraction.OcrLearningInstanceSetting.getDefaultInstance()) return this;
      if (!other.getProvider().isEmpty()) {
        provider_ = other.provider_;
        onChanged();
      }
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        onChanged();
      }
      if (!other.langCodes_.isEmpty()) {
        if (langCodes_.isEmpty()) {
          langCodes_ = other.langCodes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureLangCodesIsMutable();
          langCodes_.addAll(other.langCodes_);
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
      aaiextraction.OcrLearningInstanceSetting parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (aaiextraction.OcrLearningInstanceSetting) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object provider_ = "";
    /**
     * <code>string provider = 1;</code>
     * @return The provider.
     */
    public java.lang.String getProvider() {
      java.lang.Object ref = provider_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        provider_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string provider = 1;</code>
     * @return The bytes for provider.
     */
    public com.google.protobuf.ByteString
        getProviderBytes() {
      java.lang.Object ref = provider_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        provider_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string provider = 1;</code>
     * @param value The provider to set.
     * @return This builder for chaining.
     */
    public Builder setProvider(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      provider_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string provider = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearProvider() {
      
      provider_ = getDefaultInstance().getProvider();
      onChanged();
      return this;
    }
    /**
     * <code>string provider = 1;</code>
     * @param value The bytes for provider to set.
     * @return This builder for chaining.
     */
    public Builder setProviderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      provider_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object version_ = "";
    /**
     * <code>string version = 2;</code>
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string version = 2;</code>
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string version = 2;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string version = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      
      version_ = getDefaultInstance().getVersion();
      onChanged();
      return this;
    }
    /**
     * <code>string version = 2;</code>
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      version_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList langCodes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureLangCodesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        langCodes_ = new com.google.protobuf.LazyStringArrayList(langCodes_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string lang_codes = 3;</code>
     * @return A list containing the langCodes.
     */
    public com.google.protobuf.ProtocolStringList
        getLangCodesList() {
      return langCodes_.getUnmodifiableView();
    }
    /**
     * <code>repeated string lang_codes = 3;</code>
     * @return The count of langCodes.
     */
    public int getLangCodesCount() {
      return langCodes_.size();
    }
    /**
     * <code>repeated string lang_codes = 3;</code>
     * @param index The index of the element to return.
     * @return The langCodes at the given index.
     */
    public java.lang.String getLangCodes(int index) {
      return langCodes_.get(index);
    }
    /**
     * <code>repeated string lang_codes = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the langCodes at the given index.
     */
    public com.google.protobuf.ByteString
        getLangCodesBytes(int index) {
      return langCodes_.getByteString(index);
    }
    /**
     * <code>repeated string lang_codes = 3;</code>
     * @param index The index to set the value at.
     * @param value The langCodes to set.
     * @return This builder for chaining.
     */
    public Builder setLangCodes(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureLangCodesIsMutable();
      langCodes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string lang_codes = 3;</code>
     * @param value The langCodes to add.
     * @return This builder for chaining.
     */
    public Builder addLangCodes(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureLangCodesIsMutable();
      langCodes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string lang_codes = 3;</code>
     * @param values The langCodes to add.
     * @return This builder for chaining.
     */
    public Builder addAllLangCodes(
        java.lang.Iterable<java.lang.String> values) {
      ensureLangCodesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, langCodes_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string lang_codes = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLangCodes() {
      langCodes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string lang_codes = 3;</code>
     * @param value The bytes of the langCodes to add.
     * @return This builder for chaining.
     */
    public Builder addLangCodesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureLangCodesIsMutable();
      langCodes_.add(value);
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


    // @@protoc_insertion_point(builder_scope:aaiextraction.OcrLearningInstanceSetting)
  }

  // @@protoc_insertion_point(class_scope:aaiextraction.OcrLearningInstanceSetting)
  private static final aaiextraction.OcrLearningInstanceSetting DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new aaiextraction.OcrLearningInstanceSetting();
  }

  public static aaiextraction.OcrLearningInstanceSetting getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OcrLearningInstanceSetting>
      PARSER = new com.google.protobuf.AbstractParser<OcrLearningInstanceSetting>() {
    @java.lang.Override
    public OcrLearningInstanceSetting parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OcrLearningInstanceSetting(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OcrLearningInstanceSetting> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OcrLearningInstanceSetting> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public aaiextraction.OcrLearningInstanceSetting getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
