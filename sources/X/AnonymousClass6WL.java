package X;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: X.6WL  reason: invalid class name */
public class AnonymousClass6WL {
    public static final C002000v A07 = new C002000v(100);
    public int A00 = Integer.MAX_VALUE;
    public int A01 = 2;
    public int A02 = 0;
    public int A03 = 2;
    public Layout A04 = null;
    public boolean A05 = true;
    public final AnonymousClass68A A06 = new AnonymousClass68A();

    public static StaticLayout A00(Layout.Alignment alignment, TextPaint textPaint, TextUtils.TruncateAt truncateAt, AnonymousClass048 r16, CharSequence charSequence, float f, float f2, int i, int i2, int i3, int i4, boolean z) {
        Layout.Alignment alignment2 = alignment;
        TextPaint textPaint2 = textPaint;
        TextUtils.TruncateAt truncateAt2 = truncateAt;
        CharSequence charSequence2 = charSequence;
        float f3 = f;
        float f4 = f2;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        boolean z2 = z;
        try {
            return new StaticLayout(charSequence2, 0, i5, textPaint2, i6, alignment2, A01(r16), f3, f4, z2, truncateAt2, i7, i8);
        } catch (IllegalArgumentException e) {
            if (e.getMessage().contains("utext_close")) {
                return new StaticLayout(charSequence2, 0, i5, textPaint2, i6, alignment2, A01(r16), f3, f4, z2, truncateAt2, i7, i8);
            }
            throw e;
        }
    }

