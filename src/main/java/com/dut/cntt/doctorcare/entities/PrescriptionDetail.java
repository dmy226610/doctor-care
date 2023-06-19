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
public class PrescriptionDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_PSTD")
    private Long idPSTD;


    @Column(name = "drug_name")
    private String drugName;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "price")
    private double price;

    @JoinColumn(name = "id_PST", referencedColumnName = "id_PST")
    @ManyToOne(targetEntity = Prescription.class)
    @JsonBackReference
    private Prescription prescription;
}
