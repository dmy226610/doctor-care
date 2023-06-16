package com.dut.cntt.doctorcare.repositories.history_medical;

import com.dut.cntt.doctorcare.entities.HistoryMedical;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface IHistoryMedicalRepository extends JpaRepository<HistoryMedical, Long> {
}
