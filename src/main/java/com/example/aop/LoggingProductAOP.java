package com.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Aspect
@Component
public class LoggingProductAOP {

	//execution(methodreturntype package.class.method(args)
	//@Pointcut(value="execution(* com.example.*.*.*(..))")
	public void loggingPointCut() {
		
	}
	
	//@Around("loggingPointCut()")
	@Around("execution(* com.example.*.*.*(..))")
	public void loggingAdvice(ProceedingJoinPoint pj) throws Throwable
	{
	 ObjectMapper mapper = new ObjectMapper();
	 String methodName = pj.getSignature().getName();
	 String className = pj.getTarget().getClass().toString();
	 
	 System.out.println("Before execution of business method");
	 Object response = pj.proceed();
	 
	 
	 
	 
	 System.out.println("In class " + className +", in method "+ methodName + " and response is "+mapper.writeValueAsString(response));
		
		//return Object;
		
	}
}
