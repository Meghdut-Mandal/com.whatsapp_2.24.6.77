package com.whatsapp.biz.product.view.activity;

import X.A9R;
import X.AVW;
import X.AnonymousClass141;
import X.AnonymousClass14B;
import X.AnonymousClass16A;
import X.AnonymousClass1KP;
import X.AnonymousClass1N6;
import X.AnonymousClass1NM;
import X.AnonymousClass1RY;
import X.AnonymousClass3L0;
import X.AnonymousClass4PE;
import X.AnonymousClass6VE;
import X.AnonymousClass6W7;
import X.AnonymousClass7fZ;
import X.AnonymousClass8WH;
import X.AnonymousClass96V;
import X.AnonymousClass9N7;
import X.AnonymousClass9N9;
import X.AnonymousClass9NZ;
import X.AnonymousClass9R0;
import X.AnonymousClass9R1;
import X.AnonymousClass9W6;
import X.AnonymousClass9XI;
import X.AnonymousClass9Y1;
import X.AnonymousClass9ZJ;
import X.AnonymousClass9wo;
import X.B77;
import X.B7Y;
import X.B9J;
import X.BA7;
import X.BAC;
import X.BAP;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165597tg;
import X.C165607th;
import X.C165617ti;
import X.C167637yT;
import X.C167647yU;
import X.C178358fo;
import X.C18800tq;
import X.C18830tt;
import X.C191479Dc;
import X.C195119So;
import X.C195209Sx;
import X.C195399Ud;
import X.C195559Ux;
import X.C19630wG;
import X.C19770wU;
import X.C198909eO;
import X.C199439fJ;
import X.C202279lS;
import X.C207109uZ;
import X.C207269up;
import X.C21104A8p;
import X.C22909AyL;
import X.C26421Kc;
import X.C27111My;
import X.C27261Nn;
import X.C27731Pn;
import X.C29461Ws;
import X.C31771cM;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36441kJ;
import X.C48892iE;
import X.C63553Km;
import X.C64723Pe;
import X.C87044Ng;
import X.C90504aG;
import X.C99304t3;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet;
import com.whatsapp.biz.product.view.fragment.ReportProductDialogFragment;
import com.whatsapp.jid.UserJid;
import java.util.Collections;

