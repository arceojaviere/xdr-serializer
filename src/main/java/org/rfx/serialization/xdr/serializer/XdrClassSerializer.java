package org.rfx.serialization.xdr.serializer;

import org.rfx.serialization.xdr.TypeOptions;

public interface XdrClassSerializer<T> {
	public abstract T deserialize(byte[] content, TypeOptions options);
	public abstract byte[] serialize(T object, TypeOptions options);
	public abstract long getSerializedSize(T object, TypeOptions options);
}
