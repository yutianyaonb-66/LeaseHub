package com.leo.leasahub.test;

import com.leo.leasahub.leasahubApplicationTests;
import com.leo.leasahub.entity.User;
import com.leo.leasahub.repository.UserRepository;
import com.leo.leasahub.web.form.UserBasicInfoForm;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import javax.annotation.Resource;

/**
 * @author leo Yu
 * @date 2020/8/9 17:43
 */
public class ModelMapperTest extends leasahubApplicationTests {

    @Resource
    private ModelMapper modelMapper;

    @Resource
    private UserRepository userRepository;

    @Test
    void testMapper(){
        User user = userRepository.findById(2L).orElse(null);
        System.out.println(user);
        UserBasicInfoForm userForm = new UserBasicInfoForm();
        userForm.setAvatar("abcd");
        userForm.setIntroduction("如此简单");
        modelMapper.map(userForm, user);
        System.out.println(user);
    }
}