public class ProductDetailActivity extends AnonymousClass8WH implements AnonymousClass7fZ, C87044Ng {
    public C99304t3 A00;
    public C191479Dc A01;
    public C26421Kc A02;
    public C167637yT A03;
    public PostcodeChangeBottomSheet A04;
    public AnonymousClass1KP A05;
    public C199439fJ A06;
    public C27731Pn A07;
    public AnonymousClass9R0 A08;
    public AnonymousClass1N6 A09;
    public AnonymousClass1RY A0A;
    public boolean A0B;
    public final C195559Ux A0C;
    public final AnonymousClass16A A0D;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A07(X.C207109uZ r9) {
        /*
            r8 = this;
            r2 = 0
            if (r9 == 0) goto L_0x0022
            X.0v0 r1 = r8.A09
            com.whatsapp.jid.UserJid r0 = r8.A0q
            java.lang.String r0 = r0.getRawString()
            java.lang.String r1 = r1.A0l(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0021
            X.9tg r0 = r9.A02
            if (r0 == 0) goto L_0x0022
            java.lang.String r1 = r0.A00
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0022
        L_0x0021:
            r2 = r1
        L_0x0022:
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x0095
            r0 = 2131891665(0x7f1215d1, float:1.9418056E38)
            java.lang.String r5 = r8.getString(r0)
            r0 = 2
            android.text.SpannableStringBuilder[] r4 = new android.text.SpannableStringBuilder[r0]
            android.text.SpannableStringBuilder r0 = X.C36441kJ.A0P(r2)
            r4[r6] = r0
            r0 = 2131887694(0x7f12064e, float:1.9410002E38)
            java.lang.String r0 = r8.getString(r0)
            android.text.SpannableStringBuilder r3 = X.C36441kJ.A0P(r0)
            X.8TS r2 = new X.8TS
            r2.<init>(r8, r8)
            int r1 = r0.length()
            r0 = 33
            r3.setSpan(r2, r6, r1, r0)
            r4[r7] = r3
            android.text.SpannableStringBuilder r3 = X.AnonymousClass6YV.A04(r5, r4)
        L_0x0055:
            com.whatsapp.TextEmojiLabel r1 = r8.A0C
            X.0yC r0 = r8.A0D
            X.C36331k8.A1A(r0, r1)
            com.whatsapp.TextEmojiLabel r1 = r8.A0C
            X.0yb r0 = r8.A08
            X.C36331k8.A16(r1, r0)
            com.whatsapp.TextEmojiLabel r0 = r8.A0C
            r0.setLinksClickable(r7)
            com.whatsapp.TextEmojiLabel r0 = r8.A0C
            r0.setFocusable(r6)
            com.whatsapp.TextEmojiLabel r2 = r8.A0C
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131102153(0x7f0609c9, float:1.7816736E38)
            X.C36351kA.A15(r1, r2, r0)
            com.whatsapp.TextEmojiLabel r0 = r8.A0C
            r0.setText(r3)
            com.whatsapp.TextEmojiLabel r1 = r8.A0C
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r1.setGravity(r0)
            r0 = 2131432933(0x7f0b15e5, float:1.8487637E38)
            android.view.View r1 = r8.findViewById(r0)
            int r0 = X.C36411kG.A01(r8)
            X.C36341k9.A0q(r8, r1, r0)
            return
        L_0x0095:
            r0 = 2131891664(0x7f1215d0, float:1.9418054E38)
            java.lang.String r5 = r8.getString(r0)
            android.text.Spannable[] r4 = new android.text.Spannable[r7]
            r0 = 2131887694(0x7f12064e, float:1.9410002E38)
            java.lang.String r0 = r8.getString(r0)
            android.text.SpannableStringBuilder r3 = X.C36441kJ.A0P(r0)
            X.8TS r2 = new X.8TS
            r2.<init>(r8, r8)
            int r1 = r0.length()
            r0 = 33
            r3.setSpan(r2, r6, r1, r0)
            r4[r6] = r3
            android.text.SpannableStringBuilder r3 = X.AnonymousClass6YV.A04(r5, r4)
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.product.view.activity.ProductDetailActivity.A07(X.9uZ):void");
    }

    public boolean A2g() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0195, code lost:
        if (r0.size() <= 0) goto L_0x0197;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3i() {
        /*
            r15 = this;
            r9 = r15
            r15.invalidateOptionsMenu()
            X.9up r0 = r15.A0U
            r2 = 8
            r1 = 1
            r8 = 0
            if (r0 != 0) goto L_0x00cb
            int r3 = r15.A00
            com.whatsapp.TextEmojiLabel r0 = r15.A0D
            if (r3 != r1) goto L_0x00ba
            r0.setVisibility(r2)
            android.widget.TextView r0 = r15.A08
            r0.setVisibility(r2)
            android.view.View r0 = r15.A04
            if (r0 == 0) goto L_0x0021
            r0.setVisibility(r8)
        L_0x0021:
            X.7yU r5 = r15.A0h
            int r3 = r15.A00
            X.9up r2 = r15.A0U
            boolean r0 = r5.A0T(r2, r3)
            r4 = 1
            r1 = 2
            if (r0 == 0) goto L_0x0056
            X.00s r0 = r5.A04
            java.lang.Object r2 = r0.A04()
            X.9uZ r2 = (X.C207109uZ) r2
            X.9up r0 = r15.A0U
            if (r0 == 0) goto L_0x00b5
            int r0 = r0.A00
            if (r0 != r1) goto L_0x00b5
            X.1KP r1 = r15.A05
            java.lang.String r0 = "postcode"
            boolean r0 = X.AnonymousClass1KP.A00(r1, r2, r0, r4)
            if (r0 == 0) goto L_0x00b5
            r15.A07(r2)
            com.whatsapp.TextEmojiLabel r1 = r15.A0C
            r0 = 0
        L_0x004f:
            r1.setVisibility(r0)
        L_0x0052:
            super.A3i()
            return
        L_0x0056:
            if (r3 == r1) goto L_0x0068
            if (r2 == 0) goto L_0x009a
            X.9tw r0 = r2.A01
            if (r0 == 0) goto L_0x0062
            int r0 = r0.A00
            if (r0 != 0) goto L_0x0068
        L_0x0062:
            boolean r0 = r2.A02()
            if (r0 == 0) goto L_0x009a
        L_0x0068:
            r3 = 2131893555(0x7f121d33, float:1.942189E38)
        L_0x006b:
            X.7yU r0 = r15.A0h
            X.00s r0 = r0.A04
            java.lang.Object r2 = r0.A04()
            X.9uZ r2 = (X.C207109uZ) r2
            X.1KP r1 = r15.A05
            java.lang.String r0 = "postcode"
            boolean r0 = X.AnonymousClass1KP.A00(r1, r2, r0, r4)
            if (r0 == 0) goto L_0x0088
            r15.A07(r2)
        L_0x0082:
            com.whatsapp.TextEmojiLabel r0 = r15.A0C
            r0.setVisibility(r8)
            goto L_0x0052
        L_0x0088:
            com.whatsapp.TextEmojiLabel r2 = r15.A0C
            android.content.res.Resources r1 = r15.getResources()
            r0 = 2131100011(0x7f06016b, float:1.7812391E38)
            X.C36351kA.A15(r1, r2, r0)
            com.whatsapp.TextEmojiLabel r0 = r15.A0C
            r0.setText(r3)
            goto L_0x0082
        L_0x009a:
            r0 = 3
            if (r3 != r0) goto L_0x00a1
            r3 = 2131887631(0x7f12060f, float:1.9409875E38)
            goto L_0x006b
        L_0x00a1:
            if (r2 == 0) goto L_0x00a7
            boolean r0 = r2.A0H
            if (r0 == 0) goto L_0x00a9
        L_0x00a7:
            if (r3 != r4) goto L_0x00b5
        L_0x00a9:
            X.0wD r0 = r15.A07
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x00b5
            r3 = 2131887863(0x7f1206f7, float:1.9410345E38)
            goto L_0x006b
        L_0x00b5:
            com.whatsapp.TextEmojiLabel r1 = r15.A0C
            r0 = 8
            goto L_0x004f
        L_0x00ba:
            r0.setVisibility(r8)
            android.widget.TextView r0 = r15.A08
            r0.setVisibility(r8)
            android.view.View r0 = r15.A04
            if (r0 == 0) goto L_0x0021
            r0.setVisibility(r2)
            goto L_0x0021
        L_0x00cb:
            android.view.View r0 = r15.A04
            if (r0 == 0) goto L_0x00d2
            r0.setVisibility(r2)
        L_0x00d2:
            X.9up r0 = r15.A0U
            java.lang.String r0 = r0.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02a7
            com.whatsapp.TextEmojiLabel r3 = r15.A0D
            X.9up r0 = r15.A0U
            java.lang.String r5 = r0.A05
            r4 = 0
            r7 = 450(0x1c2, float:6.3E-43)
            r6 = r4
            r3.A0H(r4, r5, r6, r7, r8)
            com.whatsapp.TextEmojiLabel r0 = r15.A0D
            r0.setVisibility(r8)
        L_0x00ee:
            X.9up r3 = r15.A0U
            java.math.BigDecimal r0 = r3.A06
            if (r0 == 0) goto L_0x02a0
            X.6Tk r0 = r3.A04
            if (r0 == 0) goto L_0x02a0
            android.widget.TextView r0 = r15.A08
            r0.setVisibility(r8)
            android.widget.TextView r3 = r15.A08
            X.9up r0 = r15.A0U
            java.math.BigDecimal r13 = r0.A06
            X.6Tk r11 = r0.A04
            X.6bV r10 = r0.A02
            X.0ts r12 = r15.A00
            java.util.Date r14 = new java.util.Date
            r14.<init>()
            android.text.SpannableString r0 = X.AnonymousClass6W7.A01(r9, r10, r11, r12, r13, r14)
            r3.setText(r0)
        L_0x0115:
            X.9up r0 = r15.A0U
            java.lang.String r0 = r0.A0C
            boolean r0 = X.AnonymousClass14B.A0F(r0)
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r5 = r15.A0b
            if (r0 == 0) goto L_0x028d
            r5.setVisibility(r2)
        L_0x0124:
            X.9up r0 = r15.A0U
            java.lang.String r0 = r0.A0E
            boolean r0 = X.AnonymousClass14B.A0F(r0)
            android.widget.TextView r4 = r15.A07
            if (r0 == 0) goto L_0x0272
            r4.setVisibility(r2)
        L_0x0133:
            X.9up r0 = r15.A0U
            java.lang.String r0 = r0.A0G
            boolean r0 = X.AnonymousClass14B.A0F(r0)
            if (r0 != 0) goto L_0x026b
            X.185 r3 = r15.A0m
            com.whatsapp.jid.UserJid r0 = r15.A0q
            boolean r0 = r3.A04(r0)
            if (r0 != 0) goto L_0x026b
            android.widget.TextView r4 = r15.A09
            X.9up r0 = r15.A0U
            java.lang.String r3 = r0.A0G
            r0 = 150(0x96, float:2.1E-43)
            java.lang.String r0 = X.AnonymousClass14B.A0C(r3, r0)
            r4.setText(r0)
            android.widget.TextView r0 = r15.A09
            r0.setVisibility(r8)
        L_0x015b:
            X.9up r0 = r15.A0U
            int r3 = r0.A00
            com.whatsapp.wds.components.button.WDSButton r0 = r15.A0u
            if (r3 == 0) goto L_0x0261
            r0.setEnabled(r8)
            com.whatsapp.biz.catalog.view.widgets.QuantitySelector r0 = r15.A0f
            r0.setEnabled(r8)
        L_0x016b:
            X.9up r0 = r15.A0U
            int r0 = r0.A00
            com.whatsapp.WaTextView r3 = r15.A0F
            if (r0 != r1) goto L_0x025c
            r0 = 2131893246(0x7f121bfe, float:1.9421263E38)
            r3.setText(r0)
            com.whatsapp.WaTextView r0 = r15.A0F
            r0.setVisibility(r8)
        L_0x017e:
            com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment r0 = r15.A0c
            if (r0 == 0) goto L_0x01bd
            X.9up r0 = r15.A0U
            X.6bW r0 = r0.A0B
            if (r0 == 0) goto L_0x0197
            X.6bD r0 = r0.A00
            if (r0 == 0) goto L_0x0197
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0197
            int r0 = r0.size()
            r2 = 1
            if (r0 > 0) goto L_0x0198
        L_0x0197:
            r2 = 0
        L_0x0198:
            boolean r0 = r15.A11
            if (r0 == 0) goto L_0x01bd
            X.9up r0 = r15.A0U
            r15.A0T = r0
            if (r2 != 0) goto L_0x01b1
            X.6bW r0 = r0.A0B
            if (r0 == 0) goto L_0x01b1
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x01b1
            int r0 = r0.size()
            if (r0 == 0) goto L_0x01b1
            r1 = 0
        L_0x01b1:
            com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment r3 = r15.A0c
            X.9up r2 = r15.A0U
            X.AZC r0 = new X.AZC
            r0.<init>(r15)
            r3.A1Y(r2, r0, r1)
        L_0x01bd:
            java.util.List r0 = r15.A10
            if (r0 == 0) goto L_0x01c4
            X.AnonymousClass8WH.A0H(r15, r0)
        L_0x01c4:
            com.whatsapp.biz.catalog.view.CatalogCarouselDetailImageView r4 = r15.A0Z
            X.9up r7 = r15.A0U
            X.9Xp r5 = r15.A0Y
            com.whatsapp.jid.UserJid r3 = r15.A0q
            int r2 = r15.A00
            r1 = 0
            if (r7 == 0) goto L_0x01de
            boolean r0 = r7.A0H
            if (r0 == 0) goto L_0x01de
            if (r2 != 0) goto L_0x01de
            boolean r0 = r7.A02()
            if (r0 != 0) goto L_0x01de
            r1 = 1
        L_0x01de:
            r4.A03 = r5
            r4.A08 = r3
            r4.A0C = r1
            X.9up r0 = r4.A01
            boolean r0 = r7.equals(r0)
            r2 = 1
            r6 = r0 ^ 1
            r4.A01 = r7
            boolean r0 = r4.A0D
            if (r0 != 0) goto L_0x0253
            r4.A0D = r2
            android.view.LayoutInflater r1 = X.C36351kA.A0C(r4)
            r0 = 2131625960(0x7f0e07e8, float:1.8879143E38)
            android.view.View r5 = r1.inflate(r0, r4, r2)
            r0 = 2131432936(0x7f0b15e8, float:1.8487644E38)
            android.view.View r0 = X.C012005e.A02(r5, r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r4.A00 = r0
            r4.getContext()
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r1.<init>(r8)
            androidx.recyclerview.widget.RecyclerView r0 = r4.A00
            r0.setLayoutManager(r1)
            X.1w1 r1 = new X.1w1
            r1.<init>(r4)
            r4.A05 = r1
            androidx.recyclerview.widget.RecyclerView r0 = r4.A00
            r0.setAdapter(r1)
            androidx.recyclerview.widget.RecyclerView r3 = r4.A00
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131167986(0x7f070af2, float:1.7950261E38)
            int r2 = r1.getDimensionPixelSize(r0)
            X.0ts r1 = r4.A06
            X.1wr r0 = new X.1wr
            r0.<init>(r1, r2)
            r3.A0t(r0)
            r0 = 2131433569(0x7f0b1861, float:1.8488927E38)
            android.view.View r3 = X.C012005e.A02(r5, r0)
            com.whatsapp.biz.catalog.view.CarouselScrollbarView r3 = (com.whatsapp.biz.catalog.view.CarouselScrollbarView) r3
            r4.A04 = r3
            androidx.recyclerview.widget.RecyclerView r2 = r4.A00
            r3.A00 = r2
            r1 = 3
            X.7oi r0 = new X.7oi
            r0.<init>(r3, r1)
            r2.A0v(r0)
        L_0x0253:
            if (r6 == 0) goto L_0x0021
            X.1w1 r0 = r4.A05
            r0.A06()
            goto L_0x0021
        L_0x025c:
            r3.setVisibility(r2)
            goto L_0x017e
        L_0x0261:
            r0.setEnabled(r1)
            com.whatsapp.biz.catalog.view.widgets.QuantitySelector r0 = r15.A0f
            r0.setEnabled(r1)
            goto L_0x016b
        L_0x026b:
            android.widget.TextView r0 = r15.A09
            r0.setVisibility(r2)
            goto L_0x015b
        L_0x0272:
            X.9up r0 = r15.A0U
            java.lang.String r3 = r0.A0E
            r0 = 420(0x1a4, float:5.89E-43)
            java.lang.String r0 = X.AnonymousClass14B.A0C(r3, r0)
            r4.setText(r0)
            android.widget.TextView r3 = r15.A07
            r0 = 47
            X.C48732hx.A00(r3, r15, r0)
            android.widget.TextView r0 = r15.A07
            r0.setVisibility(r8)
            goto L_0x0133
        L_0x028d:
            r5.A02 = r1
            X.9up r0 = r15.A0U
            java.lang.String r4 = r0.A0C
            r3 = 0
            r0 = 180(0xb4, float:2.52E-43)
            r5.A0J(r4, r3, r0, r1)
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r0 = r15.A0b
            r0.setVisibility(r8)
            goto L_0x0124
        L_0x02a0:
            android.widget.TextView r0 = r15.A08
            r0.setVisibility(r2)
            goto L_0x0115
        L_0x02a7:
            com.whatsapp.TextEmojiLabel r0 = r15.A0D
            r0.setVisibility(r2)
            goto L_0x00ee
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.product.view.activity.ProductDetailActivity.A3i():void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 55) {
            this.A0Q.A01(this, this.A0Y, this.A0q, this.A0q, Collections.singletonList(this.A0U), 2, 0, 0);
        }
    }

    public void A2F() {
        if (!this.A0B) {
            this.A0B = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r1 = A0L.A5g;
            C165567td.A11(r1, this);
            C18830tt r3 = r1.A00;
            C165567td.A0v(r1, r3, this, C36321k7.A05(r1, r3, this));
            this.A0i = (AnonymousClass6W7) A0L.A08.get();
            this.A0p = C36351kA.A0h(r1);
            this.A0N = C27111My.A0E(A0L);
            this.A0E = C36361kB.A0T(r1);
            this.A0Q = (C64723Pe) r3.A5z.get();
            this.A0n = C36341k9.A0S(r1);
            this.A0s = C165597tg.A0U(r1);
            this.A0L = (AnonymousClass6VE) r1.A1Q.get();
            this.A0K = (C178358fo) r1.ADJ.get();
            this.A0W = C165607th.A0Q(r1);
            this.A0r = C165607th.A0V(r3);
            this.A0o = (AnonymousClass1NM) r1.A1c.get();
            this.A0k = C36341k9.A0R(r1);
            this.A0R = (C31771cM) r1.A6p.get();
            this.A0X = (C195119So) r3.A0y.get();
            this.A0J = (AnonymousClass9XI) r1.ADM.get();
            this.A0m = C36371kC.A0U(r1);
            this.A0S = (C29461Ws) r1.A1S.get();
            this.A0I = C165587tf.A0L(r1);
            this.A0O = (AnonymousClass4PE) A0L.A1N.get();
            this.A0V = C165607th.A0P(r1);
            this.A0l = (C27261Nn) r1.AQN.get();
            this.A0t = (AnonymousClass9R1) r3.A0z.get();
            this.A0H = (C63553Km) r1.A18.get();
            this.A0j = C18800tq.A4W(r1);
            this.A0g = new AnonymousClass9N7((C29461Ws) r1.A1S.get(), (C202279lS) r1.A1T.get(), (C195399Ud) r1.A6o.get(), (C19630wG) r1.A91.get(), (C19770wU) r1.A9Y.get());
            this.A0d = C27111My.A0H(A0L);
            this.A0M = new AnonymousClass9ZJ();
            this.A0e = (C198909eO) A0L.A5f.A03.get();
            this.A0G = (C22909AyL) A0L.A1Z.get();
            this.A07 = C165577te.A0Q(r1);
            this.A02 = (C26421Kc) r1.A1A.get();
            this.A01 = (C191479Dc) A0L.A3I.get();
            this.A05 = C18800tq.A2v(r1);
            this.A06 = (C199439fJ) r1.A17.get();
            this.A08 = (AnonymousClass9R0) r1.A1U.get();
            this.A09 = C90504aG.A0V(r1);
        }
    }

    public void A2X() {
        if (this.A0D.A0E(6715)) {
            this.A09.A03(this.A0q, 61);
        }
        super.A2X();
    }

    public void Bdc(AnonymousClass9N9 r6, boolean z) {
        C207269up r0 = this.A0U;
        if (r0 != null && r0.A0F.equals(r6.A03)) {
            Bnv();
            String str = null;
            AnonymousClass9Y1 r3 = this.A0V;
            C195209Sx r2 = new C195209Sx();
            r2.A0A = r6.A05;
            r2.A05 = Integer.valueOf(r6.A00);
            r2.A0D = r3.A00;
            r2.A0E = r3.A01;
            r2.A09 = Long.valueOf(r6.A01);
            C207269up r02 = this.A0U;
            if (z) {
                if (r02 != null) {
                    str = r02.A0F;
                }
                r2.A0G = str;
                r2.A00 = this.A0q;
                r3.A03(r2);
                C36401kF.A1D(this, R.string.f12nameremoved, R.string.f12nameremoved);
                return;
            }
            if (r02 != null) {
                str = r02.A0F;
            }
            r2.A0G = str;
            r2.A00 = this.A0q;
            r3.A03(r2);
            BO5(R.string.f12nameremoved);
        }
    }

    public void onBackPressed() {
        if (this.A0q != null && getIntent().getBooleanExtra("go_back_to_catalog_from_deeplink", false)) {
            this.A08.A00();
            this.A0J.A00(this, this.A0q, 1, 13);
        }
        super.onBackPressed();
    }

    public void onDestroy() {
        this.A0W.A0O.remove(this);
        this.A0R.unregisterObserver(this.A0C);
        this.A02.unregisterObserver(this.A0D);
        super.onDestroy();
        AnonymousClass1RY r0 = this.A0A;
        if (r0 != null) {
            r0.A02();
        }
    }

    public ProductDetailActivity(int i) {
        this.A0B = false;
        B7Y.A00(this, 8);
    }

    public static void A01(ProductDetailActivity productDetailActivity, C207109uZ r10) {
        int A052 = C36441kJ.A05(productDetailActivity.getResources(), R.dimen.f7nameremoved);
        AnonymousClass9W6 A002 = productDetailActivity.A0j.A00(r10, AnonymousClass96V.A00());
        productDetailActivity.A0W.A0A(new AnonymousClass9NZ(A002, productDetailActivity.A0q, Integer.valueOf(productDetailActivity.getIntent().getIntExtra("thumb_width", A052)), Integer.valueOf(productDetailActivity.getIntent().getIntExtra("thumb_height", A052)), productDetailActivity.A0y, productDetailActivity.A0V.A02, false));
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        this.A02.registerObserver(this.A0D);
        View findViewById = findViewById(R.id.product_business_info_container);
        C191479Dc r5 = this.A01;
        UserJid userJid = this.A0q;
        C36331k8.A1I(r5, userJid);
        this.A03 = (C167637yT) C165617ti.A0A(new B9J(r5, userJid, 0), this).A00(C167637yT.class);
        BA7.A00(this, this.A0h.A06, 10);
        this.A0h.A04.A08(this, new BAC(bundle, findViewById, this, 0));
        BA7.A00(this, this.A0h.A08, 11);
        BA7.A00(this, this.A0h.A03, 12);
        this.A0R.registerObserver(this.A0C);
        this.A0W.A0O.add(this);
        if (findViewById != null && !this.A02.A0M(this.A0q)) {
            C36341k9.A13(this, R.id.divider_bizinfo, 0);
            findViewById.setVisibility(0);
            View findViewById2 = findViewById(R.id.contact_info_container);
            TextView A0Q = C36391kE.A0Q(this, R.id.contact_name);
            ImageView A0Q2 = C36411kG.A0Q(this, R.id.contact_photo);
            AnonymousClass3L0 A022 = this.A0m.A02(this.A0q);
            AnonymousClass141 A0D2 = this.A0k.A0D(this.A0q);
            if (A0Q != null) {
                if (A022 == null) {
                    str = null;
                } else {
                    str = A022.A08;
                }
                if (!AnonymousClass14B.A0F(str)) {
                    A0Q.setText(str);
                } else {
                    BA7.A01(this, this.A0h.A05, A0Q, 9);
                    C167647yU r2 = this.A0h;
                    C36391kE.A1R(r2.A0L, r2, A0D2, 49);
                }
            }
            AnonymousClass1RY A052 = this.A07.A05(this, "product-detail-activity");
            this.A0A = A052;
            A052.A08(A0Q2, A0D2);
            C48892iE.A00(findViewById2, this, 0);
        }
        C21104A8p a8p = this.A0h.A0G;
        AVW.A00(a8p.A04, a8p, 21);
        this.A0P.A0T();
        AnonymousClass1NM.A03(new AnonymousClass9wo(), this.A0o, this.A0q);
        this.A0o.A0D(this.A0q, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (r2 == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onCreateOptionsMenu(android.view.Menu r4) {
        /*
            r3 = this;
            android.view.MenuInflater r1 = r3.getMenuInflater()
            r0 = 2131820570(0x7f11001a, float:1.9273859E38)
            r1.inflate(r0, r4)
            X.7yU r2 = r3.A0h
            int r1 = r3.A00
            X.9up r0 = r3.A0U
            boolean r2 = r2.A0T(r0, r1)
            r0 = 2131431588(0x7f0b10a4, float:1.848491E38)
            android.view.MenuItem r1 = r4.findItem(r0)
            boolean r0 = r3.A18
            if (r0 != 0) goto L_0x0022
            r0 = 1
            if (r2 != 0) goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            r1.setVisible(r0)
            boolean r0 = super.onCreateOptionsMenu(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.product.view.activity.ProductDetailActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (R.id.menu_report == itemId) {
            ReportProductDialogFragment reportProductDialogFragment = new ReportProductDialogFragment();
            reportProductDialogFragment.A00 = new A9R(this);
            Btl(reportProductDialogFragment, (String) null);
            return true;
        } else if (16908332 != itemId) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            this.A0h.A0S(this);
            return true;
        }
    }

    public void onStart() {
        super.onStart();
        if (getIntent().getBooleanExtra("partial_loaded", false)) {
            C167647yU r2 = this.A0h;
            C36341k9.A18(r2.A08, r2.A0H.A09());
        }
    }

    public ProductDetailActivity() {
        this(0);
        this.A0C = new B77(this, 1);
        this.A0D = new BAP(this, 4);
    }
}
