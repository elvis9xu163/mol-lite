package com.xjd.mol.app.view;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonUnwrapped;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonAutoDetect
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class View {
	private String returnCode;
	private String returnMsg;
	private String service;
	private String version;
	private String timestamp;

	@JsonIgnore
	private String originalCode;
	@JsonIgnore
	private String originalMsg;

	@JsonUnwrapped
	private ViewBody body;

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String resultCode) {
		this.returnCode = resultCode;
	}

	public String getReturnMsg() {
		return returnMsg;
	}

	public void setReturnMsg(String resultMsg) {
		this.returnMsg = resultMsg;
	}

	public ViewBody getBody() {
		return body;
	}

	public void setBody(ViewBody body) {
		this.body = body;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getOriginalCode() {
		return originalCode;
	}

	public void setOriginalCode(String originalCode) {
		this.originalCode = originalCode;
	}

	public String getOriginalMsg() {
		return originalMsg;
	}

	public void setOriginalMsg(String originalMsg) {
		this.originalMsg = originalMsg;
	}

	@Override
	public String toString() {
		return "View [returnCode=" + returnCode + ", returnMsg=" + returnMsg + ", service=" + service + ", version=" + version + ", timestamp="
				+ timestamp + ", originalCode=" + originalCode + ", originalMsg=" + originalMsg + ", body=" + body + "]";
	}

}
