package com.whatsapp.conversation.gesture;

import X.AnonymousClass7gP;
import X.C117115lj;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.whatsapp.gesture.VerticalSwipeDownBehavior;

public class VerticalSwipeToRevealBehavior extends VerticalSwipeDownBehavior {
    public float A00 = Float.MIN_VALUE;
    public AnonymousClass7gP A01;
    public final int A02;
    public final int A03;
    public final View A04;
    public final FrameLayout A05;
    public final LinearLayout A06;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0062, code lost:
        if (r9 < 0.0f) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(com.whatsapp.conversation.gesture.VerticalSwipeToRevealBehavior r8, float r9, int r10) {
        /*
            android.widget.FrameLayout r5 = r8.A05
            if (r5 == 0) goto L_0x0076
            android.view.View r4 = r8.A04
            if (r4 == 0) goto L_0x0076
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            r0 = 1
            r2 = 0
            if (r10 == r0) goto L_0x007a
            X.7gP r0 = r8.A01
            X.7tE r0 = (X.C165317tE) r0
            java.lang.Object r7 = r0.A00
            com.whatsapp.conversationslist.ConversationsFragment r7 = (com.whatsapp.conversationslist.ConversationsFragment) r7
            X.1Ri r0 = r7.A2A
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0047
            X.15b r6 = r7.A1c()
            java.util.Random r0 = r7.A3h
            long r0 = r0.nextLong()
            r6.A00 = r0
            X.1U5 r6 = r7.A1U
            X.15b r0 = r7.A1c()
            long r0 = r0.A00
            r6.A01(r0)
            X.01I r6 = r7.A0i()
            X.0yb r1 = r7.A1d
            r0 = 2131886174(0x7f12005e, float:1.940692E38)
            java.lang.String r0 = r7.A0n(r0)
            X.C33521fV.A00(r6, r1, r0)
        L_0x0047:
            float r0 = r8.A00
            float r9 = r9 - r0
            int r1 = (int) r9
            int r0 = r8.A03
            if (r1 < r0) goto L_0x0077
            int r0 = r8.A02
            float r9 = (float) r0
            android.widget.LinearLayout r0 = r8.A06
            if (r0 == 0) goto L_0x0060
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.0Ak r1 = (X.C02460Ak) r1
            r0 = 0
            r1.A00(r0)
        L_0x0060:
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0078
        L_0x0064:
            int r0 = r8.A02
            float r1 = (float) r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x006c
            r2 = r1
        L_0x006c:
            int r0 = (int) r2
            r3.height = r0
            r5.setLayoutParams(r3)
            float r2 = r2 - r1
            r4.setTranslationY(r2)
        L_0x0076:
            return
        L_0x0077:
            r9 = 0
        L_0x0078:
            r2 = r9
            goto L_0x0064
        L_0x007a:
            float r0 = r8.A00
            float r9 = r9 - r0
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.gesture.VerticalSwipeToRevealBehavior.A00(com.whatsapp.conversation.gesture.VerticalSwipeToRevealBehavior, float, int):void");
    }

    public VerticalSwipeToRevealBehavior(Context context, View view, FrameLayout frameLayout, LinearLayout linearLayout, AnonymousClass7gP r6, int i) {
        super(context);
        this.A04 = view;
        this.A06 = linearLayout;
        this.A05 = frameLayout;
        this.A02 = i;
        this.A01 = r6;
        this.A03 = i / 2;
        this.A01 = new C117115lj(this);
    }
}
