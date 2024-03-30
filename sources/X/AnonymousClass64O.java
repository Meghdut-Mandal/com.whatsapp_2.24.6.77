package X;

import java.util.ArrayList;

/* renamed from: X.64O  reason: invalid class name */
public final class AnonymousClass64O {
    public int A00;
    public final int A01;
    public final C121975u2 A02;
    public final ArrayList A03 = AnonymousClass001.A0I();
    public final ArrayList A04 = AnonymousClass001.A0I();
    public final ArrayList A05 = AnonymousClass001.A0I();

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b1, code lost:
        if (r14.length() == 0) goto L_0x00b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A00(int r24, long r25, int r27) {
        /*
            r23 = this;
            r4 = r23
            monitor-enter(r4)
            r0 = 1
            r3 = r24
            r1 = r25
            if (r3 == r0) goto L_0x0019
            r0 = 2
            if (r3 == r0) goto L_0x0013
            java.util.ArrayList r0 = r4.A03     // Catch:{ all -> 0x01eb }
            X.C36391kE.A1W(r0, r1)     // Catch:{ all -> 0x01eb }
            goto L_0x001e
        L_0x0013:
            java.util.ArrayList r0 = r4.A05     // Catch:{ all -> 0x01eb }
            X.C36391kE.A1W(r0, r1)     // Catch:{ all -> 0x01eb }
            goto L_0x001e
        L_0x0019:
            java.util.ArrayList r0 = r4.A04     // Catch:{ all -> 0x01eb }
            X.C36391kE.A1W(r0, r1)     // Catch:{ all -> 0x01eb }
        L_0x001e:
            int r0 = r4.A00     // Catch:{ all -> 0x01e9 }
            int r0 = r0 + 1
            r4.A00 = r0     // Catch:{ all -> 0x01e9 }
            int r1 = r4.A01     // Catch:{ all -> 0x01e9 }
            if (r0 != r1) goto L_0x01e7
            java.util.ArrayList r0 = r4.A04     // Catch:{ all -> 0x01e9 }
            int r0 = r0.size()     // Catch:{ all -> 0x01e9 }
            if (r0 != r1) goto L_0x0147
            X.5u2 r0 = r4.A02     // Catch:{ all -> 0x01e9 }
            X.5u0 r2 = r0.A00     // Catch:{ all -> 0x01e9 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01e9 }
            java.lang.String r0 = "CrosspostRequestSessionManager/media upload success for session: "
            r1.append(r0)     // Catch:{ all -> 0x01e9 }
            X.6DN r8 = r2.A02     // Catch:{ all -> 0x01e9 }
            java.lang.String r6 = r8.A04     // Catch:{ all -> 0x01e9 }
            boolean r7 = X.C90464aC.A1Z(r6, r1)     // Catch:{ all -> 0x01e9 }
            X.692 r0 = r2.A00     // Catch:{ all -> 0x01e9 }
            X.62H r9 = new X.62H     // Catch:{ all -> 0x01e9 }
            r9.<init>(r0, r8)     // Catch:{ all -> 0x01e9 }
            X.1hw r0 = r2.A01     // Catch:{ all -> 0x01e9 }
            X.005 r0 = r0.A05     // Catch:{ all -> 0x01e9 }
            java.lang.Object r5 = r0.get()     // Catch:{ all -> 0x01e9 }
            X.6LN r5 = (X.AnonymousClass6LN) r5     // Catch:{ all -> 0x01e9 }
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x01e9 }
            X.1Ak r0 = r8.A02     // Catch:{ all -> 0x01e9 }
            X.14x r15 = r0.iterator()     // Catch:{ all -> 0x01e9 }
        L_0x0060:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x01e9 }
            if (r0 == 0) goto L_0x00ea
            X.3T1 r12 = X.C36391kE.A0l(r15)     // Catch:{ all -> 0x01e9 }
            java.util.Map r2 = r8.A05     // Catch:{ all -> 0x01e9 }
            long r0 = r12.A1N     // Catch:{ all -> 0x01e9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01e9 }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x01e9 }
            X.6D4 r0 = (X.AnonymousClass6D4) r0     // Catch:{ all -> 0x01e9 }
            if (r0 == 0) goto L_0x01e7
            java.lang.String r11 = r0.A03     // Catch:{ all -> 0x01e9 }
            if (r11 == 0) goto L_0x01e7
            java.lang.String r10 = r0.A01     // Catch:{ all -> 0x01e9 }
            if (r10 == 0) goto L_0x01e7
            int r0 = r10.length()     // Catch:{ all -> 0x01e9 }
            if (r0 == 0) goto L_0x01e7
            int r2 = r12.A1I     // Catch:{ all -> 0x01e9 }
            r1 = 8
            r0 = 0
            X.1Gl r1 = X.AnonymousClass6Y1.A01(r0, r2, r1)     // Catch:{ all -> 0x01e9 }
            X.AnonymousClass00C.A08(r1)     // Catch:{ all -> 0x01e9 }
            X.1Gl r0 = X.C25471Gl.A0o     // Catch:{ all -> 0x01e9 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01e9 }
            if (r0 == 0) goto L_0x00e7
            X.5TM r0 = X.AnonymousClass5TM.IMAGE     // Catch:{ all -> 0x01e9 }
        L_0x009e:
            java.lang.String r2 = r0.value     // Catch:{ all -> 0x01e9 }
            java.lang.String r21 = r12.A0c()     // Catch:{ all -> 0x01e9 }
            X.1DU r1 = r5.A01     // Catch:{ all -> 0x01e9 }
            java.lang.String r14 = r12.A0b()     // Catch:{ all -> 0x01e9 }
            if (r14 == 0) goto L_0x00b3
            int r13 = r14.length()     // Catch:{ all -> 0x01e9 }
            r0 = 0
            if (r13 != 0) goto L_0x00b4
        L_0x00b3:
            r0 = 1
        L_0x00b4:
            r22 = 0
            if (r0 != 0) goto L_0x00cf
            android.text.SpannableStringBuilder r0 = X.C36441kJ.A0P(r14)     // Catch:{ all -> 0x01e9 }
            r1.A06(r0)     // Catch:{ all -> 0x01e9 }
            android.text.style.URLSpan[] r1 = X.C36381kD.A1a(r0, r7)     // Catch:{ all -> 0x01e9 }
            X.AnonymousClass00C.A0B(r1)     // Catch:{ all -> 0x01e9 }
            int r0 = r1.length     // Catch:{ all -> 0x01e9 }
            if (r0 == 0) goto L_0x00cf
            r0 = r1[r7]     // Catch:{ all -> 0x01e9 }
            java.lang.String r22 = r0.getURL()     // Catch:{ all -> 0x01e9 }
        L_0x00cf:
            long r0 = r12.A0I     // Catch:{ all -> 0x01e9 }
            java.lang.Long r17 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01e9 }
            X.6DM r0 = new X.6DM     // Catch:{ all -> 0x01e9 }
            r19 = r10
            r20 = r2
            r18 = r11
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x01e9 }
            r3.add(r0)     // Catch:{ all -> 0x01e9 }
            goto L_0x0060
        L_0x00e7:
            X.5TM r0 = X.AnonymousClass5TM.VIDEO     // Catch:{ all -> 0x01e9 }
            goto L_0x009e
        L_0x00ea:
            X.5u1 r7 = new X.5u1     // Catch:{ all -> 0x01e9 }
            r7.<init>(r9, r5, r8)     // Catch:{ all -> 0x01e9 }
            X.005 r0 = r5.A03     // Catch:{ all -> 0x01e9 }
            java.lang.Object r5 = r0.get()     // Catch:{ all -> 0x01e9 }
            X.5PF r5 = (X.AnonymousClass5PF) r5     // Catch:{ all -> 0x01e9 }
            X.1Ak r2 = r8.A01     // Catch:{ all -> 0x01e9 }
            X.6Dk r1 = r8.A03     // Catch:{ all -> 0x01e9 }
            X.5jo r0 = r5.A00     // Catch:{ all -> 0x01e9 }
            X.0w4 r0 = r0.A00     // Catch:{ all -> 0x01e9 }
            X.0tq r0 = r0.A00     // Catch:{ all -> 0x01e9 }
            X.004 r0 = r0.A3O     // Catch:{ all -> 0x01e9 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01e9 }
            X.5jp r0 = (X.C116025jp) r0     // Catch:{ all -> 0x01e9 }
            X.6LO r8 = new X.6LO     // Catch:{ all -> 0x01e9 }
            r9 = r0
            r10 = r1
            r11 = r6
            r12 = r3
            r13 = r2
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x01e9 }
            r0 = 2
            X.7tW r3 = new X.7tW     // Catch:{ all -> 0x01e9 }
            r3.<init>(r7, r0)     // Catch:{ all -> 0x01e9 }
            X.00T r1 = r8.A04     // Catch:{ all -> 0x01e9 }
            java.lang.String r0 = X.C36431kI.A1E(r1)     // Catch:{ all -> 0x01e9 }
            if (r0 != 0) goto L_0x012d
            java.lang.String r0 = "payload encryption failed"
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x01e9 }
            r0 = 0
            r3.BWl(r1, r0)     // Catch:{ all -> 0x01e9 }
            goto L_0x01e7
        L_0x012d:
            java.lang.String r2 = X.C36431kI.A1E(r1)     // Catch:{ all -> 0x01e9 }
            if (r2 == 0) goto L_0x0142
            X.00T r0 = r5.A03     // Catch:{ all -> 0x01e9 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x01e9 }
            X.5PI r1 = (X.AnonymousClass5PI) r1     // Catch:{ all -> 0x01e9 }
            r0 = 47
            r5.A01(r3, r1, r2, r0)     // Catch:{ all -> 0x01e9 }
            goto L_0x01e7
        L_0x0142:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()     // Catch:{ all -> 0x01e9 }
            throw r0     // Catch:{ all -> 0x01e9 }
        L_0x0147:
            java.util.ArrayList r0 = r4.A03     // Catch:{ all -> 0x01e9 }
            boolean r0 = X.C36411kG.A1a(r0)     // Catch:{ all -> 0x01e9 }
            if (r0 == 0) goto L_0x01ac
            X.5u2 r7 = r4.A02     // Catch:{ all -> 0x01e9 }
            X.5ys r0 = r7.A02     // Catch:{ all -> 0x01e9 }
            X.005 r0 = r0.A0A     // Catch:{ all -> 0x01e9 }
            java.lang.Object r6 = r0.get()     // Catch:{ all -> 0x01e9 }
            X.66M r6 = (X.AnonymousClass66M) r6     // Catch:{ all -> 0x01e9 }
            X.6DN r2 = r7.A01     // Catch:{ all -> 0x01e9 }
            java.lang.String r5 = r2.A04     // Catch:{ all -> 0x01e9 }
            X.1Ak r0 = r2.A02     // Catch:{ all -> 0x01e9 }
            java.util.ArrayList r3 = X.C36351kA.A0z(r0)     // Catch:{ all -> 0x01e9 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x01e9 }
        L_0x0169:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01e9 }
            if (r0 == 0) goto L_0x0173
            X.C90464aC.A1T(r3, r1)     // Catch:{ all -> 0x01e9 }
            goto L_0x0169
        L_0x0173:
            X.1Ak r0 = r2.A01     // Catch:{ all -> 0x01e9 }
            java.util.ArrayList r2 = X.C36351kA.A0z(r0)     // Catch:{ all -> 0x01e9 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x01e9 }
        L_0x017d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01e9 }
            if (r0 == 0) goto L_0x0187
            X.C127986Ak.A00(r2, r1)     // Catch:{ all -> 0x01e9 }
            goto L_0x017d
        L_0x0187:
            r6.A01(r5, r3, r2)     // Catch:{ all -> 0x01e9 }
            X.5u0 r2 = r7.A00     // Catch:{ all -> 0x01e9 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01e9 }
            java.lang.String r0 = "CrosspostRequestSessionManager/media upload delivery failure for session: "
            r1.append(r0)     // Catch:{ all -> 0x01e9 }
            X.6DN r0 = r2.A02     // Catch:{ all -> 0x01e9 }
            java.lang.String r3 = r0.A04     // Catch:{ all -> 0x01e9 }
            boolean r0 = X.C90464aC.A1Z(r3, r1)     // Catch:{ all -> 0x01e9 }
            r2 = 0
            java.lang.StringBuilder r1 = X.C36401kF.A0t(r3, r0)     // Catch:{ all -> 0x01e9 }
            java.lang.String r0 = "CrosspostRequestSessionManager/[Retry]Delivery Failure encountered for session: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r1)     // Catch:{ all -> 0x01e9 }
            X.AnonymousClass00C.A0D(r0, r2)     // Catch:{ all -> 0x01e9 }
            goto L_0x01e7
        L_0x01ac:
            X.5u2 r0 = r4.A02     // Catch:{ all -> 0x01e9 }
            X.5u0 r2 = r0.A00     // Catch:{ all -> 0x01e9 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01e9 }
            java.lang.String r0 = "CrosspostRequestSessionManager/media upload error for session: "
            r1.append(r0)     // Catch:{ all -> 0x01e9 }
            X.6DN r0 = r2.A02     // Catch:{ all -> 0x01e9 }
            java.lang.String r5 = r0.A04     // Catch:{ all -> 0x01e9 }
            r1.append(r5)     // Catch:{ all -> 0x01e9 }
            java.lang.String r0 = " with errorCode: "
            r6 = r27
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r6)     // Catch:{ all -> 0x01e9 }
            r3 = 0
            X.AnonymousClass00C.A0D(r0, r3)     // Catch:{ all -> 0x01e9 }
            X.5P0 r2 = new X.5P0     // Catch:{ all -> 0x01e9 }
            r2.<init>(r6)     // Catch:{ all -> 0x01e9 }
            r0 = 1
            java.lang.StringBuilder r1 = X.C36401kF.A0t(r5, r0)     // Catch:{ all -> 0x01e9 }
            java.lang.String r0 = "CrosspostRequestSessionManager/[Retry]Error encountered for session: "
            r1.append(r0)     // Catch:{ all -> 0x01e9 }
            r1.append(r5)     // Catch:{ all -> 0x01e9 }
            java.lang.String r0 = " with exception: "
            java.lang.String r0 = X.AnonymousClass000.A0l(r2, r0, r1)     // Catch:{ all -> 0x01e9 }
            X.AnonymousClass00C.A0D(r0, r3)     // Catch:{ all -> 0x01e9 }
        L_0x01e7:
            monitor-exit(r4)
            return
        L_0x01e9:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01eb }
        L_0x01eb:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass64O.A00(int, long, int):void");
    }

    public AnonymousClass64O(C121975u2 r2, int i) {
        this.A01 = i;
        this.A02 = r2;
    }
}
