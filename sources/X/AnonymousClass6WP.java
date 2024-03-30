package X;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.6WP  reason: invalid class name */
public final class AnonymousClass6WP {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Paint.FontMetricsInt A06;
    public final Rect A07 = AnonymousClass001.A06();
    public final Layout A08;
    public final AnonymousClass00T A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final AnonymousClass6TJ A0D;
    public final C135256cP[] A0E;

    public static final Rect A00(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        Class<MetricAffectingSpan> cls = MetricAffectingSpan.class;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i - 1, i2, cls) != i2) {
                Rect A062 = AnonymousClass001.A06();
                Rect A063 = AnonymousClass001.A06();
                TextPaint textPaint2 = new TextPaint();
                while (i < i2) {
                    int nextSpanTransition = spanned.nextSpanTransition(i, i2, cls);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i, nextSpanTransition, cls);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        AnonymousClass5XT.A00(textPaint2, A063, charSequence, i, nextSpanTransition);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i, nextSpanTransition, A063);
                    }
                    A062.right += A063.width();
                    A062.top = Math.min(A062.top, A063.top);
                    A062.bottom = Math.max(A062.bottom, A063.bottom);
                    i = nextSpanTransition;
                }
                return A062;
            }
        }
        Rect A064 = AnonymousClass001.A06();
        if (Build.VERSION.SDK_INT >= 29) {
            AnonymousClass5XT.A00(textPaint, A064, charSequence, i, i2);
            return A064;
        }
        textPaint.getTextBounds(charSequence.toString(), i, i2, A064);
        return A064;
    }

    public static final BoringLayout A01(BoringLayout.Metrics metrics, Layout.Alignment alignment, TextPaint textPaint, TextUtils.TruncateAt truncateAt, CharSequence charSequence, int i, int i2, boolean z) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2);
    }

    public final float A02(int i) {
        float lineBottom;
        int i2;
        Paint.FontMetricsInt fontMetricsInt;
        int i3 = this.A04 - 1;
        if (i != i3 || (fontMetricsInt = this.A06) == null) {
            lineBottom = ((float) this.A05) + ((float) this.A08.getLineBottom(i));
            if (i == i3) {
                i2 = this.A02;
            } else {
                i2 = 0;
            }
        } else {
            lineBottom = (float) this.A08.getLineBottom(i - 1);
            i2 = fontMetricsInt.bottom;
        }
        return lineBottom + ((float) i2);
    }

    public final float A03(int i) {
        int i2;
        float lineTop = (float) this.A08.getLineTop(i);
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = this.A05;
        }
        return lineTop + ((float) i2);
    }

    public final float A04(int i, boolean z) {
        float f;
        float A012 = ((AnonymousClass6N3) this.A09.getValue()).A01(i, true, z);
        if (this.A08.getLineForOffset(i) == this.A04 - 1) {
            f = this.A00 + this.A01;
        } else {
            f = 0.0f;
        }
        return A012 + f;
    }

    public final float A05(int i, boolean z) {
        float f;
        float A012 = ((AnonymousClass6N3) this.A09.getValue()).A01(i, false, z);
        if (this.A08.getLineForOffset(i) == this.A04 - 1) {
            f = this.A00 + this.A01;
        } else {
            f = 0.0f;
        }
        return A012 + f;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (((android.text.Spanned) r15).nextSpanTransition(-1, r7, X.C91904co.class) >= r7) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x011b, code lost:
        if (r0 != false) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0146, code lost:
        if (r9.length == 0) goto L_0x0148;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0230  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6WP(android.text.TextPaint r27, android.text.TextUtils.TruncateAt r28, X.AnonymousClass6TJ r29, java.lang.CharSequence r30, float r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, boolean r40) {
        /*
            r26 = this;
            r5 = 1
            r2 = r26
            r2.<init>()
            r4 = r40
            r2.A0B = r4
            r6 = r29
            r2.A0D = r6
            android.graphics.Rect r0 = X.AnonymousClass001.A06()
            r2.A07 = r0
            r15 = r30
            int r7 = r15.length()
            X.4bO r0 = X.C129786Il.A01
            r1 = r33
            if (r33 == 0) goto L_0x0061
            if (r1 == r5) goto L_0x005e
            r0 = 2
            if (r1 == r0) goto L_0x005b
            android.text.TextDirectionHeuristic r12 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
        L_0x0027:
            android.text.Layout$Alignment r0 = X.C113595fn.A01
            r1 = r32
            if (r32 == 0) goto L_0x0058
            if (r1 == r5) goto L_0x0055
            r0 = 2
            if (r1 == r0) goto L_0x0052
            r0 = 3
            if (r1 == r0) goto L_0x004f
            android.text.Layout$Alignment r11 = X.C113595fn.A01
        L_0x0037:
            boolean r0 = r15 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x0048
            r3 = r15
            android.text.Spanned r3 = (android.text.Spanned) r3
            r1 = -1
            java.lang.Class<X.4co> r0 = X.C91904co.class
            int r0 = r3.nextSpanTransition(r1, r7, r0)
            r3 = 1
            if (r0 < r7) goto L_0x0049
        L_0x0048:
            r3 = 0
        L_0x0049:
            java.lang.String r0 = "TextLayout:initLayout"
            android.os.Trace.beginSection(r0)
            goto L_0x0064
        L_0x004f:
            android.text.Layout$Alignment r11 = X.C113595fn.A00
            goto L_0x0037
        L_0x0052:
            android.text.Layout$Alignment r11 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x0037
        L_0x0055:
            android.text.Layout$Alignment r11 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x0037
        L_0x0058:
            android.text.Layout$Alignment r11 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x0037
        L_0x005b:
            android.text.TextDirectionHeuristic r12 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            goto L_0x0027
        L_0x005e:
            android.text.TextDirectionHeuristic r12 = android.text.TextDirectionHeuristics.RTL
            goto L_0x0027
        L_0x0061:
            android.text.TextDirectionHeuristic r12 = android.text.TextDirectionHeuristics.LTR
            goto L_0x0027
        L_0x0064:
            android.text.BoringLayout$Metrics r18 = r6.A02()     // Catch:{ all -> 0x0237 }
            int r17 = X.C90514aH.A04(r31)     // Catch:{ all -> 0x0237 }
            r13 = r27
            r14 = r28
            r1 = r34
            if (r18 == 0) goto L_0x008a
            float r0 = r6.A01()     // Catch:{ all -> 0x0237 }
            int r0 = (r0 > r31 ? 1 : (r0 == r31 ? 0 : -1))
            if (r0 > 0) goto L_0x008a
            if (r3 != 0) goto L_0x008a
            r2.A0C = r5     // Catch:{ all -> 0x0237 }
            if (r17 < 0) goto L_0x0083
            goto L_0x00ad
        L_0x0083:
            java.lang.String r0 = "negative width"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ all -> 0x0237 }
            throw r0     // Catch:{ all -> 0x0237 }
        L_0x008a:
            r0 = 0
            r2.A0C = r0     // Catch:{ all -> 0x0237 }
            int r16 = r15.length()     // Catch:{ all -> 0x0237 }
            X.7iN r0 = X.C112495dz.A00     // Catch:{ all -> 0x0237 }
            X.5z4 r10 = new X.5z4     // Catch:{ all -> 0x0237 }
            r21 = r35
            r22 = r36
            r23 = r37
            r24 = r38
            r20 = r39
            r18 = r1
            r19 = r17
            r25 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0237 }
            android.text.StaticLayout r8 = r0.B3n(r10)     // Catch:{ all -> 0x0237 }
            goto L_0x00c5
        L_0x00ad:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0237 }
            r0 = 33
            if (r3 < r0) goto L_0x00c8
            r24 = r17
            r19 = r11
            r20 = r13
            r21 = r14
            r22 = r15
            r23 = r17
            r25 = r4
            android.text.BoringLayout r8 = X.AnonymousClass6QW.A01(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0237 }
        L_0x00c5:
            r2.A08 = r8     // Catch:{ all -> 0x0237 }
            goto L_0x00db
        L_0x00c8:
            r24 = r17
            r19 = r11
            r20 = r13
            r21 = r14
            r22 = r15
            r23 = r17
            r25 = r4
            android.text.BoringLayout r8 = A01(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0237 }
            goto L_0x00c5
        L_0x00db:
            android.os.Trace.endSection()
            int r0 = r8.getLineCount()
            int r0 = java.lang.Math.min(r0, r1)
            r2.A04 = r0
            int r7 = r0 + -1
            if (r0 < r1) goto L_0x01d1
            int r0 = r8.getEllipsisCount(r7)
            if (r0 > 0) goto L_0x00fc
            int r1 = r8.getLineEnd(r7)
            int r0 = r15.length()
            if (r1 == r0) goto L_0x01d1
        L_0x00fc:
            r0 = 1
        L_0x00fd:
            r2.A0A = r0
            boolean r0 = r2.A0B
            if (r0 != 0) goto L_0x011d
            boolean r0 = r2.A0C
            android.text.Layout r4 = r2.A08
            if (r0 == 0) goto L_0x01c1
            java.lang.String r0 = "null cannot be cast to non-null type android.text.BoringLayout"
            X.AnonymousClass00C.A0E(r4, r0)
            r3 = r4
            android.text.BoringLayout r3 = (android.text.BoringLayout) r3
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 < r0) goto L_0x0170
            boolean r0 = X.AnonymousClass6QW.A02(r3)
        L_0x011b:
            if (r0 == 0) goto L_0x0170
        L_0x011d:
            long r5 = X.C129786Il.A00
        L_0x011f:
            android.text.Layout r1 = r2.A08
            java.lang.CharSequence r0 = r1.getText()
            boolean r0 = r0 instanceof android.text.Spanned
            r4 = 0
            if (r0 == 0) goto L_0x0148
            java.lang.CharSequence r3 = r1.getText()
            java.lang.String r0 = "null cannot be cast to non-null type android.text.Spanned"
            X.AnonymousClass00C.A0E(r3, r0)
            android.text.Spanned r3 = (android.text.Spanned) r3
            java.lang.CharSequence r0 = r1.getText()
            int r1 = r0.length()
            java.lang.Class<X.6cP> r0 = X.C135256cP.class
            java.lang.Object[] r9 = r3.getSpans(r4, r1, r0)
            X.6cP[] r9 = (X.C135256cP[]) r9
            int r0 = r9.length
            if (r0 != 0) goto L_0x014a
        L_0x0148:
            X.6cP[] r9 = new X.C135256cP[r4]
        L_0x014a:
            r2.A0E = r9
            int r3 = r9.length
            r1 = 0
            r10 = 0
        L_0x014f:
            if (r1 >= r3) goto L_0x01d4
            r11 = r9[r1]
            int r0 = r11.A03
            if (r0 >= 0) goto L_0x0161
            int r0 = r11.A03
            int r0 = java.lang.Math.abs(r0)
            int r4 = java.lang.Math.max(r4, r0)
        L_0x0161:
            int r0 = r11.A05
            if (r0 >= 0) goto L_0x016d
            int r0 = java.lang.Math.abs(r0)
            int r10 = java.lang.Math.max(r4, r0)
        L_0x016d:
            int r1 = r1 + 1
            goto L_0x014f
        L_0x0170:
            android.text.TextPaint r11 = r4.getPaint()
            java.lang.CharSequence r10 = r4.getText()
            r3 = 0
            int r1 = r4.getLineStart(r3)
            int r0 = r4.getLineEnd(r3)
            android.graphics.Rect r9 = A00(r11, r10, r1, r0)
            int r6 = r4.getLineAscent(r3)
            int r0 = r9.top
            if (r0 >= r6) goto L_0x01b6
            int r6 = r6 - r0
        L_0x018e:
            int r5 = r2.A04
            r3 = 1
            if (r5 == r3) goto L_0x01a1
            int r0 = r5 - r3
            int r1 = r4.getLineStart(r0)
            int r0 = r4.getLineEnd(r0)
            android.graphics.Rect r9 = A00(r11, r10, r1, r0)
        L_0x01a1:
            int r5 = r5 - r3
            int r1 = r4.getLineDescent(r5)
            int r0 = r9.bottom
            if (r0 <= r1) goto L_0x01b1
            int r0 = r0 - r1
        L_0x01ab:
            if (r6 != 0) goto L_0x01bb
            if (r0 != 0) goto L_0x01bb
            goto L_0x011d
        L_0x01b1:
            int r0 = r4.getBottomPadding()
            goto L_0x01ab
        L_0x01b6:
            int r6 = r4.getTopPadding()
            goto L_0x018e
        L_0x01bb:
            long r5 = X.C90484aE.A0J(r6, r0)
            goto L_0x011f
        L_0x01c1:
            java.lang.String r0 = "null cannot be cast to non-null type android.text.StaticLayout"
            X.AnonymousClass00C.A0E(r4, r0)
            r3 = r4
            android.text.StaticLayout r3 = (android.text.StaticLayout) r3
            X.7iN r0 = X.C112495dz.A00
            boolean r0 = r0.BLl(r3, r5)
            goto L_0x011b
        L_0x01d1:
            r0 = 0
            goto L_0x00fd
        L_0x01d4:
            if (r4 != 0) goto L_0x0232
            if (r10 != 0) goto L_0x0232
            long r3 = X.C129786Il.A00
        L_0x01da:
            r10 = 32
            long r0 = r5 >> r10
            int r11 = (int) r0
            long r0 = r3 >> r10
            int r10 = (int) r0
            int r0 = java.lang.Math.max(r11, r10)
            r2.A05 = r0
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r10
            int r1 = (int) r5
            long r3 = r3 & r10
            int r0 = (int) r3
            int r0 = java.lang.Math.max(r1, r0)
            r2.A02 = r0
            android.graphics.Paint$FontMetricsInt r4 = X.C129786Il.A00(r12, r13, r2, r9)
            if (r4 == 0) goto L_0x0230
            int r3 = r4.bottom
            float r1 = r2.A02(r7)
            float r0 = r2.A03(r7)
            float r1 = r1 - r0
            int r0 = (int) r1
            int r3 = r3 - r0
        L_0x020a:
            r2.A03 = r3
            r2.A06 = r4
            android.text.TextPaint r0 = r8.getPaint()
            float r0 = X.AnonymousClass6GE.A00(r0, r8, r7)
            r2.A00 = r0
            android.text.TextPaint r0 = r8.getPaint()
            float r0 = X.AnonymousClass6GE.A01(r0, r8, r7)
            r2.A01 = r0
            X.00j r1 = X.C000800j.NONE
            X.7JH r0 = new X.7JH
            r0.<init>(r2)
            X.00T r0 = X.C001400p.A00(r1, r0)
            r2.A09 = r0
            return
        L_0x0230:
            r3 = 0
            goto L_0x020a
        L_0x0232:
            long r3 = X.C90484aE.A0J(r4, r10)
            goto L_0x01da
        L_0x0237:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6WP.<init>(android.text.TextPaint, android.text.TextUtils$TruncateAt, X.6TJ, java.lang.CharSequence, float, int, int, int, int, int, int, int, int, boolean):void");
    }
}
