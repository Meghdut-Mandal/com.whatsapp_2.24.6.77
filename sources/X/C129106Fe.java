package X;

import android.content.res.TypedArray;

/* renamed from: X.6Fe  reason: invalid class name and case insensitive filesystem */
public abstract class C129106Fe {
    public final C125045zE A00 = new C125045zE();

    public C129106Fe A00(TypedArray typedArray) {
        if (typedArray.hasValue(3)) {
            C125045zE r1 = this.A00;
            r1.A0H = typedArray.getBoolean(3, r1.A0H);
        }
        if (typedArray.hasValue(0)) {
            C125045zE r12 = this.A00;
            r12.A0G = typedArray.getBoolean(0, r12.A0G);
        }
        if (typedArray.hasValue(1)) {
            A02(typedArray.getFloat(1, 0.3f));
        }
        if (typedArray.hasValue(11)) {
            A04(typedArray.getFloat(11, 1.0f));
        }
        if (typedArray.hasValue(7)) {
            A06((long) typedArray.getInt(7, (int) this.A00.A0D));
        }
        if (typedArray.hasValue(14)) {
            C125045zE r13 = this.A00;
            r13.A0A = typedArray.getInt(14, r13.A0A);
        }
        if (typedArray.hasValue(15)) {
            A07((long) typedArray.getInt(15, (int) this.A00.A0E));
        }
        if (typedArray.hasValue(16)) {
            C125045zE r14 = this.A00;
            r14.A0B = typedArray.getInt(16, r14.A0B);
        }
        if (typedArray.hasValue(5)) {
            C125045zE r2 = this.A00;
            int i = typedArray.getInt(5, r2.A06);
            if (i != 1) {
                int i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        r2.A06 = 0;
                    }
                }
                r2.A06 = i2;
            } else {
                r2.A06 = 1;
            }
        }
        if (typedArray.hasValue(17)) {
            C125045zE r15 = this.A00;
            if (typedArray.getInt(17, r15.A0C) != 1) {
                r15.A0C = 0;
            } else {
                r15.A0C = 1;
            }
        }
        if (typedArray.hasValue(6)) {
            A03(typedArray.getFloat(6, this.A00.A00));
        }
        if (typedArray.hasValue(9)) {
            C125045zE r16 = this.A00;
            int dimensionPixelSize = typedArray.getDimensionPixelSize(9, r16.A08);
            if (dimensionPixelSize >= 0) {
                r16.A08 = dimensionPixelSize;
            } else {
                throw AnonymousClass000.A0d("Given invalid width: ", AnonymousClass000.A0u(), dimensionPixelSize);
            }
        }
        if (typedArray.hasValue(8)) {
            C125045zE r17 = this.A00;
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, r17.A07);
            if (dimensionPixelSize2 >= 0) {
                r17.A07 = dimensionPixelSize2;
            } else {
                throw AnonymousClass000.A0d("Given invalid height: ", AnonymousClass000.A0u(), dimensionPixelSize2);
            }
        }
        if (typedArray.hasValue(13)) {
            A05(typedArray.getFloat(13, this.A00.A02));
        }
        if (typedArray.hasValue(19)) {
            C125045zE r18 = this.A00;
            float f = typedArray.getFloat(19, r18.A04);
            if (f >= 0.0f) {
                r18.A04 = f;
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Given invalid width ratio: ");
                A0u.append(f);
                throw AnonymousClass000.A0b(A0u);
            }
        }
        if (typedArray.hasValue(10)) {
            C125045zE r19 = this.A00;
            float f2 = typedArray.getFloat(10, r19.A01);
            if (f2 >= 0.0f) {
                r19.A01 = f2;
            } else {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("Given invalid height ratio: ");
                A0u2.append(f2);
                throw AnonymousClass000.A0b(A0u2);
            }
        }
        if (typedArray.hasValue(18)) {
            C125045zE r110 = this.A00;
            r110.A03 = typedArray.getFloat(18, r110.A03);
        }
        return this;
    }

    public void A02(float f) {
        C125045zE r3 = this.A00;
        r3.A05 = (((int) (Math.min(1.0f, Math.max(0.0f, f)) * 255.0f)) << 24) | (r3.A05 & 16777215);
    }

    public void A03(float f) {
        if (f >= 0.0f) {
            this.A00.A00 = f;
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Given invalid dropoff value: ");
        A0u.append(f);
        throw AnonymousClass000.A0b(A0u);
    }

    public void A04(float f) {
        C125045zE r3 = this.A00;
        r3.A09 = (((int) (Math.min(1.0f, Math.max(0.0f, f)) * 255.0f)) << 24) | (r3.A09 & 16777215);
    }

    public void A05(float f) {
        if (f >= 0.0f) {
            this.A00.A02 = f;
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Given invalid intensity value: ");
        A0u.append(f);
        throw AnonymousClass000.A0b(A0u);
    }

    public C125045zE A01() {
        C125045zE r3 = this.A00;
        int i = r3.A0C;
        int[] iArr = r3.A0K;
        if (i != 1) {
            int i2 = r3.A05;
            iArr[0] = i2;
            int i3 = r3.A09;
            iArr[1] = i3;
            iArr[2] = i3;
            iArr[3] = i2;
        } else {
            int i4 = r3.A09;
            iArr[0] = i4;
            iArr[1] = i4;
            int i5 = r3.A05;
            iArr[2] = i5;
            iArr[3] = i5;
        }
        float[] fArr = r3.A0J;
        if (i != 1) {
            float f = r3.A02;
            float f2 = 1.0f - f;
            float f3 = r3.A00;
            fArr[0] = Math.max((f2 - f3) / 2.0f, 0.0f);
            fArr[1] = Math.max((f2 - 0.001f) / 2.0f, 0.0f);
            float f4 = f + 1.0f;
            fArr[2] = Math.min((f4 + 0.001f) / 2.0f, 1.0f);
            fArr[3] = Math.min((f4 + f3) / 2.0f, 1.0f);
            return r3;
        }
        fArr[0] = 0.0f;
        float f5 = r3.A02;
        fArr[1] = Math.min(f5, 1.0f);
        fArr[2] = Math.min(f5 + r3.A00, 1.0f);
        fArr[3] = 1.0f;
        return r3;
    }

    public void A06(long j) {
        if (j >= 0) {
            this.A00.A0D = j;
            return;
        }
        throw AnonymousClass001.A08(C36381kD.A0z("Given a negative duration: ", AnonymousClass000.A0u(), j));
    }

    public void A07(long j) {
        if (j >= 0) {
            this.A00.A0E = j;
            return;
        }
        throw AnonymousClass001.A08(C36381kD.A0z("Given a negative repeat delay: ", AnonymousClass000.A0u(), j));
    }
}
