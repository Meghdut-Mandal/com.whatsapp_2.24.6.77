package X;

import android.view.View;

/* renamed from: X.6UI  reason: invalid class name */
public class AnonymousClass6UI implements View.OnTouchListener {
    public Object A00;
    public final int A01;

    public AnonymousClass6UI(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnTouchListener(new AnonymousClass6UI(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        if (r1 != 1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r15.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (r1.A04.getVisibility() != 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        org.npci.upi.security.pinactivitycomponent.GetCredential.A07(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0081, code lost:
        r0.setVisibility(r3);
        ((com.whatsapp.components.AnimatingArrowsLayout) r0).A03.start();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r16, android.view.MotionEvent r17) {
        /*
            r15 = this;
            int r0 = r15.A01
            r2 = r16
            r5 = r17
            switch(r0) {
                case 0: goto L_0x028e;
                case 1: goto L_0x0283;
                case 2: goto L_0x0302;
                case 3: goto L_0x02f6;
                case 4: goto L_0x01f5;
                case 5: goto L_0x02e8;
                case 6: goto L_0x02bc;
                case 7: goto L_0x008c;
                case 8: goto L_0x02c5;
                case 9: goto L_0x006b;
                case 10: goto L_0x0054;
                case 11: goto L_0x0032;
                case 12: goto L_0x002c;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r3 = r15.A00
            X.4fl r3 = (X.C93104fl) r3
            X.7dR r0 = r3.A0H
            if (r0 == 0) goto L_0x002a
            int r1 = r5.getAction()
            r0 = 1
            if (r1 != r0) goto L_0x002a
            X.7dR r2 = r3.A0H
            int r1 = r3.A01
            org.npci.upi.security.pinactivitycomponent.w r2 = (org.npci.upi.security.pinactivitycomponent.w) r2
            java.util.ArrayList r0 = r2.A04
            java.lang.Object r0 = r0.get(r1)
            boolean r0 = r0 instanceof X.C92944fC
            if (r0 != 0) goto L_0x002a
            r2.A07 = r1
        L_0x002a:
            r0 = 0
            return r0
        L_0x002c:
            int r1 = r5.getAction()
            r2 = 0
            goto L_0x0040
        L_0x0032:
            int r1 = r2.getId()
            r0 = 2131434847(0x7f0b1d5f, float:1.849152E38)
            r2 = 0
            if (r1 != r0) goto L_0x002a
            int r1 = r5.getAction()
        L_0x0040:
            r0 = 1
            if (r1 != r0) goto L_0x002a
            java.lang.Object r1 = r15.A00
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            android.view.View r0 = r1.A04
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x002a
            org.npci.upi.security.pinactivitycomponent.GetCredential.A07(r1, r2)
            goto L_0x0314
        L_0x0054:
            java.lang.Object r2 = r15.A00
            com.whatsapp.voipcalling.VoipCallAnswerCallView r2 = (com.whatsapp.voipcalling.VoipCallAnswerCallView) r2
            int r1 = r5.getAction()
            r3 = 0
            if (r1 == 0) goto L_0x0063
            r0 = 5
            if (r1 == r0) goto L_0x0063
            goto L_0x002a
        L_0x0063:
            android.widget.TextView r0 = r2.A08
            r0.setVisibility(r3)
            android.view.View r0 = r2.A02
            goto L_0x0081
        L_0x006b:
            java.lang.Object r2 = r15.A00
            com.whatsapp.voipcalling.VoipCallAnswerCallView r2 = (com.whatsapp.voipcalling.VoipCallAnswerCallView) r2
            int r1 = r5.getAction()
            r3 = 0
            if (r1 == 0) goto L_0x007a
            r0 = 5
            if (r1 == r0) goto L_0x007a
            goto L_0x002a
        L_0x007a:
            android.widget.TextView r0 = r2.A07
            r0.setVisibility(r3)
            android.view.View r0 = r2.A01
        L_0x0081:
            r0.setVisibility(r3)
            com.whatsapp.components.AnimatingArrowsLayout r0 = (com.whatsapp.components.AnimatingArrowsLayout) r0
            android.animation.AnimatorSet r0 = r0.A03
            r0.start()
            goto L_0x002a
        L_0x008c:
            java.lang.Object r0 = r15.A00
            X.4mf r0 = (X.C96024mf) r0
            X.4R3 r6 = r0.A0C
            X.6vx r6 = (X.C146656vx) r6
            r8 = 0
            if (r17 == 0) goto L_0x002a
            int r1 = r5.getAction()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r7 = 0
            if (r0 == 0) goto L_0x002a
            if (r1 != 0) goto L_0x00b2
            float r0 = r5.getX()
            r6.A00 = r0
            float r0 = r5.getY()
        L_0x00ae:
            r6.A01 = r0
            goto L_0x002a
        L_0x00b2:
            r4 = 1
            if (r1 == r4) goto L_0x01ea
            r0 = 3
            if (r1 == r0) goto L_0x01ea
            r0 = 2
            if (r1 != r0) goto L_0x002a
            X.5z8 r12 = r6.A08
            android.view.View r0 = r12.A06
            if (r0 != 0) goto L_0x002a
            androidx.recyclerview.widget.RecyclerView r0 = r6.A05
            X.0CP r1 = r0.getLayoutManager()
            if (r1 == 0) goto L_0x002a
            boolean r0 = r6.A0A
            if (r0 != 0) goto L_0x002a
            boolean r0 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x01e1
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
        L_0x00d3:
            float r3 = r6.A01
            float r0 = r5.getY()
            float r3 = r3 - r0
            float r10 = r6.A00
            float r0 = r5.getX()
            float r10 = r10 - r0
            r9 = 0
            int r0 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x01d3
            if (r1 == 0) goto L_0x00f9
            int r1 = r1.A1U()
            X.4mf r0 = r6.A09
            int r0 = r0.A0J()
            int r0 = r0 - r4
            if (r1 >= r0) goto L_0x00f9
            float r9 = java.lang.Math.abs(r10)
        L_0x00f9:
            android.content.Context r0 = r6.A04
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165443(0x7f070103, float:1.7945103E38)
            float r1 = r1.getDimension(r0)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01e4
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x002a
            boolean r0 = r2 instanceof X.AnonymousClass5CN
            if (r0 == 0) goto L_0x0115
            r8 = r2
            X.5CN r8 = (X.AnonymousClass5CN) r8
        L_0x0115:
            com.whatsapp.gallerypicker.PhotoViewPager r9 = r6.A07
            float r10 = r5.getX()
            float r5 = r5.getY()
            r12.A06 = r8
            android.net.Uri r0 = r8.getUri()
            r12.A04 = r0
            android.widget.ImageView r3 = r12.A09
            android.graphics.drawable.Drawable r0 = r8.getDrawable()
            r3.setImageDrawable(r0)
            int r0 = r8.getWidth()
            r3.setMaxWidth(r0)
            int r0 = r8.getHeight()
            r3.setMaxHeight(r0)
            int r2 = r8.getWidth()
            int r1 = r8.getHeight()
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r2, r1)
            r3.setLayoutParams(r0)
            r12.A00 = r10
            r12.A01 = r5
            android.view.View r0 = r12.A06
            r0.invalidate()
            android.os.Handler r3 = r12.A0C
            java.lang.Runnable r2 = r12.A0D
            r3.removeCallbacks(r2)
            r0 = 100
            r3.postDelayed(r2, r0)
            android.view.View r11 = r12.A05
            r11.setBackgroundColor(r7)
            android.widget.TextView r10 = r12.A0A
            r10.setTextColor(r7)
            android.graphics.drawable.Drawable r0 = r12.A03
            r0.setAlpha(r7)
            android.view.ViewGroup r13 = r12.A08
            r13.setVisibility(r7)
            android.view.ViewGroup r5 = r12.A07
            int[] r3 = r12.A0E
            r5.getLocationOnScreen(r3)
            r14 = r3[r7]
            r2 = r3[r4]
            android.view.View r0 = r12.A06
            r0.getLocationOnScreen(r3)
            r1 = r3[r7]
            int r1 = r1 - r14
            r0 = r3[r4]
            int r0 = r0 - r2
            r5.setPadding(r1, r0, r7, r7)
            int r1 = r13.getHeight()
            int r0 = r9.getHeight()
            int r1 = r1 - r0
            r11.setPadding(r7, r7, r7, r1)
            r10.getLocationOnScreen(r3)
            X.4nU r0 = r8.A05
            if (r0 == 0) goto L_0x002a
            int r0 = r0.A04()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r3 = r0.intValue()
            X.7cs r2 = r6.A03
            if (r2 == 0) goto L_0x002a
            com.whatsapp.mediacomposer.MediaComposerActivity r2 = (com.whatsapp.mediacomposer.MediaComposerActivity) r2
            X.6VT r1 = r2.A0s
            int r0 = r1.A01
            boolean r0 = X.C111075bh.A00(r0)
            if (r0 != 0) goto L_0x002a
            r2.A1Z = r4
            X.00s r0 = r1.A03
            int r0 = X.C36341k9.A07(r0)
            if (r0 == r3) goto L_0x002a
            X.6VT r0 = r2.A0s
            r0.A09(r3)
            X.C146636vv.A00(r2)
            goto L_0x002a
        L_0x01d3:
            if (r1 == 0) goto L_0x00f9
            int r0 = r1.A1S()
            if (r0 <= 0) goto L_0x00f9
            float r9 = java.lang.Math.abs(r10)
            goto L_0x00f9
        L_0x01e1:
            r1 = r8
            goto L_0x00d3
        L_0x01e4:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.A00 = r0
            goto L_0x00ae
        L_0x01ea:
            X.5z8 r0 = r6.A08
            android.os.Handler r1 = r0.A0C
            java.lang.Runnable r0 = r0.A0D
            r1.removeCallbacks(r0)
            goto L_0x002a
        L_0x01f5:
            java.lang.Object r4 = r15.A00
            X.6YT r4 = (X.AnonymousClass6YT) r4
            java.util.HashMap r0 = X.AnonymousClass6WU.A0N
            int r3 = r5.getActionMasked()
            X.7m8 r0 = r4.A0C
            boolean r0 = r0.BMx()
            r6 = 0
            if (r0 == 0) goto L_0x027f
            r1 = 1
            if (r3 != r1) goto L_0x0227
            boolean r0 = r4.A0S()
            if (r0 == 0) goto L_0x002a
            X.6Dz r0 = r4.A0g
            int r1 = r0.A00
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            if (r0 != 0) goto L_0x002a
            X.6OO r0 = r4.A0I
            boolean r0 = r0.A02()
            X.AnonymousClass6YT.A0L(r4, r0)
            goto L_0x002a
        L_0x0227:
            r2 = 2
            if (r3 != r2) goto L_0x026e
            int r0 = r5.getPointerCount()
            if (r0 != r1) goto L_0x026e
            X.6Dz r0 = r4.A0g
            int r0 = r0.A00
            boolean r0 = X.AnonymousClass000.A1S(r0, r2)
            if (r0 != 0) goto L_0x002a
            r4.A0T = r6
            float r1 = r5.getY()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x002a
            X.7m8 r0 = r4.A0C
            int r3 = r0.getMaxZoom()
            if (r3 <= 0) goto L_0x002a
            android.view.View r0 = r4.A08
            int r0 = r0.getHeight()
            int r0 = r0 / r2
            float r2 = (float) r0
            float r0 = r5.getY()
            float r0 = -r0
            float r1 = java.lang.Math.min(r2, r0)
            float r1 = r1 / r2
            float r0 = (float) r3
            float r0 = r0 * r1
            int r1 = (int) r0
            if (r1 <= 0) goto L_0x0265
            r6 = 1
        L_0x0265:
            r4.A0T = r6
            X.7m8 r0 = r4.A0C
            r0.Bso(r1)
            goto L_0x002a
        L_0x026e:
            int r0 = r5.getPointerCount()
            if (r0 <= r1) goto L_0x002a
            boolean r0 = r4.A0T
            if (r0 != 0) goto L_0x002a
            android.view.View r0 = r4.A08
            r0.onTouchEvent(r5)
            goto L_0x002a
        L_0x027f:
            r4.A0T = r6
            goto L_0x002a
        L_0x0283:
            java.lang.Object r1 = r15.A00
            X.52b r1 = (X.C1028252b) r1
            android.view.View r0 = r1.A0A
            r1.A0E(r5, r0)
            goto L_0x002a
        L_0x028e:
            java.lang.Object r7 = r15.A00
            X.4tC r7 = (X.C99384tC) r7
            int r0 = r5.getAction()
            r6 = 0
            r5 = 1
            if (r0 != r5) goto L_0x002a
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r7.A00
            long r3 = r3 - r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x02ad
            r1 = 300(0x12c, double:1.48E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x02af
        L_0x02ad:
            r7.A05 = r6
        L_0x02af:
            X.C99384tC.A00(r7)
            r7.A05 = r5
            long r0 = java.lang.System.currentTimeMillis()
            r7.A00 = r0
            goto L_0x002a
        L_0x02bc:
            java.lang.Object r0 = r15.A00
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = (com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView) r0
            boolean r0 = com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView.A09(r5, r0)
            return r0
        L_0x02c5:
            java.lang.Object r0 = r15.A00
            X.4aZ r0 = (X.C90694aZ) r0
            X.6OU r4 = r0.A07
            if (r4 != 0) goto L_0x02d4
            java.lang.String r0 = "penDialogController"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02d4:
            X.5mG r0 = r4.A08
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r0.A00
            r0.invalidate()
            X.64m r3 = r4.A09
            int r2 = r4.A00
            int r0 = r4.A01
            float r1 = (float) r0
            boolean r0 = r4.A03
            r3.A00(r5, r1, r2, r0)
            goto L_0x0314
        L_0x02e8:
            java.lang.Object r1 = r15.A00
            X.0Th r1 = (X.C06360Th) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            if (r17 == 0) goto L_0x0314
            r1.A00(r5)
            goto L_0x0314
        L_0x02f6:
            java.lang.Object r1 = r15.A00
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r1 = (com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator) r1
            int r0 = r5.getAction()
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator.A01(r1, r0)
            goto L_0x0314
        L_0x0302:
            java.lang.Object r0 = r15.A00
            X.5wD r0 = (X.C123265wD) r0
            r2.performClick()
            android.widget.PopupWindow r1 = r0.A01
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto L_0x0314
            r1.dismiss()
        L_0x0314:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6UI.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
