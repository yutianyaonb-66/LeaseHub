package com.leo.leasahub.repository;

import com.leo.leasahub.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * 用户dao
 * @author leo Yu
 * @date 2020/5/7 16:09
 */
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByName(String name);

    @Modifying
    @Query("update User as user set user.avatar = :avatar where user.id = :id")
    void updateAvatar(Long id, String avatar);

    Optional<User> findByPhoneNumber(String phoneNumber);

    Optional<User> findByNickName(String nickName);

    @Modifying
    @Query("update User as user set user.password = :password where user.id = :id")
    void updatePassword(Long id, String password);
}
