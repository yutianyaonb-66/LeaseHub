package com.leo.leasahub.security;

import com.leo.leasahub.base.ApiResponseEnum;
import com.leo.leasahub.base.SimpleGrantedAuthorityExtend;
import com.leo.leasahub.config.RedisConfig;
import com.leo.leasahub.entity.Role;
import com.leo.leasahub.entity.User;
import com.leo.leasahub.exception.BusinessException;
import com.leo.leasahub.repository.RoleRepository;
import com.leo.leasahub.repository.UserRepository;
import com.leo.leasahub.service.auth.UserService;
import com.leo.leasahub.web.dto.UserDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * 用户认证及权限
 * @author leo Yu
 * @date 2020/5/8 14:22
 */
@Service
public class leasahubUserDetailService implements UserDetailsService {

    @Resource
    private UserService userService;

    @Resource
    private ModelMapper modelMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 从缓存中读取用户
        UserDTO userDTO = userService.findByUserName(username).orElseThrow(() -> new BusinessException(ApiResponseEnum.USER_NOT_FOUND));
        User user = modelMapper.map(userDTO, User.class);
        wrapperRole(user);
        return user;
    }

    private void wrapperRole(User user){
        Set<SimpleGrantedAuthorityExtend> userRoles = userService.findUserRoles(user.getId());
        if(CollectionUtils.isEmpty(userRoles)){
            throw new BusinessException(ApiResponseEnum.NO_PRIORITY_ERROR);
        }
        user.setAuthorities(userRoles);
    }
}
