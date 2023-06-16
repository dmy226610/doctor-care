package com.dut.cntt.doctorcare.dto.history_medical;

public class HistoryMedicalDTO {
    private String idHM;
    private String doctorId;
    private String patientId;
    private String symptom;
    private String diagnosis;
    private String result;

    public String getIdHM() {
        return idHM;
    }

    public void setIdHM(String idHM) {
        this.idHM = idHM;
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

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public HistoryMedicalDTO() {
    }

    public HistoryMedicalDTO(String idHM, String doctorId, String patientId, String symptom, String diagnosis, String result) {
        this.idHM = idHM;
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.symptom = symptom;
        this.diagnosis = diagnosis;
        this.result = result;
    }
}