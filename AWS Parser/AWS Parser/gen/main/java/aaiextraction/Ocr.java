// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aaiextraction/dto/ocr.proto

package aaiextraction;

public final class Ocr {
  private Ocr() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aaiextraction_OcrResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aaiextraction_OcrResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aaiextraction_OcrMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aaiextraction_OcrMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aaiextraction_OcrLearningInstanceSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aaiextraction_OcrLearningInstanceSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aaiextraction_OcrMetadataPage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aaiextraction_OcrMetadataPage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aaiextraction_OcrBlock_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aaiextraction_OcrBlock_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033aaiextraction/dto/ocr.proto\022\raaiextrac" +
      "tion\032\036aaiextraction/dto/common.proto\"b\n\t" +
      "OcrResult\022,\n\010metadata\030\001 \001(\0132\032.aaiextract" +
      "ion.OcrMetadata\022\'\n\006blocks\030\002 \003(\0132\027.aaiext" +
      "raction.OcrBlock\"\361\001\n\013OcrMetadata\0228\n\020exec" +
      "ution_status\030\001 \001(\0132\036.aaiextraction.Execu" +
      "tionStatus\022\027\n\017number_of_pages\030\002 \001(\005\022L\n\031l" +
      "earning_instance_setting\030\003 \001(\0132).aaiextr" +
      "action.OcrLearningInstanceSetting\022\022\n\ntim" +
      "e_in_ms\030\004 \001(\001\022-\n\005pages\030\005 \003(\0132\036.aaiextrac" +
      "tion.OcrMetadataPage\"S\n\032OcrLearningInsta" +
      "nceSetting\022\020\n\010provider\030\001 \001(\t\022\017\n\007version\030" +
      "\002 \001(\t\022\022\n\nlang_codes\030\003 \003(\t\"T\n\017OcrMetadata" +
      "Page\022\n\n\002id\030\001 \001(\t\022\020\n\010page_num\030\002 \001(\005\022\020\n\010fi" +
      "lepath\030\003 \001(\t\022\021\n\tlang_code\030\004 \001(\t\"\275\001\n\010OcrB" +
      "lock\022\n\n\002id\030\001 \001(\t\022)\n\010geometry\030\002 \001(\0132\027.aai" +
      "extraction.Geometry\022\014\n\004text\030\003 \001(\t\022/\n\nblo" +
      "ck_type\030\004 \001(\0162\033.aaiextraction.OcrBlockTy" +
      "pe\022\025\n\rrelationships\030\005 \003(\t\022\020\n\010page_num\030\006 " +
      "\001(\005\022\022\n\nconfidence\030\007 \001(\001*5\n\014OcrBlockType\022" +
      "\021\n\rUNKNOWN_BLOCK\020\000\022\010\n\004WORD\020\001\022\010\n\004LINE\020\002B\002" +
      "P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          aaiextraction.Common.getDescriptor(),
        });
    internal_static_aaiextraction_OcrResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_aaiextraction_OcrResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aaiextraction_OcrResult_descriptor,
        new java.lang.String[] { "Metadata", "Blocks", });
    internal_static_aaiextraction_OcrMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_aaiextraction_OcrMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aaiextraction_OcrMetadata_descriptor,
        new java.lang.String[] { "ExecutionStatus", "NumberOfPages", "LearningInstanceSetting", "TimeInMs", "Pages", });
    internal_static_aaiextraction_OcrLearningInstanceSetting_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_aaiextraction_OcrLearningInstanceSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aaiextraction_OcrLearningInstanceSetting_descriptor,
        new java.lang.String[] { "Provider", "Version", "LangCodes", });
    internal_static_aaiextraction_OcrMetadataPage_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_aaiextraction_OcrMetadataPage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aaiextraction_OcrMetadataPage_descriptor,
        new java.lang.String[] { "Id", "PageNum", "Filepath", "LangCode", });
    internal_static_aaiextraction_OcrBlock_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_aaiextraction_OcrBlock_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aaiextraction_OcrBlock_descriptor,
        new java.lang.String[] { "Id", "Geometry", "Text", "BlockType", "Relationships", "PageNum", "Confidence", });
    aaiextraction.Common.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
