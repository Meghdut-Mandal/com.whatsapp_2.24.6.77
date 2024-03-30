package X;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.6ja  reason: invalid class name and case insensitive filesystem */
public abstract class C139316ja implements C161127mE {
    public static final AnonymousClass6P6 A02 = new AnonymousClass6P6(32);
    public int A00;
    public final AtomicLong A01 = new AtomicLong(0);

    public static C120845sA A00(InputStream inputStream, boolean z) {
        AnonymousClass6P6 r6 = A02;
        C120845sA r7 = (C120845sA) r6.A00();
        if (r7 == null) {
            r7 = new C120845sA(new byte[C132986Wc.A0F], 0);
        }
        byte[] bArr = r7.A02;
        byte[] bArr2 = bArr;
        int i = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, i, bArr.length - i);
                if (read == -1) {
                    break;
                }
                i += read;
                int length = bArr.length;
                if (i >= length) {
                    byte[] bArr3 = new byte[(length << 1)];
                    System.arraycopy(bArr, 0, bArr3, 0, length);
                    bArr = bArr3;
                }
            } catch (IOException e) {
                if (!z || i == 0) {
                    r6.A02(r7);
                    if (z) {
                        AnonymousClass6TY.A0J.A03();
                        return null;
                    }
                    throw e;
                }
            }
        }
        if (bArr2 != bArr) {
            r6.A02(r7);
            return new C120845sA(bArr, i);
        }
        r7.A00 = i;
        return r7;
    }

    public static void A01(C120845sA r2) {
        if (r2.A02.length == 131072) {
            r2.A01 = null;
            A02.A02(r2);
        }
    }

    public C139316ja(int i) {
        this.A00 = i;
    }
}
