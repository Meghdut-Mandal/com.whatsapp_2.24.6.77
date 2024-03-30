package com.whatsapp.settings;

import X.AnonymousClass04R;
import X.AnonymousClass17Y;
import X.AnonymousClass1BX;
import X.AnonymousClass1C4;
import X.AnonymousClass1M6;
import X.AnonymousClass1VS;
import X.AnonymousClass37R;
import X.AnonymousClass3NU;
import X.AnonymousClass3QR;
import X.C001700s;
import X.C19770wU;
import X.C20720y3;
import X.C20800yB;
import X.C20810yC;
import X.C21000yV;
import X.C36431kI;
import X.C36441kJ;
import X.C44812Oy;
import X.C55172uC;
import X.C61523Ch;
import X.C68903ce;
import X.C81163wZ;
import X.C81173wa;
import com.whatsapp.R;

public class SettingsUserProxyViewModel extends AnonymousClass04R {
    public int A00 = 0;
    public int A01 = 0;
    public String A02;
    public boolean A03;
    public boolean A04;
    public final C001700s A05 = C36431kI.A0S();
    public final C001700s A06 = C36431kI.A0S();
    public final C001700s A07 = C36431kI.A0S();
    public final AnonymousClass17Y A08;
    public final AnonymousClass1M6 A09;
    public final C20720y3 A0A;
    public final AnonymousClass1C4 A0B;
    public final C61523Ch A0C;
    public final AnonymousClass1BX A0D;
    public final AnonymousClass1VS A0E;
    public final AnonymousClass3NU A0F;
    public final C68903ce A0G;
    public final C19770wU A0H;
    public final C20810yC A0I;

    public static int A01(int i) {
        if (i == 1 || i == 2 || i == 3 || i == 4 || i != 5) {
            return R.string.f12nameremoved;
        }
        return R.string.f12nameremoved;
    }

    public synchronized void A0U() {
        String A012 = this.A0E.A00.A01();
        this.A02 = A012;
        this.A05.A0C(A012);
    }

