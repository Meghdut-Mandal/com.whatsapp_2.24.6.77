package X;

/* renamed from: X.3sY  reason: invalid class name and case insensitive filesystem */
public final class C78713sY implements C17820s5 {
    public final AnonymousClass005 A00;

    public C78713sY(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void BmI(AnonymousClass3T1 r6, C52942qQ r7) {
        String str;
        String str2;
        AnonymousClass00C.A0D(r6, 0);
        if ((r6.A1R & 4) == 4 || !((str2 = r6.A0t) == null || str2.length() == 0)) {
            C202319lY A0L = ((C24881Ed) this.A00.get()).A0L(r6.A1J.A01, r6.A0t, r6.A1N);
            r6.A0M = A0L;
            if (A0L == null || (str = A0L.A0K) == null) {
                str = "UNSET";
            }
            r6.A0t = str;
            if (r7 != null) {
                throw C36321k7.A04(C78713sY.class);
            }
        }
    }
}
