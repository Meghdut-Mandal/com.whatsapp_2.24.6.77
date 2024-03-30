package com.whatsapp.status.playback.widget;

import X.C36371kC;
import X.C36441kJ;
import X.C37521ma;
import X.C87294Of;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import java.util.Set;

public final class StatusPlaybackProgressView extends C37521ma {
    public C87294Of A00;
    public float A01;
    public int A02;
    public int A03;
    public final Set A04 = C36441kJ.A17();
    public final Paint A05 = C36371kC.A0E();
    public final RectF A06 = C36441kJ.A0N();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.2et} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.2ev} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: X.2er} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: X.2es} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: X.2er} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: X.2er} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: X.2er} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: X.2er} */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01db, code lost:
        if (((long) X.C47522eu.A00(r2)) < X.C36371kC.A07(r2.A0D.A07(7902))) goto L_0x01e2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r0 = 0
            r8 = r20
            X.AnonymousClass00C.A0D(r8, r0)
            r7 = r19
            super.onDraw(r8)
            int r0 = r7.A02
            if (r0 == 0) goto L_0x0282
            int r0 = r7.getWidth()
            int r1 = X.C36331k8.A00(r7, r0)
            int r0 = r7.getHeight()
            int r12 = X.AnonymousClass000.A0D(r7, r0)
            float r6 = (float) r1
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r6 * r5
            int r3 = r7.A02
            float r2 = (float) r3
            float r4 = r4 / r2
            int r0 = r12 * 2
            float r1 = (float) r0
            r0 = 2
            float r0 = (float) r0
            float r4 = r4 / r0
            float r17 = java.lang.Math.min(r1, r4)
            int r0 = r3 + -1
            float r0 = (float) r0
            float r0 = r0 * r17
            float r6 = r6 - r0
            float r6 = r6 * r5
            float r6 = r6 / r2
            android.graphics.Paint r5 = r7.A05
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            r5.setStrokeCap(r0)
            X.C36431kI.A1L(r5)
            int r0 = r7.getPaddingLeft()
            float r1 = (float) r0
            int r0 = r7.getPaddingTop()
            float r0 = (float) r0
            r8.translate(r1, r0)
            int r0 = r7.A02
            r18 = r0
            r11 = 0
            r4 = 0
            r3 = 0
        L_0x0058:
            r0 = r18
            if (r4 >= r0) goto L_0x027b
            int r2 = r7.A03
            r16 = 1073741824(0x40000000, float:2.0)
            if (r4 != r2) goto L_0x0252
            X.4Of r0 = r7.A00
            if (r0 == 0) goto L_0x0078
            X.3rJ r0 = (X.C77943rJ) r0
            X.2fB r0 = r0.A00
            X.3LJ r2 = r0.A0D()
            boolean r0 = r2 instanceof X.C47542ew
            if (r0 == 0) goto L_0x00b7
            X.2ew r2 = (X.C47542ew) r2
            float r1 = r2.A00
        L_0x0076:
            r7.A01 = r1
        L_0x0078:
            float r13 = r7.A01
            float r13 = r13 * r6
            r0 = 100
            float r0 = (float) r0
            float r13 = r13 / r0
            java.util.Set r14 = r7.A04
            boolean r1 = X.AnonymousClass000.A1Z(r14, r4)
            r0 = 1728053247(0x66ffffff, float:6.0446287E23)
            if (r1 == 0) goto L_0x008d
            r0 = 1727676737(0x66fa4141, float:5.9089767E23)
        L_0x008d:
            r5.setColor(r0)
            android.graphics.RectF r10 = r7.A06
            float r0 = r3 + r6
            float r9 = (float) r12
            r10.set(r3, r11, r0, r9)
            float r2 = r9 / r16
            r8.drawRoundRect(r10, r2, r2, r5)
            boolean r1 = X.AnonymousClass000.A1Z(r14, r4)
            r0 = -1
            if (r1 == 0) goto L_0x00a7
            r0 = -376511(0xfffffffffffa4141, float:NaN)
        L_0x00a7:
            r5.setColor(r0)
            float r13 = r13 + r3
            r10.set(r3, r11, r13, r9)
            r8.drawRoundRect(r10, r2, r2, r5)
        L_0x00b1:
            float r0 = r6 + r17
            float r3 = r3 + r0
            int r4 = r4 + 1
            goto L_0x0058
        L_0x00b7:
            boolean r0 = r2 instanceof X.C47502es
            if (r0 == 0) goto L_0x00d9
            X.2es r2 = (X.C47502es) r2
            X.3Jy r9 = r2.A05
        L_0x00bf:
            long r0 = r9.A00()
            float r13 = (float) r0
            r10 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 * r10
            long r0 = r9.A00
            float r9 = (float) r0
            float r13 = r13 / r9
            float r1 = java.lang.Math.min(r10, r13)
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0076
            X.3G7 r0 = r2.A05
            r0.A00()
            goto L_0x0076
        L_0x00d9:
            boolean r0 = r2 instanceof X.C47532ev
            if (r0 == 0) goto L_0x00e2
            X.2ev r2 = (X.C47532ev) r2
            X.3Jy r9 = r2.A0D
            goto L_0x00bf
        L_0x00e2:
            boolean r0 = r2 instanceof X.C47512et
            if (r0 == 0) goto L_0x00eb
            X.2et r2 = (X.C47512et) r2
            X.3Jy r9 = r2.A07
            goto L_0x00bf
        L_0x00eb:
            boolean r0 = r2 instanceof X.C47522eu
            if (r0 == 0) goto L_0x00fe
            X.2eu r2 = (X.C47522eu) r2
            boolean r0 = r2 instanceof X.C47552ex
            if (r0 == 0) goto L_0x01a4
            X.2ex r2 = (X.C47552ex) r2
            X.3Qq r14 = r2.A02
            if (r14 != 0) goto L_0x0103
            r1 = 0
            goto L_0x0076
        L_0x00fe:
            X.2er r2 = (X.C47492er) r2
            X.3Jy r9 = r2.A01
            goto L_0x00bf
        L_0x0103:
            int r1 = r2.A04
            int r0 = r2.A02
            r13 = 1120403456(0x42c80000, float:100.0)
            if (r1 < r0) goto L_0x010f
            r1 = 1120403456(0x42c80000, float:100.0)
            goto L_0x0076
        L_0x010f:
            boolean r0 = r14.A0X()
            if (r0 != 0) goto L_0x011d
            X.3G7 r0 = r2.A05
            X.2fB r0 = r0.A01
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x017e
        L_0x011d:
            int r0 = r14.A04()
            long r0 = (long) r0
            com.whatsapp.mediaview.PhotoView r15 = r2.A0G
            int r10 = r15.getVisibility()
            r9 = 8
            if (r10 == r9) goto L_0x0157
            X.3Qq r9 = r2.A02
            r10 = 1
            if (r9 == 0) goto L_0x0157
            boolean r9 = r9.A0Y()
            if (r9 != r10) goto L_0x0157
            X.3Qq r9 = r2.A02
            if (r9 == 0) goto L_0x0141
            android.view.View r9 = r9.A08()
            if (r9 == r15) goto L_0x0157
        L_0x0141:
            X.2cZ r9 = r2.A0H
            X.3Qj r10 = r9.A01
            if (r10 == 0) goto L_0x0192
            boolean r9 = r10.A0U
            if (r9 != 0) goto L_0x0192
            int r9 = r10.A08
            if (r9 <= 0) goto L_0x0153
            int r9 = r10.A07
            if (r9 > 0) goto L_0x0157
        L_0x0153:
            android.graphics.RectF r9 = r10.A0H
            if (r9 == 0) goto L_0x0192
        L_0x0157:
            int r15 = r2.A03
            r10 = 0
            if (r15 != 0) goto L_0x016c
            int r15 = r14.A05()
            r2.A03 = r15
            r9 = 1
            if (r15 <= r9) goto L_0x018b
            long r9 = (long) r15
            int r9 = X.C47552ex.A08(r2, r9)
            r2.A02 = r9
        L_0x016c:
            long r9 = (long) r15
            long r0 = r0 / r9
            float r9 = (float) r0
            float r9 = r9 * r13
            java.lang.Float r0 = java.lang.Float.valueOf(r9)
        L_0x0174:
            float r0 = X.C36441kJ.A03(r0)
            float r0 = java.lang.Math.min(r13, r0)
            r2.A00 = r0
        L_0x017e:
            int r0 = r2.A04
            float r1 = (float) r0
            float r1 = r1 * r13
            float r0 = r2.A00
            float r1 = r1 + r0
            int r0 = r2.A02
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L_0x0076
        L_0x018b:
            r2.A03 = r10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            goto L_0x0174
        L_0x0192:
            X.C47522eu.A04(r2)
            boolean r9 = r2.A04
            if (r9 != 0) goto L_0x0157
            r10 = 8
            r15.setVisibility(r10)
            android.view.View r9 = r2.A08
            r9.setVisibility(r10)
            goto L_0x0157
        L_0x01a4:
            X.3Qq r0 = r2.A02
            if (r0 == 0) goto L_0x01e2
            r14 = 1
            boolean r0 = r0.A0X()
            boolean r0 = X.AnonymousClass000.A1S(r0, r14)
            r10 = 1120403456(0x42c80000, float:100.0)
            if (r0 != 0) goto L_0x01e9
            X.3G7 r0 = r2.A05
            X.2fB r0 = r0.A01
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x01e9
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x01e6
            r0 = 0
        L_0x01c2:
            r2.A00 = r0
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x01dd
            int r0 = X.C47522eu.A00(r2)
            long r0 = (long) r0
            X.0yC r10 = r2.A0D
            r9 = 7902(0x1ede, float:1.1073E-41)
            int r9 = r10.A07(r9)
            long r13 = X.C36371kC.A07(r9)
            int r9 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r9 < 0) goto L_0x01e2
        L_0x01dd:
            X.3G7 r0 = r2.A05
            r0.A00()
        L_0x01e2:
            float r1 = r2.A00
            goto L_0x0076
        L_0x01e6:
            r2.A00 = r10
            goto L_0x01dd
        L_0x01e9:
            int r0 = X.C47522eu.A00(r2)
            long r0 = (long) r0
            com.whatsapp.mediaview.PhotoView r15 = r2.A0G
            int r13 = r15.getVisibility()
            r9 = 8
            if (r13 == r9) goto L_0x0222
            X.3Qq r9 = r2.A02
            if (r9 == 0) goto L_0x0222
            boolean r9 = r9.A0Y()
            if (r9 != r14) goto L_0x0222
            X.3Qq r9 = r2.A02
            if (r9 == 0) goto L_0x020c
            android.view.View r9 = r9.A08()
            if (r9 == r15) goto L_0x0222
        L_0x020c:
            X.2cZ r9 = r2.A0H
            X.3Qj r13 = r9.A01
            if (r13 == 0) goto L_0x023d
            boolean r9 = r13.A0U
            if (r9 != 0) goto L_0x023d
            int r9 = r13.A08
            if (r9 <= 0) goto L_0x021e
            int r9 = r13.A07
            if (r9 > 0) goto L_0x0222
        L_0x021e:
            android.graphics.RectF r9 = r13.A0H
            if (r9 == 0) goto L_0x023d
        L_0x0222:
            X.3Qq r9 = r2.A02
            if (r9 == 0) goto L_0x023b
            boolean r9 = r9.A0X()
            if (r9 != 0) goto L_0x023b
        L_0x022c:
            r2.A07 = r14
            float r13 = (float) r0
            float r13 = r13 * r10
            long r0 = r2.A0A()
            float r9 = (float) r0
            float r13 = r13 / r9
            float r0 = java.lang.Math.min(r10, r13)
            goto L_0x01c2
        L_0x023b:
            r14 = 0
            goto L_0x022c
        L_0x023d:
            X.C47522eu.A04(r2)
            X.C47522eu.A04(r2)
            boolean r9 = r2.A04
            if (r9 != 0) goto L_0x0222
            r13 = 8
            r15.setVisibility(r13)
            android.view.View r9 = r2.A08
            r9.setVisibility(r13)
            goto L_0x0222
        L_0x0252:
            java.util.Set r0 = r7.A04
            boolean r1 = X.AnonymousClass000.A1Z(r0, r4)
            if (r4 >= r2) goto L_0x0272
            r0 = -1
            if (r1 == 0) goto L_0x0260
            r0 = -376511(0xfffffffffffa4141, float:NaN)
        L_0x0260:
            r5.setColor(r0)
            android.graphics.RectF r2 = r7.A06
            float r1 = r3 + r6
            float r0 = (float) r12
            r2.set(r3, r11, r1, r0)
            float r0 = r0 / r16
            r8.drawRoundRect(r2, r0, r0, r5)
            goto L_0x00b1
        L_0x0272:
            r0 = 1728053247(0x66ffffff, float:6.0446287E23)
            if (r1 == 0) goto L_0x0260
            r0 = 1727676737(0x66fa4141, float:5.9089767E23)
            goto L_0x0260
        L_0x027b:
            X.4Of r0 = r7.A00
            if (r0 == 0) goto L_0x0282
            r7.invalidate()
        L_0x0282:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.widget.StatusPlaybackProgressView.onDraw(android.graphics.Canvas):void");
    }

    public final void setCount(int i) {
        this.A02 = i;
        invalidate();
    }

    public final void setPosition(int i) {
        if (this.A03 != i) {
            this.A03 = i;
            this.A01 = 0.0f;
            invalidate();
        }
    }

    public final void setProgressProvider(C87294Of r1) {
        this.A00 = r1;
        invalidate();
    }

    public StatusPlaybackProgressView(Context context) {
        super(context);
    }

    public StatusPlaybackProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public StatusPlaybackProgressView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public StatusPlaybackProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
