// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hbase-sep.proto

package ai.sapper.hbase.sep.model;

public final class HBaseSEPModel {
  private HBaseSEPModel() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ai_sapper_hbase_sep_model_SEPTableName_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ai_sapper_hbase_sep_model_SEPTableName_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ai_sapper_hbase_sep_model_SEPMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ai_sapper_hbase_sep_model_SEPMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017hbase-sep.proto\022\031ai_sapper_hbase_sep_m" +
      "odel\"4\n\014SEPTableName\022\021\n\tnamespace\030\001 \002(\014\022" +
      "\021\n\tqualifier\030\002 \002(\014\"\234\001\n\nSEPMessage\022\013\n\003row" +
      "\030\001 \002(\014\022\021\n\ttimestamp\030\002 \002(\004\022\r\n\005value\030\003 \002(\014" +
      "\0226\n\005table\030\004 \002(\0132\'.ai_sapper_hbase_sep_mo" +
      "del.SEPTableName\022\024\n\014columnFamily\030\005 \001(\014\022\021" +
      "\n\tqualifier\030\006 \001(\014B,\n\031ai.sapper.hbase.sep" +
      ".modelB\rHBaseSEPModelP\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ai_sapper_hbase_sep_model_SEPTableName_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ai_sapper_hbase_sep_model_SEPTableName_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ai_sapper_hbase_sep_model_SEPTableName_descriptor,
        new java.lang.String[] { "Namespace", "Qualifier", });
    internal_static_ai_sapper_hbase_sep_model_SEPMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ai_sapper_hbase_sep_model_SEPMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ai_sapper_hbase_sep_model_SEPMessage_descriptor,
        new java.lang.String[] { "Row", "Timestamp", "Value", "Table", "ColumnFamily", "Qualifier", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
