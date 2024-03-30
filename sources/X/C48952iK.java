package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.2iK  reason: invalid class name and case insensitive filesystem */
public class C48952iK extends C37351mE {
    public Paint.FontMetricsInt A00;
    public C36741lE A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final CharSequence A05;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r2[0] == r6) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A04(java.lang.CharSequence r7, int r8) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof android.text.Spanned
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L_0x002b
            r2 = r7
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.CharSequence r0 = r6.A05
            int r1 = r0.length()
            int r1 = r1 + r8
            java.lang.Class<X.2iK> r0 = X.C48952iK.class
            java.lang.Object[] r2 = r2.getSpans(r8, r1, r0)
            X.2iK[] r2 = (X.C48952iK[]) r2
            char r1 = r7.charAt(r8)
            r0 = 65532(0xfffc, float:9.183E-41)
            if (r1 != r0) goto L_0x002b
            if (r2 == 0) goto L_0x002b
            int r0 = r2.length
            if (r0 <= 0) goto L_0x002b
            r0 = r2[r4]
            if (r0 != r6) goto L_0x002b
        L_0x002a:
            return r5
        L_0x002b:
            r3 = 0
        L_0x002c:
            java.lang.CharSequence r1 = r6.A05
            int r0 = r1.length()
            if (r3 >= r0) goto L_0x002a
            int r2 = r8 + r3
            int r0 = r7.length()
            if (r2 >= r0) goto L_0x002a
            char r1 = r1.charAt(r3)
            char r0 = r7.charAt(r2)
            if (r1 == r0) goto L_0x0047
            return r4
        L_0x0047:
            int r3 = r3 + 1
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48952iK.A04(java.lang.CharSequence, int):boolean");
    }

    public C48952iK(Context context, Paint.FontMetricsInt fontMetricsInt, Drawable drawable, CharSequence charSequence) {
        super(drawable);
        this.A05 = charSequence;
        this.A04 = AnonymousClass00F.A00(context, C36341k9.A05(context));
        this.A03 = (int) C36341k9.A00(context);
        this.A00 = fontMetricsInt;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (A04(charSequence, i)) {
            Canvas canvas2 = canvas;
            float f2 = f;
            int i6 = i4;
            Paint paint2 = paint;
            if (this.A02) {
                C36741lE r10 = this.A01;
                if (r10 == null) {
                    r10 = new C36741lE(this.A04, paint2);
                    this.A01 = r10;
                }
                float f3 = (float) (A05().getBounds().right + this.A03);
                float f4 = ((float) i6) + r10.A00 + (r10.A01 / 2.0f);
                canvas2.drawLine(f2, f4, f + f3, f4, r10);
            }
            C36411kG.A18(canvas, paint2, A05(), f2, i6);
        }
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = A05().getBounds();
        if (fontMetricsInt != null) {
            int height = bounds.height();
            Paint.FontMetricsInt fontMetricsInt2 = this.A00;
            int i3 = fontMetricsInt2.descent;
            int i4 = fontMetricsInt2.ascent;
            int max = Math.max(0, (height - i3) + i4);
            fontMetricsInt.ascent = i4 - max;
            fontMetricsInt.descent = i3 + max;
            fontMetricsInt.top = fontMetricsInt2.top - max;
            fontMetricsInt.bottom = fontMetricsInt2.bottom + max;
        }
        if (A04(charSequence, i)) {
            return bounds.right + this.A03;
        }
        return 0;
    }
}
