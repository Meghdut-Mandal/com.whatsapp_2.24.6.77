package X;

import java.util.Locale;

/* renamed from: X.3Dh  reason: invalid class name and case insensitive filesystem */
public class C61753Dh {
    public final float A00;
    public final float A01;
    public final int A02;

    public String toString() {
        float f;
        Locale locale = Locale.US;
        Object[] objArr = new Object[4];
        float f2 = this.A01;
        objArr[0] = Float.valueOf(f2);
        float f3 = this.A00;
        objArr[1] = Float.valueOf(f3);
        if (f3 != 0.0f) {
            f = f2 / f3;
        } else {
            f = -1.0f;
        }
        objArr[2] = Float.valueOf(f);
        AnonymousClass000.A1L(objArr, this.A02, 3);
        return String.format(locale, "aspectWidth=%f aspectHeight=%f aspectRatio=%f rowWidthType=%d", objArr);
    }

    public C61753Dh(int i, float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
        this.A02 = i;
    }
}
