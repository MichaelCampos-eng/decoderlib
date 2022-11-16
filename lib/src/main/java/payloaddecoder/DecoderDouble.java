package payloaddecoder;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Optional;

public class DecoderDouble<T> extends DecoderPrimitive {

    public DecoderDouble(String name) {
        super(8, name);
    }

    @Override
    public Optional<T> getRawValue(byte[] payload) {
        return Optional.of((T) Double.valueOf(ByteBuffer.wrap(wrapPayload(payload)).order(ByteOrder.LITTLE_ENDIAN).getDouble()));
    }
}
