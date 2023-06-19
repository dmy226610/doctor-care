package com.dut.cntt.doctorcare.services.account.impl;


import com.dut.cntt.doctorcare.entities.Users;
import com.dut.cntt.doctorcare.repositories.account.IUserRepository;
import com.dut.cntt.doctorcare.services.account.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository userRepository;
    private static final boolean DELETED_FALSE = false;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Optional<Users> findById(String userName) {
        return userRepository.findByUserName(userName);
    }

    @Override
    public void createUsers(String userName, String password) {
        userRepository.createUser(userName, password);
    }


}
