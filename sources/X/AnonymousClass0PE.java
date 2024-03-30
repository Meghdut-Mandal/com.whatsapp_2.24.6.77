package X;

/* renamed from: X.0PE  reason: invalid class name */
public abstract class AnonymousClass0PE {
    public static C10720f6 A00(C16640pq r3) {
        AnonymousClass0UQ r1 = new AnonymousClass0UQ();
        C10720f6 r2 = new C10720f6(r1);
        r1.A00 = r2;
        r1.A02 = r3.getClass();
        try {
            Object B1V = r3.B1V(r1);
            if (B1V != null) {
                r1.A02 = B1V;
                return r2;
            }
        } catch (Exception e) {
            r2.A01.A05(e);
        }
        return r2;
    }
}
