package com.dut.cntt.doctorcare.controllers;

import com.dut.cntt.doctorcare.dto.patient.PatientDTO;
import com.dut.cntt.doctorcare.entities.Patient;
import com.dut.cntt.doctorcare.services.patient.IpatientService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/patient")
//@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PatientController {

    @Autowired
    private IpatientService ipatientService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("")
    public ResponseEntity<?> savePatient(@Valid @RequestBody PatientDTO patientDTO,
                                          BindingResult bindingResult) {

        //validate sau
//        if (bindingResult.hasErrors()) {
//            List<FieldError> errors = bindingResult.getFieldErrors();
//            Map<String, String> errorList = new LinkedHashMap<>();
//            for (FieldError item : errors) {
//                String field = item.getField();
//                String msg = item.getDefaultMessage();
//                errorList.put(field, msg);
//            }
//            return new ResponseEntity<>(errorList, HttpStatus.BAD_REQUEST);
//        }

//        Patient patient = modelMapper.map(patientDTO, Patient.class);
        ipatientService.save(patientDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
