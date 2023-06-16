package com.dut.cntt.doctorcare.repositories.doctor_family;

import com.dut.cntt.doctorcare.entities.DoctorFamily;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface IDoctorFamilyRepository extends JpaRepository<DoctorFamily,Long> {
}
