package X;

/* renamed from: X.1Oo  reason: invalid class name and case insensitive filesystem */
public class C27531Oo implements C20370xS {
    public final AnonymousClass17Y A00;
    public final C20310xM A01;
    public final C27541Op A02;
    public final AnonymousClass17X A03;
    public final AnonymousClass12P A04;
    public final C233017y A05;
    public final C24911Eg A06;
    public final C24931Ei A07;
    public final AnonymousClass1C4 A08;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        if (((X.C181758nz) r8).A00 == 1) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
        if (r1 == false) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008c, code lost:
        if (r1 == 13) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BJb(X.AnonymousClass3T1 r8, int r9) {
        /*
            r7 = this;
            r3 = 1
            if (r9 == r3) goto L_0x0117
            r0 = 2
            if (r9 == r0) goto L_0x00fa
            r0 = 4
            if (r9 == r0) goto L_0x00f7
            r0 = 7
            if (r9 == r0) goto L_0x006f
            r0 = 8
            if (r9 == r0) goto L_0x006b
            switch(r9) {
                case 3009: goto L_0x0067;
                case 3010: goto L_0x004d;
                case 3011: goto L_0x0049;
                case 3012: goto L_0x0107;
                case 3013: goto L_0x0045;
                case 3014: goto L_0x011c;
                case 3015: goto L_0x0041;
                case 3016: goto L_0x0035;
                default: goto L_0x0013;
            }
        L_0x0013:
            switch(r9) {
                case 3018: goto L_0x00fd;
                case 3019: goto L_0x0031;
                case 3020: goto L_0x002d;
                default: goto L_0x0016;
            }
        L_0x0016:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unhandled action "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x002d:
            java.lang.String r0 = "groupactionhandler/handle group deactivation"
            goto L_0x00ff
        L_0x0031:
            java.lang.String r0 = "groupactionhandler/handle history setting update"
            goto L_0x00ff
        L_0x0035:
            java.lang.String r0 = "groupactionhandler/handle community description updated"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0xM r0 = r7.A01
            r0.A0k(r8)
            goto L_0x0107
        L_0x0041:
            java.lang.String r0 = "groupactionhandler/handle community description change"
            goto L_0x00ff
        L_0x0045:
            java.lang.String r0 = "groupactionhandler/handle_group_linked_with_membership_approval_mode"
            goto L_0x00ff
        L_0x0049:
            java.lang.String r0 = "groupactionhandler/sibling_link"
            goto L_0x00ff
        L_0x004d:
            java.lang.String r0 = "groupactionhandler/community_link_change"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r2 = r8 instanceof X.C181528nc
            boolean r1 = r8 instanceof X.C181558nf
            if (r1 == 0) goto L_0x0061
            r0 = r8
            X.8nz r0 = (X.C181758nz) r0
            int r0 = r0.A00
            if (r0 != r3) goto L_0x0061
            goto L_0x0102
        L_0x0061:
            if (r2 != 0) goto L_0x0107
            if (r1 != 0) goto L_0x0107
            goto L_0x0102
        L_0x0067:
            java.lang.String r0 = "groupactionhandler/handleGroupAction/handle groupchat announcements only change"
            goto L_0x00ff
        L_0x006b:
            java.lang.String r0 = "groupactionhandler/handle_growth_lock_change"
            goto L_0x00ff
        L_0x006f:
            java.lang.String r0 = "groupactionhandler/handle_user_remove"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6 = r8
            X.8nz r6 = (X.C181758nz) r6
            X.3Qa r0 = r6.A1J
            X.11F r1 = r0.A00
            X.6SZ r0 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r5 = X.AnonymousClass6SZ.A00(r1)
            X.C18740tg.A06(r5)
            int r1 = r6.A00
            r0 = 5
            if (r1 == r0) goto L_0x008e
            r0 = 13
            r3 = 0
            if (r1 != r0) goto L_0x008f
        L_0x008e:
            r3 = 1
        L_0x008f:
            X.17y r0 = r7.A05
            X.0yC r2 = r0.A02
            r0 = 1613(0x64d, float:2.26E-42)
            X.0yV r1 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            if (r0 == 0) goto L_0x0102
            r0 = 1527(0x5f7, float:2.14E-42)
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            if (r0 == 0) goto L_0x0102
            if (r3 == 0) goto L_0x0102
            X.17X r4 = r7.A03
            boolean r0 = r4.A0D(r5)
            if (r0 != 0) goto L_0x0102
            X.12P r0 = r7.A04
            X.1M0 r3 = r0.A05()
            X.71s r2 = r3.B1k()     // Catch:{ all -> 0x00ed }
            r4.A0A(r6)     // Catch:{ all -> 0x00e3 }
            X.1Eg r1 = r7.A06     // Catch:{ all -> 0x00e3 }
            boolean r0 = r4.A0C(r5)     // Catch:{ all -> 0x00e3 }
            r1.A00(r3, r5, r0)     // Catch:{ all -> 0x00e3 }
            boolean r0 = r4.A0C(r5)     // Catch:{ all -> 0x00e3 }
            if (r0 != 0) goto L_0x00d0
            X.1Ei r0 = r7.A07     // Catch:{ all -> 0x00e3 }
            r0.A01(r3, r5)     // Catch:{ all -> 0x00e3 }
        L_0x00d0:
            r2.A00()     // Catch:{ all -> 0x00e3 }
            r2.close()     // Catch:{ all -> 0x00ed }
            r3.close()
            X.9uj r1 = r6.A03
            if (r1 == 0) goto L_0x0107
            X.1C4 r0 = r7.A08
            r0.A01(r1)
            goto L_0x0107
        L_0x00e3:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x00e8 }
            goto L_0x00ec
        L_0x00e8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00ed }
        L_0x00ec:
            throw r1     // Catch:{ all -> 0x00ed }
        L_0x00ed:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x00f2 }
            throw r1
        L_0x00f2:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x00f7:
            java.lang.String r0 = "groupactionhandler/handleGroupAction/handle_groupchat_subject_change"
            goto L_0x00ff
        L_0x00fa:
            java.lang.String r0 = "groupactionhandler/handleGroupAction/handle_add_groupchat_msg"
            goto L_0x00ff
        L_0x00fd:
            java.lang.String r0 = "groupactionhandler/handle subgroup suggestion created"
        L_0x00ff:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0102:
            X.0xM r0 = r7.A01
            r0.A0h(r8)
        L_0x0107:
            X.3Qa r0 = r8.A1J
            X.11F r3 = r0.A00
            X.17Y r2 = r7.A00
            r1 = 4
            X.1j9 r0 = new X.1j9
            r0.<init>(r7, r3, r1)
            r2.A0H(r0)
            return
        L_0x0117:
            java.lang.String r0 = "groupactionhandler/handleGroupAction/handle-init-group-chat"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x011c:
            X.0xM r0 = r7.A01
            r0.A0h(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27531Oo.BJb(X.3T1, int):void");
    }

    public C27531Oo(AnonymousClass17Y r1, C20310xM r2, AnonymousClass17X r3, AnonymousClass12P r4, C233017y r5, C24911Eg r6, C24931Ei r7, C27541Op r8, AnonymousClass1C4 r9) {
        this.A00 = r1;
        this.A08 = r9;
        this.A01 = r2;
        this.A06 = r6;
        this.A07 = r7;
        this.A04 = r4;
        this.A02 = r8;
        this.A03 = r3;
        this.A05 = r5;
    }
}
