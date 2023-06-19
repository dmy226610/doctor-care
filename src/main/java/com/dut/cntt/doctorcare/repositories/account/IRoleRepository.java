package com.dut.cntt.doctorcare.repositories.account;

import com.dut.cntt.doctorcare.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IRoleRepository extends JpaRepository<Role, Long> {

    @Modifying
    @Query(value = "INSERT INTO user_role (role_id, user_name) VALUES (:roleId, :userName)",
            nativeQuery = true)
    void addNewUserRole(
            @Param("roleId") Integer roleId,
            @Param("userName") String userName);
}
