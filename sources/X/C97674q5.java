package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.Objects;

/* renamed from: X.4q5  reason: invalid class name and case insensitive filesystem */
public class C97674q5 extends C139206jP implements Comparable {
    public int A00 = 3;
    public Bitmap A01;
    public C144426sA A02;
    public C91204bd A03;
    public boolean A04 = true;
    public final int A05;
    public final Context A06;
    public final Bitmap A07;
    public final Bitmap A08;
    public final Rect A09 = AnonymousClass001.A06();
    public final RectF A0A = C36441kJ.A0N();
    public final C1255860l A0B;
    public final C91194bc A0C;
    public final C123195w6 A0D;

    public static void A00(C97674q5 r7) {
        C123195w6 r6 = r7.A0D;
        String str = r7.A02.A0B.A09.A03;
        int A012 = C65103Qt.A01(r7.A06, 24.0f);
        C164787sN r3 = new C164787sN(r7, 1);
        AnonymousClass00C.A0D(str, 0);
        r6.A00.A01(new C142876pc(r3, str, A012, A012), false);
    }

    public static void A01(C97674q5 r7) {
        String str;
        C144416s9 r0 = r7.A02.A0B.A03;
        if (r0 != null && (str = r0.A0G) != null) {
            C123195w6 r5 = r7.A0D;
            int A012 = C65103Qt.A01(r7.A06, 30.0f);
            r5.A00.A01(new C142876pc(new C164787sN(r7, 0), str, A012, A012), false);
        }
    }

    public void A06(Canvas canvas) {
        Rect rect;
        int round;
        int round2;
        int round3;
        float f;
        AnonymousClass6WY r11 = this.A08;
        double d = this.A00;
        double d2 = this.A01;
        float[] fArr = this.A0A;
        r11.A09(fArr, d, d2);
        float f2 = fArr[0];
        float f3 = fArr[1];
        if (this.A02.A09) {
            C91204bd r0 = this.A03;
            float f4 = r0.A02;
            float f5 = r0.A03;
            rect = this.A09;
            float f6 = f5 / 2.0f;
            round = Math.round(f2 - f6);
            float f7 = f3 - f4;
            float f8 = f4 * 0.151767f;
            round2 = Math.round(f7 + f8);
            round3 = Math.round(f2 + f6);
            f = f3 + f8;
        } else {
            C91194bc r6 = this.A0C;
            float A002 = r6.A00();
            float max = Math.max(r6.A07, r6.A03);
            float f9 = r6.A05 / 2.0f;
            float f10 = f2 + f9;
            if (this.A00 == 1 && r6.A0I) {
                f10 += max;
            }
            rect = this.A09;
            round = Math.round(f2 - f9);
            float f11 = A002 / 2.0f;
            round2 = Math.round(f3 - f11);
            round3 = Math.round(f10);
            f = f3 + f11;
        }
        rect.set(round, round2, round3, Math.round(f));
        r11.A09(fArr, this.A00, this.A01);
        float f12 = (float) rect.left;
        float f13 = (float) rect.top;
        float width = (float) rect.width();
        float height = (float) rect.height();
        if (this.A02.A09) {
            float f14 = 0.146396f * width;
            this.A0A.set(f12 + f14, (0.12474f * height) + f13, (f12 + width) - f14, (f13 + height) - (0.151767f * height));
        } else {
            C91194bc r2 = this.A0C;
            if (r2.A09 == 2) {
                float A012 = C90524aI.A01(this.A06, 20.0f);
                float A003 = r2.A00();
                float f15 = r2.A05;
                float f16 = (A012 / 2.0f) - (f15 / 2.0f);
                float f17 = 0.0f;
                if (f15 == A003) {
                    f17 = f16;
                }
                float f18 = f12 - f16;
                this.A0A.set(f18, f13 - f17, A012 + f18, f13 + f17 + height);
            } else if (r2.A0A == 2) {
                RectF rectF = this.A0A;
                float f19 = (float) this.A05;
                rectF.set(f12 - f19, f13 - f19, f12 + width + f19, f13 + height + f19);
            } else {
                float f20 = r2.A05;
                RectF rectF2 = this.A0A;
                float f21 = f12 + f20;
                float f22 = (float) this.A05;
                rectF2.set((f21 - width) - f22, f13 - f22, f21 + f22, f13 + height + f22);
            }
        }
        Canvas canvas2 = canvas;
        canvas2.save();
        canvas2.translate(f12, f13);
        if (this.A02.A09) {
            C91204bd r4 = this.A03;
            r4.draw(canvas2);
            if (this.A04) {
                r4.A04 = 200;
                Context context = r4.A0A;
                r4.A01 = C90524aI.A01(context, 22.0f);
                r4.A00 = C90524aI.A01(context, 120.0f);
                r4.A05 = System.currentTimeMillis();
                r4.A00();
                this.A04 = false;
            }
        } else {
            this.A0C.draw(canvas2);
        }
        canvas2.restore();
    }

