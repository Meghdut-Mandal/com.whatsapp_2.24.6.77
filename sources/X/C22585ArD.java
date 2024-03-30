package X;

import java.io.OutputStream;

/* renamed from: X.ArD  reason: case insensitive filesystem */
public class C22585ArD extends C22667AsX {
    public C22585ArD(byte[] bArr, int i) {
        super(bArr, i);
    }

    public int A0A() {
        int length = this.A01.length;
        return C201849kY.A01(length + 1) + 1 + length + 1;
    }

    public boolean A0E() {
        return false;
    }

    public void A0D(C200179gm r6, boolean z) {
        byte b = (byte) this.A00;
        byte[] bArr = this.A01;
        if (z) {
            r6.A00.write(3);
        }
        int length = bArr.length;
        r6.A01(length + 1);
        OutputStream outputStream = r6.A00;
        outputStream.write(b);
        outputStream.write(bArr, 0, length);
    }
}
