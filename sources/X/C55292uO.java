package X;

import java.util.Date;

/* renamed from: X.2uO  reason: invalid class name and case insensitive filesystem */
public abstract class C55292uO {
    public static final String A00(C18820ts r2, int i, long j) {
        String A08;
        AnonymousClass00C.A0D(r2, 0);
        if ("sl".equals(r2.A06())) {
            A08 = C20040wv.A0C(r2, i).format(new Date(j));
        } else {
            A08 = C20040wv.A08(r2, j);
        }
        AnonymousClass00C.A0B(A08);
        return A08;
    }
}
