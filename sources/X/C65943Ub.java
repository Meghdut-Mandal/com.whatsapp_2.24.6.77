package X;

/* renamed from: X.3Ub  reason: invalid class name and case insensitive filesystem */
public class C65943Ub implements AnonymousClass04S {
    public Object A00;
    public final int A01;

    public C65943Ub(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BTH(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.A01
            switch(r0) {
                case 0: goto L_0x000d;
                case 1: goto L_0x0076;
                case 2: goto L_0x00f3;
                case 3: goto L_0x010c;
                case 4: goto L_0x0112;
                case 5: goto L_0x0133;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r9.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1c()
            return
        L_0x000d:
            java.lang.Object r7 = r9.A00
            com.whatsapp.userban.ui.BanAppealActivity r7 = (com.whatsapp.userban.ui.BanAppealActivity) r7
            int r8 = X.AnonymousClass000.A0I(r10)
            r0 = -2
            r6 = 1
            r5 = -1
            if (r8 == r0) goto L_0x0069
            if (r8 == r6) goto L_0x0062
            r0 = 3
            if (r8 == r0) goto L_0x005a
            r2 = 4
            r1 = 2131888766(0x7f120a7e, float:1.9412177E38)
            r0 = 2131886657(0x7f120241, float:1.94079E38)
            if (r8 == r2) goto L_0x0060
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 2131886656(0x7f120240, float:1.9407897E38)
        L_0x002e:
            r4 = -1
            r3 = -1
        L_0x0030:
            X.1qm r2 = X.AnonymousClass3LW.A00(r7)
            r2.A0c(r0)
            r2.A0r(r6)
            java.lang.String r1 = r7.getString(r1)
            X.3UZ r0 = new X.3UZ
            r0.<init>(r7, r8)
            r2.A0o(r7, r0, r1)
            if (r3 == r5) goto L_0x004b
            r2.A0d(r3)
        L_0x004b:
            if (r4 == r5) goto L_0x0056
            java.lang.String r1 = r7.getString(r4)
            X.3bC r0 = X.C68013bC.A00
            r2.A0n(r7, r0, r1)
        L_0x0056:
            r2.A0b()
            return
        L_0x005a:
            r1 = 2131892008(0x7f121728, float:1.9418752E38)
            r0 = 2131886658(0x7f120242, float:1.9407901E38)
        L_0x0060:
            r6 = 0
            goto L_0x002e
        L_0x0062:
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 2131891607(0x7f121597, float:1.9417939E38)
            goto L_0x002e
        L_0x0069:
            r1 = 2131892008(0x7f121728, float:1.9418752E38)
            r3 = 2131886653(0x7f12023d, float:1.940789E38)
            r4 = 2131896389(0x7f122845, float:1.9427638E38)
            r0 = 2131886654(0x7f12023e, float:1.9407893E38)
            goto L_0x0030
        L_0x0076:
            java.lang.Object r5 = r9.A00
            com.whatsapp.userban.ui.BanAppealActivity r5 = (com.whatsapp.userban.ui.BanAppealActivity) r5
            int r2 = X.AnonymousClass000.A0I(r10)
            r6 = 1
            if (r2 == r6) goto L_0x00db
            r0 = 2
            if (r2 == r0) goto L_0x00d3
            r0 = 3
            if (r2 == r0) goto L_0x00cb
            r0 = 4
            if (r2 == r0) goto L_0x00c3
            r0 = 5
            if (r2 != r0) goto L_0x00e3
            java.lang.String r4 = "BanAppealBannedDecisionFragment"
            com.whatsapp.userban.ui.fragment.BanAppealBannedDecisionFragment r3 = new com.whatsapp.userban.ui.fragment.BanAppealBannedDecisionFragment
            r3.<init>()
        L_0x0094:
            r6 = 0
        L_0x0095:
            X.01z r2 = r5.getSupportFragmentManager()
            java.lang.String r1 = r5.A01
            if (r1 == 0) goto L_0x00aa
            int r0 = r2.A0I()
            if (r0 <= 0) goto L_0x00aa
            r0 = 1
            r2.A0n(r1, r0)
            r0 = 0
            r5.A01 = r0
        L_0x00aa:
            X.09Y r1 = X.C36341k9.A0O(r5)
            r0 = 2131429145(0x7f0b0719, float:1.8479954E38)
            r1.A0B(r3, r0)
            if (r6 == 0) goto L_0x00bf
            java.lang.String r0 = r5.A01
            if (r0 != 0) goto L_0x00bc
            r5.A01 = r4
        L_0x00bc:
            r1.A0J(r4)
        L_0x00bf:
            r1.A01()
            return
        L_0x00c3:
            java.lang.String r4 = "BanAppealUnbannedDecisionFragment"
            com.whatsapp.userban.ui.fragment.BanAppealUnbannedDecisionFragment r3 = new com.whatsapp.userban.ui.fragment.BanAppealUnbannedDecisionFragment
            r3.<init>()
            goto L_0x0094
        L_0x00cb:
            java.lang.String r4 = "BanAppealFormSubmittedFragment"
            com.whatsapp.userban.ui.fragment.BanAppealFormSubmittedFragment r3 = new com.whatsapp.userban.ui.fragment.BanAppealFormSubmittedFragment
            r3.<init>()
            goto L_0x0095
        L_0x00d3:
            java.lang.String r4 = "BanAppealFormFragment"
            com.whatsapp.userban.ui.fragment.BanAppealFormFragment r3 = new com.whatsapp.userban.ui.fragment.BanAppealFormFragment
            r3.<init>()
            goto L_0x00aa
        L_0x00db:
            java.lang.String r4 = "BanInfoFragment"
            com.whatsapp.userban.ui.fragment.BanInfoFragment r3 = new com.whatsapp.userban.ui.fragment.BanInfoFragment
            r3.<init>()
            goto L_0x0094
        L_0x00e3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid screen state: "
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r2)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x00f3:
            java.lang.Object r2 = r9.A00
            com.whatsapp.userban.ui.fragment.BanAppealFormFragment r2 = (com.whatsapp.userban.ui.fragment.BanAppealFormFragment) r2
            int r1 = X.AnonymousClass000.A0I(r10)
            r0 = 1
            X.17Y r2 = r2.A01
            if (r1 != r0) goto L_0x0108
            r1 = 2131894725(0x7f1221c5, float:1.9424263E38)
            r0 = 0
            r2.A05(r1, r0)
            return
        L_0x0108:
            r2.A02()
            return
        L_0x010c:
            java.lang.Object r0 = r9.A00
            X.C36331k8.A1J(r0, r10)
            return
        L_0x0112:
            java.lang.Object r3 = r9.A00
            X.4w9 r3 = (X.C100864w9) r3
            X.3XF r10 = (X.AnonymousClass3XF) r10
            r0 = 0
            X.AnonymousClass00C.A0D(r10, r0)
            com.whatsapp.calling.backwardcompat.BackwardCompatDialog r2 = new com.whatsapp.calling.backwardcompat.BackwardCompatDialog
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "event-args"
            r1.putParcelable(r0, r10)
            r2.A17(r1)
            java.lang.String r0 = "BackwardCompatDialog"
            r3.A3o(r2, r0)
            return
        L_0x0133:
            java.lang.Object r2 = r9.A00
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            java.lang.Number r10 = (java.lang.Number) r10
            boolean r0 = r2.A1r
            if (r0 != 0) goto L_0x0150
            int r1 = r10.intValue()
            X.3FU r0 = new X.3FU
            r0.<init>()
            com.whatsapp.voipcalling.VoipErrorDialogFragment r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A05(r0, r1)
            java.lang.String r0 = "VoipErrorDialogFragment"
            r2.A3o(r1, r0)
            return
        L_0x0150:
            X.17Y r2 = r2.A05
            r1 = 2131893843(0x7f121e53, float:1.9422474E38)
            r0 = 0
            r2.A06(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65943Ub.BTH(java.lang.Object):void");
    }
}
