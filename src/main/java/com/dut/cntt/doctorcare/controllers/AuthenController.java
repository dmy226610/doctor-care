package com.dut.cntt.doctorcare.controllers;

import com.dut.cntt.doctorcare.config.JwtUtil;
import com.dut.cntt.doctorcare.dto.authen_dto.LoginDTO;
import com.dut.cntt.doctorcare.dto.authen_dto.UserLoginResponse;
import com.dut.cntt.doctorcare.entities.Users;
import com.dut.cntt.doctorcare.services.account.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class AuthenController {

    @Autowired
    private IUserService userService;

    @Autowired
    private AuthenticationManager authenticationManager;

/*    @Autowired
    private UserRoleService userRoleService;*/

//    @Autowired
//    private EmailService emailService;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/login")
    public ResponseEntity<UserLoginResponse> createAuthenticationToken(@RequestBody LoginDTO loginDTO) throws Exception {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginDTO.getUserName(), loginDTO.getPassword())
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtil.generateToken(authentication);
        User user = (User) authentication.getPrincipal();
        Users userDB = userService.findById(loginDTO.getUserName()).orElse(null);
        List<String> roles = user.getAuthorities()
                .stream().map(GrantedAuthority::getAuthority).toList();
        UserLoginResponse userLoginResponse = UserLoginResponse.builder()
                .jWT(jwt)
                .user(userDB)
                .roles(roles)
                .build();

        return ResponseEntity.status(HttpStatus.OK).body(userLoginResponse);
    }


}
