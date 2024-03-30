package X;

import android.opengl.Matrix;
import java.util.Arrays;

/* renamed from: X.9nQ  reason: invalid class name and case insensitive filesystem */
public abstract class C203159nQ {
    public String A00;
    public boolean A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public boolean A07;
    public boolean A08;
    public final float[] A09;
    public final C194849Rm A0A;
    public final float[] A0B;

    public static void A01(C194849Rm r3, float[] fArr) {
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
        System.arraycopy(fArr, 0, r3.A03, 0, 16);
    }

    public static void A03(float[] fArr, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6 = (float) i;
        float f7 = (float) i2;
        float f8 = f6 / f7;
        float f9 = (float) i3;
        float f10 = (float) i4;
        float f11 = f9 / f10;
        if (i < i2) {
            f2 = f8;
            f = 1.0f;
        } else {
            f = f7 / f6;
            f2 = 1.0f;
        }
        if (i3 < i4) {
            f4 = f11;
            f3 = 1.0f;
        } else {
            f3 = f10 / f9;
            f4 = 1.0f;
        }
        if (f8 < f11) {
            f5 = f2 / f4;
        } else {
            f5 = f / f3;
        }
        Matrix.scaleM(fArr, 0, f5, f5, 1.0f);
    }

    public static void A05(float[] fArr, float[] fArr2) {
        System.arraycopy(fArr2, 0, fArr, 0, 16);
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
    }

