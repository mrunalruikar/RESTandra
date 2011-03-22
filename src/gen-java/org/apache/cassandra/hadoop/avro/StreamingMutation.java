/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.cassandra.hadoop.avro;

@SuppressWarnings("all")
public class StreamingMutation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"StreamingMutation\",\"namespace\":\"org.apache.cassandra.hadoop.avro\",\"fields\":[{\"name\":\"key\",\"type\":\"bytes\"},{\"name\":\"mutation\",\"type\":{\"type\":\"record\",\"name\":\"Mutation\",\"fields\":[{\"name\":\"column_or_supercolumn\",\"type\":[{\"type\":\"record\",\"name\":\"ColumnOrSuperColumn\",\"fields\":[{\"name\":\"column\",\"type\":[{\"type\":\"record\",\"name\":\"Column\",\"fields\":[{\"name\":\"name\",\"type\":\"bytes\"},{\"name\":\"value\",\"type\":\"bytes\"},{\"name\":\"timestamp\",\"type\":\"long\"},{\"name\":\"ttl\",\"type\":[\"int\",\"null\"]}]},\"null\"]},{\"name\":\"super_column\",\"type\":[{\"type\":\"record\",\"name\":\"SuperColumn\",\"fields\":[{\"name\":\"name\",\"type\":\"bytes\"},{\"name\":\"columns\",\"type\":{\"type\":\"array\",\"items\":\"Column\"}}]},\"null\"]}]},\"null\"]},{\"name\":\"deletion\",\"type\":[{\"type\":\"record\",\"name\":\"Deletion\",\"fields\":[{\"name\":\"timestamp\",\"type\":\"long\"},{\"name\":\"super_column\",\"type\":[\"bytes\",\"null\"]},{\"name\":\"predicate\",\"type\":[{\"type\":\"record\",\"name\":\"SlicePredicate\",\"fields\":[{\"name\":\"column_names\",\"type\":[{\"type\":\"array\",\"items\":\"bytes\"},\"null\"]},{\"name\":\"slice_range\",\"type\":[{\"type\":\"record\",\"name\":\"SliceRange\",\"fields\":[{\"name\":\"start\",\"type\":\"bytes\"},{\"name\":\"finish\",\"type\":\"bytes\"},{\"name\":\"reversed\",\"type\":\"boolean\"},{\"name\":\"count\",\"type\":\"int\"},{\"name\":\"bitmasks\",\"type\":[{\"type\":\"array\",\"items\":\"bytes\"},\"null\"]}]},\"null\"]}]},\"null\"]}]},\"null\"]}]}}]}");
  public java.nio.ByteBuffer key;
  public org.apache.cassandra.hadoop.avro.Mutation mutation;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return key;
    case 1: return mutation;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: key = (java.nio.ByteBuffer)value$; break;
    case 1: mutation = (org.apache.cassandra.hadoop.avro.Mutation)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}
