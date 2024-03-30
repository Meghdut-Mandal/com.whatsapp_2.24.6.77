package X;

/* renamed from: X.3RF  reason: invalid class name */
public class AnonymousClass3RF implements AnonymousClass05T {
    public Object A00;
    public final int A01;

    public AnonymousClass3RF(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.whatsapp.chatinfo.ContactInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: com.whatsapp.registration.deviceswitching.DeviceSwitchingSelfServeEducationScreen} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: X.3qM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: X.3qM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: X.3qM} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0270, code lost:
        r3.A00 = r1;
        r2 = r3.A08;
        r2.A1T("primary_eligible");
        r2.A21(true);
        X.C77353qM.A03(r3);
        X.AnonymousClass97V.A00(r3.A06, r2, r3, r3.A0A);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0287, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cb, code lost:
        r1.A01(X.C36441kJ.A0n(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
        r3.A00 = r1;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        r2 = r3.A08;
        r1 = r3.A06;
        r0 = r3.A0A;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x023e, code lost:
        r0.A01();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0241, code lost:
        r2.getSupportFragmentManager().A0m(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0248, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        X.AnonymousClass97V.A00(r1, r2, r3, r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BYP(java.lang.String r11, android.os.Bundle r12) {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x01f9;
                case 1: goto L_0x0201;
                case 2: goto L_0x003b;
                case 3: goto L_0x006e;
                case 4: goto L_0x0091;
                case 5: goto L_0x00d3;
                case 6: goto L_0x0215;
                case 7: goto L_0x021b;
                case 8: goto L_0x0223;
                case 9: goto L_0x00f6;
                case 10: goto L_0x022b;
                case 11: goto L_0x0249;
                case 12: goto L_0x010a;
                case 13: goto L_0x018c;
                case 14: goto L_0x01b3;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r10.A00
            com.whatsapp.registration.phonenumberentry.RegisterPhone r3 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r3
            java.lang.String r0 = "VERIFY_ANOTHER_WAY_CODE_METHOD"
            java.lang.String r2 = r12.getString(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "RegisterPhone/verify-another-way/codeMethod "
            X.C36321k7.A1Q(r0, r2, r1)
            java.util.Objects.requireNonNull(r2)
            java.lang.String r1 = "sms"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L_0x026c
            java.lang.String r1 = "voice"
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x003a
            X.3qM r3 = com.whatsapp.registration.phonenumberentry.RegisterPhone.A0i(r3)
        L_0x002f:
            r3.A00 = r1
        L_0x0031:
            X.0v0 r2 = r3.A08
            X.0wG r1 = r3.A06
            boolean r0 = r3.A0A
        L_0x0037:
            X.AnonymousClass97V.A00(r1, r2, r3, r0)
        L_0x003a:
            return
        L_0x003b:
            java.lang.Object r3 = r10.A00
            com.whatsapp.community.CommunityHomeActivity r3 = (com.whatsapp.community.CommunityHomeActivity) r3
            java.lang.String r0 = "dialogAction"
            int r1 = r12.getInt(r0)
            if (r1 < 0) goto L_0x003a
            X.2np[] r0 = X.C51442np.values()
            int r0 = r0.length
            r2 = 1
            int r0 = r0 - r2
            if (r1 > r0) goto L_0x003a
            X.2np[] r0 = X.C51442np.values()
            r1 = r0[r1]
            X.2np r0 = X.C51442np.SELF_DEMOTE
            if (r1 != r0) goto L_0x003a
            java.lang.String r0 = "parentGroupJid"
            android.os.Parcelable r1 = r12.getParcelable(r0)
            X.147 r1 = (X.AnonymousClass147) r1
            X.C18740tg.A06(r1)
            X.4Pa r0 = r3.A0N
            X.3Eh r1 = r0.B3v(r3, r1, r2)
            X.0wQ r0 = r3.A02
            goto L_0x00cb
        L_0x006e:
            java.lang.Object r1 = r10.A00
            X.3fk r1 = (X.C70803fk) r1
            java.lang.String r2 = "request_bottom_sheet_fragment"
            boolean r0 = r2.equals(r11)
            if (r0 == 0) goto L_0x007d
            X.C70803fk.A0l(r1)
        L_0x007d:
            X.155 r1 = X.C70803fk.A0C(r1)
            if (r1 == 0) goto L_0x003a
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x003a
            X.01z r0 = r1.getSupportFragmentManager()
            r0.A0m(r2)
            return
        L_0x0091:
            java.lang.Object r4 = r10.A00
            X.3fk r4 = (X.C70803fk) r4
            java.lang.String r0 = "dialogAction"
            int r1 = r12.getInt(r0)
            if (r1 < 0) goto L_0x003a
            X.2np[] r0 = X.C51442np.values()
            int r0 = r0.length
            r3 = 1
            int r0 = r0 - r3
            if (r1 > r0) goto L_0x003a
            X.2np[] r0 = X.C51442np.values()
            r1 = r0[r1]
            X.2np r0 = X.C51442np.SELF_DEMOTE
            if (r1 != r0) goto L_0x003a
            java.lang.String r0 = "parentGroupJid"
            android.os.Parcelable r2 = r12.getParcelable(r0)
            X.147 r2 = (X.AnonymousClass147) r2
            X.C18740tg.A06(r2)
            X.4Pa r1 = r4.A2A
            X.155 r0 = X.C70803fk.A0C(r4)
            X.3Eh r1 = r1.B3v(r0, r2, r3)
            X.4V6 r0 = r4.A2l
            X.0wQ r0 = r0.getMeManager()
        L_0x00cb:
            com.whatsapp.jid.PhoneUserJid r0 = X.C36441kJ.A0n(r0)
            r1.A01(r0)
            return
        L_0x00d3:
            java.lang.Object r2 = r10.A00
            com.whatsapp.events.EventCreateOrEditFragment r2 = (com.whatsapp.events.EventCreateOrEditFragment) r2
            X.C36321k7.A0x(r11, r12)
            int r1 = r11.hashCode()
            r0 = -1900898678(0xffffffff8eb2968a, float:-4.402535E-30)
            if (r1 != r0) goto L_0x003a
            java.lang.String r0 = "single_selection_dialog_result"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x003a
            X.1us r1 = r2.A0H
            if (r1 != 0) goto L_0x0251
            java.lang.String r0 = "eventCreateOrEditViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00f6:
            java.lang.Object r1 = r10.A00
            X.02t r1 = (X.C006302t) r1
            r0 = 2
            X.AnonymousClass00C.A0D(r12, r0)
            java.lang.String r0 = "AddMembersSuccessJidList"
            java.util.ArrayList r0 = r12.getParcelableArrayList(r0)
            if (r0 == 0) goto L_0x003a
            r1.invoke(r0)
            return
        L_0x010a:
            java.lang.Object r3 = r10.A00
            com.whatsapp.registration.deviceswitching.DeviceSwitchingSelfServeEducationScreen r3 = (com.whatsapp.registration.deviceswitching.DeviceSwitchingSelfServeEducationScreen) r3
            r0 = 2
            X.AnonymousClass00C.A0D(r12, r0)
            java.lang.String r0 = "VERIFY_ANOTHER_WAY_CODE_METHOD"
            java.lang.String r2 = r12.getString(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "DeviceSwitchingSelfServeEducationScreen/verifyAnotherWay/codeMethod : "
            X.C36321k7.A1Q(r0, r2, r1)
            java.lang.String r0 = "sms"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x0142
            X.0v0 r1 = r3.A09
            r0 = 1
            r1.A21(r0)
            r0 = 0
            r3.A0I = r0
            X.0v0 r2 = r3.A09
            X.AnonymousClass00C.A07(r2)
            X.0wG r1 = r3.A06
            if (r1 != 0) goto L_0x0188
            java.lang.String r0 = "waContext"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0142:
            java.lang.String r0 = "voice"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x003a
            X.0yb r2 = r3.A08
            X.AnonymousClass00C.A07(r2)
            X.0zN r1 = r3.A07
            if (r1 == 0) goto L_0x0262
            int r0 = r3.A00
            boolean r0 = X.C55252uK.A00(r2, r1, r0)
            if (r0 == 0) goto L_0x0175
            java.lang.String r0 = "DeviceSwitchingSelfServeEducationScreen/showFlashCallScreen"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r4 = r3.A00
            long r5 = r3.A02
            long r7 = r3.A03
            boolean r9 = r3.A0G
            android.content.Intent r1 = X.AnonymousClass190.A0K(r3, r4, r5, r7, r9)
            X.1Dv r0 = r3.A01
            r0.A06(r3, r1)
            r3.finish()
            return
        L_0x0175:
            r0 = 1
            r3.A0I = r0
            X.0v0 r2 = r3.A09
            X.AnonymousClass00C.A07(r2)
            X.0wG r1 = r3.A06
            if (r1 != 0) goto L_0x0188
            java.lang.String r0 = "waContext"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0188:
            boolean r0 = r3.A0H
            goto L_0x0037
        L_0x018c:
            java.lang.Object r3 = r10.A00
            com.whatsapp.registration.flashcall.PrimaryFlashCallEducationScreen r3 = (com.whatsapp.registration.flashcall.PrimaryFlashCallEducationScreen) r3
            java.lang.String r0 = "VERIFY_ANOTHER_WAY_CODE_METHOD"
            java.lang.String r2 = r12.getString(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PrimaryFlashCallEducationScreen/verify-another-way/codeMethod "
            X.C36321k7.A1Q(r0, r2, r1)
            java.lang.String r1 = "sms"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L_0x0269
            java.lang.String r1 = "voice"
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x003a
            X.3qM r3 = r3.A08
            goto L_0x002f
        L_0x01b3:
            java.lang.Object r3 = r10.A00
            com.whatsapp.registration.phonenumberentry.RegisterPhone r3 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r3
            java.lang.String r0 = "FLASH_CALL_CONSENT_BOTTOM_SHEET_ACTION"
            java.lang.String r2 = r12.getString(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "RegisterPhone/flash-call-consent-screen/actionTaken "
            X.C36321k7.A1Q(r0, r2, r1)
            java.lang.String r0 = "FLASH_CALL_CONSENT_BOTTOM_SHEET_ACTION_CONTINUE"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x01ef
            java.lang.String r0 = "FLASH_CALL_CONSENT_BOTTOM_SHEET_ACTION_NOT_NOW"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003a
            com.whatsapp.registration.VerifyAnotherWayBottomSheetFragment r0 = new com.whatsapp.registration.VerifyAnotherWayBottomSheetFragment
            r0.<init>()
            r3.Btm(r0)
            X.01z r2 = r3.getSupportFragmentManager()
            r0 = 15
            X.3RF r1 = new X.3RF
            r1.<init>(r3, r0)
            java.lang.String r0 = "VERIFY_ANOTHER_WAY_FRAGMENT_RESULT"
            r2.A0l(r1, r3, r0)
            return
        L_0x01ef:
            X.3qM r3 = com.whatsapp.registration.phonenumberentry.RegisterPhone.A0i(r3)
            java.lang.String r0 = "flash"
            r3.A00 = r0
            goto L_0x0031
        L_0x01f9:
            java.lang.Object r0 = r10.A00
            com.whatsapp.calling.callhistory.CallLogActivity r0 = (com.whatsapp.calling.callhistory.CallLogActivity) r0
            r0.A3i(r11, r12)
            return
        L_0x0201:
            java.lang.Object r2 = r10.A00
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            java.lang.String r1 = "request_bottom_sheet_fragment"
            boolean r0 = r11.equals(r1)
            if (r0 == 0) goto L_0x0241
            X.0xY r0 = r2.A0p
            r0.A08()
            X.1dz r0 = r2.A1O
            goto L_0x023e
        L_0x0215:
            java.lang.Object r0 = r10.A00
            X.C36411kG.A1N(r0)
            return
        L_0x021b:
            java.lang.Object r0 = r10.A00
            com.whatsapp.events.EventInfoBottomSheet r0 = (com.whatsapp.events.EventInfoBottomSheet) r0
            com.whatsapp.events.EventInfoBottomSheet.A03(r12, r0)
            return
        L_0x0223:
            java.lang.Object r0 = r10.A00
            X.00S r0 = (X.AnonymousClass00S) r0
            r0.invoke()
            return
        L_0x022b:
            java.lang.Object r2 = r10.A00
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            java.lang.String r1 = "request_bottom_sheet_fragment"
            boolean r0 = r1.equals(r11)
            if (r0 == 0) goto L_0x0241
            X.0xY r0 = r2.A0o
            r0.A08()
            X.1dz r0 = r2.A1t
        L_0x023e:
            r0.A01()
        L_0x0241:
            X.01z r0 = r2.getSupportFragmentManager()
            r0.A0m(r1)
            return
        L_0x0249:
            java.lang.Object r0 = r10.A00
            com.whatsapp.inappsupport.ui.SupportAiActivity r0 = (com.whatsapp.inappsupport.ui.SupportAiActivity) r0
            com.whatsapp.inappsupport.ui.SupportAiActivity.A01(r12, r0)
            return
        L_0x0251:
            java.lang.String r0 = "selectedIndex"
            int r0 = r12.getInt(r0)
            if (r0 != 0) goto L_0x025f
            X.2nU r0 = X.C51232nU.WA_VIDEO_CALL
        L_0x025b:
            r1.A0S(r0)
            return
        L_0x025f:
            X.2nU r0 = X.C51232nU.WA_VOICE_CALL
            goto L_0x025b
        L_0x0262:
            java.lang.String r0 = "abPreChatdProps"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0269:
            X.3qM r3 = r3.A08
            goto L_0x0270
        L_0x026c:
            X.3qM r3 = com.whatsapp.registration.phonenumberentry.RegisterPhone.A0i(r3)
        L_0x0270:
            r3.A00 = r1
            X.0v0 r2 = r3.A08
            java.lang.String r0 = "primary_eligible"
            r2.A1T(r0)
            r0 = 1
            r2.A21(r0)
            X.C77353qM.A03(r3)
            X.0wG r1 = r3.A06
            boolean r0 = r3.A0A
            X.AnonymousClass97V.A00(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3RF.BYP(java.lang.String, android.os.Bundle):void");
    }
}
