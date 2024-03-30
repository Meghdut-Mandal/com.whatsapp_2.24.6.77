package X;

import android.view.View;

/* renamed from: X.80E  reason: invalid class name */
public abstract class AnonymousClass80E extends AnonymousClass0D3 {
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        if (r3.length() == 0) goto L_0x0082;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(X.AnonymousClass9FT r14) {
        /*
            r13 = this;
            boolean r0 = r13 instanceof X.C179548kJ
            if (r0 == 0) goto L_0x003a
            r2 = r13
            X.8kJ r2 = (X.C179548kJ) r2
            X.8k5 r14 = (X.C179408k5) r14
            com.whatsapp.WaImageView r1 = r2.A00
            int r0 = r14.A01
            float r0 = (float) r0
            r1.setRotation(r0)
            android.view.View r5 = r2.A0H
            android.view.ViewGroup$MarginLayoutParams r4 = X.AnonymousClass000.A0a(r5)
            int r1 = r14.A02
            r3 = 0
            if (r1 != 0) goto L_0x0031
            r2 = 0
        L_0x001d:
            int r1 = r14.A00
            if (r1 == 0) goto L_0x0029
            android.content.res.Resources r0 = X.C36341k9.A0F(r5)
            int r3 = r0.getDimensionPixelSize(r1)
        L_0x0029:
            int r1 = r4.leftMargin
            int r0 = r4.rightMargin
            r4.setMargins(r1, r2, r0, r3)
        L_0x0030:
            return
        L_0x0031:
            android.content.res.Resources r0 = X.C36341k9.A0F(r5)
            int r2 = r0.getDimensionPixelSize(r1)
            goto L_0x001d
        L_0x003a:
            boolean r0 = r13 instanceof X.C179538kI
            if (r0 == 0) goto L_0x0055
            r1 = r13
            X.8kI r1 = (X.C179538kI) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r14, r0)
            boolean r0 = r14 instanceof X.C179378k2
            if (r0 == 0) goto L_0x0030
            X.8k2 r14 = (X.C179378k2) r14
            if (r14 == 0) goto L_0x0030
            com.whatsapp.WaTextView r1 = r1.A00
            java.lang.CharSequence r0 = r14.A00
        L_0x0051:
            r1.setText(r0)
            return
        L_0x0055:
            boolean r0 = r13 instanceof X.C179588kN
            if (r0 == 0) goto L_0x00a7
            r5 = r13
            X.8kN r5 = (X.C179588kN) r5
            r4 = 0
            X.AnonymousClass00C.A0D(r14, r4)
            boolean r0 = r14 instanceof X.C179428k7
            if (r0 == 0) goto L_0x0030
            X.8k7 r14 = (X.C179428k7) r14
            if (r14 == 0) goto L_0x0030
            com.whatsapp.WaImageView r2 = r5.A03
            android.content.Context r1 = X.C36441kJ.A0F(r5)
            int r0 = r14.A00
            android.graphics.drawable.Drawable r0 = X.C013105r.A01(r1, r0)
            r2.setImageDrawable(r0)
            java.lang.CharSequence r3 = r14.A03
            if (r3 == 0) goto L_0x0082
            int r0 = r3.length()
            r1 = 0
            if (r0 != 0) goto L_0x0083
        L_0x0082:
            r1 = 1
        L_0x0083:
            r2 = 8
            com.whatsapp.TextEmojiLabel r0 = r5.A02
            if (r1 != 0) goto L_0x00a3
            r0.setVisibility(r4)
            r0.setText(r3)
        L_0x008f:
            com.whatsapp.TextEmojiLabel r1 = r5.A01
            java.lang.CharSequence r0 = r14.A02
            r1.setText(r0)
            android.view.View$OnClickListener r1 = r14.A01
            android.widget.ImageView r0 = r5.A00
            if (r1 == 0) goto L_0x0385
            r0.setVisibility(r4)
            r0.setOnClickListener(r1)
            return
        L_0x00a3:
            r0.setVisibility(r2)
            goto L_0x008f
        L_0x00a7:
            boolean r0 = r13 instanceof X.C179598kO
            if (r0 == 0) goto L_0x0170
            r8 = r13
            X.8kO r8 = (X.C179598kO) r8
            r7 = r14
            X.8k8 r7 = (X.C179438k8) r7
            boolean r0 = r7.A04
            r6 = 8
            r5 = 0
            if (r0 == 0) goto L_0x016a
            com.whatsapp.WaTextView r9 = r8.A02
            r9.setVisibility(r5)
            int r1 = r14.A00
            r0 = 12
            android.view.View r10 = r8.A0H
            android.content.Context r11 = r10.getContext()
            if (r1 == r0) goto L_0x0143
            X.16U r1 = r7.A01
            X.1FR r0 = r8.A03
            int r4 = r7.A00
            X.9Ki r3 = X.C179598kO.A00(r11, r1, r0, r4)
        L_0x00d3:
            android.graphics.drawable.Drawable r1 = r3.A01
            android.content.res.Resources r0 = r10.getResources()
            int r2 = r3.A00
            int r0 = r0.getColor(r2)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass3UF.A08(r1, r0)
            java.lang.String r0 = r3.A02
            java.lang.CharSequence r1 = X.C165597tg.A0a(r1, r9, r0)
            android.text.SpannableStringBuilder r3 = X.C36441kJ.A0P(r1)
            android.content.res.Resources r0 = r10.getResources()
            int r0 = r0.getColor(r2)
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            r2.<init>(r0)
            int r1 = r1.length()
            r0 = 33
            r3.setSpan(r2, r5, r1, r0)
            r9.setText(r3)
            r0 = 3
            r2 = 0
            if (r4 == r0) goto L_0x013b
            r0 = 9
            if (r4 == r0) goto L_0x013b
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131233415(0x7f080a87, float:1.8082967E38)
        L_0x0115:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0BT.A00(r2, r1, r0)
            r9.setBackground(r0)
        L_0x011c:
            java.lang.String r2 = r7.A02
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            com.whatsapp.WaTextView r0 = r8.A01
            if (r1 == 0) goto L_0x0134
            r0.setVisibility(r6)
        L_0x0129:
            android.view.View r1 = r8.A00
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x0130
            r6 = 0
        L_0x0130:
            r1.setVisibility(r6)
            return
        L_0x0134:
            r0.setText(r2)
            r0.setVisibility(r5)
            goto L_0x0129
        L_0x013b:
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131233416(0x7f080a88, float:1.8082969E38)
            goto L_0x0115
        L_0x0143:
            X.1FR r12 = r8.A03
            X.16U r2 = r7.A01
            int r4 = r7.A00
            X.9Ki r3 = X.C179598kO.A00(r11, r2, r12, r4)
            r0 = 1
            if (r4 != r0) goto L_0x00d3
            r1 = 2131102153(0x7f0609c9, float:1.7816736E38)
            r0 = 2131167774(0x7f070a1e, float:1.7949831E38)
            X.1lL r2 = r12.A0J(r11, r2, r1, r0)
            r0 = 2131891894(0x7f1216b6, float:1.941852E38)
            java.lang.String r1 = r11.getString(r0)
            int r0 = r3.A00
            X.9Ki r3 = new X.9Ki
            r3.<init>(r2, r1, r0)
            goto L_0x00d3
        L_0x016a:
            com.whatsapp.WaTextView r0 = r8.A02
            r0.setVisibility(r6)
            goto L_0x011c
        L_0x0170:
            boolean r0 = r13 instanceof X.C179508kF
            if (r0 != 0) goto L_0x0030
            boolean r0 = r13 instanceof X.C179578kM
            if (r0 == 0) goto L_0x01bc
            r7 = r13
            X.8kM r7 = (X.C179578kM) r7
            X.8k3 r14 = (X.C179388k3) r14
            boolean r0 = r14.A01
            r6 = 8
            r1 = 1
            r5 = 0
            if (r0 == 0) goto L_0x01a2
            com.whatsapp.TextEmojiLabel r4 = r7.A01
            X.0wG r0 = r7.A03
            android.content.Context r3 = r0.A00
            r2 = 2131891849(0x7f121689, float:1.941843E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r14.A00
            r1[r5] = r0
            X.C36341k9.A0s(r3, r4, r1, r2)
            android.view.View r0 = r7.A00
            r0.setVisibility(r5)
            com.whatsapp.WaTextView r0 = r7.A02
        L_0x019e:
            r0.setVisibility(r6)
            return
        L_0x01a2:
            com.whatsapp.WaTextView r4 = r7.A02
            X.0wG r3 = r7.A03
            r2 = 2131891883(0x7f1216ab, float:1.9418499E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r14.A00
            r1[r5] = r0
            java.lang.String r0 = r3.A02(r2, r1)
            r4.setText(r0)
            r4.setVisibility(r5)
            android.view.View r0 = r7.A00
            goto L_0x019e
        L_0x01bc:
            boolean r0 = r13 instanceof X.C179498kE
            if (r0 != 0) goto L_0x0030
            boolean r0 = r13 instanceof X.C179568kL
            if (r0 == 0) goto L_0x01f9
            r3 = r13
            X.8kL r3 = (X.C179568kL) r3
            X.2Zv r14 = (X.C46642Zv) r14
            java.util.List r0 = r14.A05
            java.util.Iterator r6 = r0.iterator()
        L_0x01cf:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0389
            java.lang.Object r5 = r6.next()
            X.9tH r5 = (X.C206369tH) r5
            java.lang.String r1 = r5.A0A
            java.lang.String r0 = r14.A03
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01cf
            com.whatsapp.WaTextView r4 = r3.A02
            X.1LB r2 = r3.A03
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            java.lang.String r1 = r5.A09
            java.lang.String r0 = r5.A08
            java.lang.String r0 = X.C165587tf.A0h(r2, r1, r0)
            r4.setText(r0)
            goto L_0x01cf
        L_0x01f9:
            boolean r0 = r13 instanceof X.C179618kQ
            if (r0 == 0) goto L_0x02f4
            r6 = r13
            X.8kQ r6 = (X.C179618kQ) r6
            X.8kA r14 = (X.C179458kA) r14
            X.B1o r0 = r14.A06
            X.9uk r3 = r0.BA8()
            android.widget.LinearLayout r1 = r6.A00
            r5 = 8
            r1.setVisibility(r5)
            r8 = 1
            r4 = 0
            if (r3 == 0) goto L_0x02f0
            X.9ui r0 = r3.A01
            if (r0 == 0) goto L_0x02f0
            X.1EV r2 = r6.A08
            X.0yC r7 = r2.A02
            r0 = 5574(0x15c6, float:7.811E-42)
            boolean r0 = r7.A0E(r0)
            if (r0 != 0) goto L_0x022b
            r0 = 5575(0x15c7, float:7.812E-42)
            boolean r0 = r7.A0E(r0)
            if (r0 == 0) goto L_0x0241
        L_0x022b:
            X.9ui r0 = r3.A01
            java.lang.String r0 = r0.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0241
            r1.setVisibility(r4)
            com.whatsapp.WaTextView r1 = r6.A04
            X.9ui r0 = r3.A01
            java.lang.String r0 = r0.A0C
            r1.setText(r0)
        L_0x0241:
            X.9ui r0 = r3.A01
            java.lang.String r0 = r0.A0E
            boolean r3 = r2.A0I(r0)
            r2 = 1
        L_0x024a:
            boolean r0 = r14.A0A
            if (r0 == 0) goto L_0x02ea
            com.whatsapp.WaTextView r0 = r6.A06
            r0.setVisibility(r5)
            com.whatsapp.WaImageView r1 = r6.A03
            android.graphics.drawable.Drawable r0 = r14.A01
            r1.setImageDrawable(r0)
            r0 = 4
            if (r2 == 0) goto L_0x025e
            r0 = 0
        L_0x025e:
            r1.setVisibility(r0)
            X.9lY r2 = r14.A03
            if (r3 == 0) goto L_0x02d6
            X.C179618kQ.A00(r2, r6)
            X.1EV r0 = r6.A08
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0287
            com.whatsapp.WaTextView r1 = r6.A07
            r0 = 2131892409(0x7f1218b9, float:1.9419565E38)
            r1.setText(r0)
            X.1RJ r2 = r6.A09
            r2.A03(r4)
            r1 = 19
            X.9v0 r0 = new X.9v0
            r0.<init>(r14, r1)
            r2.A05(r0)
        L_0x0287:
            android.widget.LinearLayout r1 = r6.A02
            r1.setVisibility(r4)
            r0 = 20
            X.C36421kH.A12(r1, r14, r0)
        L_0x0291:
            if (r3 != 0) goto L_0x02c8
            java.lang.String r7 = r14.A07
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x02c8
            android.view.View r0 = r6.A0H
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131891852(0x7f12168c, float:1.9418436E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            X.9Hi r0 = r14.A02
            if (r0 == 0) goto L_0x02c6
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x02c6
        L_0x02ae:
            java.lang.String r1 = X.C36411kG.A0w(r3, r0, r1, r4, r2)
        L_0x02b2:
            com.whatsapp.WaTextView r0 = r6.A05
            r0.setText(r1)
            boolean r0 = r14.A09
            if (r0 == 0) goto L_0x03b6
            android.widget.LinearLayout r1 = r6.A01
            r1.setVisibility(r4)
            r0 = 21
            X.C36421kH.A12(r1, r14, r0)
            return
        L_0x02c6:
            r0 = r7
            goto L_0x02ae
        L_0x02c8:
            android.view.View r0 = r6.A0H
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131891853(0x7f12168d, float:1.9418438E38)
            java.lang.String r1 = r1.getString(r0)
            goto L_0x02b2
        L_0x02d6:
            if (r2 == 0) goto L_0x0287
            X.8av r1 = r2.A0A
            if (r1 == 0) goto L_0x0287
            boolean r0 = r1 instanceof X.C175928bI
            if (r0 == 0) goto L_0x0287
            X.8bI r1 = (X.C175928bI) r1
            boolean r0 = r1.A0X
            if (r0 == 0) goto L_0x0287
            X.C179618kQ.A00(r2, r6)
            goto L_0x0287
        L_0x02ea:
            android.widget.LinearLayout r0 = r6.A02
            r0.setVisibility(r5)
            goto L_0x0291
        L_0x02f0:
            r3 = 0
            r2 = 0
            goto L_0x024a
        L_0x02f4:
            boolean r0 = r13 instanceof X.C179558kK
            if (r0 == 0) goto L_0x034b
            r4 = r13
            X.8kK r4 = (X.C179558kK) r4
            X.8k6 r14 = (X.C179418k6) r14
            com.whatsapp.WaImageView r6 = r4.A00
            r5 = 0
            r6.setVisibility(r5)
            X.1Pn r3 = r4.A03
            android.view.View r2 = r4.A0H
            android.content.Context r1 = r2.getContext()
            java.lang.String r0 = "payment-checkout-order-details-view"
            X.1RY r1 = r3.A05(r1, r0)
            X.141 r0 = r14.A00
            X.C18740tg.A06(r0)
            r1.A08(r6, r0)
            java.lang.String r3 = r14.A01
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0333
            android.content.res.Resources r2 = r2.getResources()
            r1 = 2131891877(0x7f1216a5, float:1.9418486E38)
            java.lang.Object[] r0 = X.AnonymousClass001.A0L()
            java.lang.String r0 = X.C36411kG.A0w(r2, r3, r0, r5, r1)
            r6.setContentDescription(r0)
        L_0x0333:
            boolean r0 = r14.A03
            com.whatsapp.WaTextView r1 = r4.A01
            if (r0 == 0) goto L_0x0345
            r1.setVisibility(r5)
            r1.setText(r3)
        L_0x033f:
            com.whatsapp.WaTextView r1 = r4.A02
            java.lang.String r0 = r14.A02
            goto L_0x0051
        L_0x0345:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x033f
        L_0x034b:
            boolean r0 = r13 instanceof X.C179488kD
            if (r0 != 0) goto L_0x0030
            boolean r0 = r13 instanceof X.C179478kC
            if (r0 != 0) goto L_0x0030
            boolean r0 = r13 instanceof X.C179528kH
            if (r0 == 0) goto L_0x0370
            r1 = r13
            X.8kH r1 = (X.C179528kH) r1
            X.8k1 r14 = (X.C179368k1) r14
            java.lang.String r2 = r14.A00
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            android.widget.TextView r1 = r1.A00
            if (r0 != 0) goto L_0x036e
            r1.setText(r2)
            r0 = 0
        L_0x036a:
            r1.setVisibility(r0)
            return
        L_0x036e:
            r0 = 4
            goto L_0x036a
        L_0x0370:
            boolean r0 = r13 instanceof X.C179518kG
            if (r0 == 0) goto L_0x0030
            r1 = r13
            X.8kG r1 = (X.C179518kG) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r14, r0)
            com.whatsapp.payments.ui.widget.ContactMerchantView r1 = r1.A00
            X.8k0 r14 = (X.C179358k0) r14
            X.11F r0 = r14.A00
            r1.A00(r0)
            return
        L_0x0385:
            r0.setVisibility(r2)
            return
        L_0x0389:
            java.lang.String r1 = r14.A03
            java.lang.String r0 = "checkout_lite"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x03a9
            android.widget.ImageView r1 = r3.A01
            r0 = 0
            r1.setVisibility(r0)
            android.view.View r2 = r3.A00
            r2.setVisibility(r0)
            r1 = 21
            X.2iF r0 = new X.2iF
            r0.<init>(r3, r14, r1)
            r2.setOnClickListener(r0)
            return
        L_0x03a9:
            android.view.View r0 = r3.A00
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r3.A01
            r0.setVisibility(r1)
            return
        L_0x03b6:
            android.widget.LinearLayout r0 = r6.A01
            r0.setVisibility(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass80E.A0B(X.9FT):void");
    }

    public AnonymousClass80E(View view) {
        super(view);
    }
}
