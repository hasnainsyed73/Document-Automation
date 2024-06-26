// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aaiextraction/dto/extraction.proto

package aaiextraction;

public interface TableFeatureOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aaiextraction.TableFeature)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>.aaiextraction.Geometry geometry = 2;</code>
   * @return Whether the geometry field is set.
   */
  boolean hasGeometry();
  /**
   * <code>.aaiextraction.Geometry geometry = 2;</code>
   * @return The geometry.
   */
  aaiextraction.Geometry getGeometry();
  /**
   * <code>.aaiextraction.Geometry geometry = 2;</code>
   */
  aaiextraction.GeometryOrBuilder getGeometryOrBuilder();

  /**
   * <code>repeated .aaiextraction.TableHeaderFeature headers = 3;</code>
   */
  java.util.List<aaiextraction.TableHeaderFeature> 
      getHeadersList();
  /**
   * <code>repeated .aaiextraction.TableHeaderFeature headers = 3;</code>
   */
  aaiextraction.TableHeaderFeature getHeaders(int index);
  /**
   * <code>repeated .aaiextraction.TableHeaderFeature headers = 3;</code>
   */
  int getHeadersCount();
  /**
   * <code>repeated .aaiextraction.TableHeaderFeature headers = 3;</code>
   */
  java.util.List<? extends aaiextraction.TableHeaderFeatureOrBuilder> 
      getHeadersOrBuilderList();
  /**
   * <code>repeated .aaiextraction.TableHeaderFeature headers = 3;</code>
   */
  aaiextraction.TableHeaderFeatureOrBuilder getHeadersOrBuilder(
      int index);

  /**
   * <code>repeated .aaiextraction.TableRowFeature rows = 4;</code>
   */
  java.util.List<aaiextraction.TableRowFeature> 
      getRowsList();
  /**
   * <code>repeated .aaiextraction.TableRowFeature rows = 4;</code>
   */
  aaiextraction.TableRowFeature getRows(int index);
  /**
   * <code>repeated .aaiextraction.TableRowFeature rows = 4;</code>
   */
  int getRowsCount();
  /**
   * <code>repeated .aaiextraction.TableRowFeature rows = 4;</code>
   */
  java.util.List<? extends aaiextraction.TableRowFeatureOrBuilder> 
      getRowsOrBuilderList();
  /**
   * <code>repeated .aaiextraction.TableRowFeature rows = 4;</code>
   */
  aaiextraction.TableRowFeatureOrBuilder getRowsOrBuilder(
      int index);
}