    public static TextDirectionHeuristic A01(AnonymousClass048 r1) {
        if (r1 == AnonymousClass047.A04) {
            return TextDirectionHeuristics.LTR;
        }
        if (r1 == AnonymousClass047.A05) {
            return TextDirectionHeuristics.RTL;
        }
        if (r1 != AnonymousClass047.A01) {
            if (r1 == AnonymousClass047.A02) {
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            }
            if (r1 == AnonymousClass047.A00) {
                return TextDirectionHeuristics.ANYRTL_LTR;
            }
            if (r1 == AnonymousClass047.A03) {
                return TextDirectionHeuristics.LOCALE;
            }
        }
        return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01b4, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01a8, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01a8, code lost:
        r2 = A00(r33, r34, r3, r29, r21, r32, r31, r24, r4, r4, r5, r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01fa, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01cb, code lost:
        r9 = android.text.StaticLayout.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r3 = r9.getDeclaredField("mLines");
        r3.setAccessible(true);
        r1 = r9.getDeclaredField("mColumns");
        r1.setAccessible(true);
        r11 = (int[]) r3.get(r2);
        r10 = r1.getInt(r2);
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ea, code lost:
        if (r9 >= r10) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ec, code lost:
        r3 = (r10 * r12) + r9;
        X.C90494aF.A1R(r11, r3, r3 + r10);
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f9, code lost:
        r1 = false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x022c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x0286 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0189 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.text.Layout A02() {
        /*
            r35 = this;
            r8 = r35
            boolean r0 = r8.A05
            if (r0 == 0) goto L_0x000b
            android.text.Layout r0 = r8.A04
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            X.68A r7 = r8.A06
            java.lang.CharSequence r0 = r7.A0K
            r23 = 0
            if (r0 == 0) goto L_0x001d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x001e
            boolean r0 = r7.A0M
            if (r0 != 0) goto L_0x001e
        L_0x001d:
            return r23
        L_0x001e:
            boolean r0 = r8.A05
            r6 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            java.lang.CharSequence r1 = r7.A0K
            boolean r0 = r1 instanceof android.text.Spannable
            if (r0 == 0) goto L_0x003e
            r3 = r1
            android.text.Spanned r3 = (android.text.Spanned) r3
            int r1 = r1.length()
            int r1 = r1 - r2
            java.lang.Class<android.text.style.ClickableSpan> r0 = android.text.style.ClickableSpan.class
            java.lang.Object[] r0 = r3.getSpans(r6, r1, r0)
            android.text.style.ClickableSpan[] r0 = (android.text.style.ClickableSpan[]) r0
            int r0 = r0.length
            if (r0 <= 0) goto L_0x003e
            r6 = 1
        L_0x003e:
            boolean r0 = r8.A05
            if (r0 == 0) goto L_0x0057
            if (r6 != 0) goto L_0x0057
            int r16 = r7.hashCode()
            X.00v r1 = A07
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            java.lang.Object r0 = r1.A04(r0)
            android.text.Layout r0 = (android.text.Layout) r0
            if (r0 == 0) goto L_0x0059
            return r0
        L_0x0057:
            r16 = -1
        L_0x0059:
            boolean r0 = r7.A0N
            if (r0 == 0) goto L_0x0061
            r5 = 1
        L_0x005e:
            if (r5 != r2) goto L_0x0075
            goto L_0x0064
        L_0x0061:
            int r5 = r7.A0C
            goto L_0x005e
        L_0x0064:
            java.lang.CharSequence r1 = r7.A0K     // Catch:{ NullPointerException -> 0x006d }
            android.text.TextPaint r0 = r7.A0H     // Catch:{ NullPointerException -> 0x006d }
            android.text.BoringLayout$Metrics r23 = android.text.BoringLayout.isBoring(r1, r0)     // Catch:{ NullPointerException -> 0x006d }
            goto L_0x0075
        L_0x006d:
            r3 = move-exception
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x0075
            throw r3
        L_0x0075:
            int r0 = r7.A0D
            if (r0 == 0) goto L_0x02c1
            if (r0 == r2) goto L_0x02bd
            java.lang.CharSequence r1 = r7.A0K
            android.text.TextPaint r0 = r7.A0H
            float r0 = android.text.Layout.getDesiredWidth(r1, r0)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r3 = (int) r0
            int r0 = r7.A0E
            int r3 = java.lang.Math.min(r3, r0)
        L_0x008f:
            android.text.TextPaint r1 = r7.A0H
            r0 = 0
            int r0 = r1.getFontMetricsInt(r0)
            float r0 = (float) r0
            float r10 = r7.A09
            float r0 = r0 * r10
            float r9 = r7.A08
            float r0 = r0 + r9
            int r4 = java.lang.Math.round(r0)
            int r1 = r8.A01
            int r0 = r8.A00
            if (r1 != r2) goto L_0x00a8
            int r0 = r0 * r4
        L_0x00a8:
            int r3 = java.lang.Math.min(r3, r0)
            int r1 = r8.A03
            int r0 = r8.A02
            if (r1 != r2) goto L_0x00b3
            int r0 = r0 * r4
        L_0x00b3:
            int r4 = java.lang.Math.max(r3, r0)
            if (r23 == 0) goto L_0x00ee
            java.lang.CharSequence r5 = r7.A0K
            android.text.TextPaint r3 = r7.A0H
            android.text.Layout$Alignment r2 = r7.A0G
            boolean r1 = r7.A0L
            android.text.TextUtils$TruncateAt r0 = r7.A0I
            r26 = r4
            r18 = r3
            r19 = r4
            r20 = r2
            r21 = r10
            r22 = r9
            r24 = r1
            r25 = r0
            r17 = r5
            android.text.BoringLayout r2 = android.text.BoringLayout.make(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x00d9:
            boolean r0 = r8.A05
            if (r0 == 0) goto L_0x00ea
            if (r6 != 0) goto L_0x00ea
            r8.A04 = r2
            X.00v r1 = A07
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r1.A08(r0, r2)
        L_0x00ea:
            r0 = 1
            r7.A02 = r0
            return r2
        L_0x00ee:
            java.lang.CharSequence r10 = r7.A0K     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            int r9 = r10.length()     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            android.text.TextPaint r0 = r7.A0H     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            r34 = r0
            android.text.Layout$Alignment r0 = r7.A0G     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            r33 = r0
            float r0 = r7.A09     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            r32 = r0
            float r0 = r7.A08     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            r31 = r0
            boolean r0 = r7.A0L     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            r30 = r0
            android.text.TextUtils$TruncateAt r3 = r7.A0I     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            X.048 r0 = r7.A0J     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            r29 = r0
            int r14 = r7.A0A     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            int r13 = r7.A00     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            int r12 = r7.A01     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            boolean r11 = r7.A03     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            r0 = 0
            r2 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            r15 = 23
            if (r1 < r15) goto L_0x016c
            r15 = r34
            android.text.StaticLayout$Builder r9 = android.text.StaticLayout.Builder.obtain(r10, r0, r9, r15, r4)     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            r0 = r33
            android.text.StaticLayout$Builder r10 = r9.setAlignment(r0)     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            r9 = r31
            r0 = r32
            android.text.StaticLayout$Builder r9 = r10.setLineSpacing(r9, r0)     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            r0 = r30
            android.text.StaticLayout$Builder r0 = r9.setIncludePad(r0)     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            android.text.StaticLayout$Builder r0 = r0.setEllipsize(r3)     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            android.text.StaticLayout$Builder r0 = r0.setEllipsizedWidth(r4)     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            android.text.StaticLayout$Builder r3 = r0.setMaxLines(r5)     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            android.text.TextDirectionHeuristic r0 = A01(r29)     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            android.text.StaticLayout$Builder r0 = r3.setTextDirection(r0)     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            android.text.StaticLayout$Builder r0 = r0.setBreakStrategy(r14)     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            android.text.StaticLayout$Builder r0 = r0.setHyphenationFrequency(r13)     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            android.text.StaticLayout$Builder r2 = r0.setIndents(r2, r2)     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            r0 = 26
            if (r1 < r0) goto L_0x015f
            r2.setJustificationMode(r12)     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
        L_0x015f:
            r0 = 28
            if (r1 < r0) goto L_0x0166
            r2.setUseLineSpacingFromFallbacks(r11)     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
        L_0x0166:
            android.text.StaticLayout r2 = r2.build()     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            goto L_0x00d9
        L_0x016c:
            r26 = r4
            r21 = r10
            r22 = r32
            r23 = r31
            r24 = r9
            r25 = r4
            r27 = r5
            r28 = r30
            r17 = r33
            r18 = r34
            r19 = r3
            r20 = r29
            android.text.StaticLayout r2 = A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ LinkageError -> 0x0189 }
            goto L_0x01a6
        L_0x0189:
            android.text.StaticLayout r2 = new android.text.StaticLayout     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            r19 = 0
            r28 = r4
            r17 = r2
            r18 = r10
            r20 = r9
            r21 = r34
            r22 = r4
            r23 = r33
            r24 = r32
            r25 = r31
            r26 = r30
            r27 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
        L_0x01a6:
            if (r5 <= 0) goto L_0x01b4
        L_0x01a8:
            int r1 = r2.getLineCount()     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            if (r1 <= r5) goto L_0x01b4
            int r11 = r2.getLineStart(r5)     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            if (r11 < r9) goto L_0x01fd
        L_0x01b4:
            int r9 = r2.getLineStart(r0)     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            int r3 = r2.getLineCount()     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            r12 = 0
        L_0x01bd:
            r10 = 1
            if (r12 >= r3) goto L_0x01f7
            int r1 = r2.getLineEnd(r12)     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            if (r1 >= r9) goto L_0x01c7
            goto L_0x01cb
        L_0x01c7:
            int r12 = r12 + 1
            r9 = r1
            goto L_0x01bd
        L_0x01cb:
            java.lang.Class<android.text.StaticLayout> r9 = android.text.StaticLayout.class
            java.lang.String r1 = "mLines"
            java.lang.reflect.Field r3 = r9.getDeclaredField(r1)     // Catch:{ Exception -> 0x01f7 }
            r3.setAccessible(r10)     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r1 = "mColumns"
            java.lang.reflect.Field r1 = r9.getDeclaredField(r1)     // Catch:{ Exception -> 0x01f7 }
            r1.setAccessible(r10)     // Catch:{ Exception -> 0x01f7 }
            java.lang.Object r11 = r3.get(r2)     // Catch:{ Exception -> 0x01f7 }
            int[] r11 = (int[]) r11     // Catch:{ Exception -> 0x01f7 }
            int r10 = r1.getInt(r2)     // Catch:{ Exception -> 0x01f7 }
            r9 = 0
        L_0x01ea:
            if (r9 >= r10) goto L_0x01f9
            int r3 = r10 * r12
            int r3 = r3 + r9
            int r1 = r3 + r10
            X.C90494aF.A1R(r11, r3, r1)     // Catch:{ Exception -> 0x01f7 }
            int r9 = r9 + 1
            goto L_0x01ea
        L_0x01f7:
            r1 = 1
            goto L_0x01fa
        L_0x01f9:
            r1 = 0
        L_0x01fa:
            if (r1 != 0) goto L_0x00d9
            goto L_0x01b4
        L_0x01fd:
            if (r11 <= r0) goto L_0x020e
            int r1 = r11 + -1
            char r1 = r10.charAt(r1)     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            boolean r1 = java.lang.Character.isSpace(r1)     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            if (r1 == 0) goto L_0x020e
            int r11 = r11 + -1
            goto L_0x01fd
        L_0x020e:
            r9 = r11
            r26 = r4
            r21 = r10
            r22 = r32
            r23 = r31
            r24 = r11
            r25 = r4
            r27 = r5
            r28 = r30
            r17 = r33
            r18 = r34
            r19 = r3
            r20 = r29
            android.text.StaticLayout r2 = A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ LinkageError -> 0x022c }
            goto L_0x0249
        L_0x022c:
            android.text.StaticLayout r2 = new android.text.StaticLayout     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            r19 = 0
            r28 = r4
            r17 = r2
            r18 = r10
            r20 = r11
            r21 = r34
            r22 = r4
            r23 = r33
            r24 = r32
            r25 = r31
            r26 = r30
            r27 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
        L_0x0249:
            int r1 = r2.getLineCount()     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            if (r1 < r5) goto L_0x01a8
            int r1 = r5 + -1
            int r1 = r2.getEllipsisCount(r1)     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            if (r1 != 0) goto L_0x01a8
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            java.lang.CharSequence r1 = r10.subSequence(r0, r11)     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            r2.append(r1)     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            java.lang.String r1 = " …"
            java.lang.String r21 = X.AnonymousClass000.A0q(r1, r2)     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            int r24 = r21.length()     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            r26 = r4
            r22 = r32
            r23 = r31
            r25 = r4
            r27 = r5
            r28 = r30
            r17 = r33
            r18 = r34
            r19 = r3
            r20 = r29
            android.text.StaticLayout r2 = A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ LinkageError -> 0x0286 }
            goto L_0x01a8
        L_0x0286:
            android.text.StaticLayout r2 = new android.text.StaticLayout     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            r19 = 0
            r28 = r4
            r17 = r2
            r18 = r21
            r20 = r24
            r21 = r34
            r22 = r4
            r23 = r33
            r24 = r32
            r25 = r31
            r26 = r30
            r27 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ IndexOutOfBoundsException -> 0x02a5 }
            goto L_0x01a8
        L_0x02a5:
            r2 = move-exception
            java.lang.CharSequence r0 = r7.A0K
            boolean r0 = r0 instanceof java.lang.String
            if (r0 != 0) goto L_0x02d1
            java.lang.String r1 = "TextLayoutBuilder"
            java.lang.String r0 = "Hit bug #35412, retrying with Spannables removed"
            android.util.Log.e(r1, r0, r2)
            java.lang.CharSequence r0 = r7.A0K
            java.lang.String r0 = r0.toString()
            r7.A0K = r0
            goto L_0x00ee
        L_0x02bd:
            int r3 = r7.A0E
            goto L_0x008f
        L_0x02c1:
            java.lang.CharSequence r1 = r7.A0K
            android.text.TextPaint r0 = r7.A0H
            float r0 = android.text.Layout.getDesiredWidth(r1, r0)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r3 = (int) r0
            goto L_0x008f
        L_0x02d1:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6WL.A02():android.text.Layout");
    }

    public void A03(int i) {
        AnonymousClass68A r1 = this.A06;
        if (r1.A00 != i) {
            r1.A00 = i;
            if (Build.VERSION.SDK_INT >= 23) {
                this.A04 = null;
            }
        }
    }

    public void A04(int i) {
        AnonymousClass68A r1 = this.A06;
        if (r1.A01 != i) {
            r1.A01 = i;
            if (Build.VERSION.SDK_INT >= 26) {
                this.A04 = null;
            }
        }
    }
}
