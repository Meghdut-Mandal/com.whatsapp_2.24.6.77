package X;

import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Pair;
import android.view.View;
import java.util.Locale;

/* renamed from: X.3Qk  reason: invalid class name and case insensitive filesystem */
public abstract class C65023Qk {
    public C65013Qj A00;
    public final int A01;

    public static int A01(C65023Qk r2) {
        int i = r2.A01;
        int A03 = r2.A03();
        C18740tg.A0B(true);
        return Math.round((((float) i) * ((float) A03)) / 100.0f);
    }

    public int A03() {
        C61753Dh r0;
        if (this instanceof AnonymousClass2KQ) {
            return 72;
        }
        if (!(this instanceof AnonymousClass2KZ)) {
            return 100;
        }
        AnonymousClass2KZ r2 = (AnonymousClass2KZ) this;
        if (r2.A08()) {
            r0 = r2.A01;
        } else {
            r0 = r2.A00;
        }
        return r0.A02;
    }

    public RectF A04(int i, int i2) {
        C65013Qj r1;
        float f;
        float f2;
        if (this instanceof AnonymousClass2KQ) {
            throw new UnsupportedOperationException();
        } else if (this instanceof AnonymousClass2KZ) {
            AnonymousClass2KZ r9 = (AnonymousClass2KZ) this;
            if (r9 instanceof AnonymousClass2KY) {
                throw new UnsupportedOperationException();
            } else if (r9 instanceof AnonymousClass2KU) {
                throw new UnsupportedOperationException();
            } else if (r9 instanceof AnonymousClass2KT) {
                throw new UnsupportedOperationException();
            } else if (r9 instanceof AnonymousClass2KW) {
                throw new UnsupportedOperationException();
            } else {
                C65013Qj r12 = r9.A00;
                if (r12 == null || i2 <= 0 || i <= 0) {
                    return null;
                }
                float f3 = (float) r12.A0A;
                float f4 = (float) r12.A06;
                PointF pointF = new PointF(f3 / 2.0f, f4 / 2.0f);
                float f5 = (float) i;
                float f6 = (float) i2;
                PointF pointF2 = new PointF(f5 / 2.0f, f6 / 2.0f);
                if (r9.A08()) {
                    int i3 = r9.A00.A03;
                    if (i3 > 0) {
                        f2 = (float) i3;
                    } else {
                        f2 = f4 / 3.0f;
                    }
                    pointF.y = f2;
                    pointF2.y = f6 / 3.0f;
                }
                float f7 = f3 / f5;
                float f8 = f6 * f7;
                float f9 = f3 / f4;
                if (f9 > 4.0f / 1.0f) {
                    f7 = f4 / f6;
                    f = f5 * f7;
                    f8 = f4;
                } else {
                    f = f3;
                }
                PointF pointF3 = new PointF(pointF2.x * f7, pointF2.y * f7);
                RectF A0N = C36441kJ.A0N();
                float f10 = pointF.x - pointF3.x;
                A0N.left = f10;
                float f11 = pointF.y - pointF3.y;
                A0N.top = f11;
                A0N.right = f10 + f;
                float f12 = f11 + f8;
                A0N.bottom = f12;
                if (f11 < 0.0f) {
                    A0N.top = 0.0f;
                    A0N.bottom = f8;
                    f12 = f8;
                }
                if (f12 > f4) {
                    A0N.bottom = f4;
                    A0N.top = f4 - f8;
                }
                Locale locale = Locale.US;
                Object[] objArr = new Object[12];
                AnonymousClass000.A1I(objArr, f3, 0);
                AnonymousClass000.A1I(objArr, f4, 1);
                AnonymousClass000.A1I(objArr, f9, 2);
                C65013Qj r92 = r9.A00;
                AnonymousClass000.A1L(objArr, r92.A02, 3);
                AnonymousClass000.A1L(objArr, r92.A03, 4);
                AnonymousClass000.A1L(objArr, i, 5);
                AnonymousClass000.A1L(objArr, i2, 6);
                AnonymousClass000.A1I(objArr, f5 / f6, 7);
                AnonymousClass000.A1I(objArr, f, 8);
                AnonymousClass000.A1I(objArr, f8, 9);
                AnonymousClass000.A1I(objArr, f / f8, 10);
                objArr[11] = A0N.toString();
                String.format(locale, "ConversationRowSingleImagePreviewCalculator/getSourceRect bitmap=%f,%f(%f) face=%d,%d preview=%d,%d(%f) scaled=%f,%f(%f) rect=%s", objArr);
                return A0N;
            }
        } else if (!(this instanceof AnonymousClass2KS) || (r1 = this.A00) == null) {
            return null;
        } else {
            int i4 = r1.A0A;
            int i5 = r1.A06;
            int i6 = i4 * i2;
            float f13 = (float) i;
            float f14 = (float) i4;
            float f15 = f14;
            if (i6 > i5 * i) {
                f13 = (float) i2;
                f14 = (float) i5;
            }
            return new RectF(0.0f, 0.0f, f15, ((float) i2) / (f13 / f14));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007a, code lost:
        if (r6 == null) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A05(int r10, int r11) {
        /*
            r9 = this;
            boolean r0 = r9 instanceof X.AnonymousClass2KQ
            if (r0 == 0) goto L_0x000d
            int r0 = A01(r9)
            android.util.Pair r0 = r9.A06(r10, r11, r0)
            return r0
        L_0x000d:
            boolean r0 = r9 instanceof X.AnonymousClass2KZ
            if (r0 == 0) goto L_0x00df
            r4 = r9
            X.2KZ r4 = (X.AnonymousClass2KZ) r4
            boolean r0 = r4.A08()
            if (r0 == 0) goto L_0x00db
            X.3Dh r6 = r4.A01
        L_0x001c:
            int r0 = r4.A01
            float r3 = (float) r0
            int r0 = r6.A02
            float r0 = (float) r0
            float r1 = r3 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            java.lang.Float r8 = X.AnonymousClass2KZ.A00(r1, r10)
            if (r8 == 0) goto L_0x007c
            float r7 = r8.floatValue()
            X.3Qj r2 = r4.A00
            int r0 = r2.A06
            float r1 = (float) r0
            float r1 = r1 * r7
            int r0 = r2.A0A
            float r0 = (float) r0
            float r1 = r1 / r0
            java.lang.Float r5 = X.AnonymousClass2KZ.A00(r1, r11)
            if (r5 == 0) goto L_0x007c
            X.3Qj r1 = r4.A00
            int r0 = r1.A0A
            float r2 = (float) r0
            float r7 = r7 / r2
            float r5 = r5.floatValue()
            int r0 = r1.A06
            float r0 = (float) r0
            float r1 = r5 / r0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0059
            float r2 = r2 * r1
            java.lang.Float r8 = java.lang.Float.valueOf(r2)
        L_0x0059:
            float r2 = r8.floatValue()
            float r0 = r6.A00
            float r1 = r2 * r0
            float r0 = r6.A01
            float r1 = r1 / r0
            boolean r0 = r4.A08()
            if (r0 == 0) goto L_0x00d6
            float r0 = java.lang.Math.min(r5, r1)
        L_0x006e:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            float r0 = r0.floatValue()
            android.util.Pair r6 = A02(r2, r0)
            if (r6 != 0) goto L_0x0090
        L_0x007c:
            X.3Dh r0 = r4.A00
            int r0 = r0.A02
            float r0 = (float) r0
            float r3 = r3 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r3 * r0
            r0 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 / r0
            android.util.Pair r6 = A02(r3, r1)
        L_0x0090:
            java.util.Locale r7 = java.util.Locale.US
            r0 = 8
            java.lang.Object[] r5 = new java.lang.Object[r0]
            r0 = 0
            X.3Qj r4 = r4.A00
            int r3 = r4.A0A
            X.AnonymousClass000.A1L(r5, r3, r0)
            r1 = 1
            int r0 = r4.A06
            X.AnonymousClass000.A1L(r5, r0, r1)
            r2 = 2
            float r1 = (float) r3
            float r0 = (float) r0
            float r1 = r1 / r0
            X.AnonymousClass000.A1I(r5, r1, r2)
            r1 = 3
            int r0 = r4.A02
            X.AnonymousClass000.A1L(r5, r0, r1)
            r1 = 4
            int r0 = r4.A03
            X.AnonymousClass000.A1L(r5, r0, r1)
            r0 = 5
            java.lang.Object r1 = r6.first
            r5[r0] = r1
            r0 = 6
            java.lang.Object r3 = r6.second
            r5[r0] = r3
            r2 = 7
            int r0 = X.AnonymousClass000.A0I(r1)
            float r1 = (float) r0
            int r0 = X.AnonymousClass000.A0I(r3)
            float r0 = (float) r0
            float r1 = r1 / r0
            X.AnonymousClass000.A1I(r5, r1, r2)
            java.lang.String r0 = "ConversationRowSingleImagePreviewCalculator/getPreviewDimension bitmap=%d,%d(%f) face=%d,%d preview=%d,%d(%f)"
            java.lang.String.format(r7, r0, r5)
            return r6
        L_0x00d6:
            float r0 = java.lang.Math.max(r5, r1)
            goto L_0x006e
        L_0x00db:
            X.3Dh r6 = r4.A00
            goto L_0x001c
        L_0x00df:
            boolean r0 = r9 instanceof X.AnonymousClass2KS
            if (r0 == 0) goto L_0x00f2
            int r0 = android.view.View.MeasureSpec.getSize(r10)
            float r1 = (float) r0
            int r0 = android.view.View.MeasureSpec.getSize(r11)
            float r0 = (float) r0
            android.util.Pair r0 = A02(r1, r0)
            return r0
        L_0x00f2:
            r1 = r9
            X.2KR r1 = (X.AnonymousClass2KR) r1
            int r4 = r1.A00
            if (r4 > 0) goto L_0x0102
            int r0 = android.view.View.MeasureSpec.getSize(r10)
            android.util.Pair r0 = r1.A06(r10, r11, r0)
            return r0
        L_0x0102:
            X.3Qj r1 = r1.A00
            int r0 = r1.A0A
            float r3 = (float) r0
            int r0 = r1.A06
            float r1 = (float) r0
            int r0 = android.view.View.MeasureSpec.getSize(r10)
            float r2 = (float) r0
            int r0 = r4 * 2
            float r0 = (float) r0
            float r1 = r1 * r2
            float r1 = r1 / r3
            float r1 = java.lang.Math.min(r0, r1)
            int r0 = android.view.View.MeasureSpec.getMode(r11)
            if (r0 == 0) goto L_0x0127
            int r0 = android.view.View.MeasureSpec.getSize(r11)
            float r0 = (float) r0
            float r1 = java.lang.Math.min(r0, r1)
        L_0x0127:
            android.util.Pair r0 = A02(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65023Qk.A05(int, int):android.util.Pair");
    }

    public final Pair A06(int i, int i2, int i3) {
        C65013Qj r1 = this.A00;
        C18740tg.A07(r1, "setMediaData() must be called prior.");
        float f = (float) r1.A0A;
        float f2 = (float) r1.A06;
        float f3 = (float) i3;
        if (View.MeasureSpec.getMode(i) != 0) {
            f3 = Math.min((float) View.MeasureSpec.getSize(i), f3);
        }
        float f4 = (f2 * f3) / f;
        if (View.MeasureSpec.getMode(i2) != 0) {
            f4 = Math.min((float) View.MeasureSpec.getSize(i2), f4);
        }
        return A02(f3, f4);
    }

    public void A07(int i, int i2) {
        C65013Qj r0 = new C65013Qj();
        r0.A0A = i;
        r0.A06 = i2;
        this.A00 = r0;
    }

    public boolean A08() {
        boolean z = this instanceof AnonymousClass2KY;
        C65013Qj r3 = this.A00;
        C18740tg.A0C(AnonymousClass000.A1V(r3));
        int i = r3.A06;
        int i2 = r3.A0A;
        if (z) {
            if (i >= i2) {
                return true;
            }
            return false;
        } else if (i > i2) {
            return true;
        } else {
            return false;
        }
    }

    public C65023Qk(int i) {
        this.A01 = i;
    }

    public static Pair A02(float f, float f2) {
        return Pair.create(Integer.valueOf(Math.round(f)), Integer.valueOf(Math.round(f2)));
    }
}
