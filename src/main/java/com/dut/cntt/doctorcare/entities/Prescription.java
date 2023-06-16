package com.dut.cntt.doctorcare.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prescription {
    @Id
    @GeneratedValue(generator = "my_generator")
    @GenericGenerator(name = "my_generator",strategy = "com.dut.cntt.doctorcare.entities.IdPST")
    @Column(name = "id_PST")
    private String idPST;

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
    @Column(name = "total_price")
    private double totalPrice;


    @OneToMany(mappedBy = "prescription")
    @JsonManagedReference
    List<PrescriptionDetail> prescriptionDetails;



}
