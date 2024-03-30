package X;

/* renamed from: X.6g9  reason: invalid class name and case insensitive filesystem */
public abstract class C137446g9 implements C157657dt {
    public final C157557dj A00;
    public final C157557dj A01;
    public final C157557dj A02;
    public final C157557dj A03;

    public final C109065Wd B4p(C161937ni r19, AnonymousClass5RW r20, long j) {
        C161937ni r2 = r19;
        long j2 = j;
        float Bvr = this.A03.Bvr(r2, j2);
        float Bvr2 = this.A02.Bvr(r2, j2);
        float Bvr3 = this.A00.Bvr(r2, j2);
        float Bvr4 = this.A01.Bvr(r2, j2);
        float min = Math.min(Math.abs(AnonymousClass6X0.A01(j2)), Math.abs(AnonymousClass6X0.A00(j2)));
        float f = Bvr + Bvr4;
        if (f > min) {
            float f2 = min / f;
            Bvr *= f2;
            Bvr4 *= f2;
        }
        float f3 = Bvr2 + Bvr3;
        if (f3 > min) {
            float f4 = min / f3;
            Bvr2 *= f4;
            Bvr3 *= f4;
        }
        if (Bvr < 0.0f || Bvr2 < 0.0f || Bvr3 < 0.0f || Bvr4 < 0.0f) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Corner size in Px can't be negative(topStart = ");
            A0u.append(Bvr);
            A0u.append(", topEnd = ");
            A0u.append(Bvr2);
            A0u.append(", bottomEnd = ");
            A0u.append(Bvr3);
            A0u.append(", bottomStart = ");
            A0u.append(Bvr4);
            throw AnonymousClass000.A0c(")!", A0u);
        }
        int i = ((Bvr + Bvr2 + Bvr3 + Bvr4) > 0.0f ? 1 : ((Bvr + Bvr2 + Bvr3 + Bvr4) == 0.0f ? 0 : -1));
        long j3 = C133206Xf.A03;
        if (i == 0) {
            return new C94504iK(AnonymousClass5WT.A00(j3, j2));
        }
        AnonymousClass6QC A002 = AnonymousClass5WT.A00(j3, j2);
        AnonymousClass5RW r5 = AnonymousClass5RW.Ltr;
        float f5 = Bvr2;
        AnonymousClass5RW r7 = r20;
        if (r7 == r5) {
            f5 = Bvr;
        }
        long A0B = C90464aC.A0B(f5, f5);
        long j4 = AnonymousClass6RD.A00;
        if (r7 != r5) {
            Bvr2 = Bvr;
        }
        long A0B2 = C90464aC.A0B(Bvr2, Bvr2);
        float f6 = Bvr4;
        if (r7 == r5) {
            f6 = Bvr3;
        }
        long A0B3 = C90464aC.A0B(f6, f6);
        if (r7 != r5) {
            Bvr4 = Bvr3;
        }
        return new C94514iL(new AnonymousClass6PW(A002.A01, A002.A03, A002.A02, A002.A00, A0B, A0B2, A0B3, C90464aC.A0B(Bvr4, Bvr4)));
    }

    public C137446g9(C157557dj r1, C157557dj r2, C157557dj r3, C157557dj r4) {
        this.A03 = r1;
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = r4;
    }
}
