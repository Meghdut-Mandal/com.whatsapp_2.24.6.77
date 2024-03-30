package X;

import java.io.InputStream;

/* renamed from: X.5R8  reason: invalid class name */
public class AnonymousClass5R8 extends InputStream {
    public int A00;
    public InputStream A01;

    public int read() {
        int i = this.A00;
        if (i <= 0) {
            return -1;
        }
        this.A00 = i - 1;
        return this.A01.read();
    }

    public AnonymousClass5R8(InputStream inputStream, int i) {
        this.A01 = inputStream;
        this.A00 = i;
    }
}
