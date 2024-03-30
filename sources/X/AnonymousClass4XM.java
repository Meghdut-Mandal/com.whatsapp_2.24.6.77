package X;

import android.content.DialogInterface;

/* renamed from: X.4XM  reason: invalid class name */
public class AnonymousClass4XM implements DialogInterface.OnClickListener {
    public Object A00;
    public final int A01;

    public AnonymousClass4XM(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03cb, code lost:
        r0 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03cd, code lost:
        X.AnonymousClass3SJ.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03d0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0154, code lost:
        r0.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0157, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0232, code lost:
        r4.A0w.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0237, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0251, code lost:
        r7.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0254, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0277, code lost:
        r0.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x027a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r7, int r8) {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 1: goto L_0x0072;
                case 2: goto L_0x0005;
                case 3: goto L_0x009a;
                case 4: goto L_0x00b2;
                case 5: goto L_0x00c6;
                case 6: goto L_0x0273;
                case 7: goto L_0x00d0;
                case 8: goto L_0x0102;
                case 9: goto L_0x0111;
                case 10: goto L_0x011b;
                case 11: goto L_0x012a;
                case 12: goto L_0x0135;
                case 13: goto L_0x013f;
                case 14: goto L_0x0158;
                case 15: goto L_0x016a;
                case 16: goto L_0x0175;
                case 17: goto L_0x0183;
                case 18: goto L_0x01a6;
                case 19: goto L_0x000d;
                case 20: goto L_0x01b7;
                case 21: goto L_0x01c0;
                case 22: goto L_0x01fc;
                case 23: goto L_0x0205;
                case 24: goto L_0x0238;
                case 25: goto L_0x0240;
                case 26: goto L_0x0021;
                case 27: goto L_0x0255;
                case 28: goto L_0x0273;
                case 29: goto L_0x003c;
                case 30: goto L_0x027b;
                case 31: goto L_0x0287;
                case 32: goto L_0x029f;
                case 33: goto L_0x0005;
                case 34: goto L_0x004d;
                case 35: goto L_0x02b7;
                case 36: goto L_0x02d1;
                case 37: goto L_0x02e1;
                case 38: goto L_0x0308;
                case 39: goto L_0x0313;
                case 40: goto L_0x0324;
                case 41: goto L_0x032c;
                case 42: goto L_0x0338;
                case 43: goto L_0x034c;
                case 44: goto L_0x0353;
                case 45: goto L_0x035b;
                case 46: goto L_0x0364;
                case 47: goto L_0x03a3;
                case 48: goto L_0x03ac;
                case 49: goto L_0x03b5;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r6.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1b()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r2 = r6.A00
            com.whatsapp.contact.picker.ContactPickerFragment r2 = (com.whatsapp.contact.picker.ContactPickerFragment) r2
            X.01I r1 = r2.A0h()
            r0 = 1
            X.AnonymousClass3SJ.A00(r1, r0)
            X.0V9 r0 = r2.A0E
            if (r0 == 0) goto L_0x000c
            r0.A05()
            return
        L_0x0021:
            java.lang.Object r0 = r6.A00
            X.02E r0 = (X.AnonymousClass02E) r0
            X.02E r1 = r0.A0I
            if (r1 == 0) goto L_0x000c
            com.whatsapp.contact.picker.ContactPickerFragment r1 = (com.whatsapp.contact.picker.ContactPickerFragment) r1
            boolean r0 = r1 instanceof com.whatsapp.contact.picker.VoipContactPickerFragment
            if (r0 == 0) goto L_0x000c
            com.whatsapp.contact.picker.VoipContactPickerFragment r1 = (com.whatsapp.contact.picker.VoipContactPickerFragment) r1
            X.6W1 r2 = r1.A26()
            X.0wk r1 = r2.A03
            r0 = 2
            X.C80223v3.A01(r1, r2, r0)
            return
        L_0x003c:
            java.lang.Object r0 = r6.A00
            com.whatsapp.conversation.CapturePictureOrVideoDialogFragment r0 = (com.whatsapp.conversation.CapturePictureOrVideoDialogFragment) r0
            X.4T1 r1 = r0.A00
            if (r1 == 0) goto L_0x000c
            if (r8 == 0) goto L_0x03d1
            r0 = 1
            if (r8 != r0) goto L_0x000c
            r1.BeM()
            return
        L_0x004d:
            java.lang.Object r0 = r6.A00
            X.01I r5 = X.C36441kJ.A0X(r0)
            boolean r0 = r5 instanceof com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity
            if (r0 == 0) goto L_0x000c
            com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity r5 = (com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity) r5
            r0 = 2131893491(0x7f121cf3, float:1.942176E38)
            r5.Bu1(r0)
            X.0wU r4 = r5.A04
            X.3fI r0 = r5.A00
            X.196 r3 = r0.A0A
            X.1NO r2 = r5.A04
            X.11F r1 = r5.A0F
            X.2jD r0 = new X.2jD
            r0.<init>(r3, r5, r2, r1)
            X.C36331k8.A1F(r0, r4)
            return
        L_0x0072:
            java.lang.Object r4 = r6.A00
            com.whatsapp.community.deactivate.DeactivateCommunityConfirmationFragment r4 = (com.whatsapp.community.deactivate.DeactivateCommunityConfirmationFragment) r4
            X.4Nr r3 = r4.A00
            if (r3 != 0) goto L_0x0081
            java.lang.String r0 = "deactivateClickListener"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0081:
            com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity r3 = (com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity) r3
            r0 = 2131888626(0x7f1209f2, float:1.9411893E38)
            r3.Bu1(r0)
            androidx.lifecycle.LifecycleCoroutineScopeImpl r2 = X.C33311f5.A00(r3)
            r1 = 0
            com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity$onDeactivateClicked$1 r0 = new com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity$onDeactivateClicked$1
            r0.<init>(r3, r1)
            X.C36331k8.A1T(r0, r2)
            r4.A1b()
            return
        L_0x009a:
            java.lang.Object r3 = r6.A00
            X.14p r3 = (X.C224914p) r3
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            r0 = 100
            r3.startActivityForResult(r1, r0)
            return
        L_0x00b2:
            java.lang.Object r0 = r6.A00
            com.whatsapp.companiondevice.WifiSpeedBumpDialogFragment r0 = (com.whatsapp.companiondevice.WifiSpeedBumpDialogFragment) r0
            X.30w r0 = r0.A00
            X.3H6 r0 = r0.A00
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r1 = r0.A02
            com.whatsapp.deviceauth.BiometricAuthPlugin r0 = r0.A04
            boolean r0 = r0.A05()
            r1.A0V(r0)
            return
        L_0x00c6:
            java.lang.Object r0 = r6.A00
            com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity r0 = (com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity) r0
            X.1tz r0 = r0.A05
            X.C39861tz.A01(r0)
            return
        L_0x00d0:
            java.lang.Object r2 = r6.A00
            com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity r2 = (com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity) r2
            r0 = 1
            X.AnonymousClass00C.A0D(r7, r0)
            r0 = 0
            r2.A06 = r0
            android.widget.ProgressBar r1 = r2.A01
            if (r1 != 0) goto L_0x00e6
            java.lang.String r0 = "loadingSpinner"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00e6:
            r0 = 0
            r1.setVisibility(r0)
            android.widget.LinearLayout r1 = r2.A00
            if (r1 != 0) goto L_0x00f5
            java.lang.String r0 = "codeInputBoxesLinearLayout"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00f5:
            r0 = 4
            r1.setVisibility(r0)
            X.0wU r1 = r2.A04
            r0 = 19
            X.C80213v2.A01(r1, r2, r0)
            goto L_0x0251
        L_0x0102:
            java.lang.Object r1 = r6.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r7.dismiss()
            r0 = 0
            r1.setResult(r0)
            r1.finish()
            return
        L_0x0111:
            java.lang.Object r0 = r6.A00
            com.whatsapp.contact.contactform.ContactFormActivity r0 = (com.whatsapp.contact.contactform.ContactFormActivity) r0
            r7.dismiss()
            X.3Kb r0 = r0.A0A
            goto L_0x0154
        L_0x011b:
            java.lang.Object r2 = r6.A00
            X.14p r2 = (X.C224914p) r2
            r7.dismiss()
            X.0wU r1 = r2.A04
            r0 = 28
            X.C80213v2.A01(r1, r2, r0)
            return
        L_0x012a:
            java.lang.Object r0 = r6.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r7.dismiss()
            r0.A1c()
            return
        L_0x0135:
            java.lang.Object r0 = r6.A00
            com.whatsapp.contact.contactform.ContactFormBottomSheetFragment r0 = (com.whatsapp.contact.contactform.ContactFormBottomSheetFragment) r0
            r7.dismiss()
            X.3Kb r0 = r0.A0C
            goto L_0x0154
        L_0x013f:
            java.lang.Object r1 = r6.A00
            X.3EO r1 = (X.AnonymousClass3EO) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r7, r0)
            r7.dismiss()
            X.3F1 r0 = r1.A02
            if (r0 == 0) goto L_0x0152
            r0.A00()
            return
        L_0x0152:
            X.3Kb r0 = r1.A01
        L_0x0154:
            r0.A01()
            return
        L_0x0158:
            java.lang.Object r0 = r6.A00
            X.3EO r0 = (X.AnonymousClass3EO) r0
            boolean r1 = X.C36371kC.A1V(r7)
            r7.dismiss()
            android.app.Activity r0 = r0.A00
            r0.setResult(r1)
            goto L_0x0277
        L_0x016a:
            java.lang.Object r1 = r6.A00
            X.3B5 r1 = (X.AnonymousClass3B5) r1
            android.accounts.Account[] r0 = r1.A01
            r0 = r0[r8]
            r1.A00 = r0
            return
        L_0x0175:
            java.lang.Object r0 = r6.A00
            X.3B5 r0 = (X.AnonymousClass3B5) r0
            android.widget.EditText r1 = r0.A03
            android.accounts.Account r0 = r0.A00
            java.lang.String r0 = r0.name
            r1.setText(r0)
            return
        L_0x0183:
            java.lang.Object r0 = r6.A00
            com.whatsapp.contact.picker.AddGroupParticipantsSelector r0 = (com.whatsapp.contact.picker.AddGroupParticipantsSelector) r0
            r4 = 0
            X.AnonymousClass00C.A0D(r0, r4)
            X.00T r0 = r0.A0W
            java.lang.Object r0 = r0.getValue()
            X.1tC r0 = (X.C39661tC) r0
            X.05L r3 = r0.A07
        L_0x0195:
            java.lang.Object r2 = r3.getValue()
            r1 = 0
            X.3Pz r0 = new X.3Pz
            r0.<init>(r1, r1, r4)
            boolean r0 = r3.B3B(r2, r0)
            if (r0 == 0) goto L_0x0195
            return
        L_0x01a6:
            java.lang.Object r2 = r6.A00
            com.whatsapp.contact.picker.ContactPickerFragment r2 = (com.whatsapp.contact.picker.ContactPickerFragment) r2
            X.01I r1 = r2.A0h()
            r0 = 1
            X.AnonymousClass3SJ.A00(r1, r0)
            r0 = 0
            com.whatsapp.contact.picker.ContactPickerFragment.A0I(r2, r0)
            return
        L_0x01b7:
            java.lang.Object r0 = r6.A00
            X.01I r1 = X.C36441kJ.A0X(r0)
            r0 = 2
            goto L_0x03cd
        L_0x01c0:
            java.lang.Object r4 = r6.A00
            com.whatsapp.contact.picker.ContactPickerFragment r4 = (com.whatsapp.contact.picker.ContactPickerFragment) r4
            android.content.Intent r3 = X.C36431kI.A0D()
            r2 = 1
            java.util.ArrayList r1 = X.C36441kJ.A14(r2)
            X.141 r0 = r4.A1Y
            java.lang.String r0 = X.C36351kA.A0y(r0)
            r1.add(r0)
            java.lang.String r0 = "jids"
            r3.putStringArrayListExtra(r0, r1)
            android.os.Bundle r0 = r4.A1Z()
            java.lang.String r1 = "file_path"
            java.lang.String r0 = r0.getString(r1)
            r3.putExtra(r1, r0)
            X.3cN r0 = r4.A0w
            r0.A03(r3)
            X.01I r1 = r4.A0h()
            r0 = 2
            X.AnonymousClass3SJ.A00(r1, r0)
            X.3Cy r1 = r4.A2D
            r0 = 0
            r1.A00(r0, r2)
            goto L_0x0232
        L_0x01fc:
            java.lang.Object r0 = r6.A00
            X.01I r1 = X.C36441kJ.A0X(r0)
            r0 = 3
            goto L_0x03cd
        L_0x0205:
            java.lang.Object r4 = r6.A00
            com.whatsapp.contact.picker.ContactPickerFragment r4 = (com.whatsapp.contact.picker.ContactPickerFragment) r4
            android.content.Intent r3 = X.C36431kI.A0D()
            X.141 r0 = r4.A1Y
            java.lang.String r1 = X.C36351kA.A0y(r0)
            java.lang.String r0 = "contact"
            r3.putExtra(r0, r1)
            android.os.Bundle r0 = r4.A1Z()
            java.lang.String r2 = "message_row_id"
            long r0 = r0.getLong(r2)
            r3.putExtra(r2, r0)
            X.3cN r0 = r4.A0w
            r0.A03(r3)
            X.01I r1 = r4.A0h()
            r0 = 3
            X.AnonymousClass3SJ.A00(r1, r0)
        L_0x0232:
            X.3cN r0 = r4.A0w
            r0.A02()
            return
        L_0x0238:
            java.lang.Object r0 = r6.A00
            X.2iG r0 = (X.C48912iG) r0
            r0.A03()
            return
        L_0x0240:
            java.lang.Object r0 = r6.A00
            X.0v0 r0 = (X.C19420v0) r0
            r2 = 1
            X.AnonymousClass00C.A0D(r7, r2)
            android.content.SharedPreferences$Editor r1 = X.C36331k8.A05(r0)
            java.lang.String r0 = "forward_with_captions_nux_shown"
            X.C36331k8.A0w(r1, r0, r2)
        L_0x0251:
            r7.dismiss()
            return
        L_0x0255:
            java.lang.Object r3 = r6.A00
            com.whatsapp.contact.picker.nativecontacts.NativeContactsOptInActivity r3 = (com.whatsapp.contact.picker.nativecontacts.NativeContactsOptInActivity) r3
            X.190 r0 = r3.A00
            if (r0 == 0) goto L_0x026e
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.contact.picker.nativecontacts.NativeContactsMultipleContactPicker"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x026e:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x0273:
            java.lang.Object r0 = r6.A00
            android.app.Activity r0 = (android.app.Activity) r0
        L_0x0277:
            r0.finish()
            return
        L_0x027b:
            java.lang.Object r0 = r6.A00
            X.2iG r0 = (X.C48912iG) r0
            java.lang.Object r0 = r0.A00
            com.whatsapp.conversation.ConversationAttachmentContentView r0 = (com.whatsapp.conversation.ConversationAttachmentContentView) r0
            r0.A09()
            return
        L_0x0287:
            java.lang.Object r2 = r6.A00
            com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment r2 = (com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment) r2
            r0 = 1
            X.2QH r1 = r2.A05
            if (r1 == 0) goto L_0x029b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            X.0yW r0 = r2.A04
            r0.Bly(r1)
        L_0x029b:
            r2.A1b()
            return
        L_0x029f:
            java.lang.Object r2 = r6.A00
            com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment r2 = (com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment) r2
            r0 = 1
            X.2QH r1 = r2.A0A
            if (r1 == 0) goto L_0x02b3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            X.0yW r0 = r2.A09
            r0.Bly(r1)
        L_0x02b3:
            r2.A1c()
            return
        L_0x02b7:
            java.lang.Object r3 = r6.A00
            X.3fk r3 = (X.C70803fk) r3
            X.0xT r1 = r3.A53
            java.lang.String r0 = "6614640168569481"
            android.net.Uri r0 = r1.A02(r0)
            android.content.Intent r2 = X.C36381kD.A0F(r0)
            X.1Dv r1 = r3.A0w
            X.155 r0 = X.C70803fk.A0C(r3)
            r1.A06(r0, r2)
            return
        L_0x02d1:
            java.lang.Object r0 = r6.A00
            X.3fk r0 = (X.C70803fk) r0
            X.1fs r2 = r0.A2O
            X.155 r1 = X.C70803fk.A0C(r0)
            java.lang.String r0 = "channels_update_edit"
            r2.A01(r1, r0)
            return
        L_0x02e1:
            java.lang.Object r2 = r6.A00
            X.3fk r2 = (X.C70803fk) r2
            X.1E4 r1 = r2.A57
            r0 = 1
            r1.A01(r0)
            X.4V6 r4 = r2.A2l
            X.155 r0 = r4.getActivityNullable()
            r3 = 0
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.greenalert.GreenAlertActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "page"
            r2.putExtra(r0, r3)
            r4.startActivity(r2)
            return
        L_0x0308:
            java.lang.Object r0 = r6.A00
            X.3fk r0 = (X.C70803fk) r0
            X.1E4 r1 = r0.A57
            r0 = 2
            r1.A01(r0)
            return
        L_0x0313:
            java.lang.Object r1 = r6.A00
            com.whatsapp.deeplink.DeepLinkActivity r1 = (com.whatsapp.deeplink.DeepLinkActivity) r1
            X.1fu r0 = r1.A0C
            android.net.Uri r0 = r0.A00()
            X.C36371kC.A1A(r0, r1)
            X.C36351kA.A11(r1)
            return
        L_0x0324:
            java.lang.Object r0 = r6.A00
            android.app.Activity r0 = (android.app.Activity) r0
            X.C36351kA.A11(r0)
            return
        L_0x032c:
            java.lang.Object r1 = r6.A00
            android.content.Context r1 = (android.content.Context) r1
            android.content.Intent r0 = X.AnonymousClass190.A09(r1)
            r1.startActivity(r0)
            return
        L_0x0338:
            java.lang.Object r0 = r6.A00
            X.28b r0 = (X.AnonymousClass28b) r0
            X.01L r1 = r0.A03
            java.lang.String r0 = "android.settings.LOCATION_SOURCE_SETTINGS"
            android.content.Intent r0 = X.C36441kJ.A0I(r0)
            r1.startActivity(r0)
            r0 = 2
            X.AnonymousClass3SJ.A00(r1, r0)
            return
        L_0x034c:
            java.lang.Object r0 = r6.A00
            X.28b r0 = (X.AnonymousClass28b) r0
            X.01L r1 = r0.A03
            goto L_0x03cb
        L_0x0353:
            java.lang.Object r0 = r6.A00
            X.28b r0 = (X.AnonymousClass28b) r0
            X.01L r1 = r0.A03
            r0 = 7
            goto L_0x03cd
        L_0x035b:
            java.lang.Object r0 = r6.A00
            X.28b r0 = (X.AnonymousClass28b) r0
            X.01L r1 = r0.A03
            r0 = 8
            goto L_0x03cd
        L_0x0364:
            java.lang.Object r4 = r6.A00
            X.28b r4 = (X.AnonymousClass28b) r4
            X.01L r3 = r4.A03
            r0 = 9
            X.AnonymousClass3SJ.A00(r3, r0)
            X.1A5 r1 = r4.A0I
            X.11F r0 = r4.A0Z
            X.141 r0 = r1.A01(r0)
            X.11F r0 = X.C36351kA.A0j(r0)
            java.lang.String r2 = X.AnonymousClass3U8.A04(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "tel:"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)
            android.net.Uri r2 = android.net.Uri.parse(r0)
            java.lang.String r1 = "android.intent.action.DIAL"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1, r2)
            r3.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x0398 }
            goto L_0x03a2
        L_0x0398:
            X.17Y r2 = r4.A06
            r1 = 2131886365(0x7f12011d, float:1.9407307E38)
            r0 = 0
            r2.A06(r1, r0)
            return
        L_0x03a2:
            return
        L_0x03a3:
            java.lang.Object r0 = r6.A00
            X.28b r0 = (X.AnonymousClass28b) r0
            X.01L r1 = r0.A03
            r0 = 9
            goto L_0x03cd
        L_0x03ac:
            java.lang.Object r0 = r6.A00
            X.28b r0 = (X.AnonymousClass28b) r0
            X.01L r1 = r0.A03
            r0 = 12
            goto L_0x03cd
        L_0x03b5:
            java.lang.Object r3 = r6.A00
            X.28b r3 = (X.AnonymousClass28b) r3
            X.4UR r2 = r3.A0M
            X.4Yf r2 = (X.C89874Yf) r2
            int r0 = r2.A01
            if (r0 == 0) goto L_0x03c9
            r1 = 1
            java.lang.Object r0 = r2.A00
            X.3fk r0 = (X.C70803fk) r0
            r0.A2Z(r1)
        L_0x03c9:
            X.01L r1 = r3.A03
        L_0x03cb:
            r0 = 17
        L_0x03cd:
            X.AnonymousClass3SJ.A00(r1, r0)
            return
        L_0x03d1:
            r1.Bix()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XM.onClick(android.content.DialogInterface, int):void");
    }
}
