package com.probal.transactionpractice.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.probal.transactionpractice.controller.dto.AppointmentFormDto;
import com.probal.transactionpractice.entity.Appoinment;
import com.probal.transactionpractice.entity.Patient;
import com.probal.transactionpractice.repository.AppointmentRepo;
import com.probal.transactionpractice.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;

@Service
@Transactional          // TODO : [info] -- >> It prevents the store data if all service logic doesn't applied
public class BookAppoinmentService {

    @Autowired
    private PatientRepo patientRepo;

    @Autowired
    private AppointmentRepo appointmentRepo;

    public String bookAppoinment(AppointmentFormDto appointmentFormDto) {


        // TODO --> Mapping PatientDto with Patient Entity

        Patient patient = new ObjectMapper().convertValue(appointmentFormDto, Patient.class);
        long patientId = patientRepo.save(patient).getPatientNo();
        System.out.println("Patient saved successfully with id no : " + patientId);

        Date dateValue = new Date(System.currentTimeMillis());

        Appoinment appoinment = new Appoinment(dateValue, 101l, patientId);

        Long appointmentId = appointmentRepo.save(appoinment).getAppoinmentNo();

        return "Appointment booked successfully with id : " + appointmentId;
    }
}
