package com.dut.cntt.doctorcare.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceMedical {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_service")
    private int idService;


    @Column(name ="name_service")
    private String nameService;

    @Column(name ="price_service")
    private Long priceService;
}
