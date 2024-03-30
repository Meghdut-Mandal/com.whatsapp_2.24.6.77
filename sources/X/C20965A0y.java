package X;

import java.util.Locale;

/* renamed from: X.A0y  reason: case insensitive filesystem */
public class C20965A0y implements C22867AxM {
    public void BoG(C201109it r7, Throwable th) {
        String A0k;
        Object A01 = r7.A01();
        Class<AU0> cls = AU0.class;
        Object[] A1Q = C36441kJ.A1Q();
        AnonymousClass000.A1J(A1Q, System.identityHashCode(this));
        AnonymousClass000.A1K(A1Q, System.identityHashCode(r7));
        if (A01 == null) {
            A0k = null;
        } else {
            A0k = AnonymousClass000.A0k(A01);
        }
        A1Q[2] = A0k;
        C161037m1 r2 = C132886Vq.A00;
        if (r2.BMH(5)) {
            r2.BxN(cls.getSimpleName(), String.format((Locale) null, "Finalized without closing: %x %x (type = %s)", A1Q));
        }
    }
}
