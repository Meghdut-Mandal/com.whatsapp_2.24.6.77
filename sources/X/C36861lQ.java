package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import com.whatsapp.TextData;

/* renamed from: X.1lQ  reason: invalid class name and case insensitive filesystem */
public abstract class C36861lQ extends Drawable {
    public static final AnonymousClass4SA A09;
    public float A00;
    public Layout A01;
    public int A02;
    public int A03;
    public final Paint A04 = C36441kJ.A0L(1);
    public final TextData A05;
    public final C51352ng A06;
    public final CharSequence A07;
    public final Typeface A08;

    public C36861lQ(Context context, Typeface typeface, TextData textData, C21060yb r6, AnonymousClass1H2 r7, C19890wg r8, C51352ng r9, String str) {
        this.A05 = textData;
        this.A08 = typeface;
        this.A06 = r9;
        this.A07 = AnonymousClass14B.A02(AnonymousClass6YV.A08(r6, r8, AnonymousClass3UG.A05(context, r7, str)));
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    static {
        AnonymousClass4SA r0;
        if (Build.VERSION.SDK_INT >= 23) {
            r0 = new C79083t9();
        } else {
            r0 = new C79093tA();
        }
        A09 = r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        if (r1 != null) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setBounds(int r13, int r14, int r15, int r16) {
        /*
            r12 = this;
            r5 = r16
            super.setBounds(r13, r14, r15, r5)
            boolean r4 = r12 instanceof X.AnonymousClass2g4
            if (r4 == 0) goto L_0x0111
            int r2 = r15 - r13
            float r1 = (float) r2
            float r6 = r12.A00
            r0 = 2
            float r0 = (float) r0
            float r6 = r6 * r0
            float r1 = r1 - r6
            int r7 = (int) r1
            int r0 = java.lang.Math.abs(r2)
            float r1 = (float) r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r0
            r0 = 1036831949(0x3dcccccd, float:0.1)
            float r1 = r1 * r0
            int r0 = (int) r1
            int r7 = r7 - r0
        L_0x0021:
            int r5 = r16 - r14
            float r0 = (float) r5
            float r0 = r0 - r6
            if (r4 == 0) goto L_0x0106
            int r5 = (int) r0
            int r0 = X.AnonymousClass000.A05(r15, r13)
            float r1 = (float) r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r0
            r0 = 1036831949(0x3dcccccd, float:0.1)
            float r1 = r1 * r0
            int r0 = (int) r1
            int r5 = r5 - r0
        L_0x0036:
            int r0 = r12.A02
            if (r0 != r5) goto L_0x003f
            int r0 = r12.A03
            if (r0 != r7) goto L_0x003f
        L_0x003e:
            return
        L_0x003f:
            r12.A03 = r7
            r12.A02 = r5
            r8 = 1
            android.text.TextPaint r6 = new android.text.TextPaint
            r6.<init>(r8)
            float r1 = (float) r5
            if (r4 == 0) goto L_0x0102
            r0 = 1093664768(0x41300000, float:11.0)
        L_0x004e:
            float r1 = r1 / r0
            r6.setTextSize(r1)
            com.whatsapp.TextData r0 = r12.A05
            r4 = 0
            if (r0 == 0) goto L_0x00ff
            int r2 = r0.textColor
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r0 = X.AnonymousClass000.A1P(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00ff
            if (r1 == 0) goto L_0x00ff
        L_0x006d:
            r6.setColor(r2)
            android.graphics.Typeface r0 = r6.getTypeface()
            r6.setTypeface(r0)
            java.lang.CharSequence r2 = r12.A07
            if (r2 == 0) goto L_0x003e
            int r1 = r2.length()
            r0 = 100
            if (r1 <= r0) goto L_0x0085
            r1 = 100
        L_0x0085:
            java.lang.CharSequence r3 = r2.subSequence(r4, r1)
        L_0x0089:
            if (r3 == 0) goto L_0x003e
        L_0x008b:
            int r0 = r3.length()
            if (r0 == 0) goto L_0x003e
            boolean r0 = r3 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x00c8
            android.graphics.Paint$FontMetricsInt r11 = X.AnonymousClass3RV.A00(r6)
            float r1 = r6.getTextSize()
            r0 = 1066192077(0x3f8ccccd, float:1.1)
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r10 = (int) r1
            r2 = r3
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r1 = r3.length()
            java.lang.Class<X.2iK> r0 = X.C48952iK.class
            r9 = 0
            java.lang.Object[] r2 = r2.getSpans(r4, r1, r0)
            X.2iK[] r2 = (X.C48952iK[]) r2
            if (r2 == 0) goto L_0x00c8
            int r1 = r2.length
        L_0x00b8:
            if (r9 >= r1) goto L_0x00c8
            r0 = r2[r9]
            r0.A00 = r11
            android.graphics.drawable.Drawable r0 = r0.A05()
            r0.setBounds(r4, r4, r10, r10)
            int r9 = r9 + 1
            goto L_0x00b8
        L_0x00c8:
            X.4SA r0 = A09
            android.text.StaticLayout r1 = r0.B4f(r6, r3, r7)
            r12.A01 = r1
            java.lang.String r0 = "null cannot be cast to non-null type android.text.Layout"
            X.AnonymousClass00C.A0E(r1, r0)
            int r0 = r1.getHeight()
            if (r0 <= r5) goto L_0x003e
            float r2 = r6.getTextSize()
            int r0 = r5 / 8
            r1 = 2
            int r0 = java.lang.Math.max(r1, r0)
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f5
            int r0 = r3.length()
            int r0 = r0 / r1
            java.lang.CharSequence r3 = r3.subSequence(r4, r0)
            goto L_0x0089
        L_0x00f5:
            float r1 = r6.getTextSize()
            float r0 = (float) r8
            float r1 = r1 - r0
            r6.setTextSize(r1)
            goto L_0x008b
        L_0x00ff:
            r2 = -1
            goto L_0x006d
        L_0x0102:
            r0 = 1073741824(0x40000000, float:2.0)
            goto L_0x004e
        L_0x0106:
            double r2 = (double) r0
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.sqrt(r0)
            double r2 = r2 / r0
            int r5 = (int) r2
            goto L_0x0036
        L_0x0111:
            int r0 = r15 - r13
            float r1 = (float) r0
            float r6 = r12.A00
            r0 = 2
            float r0 = (float) r0
            float r6 = r6 * r0
            float r1 = r1 - r6
            double r2 = (double) r1
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.sqrt(r0)
            double r2 = r2 / r0
            int r7 = (int) r2
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36861lQ.setBounds(int, int, int, int):void");
    }
}
