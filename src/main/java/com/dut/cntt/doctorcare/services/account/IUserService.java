package com.dut.cntt.doctorcare.services.account;

import com.dut.cntt.doctorcare.entities.Users;

import java.util.Optional;

public interface IUserService {

    Optional<Users> findById(String userName);

    void createUsers(String userName, String password);
}