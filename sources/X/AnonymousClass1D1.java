package X;

import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import java.util.HashMap;

/* renamed from: X.1D1  reason: invalid class name */
public final class AnonymousClass1D1 {
    public final C21060yb A00;
    public final C19420v0 A01;
    public final C20810yC A02;
    public final AnonymousClass1Ax A03;
    public final AnonymousClass1D4 A04;
    public final C19890wg A05;

    public AnonymousClass1D1(C21060yb r2, C19420v0 r3, C20810yC r4, AnonymousClass1Ax r5, AnonymousClass1D4 r6, C19890wg r7) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r6, 3);
        AnonymousClass00C.A0D(r3, 4);
        AnonymousClass00C.A0D(r7, 5);
        AnonymousClass00C.A0D(r5, 6);
        this.A02 = r4;
        this.A00 = r2;
        this.A04 = r6;
        this.A01 = r3;
        this.A05 = r7;
        this.A03 = r5;
    }

    public final C1262263a A00(Integer num, int i, boolean z) {
        int A0J;
        Float A012;
        if (i != 1 && i != 23 && i != 37 && i != 42 && i != 57) {
            return null;
        }
        if (num != null && num.intValue() == 3) {
            C20810yC r2 = this.A02;
            int i2 = 2654;
            if (z) {
                i2 = 6032;
            }
            C21000yV r4 = C21000yV.A02;
            int A002 = C20800yB.A00(r4, r2, i2);
            int i3 = 2655;
            if (z) {
                i3 = 6029;
            }
            int A003 = C20800yB.A00(r4, r2, i3);
            if (500 <= A002 && A002 < 6001 && 20 <= A003 && A003 < 101) {
                if (z) {
                    if (C20800yB.A01(C21000yV.A01, r2, 6033)) {
                        return new C104815Bm(r2);
                    }
                } else if (C20800yB.A01(r4, r2, 2653)) {
                    return new C104845Bq(r2);
                }
            }
        }
        C20810yC r22 = this.A02;
        if (z) {
            return new C104825Bn(r22);
        }
        C104835Bp r3 = new C104835Bp(r22);
        C21000yV r42 = C21000yV.A02;
        if (!C20800yB.A01(r42, r22, 700)) {
            return r3;
        }
        int A004 = C20800yB.A00(r42, r22, 1574);
        int A005 = C20800yB.A00(r42, r22, 1575);
        if (500 > A004 || A004 >= 4001 || 20 > A005 || A005 >= 101) {
            return r3;
        }
        if (num != null) {
            A0J = num.intValue();
        } else {
            A0J = this.A01.A0J();
        }
        if (!C20800yB.A01(r42, r22, 702) || A0J == 0) {
            if (!C20800yB.A01(r42, r22, 701)) {
                return r3;
            }
            if (AnonymousClass1K2.A02(this.A00, this.A05) < 2013 || (A012 = this.A04.A01(0)) == null) {
                return r3;
            }
            float floatValue = A012.floatValue();
            if (floatValue <= 20.0f || floatValue < ((float) C20800yB.A00(r42, r22, 1573))) {
                return r3;
            }
        } else if (A0J != 1) {
            return r3;
        }
        return new AnonymousClass5Bo(r22);
    }

    public final HashMap A01(Rect rect, Uri uri, int[] iArr, boolean z, boolean z2) {
        boolean z3;
        int i;
        int i2;
        int i3;
        int A002 = AnonymousClass1GW.A00(uri, this.A00.A0O());
        if (z || !(A002 == 6 || A002 == 8)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (rect != null) {
            i = rect.width();
            i2 = rect.height();
        } else {
            BitmapFactory.Options A06 = this.A03.A06(uri, 0, true, true);
            if (z3) {
                i = A06.outHeight;
                i2 = A06.outWidth;
            } else {
                i = A06.outWidth;
                i2 = A06.outHeight;
            }
        }
        HashMap hashMap = new HashMap();
        for (int i4 : iArr) {
            boolean z4 = true;
            C1262263a A003 = A00(Integer.valueOf(i4), 1, z2);
            if (A003 != null) {
                int i5 = A003.A00;
                BitmapFactory.Options options = new BitmapFactory.Options();
                int i6 = 1;
                options.inSampleSize = 1;
                int max = Math.max(i, i2);
                while (true) {
                    max /= 2;
                    if (max <= (i5 * 8) / 10) {
                        break;
                    }
                    i6 *= 2;
                    options.inSampleSize = i6;
                }
                int min = Math.min(i5, Math.max(i / i6, i2 / i6));
                if (i <= i2) {
                    z4 = false;
                }
                if (z4) {
                    i3 = (int) (((float) min) / (((float) i) / (((float) i2) * 1.0f)));
                } else {
                    i3 = min;
                    min = (int) (((float) min) / (((float) i2) / (((float) i) * 1.0f)));
                }
                hashMap.put(Integer.valueOf(i4), new AnonymousClass3JE(min, i3));
            }
        }
        return hashMap;
    }

    public final boolean A02(C65013Qj r5, boolean z) {
        int max = Math.max(r5.A06, r5.A0A);
        C20810yC r2 = this.A02;
        int i = 3068;
        if (z) {
            i = 6031;
        }
        if (max >= C20800yB.A00(C21000yV.A02, r2, i)) {
            return true;
        }
        return false;
    }

    public final boolean A03(AnonymousClass3IX r5, boolean z) {
        int max = Math.max(r5.A00, r5.A01);
        C20810yC r2 = this.A02;
        int i = 3068;
        if (z) {
            i = 6031;
        }
        if (max >= C20800yB.A00(C21000yV.A02, r2, i)) {
            return true;
        }
        return false;
    }

    public final boolean A04(boolean z) {
        int A022 = AnonymousClass1K2.A02(this.A00, this.A05);
        C20810yC r3 = this.A02;
        C21000yV r2 = C21000yV.A02;
        if (A022 < C20800yB.A00(r2, r3, 4170)) {
            return false;
        }
        if (z) {
            return C20800yB.A01(C21000yV.A01, r3, 6033);
        }
        return C20800yB.A01(r2, r3, 2653);
    }
}