    public synchronized void A0V(int i, boolean z) {
        C61523Ch r3;
        boolean z2;
        this.A00 = i;
        if (!z) {
            if (i == 2) {
                r3 = this.A0C;
                z2 = true;
            } else if (i == 3 || i == 4) {
                r3 = this.A0C;
                z2 = false;
            }
            Boolean valueOf = Boolean.valueOf(z2);
            C44812Oy r1 = new C44812Oy();
            r1.A01 = null;
            r1.A00 = valueOf;
            r3.A00.Bly(r1);
        }
        this.A06.A0C(new AnonymousClass37R(this.A00, this.A01, A01(i)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (r0 != null) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0X(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = X.AnonymousClass3RW.A00     // Catch:{ all -> 0x0080 }
            r4 = 443(0x1bb, float:6.21E-43)
            r6 = 0
            X.AnonymousClass00C.A0D(r8, r6)     // Catch:{ all -> 0x0080 }
            boolean r0 = X.AnonymousClass3RW.A01(r8)     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x0075
            java.lang.String r1 = ":"
            X.0fN r0 = new X.0fN     // Catch:{ all -> 0x0080 }
            r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x0080 }
            java.util.List r3 = r0.A01(r8, r6)     // Catch:{ all -> 0x0080 }
            int r1 = r3.size()     // Catch:{ all -> 0x0080 }
            r2 = 58
            r0 = 1
            if (r1 == r0) goto L_0x0034
            java.lang.String r0 = X.C36401kF.A0s(r3, r0)     // Catch:{ all -> 0x0080 }
            r1 = -1
            int r4 = X.AnonymousClass6R8.A00(r0, r1)     // Catch:{ all -> 0x0080 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0080 }
            if (r4 <= r1) goto L_0x0075
            if (r0 == 0) goto L_0x0075
        L_0x0034:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = X.C36401kF.A0s(r3, r6)     // Catch:{ all -> 0x0080 }
            r1.append(r0)     // Catch:{ all -> 0x0080 }
            r1.append(r2)     // Catch:{ all -> 0x0080 }
            java.lang.String r4 = X.C36381kD.A10(r1, r4)     // Catch:{ all -> 0x0080 }
            if (r4 == 0) goto L_0x0075
            X.3Ch r0 = r7.A0C     // Catch:{ all -> 0x0080 }
            r5 = 1
            r0.A00(r5)     // Catch:{ all -> 0x0080 }
            X.1VS r3 = r7.A0E     // Catch:{ all -> 0x0080 }
            X.1BX r0 = r3.A00     // Catch:{ all -> 0x0080 }
            int r2 = r0.A00()     // Catch:{ all -> 0x0080 }
            X.0wg r1 = r0.A01     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = "user_proxy_setting_pref"
            android.content.SharedPreferences r1 = r1.A00(r0)     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = "proxy_use_tls"
            boolean r1 = r1.getBoolean(r0, r5)     // Catch:{ all -> 0x0080 }
            r0 = 443(0x1bb, float:6.21E-43)
            X.3QR r0 = X.C55172uC.A00(r4, r0, r2, r1)     // Catch:{ all -> 0x0080 }
            r3.A01(r0)     // Catch:{ all -> 0x0080 }
            r7.A02 = r4     // Catch:{ all -> 0x0080 }
            X.00s r0 = r7.A05     // Catch:{ all -> 0x0080 }
            r0.A0C(r4)     // Catch:{ all -> 0x0080 }
            goto L_0x007e
        L_0x0075:
            X.17Y r1 = r7.A08     // Catch:{ all -> 0x0080 }
            r0 = 2131893273(0x7f121c19, float:1.9421318E38)
            r5 = 0
            r1.A07(r0, r6)     // Catch:{ all -> 0x0080 }
        L_0x007e:
            monitor-exit(r7)
            return r5
        L_0x0080:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsUserProxyViewModel.A0X(java.lang.String):boolean");
    }

    public static void A02(SettingsUserProxyViewModel settingsUserProxyViewModel) {
        C68903ce r3 = settingsUserProxyViewModel.A0G;
        r3.A01.A0H(new C81173wa((Object) r3, 4));
        settingsUserProxyViewModel.A04 = true;
        settingsUserProxyViewModel.A0V(1, false);
        settingsUserProxyViewModel.A0B.A00();
        settingsUserProxyViewModel.A0A.A0F((String) null, (String) null, 0, true, false, false, false, false, true);
        C81163wZ.A00(settingsUserProxyViewModel.A0H, settingsUserProxyViewModel, 46);
    }

    public AnonymousClass3QR A0S() {
        String str = this.A02;
        if (str == null) {
            return new AnonymousClass3QR();
        }
        AnonymousClass1BX r0 = this.A0D;
        return C55172uC.A00(str, 443, r0.A00(), C36441kJ.A1I(r0.A01.A00("user_proxy_setting_pref"), "proxy_use_tls"));
    }

    public void A0T() {
        if (!this.A0E.A00.A06() || this.A02 == null) {
            C68903ce r3 = this.A0G;
            r3.A01.A0H(new C81173wa((Object) r3, 5));
            this.A04 = false;
            A0V(4, false);
            this.A0B.A00();
            this.A0A.A0F((String) null, (String) null, 0, true, false, false, false, false, true);
            return;
        }
        A02(this);
    }

    public boolean A0W() {
        return C20800yB.A01(C21000yV.A01, this.A0I, 3641);
    }

    public SettingsUserProxyViewModel(AnonymousClass17Y r2, AnonymousClass1M6 r3, C20810yC r4, C20720y3 r5, AnonymousClass1C4 r6, C61523Ch r7, AnonymousClass1BX r8, AnonymousClass1VS r9, AnonymousClass3NU r10, C68903ce r11, C19770wU r12) {
        this.A0I = r4;
        this.A08 = r2;
        this.A0H = r12;
        this.A0B = r6;
        this.A0A = r5;
        this.A0C = r7;
        this.A0E = r9;
        this.A0F = r10;
        this.A09 = r3;
        this.A0D = r8;
        this.A0G = r11;
    }
}
