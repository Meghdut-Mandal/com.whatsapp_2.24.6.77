package com.facebook.android.exoplayer2.ui;

import X.AnonymousClass001;
import X.AnonymousClass6LP;
import X.C125155zP;
import X.C22860AxC;
import X.C36371kC;
import X.C90514aH;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import java.util.List;

public final class SubtitleView extends View implements C22860AxC {
    public float A00;
    public float A01;
    public AnonymousClass6LP A02;
    public List A03;
    public boolean A04;
    public boolean A05;
    public final List A06;

    public SubtitleView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0106, code lost:
        if (r4.A0D == r8) goto L_0x0108;
     */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0174 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r37) {
        /*
            r36 = this;
            r9 = r36
            java.util.List r0 = r9.A03
            r27 = r0
            if (r0 == 0) goto L_0x037a
            boolean r0 = r27.isEmpty()
            if (r0 != 0) goto L_0x037a
            int r8 = r9.getHeight()
            int r26 = r9.getPaddingLeft()
            int r7 = r9.getPaddingTop()
            int r25 = X.AnonymousClass000.A0B(r9)
            int r0 = r9.getPaddingBottom()
            int r8 = r8 - r0
            if (r8 <= r7) goto L_0x037a
            r1 = r25
            r0 = r26
            if (r1 <= r0) goto L_0x037a
            int r0 = r8 - r7
            float r6 = r9.A00
            float r0 = (float) r0
            float r6 = r6 * r0
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x037a
            int r24 = r27.size()
            r5 = 0
        L_0x003b:
            r0 = r24
            if (r5 >= r0) goto L_0x037a
            r0 = r27
            java.lang.Object r13 = r0.get(r5)
            X.6TI r13 = (X.AnonymousClass6TI) r13
            java.util.List r0 = r9.A06
            java.lang.Object r4 = r0.get(r5)
            X.5zP r4 = (X.C125155zP) r4
            boolean r12 = r9.A05
            boolean r11 = r9.A04
            X.6LP r2 = r9.A02
            float r1 = r9.A01
            java.lang.CharSequence r14 = r13.A05
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x0174
            int r10 = r2.A04
            java.lang.CharSequence r0 = r4.A0M
            if (r0 == r14) goto L_0x006d
            if (r0 == 0) goto L_0x01a8
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x01a8
        L_0x006d:
            float r3 = r4.A02
            float r0 = r13.A00
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01a8
            int r3 = r4.A08
            int r0 = r13.A03
            if (r3 != r0) goto L_0x01a8
            int r0 = r4.A07
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            int r0 = r13.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0E(r3, r0)
            if (r0 == 0) goto L_0x01a8
            float r3 = r4.A03
            float r0 = r13.A01
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01a8
            int r0 = r4.A09
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            int r0 = r13.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0E(r3, r0)
            if (r0 == 0) goto L_0x01a8
            float r0 = r4.A04
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x01a8
            float r0 = r4.A01
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x01a8
            boolean r0 = r4.A0O
            if (r0 != r12) goto L_0x01a8
            boolean r0 = r4.A0N
            if (r0 != r11) goto L_0x01a8
            int r3 = r4.A0C
            int r0 = r2.A03
            if (r3 != r0) goto L_0x01a8
            int r3 = r4.A06
            int r0 = r2.A00
            if (r3 != r0) goto L_0x01a8
            int r0 = r4.A0K
            if (r0 != r10) goto L_0x01a8
            int r3 = r4.A0B
            int r0 = r2.A02
            if (r3 != r0) goto L_0x01a8
            int r3 = r4.A0A
            int r0 = r2.A01
            if (r3 != r0) goto L_0x01a8
            android.text.TextPaint r3 = r4.A0V
            android.graphics.Typeface r15 = r3.getTypeface()
            android.graphics.Typeface r0 = r2.A05
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0E(r15, r0)
            if (r0 == 0) goto L_0x01a8
            float r0 = r4.A05
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x01a8
            float r0 = r4.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01a8
            int r15 = r4.A0E
            r0 = r26
            if (r15 != r0) goto L_0x01a8
            int r0 = r4.A0G
            if (r0 != r7) goto L_0x01a8
            int r15 = r4.A0F
            r0 = r25
            if (r15 != r0) goto L_0x01a8
            int r0 = r4.A0D
            if (r0 != r8) goto L_0x01a8
        L_0x0108:
            android.text.StaticLayout r13 = r4.A0L
            if (r13 == 0) goto L_0x0174
            r15 = r37
            int r12 = r15.save()
            int r0 = r4.A0H
            float r1 = (float) r0
            int r0 = r4.A0J
            float r0 = (float) r0
            r15.translate(r1, r0)
            int r0 = r4.A0K
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 <= 0) goto L_0x0148
            android.graphics.Paint r10 = r4.A0U
            int r0 = r4.A0K
            r10.setColor(r0)
            int r0 = r4.A0I
            int r0 = -r0
            float r2 = (float) r0
            r17 = 0
            int r1 = r13.getWidth()
            int r0 = r4.A0I
            int r1 = r1 + r0
            float r1 = (float) r1
            int r0 = r13.getHeight()
            float r0 = (float) r0
            r18 = r1
            r19 = r0
            r20 = r10
            r16 = r2
            r15.drawRect(r16, r17, r18, r19, r20)
        L_0x0148:
            int r1 = r4.A0B
            r14 = 0
            r0 = 1
            if (r1 != r0) goto L_0x0178
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            r3.setStrokeJoin(r0)
            float r0 = r4.A0P
            r3.setStrokeWidth(r0)
            int r0 = r4.A0A
            r3.setColor(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL_AND_STROKE
            r3.setStyle(r0)
            r13.draw(r15)
        L_0x0165:
            int r0 = r4.A0C
            X.C36401kF.A0z(r0, r3)
            r13.draw(r15)
            r0 = 0
            r3.setShadowLayer(r0, r0, r0, r14)
            r15.restoreToCount(r12)
        L_0x0174:
            int r5 = r5 + 1
            goto L_0x003b
        L_0x0178:
            r0 = 2
            if (r1 != r0) goto L_0x0185
            float r2 = r4.A0R
            float r1 = r4.A0Q
            int r0 = r4.A0A
            r3.setShadowLayer(r2, r1, r1, r0)
            goto L_0x0165
        L_0x0185:
            r0 = 3
            if (r1 == r0) goto L_0x01a4
            r0 = 4
            if (r1 != r0) goto L_0x0165
            r11 = -1
            int r10 = r4.A0A
        L_0x018e:
            float r2 = r4.A0R
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r2 / r0
            int r0 = r4.A0C
            X.C36401kF.A0z(r0, r3)
            float r0 = -r1
            r3.setShadowLayer(r2, r0, r0, r10)
            r13.draw(r15)
            r3.setShadowLayer(r2, r1, r1, r11)
            goto L_0x0165
        L_0x01a4:
            r10 = -1
            int r11 = r4.A0A
            goto L_0x018e
        L_0x01a8:
            r4.A0M = r14
            float r0 = r13.A00
            r4.A02 = r0
            int r0 = r13.A03
            r4.A08 = r0
            int r0 = r13.A02
            r4.A07 = r0
            float r0 = r13.A01
            r4.A03 = r0
            int r0 = r13.A04
            r4.A09 = r0
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r4.A04 = r0
            r4.A01 = r0
            r4.A0O = r12
            r4.A0N = r11
            int r0 = r2.A03
            r4.A0C = r0
            int r0 = r2.A00
            r4.A06 = r0
            r4.A0K = r10
            int r0 = r2.A02
            r4.A0B = r0
            int r0 = r2.A01
            r4.A0A = r0
            android.text.TextPaint r3 = r4.A0V
            android.graphics.Typeface r0 = r2.A05
            r3.setTypeface(r0)
            r4.A05 = r6
            r4.A00 = r1
            r0 = r26
            r4.A0E = r0
            r4.A0G = r7
            r0 = r25
            r4.A0F = r0
            r4.A0D = r8
            java.lang.CharSequence r0 = r4.A0M
            java.util.Objects.requireNonNull(r0)
            java.lang.CharSequence r11 = r4.A0M
            int r10 = r4.A0F
            int r0 = r4.A0E
            int r10 = r10 - r0
            int r12 = r4.A0D
            int r0 = r4.A0G
            int r12 = r12 - r0
            float r0 = r4.A05
            r3.setTextSize(r0)
            float r1 = r4.A05
            r0 = 1040187392(0x3e000000, float:0.125)
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            r23 = r0
            int r22 = r0 * 2
            int r13 = r10 - r22
            float r1 = r4.A04
            r21 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r0 == 0) goto L_0x0223
            float r0 = (float) r13
            float r0 = r0 * r1
            int r13 = (int) r0
        L_0x0223:
            java.lang.String r20 = "SubtitlePainter"
            if (r13 > 0) goto L_0x0230
            java.lang.String r1 = "Skipped drawing subtitle cue (insufficient space)"
        L_0x0229:
            r0 = r20
            android.util.Log.w(r0, r1)
            goto L_0x0108
        L_0x0230:
            boolean r0 = r4.A0O
            r19 = 0
            r2 = 0
            if (r0 != 0) goto L_0x0295
            java.lang.String r11 = r11.toString()
        L_0x023b:
            int r0 = r4.A06
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 <= 0) goto L_0x0257
            android.text.SpannableStringBuilder r11 = X.C36441kJ.A0P(r11)
            int r0 = r4.A06
            android.text.style.BackgroundColorSpan r14 = new android.text.style.BackgroundColorSpan
            r14.<init>(r0)
            int r1 = r11.length()
            r0 = 16711680(0xff0000, float:2.3418052E-38)
            r11.setSpan(r14, r2, r1, r0)
        L_0x0257:
            android.text.Layout$Alignment r32 = android.text.Layout.Alignment.ALIGN_CENTER
            float r0 = r4.A0T
            r33 = r0
            float r0 = r4.A0S
            r34 = r0
            r1 = 1
            android.text.StaticLayout r0 = new android.text.StaticLayout
            r35 = 1
            r28 = r0
            r29 = r11
            r30 = r3
            r31 = r13
            r28.<init>(r29, r30, r31, r32, r33, r34, r35)
            r4.A0L = r0
            int r18 = r0.getHeight()
            android.text.StaticLayout r0 = r4.A0L
            int r17 = r0.getLineCount()
            r14 = 0
        L_0x027e:
            r0 = r17
            if (r2 >= r0) goto L_0x02cd
            android.text.StaticLayout r0 = r4.A0L
            float r0 = r0.getLineWidth(r2)
            double r15 = (double) r0
            double r15 = java.lang.Math.ceil(r15)
            int r0 = (int) r15
            int r14 = java.lang.Math.max(r0, r14)
            int r2 = r2 + 1
            goto L_0x027e
        L_0x0295:
            boolean r0 = r4.A0N
            if (r0 != 0) goto L_0x023b
            android.text.SpannableStringBuilder r11 = X.C36441kJ.A0P(r11)
            int r1 = r11.length()
            java.lang.Class<android.text.style.AbsoluteSizeSpan> r0 = android.text.style.AbsoluteSizeSpan.class
            java.lang.Object[] r14 = r11.getSpans(r2, r1, r0)
            android.text.style.AbsoluteSizeSpan[] r14 = (android.text.style.AbsoluteSizeSpan[]) r14
            java.lang.Class<android.text.style.RelativeSizeSpan> r0 = android.text.style.RelativeSizeSpan.class
            java.lang.Object[] r1 = r11.getSpans(r2, r1, r0)
            android.text.style.RelativeSizeSpan[] r1 = (android.text.style.RelativeSizeSpan[]) r1
            int r0 = r14.length
            r16 = r0
            r15 = 0
        L_0x02b5:
            r0 = r16
            if (r15 >= r0) goto L_0x02c1
            r0 = r14[r15]
            r11.removeSpan(r0)
            int r15 = r15 + 1
            goto L_0x02b5
        L_0x02c1:
            int r15 = r1.length
            r14 = 0
        L_0x02c3:
            if (r14 >= r15) goto L_0x023b
            r0 = r1[r14]
            r11.removeSpan(r0)
            int r14 = r14 + 1
            goto L_0x02c3
        L_0x02cd:
            float r0 = r4.A04
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 == 0) goto L_0x030d
            if (r14 >= r13) goto L_0x030d
        L_0x02d5:
            int r13 = r13 + r22
            float r14 = r4.A03
            r0 = 2
            int r2 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r2 == 0) goto L_0x0305
            float r2 = (float) r10
            int r2 = X.C90514aH.A06(r2, r14)
            int r14 = r4.A0E
            int r2 = r2 + r14
            int r10 = r4.A09
            if (r10 == r1) goto L_0x0300
            if (r10 != r0) goto L_0x02ed
            int r2 = r2 - r13
        L_0x02ed:
            int r10 = java.lang.Math.max(r2, r14)
            int r13 = r13 + r10
            int r2 = r4.A0F
            int r31 = java.lang.Math.min(r13, r2)
        L_0x02f8:
            int r31 = r31 - r10
            if (r31 > 0) goto L_0x030f
            java.lang.String r1 = "Skipped drawing subtitle cue (invalid horizontal positioning)"
            goto L_0x0229
        L_0x0300:
            int r2 = r2 * 2
            int r2 = r2 - r13
            int r2 = r2 / r0
            goto L_0x02ed
        L_0x0305:
            int r10 = r10 - r13
            int r10 = r10 / r0
            int r2 = r4.A0E
            int r10 = r10 + r2
            int r31 = r10 + r13
            goto L_0x02f8
        L_0x030d:
            r13 = r14
            goto L_0x02d5
        L_0x030f:
            float r13 = r4.A02
            int r2 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r2 == 0) goto L_0x036f
            int r2 = r4.A08
            if (r2 == 0) goto L_0x0367
            android.text.StaticLayout r2 = r4.A0L
            r13 = 0
            int r12 = r2.getLineBottom(r13)
            android.text.StaticLayout r2 = r4.A0L
            int r2 = r2.getLineTop(r13)
            int r12 = r12 - r2
            float r13 = r4.A02
            int r2 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r2 >= 0) goto L_0x0367
            r2 = 1065353216(0x3f800000, float:1.0)
            float r13 = r13 + r2
            float r2 = (float) r12
            int r2 = X.C90514aH.A06(r13, r2)
            int r12 = r4.A0D
        L_0x0337:
            int r2 = r2 + r12
            int r12 = r4.A07
            if (r12 != r0) goto L_0x035f
            int r2 = r2 - r18
        L_0x033e:
            int r1 = r2 + r18
            int r0 = r4.A0D
            if (r1 <= r0) goto L_0x0359
            int r2 = r0 - r18
        L_0x0346:
            android.text.StaticLayout r0 = new android.text.StaticLayout
            r28 = r0
            r28.<init>(r29, r30, r31, r32, r33, r34, r35)
            r4.A0L = r0
            r4.A0H = r10
            r4.A0J = r2
            r0 = r23
            r4.A0I = r0
            goto L_0x0108
        L_0x0359:
            int r0 = r4.A0G
            if (r2 >= r0) goto L_0x0346
            r2 = r0
            goto L_0x0346
        L_0x035f:
            if (r12 != r1) goto L_0x033e
            int r2 = r2 * 2
            int r2 = r2 - r18
            int r2 = r2 / r0
            goto L_0x033e
        L_0x0367:
            float r2 = (float) r12
            int r2 = X.C90514aH.A06(r2, r13)
            int r12 = r4.A0G
            goto L_0x0337
        L_0x036f:
            int r2 = r4.A0D
            int r2 = r2 - r18
            float r1 = (float) r12
            float r0 = r4.A00
            float r1 = r1 * r0
            int r0 = (int) r1
            int r2 = r2 - r0
            goto L_0x0346
        L_0x037a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.exoplayer2.ui.SubtitleView.dispatchDraw(android.graphics.Canvas):void");
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        if (this.A04 != z) {
            this.A04 = z;
            invalidate();
        }
    }

    public void setApplyEmbeddedStyles(boolean z) {
        if (this.A05 != z || this.A04 != z) {
            this.A05 = z;
            this.A04 = z;
            invalidate();
        }
    }

    public void setBottomPaddingFraction(float f) {
        if (this.A01 != f) {
            this.A01 = f;
            invalidate();
        }
    }

    public void setCues(List list) {
        if (this.A03 != list) {
            this.A03 = list;
            int A062 = C36371kC.A06(list);
            while (true) {
                List list2 = this.A06;
                if (list2.size() < A062) {
                    list2.add(new C125155zP(getContext()));
                } else {
                    invalidate();
                    return;
                }
            }
        }
    }

    public void setFractionalTextSize(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            invalidate();
        }
    }

    public void setStyle(AnonymousClass6LP r2) {
        if (this.A02 != r2) {
            this.A02 = r2;
            invalidate();
        }
    }

    private float getUserCaptionFontScaleV19() {
        return C90514aH.A0S(this).getFontScale();
    }

    private AnonymousClass6LP getUserCaptionStyleV19() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        CaptioningManager.CaptionStyle userStyle = C90514aH.A0S(this).getUserStyle();
        if (userStyle.hasForegroundColor()) {
            i = userStyle.foregroundColor;
        } else {
            i = -1;
        }
        if (userStyle.hasBackgroundColor()) {
            i2 = userStyle.backgroundColor;
        } else {
            i2 = -16777216;
        }
        if (userStyle.hasWindowColor()) {
            i3 = userStyle.windowColor;
        } else {
            i3 = 0;
        }
        if (userStyle.hasEdgeType()) {
            i4 = userStyle.edgeType;
        } else {
            i4 = 0;
        }
        if (userStyle.hasEdgeColor()) {
            i5 = userStyle.edgeColor;
        } else {
            i5 = -1;
        }
        return new AnonymousClass6LP(userStyle.getTypeface(), i, i2, i3, i4, i5);
    }

    public void A00() {
        AnonymousClass6LP r0;
        if (!C90514aH.A0S(this).isEnabled() || isInEditMode()) {
            r0 = AnonymousClass6LP.A06;
        } else {
            r0 = getUserCaptionStyleV19();
        }
        setStyle(r0);
    }

    public void BV0(List list) {
        setCues(list);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A06 = AnonymousClass001.A0I();
        this.A00 = 0.0533f;
        this.A05 = true;
        this.A04 = true;
        this.A02 = AnonymousClass6LP.A06;
        this.A01 = 0.08f;
    }
}
