package X;

/* renamed from: X.3pR  reason: invalid class name and case insensitive filesystem */
public final class C76783pR implements C236119d {
    public final int A00;
    public final C19700wN A01;
    public final C20350xQ A02;
    public final C201159iy A03;
    public final AnonymousClass19A A04;
    public final C20810yC A05;

    /* JADX WARNING: type inference failed for: r6v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00cb, code lost:
        if (r7.equals("false") == false) goto L_0x00cd;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BiM(X.C203399nx r44, java.lang.String r45) {
        /*
            r43 = this;
            r0 = 1
            r8 = r44
            X.AnonymousClass00C.A0D(r8, r0)
            r1 = r43
            X.0yC r2 = r1.A05
            r0 = 6350(0x18ce, float:8.898E-42)
            boolean r0 = r2.A0E(r0)
            if (r0 == 0) goto L_0x0057
            X.3UA r7 = X.AnonymousClass3UA.A00     // Catch:{ 0wR -> 0x01a3 }
            int r6 = r1.A00     // Catch:{ 0wR -> 0x01a3 }
            r0 = 37
            X.2qm r5 = X.C53102qm.A02(r1, r0)     // Catch:{ 0wR -> 0x01a3 }
            r0 = 38
            X.2qm r4 = X.C53102qm.A02(r1, r0)     // Catch:{ 0wR -> 0x01a3 }
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()     // Catch:{ 0wR -> 0x01a3 }
            java.lang.String r0 = "groups"
            X.9nx r2 = r8.A0c(r0)     // Catch:{ 0wR -> 0x01a3 }
            if (r2 == 0) goto L_0x0050
            java.lang.String r0 = "group"
            java.util.List r0 = r2.A0j(r0)     // Catch:{ 0wR -> 0x01a3 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ 0wR -> 0x01a3 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ 0wR -> 0x01a3 }
        L_0x003b:
            boolean r0 = r2.hasNext()     // Catch:{ 0wR -> 0x01a3 }
            if (r0 == 0) goto L_0x0050
            X.9nx r0 = X.C36431kI.A0s(r2)     // Catch:{ 0wR -> 0x01a3 }
            X.AnonymousClass00C.A0B(r0)     // Catch:{ 0wR -> 0x01a3 }
            X.3QD r0 = r7.A0A(r0, r5, r4, r6)     // Catch:{ 0wR -> 0x01a3 }
            r3.add(r0)     // Catch:{ 0wR -> 0x01a3 }
            goto L_0x003b
        L_0x0050:
            X.9iy r2 = r1.A03     // Catch:{ 0wR -> 0x01a3 }
            r0 = 0
            r2.A01(r3, r0, r6)     // Catch:{ 0wR -> 0x01a3 }
            return
        L_0x0057:
            X.0xQ r10 = r1.A02
            java.lang.String r0 = "groups"
            X.9nx r2 = r8.A0c(r0)     // Catch:{ 0wR -> 0x01a3 }
            r4 = 0
            if (r2 == 0) goto L_0x0197
            java.lang.String r0 = "group"
            java.util.List r0 = r2.A0j(r0)     // Catch:{ 0wR -> 0x01a3 }
            if (r0 == 0) goto L_0x0197
            java.util.ArrayList r6 = X.C36321k7.A0J(r0)     // Catch:{ 0wR -> 0x01a3 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ 0wR -> 0x01a3 }
        L_0x0072:
            boolean r0 = r9.hasNext()     // Catch:{ 0wR -> 0x01a3 }
            if (r0 == 0) goto L_0x0199
            X.9nx r0 = X.C36431kI.A0s(r9)     // Catch:{ 0wR -> 0x01a3 }
            java.lang.String r2 = "id"
            java.lang.String r2 = r0.A0i(r2, r4)     // Catch:{ 0wR -> 0x01a3 }
            X.C18740tg.A06(r2)     // Catch:{ 0wR -> 0x01a3 }
            X.147 r12 = X.AnonymousClass143.A02(r2)     // Catch:{ 0wR -> 0x01a3 }
            X.AnonymousClass00C.A08(r12)     // Catch:{ 0wR -> 0x01a3 }
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            java.lang.String r2 = "creator"
            com.whatsapp.jid.Jid r14 = r0.A0X(r3, r2)     // Catch:{ 0wR -> 0x01a3 }
            com.whatsapp.jid.UserJid r14 = (com.whatsapp.jid.UserJid) r14     // Catch:{ 0wR -> 0x01a3 }
            java.lang.String r2 = "creation"
            java.lang.String r5 = r0.A0i(r2, r4)     // Catch:{ 0wR -> 0x01a3 }
            r2 = 0
            long r25 = X.AnonymousClass6R8.A01(r5, r2)     // Catch:{ 0wR -> 0x01a3 }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r25 = r25 * r7
            r10.A0g(r14, r0)     // Catch:{ 0wR -> 0x01a3 }
            java.lang.String r5 = "subject"
            java.lang.String r18 = r0.A0i(r5, r4)     // Catch:{ 0wR -> 0x01a3 }
            java.lang.String r5 = "s_t"
            java.lang.String r5 = r0.A0i(r5, r4)     // Catch:{ 0wR -> 0x01a3 }
            long r27 = X.AnonymousClass6R8.A01(r5, r2)     // Catch:{ 0wR -> 0x01a3 }
            long r27 = r27 * r7
            java.lang.String r5 = "ack"
            java.lang.String r7 = r0.A0i(r5, r4)     // Catch:{ 0wR -> 0x01a3 }
            if (r7 == 0) goto L_0x00cd
            java.lang.String r5 = "false"
            boolean r5 = r7.equals(r5)     // Catch:{ 0wR -> 0x01a3 }
            r38 = 0
            if (r5 != 0) goto L_0x00cf
        L_0x00cd:
            r38 = 1
        L_0x00cf:
            java.lang.String r5 = "locked"
            X.9nx r5 = r0.A0c(r5)     // Catch:{ 0wR -> 0x01a3 }
            boolean r32 = X.AnonymousClass000.A1V(r5)
            java.lang.String r5 = "announcement"
            X.9nx r5 = r0.A0c(r5)     // Catch:{ 0wR -> 0x01a3 }
            boolean r33 = X.AnonymousClass000.A1V(r5)
            java.lang.String r5 = "incognito"
            X.9nx r5 = r0.A0c(r5)     // Catch:{ 0wR -> 0x01a3 }
            boolean r36 = X.AnonymousClass000.A1V(r5)
            java.lang.String r5 = "no_frequently_forwarded"
            X.9nx r5 = r0.A0c(r5)     // Catch:{ 0wR -> 0x01a3 }
            boolean r34 = X.AnonymousClass000.A1V(r5)
            java.lang.String r5 = "suspended"
            X.9nx r5 = r0.A0c(r5)     // Catch:{ 0wR -> 0x01a3 }
            boolean r35 = X.AnonymousClass000.A1V(r5)
            java.lang.String r5 = "support"
            X.9nx r5 = r0.A0c(r5)     // Catch:{ 0wR -> 0x01a3 }
            boolean r31 = X.AnonymousClass000.A1V(r5)
            java.lang.String r5 = "a_v_id"
            long r29 = r0.A0V(r5, r2)     // Catch:{ 0wR -> 0x01a3 }
            java.lang.String r2 = "addressing_mode"
            java.lang.String r7 = r0.A0i(r2, r4)     // Catch:{ 0wR -> 0x01a3 }
            java.lang.String r2 = "allow_admin_reports"
            X.9nx r2 = r0.A0c(r2)     // Catch:{ 0wR -> 0x01a3 }
            boolean r39 = X.AnonymousClass000.A1V(r2)
            java.lang.String r2 = "allow_non_admin_sub_group_creation"
            X.9nx r2 = r0.A0c(r2)     // Catch:{ 0wR -> 0x01a3 }
            boolean r40 = X.AnonymousClass000.A1V(r2)
            int r2 = r1.A00     // Catch:{ 0wR -> 0x01a3 }
            r3 = r2 & 1
            if (r3 == 0) goto L_0x0142
            X.0wN r3 = r1.A01     // Catch:{ 0wR -> 0x01a3 }
            java.util.LinkedHashMap r5 = X.AnonymousClass3UA.A06(r0, r3)     // Catch:{ 0wR -> 0x01a3 }
            int r3 = X.C36371kC.A05(r0, r5)     // Catch:{ 0wR -> 0x01a3 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r3)     // Catch:{ 0wR -> 0x01a3 }
        L_0x013f:
            X.3QL r15 = X.AnonymousClass3QL.A05     // Catch:{ 0wR -> 0x01a3 }
            goto L_0x0146
        L_0x0142:
            r17 = r4
            r5 = r4
            goto L_0x013f
        L_0x0146:
            r2 = r2 & 2
            if (r2 == 0) goto L_0x014e
            X.3QL r15 = X.AnonymousClass3UA.A04(r0)     // Catch:{ 0wR -> 0x01a3 }
        L_0x014e:
            X.3UA r2 = X.AnonymousClass3UA.A00     // Catch:{ 0wR -> 0x01a3 }
            int r21 = X.AnonymousClass3UA.A00(r0)     // Catch:{ 0wR -> 0x01a3 }
            X.3G4 r16 = r2.A0B(r0)     // Catch:{ 0wR -> 0x01a3 }
            java.lang.String r3 = "group_history"
            X.9nx r3 = r0.A0c(r3)     // Catch:{ 0wR -> 0x01a3 }
            boolean r41 = X.AnonymousClass000.A1V(r3)
            java.lang.String r3 = "auto_add_disabled"
            X.9nx r3 = r0.A0c(r3)     // Catch:{ 0wR -> 0x01a3 }
            boolean r42 = X.AnonymousClass000.A1V(r3)
            X.AnonymousClass00C.A0B(r15)     // Catch:{ 0wR -> 0x01a3 }
            r3 = 3
            X.3S5 r11 = new X.3S5     // Catch:{ 0wR -> 0x01a3 }
            r11.<init>(r4, r3)     // Catch:{ 0wR -> 0x01a3 }
            int r22 = X.AnonymousClass3UA.A02(r0)     // Catch:{ 0wR -> 0x01a3 }
            X.147 r13 = X.AnonymousClass3UA.A03(r0)     // Catch:{ 0wR -> 0x01a3 }
            boolean r37 = X.AnonymousClass3UA.A08(r0)     // Catch:{ 0wR -> 0x01a3 }
            int r23 = r2.A09(r0)     // Catch:{ 0wR -> 0x01a3 }
            java.lang.String r19 = X.C54102sP.A00(r7)     // Catch:{ 0wR -> 0x01a3 }
            int r24 = X.AnonymousClass3UA.A01(r0)     // Catch:{ 0wR -> 0x01a3 }
            r20 = r5
            r10.A0W(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ 0wR -> 0x01a3 }
            r6.add(r12)     // Catch:{ 0wR -> 0x01a3 }
            goto L_0x0072
        L_0x0197:
            X.09w r6 = X.C023409w.A00     // Catch:{ 0wR -> 0x01a3 }
        L_0x0199:
            java.util.Set r2 = X.C007103b.A0f(r6)     // Catch:{ 0wR -> 0x01a3 }
            int r0 = r1.A00     // Catch:{ 0wR -> 0x01a3 }
            r10.A0m(r2, r0)     // Catch:{ 0wR -> 0x01a3 }
            return
        L_0x01a3:
            r2 = move-exception
            java.lang.String r0 = "GroupRequestProtocolHelper/error/groupInitFailed"
            com.whatsapp.util.Log.e(r0, r2)
            X.0wN r3 = r1.A01
            r2 = 1
            java.lang.String r1 = "GroupRequestProtocolHelper/handleInvalidJidReceived"
            java.lang.String r0 = "invalid-jid-received"
            r3.A0E(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76783pR.BiM(X.9nx, java.lang.String):void");
    }

    public C76783pR(C19700wN r2, C20810yC r3, C20350xQ r4, C201159iy r5, AnonymousClass19A r6, int i) {
        C36321k7.A11(r3, r2, r6);
        AnonymousClass00C.A0D(r5, 5);
        this.A05 = r3;
        this.A01 = r2;
        this.A04 = r6;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = i;
    }

    public void BVN(String str) {
        C36321k7.A1P("GroupRequestProtocolHelper/onDeliveryFailure/iqId=", str, C36341k9.A0i(str));
        this.A02.A0S(this.A00);
    }

    public void BWw(C203399nx r3, String str) {
        C36321k7.A1P("GroupRequestProtocolHelper/onError/iqId=", str, C36341k9.A0i(str));
        this.A02.A0S(this.A00);
    }
}
