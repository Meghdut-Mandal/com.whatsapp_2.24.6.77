package X;

import android.view.View;

/* renamed from: X.7q1  reason: invalid class name and case insensitive filesystem */
public class C163327q1 implements View.OnLayoutChangeListener {
    public Object A00;
    public final int A01;

    public C163327q1(AnonymousClass6SU r1, int i) {
        this.A01 = i;
        if (7 - i != 0) {
            this.A00 = r1;
        } else {
            this.A00 = r1;
        }
    }

    public static void A00(View view, Object obj, int i) {
        view.addOnLayoutChangeListener(new C163327q1(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x017d, code lost:
        r2 = r0.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayoutChange(android.view.View r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23) {
        /*
            r14 = this;
            r9 = r19
            r8 = r18
            r12 = r22
            int r0 = r14.A01
            r6 = r16
            r7 = r17
            r10 = r20
            switch(r0) {
                case 0: goto L_0x0177;
                case 1: goto L_0x015b;
                case 2: goto L_0x0011;
                case 3: goto L_0x0224;
                case 4: goto L_0x0011;
                case 5: goto L_0x0218;
                case 6: goto L_0x00d7;
                case 7: goto L_0x007b;
                case 8: goto L_0x01eb;
                case 9: goto L_0x004e;
                case 10: goto L_0x01d9;
                case 11: goto L_0x001c;
                case 12: goto L_0x01cd;
                case 13: goto L_0x01a2;
                default: goto L_0x0011;
            }
        L_0x0011:
            r15.removeOnLayoutChangeListener(r14)
            java.lang.Object r0 = r14.A00
            com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment r0 = (com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment) r0
            com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment.A05(r0)
        L_0x001b:
            return
        L_0x001c:
            int r0 = r18 - r16
            int r12 = r22 - r20
            if (r0 == r12) goto L_0x001b
            java.lang.Object r5 = r14.A00
            X.5Jf r5 = (X.C106325Jf) r5
            int r0 = r5.getWidth()
            if (r0 <= 0) goto L_0x001b
            com.google.android.material.chip.ChipGroup r4 = r5.A01
            int r0 = r4.getChildCount()
            if (r0 <= 0) goto L_0x001b
            int r3 = r5.getMaxChipWidth()
            if (r3 <= 0) goto L_0x001b
            r2 = 0
            r1 = 0
        L_0x003c:
            int r0 = r4.getChildCount()
            if (r1 >= r0) goto L_0x0236
            android.view.View r0 = r4.getChildAt(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setMaxWidth(r3)
            int r1 = r1 + 1
            goto L_0x003c
        L_0x004e:
            java.lang.Object r0 = r14.A00
            X.6Q0 r0 = (X.AnonymousClass6Q0) r0
            int r12 = r22 - r20
            int r8 = r18 - r16
            if (r12 == r8) goto L_0x001b
            X.4mq r3 = r0.A07
            X.6Q0 r1 = r3.A03
            boolean r2 = r1.A00
            boolean r0 = r1 instanceof X.AnonymousClass5Cv
            if (r0 == 0) goto L_0x0078
            androidx.recyclerview.widget.RecyclerView r0 = r1.A05
            android.content.res.Resources r1 = X.C36341k9.A0F(r0)
            r0 = 2131168321(0x7f070c41, float:1.795094E38)
            if (r2 == 0) goto L_0x0070
            r0 = 2131168320(0x7f070c40, float:1.7950939E38)
        L_0x0070:
            int r0 = r1.getDimensionPixelSize(r0)
            int r8 = r8 / r0
        L_0x0075:
            r3.A01 = r8
            return
        L_0x0078:
            r8 = 8
            goto L_0x0075
        L_0x007b:
            java.lang.Object r5 = r14.A00
            X.6SU r5 = (X.AnonymousClass6SU) r5
            android.widget.TextView r2 = r5.A09
            int r1 = r2.getWidth()
            android.widget.TextView r3 = r5.A08
            int r0 = r3.getWidth()
            if (r1 > r0) goto L_0x008e
            r3 = r2
        L_0x008e:
            int r6 = java.lang.Math.max(r1, r0)
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            int r0 = r2.width
            if (r6 == r0) goto L_0x00a6
            r2.width = r6
            r1 = 47
            X.3vA r0 = new X.3vA
            r0.<init>(r3, r2, r1)
            r3.post(r0)
        L_0x00a6:
            X.1hi r0 = r5.A0F
            boolean r0 = X.C36351kA.A1W(r0)
            if (r0 == 0) goto L_0x001b
            android.view.View r4 = r5.A03
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            int r2 = r6 * 2
            r0 = 2131168308(0x7f070c34, float:1.7950914E38)
            int r1 = X.C36371kC.A03(r4, r0)
            r0 = 2131168301(0x7f070c2d, float:1.79509E38)
            int r0 = X.C36371kC.A03(r4, r0)
            int r1 = r1 + r0
            int r1 = r1 + r2
            int r0 = r3.width
            if (r0 == r1) goto L_0x001b
            r3.width = r1
            r1 = 48
            X.3vA r0 = new X.3vA
            r0.<init>(r5, r3, r1)
            r4.post(r0)
            return
        L_0x00d7:
            java.lang.Object r5 = r14.A00
            X.4aZ r5 = (X.C90694aZ) r5
            android.view.Window r1 = r5.getWindow()
            if (r1 == 0) goto L_0x001b
            r9 = 2
            int[] r7 = new int[r9]
            android.view.ViewGroup r0 = r5.A03
            java.lang.String r8 = "canvas"
            if (r0 != 0) goto L_0x00ef
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x00ef:
            r0.getLocationOnScreen(r7)
            android.view.ViewGroup r0 = r5.A03
            if (r0 != 0) goto L_0x00fb
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x00fb:
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            java.lang.String r3 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            X.AnonymousClass00C.A0E(r4, r3)
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            android.view.WindowManager r0 = r1.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            int r1 = r0.getRotation()
            int r0 = r5.A00
            if (r0 == r1) goto L_0x001b
            r5.A00 = r1
            r2 = 0
            r4.rightMargin = r2
            r4.leftMargin = r2
            r4.topMargin = r2
            r4.bottomMargin = r2
            r6 = 1
            if (r1 == 0) goto L_0x0151
            if (r1 == r6) goto L_0x0147
            if (r1 == r9) goto L_0x013d
            r0 = 3
            if (r1 != r0) goto L_0x0134
            int[] r0 = r5.A0I
            r1 = r0[r2]
            r0 = r7[r2]
            int r1 = r1 - r0
            r4.rightMargin = r1
        L_0x0134:
            android.view.ViewGroup r0 = r5.A03
            if (r0 != 0) goto L_0x0255
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x013d:
            int[] r0 = r5.A0I
            r1 = r0[r6]
            r0 = r7[r6]
            int r1 = r1 - r0
            r4.bottomMargin = r1
            goto L_0x0134
        L_0x0147:
            int[] r0 = r5.A0I
            r1 = r0[r2]
            r0 = r7[r2]
            int r1 = r1 - r0
            r4.leftMargin = r1
            goto L_0x0134
        L_0x0151:
            int[] r0 = r5.A0I
            r1 = r0[r6]
            r0 = r7[r6]
            int r1 = r1 - r0
            r4.topMargin = r1
            goto L_0x0134
        L_0x015b:
            java.lang.Object r1 = r14.A00
            X.6L2 r1 = (X.AnonymousClass6L2) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            int r8 = r18 - r16
            int r9 = r19 - r17
            int r0 = r1.A01
            if (r8 != r0) goto L_0x016f
            int r0 = r1.A00
            if (r9 == r0) goto L_0x001b
        L_0x016f:
            r1.A01 = r8
            r1.A00 = r9
            X.AnonymousClass6L2.A00(r1)
            return
        L_0x0177:
            java.lang.Object r0 = r14.A00
            com.whatsapp.calling.callgrid.view.CallGrid r0 = (com.whatsapp.calling.callgrid.view.CallGrid) r0
            if (r8 == r12) goto L_0x001b
            X.52T r2 = r0.A06
            androidx.recyclerview.widget.RecyclerView r0 = r2.A01
            if (r0 == 0) goto L_0x001b
            int r0 = r0.getWidth()
            if (r0 == 0) goto L_0x018b
            r2.A01 = r0
        L_0x018b:
            r1 = 0
        L_0x018c:
            java.util.List r0 = r2.A08
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x0296
            androidx.recyclerview.widget.RecyclerView r0 = r2.A01
            android.view.View r0 = r0.getChildAt(r1)
            if (r0 == 0) goto L_0x019f
            X.AnonymousClass52T.A00(r0, r2)
        L_0x019f:
            int r1 = r1 + 1
            goto L_0x018c
        L_0x01a2:
            r0 = 0
            X.AnonymousClass00C.A0D(r15, r0)
            r1 = r14
            r15.removeOnLayoutChangeListener(r14)
            boolean r0 = X.C011304x.A03(r15)
            if (r0 == 0) goto L_0x01c6
            boolean r0 = r15.isLayoutRequested()
            if (r0 != 0) goto L_0x01c6
        L_0x01b6:
            r15.addOnLayoutChangeListener(r1)
            java.lang.Object r2 = r14.A00
            r1 = 47
            X.72w r0 = new X.72w
            r0.<init>(r2, r15, r1)
            r15.post(r0)
            return
        L_0x01c6:
            r0 = 4
            X.7qY r1 = new X.7qY
            r1.<init>(r14, r15, r0)
            goto L_0x01b6
        L_0x01cd:
            java.lang.Object r5 = r14.A00
            com.whatsapp.voipcalling.VoipActivityV2 r5 = (com.whatsapp.voipcalling.VoipActivityV2) r5
            r11 = r21
            r13 = r23
            r5.A3u(r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x01d9:
            r15.removeOnLayoutChangeListener(r14)
            java.lang.Object r4 = r14.A00
            com.whatsapp.search.SearchFragment r4 = (com.whatsapp.search.SearchFragment) r4
            r0 = 4
            X.3wZ r5 = new X.3wZ
            r5.<init>((java.lang.Object) r4, (int) r0)
            r10 = 1
            com.whatsapp.search.SearchFragment.A0B(r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x01eb:
            java.lang.Object r0 = r14.A00
            X.6SU r0 = (X.AnonymousClass6SU) r0
            android.view.View r4 = r0.A03
            android.view.ViewGroup$MarginLayoutParams r3 = X.AnonymousClass000.A0a(r4)
            android.view.View r0 = r0.A06
            int r2 = r0.getWidth()
            r0 = 2131168308(0x7f070c34, float:1.7950914E38)
            int r1 = X.C36371kC.A03(r4, r0)
            r0 = 2131168301(0x7f070c2d, float:1.79509E38)
            int r0 = X.C36371kC.A03(r4, r0)
            int r1 = r1 + r0
            int r1 = r1 + r2
            r0 = 0
            r3.setMargins(r0, r0, r0, r0)
            r3.width = r1
            r4.setLayoutParams(r3)
            r4.removeOnLayoutChangeListener(r14)
            return
        L_0x0218:
            r15.removeOnLayoutChangeListener(r14)
            java.lang.Object r1 = r14.A00
            com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment r1 = (com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment) r1
            int r0 = com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment.A03(r1)
            goto L_0x0232
        L_0x0224:
            r15.removeOnLayoutChangeListener(r14)
            java.lang.Object r1 = r14.A00
            com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment r1 = (com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment) r1
            int r0 = com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment.A03(r1)
            com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment.A05(r1)
        L_0x0232:
            com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment.A06(r1, r0)
            return
        L_0x0236:
            int r0 = r5.getWidth()
            int r1 = X.C90504aG.A08(r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            r5.measure(r1, r0)
            r5.removeOnLayoutChangeListener(r14)
            int r0 = r5.getMeasuredHeight()
            int r0 = r0 + r17
            r5.layout(r6, r7, r8, r0)
            r5.addOnLayoutChangeListener(r14)
            return
        L_0x0255:
            r0.setLayoutParams(r4)
            int[] r1 = r5.A0I
            r0 = r1[r2]
            if (r0 != 0) goto L_0x0263
            r0 = r1[r6]
            if (r0 != 0) goto L_0x0263
            return
        L_0x0263:
            android.view.View r0 = r5.A01
            if (r0 != 0) goto L_0x026e
            java.lang.String r0 = "penDoodleTopBar"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x026e:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.AnonymousClass00C.A0E(r1, r3)
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r4.topMargin
            r1.setMargins(r2, r0, r2, r2)
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r0 = r5.A06
            if (r0 != 0) goto L_0x0287
            java.lang.String r0 = "colorPicker"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0287:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.AnonymousClass00C.A0E(r1, r3)
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r4.topMargin
            r1.setMargins(r2, r0, r2, r2)
            return
        L_0x0296:
            r2.A06()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163327q1.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
    }

    public C163327q1(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
