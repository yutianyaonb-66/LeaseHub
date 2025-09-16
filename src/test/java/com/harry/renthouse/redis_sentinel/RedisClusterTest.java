package com.leo.leasahub.redis_sentinel;

import com.leo.leasahub.leasahubApplicationTests;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.Assert;

/**
 * @author leo Yu
 * @date 2020/8/21 16:31
 */
@Slf4j
class RedisClusterTest  extends leasahubApplicationTests {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testCluster(){
        stringRedisTemplate.opsForValue().set("user", "Yuqibin");
        String user = stringRedisTemplate.opsForValue().get("user");
        Assert.isTrue(StringUtils.equals("Yuqibin", user), "获取结果不匹配");
    }
}