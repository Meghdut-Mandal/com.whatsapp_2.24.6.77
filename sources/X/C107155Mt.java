package X;

import com.whatsapp.bridge.wfal.WfalManager;

/* renamed from: X.5Mt  reason: invalid class name and case insensitive filesystem */
public final class C107155Mt extends C132446Tt {
    public final WfalManager A00;
    public final C19970wo A01;
    public final AnonymousClass6VF A02;
    public final AnonymousClass66M A03;
    public final AnonymousClass1A1 A04;
    public final C34971hw A05;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b0, code lost:
        r1 = X.C36401kF.A0t(r0, 0);
        r1.append("CrosspostSendUnsentSessionsTask/doInBackground sessionId: ");
        r1.append(r4);
        X.AnonymousClass00C.A0D(X.AnonymousClass000.A0q(" not eligible for retry, updating db", r1), 0);
        X.AnonymousClass00C.A0B(r4);
        r5.A00(r4);
        r7 = r6.A02;
        r4 = X.C36321k7.A0J(r2);
        r1 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d9, code lost:
        if (r1.hasNext() == false) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00db, code lost:
        X.C90464aC.A1T(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x015f, code lost:
        r7.A07(r4, r3, 4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r17) {
        /*
            r16 = this;
            r6 = r16
            X.66M r5 = r6.A03
            X.00T r0 = r5.A01
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            X.0wy r0 = X.C20070wy.copyOf((java.util.Map) r0)
            X.AnonymousClass00C.A08(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r15 = r0.iterator()
        L_0x001b:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0210
            java.util.Map$Entry r1 = X.AnonymousClass000.A11(r15)
            java.lang.String r4 = X.C90494aF.A0f(r1)
            java.lang.Object r0 = r1.getValue()
            X.6A9 r0 = (X.AnonymousClass6A9) r0
            java.util.Set r0 = r0.A01
            java.util.List r3 = X.C007103b.A0Y(r0)
            java.lang.Object r0 = r1.getValue()
            X.6A9 r0 = (X.AnonymousClass6A9) r0
            java.util.LinkedHashSet r0 = r0.A00
            java.util.List r0 = X.C007103b.A0Y(r0)
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.util.Iterator r9 = r0.iterator()
        L_0x0049:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0085
            long r0 = X.C36391kE.A0D(r9)
            X.1A1 r7 = r6.A04
            X.3T1 r8 = X.C36421kH.A0R(r7, r0)
            if (r8 == 0) goto L_0x0065
            boolean r7 = X.C66013Ui.A0n(r8)
            if (r7 != 0) goto L_0x0065
            r2.add(r8)
            goto L_0x0049
        L_0x0065:
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0u()
            java.lang.String r7 = "CrosspostSendUnsentSessionsTask/getMessageFromMessageRowIds encountered empty or revoked message: "
            r8.append(r7)
            r8.append(r0)
            java.lang.String r7 = ", skipping and retrying the rest"
            X.C90464aC.A1R(r8, r7)
            X.6VF r7 = r6.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.util.List r1 = X.C36371kC.A11(r0)
            r0 = 4
            r7.A07(r1, r3, r0)
            goto L_0x0049
        L_0x0085:
            r7 = 0
            java.util.Iterator r1 = r3.iterator()
        L_0x008a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00df
            java.lang.Object r8 = r1.next()
            X.5Tq r8 = (X.C108475Tq) r8
            com.whatsapp.bridge.wfal.WfalManager r0 = r6.A00
            X.6c7 r0 = r0.A00(r8)
            if (r0 != 0) goto L_0x008a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CrosspostSendUnsentSessionsTask/session messages "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " invalid for retry due to account not linked: "
            java.lang.String r0 = X.AnonymousClass000.A0l(r8, r0, r1)
        L_0x00b0:
            java.lang.StringBuilder r1 = X.C36401kF.A0t(r0, r7)
            java.lang.String r0 = "CrosspostSendUnsentSessionsTask/doInBackground sessionId: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " not eligible for retry, updating db"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            X.AnonymousClass00C.A0D(r0, r7)
            X.AnonymousClass00C.A0B(r4)
            r5.A00(r4)
            X.6VF r7 = r6.A02
            java.util.ArrayList r4 = X.C36321k7.A0J(r2)
            java.util.Iterator r1 = r2.iterator()
        L_0x00d5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x015f
            X.C90464aC.A1T(r4, r1)
            goto L_0x00d5
        L_0x00df:
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0105
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0105
        L_0x00e9:
            X.6VF r10 = r6.A02
            r0 = 2
            X.AnonymousClass00C.A0D(r10, r0)
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.util.ArrayList r9 = X.C36321k7.A0J(r2)
            java.util.Iterator r1 = r2.iterator()
        L_0x00fb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0165
            X.C90464aC.A1T(r9, r1)
            goto L_0x00fb
        L_0x0105:
            java.util.Iterator r14 = r2.iterator()
        L_0x0109:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00e9
            X.3T1 r8 = X.C36391kE.A0l(r14)
            X.AnonymousClass00C.A0D(r8, r7)
            boolean r0 = X.AnonymousClass6R9.A01(r8)
            java.lang.String r13 = "CrosspostSendUnsentSessionsTask/message "
            if (r0 != 0) goto L_0x0137
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0v(r13)
            long r0 = r8.A1N
            r9.append(r0)
            java.lang.String r0 = " invalid for retry due to incompatible type: "
            r9.append(r0)
            int r0 = r8.A1I
            r9.append(r0)
        L_0x0131:
            java.lang.String r0 = r9.toString()
            goto L_0x00b0
        L_0x0137:
            X.0wo r0 = r6.A01
            long r9 = X.C19970wo.A00(r0)
            long r0 = r8.A0I
            long r9 = r9 - r0
            long r11 = java.lang.Math.abs(r9)
            r9 = 10800000(0xa4cb80, double:5.335909E-317)
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0109
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0v(r13)
            long r0 = r8.A1N
            r9.append(r0)
            java.lang.String r0 = " invalid for retry due to timestamp expiration: "
            r9.append(r0)
            long r0 = r8.A0I
            r9.append(r0)
            goto L_0x0131
        L_0x015f:
            r0 = 4
            r7.A07(r4, r3, r0)
            goto L_0x001b
        L_0x0165:
            java.util.HashMap r10 = r10.A04(r9)
            java.util.Iterator r12 = r2.iterator()
        L_0x016d:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01b2
            X.3T1 r0 = X.C36391kE.A0l(r12)
            long r0 = r0.A1N
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.util.List r11 = X.C90524aI.A0n(r0, r10)
            if (r11 == 0) goto L_0x01b0
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x01b0
            java.util.Iterator r9 = r11.iterator()
        L_0x018d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01a7
            java.lang.Object r1 = r9.next()
            X.6DX r1 = (X.AnonymousClass6DX) r1
            X.5Tq r0 = r1.A02
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x018d
            java.lang.String r0 = r1.A05
        L_0x01a3:
            r8.add(r0)
            goto L_0x016d
        L_0x01a7:
            java.lang.Object r0 = r11.get(r7)
            X.6DX r0 = (X.AnonymousClass6DX) r0
            java.lang.String r0 = r0.A05
            goto L_0x01a3
        L_0x01b0:
            r0 = 0
            goto L_0x01a3
        L_0x01b2:
            X.1hw r9 = r6.A05
            X.AnonymousClass00C.A0B(r4)
            java.lang.StringBuilder r11 = X.C36401kF.A0t(r4, r7)
            java.lang.String r0 = "CrosspostRequestSessionManager/handleCrosspostRetry started for session: "
            r11.append(r0)
            r11.append(r4)
            java.lang.String r0 = " with messages: "
            r11.append(r0)
            java.util.ArrayList r10 = X.C36351kA.A0z(r2)
            java.util.Iterator r1 = r2.iterator()
        L_0x01d0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01da
            X.C90464aC.A1T(r10, r1)
            goto L_0x01d0
        L_0x01da:
            java.lang.String r0 = X.AnonymousClass000.A0o(r10, r11)
            X.AnonymousClass00C.A0D(r0, r7)
            X.005 r0 = r9.A07
            java.lang.Object r0 = r0.get()
            X.66M r0 = (X.AnonymousClass66M) r0
            r0.A00(r4)
            X.005 r0 = r9.A04
            java.lang.Object r1 = r0.get()
            X.1hu r1 = (X.C34951hu) r1
            X.5Ow r0 = new X.5Ow
            r0.<init>(r1)
            X.6CZ r1 = new X.6CZ
            r1.<init>(r0, r9, r4, r2)
            X.005 r0 = r9.A03
            java.lang.Object r7 = r0.get()
            X.64s r7 = (X.C1266164s) r7
            r10 = r2
            r11 = r8
            r12 = r3
            r8 = r1
            r9 = r4
            r7.A00(r8, r9, r10, r11, r12)
            goto L_0x001b
        L_0x0210:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107155Mt.A08(java.lang.Object[]):java.lang.Object");
    }

    public C107155Mt(WfalManager wfalManager, C19970wo r2, AnonymousClass6VF r3, AnonymousClass66M r4, AnonymousClass1A1 r5, C34971hw r6) {
        this.A01 = r2;
        this.A04 = r5;
        this.A00 = wfalManager;
        this.A02 = r3;
        this.A05 = r6;
        this.A03 = r4;
    }
}
