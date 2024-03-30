package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spannable;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.View;

/* renamed from: X.6UW  reason: invalid class name */
public abstract class AnonymousClass6UW {
    public static final SparseIntArray A00 = new SparseIntArray();
    public static final SparseIntArray A01 = new SparseIntArray();

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01f3, code lost:
        if (r7 == false) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01f5, code lost:
        if (r6 == r4) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0207, code lost:
        if (r4 != false) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x020a, code lost:
        if (r7 == false) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x020c, code lost:
        if (r6 == r4) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x020f, code lost:
        if (r4 != false) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0211, code lost:
        r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0246, code lost:
        r2.A0K = r13;
        r5.A04 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r12.A0O == Integer.MIN_VALUE) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r0 != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a5, code lost:
        if (r13 != null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ad, code lost:
        if (r13.equals(r2.A0K) != false) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.Layout A00(android.content.Context r11, X.AnonymousClass72Q r12, java.lang.CharSequence r13, int r14) {
        /*
            X.6WL r5 = new X.6WL
            r5.<init>()
            r4 = 0
            r5.A05 = r4
            int r1 = android.view.View.MeasureSpec.getMode(r14)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 2
            if (r1 == r0) goto L_0x0096
            if (r1 == 0) goto L_0x0094
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 != r0) goto L_0x024d
            r7 = 1
        L_0x0018:
            android.text.TextUtils$TruncateAt r8 = r12.A0V
            if (r8 != 0) goto L_0x0025
            int r1 = r12.A0Q
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L_0x0025
            android.text.TextUtils$TruncateAt r8 = android.text.TextUtils.TruncateAt.END
        L_0x0025:
            boolean r0 = r12.A0G
            if (r0 == 0) goto L_0x0038
            int r0 = r12.A0P
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r2) goto L_0x0034
            int r1 = r12.A0O
            r0 = 1
            if (r1 != r2) goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r6 = 1
            if (r0 == 0) goto L_0x0039
        L_0x0038:
            r6 = 0
        L_0x0039:
            float r1 = X.C36341k9.A00(r11)
            X.68A r2 = r5.A06
            android.text.TextPaint r0 = r2.A0H
            float r0 = r0.density
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0051
            r2.A00()
            android.text.TextPaint r0 = r2.A0H
            r0.density = r1
            r0 = 0
            r5.A04 = r0
        L_0x0051:
            android.text.TextUtils$TruncateAt r0 = r2.A0I
            if (r0 == r8) goto L_0x005a
            r2.A0I = r8
            r0 = 0
            r5.A04 = r0
        L_0x005a:
            int r1 = r12.A0Q
            int r0 = r2.A0C
            if (r0 == r1) goto L_0x0065
            r2.A0C = r1
            r0 = 0
            r5.A04 = r0
        L_0x0065:
            float r10 = r12.A03
            float r9 = r12.A01
            float r8 = r12.A02
            int r1 = r12.A0D
            r2.A00()
            r2.A07 = r10
            r2.A05 = r9
            r2.A06 = r8
            r2.A0B = r1
            android.text.TextPaint r0 = r2.A0H
            r0.setShadowLayer(r10, r9, r8, r1)
            r0 = 0
            r5.A04 = r0
            boolean r1 = r12.A0H
            boolean r0 = r2.A0N
            if (r0 == r1) goto L_0x008b
            r2.A0N = r1
            r0 = 0
            r5.A04 = r0
        L_0x008b:
            java.lang.CharSequence r0 = r2.A0K
            if (r13 == r0) goto L_0x00af
            boolean r0 = r13 instanceof android.text.SpannableStringBuilder
            if (r0 == 0) goto L_0x00a5
            goto L_0x0098
        L_0x0094:
            r7 = 0
            goto L_0x0018
        L_0x0096:
            r7 = 2
            goto L_0x0018
        L_0x0098:
            r13.hashCode()     // Catch:{ NullPointerException -> 0x009c }
            goto L_0x00a7
        L_0x009c:
            r2 = move-exception
            java.lang.String r1 = "The given text contains a null span. Due to an Android framework bug, this will cause an exception later down the line."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1, r2)
            throw r0
        L_0x00a5:
            if (r13 == 0) goto L_0x0246
        L_0x00a7:
            java.lang.CharSequence r0 = r2.A0K
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0246
        L_0x00af:
            int r1 = r12.A0S
            android.text.TextPaint r0 = r2.A0H
            float r0 = r0.getTextSize()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00c7
            r2.A00()
            android.text.TextPaint r0 = r2.A0H
            r0.setTextSize(r1)
            r0 = 0
            r5.A04 = r0
        L_0x00c7:
            int r1 = android.view.View.MeasureSpec.getSize(r14)
            int r0 = r2.A0E
            if (r0 != r1) goto L_0x00d3
            int r0 = r2.A0D
            if (r0 == r7) goto L_0x00da
        L_0x00d3:
            r2.A0E = r1
            r2.A0D = r7
            r0 = 0
            r5.A04 = r0
        L_0x00da:
            boolean r0 = r2.A0L
            if (r0 == r6) goto L_0x00e3
            r2.A0L = r6
            r0 = 0
            r5.A04 = r0
        L_0x00e3:
            float r1 = r12.A00
            float r7 = r2.A04
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00f9
            float r0 = r2.A08
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00f9
            r2.A08 = r1
            r0 = 0
            r5.A04 = r0
        L_0x00f9:
            float r1 = r12.A0L
            int r0 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x010a
            float r0 = r2.A09
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x010a
            r2.A09 = r1
            r0 = 0
            r5.A04 = r0
        L_0x010a:
            int r1 = r12.A07
            android.text.TextPaint r0 = r2.A0H
            int r0 = r0.linkColor
            if (r0 == r1) goto L_0x011c
            r2.A00()
            android.text.TextPaint r0 = r2.A0H
            r0.linkColor = r1
            r0 = 0
            r5.A04 = r0
        L_0x011c:
            int r0 = r12.A06
            r5.A04(r0)
            int r1 = r12.A04
            int r0 = r2.A0A
            if (r0 == r1) goto L_0x012c
            r2.A0A = r1
            r0 = 0
            r5.A04 = r0
        L_0x012c:
            int r0 = r12.A05
            r5.A03(r0)
            boolean r1 = r12.A0c
            boolean r0 = r2.A0M
            if (r0 == r1) goto L_0x0144
            r2.A0M = r1
            java.lang.CharSequence r0 = r2.A0K
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0144
            r0 = 0
            r5.A04 = r0
        L_0x0144:
            float r6 = r12.A0K
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0165
            float r0 = r2.A04
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0165
            r2.A04 = r6
            android.text.TextPaint r0 = r2.A0H
            r1 = 0
            float r0 = r0.getFontMetrics(r1)
            float r6 = r6 - r0
            r2.A08 = r6
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.A09 = r0
            r5.A04 = r1
        L_0x0165:
            r1 = 0
            android.text.TextPaint r0 = r2.A0H
            float r0 = r0.getLetterSpacing()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x017b
            r2.A00()
            android.text.TextPaint r0 = r2.A0H
            r0.setLetterSpacing(r1)
            r0 = 0
            r5.A04 = r0
        L_0x017b:
            int r0 = r12.A0A
            r1 = -1
            if (r0 == r1) goto L_0x023e
            r5.A02 = r0
            r0 = 1
            r5.A03 = r0
        L_0x0185:
            int r0 = r12.A08
            if (r0 == r1) goto L_0x0236
            r5.A00 = r0
            r0 = 1
            r5.A01 = r0
        L_0x018e:
            int r6 = r12.A0R
            if (r6 == 0) goto L_0x021c
            r2.A00()
            r1 = 0
            r2.A0F = r1
            android.text.TextPaint r0 = r2.A0H
            r0.setColor(r6)
            r5.A04 = r1
        L_0x019f:
            android.graphics.Typeface r1 = r12.A0U
            if (r1 != 0) goto L_0x01a9
            int r0 = r12.A0E
            android.graphics.Typeface r1 = android.graphics.Typeface.defaultFromStyle(r0)
        L_0x01a9:
            android.text.TextPaint r0 = r2.A0H
            android.graphics.Typeface r0 = r0.getTypeface()
            if (r0 == r1) goto L_0x01bc
            r2.A00()
            android.text.TextPaint r0 = r2.A0H
            r0.setTypeface(r1)
            r0 = 0
            r5.A04 = r0
        L_0x01bc:
            boolean r6 = X.AnonymousClass5YY.A00(r11)
            X.048 r1 = r12.A0W
            if (r1 != 0) goto L_0x021a
            if (r6 == 0) goto L_0x0217
            X.048 r1 = X.AnonymousClass047.A02
        L_0x01c8:
            r12.A0W = r1
            r7 = 0
        L_0x01cb:
            X.048 r0 = r2.A0J
            if (r0 == r1) goto L_0x01d4
            r2.A0J = r1
            r0 = 0
            r5.A04 = r0
        L_0x01d4:
            int r0 = r13.length()
            boolean r4 = r1.BN4(r13, r4, r0)
            java.lang.Integer r0 = r12.A0Z
            int r1 = r0.intValue()
            if (r1 == r3) goto L_0x0214
            r0 = 1
            if (r1 == r0) goto L_0x020a
            r0 = 3
            if (r1 == r0) goto L_0x01f5
            r0 = 4
            if (r1 == r0) goto L_0x020c
            r0 = 5
            if (r1 == r0) goto L_0x020f
            r0 = 6
            if (r1 == r0) goto L_0x0207
            if (r7 != 0) goto L_0x01f7
        L_0x01f5:
            if (r6 != r4) goto L_0x0211
        L_0x01f7:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
        L_0x01f9:
            android.text.Layout$Alignment r0 = r2.A0G
            if (r0 == r1) goto L_0x0202
            r2.A0G = r1
            r0 = 0
            r5.A04 = r0
        L_0x0202:
            android.text.Layout r0 = r5.A02()
            return r0
        L_0x0207:
            if (r4 == 0) goto L_0x0211
            goto L_0x01f7
        L_0x020a:
            if (r7 != 0) goto L_0x0211
        L_0x020c:
            if (r6 != r4) goto L_0x01f7
            goto L_0x0211
        L_0x020f:
            if (r4 == 0) goto L_0x01f7
        L_0x0211:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x01f9
        L_0x0214:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x01f9
        L_0x0217:
            X.048 r1 = X.AnonymousClass047.A01
            goto L_0x01c8
        L_0x021a:
            r7 = 1
            goto L_0x01cb
        L_0x021c:
            android.content.res.ColorStateList r0 = r12.A0T
            r2.A00()
            r2.A0F = r0
            android.text.TextPaint r1 = r2.A0H
            if (r0 == 0) goto L_0x0233
            int r0 = r0.getDefaultColor()
        L_0x022b:
            r1.setColor(r0)
            r0 = 0
            r5.A04 = r0
            goto L_0x019f
        L_0x0233:
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x022b
        L_0x0236:
            int r0 = r12.A09
            r5.A00 = r0
            r5.A01 = r3
            goto L_0x018e
        L_0x023e:
            int r0 = r12.A0C
            r5.A02 = r0
            r5.A03 = r3
            goto L_0x0185
        L_0x0246:
            r2.A0K = r13
            r0 = 0
            r5.A04 = r0
            goto L_0x00af
        L_0x024d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unexpected size mode: "
            r1.append(r0)
            int r0 = android.view.View.MeasureSpec.getMode(r14)
            java.lang.String r0 = X.C36381kD.A10(r1, r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6UW.A00(android.content.Context, X.72Q, java.lang.CharSequence, int):android.text.Layout");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010b, code lost:
        if (r11.A0O == Integer.MIN_VALUE) goto L_0x010d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0231  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A01(android.content.Context r16, X.AnonymousClass72Q r17, java.lang.CharSequence r18, int r19, int r20) {
        /*
            r10 = r18
            X.5y5 r9 = new X.5y5
            r9.<init>()
            r11 = r17
            r9.A03 = r11
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r8 = 0
            if (r0 == 0) goto L_0x0022
            boolean r0 = r11.A0c
            if (r0 != 0) goto L_0x0022
            r9.A04 = r10
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r8, r8, r8, r8)
        L_0x001d:
            android.util.Pair r0 = X.C36441kJ.A0Q(r1, r9)
            return r0
        L_0x0022:
            r4 = r19
            r2 = r16
            android.text.Layout r7 = A00(r2, r11, r10, r4)
            int r3 = r7.getWidth()
            float r1 = r11.A0I
            float r0 = r11.A0J
            float r1 = r1 + r0
            int r0 = java.lang.Math.round(r1)
            int r3 = r3 + r0
            int r19 = android.view.View.resolveSize(r3, r4)
            java.lang.CharSequence r1 = r11.A0Y
            r6 = 1
            if (r1 == 0) goto L_0x00bc
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00bc
            r5 = 0
        L_0x004a:
            int r0 = r7.getLineCount()
            if (r5 >= r0) goto L_0x0059
            int r0 = r7.getEllipsisCount(r5)
            if (r0 > 0) goto L_0x005a
            int r5 = r5 + 1
            goto L_0x004a
        L_0x0059:
            r5 = -1
        L_0x005a:
            r0 = -1
            if (r5 == r0) goto L_0x00bc
            java.lang.CharSequence r3 = r11.A0Y
            r0 = r19
            float r12 = (float) r0
            float r0 = r11.A0I
            float r12 = r12 - r0
            float r0 = r11.A0J
            float r12 = r12 - r0
            int r1 = r3.length()
            android.text.TextPaint r0 = r7.getPaint()
            float r0 = android.text.Layout.getDesiredWidth(r3, r8, r1, r0)
            int r4 = r7.getParagraphDirection(r5)
            r1 = -1
            if (r4 == r1) goto L_0x0081
            float r12 = r12 - r0
            float r0 = r7.getLineLeft(r5)
            float r0 = r0 + r12
        L_0x0081:
            int r0 = r7.getOffsetForHorizontal(r5, r0)
            if (r0 <= 0) goto L_0x00b2
            int r4 = r0 + -1
            int r0 = r7.getEllipsisCount(r5)
            if (r0 <= 0) goto L_0x009b
            int r1 = r7.getLineStart(r5)
            int r0 = r7.getEllipsisStart(r5)
            int r1 = r1 + r0
            if (r4 <= r1) goto L_0x009b
            r4 = r1
        L_0x009b:
            if (r4 < 0) goto L_0x00b2
            int r0 = r10.length()
            if (r4 >= r0) goto L_0x00b2
            r0 = 2
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r0]
            java.lang.CharSequence r0 = r10.subSequence(r8, r4)
            r1[r8] = r0
            r1[r6] = r3
            java.lang.CharSequence r10 = android.text.TextUtils.concat(r1)
        L_0x00b2:
            int r0 = X.C90504aG.A08(r19)
            android.text.Layout r7 = A00(r2, r11, r10, r0)
            r9.A05 = r6
        L_0x00bc:
            if (r7 != 0) goto L_0x013e
            r5 = 0
        L_0x00bf:
            float r0 = r11.A0L
            r4 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x013c
            boolean r0 = r11.A0b
            if (r0 == 0) goto L_0x013c
            android.text.TextPaint r0 = r7.getPaint()
            int r0 = r0.getFontMetricsInt(r4)
            float r1 = (float) r0
            float r0 = r11.A0L
            float r0 = r0 - r2
            float r1 = r1 * r0
            int r3 = (int) r1
            int r5 = r5 + r3
        L_0x00db:
            int r2 = r7.getLineCount()
            int r0 = r11.A0B
            if (r2 >= r0) goto L_0x00fb
            android.text.TextPaint r0 = r7.getPaint()
            int r0 = r0.getFontMetricsInt(r4)
            float r1 = (float) r0
            float r0 = r11.A0L
            float r1 = r1 * r0
            float r0 = r11.A00
            float r1 = r1 + r0
            int r1 = java.lang.Math.round(r1)
            int r0 = r11.A0B
            int r0 = r0 - r2
            int r1 = r1 * r0
            int r5 = r5 + r1
        L_0x00fb:
            int r0 = r7.getHeight()
            float r0 = (float) r0
            r18 = r0
            int r0 = r11.A0P
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r2) goto L_0x010d
            int r1 = r11.A0O
            r0 = 1
            if (r1 != r2) goto L_0x010e
        L_0x010d:
            r0 = 0
        L_0x010e:
            if (r0 == 0) goto L_0x0209
            android.text.TextPaint r17 = r7.getPaint()
            android.text.TextPaint r12 = new android.text.TextPaint
            r0 = r17
            r12.<init>(r0)
            boolean r14 = r10 instanceof android.text.Spanned
            if (r14 == 0) goto L_0x0144
            int r0 = r10.length()
            if (r0 <= 0) goto L_0x0144
            r1 = r10
            android.text.Spanned r1 = (android.text.Spanned) r1
            java.lang.Class<android.text.style.MetricAffectingSpan> r0 = android.text.style.MetricAffectingSpan.class
            java.lang.Object[] r2 = r1.getSpans(r8, r8, r0)
            android.text.style.MetricAffectingSpan[] r2 = (android.text.style.MetricAffectingSpan[]) r2
            r1 = 0
        L_0x0131:
            int r0 = r2.length
            if (r1 >= r0) goto L_0x0144
            r0 = r2[r1]
            r0.updateMeasureState(r12)
            int r1 = r1 + 1
            goto L_0x0131
        L_0x013c:
            r3 = 0
            goto L_0x00db
        L_0x013e:
            int r5 = r7.getHeight()
            goto L_0x00bf
        L_0x0144:
            float r0 = r12.getTextSize()
            android.graphics.Typeface r1 = r12.getTypeface()
            int r0 = (int) r0
            int r0 = r0 * 31
            int r15 = X.C36401kF.A02(r1, r0)
            android.util.SparseIntArray r1 = A01
            monitor-enter(r1)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            int r2 = r1.get(r15, r13)     // Catch:{ all -> 0x0279 }
            monitor-exit(r1)     // Catch:{ all -> 0x0279 }
            if (r2 != r13) goto L_0x017f
            android.graphics.Rect r16 = X.AnonymousClass001.A06()
            android.graphics.Paint$FontMetricsInt r4 = new android.graphics.Paint$FontMetricsInt
            r4.<init>()
            r12.getFontMetricsInt(r4)
            java.lang.String r0 = "T"
            r2 = r16
            r12.getTextBounds(r0, r8, r6, r2)
            int r0 = r4.ascent
            int r2 = -r0
            int r0 = r16.height()
            int r2 = r2 - r0
            monitor-enter(r1)
            r1.put(r15, r2)     // Catch:{ all -> 0x0270 }
            monitor-exit(r1)     // Catch:{ all -> 0x0270 }
        L_0x017f:
            android.text.TextPaint r16 = new android.text.TextPaint
            r1 = r16
            r0 = r17
            r1.<init>(r0)
            if (r14 == 0) goto L_0x01b4
            int r0 = r10.length()
            if (r0 <= 0) goto L_0x01b4
            r0 = r10
            android.text.Spanned r0 = (android.text.Spanned) r0
            r1 = r0
            int r15 = r10.length()
            int r15 = r15 - r6
            int r14 = r10.length()
            int r14 = r14 - r6
            java.lang.Class<android.text.style.MetricAffectingSpan> r0 = android.text.style.MetricAffectingSpan.class
            java.lang.Object[] r15 = r1.getSpans(r15, r14, r0)
            android.text.style.MetricAffectingSpan[] r15 = (android.text.style.MetricAffectingSpan[]) r15
            r14 = 0
        L_0x01a7:
            int r0 = r15.length
            if (r14 >= r0) goto L_0x01b4
            r1 = r15[r14]
            r0 = r16
            r1.updateMeasureState(r0)
            int r14 = r14 + 1
            goto L_0x01a7
        L_0x01b4:
            float r0 = r16.getTextSize()
            android.graphics.Typeface r1 = r16.getTypeface()
            int r0 = (int) r0
            int r0 = r0 * 31
            int r15 = X.C36401kF.A02(r1, r0)
            android.util.SparseIntArray r14 = A00
            monitor-enter(r14)
            int r1 = r14.get(r15, r13)     // Catch:{ all -> 0x0276 }
            monitor-exit(r14)     // Catch:{ all -> 0x0276 }
            if (r1 != r13) goto L_0x01f6
            if (r4 == 0) goto L_0x01e5
            float r1 = r12.getTextSize()
            float r0 = r16.getTextSize()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01e5
            android.graphics.Typeface r1 = r12.getTypeface()
            android.graphics.Typeface r0 = r16.getTypeface()
            if (r1 == r0) goto L_0x01ef
        L_0x01e5:
            android.graphics.Paint$FontMetricsInt r4 = new android.graphics.Paint$FontMetricsInt
            r4.<init>()
            r0 = r16
            r0.getFontMetricsInt(r4)
        L_0x01ef:
            int r1 = r4.descent
            monitor-enter(r14)
            r14.put(r15, r1)     // Catch:{ all -> 0x0273 }
            monitor-exit(r14)     // Catch:{ all -> 0x0273 }
        L_0x01f6:
            int[] r0 = X.C36441kJ.A1O()
            r0[r8] = r2
            r0[r6] = r1
            r4 = r0[r8]
            int r0 = r11.A0P
            int r4 = r4 - r0
            int r1 = r1 + r4
            int r5 = r5 - r1
            int r0 = r11.A0O
            int r5 = r5 + r0
            goto L_0x020a
        L_0x0209:
            r4 = 0
        L_0x020a:
            r0 = r20
            int r2 = android.view.View.resolveSize(r5, r0)
            java.lang.Integer r0 = r11.A0F
            int r1 = r0.intValue()
            if (r1 == r6) goto L_0x0265
            r0 = 2
            if (r1 == r0) goto L_0x0261
            int r3 = r3 - r4
            float r1 = (float) r3
        L_0x021d:
            r9.A04 = r10
            r9.A02 = r7
            java.lang.Integer r3 = r11.A0Z
            java.lang.Integer r0 = X.C023109s.A00
            if (r3 != r0) goto L_0x0259
            float r0 = r11.A0I
        L_0x0229:
            r9.A00 = r0
        L_0x022b:
            r9.A01 = r1
            boolean r0 = r10 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x0250
            r3 = r10
            android.text.Spanned r3 = (android.text.Spanned) r3
            int r1 = r10.length()
            java.lang.Class<android.text.style.ClickableSpan> r0 = android.text.style.ClickableSpan.class
            java.lang.Object[] r0 = r3.getSpans(r8, r1, r0)
            android.text.style.ClickableSpan[] r0 = (android.text.style.ClickableSpan[]) r0
            r9.A06 = r0
            int r1 = r10.length()
            java.lang.Class<android.text.style.ImageSpan> r0 = android.text.style.ImageSpan.class
            java.lang.Object[] r0 = r3.getSpans(r8, r1, r0)
            android.text.style.ImageSpan[] r0 = (android.text.style.ImageSpan[]) r0
            r9.A07 = r0
        L_0x0250:
            android.graphics.Rect r1 = new android.graphics.Rect
            r0 = r19
            r1.<init>(r8, r8, r0, r2)
            goto L_0x001d
        L_0x0259:
            java.lang.Integer r0 = X.C023109s.A01
            if (r3 != r0) goto L_0x022b
            float r0 = r11.A0J
            float r0 = -r0
            goto L_0x0229
        L_0x0261:
            float r1 = (float) r2
            float r1 = r1 - r18
            goto L_0x026b
        L_0x0265:
            float r1 = (float) r2
            float r1 = r1 - r18
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
        L_0x026b:
            float r0 = (float) r3
            float r1 = r1 + r0
            float r0 = (float) r4
            float r1 = r1 - r0
            goto L_0x021d
        L_0x0270:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0270 }
            throw r0
        L_0x0273:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x0273 }
            throw r0
        L_0x0276:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x0276 }
            throw r0
        L_0x0279:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0279 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6UW.A01(android.content.Context, X.72Q, java.lang.CharSequence, int, int):android.util.Pair");
    }

    public static C140426lZ A02(C123035vp r25, C98184r1 r26, AnonymousClass72Q r27, CharSequence charSequence, int i, int i2) {
        int height;
        int i3;
        int height2;
        CharSequence charSequence2 = charSequence;
        Context context = r25.A02;
        AnonymousClass72Q r5 = r27;
        int i4 = i;
        int i5 = i2;
        Pair A012 = A01(context, r5, charSequence2, i4, i5);
        C120945sL r3 = r5.A0X;
        if (r3 != null && (charSequence2 instanceof Spannable)) {
            Spannable spannable = (Spannable) charSequence2;
            C124375y5 r1 = (C124375y5) A012.second;
            RectF rectF = r3.A02;
            float f = rectF.top;
            float f2 = rectF.bottom;
            float f3 = rectF.left;
            float f4 = rectF.right;
            float f5 = r3.A00;
            int i6 = r3.A01;
            if (View.MeasureSpec.getMode(i5) != 0) {
                int size = View.MeasureSpec.getSize(i5);
                Layout layout = r1.A02;
                if (layout == null) {
                    height2 = 0;
                } else {
                    height2 = layout.getHeight();
                }
                float f6 = ((float) height2) + f + f2;
                float f7 = (float) size;
                float f8 = (f7 - f6) / 2.0f;
                if (f7 < f6) {
                    float max = Math.max(0.0f, f8);
                    f = Math.abs(Math.min(f, max));
                    f2 = Math.abs(Math.min(f2, max));
                }
            }
            if (View.MeasureSpec.getMode(i4) != 0) {
                int size2 = View.MeasureSpec.getSize(i4);
                Layout layout2 = r1.A02;
                int i7 = 0;
                for (int i8 = 0; i8 < layout2.getLineCount(); i8++) {
                    i7 = (int) Math.max((float) i7, layout2.getLineWidth(i8));
                }
                int i9 = (size2 - i7) / 2;
                if (((float) size2) < ((float) i7) + f3 + f4) {
                    float max2 = (float) Math.max(0, i9);
                    f3 = Math.min(f3, max2);
                    f4 = Math.min(f4, max2);
                }
            }
            spannable.setSpan(new C66883Xr(r1.A02, f3, f4, f, f2, f5, i6), 0, spannable.length(), 18);
            r5.A0I = f3;
            r5.A0J = f4;
            Pair A013 = A01(context, r5, spannable, i4, i5);
            C124375y5 r9 = (C124375y5) A013.second;
            r9.A01 = f;
            int intValue = r5.A0Z.intValue();
            if (intValue != 2) {
                if (intValue != 0) {
                    if (intValue == 1) {
                        float width = (float) ((Rect) A013.first).width();
                        Layout layout3 = r9.A02;
                        if (layout3 == null) {
                            i3 = 0;
                        } else {
                            int lineCount = layout3.getLineCount();
                            i3 = 0;
                            for (int i10 = 0; i10 < lineCount; i10++) {
                                i3 = Math.max(i3, (int) layout3.getLineRight(i10));
                            }
                        }
                        r9.A00 = width - (((float) i3) + f4);
                    }
                }
                r9.A00 = f3;
            } else if (r9.A02.getLineCount() == 1) {
                f3 = (f3 + f4) / 2.0f;
                r9.A00 = f3;
            }
            int width2 = ((Rect) A013.first).width();
            Layout layout4 = r9.A02;
            if (layout4 == null) {
                height = 0;
            } else {
                height = layout4.getHeight();
            }
            A012 = C36441kJ.A0Q(new Rect(0, 0, width2, height + ((int) (f + f2))), r9);
        }
        return new C140426lZ(r26, A012.second, ((Rect) A012.first).width(), ((Rect) A012.first).height());
    }
}
