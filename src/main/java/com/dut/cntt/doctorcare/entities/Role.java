package com.dut.cntt.doctorcare.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_role")
    private Long idRole;

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(name="name_role",length = 60)
    private AccountRole name;

}
