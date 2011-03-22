/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.cassandra.db.migration.avro;

@SuppressWarnings("all")
public class Migration extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"Migration\",\"namespace\":\"org.apache.cassandra.db.migration.avro\",\"fields\":[{\"name\":\"old_version\",\"type\":{\"type\":\"fixed\",\"name\":\"UUID\",\"namespace\":\"org.apache.cassandra.utils.avro\",\"size\":16}},{\"name\":\"new_version\",\"type\":\"org.apache.cassandra.utils.avro.UUID\"},{\"name\":\"row_mutation\",\"type\":\"bytes\"},{\"name\":\"classname\",\"type\":\"string\"},{\"name\":\"migration\",\"type\":[{\"type\":\"record\",\"name\":\"AddColumnFamily\",\"fields\":[{\"name\":\"cf\",\"type\":{\"type\":\"record\",\"name\":\"CfDef\",\"fields\":[{\"name\":\"keyspace\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"column_type\",\"type\":[\"string\",\"null\"]},{\"name\":\"comparator_type\",\"type\":[\"string\",\"null\"]},{\"name\":\"subcomparator_type\",\"type\":[\"string\",\"null\"]},{\"name\":\"comment\",\"type\":[\"string\",\"null\"]},{\"name\":\"row_cache_size\",\"type\":[\"double\",\"null\"]},{\"name\":\"key_cache_size\",\"type\":[\"double\",\"null\"]},{\"name\":\"read_repair_chance\",\"type\":[\"double\",\"null\"]},{\"name\":\"replicate_on_write\",\"type\":\"boolean\",\"default\":false},{\"name\":\"gc_grace_seconds\",\"type\":[\"int\",\"null\"]},{\"name\":\"default_validation_class\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"min_compaction_threshold\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"max_compaction_threshold\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"row_cache_save_period_in_seconds\",\"type\":[\"int\",\"null\"],\"default\":0},{\"name\":\"key_cache_save_period_in_seconds\",\"type\":[\"int\",\"null\"],\"default\":3600},{\"name\":\"memtable_flush_after_mins\",\"type\":[\"int\",\"null\"],\"default\":60},{\"name\":\"memtable_throughput_in_mb\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"memtable_operations_in_millions\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"id\",\"type\":[\"int\",\"null\"]},{\"name\":\"column_metadata\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ColumnDef\",\"fields\":[{\"name\":\"name\",\"type\":\"bytes\"},{\"name\":\"validation_class\",\"type\":\"string\"},{\"name\":\"index_type\",\"type\":[{\"type\":\"enum\",\"name\":\"IndexType\",\"symbols\":[\"KEYS\"],\"aliases\":[\"org.apache.cassandra.config.avro.IndexType\"]},\"null\"]},{\"name\":\"index_name\",\"type\":[\"string\",\"null\"]}],\"aliases\":[\"org.apache.cassandra.config.avro.ColumnDef\"]}},\"null\"]}],\"aliases\":[\"org.apache.cassandra.config.avro.CfDef\"]}}]},{\"type\":\"record\",\"name\":\"DropColumnFamily\",\"fields\":[{\"name\":\"ksname\",\"type\":\"string\"},{\"name\":\"cfname\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"RenameColumnFamily\",\"fields\":[{\"name\":\"ksname\",\"type\":\"string\"},{\"name\":\"cfid\",\"type\":\"int\"},{\"name\":\"old_cfname\",\"type\":\"string\"},{\"name\":\"new_cfname\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"AddKeyspace\",\"fields\":[{\"name\":\"ks\",\"type\":{\"type\":\"record\",\"name\":\"KsDef\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"strategy_class\",\"type\":\"string\"},{\"name\":\"strategy_options\",\"type\":[{\"type\":\"map\",\"values\":\"string\"},\"null\"]},{\"name\":\"replication_factor\",\"type\":\"int\"},{\"name\":\"cf_defs\",\"type\":{\"type\":\"array\",\"items\":\"CfDef\"}}],\"aliases\":[\"org.apache.cassandra.config.avro.KsDef\"]}}]},{\"type\":\"record\",\"name\":\"DropKeyspace\",\"fields\":[{\"name\":\"ksname\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"RenameKeyspace\",\"fields\":[{\"name\":\"old_ksname\",\"type\":\"string\"},{\"name\":\"new_ksname\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"UpdateKeyspace\",\"fields\":[{\"name\":\"oldKs\",\"type\":\"KsDef\"},{\"name\":\"newKs\",\"type\":\"KsDef\"}]},{\"type\":\"record\",\"name\":\"UpdateColumnFamily\",\"fields\":[{\"name\":\"metadata\",\"type\":\"CfDef\"}]}]}]}");
  public org.apache.cassandra.utils.avro.UUID old_version;
  public org.apache.cassandra.utils.avro.UUID new_version;
  public java.nio.ByteBuffer row_mutation;
  public java.lang.CharSequence classname;
  public java.lang.Object migration;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return old_version;
    case 1: return new_version;
    case 2: return row_mutation;
    case 3: return classname;
    case 4: return migration;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: old_version = (org.apache.cassandra.utils.avro.UUID)value$; break;
    case 1: new_version = (org.apache.cassandra.utils.avro.UUID)value$; break;
    case 2: row_mutation = (java.nio.ByteBuffer)value$; break;
    case 3: classname = (java.lang.CharSequence)value$; break;
    case 4: migration = (java.lang.Object)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}
