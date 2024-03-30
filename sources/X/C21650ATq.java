package X;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: X.ATq  reason: case insensitive filesystem */
public class C21650ATq implements Closeable {
    public final C192339Gp A00;
    public final InputStream A01;

    public void close() {
        this.A01.close();
    }

    public C21650ATq(C192339Gp r1, InputStream inputStream) {
        this.A00 = r1;
        this.A01 = inputStream;
    }
}
