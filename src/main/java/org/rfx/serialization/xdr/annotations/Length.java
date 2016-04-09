package org.rfx.serialization.xdr.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.rfx.serialization.xdr.LengthType;

@Retention(RetentionPolicy.RUNTIME)
public @interface Length {
	long length();
	LengthType type() default LengthType.VARIABLE;
}
