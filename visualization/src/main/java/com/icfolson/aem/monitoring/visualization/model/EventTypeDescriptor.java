package com.icfolson.aem.monitoring.visualization.model;

import com.icfolson.aem.monitoring.database.util.NameUtil;

import java.util.ArrayList;
import java.util.List;

public class EventTypeDescriptor {

    private final short id;
    private final String name;
    private final List<EventPropertyDescriptor> properties = new ArrayList<>();

    public EventTypeDescriptor(final short id, final String name) {
        this.id = id;
        this.name = NameUtil.toName(name).getJoined('.');
    }

    public short getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<EventPropertyDescriptor> getProperties() {
        return properties;
    }
}