    public void A07() {
        C144416s9 r0 = this.A02.A0B.A03;
        if (r0 != null) {
            C91194bc r3 = this.A0C;
            String str = r0.A0I;
            r3.A0G = str;
            float[] A0v = C90524aI.A0v();
            Rect A062 = AnonymousClass001.A06();
            r3.A0R.getTextBounds(str, 0, str.length(), A062);
            float f = r3.A0M;
            A0v[0] = Math.min((float) A062.width(), f);
            float height = (float) A062.height();
            A0v[1] = height;
            float f2 = A0v[0];
            r3.A03 = f2;
            r3.A02 = height;
            if (f2 >= f) {
                r3.A0G = TextUtils.ellipsize(str, r3.A0W, f, TextUtils.TruncateAt.END).toString();
                r3.A03 = f;
            }
            String str2 = this.A02.A0B.A09.A01;
            r3.A0H = str2;
            float[] A0v2 = C90524aI.A0v();
            Rect A063 = AnonymousClass001.A06();
            r3.A0V.getTextBounds(str2, 0, str2.length(), A063);
            A0v2[0] = Math.min((float) A063.width(), f);
            float height2 = (float) A063.height();
            A0v2[1] = height2;
            float f3 = A0v2[0];
            r3.A07 = f3;
            r3.A06 = height2;
            if (f3 >= f) {
                r3.A0H = TextUtils.ellipsize(str2, r3.A0X, f, TextUtils.TruncateAt.END).toString();
                r3.A07 = f;
            }
        }
    }

    public void A08() {
        int i = 0;
        this.A02.A09 = false;
        C91204bd r2 = this.A03;
        float A012 = C90524aI.A01(r2.A0A, 22.0f);
        r2.A06 = null;
        r2.A03 = A012;
        r2.A02 = A012 + (0.083333f * A012);
        r2.A00();
        if (this.A00 != 2) {
            i = 1;
        }
        float f = (float) i;
        if (this.A02.A09) {
            f = 2.0f;
        }
        C139266jV r0 = this.A07;
        r0.A0C(this);
        this.A02 = f;
        r0.A0B(this);
        A03();
    }

    public void A09(int i) {
        Context context;
        float f;
        this.A00 = i;
        C91194bc r6 = this.A0C;
        if (r6.A09 == 2 && i == 1) {
            r6.A0D = 200;
            Context context2 = r6.A0Q;
            r6.A01 = C90524aI.A01(context2, 6.0f);
            r6.A00 = C90524aI.A01(context2, 20.0f);
            float f2 = r6.A01;
            r6.A05 = f2;
            r6.A04 = f2;
            r6.A0B = System.currentTimeMillis();
            r6.A0C = -1;
            r6.A01();
        }
        if (r6.A09 == 1 && i == 2) {
            r6.A0D = 200;
            Context context3 = r6.A0Q;
            r6.A01 = C90524aI.A01(context3, 20.0f);
            r6.A00 = C90524aI.A01(context3, 6.0f);
            float f3 = r6.A01;
            r6.A05 = f3;
            r6.A04 = f3;
            r6.A0C = System.currentTimeMillis();
            r6.A0B = -1;
            r6.A01();
        }
        r6.A09 = i;
        if (r6.A0B == -1 && r6.A0C == -1) {
            if (i == 2) {
                context = r6.A0Q;
                f = 6.0f;
            } else if (i == 1) {
                context = r6.A0Q;
                f = 20.0f;
            }
            float A012 = C90524aI.A01(context, f);
            r6.A05 = A012;
            r6.A04 = A012;
            r6.A01();
        }
        int i2 = 1;
        if (this.A00 == 2) {
            i2 = 0;
        }
        float f4 = (float) i2;
        if (this.A02.A09) {
            f4 = 2.0f;
        }
        C139266jV r0 = this.A07;
        r0.A0C(this);
        this.A02 = f4;
        r0.A0B(this);
        A03();
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A02.A0B.A0A.compareTo(((C97674q5) obj).A02.A0B.A0A);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A02.equals(((C97674q5) obj).A02);
    }

    public C97674q5(Bitmap bitmap, Bitmap bitmap2, C139266jV r7, C1255860l r8, C123195w6 r9, C144426sA r10, C91204bd r11) {
        super(r7);
        int i;
        Context context = r7.A0O;
        this.A06 = context;
        this.A02 = r10;
        this.A0B = r8;
        this.A07 = bitmap2;
        this.A0D = r9;
        this.A08 = bitmap;
        this.A03 = r11;
        this.A05 = C65103Qt.A01(context, 2.0f);
        C144406s8 r3 = this.A02.A0B;
        this.A00 = AnonymousClass6WY.A01(r3.A07);
        this.A01 = AnonymousClass6WY.A00(r3.A06);
        C91194bc r1 = new C91194bc(context);
        this.A0C = r1;
        A07();
        A00(this);
        String str = r10.A0B.A09.A02;
        if (str != null) {
            i = Color.parseColor(str);
        } else {
            i = -7829368;
        }
        r1.A08 = i;
    }

    public int hashCode() {
        Object[] A0L = AnonymousClass001.A0L();
        A0L[0] = this.A02;
        return Objects.hash(A0L);
    }
}
