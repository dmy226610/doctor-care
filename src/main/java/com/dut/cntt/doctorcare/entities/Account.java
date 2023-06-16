package com.dut.cntt.doctorcare.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @Column(name = "email",columnDefinition = "nvarchar(50)")
    private String email;

    @Column(name = "password",columnDefinition = "nvarchar(50)")
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "AccountRole", joinColumns = @JoinColumn(name = "email"), inverseJoinColumns = @JoinColumn(name = "id_role"))
    Set<Role> roles = new HashSet<>();
}