    public static void A00(C194849Rm r7, int i, int i2, int i3, int i4, int i5, int i6) {
        r7.A01 = i5;
        r7.A00 = i6;
        float f = (float) i5;
        float f2 = (float) i6;
        float[] fArr = r7.A02;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, ((float) (((i * 2) + i3) - i5)) / f, ((float) (((i2 * 2) + i4) - i6)) / f2, 0.0f);
        Matrix.scaleM(fArr, 0, (1.0f * ((float) i3)) / f, (1.0f * ((float) i4)) / f2, 1.0f);
    }

    public static void A02(float[] fArr, int i) {
        if (i != 0) {
            Matrix.rotateM(fArr, 0, (float) i, 0.0f, 0.0f, -1.0f);
        }
    }

    public static void A04(float[] fArr, boolean z, boolean z2) {
        if (z || z2) {
            float f = -1.0f;
            float f2 = 1.0f;
            if (z) {
                f2 = -1.0f;
            }
            if (!z2) {
                f = 1.0f;
            }
            Matrix.scaleM(fArr, 0, f2, f, 1.0f);
        }
    }

    public C194849Rm A06() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        int round;
        int i;
        float f13;
        float f14;
        if (this.A01) {
            this.A01 = false;
            C194849Rm r7 = this.A0A;
            float[] fArr = this.A09;
            int i2 = this.A06;
            int i3 = this.A05;
            int i4 = this.A03;
            int i5 = this.A02;
            int i6 = this.A04;
            boolean z = this.A07;
            boolean z2 = this.A08;
            if (this instanceof AnonymousClass88T) {
                AnonymousClass88T r1 = (AnonymousClass88T) this;
                int i7 = i2;
                int i8 = i3;
                if (i6 % 180 != 0) {
                    i7 = i3;
                    i8 = i2;
                }
                float[] fArr2 = r1.A00;
                A05(fArr2, fArr);
                if (i2 < i3) {
                    f14 = ((float) i3) / ((float) i2);
                    f13 = 1.0f;
                } else {
                    f13 = ((float) i2) / ((float) i3);
                    f14 = 1.0f;
                }
                Matrix.scaleM(fArr2, 0, f14, f13, 1.0f);
                A02(fArr2, i6);
                A03(fArr2, i7, i8, i4, i5);
                A04(fArr2, z, z2);
                A01(r7, fArr2);
                float f15 = (float) i7;
                float f16 = (float) i8;
                float f17 = ((float) i4) / ((float) i5);
                if (f17 < f15 / f16) {
                    i7 = C90514aH.A06(f16, f17);
                } else {
                    i8 = Math.round(f15 / f17);
                }
                r7.A01 = i7;
                r7.A00 = i8;
            } else if (this instanceof AnonymousClass88S) {
                AnonymousClass88S r2 = (AnonymousClass88S) this;
                int i9 = i3;
                if (i6 % 180 == 0) {
                    i9 = i2;
                    i2 = i3;
                }
                float[] fArr3 = r2.A00;
                A05(fArr3, fArr);
                A02(fArr3, i6);
                if (i9 < i2) {
                    f4 = (float) i9;
                    f3 = (float) i2;
                    f6 = f4 / f3;
                    f5 = 1.0f;
                } else {
                    f3 = (float) i2;
                    f4 = (float) i9;
                    f5 = f3 / f4;
                    f6 = 1.0f;
                }
                if (i4 < i5) {
                    f8 = (float) i4;
                    f7 = (float) i5;
                    f10 = f8 / f7;
                    f9 = 1.0f;
                } else {
                    f7 = (float) i5;
                    f8 = (float) i4;
                    f9 = f7 / f8;
                    f10 = 1.0f;
                }
                Matrix.scaleM(fArr3, 0, f6 / f10, f5 / f9, 1.0f);
                A04(fArr3, z, z2);
                if (i4 < i5) {
                    f12 = f8 / f7;
                    f11 = 1.0f;
                } else {
                    f11 = f7 / f8;
                    f12 = 1.0f;
                }
                Matrix.scaleM(fArr3, 0, f12, f11, 1.0f);
                A01(r7, fArr3);
                float f18 = f4 / f3;
                if (f18 < f8 / f7) {
                    i = C90514aH.A06(f7, f18);
                    round = i5;
                } else {
                    round = Math.round(f8 / f18);
                    i = i4;
                }
                A00(r7, (i4 - i) / 2, (i5 - round) / 2, i, round, i4, i5);
            } else {
                AnonymousClass88R r22 = (AnonymousClass88R) this;
                int i10 = i3;
                if (i6 % 180 == 0) {
                    i10 = i2;
                    i2 = i3;
                }
                float[] fArr4 = r22.A00;
                A05(fArr4, fArr);
                A02(fArr4, i6);
                A03(fArr4, i10, i2, i4, i5);
                A04(fArr4, z, z2);
                if (i4 < i5) {
                    f2 = ((float) i4) / ((float) i5);
                    f = 1.0f;
                } else {
                    f = ((float) i5) / ((float) i4);
                    f2 = 1.0f;
                }
                Matrix.scaleM(fArr4, 0, f2, f, 1.0f);
                A01(r7, fArr4);
                A00(r7, 0, 0, i4, i5, i4, i5);
            }
        }
        return this.A0A;
    }

    public void A07(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        if (i != this.A06 || i2 != this.A05 || i3 != this.A03 || i4 != this.A02 || i5 != this.A04 || z != this.A07 || z2 != this.A08) {
            this.A06 = i;
            this.A05 = i2;
            this.A03 = i3;
            this.A02 = i4;
            this.A04 = i5;
            this.A07 = z;
            this.A08 = z2;
            this.A01 = true;
        }
    }

    public C203159nQ() {
        float[] fArr = new float[16];
        this.A09 = fArr;
        float[] fArr2 = new float[16];
        this.A0B = fArr2;
        C194849Rm r3 = new C194849Rm();
        this.A0A = r3;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        System.arraycopy(fArr, 0, r3.A03, 0, 16);
        System.arraycopy(fArr2, 0, r3.A02, 0, 16);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BaseScaleType{");
        String str = this.A00;
        if (str == null) {
            str = Arrays.toString(Arrays.copyOfRange(Thread.currentThread().getStackTrace(), 4, 15));
        }
        A0u.append(str);
        A0u.append(", mBaseMatrix=");
        A0u.append(Arrays.toString(this.A09));
        A0u.append(", mBaseContentMatrix=");
        A0u.append(Arrays.toString(this.A0B));
        A0u.append(", mViewport=");
        A0u.append(this.A0A);
        A0u.append(", mSrcWidth=");
        A0u.append(this.A06);
        A0u.append(", mSrcHeight=");
        A0u.append(this.A05);
        A0u.append(", mDstWidth=");
        A0u.append(this.A03);
        A0u.append(", mDstHeight=");
        A0u.append(this.A02);
        A0u.append(", mOrientation=");
        A0u.append(this.A04);
        A0u.append(", mFlipX=");
        A0u.append(this.A07);
        A0u.append(", mFlipY=");
        A0u.append(this.A08);
        return AnonymousClass000.A0s(A0u);
    }
}
