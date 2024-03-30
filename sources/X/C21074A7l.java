package X;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.UnsafeUtil;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: X.A7l  reason: case insensitive filesystem */
public final class C21074A7l implements C23073B3d {
    public static final Unsafe A0F = UnsafeUtil.A02();
    public static final int[] A0G = new int[0];
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C199639ff A04;
    public final int[] A05;
    public final int[] A06;
    public final Object[] A07;
    public final C1897995q A08;
    public final C200369hI A09;
    public final B63 A0A;
    public final C1898195s A0B;
    public final AnonymousClass9TG A0C;
    public final boolean A0D;
    public final boolean A0E;

    public static int A04(C197909ca r1, C23073B3d b3d, Object obj, byte[] bArr, int i, int i2, int i3) {
        Object obj2 = obj;
        int A0g = ((C21074A7l) b3d).A0g(r1, obj2, bArr, i, i2, i3);
        r1.A02 = obj2;
        return A0g;
    }

    public static int A05(C197909ca r4, C23073B3d b3d, byte[] bArr, int i, int i2, int i3) {
        C23073B3d b3d2 = b3d;
        C170918Hz BQ8 = b3d.BQ8();
        C197909ca r1 = r4;
        int A042 = A04(r1, b3d2, BQ8, bArr, i, i2, i3);
        b3d2.BP1(BQ8);
        r1.A02 = BQ8;
        return A042;
    }

