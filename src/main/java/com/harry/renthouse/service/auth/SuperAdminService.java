package com.leo.leasahub.service.auth;

/**
 * 超级管理员服务
 * @author leo Yu
 * @date 2020/9/4 10:49
 */
public interface    SuperAdminService {

    /**
     * 初始化房屋收藏信息
     */
    void syncStarToRedisFromDatabase();

    /**
     * 初始化房屋收藏信息
     */
    void syncStarToDatabaseFromRedis();
}
