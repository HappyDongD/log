package com.sl4j.log.core.log;

import java.lang.annotation.*;

/**
 * 异常日志
 * @author xsx
 * @date 2019/6/19
 * @since 1.8
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ThrowingLog {
    /**
     * 业务名称
     * @return
     */
    String value();

    /**
     * 回调
     * @return
     */
    Class<? extends LogCallback> callback() default VoidLogCallback.class;
}
