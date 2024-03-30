package X;

import android.view.View;

/* renamed from: X.3Xw  reason: invalid class name and case insensitive filesystem */
public class C66933Xw implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C66933Xw(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C66933Xw(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.whatsapp.community.CommunityNUXActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: com.whatsapp.chatinfo.ContactInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v71, resolved type: com.whatsapp.community.CommunityNUXActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v72, resolved type: com.whatsapp.community.CommunityNUXActivity} */
    /* JADX WARNING: type inference failed for: r4v10, types: [X.0FI, X.21S] */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04b1, code lost:
        r1.A01(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04b4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0518, code lost:
        X.C36381kD.A1G(r0, r1);
        r2.Btm(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x051e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05b7, code lost:
        r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05ba, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x05ea, code lost:
        r4.A0b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05ed, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r3.startActivityForResult(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01b0, code lost:
        r3.Bua(r5, r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01b3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01b9, code lost:
        r1.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01bc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0268, code lost:
        r2.A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x026b, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            int r0 = r9.A01
            switch(r0) {
                case 0: goto L_0x00ff;
                case 1: goto L_0x0143;
                case 2: goto L_0x017d;
                case 3: goto L_0x01bd;
                case 4: goto L_0x05b1;
                case 5: goto L_0x0013;
                case 6: goto L_0x01c7;
                case 7: goto L_0x01cf;
                case 8: goto L_0x01d8;
                case 9: goto L_0x0217;
                case 10: goto L_0x0037;
                case 11: goto L_0x0057;
                case 12: goto L_0x0250;
                case 13: goto L_0x025d;
                case 14: goto L_0x0072;
                case 15: goto L_0x026c;
                case 16: goto L_0x0274;
                case 17: goto L_0x02d4;
                case 18: goto L_0x0353;
                case 19: goto L_0x03b2;
                case 20: goto L_0x03b8;
                case 21: goto L_0x03c0;
                case 22: goto L_0x008f;
                case 23: goto L_0x03c8;
                case 24: goto L_0x0005;
                case 25: goto L_0x0005;
                case 26: goto L_0x03ee;
                case 27: goto L_0x040a;
                case 28: goto L_0x00b1;
                case 29: goto L_0x0441;
                case 30: goto L_0x04eb;
                case 31: goto L_0x00df;
                case 32: goto L_0x0460;
                case 33: goto L_0x046c;
                case 34: goto L_0x04a1;
                case 35: goto L_0x04a9;
                case 36: goto L_0x04b5;
                case 37: goto L_0x04c2;
                case 38: goto L_0x04eb;
                case 39: goto L_0x04f1;
                case 40: goto L_0x0505;
                case 41: goto L_0x051f;
                case 42: goto L_0x052b;
                case 43: goto L_0x055b;
                case 44: goto L_0x058e;
                case 45: goto L_0x0596;
                case 46: goto L_0x059e;
                case 47: goto L_0x05bb;
                case 48: goto L_0x05c3;
                case 49: goto L_0x05ee;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r9.A00
            X.14p r3 = (X.C224914p) r3
            r0 = 2
            android.content.Intent r2 = X.C36381kD.A0D(r3, r0)
            r0 = 0
        L_0x000f:
            r3.startActivityForResult(r2, r0)
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r2 = r9.A00
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            X.142 r0 = X.C36431kI.A0V(r2)
            if (r0 == 0) goto L_0x0012
            X.11F r0 = X.C36351kA.A0j(r0)
            java.lang.String r1 = X.AnonymousClass3U8.A04(r0)
            if (r1 == 0) goto L_0x0012
            X.141 r0 = r2.A0z
            boolean r0 = r0.A0C()
            com.whatsapp.chatinfo.view.custom.PhoneNumberSharedBottomSheet r1 = X.C53482rO.A00(r1, r0)
            java.lang.String r0 = "SharePhoneNumberBottomSheet"
            r2.Btl(r1, r0)
            return
        L_0x0037:
            java.lang.Object r2 = r9.A00
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard r2 = (com.whatsapp.chatinfo.view.custom.ContactDetailsCard) r2
            X.141 r0 = r2.A0O
            if (r0 == 0) goto L_0x0012
            android.os.Bundle r0 = X.AnonymousClass001.A07()
            com.whatsapp.dialogs.AudioVideoBottomSheetDialogFragment r1 = new com.whatsapp.dialogs.AudioVideoBottomSheetDialogFragment
            r1.<init>()
            r1.A17(r0)
            android.app.Activity r0 = X.C36391kE.A0E(r2)
            X.14u r0 = (X.C225314u) r0
            if (r0 == 0) goto L_0x0012
            r0.Btm(r1)
            return
        L_0x0057:
            java.lang.Object r1 = r9.A00
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard r1 = (com.whatsapp.chatinfo.view.custom.ContactDetailsCard) r1
            X.9ea r2 = r1.A0T
            if (r2 == 0) goto L_0x0012
            X.141 r0 = r1.A0O
            if (r0 == 0) goto L_0x0012
            com.whatsapp.jid.UserJid r3 = X.C36391kE.A0i(r0)
            r4 = 0
            int r7 = r1.A00
            r8 = 1
            java.lang.String r6 = "contact_card"
            r5 = r4
            r2.A01(r3, r4, r5, r6, r7, r8)
            return
        L_0x0072:
            java.lang.Object r1 = r9.A00
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard r1 = (com.whatsapp.chatinfo.view.custom.ContactDetailsCard) r1
            com.whatsapp.pnh.RequestPhoneNumberViewModel r0 = r1.A0X
            if (r0 == 0) goto L_0x0012
            X.3Kp r2 = r1.A0W
            if (r2 == 0) goto L_0x0012
            X.141 r0 = r1.A0O
            if (r0 == 0) goto L_0x0012
            X.11F r1 = r0.A0H
            boolean r0 = r1 instanceof X.C223313w
            if (r0 == 0) goto L_0x0012
            X.13w r1 = (X.C223313w) r1
            r0 = 2
            r2.A02(r1, r0)
            return
        L_0x008f:
            java.lang.Object r3 = r9.A00
            com.whatsapp.chatlock.ChatLockSettingsActivity r3 = (com.whatsapp.chatlock.ChatLockSettingsActivity) r3
            X.18z r0 = r3.A3i()
            boolean r0 = X.C36401kF.A1W(r0)
            if (r0 != 0) goto L_0x0602
            X.190 r0 = r3.A06
            if (r0 == 0) goto L_0x05fd
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.chatlock.HideLockedChatsActivity"
            r2.setClassName(r1, r0)
            r0 = 2
            goto L_0x000f
        L_0x00b1:
            java.lang.Object r7 = r9.A00
            com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet r7 = (com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet) r7
            X.37p r1 = r7.A01
            if (r1 == 0) goto L_0x0012
            java.lang.String r6 = r7.A03
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            X.3ty r5 = new X.3ty
            r5.<init>()
            X.3eJ r4 = r1.A03
            X.005 r0 = r4.A03
            java.lang.Object r3 = r0.get()
            X.3Kr r3 = (X.C63603Kr) r3
            X.4PZ r2 = r1.A02
            X.155 r1 = r1.A01
            X.4Mi r0 = new X.4Mi
            r0.<init>(r1, r5, r2, r4)
            r3.A01(r6, r0)
            r0 = 1
            X.C79593ty.A00(r5, r7, r0)
            return
        L_0x00df:
            java.lang.Object r3 = r9.A00
            com.whatsapp.community.CommunityHomeActivity r3 = (com.whatsapp.community.CommunityHomeActivity) r3
            boolean r0 = r3.A0v
            if (r0 != 0) goto L_0x0012
            X.17X r1 = r3.A0a
            X.147 r0 = r3.A0l
            boolean r0 = r1.A0D(r0)
            if (r0 == 0) goto L_0x062a
            android.content.Context r1 = r10.getContext()
            X.147 r0 = r3.A0l
            android.content.Intent r2 = X.C36401kF.A06(r1, r0)
            r0 = 123(0x7b, float:1.72E-43)
            goto L_0x000f
        L_0x00ff:
            java.lang.Object r3 = r9.A00
            com.whatsapp.chatinfo.ContactInfoActivity r3 = (com.whatsapp.chatinfo.ContactInfoActivity) r3
            X.2EI r5 = r3.A0h
            java.lang.Integer r4 = r3.A1a
            boolean r2 = com.whatsapp.chatinfo.ContactInfoActivity.A1B(r3)
            boolean r1 = com.whatsapp.chatinfo.ContactInfoActivity.A19(r3)
            r0 = 9
            r5.A0W(r4, r0, r2, r1)
            X.2EI r2 = r3.A0h
            X.9uI r1 = r3.A0S
            r0 = 1
            r2.A0V(r1, r0)
            android.content.Context r1 = r3.getApplicationContext()
            r0 = 0
            android.content.Intent r2 = X.AnonymousClass190.A0F(r1, r0)
            X.141 r0 = r3.A0z
            com.whatsapp.jid.UserJid r0 = X.C36351kA.A0k(r0)
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "jid"
            android.content.Intent r1 = r2.putExtra(r0, r1)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            android.content.Intent r2 = r1.addFlags(r0)
            X.1Dv r1 = r3.A01
            java.lang.String r0 = "ContactInfoActivity"
            r1.A08(r3, r2, r0)
            return
        L_0x0143:
            java.lang.Object r5 = r9.A00
            com.whatsapp.chatinfo.ContactInfoActivity r5 = (com.whatsapp.chatinfo.ContactInfoActivity) r5
            X.3Kp r1 = com.whatsapp.chatinfo.ContactInfoActivity.A0v(r5)
            X.141 r0 = r5.A0z
            com.whatsapp.jid.UserJid r0 = X.C36351kA.A0k(r0)
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x0177
            X.2EI r4 = r5.A0h
            r3 = 10
            java.lang.Integer r2 = r5.A1a
            boolean r1 = com.whatsapp.chatinfo.ContactInfoActivity.A1B(r5)
            boolean r0 = com.whatsapp.chatinfo.ContactInfoActivity.A19(r5)
            r4.A0W(r2, r3, r1, r0)
            X.2EI r2 = r5.A0h
            r1 = 2
            X.9uI r0 = r5.A0S
            r2.A0V(r0, r1)
            X.1ND r3 = r5.A0Z
            X.141 r2 = r5.A0z
            r1 = 6
            r0 = 0
            goto L_0x01b0
        L_0x0177:
            X.3Kp r1 = com.whatsapp.chatinfo.ContactInfoActivity.A0v(r5)
            r0 = 3
            goto L_0x01b9
        L_0x017d:
            java.lang.Object r5 = r9.A00
            com.whatsapp.chatinfo.ContactInfoActivity r5 = (com.whatsapp.chatinfo.ContactInfoActivity) r5
            X.3Kp r1 = com.whatsapp.chatinfo.ContactInfoActivity.A0v(r5)
            X.141 r0 = r5.A0z
            com.whatsapp.jid.UserJid r0 = X.C36351kA.A0k(r0)
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x01b4
            X.2EI r4 = r5.A0h
            r3 = 11
            java.lang.Integer r2 = r5.A1a
            boolean r1 = com.whatsapp.chatinfo.ContactInfoActivity.A1B(r5)
            boolean r0 = com.whatsapp.chatinfo.ContactInfoActivity.A19(r5)
            r4.A0W(r2, r3, r1, r0)
            X.2EI r2 = r5.A0h
            r1 = 3
            X.9uI r0 = r5.A0S
            r2.A0V(r0, r1)
            X.1ND r3 = r5.A0Z
            X.141 r2 = r5.A0z
            r1 = 6
            r0 = 1
        L_0x01b0:
            r3.Bua(r5, r2, r1, r0)
            return
        L_0x01b4:
            X.3Kp r1 = com.whatsapp.chatinfo.ContactInfoActivity.A0v(r5)
            r0 = 4
        L_0x01b9:
            r1.A00(r0)
            return
        L_0x01bd:
            java.lang.Object r2 = r9.A00
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            X.1fs r1 = r2.A0q
            java.lang.String r0 = "managing-ai-chats-with-third_party"
            goto L_0x04b1
        L_0x01c7:
            java.lang.Object r0 = r9.A00
            com.whatsapp.chatinfo.ListChatInfoActivity r0 = (com.whatsapp.chatinfo.ListChatInfoActivity) r0
            com.whatsapp.chatinfo.ListChatInfoActivity.A0x(r0)
            return
        L_0x01cf:
            java.lang.Object r1 = r9.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2
            X.AnonymousClass3SJ.A01(r1, r0)
            return
        L_0x01d8:
            java.lang.Object r5 = r9.A00
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard r5 = (com.whatsapp.chatinfo.view.custom.ContactDetailsCard) r5
            X.3Pt r1 = r5.A0Y
            r0 = 6
            r1.A02(r0)
            X.141 r0 = r5.A0O
            X.11F r2 = X.C36351kA.A0j(r0)
            X.190 r1 = X.C36441kJ.A0j()
            android.content.Context r0 = r5.getContext()
            android.content.Intent r4 = X.C36391kE.A0F(r0, r1, r2)
            if (r2 == 0) goto L_0x0204
            X.18z r0 = r5.A0K
            boolean r0 = r0.A0P(r2)
            if (r0 == 0) goto L_0x0204
            r1 = 4
            java.lang.String r0 = "chatlockEntryPoint"
            r4.putExtra(r0, r1)
        L_0x0204:
            X.1Dv r3 = r5.A0C
            android.content.Context r2 = r5.getContext()
            r1 = 1
            java.lang.String r0 = "args_conversation_screen_entry_point"
            android.content.Intent r1 = r4.putExtra(r0, r1)
            java.lang.String r0 = "ContactInfo"
            r3.A08(r2, r1, r0)
            return
        L_0x0217:
            java.lang.Object r6 = r9.A00
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard r6 = (com.whatsapp.chatinfo.view.custom.ContactDetailsCard) r6
            X.2Sj r1 = r6.A0R
            r5 = 1
            if (r1 == 0) goto L_0x0226
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1.A09 = r0
        L_0x0226:
            X.1Dv r4 = r6.A0C
            android.content.Context r3 = r6.getContext()
            X.190 r2 = X.C36441kJ.A0j()
            android.content.Context r1 = r6.getContext()
            X.141 r0 = r6.A0O
            X.11F r0 = X.C36351kA.A0j(r0)
            android.content.Intent r1 = X.C36391kE.A0F(r1, r2, r0)
            java.lang.String r0 = "args_conversation_screen_entry_point"
            android.content.Intent r1 = r1.putExtra(r0, r5)
            java.lang.String r0 = "extra_show_search_on_create"
            android.content.Intent r1 = r1.putExtra(r0, r5)
            java.lang.String r0 = "ContactInfo"
            r4.A08(r3, r1, r0)
            return
        L_0x0250:
            java.lang.Object r2 = r9.A00
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard r2 = (com.whatsapp.chatinfo.view.custom.ContactDetailsCard) r2
            X.3Pt r1 = r2.A0Y
            r0 = 8
            r1.A02(r0)
            r0 = 0
            goto L_0x0268
        L_0x025d:
            java.lang.Object r2 = r9.A00
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard r2 = (com.whatsapp.chatinfo.view.custom.ContactDetailsCard) r2
            X.3Pt r1 = r2.A0Y
            r0 = 7
            r1.A02(r0)
            r0 = 1
        L_0x0268:
            r2.A04(r0)
            return
        L_0x026c:
            java.lang.Object r0 = r9.A00
            com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard r0 = (com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard) r0
            com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard.setupMVEducationIfNeeded$lambda$2(r0, r10)
            return
        L_0x0274:
            java.lang.Object r2 = r9.A00
            com.whatsapp.chatlock.ChatLockConfirmSecretCodeActivity r2 = (com.whatsapp.chatlock.ChatLockConfirmSecretCodeActivity) r2
            java.lang.String r0 = r2.A03
            java.lang.String r1 = "correctSecretCode"
            if (r0 != 0) goto L_0x0283
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x0283:
            int r0 = r0.length()
            X.3Kr r6 = r2.A3j()
            if (r0 <= 0) goto L_0x02c7
            java.lang.String r5 = r2.A03
            if (r5 != 0) goto L_0x0296
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x0296:
            java.lang.String r1 = r2.A3l()
            X.4Io r4 = new X.4Io
            r4.<init>(r2)
            java.lang.String r0 = "ChatLockPasscodeManager/setPasscode"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r5.equals(r1)
            if (r0 != 0) goto L_0x02b9
            java.lang.String r0 = "ChatLockPasscodeManager/setPasscode: Passcodes don't match"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 3
            X.2Ea r0 = new X.2Ea
            r0.<init>(r1)
            r4.invoke(r0)
            return
        L_0x02b9:
            X.040 r3 = r6.A06
            X.02l r2 = r6.A05
            r1 = 0
            com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$setPasscode$1 r0 = new com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$setPasscode$1
            r0.<init>(r6, r5, r1, r4)
            X.C36381kD.A1R(r2, r0, r3)
            return
        L_0x02c7:
            java.lang.String r1 = r2.A3l()
            X.4Io r0 = new X.4Io
            r0.<init>(r2)
            r6.A01(r1, r0)
            return
        L_0x02d4:
            java.lang.Object r4 = r9.A00
            X.24b r4 = (X.AnonymousClass24b) r4
            r3 = 0
            X.3Kr r1 = r4.A3j()
            java.lang.String r0 = r4.A3l()
            X.2rS r1 = r1.A00(r0)
            boolean r0 = r1 instanceof X.AnonymousClass2Ec
            if (r0 == 0) goto L_0x0321
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r7 = "entrypoint"
            r2 = 0
            int r1 = r0.getIntExtra(r7, r3)
            r0 = 2
            r6 = 1
            if (r1 != r0) goto L_0x02f9
            r2 = 1
        L_0x02f9:
            java.lang.String r5 = r4.A3l()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.chatlock.ChatLockConfirmSecretCodeActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "extra_secret_code"
            r2.putExtra(r0, r5)
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L_0x031d
            r0 = 2
            r2.putExtra(r7, r0)
        L_0x031d:
            r4.startActivityForResult(r2, r6)
            return
        L_0x0321:
            boolean r0 = r1 instanceof X.AnonymousClass2Ea
            if (r0 == 0) goto L_0x0344
            com.google.android.material.textfield.TextInputLayout r3 = r4.A3i()
            X.2Ea r1 = (X.AnonymousClass2Ea) r1
            int r2 = r1.A00
            r0 = 5
            r1 = 2131888539(0x7f12099b, float:1.9411716E38)
            if (r2 == r0) goto L_0x033c
            r0 = 6
            r1 = 2131888538(0x7f12099a, float:1.9411714E38)
            if (r2 == r0) goto L_0x033c
            r1 = 2131888537(0x7f120999, float:1.9411712E38)
        L_0x033c:
            java.lang.String r0 = r4.getString(r1)
            r3.setError(r0)
            return
        L_0x0344:
            com.google.android.material.textfield.TextInputLayout r1 = r4.A3i()
            r0 = 2131888537(0x7f120999, float:1.9411712E38)
            java.lang.String r0 = r4.getString(r0)
            r1.setError(r0)
            return
        L_0x0353:
            java.lang.Object r3 = r9.A00
            com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity r3 = (com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity) r3
            X.3L5 r2 = r3.A03
            if (r2 == 0) goto L_0x03ab
            java.lang.Integer r1 = X.C36371kC.A0o()
            java.lang.Integer r0 = X.C36361kB.A0i()
            r2.A05(r1, r0)
            X.18z r0 = r3.A01
            if (r0 == 0) goto L_0x03a4
            boolean r0 = X.C36401kF.A1W(r0)
            if (r0 == 0) goto L_0x0396
            X.21S r4 = X.AnonymousClass21S.A00(r3)
            r0 = 2131893898(0x7f121e8a, float:1.9422586E38)
            r4.A0e(r0)
            r0 = 2131893899(0x7f121e8b, float:1.9422588E38)
            r4.A0d(r0)
            r1 = 2131896389(0x7f122845, float:1.9427638E38)
            X.3VY r0 = X.AnonymousClass3VY.A00
            r4.A0f(r0, r1)
            r1 = 2131887154(0x7f120432, float:1.9408907E38)
            r0 = 38
            X.4XL r0 = X.AnonymousClass4XL.A00(r3, r0)
            r4.A0g(r0, r1)
            goto L_0x05ea
        L_0x0396:
            r2 = 0
            X.3Kr r1 = r3.A3j()
            X.4Lr r0 = new X.4Lr
            r0.<init>(r3, r2)
            r1.A02(r0)
            return
        L_0x03a4:
            java.lang.String r0 = "chatLockManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03ab:
            java.lang.String r0 = "chatLockLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03b2:
            java.lang.Object r0 = r9.A00
            X.C36411kG.A1N(r0)
            return
        L_0x03b8:
            java.lang.Object r0 = r9.A00
            com.whatsapp.chatlock.ChatLockRequestAuthInterstitialActivity r0 = (com.whatsapp.chatlock.ChatLockRequestAuthInterstitialActivity) r0
            com.whatsapp.chatlock.ChatLockRequestAuthInterstitialActivity.A01(r0)
            return
        L_0x03c0:
            java.lang.Object r0 = r9.A00
            X.6YL r0 = (X.AnonymousClass6YL) r0
            r0.A0N()
            return
        L_0x03c8:
            java.lang.Object r2 = r9.A00
            com.whatsapp.chatlock.ChatLockSettingsActivity r2 = (com.whatsapp.chatlock.ChatLockSettingsActivity) r2
            r1 = 0
            X.190 r0 = r2.A06
            if (r0 == 0) goto L_0x03e9
            r0 = 1
            android.content.Intent r0 = X.C36381kD.A0D(r2, r0)
            r2.startActivityForResult(r0, r1)
            X.3L5 r1 = r2.A04
            if (r1 == 0) goto L_0x03e2
            r0 = 3
            r1.A00(r0)
            return
        L_0x03e2:
            java.lang.String r0 = "chatLockLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03e9:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x03ee:
            java.lang.Object r4 = r9.A00
            X.14p r4 = (X.C224914p) r4
            r3 = 1
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.chatlock.ChatLockConfirmSecretCodeActivity"
            r2.setClassName(r1, r0)
            r1 = 2
            java.lang.String r0 = "entrypoint"
            r2.putExtra(r0, r1)
            r4.startActivityForResult(r2, r3)
            return
        L_0x040a:
            java.lang.Object r6 = r9.A00
            com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet r6 = (com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet) r6
            X.37p r0 = r6.A01
            if (r0 == 0) goto L_0x0436
            X.3eJ r5 = r0.A03
            X.155 r4 = r0.A01
            int r3 = r0.A00
            X.3eG r2 = new X.3eG
            r2.<init>(r4, r5, r3)
            r0 = 3
            X.4XI r1 = new X.4XI
            r1.<init>(r2, r4, r5, r0)
            com.whatsapp.chatlock.dialogs.ChatLockForgotSecretCodeUnlockClearDialog r0 = new com.whatsapp.chatlock.dialogs.ChatLockForgotSecretCodeUnlockClearDialog
            r0.<init>(r1, r3)
            r4.Btm(r0)
            r5.B2U()
            X.3L5 r2 = r5.A02
            r1 = 0
            r0 = 15
            r2.A04(r1, r1, r1, r0)
        L_0x0436:
            X.3L5 r2 = r6.A06
            r1 = 0
            java.lang.Integer r0 = X.C36361kB.A0j()
            r2.A05(r1, r0)
            return
        L_0x0441:
            java.lang.Object r5 = r9.A00
            com.whatsapp.chatlock.dialogs.helperflow.ChatLockHelperBottomSheet r5 = (com.whatsapp.chatlock.dialogs.helperflow.ChatLockHelperBottomSheet) r5
            com.whatsapp.chatlock.dialogs.helperflow.ChatLockHelperBottomSheetViewModel r1 = r5.A1m()
            r0 = 1
            r1.A04 = r0
            X.3L5 r4 = r1.A06
            X.11F r3 = r1.A03
            int r0 = r1.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 0
            r0 = 12
            r4.A04(r3, r2, r1, r0)
            r5.A1b()
            return
        L_0x0460:
            java.lang.Object r1 = r9.A00
            X.1yq r1 = (X.C42451yq) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            android.view.ViewGroup r0 = r1.A00
            r0.showContextMenu()
            return
        L_0x046c:
            java.lang.Object r5 = r9.A00
            com.whatsapp.community.CommunityNUXActivity r5 = (com.whatsapp.community.CommunityNUXActivity) r5
            X.1Sp r0 = r5.A01
            java.lang.String r3 = r0.A00()
            X.1Sp r0 = r5.A01
            java.lang.Integer r2 = r0.A00
            X.1Sk r1 = r5.A02
            r0 = 2
            r4 = 3
            r1.A09(r2, r3, r0, r4)
            boolean r1 = X.AnonymousClass000.A1V(r2)
            java.lang.String r0 = "Creation Entrypoint should not be null"
            X.C18740tg.A0D(r1, r0)
            X.1Sq r3 = r5.A00
            int r2 = r2.intValue()
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "CommunityNUXActivity_group_to_be_added"
            X.147 r0 = X.C65533Sl.A00(r1, r0)
            r3.BuZ(r5, r0, r4, r2)
            r5.finish()
            return
        L_0x04a1:
            java.lang.Object r0 = r9.A00
            com.whatsapp.community.CommunityNUXActivity r0 = (com.whatsapp.community.CommunityNUXActivity) r0
            r0.A3i()
            return
        L_0x04a9:
            java.lang.Object r2 = r9.A00
            com.whatsapp.community.CommunityNUXActivity r2 = (com.whatsapp.community.CommunityNUXActivity) r2
            X.1fs r1 = r2.A03
            java.lang.String r0 = "community-examples-article"
        L_0x04b1:
            r1.A01(r2, r0)
            return
        L_0x04b5:
            java.lang.Object r3 = r9.A00
            com.whatsapp.community.CommunityNavigationActivity r3 = (com.whatsapp.community.CommunityNavigationActivity) r3
            X.1Sq r2 = r3.A0C
            X.147 r1 = r3.A0c
            r0 = 0
            r2.A02(r3, r1, r0)
            return
        L_0x04c2:
            java.lang.Object r4 = r9.A00
            com.whatsapp.community.CommunityNewSubgroupSwitcherBottomSheet r4 = (com.whatsapp.community.CommunityNewSubgroupSwitcherBottomSheet) r4
            X.1Sq r3 = r4.A06
            if (r3 == 0) goto L_0x04e4
            android.content.Context r1 = r4.A1D()
            java.lang.Class<X.01L> r0 = X.AnonymousClass01L.class
            android.app.Activity r2 = X.C24801Dv.A01(r1, r0)
            X.01L r2 = (X.AnonymousClass01L) r2
            X.00T r0 = r4.A0M
            X.147 r1 = X.C36431kI.A0k(r0)
            java.lang.Integer r0 = X.C36401kF.A0j()
            r3.A02(r2, r1, r0)
            return
        L_0x04e4:
            java.lang.String r0 = "communityNavigator"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x04eb:
            java.lang.Object r0 = r9.A00
            X.C36431kI.A1N(r0)
            return
        L_0x04f1:
            java.lang.Object r2 = r9.A00
            com.whatsapp.community.CommunitySettingsActivity r2 = (com.whatsapp.community.CommunitySettingsActivity) r2
            X.00T r0 = r2.A0L
            com.whatsapp.jid.Jid r1 = X.C36441kJ.A0m(r0)
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            com.whatsapp.community.communitysettings.AllowNonAdminMembersAddBottomSheet r0 = new com.whatsapp.community.communitysettings.AllowNonAdminMembersAddBottomSheet
            r0.<init>()
            goto L_0x0518
        L_0x0505:
            java.lang.Object r2 = r9.A00
            com.whatsapp.community.CommunitySettingsActivity r2 = (com.whatsapp.community.CommunitySettingsActivity) r2
            X.00T r0 = r2.A0L
            com.whatsapp.jid.Jid r1 = X.C36441kJ.A0m(r0)
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            com.whatsapp.community.communitysettings.AllowNonAdminSubgroupCreationBottomSheet r0 = new com.whatsapp.community.communitysettings.AllowNonAdminSubgroupCreationBottomSheet
            r0.<init>()
        L_0x0518:
            X.C36381kD.A1G(r0, r1)
            r2.Btm(r0)
            return
        L_0x051f:
            java.lang.Object r0 = r9.A00
            com.whatsapp.community.NewCommunityActivity r0 = (com.whatsapp.community.NewCommunityActivity) r0
            X.0wU r1 = r0.A04
            java.lang.Runnable r0 = r0.A0O
            r1.Boy(r0)
            return
        L_0x052b:
            java.lang.Object r0 = r9.A00
            com.whatsapp.community.NewCommunityAdminBottomSheetFragment r0 = (com.whatsapp.community.NewCommunityAdminBottomSheetFragment) r0
            X.1tw r3 = r0.A01
            if (r3 == 0) goto L_0x0556
            X.147 r2 = r3.A00
            if (r2 == 0) goto L_0x053d
            X.1LV r1 = r3.A02
            r0 = 1
            r1.A0E(r2, r0)
        L_0x053d:
            X.2np r0 = X.C51442np.DISMISS
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            r1 = 2
            java.lang.String r0 = "dialogAction"
            r2.putInt(r0, r1)
            X.147 r1 = r3.A00
            java.lang.String r0 = "parentGroupJid"
            r2.putParcelable(r0, r1)
            X.00s r0 = r3.A01
            r0.A0C(r2)
            return
        L_0x0556:
            java.lang.RuntimeException r0 = X.C36331k8.A0a()
            throw r0
        L_0x055b:
            java.lang.Object r1 = r9.A00
            X.2Es r1 = (X.AnonymousClass2Es) r1
            boolean r0 = r1 instanceof com.whatsapp.community.NewCommunityActivity
            if (r0 == 0) goto L_0x0588
            r0 = r1
            com.whatsapp.community.NewCommunityActivity r0 = (com.whatsapp.community.NewCommunityActivity) r0
            X.2Fo r2 = r0.A03
        L_0x0568:
            com.whatsapp.WaEditText r0 = r1.A08
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x057a
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            r2.A0P = r0
        L_0x057a:
            X.1P3 r0 = r1.A0F
            r6 = 1
            r3 = 64206(0xface, float:8.9972E-41)
            r4 = 2
            r7 = 0
            r5 = -1
            r8 = 0
            r0.A08(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0588:
            r0 = r1
            com.whatsapp.community.EditCommunityActivity r0 = (com.whatsapp.community.EditCommunityActivity) r0
            X.141 r2 = r0.A06
            goto L_0x0568
        L_0x058e:
            java.lang.Object r0 = r9.A00
            android.app.Activity r0 = (android.app.Activity) r0
            X.C36331k8.A0m(r0)
            return
        L_0x0596:
            java.lang.Object r0 = r9.A00
            com.whatsapp.community.ReviewGroupsPermissionsBeforeLinkActivity r0 = (com.whatsapp.community.ReviewGroupsPermissionsBeforeLinkActivity) r0
            com.whatsapp.community.ReviewGroupsPermissionsBeforeLinkActivity.A01(r0)
            return
        L_0x059e:
            java.lang.Object r1 = r9.A00
            X.232 r1 = (X.AnonymousClass232) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.3Gl r0 = r1.A01
            if (r0 != 0) goto L_0x05b7
            java.lang.String r0 = "mediaVisibilityInfoUpdateHelper"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05b1:
            java.lang.Object r0 = r9.A00
            X.2Dr r0 = (X.AnonymousClass2Dr) r0
            X.3Gl r0 = r0.A0C
        L_0x05b7:
            r0.A00()
            return
        L_0x05bb:
            java.lang.Object r0 = r9.A00
            com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity r0 = (com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity) r0
            com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity.A01(r0)
            return
        L_0x05c3:
            java.lang.Object r3 = r9.A00
            X.014 r3 = (X.AnonymousClass014) r3
            X.1qm r4 = X.AnonymousClass3LW.A00(r3)
            r0 = 2131893500(0x7f121cfc, float:1.9421778E38)
            r4.A0d(r0)
            r0 = 2131893499(0x7f121cfb, float:1.9421776E38)
            r4.A0c(r0)
            r1 = 2131896389(0x7f122845, float:1.9427638E38)
            r0 = 0
            r4.A0l(r3, r0, r1)
            r2 = 2131890954(0x7f12130a, float:1.9416614E38)
            r1 = 3
            X.2rZ r0 = new X.2rZ
            r0.<init>(r3, r1)
            r4.A0m(r3, r0, r2)
        L_0x05ea:
            r4.A0b()
            return
        L_0x05ee:
            java.lang.Object r0 = r9.A00
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity r0 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity) r0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r2 = X.C36401kF.A0T(r0)
            X.2nq r1 = X.C51452nq.APPROVE
            r0 = 0
            r2.A0S(r1, r0)
            return
        L_0x05fd:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x0602:
            X.21S r2 = X.AnonymousClass21S.A00(r3)
            r0 = 2131895094(0x7f122336, float:1.9425011E38)
            r2.A0e(r0)
            r0 = 2131895093(0x7f122335, float:1.942501E38)
            r2.A0d(r0)
            r1 = 2131895092(0x7f122334, float:1.9425007E38)
            r0 = 40
            X.4XL r0 = X.AnonymousClass4XL.A00(r3, r0)
            r2.A0g(r0, r1)
            r1 = 2131887757(0x7f12068d, float:1.941013E38)
            X.3VZ r0 = X.AnonymousClass3VZ.A00
            r2.A0f(r0, r1)
            X.C36341k9.A11(r2)
            return
        L_0x062a:
            X.17Y r2 = r3.A05
            r1 = 2131889559(0x7f120d97, float:1.9413785E38)
            r0 = 0
            r2.A06(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66933Xw.onClick(android.view.View):void");
    }
}
