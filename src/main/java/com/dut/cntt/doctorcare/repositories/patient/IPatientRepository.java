package com.dut.cntt.doctorcare.repositories.patient;

import com.dut.cntt.doctorcare.entities.Patient;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.time.LocalDate;

@Repository
@Transactional
public interface IPatientRepository extends JpaRepository<Patient, Long> {

    @Modifying
    @Query(value = "INSERT INTO patient(id_patient, user_name, email, avatar_url, phone, name, birthday, address, sex, health_history, blood_type) " +
            "VALUE \n" +
            "            ('100', :userName, :email, :avatarurl, :phone, :name, :birthday, :address, :sex, :healthHistory, :bloodType );", nativeQuery = true)
    void createPatient(@Param("userName") String userName,
                      @Param("email") String email,
                      @Param("avatarurl") String avatarurl,
                      @Param("phone") String phone,
                      @Param("name") String name,
                      @Param("birthday") String birthday,
                      @Param("address") String address,
                      @Param("sex") String sex,
                      @Param("healthHistory") String healthHistory,
                      @Param("bloodType") String bloodType);

}
