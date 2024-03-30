package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.json.JSONObject;

/* renamed from: X.5Cl  reason: invalid class name */
public final class AnonymousClass5Cl extends C129196Ft {
    public static Typeface A0G;
    public static Typeface A0H;
    public static Typeface A0I;
    public static Typeface A0J;
    public static Typeface A0K;
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public StaticLayout A09;
    public String A0A = "";
    public final Context A0B;
    public final TextPaint A0C = new TextPaint(1);
    public final C18820ts A0D;
    public final AnonymousClass3PW A0E = new AnonymousClass3PW();
    public final AnonymousClass1H2 A0F;

    public AnonymousClass5Cl(Context context, C18820ts r4, AnonymousClass1H2 r5) {
        C36321k7.A16(context, r5, r4, 1);
        this.A0B = context;
        this.A0F = r5;
        this.A0D = r4;
        C36431kI.A1L(this.A01);
    }

    public void A0K(C122675vF r8) {
        super.A0K(r8);
        C104935Ca r82 = (C104935Ca) r8;
        A0P(r82.A05, this.A05, r82.A03, r82.A01, r82.A02, r82.A04);
    }

    public void A0L(JSONObject jSONObject) {
        AnonymousClass00C.A0D(jSONObject, 0);
        super.A0L(jSONObject);
        jSONObject.put("orig-w", (int) (this.A02 * 100.0f));
        jSONObject.put("orig-h", (int) (this.A01 * 100.0f));
        jSONObject.put("text", this.A0A);
        jSONObject.put("text-size", (int) (this.A05 * 100.0f));
        jSONObject.put("style", this.A06);
        jSONObject.put("alignment", this.A08);
        jSONObject.put("background_style", this.A0E.A02);
        jSONObject.put("min-layout-width", this.A07);
        jSONObject.put("orig-l", (int) (this.A03 * 100.0f));
        jSONObject.put("orig-r", (int) (this.A04 * 100.0f));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        return android.text.Layout.Alignment.ALIGN_OPPOSITE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r2 != false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r2 != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.text.Layout.Alignment A00() {
        /*
            r3 = this;
            X.0ts r0 = r3.A0D
            java.util.Locale r0 = X.C36401kF.A0x(r0)
            android.text.BidiFormatter r1 = android.text.BidiFormatter.getInstance(r0)
            java.lang.String r0 = r3.A0A
            boolean r2 = r1.isRtl(r0)
            int r1 = r3.A08
            if (r1 == 0) goto L_0x0024
            r0 = 1
            if (r1 == r0) goto L_0x001f
            r0 = 2
            if (r1 != r0) goto L_0x0024
            if (r2 == 0) goto L_0x0021
        L_0x001c:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r0
        L_0x001f:
            if (r2 == 0) goto L_0x001c
        L_0x0021:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r0
        L_0x0024:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Cl.A00():android.text.Layout$Alignment");
    }

    public static final StaticLayout A01(Context context, AnonymousClass1H2 r5, AnonymousClass5Cl r6, String str, int i) {
        TextPaint textPaint = r6.A0C;
        CharSequence A022 = AnonymousClass14B.A02(AnonymousClass3UG.A03(context, textPaint, r5, str));
        if (A022 == null) {
            A022 = "";
        }
        int i2 = i;
        if (Build.VERSION.SDK_INT < 23) {
            return new StaticLayout(A022, textPaint, i2, r6.A00(), 1.3f, 0.0f, true);
        }
        StaticLayout.Builder includePad = StaticLayout.Builder.obtain(A022, 0, A022.length(), textPaint, i).setAlignment(r6.A00()).setLineSpacing(0.0f, 1.3f).setIncludePad(true);
        AnonymousClass00C.A08(includePad);
        StaticLayout build = includePad.build();
        AnonymousClass00C.A08(build);
        return build;
    }

    public static final void A02(AnonymousClass5Cl r9) {
        String str = r9.A0A;
        int i = 0;
        if (str.length() != 0) {
            TextPaint textPaint = r9.A0C;
            textPaint.setTextSize(r9.A05);
            textPaint.setColor(r9.A0E.A04);
            Context context = r9.A0B;
            AnonymousClass1H2 r1 = r9.A0F;
            RectF rectF = r9.A02;
            StaticLayout A012 = A01(context, r1, r9, str, ((int) rectF.width()) + 1);
            r9.A09 = A012;
            r9.A00 = 0.0f;
            int lineCount = A012.getLineCount();
            while (true) {
                StaticLayout staticLayout = r9.A09;
                if (i < lineCount) {
                    if (staticLayout == null) {
                        throw C36331k8.A0d("layout");
                    }
                    float lineWidth = staticLayout.getLineWidth(i);
                    if (lineWidth > r9.A00) {
                        r9.A00 = lineWidth;
                    }
                    i++;
                } else if (staticLayout == null) {
                    throw C36331k8.A0d("layout");
                } else {
                    float height = (float) staticLayout.getHeight();
                    float f = rectF.left;
                    float f2 = rectF.top;
                    float f3 = rectF.right;
                    float f4 = rectF.bottom;
                    int i2 = r9.A08;
                    if (i2 == 0) {
                        float f5 = f + f3;
                        float f6 = r9.A00;
                        float f7 = (float) 2;
                        float f8 = f2 + f4;
                        rectF.set((f5 - f6) / f7, (f8 - height) / f7, (f5 + f6) / f7, (f8 + height) / f7);
                    } else {
                        float f9 = f2 + f4;
                        float f10 = (float) 2;
                        float f11 = (f9 - height) / f10;
                        float f12 = (f9 + height) / f10;
                        if ((i2 != 1 || !C36351kA.A1Y(r9.A0D)) && (r9.A08 != 2 || C36351kA.A1Y(r9.A0D))) {
                            rectF.set(f3 - r9.A00, f11, f3, f12);
                        } else {
                            rectF.set(f, f11, r9.A00 + f, f12);
                        }
                    }
                    rectF.sort();
                    return;
                }
            }
        }
    }

    public void A0J(RectF rectF, float f, float f2, float f3, float f4) {
        this.A03 = f;
        this.A04 = f3;
        this.A02 = C90494aF.A01(f3, f);
        this.A01 = C90494aF.A01(f4, f2);
        RectF rectF2 = this.A02;
        rectF2.set(f, f2, f3, f4);
        rectF2.sort();
        A02(this);
    }

    public final void A0P(String str, float f, int i, int i2, int i3, int i4) {
        if (!AnonymousClass00C.A0J(this.A0A, str) || this.A06 != i || this.A08 != i2 || this.A0E.A02 != i3) {
            this.A0A = str;
            this.A05 = f;
            this.A06 = i;
            TextPaint textPaint = this.A0C;
            textPaint.setTypeface(C54762tV.A00(this.A0B, i));
            this.A08 = i2;
            AnonymousClass3PW r1 = this.A0E;
            r1.A02 = i3;
            r1.A01(r1.A03, i3);
            textPaint.setFakeBoldText(AnonymousClass000.A1O(i));
            this.A07 = i4;
            if (this.A00 != 0.0f) {
                RectF rectF = this.A02;
                float f2 = (float) 2;
                rectF.set(this.A03, rectF.centerY() - (this.A01 / f2), this.A04, rectF.centerY() + (this.A01 / f2));
                A02(this);
            }
        }
    }
}
