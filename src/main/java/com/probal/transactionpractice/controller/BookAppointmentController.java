package com.probal.transactionpractice.controller;


import com.probal.transactionpractice.controller.dto.AppointmentFormDto;
import com.probal.transactionpractice.service.BookAppoinmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookAppointmentController {

    @Autowired
    private BookAppoinmentService appoinmentService;


    @PostMapping("/book")
    public String bookAppoinment(@RequestBody AppointmentFormDto appointmentFormDto) {

        return appoinmentService.bookAppoinment(appointmentFormDto);
    }
}
