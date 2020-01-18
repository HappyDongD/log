package com.sl4j.log.core.config;

import com.sl4j.log.core.log.LogProcessor;
import com.sl4j.log.core.support.LogContext;
import org.slf4j.Logger;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 日志自动装配
 * @author xsx
 * @date 2019/6/19
 * @since 1.8
 */
@Configuration
@ConditionalOnClass({Logger.class})
@Import({LogContext.class})
public class LogAutoConfiguration {

    @Bean
    public LogProcessor logProcessor() {
        return new LogProcessor();
    }
}
