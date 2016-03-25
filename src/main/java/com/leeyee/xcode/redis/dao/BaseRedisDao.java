package com.leeyee.xcode.redis.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by leeyee on 16-3-24.
 */
@Component
public class BaseRedisDao {

    private Logger logger = LoggerFactory.getLogger(BaseRedisDao.class);

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    private boolean save(String key, String obj) {

        stringRedisTemplate.opsForValue().set(key, obj);

        return false;
    }

}
