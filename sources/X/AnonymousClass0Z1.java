package X;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;

/* renamed from: X.0Z1  reason: invalid class name */
public final class AnonymousClass0Z1 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07 = 15.0f;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public float A0E;
    public float A0F;
    public float A0G;
    public float A0H;
    public float A0I;
    public float A0J;
    public float A0K;
    public float A0L;
    public float A0M = 15.0f;
    public float A0N;
    public float A0O;
    public float A0P = 0.0f;
    public float A0Q = 1.0f;
    public int A0R = 16;
    public int A0S;
    public int A0T;
    public int A0U;
    public int A0V = 16;
    public int A0W = C07260Wy.A0F;
    public int A0X = 1;
    public TimeInterpolator A0Y;
    public TimeInterpolator A0Z;
    public ColorStateList A0a;
    public ColorStateList A0b;
    public ColorStateList A0c;
    public ColorStateList A0d;
    public Typeface A0e;
    public Typeface A0f;
    public StaticLayout A0g;
    public TextUtils.TruncateAt A0h = TextUtils.TruncateAt.END;
    public AnonymousClass0oa A0i;
    public CharSequence A0j;
    public CharSequence A0k;
    public CharSequence A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p = true;
    public float A0q;
    public float A0r;
    public float A0s;
    public Typeface A0t;
    public Typeface A0u;
    public Typeface A0v;
    public Typeface A0w;
    public Typeface A0x;
    public AnonymousClass0NL A0y;
    public AnonymousClass0NL A0z;
    public int[] A10;
    public final Rect A11;
    public final Rect A12;
    public final RectF A13;
    public final TextPaint A14;
    public final TextPaint A15;
    public final View A16;

    public static int A01(ColorStateList colorStateList, AnonymousClass0Z1 r3) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = r3.A10;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public void A08(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.A0G) {
            this.A0G = f;
            A02();
        }
    }

    public static int A00(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), Math.round((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), Math.round((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), Math.round((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    private void A02() {
        View view;
        float f;
        int A012;
        float A002;
        Rect rect;
        float f2 = this.A0G;
        float f3 = f2;
        boolean z = this.A0n;
        RectF rectF = this.A13;
        if (z) {
            if (f2 < this.A0O) {
                rect = this.A12;
            } else {
                rect = this.A11;
            }
            rectF.set(rect);
        } else {
            Rect rect2 = this.A12;
            float f4 = (float) rect2.left;
            Rect rect3 = this.A11;
            float f5 = (float) rect3.left;
            TimeInterpolator timeInterpolator = this.A0Y;
            float f6 = f2;
            if (timeInterpolator != null) {
                f6 = timeInterpolator.getInterpolation(f2);
            }
            TimeInterpolator timeInterpolator2 = AnonymousClass064.A00;
            rectF.left = AnonymousClass001.A00(f5, f4, f6);
            float f7 = this.A0F;
            float f8 = this.A01;
            TimeInterpolator timeInterpolator3 = this.A0Y;
            float f9 = f2;
            if (timeInterpolator3 != null) {
                f9 = timeInterpolator3.getInterpolation(f2);
            }
            rectF.top = AnonymousClass001.A00(f8, f7, f9);
            float f10 = (float) rect2.right;
            float f11 = (float) rect3.right;
            TimeInterpolator timeInterpolator4 = this.A0Y;
            float f12 = f2;
            if (timeInterpolator4 != null) {
                f12 = timeInterpolator4.getInterpolation(f2);
            }
            rectF.right = AnonymousClass001.A00(f11, f10, f12);
            float f13 = (float) rect2.bottom;
            float f14 = (float) rect3.bottom;
            TimeInterpolator timeInterpolator5 = this.A0Y;
            if (timeInterpolator5 != null) {
                f3 = timeInterpolator5.getInterpolation(f2);
            }
            rectF.bottom = AnonymousClass001.A00(f14, f13, f3);
        }
        if (!this.A0n) {
            float f15 = this.A0E;
            float f16 = this.A00;
            TimeInterpolator timeInterpolator6 = this.A0Y;
            float f17 = f2;
            if (timeInterpolator6 != null) {
                f17 = timeInterpolator6.getInterpolation(f2);
            }
            TimeInterpolator timeInterpolator7 = AnonymousClass064.A00;
            this.A09 = AnonymousClass001.A00(f16, f15, f17);
            float f18 = this.A0F;
            float f19 = this.A01;
            TimeInterpolator timeInterpolator8 = this.A0Y;
            float f20 = f2;
            if (timeInterpolator8 != null) {
                f20 = timeInterpolator8.getInterpolation(f2);
            }
            this.A0A = AnonymousClass001.A00(f19, f18, f20);
            A03(f2, false);
            view = this.A16;
            C011504z.A05(view);
            f = f2;
        } else if (f2 < this.A0O) {
            this.A09 = this.A0E;
            this.A0A = this.A0F;
            A03(0.0f, false);
            view = this.A16;
            C011504z.A05(view);
            f = 0.0f;
        } else {
            this.A09 = this.A00;
            this.A0A = this.A01 - ((float) Math.max(0, this.A0S));
            A03(1.0f, false);
            view = this.A16;
            C011504z.A05(view);
            f = 1.0f;
        }
        TimeInterpolator timeInterpolator9 = AnonymousClass064.A02;
        this.A06 = 1.0f - AnonymousClass001.A00(1.0f, 0.0f, timeInterpolator9.getInterpolation(1.0f - f2));
        C011504z.A05(view);
        this.A0L = AnonymousClass001.A00(0.0f, 1.0f, timeInterpolator9.getInterpolation(f2));
        C011504z.A05(view);
        ColorStateList colorStateList = this.A0b;
        ColorStateList colorStateList2 = this.A0d;
        TextPaint textPaint = this.A14;
        if (colorStateList != colorStateList2) {
            A012 = A00(f, A01(colorStateList2, this), A01(this.A0b, this));
        } else {
            A012 = A01(colorStateList, this);
        }
        textPaint.setColor(A012);
        float f21 = this.A02;
        float f22 = this.A0H;
        if (f21 != f22) {
            f21 = AnonymousClass001.A00(f21, f22, timeInterpolator9.getInterpolation(f2));
        }
        textPaint.setLetterSpacing(f21);
        this.A0D = AnonymousClass001.A00(this.A05, this.A0K, f2);
        this.A0B = AnonymousClass001.A00(this.A03, this.A0I, f2);
        this.A0C = AnonymousClass001.A00(this.A04, this.A0J, f2);
        int A003 = A00(f2, A01(this.A0c, this), A01(this.A0a, this));
        this.A0T = A003;
        textPaint.setShadowLayer(this.A0D, this.A0B, this.A0C, A003);
        if (this.A0n) {
            int alpha = textPaint.getAlpha();
            float f23 = this.A0O;
            if (f2 <= f23) {
                A002 = AnonymousClass064.A00(1.0f, 0.0f, this.A0N, f23, f2);
            } else {
                A002 = AnonymousClass064.A00(0.0f, 1.0f, f23, 1.0f, f2);
            }
            textPaint.setAlpha((int) (A002 * ((float) alpha)));
        }
        C011504z.A05(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        if (r1 == 0) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r12.A0m != false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A03(float r13, boolean r14) {
        /*
            r12 = this;
            java.lang.CharSequence r0 = r12.A0j
            if (r0 == 0) goto L_0x0149
            android.graphics.Rect r0 = r12.A11
            int r0 = r0.width()
            float r4 = (float) r0
            android.graphics.Rect r0 = r12.A12
            int r0 = r0.width()
            float r5 = (float) r0
            r7 = 1065353216(0x3f800000, float:1.0)
            float r0 = r13 - r7
            float r1 = java.lang.Math.abs(r0)
            r0 = 925353388(0x3727c5ac, float:1.0E-5)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 0
            if (r1 >= 0) goto L_0x0023
            r0 = 1
        L_0x0023:
            r10 = 0
            if (r0 == 0) goto L_0x00a8
            float r6 = r12.A07
            float r3 = r12.A02
            r12.A0s = r7
            android.graphics.Typeface r2 = r12.A0e
        L_0x002e:
            r5 = 1
            r9 = 0
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x007c
            float r0 = r12.A0r
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            boolean r11 = X.AnonymousClass000.A1P(r0)
            float r0 = r12.A0q
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            boolean r10 = X.AnonymousClass000.A1P(r0)
            android.graphics.Typeface r0 = r12.A0v
            r8 = 0
            if (r0 == r2) goto L_0x004a
            r8 = 1
        L_0x004a:
            android.text.StaticLayout r0 = r12.A0g
            if (r0 == 0) goto L_0x0058
            int r0 = r0.getWidth()
            float r0 = (float) r0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r0 = 1
            if (r1 != 0) goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            if (r11 != 0) goto L_0x0066
            if (r10 != 0) goto L_0x0066
            if (r0 != 0) goto L_0x0066
            if (r8 != 0) goto L_0x0066
            boolean r0 = r12.A0m
            r8 = 0
            if (r0 == 0) goto L_0x0067
        L_0x0066:
            r8 = 1
        L_0x0067:
            r12.A0r = r6
            r12.A0q = r3
            r12.A0v = r2
            r12.A0m = r9
            android.text.TextPaint r1 = r12.A14
            float r0 = r12.A0s
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0078
            r9 = 1
        L_0x0078:
            r1.setLinearText(r9)
            r9 = r8
        L_0x007c:
            java.lang.CharSequence r0 = r12.A0k
            if (r0 == 0) goto L_0x0082
            if (r9 == 0) goto L_0x0149
        L_0x0082:
            android.text.TextPaint r7 = r12.A14
            float r0 = r12.A0r
            r7.setTextSize(r0)
            android.graphics.Typeface r0 = r12.A0v
            r7.setTypeface(r0)
            float r0 = r12.A0q
            r7.setLetterSpacing(r0)
            java.lang.CharSequence r0 = r12.A0j
            boolean r6 = A06(r12, r0)
            r12.A0o = r6
            int r1 = r12.A0X
            if (r1 <= r5) goto L_0x0104
            if (r6 == 0) goto L_0x00a5
            boolean r0 = r12.A0n
            if (r0 == 0) goto L_0x0104
        L_0x00a5:
            r5 = r1
            r1 = 1
            goto L_0x00e9
        L_0x00a8:
            float r6 = r12.A0M
            r8 = r6
            float r3 = r12.A0H
            android.graphics.Typeface r2 = r12.A0f
            float r0 = r13 - r10
            float r1 = java.lang.Math.abs(r0)
            r0 = 925353388(0x3727c5ac, float:1.0E-5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d0
            r12.A0s = r7
        L_0x00be:
            float r1 = r12.A07
            float r1 = r1 / r8
            float r0 = r5 * r1
            if (r14 != 0) goto L_0x00e6
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e6
            float r4 = r4 / r1
            float r4 = java.lang.Math.min(r4, r5)
            goto L_0x002e
        L_0x00d0:
            float r1 = r12.A07
            android.animation.TimeInterpolator r0 = r12.A0Z
            if (r0 == 0) goto L_0x00da
            float r13 = r0.getInterpolation(r13)
        L_0x00da:
            android.animation.TimeInterpolator r0 = X.AnonymousClass064.A00
            float r0 = X.AnonymousClass001.A00(r1, r6, r13)
            float r8 = r12.A0M
            float r0 = r0 / r8
            r12.A0s = r0
            goto L_0x00be
        L_0x00e6:
            r4 = r5
            goto L_0x002e
        L_0x00e9:
            int r0 = r12.A0V     // Catch:{ 0O7 -> 0x012f }
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r6)     // Catch:{ 0O7 -> 0x012f }
            r2 = r0 & 7
            if (r2 == r1) goto L_0x0101
            r1 = 5
            boolean r0 = r12.A0o     // Catch:{ 0O7 -> 0x012f }
            if (r2 == r1) goto L_0x00fb
            if (r0 == 0) goto L_0x0107
            goto L_0x00fe
        L_0x00fb:
            if (r0 == 0) goto L_0x00fe
            goto L_0x0107
        L_0x00fe:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ 0O7 -> 0x012f }
            goto L_0x0109
        L_0x0101:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ 0O7 -> 0x012f }
            goto L_0x0109
        L_0x0104:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ 0O7 -> 0x012f }
            goto L_0x0109
        L_0x0107:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ 0O7 -> 0x012f }
        L_0x0109:
            java.lang.CharSequence r1 = r12.A0j     // Catch:{ 0O7 -> 0x012f }
            int r0 = (int) r4     // Catch:{ 0O7 -> 0x012f }
            X.0Wy r2 = new X.0Wy     // Catch:{ 0O7 -> 0x012f }
            r2.<init>(r7, r1, r0)     // Catch:{ 0O7 -> 0x012f }
            android.text.TextUtils$TruncateAt r0 = r12.A0h     // Catch:{ 0O7 -> 0x012f }
            r2.A05 = r0     // Catch:{ 0O7 -> 0x012f }
            r2.A07 = r6     // Catch:{ 0O7 -> 0x012f }
            r2.A04 = r3     // Catch:{ 0O7 -> 0x012f }
            r0 = 0
            r2.A06 = r0     // Catch:{ 0O7 -> 0x012f }
            r2.A03 = r5     // Catch:{ 0O7 -> 0x012f }
            float r1 = r12.A0P     // Catch:{ 0O7 -> 0x012f }
            float r0 = r12.A0Q     // Catch:{ 0O7 -> 0x012f }
            r2.A00 = r1     // Catch:{ 0O7 -> 0x012f }
            r2.A01 = r0     // Catch:{ 0O7 -> 0x012f }
            int r0 = r12.A0W     // Catch:{ 0O7 -> 0x012f }
            r2.A02 = r0     // Catch:{ 0O7 -> 0x012f }
            android.text.StaticLayout r0 = r2.A00()     // Catch:{ 0O7 -> 0x012f }
            goto L_0x013e
        L_0x012f:
            r2 = move-exception
            java.lang.Throwable r0 = r2.getCause()
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = "CollapsingTextHelper"
            android.util.Log.e(r0, r1, r2)
            r0 = 0
        L_0x013e:
            java.util.Objects.requireNonNull(r0)
            r12.A0g = r0
            java.lang.CharSequence r0 = r0.getText()
            r12.A0k = r0
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Z1.A03(float, boolean):void");
    }

    public static boolean A04(Typeface typeface, AnonymousClass0Z1 r3) {
        AnonymousClass0NL r1 = r3.A0y;
        if (r1 != null) {
            r1.A00 = true;
        }
        if (r3.A0u == typeface) {
            return false;
        }
        r3.A0u = typeface;
        Typeface A002 = C05540Qc.A00(AnonymousClass000.A0U(r3.A16.getContext()), typeface);
        r3.A0t = A002;
        if (A002 == null) {
            A002 = r3.A0u;
        }
        r3.A0e = A002;
        return true;
    }

    public static boolean A05(Typeface typeface, AnonymousClass0Z1 r3) {
        AnonymousClass0NL r1 = r3.A0z;
        if (r1 != null) {
            r1.A00 = true;
        }
        if (r3.A0x == typeface) {
            return false;
        }
        r3.A0x = typeface;
        Typeface A002 = C05540Qc.A00(AnonymousClass000.A0U(r3.A16.getContext()), typeface);
        r3.A0w = A002;
        if (A002 == null) {
            A002 = r3.A0x;
        }
        r3.A0f = A002;
        return true;
    }

    public static boolean A06(AnonymousClass0Z1 r2, CharSequence charSequence) {
        AnonymousClass048 r22;
        boolean A072 = AnonymousClass04F.A07(r2.A16);
        if (!r2.A0p) {
            return A072;
        }
        if (A072) {
            r22 = AnonymousClass047.A02;
        } else {
            r22 = AnonymousClass047.A01;
        }
        return r22.BN4(charSequence, 0, charSequence.length());
    }

    public float A07() {
        TextPaint textPaint = this.A15;
        textPaint.setTextSize(this.A07);
        textPaint.setTypeface(this.A0e);
        textPaint.setLetterSpacing(this.A02);
        return -textPaint.ascent();
    }

    public void A09(int i) {
        View view = this.A16;
        AnonymousClass0YF r4 = new AnonymousClass0YF(view.getContext(), i);
        ColorStateList colorStateList = r4.A01;
        if (colorStateList != null) {
            this.A0b = colorStateList;
        }
        float f = r4.A00;
        if (f != 0.0f) {
            this.A07 = f;
        }
        ColorStateList colorStateList2 = r4.A0A;
        if (colorStateList2 != null) {
            this.A0a = colorStateList2;
        }
        this.A03 = r4.A05;
        this.A04 = r4.A06;
        this.A05 = r4.A07;
        this.A02 = r4.A04;
        AnonymousClass0NL r1 = this.A0y;
        if (r1 != null) {
            r1.A00 = true;
        }
        C18270st r2 = new C18270st(this, 0);
        AnonymousClass0YF.A00(r4);
        this.A0y = new AnonymousClass0NL(r4.A02, r2);
        r4.A06(view.getContext(), this.A0y);
        A0F(false);
    }

    public void A0A(int i) {
        if (this.A0R != i) {
            this.A0R = i;
            A0F(false);
        }
    }

    public void A0B(int i) {
        View view = this.A16;
        AnonymousClass0YF r3 = new AnonymousClass0YF(view.getContext(), i);
        ColorStateList colorStateList = r3.A01;
        if (colorStateList != null) {
            this.A0d = colorStateList;
        }
        float f = r3.A00;
        if (f != 0.0f) {
            this.A0M = f;
        }
        ColorStateList colorStateList2 = r3.A0A;
        if (colorStateList2 != null) {
            this.A0c = colorStateList2;
        }
        this.A0I = r3.A05;
        this.A0J = r3.A06;
        this.A0K = r3.A07;
        this.A0H = r3.A04;
        AnonymousClass0NL r1 = this.A0z;
        if (r1 != null) {
            r1.A00 = true;
        }
        C18270st r2 = new C18270st(this, 1);
        AnonymousClass0YF.A00(r3);
        this.A0z = new AnonymousClass0NL(r3.A02, r2);
        r3.A06(view.getContext(), this.A0z);
        A0F(false);
    }

    public void A0C(int i) {
        if (this.A0V != i) {
            this.A0V = i;
            A0F(false);
        }
    }

    public void A0D(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.A0u;
            if (typeface != null) {
                this.A0t = C05540Qc.A00(configuration, typeface);
            }
            Typeface typeface2 = this.A0x;
            if (typeface2 != null) {
                this.A0w = C05540Qc.A00(configuration, typeface2);
            }
            Typeface typeface3 = this.A0t;
            if (typeface3 == null) {
                typeface3 = this.A0u;
            }
            this.A0e = typeface3;
            Typeface typeface4 = this.A0w;
            if (typeface4 == null) {
                typeface4 = this.A0x;
            }
            this.A0f = typeface4;
            A0F(true);
        }
    }

    public void A0E(Canvas canvas) {
        Canvas canvas2 = canvas;
        int save = canvas2.save();
        if (this.A0k != null) {
            RectF rectF = this.A13;
            if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                TextPaint textPaint = this.A14;
                textPaint.setTextSize(this.A0r);
                float f = this.A09;
                float f2 = this.A0A;
                float f3 = this.A0s;
                if (f3 != 1.0f && !this.A0n) {
                    canvas2.scale(f3, f3, f, f2);
                }
                if (this.A0X <= 1 || ((this.A0o && !this.A0n) || (this.A0n && this.A0G <= this.A0O))) {
                    canvas2.translate(f, f2);
                    this.A0g.draw(canvas2);
                } else {
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(this.A09 - ((float) this.A0g.getLineStart(0)), f2);
                    float f4 = (float) alpha;
                    textPaint.setAlpha((int) (this.A0L * f4));
                    if (Build.VERSION.SDK_INT >= 31) {
                        float f5 = this.A0D;
                        float f6 = this.A0B;
                        float f7 = this.A0C;
                        int i = this.A0T;
                        textPaint.setShadowLayer(f5, f6, f7, C018107s.A06(i, (Color.alpha(i) * textPaint.getAlpha()) / 255));
                    }
                    this.A0g.draw(canvas2);
                    textPaint.setAlpha((int) (this.A06 * f4));
                    if (Build.VERSION.SDK_INT >= 31) {
                        float f8 = this.A0D;
                        float f9 = this.A0B;
                        float f10 = this.A0C;
                        int i2 = this.A0T;
                        textPaint.setShadowLayer(f8, f9, f10, C018107s.A06(i2, (Color.alpha(i2) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = this.A0g.getLineBaseline(0);
                    CharSequence charSequence = this.A0l;
                    float f11 = (float) lineBaseline;
                    TextPaint textPaint2 = textPaint;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint2);
                    if (Build.VERSION.SDK_INT >= 31) {
                        textPaint.setShadowLayer(this.A0D, this.A0B, this.A0C, this.A0T);
                    }
                    if (!this.A0n) {
                        String trim = this.A0l.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        textPaint.setAlpha(alpha);
                        canvas2.drawText(trim, 0, Math.min(this.A0g.getLineEnd(0), trim.length()), 0.0f, f11, textPaint2);
                    }
                }
                canvas2.restoreToCount(save);
            }
        }
    }

    public void A0F(boolean z) {
        Rect rect;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i;
        Rect rect2;
        float f6;
        float f7;
        float descent;
        StaticLayout staticLayout;
        View view = this.A16;
        if ((view.getHeight() > 0 && view.getWidth() > 0) || z) {
            A03(1.0f, z);
            CharSequence charSequence = this.A0k;
            if (!(charSequence == null || (staticLayout = this.A0g) == null)) {
                this.A0l = TextUtils.ellipsize(charSequence, this.A14, (float) staticLayout.getWidth(), this.A0h);
            }
            CharSequence charSequence2 = this.A0l;
            float f8 = 0.0f;
            if (charSequence2 != null) {
                this.A08 = this.A14.measureText(charSequence2, 0, charSequence2.length());
            } else {
                this.A08 = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.A0R, this.A0o ? 1 : 0);
            int i2 = absoluteGravity & 112;
            if (i2 == 48) {
                rect = this.A11;
                f = (float) rect.top;
                this.A01 = f;
            } else if (i2 != 80) {
                TextPaint textPaint = this.A14;
                rect = this.A11;
                this.A01 = ((float) rect.centerY()) - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
            } else {
                rect = this.A11;
                f = ((float) rect.bottom) + this.A14.ascent();
                this.A01 = f;
            }
            int i3 = absoluteGravity & 8388615;
            if (i3 == 1) {
                f2 = (float) rect.centerX();
                f3 = this.A08 / 2.0f;
                f4 = f2 - f3;
            } else if (i3 != 5) {
                f4 = (float) rect.left;
            } else {
                f2 = (float) rect.right;
                f3 = this.A08;
                f4 = f2 - f3;
            }
            this.A00 = f4;
            A03(0.0f, z);
            StaticLayout staticLayout2 = this.A0g;
            if (staticLayout2 != null) {
                f5 = (float) staticLayout2.getHeight();
            } else {
                f5 = 0.0f;
            }
            StaticLayout staticLayout3 = this.A0g;
            if (staticLayout3 == null || this.A0X <= 1) {
                CharSequence charSequence3 = this.A0k;
                if (charSequence3 != null) {
                    f8 = this.A14.measureText(charSequence3, 0, charSequence3.length());
                }
            } else {
                f8 = (float) staticLayout3.getWidth();
            }
            StaticLayout staticLayout4 = this.A0g;
            if (staticLayout4 != null) {
                i = staticLayout4.getLineCount();
            } else {
                i = 0;
            }
            this.A0U = i;
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.A0V, this.A0o ? 1 : 0);
            int i4 = absoluteGravity2 & 112;
            if (i4 != 48) {
                if (i4 != 80) {
                    rect2 = this.A12;
                    descent = ((float) rect2.centerY()) - (f5 / 2.0f);
                } else {
                    rect2 = this.A12;
                    descent = (((float) rect2.bottom) - f5) + this.A14.descent();
                }
                this.A0F = descent;
            } else {
                rect2 = this.A12;
                this.A0F = (float) rect2.top;
            }
            int i5 = absoluteGravity2 & 8388615;
            if (i5 == 1) {
                f6 = (float) rect2.centerX();
                f8 /= 2.0f;
                f7 = f6 - f8;
            } else if (i5 != 5) {
                f7 = (float) rect2.left;
            } else {
                f6 = (float) rect2.right;
                f7 = f6 - f8;
            }
            this.A0E = f7;
            A03(this.A0G, false);
            C011504z.A05(view);
            A02();
        }
    }

    public final boolean A0G(int[] iArr) {
        ColorStateList colorStateList;
        this.A10 = iArr;
        ColorStateList colorStateList2 = this.A0b;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = this.A0d) == null || !colorStateList.isStateful())) {
            return false;
        }
        A0F(false);
        return true;
    }

    public AnonymousClass0Z1(View view) {
        this.A16 = view;
        TextPaint textPaint = new TextPaint(129);
        this.A14 = textPaint;
        this.A15 = new TextPaint(textPaint);
        this.A11 = AnonymousClass001.A06();
        this.A12 = AnonymousClass001.A06();
        this.A13 = new RectF();
        float f = this.A0N;
        this.A0O = f + ((1.0f - f) * 0.5f);
        A0D(AnonymousClass000.A0U(view.getContext()));
    }
}
