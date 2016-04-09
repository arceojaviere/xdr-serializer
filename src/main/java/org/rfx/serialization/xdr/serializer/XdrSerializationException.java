package org.rfx.serialization.xdr.serializer;

public class XdrSerializationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7671338535296454361L;

	/**
	 * 
	 */
	
	
	public XdrSerializationException() {
		super();
	}

	public XdrSerializationException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public XdrSerializationException(String message, Throwable cause) {
		super(message, cause);
	}

	public XdrSerializationException(String message) {
		super(message);
	}

	public XdrSerializationException(Throwable cause) {
		super(cause);
	}

}
