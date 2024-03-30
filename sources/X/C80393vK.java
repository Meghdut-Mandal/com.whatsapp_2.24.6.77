package X;

/* renamed from: X.3vK  reason: invalid class name and case insensitive filesystem */
public class C80393vK implements Runnable {
    public Object A00;
    public String A01;
    public String A02;
    public final int A03;

    public C80393vK(Object obj, String str, String str2, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = str;
        this.A02 = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0274, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02c4, code lost:
        r3.A01(r5.A0L(), 2, true, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02cd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0229, code lost:
        r1 = r4.A04;
        r1.A0k.setText(r2);
        r1.A0C.setText(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0235, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.A03
            switch(r0) {
                case 0: goto L_0x01d7;
                case 1: goto L_0x001a;
                case 2: goto L_0x01f7;
                case 3: goto L_0x0203;
                case 4: goto L_0x0038;
                case 5: goto L_0x0083;
                case 6: goto L_0x00ba;
                case 7: goto L_0x00dc;
                case 8: goto L_0x020f;
                case 9: goto L_0x0218;
                case 10: goto L_0x0236;
                case 11: goto L_0x0125;
                case 12: goto L_0x0168;
                case 13: goto L_0x019c;
                case 14: goto L_0x027d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r8.A00
            X.3pE r0 = (X.C76653pE) r0
            X.1V0 r0 = r0.A02
            X.005 r0 = r0.A02
            java.lang.Object r2 = r0.get()
            X.1Uz r2 = (X.C29011Uz) r2
            r1 = -1
            java.lang.String r0 = "Delivery failure."
            r2.A03(r0, r1)
        L_0x0019:
            return
        L_0x001a:
            java.lang.Object r0 = r8.A00
            X.A2e r0 = (X.C20990A2e) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x0024:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r2 = r3.next()
            X.7m6 r2 = (X.C161067m6) r2
            java.lang.String r1 = r8.A02
            java.lang.String r0 = r8.A01
            r2.BkH(r1, r0)
            goto L_0x0024
        L_0x0038:
            java.lang.Object r4 = r8.A00
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r4 = (com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity) r4
            java.lang.String r5 = r8.A01
            java.lang.String r3 = r8.A02
            java.lang.String r0 = "LinkedDevicesEnterCodeActivity/timeout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4Tr r7 = r4.A0A
            r2 = 0
            r6 = 2
            r0 = -3
            r7.BOi(r6, r0, r2)
            X.3D4 r0 = r4.A08
            X.C18740tg.A01()
            X.3Ne r0 = r0.A01
            if (r0 == 0) goto L_0x005e
            X.3Sv r0 = X.C64233Ne.A00(r0)
            r0.A03()
        L_0x005e:
            X.0wU r1 = r4.A04
            r0 = 41
            X.C81093wS.A01(r1, r4, r0)
            X.19A r0 = r4.A0E
            X.3pX r1 = new X.3pX
            r1.<init>(r0)
            r0 = 0
            r1.A00(r5, r0)
            X.1c9 r1 = r4.A04
            r0 = 7
            r1.A01(r0, r5, r3)
            boolean r0 = r4.BLh()
            if (r0 != 0) goto L_0x0019
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity.A01(r4)
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity.A07(r4, r2)
            return
        L_0x0083:
            java.lang.Object r0 = r8.A00
            X.3N1 r0 = (X.AnonymousClass3N1) r0
            java.lang.String r6 = r8.A01
            java.lang.String r5 = r8.A02
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r4 = r0.A00
            boolean r0 = r4.BLh()
            if (r0 != 0) goto L_0x0019
            X.C18740tg.A01()
            X.C18740tg.A01()
            java.lang.Runnable r1 = r4.A0I
            if (r1 == 0) goto L_0x00a2
            android.view.View r0 = r4.A00
            r0.removeCallbacks(r1)
        L_0x00a2:
            android.view.View r3 = r4.A00
            X.C18740tg.A01()
            java.lang.Runnable r2 = r4.A0I
            if (r2 != 0) goto L_0x00b3
            r0 = 4
            X.3vK r2 = new X.3vK
            r2.<init>(r4, r6, r5, r0)
            r4.A0I = r2
        L_0x00b3:
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            r3.postDelayed(r2, r0)
            return
        L_0x00ba:
            java.lang.Object r0 = r8.A00
            X.4Yu r0 = (X.C90024Yu) r0
            java.lang.String r4 = r8.A01
            java.lang.String r3 = r8.A02
            java.lang.Object r2 = r0.A00
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r2 = (com.whatsapp.companiondevice.LinkedDevicesSharedViewModel) r2
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x0019
            r1 = 0
            r2.A03 = r1
            X.00s r0 = r2.A05
            X.C36341k9.A18(r0, r1)
            X.1Rs r1 = r2.A0M
            X.00I r0 = X.C36441kJ.A0W(r4, r3)
            r1.A0D(r0)
            return
        L_0x00dc:
            java.lang.Object r5 = r8.A00
            X.3Qm r5 = (X.C65043Qm) r5
            java.lang.String r1 = r8.A01
            java.lang.String r4 = r8.A02
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            android.app.Activity r0 = r5.A06
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0019
            android.widget.EditText r0 = r5.A01
            java.lang.String r3 = "countryCodeField"
            if (r0 != 0) goto L_0x00fb
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x00fb:
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0107
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0019
        L_0x0107:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r1.toUpperCase(r0)
            X.AnonymousClass00C.A08(r2)
            if (r4 == 0) goto L_0x02a6
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r2)
            java.lang.String r0 = " +"
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r4, r1)
            android.widget.EditText r0 = r5.A01
            if (r0 != 0) goto L_0x02a3
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x0125:
            java.lang.Object r5 = r8.A00
            X.3ET r5 = (X.AnonymousClass3ET) r5
            java.lang.String r6 = r8.A01
            java.lang.String r4 = r8.A02
            X.5qd r0 = r5.A01
            java.lang.String r1 = X.C18750th.A04(r6)
            if (r1 == 0) goto L_0x02aa
            X.00T r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            X.6Tn r0 = (X.C132416Tn) r0
            android.graphics.Bitmap r3 = r0.A01(r1)
            if (r3 == 0) goto L_0x02aa
            java.util.Map r0 = r5.A03
            java.lang.Object r0 = r0.get(r4)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x0019
            android.view.View r2 = X.AnonymousClass000.A0Y(r0)
            if (r2 == 0) goto L_0x0019
            r0 = -1641051461(0xffffffff9e2f8abb, float:-9.293112E-21)
            java.lang.Object r0 = r2.getTag(r0)
            boolean r0 = X.AnonymousClass00C.A0J(r0, r4)
            if (r0 == 0) goto L_0x0019
            X.17Y r1 = r5.A00
            r0 = 30
            X.C36411kG.A1F(r1, r2, r3, r0)
            return
        L_0x0168:
            java.lang.Object r4 = r8.A00
            com.whatsapp.notification.OtpOneTapNotificationHandlerActivity r4 = (com.whatsapp.notification.OtpOneTapNotificationHandlerActivity) r4
            java.lang.String r0 = r8.A01
            java.lang.String r3 = r8.A02
            X.11F r2 = X.C36421kH.A0N(r0)
            r0 = 0
            X.3Qa r1 = new X.3Qa
            r1.<init>(r2, r3, r0)
            X.1A1 r0 = r4.A03
            if (r0 == 0) goto L_0x02bd
            X.3T1 r5 = r0.A03(r1)
            if (r5 == 0) goto L_0x0019
            X.17Y r2 = r4.A00
            if (r2 == 0) goto L_0x02b8
            r1 = 3
            X.AVb r0 = new X.AVb
            r0.<init>(r4, r5, r1)
            r2.A0H(r0)
            X.1Y3 r3 = r4.A01
            if (r3 != 0) goto L_0x02c4
            java.lang.String r0 = "conversationSeenManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x019c:
            java.lang.Object r4 = r8.A00
            com.whatsapp.notification.OtpZeroTapMarkAsReadNotificationHandlerReceiver r4 = (com.whatsapp.notification.OtpZeroTapMarkAsReadNotificationHandlerReceiver) r4
            java.lang.String r0 = r8.A01
            java.lang.String r3 = r8.A02
            X.11F r2 = X.C36421kH.A0N(r0)
            r0 = 0
            X.3Qa r1 = new X.3Qa
            r1.<init>(r2, r3, r0)
            X.1A1 r0 = r4.A02
            if (r0 == 0) goto L_0x02d5
            X.3T1 r5 = r0.A03(r1)
            if (r5 == 0) goto L_0x0019
            boolean r0 = r5 instanceof X.AnonymousClass2cW
            if (r0 == 0) goto L_0x01cc
            X.1TF r0 = r4.A01
            if (r0 == 0) goto L_0x02ce
            com.whatsapp.jid.UserJid r2 = r5.A0L()
            if (r2 == 0) goto L_0x01cc
            X.1C6 r1 = r0.A04
            r0 = 1
            r1.A08(r2, r0)
        L_0x01cc:
            X.1Y3 r3 = r4.A00
            if (r3 != 0) goto L_0x02c4
            java.lang.String r0 = "conversationSeenManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01d7:
            java.lang.Object r0 = r8.A00
            X.9Bw r0 = (X.C191159Bw) r0
            java.lang.String r4 = r8.A01
            java.lang.String r3 = r8.A02
            X.A0j r2 = r0.A00
            X.B3b r1 = r2.A0P
            r0 = 0
            r1.BnV(r0)
            java.lang.Object[] r1 = X.C36441kJ.A1Q()
            X.9VB r0 = r2.A0Q
            java.util.List r0 = r0.A00
            X.AnonymousClass000.A19(r0, r4, r3, r1)
            r0 = 4
            X.C20952A0j.A04(r2, r1, r0)
            return
        L_0x01f7:
            java.lang.Object r2 = r8.A00
            X.4y9 r2 = (X.C101704y9) r2
            java.lang.String r1 = r8.A01
            java.lang.String r0 = r8.A02
            X.C101704y9.A0J(r2, r1, r0)
            return
        L_0x0203:
            java.lang.Object r2 = r8.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r2 = (com.whatsapp.backup.google.SettingsGoogleDrive) r2
            java.lang.String r1 = r8.A01
            java.lang.String r0 = r8.A02
            com.whatsapp.backup.google.SettingsGoogleDrive.A0L(r2, r1, r0)
            return
        L_0x020f:
            java.lang.Object r4 = r8.A00
            X.29Q r4 = (X.AnonymousClass29Q) r4
            java.lang.String r3 = r8.A01
            java.lang.String r2 = r8.A02
            goto L_0x0229
        L_0x0218:
            java.lang.Object r4 = r8.A00
            X.29Q r4 = (X.AnonymousClass29Q) r4
            java.lang.String r3 = r8.A01
            java.lang.String r2 = r8.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "conversations-gdrive-observer/set-message "
            X.C36321k7.A1Q(r0, r3, r1)
        L_0x0229:
            com.whatsapp.conversationslist.ConversationsFragment r1 = r4.A04
            com.whatsapp.WaTextView r0 = r1.A0k
            r0.setText(r2)
            android.widget.TextView r0 = r1.A0C
            r0.setText(r3)
            return
        L_0x0236:
            java.lang.Object r1 = r8.A00
            com.whatsapp.location.StopLiveLocationDialogFragment r1 = (com.whatsapp.location.StopLiveLocationDialogFragment) r1
            java.lang.String r5 = r8.A01
            java.lang.String r0 = r8.A02
            X.1P5 r4 = r1.A00
            X.11F r3 = X.C36421kH.A0N(r0)
            java.lang.StringBuilder r1 = X.C36421kH.A0f(r3)
            java.lang.String r0 = "LocationSharingManager/cancelShareLocation; msgId="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "; jid="
            X.C36321k7.A1K(r3, r0, r1)
            java.lang.Object r2 = r4.A0R
            monitor-enter(r2)
            java.util.Map r0 = X.AnonymousClass1P5.A06(r4)     // Catch:{ all -> 0x027a }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x027a }
            X.38X r0 = (X.AnonymousClass38X) r0     // Catch:{ all -> 0x027a }
            if (r0 != 0) goto L_0x0275
            r1 = 1
            X.3Qa r0 = new X.3Qa     // Catch:{ all -> 0x027a }
            r0.<init>(r3, r5, r1)     // Catch:{ all -> 0x027a }
            X.2br r0 = X.AnonymousClass1P5.A03(r4, r0)     // Catch:{ all -> 0x027a }
            if (r0 == 0) goto L_0x0273
            X.AnonymousClass1P5.A0E(r4, r0)     // Catch:{ all -> 0x027a }
        L_0x0273:
            monitor-exit(r2)     // Catch:{ all -> 0x027a }
            return
        L_0x0275:
            monitor-exit(r2)     // Catch:{ all -> 0x027a }
            r4.A0V(r3)
            return
        L_0x027a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x027a }
            throw r0
        L_0x027d:
            java.lang.Object r7 = r8.A00
            com.whatsapp.registration.RegisterName r7 = (com.whatsapp.registration.RegisterName) r7
            java.lang.String r6 = r8.A01
            java.lang.String r5 = r8.A02
            X.228 r1 = r7.A18
            r0 = 2131433411(0x7f0b17c3, float:1.8488607E38)
            android.view.View r4 = r1.findViewById(r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3 = 2131890831(0x7f12128f, float:1.9416365E38)
            java.lang.Object[] r2 = X.C36441kJ.A1Q()
            r1 = 0
            r0 = 0
            r2[r1] = r0
            r0 = 1
            X.C36411kG.A1Q(r6, r5, r2, r0)
            X.C36341k9.A0s(r7, r4, r2, r3)
            return
        L_0x02a3:
            r0.setText(r1)
        L_0x02a6:
            r5.A05(r2)
            return
        L_0x02aa:
            X.5wP r3 = r5.A02
            X.3nw r2 = new X.3nw
            r2.<init>(r5, r4)
            X.0wU r1 = r3.A02
            r0 = 3
            X.C36421kH.A1G(r1, r3, r2, r6, r0)
            return
        L_0x02b8:
            java.lang.RuntimeException r0 = X.C36321k7.A06()
            throw r0
        L_0x02bd:
            java.lang.String r0 = "fMessageDatabase"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02c4:
            com.whatsapp.jid.UserJid r2 = r5.A0L()
            r1 = 2
            r0 = 1
            r3.A01(r2, r1, r0, r0)
            return
        L_0x02ce:
            java.lang.String r0 = "otpMessageService"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02d5:
            java.lang.String r0 = "fMessageDatabase"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80393vK.run():void");
    }
}
