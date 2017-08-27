package com.gohiram.haj.trackerrestservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Devices")
public class Device {

    @Id
    String id;

    long userId;

    public Device()
    {

    }
    public Device(String id, long userId)
    {
        this.id=id;
        this.userId=userId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
