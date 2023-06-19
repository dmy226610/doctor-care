package com.dut.cntt.doctorcare.repositories.doctor;

import com.dut.cntt.doctorcare.entities.Specialist;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface ISpecialistRepository extends JpaRepository<Specialist, Long> {
}
