package com.xjd.mol.utl.exception;

import java.util.Arrays;

public class BusinessException extends RuntimeException {
	private static final long serialVersionUID = -3695925020819722766L;

	protected String code;
	protected Object[] args;
	protected String msg;
	protected String originalCode;
	protected String originalMsg;

	public BusinessException(String code) {
		this(code, null, null, null, null, null);
	}

	public BusinessException(String code, Object[] args) {
		this(code, args, null, null, null, null);
	}

	public BusinessException(String code, String message) {
		this(code, null, message, null, null, null);
	}

	public BusinessException(String code, Object[] args, String message) {
		this(code, args, message, null, null, null);
	}

	public BusinessException(String code, String originalCode, String originalMsg) {
		this(code, null, null, null, originalCode, originalMsg);
	}

	public BusinessException(String code, Object[] args, String originalCode, String originalMsg) {
		this(code, args, null, null, originalCode, originalMsg);
	}

	public BusinessException(String code, String message, String originalCode, String originalMsg) {
		this(code, null, message, null, originalCode, originalMsg);
	}

	public BusinessException(String code, Object[] args, String message, String originalCode, String originalMsg) {
		this(code, args, message, null, originalCode, originalMsg);
	}

	public BusinessException(String code, Throwable cause) {
		this(code, null, null, cause, null, null);
	}

	public BusinessException(String code, Object[] args, Throwable cause) {
		this(code, args, null, cause, null, null);
	}

	public BusinessException(String code, String message, Throwable cause) {
		this(code, null, message, cause, null, null);
	}

	public BusinessException(String code, Object[] args, String message, Throwable cause, String originalCode, String originalMsg) {
		super(cause);
		this.code = code;
		this.args = args;
		this.msg = message;
		this.originalCode = originalCode;
		this.originalMsg = originalMsg;
	}

	public String getCode() {
		return code;
	}

	public Object[] getArgs() {
		return args;
	}

	public String getMsg() {
		return msg;
	}

	public String getOriginalCode() {
		return originalCode;
	}

	public String getOriginalMsg() {
		return originalMsg;
	}

	public String toString() {
		StringBuilder buf = new StringBuilder();
		buf.append(getClass().getSimpleName());
		buf.append("[code='" + getCode() + "'");
		buf.append(", args=" + Arrays.toString(args));
		buf.append(", msg='" + msg + "'");
		buf.append(", originalCode='" + originalCode + "'");
		buf.append(", originalMsg='" + originalMsg + "']");
		String message = getLocalizedMessage();
		buf.append((message != null) ? ": " + message : "");
		StackTraceElement[] traces = getStackTrace();
		buf.append(traces.length == 0 ? "" : ": at " + traces[0]);
		return buf.toString();
	}
}
