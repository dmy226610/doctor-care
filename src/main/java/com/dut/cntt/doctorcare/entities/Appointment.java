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
import java.time.LocalTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
    @Id
    @GeneratedValue(generator = "my_generator")
    @GenericGenerator(name = "my_generator",strategy = "com.dut.cntt.doctorcare.entities.IdAPM")
    @Column(name = "id_apm")
    private String idAPM;

    private LocalDate date;

    @JoinColumn(name = "id_doctor",referencedColumnName = "id_doctor")
    @ManyToOne(targetEntity = Doctor.class)
    @JsonBackReference
    private Doctor doctor;

    private int statusAPM;

    @JoinColumn(name = "id_shifts",referencedColumnName = "id_shifts")
    @ManyToOne(targetEntity = Shifts.class)
    @JsonBackReference
    private Shifts shifts;

    @OneToMany(mappedBy = "appointment")
    @JsonManagedReference
    private List<Schedule> schedules;


}
