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
@Constraint(validatedBy = {EnumConstraintValidator.class})
public @interface Enum {

	Class enumClass();

	String message() default RespCode.RESP_0003;

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
