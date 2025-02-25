package com.jdc.mkt.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.jdc.mkt.Grade;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface GradeAdder {
	Grade[] value() default Grade.GradeA;
}
