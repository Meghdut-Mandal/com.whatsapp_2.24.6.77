package X;

import java.nio.ByteBuffer;

/* renamed from: X.4tQ  reason: invalid class name and case insensitive filesystem */
public final class C99454tQ extends AnonymousClass669 {
    public C99464tR A04(int i) {
        C99464tR r2 = new C99464tR();
        int A02 = A02(26);
        if (A02 == 0) {
            return null;
        }
        int A00 = AnonymousClass669.A00(this, A02) + 4 + (i * 4);
        int i2 = A00 + this.A01.getInt(A00);
        ByteBuffer byteBuffer = this.A01;
        r2.A00 = i2;
        r2.A01 = byteBuffer;
        return r2;
    }
}
