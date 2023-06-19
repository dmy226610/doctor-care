package com.dut.cntt.doctorcare.dto.patient;



import java.time.LocalDate;



public class PatientDTO {
    private String idPatient;
    private String userName;

    private String password;
    private String email;
    private String avatarUrl;
    private String phone;
    private String name;
    private LocalDate birthday;
    private String address;
    private String sex;
    private String healthHistory;
    private String bloodType;

    public PatientDTO(String idPatient, String userName, String password, String email, String avatarUrl, String phone,
                      String name, LocalDate birthday, String address, String sex, String healthHistory, String bloodType) {
        this.idPatient = idPatient;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.avatarUrl = avatarUrl;
        this.phone = phone;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.sex = sex;
        this.healthHistory = healthHistory;
        this.bloodType = bloodType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
}