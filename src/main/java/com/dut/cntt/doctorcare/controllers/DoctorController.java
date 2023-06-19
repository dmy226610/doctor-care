package com.dut.cntt.doctorcare.controllers;


import com.dut.cntt.doctorcare.dto.doctor.DoctorDTO;
import com.dut.cntt.doctorcare.entities.Specialist;
import com.dut.cntt.doctorcare.services.doctor.IDoctorService;
import com.dut.cntt.doctorcare.services.doctor.ISpecialistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/doctor")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DoctorController {
    @Autowired
    IDoctorService iDoctorService;

    @Autowired
    ISpecialistService iSpecialistService;

    public ResponseEntity<?> saveDoctor(@Valid @RequestBody DoctorDTO doctorDTO, BindingResult bindingResult){
       // Specialist specialist = iSpecialistService.findById(DoctorDTO)
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Thêm thất bại!");
    }
}
