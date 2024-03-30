package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.TextUtils;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.6h8  reason: invalid class name and case insensitive filesystem */
public final class C138016h8 implements C160567lD {
    public final long A00;
    public final AnonymousClass6WP A01;
    public final C138036hA A02;
    public final CharSequence A03;
    public final List A04;
    public final int A05;
    public final AnonymousClass00T A06;

    public void BlB(C125185zS r8, C161047m3 r9, AnonymousClass6PD r10, C109085Wf r11, C131366Ot r12, float f, int i) {
        C91764ca r5 = this.A02.A05;
        int i2 = ((C137416g6) r5.A03).A00;
        long A0B = C90464aC.A0B((float) Constraints.A01(this.A00), BCO());
        long j = AnonymousClass6X0.A02;
        r5.A01(r8, f, A0B);
        r5.A02(r10);
        r5.A04(r12);
        r5.A03(r11);
        r5.A00(3);
        A01(r9, this);
        r5.A00(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x020b, code lost:
        if (r10 <= r13.A01.A08.getEllipsisStart(r11)) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x012c, code lost:
        if (r6 != 4) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x018f, code lost:
        if (r1.length == 0) goto L_0x0191;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0197 A[LOOP:1: B:101:0x0195->B:102:0x0197, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0173  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C138016h8(X.C138036hA r23, int r24, long r25, boolean r27) {
        /*
            r22 = this;
            r13 = r22
            r13.<init>()
            r6 = r23
            r13.A02 = r6
            r5 = r24
            r13.A05 = r5
            r8 = r25
            r13.A00 = r8
            int r0 = androidx.compose.ui.unit.Constraints.A02(r8)
            r4 = 0
            r3 = 1
            if (r0 != 0) goto L_0x025b
            int r0 = androidx.compose.ui.unit.Constraints.A03(r8)
            if (r0 != 0) goto L_0x025b
            if (r5 < r3) goto L_0x0254
            X.6V8 r2 = r6.A02
            r12 = 0
            if (r27 == 0) goto L_0x0049
            X.6FJ r0 = r2.A02
            long r0 = r0.A02
            long r10 = X.AnonymousClass6U3.A02(r4)
            X.68V[] r7 = X.AnonymousClass6WI.A02
            int r7 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x0049
            long r10 = X.AnonymousClass6WI.A01
            int r7 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x0049
            X.6Eq r0 = r2.A00
            int r1 = r0.A02
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L_0x0049
            r0 = 5
            if (r1 == r0) goto L_0x0049
            r0 = 4
            if (r1 == r0) goto L_0x0049
            r12 = 1
        L_0x0049:
            java.lang.CharSequence r10 = r6.A06
            if (r12 == 0) goto L_0x0071
            int r0 = r10.length()
            if (r0 == 0) goto L_0x0071
            boolean r0 = r10 instanceof android.text.Spannable
            if (r0 != 0) goto L_0x005b
            android.text.SpannableString r10 = X.C36441kJ.A0O(r10)
        L_0x005b:
            android.text.Spannable r10 = (android.text.Spannable) r10
            X.6cN r7 = new X.6cN
            r7.<init>()
            int r6 = r10.length()
            int r6 = r6 - r3
            int r1 = r10.length()
            int r1 = r1 - r3
            r0 = 33
            r10.setSpan(r7, r6, r1, r0)
        L_0x0071:
            r13.A03 = r10
            X.6Eq r1 = r2.A00
            int r6 = r1.A02
            r15 = 3
            if (r6 == r3) goto L_0x007f
            r15 = 0
            r0 = 2
            if (r6 != r0) goto L_0x011a
            r15 = 4
        L_0x007f:
            r16 = 0
        L_0x0081:
            int r0 = r1.A00
            r6 = 2
            if (r0 != r6) goto L_0x0116
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 32
            r18 = 4
            if (r7 > r0) goto L_0x0090
            r18 = 2
        L_0x0090:
            int r7 = r1.A01
            r1 = r7 & 255(0xff, float:3.57E-43)
            boolean r0 = X.C90514aH.A1V(r1)
            r19 = 0
            if (r0 != 0) goto L_0x00a0
            if (r1 != r6) goto L_0x0110
            r19 = 1
        L_0x00a0:
            int r0 = r7 >> 8
            r1 = r0 & 255(0xff, float:3.57E-43)
            boolean r0 = X.C90514aH.A1V(r1)
            r20 = 0
            if (r0 != 0) goto L_0x00b0
            if (r1 != r6) goto L_0x0104
            r20 = 1
        L_0x00b0:
            int r0 = r7 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            boolean r1 = X.AnonymousClass000.A1S(r0, r3)
            r21 = 0
            if (r1 != 0) goto L_0x00c0
            if (r0 != r6) goto L_0x00c0
            r21 = 1
        L_0x00c0:
            r6 = 0
            if (r27 == 0) goto L_0x0102
            android.text.TextUtils$TruncateAt r14 = android.text.TextUtils.TruncateAt.END
        L_0x00c5:
            r17 = r5
            X.6WP r1 = r13.A00(r14, r15, r16, r17, r18, r19, r20, r21)
            if (r27 == 0) goto L_0x0130
            boolean r0 = r1.A0A
            android.text.Layout r7 = r1.A08
            if (r0 == 0) goto L_0x00fd
            int r0 = r1.A04
            int r0 = r0 + -1
            int r0 = r7.getLineBottom(r0)
        L_0x00db:
            int r7 = r1.A05
            int r0 = r0 + r7
            int r7 = r1.A02
            int r0 = r0 + r7
            int r7 = r1.A03
            int r0 = r0 + r7
            int r7 = androidx.compose.ui.unit.Constraints.A00(r8)
            if (r0 <= r7) goto L_0x0130
            if (r5 <= r3) goto L_0x0130
            int r9 = r1.A04
            r0 = 0
        L_0x00ef:
            if (r0 >= r9) goto L_0x0133
            float r10 = r1.A02(r0)
            float r8 = (float) r7
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 > 0) goto L_0x0134
            int r0 = r0 + 1
            goto L_0x00ef
        L_0x00fd:
            int r0 = r7.getHeight()
            goto L_0x00db
        L_0x0102:
            r14 = r6
            goto L_0x00c5
        L_0x0104:
            r0 = 3
            if (r1 != r0) goto L_0x010a
            r20 = 2
            goto L_0x00b0
        L_0x010a:
            r0 = 4
            if (r1 != r0) goto L_0x00b0
            r20 = 3
            goto L_0x00b0
        L_0x0110:
            r0 = 3
            if (r1 != r0) goto L_0x00a0
            r19 = 2
            goto L_0x00a0
        L_0x0116:
            r18 = 0
            goto L_0x0090
        L_0x011a:
            r0 = 3
            if (r6 != r0) goto L_0x0120
            r15 = 2
            goto L_0x007f
        L_0x0120:
            r0 = 5
            if (r6 == r0) goto L_0x007f
            r0 = 6
            if (r6 != r0) goto L_0x0129
            r15 = 1
            goto L_0x007f
        L_0x0129:
            r0 = 4
            r16 = 1
            if (r6 == r0) goto L_0x0081
            goto L_0x007f
        L_0x0130:
            r13.A01 = r1
            goto L_0x0143
        L_0x0133:
            r0 = r9
        L_0x0134:
            if (r0 < 0) goto L_0x0141
            if (r0 == r5) goto L_0x0141
            if (r0 >= r3) goto L_0x013b
            r0 = 1
        L_0x013b:
            r17 = r0
            X.6WP r1 = r13.A00(r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x0141:
            r13.A01 = r1
        L_0x0143:
            X.6hA r0 = r13.A02
            X.4ca r5 = r0.A05
            X.6FJ r0 = r2.A02
            X.7mU r9 = r0.A0C
            X.5zS r3 = r9.B8w()
            long r0 = r13.A00
            int r0 = androidx.compose.ui.unit.Constraints.A01(r0)
            float r1 = (float) r0
            float r0 = r13.BCO()
            long r1 = X.C90464aC.A0B(r1, r0)
            long r7 = X.AnonymousClass6X0.A02
            float r0 = r9.B8b()
            r5.A01(r3, r0, r1)
            X.6WP r0 = r13.A01
            android.text.Layout r1 = r0.A08
            java.lang.CharSequence r0 = r1.getText()
            boolean r0 = r0 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x0191
            java.lang.CharSequence r2 = r1.getText()
            java.lang.String r0 = "null cannot be cast to non-null type android.text.Spanned"
            X.AnonymousClass00C.A0E(r2, r0)
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.CharSequence r0 = r1.getText()
            int r1 = r0.length()
            java.lang.Class<X.4cj> r0 = X.C91854cj.class
            java.lang.Object[] r1 = r2.getSpans(r4, r1, r0)
            X.4cj[] r1 = (X.C91854cj[]) r1
            int r0 = r1.length
            if (r0 != 0) goto L_0x0193
        L_0x0191:
            X.4cj[] r1 = new X.C91854cj[r4]
        L_0x0193:
            int r8 = r1.length
            r7 = 0
        L_0x0195:
            if (r7 >= r8) goto L_0x01b5
            r5 = r1[r7]
            long r2 = r13.A00
            int r0 = androidx.compose.ui.unit.Constraints.A01(r2)
            float r2 = (float) r0
            float r0 = r13.BCO()
            long r2 = X.C90464aC.A0B(r2, r0)
            X.7n5 r5 = r5.A00
            X.6X0 r0 = new X.6X0
            r0.<init>(r2)
            r5.setValue(r0)
            int r7 = r7 + 1
            goto L_0x0195
        L_0x01b5:
            java.lang.CharSequence r1 = r13.A03
            boolean r0 = r1 instanceof android.text.Spanned
            if (r0 != 0) goto L_0x01cd
            X.09w r9 = X.C023409w.A00
        L_0x01bd:
            r13.A04 = r9
            X.00j r1 = X.C000800j.NONE
            X.7JE r0 = new X.7JE
            r0.<init>(r13)
            X.00T r0 = X.C001400p.A00(r1, r0)
            r13.A06 = r0
            return
        L_0x01cd:
            r8 = r1
            android.text.Spanned r8 = (android.text.Spanned) r8
            int r1 = r1.length()
            java.lang.Class<X.1mF> r0 = X.C37361mF.class
            java.lang.Object[] r0 = r8.getSpans(r4, r1, r0)
            int r7 = r0.length
            java.util.ArrayList r9 = X.C36441kJ.A14(r7)
            r5 = 0
        L_0x01e0:
            if (r5 >= r7) goto L_0x01bd
            int r2 = r8.getSpanStart(r6)
            int r10 = r8.getSpanEnd(r6)
            X.6WP r0 = r13.A01
            android.text.Layout r0 = r0.A08
            int r11 = r0.getLineForOffset(r2)
            int r0 = r13.A05
            boolean r12 = X.C36371kC.A1T(r11, r0)
            X.6WP r0 = r13.A01
            android.text.Layout r0 = r0.A08
            int r0 = r0.getEllipsisCount(r11)
            if (r0 <= 0) goto L_0x020d
            X.6WP r0 = r13.A01
            android.text.Layout r0 = r0.A08
            int r0 = r0.getEllipsisStart(r11)
            r3 = 1
            if (r10 > r0) goto L_0x020e
        L_0x020d:
            r3 = 0
        L_0x020e:
            X.6WP r0 = r13.A01
            android.text.Layout r1 = r0.A08
            int r0 = r1.getEllipsisStart(r11)
            if (r0 != 0) goto L_0x024b
            int r0 = r1.getLineEnd(r11)
        L_0x021c:
            boolean r0 = X.C90474aD.A1T(r10, r0)
            if (r3 != 0) goto L_0x0245
            if (r0 != 0) goto L_0x0245
            if (r12 != 0) goto L_0x0245
            X.6WP r0 = r13.A01
            android.text.Layout r0 = r0.A08
            boolean r0 = r0.isRtlCharAt(r2)
            if (r0 == 0) goto L_0x0242
            java.lang.Integer r0 = X.C023109s.A01
        L_0x0232:
            int r1 = r0.intValue()
            X.6WP r0 = r13.A01
            r0.A04(r2, r4)
            java.lang.String r0 = "getWidthPx"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0242:
            java.lang.Integer r0 = X.C023109s.A00
            goto L_0x0232
        L_0x0245:
            r9.add(r6)
            int r5 = r5 + 1
            goto L_0x01e0
        L_0x024b:
            java.lang.CharSequence r0 = r1.getText()
            int r0 = r0.length()
            goto L_0x021c
        L_0x0254:
            java.lang.String r0 = "maxLines should be greater than 0"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x025b:
            java.lang.String r0 = "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138016h8.<init>(X.6hA, int, long, boolean):void");
    }

    private final AnonymousClass6WP A00(TextUtils.TruncateAt truncateAt, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        boolean z;
        CharSequence charSequence = this.A03;
        float A012 = (float) Constraints.A01(this.A00);
        C138036hA r0 = this.A02;
        C91764ca r2 = r0.A05;
        int i8 = r0.A01;
        AnonymousClass6TJ r4 = r0.A03;
        AnonymousClass6V8 r1 = r0.A02;
        C91784cc r02 = C112515e1.A00;
        AnonymousClass69J r03 = r1.A01;
        if (r03 != null) {
            z = r03.A00.A00;
        } else {
            z = false;
        }
        return new AnonymousClass6WP(r2, truncateAt, r4, charSequence, A012, i, i8, i3, i5, i6, i7, i4, i2, z);
    }

    public static final void A01(C161047m3 r6, C138016h8 r7) {
        Canvas canvas = C112335dj.A00;
        AnonymousClass00C.A0E(r6, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        Canvas canvas2 = ((C137386g3) r6).A00;
        AnonymousClass6WP r62 = r7.A01;
        boolean z = r62.A0A;
        if (z) {
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, (float) Constraints.A01(r7.A00), r7.BCO());
        }
        if (canvas2.getClipBounds(r62.A07)) {
            int i = r62.A05;
            if (i != 0) {
                canvas2.translate(0.0f, (float) i);
            }
            C91054bO r1 = C129786Il.A01;
            r1.A00 = canvas2;
            r62.A08.draw(r1);
            if (i != 0) {
                canvas2.translate(0.0f, ((float) -1) * ((float) i));
            }
        }
        if (z) {
            canvas2.restore();
        }
    }

    public float BBs() {
        float lineBaseline;
        Paint.FontMetricsInt fontMetricsInt;
        AnonymousClass6WP r3 = this.A01;
        float f = (float) r3.A05;
        if (0 != r3.A04 - 1 || (fontMetricsInt = r3.A06) == null) {
            lineBaseline = (float) r3.A08.getLineBaseline(0);
        } else {
            lineBaseline = r3.A03(0) - ((float) fontMetricsInt.ascent);
        }
        return f + lineBaseline;
    }

    public float BCO() {
        int height;
        AnonymousClass6WP r2 = this.A01;
        boolean z = r2.A0A;
        Layout layout = r2.A08;
        if (z) {
            height = layout.getLineBottom(r2.A04 - 1);
        } else {
            height = layout.getHeight();
        }
        return (float) (height + r2.A05 + r2.A02 + r2.A03);
    }
}
