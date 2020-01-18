package com.sl4j.log.core.support;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 上下文工具
 * @author xsx
 * @date 2020/1/14
 * @since 1.8
 */
public class LogContext implements ApplicationContextAware {
    /**
     * 上下文
     */
    private static ApplicationContext applicationContext;

    /**
     * 设置上下文
     * @param applicationContext 上下文实例
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        LogContext.applicationContext = applicationContext;
    }

    /**
     * 获取上下文
     *
     * @return 返回上下文工具
     */
    public static ApplicationContext getContext() {
        return LogContext.applicationContext;
    }
}
