package hyewadong.yogosaza.aop;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class ExecutionTimeTrackerAspect {

    private static final Logger logger = LoggerFactory.getLogger(ExecutionTimeTrackerAspect.class);

    @Pointcut("execution(* hyewadong.yogosaza..*.*(..))")
    public void trackTimeAnnotation() {}

    @Around("trackTimeAnnotation()")
    public Object trackTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed(); // 메소드 실행
        long endTime = System.currentTimeMillis();

        long executionTime = endTime - startTime;
        logger.info("{} executed in {} ms", joinPoint.getSignature(), executionTime);
        return result;

    }

}
