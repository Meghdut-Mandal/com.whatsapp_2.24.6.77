package X;

import com.whatsapp.util.Log;

/* renamed from: X.1ts  reason: invalid class name and case insensitive filesystem */
public final class C39821ts extends AnonymousClass04R {
    public final C001600r A00;
    public final AnonymousClass3KZ A01;
    public final C19420v0 A02;
    public final C20810yC A03;
    public final C34831hi A04;
    public final C19970wo A05;

    public C39821ts(AnonymousClass17Y r23, AnonymousClass3KZ r24, C19970wo r25, C19420v0 r26, C20810yC r27, AnonymousClass11F r28, AnonymousClass1CR r29, boolean z, boolean z2) {
        int i;
        C19970wo r5 = r25;
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass17Y r2 = r23;
        C19420v0 r4 = r26;
        C20810yC r3 = r27;
        AnonymousClass1CR r0 = r29;
        C36321k7.A19(r3, r4, r2, r0);
        this.A05 = r5;
        this.A03 = r3;
        this.A02 = r4;
        AnonymousClass3KZ r32 = r24;
        this.A01 = r32;
        int i2 = 0;
        C34831hi A0s = C36441kJ.A0s(new C64973Qe(0, 0, false, true, false, false, false, false));
        this.A04 = A0s;
        AnonymousClass08S A012 = AnonymousClass0VV.A01(AnonymousClass0VV.A00(new AnonymousClass4ZI(this, 5), A0s));
        this.A00 = A012;
        C64973Qe r8 = (C64973Qe) A0s.A04();
        boolean z3 = r32.A02;
        boolean z4 = r32.A01;
        AnonymousClass11F r33 = r28;
        if (r28 != null && z2 && z4 && (i = C36361kB.A0d(r33, r0).A04) != 0 && i == 1) {
            i2 = 1;
        }
        AnonymousClass00C.A0B(r8);
        boolean z5 = r8.A07;
        boolean z6 = z5;
        A0s.A0D(new C64973Qe(i2, r8.A01, z6, r8.A04, z3, z4, z, r8.A06));
        A012.A0A(new C66033Uk(new AnonymousClass4M5(r2, new C81103wT((Object) this, 49)), 26));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        if (r14 == 1) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0U(int r14) {
        /*
            r13 = this;
            r0 = 1
            r6 = r14
            if (r14 == r0) goto L_0x003b
            r0 = 2
            if (r14 == r0) goto L_0x0034
            r0 = 1
            if (r14 != r0) goto L_0x0016
        L_0x000a:
            X.0v0 r0 = r13.A02
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r0)
            java.lang.String r1 = "push_to_video_nux_shown"
            r0 = 1
            X.C36331k8.A0w(r2, r1, r0)
        L_0x0016:
            X.1hi r1 = r13.A04
            java.lang.Object r0 = X.C36401kF.A0m(r1)
            X.3Qe r0 = (X.C64973Qe) r0
            r7 = 1
            boolean r8 = r0.A04
            boolean r9 = r0.A03
            boolean r10 = r0.A02
            int r5 = r0.A00
            boolean r11 = r0.A05
            boolean r12 = r0.A06
            X.3Qe r4 = new X.3Qe
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r1.A0D(r4)
        L_0x0033:
            return
        L_0x0034:
            X.3KZ r0 = r13.A01
            boolean r0 = r0.A07
            if (r0 != 0) goto L_0x0016
            return
        L_0x003b:
            X.1hi r0 = r13.A04
            java.lang.Object r1 = r0.A04()
            X.3Qe r1 = (X.C64973Qe) r1
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0033
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x0033
            X.0v0 r5 = r13.A02
            long r3 = r5.A0Q()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0033
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r5.A0Q()
            long r3 = r3 - r0
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0033
            X.3KZ r0 = r13.A01
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0033
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r5)
            java.lang.String r0 = "push_to_video_nux_shown"
            boolean r0 = X.C36371kC.A1U(r1, r0)
            if (r0 != 0) goto L_0x0033
            X.0yC r0 = r13.A03
            boolean r0 = X.C54012sG.A00(r5, r0)
            if (r0 != 0) goto L_0x0033
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39821ts.A0U(int):void");
    }

    public final void A0S() {
        C34831hi r2 = this.A04;
        C64973Qe r1 = (C64973Qe) C36401kF.A0m(r2);
        if (r1.A07) {
            r2.A0D(new C64973Qe(r1.A00, r1.A01, false, r1.A04, r1.A03, r1.A02, r1.A05, r1.A06));
        }
    }

    public final void A0T(int i) {
        C34831hi r3 = this.A04;
        C64973Qe r1 = (C64973Qe) C36401kF.A0m(r3);
        int i2 = r1.A00;
        int i3 = i;
        if (i == i2) {
            return;
        }
        if (!this.A01.A05) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("|conversation/viewmodel/ConversationEntryActionButtonViewModel/setRecorderMode called despite canToggleRecorderMode=false;\n             |  prevRecorderMode=");
            A0u.append(i2);
            Log.e(AnonymousClass091.A02(AnonymousClass000.A0r(";\n             |  nextRecorderMode=", A0u, i)));
            return;
        }
        r3.A0D(new C64973Qe(i3, r1.A01, r1.A07, r1.A04, r1.A03, r1.A02, r1.A05, r1.A06));
    }

    public final void A0V(boolean z) {
        C34831hi r1 = this.A04;
        boolean z2 = z;
        if (((C64973Qe) C36401kF.A0m(r1)).A04 != z) {
            C64973Qe r0 = (C64973Qe) C36401kF.A0m(r1);
            r1.A0D(new C64973Qe(r0.A00, r0.A01, r0.A07, z2, r0.A03, r0.A02, r0.A05, r0.A06));
            if (!z) {
                A0S();
            }
        }
    }

    public final void A0W(boolean z) {
        boolean z2;
        C34831hi r3 = this.A04;
        C64973Qe r4 = (C64973Qe) C36401kF.A0m(r3);
        boolean z3 = r4.A06;
        boolean z4 = z;
        if (z == z3) {
            return;
        }
        if (this.A01.A00 == 2) {
            if (z) {
                z2 = false;
            } else {
                z2 = ((C64973Qe) r3.A04()).A07;
            }
            r3.A0D(new C64973Qe(r4.A00, r4.A01, z2, r4.A04, r4.A03, r4.A02, r4.A05, z4));
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("|conversation/viewmodel/ConversationEntryActionButtonViewModel/isRecorderModeMenuVisible set despite isRecorderModeMenuEnabled=false;\n             |  prevIsRecorderModeMenuVisible=");
        A0u.append(z3);
        Log.e(AnonymousClass091.A02(C36371kC.A0z(";\n             |  nextIsRecorderModeMenuVisible=", A0u, z)));
    }
}
