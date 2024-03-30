package X;

import java.util.HashMap;

/* renamed from: X.6qb  reason: invalid class name and case insensitive filesystem */
public class C143466qb implements C159287j7 {
    public C95434kv A00;
    public C159357jE A01;
    public C1261662u A02;
    public boolean A03;
    public final C1272067j A04;
    public final AnonymousClass5DR A05;
    public final C132406Tm A06;
    public final C142616pA A07;
    public final C142616pA A08;
    public final C142646pD A09;
    public final C129006Eo A0A;
    public final C20830yE A0B;
    public final AnonymousClass1QW A0C;
    public final C19770wU A0D;

    public void A07(C121385t3 r10) {
        if (this.A03) {
            this.A03 = false;
            C95434kv r2 = this.A00;
            if (r2.A00 == 1) {
                r2.A02.removeCallbacks(r2.A09);
            }
            C132406Tm r5 = this.A06;
            r5.A06("gps_request_end");
            this.A04.A01(r10.A01, this, r5, r10.A02, "device", r10.A00);
            return;
        }
        C129006Eo r3 = this.A0A;
        AnonymousClass6QG A012 = r3.A01();
        if (A012 != null && "device".equals(A012.A08)) {
            if (C90474aD.A0J(AnonymousClass6QG.A00(A012), "origin").distanceTo(C90474aD.A0J(r10.A01, "destination")) > 800.0f) {
                r3.A01 = true;
                r3.A00 = null;
                this.A01.BaE();
            }
        }
    }

    public int A01() {
        AnonymousClass6QG r0 = this.A00.A01;
        if (r0 == null) {
            return 2;
        }
        return r0.A02();
    }

    public void A02() {
        C132406Tm r1 = this.A06;
        r1.A05();
        r1.A06("gps_request_start");
        this.A03 = true;
    }

    public void A03() {
        C142616pA r3;
        int i;
        C95434kv r4 = this.A00;
        int i2 = r4.A00;
        if (!(i2 == 0 || i2 == 2)) {
            if (i2 == 4) {
                r3 = this.A07;
                i = 27;
                r3.A05(A00(this), i, r4.A0E());
            } else if (i2 != 7) {
                return;
            }
        }
        r3 = this.A07;
        i = 26;
        r3.A05(A00(this), i, r4.A0E());
    }

    public void A04() {
        C95434kv r2 = this.A00;
        C129006Eo r0 = r2.A04;
        C132296Sz r1 = r2.A05;
        AnonymousClass6QG A012 = r0.A01();
        if (A012 == null) {
            A012 = r1.A02();
        }
        C95434kv.A02(A012, r2);
        C95434kv.A03(r2);
    }

    public void A05() {
        C95434kv r2 = this.A00;
        r2.A00 = 3;
        r2.A02.removeCallbacks(r2.A09);
        r2.A0C(C95434kv.A00(r2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r2 == 7) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.C1261662u r6, int r7) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0028
            X.6pD r4 = r5.A09
            java.lang.String r0 = "imprecise_location_tile"
            java.util.HashMap r3 = r6.A00(r0)
            int r2 = r6.A00
            r1 = 28
            if (r2 == 0) goto L_0x001d
            r0 = 1
            if (r2 == r0) goto L_0x001b
            r0 = 4
            if (r2 == r0) goto L_0x001b
            r0 = 7
            r1 = 27
            if (r2 != r0) goto L_0x001d
        L_0x001b:
            r1 = 29
        L_0x001d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            int r0 = r0.intValue()
            r4.BOk(r3, r7, r0)
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143466qb.A08(X.62u, int):void");
    }

    public boolean A09() {
        int i = this.A00.A00;
        if (i == 2 || i == 0 || i == 7) {
            return true;
        }
        return false;
    }

    public void BZ6(C1261662u r4, int i) {
        this.A02 = r4;
        C95434kv r2 = this.A00;
        if (r2.A00 == 1) {
            int i2 = 6;
            if (i == -1) {
                i2 = 5;
            }
            r2.A00 = i2;
            r2.A02.removeCallbacks(r2.A09);
            r2.A0D(C95434kv.A00(r2));
        }
        if (i == 4) {
            this.A01.BZ5(r4, i);
        }
        this.A06.A03();
    }

    public void BZ7(AnonymousClass6QG r4) {
        C95434kv r2 = this.A00;
        if (r2.A00 == 1) {
            r2.A02.removeCallbacks(r2.A09);
            C1501874h.A01(r2.A08, r2, r4, 27);
        }
        this.A06.A04();
    }

    public C143466qb(C1254960a r10, AnonymousClass60b r11, C142616pA r12, C142616pA r13, C142646pD r14, AnonymousClass5DR r15, C129006Eo r16, C132296Sz r17, AnonymousClass4PO r18, C159357jE r19, C159377jG r20, C20830yE r21, AnonymousClass1QW r22, C142606p9 r23, C19770wU r24) {
        C19770wU r8 = r24;
        this.A0D = r8;
        this.A07 = r12;
        C20830yE r6 = r21;
        this.A0B = r6;
        AnonymousClass1QW r7 = r22;
        this.A0C = r7;
        this.A04 = r11.A00(r23, r13);
        this.A05 = r15;
        C129006Eo r2 = r16;
        this.A0A = r2;
        this.A06 = r10.A00(871839723);
        this.A00 = new C95434kv(r15, r2, r17, r18, r20, r6, r7, r8);
        this.A01 = r19;
        this.A08 = r13;
        this.A09 = r14;
    }

    public static Integer A00(C143466qb r0) {
        return Integer.valueOf(r0.A01());
    }

    public void A06(int i) {
        HashMap A0J = AnonymousClass001.A0J();
        A0J.put("error_type", "location_error");
        A0J.put("error_description", "System location providers - GPS and Network providers - are not available");
        this.A09.BOk(A0J, i, 51);
        this.A06.A03();
    }
}
