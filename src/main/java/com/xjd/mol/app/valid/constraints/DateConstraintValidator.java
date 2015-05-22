package com.xjd.mol.app.valid.constraints;

import com.xjd.mol.app.valid.constraints.Date.DatePattern;
import com.xjd.mol.utl.DateUtil;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class DateConstraintValidator implements ConstraintValidator<Date, String> {

	private String pattern;

	@Override
	public void initialize(Date constraintAnnotation) {
		DatePattern pat = constraintAnnotation.pattern();
		pattern = pat.getValue();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (StringUtils.isEmpty(value)) {
			return true;
		}

		java.util.Date rt = DateUtil.parse(value, pattern);

		if (rt != null) {
			return true;
		}

		return false;
	}

}
