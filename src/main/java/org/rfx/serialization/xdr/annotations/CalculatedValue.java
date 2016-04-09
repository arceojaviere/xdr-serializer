package org.rfx.serialization.xdr.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.rfx.serialization.xdr.CalculatedValueType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface CalculatedValue {
	CalculatedValueType type();
	String fieldExpression() default "${this}";
	
}
