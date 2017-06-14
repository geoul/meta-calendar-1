package com.ktds.metamong.common;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(METHOD)
public @interface Auth {

	String value() default "";
	//String[] value() default "";		//권한?�� ?��?���? 주고?��?���? 배열�? 만들?��?�� ?��?��.
	
}
