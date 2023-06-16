package com.dut.cntt.doctorcare.repositories.prescription;

import com.dut.cntt.doctorcare.entities.Prescription;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface IPrescriptionRepository extends JpaRepository<Prescription, Long> {
}
