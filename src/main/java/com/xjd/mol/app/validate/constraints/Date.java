package com.xjd.mol.app.validate.constraints;


import com.xjd.mol.utl.constants.RespCode;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {DateConstraintValidator.class})
public @interface Date {

	DatePattern pattern() default DatePattern.yyyyMMddHHmmss;

	String message() default RespCode.RESP_0098;

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	public static enum DatePattern {
		yyMM("yyMM"), yyyyMM("yyyyMM"), yyyyMMdd("yyyyMMdd"), yyyyMMddHHmmss("yyyyMMddHHmmss");

		private String value;

		DatePattern(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

	}
}
