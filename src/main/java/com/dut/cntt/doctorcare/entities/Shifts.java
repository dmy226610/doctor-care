package com.dut.cntt.doctorcare.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shifts {
    @Id
    @GeneratedValue(generator = "my_generator")
    @GenericGenerator(name = "my_generator",strategy = "com.dut.cntt.doctorcare.entities.IdShifts")
    @Column(name = "id_shifts")
    private Long idShifts;

    @Column(name = "shifts_name")
    private String shiftsName;

    @OneToMany(mappedBy = "shifts")
    @JsonManagedReference
    List<Appointment> appointments;


}
