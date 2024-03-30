package X;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: X.Aqz  reason: case insensitive filesystem */
public final class C22580Aqz extends UploadDataProvider {
    public final ByteBuffer A00;

    public long getLength() {
        return (long) this.A00.limit();
    }

    public void rewind(UploadDataSink uploadDataSink) {
        this.A00.position(0);
        uploadDataSink.onRewindSucceeded();
    }

    public C22580Aqz(ByteBuffer byteBuffer) {
        this.A00 = byteBuffer;
    }

    public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            int remaining = byteBuffer.remaining();
            int remaining2 = this.A00.remaining();
            ByteBuffer byteBuffer2 = this.A00;
            if (remaining >= remaining2) {
                byteBuffer.put(byteBuffer2);
            } else {
                int limit = byteBuffer2.limit();
                ByteBuffer byteBuffer3 = this.A00;
                byteBuffer3.limit(byteBuffer3.position() + byteBuffer.remaining());
                byteBuffer.put(this.A00);
                this.A00.limit(limit);
            }
            uploadDataSink.onReadSucceeded(false);
            return;
        }
        throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
    }
}
