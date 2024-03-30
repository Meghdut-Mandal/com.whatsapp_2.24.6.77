package X;

import android.view.View;

/* renamed from: X.2i1  reason: invalid class name and case insensitive filesystem */
public class C48772i1 extends C33541fX {
    public Object A00;
    public final int A01;

    public C48772i1(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C48772i1(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:215:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c5, code lost:
        if (r2.A01() == false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        r2 = r0.A0H;
        r1 = r0.A05;
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r2.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0211, code lost:
        r0 = (X.C47582fA) ((X.C48772i1) r0).A00;
        r2 = r0.A0H;
        r1 = r0.A05;
        X.AnonymousClass00C.A0D(r1, 0);
        r3 = r2.A02;
        r2 = r1.A1J;
        X.AnonymousClass00C.A07(r2);
        r1 = new com.whatsapp.status.StatusDeleteDialogFragment();
        r0 = X.AnonymousClass001.A07();
        X.AnonymousClass3UJ.A08(r0, r2);
        r1.A17(r0);
        X.AnonymousClass3LQ.A01(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0238, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x023b, code lost:
        r0 = (X.C47582fA) ((X.C48772i1) r0).A00;
        r0.A0H.A00(r0.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0248, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0271, code lost:
        r3.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0274, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.view.View r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.A01
            r5 = r18
            switch(r1) {
                case 0: goto L_0x0131;
                case 1: goto L_0x013a;
                case 2: goto L_0x0148;
                case 3: goto L_0x016a;
                case 4: goto L_0x01a6;
                case 5: goto L_0x01ae;
                case 6: goto L_0x01cb;
                case 7: goto L_0x001a;
                case 8: goto L_0x0009;
                case 9: goto L_0x0009;
                case 10: goto L_0x002d;
                case 11: goto L_0x01f2;
                case 12: goto L_0x01ff;
                case 13: goto L_0x003b;
                case 14: goto L_0x020f;
                case 15: goto L_0x0239;
                case 16: goto L_0x0249;
                case 17: goto L_0x0211;
                case 18: goto L_0x023b;
                case 19: goto L_0x0019;
                case 20: goto L_0x0044;
                case 21: goto L_0x0275;
                case 22: goto L_0x033b;
                case 23: goto L_0x036c;
                case 24: goto L_0x0374;
                case 25: goto L_0x037c;
                case 26: goto L_0x038a;
                case 27: goto L_0x0091;
                case 28: goto L_0x00d5;
                case 29: goto L_0x03bc;
                case 30: goto L_0x03cb;
                case 31: goto L_0x03eb;
                case 32: goto L_0x03fc;
                case 33: goto L_0x010d;
                case 34: goto L_0x0404;
                case 35: goto L_0x0410;
                case 36: goto L_0x045e;
                case 37: goto L_0x0472;
                case 38: goto L_0x048a;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r0.A00
            X.3PF r0 = (X.AnonymousClass3PF) r0
            X.334 r0 = r0.A0J
            X.2f9 r0 = r0.A00
        L_0x0011:
            X.3JQ r2 = r0.A0H
            X.3T1 r1 = r0.A05
            r0 = 1
        L_0x0016:
            r2.A01(r1, r0)
        L_0x0019:
            return
        L_0x001a:
            java.lang.Object r0 = r0.A00
            X.01I r1 = X.C36441kJ.A0X(r0)
            X.4Rq r1 = (X.C88164Rq) r1
            if (r1 == 0) goto L_0x0019
            r0 = 2
            com.whatsapp.status.playback.StatusPlaybackActivity r1 = (com.whatsapp.status.playback.StatusPlaybackActivity) r1
            r1.A07 = r0
            r1.finish()
            return
        L_0x002d:
            java.lang.Object r0 = r0.A00
            X.3PF r0 = (X.AnonymousClass3PF) r0
            X.334 r0 = r0.A0J
            X.2f9 r0 = r0.A00
            X.3JQ r2 = r0.A0H
            X.3T1 r1 = r0.A05
            r0 = 0
            goto L_0x0016
        L_0x003b:
            java.lang.Object r0 = r0.A00
            X.2i1 r0 = (X.C48772i1) r0
            java.lang.Object r0 = r0.A00
            X.2fA r0 = (X.C47582fA) r0
            goto L_0x0011
        L_0x0044:
            java.lang.Object r5 = r0.A00
            X.2f9 r5 = (X.C47572f9) r5
            X.1Fz r0 = r5.A09
            X.3T1 r4 = r5.A05
            boolean r0 = r0.A03(r4)
            if (r0 == 0) goto L_0x0019
            X.3NN r3 = r5.A05
            java.lang.Integer r0 = X.C36371kC.A0o()
            X.2QM r2 = new X.2QM
            r2.<init>()
            r2.A01 = r0
            X.3Qa r1 = r4.A1J
            boolean r0 = r1.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
            java.lang.Integer r0 = X.AnonymousClass3NN.A00(r4)
            r2.A02 = r0
            X.11F r0 = r1.A00
            int r0 = X.C28381Sl.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A03 = r0
            X.0yW r0 = r3.A00
            r0.Bly(r2)
            X.1X4 r2 = r5.A02
            android.view.View r0 = r5.A00
            X.C18740tg.A04(r0)
            android.app.Activity r1 = X.C36361kB.A06(r0)
            X.1Dv r0 = r5.A0B
            r2.A0E(r1, r0, r4)
            return
        L_0x0091:
            java.lang.Object r4 = r0.A00
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r4 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r4
            X.6O1 r3 = r4.A06
            java.lang.Integer r2 = X.C36421kH.A0W()
            r1 = 1
            r0 = 8
            r3.A02(r2, r1, r0)
            X.68B r2 = r4.A0G
            if (r2 == 0) goto L_0x0019
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x00af
            boolean r0 = r2.A01()
            if (r0 == 0) goto L_0x0019
        L_0x00af:
            r2.A06 = r1
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity.A0G(r4)
            boolean r0 = r4.A0S
            if (r0 == 0) goto L_0x00ce
            r6 = 5
        L_0x00b9:
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r1 = r4.A0K
            r3 = 0
            java.lang.String r0 = r2.A03
            if (r0 == 0) goto L_0x00c7
            boolean r0 = r2.A01()
            r7 = 1
            if (r0 != 0) goto L_0x00c8
        L_0x00c7:
            r7 = 0
        L_0x00c8:
            r5 = r3
            r4 = r3
            r1.A03(r2, r3, r4, r5, r6, r7)
            return
        L_0x00ce:
            boolean r0 = r4.A0T
            int r6 = X.C36391kE.A00(r0)
            goto L_0x00b9
        L_0x00d5:
            java.lang.Object r5 = r0.A00
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r5 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r5
            X.6O1 r3 = r5.A06
            java.lang.Integer r2 = X.C36421kH.A0V()
            r1 = 1
            r0 = 8
            r3.A02(r2, r1, r0)
            X.68B r4 = r5.A0G
            X.C18740tg.A06(r4)
            boolean r0 = r4.A0S
            if (r0 != 0) goto L_0x00f2
            java.lang.String r0 = r4.A03
            if (r0 == 0) goto L_0x0019
        L_0x00f2:
            com.whatsapp.stickers.store.ConfirmPackDeleteDialogFragment r3 = new com.whatsapp.stickers.store.ConfirmPackDeleteDialogFragment
            r3.<init>()
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.lang.String r1 = r4.A0F
            java.lang.String r0 = "pack_id"
            r2.putString(r0, r1)
            java.lang.String r1 = r4.A0H
            java.lang.String r0 = "pack_name"
            r2.putString(r0, r1)
            X.C36381kD.A17(r2, r3, r5)
            return
        L_0x010d:
            java.lang.Object r2 = r0.A00
            com.whatsapp.twofactor.SetEmailFragment r2 = (com.whatsapp.twofactor.SetEmailFragment) r2
            java.lang.String r0 = "setemailfragment/submit"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r1 = r2.A00
            r0 = 1
            r4 = 2
            if (r1 == r0) goto L_0x04ef
            if (r1 != r4) goto L_0x0019
            com.whatsapp.twofactor.TwoFactorAuthActivity r0 = r2.A05
            java.lang.String r1 = r0.A04
            java.lang.String r0 = r0.A05
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x04e9
            com.whatsapp.twofactor.TwoFactorAuthActivity r1 = r2.A05
            r0 = 0
            r1.A3k(r0)
            return
        L_0x0131:
            java.lang.Object r1 = r0.A00
            com.whatsapp.status.audienceselector.StatusPrivacyActivity r1 = (com.whatsapp.status.audienceselector.StatusPrivacyActivity) r1
            r0 = 0
            com.whatsapp.status.audienceselector.StatusPrivacyActivity.A0H(r1, r0)
            return
        L_0x013a:
            java.lang.Object r0 = r0.A00
            com.whatsapp.status.playback.MessageReplyActivity r0 = (com.whatsapp.status.playback.MessageReplyActivity) r0
            r0.A3i()
            com.whatsapp.status.playback.MessageReplyActivity.A0i(r0)
            com.whatsapp.status.playback.MessageReplyActivity.A0O(r0)
            return
        L_0x0148:
            java.lang.Object r4 = r0.A00
            com.whatsapp.status.playback.MessageReplyActivity r4 = (com.whatsapp.status.playback.MessageReplyActivity) r4
            X.1NG r1 = r4.A0J
            X.11F r0 = r4.A0k
            boolean r0 = X.C36351kA.A1X(r1, r0)
            if (r0 == 0) goto L_0x015c
            r0 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass3SJ.A01(r4, r0)
            return
        L_0x015c:
            X.28e r3 = r4.A0P
            android.widget.ImageButton r2 = r4.A08
            boolean r1 = r4.A1I
            r0 = 2
            if (r1 == 0) goto L_0x0166
            r0 = 5
        L_0x0166:
            r3.A0F(r2, r0)
            return
        L_0x016a:
            java.lang.Object r2 = r0.A00
            com.whatsapp.status.playback.MyStatusesActivity r2 = (com.whatsapp.status.playback.MyStatusesActivity) r2
            X.0Ws r1 = r2.A01
            if (r1 == 0) goto L_0x0177
            X.0Ut r1 = r1.A04
            r1.A01()
        L_0x0177:
            java.lang.Object r8 = r5.getTag()
            X.3T1 r8 = (X.AnonymousClass3T1) r8
            android.content.Context r4 = r5.getContext()
            X.1Ua r14 = r2.A0j
            X.0v5 r6 = r2.A03
            com.whatsapp.bridge.wfal.WfalManager r7 = r2.A09
            X.1dO r10 = r2.A0U
            X.1Xt r11 = r2.A0W
            X.1i0 r13 = r2.A0h
            X.1dW r12 = r2.A0e
            boolean r15 = X.C36421kH.A1V(r2)
            X.37S r9 = r2.A0S
            X.1r8 r3 = new X.1r8
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.A01 = r3
            r2 = 3
            X.4XD r1 = new X.4XD
            r1.<init>(r8, r0, r2)
            r3.A01 = r1
            goto L_0x0271
        L_0x01a6:
            java.lang.Object r0 = r0.A00
            com.whatsapp.status.playback.MyStatusesActivity r0 = (com.whatsapp.status.playback.MyStatusesActivity) r0
            com.whatsapp.status.playback.MyStatusesActivity.A0w(r0)
            return
        L_0x01ae:
            java.lang.Object r1 = r0.A00
            com.whatsapp.status.playback.MyStatusesActivity r1 = (com.whatsapp.status.playback.MyStatusesActivity) r1
            X.1Xc r0 = r1.A0V
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x01bf
            X.1Xt r0 = r1.A0W
            r0.A04()
        L_0x01bf:
            java.lang.Integer r0 = X.C36371kC.A0p()
            android.content.Intent r0 = X.AnonymousClass190.A10(r1, r0)
            r1.startActivity(r0)
            return
        L_0x01cb:
            java.lang.Object r2 = r0.A00
            com.whatsapp.status.playback.MyStatusesActivity r2 = (com.whatsapp.status.playback.MyStatusesActivity) r2
            java.lang.Object r1 = r5.getTag()
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            X.0V9 r0 = r2.A00
            if (r0 == 0) goto L_0x01dc
            r0.A05()
        L_0x01dc:
            int r0 = r1.A1I
            boolean r0 = X.C66013Ui.A0J(r0)
            if (r0 == 0) goto L_0x01ec
            X.1XY r0 = r2.A07
            X.2bU r1 = (X.AnonymousClass2bU) r1
            r0.A05(r1)
            return
        L_0x01ec:
            X.1X4 r0 = r2.A08
            r0.A0U(r1)
            return
        L_0x01f2:
            java.lang.Object r0 = r0.A00
            X.2fA r0 = (X.C47582fA) r0
            X.1Y4 r2 = r0.A04
            X.3T1 r1 = r0.A05
            r0 = 1
            r2.A08(r1, r0)
            return
        L_0x01ff:
            java.lang.Object r0 = r0.A00
            X.2fB r0 = (X.C47592fB) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r0.A01
            int r1 = r2.A0J
            r0 = 3
            if (r1 != r0) goto L_0x020b
            r0 = 4
        L_0x020b:
            r2.A0W(r0)
            return
        L_0x020f:
            java.lang.Object r0 = r0.A00
        L_0x0211:
            X.2i1 r0 = (X.C48772i1) r0
            java.lang.Object r0 = r0.A00
            X.2fA r0 = (X.C47582fA) r0
            X.3JQ r2 = r0.A0H
            X.3T1 r1 = r0.A05
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r3 = r2.A02
            X.3Qa r2 = r1.A1J
            X.AnonymousClass00C.A07(r2)
            com.whatsapp.status.StatusDeleteDialogFragment r1 = new com.whatsapp.status.StatusDeleteDialogFragment
            r1.<init>()
            android.os.Bundle r0 = X.AnonymousClass001.A07()
            X.AnonymousClass3UJ.A08(r0, r2)
            r1.A17(r0)
            X.AnonymousClass3LQ.A01(r1, r3)
            return
        L_0x0239:
            java.lang.Object r0 = r0.A00
        L_0x023b:
            X.2i1 r0 = (X.C48772i1) r0
            java.lang.Object r0 = r0.A00
            X.2fA r0 = (X.C47582fA) r0
            X.3JQ r1 = r0.A0H
            X.3T1 r0 = r0.A05
            r1.A00(r0)
            return
        L_0x0249:
            android.content.Context r4 = r5.getContext()
            java.lang.Object r2 = r0.A00
            X.2f9 r2 = (X.C47572f9) r2
            X.3T1 r6 = r2.A05
            r1 = 13
            X.2i1 r7 = new X.2i1
            r7.<init>(r0, r1)
            r1 = 14
            X.2i1 r8 = new X.2i1
            r8.<init>(r0, r1)
            r1 = 15
            X.2i1 r9 = new X.2i1
            r9.<init>(r0, r1)
            X.1Ua r11 = r2.A0D
            X.1i0 r10 = r2.A0C
            X.1r7 r3 = new X.1r7
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x0271:
            r3.A00()
            return
        L_0x0275:
            java.lang.Object r4 = r0.A00
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment r4 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment) r4
            X.1Xc r0 = r4.A07
            if (r0 == 0) goto L_0x0334
            boolean r0 = r0.A00()
            java.lang.String r7 = "statusDistributionInfo"
            r5 = 0
            if (r0 == 0) goto L_0x02ce
            X.1Xt r0 = r4.A08
            if (r0 == 0) goto L_0x0293
            X.3XT r2 = r4.A03
            if (r2 != 0) goto L_0x029a
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r7)
            throw r0
        L_0x0293:
            java.lang.String r0 = "statusesStatsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x029a:
            X.1Xw r6 = r0.A0A
            X.1Xc r0 = r6.A04
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x02ce
            X.2SV r3 = X.C29761Xw.A00(r6)
            r0 = 26
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A03 = r0
            X.1Xx r1 = r6.A05
            java.lang.Integer r0 = r1.A01
            r3.A02 = r0
            java.lang.Integer r0 = r1.A00
            r3.A01 = r0
            int r2 = r2.A00
            r1 = 1
            if (r2 == 0) goto L_0x02db
            r0 = 1
            r1 = 3
            if (r2 == r0) goto L_0x02db
            r1 = 2
            if (r2 == r1) goto L_0x02db
            r0 = 0
        L_0x02c7:
            r3.A04 = r0
            X.0yW r0 = r6.A02
            r0.Blw(r3)
        L_0x02ce:
            boolean r0 = r4.A0F
            if (r0 == 0) goto L_0x0312
            X.3XT r0 = r4.A03
            if (r0 != 0) goto L_0x02e0
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r7)
            throw r0
        L_0x02db:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x02c7
        L_0x02e0:
            boolean r3 = r0.A03
            X.005 r0 = r4.A0E
            if (r0 == 0) goto L_0x032d
            java.lang.Object r2 = r0.get()
            X.1UZ r2 = (X.AnonymousClass1UZ) r2
            r1 = 927605897(0x374a2489, float:1.2048645E-5)
            java.lang.String r0 = "TAP_AUDIENCE_SELECTOR_TOGGLE"
            r2.A06(r5, r0, r1)
            java.lang.Boolean r1 = X.C36441kJ.A0x(r3)
            java.lang.String r0 = "initial_auto_setting"
            r2.A02(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = "final_auto_setting"
            r2.A02(r1, r0)
            r2.A01()
            X.1UM r1 = r4.A0C
            if (r1 == 0) goto L_0x0326
            X.1US r0 = com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment.A0J
            r1.A05(r0, r3)
        L_0x0312:
            X.4Rs r1 = r4.A0A
            if (r1 == 0) goto L_0x0322
            X.3XT r0 = r4.A03
            if (r0 != 0) goto L_0x031f
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r7)
            throw r0
        L_0x031f:
            r1.BhY(r0)
        L_0x0322:
            r4.A1b()
            return
        L_0x0326:
            java.lang.String r0 = "fbAccountManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x032d:
            java.lang.String r0 = "xFamilyUserFlowLoggerLazy"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0334:
            java.lang.String r0 = "statusLoggingConfig"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x033b:
            java.lang.Object r4 = r0.A00
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment r4 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment) r4
            X.3XT r0 = r4.A03
            if (r0 != 0) goto L_0x034a
            java.lang.String r0 = "statusDistributionInfo"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x034a:
            int r0 = r0.A00
            r3 = 1
            r2 = 2
            if (r0 == r2) goto L_0x0352
            r4.A0G = r3
        L_0x0352:
            X.0v0 r1 = r4.A01
            if (r1 == 0) goto L_0x0365
            java.lang.String r0 = "audience_selection_2"
            boolean r0 = r1.A2S(r0)
            if (r0 == 0) goto L_0x0361
            r4.A1q(r2)
        L_0x0361:
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment.A03(r4, r3)
            return
        L_0x0365:
            java.lang.String r0 = "sharedPreferences"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x036c:
            java.lang.Object r0 = r0.A00
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment r0 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment) r0
            r0.A1p()
            return
        L_0x0374:
            java.lang.Object r0 = r0.A00
            X.5H9 r0 = (X.AnonymousClass5H9) r0
            r0.A08()
            return
        L_0x037c:
            java.lang.Object r0 = r0.A00
            X.5Ku r0 = (X.C106675Ku) r0
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r1 = r0.A08
            X.68B r0 = r0.A04
            java.lang.String r0 = r0.A0F
            r1.A04(r0)
            return
        L_0x038a:
            java.lang.Object r0 = r0.A00
            X.5L8 r0 = (X.AnonymousClass5L8) r0
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r3 = r0.A00
            X.0yC r1 = r3.A08
            r0 = 7755(0x1e4b, float:1.0867E-41)
            boolean r0 = r1.A0E(r0)
            java.lang.String r2 = "sticker_store_my_stickers"
            if (r0 == 0) goto L_0x03ae
            android.content.Context r0 = r3.A1D()
            if (r0 == 0) goto L_0x03ae
            android.content.Context r0 = r3.A1D()
            android.content.Intent r0 = X.AnonymousClass190.A11(r0, r2)
            r3.A1C(r0)
            return
        L_0x03ae:
            X.6WF r1 = r3.A03
            X.01I r0 = r3.A0i()
            java.lang.ref.WeakReference r0 = X.AnonymousClass001.A0F(r0)
            r1.A04(r2, r0)
            return
        L_0x03bc:
            java.lang.Object r3 = r0.A00
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r3 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r3
            X.1Ae r2 = r3.A0C
            r1 = 5
            r0 = 0
            r2.A03(r0, r1)
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity.A0F(r3)
            return
        L_0x03cb:
            java.lang.Object r3 = r0.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r3 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r3
            X.1sS r2 = r3.A0K
            java.lang.String r1 = r2.A06
            r3.A0r = r1
            X.3OJ r0 = r3.A0h
            r0.A03 = r1
            r2.A0W(r1)
            r0 = 0
            r3.A0I = r0
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A0J(r3)
            com.whatsapp.status.widget.StatusEditText r1 = r3.A0f
            r0 = 0
            r1.A01 = r0
            r1.A0J()
            return
        L_0x03eb:
            java.lang.Object r0 = r0.A00
            X.01I r0 = (X.AnonymousClass01I) r0
            X.01z r1 = r0.getSupportFragmentManager()
            com.whatsapp.thunderstorm.ThunderstormReceiverBottomsheet r0 = new com.whatsapp.thunderstorm.ThunderstormReceiverBottomsheet
            r0.<init>()
            X.C65443Sb.A01(r0, r1)
            return
        L_0x03fc:
            java.lang.Object r0 = r0.A00
            com.whatsapp.twofactor.SetCodeFragment r0 = (com.whatsapp.twofactor.SetCodeFragment) r0
            com.whatsapp.twofactor.SetCodeFragment.A00(r0)
            return
        L_0x0404:
            r1 = 0
            X.AnonymousClass00C.A0D(r5, r1)
            java.lang.Object r0 = r0.A00
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r5)
            return
        L_0x0410:
            java.lang.Object r13 = r0.A00
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r13 = (com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity) r13
            X.0wU r1 = r13.A04
            X.0wo r6 = r13.A07
            X.1X4 r5 = r13.A01
            X.0ts r7 = r13.A0A
            X.0xM r8 = r13.A0B
            X.1N4 r4 = r13.A00
            X.1A1 r12 = r13.A0D
            X.11F r9 = r13.A0C
            X.C18740tg.A06(r9)
            java.util.ArrayList r14 = r13.A0M
            java.util.ArrayList r15 = r13.A0N
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r2 = "has_number_from_url"
            r0 = 0
            boolean r16 = r3.getBooleanExtra(r2, r0)
            android.content.Intent r2 = r13.getIntent()
            java.lang.String r0 = "quoted_message"
            android.os.Bundle r0 = r2.getBundleExtra(r0)
            X.3Qa r11 = X.C66013Ui.A0A(r0)
            android.content.Intent r2 = r13.getIntent()
            java.lang.String r0 = "quoted_group_jid"
            X.147 r10 = X.C65533Sl.A00(r2, r0)
            X.2k9 r3 = new X.2k9
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.C36391kE.A1Q(r3, r1)
            X.3Qc r1 = r13.A08
            r0 = 9
            r1.A03(r0)
            return
        L_0x045e:
            r1 = 0
            X.AnonymousClass00C.A0D(r5, r1)
            java.lang.Object r0 = r0.A00
            X.35t r0 = (X.C599135t) r0
            X.1hr r2 = r0.A00
            android.content.Context r1 = X.C36371kC.A0B(r5)
            X.2os r0 = X.C52092os.A02
            r2.A00(r1, r0)
            return
        L_0x0472:
            java.lang.Object r2 = r0.A00
            com.whatsapp.xfamily.crossposting.ui.bottomsheet.CrosspostingLinkingDisclosureBottomSheetDialogFragment r2 = (com.whatsapp.xfamily.crossposting.ui.bottomsheet.CrosspostingLinkingDisclosureBottomSheetDialogFragment) r2
            X.1UZ r1 = r2.A05
            if (r1 == 0) goto L_0x0483
            java.lang.String r0 = "TAP_NUX_NOT_NOW"
            r1.A04(r0)
            r2.A1b()
            return
        L_0x0483:
            java.lang.String r0 = "xFamilyUserFlowLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x048a:
            java.lang.Object r3 = r0.A00
            com.whatsapp.xfamily.crossposting.ui.bottomsheet.CrosspostingLinkingDisclosureBottomSheetDialogFragment r3 = (com.whatsapp.xfamily.crossposting.ui.bottomsheet.CrosspostingLinkingDisclosureBottomSheetDialogFragment) r3
            r0 = 1
            r3.A06 = r0
            X.1UZ r1 = r3.A05
            if (r1 == 0) goto L_0x04e2
            java.lang.String r0 = "TAP_NUX_CONTINUE"
            r1.A04(r0)
            X.5xy r5 = r3.A03
            if (r5 == 0) goto L_0x04db
            X.01I r7 = r3.A0h()
            if (r7 == 0) goto L_0x04d6
            X.1US r6 = com.whatsapp.xfamily.crossposting.ui.bottomsheet.CrosspostingLinkingDisclosureBottomSheetDialogFragment.A07
            X.7jy r2 = r3.A02
            r0 = 1
            java.lang.StringBuilder r1 = X.C36401kF.A0t(r6, r0)
            java.lang.String r0 = "AccountLinkingLauncher/startAccountLinkingActivityForResult called by caller "
            java.lang.String r1 = X.AnonymousClass000.A0l(r6, r0, r1)
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r5.A00 = r2
            X.17Y r0 = r5.A02
            X.3GB r8 = new X.3GB
            r8.<init>(r0)
            r0 = 2131886346(0x7f12010a, float:1.9407268E38)
            r8.A01(r0)
            X.0wU r0 = r5.A03
            r9 = 20
            X.73N r4 = new X.73N
            r4.<init>(r5, r6, r7, r8, r9)
            r0.Boy(r4)
            r3.A1b()
            return
        L_0x04d6:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()
            throw r0
        L_0x04db:
            java.lang.String r0 = "accountLinkingLauncher"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x04e2:
            java.lang.String r0 = "xFamilyUserFlowLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x04e9:
            android.widget.TextView r1 = r2.A02
            r0 = 2131895118(0x7f12234e, float:1.942506E38)
            goto L_0x0518
        L_0x04ef:
            java.util.regex.Pattern r1 = android.util.Patterns.EMAIL_ADDRESS
            com.whatsapp.twofactor.TwoFactorAuthActivity r0 = r2.A05
            java.lang.String r0 = r0.A04
            boolean r0 = X.C36361kB.A1Z(r0, r1)
            if (r0 == 0) goto L_0x0513
            com.whatsapp.twofactor.TwoFactorAuthActivity r3 = r2.A05
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.lang.String r0 = "type"
            r2.putInt(r0, r4)
            com.whatsapp.twofactor.SetEmailFragment r1 = new com.whatsapp.twofactor.SetEmailFragment
            r1.<init>()
            r1.A17(r2)
            r0 = 1
            r3.A3j(r1, r0)
            return
        L_0x0513:
            android.widget.TextView r1 = r2.A02
            r0 = 2131895115(0x7f12234b, float:1.9425054E38)
        L_0x0518:
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48772i1.A02(android.view.View):void");
    }
}
