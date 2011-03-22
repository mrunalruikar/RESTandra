/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.cassandra.hadoop.avro;

@SuppressWarnings("all")
public class Deletion extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"Deletion\",\"namespace\":\"org.apache.cassandra.hadoop.avro\",\"fields\":[{\"name\":\"timestamp\",\"type\":\"long\"},{\"name\":\"super_column\",\"type\":[\"bytes\",\"null\"]},{\"name\":\"predicate\",\"type\":[{\"type\":\"record\",\"name\":\"SlicePredicate\",\"fields\":[{\"name\":\"column_names\",\"type\":[{\"type\":\"array\",\"items\":\"bytes\"},\"null\"]},{\"name\":\"slice_range\",\"type\":[{\"type\":\"record\",\"name\":\"SliceRange\",\"fields\":[{\"name\":\"start\",\"type\":\"bytes\"},{\"name\":\"finish\",\"type\":\"bytes\"},{\"name\":\"reversed\",\"type\":\"boolean\"},{\"name\":\"count\",\"type\":\"int\"},{\"name\":\"bitmasks\",\"type\":[{\"type\":\"array\",\"items\":\"bytes\"},\"null\"]}]},\"null\"]}]},\"null\"]}]}");
  public long timestamp;
  public java.nio.ByteBuffer super_column;
  public org.apache.cassandra.hadoop.avro.SlicePredicate predicate;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return timestamp;
    case 1: return super_column;
    case 2: return predicate;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: timestamp = (java.lang.Long)value$; break;
    case 1: super_column = (java.nio.ByteBuffer)value$; break;
    case 2: predicate = (org.apache.cassandra.hadoop.avro.SlicePredicate)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}