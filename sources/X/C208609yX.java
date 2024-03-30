package X;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.9yX  reason: invalid class name and case insensitive filesystem */
public class C208609yX implements C22855Ax5 {
    public int A00;

    public C208609yX(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object BlD(C21655ATw aTw, float f) {
        int i;
        float f2;
        int i2;
        int i3;
        float A002;
        ArrayList A0I = AnonymousClass001.A0I();
        int i4 = 0;
        boolean z = false;
        if (aTw.A0H() == C023109s.A00) {
            z = true;
            aTw.A0L();
        }
        while (aTw.A0S()) {
            C165587tf.A1Q(A0I, C21655ATw.A08(aTw));
        }
        if (A0I.size() == 4 && C36441kJ.A03(A0I.get(0)) == 1.0f) {
            A0I.set(0, Float.valueOf(0.0f));
            C165587tf.A1Q(A0I, 1.0f);
            A0I.add(A0I.get(1));
            A0I.add(A0I.get(2));
            A0I.add(A0I.get(3));
            this.A00 = 2;
        }
        if (z) {
            aTw.A0N();
        }
        int i5 = this.A00;
        if (i5 == -1) {
            i5 = A0I.size() / 4;
            this.A00 = i5;
        }
        float[] fArr = new float[i5];
        int[] iArr = new int[i5];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = this.A00 * 4;
            if (i4 >= i) {
                break;
            }
            int i8 = i4 / 4;
            double A03 = (double) C36441kJ.A03(A0I.get(i4));
            int i9 = i4 % 4;
            if (i9 == 0) {
                if (i8 > 0) {
                    float f3 = (float) A03;
                    if (fArr[i8 - 1] >= f3) {
                        fArr[i8] = f3 + 0.01f;
                    }
                }
                fArr[i8] = (float) A03;
            } else if (i9 == 1) {
                i6 = (int) (A03 * 255.0d);
            } else if (i9 == 2) {
                i7 = (int) (A03 * 255.0d);
            } else if (i9 == 3) {
                iArr[i8] = Color.argb(255, i6, i7, (int) (A03 * 255.0d));
            }
            i4++;
        }
        AnonymousClass9QB r1 = new AnonymousClass9QB(fArr, iArr);
        if (A0I.size() <= i) {
            return r1;
        }
        float[] fArr2 = r1.A00;
        int[] iArr2 = r1.A01;
        int size = (A0I.size() - i) / 2;
        float[] fArr3 = new float[size];
        float[] fArr4 = new float[size];
        int i10 = 0;
        int i11 = 0;
        while (i < A0I.size()) {
            int i12 = i % 2;
            float A032 = C36441kJ.A03(A0I.get(i));
            if (i12 == 0) {
                fArr3[i11] = A032;
            } else {
                fArr4[i11] = A032;
                i11++;
            }
            i++;
        }
        float[] fArr5 = fArr2;
        int length = fArr2.length;
        if (length == 0) {
            fArr5 = fArr3;
        } else if (size != 0) {
            int i13 = length + size;
            fArr5 = new float[i13];
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                float f4 = Float.NaN;
                if (i15 < length) {
                    f2 = fArr2[i15];
                } else {
                    f2 = Float.NaN;
                }
                if (i16 < size) {
                    f4 = fArr3[i16];
                }
                if (Float.isNaN(f4) || f2 < f4) {
                    fArr5[i17] = f2;
                    i15++;
                } else if (Float.isNaN(f2) || f4 < f2) {
                    fArr5[i17] = f4;
                    i16++;
                } else {
                    fArr5[i17] = f2;
                    i15++;
                    i16++;
                    i14++;
                }
            }
            if (i14 != 0) {
                fArr5 = Arrays.copyOf(fArr5, i13 - i14);
            }
        }
        int length2 = fArr5.length;
        int[] iArr3 = new int[length2];
        while (i10 < length2) {
            float f5 = fArr5[i10];
            int binarySearch = Arrays.binarySearch(fArr2, f5);
            int binarySearch2 = Arrays.binarySearch(fArr3, f5);
            if (binarySearch >= 0) {
                if (binarySearch2 <= 0) {
                    int i18 = iArr2[binarySearch];
                    if (size < 2 || f5 <= fArr3[0]) {
                        i3 = (int) (fArr4[0] * 255.0f);
                    } else {
                        int i19 = 1;
                        while (true) {
                            float f6 = fArr3[i19];
                            int i20 = (f6 > f5 ? 1 : (f6 == f5 ? 0 : -1));
                            if (i20 < 0) {
                                if (i19 == size - 1) {
                                    break;
                                }
                                i19++;
                                if (i19 >= size) {
                                    throw AnonymousClass001.A08("Unreachable code.");
                                }
                            } else if (i20 > 0) {
                                int i21 = i19 - 1;
                                float f7 = fArr3[i21];
                                float f8 = f5 - f7;
                                float f9 = fArr4[i21];
                                float f10 = fArr4[i19];
                                PointF pointF = C200579hd.A00;
                                A002 = AnonymousClass001.A00(f10, f9, f8 / (f6 - f7));
                            }
                        }
                        A002 = fArr4[i19];
                        i3 = (int) (A002 * 255.0f);
                    }
                    i2 = Color.argb(i3, Color.red(i18), Color.green(i18), Color.blue(i18));
                    iArr3[i10] = i2;
                    i10++;
                }
            } else if (binarySearch2 < 0) {
                binarySearch2 = -(binarySearch2 + 1);
            }
            float f11 = fArr4[binarySearch2];
            if (iArr2.length < 2 || f5 == fArr2[0]) {
                i2 = iArr2[0];
                iArr3[i10] = i2;
                i10++;
            } else {
                int i22 = 1;
                while (i22 < length) {
                    if (fArr2[i22] >= f5 || i22 == length - 1) {
                        float f12 = fArr2[i22];
                        int i23 = i22 - 1;
                        float f13 = fArr2[i23];
                        float f14 = (f5 - f13) / (f12 - f13);
                        int i24 = iArr2[i22];
                        int i25 = iArr2[i23];
                        i2 = Color.argb((int) (f11 * 255.0f), C200309h8.A02(f14, Color.red(i25), Color.red(i24)), C200309h8.A02(f14, Color.green(i25), Color.green(i24)), C200309h8.A02(f14, Color.blue(i25), Color.blue(i24)));
                        iArr3[i10] = i2;
                        i10++;
                    } else {
                        i22++;
                    }
                }
                throw AnonymousClass001.A08("Unreachable code.");
            }
        }
        return new AnonymousClass9QB(fArr5, iArr3);
    }
}
