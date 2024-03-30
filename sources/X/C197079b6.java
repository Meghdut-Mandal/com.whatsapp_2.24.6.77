package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.9b6  reason: invalid class name and case insensitive filesystem */
public abstract class C197079b6 {
    public static final Charset A00 = Charset.forName(DefaultCrypto.UTF_8);
    public static final byte[] A01;
    public static final C197749cJ A02;
    public static final ByteBuffer A03;
    public static final Charset A04 = Charset.forName("ISO-8859-1");

    static {
        byte[] bArr = new byte[0];
        A01 = bArr;
        A03 = ByteBuffer.wrap(bArr);
        C197749cJ r2 = new C197749cJ(bArr);
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
        } catch (C187308xd e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static AnonymousClass8DG A00(Object obj, Object obj2) {
        AnonymousClass8DG r3 = (AnonymousClass8DG) ((C23118B5x) obj);
        C170308Cx r2 = (C170308Cx) r3.A06(5);
        r2.A01();
        AnonymousClass8DG r1 = r2.A00;
        C165597tg.A0J(r1).Bye(r1, r3);
        C23118B5x b5x = (C23118B5x) obj2;
        if (r2.A02.getClass().isInstance(b5x)) {
            r2.A01();
            AnonymousClass8DG r12 = r2.A00;
            C165597tg.A0J(r12).Bye(r12, (AnonymousClass8DG) ((C21012A3a) b5x));
            return r2.A00();
        }
        throw AnonymousClass001.A08("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
