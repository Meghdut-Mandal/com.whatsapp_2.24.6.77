package com.whatsapp.productinfra.avatar.ui.stickers.upsell;

import X.AnonymousClass00C;
import X.AnonymousClass190;
import X.AnonymousClass1BF;
import X.AnonymousClass6WF;
import X.C005502l;
import X.C20810yC;
import X.C23871Ae;
import X.C24261Bt;
import android.app.Activity;
import android.view.View;

public final class AvatarStickerUpsellViewController {
    public final Activity A00;
    public final View A01;
    public final C20810yC A02;
    public final C24261Bt A03;
    public final AnonymousClass6WF A04;
    public final C23871Ae A05;
    public final AnonymousClass190 A06;
    public final AnonymousClass1BF A07;
    public final C005502l A08;

    public AvatarStickerUpsellViewController(Activity activity, View view, C20810yC r4, AnonymousClass190 r5, AnonymousClass1BF r6, C24261Bt r7, AnonymousClass6WF r8, C23871Ae r9, C005502l r10) {
        AnonymousClass00C.A0D(view, 1);
        this.A01 = view;
        this.A02 = r4;
        this.A00 = activity;
        this.A06 = r5;
        this.A05 = r9;
        this.A07 = r6;
        this.A03 = r7;
        this.A04 = r8;
        this.A08 = r10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00aa, code lost:
        if (X.AnonymousClass0A2.A00(r5, r1, r0) != r4) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C111435cH r10, X.C023509x r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C151717Aq
            if (r0 == 0) goto L_0x00ad
            r5 = r11
            X.7Aq r5 = (X.C151717Aq) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ad
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r5.label
            r6 = 3
            r8 = 2
            r3 = 0
            r7 = 1
            if (r0 == 0) goto L_0x005c
            if (r0 == r7) goto L_0x0058
            if (r0 == r8) goto L_0x004e
            if (r0 != r6) goto L_0x00b9
            boolean r7 = r5.Z$0
            java.lang.Object r10 = r5.L$1
            java.lang.Object r2 = r5.L$0
            com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController r2 = (com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController) r2
            X.AnonymousClass0AN.A00(r1)
        L_0x002f:
            if (r7 != 0) goto L_0x0040
            X.5Im r0 = X.C106135Im.A00
            boolean r0 = X.AnonymousClass00C.A0J(r10, r0)
            if (r0 == 0) goto L_0x0043
            r1 = 14
        L_0x003b:
            X.1Ae r0 = r2.A05
            r0.A03(r3, r1)
        L_0x0040:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0043:
            X.5In r0 = X.C106145In.A00
            boolean r0 = X.AnonymousClass00C.A0J(r10, r0)
            if (r0 == 0) goto L_0x00b4
            r1 = 9
            goto L_0x003b
        L_0x004e:
            java.lang.Object r10 = r5.L$1
            java.lang.Object r2 = r5.L$0
            com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController r2 = (com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController) r2
            X.AnonymousClass0AN.A00(r1)
            goto L_0x0093
        L_0x0058:
            X.AnonymousClass0AN.A00(r1)
            goto L_0x0040
        L_0x005c:
            X.AnonymousClass0AN.A00(r1)
            X.1Bt r0 = r9.A03
            X.00T r0 = r0.A01
            android.content.SharedPreferences r2 = X.C36411kG.A0E(r0)
            java.lang.String r0 = "pref_has_dismissed_sticker_upsell"
            r1 = 0
            boolean r0 = r2.getBoolean(r0, r1)
            if (r0 == 0) goto L_0x0084
            boolean r0 = r10 instanceof X.C106145In
            if (r0 == 0) goto L_0x0084
            X.02l r1 = r9.A08
            com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$2 r0 = new com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$2
            r0.<init>(r9, r3)
            r5.label = r7
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r5, r1, r0)
            if (r0 != r4) goto L_0x0040
            return r4
        L_0x0084:
            X.1BF r0 = r9.A07
            r5.L$0 = r9
            r5.L$1 = r10
            r5.label = r8
            java.lang.Object r1 = r0.A00(r5, r1)
            if (r1 == r4) goto L_0x00ac
            r2 = r9
        L_0x0093:
            boolean r7 = X.AnonymousClass000.A1X(r1)
            X.02l r1 = r2.A08
            com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$3 r0 = new com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$3
            r0.<init>(r2, r3, r7)
            r5.L$0 = r2
            r5.L$1 = r10
            r5.Z$0 = r7
            r5.label = r6
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r5, r1, r0)
            if (r0 != r4) goto L_0x002f
        L_0x00ac:
            return r4
        L_0x00ad:
            X.7Aq r5 = new X.7Aq
            r5.<init>(r9, r11)
            goto L_0x0012
        L_0x00b4:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x00b9:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController.A00(X.5cH, X.09x):java.lang.Object");
    }
}
