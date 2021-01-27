package com.probal.transactionpractice.repository;

import com.probal.transactionpractice.entity.Appoinment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepo extends JpaRepository<Appoinment, Long> {
}
