package com.icfolson.aem.monitoring.core.model;

import java.time.LocalDateTime;
import java.util.Map;

public interface MonitoringEvent {

    /**
     * @return The event type
     */
    String getType();

    /**
     * @return The event time
     */
    LocalDateTime getTimestamp();

    void setProperty(final String name, final Object value);

    /**
     * @return The event properties
     */
    Map<String, Object> getProperties();

}
