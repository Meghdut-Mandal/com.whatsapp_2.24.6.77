package X;

/* renamed from: X.4Y5  reason: invalid class name */
public class AnonymousClass4Y5 implements C16620po {
    public Object A00;
    public final int A01;

    public AnonymousClass4Y5(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0232, code lost:
        if (r4 != 5) goto L_0x0234;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onMenuItemClick(android.view.MenuItem r15) {
        /*
            r14 = this;
            int r0 = r14.A01
            if (r0 == 0) goto L_0x01f9
            java.lang.Object r0 = r14.A00
            X.3Yp r0 = (X.C67123Yp) r0
            r4 = 1
            X.AnonymousClass00C.A0D(r15, r4)
            java.lang.Object r1 = r0.A03
            com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment r1 = (com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment) r1
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r1 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r1
            r2 = 0
            X.01I r6 = r1.A0h()
            if (r6 == 0) goto L_0x0298
            java.util.List r5 = r1.A0n
            if (r5 == 0) goto L_0x0298
            int r0 = r1.A00
            X.3T1 r0 = X.C36411kG.A0n(r5, r0)
            X.3LC r3 = com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A03(r0, r1)
            com.whatsapp.jid.UserJid r8 = r1.A0R
            if (r8 == 0) goto L_0x0298
            boolean r0 = r1.A0s
            if (r0 == 0) goto L_0x00a0
            boolean r0 = r3 instanceof X.C47572f9
            if (r0 == 0) goto L_0x00a0
            X.2f9 r3 = (X.C47572f9) r3
            boolean r0 = r3.A0E
            if (r0 == 0) goto L_0x0298
            int r1 = r15.getItemId()
            r0 = 2131431653(0x7f0b10e5, float:1.8485041E38)
            if (r1 != r0) goto L_0x004b
            X.3JQ r1 = r3.A0H
            X.3T1 r0 = r3.A05
            r1.A00(r0)
        L_0x0049:
            r0 = 1
            return r0
        L_0x004b:
            int r1 = r15.getItemId()
            r0 = 2131431687(0x7f0b1107, float:1.848511E38)
            if (r1 == r0) goto L_0x0098
            int r1 = r15.getItemId()
            r0 = 2131431689(0x7f0b1109, float:1.8485114E38)
            if (r1 != r0) goto L_0x0065
            X.3JQ r1 = r3.A0H
            X.3T1 r0 = r3.A05
            r1.A01(r0, r4)
            goto L_0x0049
        L_0x0065:
            int r1 = r15.getItemId()
            r0 = 2131431690(0x7f0b110a, float:1.8485116E38)
            if (r1 == r0) goto L_0x0098
            int r1 = r15.getItemId()
            r0 = 2131431648(0x7f0b10e0, float:1.8485031E38)
            if (r1 != r0) goto L_0x0298
            X.3JQ r1 = r3.A0H
            X.3T1 r0 = r3.A05
            X.AnonymousClass00C.A0D(r0, r2)
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r3 = r1.A02
            X.3Qa r2 = r0.A1J
            X.AnonymousClass00C.A07(r2)
            com.whatsapp.status.StatusDeleteDialogFragment r1 = new com.whatsapp.status.StatusDeleteDialogFragment
            r1.<init>()
            android.os.Bundle r0 = X.AnonymousClass001.A07()
            X.AnonymousClass3UJ.A08(r0, r2)
            r1.A17(r0)
            X.AnonymousClass3LQ.A01(r1, r3)
            goto L_0x0049
        L_0x0098:
            X.3JQ r1 = r3.A0H
            X.3T1 r0 = r3.A05
            r1.A01(r0, r2)
            goto L_0x0049
        L_0x00a0:
            int r3 = r15.getItemId()
            int r0 = r1.A00
            X.3T1 r0 = X.C36411kG.A0n(r5, r0)
            r7 = 262144(0x40000, float:3.67342E-40)
            int r0 = r0.A0A
            r0 = r0 & r7
            boolean r13 = X.AnonymousClass000.A1S(r0, r7)
            r0 = 2131431640(0x7f0b10d8, float:1.8485015E38)
            if (r3 != r0) goto L_0x00d4
            int r0 = r1.A00
            X.3T1 r0 = X.C36411kG.A0n(r5, r0)
            X.3Qa r0 = r0.A1J
            java.lang.String r10 = r0.A01
            int r0 = r1.A00
            java.lang.Long r9 = X.C36441kJ.A0y(r0)
            java.lang.String r11 = r1.A0m
            r12 = 0
            com.whatsapp.status.StatusConfirmUnmuteDialogFragment r0 = X.C55402uZ.A00(r8, r9, r10, r11, r12, r13)
        L_0x00cf:
            X.AnonymousClass3LQ.A01(r0, r1)
            goto L_0x0049
        L_0x00d4:
            r0 = 2131431631(0x7f0b10cf, float:1.8484997E38)
            if (r3 != r0) goto L_0x00f1
            int r0 = r1.A00
            X.3T1 r0 = X.C36411kG.A0n(r5, r0)
            X.3Qa r0 = r0.A1J
            java.lang.String r10 = r0.A01
            int r0 = r1.A00
            java.lang.Long r9 = X.C36441kJ.A0y(r0)
            java.lang.String r11 = r1.A0m
            r12 = 0
            com.whatsapp.status.StatusConfirmMuteDialogFragment r0 = X.C55392uY.A00(r8, r9, r10, r11, r12, r13)
            goto L_0x00cf
        L_0x00f1:
            r0 = 2131431643(0x7f0b10db, float:1.848502E38)
            r7 = 22
            if (r3 != r0) goto L_0x0109
            X.16D r0 = r1.A0C
            if (r0 == 0) goto L_0x0260
            X.141 r3 = r0.A0D(r8)
            X.1ND r0 = r1.A09
            if (r0 == 0) goto L_0x0259
            r0.Bua(r6, r3, r7, r2)
            goto L_0x0049
        L_0x0109:
            r0 = 2131431642(0x7f0b10da, float:1.8485019E38)
            if (r3 != r0) goto L_0x011f
            X.16D r0 = r1.A0C
            if (r0 == 0) goto L_0x026c
            X.141 r2 = r0.A0D(r8)
            X.1ND r0 = r1.A09
            if (r0 == 0) goto L_0x0265
            r0.Bua(r6, r2, r7, r4)
            goto L_0x0049
        L_0x011f:
            r0 = 2131431621(0x7f0b10c5, float:1.8484976E38)
            if (r3 != r0) goto L_0x0135
            X.3BI r2 = r1.A04
            if (r2 == 0) goto L_0x0049
            X.16D r0 = r1.A0C
            if (r0 == 0) goto L_0x0271
            X.141 r0 = r0.A0D(r8)
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A08(r0, r2, r1)
            goto L_0x0049
        L_0x0135:
            r0 = 2131431630(0x7f0b10ce, float:1.8484995E38)
            if (r3 != r0) goto L_0x0167
            X.190 r3 = r1.A0Q
            if (r3 == 0) goto L_0x027d
            android.content.Context r2 = r1.A0a()
            com.whatsapp.jid.UserJid r0 = r1.A0R
            android.content.Intent r3 = X.C36391kE.A0F(r2, r3, r0)
            X.AnonymousClass00C.A08(r3)
            com.whatsapp.jid.UserJid r2 = r1.A0R
            if (r2 == 0) goto L_0x015f
            X.18z r0 = r1.A0B
            if (r0 == 0) goto L_0x0276
            boolean r0 = r0.A0P(r2)
            if (r0 == 0) goto L_0x015f
            r2 = 3
            java.lang.String r0 = "chatlockEntryPoint"
            r3.putExtra(r0, r2)
        L_0x015f:
            r1.A1h()
            X.AnonymousClass3LQ.A00(r3, r1)
            goto L_0x0049
        L_0x0167:
            r0 = 2131431678(0x7f0b10fe, float:1.8485092E38)
            if (r3 != r0) goto L_0x01a3
            X.2Nt r3 = new X.2Nt
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r3.A00 = r0
            X.0yW r0 = r1.A0N
            if (r0 == 0) goto L_0x0287
            r0.Bly(r3)
            X.8dw r7 = X.C177528dw.A00
            X.0yC r6 = r1.A03
            if (r6 == 0) goto L_0x0282
            java.lang.String r0 = "status_post_report"
            X.3Pg r3 = new X.3Pg
            r3.<init>(r6, r7, r0, r2)
            r3.A00 = r2
            r3.A04 = r4
            r3.A05 = r2
            r3.A01 = r8
            int r0 = r1.A00
            X.3T1 r0 = X.C36411kG.A0n(r5, r0)
            X.3Qa r0 = r0.A1J
            r3.A02 = r0
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r3.A01()
            goto L_0x00cf
        L_0x01a3:
            r0 = 2131431645(0x7f0b10dd, float:1.8485025E38)
            if (r3 != r0) goto L_0x0049
            X.0yb r0 = r1.A01
            if (r0 == 0) goto L_0x0293
            android.content.ClipboardManager r6 = r0.A09()
            if (r6 == 0) goto L_0x0049
            java.util.ArrayList r8 = X.C36321k7.A0J(r5)
            java.util.Iterator r7 = r5.iterator()
        L_0x01ba:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x01de
            X.3T1 r0 = X.C36391kE.A0l(r7)
            long r3 = r0.A1N
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            X.3Qa r0 = r0.A1J
            java.lang.String r0 = r0.A01
            r5.append(r0)
            r0 = 58
            r5.append(r0)
            java.lang.String r0 = X.C36411kG.A11(r5, r3)
            r8.add(r0)
            goto L_0x01ba
        L_0x01de:
            java.lang.String r0 = ",\n"
            java.lang.String r0 = X.AnonymousClass14B.A07(r0, r8)
            X.AnonymousClass00C.A08(r0)
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r0, r0)
            r6.setPrimaryClip(r0)
            X.17Y r1 = r1.A00
            if (r1 == 0) goto L_0x028e
            java.lang.String r0 = "Message ids copied"
            r1.A0E(r0, r2)
            goto L_0x0049
        L_0x01f9:
            java.lang.Object r6 = r14.A00
            X.3TV r6 = (X.AnonymousClass3TV) r6
            java.lang.ref.WeakReference r0 = r6.A0B
            java.lang.Object r2 = r0.get()
            X.01I r2 = (X.AnonymousClass01I) r2
            r5 = 1
            if (r2 == 0) goto L_0x0252
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L_0x0252
            int r4 = r15.getItemId()
            r0 = 2
            if (r4 == r0) goto L_0x0229
            r0 = 4
            if (r4 == r0) goto L_0x0229
            r0 = 5
            if (r4 != r0) goto L_0x022e
            r3 = 0
        L_0x021c:
            X.11F r1 = r6.A0A
            int r0 = r6.A04
            com.whatsapp.calling.schedulecall.ScheduleCallFragment r0 = com.whatsapp.calling.schedulecall.ScheduleCallFragment.A03(r1, r3, r0)
            X.C65443Sb.A00(r0, r2)
            goto L_0x0049
        L_0x0229:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            goto L_0x0234
        L_0x022e:
            java.lang.Boolean r3 = X.C36381kD.A0j()
            if (r4 == r0) goto L_0x021c
        L_0x0234:
            r0 = 4
            if (r4 == r0) goto L_0x021c
            r0 = 3
            if (r4 == r0) goto L_0x021c
            r0 = 6
            X.4St r2 = r6.A06
            X.141 r1 = r6.A08
            if (r4 != r0) goto L_0x0246
            r2.BuQ(r1)
            goto L_0x0049
        L_0x0246:
            X.C18740tg.A06(r3)
            boolean r0 = r3.booleanValue()
            r2.BmB(r1, r0, r5)
            goto L_0x0049
        L_0x0252:
            java.lang.String r0 = "GroupCallMenuHelper/onPopupMenuEventListener activity is finished/finishing"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0049
        L_0x0259:
            java.lang.String r0 = "callsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0260:
            java.lang.RuntimeException r0 = X.C36331k8.A0Z()
            throw r0
        L_0x0265:
            java.lang.String r0 = "callsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x026c:
            java.lang.RuntimeException r0 = X.C36331k8.A0Z()
            throw r0
        L_0x0271:
            java.lang.RuntimeException r0 = X.C36331k8.A0Z()
            throw r0
        L_0x0276:
            java.lang.String r0 = "chatLockManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x027d:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x0282:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x0287:
            java.lang.String r0 = "wamRuntime"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x028e:
            java.lang.RuntimeException r0 = X.C36321k7.A06()
            throw r0
        L_0x0293:
            java.lang.RuntimeException r0 = X.C36331k8.A0W()
            throw r0
        L_0x0298:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Y5.onMenuItemClick(android.view.MenuItem):boolean");
    }
}
