package com.leo.leasahub.repository;

import com.leo.leasahub.entity.Role;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 角色dao
 * @author leo Yu
 * @date 2020/5/8 14:33
 */
public interface RoleRepository extends JpaRepository<Role, Long> {

    List<Role> findRolesByUserId(Long userId);
}
