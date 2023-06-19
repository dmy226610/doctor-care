package com.dut.cntt.doctorcare.repositories.prescription;

import com.dut.cntt.doctorcare.entities.PrescriptionDetail;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface iPrescriptionDetailRepository extends JpaRepository<PrescriptionDetail, Long> {
}
