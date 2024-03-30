package X;

import android.os.Build;
import android.text.BoringLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;

/* renamed from: X.6TJ  reason: invalid class name */
public final class AnonymousClass6TJ {
    public float A00 = Float.NaN;
    public float A01 = Float.NaN;
    public BoringLayout.Metrics A02;
    public boolean A03;
    public final TextPaint A04;
    public final CharSequence A05;
    public final int A06;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0060, code lost:
        if (r5.nextSpanTransition(-1, r5.length(), X.C91924cq.class) != r5.length()) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0076, code lost:
        if (r4.getLetterSpacing() == 0.0f) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float A01() {
        /*
            r8 = this;
            float r1 = r8.A01
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L_0x006f
            android.text.BoringLayout$Metrics r0 = r8.A02()
            if (r0 == 0) goto L_0x0017
            int r0 = r0.width
            float r0 = (float) r0
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            if (r7 != 0) goto L_0x002e
        L_0x0017:
            java.lang.CharSequence r3 = r8.A05
            r2 = 0
            int r1 = r3.length()
            android.text.TextPaint r0 = r8.A04
            float r0 = android.text.Layout.getDesiredWidth(r3, r2, r1, r0)
            double r0 = (double) r0
            double r1 = java.lang.Math.ceil(r0)
            float r0 = (float) r1
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
        L_0x002e:
            float r6 = r7.floatValue()
            java.lang.CharSequence r5 = r8.A05
            android.text.TextPaint r4 = r8.A04
            r3 = 0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0069
            boolean r0 = r5 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x0070
            android.text.Spanned r5 = (android.text.Spanned) r5
            java.lang.Class<X.4cr> r1 = X.C91934cr.class
            int r0 = r5.length()
            r2 = -1
            int r1 = r5.nextSpanTransition(r2, r0, r1)
            int r0 = r5.length()
            if (r1 != r0) goto L_0x0062
            java.lang.Class<X.4cq> r1 = X.C91924cq.class
            int r0 = r5.length()
            int r1 = r5.nextSpanTransition(r2, r0, r1)
            int r0 = r5.length()
            if (r1 == r0) goto L_0x0070
        L_0x0062:
            r0 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r0
            java.lang.Float r7 = java.lang.Float.valueOf(r6)
        L_0x0069:
            float r1 = r7.floatValue()
            r8.A01 = r1
        L_0x006f:
            return r1
        L_0x0070:
            float r0 = r4.getLetterSpacing()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0062
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6TJ.A01():float");
    }

    public final BoringLayout.Metrics A02() {
        TextDirectionHeuristic textDirectionHeuristic;
        BoringLayout.Metrics A002;
        if (!this.A03) {
            int i = this.A06;
            C91054bO r0 = C129786Il.A01;
            if (i == 0) {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            } else if (i == 1) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else if (i != 2) {
                textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
            CharSequence charSequence = this.A05;
            TextPaint textPaint = this.A04;
            if (Build.VERSION.SDK_INT >= 33) {
                A002 = AnonymousClass6QW.A00(textDirectionHeuristic, textPaint, charSequence);
            } else {
                A002 = A00(textDirectionHeuristic, textPaint, charSequence);
            }
            this.A02 = A002;
            this.A03 = true;
        }
        return this.A02;
    }

    public AnonymousClass6TJ(TextPaint textPaint, CharSequence charSequence, int i) {
        this.A05 = charSequence;
        this.A04 = textPaint;
        this.A06 = i;
    }

    public static final BoringLayout.Metrics A00(TextDirectionHeuristic textDirectionHeuristic, TextPaint textPaint, CharSequence charSequence) {
        if (!textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return BoringLayout.isBoring(charSequence, textPaint, (BoringLayout.Metrics) null);
        }
        return null;
    }
}
