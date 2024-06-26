// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aaiextraction/dto/extraction.proto

package aaiextraction;

public interface TableRowFeatureOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aaiextraction.TableRowFeature)
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
   * <code>.aaiextraction.Geometry geometry = 3;</code>
   * @return Whether the geometry field is set.
   */
  boolean hasGeometry();
  /**
   * <code>.aaiextraction.Geometry geometry = 3;</code>
   * @return The geometry.
   */
  aaiextraction.Geometry getGeometry();
  /**
   * <code>.aaiextraction.Geometry geometry = 3;</code>
   */
  aaiextraction.GeometryOrBuilder getGeometryOrBuilder();

  /**
   * <code>repeated .aaiextraction.TableCellFeature cells = 4;</code>
   */
  java.util.List<aaiextraction.TableCellFeature> 
      getCellsList();
  /**
   * <code>repeated .aaiextraction.TableCellFeature cells = 4;</code>
   */
  aaiextraction.TableCellFeature getCells(int index);
  /**
   * <code>repeated .aaiextraction.TableCellFeature cells = 4;</code>
   */
  int getCellsCount();
  /**
   * <code>repeated .aaiextraction.TableCellFeature cells = 4;</code>
   */
  java.util.List<? extends aaiextraction.TableCellFeatureOrBuilder> 
      getCellsOrBuilderList();
  /**
   * <code>repeated .aaiextraction.TableCellFeature cells = 4;</code>
   */
  aaiextraction.TableCellFeatureOrBuilder getCellsOrBuilder(
      int index);

  /**
   * <code>int32 page_num = 5;</code>
   * @return The pageNum.
   */
  int getPageNum();
}
