package X;

import android.view.View;

/* renamed from: X.4YA  reason: invalid class name */
public class AnonymousClass4YA implements View.OnLayoutChangeListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4YA(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayoutChange(android.view.View r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.A02
            r2 = r21
            switch(r1) {
                case 0: goto L_0x00cc;
                case 1: goto L_0x0027;
                case 2: goto L_0x0059;
                case 3: goto L_0x00d8;
                case 4: goto L_0x01c0;
                default: goto L_0x0009;
            }
        L_0x0009:
            r2.removeOnLayoutChangeListener(r0)
            java.lang.Object r1 = r0.A00
            android.view.View r1 = (android.view.View) r1
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.A02(r1)
            int r1 = r1.getHeight()
            X.C36351kA.A1G(r3, r1)
            java.lang.Object r2 = r0.A01
            r1 = 1
            X.4Vo r0 = new X.4Vo
            r0.<init>(r2, r3, r1)
            r3.A0Z(r0)
        L_0x0026:
            return
        L_0x0027:
            java.lang.Object r4 = r0.A00
            com.whatsapp.conversation.EditMessageActivity r4 = (com.whatsapp.conversation.EditMessageActivity) r4
            java.lang.Object r6 = r0.A01
            android.content.res.Configuration r6 = (android.content.res.Configuration) r6
            r0 = 2
            X.AnonymousClass00C.A0D(r2, r0)
            android.view.View r0 = r4.A00
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = "footerContainer"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x003e:
            float r5 = r0.getAlpha()
            r0 = 0
            r3 = 0
            r1 = 1
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0026
            int r7 = r29 - r27
            int r0 = r6.keyboard
            if (r0 == r1) goto L_0x0050
            r3 = 1
        L_0x0050:
            int r0 = r2.getHeight()
            if (r0 < r7) goto L_0x01e0
            if (r3 != 0) goto L_0x01e0
            return
        L_0x0059:
            java.lang.Object r5 = r0.A00
            X.3fk r5 = (X.C70803fk) r5
            com.whatsapp.conversation.ConversationListView r6 = r5.A2U
            if (r6 == 0) goto L_0x0026
            X.28d r0 = r5.A2P
            if (r0 == 0) goto L_0x0026
            int r4 = r6.getPaddingLeft()
            int r3 = r5.A05
            X.28d r1 = r5.A2P
            boolean r0 = r1 instanceof X.C43312Gv
            if (r0 == 0) goto L_0x00ca
            X.2Gv r1 = (X.C43312Gv) r1
            X.00T r0 = r1.A04
            android.view.View r0 = X.C36401kF.A0F(r0)
            if (r0 == 0) goto L_0x00ca
            int r2 = r0.getHeight()
            X.01L r0 = r1.A0U
            android.content.res.Resources r1 = r0.getResources()
            X.AnonymousClass00C.A08(r1)
            r0 = 2131165425(0x7f0700f1, float:1.7945067E38)
            int r0 = X.C36441kJ.A06(r1, r0, r2)
        L_0x008f:
            int r3 = r3 + r0
            com.whatsapp.conversation.ConversationListView r0 = r5.A2U
            int r1 = r0.getPaddingRight()
            com.whatsapp.conversation.ConversationListView r0 = r5.A2U
            X.C36421kH.A0y(r0, r6, r4, r3, r1)
            android.view.Window r0 = X.C70803fk.A05(r5)
            android.view.View r4 = X.C36411kG.A0M(r0)
            X.5ND r4 = (X.AnonymousClass5ND) r4
            if (r4 == 0) goto L_0x0026
            int r3 = r4.getPaddingLeft()
            int r2 = r5.A05
            int r1 = r4.getPaddingRight()
            android.view.View r0 = r5.A0C
            int r0 = r0.getHeight()
            r4.setPadding(r3, r2, r1, r0)
            r0 = 0
            r4.A0H(r0)
            com.whatsapp.KeyboardPopupLayout r0 = r5.A1V
            r4.A0F = r0
            X.3u0 r0 = new X.3u0
            r0.<init>(r5)
            r4.A0I = r0
            return
        L_0x00ca:
            r0 = 0
            goto L_0x008f
        L_0x00cc:
            java.lang.Object r1 = r0.A00
            X.2HA r1 = (X.AnonymousClass2HA) r1
            java.lang.Object r0 = r0.A01
            android.view.View r0 = (android.view.View) r0
            r1.setAnchorWidthView(r0)
            return
        L_0x00d8:
            r1 = 0
            X.AnonymousClass00C.A0D(r2, r1)
            java.lang.Object r4 = r0.A01
            X.2ev r4 = (X.C47532ev) r4
            java.lang.Object r3 = r0.A00
            X.3cT[] r3 = (X.C68793cT[]) r3
            r3 = r3[r1]
            X.AnonymousClass00C.A05(r3)
            java.lang.String r6 = r3.A04
            boolean r8 = r3.A06
            X.1e6 r7 = r4.A08
            X.2bV r5 = r4.A0C
            X.11F r3 = r5.A0J()
            java.util.Set r3 = r7.BFr(r3, r5, r6)
            if (r3 == 0) goto L_0x0109
            X.3Jy r1 = r4.A0D
            r1.A01()
            X.3G7 r1 = r4.A05
            r1.A01()
        L_0x0105:
            r2.removeOnLayoutChangeListener(r0)
            return
        L_0x0109:
            X.1ok r3 = r4.A0E
            androidx.cardview.widget.CardView r7 = r3.getWebPagePreviewContainer()
            r4.A01 = r7
            r3 = 3
            if (r8 == 0) goto L_0x0115
            r3 = 2
        L_0x0115:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.A03 = r3
            r7.setVisibility(r1)
            r3 = 2131435342(0x7f0b1f4e, float:1.8492523E38)
            android.view.View r12 = r7.findViewById(r3)
            r3 = 2131431195(0x7f0b0f1b, float:1.8484112E38)
            android.view.View r9 = X.C36361kB.A0G(r12, r3)
            com.whatsapp.webpagepreview.WebPagePreviewView r9 = (com.whatsapp.webpagepreview.WebPagePreviewView) r9
            r3 = 2131431193(0x7f0b0f19, float:1.8484108E38)
            android.view.View r11 = X.C36361kB.A0G(r9, r3)
            X.1DU r7 = r4.A0B
            java.lang.String r3 = r5.A1Y()
            java.lang.String r7 = r7.A03(r3)
            boolean r3 = X.AnonymousClass00C.A0J(r6, r7)
            if (r3 == 0) goto L_0x01b3
            r4.A04 = r6
            X.AnonymousClass00C.A0B(r12)
            X.3Z1 r10 = new X.3Z1
            r13 = r4
            r14 = r9
            r15 = r8
            r10.<init>(r11, r12, r13, r14, r15)
            boolean r3 = X.C63933Lz.A01(r7)
            if (r3 != 0) goto L_0x01b0
            X.1DW r3 = r4.A09
            boolean r3 = r3.A0F(r7)
            if (r3 != 0) goto L_0x01b0
            com.whatsapp.WaTextView r3 = r9.A0F
        L_0x0162:
            r3.addOnLayoutChangeListener(r10)
            X.1EM r3 = r4.A0F
            boolean r19 = r3.A01()
            com.whatsapp.components.button.ThumbnailButton r4 = r9.A0I
            r3 = 0
            r4.setImageDrawable(r3)
            com.whatsapp.components.button.ThumbnailButton r4 = r9.A0I
            r3 = 8
            X.C38381od.A00(r4, r9, r3)
            X.1DU r4 = r9.A0N
            java.lang.String r3 = r5.A1Y()
            java.lang.String r14 = r4.A03(r3)
            java.lang.String r13 = r5.A06
            boolean r3 = android.text.TextUtils.isEmpty(r13)
            if (r3 == 0) goto L_0x018b
            r13 = r14
        L_0x018b:
            X.1e6 r4 = r9.A0K
            com.whatsapp.jid.UserJid r3 = r5.A0L()
            java.util.Set r4 = r4.BFr(r3, r5, r6)
            java.lang.String r11 = r5.A05
            java.lang.String r12 = r5.A04
            int r3 = r5.A00
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            boolean r17 = X.AnonymousClass000.A1V(r4)
            r15 = 0
            r16 = -1
            r18 = 0
            com.whatsapp.webpagepreview.WebPagePreviewView.A0A(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x01ab:
            r9.setVisibility(r1)
            goto L_0x0105
        L_0x01b0:
            com.whatsapp.WaTextView r3 = r9.A0D
            goto L_0x0162
        L_0x01b3:
            X.3Jy r1 = r4.A0D
            r1.A01()
            X.3G7 r1 = r4.A05
            r1.A01()
            r1 = 8
            goto L_0x01ab
        L_0x01c0:
            r2.removeOnLayoutChangeListener(r0)
            java.lang.Object r1 = r0.A00
            android.view.View r1 = (android.view.View) r1
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.A02(r1)
            java.lang.Object r0 = r0.A01
            X.02E r0 = (X.AnonymousClass02E) r0
            android.view.View r0 = r0.A0F
            if (r0 == 0) goto L_0x01db
            int r0 = r0.getHeight()
        L_0x01d7:
            X.C36351kA.A1G(r1, r0)
            return
        L_0x01db:
            int r0 = r1.A0S()
            goto L_0x01d7
        L_0x01e0:
            android.view.View r1 = r4.A00
            java.lang.String r3 = "footerContainer"
            if (r1 != 0) goto L_0x01eb
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x01eb:
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            android.view.View r0 = r4.A00
            if (r0 != 0) goto L_0x01f9
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x01f9:
            float r1 = X.C36441kJ.A02(r0)
            r0 = 0
            android.view.animation.TranslateAnimation r2 = new android.view.animation.TranslateAnimation
            r2.<init>(r0, r0, r1, r0)
            android.view.animation.Interpolator r0 = X.C56812wv.A00
            r2.setInterpolator(r0)
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            android.view.View r0 = r4.A00
            if (r0 != 0) goto L_0x0216
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x0216:
            r0.startAnimation(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4YA.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
    }
}
