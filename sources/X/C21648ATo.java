package X;

import java.io.Closeable;

/* renamed from: X.ATo  reason: case insensitive filesystem */
public final class C21648ATo implements Closeable {
    public final int A00;
    public final AU0 A01;

    public void close() {
        this.A01.close();
    }

    public C21648ATo(AU0 au0, int i) {
        this.A00 = i;
        this.A01 = au0;
    }
}
