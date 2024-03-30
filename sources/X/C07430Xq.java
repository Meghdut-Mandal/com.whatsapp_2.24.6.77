package X;

/* renamed from: X.0Xq  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C07430Xq {
    public static final C006302t A00 = C14780mB.A00;
    public static final C009003v A01 = C14850mI.A00;

    public static final AnonymousClass05H A00(C006302t r2, C009003v r3, AnonymousClass05H r4) {
        if (r4 instanceof C12980iy) {
            C12980iy r1 = (C12980iy) r4;
            if (r1.A00 == r2 && r1.A01 == r3) {
                return r4;
            }
        }
        return new C12980iy(r2, r3, r4);
    }

    public static final AnonymousClass05H A01(AnonymousClass05H r2) {
        if (!(r2 instanceof AnonymousClass05K)) {
            return A00(A00, A01, r2);
        }
        return r2;
    }
}
