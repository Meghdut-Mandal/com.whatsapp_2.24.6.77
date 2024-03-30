package X;

import java.util.Set;

/* renamed from: X.0uN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C19100uN implements C19040uH {
    public static final C19100uN A00 = new C19100uN();

    public Object B45(C19110uO r5) {
        Set A03 = r5.A03();
        C19250ud r2 = C19250ud.A01;
        if (r2 == null) {
            synchronized (C19250ud.class) {
                r2 = C19250ud.A01;
                if (r2 == null) {
                    r2 = new C19250ud();
                    C19250ud.A01 = r2;
                }
            }
        }
        return new C19080uL(r2, A03);
    }
}
