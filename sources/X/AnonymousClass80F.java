package X;

import android.view.View;

/* renamed from: X.80F  reason: invalid class name */
public abstract class AnonymousClass80F extends AnonymousClass0D3 {
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0668  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(X.AnonymousClass9FU r19, int r20) {
        /*
            r18 = this;
            r0 = r19
            r1 = r18
            boolean r2 = r1 instanceof X.C179728kb
            if (r2 != 0) goto L_0x0030
            boolean r2 = r1 instanceof X.C179838km
            if (r2 == 0) goto L_0x0031
            X.8km r1 = (X.C179838km) r1
            X.8l7 r0 = (X.C180048l7) r0
            android.widget.TextView r4 = r1.A01
            java.lang.String r2 = r0.A01
            r4.setText(r2)
            java.lang.String r2 = r0.A01
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 8
            if (r2 == 0) goto L_0x0024
            r4.setVisibility(r3)
        L_0x0024:
            com.whatsapp.WaImageView r2 = r1.A02
            r2.setVisibility(r3)
            android.view.View r1 = r1.A00
            android.view.View$OnClickListener r0 = r0.A00
        L_0x002d:
            r1.setOnClickListener(r0)
        L_0x0030:
            return
        L_0x0031:
            boolean r2 = r1 instanceof X.C179788kh
            if (r2 == 0) goto L_0x0076
            X.8kh r1 = (X.C179788kh) r1
            X.8lE r0 = (X.C180118lE) r0
            android.widget.TextView r3 = r1.A01
            java.lang.String r2 = r0.A04
            r3.setText(r2)
            android.widget.TextView r5 = r1.A00
            java.lang.String r2 = r0.A03
            r5.setText(r2)
            android.view.View r4 = r1.A0H
            android.content.res.Resources r1 = X.C36341k9.A0F(r4)
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.getLayoutDirection()
            boolean r3 = X.AnonymousClass000.A1O(r1)
            android.graphics.drawable.Drawable r2 = r0.A00
            if (r2 == 0) goto L_0x0063
            r1 = 0
            if (r3 == 0) goto L_0x0072
            r5.setCompoundDrawables(r1, r1, r2, r1)
        L_0x0063:
            android.view.View$OnClickListener r1 = r0.A01
            if (r1 == 0) goto L_0x006a
            r4.setOnClickListener(r1)
        L_0x006a:
            android.view.View$OnLongClickListener r0 = r0.A02
            if (r0 == 0) goto L_0x0030
            r4.setOnLongClickListener(r0)
            return
        L_0x0072:
            r5.setCompoundDrawables(r2, r1, r1, r1)
            goto L_0x0063
        L_0x0076:
            boolean r2 = r1 instanceof X.C179908kt
            if (r2 == 0) goto L_0x0142
            X.8kt r1 = (X.C179908kt) r1
            X.8lH r0 = (X.C180148lH) r0
            com.whatsapp.WaTextView r5 = r1.A05
            android.graphics.drawable.Drawable r4 = r5.getBackground()
            android.content.Context r8 = r1.A00
            android.content.res.Resources r3 = r8.getResources()
            int r2 = r0.A02
            int r3 = r3.getColor(r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r4.setColorFilter(r3, r2)
            java.lang.CharSequence r2 = r0.A04
            r5.setText(r2)
            java.lang.CharSequence r2 = r0.A05
            r5.setContentDescription(r2)
            float r3 = r0.A00
            r2 = 0
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00a9
            r5.setTextSize(r3)
        L_0x00a9:
            int r2 = r0.A01
            com.whatsapp.WaTextView r4 = r1.A06
            if (r2 == 0) goto L_0x012f
            X.C33511fU.A03(r4)
            int r2 = r0.A01
            r4.setText(r2)
            android.content.res.Resources r3 = r8.getResources()
            int r2 = r0.A02
            X.C36351kA.A15(r3, r4, r2)
            java.lang.CharSequence r2 = r0.A07
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00cf
            android.widget.TextView r3 = r1.A03
            java.lang.CharSequence r2 = r0.A07
        L_0x00cc:
            r3.setText(r2)
        L_0x00cf:
            java.lang.String r2 = r0.A0B
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r4 = 0
            com.whatsapp.TextEmojiLabel r7 = r1.A04
            if (r2 != 0) goto L_0x012c
            X.0yC r2 = r1.A08
            X.C36331k8.A1A(r2, r7)
            X.0yb r2 = r1.A07
            X.C36331k8.A16(r7, r2)
            java.lang.String r6 = r0.A0B
            java.util.Map r5 = r0.A0C
            android.content.res.Resources r3 = r8.getResources()
            int r2 = X.C36341k9.A05(r8)
            int r3 = r3.getColor(r2)
            r2 = 0
            android.text.SpannableStringBuilder r2 = X.AnonymousClass3LN.A00(r2, r6, r5, r3, r4)
        L_0x00f9:
            r7.setText(r2)
            java.lang.CharSequence r2 = r0.A09
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r7 = 8
            android.widget.TextView r3 = r1.A02
            if (r2 != 0) goto L_0x0128
            java.lang.CharSequence r2 = r0.A09
            r3.setText(r2)
            r3.setVisibility(r4)
        L_0x0110:
            java.lang.CharSequence r2 = r0.A08
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0668
            android.widget.TextView r2 = r1.A01
            java.lang.CharSequence r1 = r0.A08
            r2.setText(r1)
            r2.setVisibility(r4)
            android.view.View$OnClickListener r0 = r0.A03
            r2.setOnClickListener(r0)
            return
        L_0x0128:
            r3.setVisibility(r7)
            goto L_0x0110
        L_0x012c:
            java.lang.CharSequence r2 = r0.A0A
            goto L_0x00f9
        L_0x012f:
            r4.A0C()
            java.lang.CharSequence r2 = r0.A06
            r4.setText(r2)
            r2 = 2131102240(0x7f060a20, float:1.7816912E38)
            X.C36331k8.A0r(r8, r4, r2)
            android.widget.TextView r3 = r1.A03
            java.lang.String r2 = ""
            goto L_0x00cc
        L_0x0142:
            boolean r2 = r1 instanceof X.C179868kp
            if (r2 == 0) goto L_0x016f
            X.8kp r1 = (X.C179868kp) r1
            X.8l6 r0 = (X.C180038l6) r0
            android.content.Context r3 = r1.A01
            X.7va r2 = new X.7va
            r2.<init>(r3, r0)
            android.widget.ListView r5 = r1.A03
            r5.setAdapter(r2)
            boolean r0 = r0.A01
            r4 = 0
            r3 = 8
            if (r0 == 0) goto L_0x0636
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0636
            android.view.View r2 = r1.A02
            r2.setVisibility(r4)
            r5.setVisibility(r3)
            r0 = 22
            X.C36421kH.A12(r2, r1, r0)
            return
        L_0x016f:
            boolean r2 = r1 instanceof X.C179778kg
            if (r2 == 0) goto L_0x017d
            X.8kg r1 = (X.C179778kg) r1
            X.8l3 r0 = (X.C180008l3) r0
            com.whatsapp.wds.components.button.WDSButton r1 = r1.A00
            android.view.View$OnClickListener r0 = r0.A00
            goto L_0x002d
        L_0x017d:
            boolean r2 = r1 instanceof X.C179828kl
            if (r2 == 0) goto L_0x01b9
            X.8kl r1 = (X.C179828kl) r1
            X.8l9 r0 = (X.C180068l9) r0
            android.widget.LinearLayout r3 = r1.A01
            android.view.View$OnClickListener r2 = r0.A00
            r3.setOnClickListener(r2)
            android.widget.ImageView r4 = r1.A00
            android.content.Context r3 = r4.getContext()
            r2 = 2131102239(0x7f060a1f, float:1.781691E38)
            X.C90504aG.A11(r3, r4, r2)
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0030
            com.whatsapp.WaTextView r1 = r1.A02
            r0 = 2131892409(0x7f1218b9, float:1.9419565E38)
            r1.setText(r0)
            android.content.Context r1 = r4.getContext()
            r0 = 2131232364(0x7f08066c, float:1.8080835E38)
            X.C36391kE.A18(r1, r4, r0)
            android.content.Context r1 = r4.getContext()
            r0 = 2131101905(0x7f0608d1, float:1.7816233E38)
            X.C90504aG.A11(r1, r4, r0)
            return
        L_0x01b9:
            boolean r2 = r1 instanceof X.C179918ku
            if (r2 == 0) goto L_0x02ca
            X.8ku r1 = (X.C179918ku) r1
            X.8lG r0 = (X.C180138lG) r0
            java.lang.String r2 = r0.A09
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r4 = 8
            if (r2 != 0) goto L_0x02c3
            android.widget.TextView r3 = r1.A06
            java.lang.String r2 = r0.A09
            r3.setText(r2)
            android.widget.TextView r3 = r1.A05
            java.lang.String r2 = r0.A08
            r3.setText(r2)
            java.lang.String r2 = r0.A0A
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x01e8
            android.widget.TextView r3 = r1.A07
            java.lang.String r2 = r0.A0A
            r3.setText(r2)
        L_0x01e8:
            X.141 r2 = r0.A05
            if (r2 == 0) goto L_0x02b8
            X.1Pn r5 = r1.A0C
            android.content.Context r3 = r1.A00
            java.lang.String r2 = "payment-transaction-payee-payer-detail"
            X.1RY r3 = r5.A05(r3, r2)
            X.141 r2 = r0.A05
            android.widget.ImageView r6 = r1.A02
            r3.A08(r6, r2)
        L_0x01fd:
            android.view.View$OnClickListener r3 = r0.A04
            r5 = 0
            if (r3 == 0) goto L_0x02b0
            android.widget.RelativeLayout r2 = r1.A04
            r2.setOnClickListener(r3)
            com.whatsapp.WaImageView r2 = r1.A09
            r2.setVisibility(r5)
        L_0x020c:
            int r2 = r0.A01
            r6.setVisibility(r2)
            android.widget.ProgressBar r3 = r1.A03
            int r2 = r0.A02
            r3.setVisibility(r2)
            java.lang.String r2 = r0.A07
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0263
            java.lang.String r2 = r0.A06
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0263
            X.1e1 r6 = r1.A0F
            com.whatsapp.TextEmojiLabel r3 = r1.A08
            android.content.Context r7 = r3.getContext()
            java.lang.String r8 = r0.A07
            java.lang.String r2 = "incentive-blurb-cashback-help"
            java.lang.String[] r10 = new java.lang.String[]{r2}
            r4 = 1
            java.lang.String[] r11 = new java.lang.String[r4]
            X.1N3 r2 = r1.A0A
            java.lang.String r0 = r0.A06
            android.net.Uri r0 = r2.A00(r0)
            X.C90514aH.A1Q(r0, r11, r5)
            java.lang.Runnable[] r9 = new java.lang.Runnable[r4]
            X.AWh r0 = X.C21687AWh.A00
            r9[r5] = r0
            android.text.SpannableString r2 = r6.A01(r7, r8, r9, r10, r11)
            X.0yb r0 = r1.A0D
            X.C36331k8.A16(r3, r0)
            X.0yC r0 = r1.A0E
            X.C36331k8.A1A(r0, r3)
            r3.setText(r2)
        L_0x025d:
            android.view.View r0 = r1.A01
            r0.setVisibility(r5)
            return
        L_0x0263:
            java.lang.String r2 = r0.A07
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x063f
            android.view.View$OnClickListener r2 = r0.A03
            if (r2 == 0) goto L_0x063f
            java.lang.String r2 = r0.A07
            android.text.Spanned r11 = android.text.Html.fromHtml(r2)
            java.lang.String r2 = r11.toString()
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r2)
            int r3 = r2.length()
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.Object[] r9 = r11.getSpans(r5, r3, r2)
            int r8 = r9.length
            r7 = 0
        L_0x028a:
            if (r7 >= r8) goto L_0x02a3
            r2 = r9[r7]
            X.7vM r6 = new X.7vM
            r6.<init>(r1, r0)
            int r4 = r11.getSpanStart(r2)
            int r3 = r11.getSpanEnd(r2)
            r2 = 33
            r10.setSpan(r6, r4, r3, r2)
            int r7 = r7 + 1
            goto L_0x028a
        L_0x02a3:
            com.whatsapp.TextEmojiLabel r2 = r1.A08
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r2.setMovementMethod(r0)
            r2.setText(r10)
            goto L_0x025d
        L_0x02b0:
            com.whatsapp.WaImageView r3 = r1.A09
            r2 = 4
            r3.setVisibility(r2)
            goto L_0x020c
        L_0x02b8:
            X.1Pp r3 = r1.A0B
            android.widget.ImageView r6 = r1.A02
            int r2 = r0.A00
            r3.A06(r6, r2)
            goto L_0x01fd
        L_0x02c3:
            android.widget.RelativeLayout r2 = r1.A04
            r2.setVisibility(r4)
            goto L_0x01e8
        L_0x02ca:
            boolean r2 = r1 instanceof X.C179768kf
            if (r2 == 0) goto L_0x02e1
            X.8kf r1 = (X.C179768kf) r1
            X.8l5 r0 = (X.C180028l5) r0
            if (r0 == 0) goto L_0x0030
            android.widget.TextView r2 = r1.A00
            java.lang.String r1 = r0.A01
            r2.setText(r1)
            int r0 = r0.A00
            r2.setVisibility(r0)
            return
        L_0x02e1:
            boolean r2 = r1 instanceof X.C179888kr
            if (r2 == 0) goto L_0x0321
            X.8kr r1 = (X.C179888kr) r1
            X.8lC r0 = (X.C180098lC) r0
            if (r0 == 0) goto L_0x0030
            java.lang.String r2 = r0.A01
            if (r2 == 0) goto L_0x0645
            java.lang.String r2 = r0.A00
            if (r2 == 0) goto L_0x0645
            com.whatsapp.TextEmojiLabel r11 = r1.A02
            android.content.Context r7 = r11.getContext()
            X.0yC r13 = r1.A04
            X.17Y r10 = r1.A01
            X.1Dv r9 = r1.A00
            X.0yb r12 = r1.A03
            android.content.Context r6 = r11.getContext()
            r5 = 2131892048(0x7f121750, float:1.9418833E38)
            java.lang.Object[] r4 = X.AnonymousClass001.A0L()
            r3 = 0
            java.lang.String r2 = r0.A01
            java.lang.String r14 = X.C36391kE.A0v(r6, r2, r4, r3, r5)
            java.lang.String r15 = r0.A01
            X.0xT r1 = r1.A05
            java.lang.String r0 = r0.A00
            android.net.Uri r8 = r1.A02(r0)
            X.AnonymousClass6YV.A0E(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x0321:
            boolean r2 = r1 instanceof X.C179818kk
            if (r2 == 0) goto L_0x034c
            X.8kk r1 = (X.C179818kk) r1
            X.8l8 r0 = (X.C180058l8) r0
            android.widget.LinearLayout r3 = r1.A01
            android.view.View$OnClickListener r2 = r0.A00
            r3.setOnClickListener(r2)
            android.widget.ImageView r4 = r1.A00
            android.content.Context r3 = r4.getContext()
            r2 = 2131102239(0x7f060a1f, float:1.781691E38)
            X.C90504aG.A11(r3, r4, r2)
            boolean r2 = r0.A01
            android.widget.TextView r1 = r1.A02
            r0 = 2131896979(0x7f122a93, float:1.9428835E38)
            if (r2 == 0) goto L_0x0348
            r0 = 2131894976(0x7f1222c0, float:1.9424772E38)
        L_0x0348:
            r1.setText(r0)
            return
        L_0x034c:
            boolean r2 = r1 instanceof X.C179858ko
            if (r2 == 0) goto L_0x03f7
            X.8ko r1 = (X.C179858ko) r1
            X.8lB r0 = (X.C180088lB) r0
            X.9Ml r2 = r0.A02
            if (r2 == 0) goto L_0x0030
            X.9mK r5 = r1.A04
            android.view.View r6 = r1.A00
            X.Az8 r10 = r0.A01
            X.9lY r8 = r2.A01
            X.3T1 r11 = r2.A02
            android.widget.Button r7 = r1.A02
            android.widget.Button r3 = r1.A03
            android.widget.Button r2 = r1.A01
            X.9Tc r9 = r0.A00
            r0 = 8
            r6.setVisibility(r0)
            int r1 = r8.A02
            r0 = 110(0x6e, float:1.54E-43)
            if (r1 != r0) goto L_0x03a8
            r0 = 2131433343(0x7f0b177f, float:1.848847E38)
            android.view.View r1 = X.C012005e.A02(r6, r0)
            r0 = 2131433359(0x7f0b178f, float:1.8488501E38)
            android.view.View r0 = X.C012005e.A02(r6, r0)
            X.C36421kH.A0x(r1, r0)
            r0 = 0
            r6.setVisibility(r0)
            r3.setVisibility(r0)
            X.1EU r1 = r5.A06
            java.lang.String r0 = r8.A0G
            X.9e3 r1 = r1.A03(r0)
            if (r1 == 0) goto L_0x0030
            java.lang.String r0 = r8.A0I
            X.B66 r2 = r1.A01(r0)
            if (r2 == 0) goto L_0x0030
            android.content.Context r1 = r6.getContext()
            r0 = 7
            X.AnonymousClass3YM.A00(r3, r2, r1, r11, r0)
            return
        L_0x03a8:
            boolean r0 = r8.A0I()
            if (r0 == 0) goto L_0x0651
            com.whatsapp.jid.UserJid r3 = r8.A0D
            r0 = 2131433343(0x7f0b177f, float:1.848847E38)
            android.view.View r4 = X.C012005e.A02(r6, r0)
            r0 = 2131433359(0x7f0b178f, float:1.8488501E38)
            android.view.View r2 = X.C012005e.A02(r6, r0)
            r1 = 8
            if (r3 == 0) goto L_0x064d
            boolean r0 = X.C202629mK.A02(r8, r5)
            if (r0 != 0) goto L_0x064d
            boolean r0 = r8.A0P
            if (r0 != 0) goto L_0x064d
            X.C36361kB.A15(r4, r2, r6, r1)
            if (r7 == 0) goto L_0x0030
            r2 = 0
            r6.setVisibility(r2)
            r7.setVisibility(r2)
            int r0 = r8.A02
            r1 = 19
            if (r0 != r1) goto L_0x03df
            r2 = 1
        L_0x03df:
            X.C202629mK.A01(r7, r8, r5, r2)
            int r0 = r8.A02
            if (r0 == r1) goto L_0x0030
            r17 = 3
            X.3YY r11 = new X.3YY
            r12 = r5
            r13 = r7
            r14 = r10
            r15 = r8
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r7.setOnClickListener(r11)
            return
        L_0x03f7:
            boolean r2 = r1 instanceof X.C179808kj
            if (r2 == 0) goto L_0x045b
            X.8kj r1 = (X.C179808kj) r1
            X.8lA r0 = (X.C180078lA) r0
            if (r0 == 0) goto L_0x0030
            android.widget.TextView r3 = r1.A02
            java.lang.String r2 = r0.A01
            r3.setText(r2)
            boolean r2 = r0.A02
            android.widget.ImageView r4 = r1.A01
            if (r2 == 0) goto L_0x0439
            r2 = 2131233956(0x7f080ca4, float:1.8084064E38)
            r4.setImageResource(r2)
            r2 = 1127481344(0x43340000, float:180.0)
            r4.setRotation(r2)
            android.content.Context r3 = r4.getContext()
            r2 = 2131102410(0x7f060aca, float:1.7817257E38)
            android.content.res.ColorStateList r2 = X.AnonymousClass00F.A04(r3, r2)
            X.AnonymousClass06T.A00(r2, r4)
            android.view.View r3 = r1.A00
            android.content.Context r2 = r3.getContext()
            r1 = 2131233859(0x7f080c43, float:1.8083867E38)
        L_0x0430:
            X.C36371kC.A13(r2, r3, r1)
            android.view.View$OnClickListener r0 = r0.A00
            r3.setOnClickListener(r0)
            return
        L_0x0439:
            r2 = 2131234077(0x7f080d1d, float:1.808431E38)
            r4.setImageResource(r2)
            r2 = 0
            r4.setRotation(r2)
            android.content.Context r3 = r4.getContext()
            r2 = 2131102411(0x7f060acb, float:1.781726E38)
            android.content.res.ColorStateList r2 = X.AnonymousClass00F.A04(r3, r2)
            X.AnonymousClass06T.A00(r2, r4)
            android.view.View r3 = r1.A00
            android.content.Context r2 = r3.getContext()
            r1 = 2131233858(0x7f080c42, float:1.8083865E38)
            goto L_0x0430
        L_0x045b:
            boolean r2 = r1 instanceof X.C179898ks
            if (r2 == 0) goto L_0x04cc
            X.8ks r1 = (X.C179898ks) r1
            X.8lF r0 = (X.C180128lF) r0
            android.widget.Button r5 = r1.A02
            android.view.View$OnClickListener r2 = r0.A01
            r5.setOnClickListener(r2)
            android.widget.ImageView r6 = r1.A03
            int r2 = r0.A00
            r6.setImageResource(r2)
            android.content.Context r7 = r1.A00
            android.content.res.Resources r3 = r7.getResources()
            r2 = 2131102831(0x7f060c6f, float:1.7818111E38)
            int r3 = r3.getColor(r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r6.setColorFilter(r3, r2)
            android.widget.TextView r3 = r1.A05
            java.lang.CharSequence r2 = r0.A04
            r3.setText(r2)
            android.widget.TextView r4 = r1.A04
            java.lang.CharSequence r2 = r0.A02
            r4.setText(r2)
            com.whatsapp.TextEmojiLabel r3 = r1.A06
            java.lang.CharSequence r2 = r0.A03
            r3.setText(r2)
            boolean r2 = r0.A06
            if (r2 == 0) goto L_0x04a6
            android.content.res.Resources r3 = r7.getResources()
            r2 = 2131100311(0x7f060297, float:1.7813E38)
            X.C36351kA.A15(r3, r5, r2)
        L_0x04a6:
            boolean r2 = r0.A07
            r7 = 8
            if (r2 == 0) goto L_0x04b3
            java.lang.CharSequence r2 = r0.A02
            if (r2 != 0) goto L_0x04b3
            r4.setVisibility(r7)
        L_0x04b3:
            boolean r3 = r0.A05
            r2 = 0
            if (r3 == 0) goto L_0x04c8
            r6.setVisibility(r2)
        L_0x04bb:
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0662
            r5.setVisibility(r7)
            android.view.View r0 = r1.A01
            r0.setVisibility(r2)
            return
        L_0x04c8:
            r6.setVisibility(r7)
            goto L_0x04bb
        L_0x04cc:
            boolean r2 = r1 instanceof X.C179718ka
            if (r2 != 0) goto L_0x0030
            boolean r2 = r1 instanceof X.C179878kq
            if (r2 == 0) goto L_0x0578
            X.8kq r1 = (X.C179878kq) r1
            X.8lD r0 = (X.C180108lD) r0
            android.widget.TextView r5 = r1.A03
            java.lang.CharSequence r2 = r0.A03
            r5.setText(r2)
            android.view.View r2 = r1.A0H
            android.content.res.Resources r6 = r2.getResources()
            android.content.Context r4 = r2.getContext()
            r3 = 2130970307(0x7f0406c3, float:1.754932E38)
            r2 = 2131101912(0x7f0608d8, float:1.7816247E38)
            int r2 = X.C224514j.A00(r4, r3, r2)
            X.C36351kA.A15(r6, r5, r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            r5.setAlpha(r2)
            java.lang.CharSequence r2 = r0.A02
            r5.setContentDescription(r2)
            boolean r6 = r0.A04
            if (r6 == 0) goto L_0x056e
            X.AnonymousClass97F.A00(r5)
        L_0x0507:
            java.lang.CharSequence r3 = r0.A01
            r4 = 0
            if (r3 == 0) goto L_0x0514
            android.widget.TextView r2 = r1.A02
            r2.setVisibility(r4)
            r2.setText(r3)
        L_0x0514:
            X.0yC r3 = r1.A04
            r2 = 605(0x25d, float:8.48E-43)
            boolean r2 = r3.A0E(r2)
            if (r2 != 0) goto L_0x0526
            r2 = 629(0x275, float:8.81E-43)
            boolean r2 = r3.A0E(r2)
            if (r2 == 0) goto L_0x0030
        L_0x0526:
            X.6c9 r7 = r0.A00
            if (r7 == 0) goto L_0x066e
            android.view.View r0 = r1.A00
            r0.setVisibility(r4)
            int r0 = r7.A0C
            r5.setTextColor(r0)
            if (r6 == 0) goto L_0x053c
            r0 = 1057635697(0x3f0a3d71, float:0.54)
            r5.setAlpha(r0)
        L_0x053c:
            android.widget.ImageView r6 = r1.A01
            int r0 = r7.A0A
            r6.setBackgroundColor(r0)
            java.lang.String r2 = r7.A01
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x054e
            r6.setContentDescription(r2)
        L_0x054e:
            int r0 = r7.A0D
            float r2 = (float) r0
            int r0 = r7.A09
            float r0 = (float) r0
            float r2 = r2 / r0
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            int r8 = r0.width
            float r0 = (float) r8
            float r0 = r0 / r2
            int r9 = (int) r0
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            r0.height = r9
            r6.requestLayout()
            X.1Yo r5 = r1.A05
            r10 = 1
            r5.A03(r6, r7, r8, r9, r10)
            return
        L_0x056e:
            int r2 = r5.getPaintFlags()
            r2 = r2 & -17
            r5.setPaintFlags(r2)
            goto L_0x0507
        L_0x0578:
            boolean r2 = r1 instanceof X.C179848kn
            if (r2 == 0) goto L_0x05bc
            X.8kn r1 = (X.C179848kn) r1
            X.8l4 r0 = (X.C180018l4) r0
            android.widget.LinearLayout r2 = r1.A01
            android.view.View$OnClickListener r0 = r0.A00
            r2.setOnClickListener(r0)
            android.widget.ImageView r3 = r1.A00
            android.content.Context r2 = r3.getContext()
            r0 = 2131102239(0x7f060a1f, float:1.781691E38)
            X.C90504aG.A11(r2, r3, r0)
            com.whatsapp.WaTextView r4 = r1.A02
            X.0yC r0 = r1.A03
            r1 = 0
            int r3 = X.C165587tf.A05(r0)
            r0 = 4
            int[] r2 = new int[r0]
            r0 = 2131894216(0x7f121fc8, float:1.942323E38)
            r2[r1] = r0
            r1 = 2131894217(0x7f121fc9, float:1.9423233E38)
            r0 = 1
            r2[r0] = r1
            r1 = 2131894218(0x7f121fca, float:1.9423235E38)
            r0 = 2
            r2[r0] = r1
            r1 = 2131894219(0x7f121fcb, float:1.9423237E38)
            r0 = 3
            r2[r0] = r1
            r0 = r2[r3]
            r4.setText(r0)
            return
        L_0x05bc:
            boolean r2 = r1 instanceof X.C179758ke
            if (r2 == 0) goto L_0x05e6
            X.8ke r1 = (X.C179758ke) r1
            r2 = 0
            X.AnonymousClass00C.A0D(r0, r2)
            com.whatsapp.payments.ui.widget.ContactMerchantView r2 = r1.A00
            X.8ky r0 = (X.C179958ky) r0
            X.11F r0 = r0.A00
            r2.A00(r0)
            android.view.View r2 = r1.A0H
            r1 = 2131169056(0x7f070f20, float:1.7952431E38)
            android.content.res.Resources r0 = r2.getResources()
            int r1 = r0.getDimensionPixelOffset(r1)
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass000.A0a(r2)
            r0.bottomMargin = r1
            r2.setLayoutParams(r0)
            return
        L_0x05e6:
            boolean r2 = r1 instanceof X.C179748kd
            if (r2 == 0) goto L_0x05f4
            X.8kd r1 = (X.C179748kd) r1
            android.view.View r1 = r1.A00
            X.8l2 r0 = (X.C179998l2) r0
            android.view.View$OnClickListener r0 = r0.A00
            goto L_0x002d
        L_0x05f4:
            boolean r2 = r1 instanceof X.C179708kZ
            if (r2 != 0) goto L_0x0030
            boolean r2 = r1 instanceof X.C179798ki
            if (r2 == 0) goto L_0x062c
            X.8ki r1 = (X.C179798ki) r1
            X.8kw r0 = (X.C179938kw) r0
            java.lang.String r5 = r0.A00
            r4 = 0
            r3 = 8
            android.widget.TextView r2 = r1.A01
            if (r5 == 0) goto L_0x0623
            r2.setText(r5)
            r2.setVisibility(r4)
            android.widget.Space r2 = r1.A00
            r2.setVisibility(r3)
        L_0x0614:
            android.widget.TextView r2 = r1.A02
            android.text.SpannableStringBuilder r1 = r0.A02
            r2.setText(r1)
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0676
            X.AnonymousClass97F.A00(r2)
            return
        L_0x0623:
            r2.setVisibility(r3)
            android.widget.Space r2 = r1.A00
            r2.setVisibility(r4)
            goto L_0x0614
        L_0x062c:
            X.8kc r1 = (X.C179738kc) r1
            X.8l1 r0 = (X.C179988l1) r0
            com.whatsapp.wds.components.button.WDSButton r1 = r1.A00
            android.view.View$OnClickListener r0 = r0.A00
            goto L_0x002d
        L_0x0636:
            android.view.View r0 = r1.A02
            r0.setVisibility(r3)
            r5.setVisibility(r4)
            return
        L_0x063f:
            android.view.View r0 = r1.A01
            r0.setVisibility(r4)
            return
        L_0x0645:
            com.whatsapp.TextEmojiLabel r1 = r1.A02
            java.lang.String r0 = r0.A02
            r1.setText(r0)
            return
        L_0x064d:
            r6.setVisibility(r1)
            return
        L_0x0651:
            int r1 = r8.A02
            r0 = 102(0x66, float:1.43E-43)
            if (r1 != r0) goto L_0x065b
            X.C202629mK.A00(r6, r2, r8, r5)
            return
        L_0x065b:
            r13 = 1
            java.lang.String r12 = "payment_transaction_details"
            r5.A05(r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0662:
            r5.setVisibility(r2)
            android.view.View r0 = r1.A01
            goto L_0x066a
        L_0x0668:
            android.widget.TextView r0 = r1.A01
        L_0x066a:
            r0.setVisibility(r7)
            return
        L_0x066e:
            android.view.View r1 = r1.A00
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0676:
            int r0 = r2.getPaintFlags()
            r0 = r0 & -17
            r2.setPaintFlags(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass80F.A0B(X.9FU, int):void");
    }

    public AnonymousClass80F(View view) {
        super(view);
    }
}
