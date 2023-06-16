package com.dut.cntt.doctorcare.repositories.service_medical;

import com.dut.cntt.doctorcare.entities.ServiceMedical;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface IServiceMedicalRepository extends JpaRepository<ServiceMedical, Long> {
}
