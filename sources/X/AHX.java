package X;

public final class AHX implements B6A {
    public final C19630wG A00;
    public final C28371Sj A01;
    public final AnonymousClass97O A02;
    public final C28471Su A03;

    public C16340p0 BGA(AnonymousClass3T1 r6) {
        String str;
        AnonymousClass00C.A0D(r6, 0);
        if (C202359le.A04(r6)) {
            str = C202359le.A00(r6);
        } else {
            str = null;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        String A0b = r6.A0b();
        if (A0b == null) {
            A0b = "";
        }
        A0u.append(A0b);
        A0u.append(10);
        if (str == null) {
            str = "";
        }
        CharSequence A022 = AnonymousClass14B.A02(this.A01.A01(this.A00.A00, r6, this.A03.A00(C36371kC.A0y(AnonymousClass000.A0q(str, A0u)))));
        if (A022 == null) {
            A022 = "";
        }
        return new AH9(A022);
    }

    public AHX(C19630wG r1, C28371Sj r2, AnonymousClass97O r3, C28471Su r4) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }
}
