package com.leeyee.xcode.redis.service;

import com.leeyee.xcode.redis.dao.BaseRedisDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by leeyee on 16-3-29.
 */
@Service
public class RedisService {
    @Resource
    private BaseRedisDao baseRedisDao;

    public void set(String key, String val) {
        baseRedisDao.set(key, val, 0L);
    }

    public String get(String key) {
        return baseRedisDao.get(key);
    }

}
