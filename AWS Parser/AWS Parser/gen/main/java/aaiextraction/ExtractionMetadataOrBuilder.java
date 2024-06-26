// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aaiextraction/dto/extraction.proto

package aaiextraction;

public interface ExtractionMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aaiextraction.ExtractionMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string filepath = 1;</code>
   * @return The filepath.
   */
  java.lang.String getFilepath();
  /**
   * <code>string filepath = 1;</code>
   * @return The bytes for filepath.
   */
  com.google.protobuf.ByteString
      getFilepathBytes();

  /**
   * <code>.aaiextraction.ExecutionStatus execution_status = 2;</code>
   * @return Whether the executionStatus field is set.
   */
  boolean hasExecutionStatus();
  /**
   * <code>.aaiextraction.ExecutionStatus execution_status = 2;</code>
   * @return The executionStatus.
   */
  aaiextraction.ExecutionStatus getExecutionStatus();
  /**
   * <code>.aaiextraction.ExecutionStatus execution_status = 2;</code>
   */
  aaiextraction.ExecutionStatusOrBuilder getExecutionStatusOrBuilder();

  /**
   * <code>double time_in_ms = 3;</code>
   * @return The timeInMs.
   */
  double getTimeInMs();

  /**
   * <code>repeated .aaiextraction.ExtractionPage pages = 4;</code>
   */
  java.util.List<aaiextraction.ExtractionPage> 
      getPagesList();
  /**
   * <code>repeated .aaiextraction.ExtractionPage pages = 4;</code>
   */
  aaiextraction.ExtractionPage getPages(int index);
  /**
   * <code>repeated .aaiextraction.ExtractionPage pages = 4;</code>
   */
  int getPagesCount();
  /**
   * <code>repeated .aaiextraction.ExtractionPage pages = 4;</code>
   */
  java.util.List<? extends aaiextraction.ExtractionPageOrBuilder> 
      getPagesOrBuilderList();
  /**
   * <code>repeated .aaiextraction.ExtractionPage pages = 4;</code>
   */
  aaiextraction.ExtractionPageOrBuilder getPagesOrBuilder(
      int index);
}
