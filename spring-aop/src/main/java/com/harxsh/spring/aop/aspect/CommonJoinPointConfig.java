package com.harxsh.spring.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("execution(* com.harxsh.spring.aop.data.*.*(..))")
    public void dataLayerExecution() {
    }

    @Pointcut("execution(* com.harxsh.spring.aop.business.*.*(..))")
    public void businessLayerExecution() {
    }

    @Pointcut("com.harxsh.spring.aop.aspect.CommonJoinPointConfig.dataLayerExecution() && com.harxsh.spring.aop.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void allLayerExecution() {
    }

    @Pointcut("bean(*dao*)")
    public void beanContainingDao() {
    }

    @Pointcut("within(com.harxsh.spring.aop.data.*)")
    public void dataLayerExecutionWithWithin() {
    }

    @Pointcut("@annotation(com.harxsh.spring.aop.aspect.TrackTime)")
    public void trackTimeAnnotation() {
    }
}
