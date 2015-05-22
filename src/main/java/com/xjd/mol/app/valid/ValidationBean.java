package com.xjd.mol.app.valid;

import com.xjd.mol.app.valid.constraints.Date;
import com.xjd.mol.app.valid.constraints.Date.DatePattern;
import com.xjd.mol.utl.constants.RespCode;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;

public class ValidationBean {

	@NotBlank(message = RespCode.RESP_0001)
	@Date(pattern = DatePattern.yyyyMMddHHmmss)
	private String timestamp;

	@NotBlank(message = RespCode.RESP_0001)
	@Pattern(regexp = "^((13[0-9])|(14[5,7])|(15[^4,\\D])|(170)|(18[^4,\\D]))\\d{8}$", message = RespCode.RESP_0099)
	private String mobile;

}
