// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/gamedeletedresponse.proto

package br.dev.andreferreira.services;

public final class Gamedeletedresponse {
  private Gamedeletedresponse() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_GameDeletedResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_GameDeletedResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"services/gamedeletedresponse.proto\022\010se" +
      "rvices\032\035services/statusresponse.proto\"O\n" +
      "\023GameDeletedResponse\022\016\n\006gameId\030\001 \001(\003\022(\n\006" +
      "status\030\002 \001(\0162\030.services.StatusResponseB!" +
      "\n\035br.dev.andreferreira.servicesP\001b\006proto" +
      "3"
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
          br.dev.andreferreira.services.Statusresponse.getDescriptor(),
        }, assigner);
    internal_static_services_GameDeletedResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_GameDeletedResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_GameDeletedResponse_descriptor,
        new java.lang.String[] { "GameId", "Status", });
    br.dev.andreferreira.services.Statusresponse.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
