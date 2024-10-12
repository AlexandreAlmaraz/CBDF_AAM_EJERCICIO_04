package com.upiiz.Users.models;

public class User {
    private Long id;
    private String name;
    private String contactName;
    private String phoneNumber;


    public User(Long id, String name, String contact_name, String phone_number) {
        this.id = id;
        this.name = name;
        this.contactName = contact_name;
        this.phoneNumber = phone_number;
    }
    public User(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact_name() {
        return contactName;
    }

    public void setContact_name(String contact_name) {
        this.contactName = contact_name;
    }

    public String getPhone_number() {
        return phoneNumber;
    }

    public void setPhone_number(String phone_number) {
        this.phoneNumber = phone_number;
    }
}
