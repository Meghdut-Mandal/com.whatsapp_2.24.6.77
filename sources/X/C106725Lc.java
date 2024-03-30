package X;

/* renamed from: X.5Lc  reason: invalid class name and case insensitive filesystem */
public final class C106725Lc extends AnonymousClass12N {
    public C117995nA A00;
    public final AnonymousClass6S8 A01;
    public final C21060yb A02;
    public final C19890wg A03;

    public void Bjh(AnonymousClass5SK r3, boolean z) {
        C117995nA r0 = this.A00;
        if (r0 != null) {
            r0.A00.A01.A07(-1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106725Lc(AnonymousClass6S8 r1, C21060yb r2, C19890wg r3, C220112n r4) {
        super(r4);
        C36321k7.A11(r2, r3, r4);
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r1;
        A08();
    }

    public String BHv() {
        long j;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("bkch=");
        C1496071z A002 = AnonymousClass6S8.A00(this.A01);
        if (A002 == null) {
            j = 0;
        } else {
            synchronized (A002) {
                j = A002.A01;
            }
        }
        return C36411kG.A11(A0u, j);
    }
}
