package com.kdkj.py.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.CookieHttpSessionIdResolver;
import org.springframework.session.web.http.HttpSessionIdResolver;

/**
 * redis设置
 *
 * @author lin
 * @create 2018-04-13 22:58
 **/
@Configuration
@EnableRedisHttpSession
public class RedisConfig {
    @Bean
    public HttpSessionIdResolver httpSessionStrategy() {
        return new CookieHttpSessionIdResolver();
    }
//    //这是RestfulApi项目用的
//    @Bean
//    public HttpSessionIdResolver httpSessionIdResolver() {
//        return HeaderHttpSessionIdResolver.xAuthToken();
//    }
//    @Bean
//    public HttpSessionIdResolver httpSessionStrategy() {
//        return MyHttpSessionIdStrategy.getMyHttpSessionIdStrategy("token");
//    }
}
