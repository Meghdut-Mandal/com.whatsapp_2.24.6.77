package X;

import android.animation.ValueAnimator;

/* renamed from: X.5cU  reason: invalid class name and case insensitive filesystem */
public class C111565cU implements ValueAnimator.AnimatorUpdateListener {
    public Object A00;
    public final int A01;

    public C111565cU(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(ValueAnimator valueAnimator, Object obj, int i) {
        valueAnimator.addUpdateListener(new C111565cU(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.4bo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: X.4bp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: X.4bo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: X.4bo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v43, resolved type: com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView} */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0281, code lost:
        r1.setAlpha(r0.intValue());
        r2.invalidate();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x028b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03ae, code lost:
        r0.setAlpha(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03b1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03e7, code lost:
        r3.invalidateSelf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03ea, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x042b, code lost:
        r1.setTranslationY(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x042e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        r1 = X.C36341k9.A03(r11);
        r0 = r2.getLayoutParams();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        r0.height = r1;
        r2.setLayoutParams(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a6, code lost:
        r3.postInvalidate();
        r3.invalidateOutline();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        if (r4.A0X != false) goto L_0x003d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnimationUpdate(android.animation.ValueAnimator r11) {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x03eb;
                case 1: goto L_0x03d2;
                case 2: goto L_0x03c7;
                case 3: goto L_0x03bf;
                case 4: goto L_0x03b2;
                case 5: goto L_0x03a4;
                case 6: goto L_0x0393;
                case 7: goto L_0x03a4;
                case 8: goto L_0x0385;
                case 9: goto L_0x0321;
                case 10: goto L_0x0315;
                case 11: goto L_0x00cf;
                case 12: goto L_0x0308;
                case 13: goto L_0x02fa;
                case 14: goto L_0x02e5;
                case 15: goto L_0x0421;
                case 16: goto L_0x02ce;
                case 17: goto L_0x0005;
                case 18: goto L_0x02b1;
                case 19: goto L_0x00c0;
                case 20: goto L_0x02a3;
                case 21: goto L_0x02a3;
                case 22: goto L_0x028c;
                case 23: goto L_0x0275;
                case 24: goto L_0x0264;
                case 25: goto L_0x0256;
                case 26: goto L_0x0248;
                case 27: goto L_0x023a;
                case 28: goto L_0x022c;
                case 29: goto L_0x021e;
                case 30: goto L_0x0210;
                case 31: goto L_0x0202;
                case 32: goto L_0x001d;
                case 33: goto L_0x01fa;
                case 34: goto L_0x01ec;
                case 35: goto L_0x0005;
                case 36: goto L_0x01dc;
                case 37: goto L_0x01cc;
                case 38: goto L_0x01bf;
                case 39: goto L_0x01ad;
                case 40: goto L_0x0174;
                case 41: goto L_0x0165;
                case 42: goto L_0x014a;
                case 43: goto L_0x0123;
                case 44: goto L_0x0107;
                case 45: goto L_0x00f7;
                case 46: goto L_0x00e9;
                case 47: goto L_0x00d5;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r10.A00
            android.view.View r2 = (android.view.View) r2
            r0 = 1
            X.AnonymousClass00C.A0D(r11, r0)
        L_0x000d:
            int r1 = X.C36341k9.A03(r11)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            if (r0 == 0) goto L_0x001c
            r0.height = r1
            r2.setLayoutParams(r0)
        L_0x001c:
            return
        L_0x001d:
            java.lang.Object r0 = r10.A00
            X.6Fh r0 = (X.C129126Fh) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r4 = r0.A0I
            X.6VT r0 = r0.A0G
            X.00s r0 = r0.A06
            int r8 = X.C36341k9.A07(r0)
            float r5 = X.AnonymousClass000.A00(r11)
            r1 = 1
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x003d
            boolean r0 = r4.A0X
            r3 = 1053609165(0x3ecccccd, float:0.4)
            if (r0 == 0) goto L_0x003e
        L_0x003d:
            r3 = r5
        L_0x003e:
            java.lang.String r7 = "textTool"
            java.lang.String r6 = "shapeTool"
            java.lang.String r2 = "cropTool"
            if (r8 == r1) goto L_0x0094
            r0 = 2
            java.lang.String r1 = "penTool"
            if (r8 == r0) goto L_0x0073
            r0 = 3
            if (r8 == r0) goto L_0x0052
            r0 = 5
            if (r8 == r0) goto L_0x0073
            return
        L_0x0052:
            android.widget.ImageView r0 = r4.A07
            if (r0 != 0) goto L_0x005b
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x005b:
            r0.setAlpha(r5)
            android.widget.ImageView r0 = r4.A08
            if (r0 != 0) goto L_0x0067
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x0067:
            r0.setAlpha(r5)
            android.widget.ImageView r0 = r4.A04
            if (r0 != 0) goto L_0x00b5
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x0073:
            android.widget.ImageView r0 = r4.A07
            if (r0 != 0) goto L_0x007c
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x007c:
            r0.setAlpha(r5)
            com.whatsapp.WaTextView r0 = r4.A0D
            if (r0 != 0) goto L_0x0088
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r7)
            throw r0
        L_0x0088:
            r0.setAlpha(r5)
            android.widget.ImageView r0 = r4.A04
            if (r0 != 0) goto L_0x00b5
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x0094:
            android.widget.ImageView r0 = r4.A08
            if (r0 != 0) goto L_0x009d
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x009d:
            r0.setAlpha(r5)
            com.whatsapp.WaTextView r0 = r4.A0D
            if (r0 != 0) goto L_0x00a9
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r7)
            throw r0
        L_0x00a9:
            r0.setAlpha(r5)
            android.widget.ImageView r0 = r4.A04
            if (r0 != 0) goto L_0x00b5
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x00b5:
            r0.setAlpha(r5)
            android.widget.ImageView r0 = r4.A06
            if (r0 == 0) goto L_0x001c
            r0.setAlpha(r3)
            return
        L_0x00c0:
            java.lang.Object r0 = r10.A00
            X.6F9 r0 = (X.AnonymousClass6F9) r0
            android.view.View r1 = r0.A01
            if (r1 == 0) goto L_0x001c
            int r0 = X.C36361kB.A01(r11)
            float r0 = (float) r0
            goto L_0x042b
        L_0x00cf:
            java.lang.Object r2 = r10.A00
            android.view.View r2 = (android.view.View) r2
            goto L_0x000d
        L_0x00d5:
            java.lang.Object r2 = r11.getAnimatedValue()
            java.lang.Number r2 = (java.lang.Number) r2
            java.lang.Object r0 = r10.A00
            org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText r0 = (org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText) r0
            android.graphics.Paint r1 = r0.A07
            int r0 = r2.intValue()
            r1.setAlpha(r0)
            return
        L_0x00e9:
            java.lang.Object r0 = r11.getAnimatedValue()
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.Object r2 = r10.A00
            org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText r2 = (org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText) r2
            android.graphics.Paint r1 = r2.A07
            goto L_0x0281
        L_0x00f7:
            java.lang.Object r0 = r10.A00
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            X.64k r1 = r0.A0c
            float r0 = X.AnonymousClass000.A00(r11)
            r1.A00 = r0
            r1.A00()
            return
        L_0x0107:
            java.lang.Object r3 = r10.A00
            X.4df r3 = (X.C92354df) r3
            float r1 = X.AnonymousClass000.A00(r11)
            int r0 = r3.A0E
            float r0 = (float) r0
            float r0 = r0 * r1
            float r2 = r3.A0A
            float r2 = r2 - r0
            float r1 = r3.A0B
            float r0 = r3.A01
            float r0 = X.C90494aF.A01(r1, r0)
            float r2 = r2 - r0
            r3.A00 = r2
            goto L_0x01a6
        L_0x0123:
            java.lang.Object r3 = r10.A00
            X.4df r3 = (X.C92354df) r3
            float r2 = X.AnonymousClass000.A00(r11)
            r1 = 1075838976(0x40200000, float:2.5)
            float r1 = r1 * r2
            r0 = -1071644672(0xffffffffc0200000, float:-2.5)
            float r1 = r1 + r0
            r3.A03 = r1
            android.graphics.Bitmap r0 = r3.A0R
            int r0 = r0.getHeight()
            float r1 = (float) r0
            r0 = 1053273620(0x3ec7ae14, float:0.39)
            float r1 = r1 * r0
            float r1 = r1 * r2
            float r0 = r3.A0B
            float r0 = r0 - r1
            r3.A01 = r0
            float r0 = r3.A0C
            float r0 = r0 - r1
            r3.A02 = r0
            return
        L_0x014a:
            java.lang.Object r4 = r10.A00
            X.4df r4 = (X.C92354df) r4
            int r3 = X.C36361kB.A01(r11)
            android.graphics.Paint r2 = r4.A0W
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            r0.<init>(r3, r1)
            r2.setColorFilter(r0)
            r4.postInvalidate()
            r4.invalidateOutline()
            return
        L_0x0165:
            java.lang.Object r1 = r10.A00
            android.view.View r1 = (android.view.View) r1
            float r0 = X.AnonymousClass000.A00(r11)
            r1.setScaleX(r0)
            r1.setScaleY(r0)
            return
        L_0x0174:
            java.lang.Object r3 = r10.A00
            X.4df r3 = (X.C92354df) r3
            float r2 = X.AnonymousClass000.A00(r11)
            float r1 = r3.A06
            float r0 = r3.A0A
            float r0 = r0 - r1
            float r0 = r0 * r2
            float r1 = r1 + r0
            r3.A00 = r1
            float r1 = r3.A08
            float r0 = r3.A0D
            float r0 = r0 - r1
            float r0 = r0 * r2
            float r1 = r1 + r0
            r3.A04 = r1
            float r1 = r3.A07
            float r0 = r3.A0C
            float r0 = r0 - r1
            float r0 = r0 * r2
            float r1 = r1 + r0
            r3.A02 = r1
            r0 = 1069547520(0x3fc00000, float:1.5)
            float r2 = r2 * r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.min(r0, r2)
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            r3.A0K = r0
        L_0x01a6:
            r3.postInvalidate()
            r3.invalidateOutline()
            return
        L_0x01ad:
            java.lang.Object r0 = r10.A00
            X.5NK r0 = (X.AnonymousClass5NK) r0
            X.3Qq r0 = r0.A0H
            android.view.View r1 = r0.A08()
            int r0 = X.C36361kB.A01(r11)
            r1.setBackgroundColor(r0)
            return
        L_0x01bf:
            java.lang.Object r1 = r10.A00
            X.6VH r1 = (X.AnonymousClass6VH) r1
            r0 = 1
            float r0 = X.C36361kB.A00(r11, r0)
            X.AnonymousClass6VH.A00(r1, r0)
            return
        L_0x01cc:
            java.lang.Object r1 = r10.A00
            X.6VH r1 = (X.AnonymousClass6VH) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r11, r0)
            int r0 = X.C36341k9.A03(r11)
            X.AnonymousClass6VH.A01(r1, r0)
            return
        L_0x01dc:
            java.lang.Object r1 = r10.A00
            com.google.android.material.chip.Chip r1 = (com.google.android.material.chip.Chip) r1
            int r0 = X.C36361kB.A01(r11)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.setChipBackgroundColor(r0)
            return
        L_0x01ec:
            java.lang.Object r0 = r10.A00
            com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment r0 = (com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment) r0
            android.view.View r1 = r0.A01
            float r0 = X.AnonymousClass000.A00(r11)
            r1.setAlpha(r0)
            return
        L_0x01fa:
            java.lang.Object r0 = r10.A00
            com.whatsapp.payments.ui.widget.PaymentAmountInputField r0 = (com.whatsapp.payments.ui.widget.PaymentAmountInputField) r0
            r0.A0F(r11)
            return
        L_0x0202:
            java.lang.Object r0 = r10.A00
            X.6Fh r0 = (X.C129126Fh) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r1 = r0.A0I
            float r0 = X.AnonymousClass000.A00(r11)
            r1.setMagicModToolX(r0)
            return
        L_0x0210:
            java.lang.Object r0 = r10.A00
            X.6Fh r0 = (X.C129126Fh) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r1 = r0.A0I
            float r0 = X.AnonymousClass000.A00(r11)
            r1.setMediaSettingsToolX(r0)
            return
        L_0x021e:
            java.lang.Object r0 = r10.A00
            X.6Fh r0 = (X.C129126Fh) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r1 = r0.A0I
            float r0 = X.AnonymousClass000.A00(r11)
            r1.setUndoToolX(r0)
            return
        L_0x022c:
            java.lang.Object r0 = r10.A00
            X.6Fh r0 = (X.C129126Fh) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r1 = r0.A0I
            float r0 = X.AnonymousClass000.A00(r11)
            r1.setCropToolX(r0)
            return
        L_0x023a:
            java.lang.Object r0 = r10.A00
            X.6Fh r0 = (X.C129126Fh) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r1 = r0.A0I
            float r0 = X.AnonymousClass000.A00(r11)
            r1.setTextToolX(r0)
            return
        L_0x0248:
            java.lang.Object r0 = r10.A00
            X.6Fh r0 = (X.C129126Fh) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r1 = r0.A0I
            float r0 = X.AnonymousClass000.A00(r11)
            r1.setShapeToolX(r0)
            return
        L_0x0256:
            java.lang.Object r0 = r10.A00
            X.6Fh r0 = (X.C129126Fh) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r1 = r0.A0I
            float r0 = X.AnonymousClass000.A00(r11)
            r1.setCloseButtonAlpha(r0)
            return
        L_0x0264:
            java.lang.Object r2 = r10.A00
            X.66R r2 = (X.AnonymousClass66R) r2
            r1 = 1
            float r0 = X.C36361kB.A00(r11, r1)
            r11.getCurrentPlayTime()
            r2.A01 = r1
            r2.A00 = r0
            return
        L_0x0275:
            java.lang.Object r2 = r10.A00
            com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView r2 = (com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView) r2
            android.graphics.Paint r1 = r2.A0A
            java.lang.Object r0 = r11.getAnimatedValue()
            java.lang.Number r0 = (java.lang.Number) r0
        L_0x0281:
            int r0 = r0.intValue()
            r1.setAlpha(r0)
            r2.invalidate()
            return
        L_0x028c:
            java.lang.Object r2 = r10.A00
            X.5CN r2 = (X.AnonymousClass5CN) r2
            r0 = 1
            X.AnonymousClass00C.A0D(r11, r0)
            int r1 = X.C36341k9.A03(r11)
            android.graphics.drawable.Drawable r0 = r2.A04
            if (r0 == 0) goto L_0x029f
            r0.setAlpha(r1)
        L_0x029f:
            r2.invalidate()
            return
        L_0x02a3:
            java.lang.Object r1 = r10.A00
            com.whatsapp.components.RoundCornerProgressBar r1 = (com.whatsapp.components.RoundCornerProgressBar) r1
            float r0 = X.AnonymousClass000.A00(r11)
            r1.A00 = r0
            r1.postInvalidate()
            return
        L_0x02b1:
            java.lang.Object r2 = r10.A00
            X.6WU r2 = (X.AnonymousClass6WU) r2
            android.content.Context r0 = r2.A09
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131168336(0x7f070c50, float:1.795097E38)
            float r1 = X.C36441kJ.A00(r1, r0)
            float r0 = X.AnonymousClass000.A00(r11)
            float r1 = r1 / r0
            int r1 = (int) r1
            com.whatsapp.WaImageView r0 = r2.A0H
            r0.setPadding(r1, r1, r1, r1)
            return
        L_0x02ce:
            java.lang.Object r1 = r10.A00
            X.6X3 r1 = (X.AnonymousClass6X3) r1
            float r2 = X.AnonymousClass000.A00(r11)
            android.view.View r0 = r1.A0D
            r0.setAlpha(r2)
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r1 = r1.A0H
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r0
            r0 = 0
            r1.A1h(r0, r2)
            return
        L_0x02e5:
            java.lang.Object r3 = r10.A00
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r3 = (com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave) r3
            android.graphics.Paint r2 = r3.A04
            float r1 = X.AnonymousClass000.A00(r11)
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            r2.setAlpha(r0)
            r3.invalidate()
            return
        L_0x02fa:
            java.lang.Object r1 = r10.A00
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r1 = (com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave) r1
            float r0 = X.AnonymousClass000.A00(r11)
            r1.A00 = r0
            r1.invalidate()
            return
        L_0x0308:
            java.lang.Object r2 = r10.A00
            X.61s r2 = (X.C1258861s) r2
            r0 = 1
            float r1 = X.C36361kB.A00(r11, r0)
            android.view.View r0 = r2.A00
            goto L_0x03ae
        L_0x0315:
            java.lang.Object r1 = r10.A00
            android.view.View r1 = (android.view.View) r1
            float r0 = X.AnonymousClass000.A00(r11)
            r1.setX(r0)
            return
        L_0x0321:
            r0 = 0
            float r1 = X.C36361kB.A00(r11, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.min(r0, r1)
            r0 = 0
            float r7 = java.lang.Math.max(r0, r1)
            r0 = 1082130432(0x40800000, float:4.0)
            float r7 = r7 * r0
            int r8 = (int) r7
            float r0 = (float) r8
            float r7 = r7 - r0
            float[] r2 = X.C91324bp.A0C
            android.view.animation.Interpolator r1 = X.C91324bp.A0A
            r3 = r2[r8]
            int r9 = r8 + 1
            r0 = 5
            int r9 = r9 % r0
            r2 = r2[r9]
            float r1 = r1.getInterpolation(r7)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            float r6 = X.C90514aH.A00(r3, r0, r2, r1)
            float[] r0 = X.C91324bp.A0D
            android.view.animation.Interpolator r4 = X.C91324bp.A09
            r3 = r0[r8]
            r2 = r0[r9]
            float r1 = r4.getInterpolation(r7)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            float r5 = X.C90514aH.A00(r3, r0, r2, r1)
            float[] r0 = X.C91324bp.A0B
            r3 = r0[r8]
            r2 = r0[r9]
            float r1 = r4.getInterpolation(r7)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            float r4 = X.C90514aH.A00(r3, r0, r2, r1)
            java.lang.Object r3 = r10.A00
            X.4bp r3 = (X.C91324bp) r3
            r2 = 1135869952(0x43b40000, float:360.0)
            float r1 = r5 * r2
            float r1 = r1 + r6
            r0 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 - r0
            r3.A01 = r1
            float r4 = r4 - r5
            float r4 = r4 * r2
            r3.A00 = r4
            goto L_0x03e7
        L_0x0385:
            java.lang.Object r0 = r10.A00
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            X.0Z1 r1 = r0.A14
            float r0 = X.AnonymousClass000.A00(r11)
            r1.A08(r0)
            return
        L_0x0393:
            java.lang.Object r0 = r10.A00
            X.6Fq r0 = (X.C129176Fq) r0
            float r1 = X.AnonymousClass000.A00(r11)
            com.google.android.material.internal.CheckableImageButton r0 = r0.A01
            r0.setScaleX(r1)
            r0.setScaleY(r1)
            return
        L_0x03a4:
            java.lang.Object r0 = r10.A00
            X.6Fq r0 = (X.C129176Fq) r0
            float r1 = X.AnonymousClass000.A00(r11)
            com.google.android.material.internal.CheckableImageButton r0 = r0.A01
        L_0x03ae:
            r0.setAlpha(r1)
            return
        L_0x03b2:
            java.lang.Object r2 = r10.A00
            android.view.View r2 = (android.view.View) r2
            int r1 = X.C36361kB.A01(r11)
            r0 = 0
            r2.scrollTo(r1, r0)
            return
        L_0x03bf:
            java.lang.Object r0 = r10.A00
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r0.invalidateSelf()
            return
        L_0x03c7:
            java.lang.Object r2 = r10.A00
            X.4aY r2 = (X.C90684aY) r2
            long r0 = X.C111565cU.super.getCurrentPlayTime()
            r2.A01 = r0
            return
        L_0x03d2:
            java.lang.Object r3 = r10.A00
            X.4bo r3 = (X.C91314bo) r3
            android.animation.TimeInterpolator r0 = X.C91314bo.A09
            android.graphics.Paint r2 = r3.A05
            int r1 = r3.A02
            float r0 = X.AnonymousClass000.A00(r11)
            int r0 = X.C109515Xw.A00(r1, r0)
            r2.setColor(r0)
        L_0x03e7:
            r3.invalidateSelf()
            return
        L_0x03eb:
            java.lang.Object r2 = r10.A00
            X.4bh r2 = (X.C91244bh) r2
            float r1 = X.AnonymousClass000.A00(r11)
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r1 = (int) r1
            android.graphics.Paint r0 = r2.A01
            r0.setAlpha(r1)
            X.5vk r0 = r2.A06
            android.graphics.Paint r0 = r0.A00
            r0.setAlpha(r1)
            X.64T r0 = r2.A05
            android.graphics.Paint r0 = r0.A00
            r0.setAlpha(r1)
            X.64T r0 = r2.A03
            android.graphics.Paint r0 = r0.A00
            r0.setAlpha(r1)
            X.64T r0 = r2.A04
            android.graphics.Paint r0 = r0.A00
            r0.setAlpha(r1)
            android.graphics.Paint r0 = r2.A02
            r0.setAlpha(r1)
            r2.invalidateSelf()
            return
        L_0x0421:
            java.lang.Object r0 = r10.A00
            X.6X3 r0 = (X.AnonymousClass6X3) r0
            android.view.View r1 = r0.A0D
            float r0 = X.AnonymousClass000.A00(r11)
        L_0x042b:
            r1.setTranslationY(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111565cU.onAnimationUpdate(android.animation.ValueAnimator):void");
    }
}
