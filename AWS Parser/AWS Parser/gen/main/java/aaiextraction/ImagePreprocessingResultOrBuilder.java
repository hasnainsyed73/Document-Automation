// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aaiextraction/dto/imagePreprocessing.proto

package aaiextraction;

public interface ImagePreprocessingResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aaiextraction.ImagePreprocessingResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.aaiextraction.ImagePreprocessingMetadata metadata = 1;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <code>.aaiextraction.ImagePreprocessingMetadata metadata = 1;</code>
   * @return The metadata.
   */
  aaiextraction.ImagePreprocessingMetadata getMetadata();
  /**
   * <code>.aaiextraction.ImagePreprocessingMetadata metadata = 1;</code>
   */
  aaiextraction.ImagePreprocessingMetadataOrBuilder getMetadataOrBuilder();

  /**
   * <code>repeated .aaiextraction.ImagePreprocessingPage pages = 2;</code>
   */
  java.util.List<aaiextraction.ImagePreprocessingPage> 
      getPagesList();
  /**
   * <code>repeated .aaiextraction.ImagePreprocessingPage pages = 2;</code>
   */
  aaiextraction.ImagePreprocessingPage getPages(int index);
  /**
   * <code>repeated .aaiextraction.ImagePreprocessingPage pages = 2;</code>
   */
  int getPagesCount();
  /**
   * <code>repeated .aaiextraction.ImagePreprocessingPage pages = 2;</code>
   */
  java.util.List<? extends aaiextraction.ImagePreprocessingPageOrBuilder> 
      getPagesOrBuilderList();
  /**
   * <code>repeated .aaiextraction.ImagePreprocessingPage pages = 2;</code>
   */
  aaiextraction.ImagePreprocessingPageOrBuilder getPagesOrBuilder(
      int index);
}
