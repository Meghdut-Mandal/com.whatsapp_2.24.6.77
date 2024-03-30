package X;

/* renamed from: X.1Tj  reason: invalid class name and case insensitive filesystem */
public final class C28621Tj {
    public final C20520xh A00;
    public final C28551Tc A01;

    public C28621Tj(C20520xh r2, C28551Tc r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final AnonymousClass3T1 A00(C21337AHp aHp, long j) {
        int i;
        long j2;
        if (aHp.BGb() instanceof C28981Uw) {
            AnonymousClass8SX r2 = aHp.A0M;
            if (r2 != null) {
                Integer num = aHp.A0U;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                AnonymousClass9VZ r3 = aHp.A0B;
                if (r3 != null) {
                    j2 = r3.A01;
                } else {
                    j2 = aHp.A18;
                }
                AnonymousClass9T0 A002 = C1899296d.A00(r2, aHp.BE4(), j2);
                A002.A04 = aHp.BFC();
                A002.A0F = true;
                A002.A00 = i;
                A002.A06 = aHp.A0c;
                A002.A01 = aHp.A01;
                A002.A0C = aHp.A0w;
                A002.A0E = aHp.A0s;
                A002.A08 = aHp.A0k;
                A002.A0A = aHp.A0p;
                A002.A0B = aHp.A0q;
                A002.A02 = aHp.A08;
                A002.A0D = aHp.A0r;
                AnonymousClass3T1 A003 = this.A00.A00(A002.A00());
                if (aHp.A01 == 3) {
                    A003.A0j(C132986Wc.A0F);
                    if (r3 != null) {
                        C64933Qa r6 = A003.A1J;
                        long j3 = r3.A00;
                        A003.A11(new AnonymousClass37F(r6, j3, j3));
                        A003.A0I = r3.A01;
                    }
                }
                if (!this.A01.A04(A003)) {
                    byte[] A0o = r2.A0o();
                    A003 = new AnonymousClass2bK(A003.A1J, A0o, 2, aHp.A01, A003.A0I);
                }
                if (A003.A1J.A02) {
                    A003.A0n(4);
                }
                A003.A1O = j;
                return A003;
            }
            boolean z = aHp.A0Q.A02;
            AnonymousClass11F BGb = aHp.BGb();
            String str = aHp.A1C;
            AnonymousClass2c7 r1 = new AnonymousClass2c7(new C64933Qa(BGb, str, z), aHp.A18);
            r1.A01 = str;
            if (z) {
                r1.A0n(4);
            }
            r1.A1O = j;
            return r1;
        }
        throw new C28541Tb((Integer) 0, "NewsletterMessageManager/trying to process newsletter message for non newsletter chat");
    }
}
