package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.9b7  reason: invalid class name and case insensitive filesystem */
public abstract class C197089b7 {
    public static final Charset A00 = Charset.forName(DefaultCrypto.UTF_8);
    public static final byte[] A01;
    public static final C197759cK A02;
    public static final ByteBuffer A03;
    public static final Charset A04 = Charset.forName("ISO-8859-1");

    static {
        byte[] bArr = new byte[0];
        A01 = bArr;
        A03 = ByteBuffer.wrap(bArr);
        C197759cK r2 = new C197759cK(bArr);
        try {
            int i = r2.A00 + r2.A01;
            r2.A00 = i;
            if (i > 0) {
                r2.A01 = i;
                r2.A00 = i - i;
            } else {
                r2.A01 = 0;
            }
            A02 = r2;
        } catch (C187318xe e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static AnonymousClass8EX A00(Object obj, Object obj2) {
        AnonymousClass8EX r2 = (AnonymousClass8EX) ((C23119B5y) obj);
        AnonymousClass8EH A012 = AnonymousClass8EX.A01(r2);
        A012.A04(r2);
        C23119B5y b5y = (C23119B5y) obj2;
        if (A012.A02.getClass().isInstance(b5y)) {
            A012.A04((AnonymousClass8EX) ((C21032A3v) b5y));
            return A012.A02();
        }
        throw AnonymousClass001.A08("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
