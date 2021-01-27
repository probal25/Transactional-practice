package com.probal.transactionpractice.entity;


import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "apmnt_tbl")
public class Appoinment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "apmnt_no")
    private Long appoinmentNo;

    @Column(name = "date")
    @CreationTimestamp
    private Date date;

    @Column(name = "doctor_no")
    private Long doctorNo;

    @Column(name = "patient_no")
    private Long patientNo;

    public Appoinment() { }

    public Appoinment(Date date, Long doctorNo, Long patientNo) {
        this.date = date;
        this.doctorNo = doctorNo;
        this.patientNo = patientNo;
    }

    @Override
    public String toString() {
        return "Appoinment{" +
                "appoinmentNo='" + appoinmentNo + '\'' +
                ", date=" + date +
                ", doctorNo=" + doctorNo +
                ", patientNo=" + patientNo +
                '}';
    }

    public Long getAppoinmentNo() {
        return appoinmentNo;
    }

    public void setAppoinmentNo(Long appoinmentNo) {
        this.appoinmentNo = appoinmentNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getDoctorNo() {
        return doctorNo;
    }

    public void setDoctorNo(Long doctorNo) {
        this.doctorNo = doctorNo;
    }

    public Long getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(Long patientNo) {
        this.patientNo = patientNo;
    }
}
