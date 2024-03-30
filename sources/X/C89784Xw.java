package X;

import android.content.DialogInterface;

/* renamed from: X.4Xw  reason: invalid class name and case insensitive filesystem */
public class C89784Xw implements DialogInterface.OnClickListener {
    public int A00;
    public Object A01;
    public final int A02;

    public C89784Xw(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.whatsapp.chatinfo.fragment.EncryptionExplanationDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment} */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
        r1.A06(r3.A0a(), r2);
        r3.A1b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0116, code lost:
        r7.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0119, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r7, int r8) {
        /*
            r6 = this;
            int r0 = r6.A02
            switch(r0) {
                case 0: goto L_0x003a;
                case 1: goto L_0x0012;
                case 2: goto L_0x005b;
                case 3: goto L_0x00ae;
                case 4: goto L_0x00e7;
                case 5: goto L_0x00f3;
                case 6: goto L_0x00ff;
                case 7: goto L_0x010b;
                case 8: goto L_0x011a;
                case 9: goto L_0x0005;
                case 10: goto L_0x012b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r6.A01
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r1 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r1
            int r0 = r6.A00
            X.AnonymousClass3SJ.A00(r1, r0)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1B(r1)
        L_0x0011:
            return
        L_0x0012:
            java.lang.Object r0 = r6.A01
            com.whatsapp.community.CommunityPendingSuggestionsConfirmationDialog r0 = (com.whatsapp.community.CommunityPendingSuggestionsConfirmationDialog) r0
            int r1 = r6.A00
            X.4Np r0 = r0.A00
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = "approveClickListener"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0023:
            com.whatsapp.community.CommunitySettingsActivity r0 = (com.whatsapp.community.CommunitySettingsActivity) r0
            X.00T r0 = r0.A0M
            java.lang.Object r5 = r0.getValue()
            com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel r5 = (com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel) r5
            X.147 r2 = r5.A03
            if (r2 == 0) goto L_0x0011
            r4 = 1
            if (r1 == 0) goto L_0x0158
            if (r1 == r4) goto L_0x018d
            r0 = 2
            if (r1 == r0) goto L_0x018d
            return
        L_0x003a:
            java.lang.Object r3 = r6.A01
            com.whatsapp.chatinfo.fragment.EncryptionExplanationDialogFragment r3 = (com.whatsapp.chatinfo.fragment.EncryptionExplanationDialogFragment) r3
            int r1 = r6.A00
            r0 = 1
            X.0xT r2 = r3.A05
            if (r1 != r0) goto L_0x0052
            java.lang.String r0 = "28030015"
            android.net.Uri r0 = r2.A03(r0)
        L_0x004b:
            android.content.Intent r2 = X.C36391kE.A0G(r0)
            X.1Dv r1 = r3.A00
            goto L_0x0093
        L_0x0052:
            java.lang.String r1 = "security-and-privacy"
            java.lang.String r0 = "end-to-end-encryption-for-business-messages"
            android.net.Uri r0 = r2.A04(r1, r0)
            goto L_0x004b
        L_0x005b:
            java.lang.Object r3 = r6.A01
            com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment r3 = (com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment) r3
            int r4 = r6.A00
            X.2QH r1 = r3.A05
            r2 = 2
            if (r1 == 0) goto L_0x0071
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A01 = r0
            X.0yW r0 = r3.A04
            r0.Bly(r1)
        L_0x0071:
            r0 = 30
            if (r4 != r0) goto L_0x009e
            X.2PD r1 = new X.2PD
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A00 = r0
            java.lang.Integer r0 = X.C36401kF.A0k()
            r1.A01 = r0
            X.0yW r0 = r3.A04
            r0.Bly(r1)
        L_0x008b:
            java.lang.String r0 = "https://faq.whatsapp.com/1148840052398648"
        L_0x008d:
            android.content.Intent r2 = X.C36331k8.A04(r0)
            X.1Dv r1 = r3.A00
        L_0x0093:
            android.content.Context r0 = r3.A0a()
            r1.A06(r0, r2)
            r3.A1b()
            return
        L_0x009e:
            r0 = 1
            if (r4 == r0) goto L_0x00ab
            r0 = 4
            if (r4 == r0) goto L_0x00a8
            r0 = 5
            if (r4 == r0) goto L_0x00a8
            goto L_0x008b
        L_0x00a8:
            java.lang.String r0 = "https://faq.whatsapp.com/1520500555178162"
            goto L_0x008d
        L_0x00ab:
            java.lang.String r0 = "https://www.whatsapp.com/security"
            goto L_0x008d
        L_0x00ae:
            java.lang.Object r4 = r6.A01
            com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment r4 = (com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment) r4
            int r3 = r6.A00
            X.0xT r1 = r4.A03
            java.lang.String r0 = "643460927283235"
            android.net.Uri r2 = r1.A03(r0)
            r0 = 46
            if (r3 != r0) goto L_0x00d6
            X.2PD r1 = new X.2PD
            r1.<init>()
            java.lang.Integer r0 = X.C36361kB.A0j()
            r1.A00 = r0
            java.lang.Integer r0 = X.C36401kF.A0k()
            r1.A01 = r0
            X.0yW r0 = r4.A02
            r0.Bly(r1)
        L_0x00d6:
            android.content.Intent r2 = X.C36391kE.A0G(r2)
            X.1Dv r1 = r4.A00
            android.content.Context r0 = r4.A1D()
            r1.A06(r0, r2)
            r4.A1b()
            return
        L_0x00e7:
            java.lang.Object r0 = r6.A01
            X.28b r0 = (X.AnonymousClass28b) r0
            int r1 = r6.A00
            X.01L r0 = r0.A03
            X.AnonymousClass3SJ.A00(r0, r1)
            return
        L_0x00f3:
            java.lang.Object r0 = r6.A01
            com.whatsapp.dialogs.PromptDialogFragment r0 = (com.whatsapp.dialogs.PromptDialogFragment) r0
            int r1 = r6.A00
            X.4Tz r0 = r0.A01
            r0.BVi(r1)
            goto L_0x0116
        L_0x00ff:
            java.lang.Object r0 = r6.A01
            com.whatsapp.dialogs.PromptDialogFragment r0 = (com.whatsapp.dialogs.PromptDialogFragment) r0
            int r1 = r6.A00
            X.4Tz r0 = r0.A01
            r0.BVj(r1)
            goto L_0x0116
        L_0x010b:
            java.lang.Object r0 = r6.A01
            com.whatsapp.dialogs.PromptDialogFragment r0 = (com.whatsapp.dialogs.PromptDialogFragment) r0
            int r1 = r6.A00
            X.4Tz r0 = r0.A01
            r0.BVh(r1)
        L_0x0116:
            r7.dismiss()
            return
        L_0x011a:
            java.lang.Object r2 = r6.A01
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r2 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r2
            int r0 = r6.A00
            X.AnonymousClass3SJ.A00(r2, r0)
            X.1fs r1 = r2.A0Y
            java.lang.String r0 = "how-to-register"
            r1.A01(r2, r0)
            return
        L_0x012b:
            java.lang.Object r4 = r6.A01
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r4 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r4
            int r0 = r6.A00
            X.AnonymousClass3SJ.A00(r4, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "+"
            r1.append(r0)
            java.lang.String r0 = r4.A1D
            r1.append(r0)
            java.lang.String r0 = r4.A1F
            java.lang.String r3 = X.AnonymousClass000.A0q(r0, r1)
            X.3Gu r2 = r4.A0d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "verify-bp "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r1)
            X.C62603Gu.A00(r4, r2, r0)
            return
        L_0x0158:
            X.1LV r1 = r5.A05
            X.17d r0 = r1.A08
            java.util.HashSet r0 = r0.A02(r2)
            int r2 = r0.size()
            X.0yC r1 = r1.A06
            r0 = 1238(0x4d6, float:1.735E-42)
            int r0 = r1.A07(r0)
            int r3 = r0 + 1
            int r3 = r3 - r2
            if (r3 > 0) goto L_0x017e
            X.1hi r3 = r5.A0B
            r2 = 2
            r1 = 0
            X.3Iu r0 = new X.3Iu
            r0.<init>(r2, r1, r1)
            r3.A0C(r0)
            return
        L_0x017e:
            int r2 = r5.A00
            if (r3 >= r2) goto L_0x018d
            X.1hi r1 = r5.A0B
            X.3Iu r0 = new X.3Iu
            r0.<init>(r4, r3, r2)
            r1.A0C(r0)
            return
        L_0x018d:
            r5.A0S(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89784Xw.onClick(android.content.DialogInterface, int):void");
    }
}
