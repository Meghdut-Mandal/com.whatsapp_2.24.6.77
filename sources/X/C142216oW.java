package X;

/* renamed from: X.6oW  reason: invalid class name and case insensitive filesystem */
public final class C142216oW implements AnonymousClass7fI {
    public final long A00;

    private C140456lc A00(C140456lc r5, C140456lc r6) {
        C140456lc r0;
        C142076oI r02 = new C142076oI(new C142196oU((long) r6.A03));
        r5.A0g(r02);
        if (r02.A00 != null || (r0 = r6.A06) == null) {
            return r6;
        }
        return A00(r5, r0);
    }

    public boolean BvX(C140456lc r6) {
        return AnonymousClass000.A1Q((((long) r6.A03) > this.A00 ? 1 : (((long) r6.A03) == this.A00 ? 0 : -1)));
    }

    public C142216oW(C140456lc r3, C140456lc r4) {
        this.A00 = (long) A00(r3, r4).A03;
    }
}
