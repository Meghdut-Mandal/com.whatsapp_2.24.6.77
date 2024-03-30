package com.whatsapp.pininchat.banner;

import X.AnonymousClass001;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.ArrayList;

public final class PinInChatBannerMultiplePinsIndicator extends LinearLayout {
    public final ArrayList A00 = AnonymousClass001.A0I();

    public PinInChatBannerMultiplePinsIndicator(Context context) {
        super(context, (AttributeSet) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setupIndicator(X.C62923Ib r8) {
        /*
            r7 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r8, r0)
            r7.removeAllViews()
            int r6 = r8.A01
            r0 = 1
            if (r6 <= r0) goto L_0x008f
            r5 = 0
        L_0x000d:
            java.util.ArrayList r4 = r7.A00
            if (r5 < 0) goto L_0x004f
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            int r0 = X.C36431kI.A07(r4)
            if (r5 > r0) goto L_0x004f
            java.lang.Object r3 = r4.get(r5)
        L_0x001f:
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            int r0 = r8.A00
            android.content.Context r2 = r3.getContext()
            if (r5 != r0) goto L_0x0045
            X.AnonymousClass00C.A08(r2)
            r1 = 2130971183(0x7f040a2f, float:1.7551097E38)
            r0 = 2131102705(0x7f060bf1, float:1.7817855E38)
        L_0x0032:
            int r0 = X.C36351kA.A01(r2, r1, r0)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r3.setImageTintList(r0)
            r7.addView(r3)
            int r5 = r5 + 1
            if (r5 >= r6) goto L_0x008f
            goto L_0x000d
        L_0x0045:
            X.AnonymousClass00C.A08(r2)
            r1 = 2130971210(0x7f040a4a, float:1.7551152E38)
            r0 = 2131102767(0x7f060c2f, float:1.7817981E38)
            goto L_0x0032
        L_0x004f:
            android.content.res.Resources r1 = X.C36341k9.A0F(r7)
            r0 = 2131167915(0x7f070aab, float:1.7950117E38)
            int r1 = X.C36441kJ.A05(r1, r0)
            r3 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r1, r3, r0)
            if (r5 <= 0) goto L_0x0072
            android.content.res.Resources r1 = X.C36341k9.A0F(r7)
            r0 = 2131167914(0x7f070aaa, float:1.7950115E38)
            int r0 = X.C36441kJ.A05(r1, r0)
            r2.setMargins(r3, r0, r3, r3)
        L_0x0072:
            android.content.Context r0 = r7.getContext()
            com.whatsapp.WaImageView r3 = new com.whatsapp.WaImageView
            r3.<init>(r0)
            r3.setLayoutParams(r2)
            r0 = 2131234340(0x7f080e24, float:1.8084843E38)
            r3.setImageResource(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY
            r3.setScaleType(r0)
            java.lang.Boolean r0 = X.C18750th.A03
            r4.add(r3)
            goto L_0x001f
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.pininchat.banner.PinInChatBannerMultiplePinsIndicator.setupIndicator(X.3Ib):void");
    }

    public PinInChatBannerMultiplePinsIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PinInChatBannerMultiplePinsIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
