/**
 * This class is generated by jOOQ
 */
package com.icfolson.aem.monitoring.database.generated;


import com.icfolson.aem.monitoring.database.generated.tables.Counter;
import com.icfolson.aem.monitoring.database.generated.tables.CounterValue;
import com.icfolson.aem.monitoring.database.generated.tables.Event;
import com.icfolson.aem.monitoring.database.generated.tables.EventProperty;
import com.icfolson.aem.monitoring.database.generated.tables.EventType;
import com.icfolson.aem.monitoring.database.generated.tables.Metric;
import com.icfolson.aem.monitoring.database.generated.tables.MetricValue;
import com.icfolson.aem.monitoring.database.generated.tables.System;
import com.icfolson.aem.monitoring.database.generated.tables.SystemProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Monitoring extends SchemaImpl {

    private static final long serialVersionUID = 1403693695;

    /**
     * The reference instance of <code>MONITORING</code>
     */
    public static final Monitoring MONITORING = new Monitoring();

    /**
     * The table <code>MONITORING.SYSTEM</code>.
     */
    public final System SYSTEM = com.icfolson.aem.monitoring.database.generated.tables.System.SYSTEM;

    /**
     * The table <code>MONITORING.SYSTEM_PROPERTY</code>.
     */
    public final SystemProperty SYSTEM_PROPERTY = com.icfolson.aem.monitoring.database.generated.tables.SystemProperty.SYSTEM_PROPERTY;

    /**
     * The table <code>MONITORING.EVENT_TYPE</code>.
     */
    public final EventType EVENT_TYPE = com.icfolson.aem.monitoring.database.generated.tables.EventType.EVENT_TYPE;

    /**
     * The table <code>MONITORING.EVENT</code>.
     */
    public final Event EVENT = com.icfolson.aem.monitoring.database.generated.tables.Event.EVENT;

    /**
     * The table <code>MONITORING.EVENT_PROPERTY</code>.
     */
    public final EventProperty EVENT_PROPERTY = com.icfolson.aem.monitoring.database.generated.tables.EventProperty.EVENT_PROPERTY;

    /**
     * The table <code>MONITORING.COUNTER</code>.
     */
    public final Counter COUNTER = com.icfolson.aem.monitoring.database.generated.tables.Counter.COUNTER;

    /**
     * The table <code>MONITORING.COUNTER_VALUE</code>.
     */
    public final CounterValue COUNTER_VALUE = com.icfolson.aem.monitoring.database.generated.tables.CounterValue.COUNTER_VALUE;

    /**
     * The table <code>MONITORING.METRIC</code>.
     */
    public final Metric METRIC = com.icfolson.aem.monitoring.database.generated.tables.Metric.METRIC;

    /**
     * The table <code>MONITORING.METRIC_VALUE</code>.
     */
    public final MetricValue METRIC_VALUE = com.icfolson.aem.monitoring.database.generated.tables.MetricValue.METRIC_VALUE;

    /**
     * No further instances allowed
     */
    private Monitoring() {
        super("MONITORING", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.SYSTEM_SEQUENCE_0FCBD5AF_7E19_40A2_A96B_523939D3E323,
            Sequences.SYSTEM_SEQUENCE_4D38F245_6459_4B09_8554_3D91F7B32732,
            Sequences.SYSTEM_SEQUENCE_C623ED94_B8C0_4919_A139_3CEDBDDD12C8,
            Sequences.SYSTEM_SEQUENCE_F12265B4_F0B5_4DBD_9392_E26DAED8635C);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            System.SYSTEM,
            SystemProperty.SYSTEM_PROPERTY,
            EventType.EVENT_TYPE,
            Event.EVENT,
            EventProperty.EVENT_PROPERTY,
            Counter.COUNTER,
            CounterValue.COUNTER_VALUE,
            Metric.METRIC,
            MetricValue.METRIC_VALUE);
    }
}
