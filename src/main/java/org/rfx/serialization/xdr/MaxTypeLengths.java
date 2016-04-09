package org.rfx.serialization.xdr;

public enum MaxTypeLengths {
	SignedInteger(32),
	SignedLong(64),
	UnsignedLong(32),
	SignedBigInteger(64),
	UnsignedBigInteger(64),
	SignedFloat(32),
	SignedDouble(64),
	UnsignedDouble(32),
	SignedBigDecimal(128),
	UnsignedBugDecimal(128);
	
	int value;
	MaxTypeLengths(int value){
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}
