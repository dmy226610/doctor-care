package com.dut.cntt.doctorcare.entities;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    @Id
    @Column(name = "user_name",columnDefinition = "nvarchar(50)")
    private String userName;

    @Column(name = "password",columnDefinition = "nvarchar(255)")
    private String password;

    @OneToMany(mappedBy = "users")
    private List<UserRole> userRoles;
}
