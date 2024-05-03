// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aaiextraction/dto/ocr.proto

package aaiextraction;

public interface OcrMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aaiextraction.OcrMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.aaiextraction.ExecutionStatus execution_status = 1;</code>
   * @return Whether the executionStatus field is set.
   */
  boolean hasExecutionStatus();
  /**
   * <code>.aaiextraction.ExecutionStatus execution_status = 1;</code>
   * @return The executionStatus.
   */
  aaiextraction.ExecutionStatus getExecutionStatus();
  /**
   * <code>.aaiextraction.ExecutionStatus execution_status = 1;</code>
   */
  aaiextraction.ExecutionStatusOrBuilder getExecutionStatusOrBuilder();

  /**
   * <code>int32 number_of_pages = 2;</code>
   * @return The numberOfPages.
   */
  int getNumberOfPages();

  /**
   * <code>.aaiextraction.OcrLearningInstanceSetting learning_instance_setting = 3;</code>
   * @return Whether the learningInstanceSetting field is set.
   */
  boolean hasLearningInstanceSetting();
  /**
   * <code>.aaiextraction.OcrLearningInstanceSetting learning_instance_setting = 3;</code>
   * @return The learningInstanceSetting.
   */
  aaiextraction.OcrLearningInstanceSetting getLearningInstanceSetting();
  /**
   * <code>.aaiextraction.OcrLearningInstanceSetting learning_instance_setting = 3;</code>
   */
  aaiextraction.OcrLearningInstanceSettingOrBuilder getLearningInstanceSettingOrBuilder();

  /**
   * <code>double time_in_ms = 4;</code>
   * @return The timeInMs.
   */
  double getTimeInMs();

  /**
   * <code>repeated .aaiextraction.OcrMetadataPage pages = 5;</code>
   */
  java.util.List<aaiextraction.OcrMetadataPage> 
      getPagesList();
  /**
   * <code>repeated .aaiextraction.OcrMetadataPage pages = 5;</code>
   */
  aaiextraction.OcrMetadataPage getPages(int index);
  /**
   * <code>repeated .aaiextraction.OcrMetadataPage pages = 5;</code>
   */
  int getPagesCount();
  /**
   * <code>repeated .aaiextraction.OcrMetadataPage pages = 5;</code>
   */
  java.util.List<? extends aaiextraction.OcrMetadataPageOrBuilder> 
      getPagesOrBuilderList();
  /**
   * <code>repeated .aaiextraction.OcrMetadataPage pages = 5;</code>
   */
  aaiextraction.OcrMetadataPageOrBuilder getPagesOrBuilder(
      int index);
}
