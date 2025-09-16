package com.leo.leasahub.service.auth.impl;

import com.leo.leasahub.base.ApiResponseEnum;
import com.leo.leasahub.entity.User;
import com.leo.leasahub.exception.BusinessException;
import com.leo.leasahub.repository.UserRepository;
import com.leo.leasahub.security.leasahubUserDetailService;
import com.leo.leasahub.service.auth.AuthenticationService;
import com.leo.leasahub.service.auth.UserService;
import com.leo.leasahub.util.TokenUtil;
import com.leo.leasahub.web.dto.AuthenticationDTO;
import com.leo.leasahub.web.dto.UserDTO;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author leo Yu
 * @date 2020/5/11 11:51
 */
@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    @Resource
    private PasswordEncoder passwordEncoder;

    @Resource
    private TokenUtil tokenUtil;

    @Resource
    private UserService userService;


    @Override
    public AuthenticationDTO loginByUsername(String username, String password) {
        UserDTO userDTO = userService.findByUserName(username).orElseThrow(() -> new BusinessException(ApiResponseEnum.USER_NOT_FOUND));
        // 如果用户不存在或者密码不匹配
        if(!passwordEncoder.matches(password, userDTO.getPassword())){
            throw new BusinessException(ApiResponseEnum.USERNAME_PASSWORD_ERROR);
        }
        return tokenGenerate(userDTO.getName());
    }

    @Override
    public AuthenticationDTO loginByPhone(String phone, String password) {
        UserDTO userDTO = userService.findByPhoneNumber(phone).orElseThrow(() -> new BusinessException(ApiResponseEnum.USER_NOT_FOUND));
        // 如果用户不存在或者密码不匹配
        if(!passwordEncoder.matches(password, userDTO.getPassword())){
            throw new BusinessException(ApiResponseEnum.USERNAME_PASSWORD_ERROR);
        }
        return tokenGenerate(userDTO.getName());
    }

    @Override
    public AuthenticationDTO noPassLogin(String phone) {
        UserDTO userDTO = userService.findByPhoneNumber(phone).orElseGet(() -> userService.createByPhone(phone));
        return tokenGenerate(userDTO.getName());
    }

    @Override
    public void logout(String token) {
        tokenUtil.delete(token);
    }

    private AuthenticationDTO tokenGenerate(String username){
        // 生成token并设置过期时间
        String token = tokenUtil.generate(username);
        AuthenticationDTO authenticationDTO = new AuthenticationDTO();
        authenticationDTO.setToken(token);
        return authenticationDTO;
    }
}
