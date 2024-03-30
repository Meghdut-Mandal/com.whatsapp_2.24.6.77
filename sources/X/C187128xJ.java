package X;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: X.8xJ  reason: invalid class name and case insensitive filesystem */
public class C187128xJ extends FilterOutputStream {
    public void write(byte[] bArr, int i, int i2) {
        if (i2 < 16777216) {
            this.out.write(C203239na.A03(i2));
            this.out.write(bArr, i, i2);
            this.out.flush();
            return;
        }
        throw new AnonymousClass1WY(AnonymousClass000.A0r("data too large to write; length=", AnonymousClass000.A0u(), i2), i2);
    }

    public C187128xJ(OutputStream outputStream) {
        super(outputStream);
    }

    public void write(int i) {
        write(new byte[]{(byte) i});
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
