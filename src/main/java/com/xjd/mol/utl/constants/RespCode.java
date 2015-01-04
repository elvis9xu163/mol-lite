package com.xjd.mol.utl.constants;

/**
 * <pre>
 * 返回码
 * 0000       	成功
 * 0001 ~ 0100	基础公用
 * 0101 ~ 0200	用户相关
 * 0201 ~ 0300	XXXXXXXXXX
 * 0301 ~ 0400	XXXXXXXXXX
 * 0401 ~ 0500	XXXXXXXXXX
 * 9901 ~ 9999	系统错误
 * </pre>
 *
 * @author elvis.xu
 * @since 2014-12-18
 */
public interface RespCode {

	/** 成功 */
	String RESP_0000 = "0000";

	// ==== 0001 ~ 0100	基础公用  ==== //
	/** 参数({0})不能为空 */
	String RESP_0001 = "0001";

	/** 参数({0})格式错误: {1} */
	String RESP_0002 = "0002";

	/** 参数({0})必须为有效的枚举值 : {1} */
	String RESP_0003 = "0003";

	/** 请输入正确的日期/时间 */
	String RESP_0098 = "0098";

	/** 请输入正确的手机 */
	String RESP_0099 = "0099";


	// ==== 9901 ~ 9999	系统错误  ==== //

	/** 内部错误,请稍后再试或联系管理员 */
	String RESP_9999 = "9999";
}
