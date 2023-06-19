package com.dut.cntt.doctorcare.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
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
public class Patient {
    @Id
    @GeneratedValue(generator = "my_generator")
    @GenericGenerator(name = "my_generator",strategy = "com.dut.cntt.doctorcare.entities.IdPatient")
    @Column(name = "id_patient")
    private String idPatient;

    @JoinColumn(name = "user_name", referencedColumnName = "user_name")
    @OneToOne(fetch = FetchType.LAZY)
    private Users users;

    @Column(name = "email",columnDefinition = "nvarchar(50)")
    private String email;

    @Column(name = "avatar_url")
    private String avatarUrl;

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
    @Column(name = "health_history")
    private String healthHistory;
    @Column(name = "blood_type")
    private String bloodType;

    @OneToMany(mappedBy = "patient")
    @JsonManagedReference
    List<HistoryMedical> historyMedicals;

    @OneToMany(mappedBy = "patient")
    @JsonManagedReference
    List<Review> reviews;


    @OneToMany(mappedBy = "patient")
    @JsonManagedReference
    List<Prescription> prescriptions;


    @OneToOne(mappedBy = "patient")
    @JsonManagedReference
    DoctorFamily doctorFamilies;

}
