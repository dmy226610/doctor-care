package com.dut.cntt.doctorcare.services.account.impl;

import com.dut.cntt.doctorcare.entities.Role;
import com.dut.cntt.doctorcare.entities.UserRole;
import com.dut.cntt.doctorcare.repositories.account.IRoleRepository;
import com.dut.cntt.doctorcare.services.account.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    IRoleRepository roleRepository;

    @Override
    public void addNewPatientUserRole(String userName) {
        roleRepository.addNewUserRole(3,userName);
    }

    @Override
    public void addNewDoctorUserRole(String username) {
        roleRepository.addNewUserRole(2,username);
    }
}
