package com.dut.cntt.doctorcare.dto.doctor;

import java.time.LocalDate;


public class DoctorDTO {
    private String idDoctor;
    private String email;
    private String phone;
    private String name;
    private LocalDate birthday;
    private String address;
    private String sex;
    private double averageRate;
    private String specialistId;

    public String getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(String idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getAverageRate() {
        return averageRate;
    }

    public void setAverageRate(double averageRate) {
        this.averageRate = averageRate;
    }

    public String getSpecialistId() {
        return specialistId;
    }

    public void setSpecialistId(String specialistId) {
        this.specialistId = specialistId;
    }

    public DoctorDTO() {
    }

    public DoctorDTO(String idDoctor, String email, String phone, String name, LocalDate birthday, String address, String sex, double averageRate, String specialistId) {
        this.idDoctor = idDoctor;
        this.email = email;
        this.phone = phone;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.sex = sex;
        this.averageRate = averageRate;
        this.specialistId = specialistId;
    }
}