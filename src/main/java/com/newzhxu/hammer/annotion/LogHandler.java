package com.newzhxu.hammer.annotion;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
@Slf4j
public class LogHandler {
    @Around("@annotation(logger)")
    public Object log(ProceedingJoinPoint joinPoint, Log logger) throws Throwable {

        String method = joinPoint.getSignature().toShortString();
        Object[] args = joinPoint.getArgs();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start(method);
        try {
            log.debug("Entering {} args={}", method, java.util.Arrays.toString(args));
            Object result = joinPoint.proceed();
            stopWatch.stop();
            log.debug("Exiting {} took {}  return={}", method, stopWatch.prettyPrint(), result);
            return result;
        } catch (Throwable t) {
            stopWatch.stop();
            log.error("Exception in {} after {}  args={} msg={}", method, stopWatch.prettyPrint(), java.util.Arrays.toString(args), t.getMessage(), t);
            throw t;
        }
    }


}
