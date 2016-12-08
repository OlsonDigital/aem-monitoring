package com.icfolson.aem.monitoring.core.writer;

import com.icfolson.aem.monitoring.core.model.MonitoringCounter;
import com.icfolson.aem.monitoring.core.model.MonitoringEvent;
import com.icfolson.aem.monitoring.core.model.MonitoringMetric;

public interface MonitoringWriter {

    void writeEvent(final MonitoringEvent event);

    void writeMetric(final MonitoringMetric metric);

    void incrementCounter(final MonitoringCounter counter);

}
