package com.dut.cntt.doctorcare.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorFamily {
    @Id
    @GeneratedValue(generator = "my_generator")
    @GenericGenerator(name = "my_generator", strategy = "com.dut.cntt.doctorcare.entities.IdDF")
    @Column(name = "id_DF")
    private String idDF;

    @JoinColumn(name = "id_doctor", referencedColumnName = "id_doctor")
    @ManyToOne(targetEntity = Doctor.class)
    @JsonBackReference
    private Doctor doctor;


    @JoinColumn(name = "id_patient", referencedColumnName = "id_patient")
    @OneToOne(targetEntity = Patient.class)
    @JsonBackReference
    private Patient patient;


    @Column(name = "create_date")
    private LocalDate createDate;
    @Column(name = "status")
    private int status;
}
