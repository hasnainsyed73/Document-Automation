// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aaiextraction/dto/docDetect.proto

package aaiextraction;

public interface DocDetectMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aaiextraction.DocDetectMetadata)
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
   * <code>double time_in_ms = 2;</code>
   * @return The timeInMs.
   */
  double getTimeInMs();
}
