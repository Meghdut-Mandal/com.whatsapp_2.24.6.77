package X;

import android.graphics.Bitmap;
import java.lang.reflect.Array;

/* renamed from: X.2v9  reason: invalid class name and case insensitive filesystem */
public abstract class C55762v9 {
    public static void A00(int i, Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i2 = width * height;
        int[] iArr = new int[i2];
        int i3 = width;
        int[] iArr2 = iArr;
        int i4 = width;
        int i5 = height;
        bitmap2.getPixels(iArr2, 0, i4, 0, 0, i3, i5);
        int i6 = width - 1;
        int i7 = height - 1;
        int i8 = i;
        int i9 = i + i + 1;
        int[] iArr3 = new int[i2];
        int[] iArr4 = new int[i2];
        int[] iArr5 = new int[i2];
        int[] iArr6 = new int[Math.max(width, height)];
        int i10 = (i9 + 1) >> 1;
        int i11 = i10 * i10;
        int i12 = i11 * 256;
        int[] iArr7 = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            iArr7[i13] = i13 / i11;
        }
        int[] A1O = C36441kJ.A1O();
        A1O[1] = 3;
        A1O[0] = i9;
        int[][] iArr8 = (int[][]) Array.newInstance(int.class, A1O);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < height; i16++) {
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            for (int i26 = -i8; i26 <= i8; i26++) {
                int i27 = iArr[i14 + Math.min(i6, Math.max(i26, 0))];
                int[] iArr9 = iArr8[i26 + i];
                iArr9[0] = (i27 & 16711680) >> 16;
                iArr9[1] = (i27 & 65280) >> 8;
                int i28 = i27 & 255;
                iArr9[2] = i28;
                int abs = (i + 1) - Math.abs(i26);
                int i29 = iArr9[0];
                i17 += i29 * abs;
                i18 += iArr9[1] * abs;
                i19 += i28 * abs;
                if (i26 > 0) {
                    i23 += i29;
                    i24 += iArr9[1];
                    i25 += iArr9[2];
                } else {
                    i20 += i29;
                    i21 += iArr9[1];
                    i22 += iArr9[2];
                }
            }
            int i30 = i8;
            for (int i31 = 0; i31 < width; i31++) {
                iArr3[i14] = iArr7[i17];
                iArr4[i14] = iArr7[i18];
                iArr5[i14] = iArr7[i19];
                int i32 = i17 - i20;
                int i33 = i18 - i21;
                int i34 = i19 - i22;
                int[] iArr10 = iArr8[((i30 - i) + i9) % i9];
                int i35 = i20 - iArr10[0];
                int i36 = i21 - iArr10[1];
                int i37 = i22 - iArr10[2];
                if (i16 == 0) {
                    iArr6[i31] = Math.min(i31 + i + 1, i6);
                }
                int i38 = iArr[i15 + iArr6[i31]];
                iArr10[0] = (i38 & 16711680) >> 16;
                iArr10[1] = (i38 & 65280) >> 8;
                int i39 = i38 & 255;
                iArr10[2] = i39;
                int i40 = i23 + iArr10[0];
                int i41 = i24 + iArr10[1];
                int i42 = i25 + i39;
                i17 = i32 + i40;
                i18 = i33 + i41;
                i19 = i34 + i42;
                i30 = (i30 + 1) % i9;
                int[] iArr11 = iArr8[i30 % i9];
                int i43 = iArr11[0];
                i20 = i35 + i43;
                int i44 = iArr11[1];
                i21 = i36 + i44;
                int i45 = iArr11[2];
                i22 = i37 + i45;
                i23 = i40 - i43;
                i24 = i41 - i44;
                i25 = i42 - i45;
                i14++;
            }
            i15 += width;
        }
        for (int i46 = 0; i46 < width; i46++) {
            int i47 = -i8;
            int i48 = i47 * width;
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            int i52 = 0;
            int i53 = 0;
            int i54 = 0;
            int i55 = 0;
            int i56 = 0;
            int i57 = 0;
            while (i47 <= i8) {
                int max = Math.max(0, i48) + i46;
                int[] iArr12 = iArr8[i47 + i];
                iArr12[0] = iArr3[max];
                iArr12[1] = iArr4[max];
                iArr12[2] = iArr5[max];
                int abs2 = (i + 1) - Math.abs(i47);
                i49 += iArr3[max] * abs2;
                i50 += iArr4[max] * abs2;
                i51 += iArr5[max] * abs2;
                if (i47 > 0) {
                    i55 += iArr12[0];
                    i56 += iArr12[1];
                    i57 += iArr12[2];
                } else {
                    i52 += iArr12[0];
                    i53 += iArr12[1];
                    i54 += iArr12[2];
                }
                if (i47 < i7) {
                    i48 += width;
                }
                i47++;
            }
            int i58 = i8;
            int i59 = i46;
            for (int i60 = 0; i60 < height; i60++) {
                iArr[i59] = (iArr[i59] & -16777216) | (iArr7[i49] << 16) | (iArr7[i50] << 8) | iArr7[i51];
                int i61 = i49 - i52;
                int i62 = i50 - i53;
                int i63 = i51 - i54;
                int[] iArr13 = iArr8[((i58 - i) + i9) % i9];
                int i64 = i52 - iArr13[0];
                int i65 = i53 - iArr13[1];
                int i66 = i54 - iArr13[2];
                if (i46 == 0) {
                    iArr6[i60] = Math.min(i60 + i + 1, i7) * width;
                }
                int i67 = iArr6[i60] + i46;
                iArr13[0] = iArr3[i67];
                iArr13[1] = iArr4[i67];
                int i68 = iArr5[i67];
                iArr13[2] = i68;
                int i69 = i55 + iArr13[0];
                int i70 = i56 + iArr13[1];
                int i71 = i57 + i68;
                i49 = i61 + i69;
                i50 = i62 + i70;
                i51 = i63 + i71;
                i58 = (i58 + 1) % i9;
                int[] iArr14 = iArr8[i58];
                int i72 = iArr14[0];
                i52 = i64 + i72;
                int i73 = iArr14[1];
                i53 = i65 + i73;
                int i74 = iArr14[2];
                i54 = i66 + i74;
                i55 = i69 - i72;
                i56 = i70 - i73;
                i57 = i71 - i74;
                i59 += width;
            }
        }
        bitmap2.setPixels(iArr2, 0, i4, 0, 0, i3, i5);
    }
}
