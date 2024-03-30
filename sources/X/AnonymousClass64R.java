package X;

import java.util.ArrayList;

/* renamed from: X.64R  reason: invalid class name */
public final class AnonymousClass64R {
    public int A00;
    public final int A01;
    public final AnonymousClass5u7 A02;
    public final ArrayList A03 = AnonymousClass001.A0I();
    public final ArrayList A04 = AnonymousClass001.A0I();
    public final ArrayList A05 = AnonymousClass001.A0I();

    /* JADX WARNING: type inference failed for: r10v0, types: [boolean, int] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0095, code lost:
        if (r14.length() == 0) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0133, code lost:
        r1 = -25;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A00(java.lang.Integer r23, int r24, int r25, long r26) {
        /*
            r22 = this;
            r3 = r22
            monitor-enter(r3)
            r0 = 1
            r4 = r24
            r1 = r26
            if (r4 == r0) goto L_0x0019
            r0 = 2
            if (r4 == r0) goto L_0x0013
            java.util.ArrayList r0 = r3.A03     // Catch:{ all -> 0x01f1 }
            X.C36391kE.A1W(r0, r1)     // Catch:{ all -> 0x01f1 }
            goto L_0x001e
        L_0x0013:
            java.util.ArrayList r0 = r3.A05     // Catch:{ all -> 0x01f1 }
            X.C36391kE.A1W(r0, r1)     // Catch:{ all -> 0x01f1 }
            goto L_0x001e
        L_0x0019:
            java.util.ArrayList r0 = r3.A04     // Catch:{ all -> 0x01f1 }
            X.C36391kE.A1W(r0, r1)     // Catch:{ all -> 0x01f1 }
        L_0x001e:
            int r0 = r3.A00     // Catch:{ all -> 0x01ef }
            int r0 = r0 + 1
            r3.A00 = r0     // Catch:{ all -> 0x01ef }
            int r1 = r3.A01     // Catch:{ all -> 0x01ef }
            if (r0 != r1) goto L_0x01ed
            java.util.ArrayList r0 = r3.A04     // Catch:{ all -> 0x01ef }
            int r0 = r0.size()     // Catch:{ all -> 0x01ef }
            if (r0 != r1) goto L_0x016e
            X.5u7 r0 = r3.A02     // Catch:{ all -> 0x01ef }
            X.5u6 r4 = r0.A00     // Catch:{ all -> 0x01ef }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01ef }
            java.lang.String r0 = "XFamilyCrosspostRequestSessionManager/media upload success for session: "
            r1.append(r0)     // Catch:{ all -> 0x01ef }
            X.6Bn r9 = r4.A02     // Catch:{ all -> 0x01ef }
            java.lang.String r5 = r9.A01     // Catch:{ all -> 0x01ef }
            boolean r10 = X.C90464aC.A1Z(r5, r1)     // Catch:{ all -> 0x01ef }
            X.6EF r0 = r4.A00     // Catch:{ all -> 0x01ef }
            X.62K r2 = new X.62K     // Catch:{ all -> 0x01ef }
            r2.<init>(r0, r5)     // Catch:{ all -> 0x01ef }
            X.6V7 r0 = r4.A01     // Catch:{ all -> 0x01ef }
            X.005 r0 = r0.A06     // Catch:{ all -> 0x01ef }
            java.lang.Object r8 = r0.get()     // Catch:{ all -> 0x01ef }
            X.6SO r8 = (X.AnonymousClass6SO) r8     // Catch:{ all -> 0x01ef }
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x01ef }
            X.1Ak r7 = r9.A00     // Catch:{ all -> 0x01ef }
            X.14x r15 = r7.iterator()     // Catch:{ all -> 0x01ef }
        L_0x0060:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x013e
            X.3T1 r11 = X.C36391kE.A0l(r15)     // Catch:{ all -> 0x01ef }
            java.util.Map r6 = r9.A02     // Catch:{ all -> 0x01ef }
            long r0 = r11.A1N     // Catch:{ all -> 0x01ef }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01ef }
            java.lang.Object r0 = r6.get(r0)     // Catch:{ all -> 0x01ef }
            X.6Cs r0 = (X.C128556Cs) r0     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x00df
            X.6bk r12 = r0.A02     // Catch:{ all -> 0x01ef }
            if (r12 == 0) goto L_0x00df
            java.lang.String r1 = r0.A04     // Catch:{ all -> 0x01ef }
            if (r1 == 0) goto L_0x00df
            int r0 = r1.length()     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x00df
            X.1DU r13 = r8.A01     // Catch:{ all -> 0x01ef }
            java.lang.String r14 = r11.A0b()     // Catch:{ all -> 0x01ef }
            if (r14 == 0) goto L_0x0097
            int r6 = r14.length()     // Catch:{ all -> 0x01ef }
            r0 = 0
            if (r6 != 0) goto L_0x0098
        L_0x0097:
            r0 = 1
        L_0x0098:
            r19 = 0
            if (r0 != 0) goto L_0x00b3
            android.text.SpannableStringBuilder r0 = X.C36441kJ.A0P(r14)     // Catch:{ all -> 0x01ef }
            r13.A06(r0)     // Catch:{ all -> 0x01ef }
            android.text.style.URLSpan[] r6 = X.C36381kD.A1a(r0, r10)     // Catch:{ all -> 0x01ef }
            X.AnonymousClass00C.A0B(r6)     // Catch:{ all -> 0x01ef }
            int r0 = r6.length     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x00b3
            r0 = r6[r10]     // Catch:{ all -> 0x01ef }
            java.lang.String r19 = r0.getURL()     // Catch:{ all -> 0x01ef }
        L_0x00b3:
            int r13 = r11.A1I     // Catch:{ all -> 0x01ef }
            r6 = 8
            r0 = 0
            X.1Gl r6 = X.AnonymousClass6Y1.A01(r0, r13, r6)     // Catch:{ all -> 0x01ef }
            X.AnonymousClass00C.A08(r6)     // Catch:{ all -> 0x01ef }
            X.1Gl r0 = X.C25471Gl.A0o     // Catch:{ all -> 0x01ef }
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x00dc
            java.lang.String r20 = "IMAGE"
        L_0x00c9:
            java.lang.String r18 = r11.A0c()     // Catch:{ all -> 0x01ef }
            X.6D6 r0 = new X.6D6     // Catch:{ all -> 0x01ef }
            r21 = r1
            r17 = r12
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x01ef }
            r4.add(r0)     // Catch:{ all -> 0x01ef }
            goto L_0x0060
        L_0x00dc:
            java.lang.String r20 = "VIDEO"
            goto L_0x00c9
        L_0x00df:
            java.lang.String r0 = "XFamilyCrosspostRequestManager/crossposting info is empty or invalid"
            X.C18740tg.A0D(r10, r0)     // Catch:{ all -> 0x01ef }
            java.util.ArrayList r9 = X.C36321k7.A0J(r7)     // Catch:{ all -> 0x01ef }
            java.util.Iterator r1 = r7.iterator()     // Catch:{ all -> 0x01ef }
        L_0x00ec:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x00f6
            X.C90464aC.A1T(r9, r1)     // Catch:{ all -> 0x01ef }
            goto L_0x00ec
        L_0x00f6:
            r5 = 4
            X.17Y r4 = r8.A00     // Catch:{ all -> 0x01ef }
            X.1i1 r1 = r8.A03     // Catch:{ all -> 0x01ef }
            X.005 r0 = r8.A05     // Catch:{ all -> 0x01ef }
            X.AnonymousClass6Y4.A06(r4, r1, r0, r9, r5)     // Catch:{ all -> 0x01ef }
            X.14x r4 = r7.iterator()     // Catch:{ all -> 0x01ef }
        L_0x0104:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x0136
            X.3T1 r0 = X.C36391kE.A0l(r4)     // Catch:{ all -> 0x01ef }
            long r0 = r0.A1N     // Catch:{ all -> 0x01ef }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01ef }
            java.lang.Object r1 = r6.get(r0)     // Catch:{ all -> 0x01ef }
            X.6Cs r1 = (X.C128556Cs) r1     // Catch:{ all -> 0x01ef }
            if (r1 != 0) goto L_0x011d
            goto L_0x012d
        L_0x011d:
            X.6bk r0 = r1.A02     // Catch:{ all -> 0x01ef }
            if (r0 != 0) goto L_0x0122
            goto L_0x0130
        L_0x0122:
            java.lang.String r0 = r1.A04     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x0133
            int r0 = r0.length()     // Catch:{ all -> 0x01ef }
            if (r0 != 0) goto L_0x0104
            goto L_0x0133
        L_0x012d:
            r1 = -23
            goto L_0x0138
        L_0x0130:
            r1 = -24
            goto L_0x0138
        L_0x0133:
            r1 = -25
            goto L_0x0138
        L_0x0136:
            r1 = -13
        L_0x0138:
            r0 = 0
            r2.A00(r1, r0)     // Catch:{ all -> 0x01ef }
            goto L_0x01ed
        L_0x013e:
            X.639 r10 = new X.639     // Catch:{ all -> 0x01ef }
            r10.<init>(r2, r9, r8)     // Catch:{ all -> 0x01ef }
            X.005 r0 = r8.A04     // Catch:{ all -> 0x01ef }
            java.lang.Object r6 = r0.get()     // Catch:{ all -> 0x01ef }
            X.6Km r6 = (X.C130286Km) r6     // Catch:{ all -> 0x01ef }
            r2 = 0
            X.1UM r1 = r6.A00     // Catch:{ all -> 0x01ef }
            X.1US r0 = X.AnonymousClass1US.CROSSPOST_REQUEST     // Catch:{ all -> 0x01ef }
            X.695 r0 = r1.A00(r0)     // Catch:{ all -> 0x01ef }
            if (r0 != 0) goto L_0x015c
            r0 = -5
            r10.A00(r0, r2)     // Catch:{ all -> 0x01ef }
            goto L_0x01ed
        L_0x015c:
            X.6bk r9 = r0.A00     // Catch:{ all -> 0x01ef }
            long r0 = X.AnonymousClass6MQ.A01     // Catch:{ all -> 0x01ef }
            r2 = 3
            X.6Ee r8 = new X.6Ee     // Catch:{ all -> 0x01ef }
            r8.<init>(r2, r0)     // Catch:{ all -> 0x01ef }
            r11 = r6
            r12 = r5
            r13 = r4
            X.C130286Km.A00(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x01ef }
            goto L_0x01ed
        L_0x016e:
            java.util.ArrayList r0 = r3.A03     // Catch:{ all -> 0x01ef }
            boolean r0 = X.C36411kG.A1a(r0)     // Catch:{ all -> 0x01ef }
            r5 = r23
            r6 = r25
            if (r0 == 0) goto L_0x01ca
            X.5u7 r8 = r3.A02     // Catch:{ all -> 0x01ef }
            X.5yk r0 = r8.A02     // Catch:{ all -> 0x01ef }
            X.005 r0 = r0.A09     // Catch:{ all -> 0x01ef }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x01ef }
            X.66L r7 = (X.AnonymousClass66L) r7     // Catch:{ all -> 0x01ef }
            X.6Bn r0 = r8.A01     // Catch:{ all -> 0x01ef }
            java.lang.String r4 = r0.A01     // Catch:{ all -> 0x01ef }
            X.1Ak r0 = r0.A00     // Catch:{ all -> 0x01ef }
            java.util.ArrayList r2 = X.C36321k7.A0J(r0)     // Catch:{ all -> 0x01ef }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x01ef }
        L_0x0194:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x019e
            X.C90464aC.A1T(r2, r1)     // Catch:{ all -> 0x01ef }
            goto L_0x0194
        L_0x019e:
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)     // Catch:{ all -> 0x01ef }
            X.00T r0 = r7.A01     // Catch:{ all -> 0x01ef }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01ef }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x01ef }
            r0.put(r4, r2)     // Catch:{ all -> 0x01ef }
            X.5u6 r7 = r8.A00     // Catch:{ all -> 0x01ef }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01ef }
            java.lang.String r0 = "XFamilyCrosspostRequestSessionManager/media upload delivery failure for session: "
            r1.append(r0)     // Catch:{ all -> 0x01ef }
            X.6Bn r0 = r7.A02     // Catch:{ all -> 0x01ef }
            java.lang.String r4 = r0.A01     // Catch:{ all -> 0x01ef }
            boolean r2 = X.C90464aC.A1Z(r4, r1)     // Catch:{ all -> 0x01ef }
            X.6EF r1 = r7.A00     // Catch:{ all -> 0x01ef }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01ef }
            r1.A01(r0, r5, r4, r2)     // Catch:{ all -> 0x01ef }
            goto L_0x01ed
        L_0x01ca:
            X.5u7 r0 = r3.A02     // Catch:{ all -> 0x01ef }
            X.5u6 r4 = r0.A00     // Catch:{ all -> 0x01ef }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01ef }
            java.lang.String r0 = "XFamilyCrosspostRequestSessionManager/media upload error for session: "
            r1.append(r0)     // Catch:{ all -> 0x01ef }
            X.6Bn r0 = r4.A02     // Catch:{ all -> 0x01ef }
            java.lang.String r2 = r0.A01     // Catch:{ all -> 0x01ef }
            r1.append(r2)     // Catch:{ all -> 0x01ef }
            java.lang.String r0 = " with errorCode: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r6)     // Catch:{ all -> 0x01ef }
            r1 = 0
            X.AnonymousClass00C.A0D(r0, r1)     // Catch:{ all -> 0x01ef }
            X.6EF r0 = r4.A00     // Catch:{ all -> 0x01ef }
            r0.A02(r5, r2, r6, r1)     // Catch:{ all -> 0x01ef }
        L_0x01ed:
            monitor-exit(r3)
            return
        L_0x01ef:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01f1 }
        L_0x01f1:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass64R.A00(java.lang.Integer, int, int, long):void");
    }

    public AnonymousClass64R(AnonymousClass5u7 r2, int i) {
        this.A01 = i;
        this.A02 = r2;
    }
}
