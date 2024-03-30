package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3Pf  reason: invalid class name and case insensitive filesystem */
public final class C64733Pf {
    public final C19970wo A00;
    public final AnonymousClass1I6 A01;
    public final AnonymousClass1I7 A02;
    public final C20310xM A03;
    public final C238019x A04;
    public final AnonymousClass005 A05;
    public final AnonymousClass00T A06 = C36431kI.A1I(new AnonymousClass4BG(this));
    public final AnonymousClass1YG A07;
    public final AnonymousClass1I4 A08;
    public final AnonymousClass1I5 A09;
    public final C30951b2 A0A;
    public final C19770wU A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r6.A02.A00() != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(com.whatsapp.jid.UserJid r7, boolean r8) {
        /*
            r6 = this;
            r5 = 0
            if (r7 == 0) goto L_0x0062
            X.1YG r0 = r6.A07
            X.1IN r0 = r0.A01
            X.9TX r2 = r0.A00(r7)
            boolean r0 = r2 instanceof X.C175418aS
            if (r0 == 0) goto L_0x0062
            X.8aS r2 = (X.C175418aS) r2
            if (r2 == 0) goto L_0x0062
            X.00T r0 = r6.A06
            java.lang.Object r0 = r0.getValue()
            X.3EX r0 = (X.AnonymousClass3EX) r0
            boolean r4 = r0.A00()
            boolean r0 = r2.A06
            r3 = 1
            if (r0 != 0) goto L_0x0030
            X.1I6 r0 = r6.A01
            X.0yC r1 = r0.A00
            r0 = 976(0x3d0, float:1.368E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0039
        L_0x0030:
            X.1I7 r0 = r6.A02
            boolean r0 = r0.A00()
            r1 = 0
            if (r0 == 0) goto L_0x003a
        L_0x0039:
            r1 = 1
        L_0x003a:
            if (r8 == 0) goto L_0x0063
            X.1I4 r0 = r6.A08
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0063
            if (r4 == 0) goto L_0x0063
            if (r1 == 0) goto L_0x0063
            X.1I5 r0 = r6.A09
            X.0yC r1 = r0.A00
            r0 = 2935(0xb77, float:4.113E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x0058
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x0063
        L_0x0058:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            if (r0 == 0) goto L_0x0062
            boolean r5 = r0.booleanValue()
        L_0x0062:
            return r5
        L_0x0063:
            r3 = 0
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64733Pf.A02(com.whatsapp.jid.UserJid, boolean):boolean");
    }

    public static final boolean A00(C64733Pf r6, UserJid userJid, boolean z, boolean z2) {
        boolean z3 = r6.A07.A01.A00(userJid) instanceof C175418aS;
        boolean z4 = !((AnonymousClass3EX) r6.A06.getValue()).A00();
        boolean A0E = r6.A09.A00.A0E(2935);
        boolean z5 = !r6.A0A.A01(C51332ne.CTWA);
        if (!r6.A08.A00() || !z3 || !z4 || !z || !z5) {
            return false;
        }
        if (A0E || z2) {
            return true;
        }
        return false;
    }

    public C64733Pf(C19970wo r2, AnonymousClass1YG r3, AnonymousClass1I6 r4, AnonymousClass1I7 r5, AnonymousClass1I4 r6, C20310xM r7, AnonymousClass1I5 r8, C30951b2 r9, C238019x r10, C19770wU r11, AnonymousClass005 r12) {
        C36321k7.A1B(r2, r11, r10, r7, r6);
        C36321k7.A13(r5, r12, r9);
        C36361kB.A1K(r3, r4);
        this.A00 = r2;
        this.A0B = r11;
        this.A04 = r10;
        this.A03 = r7;
        this.A08 = r6;
        this.A02 = r5;
        this.A05 = r12;
        this.A0A = r9;
        this.A09 = r8;
        this.A07 = r3;
        this.A01 = r4;
    }

    public final void A01(AnonymousClass11F r7, boolean z) {
        if (A02(C36401kF.A0b(r7), z)) {
            AnonymousClass00T r5 = this.A06;
            AnonymousClass35I r4 = ((AnonymousClass3EX) r5.getValue()).A02;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("pref_consumer_disclosure_message_shown_");
            if (!C36411kG.A0E(r4.A01).getBoolean(AnonymousClass000.A0q(r7.getRawString(), A0u), false)) {
                AnonymousClass35I r3 = ((AnonymousClass3EX) r5.getValue()).A02;
                C36331k8.A0w(C36351kA.A0A(r3.A01), AnonymousClass000.A0q(r7.getRawString(), AnonymousClass000.A0v("pref_consumer_disclosure_message_shown_")), true);
                C81193wc.A01(this.A0B, this, r7, 25);
            }
        }
    }
}
