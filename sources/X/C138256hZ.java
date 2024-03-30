package X;

import java.util.Arrays;

/* renamed from: X.6hZ  reason: invalid class name and case insensitive filesystem */
public final class C138256hZ implements C158897iQ {
    public final float[] A00;
    public final float[] A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C138256hZ)) {
                return false;
            }
            C138256hZ r4 = (C138256hZ) obj;
            if (!Arrays.equals(this.A00, r4.A00) || !Arrays.equals(this.A01, r4.A01)) {
                return false;
            }
        }
        return true;
    }

    public float B3e(float f) {
        return A00(this.A01, this.A00, f);
    }

    public float B3f(float f) {
        return A00(this.A00, this.A01, f);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.A00) * 31) + Arrays.hashCode(this.A01);
    }

    public C138256hZ(float[] fArr, float[] fArr2) {
        if (fArr.length == fArr2.length) {
            this.A00 = fArr;
            this.A01 = fArr2;
            return;
        }
        throw AnonymousClass001.A08("Array lengths must match and be nonzero");
    }

    public static final float A00(float[] fArr, float[] fArr2, float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float max;
        float abs = Math.abs(f);
        float signum = Math.signum(f);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            max = fArr2[binarySearch];
        } else {
            int i = (-(binarySearch + 1)) - 1;
            int length = fArr.length - 1;
            if (i >= length) {
                float f7 = fArr[length];
                float f8 = fArr2[length];
                if (f7 == 0.0f) {
                    return 0.0f;
                }
                return f * (f8 / f7);
            }
            if (i == -1) {
                f3 = fArr[0];
                f5 = fArr2[0];
                f4 = 0.0f;
                f2 = 0.0f;
            } else {
                f2 = fArr[i];
                int i2 = i + 1;
                f3 = fArr[i2];
                f4 = fArr2[i];
                f5 = fArr2[i2];
            }
            if (f2 == f3) {
                f6 = 0.0f;
            } else {
                f6 = (abs - f2) / (f3 - f2);
            }
            max = f4 + ((f5 - f4) * Math.max(0.0f, Math.min(1.0f, f6)));
        }
        return signum * max;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.A00);
        AnonymousClass00C.A08(arrays);
        A0u.append(arrays);
        A0u.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.A01);
        AnonymousClass00C.A08(arrays2);
        A0u.append(arrays2);
        return AnonymousClass000.A0s(A0u);
    }
}
