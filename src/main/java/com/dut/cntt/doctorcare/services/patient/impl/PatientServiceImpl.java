package com.dut.cntt.doctorcare.services.patient.impl;

import com.dut.cntt.doctorcare.dto.patient.PatientDTO;
import com.dut.cntt.doctorcare.entities.Users;
import com.dut.cntt.doctorcare.repositories.patient.IPatientRepository;
import com.dut.cntt.doctorcare.services.account.IRoleService;
import com.dut.cntt.doctorcare.services.account.IUserService;
import com.dut.cntt.doctorcare.services.patient.IpatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements IpatientService {

    @Autowired
    private IPatientRepository patientRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private IUserService userService;

    @Autowired
    private IRoleService roleService;

    @Override
    public void save(PatientDTO patientDTO) {

        String encodedPassword = passwordEncoder.encode(patientDTO.getPassword());
        userService.createUsers(patientDTO.getUserName(), encodedPassword);
        roleService.addNewPatientUserRole(patientDTO.getUserName());
        patientRepository.createPatient(
                patientDTO.getUserName(),
                patientDTO.getEmail(),
                patientDTO.getAvatarUrl(),
                patientDTO.getPhone(),
                patientDTO.getName(),
                patientDTO.getBirthday().toString(),
                patientDTO.getAddress(),
                patientDTO.getSex(),
                patientDTO.getHealthHistory(),
                patientDTO.getBloodType());
    }
}
