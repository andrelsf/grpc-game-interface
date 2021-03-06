// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: models/game.proto

package br.dev.andreferreira.entities;

/**
 * Protobuf type {@code models.Game}
 */
public  final class Game extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:models.Game)
    GameOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Game.newBuilder() to construct.
  private Game(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Game() {
    gameId_ = 0L;
    name_ = "";
    description_ = "";
    platform_ = 0;
    price_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Game(
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

            gameId_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            platform_ = rawValue;
            break;
          }
          case 41: {

            price_ = input.readDouble();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return br.dev.andreferreira.entities.GameOuterClass.internal_static_models_Game_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.dev.andreferreira.entities.GameOuterClass.internal_static_models_Game_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.dev.andreferreira.entities.Game.class, br.dev.andreferreira.entities.Game.Builder.class);
  }

  public static final int GAMEID_FIELD_NUMBER = 1;
  private long gameId_;
  /**
   * <code>int64 gameId = 1;</code>
   */
  public long getGameId() {
    return gameId_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  private volatile java.lang.Object description_;
  /**
   * <code>string description = 3;</code>
   */
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PLATFORM_FIELD_NUMBER = 4;
  private int platform_;
  /**
   * <code>.models.Platform platform = 4;</code>
   */
  public int getPlatformValue() {
    return platform_;
  }
  /**
   * <code>.models.Platform platform = 4;</code>
   */
  public br.dev.andreferreira.entities.Platform getPlatform() {
    @SuppressWarnings("deprecation")
    br.dev.andreferreira.entities.Platform result = br.dev.andreferreira.entities.Platform.valueOf(platform_);
    return result == null ? br.dev.andreferreira.entities.Platform.UNRECOGNIZED : result;
  }

  public static final int PRICE_FIELD_NUMBER = 5;
  private double price_;
  /**
   * <code>double price = 5;</code>
   */
  public double getPrice() {
    return price_;
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
    if (gameId_ != 0L) {
      output.writeInt64(1, gameId_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, description_);
    }
    if (platform_ != br.dev.andreferreira.entities.Platform.UNKNOWN.getNumber()) {
      output.writeEnum(4, platform_);
    }
    if (price_ != 0D) {
      output.writeDouble(5, price_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gameId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, gameId_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, description_);
    }
    if (platform_ != br.dev.andreferreira.entities.Platform.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, platform_);
    }
    if (price_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, price_);
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
    if (!(obj instanceof br.dev.andreferreira.entities.Game)) {
      return super.equals(obj);
    }
    br.dev.andreferreira.entities.Game other = (br.dev.andreferreira.entities.Game) obj;

    boolean result = true;
    result = result && (getGameId()
        == other.getGameId());
    result = result && getName()
        .equals(other.getName());
    result = result && getDescription()
        .equals(other.getDescription());
    result = result && platform_ == other.platform_;
    result = result && (
        java.lang.Double.doubleToLongBits(getPrice())
        == java.lang.Double.doubleToLongBits(
            other.getPrice()));
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
    hash = (37 * hash) + GAMEID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGameId());
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + PLATFORM_FIELD_NUMBER;
    hash = (53 * hash) + platform_;
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPrice()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.dev.andreferreira.entities.Game parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.dev.andreferreira.entities.Game parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.dev.andreferreira.entities.Game parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.dev.andreferreira.entities.Game parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.dev.andreferreira.entities.Game parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.dev.andreferreira.entities.Game parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.dev.andreferreira.entities.Game parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.dev.andreferreira.entities.Game parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.dev.andreferreira.entities.Game parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.dev.andreferreira.entities.Game parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.dev.andreferreira.entities.Game parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.dev.andreferreira.entities.Game parseFrom(
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
  public static Builder newBuilder(br.dev.andreferreira.entities.Game prototype) {
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
   * Protobuf type {@code models.Game}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:models.Game)
      br.dev.andreferreira.entities.GameOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.dev.andreferreira.entities.GameOuterClass.internal_static_models_Game_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.dev.andreferreira.entities.GameOuterClass.internal_static_models_Game_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.dev.andreferreira.entities.Game.class, br.dev.andreferreira.entities.Game.Builder.class);
    }

    // Construct using br.dev.andreferreira.entities.Game.newBuilder()
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
      gameId_ = 0L;

      name_ = "";

      description_ = "";

      platform_ = 0;

      price_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.dev.andreferreira.entities.GameOuterClass.internal_static_models_Game_descriptor;
    }

    @java.lang.Override
    public br.dev.andreferreira.entities.Game getDefaultInstanceForType() {
      return br.dev.andreferreira.entities.Game.getDefaultInstance();
    }

    @java.lang.Override
    public br.dev.andreferreira.entities.Game build() {
      br.dev.andreferreira.entities.Game result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.dev.andreferreira.entities.Game buildPartial() {
      br.dev.andreferreira.entities.Game result = new br.dev.andreferreira.entities.Game(this);
      result.gameId_ = gameId_;
      result.name_ = name_;
      result.description_ = description_;
      result.platform_ = platform_;
      result.price_ = price_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof br.dev.andreferreira.entities.Game) {
        return mergeFrom((br.dev.andreferreira.entities.Game)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.dev.andreferreira.entities.Game other) {
      if (other == br.dev.andreferreira.entities.Game.getDefaultInstance()) return this;
      if (other.getGameId() != 0L) {
        setGameId(other.getGameId());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (other.platform_ != 0) {
        setPlatformValue(other.getPlatformValue());
      }
      if (other.getPrice() != 0D) {
        setPrice(other.getPrice());
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
      br.dev.andreferreira.entities.Game parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.dev.andreferreira.entities.Game) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long gameId_ ;
    /**
     * <code>int64 gameId = 1;</code>
     */
    public long getGameId() {
      return gameId_;
    }
    /**
     * <code>int64 gameId = 1;</code>
     */
    public Builder setGameId(long value) {
      
      gameId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 gameId = 1;</code>
     */
    public Builder clearGameId() {
      
      gameId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 3;</code>
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 3;</code>
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 3;</code>
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string description = 3;</code>
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private int platform_ = 0;
    /**
     * <code>.models.Platform platform = 4;</code>
     */
    public int getPlatformValue() {
      return platform_;
    }
    /**
     * <code>.models.Platform platform = 4;</code>
     */
    public Builder setPlatformValue(int value) {
      platform_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.models.Platform platform = 4;</code>
     */
    public br.dev.andreferreira.entities.Platform getPlatform() {
      @SuppressWarnings("deprecation")
      br.dev.andreferreira.entities.Platform result = br.dev.andreferreira.entities.Platform.valueOf(platform_);
      return result == null ? br.dev.andreferreira.entities.Platform.UNRECOGNIZED : result;
    }
    /**
     * <code>.models.Platform platform = 4;</code>
     */
    public Builder setPlatform(br.dev.andreferreira.entities.Platform value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      platform_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.models.Platform platform = 4;</code>
     */
    public Builder clearPlatform() {
      
      platform_ = 0;
      onChanged();
      return this;
    }

    private double price_ ;
    /**
     * <code>double price = 5;</code>
     */
    public double getPrice() {
      return price_;
    }
    /**
     * <code>double price = 5;</code>
     */
    public Builder setPrice(double value) {
      
      price_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double price = 5;</code>
     */
    public Builder clearPrice() {
      
      price_ = 0D;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:models.Game)
  }

  // @@protoc_insertion_point(class_scope:models.Game)
  private static final br.dev.andreferreira.entities.Game DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.dev.andreferreira.entities.Game();
  }

  public static br.dev.andreferreira.entities.Game getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Game>
      PARSER = new com.google.protobuf.AbstractParser<Game>() {
    @java.lang.Override
    public Game parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Game(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Game> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Game> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.dev.andreferreira.entities.Game getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

