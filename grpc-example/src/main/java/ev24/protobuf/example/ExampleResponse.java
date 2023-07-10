// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: example.proto

package ev24.protobuf.example;

/**
 * Protobuf type {@code ev24.protobuf.example.ExampleResponse}
 */
public final class ExampleResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ev24.protobuf.example.ExampleResponse)
    ExampleResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExampleResponse.newBuilder() to construct.
  private ExampleResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExampleResponse() {
    requestId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExampleResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExampleResponse(
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

            requestId_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              payload_ = com.google.protobuf.MapField.newMapField(
                  PayloadDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            payload__ = input.readMessage(
                PayloadDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            payload_.getMutableMap().put(
                payload__.getKey(), payload__.getValue());
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
    return ev24.protobuf.example.Example.internal_static_ev24_protobuf_example_ExampleResponse_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetPayload();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ev24.protobuf.example.Example.internal_static_ev24_protobuf_example_ExampleResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ev24.protobuf.example.ExampleResponse.class, ev24.protobuf.example.ExampleResponse.Builder.class);
  }

  public static final int REQUEST_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object requestId_;
  /**
   * <pre>
   **
   * UUID for request tracking
   * </pre>
   *
   * <code>string request_id = 1 [json_name = "request_id"];</code>
   * @return The requestId.
   */
  @java.lang.Override
  public java.lang.String getRequestId() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      requestId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   **
   * UUID for request tracking
   * </pre>
   *
   * <code>string request_id = 1 [json_name = "request_id"];</code>
   * @return The bytes for requestId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRequestIdBytes() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      requestId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAYLOAD_FIELD_NUMBER = 2;
  private static final class PayloadDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                ev24.protobuf.example.Example.internal_static_ev24_protobuf_example_ExampleResponse_PayloadEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> payload_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetPayload() {
    if (payload_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          PayloadDefaultEntryHolder.defaultEntry);
    }
    return payload_;
  }

  public int getPayloadCount() {
    return internalGetPayload().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; payload = 2 [json_name = "payload"];</code>
   */

  @java.lang.Override
  public boolean containsPayload(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetPayload().getMap().containsKey(key);
  }
  /**
   * Use {@link #getPayloadMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getPayload() {
    return getPayloadMap();
  }
  /**
   * <code>map&lt;string, string&gt; payload = 2 [json_name = "payload"];</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.String> getPayloadMap() {
    return internalGetPayload().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; payload = 2 [json_name = "payload"];</code>
   */
  @java.lang.Override

  public java.lang.String getPayloadOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetPayload().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; payload = 2 [json_name = "payload"];</code>
   */
  @java.lang.Override

  public java.lang.String getPayloadOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetPayload().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!getRequestIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, requestId_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetPayload(),
        PayloadDefaultEntryHolder.defaultEntry,
        2);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRequestIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, requestId_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetPayload().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      payload__ = PayloadDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, payload__);
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
    if (!(obj instanceof ev24.protobuf.example.ExampleResponse)) {
      return super.equals(obj);
    }
    ev24.protobuf.example.ExampleResponse other = (ev24.protobuf.example.ExampleResponse) obj;

    if (!getRequestId()
        .equals(other.getRequestId())) return false;
    if (!internalGetPayload().equals(
        other.internalGetPayload())) return false;
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
    hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRequestId().hashCode();
    if (!internalGetPayload().getMap().isEmpty()) {
      hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
      hash = (53 * hash) + internalGetPayload().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ev24.protobuf.example.ExampleResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ev24.protobuf.example.ExampleResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ev24.protobuf.example.ExampleResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ev24.protobuf.example.ExampleResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ev24.protobuf.example.ExampleResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ev24.protobuf.example.ExampleResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ev24.protobuf.example.ExampleResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ev24.protobuf.example.ExampleResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ev24.protobuf.example.ExampleResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ev24.protobuf.example.ExampleResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ev24.protobuf.example.ExampleResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ev24.protobuf.example.ExampleResponse parseFrom(
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
  public static Builder newBuilder(ev24.protobuf.example.ExampleResponse prototype) {
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
   * Protobuf type {@code ev24.protobuf.example.ExampleResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ev24.protobuf.example.ExampleResponse)
      ev24.protobuf.example.ExampleResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ev24.protobuf.example.Example.internal_static_ev24_protobuf_example_ExampleResponse_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetPayload();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutablePayload();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ev24.protobuf.example.Example.internal_static_ev24_protobuf_example_ExampleResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ev24.protobuf.example.ExampleResponse.class, ev24.protobuf.example.ExampleResponse.Builder.class);
    }

    // Construct using ev24.protobuf.example.ExampleResponse.newBuilder()
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
      requestId_ = "";

      internalGetMutablePayload().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ev24.protobuf.example.Example.internal_static_ev24_protobuf_example_ExampleResponse_descriptor;
    }

    @java.lang.Override
    public ev24.protobuf.example.ExampleResponse getDefaultInstanceForType() {
      return ev24.protobuf.example.ExampleResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ev24.protobuf.example.ExampleResponse build() {
      ev24.protobuf.example.ExampleResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ev24.protobuf.example.ExampleResponse buildPartial() {
      ev24.protobuf.example.ExampleResponse result = new ev24.protobuf.example.ExampleResponse(this);
      int from_bitField0_ = bitField0_;
      result.requestId_ = requestId_;
      result.payload_ = internalGetPayload();
      result.payload_.makeImmutable();
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
      if (other instanceof ev24.protobuf.example.ExampleResponse) {
        return mergeFrom((ev24.protobuf.example.ExampleResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ev24.protobuf.example.ExampleResponse other) {
      if (other == ev24.protobuf.example.ExampleResponse.getDefaultInstance()) return this;
      if (!other.getRequestId().isEmpty()) {
        requestId_ = other.requestId_;
        onChanged();
      }
      internalGetMutablePayload().mergeFrom(
          other.internalGetPayload());
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
      ev24.protobuf.example.ExampleResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ev24.protobuf.example.ExampleResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object requestId_ = "";
    /**
     * <pre>
     **
     * UUID for request tracking
     * </pre>
     *
     * <code>string request_id = 1 [json_name = "request_id"];</code>
     * @return The requestId.
     */
    public java.lang.String getRequestId() {
      java.lang.Object ref = requestId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        requestId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     **
     * UUID for request tracking
     * </pre>
     *
     * <code>string request_id = 1 [json_name = "request_id"];</code>
     * @return The bytes for requestId.
     */
    public com.google.protobuf.ByteString
        getRequestIdBytes() {
      java.lang.Object ref = requestId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        requestId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     **
     * UUID for request tracking
     * </pre>
     *
     * <code>string request_id = 1 [json_name = "request_id"];</code>
     * @param value The requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      requestId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     **
     * UUID for request tracking
     * </pre>
     *
     * <code>string request_id = 1 [json_name = "request_id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestId() {
      
      requestId_ = getDefaultInstance().getRequestId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     **
     * UUID for request tracking
     * </pre>
     *
     * <code>string request_id = 1 [json_name = "request_id"];</code>
     * @param value The bytes for requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      requestId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> payload_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetPayload() {
      if (payload_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            PayloadDefaultEntryHolder.defaultEntry);
      }
      return payload_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutablePayload() {
      onChanged();;
      if (payload_ == null) {
        payload_ = com.google.protobuf.MapField.newMapField(
            PayloadDefaultEntryHolder.defaultEntry);
      }
      if (!payload_.isMutable()) {
        payload_ = payload_.copy();
      }
      return payload_;
    }

    public int getPayloadCount() {
      return internalGetPayload().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; payload = 2 [json_name = "payload"];</code>
     */

    @java.lang.Override
    public boolean containsPayload(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetPayload().getMap().containsKey(key);
    }
    /**
     * Use {@link #getPayloadMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getPayload() {
      return getPayloadMap();
    }
    /**
     * <code>map&lt;string, string&gt; payload = 2 [json_name = "payload"];</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.String> getPayloadMap() {
      return internalGetPayload().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; payload = 2 [json_name = "payload"];</code>
     */
    @java.lang.Override

    public java.lang.String getPayloadOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetPayload().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; payload = 2 [json_name = "payload"];</code>
     */
    @java.lang.Override

    public java.lang.String getPayloadOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetPayload().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearPayload() {
      internalGetMutablePayload().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; payload = 2 [json_name = "payload"];</code>
     */

    public Builder removePayload(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutablePayload().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutablePayload() {
      return internalGetMutablePayload().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; payload = 2 [json_name = "payload"];</code>
     */
    public Builder putPayload(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutablePayload().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; payload = 2 [json_name = "payload"];</code>
     */

    public Builder putAllPayload(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutablePayload().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:ev24.protobuf.example.ExampleResponse)
  }

  // @@protoc_insertion_point(class_scope:ev24.protobuf.example.ExampleResponse)
  private static final ev24.protobuf.example.ExampleResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ev24.protobuf.example.ExampleResponse();
  }

  public static ev24.protobuf.example.ExampleResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExampleResponse>
      PARSER = new com.google.protobuf.AbstractParser<ExampleResponse>() {
    @java.lang.Override
    public ExampleResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExampleResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExampleResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExampleResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ev24.protobuf.example.ExampleResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

