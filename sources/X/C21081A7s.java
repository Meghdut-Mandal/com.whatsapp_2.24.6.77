package X;

/* renamed from: X.A7s  reason: case insensitive filesystem */
public class C21081A7s implements C22904AyG {
    public boolean B6t(C200269h0 r4, C200269h0 r5, AnonymousClass9LX r6) {
        boolean z;
        if (!(r4 instanceof AnonymousClass8T8) || !(r5 instanceof AnonymousClass8T8)) {
            if (r4 instanceof AnonymousClass8TB) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C200269h0 A00 = AnonymousClass8TB.A00(r4);
                if (!(A00 instanceof AnonymousClass8T4)) {
                    return A00.A06().A00.contains(r5);
                }
            }
            return false;
        }
        AnonymousClass8T8 A05 = r4.A05();
        return A05.A01.contains(r5.A05().A01);
    }
}
