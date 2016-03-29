package com.leeyee.xcode.redis.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Created by leeyee on 16-3-24.
 */
@Component
public class BaseRedisDao {

    private Logger logger = LoggerFactory.getLogger(BaseRedisDao.class);

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public String get(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    public void set(String key, String val) {
        stringRedisTemplate.opsForValue().set(key, val);
    }

    public void set(String key, String val, long sec) {
        if (sec <= 0L) {
            set(key, val);
        } else {
            stringRedisTemplate.opsForValue().set(key, val, sec, TimeUnit.SECONDS);
        }
    }


    public Boolean setNX(String key, String val) {
        return stringRedisTemplate.opsForValue().setIfAbsent(key, val);
    }
}
