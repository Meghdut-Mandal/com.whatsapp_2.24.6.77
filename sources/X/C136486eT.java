package X;

/* renamed from: X.6eT  reason: invalid class name and case insensitive filesystem */
public final class C136486eT implements C157477db {
    public final C157597dn A00;
    public final C157597dn A01;
    public final C157597dn A02;

    public void B67(C161667nH r15) {
        long j;
        float f;
        C161667nH r3 = r15;
        r15.B63();
        if (AnonymousClass000.A1X(this.A02.getValue())) {
            j = C133336Xx.A01;
            f = 0.3f;
        } else if (AnonymousClass000.A1X(this.A01.getValue()) || AnonymousClass000.A1X(this.A00.getValue())) {
            j = C133336Xx.A01;
            f = 0.1f;
        } else {
            return;
        }
        long A05 = AnonymousClass6QU.A00(C114185go.A0K[(int) (j & 63)], C133336Xx.A04(j), C133336Xx.A03(j), C133336Xx.A02(j), f);
        long BHc = r15.BHc();
        r3.B6E((C114365h6) null, C94604iU.A00, 1.0f, 3, A05, C133206Xf.A03, BHc);
    }

    public C136486eT(C157597dn r1, C157597dn r2, C157597dn r3) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
    }
}
