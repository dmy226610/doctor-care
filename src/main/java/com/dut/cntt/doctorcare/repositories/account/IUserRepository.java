package com.dut.cntt.doctorcare.repositories.account;

import java.util.Optional;

import com.dut.cntt.doctorcare.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface IUserRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByUserName(String username);
    Boolean existsByUserName(String username);

    @Modifying
    @Query(value = "INSERT INTO users (user_name, password) VALUES (:userName, :password)",
            nativeQuery = true)
    void createUser(@Param("userName") String userName,
                    @Param("password") String password);
}