package X;

/* renamed from: X.3s3  reason: invalid class name and case insensitive filesystem */
public final class C78403s3 implements C17810s4 {
    public final AnonymousClass005 A00;

    public C78403s3(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void BmI(AnonymousClass3T1 r4, C52942qQ r5) {
        boolean z;
        AnonymousClass00C.A0D(r4, 0);
        C63683Kz A0V = r4.A0V();
        if (A0V != null) {
            synchronized (A0V) {
                z = A0V.A02;
            }
            if (z && A0V.A02() != null) {
                ((AnonymousClass1EH) this.A00.get()).A03(r4, A0V.A02());
                synchronized (A0V) {
                    A0V.A02 = false;
                }
                if (r5 != null) {
                    throw C36321k7.A04(C78403s3.class);
                }
            }
        }
    }
}
