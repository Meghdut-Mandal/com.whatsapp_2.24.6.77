package X;

import android.graphics.Path;
import android.util.Log;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;

/* renamed from: X.0YU  reason: invalid class name */
public class AnonymousClass0YU {
    public char A00;
    public float[] A01;

    public static void A01(Path path, AnonymousClass0YU[] r34) {
        int i;
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
        float[] fArr = new float[6];
        char c = 'm';
        for (int i2 = 0; i2 < r34.length; i2++) {
            AnonymousClass0YU r0 = r34[i2];
            char c2 = r0.A00;
            float[] fArr2 = r0.A01;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[2];
            float f15 = fArr[3];
            float f16 = fArr[4];
            float f17 = fArr[5];
            Path path2 = path;
            switch (c2) {
                case AnonymousClass8SX.SCHEDULED_CALL_EDIT_MESSAGE_FIELD_NUMBER /*65*/:
                case 'a':
                    i = 7;
                    break;
                case AnonymousClass8SX.BOT_INVOKE_MESSAGE_FIELD_NUMBER /*67*/:
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case VoipLiteCamera.DEFAULT_SUPERNOVA_ORIENTATION /*90*/:
                case 'z':
                    path2.close();
                    f12 = f16;
                    float f18 = f17;
                    path2.moveTo(f12, f18);
                    f14 = f12;
                    f13 = f18;
                    f15 = f18;
                    break;
            }
            i = 2;
            int i3 = 0;
            while (i3 < fArr2.length) {
                if (c2 == 'A') {
                    int i4 = i3 + 5;
                    int i5 = i3 + 6;
                    A00(path2, f4, f3, fArr2[i4], fArr2[i5], fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], AnonymousClass000.A1P((fArr2[i3 + 3] > 0.0f ? 1 : (fArr2[i3 + 3] == 0.0f ? 0 : -1))), AnonymousClass000.A1P((fArr2[i3 + 4] > 0.0f ? 1 : (fArr2[i3 + 4] == 0.0f ? 0 : -1))));
                    f5 = fArr2[i4];
                    f3 = fArr2[i5];
                    f2 = f3;
                    f = f4;
                } else if (c2 == 'C') {
                    int i6 = i3 + 2;
                    int i7 = i3 + 3;
                    int i8 = i3 + 4;
                    int i9 = i3 + 5;
                    path2.cubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i6], fArr2[i7], fArr2[i8], fArr2[i9]);
                    f4 = fArr2[i8];
                    f3 = fArr2[i9];
                    f = fArr2[i6];
                    f2 = fArr2[i7];
                } else if (c2 == 'H') {
                    path2.lineTo(fArr2[i3], f3);
                    f4 = fArr2[i3];
                } else if (c2 == 'Q') {
                    int i10 = i3 + 1;
                    int i11 = i3 + 2;
                    int i12 = i3 + 3;
                    path2.quadTo(fArr2[i3], fArr2[i10], fArr2[i11], fArr2[i12]);
                    f = fArr2[i3];
                    f2 = fArr2[i10];
                    f4 = fArr2[i11];
                    f3 = fArr2[i12];
                } else if (c2 == 'V') {
                    path2.lineTo(f4, fArr2[i3]);
                    f3 = fArr2[i3];
                } else if (c2 != 'a') {
                    if (c2 == 'c') {
                        int i13 = i3 + 2;
                        int i14 = i3 + 3;
                        int i15 = i3 + 4;
                        int i16 = i3 + 5;
                        path2.rCubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i13], fArr2[i14], fArr2[i15], fArr2[i16]);
                        f = fArr2[i13] + f4;
                        f2 = fArr2[i14] + f3;
                        f4 += fArr2[i15];
                        f6 = fArr2[i16];
                    } else if (c2 == 'h') {
                        path2.rLineTo(fArr2[i3], 0.0f);
                        f4 += fArr2[i3];
                    } else if (c2 != 'q') {
                        if (c2 == 'v') {
                            path2.rLineTo(0.0f, fArr2[i3]);
                            f7 = fArr2[i3];
                        } else if (c2 != 'L') {
                            if (c2 == 'M') {
                                f4 = fArr2[i3];
                                f3 = fArr2[i3 + 1];
                                if (i3 > 0) {
                                    path2.lineTo(f4, f3);
                                } else {
                                    path2.moveTo(f4, f3);
                                }
                            } else if (c2 == 'S') {
                                if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                    f4 = (f4 * 2.0f) - f;
                                    f3 = (f3 * 2.0f) - f2;
                                }
                                int i17 = i3 + 1;
                                int i18 = i3 + 2;
                                int i19 = i3 + 3;
                                path2.cubicTo(f4, f3, fArr2[i3], fArr2[i17], fArr2[i18], fArr2[i19]);
                                f = fArr2[i3];
                                f2 = fArr2[i17];
                                f4 = fArr2[i18];
                                f3 = fArr2[i19];
                            } else if (c2 == 'T') {
                                if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                    f4 = (f4 * 2.0f) - f;
                                    f3 = (f3 * 2.0f) - f2;
                                }
                                int i20 = i3 + 1;
                                path2.quadTo(f4, f3, fArr2[i3], fArr2[i20]);
                                float f19 = fArr2[i3];
                                float f20 = fArr2[i20];
                                f2 = f3;
                                f = f4;
                                f4 = f19;
                                f3 = f20;
                            } else if (c2 == 'l') {
                                int i21 = i3 + 1;
                                path2.rLineTo(fArr2[i3], fArr2[i21]);
                                f4 += fArr2[i3];
                                f7 = fArr2[i21];
                            } else if (c2 == 'm') {
                                float f21 = fArr2[i3];
                                f4 += f21;
                                float f22 = fArr2[i3 + 1];
                                f3 += f22;
                                if (i3 > 0) {
                                    path2.rLineTo(f21, f22);
                                } else {
                                    path2.rMoveTo(f21, f22);
                                }
                            } else if (c2 == 's') {
                                if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                    f8 = f4 - f;
                                    f9 = f3 - f2;
                                } else {
                                    f8 = 0.0f;
                                    f9 = 0.0f;
                                }
                                int i22 = i3 + 1;
                                int i23 = i3 + 2;
                                int i24 = i3 + 3;
                                path2.rCubicTo(f8, f9, fArr2[i3], fArr2[i22], fArr2[i23], fArr2[i24]);
                                f = fArr2[i3] + f4;
                                f2 = fArr2[i22] + f3;
                                f4 += fArr2[i23];
                                f6 = fArr2[i24];
                            } else if (c2 == 't') {
                                if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                    f10 = f4 - f;
                                    f11 = f3 - f2;
                                } else {
                                    f11 = 0.0f;
                                    f10 = 0.0f;
                                }
                                int i25 = i3 + 1;
                                path2.rQuadTo(f10, f11, fArr2[i3], fArr2[i25]);
                                f = f10 + f4;
                                f2 = f11 + f3;
                                f4 += fArr2[i3];
                                f3 += fArr2[i25];
                            }
                            f17 = f3;
                            f16 = f4;
                        } else {
                            int i26 = i3 + 1;
                            path2.lineTo(fArr2[i3], fArr2[i26]);
                            f4 = fArr2[i3];
                            f3 = fArr2[i26];
                        }
                        f3 += f7;
                    } else {
                        int i27 = i3 + 1;
                        int i28 = i3 + 2;
                        int i29 = i3 + 3;
                        path2.rQuadTo(fArr2[i3], fArr2[i27], fArr2[i28], fArr2[i29]);
                        f = fArr2[i3] + f4;
                        f2 = fArr2[i27] + f3;
                        f4 += fArr2[i28];
                        f6 = fArr2[i29];
                    }
                    f3 += f6;
                } else {
                    int i30 = i3 + 5;
                    int i31 = i3 + 6;
                    A00(path2, f4, f3, fArr2[i30] + f4, fArr2[i31] + f3, fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], AnonymousClass000.A1P((fArr2[i3 + 3] > 0.0f ? 1 : (fArr2[i3 + 3] == 0.0f ? 0 : -1))), AnonymousClass000.A1P((fArr2[i3 + 4] > 0.0f ? 1 : (fArr2[i3 + 4] == 0.0f ? 0 : -1))));
                    f5 = f4 + fArr2[i30];
                    f3 += fArr2[i31];
                    f2 = f3;
                    f = f4;
                }
                i3 += i;
                c = c2;
            }
            fArr[0] = f4;
            fArr[1] = f3;
            fArr[2] = f;
            fArr[3] = f2;
            fArr[4] = f16;
            fArr[5] = f17;
            c = r34[i2].A00;
        }
    }

    public AnonymousClass0YU(float[] fArr, char c) {
        this.A00 = c;
        this.A01 = fArr;
    }

    public static void A00(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        float f8 = f7;
        double radians = Math.toRadians((double) f8);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        float f9 = f;
        double d3 = (double) f9;
        double d4 = d3;
        float f10 = f2;
        double d5 = (double) f10;
        double d6 = (double) f5;
        double d7 = ((d3 * cos) + (d5 * sin)) / d6;
        double d8 = (double) f6;
        double d9 = ((((double) (-f9)) * sin) + (d5 * cos)) / d8;
        float f11 = f3;
        float f12 = f4;
        double d10 = (double) f12;
        double d11 = ((((double) f11) * cos) + (d10 * sin)) / d6;
        double d12 = ((((double) (-f11)) * sin) + (d10 * cos)) / d8;
        double d13 = d7 - d11;
        double d14 = d9 - d12;
        double d15 = (d7 + d11) / 2.0d;
        double d16 = (d9 + d12) / 2.0d;
        double d17 = (d13 * d13) + (d14 * d14);
        if (d17 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d18 = (1.0d / d17) - 0.25d;
        Path path2 = path;
        boolean z3 = z;
        boolean z4 = z2;
        if (d18 < 0.0d) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Points are too far apart ");
            A0u.append(d17);
            AnonymousClass000.A1A(A0u, "PathParser");
            float sqrt = (float) (Math.sqrt(d17) / 1.99999d);
            A00(path2, f9, f10, f11, f12, f5 * sqrt, f6 * sqrt, f8, z3, z4);
            return;
        }
        double sqrt2 = Math.sqrt(d18);
        double d19 = d13 * sqrt2;
        double d20 = sqrt2 * d14;
        boolean z5 = z4;
        if (z3 == z5) {
            d = d15 - d20;
            d2 = d16 + d19;
        } else {
            d = d15 + d20;
            d2 = d16 - d19;
        }
        double atan2 = Math.atan2(d9 - d2, d7 - d);
        double atan22 = Math.atan2(d12 - d2, d11 - d) - atan2;
        int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        boolean z6 = false;
        if (i >= 0) {
            z6 = true;
        }
        if (z5 != z6) {
            atan22 = i > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d21 = d * d6;
        double d22 = d2 * d8;
        double d23 = (d21 * cos) - (d22 * sin);
        double d24 = (d21 * sin) + (d22 * cos);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(atan2);
        double sin2 = Math.sin(atan2);
        double d25 = -d6;
        double d26 = d25 * cos;
        double d27 = d8 * sin;
        double d28 = (d26 * sin2) - (d27 * cos2);
        double d29 = d25 * sin;
        double d30 = d8 * cos;
        double d31 = (sin2 * d29) + (cos2 * d30);
        double d32 = atan22 / ((double) ceil);
        int i2 = 0;
        while (i2 < ceil) {
            double d33 = atan2 + d32;
            double sin3 = Math.sin(d33);
            double cos3 = Math.cos(d33);
            double d34 = (d23 + ((d6 * cos) * cos3)) - (d27 * sin3);
            double d35 = d24 + (d6 * sin * cos3) + (d30 * sin3);
            double d36 = (d26 * sin3) - (d27 * cos3);
            double d37 = (sin3 * d29) + (cos3 * d30);
            double d38 = d33 - atan2;
            double tan = Math.tan(d38 / 2.0d);
            double sin4 = (Math.sin(d38) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
            path2.rLineTo(0.0f, 0.0f);
            path2.cubicTo((float) (d4 + (d28 * sin4)), (float) (d5 + (d31 * sin4)), (float) (d34 - (sin4 * d36)), (float) (d35 - (sin4 * d37)), (float) d34, (float) d35);
            i2++;
            d4 = d34;
            atan2 = d33;
            d31 = d37;
            d28 = d36;
            d5 = d35;
        }
    }

    public AnonymousClass0YU(AnonymousClass0YU r5) {
        this.A00 = r5.A00;
        float[] fArr = r5.A01;
        int length = fArr.length;
        int min = Math.min(length, length);
        float[] fArr2 = new float[length];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        this.A01 = fArr2;
    }
}
