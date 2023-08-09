package com.example.tms.model;

import java.util.Date;

public class Event {
    private String eventName;
    private String eventDescription;
    private int eventImage;

    public Event(String eventName, String eventDescription, int eventImage) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventImage = eventImage;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Event(){}

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public int getEventImage() {
        return eventImage;
    }

    public void setEventImage(int eventImage) {
        this.eventImage = eventImage;
    }
}
