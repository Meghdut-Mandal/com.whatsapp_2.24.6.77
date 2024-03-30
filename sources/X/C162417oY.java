package X;

import android.view.ViewOutlineProvider;

/* renamed from: X.7oY  reason: invalid class name and case insensitive filesystem */
public class C162417oY extends ViewOutlineProvider {
    public Object A00;
    public final int A01;

    public C162417oY(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void getOutline(android.view.View r10, android.graphics.Outline r11) {
        /*
            r9 = this;
            int r0 = r9.A01
            r3 = r11
            switch(r0) {
                case 0: goto L_0x0027;
                case 1: goto L_0x0038;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r0 = r9.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r0
            android.view.View r0 = r0.A07
            android.content.res.Resources r1 = X.C36341k9.A0F(r0)
            r0 = 2131165541(0x7f070165, float:1.7945302E38)
            float r8 = r1.getDimension(r0)
            int r6 = r10.getWidth()
            int r7 = r10.getHeight()
            int r0 = (int) r8
            int r7 = r7 + r0
            r4 = 0
            r5 = 0
            r3.setRoundRect(r4, r5, r6, r7, r8)
        L_0x0026:
            return
        L_0x0027:
            X.C36321k7.A0w(r10, r11)
            android.graphics.drawable.Drawable r0 = r10.getBackground()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r2 = r9.A00
            X.6lc r2 = (X.C140456lc) r2
            r0.getOutline(r11)
            goto L_0x0049
        L_0x0038:
            r2 = 0
            X.C36331k8.A1I(r10, r11)
            android.graphics.drawable.Drawable r0 = r10.getBackground()
            if (r0 == 0) goto L_0x0055
            r0.getOutline(r11)
            java.lang.Object r2 = r9.A00
            X.6lc r2 = (X.C140456lc) r2
        L_0x0049:
            r1 = 65
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r2.A0S(r1, r0)
        L_0x0051:
            r11.setAlpha(r0)
            return
        L_0x0055:
            int r1 = r10.getWidth()
            int r0 = r10.getHeight()
            r11.setRect(r2, r2, r1, r0)
            r0 = 0
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162417oY.getOutline(android.view.View, android.graphics.Outline):void");
    }
}
