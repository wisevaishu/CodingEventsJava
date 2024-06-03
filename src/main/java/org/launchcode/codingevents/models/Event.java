package org.launchcode.codingevents.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * Created by Chris Bay
 */
@Entity
public class Event extends  AbstractEntity{



    @Size(max = 500, message = "Description too long!")
    private String description;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    private EventType type;

    public Event(String name, String description, String contactEmail, EventType type) {
        this.setName(name);
        this.description = description;
        this.contactEmail = contactEmail;
        this.type = type;
    }

    public Event() {}



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return getName();
    }
}
