package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.0S2  reason: invalid class name */
public abstract class AnonymousClass0S2 {
    public static final Charset A00 = Charset.forName("US-ASCII");
    public static final Charset A01 = Charset.forName(DefaultCrypto.UTF_8);
    public static final Charset A02 = Charset.forName("ISO-8859-1");
    public static final AnonymousClass0T2 A03;
    public static final ByteBuffer A04;
    public static final byte[] A05;

    static {
        byte[] bArr = new byte[0];
        A05 = bArr;
        A04 = ByteBuffer.wrap(bArr);
        AnonymousClass0T2 r2 = new AnonymousClass0T2(bArr);
        try {
            int i = r2.A00 + r2.A01;
            r2.A00 = i;
            if (i > 0) {
                r2.A01 = i;
                r2.A00 = i - i;
            } else {
                r2.A01 = 0;
            }
            A03 = r2;
        } catch (AnonymousClass0NX e) {
            throw new IllegalArgumentException(e);
        }
    }
}
