// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aaiextraction/dto/ocr.proto

package aaiextraction;

/**
 * Protobuf type {@code aaiextraction.OcrMetadataPage}
 */
public final class OcrMetadataPage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aaiextraction.OcrMetadataPage)
    OcrMetadataPageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OcrMetadataPage.newBuilder() to construct.
  private OcrMetadataPage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OcrMetadataPage() {
    id_ = "";
    filepath_ = "";
    langCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OcrMetadataPage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OcrMetadataPage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 16: {

            pageNum_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            filepath_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            langCode_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return aaiextraction.Ocr.internal_static_aaiextraction_OcrMetadataPage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return aaiextraction.Ocr.internal_static_aaiextraction_OcrMetadataPage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            aaiextraction.OcrMetadataPage.class, aaiextraction.OcrMetadataPage.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_NUM_FIELD_NUMBER = 2;
  private int pageNum_;
  /**
   * <code>int32 page_num = 2;</code>
   * @return The pageNum.
   */
  @java.lang.Override
  public int getPageNum() {
    return pageNum_;
  }

  public static final int FILEPATH_FIELD_NUMBER = 3;
  private volatile java.lang.Object filepath_;
  /**
   * <code>string filepath = 3;</code>
   * @return The filepath.
   */
  @java.lang.Override
  public java.lang.String getFilepath() {
    java.lang.Object ref = filepath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filepath_ = s;
      return s;
    }
  }
  /**
   * <code>string filepath = 3;</code>
   * @return The bytes for filepath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFilepathBytes() {
    java.lang.Object ref = filepath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      filepath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LANG_CODE_FIELD_NUMBER = 4;
  private volatile java.lang.Object langCode_;
  /**
   * <code>string lang_code = 4;</code>
   * @return The langCode.
   */
  @java.lang.Override
  public java.lang.String getLangCode() {
    java.lang.Object ref = langCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      langCode_ = s;
      return s;
    }
  }
  /**
   * <code>string lang_code = 4;</code>
   * @return The bytes for langCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLangCodeBytes() {
    java.lang.Object ref = langCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      langCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (pageNum_ != 0) {
      output.writeInt32(2, pageNum_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filepath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, filepath_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(langCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, langCode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (pageNum_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pageNum_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filepath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, filepath_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(langCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, langCode_);
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
    if (!(obj instanceof aaiextraction.OcrMetadataPage)) {
      return super.equals(obj);
    }
    aaiextraction.OcrMetadataPage other = (aaiextraction.OcrMetadataPage) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (getPageNum()
        != other.getPageNum()) return false;
    if (!getFilepath()
        .equals(other.getFilepath())) return false;
    if (!getLangCode()
        .equals(other.getLangCode())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + PAGE_NUM_FIELD_NUMBER;
    hash = (53 * hash) + getPageNum();
    hash = (37 * hash) + FILEPATH_FIELD_NUMBER;
    hash = (53 * hash) + getFilepath().hashCode();
    hash = (37 * hash) + LANG_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getLangCode().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static aaiextraction.OcrMetadataPage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static aaiextraction.OcrMetadataPage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static aaiextraction.OcrMetadataPage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static aaiextraction.OcrMetadataPage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static aaiextraction.OcrMetadataPage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static aaiextraction.OcrMetadataPage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static aaiextraction.OcrMetadataPage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static aaiextraction.OcrMetadataPage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static aaiextraction.OcrMetadataPage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static aaiextraction.OcrMetadataPage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static aaiextraction.OcrMetadataPage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static aaiextraction.OcrMetadataPage parseFrom(
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
  public static Builder newBuilder(aaiextraction.OcrMetadataPage prototype) {
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
   * Protobuf type {@code aaiextraction.OcrMetadataPage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aaiextraction.OcrMetadataPage)
      aaiextraction.OcrMetadataPageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return aaiextraction.Ocr.internal_static_aaiextraction_OcrMetadataPage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return aaiextraction.Ocr.internal_static_aaiextraction_OcrMetadataPage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              aaiextraction.OcrMetadataPage.class, aaiextraction.OcrMetadataPage.Builder.class);
    }

    // Construct using aaiextraction.OcrMetadataPage.newBuilder()
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
      id_ = "";

      pageNum_ = 0;

      filepath_ = "";

      langCode_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return aaiextraction.Ocr.internal_static_aaiextraction_OcrMetadataPage_descriptor;
    }

    @java.lang.Override
    public aaiextraction.OcrMetadataPage getDefaultInstanceForType() {
      return aaiextraction.OcrMetadataPage.getDefaultInstance();
    }

    @java.lang.Override
    public aaiextraction.OcrMetadataPage build() {
      aaiextraction.OcrMetadataPage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public aaiextraction.OcrMetadataPage buildPartial() {
      aaiextraction.OcrMetadataPage result = new aaiextraction.OcrMetadataPage(this);
      result.id_ = id_;
      result.pageNum_ = pageNum_;
      result.filepath_ = filepath_;
      result.langCode_ = langCode_;
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
      if (other instanceof aaiextraction.OcrMetadataPage) {
        return mergeFrom((aaiextraction.OcrMetadataPage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(aaiextraction.OcrMetadataPage other) {
      if (other == aaiextraction.OcrMetadataPage.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (other.getPageNum() != 0) {
        setPageNum(other.getPageNum());
      }
      if (!other.getFilepath().isEmpty()) {
        filepath_ = other.filepath_;
        onChanged();
      }
      if (!other.getLangCode().isEmpty()) {
        langCode_ = other.langCode_;
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
      aaiextraction.OcrMetadataPage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (aaiextraction.OcrMetadataPage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private int pageNum_ ;
    /**
     * <code>int32 page_num = 2;</code>
     * @return The pageNum.
     */
    @java.lang.Override
    public int getPageNum() {
      return pageNum_;
    }
    /**
     * <code>int32 page_num = 2;</code>
     * @param value The pageNum to set.
     * @return This builder for chaining.
     */
    public Builder setPageNum(int value) {
      
      pageNum_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 page_num = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageNum() {
      
      pageNum_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object filepath_ = "";
    /**
     * <code>string filepath = 3;</code>
     * @return The filepath.
     */
    public java.lang.String getFilepath() {
      java.lang.Object ref = filepath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filepath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string filepath = 3;</code>
     * @return The bytes for filepath.
     */
    public com.google.protobuf.ByteString
        getFilepathBytes() {
      java.lang.Object ref = filepath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filepath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string filepath = 3;</code>
     * @param value The filepath to set.
     * @return This builder for chaining.
     */
    public Builder setFilepath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      filepath_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string filepath = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFilepath() {
      
      filepath_ = getDefaultInstance().getFilepath();
      onChanged();
      return this;
    }
    /**
     * <code>string filepath = 3;</code>
     * @param value The bytes for filepath to set.
     * @return This builder for chaining.
     */
    public Builder setFilepathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      filepath_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object langCode_ = "";
    /**
     * <code>string lang_code = 4;</code>
     * @return The langCode.
     */
    public java.lang.String getLangCode() {
      java.lang.Object ref = langCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        langCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string lang_code = 4;</code>
     * @return The bytes for langCode.
     */
    public com.google.protobuf.ByteString
        getLangCodeBytes() {
      java.lang.Object ref = langCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        langCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string lang_code = 4;</code>
     * @param value The langCode to set.
     * @return This builder for chaining.
     */
    public Builder setLangCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      langCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string lang_code = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLangCode() {
      
      langCode_ = getDefaultInstance().getLangCode();
      onChanged();
      return this;
    }
    /**
     * <code>string lang_code = 4;</code>
     * @param value The bytes for langCode to set.
     * @return This builder for chaining.
     */
    public Builder setLangCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      langCode_ = value;
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


    // @@protoc_insertion_point(builder_scope:aaiextraction.OcrMetadataPage)
  }

  // @@protoc_insertion_point(class_scope:aaiextraction.OcrMetadataPage)
  private static final aaiextraction.OcrMetadataPage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new aaiextraction.OcrMetadataPage();
  }

  public static aaiextraction.OcrMetadataPage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OcrMetadataPage>
      PARSER = new com.google.protobuf.AbstractParser<OcrMetadataPage>() {
    @java.lang.Override
    public OcrMetadataPage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OcrMetadataPage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OcrMetadataPage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OcrMetadataPage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public aaiextraction.OcrMetadataPage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

