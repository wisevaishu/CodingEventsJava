package org.launchcode.codingevents.models;

import jakarta.persistence.Entity;

/**
 * Created by Chris Bay
 */
@Entity
public class EventCategory extends AbstractEntity{

    public EventCategory(String name) {
        this.setName(name);
    }

    public EventCategory() {}

    @Override
    public String toString() {
        return getName();
    }
}

