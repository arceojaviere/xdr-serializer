package org.rfx.serialization.xdr;

public class TypeOptions {
	private Long length;
	private LengthType lengthType;
	private Boolean signed;
	private CalculatedValueType calculatedValueType;
	
	
	public Long getLength() {
		return length;
	}
	public void setLength(Long length) {
		this.length = length;
	}
	public LengthType getLengthType() {
		return lengthType;
	}
	public void setLengthType(LengthType lengthType) {
		this.lengthType = lengthType;
	}
	public Boolean getSigned() {
		return signed;
	}
	public void setSigned(Boolean signed) {
		this.signed = signed;
	}
	public CalculatedValueType getCalculatedValueType() {
		return calculatedValueType;
	}
	public void setCalculatedValueType(CalculatedValueType calculatedValueType) {
		this.calculatedValueType = calculatedValueType;
	}

	
	
}
