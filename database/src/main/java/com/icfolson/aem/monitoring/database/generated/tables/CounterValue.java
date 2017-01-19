/**
 * This class is generated by jOOQ
 */
package com.icfolson.aem.monitoring.database.generated.tables;


import com.icfolson.aem.monitoring.database.generated.Keys;
import com.icfolson.aem.monitoring.database.generated.Monitoring;
import com.icfolson.aem.monitoring.database.generated.tables.records.CounterValueRecord;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CounterValue extends TableImpl<CounterValueRecord> {

    private static final long serialVersionUID = 1358147634;

    /**
     * The reference instance of <code>MONITORING.COUNTER_VALUE</code>
     */
    public static final CounterValue COUNTER_VALUE = new CounterValue();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CounterValueRecord> getRecordType() {
        return CounterValueRecord.class;
    }

    /**
     * The column <code>MONITORING.COUNTER_VALUE.COUNTER_ID</code>.
     */
    public final TableField<CounterValueRecord, Short> COUNTER_ID = createField("COUNTER_ID", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>MONITORING.COUNTER_VALUE.SYSTEM_ID</code>.
     */
    public final TableField<CounterValueRecord, UUID> SYSTEM_ID = createField("SYSTEM_ID", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>MONITORING.COUNTER_VALUE.TIME</code>.
     */
    public final TableField<CounterValueRecord, Long> TIME = createField("TIME", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>MONITORING.COUNTER_VALUE.INCREMENT_VALUE</code>.
     */
    public final TableField<CounterValueRecord, Integer> INCREMENT_VALUE = createField("INCREMENT_VALUE", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>MONITORING.COUNTER_VALUE</code> table reference
     */
    public CounterValue() {
        this("COUNTER_VALUE", null);
    }

    /**
     * Create an aliased <code>MONITORING.COUNTER_VALUE</code> table reference
     */
    public CounterValue(String alias) {
        this(alias, COUNTER_VALUE);
    }

    private CounterValue(String alias, Table<CounterValueRecord> aliased) {
        this(alias, aliased, null);
    }

    private CounterValue(String alias, Table<CounterValueRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Monitoring.MONITORING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CounterValueRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CounterValueRecord, ?>>asList(Keys.CONSTRAINT_E9, Keys.CONSTRAINT_E);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CounterValue as(String alias) {
        return new CounterValue(alias, this);
    }

    /**
     * Rename this table
     */
    public CounterValue rename(String name) {
        return new CounterValue(name, null);
    }
}
