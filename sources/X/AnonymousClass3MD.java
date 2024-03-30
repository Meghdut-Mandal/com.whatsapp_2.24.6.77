package X;

/* renamed from: X.3MD  reason: invalid class name */
public abstract class AnonymousClass3MD {
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0062, code lost:
        if (r5.equals("false") == false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C19700wN r38, X.C20350xQ r39, X.AnonymousClass3S5 r40, X.C203399nx r41) {
        /*
            r3 = r41
            X.9nx[] r0 = r3.A02
            if (r0 == 0) goto L_0x00f0
            int r0 = r0.length
            if (r0 == 0) goto L_0x00f0
            X.9nx r0 = r3.A0a()
            java.lang.Class<X.147> r2 = X.AnonymousClass147.class
            java.lang.String r1 = "from"
            com.whatsapp.jid.Jid r9 = r3.A0X(r2, r1)
            X.C18740tg.A06(r9)
            X.147 r9 = (X.AnonymousClass147) r9
            r7 = r39
            boolean r1 = r7.A0r(r9)
            if (r1 == 0) goto L_0x00f0
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            java.lang.String r1 = "creator"
            com.whatsapp.jid.Jid r11 = r0.A0X(r2, r1)
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11
            java.lang.String r1 = "creation"
            r3 = 0
            java.lang.String r4 = r0.A0i(r1, r3)
            r1 = 0
            long r22 = X.AnonymousClass6R8.A01(r4, r1)
            r5 = 1000(0x3e8, double:4.94E-321)
            long r22 = r22 * r5
            r7.A0g(r11, r0)
            java.lang.String r4 = "subject"
            java.lang.String r15 = r0.A0i(r4, r3)
            java.lang.String r4 = "s_t"
            java.lang.String r4 = r0.A0i(r4, r3)
            long r24 = X.AnonymousClass6R8.A01(r4, r1)
            long r24 = r24 * r5
            java.lang.String r4 = "ack"
            java.lang.String r5 = r0.A0i(r4, r3)
            if (r5 == 0) goto L_0x0064
            java.lang.String r4 = "false"
            boolean r4 = r5.equals(r4)
            r35 = 0
            if (r4 != 0) goto L_0x0066
        L_0x0064:
            r35 = 1
        L_0x0066:
            java.lang.String r4 = "a_v_id"
            long r26 = r0.A0V(r4, r1)
            java.lang.String r1 = "locked"
            boolean r29 = X.C36331k8.A1Z(r0, r1)
            java.lang.String r1 = "announcement"
            boolean r30 = X.C36331k8.A1Z(r0, r1)
            java.lang.String r1 = "incognito"
            boolean r33 = X.C36331k8.A1Z(r0, r1)
            java.lang.String r1 = "no_frequently_forwarded"
            boolean r31 = X.C36331k8.A1Z(r0, r1)
            java.lang.String r1 = "suspended"
            boolean r32 = X.C36331k8.A1Z(r0, r1)
            java.lang.String r1 = "support"
            boolean r28 = X.C36331k8.A1Z(r0, r1)
            r1 = r38
            java.util.LinkedHashMap r4 = X.AnonymousClass3UA.A06(r0, r1)
            X.3UA r1 = X.AnonymousClass3UA.A00
            int r18 = X.AnonymousClass3UA.A00(r0)
            X.3G4 r13 = r1.A0B(r0)
            java.lang.String r2 = "addressing_mode"
            java.lang.String r3 = r0.A0i(r2, r3)
            java.lang.String r2 = "allow_admin_reports"
            boolean r36 = X.C36331k8.A1Z(r0, r2)
            java.lang.String r2 = "allow_non_admin_sub_group_creation"
            boolean r37 = X.C36331k8.A1Z(r0, r2)
            java.lang.String r2 = "group_history"
            boolean r38 = X.C36331k8.A1Z(r0, r2)
            java.lang.String r2 = "auto_add_disabled"
            boolean r39 = X.C36331k8.A1Z(r0, r2)
            int r2 = X.C36371kC.A05(r0, r4)
            X.3QL r12 = X.AnonymousClass3UA.A04(r0)
            int r19 = X.AnonymousClass3UA.A02(r0)
            X.147 r10 = X.AnonymousClass3UA.A03(r0)
            boolean r34 = X.AnonymousClass3UA.A08(r0)
            int r20 = r1.A09(r0)
            java.lang.String r16 = X.C54102sP.A00(r3)
            int r21 = X.AnonymousClass3UA.A01(r0)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
            r8 = r40
            r17 = r4
            r7.A0W(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            X.1AQ r0 = r7.A10
            X.1AT r0 = r0.A00
            r0.A01(r9)
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3MD.A01(X.0wN, X.0xQ, X.3S5, X.9nx):void");
    }

    public static int A00(C203399nx r4) {
        if (!AnonymousClass3UA.A08(r4)) {
            return 0;
        }
        C203399nx A0c = r4.A0c("membership_approval_request");
        if (A0c == null) {
            return 1;
        }
        if (A0c.A0i("error", (String) null) == null) {
            return 2;
        }
        String A0i = A0c.A0i("error", (String) null);
        C18740tg.A06(A0i);
        if (304 != Integer.parseInt(A0i)) {
            return 2;
        }
        return 3;
    }
}
