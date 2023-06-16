package com.dut.cntt.doctorcare.repositories.patient;

import com.dut.cntt.doctorcare.entities.Patient;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.*;

@Repository
@Transactional
public interface IPatientRepository extends JpaRepository<Patient, Long> {
}
