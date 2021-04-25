// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: models/platform.proto

package br.dev.andreferreira.entities;

/**
 * Protobuf enum {@code models.Platform}
 */
public enum Platform
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN = 0;</code>
   */
  UNKNOWN(0),
  /**
   * <code>PS4 = 1;</code>
   */
  PS4(1),
  /**
   * <code>XBOX_ONE = 2;</code>
   */
  XBOX_ONE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNKNOWN = 0;</code>
   */
  public static final int UNKNOWN_VALUE = 0;
  /**
   * <code>PS4 = 1;</code>
   */
  public static final int PS4_VALUE = 1;
  /**
   * <code>XBOX_ONE = 2;</code>
   */
  public static final int XBOX_ONE_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Platform valueOf(int value) {
    return forNumber(value);
  }

  public static Platform forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN;
      case 1: return PS4;
      case 2: return XBOX_ONE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Platform>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Platform> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Platform>() {
          public Platform findValueByNumber(int number) {
            return Platform.forNumber(number);
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
    return br.dev.andreferreira.entities.PlatformOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final Platform[] VALUES = values();

  public static Platform valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Platform(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:models.Platform)
}

