package X;

import android.view.View;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6T1  reason: invalid class name */
public final class AnonymousClass6T1 {
    public static final List A0F = C36371kC.A11(C107865Re.A02);
    public static final long A0G = TimeUnit.DAYS.toMillis(14);
    public View A00;
    public View A01;
    public C007403e A02;
    public boolean A03;
    public final C001700s A04;
    public final C27631Pa A05;
    public final C123265wD A06;
    public final C19970wo A07;
    public final C20810yC A08;
    public final C34831hi A09;
    public final Map A0A;
    public final AnonymousClass040 A0B;
    public final boolean A0C;
    public final AnonymousClass04S A0D;
    public final AnonymousClass13J A0E;

    public static final void A00(AnonymousClass6T1 r1, AnonymousClass6PK r2) {
        if (r1.A03) {
            C34831hi r12 = r1.A09;
            if (!C90494aF.A1U(r12, r2)) {
                r12.A0D(r2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r1 == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r6.self.A06 == 1) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(com.whatsapp.voipcalling.CallInfo r6) {
        /*
            r5 = this;
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x003b
            X.0yC r1 = r5.A08
            X.13J r0 = r5.A0E
            boolean r2 = X.AnonymousClass3UE.A09(r1, r0, r6)
            com.whatsapp.voipcalling.CallState r1 = r6.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x003c
            boolean r0 = r6.isSelfRequestingUpgrade()
            if (r0 != 0) goto L_0x003c
            X.6EE r0 = r6.self
            int r0 = r0.A06
            r1 = 1
            if (r0 != r1) goto L_0x003c
        L_0x001f:
            X.1hi r0 = r5.A09
            java.lang.Object r0 = X.C36401kF.A0m(r0)
            X.6PK r0 = (X.AnonymousClass6PK) r0
            if (r2 == 0) goto L_0x002c
            r4 = 1
            if (r1 != 0) goto L_0x002d
        L_0x002c:
            r4 = 0
        L_0x002d:
            boolean r3 = r0.A02
            int r2 = r0.A01
            float r1 = r0.A00
            X.6PK r0 = new X.6PK
            r0.<init>(r1, r2, r3, r4)
            A00(r5, r0)
        L_0x003b:
            return
        L_0x003c:
            r1 = 0
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6T1.A01(com.whatsapp.voipcalling.CallInfo):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0031, code lost:
        if (r5 != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6T1(android.content.Context r7, X.C27631Pa r8, X.C21060yb r9, X.C19970wo r10, X.C18820ts r11, X.C20810yC r12, X.AnonymousClass13J r13, X.AnonymousClass040 r14) {
        /*
            r6 = this;
            X.C36321k7.A19(r9, r11, r10, r12)
            X.C36321k7.A10(r13, r8)
            r6.<init>()
            r6.A07 = r10
            r6.A08 = r12
            r6.A0E = r13
            r6.A05 = r8
            r6.A0B = r14
            r0 = 6399(0x18ff, float:8.967E-42)
            boolean r5 = r12.A0E(r0)
            r6.A0C = r5
            long r3 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r1 = X.C27631Pa.A00(r8)
            java.lang.String r0 = "tooltip_last_shown_ms"
            long r0 = X.C36341k9.A0B(r1, r0)
            long r3 = r3 - r0
            long r1 = A0G
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0033
            r0 = 0
            if (r5 == 0) goto L_0x0034
        L_0x0033:
            r0 = 1
        L_0x0034:
            r6.A03 = r0
            X.5Re r1 = X.C107865Re.A02
            X.7Kt r0 = new X.7Kt
            r0.<init>(r6)
            X.00U r0 = X.C36431kI.A1I(r0)
            java.util.Map r0 = X.C36391kE.A11(r1, r0)
            r6.A0A = r0
            X.5wD r0 = new X.5wD
            r0.<init>(r7, r9, r11)
            r6.A06 = r0
            r2 = 0
            r1 = 0
            X.6PK r0 = new X.6PK
            r0.<init>(r1, r2, r2, r2)
            X.1hi r2 = X.C36441kJ.A0s(r0)
            r6.A09 = r2
            X.00s r0 = X.C36431kI.A0S()
            r6.A04 = r0
            r1 = 7
            X.7t0 r0 = new X.7t0
            r0.<init>(r6, r1)
            r6.A0D = r0
            r2.A0A(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6T1.<init>(android.content.Context, X.1Pa, X.0yb, X.0wo, X.0ts, X.0yC, X.13J, X.040):void");
    }
}
