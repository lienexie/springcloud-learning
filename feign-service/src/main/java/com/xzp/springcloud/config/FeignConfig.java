package com.xzp.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Xiezhipeng
 * @Description
 * @Date 2020/5/22
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level level() {
        return Logger.Level.FULL;
    }

}
