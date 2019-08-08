package com.javax4u.validatior;

import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import static java.lang.annotation.ElementType.FIELD;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AuthorValidator.class)
@Documented
public @interface Author {

	 String message()  default "Author is not allowed";
	 Class<?>[] groups() default {};
	 
	 Class<? extends Payload>[] payload() default {};
	
}
