package X;

/* renamed from: X.7tM  reason: invalid class name and case insensitive filesystem */
public class C165397tM implements C009604b {
    public Object A00;
    public final int A01;

    public C165397tM(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r8 != null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02be, code lost:
        if (r12.A00 != -1) goto L_0x02c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010a, code lost:
        r3.A01.A02(5, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0117, code lost:
        if (r3.A06.A04() != false) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0119, code lost:
        r3.A02.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x011e, code lost:
        X.C36341k9.A16(r3.A07, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0123, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0134, code lost:
        X.C36341k9.A16(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0137, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017b, code lost:
        r1 = r4.A03.A0h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0181, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0183, code lost:
        r1 = ((android.location.LocationManager) r1.getSystemService("location")).isProviderEnabled("gps");
        r0 = r4.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0196, code lost:
        if (r1 == false) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0198, code lost:
        r0.A02.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x019d, code lost:
        if (r3 == false) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x019f, code lost:
        r1 = "in_app_gps_dialog_accepted";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01a1, code lost:
        r4.A0A.markerPoint(207368785, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01a6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01a7, code lost:
        r1 = "gps_turned_on_from_setting_screen";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01aa, code lost:
        r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01ad, code lost:
        if (r3 == false) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01af, code lost:
        r1 = "in_app_gps_dialog_denied";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01b2, code lost:
        r1 = "gps_is_not_turned_on_from_setting_screen";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BQj(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 0: goto L_0x0073;
                case 1: goto L_0x0098;
                case 2: goto L_0x00dd;
                case 3: goto L_0x0124;
                case 4: goto L_0x00f2;
                case 5: goto L_0x0138;
                case 6: goto L_0x0170;
                case 7: goto L_0x0176;
                case 8: goto L_0x01b5;
                case 9: goto L_0x01bf;
                case 10: goto L_0x021a;
                case 11: goto L_0x0253;
                case 12: goto L_0x0298;
                case 13: goto L_0x02e4;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r11.A00
            com.whatsapp.webview.ui.WaInAppBrowsingActivity r5 = (com.whatsapp.webview.ui.WaInAppBrowsingActivity) r5
            X.04d r12 = (X.C009804d) r12
            android.webkit.ValueCallback r0 = r5.A00
            r4 = 0
            if (r0 == 0) goto L_0x0217
            android.content.Intent r3 = r12.A01
            int r1 = r12.A00
            r0 = -1
            if (r1 != r0) goto L_0x0211
            if (r3 == 0) goto L_0x0211
            java.lang.String r1 = "android.intent.extra.STREAM"
            java.util.ArrayList r0 = r3.getParcelableArrayListExtra(r1)
            r2 = 0
            if (r0 == 0) goto L_0x0031
            java.util.ArrayList r1 = r3.getParcelableArrayListExtra(r1)
            android.net.Uri[] r0 = new android.net.Uri[r2]
            java.lang.Object[] r8 = r1.toArray(r0)
            android.net.Uri[] r8 = (android.net.Uri[]) r8
            if (r8 == 0) goto L_0x0212
            goto L_0x0040
        L_0x0031:
            android.net.Uri r0 = r3.getData()
            if (r0 == 0) goto L_0x0211
            r0 = 1
            android.net.Uri[] r8 = new android.net.Uri[r0]
            android.net.Uri r0 = r3.getData()
            r8[r2] = r0
        L_0x0040:
            int r7 = r8.length     // Catch:{ Exception -> 0x0207 }
            r6 = 0
        L_0x0042:
            if (r6 >= r7) goto L_0x0212
            r3 = r8[r6]     // Catch:{ Exception -> 0x0207 }
            if (r3 == 0) goto L_0x0064
            X.1Aw r2 = r5.A05     // Catch:{ Exception -> 0x0207 }
            X.0yb r0 = r5.A08     // Catch:{ Exception -> 0x0207 }
            X.0ya r1 = r0.A0O()     // Catch:{ Exception -> 0x0207 }
            r2.A02(r3)     // Catch:{ Exception -> 0x0207 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r0 = r1.A05(r3, r0)     // Catch:{ Exception -> 0x0207 }
            X.C18740tg.A06(r0)     // Catch:{ Exception -> 0x0207 }
            r2.A03(r0)     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0064
            r0.close()     // Catch:{ Exception -> 0x0207 }
        L_0x0064:
            int r6 = r6 + 1
            goto L_0x0042
        L_0x0067:
            r1 = move-exception
            if (r0 == 0) goto L_0x0072
            r0.close()     // Catch:{ all -> 0x006e }
            goto L_0x0072
        L_0x006e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0207 }
        L_0x0072:
            throw r1     // Catch:{ Exception -> 0x0207 }
        L_0x0073:
            java.lang.Object r2 = r11.A00
            X.51F r2 = (X.AnonymousClass51F) r2
            java.util.Map r12 = (java.util.Map) r12
            r1 = 1
            X.AnonymousClass00C.A0D(r12, r1)
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.Object r0 = r12.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0219
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0219
            r2.A0A = r1
            X.4kp r0 = r2.A3i()
            X.1Rs r1 = r0.A0W
            r0 = 0
            goto L_0x0134
        L_0x0098:
            java.lang.Object r5 = r11.A00
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment r5 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment) r5
            X.04d r12 = (X.C009804d) r12
            android.content.Intent r2 = r12.A01
            int r1 = r12.A00
            r0 = -1
            if (r1 != r0) goto L_0x0219
            if (r2 == 0) goto L_0x0219
            java.lang.String r0 = "arg_search_filters"
            android.os.Bundle r4 = r2.getBundleExtra(r0)
            r1 = 0
            java.lang.String r0 = "arg_location_access_changed"
            boolean r3 = r2.getBooleanExtra(r0, r1)
            X.4km r2 = r5.A0B
            if (r2 == 0) goto L_0x00c6
            if (r4 == 0) goto L_0x00c6
            r1 = r3 ^ 1
            X.6QK r0 = r2.A0K
            r0.A08(r4)
            if (r1 == 0) goto L_0x00c6
            X.C95394km.A0C(r2)
        L_0x00c6:
            X.4km r0 = r5.A0B
            if (r0 == 0) goto L_0x0219
            if (r3 == 0) goto L_0x0219
            X.1QW r0 = r5.A0F
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x00d9
            X.5DR r0 = r5.A06
            r0.A00()
        L_0x00d9:
            r5.B7F()
            return
        L_0x00dd:
            java.lang.Object r2 = r11.A00
            com.whatsapp.businessdirectory.view.fragment.LocationOptionPickerFragment r2 = (com.whatsapp.businessdirectory.view.fragment.LocationOptionPickerFragment) r2
            X.04d r12 = (X.C009804d) r12
            int r1 = r12.A00
            r0 = -1
            com.whatsapp.businessdirectory.viewmodel.LocationOptionPickerViewModel r3 = r2.A03
            if (r1 == r0) goto L_0x010a
            r2 = 6
            X.6pA r1 = r3.A01
            r0 = 1
            r1.A02(r2, r0)
            return
        L_0x00f2:
            java.lang.Object r1 = r11.A00
            com.whatsapp.businessdirectory.view.fragment.LocationOptionPickerFragment r1 = (com.whatsapp.businessdirectory.view.fragment.LocationOptionPickerFragment) r1
            java.util.Map r12 = (java.util.Map) r12
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.Object r0 = r12.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0219
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0219
            com.whatsapp.businessdirectory.viewmodel.LocationOptionPickerViewModel r3 = r1.A03
        L_0x010a:
            r2 = 5
            X.6pA r1 = r3.A01
            r0 = 1
            r1.A02(r2, r0)
            X.1QW r0 = r3.A06
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x011e
            X.5DR r0 = r3.A02
            r0.A00()
        L_0x011e:
            X.1Rs r0 = r3.A07
            X.C36341k9.A16(r0, r2)
            return
        L_0x0124:
            java.lang.Object r2 = r11.A00
            com.whatsapp.businessdirectory.view.fragment.LocationOptionPickerFragment r2 = (com.whatsapp.businessdirectory.view.fragment.LocationOptionPickerFragment) r2
            X.04d r12 = (X.C009804d) r12
            int r1 = r12.A00
            r0 = -1
            if (r1 != r0) goto L_0x0219
            com.whatsapp.businessdirectory.viewmodel.LocationOptionPickerViewModel r0 = r2.A03
            X.1Rs r1 = r0.A07
            r0 = 2
        L_0x0134:
            X.C36341k9.A16(r1, r0)
            return
        L_0x0138:
            java.lang.Object r4 = r11.A00
            X.6qn r4 = (X.C143586qn) r4
            X.04d r12 = (X.C009804d) r12
            int r1 = r12.A00
            r3 = 207368785(0xc5c3251, float:1.6963325E-31)
            r0 = -1
            if (r1 != r0) goto L_0x016b
            X.0yC r1 = r4.A09
            r0 = 6328(0x18b8, float:8.867E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x015e
            X.5DQ r0 = r4.A07
            r2 = 1
            X.9Qj r0 = r0.A03
            android.content.SharedPreferences$Editor r1 = X.C90474aD.A0H(r0)
            java.lang.String r0 = "location_access_granted"
            X.C36331k8.A0w(r1, r0, r2)
        L_0x015e:
            X.6qs r0 = r4.A06
            r0.BaD()
            X.0zE r1 = r4.A0A
            java.lang.String r0 = "system_location_permission_accepted"
        L_0x0167:
            r1.markerPoint(r3, r0)
            return
        L_0x016b:
            X.0zE r1 = r4.A0A
            java.lang.String r0 = "system_location_permission_denied"
            goto L_0x0167
        L_0x0170:
            java.lang.Object r4 = r11.A00
            X.6qn r4 = (X.C143586qn) r4
            r3 = 0
            goto L_0x017b
        L_0x0176:
            java.lang.Object r4 = r11.A00
            X.6qn r4 = (X.C143586qn) r4
            r3 = 1
        L_0x017b:
            X.02E r0 = r4.A03
            X.01I r1 = r0.A0h()
            if (r1 == 0) goto L_0x0219
            java.lang.String r0 = "location"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            java.lang.String r0 = "gps"
            boolean r1 = r1.isProviderEnabled(r0)
            r2 = 207368785(0xc5c3251, float:1.6963325E-31)
            X.6qs r0 = r4.A06
            if (r1 == 0) goto L_0x01aa
            X.6Th r0 = r0.A02
            r0.A02()
            if (r3 == 0) goto L_0x01a7
            java.lang.String r1 = "in_app_gps_dialog_accepted"
        L_0x01a1:
            X.0zE r0 = r4.A0A
            r0.markerPoint(r2, r1)
            return
        L_0x01a7:
            java.lang.String r1 = "gps_turned_on_from_setting_screen"
            goto L_0x01a1
        L_0x01aa:
            r0.A00()
            if (r3 == 0) goto L_0x01b2
            java.lang.String r1 = "in_app_gps_dialog_denied"
            goto L_0x01a1
        L_0x01b2:
            java.lang.String r1 = "gps_is_not_turned_on_from_setting_screen"
            goto L_0x01a1
        L_0x01b5:
            java.lang.Object r0 = r11.A00
            com.whatsapp.calling.screenshare.ScreenShareViewModel r0 = (com.whatsapp.calling.screenshare.ScreenShareViewModel) r0
            X.04d r12 = (X.C009804d) r12
            com.whatsapp.calling.screenshare.ScreenShareViewModel.A09(r12, r0)
            return
        L_0x01bf:
            java.lang.Object r2 = r11.A00
            X.5DB r2 = (X.AnonymousClass5DB) r2
            X.04d r12 = (X.C009804d) r12
            int r1 = r12.A00
            if (r1 != 0) goto L_0x01d0
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r1 = r2.A06
            r0 = 1
            r1.A0X(r0)
            return
        L_0x01d0:
            r0 = -1
            if (r1 != r0) goto L_0x01dc
            android.content.Intent r1 = r12.A01
            if (r1 != 0) goto L_0x01f9
            java.lang.String r0 = "fpm/P2pTransferActivity/qr code scanner result is null but result code is ok"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x01dc:
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r1 = r2.A06
            r6 = 2131887819(0x7f1206cb, float:1.9410256E38)
            r5 = 2131887820(0x7f1206cc, float:1.9410258E38)
            r7 = 2131895087(0x7f12232f, float:1.9424997E38)
            r0 = 5
            X.7ph r4 = new X.7ph
            r4.<init>(r1, r0)
            r8 = 0
            r10 = 1
            X.5xs r3 = new X.5xs
            r9 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2.A3k(r3)
            return
        L_0x01f9:
            java.lang.String r0 = "qr_code_key"
            java.lang.String r1 = r1.getStringExtra(r0)
            if (r1 == 0) goto L_0x0219
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = r2.A06
            r0.A0a(r1)
            return
        L_0x0207:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WaInappBrowsingActivity/areFileUrisExternal: Internal file provided for image upload in web view"
            X.C36321k7.A1J(r2, r0, r1)
        L_0x0211:
            r8 = r4
        L_0x0212:
            android.webkit.ValueCallback r0 = r5.A00
            r0.onReceiveValue(r8)
        L_0x0217:
            r5.A00 = r4
        L_0x0219:
            return
        L_0x021a:
            java.lang.Object r2 = r11.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsAddPaymentMethodActivity r2 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsAddPaymentMethodActivity) r2
            X.61B r1 = r2.A01
            if (r1 == 0) goto L_0x024c
            java.lang.String r0 = r2.A02
            if (r0 != 0) goto L_0x022d
            java.lang.String r0 = "fdsManagerId"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x022d:
            X.9oR r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0248
            X.9oP r1 = r0.A00
            if (r1 == 0) goto L_0x0248
            java.lang.String r0 = "native_upi_add_payment_method"
            X.0p4 r1 = r1.A0A(r0)
            X.7o1 r1 = (X.C162097o1) r1
            if (r1 == 0) goto L_0x0248
            X.00f r0 = X.C000400e.A0D()
            r1.B7N(r0)
        L_0x0248:
            r2.finish()
            return
        L_0x024c:
            java.lang.String r0 = "phoenixManagerRegistry"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0253:
            java.lang.Object r3 = r11.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsConsumerOnboardingActivity r3 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsConsumerOnboardingActivity) r3
            X.1EZ r0 = r3.A0I
            boolean r0 = r0.A0D()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "onboarding_success"
            java.util.Map r2 = X.C36391kE.A11(r0, r1)
            X.61B r1 = r3.A01
            if (r1 == 0) goto L_0x0291
            java.lang.String r0 = r3.A02
            if (r0 != 0) goto L_0x0276
            java.lang.String r0 = "fdsManagerId"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0276:
            X.9oR r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x028d
            X.9oP r1 = r0.A00
            if (r1 == 0) goto L_0x028d
            java.lang.String r0 = "native_upi_consumer_onboarding"
            X.0p4 r0 = r1.A0A(r0)
            X.7o1 r0 = (X.C162097o1) r0
            if (r0 == 0) goto L_0x028d
            r0.B7N(r2)
        L_0x028d:
            r3.finish()
            return
        L_0x0291:
            java.lang.String r0 = "phoenixManagerRegistry"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0298:
            java.lang.Object r4 = r11.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsResetPinActivity r4 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsResetPinActivity) r4
            X.04d r12 = (X.C009804d) r12
            X.61B r1 = r4.A01
            if (r1 == 0) goto L_0x02dd
            java.lang.String r0 = r4.A02
            if (r0 == 0) goto L_0x02d6
            X.9oR r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x02d4
            X.9oP r1 = r0.A00
            if (r1 == 0) goto L_0x02d4
            java.lang.String r0 = "native_upi_reset_pin"
            X.0p4 r3 = r1.A0A(r0)
            X.7o1 r3 = (X.C162097o1) r3
        L_0x02b8:
            if (r12 == 0) goto L_0x02c0
            int r2 = r12.A00
            r1 = -1
            r0 = 1
            if (r2 == r1) goto L_0x02c1
        L_0x02c0:
            r0 = 0
        L_0x02c1:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "was_pin_set"
            java.util.Map r0 = X.C36391kE.A11(r0, r1)
            if (r3 == 0) goto L_0x02d0
            r3.B7N(r0)
        L_0x02d0:
            r4.finish()
            return
        L_0x02d4:
            r3 = 0
            goto L_0x02b8
        L_0x02d6:
            java.lang.String r0 = "fdsManagerId"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02dd:
            java.lang.String r0 = "phoenixManagerRegistry"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02e4:
            java.lang.Object r1 = r11.A00
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            X.0xY r0 = r1.A19
            r0.A08()
            X.1dz r0 = r1.A1S
            r0.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C165397tM.BQj(java.lang.Object):void");
    }
}
