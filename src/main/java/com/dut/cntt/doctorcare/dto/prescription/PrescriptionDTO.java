package com.dut.cntt.doctorcare.dto.prescription;

import java.time.LocalDate;


public class PrescriptionDTO {
    private String idPST;
    private String doctorId;
    private String patientId;
    private LocalDate createDate;
    private double totalPrice;

    public String getIdPST() {
        return idPST;
    }

    public void setIdPST(String idPST) {
        this.idPST = idPST;
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

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public PrescriptionDTO() {
    }

    public PrescriptionDTO(String idPST, String doctorId, String patientId, LocalDate createDate, double totalPrice) {
        this.idPST = idPST;
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.createDate = createDate;
        this.totalPrice = totalPrice;
    }
}