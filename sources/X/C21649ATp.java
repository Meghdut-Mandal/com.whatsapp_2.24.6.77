package X;

import java.io.Closeable;

/* renamed from: X.ATp  reason: case insensitive filesystem */
public final class C21649ATp implements Closeable {
    public int A00;
    public final AU0 A01;

    public void close() {
        this.A01.close();
    }

    public C21649ATp(AU0 au0, int i) {
        this.A00 = i;
        this.A01 = au0;
    }
}
