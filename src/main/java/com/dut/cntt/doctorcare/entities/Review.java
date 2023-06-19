package com.dut.cntt.doctorcare.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_RV")
    private Long idRV;


    @JoinColumn(name = "id_doctor", referencedColumnName = "id_doctor")
    @ManyToOne(targetEntity = Doctor.class)
    @JsonBackReference
    private Doctor doctor;


    @JoinColumn(name = "id_patient", referencedColumnName = "id_patient")
    @ManyToOne(targetEntity = Patient.class)
    @JsonBackReference
    private Patient patient;


    @Column(name = "review_string")
    private String reviewString;

    @Column(name = "rate")
    private int rate;
}
