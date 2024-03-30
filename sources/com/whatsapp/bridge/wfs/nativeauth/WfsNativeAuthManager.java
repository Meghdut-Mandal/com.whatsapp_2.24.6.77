package com.whatsapp.bridge.wfs.nativeauth;

import X.AnonymousClass60V;
import X.AnonymousClass66E;
import X.C36321k7;

public final class WfsNativeAuthManager {
    public final AnonymousClass60V A00;
    public final AnonymousClass66E A01;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0071, code lost:
        if (X.AnonymousClass1L0.A01(r11, "com.instagram.android") == -1) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0083, code lost:
        if (X.AnonymousClass000.A1P(r10.A02(5987) ? 1 : 0) == false) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0248 A[Catch:{ Exception -> 0x025e }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f6 A[Catch:{ Exception -> 0x025e }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0102 A[Catch:{ Exception -> 0x025e }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01ba A[Catch:{ Exception -> 0x025e }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ca A[Catch:{ Exception -> 0x025e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(android.content.Context r21, X.C119195pO r22, X.C119205pP r23, X.AnonymousClass5pQ r24, X.C1260362h r25, X.AnonymousClass6OK r26, X.C023509x r27, X.AnonymousClass040 r28) {
        /*
            r20 = this;
            r4 = r27
            r6 = r25
            r7 = r23
            r8 = r24
            r3 = r22
            boolean r0 = r4 instanceof X.AnonymousClass7B7
            r5 = r20
            if (r0 == 0) goto L_0x0047
            r9 = r4
            X.7B7 r9 = (X.AnonymousClass7B7) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0047
            int r2 = r2 - r1
            r9.label = r2
        L_0x001e:
            java.lang.Object r11 = r9.result
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r9.label
            java.lang.String r12 = "ig"
            java.lang.String r13 = "fb"
            r1 = 1
            if (r0 == 0) goto L_0x0052
            if (r0 != r1) goto L_0x004d
            java.lang.Object r4 = r9.L$5
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r9.L$4
            X.5pO r3 = (X.C119195pO) r3
            java.lang.Object r8 = r9.L$3
            X.5pQ r8 = (X.AnonymousClass5pQ) r8
            java.lang.Object r7 = r9.L$2
            X.5pP r7 = (X.C119205pP) r7
            java.lang.Object r6 = r9.L$1
            X.62h r6 = (X.C1260362h) r6
            java.lang.Object r5 = r9.L$0
            com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager r5 = (com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager) r5
            goto L_0x00f7
        L_0x0047:
            X.7B7 r9 = new X.7B7
            r9.<init>(r5, r4)
            goto L_0x001e
        L_0x004d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0052:
            X.AnonymousClass0AN.A00(r11)
            java.lang.String r4 = "WfsNativeAuthManager/getSsoCredentials"
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            r11 = r21
            X.AnonymousClass00C.A0D(r11, r0)
            boolean r0 = X.AnonymousClass3LX.A00(r11)
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = "com.instagram.android"
            long r16 = X.AnonymousClass1L0.A01(r11, r0)
            r14 = -1
            int r4 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            r0 = 1
            if (r4 != 0) goto L_0x0074
        L_0x0073:
            r0 = 0
        L_0x0074:
            r10 = r26
            if (r0 == 0) goto L_0x0085
            r0 = 5987(0x1763, float:8.39E-42)
            boolean r0 = r10.A02(r0)
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r4 = 1
            if (r0 != 0) goto L_0x0086
        L_0x0085:
            r4 = 0
        L_0x0086:
            boolean r0 = X.AnonymousClass3LX.A01(r11, r10)
            if (r4 == 0) goto L_0x008f
            java.lang.String r4 = "fb_ig"
            goto L_0x0093
        L_0x008f:
            r4 = r13
            if (r0 == 0) goto L_0x0093
            r4 = r12
        L_0x0093:
            X.66E r14 = r5.A01     // Catch:{ Exception -> 0x025e }
            int r15 = r4.hashCode()     // Catch:{ Exception -> 0x025e }
            r0 = 3260(0xcbc, float:4.568E-42)
            if (r15 == r0) goto L_0x00b2
            r0 = 3358(0xd1e, float:4.706E-42)
            if (r15 == r0) goto L_0x00a7
            r0 = 97213313(0x5cb5b81, float:1.9123641E-35)
            if (r15 != r0) goto L_0x00cf
            goto L_0x00bd
        L_0x00a7:
            boolean r0 = r4.equals(r12)     // Catch:{ Exception -> 0x025e }
            if (r0 == 0) goto L_0x00cf
            X.0zE r15 = r14.A01     // Catch:{ Exception -> 0x025e }
            java.lang.String r14 = "fetch_auth_ig_start"
            goto L_0x00c9
        L_0x00b2:
            boolean r0 = r4.equals(r13)     // Catch:{ Exception -> 0x025e }
            if (r0 == 0) goto L_0x00cf
            X.0zE r15 = r14.A01     // Catch:{ Exception -> 0x025e }
            java.lang.String r14 = "fetch_auth_fb_start"
            goto L_0x00c9
        L_0x00bd:
            java.lang.String r0 = "fb_ig"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x025e }
            if (r0 == 0) goto L_0x00cf
            X.0zE r15 = r14.A01     // Catch:{ Exception -> 0x025e }
            java.lang.String r14 = "fetch_auth_fb_ig_start"
        L_0x00c9:
            r0 = 551497305(0x20df2e59, float:3.780834E-19)
            r15.markerPoint(r0, r14)     // Catch:{ Exception -> 0x025e }
        L_0x00cf:
            r9.L$0 = r5     // Catch:{ Exception -> 0x025e }
            r9.L$1 = r6     // Catch:{ Exception -> 0x025e }
            r9.L$2 = r7     // Catch:{ Exception -> 0x025e }
            r9.L$3 = r8     // Catch:{ Exception -> 0x025e }
            r9.L$4 = r3     // Catch:{ Exception -> 0x025e }
            r9.L$5 = r4     // Catch:{ Exception -> 0x025e }
            r9.label = r1     // Catch:{ Exception -> 0x025e }
            r19 = r28
            X.02h r1 = r19.BAE()     // Catch:{ Exception -> 0x025e }
            r18 = 0
            com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2 r0 = new com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2     // Catch:{ Exception -> 0x025e }
            r16 = r5
            r17 = r10
            r14 = r0
            r15 = r11
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x025e }
            java.lang.Object r11 = X.AnonymousClass0A2.A00(r9, r1, r0)     // Catch:{ Exception -> 0x025e }
            if (r11 != r2) goto L_0x00fa
            return r2
        L_0x00f7:
            X.AnonymousClass0AN.A00(r11)     // Catch:{ Exception -> 0x025e }
        L_0x00fa:
            java.util.List r11 = (java.util.List) r11     // Catch:{ Exception -> 0x025e }
            boolean r0 = X.C36401kF.A1a(r11)     // Catch:{ Exception -> 0x025e }
            if (r0 == 0) goto L_0x0248
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()     // Catch:{ Exception -> 0x025e }
            java.util.Iterator r16 = r11.iterator()     // Catch:{ Exception -> 0x025e }
        L_0x010a:
            boolean r0 = r16.hasNext()     // Catch:{ Exception -> 0x025e }
            if (r0 == 0) goto L_0x0138
            java.lang.Object r14 = r16.next()     // Catch:{ Exception -> 0x025e }
            r9 = r14
            X.66Y r9 = (X.AnonymousClass66Y) r9     // Catch:{ Exception -> 0x025e }
            X.6TE r0 = r9.A01     // Catch:{ Exception -> 0x025e }
            X.5ri r0 = r0.A03     // Catch:{ Exception -> 0x025e }
            java.lang.Integer r1 = r0.A01     // Catch:{ Exception -> 0x025e }
            java.lang.Integer r0 = X.C023109s.A00     // Catch:{ Exception -> 0x025e }
            boolean r15 = X.C36361kB.A1a(r1, r0)
            X.67e r0 = r9.A00     // Catch:{ Exception -> 0x025e }
            X.8zq r10 = r0.A04     // Catch:{ Exception -> 0x025e }
            X.66E r9 = r5.A01     // Catch:{ Exception -> 0x025e }
            X.8zq r1 = X.C188598zq.A04     // Catch:{ Exception -> 0x025e }
            r0 = r13
            if (r10 != r1) goto L_0x012f
            r0 = r12
        L_0x012f:
            r9.A01(r0)     // Catch:{ Exception -> 0x025e }
            if (r15 == 0) goto L_0x010a
            r2.add(r14)     // Catch:{ Exception -> 0x025e }
            goto L_0x010a
        L_0x0138:
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()     // Catch:{ Exception -> 0x025e }
            java.util.Iterator r16 = r11.iterator()     // Catch:{ Exception -> 0x025e }
        L_0x0140:
            boolean r0 = r16.hasNext()     // Catch:{ Exception -> 0x025e }
            if (r0 == 0) goto L_0x016e
            java.lang.Object r14 = r16.next()     // Catch:{ Exception -> 0x025e }
            r9 = r14
            X.66Y r9 = (X.AnonymousClass66Y) r9     // Catch:{ Exception -> 0x025e }
            X.6TE r0 = r9.A01     // Catch:{ Exception -> 0x025e }
            X.5ri r0 = r0.A03     // Catch:{ Exception -> 0x025e }
            java.lang.Integer r1 = r0.A00     // Catch:{ Exception -> 0x025e }
            java.lang.Integer r0 = X.C023109s.A00     // Catch:{ Exception -> 0x025e }
            boolean r15 = X.C36361kB.A1a(r1, r0)
            X.67e r0 = r9.A00     // Catch:{ Exception -> 0x025e }
            X.8zq r11 = r0.A04     // Catch:{ Exception -> 0x025e }
            X.66E r9 = r5.A01     // Catch:{ Exception -> 0x025e }
            X.8zq r1 = X.C188598zq.A04     // Catch:{ Exception -> 0x025e }
            r0 = r13
            if (r11 != r1) goto L_0x0165
            r0 = r12
        L_0x0165:
            r9.A01(r0)     // Catch:{ Exception -> 0x025e }
            if (r15 == 0) goto L_0x0140
            r10.add(r14)     // Catch:{ Exception -> 0x025e }
            goto L_0x0140
        L_0x016e:
            X.66E r1 = r5.A01     // Catch:{ Exception -> 0x025e }
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)     // Catch:{ Exception -> 0x025e }
            int r11 = r4.hashCode()     // Catch:{ Exception -> 0x025e }
            r0 = 3260(0xcbc, float:4.568E-42)
            r9 = 551497305(0x20df2e59, float:3.780834E-19)
            if (r11 == r0) goto L_0x0194
            r0 = 3358(0xd1e, float:4.706E-42)
            if (r11 == r0) goto L_0x0189
            r0 = 97213313(0x5cb5b81, float:1.9123641E-35)
            if (r11 != r0) goto L_0x01ae
            goto L_0x019f
        L_0x0189:
            boolean r0 = r4.equals(r12)     // Catch:{ Exception -> 0x025e }
            if (r0 == 0) goto L_0x01ae
            X.0zE r1 = r1.A01     // Catch:{ Exception -> 0x025e }
            java.lang.String r0 = "fetch_auth_ig_end"
            goto L_0x01ab
        L_0x0194:
            boolean r0 = r4.equals(r13)     // Catch:{ Exception -> 0x025e }
            if (r0 == 0) goto L_0x01ae
            X.0zE r1 = r1.A01     // Catch:{ Exception -> 0x025e }
            java.lang.String r0 = "fetch_auth_fb_end"
            goto L_0x01ab
        L_0x019f:
            java.lang.String r0 = "fb_ig"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x025e }
            if (r0 == 0) goto L_0x01ae
            X.0zE r1 = r1.A01     // Catch:{ Exception -> 0x025e }
            java.lang.String r0 = "fetch_auth_fb_ig_end"
        L_0x01ab:
            r1.markerPoint(r9, r0)     // Catch:{ Exception -> 0x025e }
        L_0x01ae:
            boolean r0 = r2.isEmpty()     // Catch:{ Exception -> 0x025e }
            if (r0 == 0) goto L_0x01ca
            boolean r0 = r10.isEmpty()     // Catch:{ Exception -> 0x025e }
            if (r0 == 0) goto L_0x01ca
            java.lang.String r0 = "Not eligible for wfs or nta"
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A09(r0)     // Catch:{ Exception -> 0x025e }
            X.3OD r1 = r3.A01     // Catch:{ Exception -> 0x025e }
            X.4Sq r0 = r3.A00     // Catch:{ Exception -> 0x025e }
            X.AnonymousClass3OD.A00(r0, r1, r2)     // Catch:{ Exception -> 0x025e }
            X.0AJ r0 = X.AnonymousClass0AJ.A00     // Catch:{ Exception -> 0x025e }
            return r0
        L_0x01ca:
            boolean r0 = r2.isEmpty()     // Catch:{ Exception -> 0x025e }
            java.lang.String r9 = "XFamilySourceAccessPair"
            if (r0 == 0) goto L_0x0212
            r2 = 0
            java.lang.Object r0 = r10.get(r2)     // Catch:{ Exception -> 0x025e }
            X.66Y r0 = (X.AnonymousClass66Y) r0     // Catch:{ Exception -> 0x025e }
            X.67e r0 = r0.A00     // Catch:{ Exception -> 0x025e }
            X.8zq r1 = r0.A04     // Catch:{ Exception -> 0x025e }
            java.lang.Object r0 = r10.get(r2)     // Catch:{ Exception -> 0x025e }
            X.66Y r0 = (X.AnonymousClass66Y) r0     // Catch:{ Exception -> 0x025e }
            X.6TE r0 = r0.A01     // Catch:{ Exception -> 0x025e }
            java.lang.String r0 = r0.A00     // Catch:{ Exception -> 0x025e }
            X.011 r1 = X.C36441kJ.A19(r1, r0)     // Catch:{ Exception -> 0x025e }
            X.6vT r0 = X.C146356vT.A00()     // Catch:{ Exception -> 0x025e }
            X.6c7 r2 = new X.6c7     // Catch:{ Exception -> 0x025e }
            r2.<init>(r0, r1, r9)     // Catch:{ Exception -> 0x025e }
            r1 = 4
            X.6bk r0 = new X.6bk     // Catch:{ Exception -> 0x025e }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x025e }
            X.68g r7 = new X.68g     // Catch:{ Exception -> 0x025e }
            r7.<init>(r0)     // Catch:{ Exception -> 0x025e }
            X.3OD r0 = r8.A01     // Catch:{ Exception -> 0x025e }
            X.17Y r6 = r0.A00     // Catch:{ Exception -> 0x025e }
            X.4Sq r2 = r8.A00     // Catch:{ Exception -> 0x025e }
            r1 = 21
            X.74h r0 = new X.74h     // Catch:{ Exception -> 0x025e }
            r0.<init>(r2, r7, r1)     // Catch:{ Exception -> 0x025e }
            r6.Bp3(r0)     // Catch:{ Exception -> 0x025e }
            X.0AJ r0 = X.AnonymousClass0AJ.A00     // Catch:{ Exception -> 0x025e }
            return r0
        L_0x0212:
            java.lang.String r0 = "WfsNativeAuthManager/getSsoCredentials Finished fetching data from app"
            r8 = 0
            X.AnonymousClass00C.A0D(r0, r8)     // Catch:{ Exception -> 0x025e }
            java.lang.Object r0 = r2.get(r8)     // Catch:{ Exception -> 0x025e }
            X.66Y r0 = (X.AnonymousClass66Y) r0     // Catch:{ Exception -> 0x025e }
            X.67e r0 = r0.A00     // Catch:{ Exception -> 0x025e }
            X.8zq r1 = r0.A04     // Catch:{ Exception -> 0x025e }
            java.lang.Object r0 = r2.get(r8)     // Catch:{ Exception -> 0x025e }
            X.66Y r0 = (X.AnonymousClass66Y) r0     // Catch:{ Exception -> 0x025e }
            X.6TE r0 = r0.A01     // Catch:{ Exception -> 0x025e }
            java.lang.String r0 = r0.A00     // Catch:{ Exception -> 0x025e }
            X.011 r1 = X.C36441kJ.A19(r1, r0)     // Catch:{ Exception -> 0x025e }
            X.6vT r0 = X.C146356vT.A00()     // Catch:{ Exception -> 0x025e }
            X.6c7 r2 = new X.6c7     // Catch:{ Exception -> 0x025e }
            r2.<init>(r0, r1, r9)     // Catch:{ Exception -> 0x025e }
            r0 = 3
            X.6bk r1 = new X.6bk     // Catch:{ Exception -> 0x025e }
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x025e }
            X.68g r0 = new X.68g     // Catch:{ Exception -> 0x025e }
            r0.<init>(r1)     // Catch:{ Exception -> 0x025e }
            r6.A00(r3, r7, r0, r8)     // Catch:{ Exception -> 0x025e }
            goto L_0x026e
        L_0x0248:
            X.66E r0 = r5.A01     // Catch:{ Exception -> 0x025e }
            r0.A01(r4)     // Catch:{ Exception -> 0x025e }
            r0.A00(r4)     // Catch:{ Exception -> 0x025e }
            java.lang.String r0 = "sso list is empty"
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A09(r0)     // Catch:{ Exception -> 0x025e }
            X.3OD r1 = r3.A01     // Catch:{ Exception -> 0x025e }
            X.4Sq r0 = r3.A00     // Catch:{ Exception -> 0x025e }
            X.AnonymousClass3OD.A00(r0, r1, r2)     // Catch:{ Exception -> 0x025e }
            goto L_0x026e
        L_0x025e:
            r2 = move-exception
            X.66E r0 = r5.A01
            r0.A01(r4)
            r0.A00(r4)
            X.3OD r1 = r3.A01
            X.4Sq r0 = r3.A00
            X.AnonymousClass3OD.A00(r0, r1, r2)
        L_0x026e:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager.A00(android.content.Context, X.5pO, X.5pP, X.5pQ, X.62h, X.6OK, X.09x, X.040):java.lang.Object");
    }

    public WfsNativeAuthManager(AnonymousClass60V r1, AnonymousClass66E r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
