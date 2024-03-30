package com.whatsapp.backup.google;

import X.AnonymousClass1QZ;
import X.AnonymousClass3UF;
import X.C18700tb;
import X.C18820ts;
import X.C36341k9;
import X.C36351kA;
import X.C36441kJ;
import X.C37601mu;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.whatsapp.R;

public class GoogleDriveRestoreAnimationView extends View implements C18700tb {
    public float A00;
    public int A01;
    public C37601mu A02;
    public C18820ts A03;
    public AnonymousClass1QZ A04;
    public boolean A05;
    public int A06;
    public int A07;
    public int A08;
    public Resources A09;
    public Paint A0A;
    public Drawable A0B;
    public Drawable A0C;
    public Drawable A0D;
    public boolean A0E;
    public boolean A0F;
    public final DecelerateInterpolator A0G;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        if (r0 != null) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(android.content.Context r7, android.util.AttributeSet r8) {
        /*
            r6 = this;
            r3 = 0
            if (r8 == 0) goto L_0x005d
            android.content.res.Resources$Theme r1 = X.C36361kB.A09(r6)
            int[] r0 = X.C56132vn.A00
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r8, r0, r3, r3)
            r5 = 0
            r4 = 1
            X.0ts r0 = r6.A03     // Catch:{ all -> 0x0055 }
            boolean r1 = X.C36401kF.A1X(r0)     // Catch:{ all -> 0x0055 }
            r0 = 0
            if (r1 == 0) goto L_0x0019
            r0 = 3
        L_0x0019:
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)     // Catch:{ all -> 0x0055 }
            r6.A0D = r0     // Catch:{ all -> 0x0055 }
            X.0ts r0 = r6.A03     // Catch:{ all -> 0x0055 }
            boolean r0 = X.C36401kF.A1X(r0)     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x0028
            r5 = 3
        L_0x0028:
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r5)     // Catch:{ all -> 0x0055 }
            r6.A0B = r0     // Catch:{ all -> 0x0055 }
            r0 = 2
            boolean r0 = r2.getBoolean(r0, r3)     // Catch:{ all -> 0x0055 }
            r6.A0F = r0     // Catch:{ all -> 0x0055 }
            X.0ts r0 = r6.A03     // Catch:{ all -> 0x0055 }
            boolean r1 = X.C36401kF.A1X(r0)     // Catch:{ all -> 0x0055 }
            r0 = 1
            if (r1 == 0) goto L_0x003f
            r0 = 4
        L_0x003f:
            int r0 = r2.getColor(r0, r3)     // Catch:{ all -> 0x0055 }
            r6.A07 = r0     // Catch:{ all -> 0x0055 }
            X.0ts r0 = r6.A03     // Catch:{ all -> 0x0055 }
            boolean r0 = X.C36401kF.A1X(r0)     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x004e
            r4 = 4
        L_0x004e:
            int r0 = r2.getColor(r4, r3)     // Catch:{ all -> 0x0055 }
            r6.A06 = r0     // Catch:{ all -> 0x0055 }
            goto L_0x005a
        L_0x0055:
            r0 = move-exception
            r2.recycle()
            throw r0
        L_0x005a:
            r2.recycle()
        L_0x005d:
            android.content.res.Resources r2 = r7.getResources()
            r6.A09 = r2
            android.graphics.drawable.Drawable r0 = r6.A0D
            if (r0 != 0) goto L_0x007d
            X.0ts r0 = r6.A03
            boolean r1 = X.C36401kF.A1X(r0)
            r0 = 2131232975(0x7f0808cf, float:1.8082074E38)
            if (r1 == 0) goto L_0x0075
            r0 = 2131232973(0x7f0808cd, float:1.808207E38)
        L_0x0075:
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)
            r6.A0D = r0
            if (r0 == 0) goto L_0x0081
        L_0x007d:
            int r3 = r0.getIntrinsicWidth()
        L_0x0081:
            r6.A08 = r3
            android.graphics.drawable.Drawable r0 = r6.A0B
            if (r0 != 0) goto L_0x009d
            android.content.res.Resources r2 = r6.A09
            X.0ts r0 = r6.A03
            boolean r1 = X.C36401kF.A1X(r0)
            r0 = 2131232973(0x7f0808cd, float:1.808207E38)
            if (r1 == 0) goto L_0x0097
            r0 = 2131232975(0x7f0808cf, float:1.8082074E38)
        L_0x0097:
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)
            r6.A0B = r0
        L_0x009d:
            android.graphics.drawable.Drawable r1 = r6.A0D
            int r0 = r6.A07
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3UF.A08(r1, r0)
            r6.A0D = r0
            android.graphics.drawable.Drawable r1 = r6.A0B
            int r0 = r6.A06
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3UF.A08(r1, r0)
            r6.A0B = r0
            android.graphics.Paint r0 = X.C36441kJ.A0K()
            r6.A0A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.GoogleDriveRestoreAnimationView.A00(android.content.Context, android.util.AttributeSet):void");
    }

    public void A01() {
        if (this.A02 == null) {
            C37601mu.A00(this);
        }
        this.A01 = 1;
        startAnimation(this.A02);
    }

    public void A02() {
        if (!this.A0E) {
            this.A0E = true;
            this.A03 = C36341k9.A0U(generatedComponent());
        }
    }

    public void A03(boolean z) {
        int i;
        if (this.A02 == null) {
            C37601mu.A00(this);
        }
        clearAnimation();
        Resources resources = this.A09;
        if (z) {
            this.A0C = AnonymousClass3UF.A04(getContext(), resources.getDrawable(R.drawable.ic_restore_error), R.color.f6nameremoved);
            i = 3;
        } else {
            this.A0D = AnonymousClass3UF.A08(resources.getDrawable(R.drawable.ill_restore_anim), this.A07);
            this.A0C = AnonymousClass3UF.A08(this.A09.getDrawable(R.drawable.ill_restore_success_checkmark), C36351kA.A02(getContext(), getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
            i = 2;
        }
        this.A01 = i;
        C37601mu r2 = this.A02;
        if (r2 != null) {
            r2.setDuration(800);
            startAnimation(this.A02);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A04;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01da, code lost:
        if (r4 < (r2 - 0.5d)) goto L_0x01dc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r26) {
        /*
            r25 = this;
            r12 = r25
            int r0 = r12.getWidth()
            int r5 = X.C36331k8.A00(r12, r0)
            int r1 = r12.getWidth()
            int r0 = r12.getHeight()
            float r1 = (float) r1
            r15 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r15
            float r0 = (float) r0
            float r0 = r0 / r15
            r13 = r26
            r13.translate(r1, r0)
            android.graphics.drawable.Drawable r0 = r12.A0D
            int r0 = r0.getIntrinsicWidth()
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r0
            int r1 = (int) r1
            int r0 = -r5
            float r7 = (float) r0
            float r7 = r7 / r15
            float r8 = (float) r1
            float r8 = r8 / r15
            float r7 = r7 + r8
            int r0 = r12.A01
            r4 = 3
            r9 = 1056964608(0x3f000000, float:0.5)
            r2 = 1
            r10 = 1058642330(0x3f19999a, float:0.6)
            r3 = 2
            if (r0 == r3) goto L_0x0241
            if (r0 == r4) goto L_0x003d
            r9 = 0
        L_0x003d:
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x003f:
            android.graphics.drawable.Drawable r0 = r12.A0D
            int r0 = r0.getIntrinsicWidth()
            float r0 = (float) r0
            float r0 = r0 * r6
            int r8 = (int) r0
            android.graphics.drawable.Drawable r0 = r12.A0D
            int r0 = r0.getIntrinsicHeight()
            float r0 = (float) r0
            float r6 = r6 * r0
            float r6 = r6 / r15
            int r14 = (int) r6
            android.graphics.drawable.Drawable r11 = r12.A0D
            int r0 = r8 / 2
            float r10 = (float) r0
            float r0 = r7 - r10
            int r6 = (int) r0
            int r1 = -r14
            float r7 = r7 + r10
            int r0 = (int) r7
            r11.setBounds(r6, r1, r0, r14)
            android.graphics.drawable.Drawable r0 = r12.A0D
            r0.draw(r13)
            double r0 = (double) r9
            r16 = 0
            int r6 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r6 <= 0) goto L_0x008c
            android.graphics.drawable.Drawable r0 = r12.A0C
            if (r0 == 0) goto L_0x008c
            int r0 = r0.getIntrinsicWidth()
            float r1 = (float) r0
            float r1 = r1 * r9
            android.graphics.drawable.Drawable r0 = r12.A0C
            int r0 = r0.getIntrinsicHeight()
            float r0 = (float) r0
            float r9 = r9 * r0
            android.graphics.drawable.Drawable r10 = r12.A0C
            int r7 = (int) r1
            int r6 = -r7
            int r1 = (int) r9
            int r0 = -r1
            r10.setBounds(r6, r0, r7, r1)
            android.graphics.drawable.Drawable r0 = r12.A0C
            r0.draw(r13)
        L_0x008c:
            android.graphics.drawable.Drawable r0 = r12.A0B
            int r6 = r0.getIntrinsicWidth()
            android.graphics.drawable.Drawable r0 = r12.A0B
            int r10 = r0.getIntrinsicHeight()
            int r10 = r10 / r3
            int r0 = r12.A01
            if (r0 == r3) goto L_0x00ac
            android.graphics.drawable.Drawable r9 = r12.A0B
            int r7 = r5 / 2
            int r1 = r7 - r6
            int r0 = -r10
            r9.setBounds(r1, r0, r7, r10)
            android.graphics.drawable.Drawable r0 = r12.A0B
            r0.draw(r13)
        L_0x00ac:
            int r0 = r12.A01
            if (r0 == r3) goto L_0x01a8
            if (r0 == r4) goto L_0x01a8
            float r3 = (float) r5
            float r1 = -r3
            float r1 = r1 / r15
            float r0 = (float) r8
            float r1 = r1 + r0
            double r8 = (double) r1
            float r3 = r3 / r15
            float r0 = (float) r6
            float r3 = r3 - r0
            double r0 = (double) r3
            double r3 = r8 - r0
            double r3 = r3 * r3
            double r3 = r3 + r16
            double r3 = java.lang.Math.sqrt(r3)
            float r5 = (float) r3
            double r6 = (double) r5
            r14 = 4599526299433487565(0x3fd4cccccccccccd, double:0.325)
            double r10 = java.lang.Math.sin(r14)
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r10 = r10 * r3
            double r6 = r6 / r10
            double r8 = r8 + r0
            double r8 = r8 / r3
            double r20 = java.lang.Math.cos(r14)
            double r20 = r20 * r6
            double r20 = r20 + r16
            android.graphics.Paint r0 = r12.A0A
            r0.setAntiAlias(r2)
            r14 = 0
        L_0x00e4:
            double r10 = (double) r14
            r15 = 4604029899060858061(0x3fe4cccccccccccd, double:0.65)
            double r2 = r10 * r15
            r17 = 4622945017495814144(0x4028000000000000, double:12.0)
            double r2 = r2 / r17
            r4 = -4623935809413835653(0xbfd47ae147ae147b, double:-0.32)
            double r2 = r2 + r4
            int r23 = r14 + 1
            r0 = r23
            double r0 = (double) r0
            double r0 = r0 * r15
            double r0 = r0 / r17
            double r0 = r0 + r4
            boolean r4 = r12.A0F
            if (r4 == 0) goto L_0x023d
            r5 = 0
        L_0x0104:
            float r4 = (float) r2
            float r2 = (float) r0
            r22 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r4
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0114
            int r0 = (r5 > r22 ? 1 : (r5 == r22 ? 0 : -1))
            if (r0 < 0) goto L_0x0236
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0114:
            float r2 = r2 * r1
            float r4 = r4 + r2
            double r2 = (double) r4
            double r4 = java.lang.Math.sin(r2)
            double r4 = r4 * r6
            X.0ts r0 = r12.A03
            boolean r1 = X.C36401kF.A1X(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0126
            r0 = -1
        L_0x0126:
            double r0 = (double) r0
            double r4 = r4 * r0
            double r4 = r4 + r8
            boolean r0 = r12.A0F
            if (r0 == 0) goto L_0x022d
            r2 = 0
        L_0x012f:
            android.graphics.Paint r0 = r12.A0A
            r19 = r0
            android.content.res.Resources r16 = r12.getResources()
            boolean r0 = r12.A0F
            android.content.Context r15 = r12.getContext()
            if (r0 == 0) goto L_0x0225
            r1 = 2130969728(0x7f040480, float:1.7548146E38)
            r0 = 2131100928(0x7f060500, float:1.7814251E38)
        L_0x0145:
            int r1 = X.C224514j.A00(r15, r1, r0)
            r0 = r16
            int r1 = r0.getColor(r1)
            r0 = r19
            r0.setColor(r1)
            android.graphics.Paint r0 = r12.A0A
            X.C36431kI.A1L(r0)
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131168118(0x7f070b76, float:1.7950529E38)
            float r15 = r1.getDimension(r0)
            boolean r0 = r12.A0F
            if (r0 == 0) goto L_0x01a9
            if (r14 == 0) goto L_0x0196
            float r0 = r12.A00
            float r0 = -r0
            double r0 = (double) r0
            r16 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r0 = r0 * r16
            r16 = 4602891378046628709(0x3fe0c152382d7365, double:0.5235987755982988)
            double r16 = r16 * r10
            double r0 = r0 + r16
            double r0 = java.lang.Math.cos(r0)
            r10 = 4638637247447433216(0x405fc00000000000, double:127.0)
            double r0 = r0 * r10
            double r0 = r0 + r10
            android.graphics.Paint r11 = r12.A0A
            int r10 = (int) r0
            r11.setAlpha(r10)
            float r10 = (float) r4
            float r1 = (float) r2
            android.graphics.Paint r0 = r12.A0A
            r13.drawCircle(r10, r1, r15, r0)
        L_0x0196:
            r14 = r23
            r1 = 12
            if (r14 < r1) goto L_0x00e4
            int r1 = r12.A01
            r0 = 4
            if (r1 != r0) goto L_0x01a8
            X.1mu r0 = r12.A02
            if (r0 == 0) goto L_0x01a8
            r0.cancel()
        L_0x01a8:
            return
        L_0x01a9:
            float r0 = (float) r4
            r24 = r0
            float r14 = (float) r2
            android.graphics.Paint r1 = r12.A0A
            r13.drawCircle(r0, r14, r15, r1)
            r0 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            double r10 = r10 * r0
            double r10 = r10 / r17
            double r4 = java.lang.Math.sin(r10)
            r16 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            float r10 = r12.A00
            r11 = 1058642330(0x3f19999a, float:0.6)
            float r0 = r10 - r11
            double r2 = (double) r0
            double r2 = r2 * r16
            r0 = 1053609164(0x3ecccccc, float:0.39999998)
            double r0 = (double) r0
            double r2 = r2 / r0
            r18 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x01dc
            double r16 = r2 - r18
            int r0 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            r1 = 1
            if (r0 >= 0) goto L_0x01dd
        L_0x01dc:
            r1 = 0
        L_0x01dd:
            int r0 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x0196
            int r0 = (r10 > r22 ? 1 : (r10 == r22 ? 0 : -1))
            if (r0 >= 0) goto L_0x0196
            if (r1 == 0) goto L_0x0196
            r10 = 4634204016564240384(0x4050000000000000, double:64.0)
            r0 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r2 = r2 - r18
            double r4 = r4 - r2
            double r4 = r4 * r0
            double r4 = r4 + r10
            int r1 = (int) r4
            r0 = 255(0xff, float:3.57E-43)
            if (r1 < r0) goto L_0x01f7
            r1 = 255(0xff, float:3.57E-43)
        L_0x01f7:
            android.graphics.Paint r5 = r12.A0A
            android.content.res.Resources r4 = r12.getResources()
            android.content.Context r3 = r12.getContext()
            r2 = 2130969727(0x7f04047f, float:1.7548144E38)
            r0 = 2131100927(0x7f0604ff, float:1.781425E38)
            int r0 = X.C224514j.A00(r3, r2, r0)
            int r0 = r4.getColor(r0)
            r5.setColor(r0)
            android.graphics.Paint r0 = r12.A0A
            X.C36431kI.A1L(r0)
            android.graphics.Paint r0 = r12.A0A
            r0.setAlpha(r1)
            android.graphics.Paint r1 = r12.A0A
            r0 = r24
            r13.drawCircle(r0, r14, r15, r1)
            goto L_0x0196
        L_0x0225:
            r1 = 2130969726(0x7f04047e, float:1.7548142E38)
            r0 = 2131100926(0x7f0604fe, float:1.7814247E38)
            goto L_0x0145
        L_0x022d:
            double r0 = java.lang.Math.cos(r2)
            double r0 = r0 * r6
            double r2 = r20 - r0
            goto L_0x012f
        L_0x0236:
            float r5 = r5 - r1
            float r0 = r22 - r1
            float r5 = r5 / r0
            r1 = r5
            goto L_0x0114
        L_0x023d:
            float r5 = r12.A00
            goto L_0x0104
        L_0x0241:
            boolean r0 = r12.A05
            if (r0 != 0) goto L_0x0296
            float r6 = r12.A00
            int r1 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            android.view.animation.DecelerateInterpolator r0 = r12.A0G
            if (r1 >= 0) goto L_0x0285
            float r6 = r6 / r10
            float r7 = r0.getInterpolation(r6)
            android.graphics.drawable.Drawable r0 = r12.A0D
            int r1 = r0.getIntrinsicWidth()
            int r0 = r12.A08
            float r6 = (float) r0
            android.graphics.drawable.Drawable r0 = r12.A0D
            int r0 = r0.getIntrinsicWidth()
            float r0 = (float) r0
            float r6 = r6 / r0
            float r1 = (float) r1
            int r0 = r12.A08
            float r0 = (float) r0
            float r1 = r1 - r0
            float r1 = r1 * r7
            android.graphics.drawable.Drawable r0 = r12.A0D
            int r0 = r0.getIntrinsicWidth()
            float r0 = (float) r0
            float r1 = r1 / r0
            float r6 = r6 + r1
            float r1 = (float) r5
            float r0 = r1 / r15
            float r8 = r8 - r0
            android.graphics.drawable.Drawable r0 = r12.A0D
            int r0 = r0.getIntrinsicWidth()
            float r0 = (float) r0
            float r0 = r0 * r6
            float r1 = r1 - r0
            float r7 = r7 * r1
            float r7 = r7 / r15
            float r7 = r7 + r8
            r9 = 0
            goto L_0x003f
        L_0x0285:
            float r6 = r6 - r10
            float r0 = r0.getInterpolation(r6)
            float r9 = r9 * r0
            float r1 = r12.A00
            r0 = 1065185444(0x3f7d70a4, float:0.99)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0296
            r12.A05 = r2
        L_0x0296:
            r7 = 0
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.GoogleDriveRestoreAnimationView.onDraw(android.graphics.Canvas):void");
    }

    public GoogleDriveRestoreAnimationView(Context context) {
        super(context);
        A02();
        this.A0G = new DecelerateInterpolator();
        this.A01 = 0;
        A00(context, (AttributeSet) null);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C37601mu.A00(this);
        startAnimation(this.A02);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
    }

    public void onVisibilityChanged(View view, int i) {
        C37601mu r0;
        if (getVisibility() != 0) {
            clearAnimation();
        } else if (getAnimation() == null && (r0 = this.A02) != null) {
            startAnimation(r0);
        }
    }

    public GoogleDriveRestoreAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
        this.A0G = new DecelerateInterpolator();
        this.A01 = 0;
        A00(context, attributeSet);
    }

    public GoogleDriveRestoreAnimationView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A02();
    }

    public GoogleDriveRestoreAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        this.A0G = new DecelerateInterpolator();
        this.A01 = 0;
        A00(context, attributeSet);
    }
}
