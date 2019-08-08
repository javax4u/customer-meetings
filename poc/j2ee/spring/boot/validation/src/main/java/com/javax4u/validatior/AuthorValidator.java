package com.javax4u.validatior;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
/**
 * Hello world!
 *
 */
public class AuthorValidator implements ConstraintValidator<Author,String>
{
	List<String> authors=Arrays.asList("Santideva","Amish Tripathi","Rupesh");
	@Override
	public boolean isValid(String value,ConstraintValidatorContext context) {
		return authors.contains(value);
	}
}
