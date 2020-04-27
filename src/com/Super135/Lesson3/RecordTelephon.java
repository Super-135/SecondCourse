package com.Super135.Lesson3;

public class RecordTelephon {

    private String name, id;
    private String phone;

    public RecordTelephon(String name, String id, String phone) {
        this.name = name;
        this.id = id;
        this.phone = phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
