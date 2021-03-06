package com.example.spring.boot.redis.annotation;

import java.lang.annotation.*;

/**
 * Author: 王俊超
 * Date: 2017-06-10 05:56
 * All Rights Reserved !!!
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface RedisCacheEvict {

    /**
     * 缓存名称
     *
     * @return
     */
    String cacheName();

    /**
     * 缓存key
     *
     * @return
     */
    String key();
}
