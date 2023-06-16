package com.dut.cntt.doctorcare.repositories.review;

import com.dut.cntt.doctorcare.entities.Review;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface IReviewRepository extends JpaRepository<Review, Long> {
}
