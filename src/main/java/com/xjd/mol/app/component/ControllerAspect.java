package com.xjd.mol.app.component;

import com.xjd.mol.app.util.HttpRequestUtil;
import com.xjd.mol.app.view.View;
import com.xjd.mol.app.view.ViewUtil;
import com.xjd.mol.utl.DateUtil;
import com.xjd.mol.utl.JsonUtil;
import com.xjd.mol.utl.constants.RespCode;
import com.xjd.mol.utl.exception.BusinessException;
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

	@Around("within(com.xjd.mol.app.controller.*) && @annotation(org.springframework.web.bind.annotation.RequestMapping)")
	private Object aroudAdivce(ProceedingJoinPoint jp) throws Throwable {
		long start = System.currentTimeMillis(); // 起始时间
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		String[] uriParts = request.getRequestURI().split("/");
		String version = uriParts[uriParts.length - 2];
		String service = uriParts[uriParts.length - 1];
		String clientIp = HttpRequestUtil.getRealRemoteAddr(request);

		String requestKey = clientIp + "@" + version + "/" + service + " > ";
		log.info("{} process begin...", requestKey);


		View view = null;

		try {
			view = (View) jp.proceed();
		} catch (Throwable t) {
			if (t instanceof BusinessException) {
				BusinessException be = (BusinessException) t;
				if (be.getCause() != null) {
					log.error(requestKey + " exception occur:", be.getCause());
				}
				view = ViewUtil.defaultView(be.getCode(), be.getArgs(), be.getMsg(), be.getOriginalCode(), be.getOriginalMsg());
			} else {
				log.error(requestKey + " exception occur:", t);
				view = ViewUtil.defaultView(RespCode.RESP_9999);
			}
		}

		if (view == null) {
			log.error("{} view is null.", requestKey);
			view = ViewUtil.defaultView(RespCode.RESP_9999);
		}

		view.setVersion(version);
		view.setService(service);
		view.setTimestamp(DateUtil.format(DateUtil.now(), DateUtil.PATTERN_YEAR2SECOND));

		long end = System.currentTimeMillis();
		long cost = end - start;
		log.info("{} cost {}ms, params={}, return={}", requestKey, cost, JsonUtil.toStringIncludeIgnoredProperties(request.getParameterMap()), JsonUtil.toStringIncludeIgnoredProperties(view));

		return view;
	}
}
