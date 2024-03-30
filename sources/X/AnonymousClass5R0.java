package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

/* renamed from: X.5R0  reason: invalid class name */
public final class AnonymousClass5R0 extends FilterOutputStream {
    public boolean A00;
    public final ByteBuffer A01 = ByteBuffer.allocate(DefaultCrypto.BUFFER_SIZE);

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        java.lang.Thread.currentThread().stop(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r1 != null) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void close() {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.flush()     // Catch:{ UnsupportedCharsetException -> 0x0028, all -> 0x0013 }
            java.io.OutputStream r2 = r3.out     // Catch:{ UnsupportedCharsetException -> 0x0028, all -> 0x0013 }
            java.lang.String r1 = "0\r\n\r\n"
            java.lang.String r0 = X.C19430v1.A0B     // Catch:{ UnsupportedCharsetException -> 0x0028, all -> 0x0013 }
            byte[] r0 = r1.getBytes(r0)     // Catch:{ UnsupportedCharsetException -> 0x0028, all -> 0x0013 }
            r2.write(r0)     // Catch:{ UnsupportedCharsetException -> 0x0028, all -> 0x0013 }
            r1 = 0
            goto L_0x0014
        L_0x0013:
            r1 = move-exception
        L_0x0014:
            super.close()     // Catch:{ all -> 0x0018 }
            goto L_0x001d
        L_0x0018:
            r0 = move-exception
            if (r1 != 0) goto L_0x001f
            r1 = r0
            goto L_0x001f
        L_0x001d:
            if (r1 == 0) goto L_0x0026
        L_0x001f:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x002f }
            r0.stop(r1)     // Catch:{ all -> 0x002f }
        L_0x0026:
            monitor-exit(r3)
            return
        L_0x0028:
            r1 = move-exception
            java.lang.Error r0 = new java.lang.Error     // Catch:{ all -> 0x002f }
            r0.<init>(r1)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5R0.close():void");
    }

    public synchronized void flush() {
        if (!this.A00) {
            this.out.write("POST /chat HTTP/1.1\r\nHost: c.whatsapp.net\r\nUser-Agent: Mozilla/5.0 (compatible; WAChat/1.2; +http://www.whatsapp.com/contact)\r\nTransfer-Encoding: chunked\r\n\r\n".getBytes(C19430v1.A0B));
            this.A00 = true;
        }
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer.position() > 0) {
            this.out.write(Integer.toHexString(byteBuffer.position()).getBytes(C19430v1.A0B));
            this.out.write(13);
            this.out.write(10);
            this.out.write(byteBuffer.array(), 0, byteBuffer.position());
            this.out.write(13);
            this.out.write(10);
            byteBuffer.clear();
        }
        super.flush();
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        while (true) {
            ByteBuffer byteBuffer = this.A01;
            if (i2 > byteBuffer.remaining()) {
                int remaining = byteBuffer.remaining();
                byteBuffer.put(bArr, i, remaining);
                flush();
                i += remaining;
                i2 -= remaining;
            } else {
                byteBuffer.put(bArr, i, i2);
            }
        }
    }

    public AnonymousClass5R0(OutputStream outputStream) {
        super(outputStream);
        Objects.requireNonNull(outputStream, "out may not be null");
    }

    public synchronized void write(int i) {
        ByteBuffer byteBuffer = this.A01;
        if (!byteBuffer.hasRemaining()) {
            flush();
        }
        byteBuffer.put((byte) i);
    }
}
