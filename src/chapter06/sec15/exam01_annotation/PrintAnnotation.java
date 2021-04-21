package chapter06.sec15.exam01_annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15; // 몇번 출력할 건지                                                                                                                                          
}
