package com.dut.cntt.doctorcare.dto.patient;



import java.time.LocalDate;



public class PatientDTO {
    private String idPatient;
    private String email;
    private String phone;
    private String name;
    private LocalDate birthday;
    private String address;
    private String sex;
    private String healthHistory;

    public String getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(String idPatient) {
        this.idPatient = idPatient;
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

    public String getHealthHistory() {
        return healthHistory;
    }

    public void setHealthHistory(String healthHistory) {
        this.healthHistory = healthHistory;
    }

    public PatientDTO() {
    }

    public PatientDTO(String idPatient, String email, String phone, String name, LocalDate birthday, String address, String sex, String healthHistory) {
        this.idPatient = idPatient;
        this.email = email;
        this.phone = phone;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.sex = sex;
        this.healthHistory = healthHistory;
    }
}