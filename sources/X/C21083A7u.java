package X;

/* renamed from: X.A7u  reason: case insensitive filesystem */
public class C21083A7u implements C22904AyG {
    public boolean B6t(C200269h0 r4, C200269h0 r5, AnonymousClass9LX r6) {
        if (!(r4 instanceof AnonymousClass8TB) || !(r5 instanceof AnonymousClass8TB)) {
            return r4.equals(r5);
        }
        AnonymousClass8TB A02 = r4.A02();
        AnonymousClass8TB A022 = r5.A02();
        if (A02 == A022) {
            return true;
        }
        Object obj = A02.A00;
        if (obj != null) {
            if (!obj.equals(A022.A07())) {
                return false;
            }
            return true;
        } else if (A022.A00 == null) {
            return true;
        }
        return false;
    }
}
