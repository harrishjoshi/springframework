package com.harxsh.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

 // AOP
@Aspect
// Configuration
@Configuration
public class UserAccessAspect {

    // AOP - what kind of methods to intercept  plus what to do
    // JoinPoint - the specific execution instance (if there are 100 methods, this is 100 instances (join-points))
    // Weaving - the process of implementing the AOP around the target method and framework that implements is called weaver

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    // what kind of methods we want to intercept
    // execution(* PACKAGE.*.*(..))
    @Before("com.harxsh.spring.aop.aspect.CommonJoinPointConfig.dataLayerExecution()")
    public void before(JoinPoint joinPoint) {
        // what to do ? (advice)
        logger.info("Check for user access -");
        logger.info("Allowed execution for - {}", joinPoint);
    }
}
