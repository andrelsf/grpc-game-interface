// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/gamerequest.proto

package br.dev.andreferreira.services;

public final class Gamerequest {
  private Gamerequest() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_GameRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_GameRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032services/gamerequest.proto\022\010services\032\025" +
      "models/platform.proto\"c\n\013GameRequest\022\014\n\004" +
      "name\030\001 \001(\t\022\023\n\013description\030\002 \001(\t\022\"\n\010platf" +
      "orm\030\003 \001(\0162\020.models.Platform\022\r\n\005price\030\004 \001" +
      "(\001B!\n\035br.dev.andreferreira.servicesP\001b\006p" +
      "roto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          br.dev.andreferreira.entities.PlatformOuterClass.getDescriptor(),
        }, assigner);
    internal_static_services_GameRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_GameRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_GameRequest_descriptor,
        new java.lang.String[] { "Name", "Description", "Platform", "Price", });
    br.dev.andreferreira.entities.PlatformOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
