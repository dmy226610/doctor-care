package com.dut.cntt.doctorcare.repositories.doctor;

import com.dut.cntt.doctorcare.entities.Doctor;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface IDoctorRepository extends JpaRepository<Doctor, Long> {
}
