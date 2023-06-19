package com.dut.cntt.doctorcare.repositories.appointment;

import com.dut.cntt.doctorcare.entities.Appointment;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface IAppointmentRepository extends JpaRepository<Appointment, Long> {
}
