package org.rfx.serialization.xdr.serializer;

import java.io.IOException;
import java.io.OutputStream;

public class XdrSerializer {
	
	public byte[] serialize(Object object){
		byte[] content = null;
		
		
		
		return content;
	}
	
	public void serialize(Object object, OutputStream stream) throws XdrSerializationException{
		byte[] content = this.serialize(object);
		try{
			stream.write(content);
			stream.flush();
		}catch(IOException e){
			throw new XdrSerializationException("Error while writing data to stream.", e);
		}
	}

}
