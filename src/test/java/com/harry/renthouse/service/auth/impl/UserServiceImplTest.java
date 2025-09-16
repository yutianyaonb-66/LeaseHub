package com.leo.leasahub.service.auth.impl;

import com.leo.leasahub.leasahubApplicationTests;
import com.leo.leasahub.base.UserRoleEnum;
import com.leo.leasahub.service.auth.UserService;
import com.leo.leasahub.web.form.UserPhoneRegisterForm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import javax.annotation.Resource;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author leo Yu
 * @date 2020/5/22 15:44
 */
class UserServiceImplTest extends leasahubApplicationTests {

    @Resource
    private UserService userService;

    @Test
    void registerUserByPhone() {
        UserPhoneRegisterForm userPhoneRegisterForm = new UserPhoneRegisterForm();
        userPhoneRegisterForm.setPassword("12345678q");
        userPhoneRegisterForm.setPhoneNumber("17879502601");
        userService.registerUserByPhone(userPhoneRegisterForm, Collections.singletonList(UserRoleEnum.ADMIN));
    }
}