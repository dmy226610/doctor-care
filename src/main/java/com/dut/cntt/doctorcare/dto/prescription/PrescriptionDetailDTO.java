package com.dut.cntt.doctorcare.dto.prescription;

public class PrescriptionDetailDTO {
    private String drugName;
    private int quantity;
    private double price;
    private String prescriptionId;

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public PrescriptionDetailDTO() {
    }

    public PrescriptionDetailDTO(String drugName, int quantity, double price, String prescriptionId) {
        this.drugName = drugName;
        this.quantity = quantity;
        this.price = price;
        this.prescriptionId = prescriptionId;
    }
}