package com.dut.cntt.doctorcare.dto.appointment;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class AppointmentDTO {
    private String idAPM;
    private String doctorId;
    private String patientId;
    private LocalDateTime createDate;
    private String statusAPMId;
    private String shiftsName;
    private LocalDate date;
    private String nameService;
    private String note;

    public String getIdAPM() {
        return idAPM;
    }

    public void setIdAPM(String idAPM) {
        this.idAPM = idAPM;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getStatusAPMId() {
        return statusAPMId;
    }

    public void setStatusAPMId(String statusAPMId) {
        this.statusAPMId = statusAPMId;
    }

    public String getShiftsName() {
        return shiftsName;
    }

    public void setShiftsName(String shiftsName) {
        this.shiftsName = shiftsName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public AppointmentDTO() {
    }

    public AppointmentDTO(String idAPM, String doctorId, String patientId, LocalDateTime createDate, String statusAPMId, String shiftsName, LocalDate date, String nameService, String note) {
        this.idAPM = idAPM;
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.createDate = createDate;
        this.statusAPMId = statusAPMId;
        this.shiftsName = shiftsName;
        this.date = date;
        this.nameService = nameService;
        this.note = note;
    }
}