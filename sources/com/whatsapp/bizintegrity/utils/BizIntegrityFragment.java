package com.whatsapp.bizintegrity.utils;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass17Y;
import X.AnonymousClass4P1;
import X.AnonymousClass6YV;
import X.C124425yA;
import X.C20810yC;
import X.C21060yb;
import X.C24801Dv;
import X.C36331k8;
import X.C36401kF;
import X.C429721s;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class BizIntegrityFragment extends WDSBottomSheetDialogFragment {
    public View A00;
    public FrameLayout A01;
    public LinearLayout A02;
    public C24801Dv A03;
    public WaImageView A04;
    public C124425yA A05;
    public WDSButton A06;
    public WDSButton A07;
    public Map A08;
    public AnonymousClass17Y A09;
    public C21060yb A0A;
    public C20810yC A0B;

    public void A1m(View view, int i, int i2) {
        TextEmojiLabel A0P = C36401kF.A0P(view, i);
        Context A1D = A1D();
        C20810yC r3 = this.A0B;
        AnonymousClass17Y r12 = this.A09;
        C24801Dv r11 = this.A03;
        C21060yb r13 = this.A0A;
        String A0n = A0n(i2);
        Map map = this.A08;
        HashMap A0J = AnonymousClass001.A0J();
        if (map != null) {
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                Object key = A11.getKey();
                C429721s r9 = new C429721s(A1D, r11, r12, r13, A11.getValue().toString());
                r9.A04 = false;
                r9.A02 = (AnonymousClass4P1) map.get(key);
                A0J.put(A11.getKey(), r9);
            }
        }
        SpannableStringBuilder A032 = AnonymousClass6YV.A03(A0n, A0J);
        C36331k8.A1A(r3, A0P);
        C36331k8.A16(A0P, r13);
        A0P.setText(A032);
    }

    public BizIntegrityFragment(C24801Dv r1, AnonymousClass17Y r2, C124425yA r3, C21060yb r4, C20810yC r5) {
        this.A05 = r3;
        this.A0B = r5;
        this.A09 = r2;
        this.A03 = r1;
        this.A0A = r4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x01ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1G(android.os.Bundle r10, android.view.LayoutInflater r11, android.view.ViewGroup r12) {
        /*
            r9 = this;
            r0 = 2131624176(0x7f0e00f0, float:1.8875524E38)
            r6 = 0
            android.view.View r1 = r11.inflate(r0, r12, r6)
            r9.A00 = r1
            r0 = 2131427981(0x7f0b028d, float:1.8477594E38)
            com.whatsapp.WaImageView r0 = X.C36431kI.A0X(r1, r0)
            r9.A04 = r0
            android.view.View r1 = r9.A00
            r0 = 2131427978(0x7f0b028a, float:1.8477587E38)
            com.whatsapp.wds.components.button.WDSButton r0 = X.C36431kI.A0y(r1, r0)
            r9.A06 = r0
            android.view.View r1 = r9.A00
            r0 = 2131427984(0x7f0b0290, float:1.84776E38)
            com.whatsapp.wds.components.button.WDSButton r1 = X.C36431kI.A0y(r1, r0)
            r9.A07 = r1
            X.5yA r5 = r9.A05
            java.lang.Integer r4 = r5.A07
            r0 = 0
            if (r4 != 0) goto L_0x0032
            r0 = 8
        L_0x0032:
            r1.setVisibility(r0)
            android.view.View r1 = r9.A00
            r0 = 2131427979(0x7f0b028b, float:1.847759E38)
            android.view.View r1 = r1.findViewById(r0)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r9.A01 = r1
            int r0 = r5.A01
            android.view.View r0 = r11.inflate(r0, r1, r6)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r9.A02 = r0
            boolean r3 = r9 instanceof com.whatsapp.bizintegrity.marketingoptout.MarketingReOptInFragment
            if (r3 == 0) goto L_0x01b4
            java.util.HashMap r2 = X.AnonymousClass001.A0J()
            r0 = 2
            X.6Vj r1 = new X.6Vj
            r1.<init>(r9, r0)
            java.lang.String r0 = "stop-business-info"
            r2.put(r0, r1)
            r0 = 3
            X.6Vj r1 = new X.6Vj
            r1.<init>(r9, r0)
            java.lang.String r0 = "offers-updates"
        L_0x0067:
            r2.put(r0, r1)
        L_0x006a:
            r9.A08 = r2
            java.lang.Integer r6 = r5.A06
            if (r6 == 0) goto L_0x01ab
            java.lang.Integer r0 = r5.A04
            if (r0 == 0) goto L_0x01ab
            com.whatsapp.WaImageView r2 = r9.A04
            android.content.Context r1 = r9.A1D()
            int r0 = r0.intValue()
            android.graphics.drawable.Drawable r0 = X.C013105r.A01(r1, r0)
            r2.setBackground(r0)
            android.content.Context r1 = r9.A1D()
            int r0 = r6.intValue()
            android.graphics.drawable.Drawable r0 = X.C013105r.A01(r1, r0)
            android.graphics.drawable.Drawable r2 = r0.mutate()
            android.content.res.Resources r1 = X.C36341k9.A0G(r9)
            java.lang.Integer r0 = r5.A05
            int r0 = r0.intValue()
            X.C90484aE.A15(r1, r2, r0)
            com.whatsapp.WaImageView r0 = r9.A04
            r0.setImageDrawable(r2)
        L_0x00a7:
            com.whatsapp.wds.components.button.WDSButton r1 = r9.A06
            int r0 = r5.A00
            r1.setText(r0)
            if (r4 == 0) goto L_0x00c6
            com.whatsapp.wds.components.button.WDSButton r1 = r9.A07
            int r0 = r4.intValue()
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r9.A07
            r0 = 0
            r1.setBackground(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r9.A07
            r0 = 10
            X.C36361kB.A18(r1, r9, r0)
        L_0x00c6:
            com.whatsapp.wds.components.button.WDSButton r1 = r9.A06
            r0 = 11
            X.C36361kB.A18(r1, r9, r0)
            android.view.View r2 = r9.A00
            int r1 = r5.A02
            android.content.Context r0 = r2.getContext()
            int r4 = X.C36391kE.A04(r0)
            r0 = 2131427987(0x7f0b0293, float:1.8477606E38)
            android.widget.TextView r2 = X.C36391kE.A0P(r2, r0)
            android.content.res.Resources r0 = X.C36341k9.A0G(r9)
            java.lang.String r1 = r0.getString(r1)
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.NORMAL
            r2.setText(r1, r0)
            android.content.res.Resources r0 = X.C36341k9.A0G(r9)
            X.C36351kA.A15(r0, r2, r4)
            android.view.View r1 = r9.A00
            r0 = 2131427982(0x7f0b028e, float:1.8477596E38)
            android.view.View r2 = r1.findViewById(r0)
            java.lang.Integer r1 = r5.A03
            r0 = 0
            if (r1 != 0) goto L_0x0104
            r0 = 8
        L_0x0104:
            r2.setVisibility(r0)
            if (r1 == 0) goto L_0x012d
            android.view.View r2 = r9.A00
            int r1 = r1.intValue()
            r0 = 2131427982(0x7f0b028e, float:1.8477596E38)
            r4 = 2131102153(0x7f0609c9, float:1.7816736E38)
            android.widget.TextView r2 = X.C36391kE.A0P(r2, r0)
            android.content.res.Resources r0 = X.C36341k9.A0G(r9)
            java.lang.String r1 = r0.getString(r1)
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.NORMAL
            r2.setText(r1, r0)
            android.content.res.Resources r0 = X.C36341k9.A0G(r9)
            X.C36351kA.A15(r0, r2, r4)
        L_0x012d:
            android.widget.FrameLayout r1 = r9.A01
            android.widget.LinearLayout r0 = r9.A02
            r1.addView(r0)
            r5 = r9
            if (r3 == 0) goto L_0x0150
            android.widget.LinearLayout r2 = r9.A02
            r1 = 2131431423(0x7f0b0fff, float:1.8484575E38)
            r0 = 2131896738(0x7f1229a2, float:1.9428346E38)
            r9.A1m(r2, r1, r0)
            android.widget.LinearLayout r2 = r9.A02
            r1 = 2131431420(0x7f0b0ffc, float:1.8484569E38)
            r0 = 2131896741(0x7f1229a5, float:1.9428352E38)
        L_0x014a:
            r9.A1m(r2, r1, r0)
        L_0x014d:
            android.view.View r0 = r9.A00
            return r0
        L_0x0150:
            boolean r0 = r9 instanceof com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment
            if (r0 == 0) goto L_0x0197
            com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment r5 = (com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment) r5
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r5.A02 = r0
            X.5pD[] r8 = com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment.A08
            r6 = 4
            r4 = 0
        L_0x0160:
            r7 = r8[r4]
            r0 = 2131624177(0x7f0e00f1, float:1.8875526E38)
            android.view.View r3 = X.C36381kD.A0K(r11, r0)
            r0 = 2131427985(0x7f0b0291, float:1.8477602E38)
            android.widget.TextView r2 = X.C36391kE.A0P(r3, r0)
            r0 = 2131427983(0x7f0b028f, float:1.8477598E38)
            android.view.View r1 = r3.findViewById(r0)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            android.widget.CompoundButton$OnCheckedChangeListener r0 = r5.A07
            r1.setOnCheckedChangeListener(r0)
            int r0 = r7.A00
            r2.setText(r0)
            android.view.View$OnClickListener r0 = r5.A00
            r3.setOnClickListener(r0)
            java.util.List r0 = r5.A02
            r0.add(r1)
            android.widget.LinearLayout r0 = r5.A02
            r0.addView(r3)
            int r4 = r4 + 1
            if (r4 >= r6) goto L_0x014d
            goto L_0x0160
        L_0x0197:
            android.widget.LinearLayout r2 = r9.A02
            r1 = 2131431421(0x7f0b0ffd, float:1.848457E38)
            r0 = 2131896736(0x7f1229a0, float:1.9428342E38)
            r9.A1m(r2, r1, r0)
            android.widget.LinearLayout r2 = r9.A02
            r1 = 2131431425(0x7f0b1001, float:1.8484579E38)
            r0 = 2131896725(0x7f122995, float:1.942832E38)
            goto L_0x014a
        L_0x01ab:
            com.whatsapp.WaImageView r1 = r9.A04
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x00a7
        L_0x01b4:
            boolean r0 = r9 instanceof com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutFragment
            if (r0 == 0) goto L_0x01d0
            java.util.HashMap r2 = X.AnonymousClass001.A0J()
            X.6Vj r1 = new X.6Vj
            r1.<init>(r9, r6)
            java.lang.String r0 = "resume-business-info"
            r2.put(r0, r1)
            r0 = 1
            X.6Vj r1 = new X.6Vj
            r1.<init>(r9, r0)
            java.lang.String r0 = "intro-warning"
            goto L_0x0067
        L_0x01d0:
            r2 = 0
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bizintegrity.utils.BizIntegrityFragment.A1G(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }
}
