package com.dut.cntt.doctorcare.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Schedule {
    @Id
    @GeneratedValue(generator = "my_generator")
    @GenericGenerator(name = "my_generator",strategy = "com.dut.cntt.doctorcare.entities.IdSCD")
    @Column(name = "id_SCD")
    private String idSCD;


    @JoinColumn(name = "id_patient", referencedColumnName = "id_patient")
    @ManyToOne(targetEntity = Patient.class)
    @JsonBackReference
    private Patient patient;

    @JoinColumn(name = "id_apm", referencedColumnName = "id_apm")
    @ManyToOne(targetEntity = Appointment.class)
    @JsonBackReference
    private Appointment appointment;

    private LocalDateTime createDate;

    private int statusSCD;
   // private int queueNumber;

}
