package com.dut.cntt.doctorcare.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Specialist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_SPL")
    private Long idSPL;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "specialist")
    @JsonManagedReference
    List<Doctor> doctors;
}
