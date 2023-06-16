package com.dut.cntt.doctorcare.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Doctor {
    @Id
    @GeneratedValue(generator = "my_generator")
    @GenericGenerator(name = "my_generator",strategy = "com.dut.cntt.doctorcare.entities.IdDoctor")
    @Column(name = "id_doctor")
    private String idDoctor;

    @JoinColumn(name = "email", referencedColumnName = "email")
    @OneToOne(fetch = FetchType.LAZY)
    private Account account;

    @Column(name = "phone")
    private String phone;
    @Column(name = "name")
    private String name;
    @Column(name = "birthday")
    private LocalDate birthday;
    @Column(name = "address")
    private String address;
    @Column(name = "sex")
    private String sex;
    @Column(name = "average_rate")
    private double averageRate;

    @JoinColumn(name = "id_SPL", referencedColumnName = "id_SPL")
    @ManyToOne(targetEntity = Specialist.class,fetch = FetchType.LAZY)
    @JsonBackReference
    private Specialist specialist;

    @OneToMany(mappedBy = "doctor")
    @JsonManagedReference
    List<Appointment> appointments;


    @OneToMany(mappedBy = "doctor")
    @JsonManagedReference
    List<HistoryMedical> historyMedicals;

    @OneToMany(mappedBy = "doctor")
    @JsonManagedReference
    List<Review> reviews;


    @OneToMany(mappedBy = "doctor")
    @JsonManagedReference
    List<Prescription> prescriptions;


    @OneToMany(mappedBy = "doctor")
    @JsonManagedReference
    List<DoctorFamily> doctorFamilies;

}
