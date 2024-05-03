// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aaiextraction/dto/imagePreprocessing.proto

package aaiextraction;

public interface ImagePreprocessingMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aaiextraction.ImagePreprocessingMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string documentId = 1;</code>
   * @return The documentId.
   */
  java.lang.String getDocumentId();
  /**
   * <code>string documentId = 1;</code>
   * @return The bytes for documentId.
   */
  com.google.protobuf.ByteString
      getDocumentIdBytes();

  /**
   * <code>string filepath = 2;</code>
   * @return The filepath.
   */
  java.lang.String getFilepath();
  /**
   * <code>string filepath = 2;</code>
   * @return The bytes for filepath.
   */
  com.google.protobuf.ByteString
      getFilepathBytes();

  /**
   * <code>.aaiextraction.ExecutionStatus execution_status = 3;</code>
   * @return Whether the executionStatus field is set.
   */
  boolean hasExecutionStatus();
  /**
   * <code>.aaiextraction.ExecutionStatus execution_status = 3;</code>
   * @return The executionStatus.
   */
  aaiextraction.ExecutionStatus getExecutionStatus();
  /**
   * <code>.aaiextraction.ExecutionStatus execution_status = 3;</code>
   */
  aaiextraction.ExecutionStatusOrBuilder getExecutionStatusOrBuilder();

  /**
   * <code>double time_in_ms = 4;</code>
   * @return The timeInMs.
   */
  double getTimeInMs();
}