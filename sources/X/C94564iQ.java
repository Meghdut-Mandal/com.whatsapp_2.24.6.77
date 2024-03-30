package X;

import java.util.Arrays;

/* renamed from: X.4iQ  reason: invalid class name and case insensitive filesystem */
public final class C94564iQ extends AnonymousClass6FX {
    public static final C157667du A0E = C137476gC.A00;
    public final float A00;
    public final float A01;
    public final C157667du A02;
    public final C157667du A03;
    public final C157667du A04;
    public final C157667du A05;
    public final C128406Cd A06;
    public final AnonymousClass6EN A07;
    public final C006302t A08;
    public final C006302t A09;
    public final boolean A0A;
    public final float[] A0B;
    public final float[] A0C;
    public final float[] A0D;

    public static final float A00(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float A002 = ((((C90514aH.A00(f, f4, f2, f5) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        if (A002 < 0.0f) {
            return -A002;
        }
        return A002;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            C94564iQ r5 = (C94564iQ) obj;
            if (Float.compare(r5.A01, this.A01) != 0 || Float.compare(r5.A00, this.A00) != 0 || !AnonymousClass00C.A0J(this.A07, r5.A07) || !Arrays.equals(this.A0C, r5.A0C)) {
                return false;
            }
            C128406Cd r1 = this.A06;
            C128406Cd r0 = r5.A06;
            if (r1 != null) {
                return r1.equals(r0);
            }
            if (r0 != null) {
                if (AnonymousClass00C.A0J(this.A05, r5.A05)) {
                    return AnonymousClass00C.A0J(this.A03, r5.A03);
                }
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int floatToIntBits;
        int floatToIntBits2;
        int A052 = (C36351kA.A05(this.A07, super.hashCode() * 31) + Arrays.hashCode(this.A0C)) * 31;
        float f = this.A01;
        int i = 0;
        if (f == 0.0f) {
            floatToIntBits = 0;
        } else {
            floatToIntBits = Float.floatToIntBits(f);
        }
        int i2 = (A052 + floatToIntBits) * 31;
        float f2 = this.A00;
        if (f2 == 0.0f) {
            floatToIntBits2 = 0;
        } else {
            floatToIntBits2 = Float.floatToIntBits(f2);
        }
        int i3 = (i2 + floatToIntBits2) * 31;
        C128406Cd r0 = this.A06;
        if (r0 != null) {
            i = r0.hashCode();
        }
        int i4 = i3 + i;
        if (r0 != null) {
            return i4;
        }
        return C36401kF.A02(this.A03, C36351kA.A05(this.A05, i4 * 31));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94564iQ(C157667du r30, C157667du r31, C128406Cd r32, AnonymousClass6EN r33, String str, float[] fArr, float[] fArr2, float f, float f2, int i) {
        super(str, AnonymousClass6J1.A01, i);
        boolean z;
        float[] fArr3 = fArr2;
        AnonymousClass6EN r10 = r33;
        this.A07 = r10;
        float f3 = f;
        this.A01 = f3;
        float f4 = f2;
        this.A00 = f4;
        this.A06 = r32;
        C157667du r8 = r30;
        this.A05 = r8;
        this.A09 = new AnonymousClass7RK(this);
        this.A04 = new C163967r3(this, 0);
        C157667du r7 = r31;
        this.A03 = r7;
        this.A08 = new AnonymousClass7RJ(this);
        this.A02 = new C163967r3(this, 1);
        float[] fArr4 = fArr;
        int length = fArr4.length;
        if (length != 6 && length != 9) {
            throw AnonymousClass001.A08("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        } else if (f < f2) {
            float[] fArr5 = new float[6];
            if (length == 9) {
                float f5 = fArr[0];
                float f6 = f5 + fArr[1] + fArr[2];
                fArr5[0] = f5 / f6;
                fArr5[1] = fArr[1] / f6;
                float f7 = fArr[3];
                float f8 = f7 + fArr[4] + fArr[5];
                fArr5[2] = f7 / f8;
                fArr5[3] = fArr[4] / f8;
                float f9 = fArr[6];
                float f10 = f9 + fArr[7] + fArr[8];
                fArr5[4] = f9 / f10;
                fArr5[5] = fArr[7] / f10;
            } else {
                System.arraycopy(fArr4, 0, fArr5, 0, 6);
            }
            this.A0C = fArr5;
            if (fArr2 == null) {
                float f11 = fArr5[0];
                float f12 = fArr5[1];
                float f13 = fArr5[2];
                float f14 = fArr5[3];
                float f15 = fArr5[4];
                float f16 = fArr5[5];
                float f17 = r10.A00;
                float f18 = r10.A01;
                float f19 = (float) 1;
                float f20 = (f19 - f11) / f12;
                float f21 = f11 / f12;
                float f22 = (f13 / f14) - f21;
                float f23 = (f17 / f18) - f21;
                float f24 = ((f19 - f13) / f14) - f20;
                float f25 = (f15 / f16) - f21;
                float f26 = (((((f19 - f17) / f18) - f20) * f22) - (f23 * f24)) / (((((f19 - f15) / f16) - f20) * f22) - (f24 * f25));
                float f27 = (f23 - (f25 * f26)) / f22;
                float f28 = (1.0f - f27) - f26;
                float f29 = f28 / f12;
                float f30 = f27 / f14;
                float f31 = f26 / f16;
                fArr3 = new float[9];
                fArr3[0] = f29 * f11;
                fArr3[1] = f28;
                fArr3[2] = f29 * ((1.0f - f11) - f12);
                fArr3[3] = f30 * f13;
                fArr3[4] = f27;
                fArr3[5] = f30 * ((1.0f - f13) - f14);
                C90494aF.A1P(fArr3, f31 * f15, f26);
                fArr3[8] = f31 * ((1.0f - f15) - f16);
            } else {
                int length2 = fArr3.length;
                if (length2 != 9) {
                    throw AnonymousClass000.A0d("Transform must have 9 entries! Has ", AnonymousClass000.A0u(), length2);
                }
            }
            this.A0D = fArr3;
            this.A0B = AnonymousClass6VY.A03(fArr3);
            if (A00(fArr5) / A00(C114185go.A0I) > 0.9f) {
                float[] fArr6 = C114185go.A0J;
                float[] fArr7 = {fArr5[0] - fArr6[0], fArr5[1] - fArr6[1], fArr5[2] - fArr6[2], fArr5[3] - fArr6[3], fArr5[4] - fArr6[4], fArr5[5] - fArr6[5]};
                float f32 = fArr7[0];
                float f33 = fArr7[1];
                float f34 = fArr6[0];
                float f35 = fArr6[4];
                float f36 = fArr6[1];
                float f37 = fArr6[5];
                if (C90514aH.A01(f32, f36 - f37, f33, f34 - f35) >= 0.0f) {
                    float f38 = fArr6[2];
                    float f39 = fArr6[3];
                    if (C90514aH.A01(f34 - f38, f33, f36 - f39, f32) >= 0.0f) {
                        float f40 = fArr7[2];
                        float f41 = fArr7[3];
                        if (C90514aH.A01(f40, f39 - f36, f41, f38 - f34) >= 0.0f) {
                            C90514aH.A01(f38 - f35, f41, f39 - f37, f40);
                        }
                    }
                }
            }
            if (i != 0) {
                float[] fArr8 = C114185go.A0J;
                int i2 = 0;
                while (true) {
                    if (Float.compare(fArr5[i2], fArr8[i2]) != 0 && C90494aF.A01(fArr5[i2], fArr8[i2]) > 0.001f) {
                        break;
                    }
                    i2++;
                    if (i2 >= 6) {
                        if (AnonymousClass6VY.A02(r10, C114055gZ.A03) && f == 0.0f && f2 == 1.0f) {
                            C94564iQ r9 = C114185go.A0G;
                            double d = 0.0d;
                            while (true) {
                                if (C90504aG.A00(r8.BKs(d), r9.A05.BKs(d)) > 0.001d) {
                                    break;
                                }
                                if (C90504aG.A00(r7.BKs(d), r9.A03.BKs(d)) > 0.001d) {
                                    break;
                                }
                                d += 0.00392156862745098d;
                                if (d > 1.0d) {
                                    break;
                                }
                            }
                        }
                    }
                }
                z = false;
            } else {
                z = true;
            }
            this.A0A = z;
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Invalid range: min=");
            A0u.append(f3);
            A0u.append(", max=");
            A0u.append(f4);
            throw AnonymousClass000.A0c("; min must be strictly < max", A0u);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C94564iQ(X.AnonymousClass6EN r20, java.lang.String r21, float[] r22, double r23, float r25, float r26, int r27) {
        /*
            r19 = this;
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r9 = r23
            int r0 = (r23 > r1 ? 1 : (r23 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x002c
            X.7du r1 = A0E
            r2 = r1
        L_0x000b:
            r7 = 0
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r13 = 0
            X.6Cd r3 = new X.6Cd
            r15 = 0
            r17 = 0
            r8 = r3
            r8.<init>(r9, r11, r13, r15, r17)
            r0 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r8 = r25
            r9 = r26
            r10 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x002c:
            r0 = 0
            X.7r2 r1 = new X.7r2
            r1.<init>(r0, r9)
            r0 = 1
            X.7r2 r2 = new X.7r2
            r2.<init>(r0, r9)
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94564iQ.<init>(X.6EN, java.lang.String, float[], double, float, float, int):void");
    }

    public C94564iQ(C128406Cd r12, AnonymousClass6EN r13, String str, float[] fArr, int i) {
        this(new C163967r3(r12, 3), new C163967r3(r12, 2), r12, r13, str, fArr, (float[]) null, 0.0f, 1.0f, i);
    }
}
