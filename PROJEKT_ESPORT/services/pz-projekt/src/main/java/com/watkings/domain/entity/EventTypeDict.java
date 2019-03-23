package com.watkings.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "EVENT_TYPE_DICT")
public class EventTypeDict {
    @Id
    @Column(unique = true, nullable = false)
    private int id;

    @Column(length = 45)
    private String eventName;

    public EventTypeDict() {
    }

    public int getId() {
        return id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}
