package X;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: X.ATy  reason: case insensitive filesystem */
public class C21657ATy implements Closeable, B2K {
    public ByteBuffer A00;
    public final int A01;

    public synchronized void close() {
        this.A00 = null;
    }

    public synchronized boolean isClosed() {
        return AnonymousClass000.A1W(this.A00);
    }

    public C21657ATy(int i) {
        this.A00 = ByteBuffer.allocateDirect(i);
        this.A01 = i;
    }

    public int BHb() {
        return this.A01;
    }
}
