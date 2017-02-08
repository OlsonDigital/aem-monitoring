package com.icfolson.aem.monitoring.reporting.repository;

import com.icfolson.aem.monitoring.core.time.TimeGrouper;
import com.icfolson.aem.monitoring.database.exception.MonitoringDBException;
import com.icfolson.aem.monitoring.reporting.result.MetricsTimeSeries;

public interface MetricsQueryRepository {

    MetricsTimeSeries getMetricData(final short metricId, final TimeGrouper timeGrouper)
        throws MonitoringDBException;

}
