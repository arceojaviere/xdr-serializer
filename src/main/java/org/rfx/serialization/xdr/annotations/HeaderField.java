package org.rfx.serialization.xdr.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.rfx.serialization.xdr.LengthType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface HeaderField {

	long length();
	LengthType lengthType() default LengthType.VARIABLE;
	
	
}
