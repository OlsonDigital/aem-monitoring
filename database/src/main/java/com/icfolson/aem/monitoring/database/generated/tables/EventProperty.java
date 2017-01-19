/**
 * This class is generated by jOOQ
 */
package com.icfolson.aem.monitoring.database.generated.tables;


import com.icfolson.aem.monitoring.database.generated.Keys;
import com.icfolson.aem.monitoring.database.generated.Monitoring;
import com.icfolson.aem.monitoring.database.generated.tables.records.EventPropertyRecord;

import java.util.Arrays;
import java.util.List;

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
public class EventProperty extends TableImpl<EventPropertyRecord> {

    private static final long serialVersionUID = -345332337;

    /**
     * The reference instance of <code>MONITORING.EVENT_PROPERTY</code>
     */
    public static final EventProperty EVENT_PROPERTY = new EventProperty();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventPropertyRecord> getRecordType() {
        return EventPropertyRecord.class;
    }

    /**
     * The column <code>MONITORING.EVENT_PROPERTY.EVENT_ID</code>.
     */
    public final TableField<EventPropertyRecord, Long> EVENT_ID = createField("EVENT_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>MONITORING.EVENT_PROPERTY.NAME</code>.
     */
    public final TableField<EventPropertyRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false), this, "");

    /**
     * The column <code>MONITORING.EVENT_PROPERTY.VALUE</code>.
     */
    public final TableField<EventPropertyRecord, String> VALUE = createField("VALUE", org.jooq.impl.SQLDataType.VARCHAR.length(4096), this, "");

    /**
     * The column <code>MONITORING.EVENT_PROPERTY.REALVALUE</code>.
     */
    public final TableField<EventPropertyRecord, Float> REALVALUE = createField("REALVALUE", org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * Create a <code>MONITORING.EVENT_PROPERTY</code> table reference
     */
    public EventProperty() {
        this("EVENT_PROPERTY", null);
    }

    /**
     * Create an aliased <code>MONITORING.EVENT_PROPERTY</code> table reference
     */
    public EventProperty(String alias) {
        this(alias, EVENT_PROPERTY);
    }

    private EventProperty(String alias, Table<EventPropertyRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventProperty(String alias, Table<EventPropertyRecord> aliased, Field<?>[] parameters) {
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
    public List<ForeignKey<EventPropertyRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<EventPropertyRecord, ?>>asList(Keys.CONSTRAINT_92);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventProperty as(String alias) {
        return new EventProperty(alias, this);
    }

    /**
     * Rename this table
     */
    public EventProperty rename(String name) {
        return new EventProperty(name, null);
    }
}
