package com.dut.cntt.doctorcare.services.account.impl;

import com.dut.cntt.doctorcare.entities.Users;
import com.dut.cntt.doctorcare.repositories.account.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private IUserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) {
        Users usersEntity = userRepository.findByUserName(username)
                .orElseThrow(() -> new UsernameNotFoundException("No user found with username : " + username));

        Collection<? extends GrantedAuthority> grantedAuthorities = usersEntity.getUserRoles().stream()
                .map(r -> new SimpleGrantedAuthority(r.getRole().getRoleName()))
                .collect(Collectors.toList());

        return new User(usersEntity.getUserName(), usersEntity.getPassword(), grantedAuthorities);
    }
}