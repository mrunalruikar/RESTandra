/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.cassandra.db.migration.avro;

@SuppressWarnings("all")
public class UpdateKeyspace extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"UpdateKeyspace\",\"namespace\":\"org.apache.cassandra.db.migration.avro\",\"fields\":[{\"name\":\"oldKs\",\"type\":{\"type\":\"record\",\"name\":\"KsDef\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"strategy_class\",\"type\":\"string\"},{\"name\":\"strategy_options\",\"type\":[{\"type\":\"map\",\"values\":\"string\"},\"null\"]},{\"name\":\"replication_factor\",\"type\":\"int\"},{\"name\":\"cf_defs\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"CfDef\",\"fields\":[{\"name\":\"keyspace\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"column_type\",\"type\":[\"string\",\"null\"]},{\"name\":\"comparator_type\",\"type\":[\"string\",\"null\"]},{\"name\":\"subcomparator_type\",\"type\":[\"string\",\"null\"]},{\"name\":\"comment\",\"type\":[\"string\",\"null\"]},{\"name\":\"row_cache_size\",\"type\":[\"double\",\"null\"]},{\"name\":\"key_cache_size\",\"type\":[\"double\",\"null\"]},{\"name\":\"read_repair_chance\",\"type\":[\"double\",\"null\"]},{\"name\":\"replicate_on_write\",\"type\":\"boolean\",\"default\":false},{\"name\":\"gc_grace_seconds\",\"type\":[\"int\",\"null\"]},{\"name\":\"default_validation_class\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"min_compaction_threshold\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"max_compaction_threshold\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"row_cache_save_period_in_seconds\",\"type\":[\"int\",\"null\"],\"default\":0},{\"name\":\"key_cache_save_period_in_seconds\",\"type\":[\"int\",\"null\"],\"default\":3600},{\"name\":\"memtable_flush_after_mins\",\"type\":[\"int\",\"null\"],\"default\":60},{\"name\":\"memtable_throughput_in_mb\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"memtable_operations_in_millions\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"id\",\"type\":[\"int\",\"null\"]},{\"name\":\"column_metadata\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ColumnDef\",\"fields\":[{\"name\":\"name\",\"type\":\"bytes\"},{\"name\":\"validation_class\",\"type\":\"string\"},{\"name\":\"index_type\",\"type\":[{\"type\":\"enum\",\"name\":\"IndexType\",\"symbols\":[\"KEYS\"],\"aliases\":[\"org.apache.cassandra.config.avro.IndexType\"]},\"null\"]},{\"name\":\"index_name\",\"type\":[\"string\",\"null\"]}],\"aliases\":[\"org.apache.cassandra.config.avro.ColumnDef\"]}},\"null\"]}],\"aliases\":[\"org.apache.cassandra.config.avro.CfDef\"]}}}],\"aliases\":[\"org.apache.cassandra.config.avro.KsDef\"]}},{\"name\":\"newKs\",\"type\":\"KsDef\"}]}");
  public org.apache.cassandra.db.migration.avro.KsDef oldKs;
  public org.apache.cassandra.db.migration.avro.KsDef newKs;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return oldKs;
    case 1: return newKs;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: oldKs = (org.apache.cassandra.db.migration.avro.KsDef)value$; break;
    case 1: newKs = (org.apache.cassandra.db.migration.avro.KsDef)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}
