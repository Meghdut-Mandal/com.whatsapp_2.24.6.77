package X;

import java.util.Objects;

/* renamed from: X.73Z  reason: invalid class name */
public final /* synthetic */ class AnonymousClass73Z implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C128726Dj A01;
    public final /* synthetic */ AnonymousClass71R A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ AnonymousClass73Z(C128726Dj r1, AnonymousClass71R r2, String str, int i, boolean z) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
        this.A04 = z;
        this.A03 = str;
    }

    public final void run() {
        AnonymousClass71R r0 = this.A02;
        C128726Dj r8 = this.A01;
        int i = this.A00;
        boolean z = this.A04;
        String str = this.A03;
        C116115jy r1 = r0.A00;
        String str2 = r8.A02;
        Objects.requireNonNull("2.24.6.77");
        String str3 = r8.A03;
        int i2 = r8.A00;
        String str4 = r8.A04;
        C18800tq r10 = r1.A00.A00;
        C20810yC A0V = C36341k9.A0V(r10);
        C20020wt A0X = C90504aG.A0X(r10);
        C20050ww A0U = C36381kD.A0U(r10);
        C19420v0 A0Y = C36351kA.A0Y(r10);
        AnonymousClass005 A0i = C90514aH.A0i(r10);
        AnonymousClass004 r12 = r10.A6Z;
        AnonymousClass004 r21 = r12;
        String str5 = str4;
        String str6 = str;
        String str7 = str3;
        String str8 = str2;
        new AnonymousClass5PB(A0U, A0Y, A0V, C90484aE.A0Y(r10), A0X, A0i, str8, str7, str6, str5, r21, r10.A6a, i, i2, z).Blp(new C165557tc(r8, 3));
    }
}