    public static int A06(C197909ca r8, C202229lJ r9, byte[] bArr, int i, int i2, int i3) {
        Object A012;
        int i4 = i2;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            C197909ca r3 = r8;
            byte[] bArr2 = bArr;
            if (i5 == 0) {
                int A0E2 = A0E(r8, bArr, i2);
                r9.A02(i, Long.valueOf(r8.A01));
                return A0E2;
            } else if (i5 == 1) {
                r9.A02(i, Long.valueOf(C165567td.A0A(bArr, i2)));
                return i2 + 8;
            } else if (i5 == 2) {
                int A0D2 = A0D(r8, bArr, i2);
                int i6 = r8.A00;
                if (i6 < 0) {
                    throw C165597tg.A0L();
                } else if (i6 <= bArr.length - A0D2) {
                    if (i6 == 0) {
                        A012 = C21674AUx.A00;
                    } else {
                        A012 = C21674AUx.A01(bArr, A0D2, i6);
                    }
                    r9.A02(i, A012);
                    return A0D2 + i6;
                } else {
                    throw C165587tf.A0J();
                }
            } else if (i5 == 3) {
                C202229lJ r4 = new C202229lJ();
                int i7 = (i & -8) | 4;
                int i8 = 0;
                while (true) {
                    int i9 = i3;
                    if (i4 >= i3) {
                        break;
                    }
                    i4 = A0D(r3, bArr, i4);
                    i8 = r3.A00;
                    if (i8 == i7) {
                        break;
                    }
                    i4 = A06(r3, r4, bArr2, i8, i4, i9);
                }
                if (i4 > i3 || i8 != i7) {
                    throw C165617ti.A0L("Failed to parse the message.");
                }
                r9.A02(i, r4);
                return i4;
            } else if (i5 == 5) {
                r9.A02(i, Integer.valueOf(C165567td.A04(bArr, i2)));
                return i2 + 4;
            }
        }
        throw C165617ti.A0L("Protocol message contained an invalid tag (zero).");
    }

    private int A00(int i) {
        if (i >= this.A02 && i <= this.A01) {
            int i2 = 0;
            int[] iArr = this.A05;
            int length = (iArr.length / 3) - 1;
            while (i2 <= length) {
                int i3 = (length + i2) >>> 1;
                int i4 = i3 * 3;
                int i5 = iArr[i4];
                if (i == i5) {
                    return i4;
                }
                if (i < i5) {
                    length = i3 - 1;
                } else {
                    i2 = i3 + 1;
                }
            }
        }
        return -1;
    }

    public static int A01(int i, int i2, int i3) {
        return i3 + (i2 * CodedOutputStream.A00(i << 3));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r5 >= 0) goto L_0x0010;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A03(X.C197909ca r6, X.C23073B3d r7, java.lang.Object r8, byte[] r9, int r10, int r11) {
        /*
            int r4 = r10 + 1
            r3 = r9
            byte r5 = r9[r10]
            r1 = r6
            if (r5 >= 0) goto L_0x0010
            int r4 = A0F(r6, r9, r5, r4)
            int r5 = r6.A00
            if (r5 < 0) goto L_0x001c
        L_0x0010:
            int r11 = r11 - r4
            if (r5 > r11) goto L_0x001c
            int r5 = r5 + r4
            r0 = r7
            r2 = r8
            r0.BPo(r1, r2, r3, r4, r5)
            r6.A02 = r8
            return r5
        L_0x001c:
            X.186 r0 = X.C165587tf.A0J()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21074A7l.A03(X.9ca, X.B3d, java.lang.Object, byte[], int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0062, code lost:
        r6.A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0064, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0097, code lost:
        r6.A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009b, code lost:
        return r10 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a8, code lost:
        r6.A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ac, code lost:
        return r10 + 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A07(X.C197909ca r6, X.C188558zm r7, java.lang.Class r8, byte[] r9, int r10, int r11) {
        /*
            int[] r1 = X.AnonymousClass99S.A00
            int r0 = r7.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x0050;
                case 2: goto L_0x004b;
                case 3: goto L_0x009c;
                case 4: goto L_0x0082;
                case 5: goto L_0x0082;
                case 6: goto L_0x0079;
                case 7: goto L_0x0079;
                case 8: goto L_0x008b;
                case 9: goto L_0x0040;
                case 10: goto L_0x0040;
                case 11: goto L_0x0040;
                case 12: goto L_0x0035;
                case 13: goto L_0x0035;
                case 14: goto L_0x0065;
                case 15: goto L_0x0026;
                case 16: goto L_0x0017;
                case 17: goto L_0x0012;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.String r0 = "unsupported field type."
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x0012:
            int r5 = A0C(r6, r9, r10)
            return r5
        L_0x0017:
            int r5 = A0E(r6, r9, r10)
            long r0 = r6.A01
            long r0 = X.C165567td.A06(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0062
        L_0x0026:
            int r5 = A0D(r6, r9, r10)
            int r0 = r6.A00
            int r0 = X.C165597tg.A02(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0062
        L_0x0035:
            int r5 = A0E(r6, r9, r10)
            long r0 = r6.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0062
        L_0x0040:
            int r5 = A0D(r6, r9, r10)
            int r0 = r6.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0062
        L_0x004b:
            int r5 = A0B(r6, r9, r10)
            return r5
        L_0x0050:
            int r5 = A0E(r6, r9, r10)
            long r3 = r6.A01
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1P(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0062:
            r6.A02 = r0
            return r5
        L_0x0065:
            X.9e7 r0 = X.C198739e7.A02
            X.B3d r7 = r0.A00(r8)
            X.8Hz r8 = r7.BQ8()
            int r5 = A03(r6, r7, r8, r9, r10, r11)
            r7.BP1(r8)
            r6.A02 = r8
            return r5
        L_0x0079:
            long r0 = X.C165567td.A0A(r9, r10)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x00a8
        L_0x0082:
            int r0 = X.C165567td.A04(r9, r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0097
        L_0x008b:
            int r0 = X.C165567td.A04(r9, r10)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x0097:
            r6.A02 = r0
            int r5 = r10 + 4
            return r5
        L_0x009c:
            long r0 = X.C165567td.A0A(r9, r10)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
        L_0x00a8:
            r6.A02 = r0
            int r5 = r10 + 8
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21074A7l.A07(X.9ca, X.8zm, java.lang.Class, byte[], int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0027, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0148, code lost:
        r5.putObject(r8, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014b, code lost:
        r5.putInt(r8, r15, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x014f, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x016b, code lost:
        r5.putObject(r8, X.C165577te.A0G(r2, r1), r3);
        com.google.protobuf.UnsafeUtil.A06(r8, X.C165597tg.A0D(r2[r17]), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x017b, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A08(X.C197909ca r26, java.lang.Object r27, byte[] r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36, long r37) {
        /*
            r25 = this;
            r7 = r29
            sun.misc.Unsafe r5 = A0F
            r12 = r25
            int[] r2 = r12.A05
            r1 = r36
            int r17 = r36 + 2
            r0 = r2[r17]
            long r15 = X.C165597tg.A0D(r0)
            r11 = 5
            r0 = 2
            r10 = r26
            r8 = r27
            r9 = r28
            r23 = r30
            r14 = r31
            r6 = r32
            r13 = r33
            r3 = r37
            switch(r35) {
                case 51: goto L_0x0028;
                case 52: goto L_0x003e;
                case 53: goto L_0x0053;
                case 54: goto L_0x0053;
                case 55: goto L_0x0061;
                case 56: goto L_0x006f;
                case 57: goto L_0x0081;
                case 58: goto L_0x0092;
                case 59: goto L_0x00a8;
                case 60: goto L_0x00dc;
                case 61: goto L_0x00f3;
                case 62: goto L_0x0061;
                case 63: goto L_0x00ff;
                case 64: goto L_0x0081;
                case 65: goto L_0x006f;
                case 66: goto L_0x0127;
                case 67: goto L_0x0138;
                case 68: goto L_0x0150;
                default: goto L_0x0027;
            }
        L_0x0027:
            return r7
        L_0x0028:
            r0 = 1
            if (r13 != r0) goto L_0x0027
            long r0 = X.C165567td.A0A(r9, r7)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r5.putObject(r8, r3, r0)
            int r7 = r29 + 8
            goto L_0x014b
        L_0x003e:
            if (r13 != r11) goto L_0x0027
            int r0 = X.C165567td.A04(r9, r7)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5.putObject(r8, r3, r0)
            int r7 = r29 + 4
            goto L_0x014b
        L_0x0053:
            if (r33 != 0) goto L_0x0027
            int r7 = A0E(r10, r9, r7)
            long r0 = r10.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0148
        L_0x0061:
            if (r33 != 0) goto L_0x0027
            int r7 = A0D(r10, r9, r7)
            int r0 = r10.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0148
        L_0x006f:
            r0 = 1
            if (r13 != r0) goto L_0x0027
            long r0 = X.C165567td.A0A(r9, r7)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.putObject(r8, r3, r0)
            int r7 = r29 + 8
            goto L_0x014b
        L_0x0081:
            if (r13 != r11) goto L_0x0027
            int r0 = X.C165567td.A04(r9, r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.putObject(r8, r3, r0)
            int r7 = r29 + 4
            goto L_0x014b
        L_0x0092:
            if (r33 != 0) goto L_0x0027
            int r7 = A0E(r10, r9, r7)
            long r0 = r10.A01
            r9 = 0
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1P(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0148
        L_0x00a8:
            if (r13 != r0) goto L_0x0027
            int r7 = A0D(r10, r9, r7)
            int r2 = r10.A00
            if (r2 != 0) goto L_0x00b9
            java.lang.String r0 = ""
            r5.putObject(r8, r3, r0)
            goto L_0x014b
        L_0x00b9:
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r34 = r34 & r0
            if (r34 == 0) goto L_0x00d0
            int r1 = r7 + r2
            X.9gP r0 = X.C196659aK.A00
            int r0 = r0.A02(r9, r7, r1)
            if (r0 == 0) goto L_0x00d0
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            X.186 r0 = X.C165617ti.A0L(r0)
            throw r0
        L_0x00d0:
            java.nio.charset.Charset r1 = X.AnonymousClass9BD.A04
            java.lang.String r0 = new java.lang.String
            r0.<init>(r9, r7, r2, r1)
            r5.putObject(r8, r3, r0)
            int r7 = r7 + r2
            goto L_0x014b
        L_0x00dc:
            if (r13 != r0) goto L_0x0027
            java.lang.Object r3 = r12.A0S(r8, r6, r1)
            X.B3d r19 = r12.A0N(r1)
            r20 = r3
            r21 = r9
            r22 = r7
            r18 = r10
            int r7 = A03(r18, r19, r20, r21, r22, r23)
            goto L_0x016b
        L_0x00f3:
            if (r13 != r0) goto L_0x0027
            int r7 = A0B(r10, r9, r7)
            java.lang.Object r0 = r10.A02
            r5.putObject(r8, r3, r0)
            goto L_0x014b
        L_0x00ff:
            if (r33 != 0) goto L_0x0027
            int r7 = A0D(r10, r9, r7)
            int r2 = r10.A00
            X.AyC r0 = A0L(r12, r1)
            if (r0 == 0) goto L_0x011f
            boolean r0 = r0.BM0(r2)
            if (r0 != 0) goto L_0x011f
            X.9lJ r1 = A0O(r8)
            java.lang.Long r0 = X.C36441kJ.A0y(r2)
            r1.A02(r14, r0)
            return r7
        L_0x011f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r5.putObject(r8, r3, r0)
            goto L_0x014b
        L_0x0127:
            if (r33 != 0) goto L_0x0027
            int r7 = A0D(r10, r9, r7)
            int r0 = r10.A00
            int r0 = X.C165597tg.A02(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0148
        L_0x0138:
            if (r33 != 0) goto L_0x0027
            int r7 = A0E(r10, r9, r7)
            long r0 = r10.A01
            long r0 = X.C165567td.A06(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0148:
            r5.putObject(r8, r3, r0)
        L_0x014b:
            r0 = r15
            r5.putInt(r8, r0, r6)
            return r7
        L_0x0150:
            r0 = 3
            if (r13 != r0) goto L_0x0027
            java.lang.Object r3 = r12.A0S(r8, r6, r1)
            r0 = r31 & -8
            r24 = r0 | 4
            X.B3d r19 = r12.A0N(r1)
            r20 = r3
            r21 = r9
            r22 = r7
            r18 = r10
            int r7 = A04(r18, r19, r20, r21, r22, r23, r24)
        L_0x016b:
            long r0 = X.C165577te.A0G(r2, r1)
            r5.putObject(r8, r0, r3)
            r0 = r2[r17]
            long r0 = X.C165597tg.A0D(r0)
            com.google.protobuf.UnsafeUtil.A06(r8, r0, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21074A7l.A08(X.9ca, java.lang.Object, byte[], int, int, int, int, int, int, int, int, long):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:197:0x031a, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0196, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A09(X.C197909ca r23, java.lang.Object r24, byte[] r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, long r33, long r35) {
        /*
            r22 = this;
            r10 = r26
            sun.misc.Unsafe r5 = A0F
            r13 = r24
            r0 = r35
            java.lang.Object r15 = r5.getObject(r13, r0)
            X.B6c r15 = (X.C23122B6c) r15
            r2 = r15
            X.AcE r2 = (X.C21886AcE) r2
            boolean r2 = r2.A00
            r4 = 2
            if (r2 != 0) goto L_0x0027
            int r3 = r15.size()
            int r2 = r3 * 2
            if (r3 != 0) goto L_0x0020
            r2 = 10
        L_0x0020:
            X.B6c r15 = r15.BQ1(r2)
            r5.putObject(r13, r0, r15)
        L_0x0027:
            r6 = 5
            r0 = 1
            r3 = r22
            r7 = r23
            r9 = r25
            r11 = r27
            r2 = r28
            r1 = r30
            r5 = r31
            switch(r32) {
                case 18: goto L_0x02f8;
                case 19: goto L_0x02d6;
                case 20: goto L_0x02ae;
                case 21: goto L_0x02ae;
                case 22: goto L_0x0274;
                case 23: goto L_0x003a;
                case 24: goto L_0x0235;
                case 25: goto L_0x020d;
                case 26: goto L_0x0197;
                case 27: goto L_0x014b;
                case 28: goto L_0x010f;
                case 29: goto L_0x0274;
                case 30: goto L_0x00c6;
                case 31: goto L_0x0235;
                case 32: goto L_0x003a;
                case 33: goto L_0x0084;
                case 34: goto L_0x005c;
                case 35: goto L_0x02f8;
                case 36: goto L_0x02d6;
                case 37: goto L_0x02ae;
                case 38: goto L_0x02ae;
                case 39: goto L_0x0274;
                case 40: goto L_0x003a;
                case 41: goto L_0x0235;
                case 42: goto L_0x020d;
                case 43: goto L_0x0274;
                case 44: goto L_0x00c6;
                case 45: goto L_0x0235;
                case 46: goto L_0x003a;
                case 47: goto L_0x0084;
                case 48: goto L_0x005c;
                case 49: goto L_0x0178;
                default: goto L_0x003a;
            }
        L_0x003a:
            if (r1 != r4) goto L_0x0053
            int r10 = A0D(r7, r9, r10)
            int r0 = r7.A00
            int r0 = r0 + r10
            if (r10 >= r0) goto L_0x004c
            java.lang.String r0 = "addLong"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x004c:
            if (r10 == r0) goto L_0x031a
            X.186 r0 = X.C165587tf.A0J()
            throw r0
        L_0x0053:
            if (r1 != r0) goto L_0x031a
            java.lang.String r0 = "addLong"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x005c:
            if (r1 != r4) goto L_0x0078
            int r10 = A0D(r7, r9, r10)
            int r0 = r7.A00
            int r0 = r0 + r10
            if (r10 >= r0) goto L_0x0071
            A0E(r7, r9, r10)
            java.lang.String r0 = "addLong"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0071:
            if (r10 == r0) goto L_0x031a
            X.186 r0 = X.C165587tf.A0J()
            throw r0
        L_0x0078:
            if (r30 != 0) goto L_0x031a
            A0E(r7, r9, r10)
            java.lang.String r0 = "addLong"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0084:
            if (r1 != r4) goto L_0x00a6
            X.8I0 r15 = (X.AnonymousClass8I0) r15
            int r10 = A0D(r7, r9, r10)
            int r1 = r7.A00
            int r1 = r1 + r10
        L_0x008f:
            if (r10 >= r1) goto L_0x009f
            int r10 = A0D(r7, r9, r10)
            int r0 = r7.A00
            int r0 = X.C165597tg.A02(r0)
            r15.B0O(r0)
            goto L_0x008f
        L_0x009f:
            if (r10 == r1) goto L_0x031a
            X.186 r0 = X.C165587tf.A0J()
            throw r0
        L_0x00a6:
            if (r30 != 0) goto L_0x031a
            X.8I0 r15 = (X.AnonymousClass8I0) r15
            int r10 = A0D(r7, r9, r10)
        L_0x00ae:
            int r0 = r7.A00
            int r0 = X.C165597tg.A02(r0)
            r15.B0O(r0)
            if (r10 >= r11) goto L_0x031a
            int r1 = A0D(r7, r9, r10)
            int r0 = r7.A00
            if (r2 != r0) goto L_0x031a
            int r10 = A0D(r7, r9, r1)
            goto L_0x00ae
        L_0x00c6:
            if (r1 != r4) goto L_0x00e5
            r2 = r15
            X.8I0 r2 = (X.AnonymousClass8I0) r2
            int r10 = A0D(r7, r9, r10)
            int r1 = r7.A00
            int r1 = r1 + r10
        L_0x00d2:
            if (r10 >= r1) goto L_0x00de
            int r10 = A0D(r7, r9, r10)
            int r0 = r7.A00
            r2.B0O(r0)
            goto L_0x00d2
        L_0x00de:
            if (r10 == r1) goto L_0x0102
            X.186 r0 = X.C165587tf.A0J()
            throw r0
        L_0x00e5:
            if (r30 != 0) goto L_0x031a
            r4 = r15
            X.8I0 r4 = (X.AnonymousClass8I0) r4
            int r10 = A0D(r7, r9, r10)
        L_0x00ee:
            int r0 = r7.A00
            r4.B0O(r0)
            if (r10 >= r11) goto L_0x0102
            int r1 = A0D(r7, r9, r10)
            int r0 = r7.A00
            if (r2 != r0) goto L_0x0102
            int r10 = A0D(r7, r9, r1)
            goto L_0x00ee
        L_0x0102:
            X.AyC r11 = A0L(r3, r5)
            r14 = 0
            X.9TG r12 = r3.A0C
            r16 = r29
            X.C203849oy.A0A(r11, r12, r13, r14, r15, r16)
            return r10
        L_0x010f:
            if (r1 != r4) goto L_0x031a
            int r10 = A0D(r7, r9, r10)
            int r1 = r7.A00
            if (r1 < 0) goto L_0x0146
            int r3 = r9.length
        L_0x011a:
            int r0 = r3 - r10
            if (r1 > r0) goto L_0x0141
            if (r1 != 0) goto L_0x0138
            X.AUx r0 = X.C21674AUx.A00
            r15.add(r0)
        L_0x0125:
            if (r10 >= r11) goto L_0x031a
            int r1 = A0D(r7, r9, r10)
            int r0 = r7.A00
            if (r2 != r0) goto L_0x031a
            int r10 = A0D(r7, r9, r1)
            int r1 = r7.A00
            if (r1 < 0) goto L_0x0146
            goto L_0x011a
        L_0x0138:
            X.8I5 r0 = X.C21674AUx.A01(r9, r10, r1)
            r15.add(r0)
            int r10 = r10 + r1
            goto L_0x0125
        L_0x0141:
            X.186 r0 = X.C165587tf.A0J()
            throw r0
        L_0x0146:
            X.186 r0 = X.C165597tg.A0L()
            throw r0
        L_0x014b:
            if (r1 != r4) goto L_0x031a
            X.B3d r1 = r3.A0N(r5)
        L_0x0151:
            X.8Hz r0 = r1.BQ8()
            r16 = r7
            r18 = r0
            r19 = r9
            r20 = r10
            r21 = r11
            r17 = r1
            int r3 = A03(r16, r17, r18, r19, r20, r21)
            r1.BP1(r0)
            r7.A02 = r0
            r15.add(r0)
            if (r3 >= r11) goto L_0x0196
            int r10 = A0D(r7, r9, r3)
            int r0 = r7.A00
            if (r2 == r0) goto L_0x0151
            return r3
        L_0x0178:
            r0 = 3
            if (r1 != r0) goto L_0x031a
            X.B3d r8 = r3.A0N(r5)
            r0 = r28 & -8
            r12 = r0 | 4
        L_0x0183:
            int r3 = A05(r7, r8, r9, r10, r11, r12)
            java.lang.Object r0 = r7.A02
            r15.add(r0)
            if (r3 >= r11) goto L_0x0196
            int r10 = A0D(r7, r9, r3)
            int r0 = r7.A00
            if (r2 == r0) goto L_0x0183
        L_0x0196:
            return r3
        L_0x0197:
            if (r1 != r4) goto L_0x031a
            r0 = 536870912(0x20000000, double:2.652494739E-315)
            long r33 = r33 & r0
            r3 = 0
            int r0 = (r33 > r3 ? 1 : (r33 == r3 ? 0 : -1))
            int r10 = A0D(r7, r9, r10)
            if (r0 != 0) goto L_0x01d2
            int r1 = r7.A00
            if (r1 < 0) goto L_0x01cd
            java.lang.String r3 = ""
        L_0x01ae:
            if (r1 != 0) goto L_0x01c6
            r15.add(r3)
        L_0x01b3:
            if (r10 >= r11) goto L_0x031a
            int r1 = A0D(r7, r9, r10)
            int r0 = r7.A00
            if (r2 != r0) goto L_0x031a
            int r10 = A0D(r7, r9, r1)
            int r1 = r7.A00
            if (r1 < 0) goto L_0x01cd
            goto L_0x01ae
        L_0x01c6:
            java.nio.charset.Charset r0 = X.AnonymousClass9BD.A04
            X.C165597tg.A1L(r0, r15, r9, r10, r1)
            int r10 = r10 + r1
            goto L_0x01b3
        L_0x01cd:
            X.186 r0 = X.C165597tg.A0L()
            throw r0
        L_0x01d2:
            int r4 = r7.A00
            if (r4 < 0) goto L_0x0208
            java.lang.String r3 = ""
        L_0x01d8:
            if (r4 != 0) goto L_0x01f0
            r15.add(r3)
        L_0x01dd:
            if (r10 >= r11) goto L_0x031a
            int r1 = A0D(r7, r9, r10)
            int r0 = r7.A00
            if (r2 != r0) goto L_0x031a
            int r10 = A0D(r7, r9, r1)
            int r4 = r7.A00
            if (r4 < 0) goto L_0x0208
            goto L_0x01d8
        L_0x01f0:
            int r1 = r10 + r4
            X.9gP r0 = X.C196659aK.A00
            int r0 = r0.A02(r9, r10, r1)
            if (r0 != 0) goto L_0x0201
            java.nio.charset.Charset r0 = X.AnonymousClass9BD.A04
            X.C165597tg.A1L(r0, r15, r9, r10, r4)
            r10 = r1
            goto L_0x01dd
        L_0x0201:
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            X.186 r0 = X.C165617ti.A0L(r0)
            throw r0
        L_0x0208:
            X.186 r0 = X.C165597tg.A0L()
            throw r0
        L_0x020d:
            if (r1 != r4) goto L_0x0229
            int r10 = A0D(r7, r9, r10)
            int r0 = r7.A00
            int r0 = r0 + r10
            if (r10 >= r0) goto L_0x0222
            A0E(r7, r9, r10)
            java.lang.String r0 = "addBoolean"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0222:
            if (r10 == r0) goto L_0x031a
            X.186 r0 = X.C165587tf.A0J()
            throw r0
        L_0x0229:
            if (r30 != 0) goto L_0x031a
            A0E(r7, r9, r10)
            java.lang.String r0 = "addBoolean"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0235:
            if (r1 != r4) goto L_0x0253
            X.8I0 r15 = (X.AnonymousClass8I0) r15
            int r10 = A0D(r7, r9, r10)
            int r1 = r7.A00
            int r1 = r1 + r10
        L_0x0240:
            if (r10 >= r1) goto L_0x024c
            int r0 = X.C165567td.A04(r9, r10)
            r15.B0O(r0)
            int r10 = r10 + 4
            goto L_0x0240
        L_0x024c:
            if (r10 == r1) goto L_0x031a
            X.186 r0 = X.C165587tf.A0J()
            throw r0
        L_0x0253:
            if (r1 != r6) goto L_0x031a
            X.8I0 r15 = (X.AnonymousClass8I0) r15
            int r0 = X.C165567td.A04(r9, r10)
            r15.B0O(r0)
            int r10 = r26 + 4
        L_0x0260:
            if (r10 >= r11) goto L_0x031a
            int r1 = A0D(r7, r9, r10)
            int r0 = r7.A00
            if (r2 != r0) goto L_0x031a
            int r0 = X.C165567td.A04(r9, r1)
            r15.B0O(r0)
            int r10 = r1 + 4
            goto L_0x0260
        L_0x0274:
            if (r1 != r4) goto L_0x0292
            X.8I0 r15 = (X.AnonymousClass8I0) r15
            int r10 = A0D(r7, r9, r10)
            int r1 = r7.A00
            int r1 = r1 + r10
        L_0x027f:
            if (r10 >= r1) goto L_0x028b
            int r10 = A0D(r7, r9, r10)
            int r0 = r7.A00
            r15.B0O(r0)
            goto L_0x027f
        L_0x028b:
            if (r10 == r1) goto L_0x031a
            X.186 r0 = X.C165587tf.A0J()
            throw r0
        L_0x0292:
            if (r30 != 0) goto L_0x031a
            X.8I0 r15 = (X.AnonymousClass8I0) r15
            int r10 = A0D(r7, r9, r10)
        L_0x029a:
            int r0 = r7.A00
            r15.B0O(r0)
            if (r10 >= r11) goto L_0x031a
            int r1 = A0D(r7, r9, r10)
            int r0 = r7.A00
            if (r2 != r0) goto L_0x031a
            int r10 = A0D(r7, r9, r1)
            goto L_0x029a
        L_0x02ae:
            if (r1 != r4) goto L_0x02ca
            int r10 = A0D(r7, r9, r10)
            int r0 = r7.A00
            int r0 = r0 + r10
            if (r10 >= r0) goto L_0x02c3
            A0E(r7, r9, r10)
            java.lang.String r0 = "addLong"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x02c3:
            if (r10 == r0) goto L_0x031a
            X.186 r0 = X.C165587tf.A0J()
            throw r0
        L_0x02ca:
            if (r30 != 0) goto L_0x031a
            A0E(r7, r9, r10)
            java.lang.String r0 = "addLong"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x02d6:
            if (r1 != r4) goto L_0x02ef
            int r10 = A0D(r7, r9, r10)
            int r0 = r7.A00
            int r0 = r0 + r10
            if (r10 >= r0) goto L_0x02e8
            java.lang.String r0 = "addFloat"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x02e8:
            if (r10 == r0) goto L_0x031a
            X.186 r0 = X.C165587tf.A0J()
            throw r0
        L_0x02ef:
            if (r1 != r6) goto L_0x031a
            java.lang.String r0 = "addFloat"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x02f8:
            if (r1 != r4) goto L_0x0311
            int r10 = A0D(r7, r9, r10)
            int r0 = r7.A00
            int r0 = r0 + r10
            if (r10 >= r0) goto L_0x030a
            java.lang.String r0 = "addDouble"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x030a:
            if (r10 == r0) goto L_0x031a
            X.186 r0 = X.C165587tf.A0J()
            throw r0
        L_0x0311:
            if (r1 != r0) goto L_0x031a
            java.lang.String r0 = "addDouble"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x031a:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21074A7l.A09(X.9ca, java.lang.Object, byte[], int, int, int, int, int, int, int, long, long):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A0A(X.C197909ca r17, java.lang.Object r18, byte[] r19, int r20, int r21, int r22, long r23) {
        /*
            r16 = this;
            sun.misc.Unsafe r4 = A0F
            r0 = r16
            java.lang.Object[] r1 = r0.A07
            int r0 = r22 / 3
            int r0 = r0 * 2
            r3 = r1[r0]
            r6 = r18
            r1 = r23
            java.lang.Object r5 = r4.getObject(r6, r1)
            r0 = r5
            X.AcX r0 = (X.C21903AcX) r0
            boolean r0 = r0.isMutable
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002a
            X.AcX r0 = X.C21903AcX.A00
            X.AcX r0 = X.C165597tg.A0M(r0)
            X.C200369hI.A01(r0, r5)
            r4.putObject(r6, r1, r0)
            r5 = r0
        L_0x002a:
            X.9Jh r3 = (X.C192959Jh) r3
            X.9LV r4 = r3.A00
            java.util.AbstractMap r5 = (java.util.AbstractMap) r5
            r10 = r17
            r13 = r19
            r0 = r20
            int r7 = A0D(r10, r13, r0)
            int r1 = r10.A00
            if (r1 < 0) goto L_0x0093
            r15 = r21
            int r0 = r21 - r7
            if (r1 > r0) goto L_0x0093
            int r3 = r7 + r1
            java.lang.String r9 = ""
            r6 = r9
            r2 = r9
        L_0x004a:
            if (r7 >= r3) goto L_0x0086
            int r14 = r7 + 1
            byte r7 = r19[r7]
            if (r7 >= 0) goto L_0x0058
            int r14 = A0F(r10, r13, r7, r14)
            int r7 = r10.A00
        L_0x0058:
            int r8 = r7 >>> 3
            r1 = r7 & 7
            r0 = 1
            if (r8 == r0) goto L_0x0073
            r0 = 2
            if (r8 != r0) goto L_0x0081
            X.8zm r11 = r4.A01
            int r0 = r11.wireType
            if (r1 != r0) goto L_0x0081
            java.lang.Class r12 = r9.getClass()
            int r7 = A07(r10, r11, r12, r13, r14, r15)
            java.lang.Object r2 = r10.A02
            goto L_0x004a
        L_0x0073:
            X.8zm r11 = r4.A00
            int r0 = r11.wireType
            if (r1 != r0) goto L_0x0081
            r12 = 0
            int r7 = A07(r10, r11, r12, r13, r14, r15)
            java.lang.Object r6 = r10.A02
            goto L_0x004a
        L_0x0081:
            int r7 = A0G(r10, r13, r7, r14, r15)
            goto L_0x004a
        L_0x0086:
            if (r7 != r3) goto L_0x008c
            r5.put(r6, r2)
            return r3
        L_0x008c:
            java.lang.String r0 = "Failed to parse the message."
            X.186 r0 = X.C165617ti.A0L(r0)
            throw r0
        L_0x0093:
            X.186 r0 = X.C165587tf.A0J()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21074A7l.A0A(X.9ca, java.lang.Object, byte[], int, int, int, long):int");
    }

    public static int A0D(C197909ca r2, byte[] bArr, int i) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return A0F(r2, bArr, b, i2);
        }
        r2.A00 = b;
        return i2;
    }

    public static int A0E(C197909ca r8, byte[] bArr, int i) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            r8.A01 = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            b = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b & Byte.MAX_VALUE)) << i4;
            i3++;
        }
        r8.A01 = j2;
        return i3;
    }

    public static int A0F(C197909ca r4, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i & 127;
        int i7 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i5 = b << 7;
        } else {
            int i8 = i6 | ((b & Byte.MAX_VALUE) << 7);
            int i9 = i7 + 1;
            byte b2 = bArr[i7];
            if (b2 >= 0) {
                i4 = b2 << 14;
            } else {
                i6 = i8 | ((b2 & Byte.MAX_VALUE) << 14);
                i7 = i9 + 1;
                byte b3 = bArr[i9];
                if (b3 >= 0) {
                    i5 = b3 << 21;
                } else {
                    i8 = i6 | ((b3 & Byte.MAX_VALUE) << 21);
                    i9 = i7 + 1;
                    byte b4 = bArr[i7];
                    if (b4 >= 0) {
                        i4 = b4 << 28;
                    } else {
                        i3 = i8 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            i7 = i9 + 1;
                            if (bArr[i9] >= 0) {
                                break;
                            }
                            i9 = i7;
                        }
                        r4.A00 = i3;
                        return i7;
                    }
                }
            }
            r4.A00 = i8 | i4;
            return i9;
        }
        i3 = i6 | i5;
        r4.A00 = i3;
        return i7;
    }

    public static int A0G(C197909ca r2, byte[] bArr, int i, int i2, int i3) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return A0E(r2, bArr, i2);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return A0D(r2, bArr, i2) + r2.A00;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = A0D(r2, bArr, i2);
                    i6 = r2.A00;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = A0G(r2, bArr, i6, i2, i3);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw C165617ti.A0L("Failed to parse the message.");
            } else if (i4 == 5) {
                return i2 + 4;
            }
        }
        throw C165617ti.A0L("Protocol message contained an invalid tag (zero).");
    }

    public static int A0H(Object obj) {
        AnonymousClass9TG r0 = C203849oy.A02;
        return ((List) obj).size();
    }

    public static C22900AyC A0L(C21074A7l a7l, int i) {
        return (C22900AyC) a7l.A07[((i / 3) * 2) + 1];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0168, code lost:
        if (r39 == false) goto L_0x016a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C21074A7l A0M(X.C1897995q r40, X.C199639ff r41, X.C200369hI r42, X.C1898195s r43, X.AnonymousClass9LW r44, X.AnonymousClass9TG r45) {
        /*
            r8 = r44
            int r0 = r8.A00
            r1 = 1
            r0 = r0 & 1
            if (r0 != r1) goto L_0x002c
            java.lang.Integer r2 = X.C023109s.A00
        L_0x000b:
            java.lang.Integer r1 = X.C023109s.A01
            r0 = 0
            boolean r39 = X.C36361kB.A1a(r2, r1)
            java.lang.String r13 = r8.A02
            int r26 = r13.length()
            char r0 = r13.charAt(r0)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r0 < r5) goto L_0x002f
            r0 = 1
        L_0x0022:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r5) goto L_0x0030
            r0 = r1
            goto L_0x0022
        L_0x002c:
            java.lang.Integer r2 = X.C023109s.A01
            goto L_0x000b
        L_0x002f:
            r1 = 1
        L_0x0030:
            int r12 = r1 + 1
            char r3 = r13.charAt(r1)
            if (r3 < r5) goto L_0x004f
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x003c:
            int r1 = r12 + 1
            char r0 = r13.charAt(r12)
            if (r0 < r5) goto L_0x004c
            int r3 = X.C165597tg.A04(r0, r2, r3)
            int r2 = r2 + 13
            r12 = r1
            goto L_0x003c
        L_0x004c:
            int r0 = r0 << r2
            r3 = r3 | r0
            r12 = r1
        L_0x004f:
            if (r3 != 0) goto L_0x0244
            int[] r17 = A0G
            r4 = 0
            r3 = 0
            r2 = 0
            r7 = 0
            r6 = 0
            r1 = 0
            r16 = 0
        L_0x005b:
            sun.misc.Unsafe r25 = A0F
            java.lang.Object[] r11 = r8.A03
            X.B63 r0 = r8.A01
            r29 = r0
            java.lang.Class r14 = r29.getClass()
            int r0 = r7 * 3
            int[] r0 = new int[r0]
            r24 = r0
            int r0 = r7 * 2
            java.lang.Object[] r10 = new java.lang.Object[r0]
            int r38 = r1 + r6
            r23 = r1
            r22 = r38
            r21 = 0
            r20 = 0
        L_0x007b:
            r0 = r26
            if (r12 >= r0) goto L_0x0349
            int r0 = r12 + 1
            char r9 = r13.charAt(r12)
            if (r9 < r5) goto L_0x009e
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x008b:
            int r7 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r5) goto L_0x009b
            int r9 = X.C165597tg.A04(r0, r6, r9)
            int r6 = r6 + 13
            r0 = r7
            goto L_0x008b
        L_0x009b:
            int r0 = r0 << r6
            r9 = r9 | r0
            r0 = r7
        L_0x009e:
            int r12 = r0 + 1
            char r8 = r13.charAt(r0)
            if (r8 < r5) goto L_0x00c0
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r5 = 13
        L_0x00aa:
            int r7 = r12 + 1
            char r6 = r13.charAt(r12)
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r0) goto L_0x00bd
            int r8 = X.C165597tg.A04(r6, r5, r8)
            int r5 = r5 + 13
            r12 = r7
            goto L_0x00aa
        L_0x00bd:
            int r6 = r6 << r5
            r8 = r8 | r6
            r12 = r7
        L_0x00c0:
            r7 = r8 & 255(0xff, float:3.57E-43)
            r0 = r8 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x00cc
            int r0 = r21 + 1
            r17[r21] = r20
            r21 = r0
        L_0x00cc:
            r0 = 51
            if (r7 < r0) goto L_0x00f0
            int r15 = r12 + 1
            char r6 = r13.charAt(r12)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r12) goto L_0x01c6
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r5 = 13
        L_0x00df:
            int r18 = r15 + 1
            char r0 = r13.charAt(r15)
            if (r0 < r12) goto L_0x01c2
            int r6 = X.C165597tg.A04(r0, r5, r6)
            int r5 = r5 + 13
            r15 = r18
            goto L_0x00df
        L_0x00f0:
            int r18 = r16 + 1
            r0 = r11[r16]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r5 = A0T(r14, r0)
            r0 = 9
            if (r7 == r0) goto L_0x017c
            r0 = 17
            if (r7 == r0) goto L_0x017c
            r0 = 27
            if (r7 == r0) goto L_0x016a
            r0 = 49
            if (r7 == r0) goto L_0x016a
            r0 = 12
            if (r7 == r0) goto L_0x0168
            r0 = 30
            if (r7 == r0) goto L_0x0168
            r0 = 44
            if (r7 == r0) goto L_0x0168
            r0 = 50
            if (r7 != r0) goto L_0x0136
            int r15 = r23 + 1
            r17[r23] = r20
            int r0 = r20 / 3
            int r6 = r0 * 2
            int r16 = r18 + 1
            r0 = r11[r18]
            r10[r6] = r0
            r0 = r8 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0177
            int r6 = r6 + 1
            int r18 = r16 + 1
            r0 = r11[r16]
            r10[r6] = r0
            r23 = r15
        L_0x0136:
            r0 = r25
            long r5 = r0.objectFieldOffset(r5)
            int r0 = (int) r5
            r19 = r0
            r5 = r8 & 4096(0x1000, float:5.74E-42)
            r0 = 4096(0x1000, float:5.74E-42)
            if (r5 != r0) goto L_0x018b
            r0 = 17
            if (r7 > r0) goto L_0x018b
            int r0 = r12 + 1
            char r6 = r13.charAt(r12)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r15) goto L_0x0189
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r5 = 13
        L_0x0158:
            int r12 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r15) goto L_0x019e
            int r6 = X.C165597tg.A04(r0, r5, r6)
            int r5 = r5 + 13
            r0 = r12
            goto L_0x0158
        L_0x0168:
            if (r39 != 0) goto L_0x0136
        L_0x016a:
            int r0 = r20 / 3
            int r0 = r0 * 2
            int r6 = r0 + 1
            int r16 = r18 + 1
            r0 = r11[r18]
            r10[r6] = r0
            goto L_0x0179
        L_0x0177:
            r23 = r15
        L_0x0179:
            r18 = r16
            goto L_0x0136
        L_0x017c:
            int r0 = r20 / 3
            int r0 = r0 * 2
            int r6 = r0 + 1
            java.lang.Class r0 = r5.getType()
            r10[r6] = r0
            goto L_0x0136
        L_0x0189:
            r12 = r0
            goto L_0x01a0
        L_0x018b:
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
            r6 = 18
            if (r7 < r6) goto L_0x01b6
            r6 = 49
            if (r7 > r6) goto L_0x01b6
            int r6 = r22 + 1
            r17[r22] = r19
            r22 = r6
            goto L_0x01b6
        L_0x019e:
            int r0 = r0 << r5
            r6 = r6 | r0
        L_0x01a0:
            int r15 = r4 * 2
            int r0 = r6 / 32
            int r15 = r15 + r0
            r5 = r11[r15]
            boolean r0 = r5 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x01b9
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
        L_0x01ad:
            r0 = r25
            long r15 = r0.objectFieldOffset(r5)
            int r0 = (int) r15
            int r5 = r6 % 32
        L_0x01b6:
            r16 = r18
            goto L_0x020a
        L_0x01b9:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.reflect.Field r5 = A0T(r14, r5)
            r11[r15] = r5
            goto L_0x01ad
        L_0x01c2:
            int r0 = r0 << r5
            r6 = r6 | r0
            r15 = r18
        L_0x01c6:
            int r5 = r7 + -51
            r0 = 9
            if (r5 == r0) goto L_0x01d6
            r0 = 17
            if (r5 == r0) goto L_0x01d6
            r0 = 12
            if (r5 != r0) goto L_0x01e4
            if (r39 != 0) goto L_0x01e4
        L_0x01d6:
            int r0 = r20 / 3
            int r0 = r0 * 2
            int r12 = r0 + 1
            int r5 = r16 + 1
            r0 = r11[r16]
            r10[r12] = r0
            r16 = r5
        L_0x01e4:
            int r12 = r6 * 2
            r5 = r11[r12]
            boolean r0 = r5 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x023b
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
        L_0x01ee:
            r0 = r25
            long r5 = r0.objectFieldOffset(r5)
            int r0 = (int) r5
            r19 = r0
            int r6 = r12 + 1
            r5 = r11[r6]
            boolean r0 = r5 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0232
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
        L_0x0201:
            r0 = r25
            long r5 = r0.objectFieldOffset(r5)
            int r0 = (int) r5
            r12 = r15
            r5 = 0
        L_0x020a:
            int r18 = r20 + 1
            r24[r20] = r9
            int r15 = r18 + 1
            r6 = r8 & 512(0x200, float:7.175E-43)
            r9 = 0
            if (r6 == 0) goto L_0x0217
            r9 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0217:
            r6 = r8 & 256(0x100, float:3.59E-43)
            r8 = 0
            if (r6 == 0) goto L_0x021e
            r8 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x021e:
            r8 = r8 | r9
            int r6 = r7 << 20
            r8 = r8 | r6
            r8 = r8 | r19
            r24[r18] = r8
            int r20 = r15 + 1
            int r5 = r5 << 20
            r5 = r5 | r0
            r24[r15] = r5
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x007b
        L_0x0232:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.reflect.Field r5 = A0T(r14, r5)
            r11[r6] = r5
            goto L_0x0201
        L_0x023b:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.reflect.Field r5 = A0T(r14, r5)
            r11[r12] = r5
            goto L_0x01ee
        L_0x0244:
            int r0 = r12 + 1
            char r4 = r13.charAt(r12)
            if (r4 < r5) goto L_0x0263
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0250:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r5) goto L_0x0260
            int r4 = X.C165597tg.A04(r0, r2, r4)
            int r2 = r2 + 13
            r0 = r1
            goto L_0x0250
        L_0x0260:
            int r0 = r0 << r2
            r4 = r4 | r0
            r0 = r1
        L_0x0263:
            int r3 = r0 + 1
            char r9 = r13.charAt(r0)
            if (r9 < r5) goto L_0x0282
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x026f:
            int r1 = r3 + 1
            char r0 = r13.charAt(r3)
            if (r0 < r5) goto L_0x027f
            int r9 = X.C165597tg.A04(r0, r2, r9)
            int r2 = r2 + 13
            r3 = r1
            goto L_0x026f
        L_0x027f:
            int r0 = r0 << r2
            r9 = r9 | r0
            r3 = r1
        L_0x0282:
            int r0 = r3 + 1
            char r3 = r13.charAt(r3)
            if (r3 < r5) goto L_0x02a1
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x028e:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r5) goto L_0x029e
            int r3 = X.C165597tg.A04(r0, r2, r3)
            int r2 = r2 + 13
            r0 = r1
            goto L_0x028e
        L_0x029e:
            int r0 = r0 << r2
            r3 = r3 | r0
            r0 = r1
        L_0x02a1:
            int r7 = r0 + 1
            char r2 = r13.charAt(r0)
            if (r2 < r5) goto L_0x02c0
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x02ad:
            int r1 = r7 + 1
            char r0 = r13.charAt(r7)
            if (r0 < r5) goto L_0x02bd
            int r2 = X.C165597tg.A04(r0, r6, r2)
            int r6 = r6 + 13
            r7 = r1
            goto L_0x02ad
        L_0x02bd:
            int r0 = r0 << r6
            r2 = r2 | r0
            r7 = r1
        L_0x02c0:
            int r0 = r7 + 1
            char r7 = r13.charAt(r7)
            if (r7 < r5) goto L_0x02df
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x02cc:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r5) goto L_0x02dc
            int r7 = X.C165597tg.A04(r0, r6, r7)
            int r6 = r6 + 13
            r0 = r1
            goto L_0x02cc
        L_0x02dc:
            int r0 = r0 << r6
            r7 = r7 | r0
            r0 = r1
        L_0x02df:
            int r11 = r0 + 1
            char r6 = r13.charAt(r0)
            if (r6 < r5) goto L_0x02fe
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x02eb:
            int r1 = r11 + 1
            char r0 = r13.charAt(r11)
            if (r0 < r5) goto L_0x02fb
            int r6 = X.C165597tg.A04(r0, r10, r6)
            int r10 = r10 + 13
            r11 = r1
            goto L_0x02eb
        L_0x02fb:
            int r0 = r0 << r10
            r6 = r6 | r0
            r11 = r1
        L_0x02fe:
            int r0 = r11 + 1
            char r11 = r13.charAt(r11)
            if (r11 < r5) goto L_0x031d
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x030a:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r5) goto L_0x031a
            int r11 = X.C165597tg.A04(r0, r10, r11)
            int r10 = r10 + 13
            r0 = r1
            goto L_0x030a
        L_0x031a:
            int r0 = r0 << r10
            r11 = r11 | r0
            r0 = r1
        L_0x031d:
            int r12 = r0 + 1
            char r1 = r13.charAt(r0)
            if (r1 < r5) goto L_0x033c
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x0329:
            int r10 = r12 + 1
            char r0 = r13.charAt(r12)
            if (r0 < r5) goto L_0x0339
            int r1 = X.C165597tg.A04(r0, r14, r1)
            int r14 = r14 + 13
            r12 = r10
            goto L_0x0329
        L_0x0339:
            int r0 = r0 << r14
            r1 = r1 | r0
            r12 = r10
        L_0x033c:
            int r0 = r1 + r6
            int r0 = r0 + r11
            int[] r0 = new int[r0]
            r17 = r0
            int r16 = r4 * 2
            int r16 = r16 + r9
            goto L_0x005b
        L_0x0349:
            X.A7l r25 = new X.A7l
            r26 = r40
            r27 = r41
            r28 = r42
            r30 = r43
            r31 = r45
            r32 = r24
            r33 = r17
            r34 = r10
            r35 = r3
            r36 = r2
            r37 = r1
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21074A7l.A0M(X.95q, X.9ff, X.9hI, X.95s, X.9LW, X.9TG):X.A7l");
    }

    private C23073B3d A0N(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.A07;
        C23073B3d b3d = (C23073B3d) objArr[i2];
        if (b3d != null) {
            return b3d;
        }
        C23073B3d A002 = C198739e7.A02.A00((Class) objArr[i2 + 1]);
        objArr[i2] = A002;
        return A002;
    }

    public static C202229lJ A0O(Object obj) {
        C170918Hz r2 = (C170918Hz) obj;
        C202229lJ r1 = r2.unknownFields;
        if (r1 != C202229lJ.A04) {
            return r1;
        }
        C202229lJ r0 = new C202229lJ();
        r2.unknownFields = r0;
        return r0;
    }

    private Object A0Q(AnonymousClass9TG r13, Object obj, Object obj2, Object obj3, int i) {
        int[] iArr = this.A05;
        int i2 = iArr[i];
        Object A0P = A0P(iArr[i + 1], obj);
        if (A0P != null) {
            Object[] objArr = this.A07;
            int i3 = (i / 3) * 2;
            C22900AyC ayC = (C22900AyC) objArr[i3 + 1];
            if (ayC != null) {
                AnonymousClass9LV r4 = ((C192959Jh) objArr[i3]).A00;
                Iterator A10 = C36371kC.A10((AbstractMap) A0P);
                while (A10.hasNext()) {
                    Map.Entry A11 = AnonymousClass000.A11(A10);
                    if (!ayC.BM0(C90484aE.A0G(A11))) {
                        if (obj2 == null) {
                            obj2 = r13.A00(obj3);
                        }
                        Object key = A11.getKey();
                        Object value = A11.getValue();
                        C188558zm r8 = r4.A00;
                        int A002 = C202649mM.A00(r8, key, 1);
                        C188558zm r6 = r4.A01;
                        int A003 = A002 + C202649mM.A00(r6, value, 2);
                        C22898AyA ayA = C21674AUx.A01;
                        byte[] bArr = new byte[A003];
                        AnonymousClass8IA r2 = new AnonymousClass8IA(bArr, A003);
                        try {
                            Object key2 = A11.getKey();
                            Object value2 = A11.getValue();
                            C202649mM.A01(r2, r8, key2, 1);
                            C202649mM.A01(r2, r6, value2, 2);
                            r2.A05();
                            ((C202229lJ) obj2).A02((i2 << 3) | 2, new AnonymousClass8I5(bArr));
                            A10.remove();
                        } catch (IOException e) {
                            throw AnonymousClass001.A0B(e);
                        }
                    }
                }
            }
        }
        return obj2;
    }

    public static List A0V(C21074A7l a7l, Object obj, int i) {
        return a7l.A04.A01(obj, (long) (i & 1048575));
    }

    public static List A0W(Object obj, long j) {
        List list = (List) UnsafeUtil.A02.A09(obj, j);
        AnonymousClass9TG r0 = C203849oy.A02;
        return list;
    }

    private void A0X(C203179nT r5, Object obj, int i) {
        long A0D2;
        Object A0O;
        if ((536870912 & i) != 0) {
            A0D2 = C165597tg.A0D(i);
            A0O = C203179nT.A03(r5).A0Q();
        } else {
            boolean z = this.A0D;
            A0D2 = C165597tg.A0D(i);
            C200279h2 A032 = C203179nT.A03(r5);
            if (z) {
                A0O = A032.A0P();
            } else {
                A0O = A032.A0O();
            }
        }
        UnsafeUtil.A07(obj, A0D2, A0O);
    }

    public static void A0Y(AnonymousClass9TV r1, Object obj, int i) {
        if (obj instanceof String) {
            CodedOutputStream codedOutputStream = r1.A00;
            C1897895p.A07(codedOutputStream, i);
            codedOutputStream.A0K((String) obj);
            return;
        }
        CodedOutputStream codedOutputStream2 = r1.A00;
        C1897895p.A07(codedOutputStream2, i);
        codedOutputStream2.A0H((C21674AUx) obj);
    }

    private void A0Z(AnonymousClass9TV r11, Object obj, int i, int i2) {
        if (obj != null) {
            AnonymousClass9LV r6 = ((C192959Jh) this.A07[(i2 / 3) * 2]).A00;
            CodedOutputStream codedOutputStream = r11.A00;
            Iterator A10 = C36371kC.A10((AbstractMap) obj);
            while (A10.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A10);
                C1897895p.A07(codedOutputStream, i);
                Object key = A11.getKey();
                Object value = A11.getValue();
                C188558zm r4 = r6.A00;
                int A002 = C202649mM.A00(r4, key, 1);
                C188558zm r2 = r6.A01;
                codedOutputStream.A08(A002 + C202649mM.A00(r2, value, 2));
                Object key2 = A11.getKey();
                Object value2 = A11.getValue();
                C202649mM.A01(codedOutputStream, r4, key2, 1);
                C202649mM.A01(codedOutputStream, r2, value2, 2);
            }
        }
    }

    private void A0b(Object obj, int i) {
        int i2 = this.A05[i + 2];
        long j = (long) (1048575 & i2);
        if (j != 1048575) {
            UnsafeUtil.A06(obj, j, (1 << (i2 >>> 20)) | UnsafeUtil.A02.A06(obj, j));
        }
    }

    private void A0c(Object obj, int i, Object obj2) {
        A0F.putObject(obj, C165577te.A0G(this.A05, i), obj2);
        A0b(obj, i);
    }

    public static boolean A0d(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof C170918Hz) {
            return ((C170918Hz) obj).A0t();
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0088, code lost:
        return !r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A0e(java.lang.Object r10, int r11) {
        /*
            r9 = this;
            int[] r8 = r9.A05
            int r0 = r11 + 2
            r7 = r8[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r7
            long r1 = (long) r0
            r6 = 0
            r5 = 1
            r3 = 1048575(0xfffff, double:5.18065E-318)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0089
            int r0 = r11 + 1
            r0 = r8[r0]
            long r1 = X.C165597tg.A0D(r0)
            int r0 = X.C165587tf.A02(r0)
            r3 = 0
            switch(r0) {
                case 0: goto L_0x002a;
                case 1: goto L_0x0039;
                case 2: goto L_0x0046;
                case 3: goto L_0x0046;
                case 4: goto L_0x0051;
                case 5: goto L_0x0046;
                case 6: goto L_0x0051;
                case 7: goto L_0x005a;
                case 8: goto L_0x0061;
                case 9: goto L_0x0096;
                case 10: goto L_0x007c;
                case 11: goto L_0x0051;
                case 12: goto L_0x0051;
                case 13: goto L_0x0051;
                case 14: goto L_0x0046;
                case 15: goto L_0x0051;
                case 16: goto L_0x0046;
                case 17: goto L_0x0096;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalArgumentException r0 = X.C165617ti.A0U()
            throw r0
        L_0x002a:
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            double r0 = r0.A03(r10, r1)
            long r1 = java.lang.Double.doubleToRawLongBits(r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x009d
            goto L_0x009c
        L_0x0039:
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            float r0 = r0.A04(r10, r1)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            if (r0 == 0) goto L_0x009d
            goto L_0x009c
        L_0x0046:
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            long r1 = r0.A07(r10, r1)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x009d
            goto L_0x009c
        L_0x0051:
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            int r0 = r0.A06(r10, r1)
            if (r0 == 0) goto L_0x009d
            goto L_0x009c
        L_0x005a:
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            boolean r0 = r0.A0L(r10, r1)
            return r0
        L_0x0061:
            java.lang.Object r1 = X.AnonymousClass9Yj.A00(r10, r1)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0070
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r1.isEmpty()
            goto L_0x0086
        L_0x0070:
            boolean r0 = r1 instanceof X.C21674AUx
            if (r0 == 0) goto L_0x0077
            X.AUx r0 = X.C21674AUx.A00
            goto L_0x0082
        L_0x0077:
            java.lang.IllegalArgumentException r0 = X.C165617ti.A0U()
            throw r0
        L_0x007c:
            X.AUx r0 = X.C21674AUx.A00
            java.lang.Object r1 = X.AnonymousClass9Yj.A00(r10, r1)
        L_0x0082:
            boolean r0 = r0.equals(r1)
        L_0x0086:
            r0 = r0 ^ 1
            return r0
        L_0x0089:
            int r0 = r7 >>> 20
            int r5 = r5 << r0
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            int r0 = r0.A06(r10, r1)
            r0 = r0 & r5
            if (r0 == 0) goto L_0x009d
            goto L_0x009c
        L_0x0096:
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r10, r1)
            if (r0 == 0) goto L_0x009d
        L_0x009c:
            r6 = 1
        L_0x009d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21074A7l.A0e(java.lang.Object, int):boolean");
    }

    private boolean A0f(Object obj, int i, int i2) {
        return AnonymousClass000.A1S(UnsafeUtil.A02.A06(obj, C165577te.A0H(this.A05, i2)), i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008c, code lost:
        r14 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0142, code lost:
        r13.putObject(r8, r9, r6.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0192, code lost:
        r13.putInt(r8, r9, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x019e, code lost:
        r13.putLong(r8, r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b9, code lost:
        r7 = r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01d0, code lost:
        r7 = r2 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01d2, code lost:
        r15 = r15 | r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d4, code lost:
        r9 = r19;
        r14 = r17;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0092 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0g(X.C197909ca r38, java.lang.Object r39, byte[] r40, int r41, int r42, int r43) {
        /*
            r37 = this;
            r8 = r39
            r7 = r41
            A0a(r8)
            sun.misc.Unsafe r13 = A0F
            r9 = -1
            r3 = 0
            r11 = 0
            r15 = 0
            r14 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0010:
            r2 = r7
            r4 = r37
            r36 = r42
            r0 = r36
            r20 = r43
            if (r7 >= r0) goto L_0x0094
            int r2 = r7 + 1
            r5 = r40
            byte r11 = r40[r7]
            r6 = r38
            if (r11 >= 0) goto L_0x002b
            int r2 = A0F(r6, r5, r11, r2)
            int r11 = r6.A00
        L_0x002b:
            int r19 = r11 >>> 3
            r7 = r11 & 7
            r1 = 3
            r0 = r19
            if (r0 <= r9) goto L_0x02cb
            int r3 = r3 / r1
            int r1 = r4.A02
            if (r0 < r1) goto L_0x02c8
            int r1 = r4.A01
            if (r0 > r1) goto L_0x02c8
            int[] r10 = r4.A05
            int r0 = r10.length
            int r0 = r0 / 3
            int r9 = r0 + -1
        L_0x0044:
            if (r3 > r9) goto L_0x02c8
            int r0 = r9 + r3
            int r16 = r0 >>> 1
            int r12 = r16 * 3
            r1 = r10[r12]
            r0 = r19
            if (r0 != r1) goto L_0x02be
            r3 = r12
        L_0x0053:
            r0 = -1
            if (r3 == r0) goto L_0x02c8
            int[] r1 = r4.A05
            int r0 = r3 + 1
            r18 = r1[r0]
            int r12 = X.C165587tf.A02(r18)
            long r9 = X.C165597tg.A0D(r18)
            r0 = 17
            if (r12 > r0) goto L_0x01de
            int r0 = r3 + 2
            r17 = r1[r0]
            int r0 = r17 >>> 20
            r16 = 1
            int r16 = r16 << r0
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r17 = r17 & r1
            r0 = r17
            if (r0 == r14) goto L_0x01da
            if (r14 == r1) goto L_0x0081
            long r0 = (long) r14
            r13.putInt(r8, r0, r15)
        L_0x0081:
            r0 = r17
            long r0 = (long) r0
            int r15 = r13.getInt(r8, r0)
        L_0x0088:
            r0 = 5
            switch(r12) {
                case 0: goto L_0x01bc;
                case 1: goto L_0x01aa;
                case 2: goto L_0x0196;
                case 3: goto L_0x0196;
                case 4: goto L_0x018a;
                case 5: goto L_0x0179;
                case 6: goto L_0x016f;
                case 7: goto L_0x0159;
                case 8: goto L_0x012b;
                case 9: goto L_0x010d;
                case 10: goto L_0x0105;
                case 11: goto L_0x018a;
                case 12: goto L_0x00e4;
                case 13: goto L_0x016f;
                case 14: goto L_0x0179;
                case 15: goto L_0x00d6;
                case 16: goto L_0x00c8;
                case 17: goto L_0x0296;
                default: goto L_0x008c;
            }
        L_0x008c:
            r14 = r17
        L_0x008e:
            r0 = r20
            if (r11 != r0) goto L_0x00b4
            if (r43 == 0) goto L_0x00b4
        L_0x0094:
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r14 == r0) goto L_0x009d
            long r0 = (long) r14
            r13.putInt(r8, r0, r15)
        L_0x009d:
            r3 = 0
            int r1 = r4.A00
        L_0x00a0:
            int r0 = r4.A03
            if (r1 >= r0) goto L_0x02d1
            int[] r0 = r4.A06
            r9 = r0[r1]
            X.9TG r0 = r4.A0C
            r5 = r0
            r6 = r8
            r7 = r3
            java.lang.Object r3 = r4.A0Q(r5, r6, r7, r8, r9)
            int r1 = r1 + 1
            goto L_0x00a0
        L_0x00b4:
            X.9lJ r21 = A0O(r8)
            r20 = r6
            r22 = r5
            r25 = r36
            r23 = r11
            r24 = r2
            int r7 = A06(r20, r21, r22, r23, r24, r25)
            goto L_0x02ba
        L_0x00c8:
            if (r7 != 0) goto L_0x008c
            int r7 = A0E(r6, r5, r2)
            long r0 = r6.A01
            long r0 = X.C165567td.A06(r0)
            goto L_0x019e
        L_0x00d6:
            if (r7 != 0) goto L_0x008c
            int r7 = A0D(r6, r5, r2)
            int r0 = r6.A00
            int r2 = X.C165597tg.A02(r0)
            goto L_0x0192
        L_0x00e4:
            if (r7 != 0) goto L_0x008c
            int r7 = A0D(r6, r5, r2)
            int r2 = r6.A00
            X.AyC r0 = A0L(r4, r3)
            if (r0 == 0) goto L_0x0192
            boolean r0 = r0.BM0(r2)
            if (r0 != 0) goto L_0x0192
            X.9lJ r1 = A0O(r8)
            java.lang.Long r0 = X.C36441kJ.A0y(r2)
            r1.A02(r11, r0)
            goto L_0x01d4
        L_0x0105:
            r0 = 2
            if (r7 != r0) goto L_0x008c
            int r7 = A0B(r6, r5, r2)
            goto L_0x0142
        L_0x010d:
            r0 = 2
            if (r7 != r0) goto L_0x008c
            java.lang.Object r0 = r4.A0R(r8, r3)
            X.B3d r21 = r4.A0N(r3)
            r20 = r6
            r23 = r5
            r25 = r36
            r22 = r0
            r24 = r2
            int r7 = A03(r20, r21, r22, r23, r24, r25)
            r4.A0c(r8, r3, r0)
            goto L_0x01d2
        L_0x012b:
            r0 = 2
            if (r7 != r0) goto L_0x008c
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r18
            if (r0 != 0) goto L_0x0154
            int r7 = A0D(r6, r5, r2)
            int r2 = r6.A00
            if (r2 < 0) goto L_0x02ee
            if (r2 != 0) goto L_0x0149
            java.lang.String r0 = ""
            r6.A02 = r0
        L_0x0142:
            java.lang.Object r0 = r6.A02
            r13.putObject(r8, r9, r0)
            goto L_0x01d2
        L_0x0149:
            java.nio.charset.Charset r1 = X.AnonymousClass9BD.A04
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r7, r2, r1)
            r6.A02 = r0
            int r7 = r7 + r2
            goto L_0x0142
        L_0x0154:
            int r7 = A0C(r6, r5, r2)
            goto L_0x0142
        L_0x0159:
            if (r7 != 0) goto L_0x008c
            int r7 = A0E(r6, r5, r2)
            long r0 = r6.A01
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r2)
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            r0.A0H(r8, r9, r1)
            goto L_0x01d2
        L_0x016f:
            if (r7 != r0) goto L_0x008c
            int r0 = X.C165567td.A04(r5, r2)
            r13.putInt(r8, r9, r0)
            goto L_0x01b9
        L_0x0179:
            r0 = 1
            if (r7 != r0) goto L_0x008c
            long r24 = X.C165567td.A0A(r5, r2)
            r20 = r13
            r21 = r8
            r22 = r9
            r20.putLong(r21, r22, r24)
            goto L_0x01d0
        L_0x018a:
            if (r7 != 0) goto L_0x008c
            int r7 = A0D(r6, r5, r2)
            int r2 = r6.A00
        L_0x0192:
            r13.putInt(r8, r9, r2)
            goto L_0x01d2
        L_0x0196:
            if (r7 != 0) goto L_0x008c
            int r7 = A0E(r6, r5, r2)
            long r0 = r6.A01
        L_0x019e:
            r20 = r13
            r21 = r8
            r22 = r9
            r24 = r0
            r20.putLong(r21, r22, r24)
            goto L_0x01d2
        L_0x01aa:
            if (r7 != r0) goto L_0x008c
            int r0 = X.C165567td.A04(r5, r2)
            float r1 = java.lang.Float.intBitsToFloat(r0)
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            r0.A0D(r8, r9, r1)
        L_0x01b9:
            int r7 = r2 + 4
            goto L_0x01d2
        L_0x01bc:
            r0 = 1
            if (r7 != r0) goto L_0x008c
            long r0 = X.C165567td.A0A(r5, r2)
            double r24 = java.lang.Double.longBitsToDouble(r0)
            X.9Yj r20 = com.google.protobuf.UnsafeUtil.A02
            r21 = r8
            r22 = r9
            r20.A0C(r21, r22, r24)
        L_0x01d0:
            int r7 = r2 + 8
        L_0x01d2:
            r15 = r15 | r16
        L_0x01d4:
            r9 = r19
            r14 = r17
            goto L_0x0010
        L_0x01da:
            r17 = r14
            goto L_0x0088
        L_0x01de:
            r0 = 27
            if (r12 != r0) goto L_0x0231
            r0 = 2
            if (r7 != r0) goto L_0x008e
            java.lang.Object r1 = r13.getObject(r8, r9)
            X.B6c r1 = (X.C23122B6c) r1
            r0 = r1
            X.AcE r0 = (X.C21886AcE) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0203
            int r7 = r1.size()
            int r0 = r7 * 2
            if (r7 != 0) goto L_0x01fc
            r0 = 10
        L_0x01fc:
            X.B6c r1 = r1.BQ1(r0)
            r13.putObject(r8, r9, r1)
        L_0x0203:
            X.B3d r4 = r4.A0N(r3)
        L_0x0207:
            X.8Hz r0 = r4.BQ8()
            r20 = r6
            r23 = r5
            r25 = r36
            r21 = r4
            r22 = r0
            r24 = r2
            int r7 = A03(r20, r21, r22, r23, r24, r25)
            r4.BP1(r0)
            r6.A02 = r0
            r1.add(r0)
            r0 = r36
            if (r7 >= r0) goto L_0x02ba
            int r2 = A0D(r6, r5, r7)
            int r0 = r6.A00
            if (r11 == r0) goto L_0x0207
            goto L_0x02ba
        L_0x0231:
            r0 = 49
            if (r12 > r0) goto L_0x025b
            r0 = r18
            long r0 = (long) r0
            r24 = r5
            r26 = r36
            r22 = r6
            r29 = r7
            r30 = r3
            r31 = r12
            r32 = r0
            r34 = r9
            r21 = r4
            r23 = r8
            r25 = r2
            r27 = r11
            r28 = r19
            int r7 = r21.A09(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34)
        L_0x0256:
            if (r7 != r2) goto L_0x02ba
            r2 = r7
            goto L_0x008e
        L_0x025b:
            r0 = 50
            if (r12 != r0) goto L_0x0277
            r0 = 2
            if (r7 != r0) goto L_0x008e
            r22 = r6
            r24 = r5
            r26 = r36
            r21 = r4
            r23 = r8
            r25 = r2
            r27 = r3
            r28 = r9
            int r7 = r21.A0A(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0256
        L_0x0277:
            r24 = r5
            r26 = r36
            r22 = r6
            r29 = r7
            r30 = r18
            r31 = r12
            r32 = r3
            r33 = r9
            r21 = r4
            r23 = r8
            r25 = r2
            r27 = r11
            r28 = r19
            int r7 = r21.A08(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x0256
        L_0x0296:
            r0 = 3
            if (r7 != r0) goto L_0x008c
            java.lang.Object r1 = r4.A0R(r8, r3)
            int r0 = r19 << 3
            r26 = r0 | 4
            X.B3d r21 = r4.A0N(r3)
            r20 = r6
            r23 = r5
            r25 = r36
            r22 = r1
            r24 = r2
            int r7 = A04(r20, r21, r22, r23, r24, r25, r26)
            r4.A0c(r8, r3, r1)
            r15 = r15 | r16
            r14 = r17
        L_0x02ba:
            r9 = r19
            goto L_0x0010
        L_0x02be:
            if (r0 >= r1) goto L_0x02c4
            int r9 = r16 + -1
            goto L_0x0044
        L_0x02c4:
            int r3 = r16 + 1
            goto L_0x0044
        L_0x02c8:
            r3 = 0
            goto L_0x008e
        L_0x02cb:
            int r3 = r4.A00(r0)
            goto L_0x0053
        L_0x02d1:
            if (r3 == 0) goto L_0x02d9
            X.9lJ r3 = (X.C202229lJ) r3
            X.8Hz r8 = (X.C170918Hz) r8
            r8.unknownFields = r3
        L_0x02d9:
            r0 = r36
            if (r43 != 0) goto L_0x02e0
            if (r2 != r0) goto L_0x02e7
            return r2
        L_0x02e0:
            if (r2 > r0) goto L_0x02e7
            r0 = r20
            if (r11 != r0) goto L_0x02e7
            return r2
        L_0x02e7:
            java.lang.String r0 = "Failed to parse the message."
            X.186 r0 = X.C165617ti.A0L(r0)
            throw r0
        L_0x02ee:
            X.186 r0 = X.C165597tg.A0L()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21074A7l.A0g(X.9ca, java.lang.Object, byte[], int, int, int):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a6, code lost:
        if (r4 != r0) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c8, code lost:
        if (r8 != r1) goto L_0x00dc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean B6j(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            int[] r7 = r11.A05
            int r6 = r7.length
            r10 = 0
            r5 = 0
        L_0x0005:
            if (r5 >= r6) goto L_0x00cc
            int r0 = r5 + 1
            r0 = r7[r0]
            long r2 = X.C165597tg.A0D(r0)
            int r0 = X.C165587tf.A02(r0)
            switch(r0) {
                case 0: goto L_0x00aa;
                case 1: goto L_0x008a;
                case 2: goto L_0x0075;
                case 3: goto L_0x0075;
                case 4: goto L_0x0060;
                case 5: goto L_0x0075;
                case 6: goto L_0x0060;
                case 7: goto L_0x004b;
                case 8: goto L_0x002a;
                case 9: goto L_0x002a;
                case 10: goto L_0x002a;
                case 11: goto L_0x0060;
                case 12: goto L_0x0060;
                case 13: goto L_0x0060;
                case 14: goto L_0x0075;
                case 15: goto L_0x0060;
                case 16: goto L_0x0075;
                case 17: goto L_0x002a;
                case 18: goto L_0x0034;
                case 19: goto L_0x0034;
                case 20: goto L_0x0034;
                case 21: goto L_0x0034;
                case 22: goto L_0x0034;
                case 23: goto L_0x0034;
                case 24: goto L_0x0034;
                case 25: goto L_0x0034;
                case 26: goto L_0x0034;
                case 27: goto L_0x0034;
                case 28: goto L_0x0034;
                case 29: goto L_0x0034;
                case 30: goto L_0x0034;
                case 31: goto L_0x0034;
                case 32: goto L_0x0034;
                case 33: goto L_0x0034;
                case 34: goto L_0x0034;
                case 35: goto L_0x0034;
                case 36: goto L_0x0034;
                case 37: goto L_0x0034;
                case 38: goto L_0x0034;
                case 39: goto L_0x0034;
                case 40: goto L_0x0034;
                case 41: goto L_0x0034;
                case 42: goto L_0x0034;
                case 43: goto L_0x0034;
                case 44: goto L_0x0034;
                case 45: goto L_0x0034;
                case 46: goto L_0x0034;
                case 47: goto L_0x0034;
                case 48: goto L_0x0034;
                case 49: goto L_0x0034;
                case 50: goto L_0x0034;
                case 51: goto L_0x0019;
                case 52: goto L_0x0019;
                case 53: goto L_0x0019;
                case 54: goto L_0x0019;
                case 55: goto L_0x0019;
                case 56: goto L_0x0019;
                case 57: goto L_0x0019;
                case 58: goto L_0x0019;
                case 59: goto L_0x0019;
                case 60: goto L_0x0019;
                case 61: goto L_0x0019;
                case 62: goto L_0x0019;
                case 63: goto L_0x0019;
                case 64: goto L_0x0019;
                case 65: goto L_0x0019;
                case 66: goto L_0x0019;
                case 67: goto L_0x0019;
                case 68: goto L_0x0019;
                default: goto L_0x0016;
            }
        L_0x0016:
            int r5 = r5 + 3
            goto L_0x0005
        L_0x0019:
            long r0 = X.C165577te.A0H(r7, r5)
            X.9Yj r8 = com.google.protobuf.UnsafeUtil.A02
            int r4 = r8.A06(r12, r0)
            int r0 = r8.A06(r13, r0)
            if (r4 != r0) goto L_0x00dc
            goto L_0x0034
        L_0x002a:
            boolean r1 = r11.A0e(r12, r5)
            boolean r0 = r11.A0e(r13, r5)
            if (r1 != r0) goto L_0x00dc
        L_0x0034:
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            java.lang.Object r4 = r0.A09(r12, r2)
            java.lang.Object r1 = r0.A09(r13, r2)
            X.9TG r0 = X.C203849oy.A02
            if (r4 == r1) goto L_0x0016
            if (r4 == 0) goto L_0x00dc
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L_0x00dc
            goto L_0x0016
        L_0x004b:
            boolean r1 = r11.A0e(r12, r5)
            boolean r0 = r11.A0e(r13, r5)
            if (r1 != r0) goto L_0x00dc
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            boolean r4 = r0.A0L(r12, r2)
            boolean r0 = r0.A0L(r13, r2)
            goto L_0x00a6
        L_0x0060:
            boolean r1 = r11.A0e(r12, r5)
            boolean r0 = r11.A0e(r13, r5)
            if (r1 != r0) goto L_0x00dc
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            int r4 = r0.A06(r12, r2)
            int r0 = r0.A06(r13, r2)
            goto L_0x00a6
        L_0x0075:
            boolean r1 = r11.A0e(r12, r5)
            boolean r0 = r11.A0e(r13, r5)
            if (r1 != r0) goto L_0x00dc
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            long r8 = r0.A07(r12, r2)
            long r1 = r0.A07(r13, r2)
            goto L_0x00c6
        L_0x008a:
            boolean r1 = r11.A0e(r12, r5)
            boolean r0 = r11.A0e(r13, r5)
            if (r1 != r0) goto L_0x00dc
            X.9Yj r1 = com.google.protobuf.UnsafeUtil.A02
            float r0 = r1.A04(r12, r2)
            int r4 = java.lang.Float.floatToIntBits(r0)
            float r0 = r1.A04(r13, r2)
            int r0 = java.lang.Float.floatToIntBits(r0)
        L_0x00a6:
            if (r4 != r0) goto L_0x00dc
            goto L_0x0016
        L_0x00aa:
            boolean r1 = r11.A0e(r12, r5)
            boolean r0 = r11.A0e(r13, r5)
            if (r1 != r0) goto L_0x00dc
            X.9Yj r4 = com.google.protobuf.UnsafeUtil.A02
            double r0 = r4.A03(r12, r2)
            long r8 = java.lang.Double.doubleToLongBits(r0)
            double r0 = r4.A03(r13, r2)
            long r1 = java.lang.Double.doubleToLongBits(r0)
        L_0x00c6:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00dc
            goto L_0x0016
        L_0x00cc:
            X.8Hz r12 = (X.C170918Hz) r12
            X.9lJ r1 = r12.unknownFields
            X.8Hz r13 = (X.C170918Hz) r13
            X.9lJ r0 = r13.unknownFields
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r0 = 1
            return r0
        L_0x00dc:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21074A7l.B6j(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0314, code lost:
        if (r0 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0316, code lost:
        r8 = X.C1897895p.A05(r7) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0322, code lost:
        if (r0 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0324, code lost:
        r8 = X.C1897895p.A05(r7) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x033c, code lost:
        if (r1 >= 0) goto L_0x0402;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x035c, code lost:
        if (r0 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x035e, code lost:
        r0 = com.google.protobuf.CodedOutputStream.A01;
        r8 = X.C1897895p.A05(r7);
        r1 = ((X.C21674AUx) X.AnonymousClass9Yj.A00(r6, r1)).A02();
        r8 = r8 + (X.C165567td.A00(r1) + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x037a, code lost:
        if (r0 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x037c, code lost:
        r2 = X.AnonymousClass9Yj.A00(r6, r1);
        r1 = A0N(r3);
        r0 = X.C203849oy.A02;
        r8 = X.C1897895p.A05(r7);
        r1 = ((X.C21070A7h) ((X.B63) r2)).A0k(r1);
        r0 = com.google.protobuf.CodedOutputStream.A01;
        r8 = r8 + (X.C165567td.A00(r1) + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03a0, code lost:
        if (r0 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03a2, code lost:
        r1 = X.AnonymousClass9Yj.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03a8, code lost:
        if ((r1 instanceof X.C21674AUx) == false) goto L_0x03be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03aa, code lost:
        r0 = com.google.protobuf.CodedOutputStream.A01;
        r8 = X.C1897895p.A05(r7);
        r1 = ((X.C21674AUx) r1).A02();
        r8 = r8 + (X.C165567td.A00(r1) + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03be, code lost:
        r8 = X.C1897895p.A05(r7);
        r0 = com.google.protobuf.CodedOutputStream.A02((java.lang.String) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03cd, code lost:
        if (r0 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03cf, code lost:
        r8 = X.C1897895p.A05(r7) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03da, code lost:
        if (r0 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03dc, code lost:
        r8 = X.C1897895p.A05(r7) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03e7, code lost:
        if (r0 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03e9, code lost:
        r8 = X.C1897895p.A05(r7) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0400, code lost:
        if (r1 >= 0) goto L_0x0402;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0402, code lost:
        r0 = com.google.protobuf.CodedOutputStream.A01;
        r0 = X.C165567td.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0409, code lost:
        r0 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0435, code lost:
        r8 = r8 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x043b, code lost:
        if (r0 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x043d, code lost:
        r8 = X.C1897895p.A05(r7) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0448, code lost:
        if (r0 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x044a, code lost:
        r8 = X.C1897895p.A05(r7) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0450, code lost:
        r16 = r16 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04e3, code lost:
        if (r1 >= 0) goto L_0x0864;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x053f, code lost:
        if (r1 >= 0) goto L_0x0864;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05fc, code lost:
        if (r2 <= 0) goto L_0x0488;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05fe, code lost:
        r1 = X.C1897895p.A05(r8);
        r0 = com.google.protobuf.CodedOutputStream.A01;
        r1 = (r1 + X.C165567td.A00(r2)) + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x072d, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x074b, code lost:
        if (r0 == false) goto L_0x0488;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x074d, code lost:
        r1 = A0N(r3);
        r9 = X.C1897895p.A05(r8) * 2;
        r0 = ((X.C21070A7h) ((X.B63) r4.getObject(r6, r1))).A0k(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x078f, code lost:
        if (r0 == false) goto L_0x0488;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0791, code lost:
        r9 = X.C1897895p.A05(r8) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x079b, code lost:
        if (r0 == false) goto L_0x0488;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x079d, code lost:
        r1 = X.C1897895p.A05(r8) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x07a3, code lost:
        r16 = r16 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x07b3, code lost:
        if (r1 >= 0) goto L_0x0864;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x07cd, code lost:
        if (r0 == false) goto L_0x0488;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x07cf, code lost:
        r0 = com.google.protobuf.CodedOutputStream.A01;
        r9 = X.C1897895p.A05(r8);
        r1 = ((X.C21674AUx) r4.getObject(r6, r1)).A02();
        r9 = r9 + (X.C165567td.A00(r1) + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x07e9, code lost:
        if (r0 == false) goto L_0x0488;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x07eb, code lost:
        r2 = r4.getObject(r6, r1);
        r1 = A0N(r3);
        r0 = X.C203849oy.A02;
        r9 = X.C1897895p.A05(r8);
        r1 = ((X.C21070A7h) ((X.B63) r2)).A0k(r1);
        r0 = com.google.protobuf.CodedOutputStream.A01;
        r9 = r9 + (X.C165567td.A00(r1) + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x080d, code lost:
        if (r0 == false) goto L_0x0488;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x080f, code lost:
        r1 = r4.getObject(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0815, code lost:
        if ((r1 instanceof X.C21674AUx) == false) goto L_0x082a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0817, code lost:
        r0 = com.google.protobuf.CodedOutputStream.A01;
        r9 = X.C1897895p.A05(r8);
        r1 = ((X.C21674AUx) r1).A02();
        r9 = r9 + (X.C165567td.A00(r1) + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x082a, code lost:
        r9 = X.C1897895p.A05(r8);
        r0 = com.google.protobuf.CodedOutputStream.A02((java.lang.String) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0837, code lost:
        if (r0 == false) goto L_0x0488;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0839, code lost:
        r9 = X.C1897895p.A05(r8) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x084d, code lost:
        if (r0 == false) goto L_0x0488;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x084f, code lost:
        r9 = X.C1897895p.A05(r8) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0862, code lost:
        if (r1 >= 0) goto L_0x0864;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0864, code lost:
        r0 = com.google.protobuf.CodedOutputStream.A01;
        r0 = X.C165567td.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x086b, code lost:
        r0 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x088f, code lost:
        r9 = r9 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0893, code lost:
        if (r0 == false) goto L_0x0488;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0895, code lost:
        r9 = X.C1897895p.A05(r8) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x089e, code lost:
        if (r0 == false) goto L_0x0488;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x08a0, code lost:
        r9 = X.C1897895p.A05(r8) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012d, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01b3, code lost:
        if (r1 >= 0) goto L_0x0402;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0207, code lost:
        if (r1 >= 0) goto L_0x0402;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02b2, code lost:
        if (r1 <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02b4, code lost:
        r8 = X.C1897895p.A05(r7);
        r0 = com.google.protobuf.CodedOutputStream.A01;
        r8 = (r8 + X.C165567td.A00(r1)) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02c6, code lost:
        if (r0 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02c8, code lost:
        r1 = A0N(r3);
        r8 = X.C1897895p.A05(r7) * 2;
        r0 = ((X.C21070A7h) ((X.B63) X.AnonymousClass9Yj.A00(r6, r1))).A0k(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int BHM(java.lang.Object r18) {
        /*
            r17 = this;
            r6 = r18
            r5 = r17
            boolean r0 = r5.A0E
            sun.misc.Unsafe r4 = A0F
            if (r0 == 0) goto L_0x0454
            r3 = 0
            r16 = 0
        L_0x000d:
            int[] r1 = r5.A05
            int r0 = r1.length
            if (r3 >= r0) goto L_0x08ad
            int r0 = r3 + 1
            r0 = r1[r0]
            int r8 = X.C165587tf.A02(r0)
            r7 = r1[r3]
            long r1 = X.C165597tg.A0D(r0)
            X.8yH[] r0 = X.C187658yH.A00
            switch(r8) {
                case 0: goto L_0x0444;
                case 1: goto L_0x0437;
                case 2: goto L_0x0421;
                case 3: goto L_0x040c;
                case 4: goto L_0x03f0;
                case 5: goto L_0x03e3;
                case 6: goto L_0x03d6;
                case 7: goto L_0x03c9;
                case 8: goto L_0x039c;
                case 9: goto L_0x0376;
                case 10: goto L_0x0358;
                case 11: goto L_0x0340;
                case 12: goto L_0x032c;
                case 13: goto L_0x031e;
                case 14: goto L_0x0310;
                case 15: goto L_0x02fa;
                case 16: goto L_0x02e0;
                case 17: goto L_0x02c2;
                case 18: goto L_0x0106;
                case 19: goto L_0x00f3;
                case 20: goto L_0x00db;
                case 21: goto L_0x00c7;
                case 22: goto L_0x00b3;
                case 23: goto L_0x0106;
                case 24: goto L_0x00f3;
                case 25: goto L_0x00a0;
                case 26: goto L_0x0094;
                case 27: goto L_0x0084;
                case 28: goto L_0x0078;
                case 29: goto L_0x0064;
                case 30: goto L_0x0050;
                case 31: goto L_0x00f3;
                case 32: goto L_0x0106;
                case 33: goto L_0x003c;
                case 34: goto L_0x0028;
                case 35: goto L_0x02a8;
                case 36: goto L_0x029d;
                case 37: goto L_0x0292;
                case 38: goto L_0x0287;
                case 39: goto L_0x027c;
                case 40: goto L_0x02a8;
                case 41: goto L_0x029d;
                case 42: goto L_0x0273;
                case 43: goto L_0x0268;
                case 44: goto L_0x025d;
                case 45: goto L_0x029d;
                case 46: goto L_0x02a8;
                case 47: goto L_0x0252;
                case 48: goto L_0x0247;
                case 49: goto L_0x0119;
                case 50: goto L_0x0149;
                case 51: goto L_0x0241;
                case 52: goto L_0x023b;
                case 53: goto L_0x0223;
                case 54: goto L_0x020b;
                case 55: goto L_0x01f5;
                case 56: goto L_0x01ef;
                case 57: goto L_0x01e9;
                case 58: goto L_0x01e3;
                case 59: goto L_0x01dd;
                case 60: goto L_0x01d7;
                case 61: goto L_0x01d1;
                case 62: goto L_0x01b7;
                case 63: goto L_0x01a1;
                case 64: goto L_0x019b;
                case 65: goto L_0x0195;
                case 66: goto L_0x017d;
                case 67: goto L_0x0161;
                case 68: goto L_0x015b;
                default: goto L_0x0025;
            }
        L_0x0025:
            int r3 = r3 + 3
            goto L_0x000d
        L_0x0028:
            java.util.List r0 = A0W(r6, r1)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x012d
            int r0 = X.C203849oy.A05(r0)
            int r8 = A01(r7, r1, r0)
            goto L_0x0450
        L_0x003c:
            java.util.List r0 = A0W(r6, r1)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x012d
            int r0 = X.C203849oy.A04(r0)
            int r8 = A01(r7, r1, r0)
            goto L_0x0450
        L_0x0050:
            java.util.List r0 = A0W(r6, r1)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x012d
            int r0 = X.C203849oy.A01(r0)
            int r8 = A01(r7, r1, r0)
            goto L_0x0450
        L_0x0064:
            java.util.List r0 = A0W(r6, r1)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x012d
            int r0 = X.C203849oy.A06(r0)
            int r8 = A01(r7, r1, r0)
            goto L_0x0450
        L_0x0078:
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r8 = X.C203849oy.A08(r0, r7)
            goto L_0x0450
        L_0x0084:
            java.lang.Object r1 = X.AnonymousClass9Yj.A00(r6, r1)
            java.util.List r1 = (java.util.List) r1
            X.B3d r0 = r5.A0N(r3)
            int r8 = X.C203849oy.A00(r0, r1, r7)
            goto L_0x0450
        L_0x0094:
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r8 = X.C203849oy.A09(r0, r7)
            goto L_0x0450
        L_0x00a0:
            java.util.List r0 = A0W(r6, r1)
            int r8 = r0.size()
            if (r8 == 0) goto L_0x012d
            int r0 = X.C1897895p.A05(r7)
            int r0 = r0 + 1
            int r8 = r8 * r0
            goto L_0x0450
        L_0x00b3:
            java.util.List r0 = A0W(r6, r1)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x012d
            int r0 = X.C203849oy.A02(r0)
            int r8 = A01(r7, r1, r0)
            goto L_0x0450
        L_0x00c7:
            java.util.List r0 = A0W(r6, r1)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x012d
            int r0 = X.C203849oy.A07(r0)
            int r8 = A01(r7, r1, r0)
            goto L_0x0450
        L_0x00db:
            java.util.List r2 = A0W(r6, r1)
            int r0 = r2.size()
            if (r0 == 0) goto L_0x012d
            int r1 = X.C203849oy.A03(r2)
            int r0 = r2.size()
            int r8 = A01(r7, r0, r1)
            goto L_0x0450
        L_0x00f3:
            java.util.List r0 = A0W(r6, r1)
            int r8 = r0.size()
            if (r8 == 0) goto L_0x012d
            int r0 = X.C1897895p.A05(r7)
            int r0 = r0 + 4
            int r8 = r8 * r0
            goto L_0x0450
        L_0x0106:
            java.util.List r0 = A0W(r6, r1)
            int r8 = r0.size()
            if (r8 == 0) goto L_0x012d
            int r0 = X.C1897895p.A05(r7)
            int r0 = r0 + 8
            int r8 = r8 * r0
            goto L_0x0450
        L_0x0119:
            java.lang.Object r12 = X.AnonymousClass9Yj.A00(r6, r1)
            java.util.List r12 = (java.util.List) r12
            X.B3d r11 = r5.A0N(r3)
            X.9TG r0 = X.C203849oy.A02
            int r10 = r12.size()
            r9 = 0
            r8 = 0
            if (r10 != 0) goto L_0x0130
        L_0x012d:
            r8 = 0
            goto L_0x0450
        L_0x0130:
            if (r9 >= r10) goto L_0x0450
            java.lang.Object r2 = r12.get(r9)
            X.B63 r2 = (X.B63) r2
            int r0 = X.C1897895p.A05(r7)
            int r1 = r0 * 2
            X.A7h r2 = (X.C21070A7h) r2
            int r0 = r2.A0k(r11)
            int r1 = r1 + r0
            int r8 = r8 + r1
            int r9 = r9 + 1
            goto L_0x0130
        L_0x0149:
            java.lang.Object r2 = X.AnonymousClass9Yj.A00(r6, r1)
            java.lang.Object[] r1 = r5.A07
            int r0 = r3 / 3
            int r0 = r0 * 2
            r0 = r1[r0]
            int r8 = X.C200369hI.A00(r2, r0, r7)
            goto L_0x0450
        L_0x015b:
            boolean r0 = r5.A0f(r6, r7, r3)
            goto L_0x02c6
        L_0x0161:
            boolean r0 = r5.A0f(r6, r7, r3)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r1)
            long r0 = X.C36431kI.A09(r0)
            int r8 = X.C1897895p.A05(r7)
            long r0 = X.C165567td.A05(r0)
            int r0 = com.google.protobuf.CodedOutputStream.A01(r0)
            goto L_0x0435
        L_0x017d:
            boolean r0 = r5.A0f(r6, r7, r3)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r1)
            int r0 = X.AnonymousClass000.A0I(r0)
            int r8 = X.C1897895p.A05(r7)
            int r0 = X.C1897895p.A06(r0)
            goto L_0x0435
        L_0x0195:
            boolean r0 = r5.A0f(r6, r7, r3)
            goto L_0x0314
        L_0x019b:
            boolean r0 = r5.A0f(r6, r7, r3)
            goto L_0x0322
        L_0x01a1:
            boolean r0 = r5.A0f(r6, r7, r3)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r1)
            int r1 = X.AnonymousClass000.A0I(r0)
            int r8 = X.C1897895p.A05(r7)
            if (r1 < 0) goto L_0x0409
            goto L_0x0402
        L_0x01b7:
            boolean r0 = r5.A0f(r6, r7, r3)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r1)
            int r1 = X.AnonymousClass000.A0I(r0)
            int r8 = X.C1897895p.A05(r7)
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.C165567td.A00(r1)
            goto L_0x0435
        L_0x01d1:
            boolean r0 = r5.A0f(r6, r7, r3)
            goto L_0x035c
        L_0x01d7:
            boolean r0 = r5.A0f(r6, r7, r3)
            goto L_0x037a
        L_0x01dd:
            boolean r0 = r5.A0f(r6, r7, r3)
            goto L_0x03a0
        L_0x01e3:
            boolean r0 = r5.A0f(r6, r7, r3)
            goto L_0x03cd
        L_0x01e9:
            boolean r0 = r5.A0f(r6, r7, r3)
            goto L_0x03da
        L_0x01ef:
            boolean r0 = r5.A0f(r6, r7, r3)
            goto L_0x03e7
        L_0x01f5:
            boolean r0 = r5.A0f(r6, r7, r3)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r1)
            int r1 = X.AnonymousClass000.A0I(r0)
            int r8 = X.C1897895p.A05(r7)
            if (r1 < 0) goto L_0x0409
            goto L_0x0402
        L_0x020b:
            boolean r0 = r5.A0f(r6, r7, r3)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r1)
            long r0 = X.C36431kI.A09(r0)
            int r8 = X.C1897895p.A05(r7)
            int r0 = com.google.protobuf.CodedOutputStream.A01(r0)
            goto L_0x0435
        L_0x0223:
            boolean r0 = r5.A0f(r6, r7, r3)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r1)
            long r0 = X.C36431kI.A09(r0)
            int r8 = X.C1897895p.A05(r7)
            int r0 = com.google.protobuf.CodedOutputStream.A01(r0)
            goto L_0x0435
        L_0x023b:
            boolean r0 = r5.A0f(r6, r7, r3)
            goto L_0x043b
        L_0x0241:
            boolean r0 = r5.A0f(r6, r7, r3)
            goto L_0x0448
        L_0x0247:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C203849oy.A05(r0)
            goto L_0x02b2
        L_0x0252:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C203849oy.A04(r0)
            goto L_0x02b2
        L_0x025d:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C203849oy.A01(r0)
            goto L_0x02b2
        L_0x0268:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C203849oy.A06(r0)
            goto L_0x02b2
        L_0x0273:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r1 = A0H(r0)
            goto L_0x02b2
        L_0x027c:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C203849oy.A02(r0)
            goto L_0x02b2
        L_0x0287:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C203849oy.A07(r0)
            goto L_0x02b2
        L_0x0292:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C203849oy.A03(r0)
            goto L_0x02b2
        L_0x029d:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r0 = A0H(r0)
            int r1 = r0 * 4
            goto L_0x02b2
        L_0x02a8:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r0 = A0H(r0)
            int r1 = r0 * 8
        L_0x02b2:
            if (r1 <= 0) goto L_0x0025
            int r8 = X.C1897895p.A05(r7)
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.C165567td.A00(r1)
            int r8 = r8 + r0
            int r8 = r8 + r1
            goto L_0x0450
        L_0x02c2:
            boolean r0 = r5.A0e(r6, r3)
        L_0x02c6:
            if (r0 == 0) goto L_0x0025
            java.lang.Object r2 = X.AnonymousClass9Yj.A00(r6, r1)
            X.B63 r2 = (X.B63) r2
            X.B3d r1 = r5.A0N(r3)
            int r0 = X.C1897895p.A05(r7)
            int r8 = r0 * 2
            X.A7h r2 = (X.C21070A7h) r2
            int r0 = r2.A0k(r1)
            goto L_0x0435
        L_0x02e0:
            boolean r0 = r5.A0e(r6, r3)
            if (r0 == 0) goto L_0x0025
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            long r0 = r0.A07(r6, r1)
            int r8 = X.C1897895p.A05(r7)
            long r0 = X.C165567td.A05(r0)
            int r0 = com.google.protobuf.CodedOutputStream.A01(r0)
            goto L_0x0435
        L_0x02fa:
            boolean r0 = r5.A0e(r6, r3)
            if (r0 == 0) goto L_0x0025
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            int r0 = r0.A06(r6, r1)
            int r8 = X.C1897895p.A05(r7)
            int r0 = X.C1897895p.A06(r0)
            goto L_0x0435
        L_0x0310:
            boolean r0 = r5.A0e(r6, r3)
        L_0x0314:
            if (r0 == 0) goto L_0x0025
            int r0 = X.C1897895p.A05(r7)
            int r8 = r0 + 8
            goto L_0x0450
        L_0x031e:
            boolean r0 = r5.A0e(r6, r3)
        L_0x0322:
            if (r0 == 0) goto L_0x0025
            int r0 = X.C1897895p.A05(r7)
            int r8 = r0 + 4
            goto L_0x0450
        L_0x032c:
            boolean r0 = r5.A0e(r6, r3)
            if (r0 == 0) goto L_0x0025
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            int r1 = r0.A06(r6, r1)
            int r8 = X.C1897895p.A05(r7)
            if (r1 < 0) goto L_0x0409
            goto L_0x0402
        L_0x0340:
            boolean r0 = r5.A0e(r6, r3)
            if (r0 == 0) goto L_0x0025
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            int r1 = r0.A06(r6, r1)
            int r8 = X.C1897895p.A05(r7)
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.C165567td.A00(r1)
            goto L_0x0435
        L_0x0358:
            boolean r0 = r5.A0e(r6, r3)
        L_0x035c:
            if (r0 == 0) goto L_0x0025
            java.lang.Object r1 = X.AnonymousClass9Yj.A00(r6, r1)
            X.AUx r1 = (X.C21674AUx) r1
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r8 = X.C1897895p.A05(r7)
            int r1 = r1.A02()
            int r0 = X.C165567td.A00(r1)
            int r0 = r0 + r1
            int r8 = r8 + r0
            goto L_0x0450
        L_0x0376:
            boolean r0 = r5.A0e(r6, r3)
        L_0x037a:
            if (r0 == 0) goto L_0x0025
            java.lang.Object r2 = X.AnonymousClass9Yj.A00(r6, r1)
            X.B3d r1 = r5.A0N(r3)
            X.9TG r0 = X.C203849oy.A02
            X.B63 r2 = (X.B63) r2
            int r8 = X.C1897895p.A05(r7)
            X.A7h r2 = (X.C21070A7h) r2
            int r1 = r2.A0k(r1)
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.C165567td.A00(r1)
            int r0 = r0 + r1
            int r8 = r8 + r0
            goto L_0x0450
        L_0x039c:
            boolean r0 = r5.A0e(r6, r3)
        L_0x03a0:
            if (r0 == 0) goto L_0x0025
            java.lang.Object r1 = X.AnonymousClass9Yj.A00(r6, r1)
            boolean r0 = r1 instanceof X.C21674AUx
            if (r0 == 0) goto L_0x03be
            X.AUx r1 = (X.C21674AUx) r1
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r8 = X.C1897895p.A05(r7)
            int r1 = r1.A02()
            int r0 = X.C165567td.A00(r1)
            int r0 = r0 + r1
            int r8 = r8 + r0
            goto L_0x0450
        L_0x03be:
            java.lang.String r1 = (java.lang.String) r1
            int r8 = X.C1897895p.A05(r7)
            int r0 = com.google.protobuf.CodedOutputStream.A02(r1)
            goto L_0x0435
        L_0x03c9:
            boolean r0 = r5.A0e(r6, r3)
        L_0x03cd:
            if (r0 == 0) goto L_0x0025
            int r0 = X.C1897895p.A05(r7)
            int r8 = r0 + 1
            goto L_0x0450
        L_0x03d6:
            boolean r0 = r5.A0e(r6, r3)
        L_0x03da:
            if (r0 == 0) goto L_0x0025
            int r0 = X.C1897895p.A05(r7)
            int r8 = r0 + 4
            goto L_0x0450
        L_0x03e3:
            boolean r0 = r5.A0e(r6, r3)
        L_0x03e7:
            if (r0 == 0) goto L_0x0025
            int r0 = X.C1897895p.A05(r7)
            int r8 = r0 + 8
            goto L_0x0450
        L_0x03f0:
            boolean r0 = r5.A0e(r6, r3)
            if (r0 == 0) goto L_0x0025
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            int r1 = r0.A06(r6, r1)
            int r8 = X.C1897895p.A05(r7)
            if (r1 < 0) goto L_0x0409
        L_0x0402:
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.C165567td.A00(r1)
            goto L_0x0435
        L_0x0409:
            r0 = 10
            goto L_0x0435
        L_0x040c:
            boolean r0 = r5.A0e(r6, r3)
            if (r0 == 0) goto L_0x0025
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            long r0 = r0.A07(r6, r1)
            int r8 = X.C1897895p.A05(r7)
            int r0 = com.google.protobuf.CodedOutputStream.A01(r0)
            goto L_0x0435
        L_0x0421:
            boolean r0 = r5.A0e(r6, r3)
            if (r0 == 0) goto L_0x0025
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            long r0 = r0.A07(r6, r1)
            int r8 = X.C1897895p.A05(r7)
            int r0 = com.google.protobuf.CodedOutputStream.A01(r0)
        L_0x0435:
            int r8 = r8 + r0
            goto L_0x0450
        L_0x0437:
            boolean r0 = r5.A0e(r6, r3)
        L_0x043b:
            if (r0 == 0) goto L_0x0025
            int r0 = X.C1897895p.A05(r7)
            int r8 = r0 + 4
            goto L_0x0450
        L_0x0444:
            boolean r0 = r5.A0e(r6, r3)
        L_0x0448:
            if (r0 == 0) goto L_0x0025
            int r0 = X.C1897895p.A05(r7)
            int r8 = r0 + 8
        L_0x0450:
            int r16 = r16 + r8
            goto L_0x0025
        L_0x0454:
            r15 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
            r16 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r14 = 0
        L_0x045e:
            int[] r1 = r5.A05
            int r0 = r1.length
            if (r3 >= r0) goto L_0x08ad
            int r0 = r3 + 1
            r11 = r1[r0]
            r8 = r1[r3]
            int r10 = X.C165587tf.A02(r11)
            r0 = 17
            r9 = 1
            if (r10 > r0) goto L_0x08aa
            int r0 = r3 + 2
            r0 = r1[r0]
            r2 = r0 & r15
            int r0 = r0 >>> 20
            int r9 = r9 << r0
            if (r2 == r7) goto L_0x0483
            long r0 = (long) r2
            int r14 = r4.getInt(r6, r0)
            r7 = r2
        L_0x0483:
            r11 = r11 & r15
            long r1 = (long) r11
            switch(r10) {
                case 0: goto L_0x089c;
                case 1: goto L_0x0891;
                case 2: goto L_0x087f;
                case 3: goto L_0x086e;
                case 4: goto L_0x0856;
                case 5: goto L_0x084b;
                case 6: goto L_0x0840;
                case 7: goto L_0x0835;
                case 8: goto L_0x080b;
                case 9: goto L_0x07e7;
                case 10: goto L_0x07cb;
                case 11: goto L_0x07b7;
                case 12: goto L_0x07a7;
                case 13: goto L_0x0799;
                case 14: goto L_0x078d;
                case 15: goto L_0x077b;
                case 16: goto L_0x0765;
                case 17: goto L_0x0749;
                case 18: goto L_0x0706;
                case 19: goto L_0x06f3;
                case 20: goto L_0x06d7;
                case 21: goto L_0x06bf;
                case 22: goto L_0x06a7;
                case 23: goto L_0x0706;
                case 24: goto L_0x06f3;
                case 25: goto L_0x0694;
                case 26: goto L_0x0688;
                case 27: goto L_0x0678;
                case 28: goto L_0x066c;
                case 29: goto L_0x0654;
                case 30: goto L_0x063c;
                case 31: goto L_0x06f3;
                case 32: goto L_0x0706;
                case 33: goto L_0x0624;
                case 34: goto L_0x060c;
                case 35: goto L_0x05f2;
                case 36: goto L_0x05e7;
                case 37: goto L_0x05dc;
                case 38: goto L_0x05d1;
                case 39: goto L_0x05c6;
                case 40: goto L_0x05f2;
                case 41: goto L_0x05e7;
                case 42: goto L_0x05bd;
                case 43: goto L_0x05b2;
                case 44: goto L_0x05a7;
                case 45: goto L_0x05e7;
                case 46: goto L_0x05f2;
                case 47: goto L_0x059c;
                case 48: goto L_0x0591;
                case 49: goto L_0x0719;
                case 50: goto L_0x057f;
                case 51: goto L_0x0579;
                case 52: goto L_0x0573;
                case 53: goto L_0x055b;
                case 54: goto L_0x0543;
                case 55: goto L_0x052d;
                case 56: goto L_0x0527;
                case 57: goto L_0x0519;
                case 58: goto L_0x0513;
                case 59: goto L_0x050d;
                case 60: goto L_0x0507;
                case 61: goto L_0x0501;
                case 62: goto L_0x04e7;
                case 63: goto L_0x04d1;
                case 64: goto L_0x04cb;
                case 65: goto L_0x04c5;
                case 66: goto L_0x04ad;
                case 67: goto L_0x0491;
                case 68: goto L_0x048b;
                default: goto L_0x0488;
            }
        L_0x0488:
            int r3 = r3 + 3
            goto L_0x045e
        L_0x048b:
            boolean r0 = r5.A0f(r6, r8, r3)
            goto L_0x074b
        L_0x0491:
            boolean r0 = r5.A0f(r6, r8, r3)
            if (r0 == 0) goto L_0x0488
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r1)
            long r0 = X.C36431kI.A09(r0)
            int r9 = X.C1897895p.A05(r8)
            long r0 = X.C165567td.A05(r0)
            int r0 = com.google.protobuf.CodedOutputStream.A01(r0)
            goto L_0x088f
        L_0x04ad:
            boolean r0 = r5.A0f(r6, r8, r3)
            if (r0 == 0) goto L_0x0488
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r1)
            int r0 = X.AnonymousClass000.A0I(r0)
            int r9 = X.C1897895p.A05(r8)
            int r0 = X.C1897895p.A06(r0)
            goto L_0x088f
        L_0x04c5:
            boolean r0 = r5.A0f(r6, r8, r3)
            goto L_0x078f
        L_0x04cb:
            boolean r0 = r5.A0f(r6, r8, r3)
            goto L_0x079b
        L_0x04d1:
            boolean r0 = r5.A0f(r6, r8, r3)
            if (r0 == 0) goto L_0x0488
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r1)
            int r1 = X.AnonymousClass000.A0I(r0)
            int r9 = X.C1897895p.A05(r8)
            if (r1 < 0) goto L_0x086b
            goto L_0x0864
        L_0x04e7:
            boolean r0 = r5.A0f(r6, r8, r3)
            if (r0 == 0) goto L_0x0488
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r1)
            int r1 = X.AnonymousClass000.A0I(r0)
            int r9 = X.C1897895p.A05(r8)
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.C165567td.A00(r1)
            goto L_0x088f
        L_0x0501:
            boolean r0 = r5.A0f(r6, r8, r3)
            goto L_0x07cd
        L_0x0507:
            boolean r0 = r5.A0f(r6, r8, r3)
            goto L_0x07e9
        L_0x050d:
            boolean r0 = r5.A0f(r6, r8, r3)
            goto L_0x080d
        L_0x0513:
            boolean r0 = r5.A0f(r6, r8, r3)
            goto L_0x0837
        L_0x0519:
            boolean r0 = r5.A0f(r6, r8, r3)
            if (r0 == 0) goto L_0x0488
            int r0 = X.C1897895p.A05(r8)
            int r1 = r0 + 4
            goto L_0x07a3
        L_0x0527:
            boolean r0 = r5.A0f(r6, r8, r3)
            goto L_0x084d
        L_0x052d:
            boolean r0 = r5.A0f(r6, r8, r3)
            if (r0 == 0) goto L_0x0488
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r1)
            int r1 = X.AnonymousClass000.A0I(r0)
            int r9 = X.C1897895p.A05(r8)
            if (r1 < 0) goto L_0x086b
            goto L_0x0864
        L_0x0543:
            boolean r0 = r5.A0f(r6, r8, r3)
            if (r0 == 0) goto L_0x0488
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r1)
            long r0 = X.C36431kI.A09(r0)
            int r9 = X.C1897895p.A05(r8)
            int r0 = com.google.protobuf.CodedOutputStream.A01(r0)
            goto L_0x088f
        L_0x055b:
            boolean r0 = r5.A0f(r6, r8, r3)
            if (r0 == 0) goto L_0x0488
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r1)
            long r0 = X.C36431kI.A09(r0)
            int r9 = X.C1897895p.A05(r8)
            int r0 = com.google.protobuf.CodedOutputStream.A01(r0)
            goto L_0x088f
        L_0x0573:
            boolean r0 = r5.A0f(r6, r8, r3)
            goto L_0x0893
        L_0x0579:
            boolean r0 = r5.A0f(r6, r8, r3)
            goto L_0x089e
        L_0x057f:
            java.lang.Object r2 = r4.getObject(r6, r1)
            java.lang.Object[] r1 = r5.A07
            int r0 = r3 / 3
            int r0 = r0 * 2
            r0 = r1[r0]
            int r9 = X.C200369hI.A00(r2, r0, r8)
            goto L_0x08a6
        L_0x0591:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C203849oy.A05(r0)
            goto L_0x05fc
        L_0x059c:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C203849oy.A04(r0)
            goto L_0x05fc
        L_0x05a7:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C203849oy.A01(r0)
            goto L_0x05fc
        L_0x05b2:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C203849oy.A06(r0)
            goto L_0x05fc
        L_0x05bd:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r2 = A0H(r0)
            goto L_0x05fc
        L_0x05c6:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C203849oy.A02(r0)
            goto L_0x05fc
        L_0x05d1:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C203849oy.A07(r0)
            goto L_0x05fc
        L_0x05dc:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C203849oy.A03(r0)
            goto L_0x05fc
        L_0x05e7:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r0 = A0H(r0)
            int r2 = r0 * 4
            goto L_0x05fc
        L_0x05f2:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r0 = A0H(r0)
            int r2 = r0 * 8
        L_0x05fc:
            if (r2 <= 0) goto L_0x0488
            int r1 = X.C1897895p.A05(r8)
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.C165567td.A00(r2)
            int r1 = r1 + r0
            int r1 = r1 + r2
            goto L_0x07a3
        L_0x060c:
            java.lang.Object r2 = r4.getObject(r6, r1)
            java.util.List r2 = (java.util.List) r2
            X.9TG r0 = X.C203849oy.A02
            int r1 = r2.size()
            if (r1 == 0) goto L_0x072d
            int r0 = X.C203849oy.A05(r2)
            int r9 = A01(r8, r1, r0)
            goto L_0x08a6
        L_0x0624:
            java.lang.Object r2 = r4.getObject(r6, r1)
            java.util.List r2 = (java.util.List) r2
            X.9TG r0 = X.C203849oy.A02
            int r1 = r2.size()
            if (r1 == 0) goto L_0x072d
            int r0 = X.C203849oy.A04(r2)
            int r9 = A01(r8, r1, r0)
            goto L_0x08a6
        L_0x063c:
            java.lang.Object r2 = r4.getObject(r6, r1)
            java.util.List r2 = (java.util.List) r2
            X.9TG r0 = X.C203849oy.A02
            int r1 = r2.size()
            if (r1 == 0) goto L_0x072d
            int r0 = X.C203849oy.A01(r2)
            int r9 = A01(r8, r1, r0)
            goto L_0x08a6
        L_0x0654:
            java.lang.Object r2 = r4.getObject(r6, r1)
            java.util.List r2 = (java.util.List) r2
            X.9TG r0 = X.C203849oy.A02
            int r1 = r2.size()
            if (r1 == 0) goto L_0x072d
            int r0 = X.C203849oy.A06(r2)
            int r9 = A01(r8, r1, r0)
            goto L_0x08a6
        L_0x066c:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r9 = X.C203849oy.A08(r0, r8)
            goto L_0x08a6
        L_0x0678:
            java.lang.Object r1 = r4.getObject(r6, r1)
            java.util.List r1 = (java.util.List) r1
            X.B3d r0 = r5.A0N(r3)
            int r9 = X.C203849oy.A00(r0, r1, r8)
            goto L_0x08a6
        L_0x0688:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r9 = X.C203849oy.A09(r0, r8)
            goto L_0x08a6
        L_0x0694:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r9 = A0H(r0)
            if (r9 == 0) goto L_0x072d
            int r0 = X.C1897895p.A05(r8)
            int r0 = r0 + 1
            int r9 = r9 * r0
            goto L_0x08a6
        L_0x06a7:
            java.lang.Object r2 = r4.getObject(r6, r1)
            java.util.List r2 = (java.util.List) r2
            X.9TG r0 = X.C203849oy.A02
            int r1 = r2.size()
            if (r1 == 0) goto L_0x072d
            int r0 = X.C203849oy.A02(r2)
            int r9 = A01(r8, r1, r0)
            goto L_0x08a6
        L_0x06bf:
            java.lang.Object r2 = r4.getObject(r6, r1)
            java.util.List r2 = (java.util.List) r2
            X.9TG r0 = X.C203849oy.A02
            int r1 = r2.size()
            if (r1 == 0) goto L_0x072d
            int r0 = X.C203849oy.A07(r2)
            int r9 = A01(r8, r1, r0)
            goto L_0x08a6
        L_0x06d7:
            java.lang.Object r2 = r4.getObject(r6, r1)
            java.util.List r2 = (java.util.List) r2
            X.9TG r0 = X.C203849oy.A02
            int r0 = r2.size()
            if (r0 == 0) goto L_0x072d
            int r1 = X.C203849oy.A03(r2)
            int r0 = r2.size()
            int r9 = A01(r8, r0, r1)
            goto L_0x08a6
        L_0x06f3:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r9 = A0H(r0)
            if (r9 == 0) goto L_0x072d
            int r0 = X.C1897895p.A05(r8)
            int r0 = r0 + 4
            int r9 = r9 * r0
            goto L_0x08a6
        L_0x0706:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r9 = A0H(r0)
            if (r9 == 0) goto L_0x072d
            int r0 = X.C1897895p.A05(r8)
            int r0 = r0 + 8
            int r9 = r9 * r0
            goto L_0x08a6
        L_0x0719:
            java.lang.Object r13 = r4.getObject(r6, r1)
            java.util.List r13 = (java.util.List) r13
            X.B3d r12 = r5.A0N(r3)
            X.9TG r0 = X.C203849oy.A02
            int r11 = r13.size()
            r10 = 0
            r9 = 0
            if (r11 != 0) goto L_0x0730
        L_0x072d:
            r9 = 0
            goto L_0x08a6
        L_0x0730:
            if (r10 >= r11) goto L_0x08a6
            java.lang.Object r2 = r13.get(r10)
            X.B63 r2 = (X.B63) r2
            int r0 = X.C1897895p.A05(r8)
            int r1 = r0 * 2
            X.A7h r2 = (X.C21070A7h) r2
            int r0 = r2.A0k(r12)
            int r1 = r1 + r0
            int r9 = r9 + r1
            int r10 = r10 + 1
            goto L_0x0730
        L_0x0749:
            r0 = r14 & r9
        L_0x074b:
            if (r0 == 0) goto L_0x0488
            java.lang.Object r2 = r4.getObject(r6, r1)
            X.B63 r2 = (X.B63) r2
            X.B3d r1 = r5.A0N(r3)
            int r0 = X.C1897895p.A05(r8)
            int r9 = r0 * 2
            X.A7h r2 = (X.C21070A7h) r2
            int r0 = r2.A0k(r1)
            goto L_0x088f
        L_0x0765:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x0488
            long r0 = r4.getLong(r6, r1)
            int r9 = X.C1897895p.A05(r8)
            long r0 = X.C165567td.A05(r0)
            int r0 = com.google.protobuf.CodedOutputStream.A01(r0)
            goto L_0x088f
        L_0x077b:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x0488
            int r0 = r4.getInt(r6, r1)
            int r9 = X.C1897895p.A05(r8)
            int r0 = X.C1897895p.A06(r0)
            goto L_0x088f
        L_0x078d:
            r0 = r14 & r9
        L_0x078f:
            if (r0 == 0) goto L_0x0488
            int r0 = X.C1897895p.A05(r8)
            int r9 = r0 + 8
            goto L_0x08a6
        L_0x0799:
            r0 = r14 & r9
        L_0x079b:
            if (r0 == 0) goto L_0x0488
            int r0 = X.C1897895p.A05(r8)
            int r1 = r0 + 4
        L_0x07a3:
            int r16 = r16 + r1
            goto L_0x0488
        L_0x07a7:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x0488
            int r1 = r4.getInt(r6, r1)
            int r9 = X.C1897895p.A05(r8)
            if (r1 < 0) goto L_0x086b
            goto L_0x0864
        L_0x07b7:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x0488
            int r1 = r4.getInt(r6, r1)
            int r9 = X.C1897895p.A05(r8)
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.C165567td.A00(r1)
            goto L_0x088f
        L_0x07cb:
            r0 = r14 & r9
        L_0x07cd:
            if (r0 == 0) goto L_0x0488
            java.lang.Object r1 = r4.getObject(r6, r1)
            X.AUx r1 = (X.C21674AUx) r1
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r9 = X.C1897895p.A05(r8)
            int r1 = r1.A02()
            int r0 = X.C165567td.A00(r1)
            int r0 = r0 + r1
            int r9 = r9 + r0
            goto L_0x08a6
        L_0x07e7:
            r0 = r14 & r9
        L_0x07e9:
            if (r0 == 0) goto L_0x0488
            java.lang.Object r2 = r4.getObject(r6, r1)
            X.B3d r1 = r5.A0N(r3)
            X.9TG r0 = X.C203849oy.A02
            X.B63 r2 = (X.B63) r2
            int r9 = X.C1897895p.A05(r8)
            X.A7h r2 = (X.C21070A7h) r2
            int r1 = r2.A0k(r1)
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.C165567td.A00(r1)
            int r0 = r0 + r1
            int r9 = r9 + r0
            goto L_0x08a6
        L_0x080b:
            r0 = r14 & r9
        L_0x080d:
            if (r0 == 0) goto L_0x0488
            java.lang.Object r1 = r4.getObject(r6, r1)
            boolean r0 = r1 instanceof X.C21674AUx
            if (r0 == 0) goto L_0x082a
            X.AUx r1 = (X.C21674AUx) r1
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r9 = X.C1897895p.A05(r8)
            int r1 = r1.A02()
            int r0 = X.C165567td.A00(r1)
            int r0 = r0 + r1
            int r9 = r9 + r0
            goto L_0x08a6
        L_0x082a:
            java.lang.String r1 = (java.lang.String) r1
            int r9 = X.C1897895p.A05(r8)
            int r0 = com.google.protobuf.CodedOutputStream.A02(r1)
            goto L_0x088f
        L_0x0835:
            r0 = r14 & r9
        L_0x0837:
            if (r0 == 0) goto L_0x0488
            int r0 = X.C1897895p.A05(r8)
            int r9 = r0 + 1
            goto L_0x08a6
        L_0x0840:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x0488
            int r0 = X.C1897895p.A05(r8)
            int r9 = r0 + 4
            goto L_0x08a6
        L_0x084b:
            r0 = r14 & r9
        L_0x084d:
            if (r0 == 0) goto L_0x0488
            int r0 = X.C1897895p.A05(r8)
            int r9 = r0 + 8
            goto L_0x08a6
        L_0x0856:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x0488
            int r1 = r4.getInt(r6, r1)
            int r9 = X.C1897895p.A05(r8)
            if (r1 < 0) goto L_0x086b
        L_0x0864:
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.C165567td.A00(r1)
            goto L_0x088f
        L_0x086b:
            r0 = 10
            goto L_0x088f
        L_0x086e:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x0488
            long r0 = r4.getLong(r6, r1)
            int r9 = X.C1897895p.A05(r8)
            int r0 = com.google.protobuf.CodedOutputStream.A01(r0)
            goto L_0x088f
        L_0x087f:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x0488
            long r0 = r4.getLong(r6, r1)
            int r9 = X.C1897895p.A05(r8)
            int r0 = com.google.protobuf.CodedOutputStream.A01(r0)
        L_0x088f:
            int r9 = r9 + r0
            goto L_0x08a6
        L_0x0891:
            r0 = r14 & r9
        L_0x0893:
            if (r0 == 0) goto L_0x0488
            int r0 = X.C1897895p.A05(r8)
            int r9 = r0 + 4
            goto L_0x08a6
        L_0x089c:
            r0 = r14 & r9
        L_0x089e:
            if (r0 == 0) goto L_0x0488
            int r0 = X.C1897895p.A05(r8)
            int r9 = r0 + 8
        L_0x08a6:
            int r16 = r16 + r9
            goto L_0x0488
        L_0x08aa:
            r9 = 0
            goto L_0x0483
        L_0x08ad:
            X.8Hz r6 = (X.C170918Hz) r6
            X.9lJ r0 = r6.unknownFields
            int r0 = r0.A01()
            int r16 = r16 + r0
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21074A7l.BHM(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ca, code lost:
        r0 = X.AnonymousClass9BD.A04;
        r0 = X.C36341k9.A01(r1 ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d7, code lost:
        r6 = r6 * 53;
        r0 = ((java.lang.String) X.AnonymousClass9Yj.A00(r10, r1)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ea, code lost:
        r6 = r6 * 53;
        r0 = X.AnonymousClass9Yj.A00(r10, r1).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f4, code lost:
        r6 = r6 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        r3 = r3 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int BK8(java.lang.Object r10) {
        /*
            r9 = this;
            int[] r5 = r9.A05
            int r4 = r5.length
            r3 = 0
            r6 = 0
        L_0x0005:
            if (r3 >= r4) goto L_0x0106
            int r0 = r3 + 1
            r0 = r5[r0]
            r8 = r5[r3]
            long r1 = X.C165597tg.A0D(r0)
            int r0 = X.C165587tf.A02(r0)
            r7 = 37
            switch(r0) {
                case 0: goto L_0x001d;
                case 1: goto L_0x0031;
                case 2: goto L_0x003f;
                case 3: goto L_0x003f;
                case 4: goto L_0x004f;
                case 5: goto L_0x003f;
                case 6: goto L_0x004f;
                case 7: goto L_0x0059;
                case 8: goto L_0x00d7;
                case 9: goto L_0x00f7;
                case 10: goto L_0x00ea;
                case 11: goto L_0x004f;
                case 12: goto L_0x004f;
                case 13: goto L_0x004f;
                case 14: goto L_0x003f;
                case 15: goto L_0x004f;
                case 16: goto L_0x003f;
                case 17: goto L_0x00f7;
                case 18: goto L_0x00ea;
                case 19: goto L_0x00ea;
                case 20: goto L_0x00ea;
                case 21: goto L_0x00ea;
                case 22: goto L_0x00ea;
                case 23: goto L_0x00ea;
                case 24: goto L_0x00ea;
                case 25: goto L_0x00ea;
                case 26: goto L_0x00ea;
                case 27: goto L_0x00ea;
                case 28: goto L_0x00ea;
                case 29: goto L_0x00ea;
                case 30: goto L_0x00ea;
                case 31: goto L_0x00ea;
                case 32: goto L_0x00ea;
                case 33: goto L_0x00ea;
                case 34: goto L_0x00ea;
                case 35: goto L_0x00ea;
                case 36: goto L_0x00ea;
                case 37: goto L_0x00ea;
                case 38: goto L_0x00ea;
                case 39: goto L_0x00ea;
                case 40: goto L_0x00ea;
                case 41: goto L_0x00ea;
                case 42: goto L_0x00ea;
                case 43: goto L_0x00ea;
                case 44: goto L_0x00ea;
                case 45: goto L_0x00ea;
                case 46: goto L_0x00ea;
                case 47: goto L_0x00ea;
                case 48: goto L_0x00ea;
                case 49: goto L_0x00ea;
                case 50: goto L_0x00ea;
                case 51: goto L_0x0062;
                case 52: goto L_0x007d;
                case 53: goto L_0x0092;
                case 54: goto L_0x0092;
                case 55: goto L_0x00a9;
                case 56: goto L_0x0092;
                case 57: goto L_0x00a9;
                case 58: goto L_0x00ba;
                case 59: goto L_0x00d1;
                case 60: goto L_0x00e4;
                case 61: goto L_0x00e4;
                case 62: goto L_0x00a9;
                case 63: goto L_0x00a9;
                case 64: goto L_0x00a9;
                case 65: goto L_0x0092;
                case 66: goto L_0x00a9;
                case 67: goto L_0x0092;
                case 68: goto L_0x00e4;
                default: goto L_0x001a;
            }
        L_0x001a:
            int r3 = r3 + 3
            goto L_0x0005
        L_0x001d:
            int r6 = r6 * 53
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            double r0 = r0.A03(r10, r1)
            long r1 = java.lang.Double.doubleToLongBits(r0)
            java.nio.charset.Charset r0 = X.AnonymousClass9BD.A04
            int r0 = X.AnonymousClass000.A08(r1)
            goto L_0x00f4
        L_0x0031:
            int r6 = r6 * 53
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            float r0 = r0.A04(r10, r1)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x00f4
        L_0x003f:
            int r6 = r6 * 53
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            long r1 = r0.A07(r10, r1)
            java.nio.charset.Charset r0 = X.AnonymousClass9BD.A04
            int r0 = X.AnonymousClass000.A08(r1)
            goto L_0x00f4
        L_0x004f:
            int r6 = r6 * 53
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            int r0 = r0.A06(r10, r1)
            goto L_0x00f4
        L_0x0059:
            int r6 = r6 * 53
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            boolean r1 = r0.A0L(r10, r1)
            goto L_0x00ca
        L_0x0062:
            boolean r0 = r9.A0f(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
            int r6 = r6 * 53
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r10, r1)
            double r0 = X.C90504aG.A01(r0)
            long r1 = java.lang.Double.doubleToLongBits(r0)
            java.nio.charset.Charset r0 = X.AnonymousClass9BD.A04
            int r0 = X.AnonymousClass000.A08(r1)
            goto L_0x00f4
        L_0x007d:
            boolean r0 = r9.A0f(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
            int r6 = r6 * 53
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r10, r1)
            float r0 = X.C36441kJ.A03(r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x00f4
        L_0x0092:
            boolean r0 = r9.A0f(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
            int r6 = r6 * 53
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r10, r1)
            long r1 = X.C36431kI.A09(r0)
            java.nio.charset.Charset r0 = X.AnonymousClass9BD.A04
            int r0 = X.AnonymousClass000.A08(r1)
            goto L_0x00f4
        L_0x00a9:
            boolean r0 = r9.A0f(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
            int r6 = r6 * 53
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r10, r1)
            int r0 = X.AnonymousClass000.A0I(r0)
            goto L_0x00f4
        L_0x00ba:
            boolean r0 = r9.A0f(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
            int r6 = r6 * 53
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r10, r1)
            boolean r1 = X.AnonymousClass000.A1X(r0)
        L_0x00ca:
            java.nio.charset.Charset r0 = X.AnonymousClass9BD.A04
            int r0 = X.C36341k9.A01(r1)
            goto L_0x00f4
        L_0x00d1:
            boolean r0 = r9.A0f(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
        L_0x00d7:
            int r6 = r6 * 53
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r10, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.hashCode()
            goto L_0x00f4
        L_0x00e4:
            boolean r0 = r9.A0f(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
        L_0x00ea:
            int r6 = r6 * 53
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r10, r1)
            int r0 = r0.hashCode()
        L_0x00f4:
            int r6 = r6 + r0
            goto L_0x001a
        L_0x00f7:
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r10, r1)
            if (r0 == 0) goto L_0x0101
            int r7 = r0.hashCode()
        L_0x0101:
            int r6 = r6 * 53
            int r6 = r6 + r7
            goto L_0x001a
        L_0x0106:
            int r1 = r6 * 53
            X.8Hz r10 = (X.C170918Hz) r10
            X.9lJ r0 = r10.unknownFields
            int r0 = X.C36401kF.A02(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21074A7l.BK8(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0171, code lost:
        r5 = r8.getObject(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0179, code lost:
        if (A0d(r5) != false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x017b, code lost:
        r4 = r6.BQ8();
        r6.BPm(r4, r5);
        r8.putObject(r10, r0, r4);
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0186, code lost:
        r6.BPm(r5, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BPm(java.lang.Object r16, java.lang.Object r17) {
        /*
            r15 = this;
            r10 = r16
            A0a(r10)
            r2 = r17
            java.util.Objects.requireNonNull(r2)
            r3 = 0
        L_0x000b:
            int[] r4 = r15.A05
            int r0 = r4.length
            if (r3 >= r0) goto L_0x01b5
            int r1 = r3 + 1
            r0 = r4[r1]
            long r11 = X.C165597tg.A0D(r0)
            r9 = r4[r3]
            int r0 = X.C165587tf.A02(r0)
            switch(r0) {
                case 0: goto L_0x00ef;
                case 1: goto L_0x00df;
                case 2: goto L_0x00ce;
                case 3: goto L_0x00ce;
                case 4: goto L_0x00bd;
                case 5: goto L_0x00ce;
                case 6: goto L_0x00bd;
                case 7: goto L_0x00ac;
                case 8: goto L_0x009d;
                case 9: goto L_0x013a;
                case 10: goto L_0x009d;
                case 11: goto L_0x00bd;
                case 12: goto L_0x00bd;
                case 13: goto L_0x00bd;
                case 14: goto L_0x00ce;
                case 15: goto L_0x00bd;
                case 16: goto L_0x00ce;
                case 17: goto L_0x013a;
                case 18: goto L_0x0047;
                case 19: goto L_0x0047;
                case 20: goto L_0x0047;
                case 21: goto L_0x0047;
                case 22: goto L_0x0047;
                case 23: goto L_0x0047;
                case 24: goto L_0x0047;
                case 25: goto L_0x0047;
                case 26: goto L_0x0047;
                case 27: goto L_0x0047;
                case 28: goto L_0x0047;
                case 29: goto L_0x0047;
                case 30: goto L_0x0047;
                case 31: goto L_0x0047;
                case 32: goto L_0x0047;
                case 33: goto L_0x0047;
                case 34: goto L_0x0047;
                case 35: goto L_0x0047;
                case 36: goto L_0x0047;
                case 37: goto L_0x0047;
                case 38: goto L_0x0047;
                case 39: goto L_0x0047;
                case 40: goto L_0x0047;
                case 41: goto L_0x0047;
                case 42: goto L_0x0047;
                case 43: goto L_0x0047;
                case 44: goto L_0x0047;
                case 45: goto L_0x0047;
                case 46: goto L_0x0047;
                case 47: goto L_0x0047;
                case 48: goto L_0x0047;
                case 49: goto L_0x0047;
                case 50: goto L_0x0033;
                case 51: goto L_0x0024;
                case 52: goto L_0x0024;
                case 53: goto L_0x0024;
                case 54: goto L_0x0024;
                case 55: goto L_0x0024;
                case 56: goto L_0x0024;
                case 57: goto L_0x0024;
                case 58: goto L_0x0024;
                case 59: goto L_0x0024;
                case 60: goto L_0x00ff;
                case 61: goto L_0x0024;
                case 62: goto L_0x0024;
                case 63: goto L_0x0024;
                case 64: goto L_0x0024;
                case 65: goto L_0x0024;
                case 66: goto L_0x0024;
                case 67: goto L_0x0024;
                case 68: goto L_0x00ff;
                default: goto L_0x0021;
            }
        L_0x0021:
            int r3 = r3 + 3
            goto L_0x000b
        L_0x0024:
            boolean r0 = r15.A0f(r2, r9, r3)
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r2, r11)
            com.google.protobuf.UnsafeUtil.A07(r10, r11, r0)
            goto L_0x0126
        L_0x0033:
            X.9TG r0 = X.C203849oy.A02
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            java.lang.Object r1 = r0.A09(r10, r11)
            java.lang.Object r0 = r0.A09(r2, r11)
            X.AcX r0 = X.C200369hI.A01(r1, r0)
            com.google.protobuf.UnsafeUtil.A07(r10, r11, r0)
            goto L_0x0021
        L_0x0047:
            X.9ff r0 = r15.A04
            boolean r0 = r0 instanceof X.C173528Sa
            if (r0 == 0) goto L_0x007b
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            java.lang.Object r6 = r0.A09(r10, r11)
            X.B6c r6 = (X.C23122B6c) r6
            java.lang.Object r5 = r0.A09(r2, r11)
            java.util.List r5 = (java.util.List) r5
            int r4 = r6.size()
            int r1 = r5.size()
            if (r4 <= 0) goto L_0x0077
            if (r1 <= 0) goto L_0x0076
            r0 = r6
            X.AcE r0 = (X.C21886AcE) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0073
            int r1 = r1 + r4
            X.B6c r6 = r6.BQ1(r1)
        L_0x0073:
            r6.addAll(r5)
        L_0x0076:
            r5 = r6
        L_0x0077:
            com.google.protobuf.UnsafeUtil.A07(r10, r11, r5)
            goto L_0x0021
        L_0x007b:
            java.lang.Object r5 = X.AnonymousClass9Yj.A00(r2, r11)
            java.util.List r5 = (java.util.List) r5
            int r0 = r5.size()
            java.util.List r4 = X.C173538Sb.A00(r10, r11, r0)
            int r1 = r4.size()
            int r0 = r5.size()
            if (r1 <= 0) goto L_0x0099
            if (r0 <= 0) goto L_0x0098
            r4.addAll(r5)
        L_0x0098:
            r5 = r4
        L_0x0099:
            com.google.protobuf.UnsafeUtil.A07(r10, r11, r5)
            goto L_0x0021
        L_0x009d:
            boolean r0 = r15.A0e(r2, r3)
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r2, r11)
            com.google.protobuf.UnsafeUtil.A07(r10, r11, r0)
            goto L_0x0161
        L_0x00ac:
            boolean r0 = r15.A0e(r2, r3)
            if (r0 == 0) goto L_0x0021
            X.9Yj r1 = com.google.protobuf.UnsafeUtil.A02
            boolean r0 = r1.A0L(r2, r11)
            r1.A0H(r10, r11, r0)
            goto L_0x0161
        L_0x00bd:
            boolean r0 = r15.A0e(r2, r3)
            if (r0 == 0) goto L_0x0021
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            int r0 = r0.A06(r2, r11)
            com.google.protobuf.UnsafeUtil.A06(r10, r11, r0)
            goto L_0x0161
        L_0x00ce:
            boolean r0 = r15.A0e(r2, r3)
            if (r0 == 0) goto L_0x0021
            X.9Yj r9 = com.google.protobuf.UnsafeUtil.A02
            long r13 = r9.A07(r2, r11)
            r9.A0F(r10, r11, r13)
            goto L_0x0161
        L_0x00df:
            boolean r0 = r15.A0e(r2, r3)
            if (r0 == 0) goto L_0x0021
            X.9Yj r1 = com.google.protobuf.UnsafeUtil.A02
            float r0 = r1.A04(r2, r11)
            r1.A0D(r10, r11, r0)
            goto L_0x0161
        L_0x00ef:
            boolean r0 = r15.A0e(r2, r3)
            if (r0 == 0) goto L_0x0021
            X.9Yj r9 = com.google.protobuf.UnsafeUtil.A02
            double r13 = r9.A03(r2, r11)
            r9.A0C(r10, r11, r13)
            goto L_0x0161
        L_0x00ff:
            boolean r0 = r15.A0f(r2, r9, r3)
            if (r0 == 0) goto L_0x0021
            r0 = r4[r1]
            long r0 = X.C165597tg.A0D(r0)
            sun.misc.Unsafe r8 = A0F
            java.lang.Object r7 = r8.getObject(r2, r0)
            if (r7 == 0) goto L_0x018b
            X.B3d r6 = r15.A0N(r3)
            boolean r5 = r15.A0f(r10, r9, r3)
            if (r5 != 0) goto L_0x0171
            boolean r5 = A0d(r7)
            if (r5 != 0) goto L_0x012f
            r8.putObject(r10, r0, r7)
        L_0x0126:
            long r0 = X.C165577te.A0H(r4, r3)
            com.google.protobuf.UnsafeUtil.A06(r10, r0, r9)
            goto L_0x0021
        L_0x012f:
            X.8Hz r5 = r6.BQ8()
            r6.BPm(r5, r7)
            r8.putObject(r10, r0, r5)
            goto L_0x0126
        L_0x013a:
            boolean r0 = r15.A0e(r2, r3)
            if (r0 == 0) goto L_0x0021
            r0 = r4[r1]
            long r0 = X.C165597tg.A0D(r0)
            sun.misc.Unsafe r8 = A0F
            java.lang.Object r7 = r8.getObject(r2, r0)
            if (r7 == 0) goto L_0x01a0
            X.B3d r6 = r15.A0N(r3)
            boolean r4 = r15.A0e(r10, r3)
            if (r4 != 0) goto L_0x0171
            boolean r4 = A0d(r7)
            if (r4 != 0) goto L_0x0166
            r8.putObject(r10, r0, r7)
        L_0x0161:
            r15.A0b(r10, r3)
            goto L_0x0021
        L_0x0166:
            X.8Hz r4 = r6.BQ8()
            r6.BPm(r4, r7)
            r8.putObject(r10, r0, r4)
            goto L_0x0161
        L_0x0171:
            java.lang.Object r5 = r8.getObject(r10, r0)
            boolean r4 = A0d(r5)
            if (r4 != 0) goto L_0x0186
            X.8Hz r4 = r6.BQ8()
            r6.BPm(r4, r5)
            r8.putObject(r10, r0, r4)
            r5 = r4
        L_0x0186:
            r6.BPm(r5, r7)
            goto L_0x0021
        L_0x018b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Source subfield "
            r1.append(r0)
            r0 = r4[r3]
            r1.append(r0)
            java.lang.String r0 = " is present but null: "
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0f(r2, r0, r1)
            throw r0
        L_0x01a0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Source subfield "
            r1.append(r0)
            r0 = r4[r3]
            r1.append(r0)
            java.lang.String r0 = " is present but null: "
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0f(r2, r0, r1)
            throw r0
        L_0x01b5:
            X.C203849oy.A0R(r10, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21074A7l.BPm(java.lang.Object, java.lang.Object):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public void BPn(X.C203179nT r23, X.C201979ko r24, java.lang.Object r25) {
        /*
            r22 = this;
            r6 = r24
            r14 = r25
            java.util.Objects.requireNonNull(r6)
            A0a(r14)
            r12 = r22
            X.9TG r13 = r12.A0C
            r15 = 0
        L_0x000f:
            r0 = r23
            int r4 = r0.A0A()     // Catch:{ all -> 0x0678 }
            int r3 = r12.A00(r4)     // Catch:{ all -> 0x0678 }
            if (r3 >= 0) goto L_0x0041
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r1) goto L_0x0033
            int r1 = r12.A00
        L_0x0022:
            int r0 = r12.A03
            if (r1 >= r0) goto L_0x066f
            int[] r0 = r12.A06
            r17 = r0[r1]
            r16 = r14
            java.lang.Object r15 = r12.A0Q(r13, r14, r15, r16, r17)
            int r1 = r1 + 1
            goto L_0x0022
        L_0x0033:
            if (r15 != 0) goto L_0x0039
            X.9lJ r15 = r13.A00(r14)     // Catch:{ all -> 0x0678 }
        L_0x0039:
            boolean r0 = r13.A01(r0, r15)     // Catch:{ all -> 0x0678 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0636
        L_0x0041:
            int[] r5 = r12.A05     // Catch:{ all -> 0x0678 }
            int r9 = r3 + 1
            r2 = r5[r9]     // Catch:{ all -> 0x0678 }
            int r1 = X.C165587tf.A02(r2)
            switch(r1) {
                case 0: goto L_0x044f;
                case 1: goto L_0x0165;
                case 2: goto L_0x0152;
                case 3: goto L_0x013f;
                case 4: goto L_0x0130;
                case 5: goto L_0x011d;
                case 6: goto L_0x010e;
                case 7: goto L_0x00fd;
                case 8: goto L_0x044a;
                case 9: goto L_0x0434;
                case 10: goto L_0x00ec;
                case 11: goto L_0x00dd;
                case 12: goto L_0x05f0;
                case 13: goto L_0x00ce;
                case 14: goto L_0x00bb;
                case 15: goto L_0x00ac;
                case 16: goto L_0x0099;
                case 17: goto L_0x0422;
                case 18: goto L_0x0419;
                case 19: goto L_0x0410;
                case 20: goto L_0x0407;
                case 21: goto L_0x03fe;
                case 22: goto L_0x03f5;
                case 23: goto L_0x03ec;
                case 24: goto L_0x03e3;
                case 25: goto L_0x03da;
                case 26: goto L_0x0572;
                case 27: goto L_0x039b;
                case 28: goto L_0x036e;
                case 29: goto L_0x0365;
                case 30: goto L_0x034a;
                case 31: goto L_0x0341;
                case 32: goto L_0x0338;
                case 33: goto L_0x032f;
                case 34: goto L_0x0326;
                case 35: goto L_0x031d;
                case 36: goto L_0x0314;
                case 37: goto L_0x030b;
                case 38: goto L_0x0302;
                case 39: goto L_0x02f9;
                case 40: goto L_0x02f0;
                case 41: goto L_0x02e7;
                case 42: goto L_0x02de;
                case 43: goto L_0x02d5;
                case 44: goto L_0x02ba;
                case 45: goto L_0x02b1;
                case 46: goto L_0x02a8;
                case 47: goto L_0x029f;
                case 48: goto L_0x0296;
                case 49: goto L_0x005c;
                case 50: goto L_0x0480;
                case 51: goto L_0x0283;
                case 52: goto L_0x0258;
                case 53: goto L_0x0245;
                case 54: goto L_0x0232;
                case 55: goto L_0x021f;
                case 56: goto L_0x020c;
                case 57: goto L_0x01f9;
                case 58: goto L_0x01e6;
                case 59: goto L_0x027e;
                case 60: goto L_0x026b;
                case 61: goto L_0x01d5;
                case 62: goto L_0x01c2;
                case 63: goto L_0x0532;
                case 64: goto L_0x01af;
                case 65: goto L_0x019c;
                case 66: goto L_0x0189;
                case 67: goto L_0x0176;
                case 68: goto L_0x0462;
                default: goto L_0x004e;
            }
        L_0x004e:
            if (r15 != 0) goto L_0x0054
            X.9lJ r15 = r13.A00(r14)     // Catch:{ 8SZ -> 0x0629 }
        L_0x0054:
            boolean r0 = r13.A01(r0, r15)     // Catch:{ 8SZ -> 0x0629 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0649
        L_0x005c:
            long r1 = X.C165597tg.A0D(r2)     // Catch:{ 8SZ -> 0x0629 }
            X.B3d r3 = r12.A0N(r3)     // Catch:{ 8SZ -> 0x0629 }
            X.9ff r4 = r12.A04     // Catch:{ 8SZ -> 0x0629 }
            java.util.List r5 = r4.A01(r14, r1)     // Catch:{ 8SZ -> 0x0629 }
            int r4 = r0.A02     // Catch:{ 8SZ -> 0x0629 }
            r2 = r4 & 7
            r1 = 3
            if (r2 == r1) goto L_0x0078
            X.8SZ r1 = new X.8SZ     // Catch:{ 8SZ -> 0x0629 }
            r1.<init>()     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x058b
        L_0x0078:
            X.8Hz r1 = r3.BQ8()     // Catch:{ 8SZ -> 0x0629 }
            X.C203179nT.A08(r0, r6, r3, r1)     // Catch:{ 8SZ -> 0x0629 }
            r3.BP1(r1)     // Catch:{ 8SZ -> 0x0629 }
            r5.add(r1)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r2 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            boolean r1 = r2.A0T()     // Catch:{ 8SZ -> 0x0629 }
            if (r1 != 0) goto L_0x000f
            int r1 = r0.A01     // Catch:{ 8SZ -> 0x0629 }
            if (r1 != 0) goto L_0x000f
            int r1 = r2.A0G()     // Catch:{ 8SZ -> 0x0629 }
            if (r1 == r4) goto L_0x0078
            goto L_0x03d6
        L_0x0099:
            long r18 = A0I(r0, r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r1 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            long r20 = r1.A0M()     // Catch:{ 8SZ -> 0x0629 }
            X.9Yj r16 = com.google.protobuf.UnsafeUtil.A02     // Catch:{ 8SZ -> 0x0629 }
            r17 = r14
            r16.A0F(r17, r18, r20)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0624
        L_0x00ac:
            long r1 = A0I(r0, r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r4 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            int r4 = r4.A0F()     // Catch:{ 8SZ -> 0x0629 }
            com.google.protobuf.UnsafeUtil.A06(r14, r1, r4)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0624
        L_0x00bb:
            long r18 = A0J(r0, r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r1 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            long r20 = r1.A0L()     // Catch:{ 8SZ -> 0x0629 }
            X.9Yj r16 = com.google.protobuf.UnsafeUtil.A02     // Catch:{ 8SZ -> 0x0629 }
            r17 = r14
            r16.A0F(r17, r18, r20)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0624
        L_0x00ce:
            long r1 = A0K(r0, r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r4 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            int r4 = r4.A0E()     // Catch:{ 8SZ -> 0x0629 }
            com.google.protobuf.UnsafeUtil.A06(r14, r1, r4)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0624
        L_0x00dd:
            long r1 = A0I(r0, r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r4 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            int r4 = r4.A0H()     // Catch:{ 8SZ -> 0x0629 }
            com.google.protobuf.UnsafeUtil.A06(r14, r1, r4)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0624
        L_0x00ec:
            long r1 = X.C165597tg.A0D(r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r4 = X.C203179nT.A03(r0)     // Catch:{ 8SZ -> 0x0629 }
            X.AUx r4 = r4.A0O()     // Catch:{ 8SZ -> 0x0629 }
            com.google.protobuf.UnsafeUtil.A07(r14, r1, r4)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0624
        L_0x00fd:
            long r1 = A0I(r0, r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r4 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            boolean r5 = r4.A0U()     // Catch:{ 8SZ -> 0x0629 }
            X.9Yj r4 = com.google.protobuf.UnsafeUtil.A02     // Catch:{ 8SZ -> 0x0629 }
            r4.A0H(r14, r1, r5)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0624
        L_0x010e:
            long r1 = A0K(r0, r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r4 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            int r4 = r4.A0C()     // Catch:{ 8SZ -> 0x0629 }
            com.google.protobuf.UnsafeUtil.A06(r14, r1, r4)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0624
        L_0x011d:
            long r18 = A0J(r0, r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r1 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            long r20 = r1.A0J()     // Catch:{ 8SZ -> 0x0629 }
            X.9Yj r16 = com.google.protobuf.UnsafeUtil.A02     // Catch:{ 8SZ -> 0x0629 }
            r17 = r14
            r16.A0F(r17, r18, r20)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0624
        L_0x0130:
            long r1 = A0I(r0, r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r4 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            int r4 = r4.A0D()     // Catch:{ 8SZ -> 0x0629 }
            com.google.protobuf.UnsafeUtil.A06(r14, r1, r4)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0624
        L_0x013f:
            long r18 = A0I(r0, r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r1 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            long r20 = r1.A0N()     // Catch:{ 8SZ -> 0x0629 }
            X.9Yj r16 = com.google.protobuf.UnsafeUtil.A02     // Catch:{ 8SZ -> 0x0629 }
            r17 = r14
            r16.A0F(r17, r18, r20)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0624
        L_0x0152:
            long r18 = A0I(r0, r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r1 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            long r20 = r1.A0K()     // Catch:{ 8SZ -> 0x0629 }
            X.9Yj r16 = com.google.protobuf.UnsafeUtil.A02     // Catch:{ 8SZ -> 0x0629 }
            r17 = r14
            r16.A0F(r17, r18, r20)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0624
        L_0x0165:
            long r1 = A0K(r0, r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r4 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            float r5 = r4.A09()     // Catch:{ 8SZ -> 0x0629 }
            X.9Yj r4 = com.google.protobuf.UnsafeUtil.A02     // Catch:{ 8SZ -> 0x0629 }
            r4.A0D(r14, r1, r5)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0624
        L_0x0176:
            long r1 = A0I(r0, r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r7 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            long r7 = r7.A0M()     // Catch:{ 8SZ -> 0x0629 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ 8SZ -> 0x0629 }
            com.google.protobuf.UnsafeUtil.A07(r14, r1, r7)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0569
        L_0x0189:
            long r1 = A0I(r0, r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r7 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            int r7 = r7.A0F()     // Catch:{ 8SZ -> 0x0629 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ 8SZ -> 0x0629 }
            com.google.protobuf.UnsafeUtil.A07(r14, r1, r7)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0569
        L_0x019c:
            long r1 = A0J(r0, r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r7 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            long r7 = r7.A0L()     // Catch:{ 8SZ -> 0x0629 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ 8SZ -> 0x0629 }
            com.google.protobuf.UnsafeUtil.A07(r14, r1, r7)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0569
        L_0x01af:
            long r1 = A0K(r0, r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r7 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            int r7 = r7.A0E()     // Catch:{ 8SZ -> 0x0629 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ 8SZ -> 0x0629 }
            com.google.protobuf.UnsafeUtil.A07(r14, r1, r7)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0569
        L_0x01c2:
            long r1 = A0I(r0, r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r7 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            int r7 = r7.A0H()     // Catch:{ 8SZ -> 0x0629 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ 8SZ -> 0x0629 }
            com.google.protobuf.UnsafeUtil.A07(r14, r1, r7)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0569
        L_0x01d5:
            long r1 = X.C165597tg.A0D(r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r7 = X.C203179nT.A03(r0)     // Catch:{ 8SZ -> 0x0629 }
            X.AUx r7 = r7.A0O()     // Catch:{ 8SZ -> 0x0629 }
            com.google.protobuf.UnsafeUtil.A07(r14, r1, r7)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0569
        L_0x01e6:
            long r1 = A0I(r0, r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r7 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            boolean r7 = r7.A0U()     // Catch:{ 8SZ -> 0x0629 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ 8SZ -> 0x0629 }
            com.google.protobuf.UnsafeUtil.A07(r14, r1, r7)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0569
        L_0x01f9:
            long r1 = A0K(r0, r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r7 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            int r7 = r7.A0C()     // Catch:{ 8SZ -> 0x0629 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ 8SZ -> 0x0629 }
            com.google.protobuf.UnsafeUtil.A07(r14, r1, r7)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0569
        L_0x020c:
            long r1 = A0J(r0, r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r7 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            long r7 = r7.A0J()     // Catch:{ 8SZ -> 0x0629 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ 8SZ -> 0x0629 }
            com.google.protobuf.UnsafeUtil.A07(r14, r1, r7)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0569
        L_0x021f:
            long r1 = A0I(r0, r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r7 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            int r7 = r7.A0D()     // Catch:{ 8SZ -> 0x0629 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ 8SZ -> 0x0629 }
            com.google.protobuf.UnsafeUtil.A07(r14, r1, r7)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0569
        L_0x0232:
            long r1 = A0I(r0, r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r7 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            long r7 = r7.A0N()     // Catch:{ 8SZ -> 0x0629 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ 8SZ -> 0x0629 }
            com.google.protobuf.UnsafeUtil.A07(r14, r1, r7)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0569
        L_0x0245:
            long r1 = A0I(r0, r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r7 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            long r7 = r7.A0K()     // Catch:{ 8SZ -> 0x0629 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ 8SZ -> 0x0629 }
            com.google.protobuf.UnsafeUtil.A07(r14, r1, r7)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0569
        L_0x0258:
            long r1 = A0K(r0, r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r7 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            float r7 = r7.A09()     // Catch:{ 8SZ -> 0x0629 }
            java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch:{ 8SZ -> 0x0629 }
            com.google.protobuf.UnsafeUtil.A07(r14, r1, r7)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0569
        L_0x026b:
            java.lang.Object r8 = r12.A0S(r14, r4, r3)     // Catch:{ 8SZ -> 0x0629 }
            X.B63 r8 = (X.B63) r8     // Catch:{ 8SZ -> 0x0629 }
            X.B3d r2 = r12.A0N(r3)     // Catch:{ 8SZ -> 0x0629 }
            r1 = 2
            X.C203179nT.A07(r0, r1)     // Catch:{ 8SZ -> 0x0629 }
            X.C203179nT.A09(r0, r6, r2, r8)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0473
        L_0x027e:
            r12.A0X(r0, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0569
        L_0x0283:
            long r1 = A0J(r0, r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r7 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            double r7 = r7.A08()     // Catch:{ 8SZ -> 0x0629 }
            java.lang.Double r7 = java.lang.Double.valueOf(r7)     // Catch:{ 8SZ -> 0x0629 }
            com.google.protobuf.UnsafeUtil.A07(r14, r1, r7)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0569
        L_0x0296:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0M(r1)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x029f:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0L(r1)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x02a8:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0K(r1)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x02b1:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0J(r1)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x02ba:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0D(r1)     // Catch:{ 8SZ -> 0x0629 }
            X.AyC r16 = A0L(r12, r3)     // Catch:{ 8SZ -> 0x0629 }
            r17 = r13
            r18 = r14
            r19 = r15
            r20 = r1
            r21 = r4
            java.lang.Object r15 = X.C203849oy.A0A(r16, r17, r18, r19, r20, r21)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x02d5:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0N(r1)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x02de:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0B(r1)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x02e7:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0E(r1)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x02f0:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0F(r1)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x02f9:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0H(r1)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x0302:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0O(r1)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x030b:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0I(r1)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x0314:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0G(r1)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x031d:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0C(r1)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x0326:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0M(r1)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x032f:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0L(r1)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x0338:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0K(r1)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x0341:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0J(r1)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x034a:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0D(r1)     // Catch:{ 8SZ -> 0x0629 }
            X.AyC r16 = A0L(r12, r3)     // Catch:{ 8SZ -> 0x0629 }
            r17 = r13
            r18 = r14
            r19 = r15
            r20 = r1
            r21 = r4
            java.lang.Object r15 = X.C203849oy.A0A(r16, r17, r18, r19, r20, r21)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x0365:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0N(r1)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x036e:
            java.util.List r3 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            int r1 = r0.A02     // Catch:{ 8SZ -> 0x0629 }
            r2 = r1 & 7
            r1 = 2
            if (r2 == r1) goto L_0x0380
            X.8SZ r1 = new X.8SZ     // Catch:{ 8SZ -> 0x0629 }
            r1.<init>()     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x058b
        L_0x0380:
            X.9h2 r2 = X.C203179nT.A03(r0)     // Catch:{ 8SZ -> 0x0629 }
            X.AUx r1 = r2.A0O()     // Catch:{ 8SZ -> 0x0629 }
            r3.add(r1)     // Catch:{ 8SZ -> 0x0629 }
            boolean r1 = r2.A0T()     // Catch:{ 8SZ -> 0x0629 }
            if (r1 != 0) goto L_0x000f
            int r2 = r2.A0G()     // Catch:{ 8SZ -> 0x0629 }
            int r1 = r0.A02     // Catch:{ 8SZ -> 0x0629 }
            if (r2 == r1) goto L_0x0380
            goto L_0x05ec
        L_0x039b:
            X.B3d r3 = r12.A0N(r3)     // Catch:{ 8SZ -> 0x0629 }
            long r1 = X.C165597tg.A0D(r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9ff r4 = r12.A04     // Catch:{ 8SZ -> 0x0629 }
            java.util.List r5 = r4.A01(r14, r1)     // Catch:{ 8SZ -> 0x0629 }
            int r4 = r0.A02     // Catch:{ 8SZ -> 0x0629 }
            r2 = r4 & 7
            r1 = 2
            if (r2 == r1) goto L_0x03b7
            X.8SZ r1 = new X.8SZ     // Catch:{ 8SZ -> 0x0629 }
            r1.<init>()     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x058b
        L_0x03b7:
            X.8Hz r1 = r3.BQ8()     // Catch:{ 8SZ -> 0x0629 }
            X.C203179nT.A09(r0, r6, r3, r1)     // Catch:{ 8SZ -> 0x0629 }
            r3.BP1(r1)     // Catch:{ 8SZ -> 0x0629 }
            r5.add(r1)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r2 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            boolean r1 = r2.A0T()     // Catch:{ 8SZ -> 0x0629 }
            if (r1 != 0) goto L_0x000f
            int r1 = r0.A01     // Catch:{ 8SZ -> 0x0629 }
            if (r1 != 0) goto L_0x000f
            int r1 = r2.A0G()     // Catch:{ 8SZ -> 0x0629 }
            if (r1 == r4) goto L_0x03b7
        L_0x03d6:
            r0.A01 = r1     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x03da:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0B(r1)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x03e3:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0E(r1)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x03ec:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0F(r1)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x03f5:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0H(r1)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x03fe:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0O(r1)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x0407:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0I(r1)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x0410:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0G(r1)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x0419:
            java.util.List r1 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            r0.A0C(r1)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x0422:
            java.lang.Object r4 = r12.A0R(r14, r3)     // Catch:{ 8SZ -> 0x0629 }
            X.B63 r4 = (X.B63) r4     // Catch:{ 8SZ -> 0x0629 }
            X.B3d r2 = r12.A0N(r3)     // Catch:{ 8SZ -> 0x0629 }
            r1 = 3
            X.C203179nT.A07(r0, r1)     // Catch:{ 8SZ -> 0x0629 }
            X.C203179nT.A08(r0, r6, r2, r4)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0445
        L_0x0434:
            java.lang.Object r4 = r12.A0R(r14, r3)     // Catch:{ 8SZ -> 0x0629 }
            X.B63 r4 = (X.B63) r4     // Catch:{ 8SZ -> 0x0629 }
            X.B3d r2 = r12.A0N(r3)     // Catch:{ 8SZ -> 0x0629 }
            r1 = 2
            X.C203179nT.A07(r0, r1)     // Catch:{ 8SZ -> 0x0629 }
            X.C203179nT.A09(r0, r6, r2, r4)     // Catch:{ 8SZ -> 0x0629 }
        L_0x0445:
            r12.A0c(r14, r3, r4)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x044a:
            r12.A0X(r0, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0624
        L_0x044f:
            long r18 = A0J(r0, r2)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r1 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            double r20 = r1.A08()     // Catch:{ 8SZ -> 0x0629 }
            X.9Yj r16 = com.google.protobuf.UnsafeUtil.A02     // Catch:{ 8SZ -> 0x0629 }
            r17 = r14
            r16.A0C(r17, r18, r20)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0624
        L_0x0462:
            java.lang.Object r8 = r12.A0S(r14, r4, r3)     // Catch:{ 8SZ -> 0x0629 }
            X.B63 r8 = (X.B63) r8     // Catch:{ 8SZ -> 0x0629 }
            X.B3d r2 = r12.A0N(r3)     // Catch:{ 8SZ -> 0x0629 }
            r1 = 3
            X.C203179nT.A07(r0, r1)     // Catch:{ 8SZ -> 0x0629 }
            X.C203179nT.A08(r0, r6, r2, r8)     // Catch:{ 8SZ -> 0x0629 }
        L_0x0473:
            sun.misc.Unsafe r7 = A0F     // Catch:{ 8SZ -> 0x0629 }
            r1 = r5[r9]     // Catch:{ 8SZ -> 0x0629 }
            long r1 = X.C165597tg.A0D(r1)     // Catch:{ 8SZ -> 0x0629 }
            r7.putObject(r14, r1, r8)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x0569
        L_0x0480:
            java.lang.Object[] r4 = r12.A07     // Catch:{ 8SZ -> 0x0629 }
            int r1 = r3 / 3
            int r1 = r1 * 2
            r4 = r4[r1]     // Catch:{ 8SZ -> 0x0629 }
            long r1 = X.C165597tg.A0D(r2)     // Catch:{ 8SZ -> 0x0629 }
            java.lang.Object r8 = X.AnonymousClass9Yj.A00(r14, r1)     // Catch:{ 8SZ -> 0x0629 }
            if (r8 != 0) goto L_0x04b5
            X.AcX r3 = X.C21903AcX.A00     // Catch:{ 8SZ -> 0x0629 }
            X.AcX r8 = X.C165597tg.A0M(r3)     // Catch:{ 8SZ -> 0x0629 }
            com.google.protobuf.UnsafeUtil.A07(r14, r1, r8)     // Catch:{ 8SZ -> 0x0629 }
        L_0x049b:
            X.AcX r8 = (X.C21903AcX) r8     // Catch:{ 8SZ -> 0x0629 }
            X.9Jh r4 = (X.C192959Jh) r4     // Catch:{ 8SZ -> 0x0629 }
            X.9LV r10 = r4.A00     // Catch:{ 8SZ -> 0x0629 }
            r9 = 2
            X.C203179nT.A07(r0, r9)     // Catch:{ 8SZ -> 0x0629 }
            X.9h2 r7 = r0.A03     // Catch:{ 8SZ -> 0x0629 }
            int r1 = r7.A0H()     // Catch:{ 8SZ -> 0x0629 }
            int r5 = r7.A0I(r1)     // Catch:{ 8SZ -> 0x0629 }
            java.lang.String r4 = ""
            r16 = r4
            r3 = r4
            goto L_0x04cc
        L_0x04b5:
            r3 = r8
            X.AcX r3 = (X.C21903AcX) r3     // Catch:{ 8SZ -> 0x0629 }
            boolean r3 = r3.isMutable     // Catch:{ 8SZ -> 0x0629 }
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x049b
            X.AcX r3 = X.C21903AcX.A00     // Catch:{ 8SZ -> 0x0629 }
            X.AcX r3 = X.C165597tg.A0M(r3)     // Catch:{ 8SZ -> 0x0629 }
            X.C200369hI.A01(r3, r8)     // Catch:{ 8SZ -> 0x0629 }
            com.google.protobuf.UnsafeUtil.A07(r14, r1, r3)     // Catch:{ 8SZ -> 0x0629 }
            r8 = r3
            goto L_0x049b
        L_0x04cc:
            int r2 = r0.A0A()     // Catch:{ all -> 0x052d }
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r1) goto L_0x0525
            boolean r1 = r7.A0T()     // Catch:{ all -> 0x052d }
            if (r1 != 0) goto L_0x0525
            r1 = 1
            java.lang.String r11 = "Unable to parse map entry."
            if (r2 == r1) goto L_0x0505
            if (r2 == r9) goto L_0x04fa
            boolean r1 = r7.A0T()     // Catch:{ 8SZ -> 0x050d }
            if (r1 != 0) goto L_0x04f5
            int r2 = r0.A02     // Catch:{ 8SZ -> 0x050d }
            int r1 = r0.A00     // Catch:{ 8SZ -> 0x050d }
            if (r2 == r1) goto L_0x04f5
            boolean r1 = r7.A0V(r2)     // Catch:{ 8SZ -> 0x050d }
            if (r1 == 0) goto L_0x04f5
            goto L_0x04cc
        L_0x04f5:
            X.186 r1 = X.C165617ti.A0L(r11)     // Catch:{ 8SZ -> 0x050d }
            throw r1     // Catch:{ 8SZ -> 0x050d }
        L_0x04fa:
            X.8zm r2 = r10.A01     // Catch:{ 8SZ -> 0x050d }
            java.lang.Class r1 = r16.getClass()     // Catch:{ 8SZ -> 0x050d }
            java.lang.Object r3 = X.C203179nT.A04(r0, r6, r2, r1)     // Catch:{ 8SZ -> 0x050d }
            goto L_0x04cc
        L_0x0505:
            X.8zm r2 = r10.A00     // Catch:{ 8SZ -> 0x050d }
            r1 = 0
            java.lang.Object r4 = X.C203179nT.A04(r0, r1, r2, r1)     // Catch:{ 8SZ -> 0x050d }
            goto L_0x04cc
        L_0x050d:
            boolean r1 = r7.A0T()     // Catch:{ all -> 0x052d }
            if (r1 != 0) goto L_0x0520
            int r2 = r0.A02     // Catch:{ all -> 0x052d }
            int r1 = r0.A00     // Catch:{ all -> 0x052d }
            if (r2 == r1) goto L_0x0520
            boolean r1 = r7.A0V(r2)     // Catch:{ all -> 0x052d }
            if (r1 == 0) goto L_0x0520
            goto L_0x04cc
        L_0x0520:
            X.186 r1 = X.C165617ti.A0L(r11)     // Catch:{ all -> 0x052d }
            throw r1     // Catch:{ all -> 0x052d }
        L_0x0525:
            r8.put(r4, r3)     // Catch:{ all -> 0x052d }
            r7.A0S(r5)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x052d:
            r1 = move-exception
            r7.A0S(r5)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x058b
        L_0x0532:
            X.9h2 r1 = X.C203179nT.A02(r0)     // Catch:{ 8SZ -> 0x0629 }
            int r8 = r1.A0B()     // Catch:{ 8SZ -> 0x0629 }
            X.AyC r1 = A0L(r12, r3)     // Catch:{ 8SZ -> 0x0629 }
            if (r1 == 0) goto L_0x055e
            boolean r1 = r1.BM0(r8)     // Catch:{ 8SZ -> 0x0629 }
            if (r1 != 0) goto L_0x055e
            r7 = r15
            X.9TG r1 = X.C203849oy.A02     // Catch:{ 8SZ -> 0x0629 }
            if (r15 != 0) goto L_0x054f
            X.9lJ r7 = r13.A00(r14)     // Catch:{ 8SZ -> 0x0629 }
        L_0x054f:
            long r1 = (long) r8     // Catch:{ 8SZ -> 0x0629 }
            r5 = r7
            X.9lJ r5 = (X.C202229lJ) r5     // Catch:{ 8SZ -> 0x0629 }
            int r3 = r4 << 3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ 8SZ -> 0x0629 }
            r5.A02(r3, r1)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x061a
        L_0x055e:
            long r1 = X.C165597tg.A0D(r2)     // Catch:{ 8SZ -> 0x0629 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ 8SZ -> 0x0629 }
            com.google.protobuf.UnsafeUtil.A07(r14, r1, r7)     // Catch:{ 8SZ -> 0x0629 }
        L_0x0569:
            long r1 = X.C165577te.A0H(r5, r3)     // Catch:{ 8SZ -> 0x0629 }
            com.google.protobuf.UnsafeUtil.A06(r14, r1, r4)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x0572:
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r2
            boolean r1 = X.AnonymousClass000.A1P(r1)
            java.util.List r3 = A0V(r12, r14, r2)     // Catch:{ 8SZ -> 0x0629 }
            if (r1 == 0) goto L_0x058c
            int r1 = r0.A02     // Catch:{ 8SZ -> 0x0629 }
            r2 = r1 & 7
            r1 = 2
            if (r2 == r1) goto L_0x05d3
            X.8SZ r1 = new X.8SZ     // Catch:{ 8SZ -> 0x0629 }
            r1.<init>()     // Catch:{ 8SZ -> 0x0629 }
        L_0x058b:
            throw r1     // Catch:{ 8SZ -> 0x0629 }
        L_0x058c:
            int r1 = r0.A02     // Catch:{ 8SZ -> 0x0629 }
            r2 = r1 & 7
            r1 = 2
            if (r2 != r1) goto L_0x05b3
            boolean r1 = r3 instanceof X.B6Z     // Catch:{ 8SZ -> 0x0629 }
            if (r1 == 0) goto L_0x05b9
            X.B6Z r3 = (X.B6Z) r3     // Catch:{ 8SZ -> 0x0629 }
        L_0x0599:
            X.9h2 r2 = X.C203179nT.A03(r0)     // Catch:{ 8SZ -> 0x0629 }
            X.AUx r1 = r2.A0O()     // Catch:{ 8SZ -> 0x0629 }
            r3.B0D(r1)     // Catch:{ 8SZ -> 0x0629 }
            boolean r1 = r2.A0T()     // Catch:{ 8SZ -> 0x0629 }
            if (r1 != 0) goto L_0x000f
            int r2 = r2.A0G()     // Catch:{ 8SZ -> 0x0629 }
            int r1 = r0.A02     // Catch:{ 8SZ -> 0x0629 }
            if (r2 == r1) goto L_0x0599
            goto L_0x05ec
        L_0x05b3:
            X.8SZ r1 = new X.8SZ     // Catch:{ 8SZ -> 0x0629 }
            r1.<init>()     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x058b
        L_0x05b9:
            X.9h2 r2 = X.C203179nT.A03(r0)     // Catch:{ 8SZ -> 0x0629 }
            java.lang.String r1 = r2.A0P()     // Catch:{ 8SZ -> 0x0629 }
            r3.add(r1)     // Catch:{ 8SZ -> 0x0629 }
            boolean r1 = r2.A0T()     // Catch:{ 8SZ -> 0x0629 }
            if (r1 != 0) goto L_0x000f
            int r2 = r2.A0G()     // Catch:{ 8SZ -> 0x0629 }
            int r1 = r0.A02     // Catch:{ 8SZ -> 0x0629 }
            if (r2 == r1) goto L_0x05b9
            goto L_0x05ec
        L_0x05d3:
            X.9h2 r2 = X.C203179nT.A03(r0)     // Catch:{ 8SZ -> 0x0629 }
            java.lang.String r1 = r2.A0Q()     // Catch:{ 8SZ -> 0x0629 }
            r3.add(r1)     // Catch:{ 8SZ -> 0x0629 }
            boolean r1 = r2.A0T()     // Catch:{ 8SZ -> 0x0629 }
            if (r1 != 0) goto L_0x000f
            int r2 = r2.A0G()     // Catch:{ 8SZ -> 0x0629 }
            int r1 = r0.A02     // Catch:{ 8SZ -> 0x0629 }
            if (r2 == r1) goto L_0x05d3
        L_0x05ec:
            r0.A01 = r2     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x05f0:
            X.9h2 r1 = X.C203179nT.A02(r0)     // Catch:{ 8SZ -> 0x0629 }
            int r5 = r1.A0B()     // Catch:{ 8SZ -> 0x0629 }
            X.AyC r1 = A0L(r12, r3)     // Catch:{ 8SZ -> 0x0629 }
            if (r1 == 0) goto L_0x061d
            boolean r1 = r1.BM0(r5)     // Catch:{ 8SZ -> 0x0629 }
            if (r1 != 0) goto L_0x061d
            r7 = r15
            X.9TG r1 = X.C203849oy.A02     // Catch:{ 8SZ -> 0x0629 }
            if (r15 != 0) goto L_0x060d
            X.9lJ r7 = r13.A00(r14)     // Catch:{ 8SZ -> 0x0629 }
        L_0x060d:
            long r1 = (long) r5     // Catch:{ 8SZ -> 0x0629 }
            r5 = r7
            X.9lJ r5 = (X.C202229lJ) r5     // Catch:{ 8SZ -> 0x0629 }
            int r3 = r4 << 3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ 8SZ -> 0x0629 }
            r5.A02(r3, r1)     // Catch:{ 8SZ -> 0x0629 }
        L_0x061a:
            r15 = r7
            goto L_0x000f
        L_0x061d:
            long r1 = X.C165597tg.A0D(r2)     // Catch:{ 8SZ -> 0x0629 }
            com.google.protobuf.UnsafeUtil.A06(r14, r1, r5)     // Catch:{ 8SZ -> 0x0629 }
        L_0x0624:
            r12.A0b(r14, r3)     // Catch:{ 8SZ -> 0x0629 }
            goto L_0x000f
        L_0x0629:
            if (r15 != 0) goto L_0x062f
            X.9lJ r15 = r13.A00(r14)     // Catch:{ all -> 0x0678 }
        L_0x062f:
            boolean r0 = r13.A01(r0, r15)     // Catch:{ all -> 0x0678 }
            if (r0 != 0) goto L_0x000f
            goto L_0x065c
        L_0x0636:
            int r1 = r12.A00
        L_0x0638:
            int r0 = r12.A03
            if (r1 >= r0) goto L_0x066f
            int[] r0 = r12.A06
            r17 = r0[r1]
            r16 = r14
            java.lang.Object r15 = r12.A0Q(r13, r14, r15, r16, r17)
            int r1 = r1 + 1
            goto L_0x0638
        L_0x0649:
            int r1 = r12.A00
        L_0x064b:
            int r0 = r12.A03
            if (r1 >= r0) goto L_0x066f
            int[] r0 = r12.A06
            r17 = r0[r1]
            r16 = r14
            java.lang.Object r15 = r12.A0Q(r13, r14, r15, r16, r17)
            int r1 = r1 + 1
            goto L_0x064b
        L_0x065c:
            int r1 = r12.A00
        L_0x065e:
            int r0 = r12.A03
            if (r1 >= r0) goto L_0x066f
            int[] r0 = r12.A06
            r17 = r0[r1]
            r16 = r14
            java.lang.Object r15 = r12.A0Q(r13, r14, r15, r16, r17)
            int r1 = r1 + 1
            goto L_0x065e
        L_0x066f:
            if (r15 == 0) goto L_0x0677
            X.9lJ r15 = (X.C202229lJ) r15
            X.8Hz r14 = (X.C170918Hz) r14
            r14.unknownFields = r15
        L_0x0677:
            return
        L_0x0678:
            r2 = move-exception
            int r1 = r12.A00
        L_0x067b:
            int r0 = r12.A03
            if (r1 >= r0) goto L_0x068c
            int[] r0 = r12.A06
            r17 = r0[r1]
            r16 = r14
            java.lang.Object r15 = r12.A0Q(r13, r14, r15, r16, r17)
            int r1 = r1 + 1
            goto L_0x067b
        L_0x068c:
            if (r15 == 0) goto L_0x0694
            X.9lJ r15 = (X.C202229lJ) r15
            X.8Hz r14 = (X.C170918Hz) r14
            r14.unknownFields = r15
        L_0x0694:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21074A7l.BPn(X.9nT, X.9ko, java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a6, code lost:
        r14 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0111, code lost:
        r9 = r6 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0121, code lost:
        r9 = r6 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x018f, code lost:
        r15.putObject(r10, r2, r5.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a3, code lost:
        r15.putInt(r10, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01b6, code lost:
        r15.putLong(r10, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01c1, code lost:
        r20 = r20 | r18;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BPo(X.C197909ca r39, java.lang.Object r40, byte[] r41, int r42, int r43) {
        /*
            r38 = this;
            r9 = r42
            r13 = r38
            boolean r0 = r13.A0E
            r5 = r39
            r10 = r40
            r4 = r41
            r37 = r43
            if (r0 == 0) goto L_0x029d
            A0a(r10)
            sun.misc.Unsafe r15 = A0F
            r2 = -1
            r21 = -1
            r8 = 0
            r20 = 0
            r19 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001e:
            r0 = r37
            if (r9 >= r0) goto L_0x0285
            int r6 = r9 + 1
            byte r12 = r41[r9]
            if (r12 >= 0) goto L_0x002e
            int r6 = A0F(r5, r4, r12, r6)
            int r12 = r5.A00
        L_0x002e:
            int r14 = r12 >>> 3
            r7 = r12 & 7
            r0 = r21
            if (r14 <= r0) goto L_0x005b
            int r11 = r8 / 3
            int r0 = r13.A02
            if (r14 < r0) goto L_0x027d
            int r0 = r13.A01
            if (r14 > r0) goto L_0x027d
            int[] r9 = r13.A05
            int r0 = r9.length
            int r0 = r0 / 3
            int r3 = r0 + -1
        L_0x0047:
            if (r11 > r3) goto L_0x027d
            int r0 = r3 + r11
            int r1 = r0 >>> 1
            int r8 = r1 * 3
            r0 = r9[r8]
            if (r14 == r0) goto L_0x005f
            if (r14 >= r0) goto L_0x0058
            int r3 = r1 + -1
            goto L_0x0047
        L_0x0058:
            int r11 = r1 + 1
            goto L_0x0047
        L_0x005b:
            int r8 = r13.A00(r14)
        L_0x005f:
            if (r8 == r2) goto L_0x027d
            int[] r9 = r13.A05
            int r0 = r8 + 1
            r17 = r9[r0]
            int r16 = X.C165587tf.A02(r17)
            long r2 = X.C165597tg.A0D(r17)
            r21 = r14
            r0 = 17
            r1 = r0
            r0 = r16
            if (r0 > r1) goto L_0x01c5
            int r0 = r8 + 2
            r9 = r9[r0]
            int r0 = r9 >>> 20
            r11 = 1
            int r18 = r11 << r0
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r0
            r0 = r19
            if (r9 == r0) goto L_0x00a3
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r0
            r0 = r19
            if (r0 == r1) goto L_0x0097
            long r0 = (long) r0
            r14 = r20
            r15.putInt(r10, r0, r14)
        L_0x0097:
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r9 == r0) goto L_0x00a1
            long r0 = (long) r9
            int r20 = r15.getInt(r10, r0)
        L_0x00a1:
            r19 = r9
        L_0x00a3:
            switch(r16) {
                case 0: goto L_0x00bf;
                case 1: goto L_0x00d5;
                case 2: goto L_0x00e8;
                case 3: goto L_0x00e8;
                case 4: goto L_0x00f4;
                case 5: goto L_0x0100;
                case 6: goto L_0x0115;
                case 7: goto L_0x0125;
                case 8: goto L_0x013d;
                case 9: goto L_0x0167;
                case 10: goto L_0x0186;
                case 11: goto L_0x00f4;
                case 12: goto L_0x00f4;
                case 13: goto L_0x0115;
                case 14: goto L_0x0100;
                case 15: goto L_0x0195;
                case 16: goto L_0x01a7;
                default: goto L_0x00a6;
            }
        L_0x00a6:
            r14 = r21
        L_0x00a8:
            X.9lJ r22 = A0O(r10)
            r21 = r5
            r23 = r4
            r24 = r12
            r25 = r6
            r26 = r37
            int r9 = A06(r21, r22, r23, r24, r25, r26)
            r21 = r14
        L_0x00bc:
            r2 = -1
            goto L_0x001e
        L_0x00bf:
            r14 = r21
            if (r7 != r11) goto L_0x00a8
            long r0 = X.C165567td.A0A(r4, r6)
            double r26 = java.lang.Double.longBitsToDouble(r0)
            X.9Yj r22 = com.google.protobuf.UnsafeUtil.A02
            r23 = r10
            r24 = r2
            r22.A0C(r23, r24, r26)
            goto L_0x0111
        L_0x00d5:
            r14 = r21
            r0 = 5
            if (r7 != r0) goto L_0x00a8
            int r0 = X.C165567td.A04(r4, r6)
            float r1 = java.lang.Float.intBitsToFloat(r0)
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            r0.A0D(r10, r2, r1)
            goto L_0x0121
        L_0x00e8:
            r14 = r21
            if (r7 != 0) goto L_0x00a8
            int r9 = A0E(r5, r4, r6)
            long r0 = r5.A01
            goto L_0x01b6
        L_0x00f4:
            r14 = r21
            if (r7 != 0) goto L_0x00a8
            int r9 = A0D(r5, r4, r6)
            int r0 = r5.A00
            goto L_0x01a3
        L_0x0100:
            r14 = r21
            if (r7 != r11) goto L_0x00a8
            long r26 = X.C165567td.A0A(r4, r6)
            r22 = r15
            r23 = r10
            r24 = r2
            r22.putLong(r23, r24, r26)
        L_0x0111:
            int r9 = r6 + 8
            goto L_0x01c1
        L_0x0115:
            r14 = r21
            r0 = 5
            if (r7 != r0) goto L_0x00a8
            int r0 = X.C165567td.A04(r4, r6)
            r15.putInt(r10, r2, r0)
        L_0x0121:
            int r9 = r6 + 4
            goto L_0x01c1
        L_0x0125:
            r14 = r21
            if (r7 != 0) goto L_0x00a8
            int r9 = A0E(r5, r4, r6)
            long r0 = r5.A01
            r16 = 0
            int r6 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r6 != 0) goto L_0x0136
            r11 = 0
        L_0x0136:
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            r0.A0H(r10, r2, r11)
            goto L_0x01c1
        L_0x013d:
            r0 = 2
            r14 = r21
            if (r7 != r0) goto L_0x00a8
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r17 = r17 & r0
            if (r17 != 0) goto L_0x0162
            int r9 = A0D(r5, r4, r6)
            int r6 = r5.A00
            if (r6 < 0) goto L_0x0280
            if (r6 != 0) goto L_0x0157
            java.lang.String r0 = ""
            r5.A02 = r0
            goto L_0x018f
        L_0x0157:
            java.nio.charset.Charset r1 = X.AnonymousClass9BD.A04
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r9, r6, r1)
            r5.A02 = r0
            int r9 = r9 + r6
            goto L_0x018f
        L_0x0162:
            int r9 = A0C(r5, r4, r6)
            goto L_0x018f
        L_0x0167:
            r0 = 2
            r14 = r21
            if (r7 != r0) goto L_0x00a8
            java.lang.Object r0 = r13.A0R(r10, r8)
            X.B3d r23 = r13.A0N(r8)
            r22 = r5
            r24 = r0
            r25 = r4
            r26 = r6
            r27 = r37
            int r9 = A03(r22, r23, r24, r25, r26, r27)
            r13.A0c(r10, r8, r0)
            goto L_0x01c1
        L_0x0186:
            r0 = 2
            r14 = r21
            if (r7 != r0) goto L_0x00a8
            int r9 = A0B(r5, r4, r6)
        L_0x018f:
            java.lang.Object r0 = r5.A02
            r15.putObject(r10, r2, r0)
            goto L_0x01c1
        L_0x0195:
            r14 = r21
            if (r7 != 0) goto L_0x00a8
            int r9 = A0D(r5, r4, r6)
            int r0 = r5.A00
            int r0 = X.C165597tg.A02(r0)
        L_0x01a3:
            r15.putInt(r10, r2, r0)
            goto L_0x01c1
        L_0x01a7:
            if (r7 != 0) goto L_0x00a6
            int r9 = A0E(r5, r4, r6)
            long r6 = r5.A01
            long r11 = r6 >>> r11
            r0 = 1
            long r6 = r6 & r0
            long r0 = -r6
            long r0 = r0 ^ r11
        L_0x01b6:
            r22 = r15
            r23 = r10
            r24 = r2
            r26 = r0
            r22.putLong(r23, r24, r26)
        L_0x01c1:
            r20 = r20 | r18
            goto L_0x00bc
        L_0x01c5:
            r1 = 27
            if (r0 != r1) goto L_0x0218
            r0 = 2
            if (r7 != r0) goto L_0x00a8
            java.lang.Object r7 = r15.getObject(r10, r2)
            X.B6c r7 = (X.C23122B6c) r7
            r0 = r7
            X.AcE r0 = (X.C21886AcE) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x01ea
            int r1 = r7.size()
            int r0 = r1 * 2
            if (r1 != 0) goto L_0x01e3
            r0 = 10
        L_0x01e3:
            X.B6c r7 = r7.BQ1(r0)
            r15.putObject(r10, r2, r7)
        L_0x01ea:
            X.B3d r1 = r13.A0N(r8)
        L_0x01ee:
            X.8Hz r0 = r1.BQ8()
            r22 = r5
            r23 = r1
            r24 = r0
            r25 = r4
            r26 = r6
            r27 = r37
            int r9 = A03(r22, r23, r24, r25, r26, r27)
            r1.BP1(r0)
            r5.A02 = r0
            r7.add(r0)
            r0 = r37
            if (r9 >= r0) goto L_0x00bc
            int r6 = A0D(r5, r4, r9)
            int r0 = r5.A00
            if (r12 == r0) goto L_0x01ee
            goto L_0x00bc
        L_0x0218:
            r1 = 49
            if (r0 > r1) goto L_0x0242
            r0 = r17
            long r0 = (long) r0
            r26 = r6
            r27 = r37
            r28 = r12
            r29 = r14
            r30 = r7
            r31 = r8
            r32 = r16
            r33 = r0
            r35 = r2
            r22 = r13
            r23 = r5
            r24 = r10
            r25 = r4
            int r9 = r22.A09(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35)
        L_0x023d:
            if (r9 != r6) goto L_0x00bc
            r6 = r9
            goto L_0x00a8
        L_0x0242:
            r1 = 50
            if (r0 != r1) goto L_0x025e
            r0 = 2
            if (r7 != r0) goto L_0x00a8
            r26 = r6
            r27 = r37
            r28 = r8
            r29 = r2
            r22 = r13
            r23 = r5
            r24 = r10
            r25 = r4
            int r9 = r22.A0A(r23, r24, r25, r26, r27, r28, r29)
            goto L_0x023d
        L_0x025e:
            r26 = r6
            r27 = r37
            r28 = r12
            r29 = r14
            r30 = r7
            r31 = r17
            r32 = r0
            r33 = r8
            r34 = r2
            r22 = r13
            r23 = r5
            r24 = r10
            r25 = r4
            int r9 = r22.A08(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x023d
        L_0x027d:
            r8 = 0
            goto L_0x00a8
        L_0x0280:
            X.186 r0 = X.C165597tg.A0L()
            throw r0
        L_0x0285:
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r19
            if (r0 == r1) goto L_0x0292
            long r1 = (long) r0
            r0 = r20
            r15.putInt(r10, r1, r0)
        L_0x0292:
            r0 = r37
            if (r9 == r0) goto L_0x02a9
            java.lang.String r0 = "Failed to parse the message."
            X.186 r0 = X.C165617ti.A0L(r0)
            throw r0
        L_0x029d:
            r17 = 0
            r15 = r9
            r16 = r37
            r11 = r13
            r12 = r5
            r13 = r10
            r14 = r4
            r11.A0g(r12, r13, r14, r15, r16, r17)
        L_0x02a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21074A7l.BPo(X.9ca, java.lang.Object, byte[], int, int):void");
    }

    public C170918Hz BQ8() {
        return (C170918Hz) C170918Hz.A0S((C170918Hz) this.A0A, C023109s.A0G);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0377, code lost:
        r7.A00.A0D(r2, X.C36431kI.A09(X.AnonymousClass9Yj.A00(r6, X.C165597tg.A0D(r1))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0423, code lost:
        r7.A00.A0A(r2, X.AnonymousClass000.A0I(X.AnonymousClass9Yj.A00(r6, X.C165597tg.A0D(r1))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x043c, code lost:
        r7.A00.A09(r2, X.AnonymousClass000.A0I(X.AnonymousClass9Yj.A00(r6, X.C165597tg.A0D(r1))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04ed, code lost:
        r3 = r3 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x06cc, code lost:
        X.C203849oy.A0E(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x06da, code lost:
        X.C203849oy.A0I(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x06e8, code lost:
        X.C203849oy.A0K(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x06f6, code lost:
        X.C203849oy.A0Q(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0704, code lost:
        X.C203849oy.A0J(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0712, code lost:
        X.C203849oy.A0H(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x07c9, code lost:
        r7.A00.A0D(r2, X.C36431kI.A09(X.AnonymousClass9Yj.A00(r6, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0816, code lost:
        if (r11 == false) goto L_0x04ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0818, code lost:
        A0Y(r7, r4.getObject(r6, r0), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0825, code lost:
        if (r11 == false) goto L_0x04ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0827, code lost:
        r11 = r4.getObject(r6, r0);
        r7.A00.A0I((X.B63) r11, A0N(r3), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x083c, code lost:
        if (r11 == false) goto L_0x04ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x083e, code lost:
        r0 = r7.A00;
        X.C1897895p.A07(r0, r2);
        r0.A0H((X.C21674AUx) r4.getObject(r6, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0869, code lost:
        r7.A00.A0A(r2, X.AnonymousClass000.A0I(X.AnonymousClass9Yj.A00(r6, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x087e, code lost:
        r7.A00.A09(r2, X.AnonymousClass000.A0I(X.AnonymousClass9Yj.A00(r6, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x08d9, code lost:
        if (r11 == false) goto L_0x04ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x08db, code lost:
        r7.A00(A0N(r3), r4.getObject(r6, r0), r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bxf(X.AnonymousClass9TV r18, java.lang.Object r19) {
        /*
            r17 = this;
            r6 = r19
            r5 = r17
            boolean r0 = r5.A0E
            r7 = r18
            if (r0 == 0) goto L_0x04b8
            int[] r4 = r5.A05
            int r9 = r4.length
            r8 = 0
            r3 = 0
        L_0x000f:
            if (r3 >= r9) goto L_0x08eb
            int r0 = r3 + 1
            r1 = r4[r0]
            r2 = r4[r3]
            int r0 = X.C165587tf.A02(r1)
            r10 = 1
            switch(r0) {
                case 0: goto L_0x01ba;
                case 1: goto L_0x01d5;
                case 2: goto L_0x01f0;
                case 3: goto L_0x0207;
                case 4: goto L_0x021e;
                case 5: goto L_0x022f;
                case 6: goto L_0x0246;
                case 7: goto L_0x0257;
                case 8: goto L_0x026e;
                case 9: goto L_0x027d;
                case 10: goto L_0x0294;
                case 11: goto L_0x02aa;
                case 12: goto L_0x02bb;
                case 13: goto L_0x02cc;
                case 14: goto L_0x02dd;
                case 15: goto L_0x02f4;
                case 16: goto L_0x030a;
                case 17: goto L_0x0325;
                case 18: goto L_0x0022;
                case 19: goto L_0x002c;
                case 20: goto L_0x0036;
                case 21: goto L_0x0040;
                case 22: goto L_0x004a;
                case 23: goto L_0x0054;
                case 24: goto L_0x005e;
                case 25: goto L_0x0068;
                case 26: goto L_0x0072;
                case 27: goto L_0x007c;
                case 28: goto L_0x00a5;
                case 29: goto L_0x00b0;
                case 30: goto L_0x00bb;
                case 31: goto L_0x00c6;
                case 32: goto L_0x00d1;
                case 33: goto L_0x00dc;
                case 34: goto L_0x00e7;
                case 35: goto L_0x00f2;
                case 36: goto L_0x00fd;
                case 37: goto L_0x0108;
                case 38: goto L_0x0113;
                case 39: goto L_0x011e;
                case 40: goto L_0x0129;
                case 41: goto L_0x0134;
                case 42: goto L_0x013f;
                case 43: goto L_0x014a;
                case 44: goto L_0x0155;
                case 45: goto L_0x0160;
                case 46: goto L_0x016b;
                case 47: goto L_0x0176;
                case 48: goto L_0x0181;
                case 49: goto L_0x018c;
                case 50: goto L_0x01b1;
                case 51: goto L_0x0338;
                case 52: goto L_0x0351;
                case 53: goto L_0x036a;
                case 54: goto L_0x0371;
                case 55: goto L_0x038a;
                case 56: goto L_0x0392;
                case 57: goto L_0x03ab;
                case 58: goto L_0x03b3;
                case 59: goto L_0x03c8;
                case 60: goto L_0x03d7;
                case 61: goto L_0x03ee;
                case 62: goto L_0x0404;
                case 63: goto L_0x041d;
                case 64: goto L_0x0436;
                case 65: goto L_0x044f;
                case 66: goto L_0x0468;
                case 67: goto L_0x0486;
                case 68: goto L_0x04a5;
                default: goto L_0x001f;
            }
        L_0x001f:
            int r3 = r3 + 3
            goto L_0x000f
        L_0x0022:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0E(r7, r0, r2, r8)
            goto L_0x001f
        L_0x002c:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0I(r7, r0, r2, r8)
            goto L_0x001f
        L_0x0036:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0K(r7, r0, r2, r8)
            goto L_0x001f
        L_0x0040:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0Q(r7, r0, r2, r8)
            goto L_0x001f
        L_0x004a:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0J(r7, r0, r2, r8)
            goto L_0x001f
        L_0x0054:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0H(r7, r0, r2, r8)
            goto L_0x001f
        L_0x005e:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0G(r7, r0, r2, r8)
            goto L_0x001f
        L_0x0068:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0D(r7, r0, r2, r8)
            goto L_0x001f
        L_0x0072:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0C(r7, r0, r2)
            goto L_0x001f
        L_0x007c:
            r11 = r4[r3]
            java.util.List r12 = A0U(r1, r6)
            X.B3d r10 = r5.A0N(r3)
            X.9TG r0 = X.C203849oy.A02
            if (r12 == 0) goto L_0x001f
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x001f
            r2 = 0
        L_0x0091:
            int r0 = r12.size()
            if (r2 >= r0) goto L_0x001f
            java.lang.Object r1 = r12.get(r2)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            X.B63 r1 = (X.B63) r1
            r0.A0I(r1, r10, r11)
            int r2 = r2 + 1
            goto L_0x0091
        L_0x00a5:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0B(r7, r0, r2)
            goto L_0x001f
        L_0x00b0:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0P(r7, r0, r2, r8)
            goto L_0x001f
        L_0x00bb:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0F(r7, r0, r2, r8)
            goto L_0x001f
        L_0x00c6:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0L(r7, r0, r2, r8)
            goto L_0x001f
        L_0x00d1:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0M(r7, r0, r2, r8)
            goto L_0x001f
        L_0x00dc:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0N(r7, r0, r2, r8)
            goto L_0x001f
        L_0x00e7:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0O(r7, r0, r2, r8)
            goto L_0x001f
        L_0x00f2:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0E(r7, r0, r2, r10)
            goto L_0x001f
        L_0x00fd:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0I(r7, r0, r2, r10)
            goto L_0x001f
        L_0x0108:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0K(r7, r0, r2, r10)
            goto L_0x001f
        L_0x0113:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0Q(r7, r0, r2, r10)
            goto L_0x001f
        L_0x011e:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0J(r7, r0, r2, r10)
            goto L_0x001f
        L_0x0129:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0H(r7, r0, r2, r10)
            goto L_0x001f
        L_0x0134:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0G(r7, r0, r2, r10)
            goto L_0x001f
        L_0x013f:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0D(r7, r0, r2, r10)
            goto L_0x001f
        L_0x014a:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0P(r7, r0, r2, r10)
            goto L_0x001f
        L_0x0155:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0F(r7, r0, r2, r10)
            goto L_0x001f
        L_0x0160:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0L(r7, r0, r2, r10)
            goto L_0x001f
        L_0x016b:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0M(r7, r0, r2, r10)
            goto L_0x001f
        L_0x0176:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0N(r7, r0, r2, r10)
            goto L_0x001f
        L_0x0181:
            r2 = r4[r3]
            java.util.List r0 = A0U(r1, r6)
            X.C203849oy.A0O(r7, r0, r2, r10)
            goto L_0x001f
        L_0x018c:
            r11 = r4[r3]
            java.util.List r10 = A0U(r1, r6)
            X.B3d r2 = r5.A0N(r3)
            X.9TG r0 = X.C203849oy.A02
            if (r10 == 0) goto L_0x001f
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x001f
            r1 = 0
        L_0x01a1:
            int r0 = r10.size()
            if (r1 >= r0) goto L_0x001f
            java.lang.Object r0 = r10.get(r1)
            r7.A00(r2, r0, r11)
            int r1 = r1 + 1
            goto L_0x01a1
        L_0x01b1:
            java.lang.Object r0 = A0P(r1, r6)
            r5.A0Z(r7, r0, r2, r3)
            goto L_0x001f
        L_0x01ba:
            boolean r0 = r5.A0e(r6, r3)
            if (r0 == 0) goto L_0x001f
            long r0 = X.C165597tg.A0D(r1)
            X.9Yj r10 = com.google.protobuf.UnsafeUtil.A02
            double r0 = r10.A03(r6, r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            r10.A0C(r2, r0)
            goto L_0x001f
        L_0x01d5:
            boolean r0 = r5.A0e(r6, r3)
            if (r0 == 0) goto L_0x001f
            long r0 = X.C165597tg.A0D(r1)
            X.9Yj r10 = com.google.protobuf.UnsafeUtil.A02
            float r0 = r10.A04(r6, r0)
            com.google.protobuf.CodedOutputStream r1 = r7.A00
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r1.A09(r2, r0)
            goto L_0x001f
        L_0x01f0:
            boolean r0 = r5.A0e(r6, r3)
            if (r0 == 0) goto L_0x001f
            long r0 = X.C165597tg.A0D(r1)
            X.9Yj r10 = com.google.protobuf.UnsafeUtil.A02
            long r0 = r10.A07(r6, r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            r10.A0D(r2, r0)
            goto L_0x001f
        L_0x0207:
            boolean r0 = r5.A0e(r6, r3)
            if (r0 == 0) goto L_0x001f
            long r0 = X.C165597tg.A0D(r1)
            X.9Yj r10 = com.google.protobuf.UnsafeUtil.A02
            long r0 = r10.A07(r6, r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            r10.A0D(r2, r0)
            goto L_0x001f
        L_0x021e:
            boolean r0 = r5.A0e(r6, r3)
            if (r0 == 0) goto L_0x001f
            int r1 = A02(r1, r6)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0A(r2, r1)
            goto L_0x001f
        L_0x022f:
            boolean r0 = r5.A0e(r6, r3)
            if (r0 == 0) goto L_0x001f
            long r0 = X.C165597tg.A0D(r1)
            X.9Yj r10 = com.google.protobuf.UnsafeUtil.A02
            long r0 = r10.A07(r6, r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            r10.A0C(r2, r0)
            goto L_0x001f
        L_0x0246:
            boolean r0 = r5.A0e(r6, r3)
            if (r0 == 0) goto L_0x001f
            int r1 = A02(r1, r6)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A09(r2, r1)
            goto L_0x001f
        L_0x0257:
            boolean r0 = r5.A0e(r6, r3)
            if (r0 == 0) goto L_0x001f
            long r0 = X.C165597tg.A0D(r1)
            X.9Yj r10 = com.google.protobuf.UnsafeUtil.A02
            boolean r1 = r10.A0L(r6, r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0E(r2, r1)
            goto L_0x001f
        L_0x026e:
            boolean r0 = r5.A0e(r6, r3)
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = A0P(r1, r6)
            A0Y(r7, r0, r2)
            goto L_0x001f
        L_0x027d:
            boolean r0 = r5.A0e(r6, r3)
            if (r0 == 0) goto L_0x001f
            java.lang.Object r10 = A0P(r1, r6)
            X.B3d r1 = r5.A0N(r3)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            X.B63 r10 = (X.B63) r10
            r0.A0I(r10, r1, r2)
            goto L_0x001f
        L_0x0294:
            boolean r0 = r5.A0e(r6, r3)
            if (r0 == 0) goto L_0x001f
            java.lang.Object r1 = A0P(r1, r6)
            X.AUx r1 = (X.C21674AUx) r1
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            X.C1897895p.A07(r0, r2)
            r0.A0H(r1)
            goto L_0x001f
        L_0x02aa:
            boolean r0 = r5.A0e(r6, r3)
            if (r0 == 0) goto L_0x001f
            int r1 = A02(r1, r6)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0B(r2, r1)
            goto L_0x001f
        L_0x02bb:
            boolean r0 = r5.A0e(r6, r3)
            if (r0 == 0) goto L_0x001f
            int r1 = A02(r1, r6)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0A(r2, r1)
            goto L_0x001f
        L_0x02cc:
            boolean r0 = r5.A0e(r6, r3)
            if (r0 == 0) goto L_0x001f
            int r1 = A02(r1, r6)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A09(r2, r1)
            goto L_0x001f
        L_0x02dd:
            boolean r0 = r5.A0e(r6, r3)
            if (r0 == 0) goto L_0x001f
            long r0 = X.C165597tg.A0D(r1)
            X.9Yj r10 = com.google.protobuf.UnsafeUtil.A02
            long r0 = r10.A07(r6, r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            r10.A0C(r2, r0)
            goto L_0x001f
        L_0x02f4:
            boolean r0 = r5.A0e(r6, r3)
            if (r0 == 0) goto L_0x001f
            int r0 = A02(r1, r6)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            r10.A0B(r2, r0)
            goto L_0x001f
        L_0x030a:
            boolean r0 = r5.A0e(r6, r3)
            if (r0 == 0) goto L_0x001f
            long r0 = X.C165597tg.A0D(r1)
            X.9Yj r10 = com.google.protobuf.UnsafeUtil.A02
            long r0 = r10.A07(r6, r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            long r0 = X.C165567td.A05(r0)
            r10.A0D(r2, r0)
            goto L_0x001f
        L_0x0325:
            boolean r0 = r5.A0e(r6, r3)
            if (r0 == 0) goto L_0x001f
            java.lang.Object r1 = A0P(r1, r6)
            X.B3d r0 = r5.A0N(r3)
            r7.A00(r0, r1, r2)
            goto L_0x001f
        L_0x0338:
            boolean r0 = r5.A0f(r6, r2, r3)
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = A0P(r1, r6)
            double r0 = X.C90504aG.A01(r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            r10.A0C(r2, r0)
            goto L_0x001f
        L_0x0351:
            boolean r0 = r5.A0f(r6, r2, r3)
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = A0P(r1, r6)
            float r0 = X.C36441kJ.A03(r0)
            com.google.protobuf.CodedOutputStream r1 = r7.A00
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r1.A09(r2, r0)
            goto L_0x001f
        L_0x036a:
            boolean r0 = r5.A0f(r6, r2, r3)
            if (r0 == 0) goto L_0x001f
            goto L_0x0377
        L_0x0371:
            boolean r0 = r5.A0f(r6, r2, r3)
            if (r0 == 0) goto L_0x001f
        L_0x0377:
            long r0 = X.C165597tg.A0D(r1)
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r0)
            long r0 = X.C36431kI.A09(r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            r10.A0D(r2, r0)
            goto L_0x001f
        L_0x038a:
            boolean r0 = r5.A0f(r6, r2, r3)
            if (r0 == 0) goto L_0x001f
            goto L_0x0423
        L_0x0392:
            boolean r0 = r5.A0f(r6, r2, r3)
            if (r0 == 0) goto L_0x001f
            long r0 = X.C165597tg.A0D(r1)
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r0)
            long r0 = X.C36431kI.A09(r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            r10.A0C(r2, r0)
            goto L_0x001f
        L_0x03ab:
            boolean r0 = r5.A0f(r6, r2, r3)
            if (r0 == 0) goto L_0x001f
            goto L_0x043c
        L_0x03b3:
            boolean r0 = r5.A0f(r6, r2, r3)
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = A0P(r1, r6)
            boolean r1 = X.AnonymousClass000.A1X(r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0E(r2, r1)
            goto L_0x001f
        L_0x03c8:
            boolean r0 = r5.A0f(r6, r2, r3)
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = A0P(r1, r6)
            A0Y(r7, r0, r2)
            goto L_0x001f
        L_0x03d7:
            boolean r0 = r5.A0f(r6, r2, r3)
            if (r0 == 0) goto L_0x001f
            java.lang.Object r10 = A0P(r1, r6)
            X.B3d r1 = r5.A0N(r3)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            X.B63 r10 = (X.B63) r10
            r0.A0I(r10, r1, r2)
            goto L_0x001f
        L_0x03ee:
            boolean r0 = r5.A0f(r6, r2, r3)
            if (r0 == 0) goto L_0x001f
            java.lang.Object r1 = A0P(r1, r6)
            X.AUx r1 = (X.C21674AUx) r1
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            X.C1897895p.A07(r0, r2)
            r0.A0H(r1)
            goto L_0x001f
        L_0x0404:
            boolean r0 = r5.A0f(r6, r2, r3)
            if (r0 == 0) goto L_0x001f
            long r0 = X.C165597tg.A0D(r1)
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r0)
            int r1 = X.AnonymousClass000.A0I(r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0B(r2, r1)
            goto L_0x001f
        L_0x041d:
            boolean r0 = r5.A0f(r6, r2, r3)
            if (r0 == 0) goto L_0x001f
        L_0x0423:
            long r0 = X.C165597tg.A0D(r1)
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r0)
            int r1 = X.AnonymousClass000.A0I(r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0A(r2, r1)
            goto L_0x001f
        L_0x0436:
            boolean r0 = r5.A0f(r6, r2, r3)
            if (r0 == 0) goto L_0x001f
        L_0x043c:
            long r0 = X.C165597tg.A0D(r1)
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r0)
            int r1 = X.AnonymousClass000.A0I(r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A09(r2, r1)
            goto L_0x001f
        L_0x044f:
            boolean r0 = r5.A0f(r6, r2, r3)
            if (r0 == 0) goto L_0x001f
            long r0 = X.C165597tg.A0D(r1)
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r0)
            long r0 = X.C36431kI.A09(r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            r10.A0C(r2, r0)
            goto L_0x001f
        L_0x0468:
            boolean r0 = r5.A0f(r6, r2, r3)
            if (r0 == 0) goto L_0x001f
            long r0 = X.C165597tg.A0D(r1)
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r0)
            int r0 = X.AnonymousClass000.A0I(r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            r10.A0B(r2, r0)
            goto L_0x001f
        L_0x0486:
            boolean r0 = r5.A0f(r6, r2, r3)
            if (r0 == 0) goto L_0x001f
            long r0 = X.C165597tg.A0D(r1)
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r0)
            long r0 = X.C36431kI.A09(r0)
            com.google.protobuf.CodedOutputStream r13 = r7.A00
            long r11 = r0 << r10
            r10 = 63
            long r0 = r0 >> r10
            long r0 = r0 ^ r11
            r13.A0D(r2, r0)
            goto L_0x001f
        L_0x04a5:
            boolean r0 = r5.A0f(r6, r2, r3)
            if (r0 == 0) goto L_0x001f
            java.lang.Object r1 = A0P(r1, r6)
            X.B3d r0 = r5.A0N(r3)
            r7.A00(r0, r1, r2)
            goto L_0x001f
        L_0x04b8:
            int[] r8 = r5.A05
            int r10 = r8.length
            sun.misc.Unsafe r4 = A0F
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r15 = 0
        L_0x04c5:
            if (r3 >= r10) goto L_0x08eb
            int r0 = r3 + 1
            r13 = r8[r0]
            r2 = r8[r3]
            int r12 = X.C165587tf.A02(r13)
            r0 = 17
            if (r12 > r0) goto L_0x08e8
            int r0 = r3 + 2
            r14 = r8[r0]
            r11 = r14 & r16
            if (r11 == r9) goto L_0x04e3
            long r0 = (long) r11
            int r15 = r4.getInt(r6, r0)
            r9 = r11
        L_0x04e3:
            int r0 = r14 >>> 20
            r11 = 1
            int r11 = r11 << r0
        L_0x04e7:
            r13 = r13 & r16
            long r0 = (long) r13
            switch(r12) {
                case 0: goto L_0x0581;
                case 1: goto L_0x0595;
                case 2: goto L_0x05a9;
                case 3: goto L_0x05b7;
                case 4: goto L_0x05c5;
                case 5: goto L_0x05d3;
                case 6: goto L_0x05e1;
                case 7: goto L_0x05ef;
                case 8: goto L_0x05ff;
                case 9: goto L_0x0602;
                case 10: goto L_0x0605;
                case 11: goto L_0x0608;
                case 12: goto L_0x0616;
                case 13: goto L_0x0624;
                case 14: goto L_0x0632;
                case 15: goto L_0x0640;
                case 16: goto L_0x0653;
                case 17: goto L_0x0665;
                case 18: goto L_0x0668;
                case 19: goto L_0x066a;
                case 20: goto L_0x066c;
                case 21: goto L_0x066e;
                case 22: goto L_0x0671;
                case 23: goto L_0x0674;
                case 24: goto L_0x0677;
                case 25: goto L_0x04f0;
                case 26: goto L_0x04fd;
                case 27: goto L_0x0509;
                case 28: goto L_0x0534;
                case 29: goto L_0x0685;
                case 30: goto L_0x0693;
                case 31: goto L_0x06a1;
                case 32: goto L_0x06af;
                case 33: goto L_0x06bd;
                case 34: goto L_0x0540;
                case 35: goto L_0x06cb;
                case 36: goto L_0x06d9;
                case 37: goto L_0x06e7;
                case 38: goto L_0x06f5;
                case 39: goto L_0x0703;
                case 40: goto L_0x0711;
                case 41: goto L_0x071f;
                case 42: goto L_0x072d;
                case 43: goto L_0x073b;
                case 44: goto L_0x0749;
                case 45: goto L_0x0757;
                case 46: goto L_0x0765;
                case 47: goto L_0x0773;
                case 48: goto L_0x054d;
                case 49: goto L_0x055a;
                case 50: goto L_0x0781;
                case 51: goto L_0x078a;
                case 52: goto L_0x07a3;
                case 53: goto L_0x07bc;
                case 54: goto L_0x07c3;
                case 55: goto L_0x07d8;
                case 56: goto L_0x07e0;
                case 57: goto L_0x07f5;
                case 58: goto L_0x07fd;
                case 59: goto L_0x0812;
                case 60: goto L_0x0821;
                case 61: goto L_0x0838;
                case 62: goto L_0x084e;
                case 63: goto L_0x0863;
                case 64: goto L_0x0878;
                case 65: goto L_0x088d;
                case 66: goto L_0x08a2;
                case 67: goto L_0x08bc;
                case 68: goto L_0x08d5;
                default: goto L_0x04ed;
            }
        L_0x04ed:
            int r3 = r3 + 3
            goto L_0x04c5
        L_0x04f0:
            r2 = r8[r3]
            java.lang.Object r1 = r4.getObject(r6, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            X.C203849oy.A0D(r7, r1, r2, r0)
            goto L_0x04ed
        L_0x04fd:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203849oy.A0C(r7, r0, r2)
            goto L_0x04ed
        L_0x0509:
            r11 = r8[r3]
            java.lang.Object r13 = r4.getObject(r6, r0)
            java.util.List r13 = (java.util.List) r13
            X.B3d r12 = r5.A0N(r3)
            X.9TG r0 = X.C203849oy.A02
            if (r13 == 0) goto L_0x04ed
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x04ed
            r2 = 0
        L_0x0520:
            int r0 = r13.size()
            if (r2 >= r0) goto L_0x04ed
            java.lang.Object r1 = r13.get(r2)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            X.B63 r1 = (X.B63) r1
            r0.A0I(r1, r12, r11)
            int r2 = r2 + 1
            goto L_0x0520
        L_0x0534:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203849oy.A0B(r7, r0, r2)
            goto L_0x04ed
        L_0x0540:
            r2 = r8[r3]
            java.lang.Object r1 = r4.getObject(r6, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            X.C203849oy.A0O(r7, r1, r2, r0)
            goto L_0x04ed
        L_0x054d:
            r2 = r8[r3]
            java.lang.Object r1 = r4.getObject(r6, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 1
            X.C203849oy.A0O(r7, r1, r2, r0)
            goto L_0x04ed
        L_0x055a:
            r2 = r8[r3]
            java.lang.Object r12 = r4.getObject(r6, r0)
            java.util.List r12 = (java.util.List) r12
            X.B3d r11 = r5.A0N(r3)
            X.9TG r0 = X.C203849oy.A02
            if (r12 == 0) goto L_0x04ed
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x04ed
            r1 = 0
        L_0x0571:
            int r0 = r12.size()
            if (r1 >= r0) goto L_0x04ed
            java.lang.Object r0 = r12.get(r1)
            r7.A00(r11, r0, r2)
            int r1 = r1 + 1
            goto L_0x0571
        L_0x0581:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04ed
            X.9Yj r11 = com.google.protobuf.UnsafeUtil.A02
            double r0 = r11.A03(r6, r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            r11.A0C(r2, r0)
            goto L_0x04ed
        L_0x0595:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04ed
            X.9Yj r11 = com.google.protobuf.UnsafeUtil.A02
            float r0 = r11.A04(r6, r0)
            com.google.protobuf.CodedOutputStream r1 = r7.A00
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r1.A09(r2, r0)
            goto L_0x04ed
        L_0x05a9:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04ed
            long r0 = r4.getLong(r6, r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            r11.A0D(r2, r0)
            goto L_0x04ed
        L_0x05b7:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04ed
            long r0 = r4.getLong(r6, r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            r11.A0D(r2, r0)
            goto L_0x04ed
        L_0x05c5:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04ed
            int r1 = r4.getInt(r6, r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0A(r2, r1)
            goto L_0x04ed
        L_0x05d3:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04ed
            long r0 = r4.getLong(r6, r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            r11.A0C(r2, r0)
            goto L_0x04ed
        L_0x05e1:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04ed
            int r1 = r4.getInt(r6, r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A09(r2, r1)
            goto L_0x04ed
        L_0x05ef:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04ed
            X.9Yj r11 = com.google.protobuf.UnsafeUtil.A02
            boolean r1 = r11.A0L(r6, r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0E(r2, r1)
            goto L_0x04ed
        L_0x05ff:
            r11 = r11 & r15
            goto L_0x0816
        L_0x0602:
            r11 = r11 & r15
            goto L_0x0825
        L_0x0605:
            r11 = r11 & r15
            goto L_0x083c
        L_0x0608:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04ed
            int r1 = r4.getInt(r6, r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0B(r2, r1)
            goto L_0x04ed
        L_0x0616:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04ed
            int r1 = r4.getInt(r6, r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0A(r2, r1)
            goto L_0x04ed
        L_0x0624:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04ed
            int r1 = r4.getInt(r6, r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A09(r2, r1)
            goto L_0x04ed
        L_0x0632:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04ed
            long r0 = r4.getLong(r6, r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            r11.A0C(r2, r0)
            goto L_0x04ed
        L_0x0640:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04ed
            int r0 = r4.getInt(r6, r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            r11.A0B(r2, r0)
            goto L_0x04ed
        L_0x0653:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04ed
            long r0 = r4.getLong(r6, r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            long r0 = X.C165567td.A05(r0)
            r11.A0D(r2, r0)
            goto L_0x04ed
        L_0x0665:
            r11 = r11 & r15
            goto L_0x08d9
        L_0x0668:
            r11 = 0
            goto L_0x06cc
        L_0x066a:
            r11 = 0
            goto L_0x06da
        L_0x066c:
            r11 = 0
            goto L_0x06e8
        L_0x066e:
            r11 = 0
            goto L_0x06f6
        L_0x0671:
            r11 = 0
            goto L_0x0704
        L_0x0674:
            r11 = 0
            goto L_0x0712
        L_0x0677:
            r11 = 0
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203849oy.A0G(r7, r0, r2, r11)
            goto L_0x04ed
        L_0x0685:
            r11 = 0
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203849oy.A0P(r7, r0, r2, r11)
            goto L_0x04ed
        L_0x0693:
            r11 = 0
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203849oy.A0F(r7, r0, r2, r11)
            goto L_0x04ed
        L_0x06a1:
            r11 = 0
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203849oy.A0L(r7, r0, r2, r11)
            goto L_0x04ed
        L_0x06af:
            r11 = 0
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203849oy.A0M(r7, r0, r2, r11)
            goto L_0x04ed
        L_0x06bd:
            r11 = 0
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203849oy.A0N(r7, r0, r2, r11)
            goto L_0x04ed
        L_0x06cb:
            r11 = 1
        L_0x06cc:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203849oy.A0E(r7, r0, r2, r11)
            goto L_0x04ed
        L_0x06d9:
            r11 = 1
        L_0x06da:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203849oy.A0I(r7, r0, r2, r11)
            goto L_0x04ed
        L_0x06e7:
            r11 = 1
        L_0x06e8:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203849oy.A0K(r7, r0, r2, r11)
            goto L_0x04ed
        L_0x06f5:
            r11 = 1
        L_0x06f6:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203849oy.A0Q(r7, r0, r2, r11)
            goto L_0x04ed
        L_0x0703:
            r11 = 1
        L_0x0704:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203849oy.A0J(r7, r0, r2, r11)
            goto L_0x04ed
        L_0x0711:
            r11 = 1
        L_0x0712:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203849oy.A0H(r7, r0, r2, r11)
            goto L_0x04ed
        L_0x071f:
            r11 = 1
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203849oy.A0G(r7, r0, r2, r11)
            goto L_0x04ed
        L_0x072d:
            r11 = 1
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203849oy.A0D(r7, r0, r2, r11)
            goto L_0x04ed
        L_0x073b:
            r11 = 1
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203849oy.A0P(r7, r0, r2, r11)
            goto L_0x04ed
        L_0x0749:
            r11 = 1
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203849oy.A0F(r7, r0, r2, r11)
            goto L_0x04ed
        L_0x0757:
            r11 = 1
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203849oy.A0L(r7, r0, r2, r11)
            goto L_0x04ed
        L_0x0765:
            r11 = 1
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203849oy.A0M(r7, r0, r2, r11)
            goto L_0x04ed
        L_0x0773:
            r11 = 1
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203849oy.A0N(r7, r0, r2, r11)
            goto L_0x04ed
        L_0x0781:
            java.lang.Object r0 = r4.getObject(r6, r0)
            r5.A0Z(r7, r0, r2, r3)
            goto L_0x04ed
        L_0x078a:
            boolean r11 = r5.A0f(r6, r2, r3)
            if (r11 == 0) goto L_0x04ed
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r0)
            double r0 = X.C90504aG.A01(r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            r11.A0C(r2, r0)
            goto L_0x04ed
        L_0x07a3:
            boolean r11 = r5.A0f(r6, r2, r3)
            if (r11 == 0) goto L_0x04ed
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r0)
            float r0 = X.C36441kJ.A03(r0)
            com.google.protobuf.CodedOutputStream r1 = r7.A00
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r1.A09(r2, r0)
            goto L_0x04ed
        L_0x07bc:
            boolean r11 = r5.A0f(r6, r2, r3)
            if (r11 == 0) goto L_0x04ed
            goto L_0x07c9
        L_0x07c3:
            boolean r11 = r5.A0f(r6, r2, r3)
            if (r11 == 0) goto L_0x04ed
        L_0x07c9:
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r0)
            long r0 = X.C36431kI.A09(r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            r11.A0D(r2, r0)
            goto L_0x04ed
        L_0x07d8:
            boolean r11 = r5.A0f(r6, r2, r3)
            if (r11 == 0) goto L_0x04ed
            goto L_0x0869
        L_0x07e0:
            boolean r11 = r5.A0f(r6, r2, r3)
            if (r11 == 0) goto L_0x04ed
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r0)
            long r0 = X.C36431kI.A09(r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            r11.A0C(r2, r0)
            goto L_0x04ed
        L_0x07f5:
            boolean r11 = r5.A0f(r6, r2, r3)
            if (r11 == 0) goto L_0x04ed
            goto L_0x087e
        L_0x07fd:
            boolean r11 = r5.A0f(r6, r2, r3)
            if (r11 == 0) goto L_0x04ed
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r0)
            boolean r1 = X.AnonymousClass000.A1X(r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0E(r2, r1)
            goto L_0x04ed
        L_0x0812:
            boolean r11 = r5.A0f(r6, r2, r3)
        L_0x0816:
            if (r11 == 0) goto L_0x04ed
            java.lang.Object r0 = r4.getObject(r6, r0)
            A0Y(r7, r0, r2)
            goto L_0x04ed
        L_0x0821:
            boolean r11 = r5.A0f(r6, r2, r3)
        L_0x0825:
            if (r11 == 0) goto L_0x04ed
            java.lang.Object r11 = r4.getObject(r6, r0)
            X.B3d r1 = r5.A0N(r3)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            X.B63 r11 = (X.B63) r11
            r0.A0I(r11, r1, r2)
            goto L_0x04ed
        L_0x0838:
            boolean r11 = r5.A0f(r6, r2, r3)
        L_0x083c:
            if (r11 == 0) goto L_0x04ed
            java.lang.Object r1 = r4.getObject(r6, r0)
            X.AUx r1 = (X.C21674AUx) r1
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            X.C1897895p.A07(r0, r2)
            r0.A0H(r1)
            goto L_0x04ed
        L_0x084e:
            boolean r11 = r5.A0f(r6, r2, r3)
            if (r11 == 0) goto L_0x04ed
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r0)
            int r1 = X.AnonymousClass000.A0I(r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0B(r2, r1)
            goto L_0x04ed
        L_0x0863:
            boolean r11 = r5.A0f(r6, r2, r3)
            if (r11 == 0) goto L_0x04ed
        L_0x0869:
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r0)
            int r1 = X.AnonymousClass000.A0I(r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0A(r2, r1)
            goto L_0x04ed
        L_0x0878:
            boolean r11 = r5.A0f(r6, r2, r3)
            if (r11 == 0) goto L_0x04ed
        L_0x087e:
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r0)
            int r1 = X.AnonymousClass000.A0I(r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A09(r2, r1)
            goto L_0x04ed
        L_0x088d:
            boolean r11 = r5.A0f(r6, r2, r3)
            if (r11 == 0) goto L_0x04ed
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r0)
            long r0 = X.C36431kI.A09(r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            r11.A0C(r2, r0)
            goto L_0x04ed
        L_0x08a2:
            boolean r11 = r5.A0f(r6, r2, r3)
            if (r11 == 0) goto L_0x04ed
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r0)
            int r0 = X.AnonymousClass000.A0I(r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            r11.A0B(r2, r0)
            goto L_0x04ed
        L_0x08bc:
            boolean r11 = r5.A0f(r6, r2, r3)
            if (r11 == 0) goto L_0x04ed
            java.lang.Object r0 = X.AnonymousClass9Yj.A00(r6, r0)
            long r0 = X.C36431kI.A09(r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            long r0 = X.C165567td.A05(r0)
            r11.A0D(r2, r0)
            goto L_0x04ed
        L_0x08d5:
            boolean r11 = r5.A0f(r6, r2, r3)
        L_0x08d9:
            if (r11 == 0) goto L_0x04ed
            java.lang.Object r1 = r4.getObject(r6, r0)
            X.B3d r0 = r5.A0N(r3)
            r7.A00(r0, r1, r2)
            goto L_0x04ed
        L_0x08e8:
            r11 = 0
            goto L_0x04e7
        L_0x08eb:
            X.8Hz r6 = (X.C170918Hz) r6
            X.9lJ r0 = r6.unknownFields
            r0.A03(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21074A7l.Bxf(X.9TV, java.lang.Object):void");
    }

    public C21074A7l(C1897995q r2, C199639ff r3, C200369hI r4, B63 b63, C1898195s r6, AnonymousClass9TG r7, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, int i3, int i4, boolean z) {
        this.A05 = iArr;
        this.A07 = objArr;
        this.A02 = i;
        this.A01 = i2;
        this.A0D = b63 instanceof C170918Hz;
        this.A0E = z;
        this.A06 = iArr2;
        this.A00 = i3;
        this.A03 = i4;
        this.A0B = r6;
        this.A04 = r3;
        this.A0C = r7;
        this.A08 = r2;
        this.A0A = b63;
        this.A09 = r4;
    }

    public static int A02(int i, Object obj) {
        return UnsafeUtil.A02.A06(obj, (long) (i & 1048575));
    }

    public static int A0B(C197909ca r3, byte[] bArr, int i) {
        int A0D2 = A0D(r3, bArr, i);
        int i2 = r3.A00;
        if (i2 < 0) {
            throw C165597tg.A0L();
        } else if (i2 > bArr.length - A0D2) {
            throw C165587tf.A0J();
        } else if (i2 == 0) {
            r3.A02 = C21674AUx.A00;
            return A0D2;
        } else {
            r3.A02 = C21674AUx.A01(bArr, A0D2, i2);
            return A0D2 + i2;
        }
    }

    public static int A0C(C197909ca r3, byte[] bArr, int i) {
        int A0D2 = A0D(r3, bArr, i);
        int i2 = r3.A00;
        if (i2 < 0) {
            throw C165597tg.A0L();
        } else if (i2 == 0) {
            r3.A02 = "";
            return A0D2;
        } else {
            r3.A02 = C196659aK.A00.A03(bArr, A0D2, i2);
            return A0D2 + i2;
        }
    }

    public static long A0I(C203179nT r3, int i) {
        long j = (long) (i & 1048575);
        C203179nT.A07(r3, 0);
        return j;
    }

    public static long A0J(C203179nT r3, int i) {
        long j = (long) (i & 1048575);
        C203179nT.A07(r3, 1);
        return j;
    }

    public static long A0K(C203179nT r3, int i) {
        long j = (long) (i & 1048575);
        C203179nT.A07(r3, 5);
        return j;
    }

    public static Object A0P(int i, Object obj) {
        return UnsafeUtil.A02.A09(obj, (long) (i & 1048575));
    }

    private Object A0R(Object obj, int i) {
        C23073B3d A0N = A0N(i);
        long A0G2 = C165577te.A0G(this.A05, i);
        if (!A0e(obj, i)) {
            return A0N.BQ8();
        }
        Object object = A0F.getObject(obj, A0G2);
        if (A0d(object)) {
            return object;
        }
        C170918Hz BQ8 = A0N.BQ8();
        if (object != null) {
            A0N.BPm(BQ8, object);
        }
        return BQ8;
    }

    private Object A0S(Object obj, int i, int i2) {
        C23073B3d A0N = A0N(i2);
        if (!A0f(obj, i, i2)) {
            return A0N.BQ8();
        }
        Object object = A0F.getObject(obj, C165577te.A0G(this.A05, i2));
        if (A0d(object)) {
            return object;
        }
        C170918Hz BQ8 = A0N.BQ8();
        if (object != null) {
            A0N.BPm(BQ8, object);
        }
        return BQ8;
    }

    public static Field A0T(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Field ");
            A0u.append(str);
            A0u.append(" for ");
            C165597tg.A1F(cls, A0u);
            A0u.append(" not found. Known fields are ");
            throw C90464aC.A0U(Arrays.toString(declaredFields), A0u);
        }
    }

    public static List A0U(int i, Object obj) {
        return (List) UnsafeUtil.A02.A09(obj, (long) (i & 1048575));
    }

    public static void A0a(Object obj) {
        if (!A0d(obj)) {
            throw C90464aC.A0P(obj, "Mutating immutable message: ", AnonymousClass000.A0u());
        }
    }

    public final boolean BM3(Object obj) {
        boolean z;
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.A00) {
            int i4 = this.A06[i3];
            int[] iArr = this.A05;
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            int i7 = iArr[i4 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 == i) {
                i8 = i;
            } else if (i8 != 1048575) {
                i2 = A0F.getInt(obj, (long) i8);
            }
            if ((268435456 & i6) != 0) {
                if (i8 == 1048575) {
                    if (!A0e(obj, i4)) {
                        return false;
                    }
                } else if ((i2 & i9) == 0) {
                    return false;
                }
            }
            int A022 = C165587tf.A02(i6);
            if (A022 != 9 && A022 != 17) {
                if (A022 != 27) {
                    if (A022 == 60 || A022 == 68) {
                        z = A0f(obj, i5, i4);
                    } else if (A022 != 49) {
                        if (A022 == 50) {
                            AbstractMap abstractMap = (AbstractMap) AnonymousClass9Yj.A00(obj, (long) (i6 & 1048575));
                            if (!abstractMap.isEmpty() && ((C192959Jh) this.A07[(i4 / 3) * 2]).A00.A01.javaType == C188478ze.MESSAGE) {
                                C23073B3d b3d = null;
                                Iterator A0z = AnonymousClass000.A0z(abstractMap);
                                while (A0z.hasNext()) {
                                    Object next = A0z.next();
                                    if (b3d == null) {
                                        b3d = C165577te.A0O(next);
                                    }
                                    if (!b3d.BM3(next)) {
                                        return false;
                                    }
                                }
                                continue;
                            }
                        } else {
                            continue;
                        }
                        i3++;
                        i = i8;
                    }
                }
                List list = (List) AnonymousClass9Yj.A00(obj, (long) (i6 & 1048575));
                if (!list.isEmpty()) {
                    C23073B3d A0N = A0N(i4);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!A0N.BM3(list.get(i10))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
                i3++;
                i = i8;
            } else if (i8 == 1048575) {
                z = A0e(obj, i4);
            } else {
                z = i2 & i9;
            }
            if (z && !A0N(i4).BM3(AnonymousClass9Yj.A00(obj, (long) (i6 & 1048575)))) {
                return false;
            }
            i3++;
            i = i8;
        }
        return true;
    }

    public void BP1(Object obj) {
        Object unmodifiableList;
        C21886AcE acE;
        if (A0d(obj)) {
            if (obj instanceof C170918Hz) {
                C170918Hz r3 = (C170918Hz) obj;
                int i = Integer.MAX_VALUE | (r3.memoizedSerializedSize & Integer.MIN_VALUE);
                r3.memoizedSerializedSize = i;
                r3.memoizedHashCode = 0;
                r3.memoizedSerializedSize = i & Integer.MAX_VALUE;
            }
            int[] iArr = this.A05;
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int i3 = iArr[i2 + 1];
                long A0D2 = C165597tg.A0D(i3);
                int A022 = C165587tf.A02(i3);
                if (A022 != 9) {
                    switch (A022) {
                        case 17:
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            boolean z = this.A04 instanceof C173528Sa;
                            Object A002 = AnonymousClass9Yj.A00(obj, A0D2);
                            if (!z) {
                                List list = (List) A002;
                                if (!(list instanceof B6Z)) {
                                    if (!C165587tf.A1b(C173538Sb.A00, list)) {
                                        if ((list instanceof C16130of) && (list instanceof C23122B6c)) {
                                            acE = (C21886AcE) ((C23122B6c) list);
                                            if (!acE.A00) {
                                                break;
                                            }
                                        } else {
                                            unmodifiableList = Collections.unmodifiableList(list);
                                        }
                                    } else {
                                        break;
                                    }
                                } else {
                                    unmodifiableList = ((B6Z) list).BIh();
                                }
                                UnsafeUtil.A07(obj, A0D2, unmodifiableList);
                                break;
                            } else {
                                acE = (C21886AcE) ((C23122B6c) A002);
                            }
                            acE.A00 = false;
                            continue;
                        case 50:
                            Unsafe unsafe = A0F;
                            Object object = unsafe.getObject(obj, A0D2);
                            if (object != null) {
                                ((C21903AcX) object).isMutable = false;
                                unsafe.putObject(obj, A0D2, object);
                                break;
                            } else {
                                continue;
                            }
                    }
                }
                if (A0e(obj, i2)) {
                    A0N(i2).BP1(A0F.getObject(obj, A0D2));
                }
            }
            ((C170918Hz) obj).unknownFields.A01 = false;
        }
    }
}
