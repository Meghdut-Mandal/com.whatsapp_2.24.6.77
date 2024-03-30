package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.0WB  reason: invalid class name */
public abstract class AnonymousClass0WB {
    public static final Charset A00 = Charset.forName("US-ASCII");
    public static final Charset A01 = Charset.forName("ISO-8859-1");
    public static final AnonymousClass0T1 A02;
    public static final ByteBuffer A03;
    public static final Charset A04 = Charset.forName(DefaultCrypto.UTF_8);
    public static final byte[] A05;

    static {
        byte[] bArr = new byte[0];
        A05 = bArr;
        A03 = ByteBuffer.wrap(bArr);
        AnonymousClass0T1 r2 = new AnonymousClass0T1(bArr);
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
        } catch (C05050Na e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static AnonymousClass0M8 A00(Object obj, Object obj2) {
        AnonymousClass0M1 r1 = new AnonymousClass0M1((AnonymousClass0OW) null);
        r1.A01((AnonymousClass0M8) ((C17630rj) obj));
        C17630rj r3 = (C17630rj) obj2;
        if (r1.A02.getClass().isInstance(r3)) {
            r1.A01((AnonymousClass0M8) ((AnonymousClass0eZ) r3));
            AnonymousClass0M1.A00(r1);
            return r1.A00;
        }
        throw AnonymousClass001.A08("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
