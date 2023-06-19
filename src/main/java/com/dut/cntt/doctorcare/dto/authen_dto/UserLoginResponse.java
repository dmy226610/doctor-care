package com.dut.cntt.doctorcare.dto.authen_dto;


import com.dut.cntt.doctorcare.entities.Users;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginResponse {
    private String jWT;

    private Users user;

    private List<String> roles;
}
