package edu.laverno.logging;

import edu.laverno.domain.Person;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Around("(execution(* edu.laverno.dao.PersonDAOSimple.*(..)))")
    public Person logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Вызов метода: " + joinPoint.getSignature().getName());
        Person p = (Person) joinPoint.proceed();
        System.out.println("Метод: " + joinPoint.getSignature().getName());
        return p;
    }
}
