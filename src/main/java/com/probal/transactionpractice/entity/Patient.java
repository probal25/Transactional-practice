package com.probal.transactionpractice.entity;


import javax.persistence.*;

@Entity
@Table(name = "pat_tbl")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_no")
    private Long patientNo;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "age")
    private int age;

    public Patient() { }

    public Patient(String name, String gender, String mobile, int age) {
        this.name = name;
        this.gender = gender;
        this.mobile = mobile;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientNo='" + patientNo + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", mobile='" + mobile + '\'' +
                ", age=" + age +
                '}';
    }

    public Long getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(Long patientNo) {
        this.patientNo = patientNo;
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
