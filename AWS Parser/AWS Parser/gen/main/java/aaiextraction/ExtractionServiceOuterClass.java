// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aaiextraction/service/extractionService.proto

package aaiextraction;

public final class ExtractionServiceOuterClass {
  private ExtractionServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aaiextraction_ExtractionEngineRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aaiextraction_ExtractionEngineRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-aaiextraction/service/extractionServic" +
      "e.proto\022\raaiextraction\032*aaiextraction/dt" +
      "o/imagePreprocessing.proto\032\033aaiextractio" +
      "n/dto/ocr.proto\032!aaiextraction/dto/docDe" +
      "tect.proto\032\"aaiextraction/dto/extraction" +
      ".proto\"\317\001\n\027ExtractionEngineRequest\022K\n\032im" +
      "age_preprocessing_result\030\001 \001(\0132\'.aaiextr" +
      "action.ImagePreprocessingResult\022,\n\nocr_r" +
      "esult\030\002 \001(\0132\030.aaiextraction.OcrResult\0229\n" +
      "\021doc_detect_result\030\003 \001(\0132\036.aaiextraction" +
      ".DocDetectResult2g\n\021ExtractionService\022R\n" +
      "\007execute\022&.aaiextraction.ExtractionEngin" +
      "eRequest\032\037.aaiextraction.ExtractionResul" +
      "tB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          aaiextraction.ImagePreprocessing.getDescriptor(),
          aaiextraction.Ocr.getDescriptor(),
          aaiextraction.DocDetect.getDescriptor(),
          aaiextraction.Extraction.getDescriptor(),
        });
    internal_static_aaiextraction_ExtractionEngineRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_aaiextraction_ExtractionEngineRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aaiextraction_ExtractionEngineRequest_descriptor,
        new java.lang.String[] { "ImagePreprocessingResult", "OcrResult", "DocDetectResult", });
    aaiextraction.ImagePreprocessing.getDescriptor();
    aaiextraction.Ocr.getDescriptor();
    aaiextraction.DocDetect.getDescriptor();
    aaiextraction.Extraction.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
