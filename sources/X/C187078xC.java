package X;

import java.io.ByteArrayOutputStream;

/* renamed from: X.8xC  reason: invalid class name and case insensitive filesystem */
public final class C187078xC extends ByteArrayOutputStream {
    public byte[] A00() {
        int i = this.count;
        byte[] bArr = this.buf;
        if (i == bArr.length) {
            return bArr;
        }
        return toByteArray();
    }

    public C187078xC(int i) {
        super(i);
    }
}
