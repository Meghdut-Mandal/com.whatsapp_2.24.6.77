package X;

import java.io.ByteArrayOutputStream;

/* renamed from: X.5Qn  reason: invalid class name and case insensitive filesystem */
public class C107705Qn extends ByteArrayOutputStream {
    public byte[] toByteArray() {
        int i = this.count;
        byte[] bArr = this.buf;
        if (i == bArr.length) {
            return bArr;
        }
        return super.toByteArray();
    }

    public C107705Qn(int i) {
        super(i);
    }
}
