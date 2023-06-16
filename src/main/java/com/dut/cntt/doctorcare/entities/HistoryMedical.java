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
public class HistoryMedical {
    @Id
    @GeneratedValue(generator = "my_generator")
    @GenericGenerator(name = "my_generator",strategy = "com.dut.cntt.doctorcare.entities.IdHM")
    @Column(name = "id_HM")
    private String idHM;



    @JoinColumn(name = "id_doctor", referencedColumnName = "id_doctor")
    @ManyToOne(targetEntity = Doctor.class)
    @JsonBackReference
    private Doctor doctor;


    @JoinColumn(name = "id_patient", referencedColumnName = "id_patient")
    @ManyToOne(targetEntity = Patient.class)
    @JsonBackReference
    private Patient patient;


    @Column(name = "create_date")
    private LocalDate createDate;
    @Column(name = "symptom")
    private String symptom;
    @Column(name = "diagnosis")
    private String diagnosis;
    @Column(name = "result")
    private String result;

}
