package com.leo.leasahub.service.auth.impl;

import com.leo.leasahub.entity.HouseStar;
import com.leo.leasahub.repository.HouseRepository;
import com.leo.leasahub.repository.HouseStarRepository;
import com.leo.leasahub.service.auth.SuperAdminService;
import com.leo.leasahub.service.cache.RedisStarService;
import com.leo.leasahub.service.house.HouseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 超级管理员服务实现
 * @author leo Yu
 * @date 2020/9/4 10:49
 */
@Service
public class SuperAdminServiceImpl implements SuperAdminService {

    @Resource
    private RedisStarService redisStarService;
    

    @Override
    public void syncStarToRedisFromDatabase() {
        redisStarService.syncStarFromDatabase();
    }

    @Override
    public void syncStarToDatabaseFromRedis() {
        redisStarService.syncStarToDatabase();
    }
}
