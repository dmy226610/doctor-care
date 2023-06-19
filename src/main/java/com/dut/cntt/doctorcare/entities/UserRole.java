package com.dut.cntt.doctorcare.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @ManyToOne
    @JoinColumn(name = "user_name")
    @JsonBackReference
    private Users users;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
}
