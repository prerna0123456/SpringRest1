package com.springb.StudentRegistrationAOP.aop;

import java.time.LocalTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentAOP {
	
	@Before(value="execution(* com.springb.StudentRegistrationAOP.restcontroller.StudentController.registerStudent(..))")
	public void beforeRegisteringStudent(JoinPoint point) {
		System.out.println("Regisering student "+point.getSignature()+" at "+LocalTime.now());
	}
	
	@After(value="execution(* com.springb.StudentRegistrationAOP.restcontroller.StudentController.registerStudent(..))")
	public void afterRegisteringStudent(JoinPoint point) {
		System.out.println("Registered student "+point.getSignature()+" at "+LocalTime.now());
	}
	
	@AfterThrowing(value="execution(* com.springb.StudentRegistrationAOP.restcontroller.*.*(..))", throwing="exception")
	   public void afterAdviceService(JoinPoint joinPoint, Exception exception)
	   {
			System.out.println("Response Came from " + joinPoint.getSignature()+" at " + LocalTime.now() +" exception is "+ exception.getMessage());
	   }

}
