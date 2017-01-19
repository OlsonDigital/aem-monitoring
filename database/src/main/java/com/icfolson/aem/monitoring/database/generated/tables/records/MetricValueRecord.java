/**
 * This class is generated by jOOQ
 */
package com.icfolson.aem.monitoring.database.generated.tables.records;


import com.icfolson.aem.monitoring.database.generated.tables.MetricValue;

import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


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
public class MetricValueRecord extends TableRecordImpl<MetricValueRecord> implements Record4<Short, UUID, Long, Float> {

    private static final long serialVersionUID = 420301256;

    /**
     * Setter for <code>MONITORING.METRIC_VALUE.METRIC_ID</code>.
     */
    public void setMetricId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>MONITORING.METRIC_VALUE.METRIC_ID</code>.
     */
    public Short getMetricId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>MONITORING.METRIC_VALUE.SYSTEM_ID</code>.
     */
    public void setSystemId(UUID value) {
        set(1, value);
    }

    /**
     * Getter for <code>MONITORING.METRIC_VALUE.SYSTEM_ID</code>.
     */
    public UUID getSystemId() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>MONITORING.METRIC_VALUE.TIME</code>.
     */
    public void setTime(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>MONITORING.METRIC_VALUE.TIME</code>.
     */
    public Long getTime() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>MONITORING.METRIC_VALUE.METRIC_VALUE</code>.
     */
    public void setMetricValue(Float value) {
        set(3, value);
    }

    /**
     * Getter for <code>MONITORING.METRIC_VALUE.METRIC_VALUE</code>.
     */
    public Float getMetricValue() {
        return (Float) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Short, UUID, Long, Float> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Short, UUID, Long, Float> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field1() {
        return MetricValue.METRIC_VALUE.METRIC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field2() {
        return MetricValue.METRIC_VALUE.SYSTEM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return MetricValue.METRIC_VALUE.TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Float> field4() {
        return MetricValue.METRIC_VALUE.METRIC_VALUE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value1() {
        return getMetricId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value2() {
        return getSystemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Float value4() {
        return getMetricValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetricValueRecord value1(Short value) {
        setMetricId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetricValueRecord value2(UUID value) {
        setSystemId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetricValueRecord value3(Long value) {
        setTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetricValueRecord value4(Float value) {
        setMetricValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetricValueRecord values(Short value1, UUID value2, Long value3, Float value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MetricValueRecord
     */
    public MetricValueRecord() {
        super(MetricValue.METRIC_VALUE);
    }

    /**
     * Create a detached, initialised MetricValueRecord
     */
    public MetricValueRecord(Short metricId, UUID systemId, Long time, Float metricValue) {
        super(MetricValue.METRIC_VALUE);

        set(0, metricId);
        set(1, systemId);
        set(2, time);
        set(3, metricValue);
    }
}
