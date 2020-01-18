package com.sl4j.log.core.log;

import java.lang.annotation.*;

/**
 * 结果日志
 * @author xsx
 * @date 2019/6/18
 * @since 1.8
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ResultLog {
    /**
     * 业务名称
     * @return
     */
    String value();

    /**
     * 日志级别
     * @return
     */
    Level level() default Level.DEBUG;

    /**
     * 代码定位支持
     * @return
     */
    Position position() default Position.DEFAULT;

    /**
     * 回调
     * @return
     */
    Class<? extends LogCallback> callback() default VoidLogCallback.class;
}
