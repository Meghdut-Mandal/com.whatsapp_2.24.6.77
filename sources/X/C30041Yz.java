package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1Yz  reason: invalid class name and case insensitive filesystem */
public class C30041Yz {
    public final AnonymousClass1Z1 A00;
    public final C19970wo A01;
    public final C25851Hx A02;
    public final C20810yC A03;
    public final C21010yW A04;

    public void A00(AnonymousClass3T1 r15, int i) {
        AnonymousClass9Xu A012;
        C20810yC r4 = this.A03;
        C21000yV r3 = C21000yV.A02;
        if (C20800yB.A01(r3, r4, 508)) {
            C64933Qa r2 = r15.A1J;
            AnonymousClass11F r1 = r2.A00;
            C222813r r0 = UserJid.Companion;
            UserJid A002 = C222813r.A00(r1);
            if (A002 != null && r2.A02) {
                if (r15.A0q != null || r15.A0p != null) {
                    int i2 = r15.A0D;
                    if (i == 24) {
                        for (AnonymousClass1NM r42 : this.A00.getObservers()) {
                            if (!r42.A02.A0M(A002) && (A012 = r42.A09.A01.A01(A002)) != null && !A012.A08) {
                                r42.A0R.execute(new C35321iV(r42, A002, A012, 40));
                            }
                        }
                    } else if (i2 == 5 || i2 == 13) {
                        boolean A013 = C20800yB.A01(r3, r4, 6657);
                        C25851Hx r43 = this.A02;
                        AnonymousClass1IO r02 = r43.A01;
                        if (!A013) {
                            r02.A00.A00("entry_point_conversions_for_sending").edit().remove(A002.getRawString()).apply();
                            r43.A03.A05(A002);
                            return;
                        }
                        AnonymousClass9Xu A014 = r02.A01(A002);
                        AnonymousClass1IL r12 = r43.A03;
                        C175408aR r03 = (C175408aR) r12.A01(A002);
                        if (A014 != null && !A014.A08) {
                            AnonymousClass9O3 r5 = new AnonymousClass9O3(A002, A014.A06, A014.A05, A014.A01, A014.A03);
                            r5.A02 = A014.A07;
                            r5.A00 = A014.A00;
                            r5.A01 = A014.A02;
                            r5.A03 = true;
                            C25851Hx.A00(r43, new AnonymousClass9Xu(r5));
                        }
                        if (r03 != null && !r03.A04) {
                            r12.A07(new C175408aR(A002, r03.A03, r03.A02, r03.A00, r03.A01, true));
                        }
                    }
                }
            }
        }
    }

    public C30041Yz(AnonymousClass1Z1 r1, C19970wo r2, C25851Hx r3, C20810yC r4, C21010yW r5) {
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
        this.A00 = r1;
    }
}
