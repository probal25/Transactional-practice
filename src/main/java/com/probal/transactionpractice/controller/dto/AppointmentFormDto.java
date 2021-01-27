package com.probal.transactionpractice.controller.dto;

public class AppointmentFormDto {

    private String name;
    private String gender;
    private String mobile;
    private int age;

    public AppointmentFormDto() { }

    public AppointmentFormDto(String name, String gender, String mobile, int age) {
        this.name = name;
        this.gender = gender;
        this.mobile = mobile;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
