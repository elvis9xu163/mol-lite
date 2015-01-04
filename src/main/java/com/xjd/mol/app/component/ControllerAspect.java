package com.xjd.mol.app.component;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Component
@Aspect
@Order(1)
public class ControllerAspect {
	private static final Logger log = LoggerFactory.getLogger(ControllerAspect.class);

	@Around("within(com.shfft.hydra.web.controller.*) && @annotation(org.springframework.web.bind.annotation.RequestMapping)")
	private Object aroudAdivce(ProceedingJoinPoint jp) throws Throwable {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		String[] param = request.getRequestURI().split("/");
		String version = param[param.length - 2];
		String service = param[param.length - 1];

		return null;
	}
}
