package com.leo.leasahub.util;

import com.leo.leasahub.base.ApiResponseEnum;
import com.leo.leasahub.entity.User;
import com.leo.leasahub.exception.BusinessException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

/**
 * 认证用户工具类
 * @author leo Yu
 * @date 2020/5/9 15:29
 */
public class AuthenticatedUserUtil {

    /**
     * 获取当前登录的用户
     * @return
     */
    public static User getUserInfo(){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
       /* if(principal.)
        User user = principal.map(obj -> (User) obj)
                .orElseThrow(() -> new BusinessException(ApiResponseEnum.NO_AUTHENTICATED_USER_ERROR));*/
       if(principal instanceof User){
           return (User) principal;
       }
       throw new BusinessException(ApiResponseEnum.NO_AUTHENTICATED_USER_ERROR);
    }

    /**
     * 获取用户id， 如果不存在则返回-1
     */
    public static Long getUserId(){
        return getUserInfo().getId();
    }

    /**
     * 判断当前是否有登录用户（排除匿名用户）
     */
    public static boolean isAuthenticated(){
        return !"anonymousUser".equals(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }
}

