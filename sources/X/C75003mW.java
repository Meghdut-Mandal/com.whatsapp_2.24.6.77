package X;

import java.io.IOException;

/* renamed from: X.3mW  reason: invalid class name and case insensitive filesystem */
public final class C75003mW implements C160087kR {
    public final /* synthetic */ C88564Te A00;
    public final /* synthetic */ C69313dK A01;
    public final /* synthetic */ String A02;

    public void B2J(C123815x8 r8) {
        AnonymousClass00C.A0D(r8, 0);
        C69313dK r3 = this.A01;
        r3.A03.A0H(new C1503574y(r8, r3, this.A00, this.A02, 22));
    }

    public void BVL(IOException iOException) {
        AnonymousClass00C.A0D(iOException, 0);
        BWk(iOException);
    }

    public void BWk(Exception exc) {
        AnonymousClass00C.A0D(exc, 0);
        C69313dK r3 = this.A01;
        r3.A03.A0H(new C1503574y(exc, r3, this.A00, this.A02, 23));
    }

    public C75003mW(C88564Te r1, C69313dK r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = r1;
    }
}
