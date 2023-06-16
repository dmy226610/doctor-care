package com.dut.cntt.doctorcare.entities;

import jakarta.persistence.Table;

@Table(name ="AccountRole")
public enum AccountRole {
    DOCTOR,PATIENT,ADMIN
}
