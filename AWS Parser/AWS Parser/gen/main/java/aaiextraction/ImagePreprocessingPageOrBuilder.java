// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aaiextraction/dto/imagePreprocessing.proto

package aaiextraction;

public interface ImagePreprocessingPageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aaiextraction.ImagePreprocessingPage)
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
   * <code>bool deskew = 2;</code>
   * @return The deskew.
   */
  boolean getDeskew();

  /**
   * <code>bool orientation = 3;</code>
   * @return The orientation.
   */
  boolean getOrientation();

  /**
   * <code>int32 render_dpi = 4;</code>
   * @return The renderDpi.
   */
  int getRenderDpi();

  /**
   * <code>int32 width = 5;</code>
   * @return The width.
   */
  int getWidth();

  /**
   * <code>int32 height = 6;</code>
   * @return The height.
   */
  int getHeight();
}
