package X;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import sun.misc.Unsafe;

public final class A42 implements B3T {
    public static final Unsafe A0E = C203729od.A05();
    public static final int[] A0F = new int[0];
    public final int A00;
    public final int A01;
    public final int[] A02;
    public final Object[] A03;
    public final int A04;
    public final int A05;
    public final AnonymousClass95S A06;
    public final C199249ey A07;
    public final C22806AwH A08;
    public final C23119B5y A09;
    public final C22808AwJ A0A;
    public final AnonymousClass95U A0B;
    public final boolean A0C;
    public final int[] A0D;

    public static int A03(C197899cY r2, B3T b3t, byte[] bArr, int i, int i2, int i3) {
        A42 a42 = (A42) b3t;
        Object ByC = a42.ByC();
        int A0R = a42.A0R(r2, ByC, bArr, i, i2, i3);
        a42.Byd(ByC);
        r2.A02 = ByC;
        return A0R;
    }

    public static int A04(C197899cY r8, C201569jt r9, byte[] bArr, int i, int i2, int i3) {
        Object r1;
        int i4 = i2;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            C197899cY r3 = r8;
            byte[] bArr2 = bArr;
            if (i5 == 0) {
                int A082 = A08(r8, bArr, i2);
                r9.A01(i, Long.valueOf(r8.A01));
                return A082;
            } else if (i5 == 1) {
                r9.A01(i, Long.valueOf(C165567td.A0A(bArr, i2)));
                return i2 + 8;
            } else if (i5 == 2) {
                int A072 = A07(r8, bArr, i2);
                int i6 = r8.A00;
                if (i6 >= 0) {
                    int length = bArr.length;
                    if (i6 <= length - A072) {
                        if (i6 == 0) {
                            r1 = C21673AUw.A00;
                        } else {
                            C21673AUw.A00(A072, A072 + i6, length);
                            r1 = new AnonymousClass8E0(C21673AUw.A01.ByJ(bArr, A072, i6));
                        }
                        r9.A01(i, r1);
                        return A072 + i6;
                    }
                    throw new C187318xe("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                throw new C187318xe("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            } else if (i5 == 3) {
                C201569jt r4 = new C201569jt();
                int i7 = (i & -8) | 4;
                int i8 = 0;
                while (true) {
                    int i9 = i3;
                    if (i4 >= i3) {
                        break;
                    }
                    i4 = A07(r3, bArr, i4);
                    i8 = r3.A00;
                    if (i8 == i7) {
                        break;
                    }
                    i4 = A04(r3, r4, bArr2, i8, i4, i9);
                }
                if (i4 > i3 || i8 != i7) {
                    throw new C187318xe("Failed to parse the message.");
                }
                r9.A01(i, r4);
                return i4;
            } else if (i5 == 5) {
                r9.A01(i, Integer.valueOf(C165567td.A04(bArr, i2)));
                return i2 + 4;
            }
        }
        throw new C187318xe("Protocol message contained an invalid tag (zero).");
    }

    private final int A00(int i) {
        if (i >= this.A00 && i <= this.A01) {
            int i2 = 0;
            int[] iArr = this.A02;
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
        return i3 + (i2 * C170568Dy.A00(i << 3));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r5 >= 0) goto L_0x0010;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(X.C197899cY r6, X.B3T r7, byte[] r8, int r9, int r10) {
        /*
            int r4 = r9 + 1
            r3 = r8
            byte r5 = r8[r9]
            r1 = r6
            if (r5 >= 0) goto L_0x0010
            int r4 = A0C(r6, r8, r5, r4)
            int r5 = r6.A00
            if (r5 < 0) goto L_0x0022
        L_0x0010:
            int r10 = r10 - r4
            if (r5 > r10) goto L_0x0022
            r0 = r7
            java.lang.Object r2 = r7.ByC()
            int r5 = r5 + r4
            r0.ByL(r1, r2, r3, r4, r5)
            r7.Byd(r2)
            r6.A02 = r2
            return r5
        L_0x0022:
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.8xe r0 = new X.8xe
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A42.A02(X.9cY, X.B3T, byte[], int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0023, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0157, code lost:
        r6.putObject(r8, r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0169, code lost:
        r6.putObject(r8, r0, r4);
        r7 = r25 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x017e, code lost:
        r6.putObject(r8, r0, r4);
        r7 = r25 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0183, code lost:
        r6.putInt(r8, r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0186, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A05(X.C197899cY r22, java.lang.Object r23, byte[] r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, long r33) {
        /*
            r21 = this;
            r7 = r25
            sun.misc.Unsafe r6 = A0E
            r9 = r21
            int[] r0 = r9.A02
            r12 = r32
            long r2 = X.C165577te.A0H(r0, r12)
            r5 = 5
            r4 = 2
            r11 = r22
            r10 = r24
            r17 = r26
            r15 = r27
            r14 = r28
            r13 = r29
            r0 = r33
            r8 = r23
            switch(r31) {
                case 51: goto L_0x016f;
                case 52: goto L_0x015b;
                case 53: goto L_0x014b;
                case 54: goto L_0x014b;
                case 55: goto L_0x013e;
                case 56: goto L_0x0132;
                case 57: goto L_0x0127;
                case 58: goto L_0x0112;
                case 59: goto L_0x00dd;
                case 60: goto L_0x00b7;
                case 61: goto L_0x00aa;
                case 62: goto L_0x013e;
                case 63: goto L_0x0079;
                case 64: goto L_0x0127;
                case 65: goto L_0x0132;
                case 66: goto L_0x0067;
                case 67: goto L_0x0055;
                case 68: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            return r7
        L_0x0024:
            r4 = 3
            if (r13 != r4) goto L_0x0023
            r4 = r27 & -8
            r20 = r4 | 4
            X.B3T r16 = r9.A0H(r12)
            r19 = r17
            r17 = r10
            r18 = r7
            r15 = r11
            int r7 = A03(r15, r16, r17, r18, r19, r20)
            int r4 = r6.getInt(r8, r2)
            if (r4 != r14) goto L_0x004e
            java.lang.Object r5 = r6.getObject(r8, r0)
            if (r5 == 0) goto L_0x004e
            java.lang.Object r4 = r11.A02
            X.8EX r4 = X.C197089b7.A00(r5, r4)
            goto L_0x0157
        L_0x004e:
            java.lang.Object r4 = r11.A02
            r6.putObject(r8, r0, r4)
            goto L_0x0183
        L_0x0055:
            if (r29 != 0) goto L_0x0023
            int r7 = A08(r11, r10, r7)
            long r4 = r11.A01
            long r4 = X.C165567td.A06(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x0157
        L_0x0067:
            if (r29 != 0) goto L_0x0023
            int r7 = A07(r11, r10, r7)
            int r4 = r11.A00
            int r4 = X.C165597tg.A02(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0157
        L_0x0079:
            if (r29 != 0) goto L_0x0023
            int r7 = A07(r11, r10, r7)
            int r5 = r11.A00
            java.lang.Object[] r9 = r9.A03
            int r4 = r32 / 3
            int r4 = r4 << 1
            int r4 = r4 + 1
            r4 = r9[r4]
            X.Axn r4 = (X.C22892Axn) r4
            if (r4 == 0) goto L_0x00a1
            boolean r4 = r4.zza(r5)
            if (r4 != 0) goto L_0x00a1
            X.9jt r1 = A0I(r8)
            java.lang.Long r0 = X.C36441kJ.A0y(r5)
            r1.A01(r15, r0)
            return r7
        L_0x00a1:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r6.putObject(r8, r0, r4)
            goto L_0x0183
        L_0x00aa:
            if (r13 != r4) goto L_0x0023
            int r7 = A0B(r11, r10, r7)
            java.lang.Object r4 = r11.A02
            r6.putObject(r8, r0, r4)
            goto L_0x0183
        L_0x00b7:
            if (r13 != r4) goto L_0x0023
            X.B3T r5 = r9.A0H(r12)
            r4 = r17
            int r7 = A02(r11, r5, r10, r7, r4)
            int r4 = r6.getInt(r8, r2)
            if (r4 != r14) goto L_0x00da
            java.lang.Object r5 = r6.getObject(r8, r0)
            if (r5 == 0) goto L_0x00da
            java.lang.Object r4 = r11.A02
            X.8EX r4 = X.C197089b7.A00(r5, r4)
        L_0x00d5:
            r6.putObject(r8, r0, r4)
            goto L_0x0183
        L_0x00da:
            java.lang.Object r4 = r11.A02
            goto L_0x00d5
        L_0x00dd:
            if (r13 != r4) goto L_0x0023
            int r7 = A07(r11, r10, r7)
            int r9 = r11.A00
            if (r9 != 0) goto L_0x00ee
            java.lang.String r4 = ""
            r6.putObject(r8, r0, r4)
            goto L_0x0183
        L_0x00ee:
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            r30 = r30 & r4
            if (r30 == 0) goto L_0x0106
            int r5 = r7 + r9
            X.9Ut r4 = X.C196639aB.A00
            int r4 = r4.A01(r10, r7, r5)
            if (r4 == 0) goto L_0x0106
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            X.8xe r0 = new X.8xe
            r0.<init>(r1)
            throw r0
        L_0x0106:
            java.nio.charset.Charset r5 = X.C197089b7.A00
            java.lang.String r4 = new java.lang.String
            r4.<init>(r10, r7, r9, r5)
            r6.putObject(r8, r0, r4)
            int r7 = r7 + r9
            goto L_0x0183
        L_0x0112:
            if (r29 != 0) goto L_0x0023
            int r7 = A08(r11, r10, r7)
            long r4 = r11.A01
            r10 = 0
            int r9 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            boolean r4 = X.AnonymousClass000.A1P(r9)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L_0x0157
        L_0x0127:
            if (r13 != r5) goto L_0x0023
            int r4 = X.C165567td.A04(r10, r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0169
        L_0x0132:
            r4 = 1
            if (r13 != r4) goto L_0x0023
            long r4 = X.C165567td.A0A(r10, r7)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x017e
        L_0x013e:
            if (r29 != 0) goto L_0x0023
            int r7 = A07(r11, r10, r7)
            int r4 = r11.A00
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0157
        L_0x014b:
            if (r29 != 0) goto L_0x0023
            int r7 = A08(r11, r10, r7)
            long r4 = r11.A01
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
        L_0x0157:
            r6.putObject(r8, r0, r4)
            goto L_0x0183
        L_0x015b:
            if (r13 != r5) goto L_0x0023
            int r4 = X.C165567td.A04(r10, r7)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
        L_0x0169:
            r6.putObject(r8, r0, r4)
            int r7 = r25 + 4
            goto L_0x0183
        L_0x016f:
            r4 = 1
            if (r13 != r4) goto L_0x0023
            long r4 = X.C165567td.A0A(r10, r7)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
        L_0x017e:
            r6.putObject(r8, r0, r4)
            int r7 = r25 + 8
        L_0x0183:
            r6.putInt(r8, r2, r14)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A42.A05(X.9cY, java.lang.Object, byte[], int, int, int, int, int, int, int, int, long):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01eb, code lost:
        throw new X.C187318xe("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x023a, code lost:
        if (r8 != r1) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x023c, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x032f, code lost:
        if (r8 == r0) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0331, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0339, code lost:
        throw new X.C187318xe("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x033a, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A06(X.C197899cY r20, java.lang.Object r21, byte[] r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, long r30, long r32) {
        /*
            r19 = this;
            r7 = r21
            r4 = r23
            sun.misc.Unsafe r8 = A0E
            r0 = r32
            java.lang.Object r3 = r8.getObject(r7, r0)
            X.B6b r3 = (X.C23121B6b) r3
            r2 = r3
            X.AcA r2 = (X.C21884AcA) r2
            boolean r5 = r2.A00
            r2 = 1
            if (r5 != 0) goto L_0x0027
            int r6 = r3.size()
            int r5 = r6 << r2
            if (r6 != 0) goto L_0x0020
            r5 = 10
        L_0x0020:
            X.B6b r3 = r3.ByB(r5)
            r8.putObject(r7, r0, r3)
        L_0x0027:
            r8 = 5
            r11 = 0
            r1 = 2
            r0 = r19
            r13 = r20
            r15 = r22
            r6 = r24
            r5 = r25
            r9 = r27
            r10 = r28
            switch(r29) {
                case 18: goto L_0x0090;
                case 19: goto L_0x00a7;
                case 20: goto L_0x00be;
                case 21: goto L_0x00be;
                case 22: goto L_0x0053;
                case 23: goto L_0x003c;
                case 24: goto L_0x00db;
                case 25: goto L_0x010a;
                case 26: goto L_0x0127;
                case 27: goto L_0x0188;
                case 28: goto L_0x01a6;
                case 29: goto L_0x0053;
                case 30: goto L_0x026a;
                case 31: goto L_0x00db;
                case 32: goto L_0x003c;
                case 33: goto L_0x01ec;
                case 34: goto L_0x0227;
                case 35: goto L_0x0090;
                case 36: goto L_0x00a7;
                case 37: goto L_0x00be;
                case 38: goto L_0x00be;
                case 39: goto L_0x0053;
                case 40: goto L_0x003c;
                case 41: goto L_0x00db;
                case 42: goto L_0x010a;
                case 43: goto L_0x0053;
                case 44: goto L_0x026a;
                case 45: goto L_0x00db;
                case 46: goto L_0x003c;
                case 47: goto L_0x01ec;
                case 48: goto L_0x0227;
                case 49: goto L_0x0247;
                default: goto L_0x003c;
            }
        L_0x003c:
            if (r9 != r1) goto L_0x004c
            int r8 = A07(r13, r15, r4)
            int r1 = r13.A00
            int r1 = r1 + r8
            if (r8 >= r1) goto L_0x023a
            java.lang.NullPointerException r0 = X.C165597tg.A0g()
            throw r0
        L_0x004c:
            if (r9 != r2) goto L_0x033a
            java.lang.NullPointerException r0 = X.C165597tg.A0g()
            throw r0
        L_0x0053:
            if (r9 != r1) goto L_0x0074
            X.8Dv r3 = (X.C170538Dv) r3
            int r8 = A07(r13, r15, r4)
            int r1 = r13.A00
            int r1 = r1 + r8
        L_0x005e:
            if (r8 >= r1) goto L_0x006a
            int r8 = A07(r13, r15, r8)
            int r0 = r13.A00
            r3.A02(r0)
            goto L_0x005e
        L_0x006a:
            if (r8 == r1) goto L_0x0331
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.8xe r0 = new X.8xe
            r0.<init>(r1)
            throw r0
        L_0x0074:
            if (r27 != 0) goto L_0x033a
            X.8Dv r3 = (X.C170538Dv) r3
            int r8 = A07(r13, r15, r4)
        L_0x007c:
            int r0 = r13.A00
            r3.A02(r0)
            if (r8 >= r6) goto L_0x0331
            int r1 = A07(r13, r15, r8)
            int r0 = r13.A00
            if (r5 != r0) goto L_0x0331
            int r8 = A07(r13, r15, r1)
            goto L_0x007c
        L_0x0090:
            if (r9 != r1) goto L_0x00a0
            int r8 = A07(r13, r15, r4)
            int r1 = r13.A00
            int r1 = r1 + r8
            if (r8 >= r1) goto L_0x023a
            java.lang.NullPointerException r0 = X.C165597tg.A0g()
            throw r0
        L_0x00a0:
            if (r9 != r2) goto L_0x033a
            java.lang.NullPointerException r0 = X.C165597tg.A0g()
            throw r0
        L_0x00a7:
            if (r9 != r1) goto L_0x00b7
            int r8 = A07(r13, r15, r4)
            int r1 = r13.A00
            int r1 = r1 + r8
            if (r8 >= r1) goto L_0x023a
            java.lang.NullPointerException r0 = X.C165597tg.A0g()
            throw r0
        L_0x00b7:
            if (r9 != r8) goto L_0x033a
            java.lang.NullPointerException r0 = X.C165597tg.A0g()
            throw r0
        L_0x00be:
            if (r9 != r1) goto L_0x00d1
            int r8 = A07(r13, r15, r4)
            int r1 = r13.A00
            int r1 = r1 + r8
            if (r8 >= r1) goto L_0x023a
            A08(r13, r15, r8)
            java.lang.NullPointerException r0 = X.C165597tg.A0g()
            throw r0
        L_0x00d1:
            if (r27 != 0) goto L_0x033a
            A08(r13, r15, r4)
            java.lang.NullPointerException r0 = X.C165597tg.A0g()
            throw r0
        L_0x00db:
            if (r9 != r1) goto L_0x00f2
            X.8Dv r3 = (X.C170538Dv) r3
            int r8 = A07(r13, r15, r4)
            int r1 = r13.A00
            int r1 = r1 + r8
        L_0x00e6:
            if (r8 >= r1) goto L_0x023a
            int r0 = X.C165567td.A04(r15, r8)
            r3.A02(r0)
            int r8 = r8 + 4
            goto L_0x00e6
        L_0x00f2:
            if (r9 != r8) goto L_0x033a
            X.8Dv r3 = (X.C170538Dv) r3
        L_0x00f6:
            int r0 = X.C165567td.A04(r15, r4)
            r3.A02(r0)
            int r8 = r4 + 4
            if (r8 >= r6) goto L_0x0331
            int r4 = A07(r13, r15, r8)
            int r0 = r13.A00
            if (r5 != r0) goto L_0x0331
            goto L_0x00f6
        L_0x010a:
            if (r9 != r1) goto L_0x011d
            int r8 = A07(r13, r15, r4)
            int r0 = r13.A00
            int r0 = r0 + r8
            if (r8 >= r0) goto L_0x032f
            A08(r13, r15, r8)
            java.lang.NullPointerException r0 = X.C165597tg.A0g()
            throw r0
        L_0x011d:
            if (r27 != 0) goto L_0x033a
            A08(r13, r15, r4)
            java.lang.NullPointerException r0 = X.C165597tg.A0g()
            throw r0
        L_0x0127:
            if (r9 != r1) goto L_0x033a
            r0 = 536870912(0x20000000, double:2.652494739E-315)
            long r30 = r30 & r0
            java.lang.String r7 = ""
            int r0 = (r30 > r11 ? 1 : (r30 == r11 ? 0 : -1))
            int r4 = A07(r13, r15, r4)
            if (r0 != 0) goto L_0x0157
        L_0x0138:
            int r1 = r13.A00
            if (r1 < 0) goto L_0x01e4
            if (r1 != 0) goto L_0x0150
            r3.add(r7)
        L_0x0141:
            if (r4 >= r6) goto L_0x033a
            int r1 = A07(r13, r15, r4)
            int r0 = r13.A00
            if (r5 != r0) goto L_0x033a
            int r4 = A07(r13, r15, r1)
            goto L_0x0138
        L_0x0150:
            java.nio.charset.Charset r0 = X.C197089b7.A00
            X.C165597tg.A1L(r0, r3, r15, r4, r1)
            int r4 = r4 + r1
            goto L_0x0141
        L_0x0157:
            int r2 = r13.A00
            if (r2 < 0) goto L_0x01e4
            if (r2 != 0) goto L_0x016f
            r3.add(r7)
        L_0x0160:
            if (r4 >= r6) goto L_0x033a
            int r1 = A07(r13, r15, r4)
            int r0 = r13.A00
            if (r5 != r0) goto L_0x033a
            int r4 = A07(r13, r15, r1)
            goto L_0x0157
        L_0x016f:
            int r1 = r4 + r2
            X.9Ut r0 = X.C196639aB.A00
            int r0 = r0.A01(r15, r4, r1)
            if (r0 != 0) goto L_0x0180
            java.nio.charset.Charset r0 = X.C197089b7.A00
            X.C165597tg.A1L(r0, r3, r15, r4, r2)
            r4 = r1
            goto L_0x0160
        L_0x0180:
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            X.8xe r1 = new X.8xe
            r1.<init>(r0)
            throw r1
        L_0x0188:
            if (r9 != r1) goto L_0x033a
            X.B3T r2 = r0.A0H(r10)
            int r8 = A02(r13, r2, r15, r4, r6)
        L_0x0192:
            java.lang.Object r0 = r13.A02
            r3.add(r0)
            if (r8 >= r6) goto L_0x0331
            int r1 = A07(r13, r15, r8)
            int r0 = r13.A00
            if (r5 != r0) goto L_0x0331
            int r8 = A02(r13, r2, r15, r1, r6)
            goto L_0x0192
        L_0x01a6:
            if (r9 != r1) goto L_0x033a
            int r8 = A07(r13, r15, r4)
            int r4 = r13.A00
            if (r4 < 0) goto L_0x01e4
            int r2 = r15.length
        L_0x01b1:
            int r0 = r2 - r8
            if (r4 > r0) goto L_0x0332
            if (r4 != 0) goto L_0x01cf
            X.AUw r0 = X.C21673AUw.A00
            r3.add(r0)
        L_0x01bc:
            if (r8 >= r6) goto L_0x0331
            int r1 = A07(r13, r15, r8)
            int r0 = r13.A00
            if (r5 != r0) goto L_0x0331
            int r8 = A07(r13, r15, r1)
            int r4 = r13.A00
            if (r4 < 0) goto L_0x01e4
            goto L_0x01b1
        L_0x01cf:
            int r0 = r8 + r4
            X.C21673AUw.A00(r8, r0, r2)
            X.Axm r0 = X.C21673AUw.A01
            byte[] r1 = r0.ByJ(r15, r8, r4)
            X.8E0 r0 = new X.8E0
            r0.<init>(r1)
            r3.add(r0)
            int r8 = r8 + r4
            goto L_0x01bc
        L_0x01e4:
            java.lang.String r0 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            X.8xe r1 = new X.8xe
            r1.<init>(r0)
            throw r1
        L_0x01ec:
            if (r9 != r1) goto L_0x0207
            X.8Dv r3 = (X.C170538Dv) r3
            int r8 = A07(r13, r15, r4)
            int r1 = r13.A00
            int r1 = r1 + r8
        L_0x01f7:
            if (r8 >= r1) goto L_0x023a
            int r8 = A07(r13, r15, r8)
            int r0 = r13.A00
            int r0 = X.C165597tg.A02(r0)
            r3.A02(r0)
            goto L_0x01f7
        L_0x0207:
            if (r27 != 0) goto L_0x033a
            X.8Dv r3 = (X.C170538Dv) r3
            int r8 = A07(r13, r15, r4)
        L_0x020f:
            int r0 = r13.A00
            int r0 = X.C165597tg.A02(r0)
            r3.A02(r0)
            if (r8 >= r6) goto L_0x0331
            int r1 = A07(r13, r15, r8)
            int r0 = r13.A00
            if (r5 != r0) goto L_0x0331
            int r8 = A07(r13, r15, r1)
            goto L_0x020f
        L_0x0227:
            if (r9 != r1) goto L_0x023d
            int r8 = A07(r13, r15, r4)
            int r1 = r13.A00
            int r1 = r1 + r8
            if (r8 >= r1) goto L_0x023a
            A08(r13, r15, r8)
            java.lang.NullPointerException r0 = X.C165597tg.A0g()
            throw r0
        L_0x023a:
            if (r8 != r1) goto L_0x0332
            return r8
        L_0x023d:
            if (r27 != 0) goto L_0x033a
            A08(r13, r15, r4)
            java.lang.NullPointerException r0 = X.C165597tg.A0g()
            throw r0
        L_0x0247:
            r1 = 3
            if (r9 != r1) goto L_0x033a
            X.B3T r14 = r0.A0H(r10)
            r0 = r25 & -8
            r18 = r0 | 4
            r16 = r4
        L_0x0254:
            r17 = r6
            int r4 = A03(r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = r13.A02
            r3.add(r0)
            if (r4 >= r6) goto L_0x033a
            int r16 = A07(r13, r15, r4)
            int r0 = r13.A00
            if (r5 != r0) goto L_0x033a
            goto L_0x0254
        L_0x026a:
            if (r9 != r1) goto L_0x028c
            r5 = r3
            X.8Dv r5 = (X.C170538Dv) r5
            int r8 = A07(r13, r15, r4)
            int r2 = r13.A00
            int r2 = r2 + r8
        L_0x0276:
            if (r8 >= r2) goto L_0x0282
            int r8 = A07(r13, r15, r8)
            int r1 = r13.A00
            r5.A02(r1)
            goto L_0x0276
        L_0x0282:
            if (r8 == r2) goto L_0x02a9
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.8xe r0 = new X.8xe
            r0.<init>(r1)
            throw r0
        L_0x028c:
            if (r27 != 0) goto L_0x033a
            r9 = r3
            X.8Dv r9 = (X.C170538Dv) r9
            int r8 = A07(r13, r15, r4)
        L_0x0295:
            int r1 = r13.A00
            r9.A02(r1)
            if (r8 >= r6) goto L_0x02a9
            int r2 = A07(r13, r15, r8)
            int r1 = r13.A00
            if (r5 != r1) goto L_0x02a9
            int r8 = A07(r13, r15, r2)
            goto L_0x0295
        L_0x02a9:
            X.8EX r7 = (X.AnonymousClass8EX) r7
            X.9jt r5 = r7.zzb
            X.9jt r1 = X.C201569jt.A05
            if (r5 != r1) goto L_0x02b2
            r5 = 0
        L_0x02b2:
            java.lang.Object[] r1 = r0.A03
            int r0 = r28 / 3
            int r0 = r0 << 1
            int r0 = r0 + 1
            r6 = r1[r0]
            X.Axn r6 = (X.C22892Axn) r6
            java.lang.Class r0 = X.C203829ow.A03
            if (r6 == 0) goto L_0x032a
            boolean r0 = r3 instanceof java.util.RandomAccess
            if (r0 == 0) goto L_0x02f8
            int r10 = r3.size()
            r9 = 0
            r4 = 0
        L_0x02cc:
            if (r9 >= r10) goto L_0x0321
            int r1 = X.C36351kA.A06(r3, r9)
            boolean r0 = r6.zza(r1)
            if (r0 == 0) goto L_0x02e6
            if (r9 == r4) goto L_0x02e1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.set(r4, r0)
        L_0x02e1:
            int r4 = r4 + 1
        L_0x02e3:
            int r9 = r9 + 1
            goto L_0x02cc
        L_0x02e6:
            if (r5 != 0) goto L_0x02ed
            X.9jt r5 = new X.9jt
            r5.<init>()
        L_0x02ed:
            long r0 = (long) r1
            int r2 = r26 << 3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A01(r2, r0)
            goto L_0x02e3
        L_0x02f8:
            java.util.Iterator r4 = r3.iterator()
        L_0x02fc:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x032a
            int r1 = X.C36341k9.A0A(r4)
            boolean r0 = r6.zza(r1)
            if (r0 != 0) goto L_0x02fc
            if (r5 != 0) goto L_0x0313
            X.9jt r5 = new X.9jt
            r5.<init>()
        L_0x0313:
            long r2 = (long) r1
            int r1 = r26 << 3
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.A01(r1, r0)
            r4.remove()
            goto L_0x02fc
        L_0x0321:
            if (r4 == r10) goto L_0x032a
            java.util.List r0 = r3.subList(r4, r10)
            r0.clear()
        L_0x032a:
            if (r5 == 0) goto L_0x0331
            r7.zzb = r5
            return r8
        L_0x032f:
            if (r8 != r0) goto L_0x0332
        L_0x0331:
            return r8
        L_0x0332:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.8xe r1 = new X.8xe
            r1.<init>(r0)
            throw r1
        L_0x033a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A42.A06(X.9cY, java.lang.Object, byte[], int, int, int, int, int, int, int, long, long):int");
    }

    public static int A07(C197899cY r2, byte[] bArr, int i) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return A0C(r2, bArr, b, i2);
        }
        r2.A00 = b;
        return i2;
    }

    public static int A08(C197899cY r8, byte[] bArr, int i) {
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

    public static int A0A(C197899cY r17, byte[] bArr, int i) {
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        byte[] bArr2 = bArr;
        C197899cY r10 = r17;
        int A072 = A07(r10, bArr2, i);
        int i8 = r10.A00;
        if (i8 < 0) {
            throw new C187318xe("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else if (i8 == 0) {
            r10.A02 = "";
            return A072;
        } else {
            int i9 = A072;
            if (C196639aB.A00 instanceof C170638Ef) {
                int length = bArr2.length;
                if ((A072 | i8 | ((length - A072) - i8)) >= 0) {
                    int i10 = A072 + i8;
                    char[] cArr = new char[i8];
                    int i11 = 0;
                    while (i6 < i10) {
                        byte A002 = C203729od.A00(bArr2, (long) i6);
                        if (A002 < 0) {
                            break;
                        }
                        i9 = i6 + 1;
                        cArr[i5] = (char) A002;
                        i11 = i5 + 1;
                    }
                    while (i6 < i10) {
                        int i12 = i6 + 1;
                        byte A003 = C203729od.A00(bArr2, (long) i6);
                        if (A003 >= 0) {
                            i7 = i5 + 1;
                            cArr[i5] = (char) A003;
                            while (i12 < i10) {
                                byte A004 = C203729od.A00(bArr2, (long) i12);
                                if (A004 < 0) {
                                    break;
                                }
                                i12++;
                                cArr[i7] = (char) A004;
                                i7++;
                            }
                            i6 = i12;
                        } else {
                            if (A003 < -32) {
                                if (i12 < i10) {
                                    i6 = i12 + 1;
                                    byte A005 = C203729od.A00(bArr2, (long) i12);
                                    i7 = i5 + 1;
                                    if (A003 < -62 || A005 > -65) {
                                        throw new C187318xe("Protocol message had invalid UTF-8.");
                                    }
                                    cArr[i5] = (char) (((A003 & 31) << 6) | (A005 & 63));
                                }
                            } else if (A003 < -16) {
                                if (i12 < i10 - 1) {
                                    int i13 = i12 + 1;
                                    i6 = i13 + 1;
                                    i7 = i5 + 1;
                                    AnonymousClass9Z2.A01(A003, C203729od.A00(bArr2, (long) i12), C203729od.A00(bArr2, (long) i13), cArr, i5);
                                }
                            } else if (i12 < i10 - 2) {
                                int i14 = i12 + 1;
                                byte A006 = C203729od.A00(bArr2, (long) i12);
                                int i15 = i14 + 1;
                                i6 = i15 + 1;
                                AnonymousClass9Z2.A00(A003, A006, C203729od.A00(bArr2, (long) i14), C203729od.A00(bArr2, (long) i15), cArr, i5);
                                i5 = i5 + 1 + 1;
                            }
                            throw new C187318xe("Protocol message had invalid UTF-8.");
                        }
                        i5 = i7;
                    }
                    str = new String(cArr, 0, i5);
                } else {
                    Object[] A1Q = C36441kJ.A1Q();
                    C36331k8.A1X(A1Q, length, 0, A072, 1);
                    C36331k8.A1V(A1Q, i8);
                    throw C165597tg.A0Z("buffer length=%d, index=%d, size=%d", A1Q);
                }
            } else {
                int length2 = bArr2.length;
                if ((A072 | i8 | ((length2 - A072) - i8)) >= 0) {
                    int i16 = A072 + i8;
                    char[] cArr2 = new char[i8];
                    int i17 = 0;
                    while (i3 < i16) {
                        byte b = bArr[i3];
                        if (b < 0) {
                            break;
                        }
                        i9 = i3 + 1;
                        cArr2[i2] = (char) b;
                        i17 = i2 + 1;
                    }
                    while (i3 < i16) {
                        int i18 = i3 + 1;
                        byte b2 = bArr2[i3];
                        if (b2 >= 0) {
                            i4 = i2 + 1;
                            cArr2[i2] = (char) b2;
                            while (i18 < i16) {
                                byte b3 = bArr2[i18];
                                if (b3 < 0) {
                                    break;
                                }
                                i18++;
                                cArr2[i4] = (char) b3;
                                i4++;
                            }
                            i3 = i18;
                        } else {
                            if (b2 < -32) {
                                if (i18 < i16) {
                                    i3 = i18 + 1;
                                    byte b4 = bArr2[i18];
                                    i4 = i2 + 1;
                                    if (b2 < -62 || b4 > -65) {
                                        throw new C187318xe("Protocol message had invalid UTF-8.");
                                    }
                                    cArr2[i2] = (char) (((b2 & 31) << 6) | (b4 & 63));
                                }
                            } else if (b2 < -16) {
                                if (i18 < i16 - 1) {
                                    int i19 = i18 + 1;
                                    i3 = i19 + 1;
                                    i4 = i2 + 1;
                                    AnonymousClass9Z2.A01(b2, bArr2[i18], bArr2[i19], cArr2, i2);
                                }
                            } else if (i18 < i16 - 2) {
                                int i20 = i18 + 1;
                                byte b5 = bArr2[i18];
                                int i21 = i20 + 1;
                                byte b6 = bArr2[i20];
                                i3 = i21 + 1;
                                AnonymousClass9Z2.A00(b2, b5, b6, bArr2[i21], cArr2, i2);
                                i2 = i2 + 1 + 1;
                            }
                            throw new C187318xe("Protocol message had invalid UTF-8.");
                        }
                        i2 = i4;
                    }
                    str = new String(cArr2, 0, i2);
                } else {
                    Object[] A1Q2 = C36441kJ.A1Q();
                    C36331k8.A1X(A1Q2, length2, 0, A072, 1);
                    C36331k8.A1V(A1Q2, i8);
                    throw C165597tg.A0Z("buffer length=%d, index=%d, size=%d", A1Q2);
                }
            }
            r10.A02 = str;
            return A072 + i8;
        }
    }

    public static int A0C(C197899cY r4, byte[] bArr, int i, int i2) {
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

    public static int A0D(Object obj) {
        Class cls = C203829ow.A03;
        return ((List) obj).size();
    }

    public static int A0E(Object obj, int i) {
        if (obj instanceof C21673AUw) {
            return C170568Dy.A03((C21673AUw) obj, i);
        }
        return C170568Dy.A01(i, (String) obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01da, code lost:
        if (r31 == false) goto L_0x01dc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.A42 A0G(X.AnonymousClass95S r32, X.C199249ey r33, X.C22806AwH r34, X.C22807AwI r35, X.C22808AwJ r36, X.AnonymousClass95U r37) {
        /*
            r8 = r35
            boolean r0 = r8 instanceof X.C21031A3u
            if (r0 == 0) goto L_0x037d
            X.A3u r8 = (X.C21031A3u) r8
            int r0 = r8.A00
            r1 = 1
            r0 = r0 & 1
            if (r0 == r1) goto L_0x0010
            r1 = 2
        L_0x0010:
            r0 = 2
            r5 = 0
            r17 = 1
            boolean r31 = X.AnonymousClass000.A1S(r1, r0)
            java.lang.String r13 = r8.A02
            int r27 = r13.length()
            char r0 = r13.charAt(r5)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r0 < r12) goto L_0x0032
            r0 = 1
        L_0x0028:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x0033
            r0 = r1
            goto L_0x0028
        L_0x0032:
            r1 = 1
        L_0x0033:
            int r0 = r1 + 1
            char r3 = r13.charAt(r1)
            if (r3 < r12) goto L_0x0052
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x003f:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x004f
            int r3 = X.C165597tg.A04(r0, r2, r3)
            int r2 = r2 + 13
            r0 = r1
            goto L_0x003f
        L_0x004f:
            int r0 = r0 << r2
            r3 = r3 | r0
            r0 = r1
        L_0x0052:
            if (r3 != 0) goto L_0x025b
            int[] r16 = A0F
            r14 = 0
            r4 = 0
            r3 = 0
            r7 = 0
            r6 = 0
            r2 = 0
        L_0x005c:
            sun.misc.Unsafe r26 = A0E
            java.lang.Object[] r12 = r8.A03
            X.B5y r1 = r8.A01
            r28 = r1
            java.lang.Class r15 = r28.getClass()
            int r1 = r7 * 3
            int[] r1 = new int[r1]
            r25 = r1
            int r7 = r7 << r17
            java.lang.Object[] r11 = new java.lang.Object[r7]
            int r30 = r2 + r6
            r24 = r2
            r23 = r30
            r22 = 0
            r21 = 0
        L_0x007c:
            r1 = r27
            if (r0 >= r1) goto L_0x035f
            int r1 = r0 + 1
            char r10 = r13.charAt(r0)
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r10 < r0) goto L_0x00a2
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x008f:
            int r7 = r1 + 1
            char r1 = r13.charAt(r1)
            if (r1 < r0) goto L_0x009f
            int r10 = X.C165597tg.A04(r1, r6, r10)
            int r6 = r6 + 13
            r1 = r7
            goto L_0x008f
        L_0x009f:
            int r1 = r1 << r6
            r10 = r10 | r1
            r1 = r7
        L_0x00a2:
            int r0 = r1 + 1
            char r9 = r13.charAt(r1)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r9 < r6) goto L_0x00c4
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r1 = 13
        L_0x00b1:
            int r7 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r6) goto L_0x00c1
            int r9 = X.C165597tg.A04(r0, r1, r9)
            int r1 = r1 + 13
            r0 = r7
            goto L_0x00b1
        L_0x00c1:
            int r0 = r0 << r1
            r9 = r9 | r0
            r0 = r7
        L_0x00c4:
            r8 = r9 & 255(0xff, float:3.57E-43)
            r1 = r9 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x00d0
            int r1 = r22 + 1
            r16[r22] = r21
            r22 = r1
        L_0x00d0:
            r1 = 51
            if (r8 < r1) goto L_0x0161
            int r18 = r0 + 1
            char r7 = r13.charAt(r0)
            if (r7 < r6) goto L_0x00f7
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r1 = 13
        L_0x00e0:
            int r17 = r18 + 1
            r0 = r18
            char r0 = r13.charAt(r0)
            if (r0 < r6) goto L_0x00f3
            int r7 = X.C165597tg.A04(r0, r1, r7)
            int r1 = r1 + 13
            r18 = r17
            goto L_0x00e0
        L_0x00f3:
            int r0 = r0 << r1
            r7 = r7 | r0
            r18 = r17
        L_0x00f7:
            int r1 = r8 + -51
            r0 = 9
            if (r1 == r0) goto L_0x0151
            r0 = 17
            if (r1 == r0) goto L_0x0151
            r0 = 12
            if (r1 != r0) goto L_0x0114
            if (r31 != 0) goto L_0x0114
            int r0 = r21 / 3
            r1 = 1
            int r0 = r0 << r1
            int r6 = r0 + 1
            int r1 = r14 + 1
            r0 = r12[r14]
            r11[r6] = r0
            r14 = r1
        L_0x0114:
            r17 = 1
        L_0x0116:
            int r7 = r7 << r17
            r1 = r12[r7]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0148
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x0120:
            r0 = r26
            long r0 = r0.objectFieldOffset(r1)
            int r6 = (int) r0
            r20 = r6
            int r6 = r7 + 1
            r1 = r12[r6]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x013f
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x0133:
            r0 = r26
            long r0 = r0.objectFieldOffset(r1)
            int r7 = (int) r0
            r0 = r18
            r1 = 0
            goto L_0x0236
        L_0x013f:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r1 = A0K(r15, r1)
            r12[r6] = r1
            goto L_0x0133
        L_0x0148:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r1 = A0K(r15, r1)
            r12[r7] = r1
            goto L_0x0120
        L_0x0151:
            int r0 = r21 / 3
            r17 = 1
            int r0 = r0 << r17
            int r6 = r0 + 1
            int r1 = r14 + 1
            r0 = r12[r14]
            r11[r6] = r0
            r14 = r1
            goto L_0x0116
        L_0x0161:
            int r19 = r14 + 1
            r1 = r12[r14]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r6 = A0K(r15, r1)
            r1 = 9
            if (r8 == r1) goto L_0x01ee
            r1 = 17
            if (r8 == r1) goto L_0x01ee
            r1 = 27
            if (r8 == r1) goto L_0x01dc
            r1 = 49
            if (r8 == r1) goto L_0x01dc
            r1 = 12
            if (r8 == r1) goto L_0x01da
            r1 = 30
            if (r8 == r1) goto L_0x01da
            r1 = 44
            if (r8 == r1) goto L_0x01da
            r1 = 50
            if (r8 != r1) goto L_0x01a7
            int r14 = r24 + 1
            r16[r24] = r21
            int r1 = r21 / 3
            int r7 = r1 << 1
            int r17 = r19 + 1
            r1 = r12[r19]
            r11[r7] = r1
            r1 = r9 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x01e9
            int r7 = r7 + 1
            int r19 = r17 + 1
            r1 = r12[r17]
            r11[r7] = r1
            r24 = r14
        L_0x01a7:
            r1 = r26
            long r6 = r1.objectFieldOffset(r6)
            int r1 = (int) r6
            r20 = r1
            r6 = r9 & 4096(0x1000, float:5.74E-42)
            r1 = 4096(0x1000, float:5.74E-42)
            if (r6 != r1) goto L_0x0222
            r1 = 17
            if (r8 > r1) goto L_0x0222
            int r14 = r0 + 1
            char r6 = r13.charAt(r0)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r1) goto L_0x01ff
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r0 = 13
        L_0x01c9:
            int r17 = r14 + 1
            char r7 = r13.charAt(r14)
            if (r7 < r1) goto L_0x01fb
            int r6 = X.C165597tg.A04(r7, r0, r6)
            int r0 = r0 + 13
            r14 = r17
            goto L_0x01c9
        L_0x01da:
            if (r31 != 0) goto L_0x01a7
        L_0x01dc:
            int r1 = r21 / 3
            int r1 = r1 << 1
            int r7 = r1 + 1
            int r17 = r19 + 1
            r1 = r12[r19]
            r11[r7] = r1
            goto L_0x01eb
        L_0x01e9:
            r24 = r14
        L_0x01eb:
            r19 = r17
            goto L_0x01a7
        L_0x01ee:
            int r1 = r21 / 3
            int r1 = r1 << 1
            int r7 = r1 + 1
            java.lang.Class r1 = r6.getType()
            r11[r7] = r1
            goto L_0x01a7
        L_0x01fb:
            int r7 = r7 << r0
            r6 = r6 | r7
            r14 = r17
        L_0x01ff:
            int r7 = r5 << 1
            int r0 = r6 / 32
            int r7 = r7 + r0
            r1 = r12[r7]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0219
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x020c:
            r0 = r26
            long r17 = r0.objectFieldOffset(r1)
            r0 = r17
            int r7 = (int) r0
            int r1 = r6 % 32
            r0 = r14
            goto L_0x0234
        L_0x0219:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r1 = A0K(r15, r1)
            r12[r7] = r1
            goto L_0x020c
        L_0x0222:
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 0
            r6 = 18
            if (r8 < r6) goto L_0x0234
            r6 = 49
            if (r8 > r6) goto L_0x0234
            int r6 = r23 + 1
            r16[r23] = r20
            r23 = r6
        L_0x0234:
            r14 = r19
        L_0x0236:
            int r18 = r21 + 1
            r25[r21] = r10
            int r17 = r18 + 1
            r6 = r9 & 512(0x200, float:7.175E-43)
            r10 = 0
            if (r6 == 0) goto L_0x0243
            r10 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0243:
            r6 = r9 & 256(0x100, float:3.59E-43)
            r9 = 0
            if (r6 == 0) goto L_0x024a
            r9 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x024a:
            r9 = r9 | r10
            int r6 = r8 << 20
            r9 = r9 | r6
            r9 = r9 | r20
            r25[r18] = r9
            int r21 = r17 + 1
            int r1 = r1 << 20
            r1 = r1 | r7
            r25[r17] = r1
            goto L_0x007c
        L_0x025b:
            int r3 = r0 + 1
            char r5 = r13.charAt(r0)
            if (r5 < r12) goto L_0x027a
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0267:
            int r1 = r3 + 1
            char r0 = r13.charAt(r3)
            if (r0 < r12) goto L_0x0277
            int r5 = X.C165597tg.A04(r0, r2, r5)
            int r2 = r2 + 13
            r3 = r1
            goto L_0x0267
        L_0x0277:
            int r0 = r0 << r2
            r5 = r5 | r0
            r3 = r1
        L_0x027a:
            int r0 = r3 + 1
            char r9 = r13.charAt(r3)
            if (r9 < r12) goto L_0x0299
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0286:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x0296
            int r9 = X.C165597tg.A04(r0, r2, r9)
            int r2 = r2 + 13
            r0 = r1
            goto L_0x0286
        L_0x0296:
            int r0 = r0 << r2
            r9 = r9 | r0
            r0 = r1
        L_0x0299:
            int r3 = r0 + 1
            char r4 = r13.charAt(r0)
            if (r4 < r12) goto L_0x02b8
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x02a5:
            int r1 = r3 + 1
            char r0 = r13.charAt(r3)
            if (r0 < r12) goto L_0x02b5
            int r4 = X.C165597tg.A04(r0, r2, r4)
            int r2 = r2 + 13
            r3 = r1
            goto L_0x02a5
        L_0x02b5:
            int r0 = r0 << r2
            r4 = r4 | r0
            r3 = r1
        L_0x02b8:
            int r0 = r3 + 1
            char r3 = r13.charAt(r3)
            if (r3 < r12) goto L_0x02d7
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x02c4:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x02d4
            int r3 = X.C165597tg.A04(r0, r2, r3)
            int r2 = r2 + 13
            r0 = r1
            goto L_0x02c4
        L_0x02d4:
            int r0 = r0 << r2
            r3 = r3 | r0
            r0 = r1
        L_0x02d7:
            int r6 = r0 + 1
            char r7 = r13.charAt(r0)
            if (r7 < r12) goto L_0x02f6
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x02e3:
            int r1 = r6 + 1
            char r0 = r13.charAt(r6)
            if (r0 < r12) goto L_0x02f3
            int r7 = X.C165597tg.A04(r0, r2, r7)
            int r2 = r2 + 13
            r6 = r1
            goto L_0x02e3
        L_0x02f3:
            int r0 = r0 << r2
            r7 = r7 | r0
            r6 = r1
        L_0x02f6:
            int r0 = r6 + 1
            char r6 = r13.charAt(r6)
            if (r6 < r12) goto L_0x0315
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0302:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x0312
            int r6 = X.C165597tg.A04(r0, r2, r6)
            int r2 = r2 + 13
            r0 = r1
            goto L_0x0302
        L_0x0312:
            int r0 = r0 << r2
            r6 = r6 | r0
            r0 = r1
        L_0x0315:
            int r10 = r0 + 1
            char r11 = r13.charAt(r0)
            if (r11 < r12) goto L_0x0334
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0321:
            int r1 = r10 + 1
            char r0 = r13.charAt(r10)
            if (r0 < r12) goto L_0x0331
            int r11 = X.C165597tg.A04(r0, r2, r11)
            int r2 = r2 + 13
            r10 = r1
            goto L_0x0321
        L_0x0331:
            int r0 = r0 << r2
            r11 = r11 | r0
            r10 = r1
        L_0x0334:
            int r0 = r10 + 1
            char r2 = r13.charAt(r10)
            if (r2 < r12) goto L_0x0353
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0340:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x0350
            int r2 = X.C165597tg.A04(r0, r10, r2)
            int r10 = r10 + 13
            r0 = r1
            goto L_0x0340
        L_0x0350:
            int r0 = r0 << r10
            r2 = r2 | r0
            r0 = r1
        L_0x0353:
            int r1 = r2 + r6
            int r1 = r1 + r11
            int[] r1 = new int[r1]
            r16 = r1
            int r14 = r5 << 1
            int r14 = r14 + r9
            goto L_0x005c
        L_0x035f:
            X.A42 r17 = new X.A42
            r18 = r32
            r19 = r33
            r20 = r34
            r22 = r36
            r23 = r37
            r21 = r28
            r24 = r25
            r25 = r16
            r26 = r11
            r27 = r4
            r28 = r3
            r29 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return r17
        L_0x037d:
            java.lang.NullPointerException r0 = X.C165597tg.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A42.A0G(X.95S, X.9ey, X.AwH, X.AwI, X.AwJ, X.95U):X.A42");
    }

    private final B3T A0H(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.A03;
        B3T b3t = (B3T) objArr[i2];
        if (b3t != null) {
            return b3t;
        }
        B3T A002 = C198729e6.A02.A00((Class) objArr[i2 + 1]);
        objArr[i2] = A002;
        return A002;
    }

    public static C201569jt A0I(Object obj) {
        AnonymousClass8EX r2 = (AnonymousClass8EX) obj;
        C201569jt r1 = r2.zzb;
        if (r1 != C201569jt.A05) {
            return r1;
        }
        C201569jt r0 = new C201569jt();
        r2.zzb = r0;
        return r0;
    }

    public static void A0M(B3O b3o, Object obj, int i) {
        if (obj instanceof String) {
            ((A44) b3o).A00.A08(i, (String) obj);
            return;
        }
        ((A44) b3o).A00.A0B((C21673AUw) obj, i);
    }

    public static void A0N(Object obj, int i, int i2) {
        C170568Dy r2 = ((A44) obj).A00;
        r2.A05(i2 << 3);
        r2.A05((i >> 31) ^ (i << 1));
    }

    public static void A0O(Object obj, int i, int i2) {
        C170568Dy r1 = ((A44) obj).A00;
        r1.A05(i << 3);
        r1.A04((byte) i2);
    }

    private final boolean A0P(Object obj, int i) {
        int[] iArr = this.A02;
        int i2 = iArr[i + 2];
        long j = (long) (i2 & 1048575);
        if (j == 1048575) {
            int i3 = iArr[i + 1];
            long j2 = (long) (i3 & 1048575);
            switch (C165587tf.A02(i3)) {
                case 0:
                    if (C203729od.A00.A02(obj, j2) != 0.0d) {
                        return true;
                    }
                    break;
                case 1:
                    if (C203729od.A00.A03(obj, j2) != 0.0f) {
                        return true;
                    }
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (C203729od.A00.A05(obj, j2) != 0) {
                        return true;
                    }
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    if (C203729od.A00.A04(obj, j2) != 0) {
                        return true;
                    }
                    break;
                case 7:
                    return C203729od.A00.A0C(obj, j2);
                case 8:
                    Object A032 = C203729od.A03(obj, j2);
                    if (A032 instanceof String) {
                        if (!((String) A032).isEmpty()) {
                            return true;
                        }
                    } else if (!(A032 instanceof C21673AUw)) {
                        throw C165617ti.A0U();
                    } else if (!C21673AUw.A00.equals(A032)) {
                        return true;
                    }
                    break;
                case 9:
                case 17:
                    if (C203729od.A03(obj, j2) != null) {
                        return true;
                    }
                    break;
                case 10:
                    if (!C21673AUw.A00.equals(C203729od.A03(obj, j2))) {
                        return true;
                    }
                    break;
                default:
                    throw C165617ti.A0U();
            }
        } else {
            if ((C203729od.A00.A04(obj, j) & (1 << (i2 >>> 20))) != 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean A0Q(Object obj, int i, int i2) {
        return AnonymousClass000.A1S(C203729od.A00.A04(obj, C165577te.A0H(this.A02, i2)), i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0287, code lost:
        if (r5 == r2) goto L_0x0257;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0292, code lost:
        r11.putLong(r10, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x029d, code lost:
        r15 = r15 | r16;
        r13 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008e, code lost:
        r13 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0146, code lost:
        r11.putInt(r10, r7, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x015a, code lost:
        if ((r15 & r16) == 0) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015c, code lost:
        r0 = X.C197089b7.A00(r11.getObject(r10, r7), r4.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0174, code lost:
        r0 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0176, code lost:
        r11.putObject(r10, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01e5, code lost:
        r5 = r2 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01e7, code lost:
        r15 = r15 | r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e9, code lost:
        r1 = r22;
        r13 = r18;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0R(X.C197899cY r40, java.lang.Object r41, byte[] r42, int r43, int r44, int r45) {
        /*
            r39 = this;
            r5 = r43
            sun.misc.Unsafe r11 = A0E
            r1 = -1
            r9 = 0
            r12 = 0
            r15 = 0
            r13 = 1048575(0xfffff, float:1.469367E-39)
        L_0x000b:
            r6 = r39
            r29 = r44
            r10 = r41
            r23 = r45
            r0 = r29
            if (r5 >= r0) goto L_0x0097
            int r2 = r5 + 1
            r3 = r42
            byte r12 = r42[r5]
            r4 = r40
            if (r12 >= 0) goto L_0x0027
            int r2 = A0C(r4, r3, r12, r2)
            int r12 = r4.A00
        L_0x0027:
            int r22 = r12 >>> 3
            r5 = r12 & 7
            r7 = 3
            r0 = r22
            if (r0 <= r1) goto L_0x02b2
            int r9 = r9 / r7
            int r1 = r6.A00
            if (r0 < r1) goto L_0x02af
            int r1 = r6.A01
            if (r0 > r1) goto L_0x02af
            int[] r8 = r6.A02
            int r0 = r8.length
            int r0 = r0 / 3
            int r7 = r0 + -1
        L_0x0040:
            if (r9 > r7) goto L_0x02af
            int r0 = r7 + r9
            int r16 = r0 >>> 1
            int r14 = r16 * 3
            r1 = r8[r14]
            r0 = r22
            if (r0 != r1) goto L_0x02a5
            r9 = r14
        L_0x004f:
            r20 = 0
            r0 = -1
            if (r9 == r0) goto L_0x02af
            int[] r0 = r6.A02
            r1 = r0
            int r0 = r9 + 1
            r19 = r1[r0]
            int r14 = X.C165587tf.A02(r19)
            long r7 = X.C165597tg.A0D(r19)
            r0 = 17
            if (r14 > r0) goto L_0x01f3
            int r0 = r9 + 2
            r18 = r1[r0]
            int r0 = r18 >>> 20
            r17 = 1
            int r16 = r17 << r0
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r18 = r18 & r0
            r0 = r18
            if (r0 == r13) goto L_0x01ef
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r13 == r0) goto L_0x0083
            long r0 = (long) r13
            r11.putInt(r10, r0, r15)
        L_0x0083:
            r0 = r18
            long r0 = (long) r0
            int r15 = r11.getInt(r10, r0)
        L_0x008a:
            r0 = 5
            switch(r14) {
                case 0: goto L_0x01d1;
                case 1: goto L_0x01bf;
                case 2: goto L_0x028a;
                case 3: goto L_0x028a;
                case 4: goto L_0x01b3;
                case 5: goto L_0x01a2;
                case 6: goto L_0x0195;
                case 7: goto L_0x0180;
                case 8: goto L_0x0167;
                case 9: goto L_0x014b;
                case 10: goto L_0x00df;
                case 11: goto L_0x01b3;
                case 12: goto L_0x0111;
                case 13: goto L_0x0195;
                case 14: goto L_0x01a2;
                case 15: goto L_0x013a;
                case 16: goto L_0x0100;
                case 17: goto L_0x00e8;
                default: goto L_0x008e;
            }
        L_0x008e:
            r13 = r18
        L_0x0090:
            r0 = r23
            if (r12 != r0) goto L_0x00cb
            if (r45 == 0) goto L_0x00cb
            r5 = r2
        L_0x0097:
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r13 == r0) goto L_0x00a0
            long r0 = (long) r13
            r11.putInt(r10, r0, r15)
        L_0x00a0:
            int r3 = r6.A04
        L_0x00a2:
            int r0 = r6.A05
            if (r3 >= r0) goto L_0x02b8
            int[] r0 = r6.A0D
            r2 = r0[r3]
            int[] r0 = r6.A02
            long r0 = X.C165577te.A0G(r0, r2)
            java.lang.Object r0 = X.C203729od.A03(r10, r0)
            if (r0 == 0) goto L_0x00c8
            java.lang.Object[] r1 = r6.A03
            int r0 = r2 / 3
            int r0 = r0 << 1
            int r0 = r0 + 1
            r0 = r1[r0]
            if (r0 == 0) goto L_0x00c8
            java.lang.NoSuchMethodError r1 = new java.lang.NoSuchMethodError
            r1.<init>()
            throw r1
        L_0x00c8:
            int r3 = r3 + 1
            goto L_0x00a2
        L_0x00cb:
            X.9jt r17 = A0I(r10)
            r16 = r4
            r18 = r3
            r19 = r12
            r20 = r2
            r21 = r29
            int r5 = A04(r16, r17, r18, r19, r20, r21)
            goto L_0x02a1
        L_0x00df:
            r0 = 2
            if (r5 != r0) goto L_0x008e
            int r5 = A0B(r4, r3, r2)
            goto L_0x0174
        L_0x00e8:
            r0 = 3
            if (r5 != r0) goto L_0x008e
            int r0 = r22 << 3
            r28 = r0 | 4
            X.B3T r24 = r6.A0H(r9)
            r23 = r4
            r25 = r3
            r26 = r2
            r27 = r29
            int r5 = A03(r23, r24, r25, r26, r27, r28)
            goto L_0x0158
        L_0x0100:
            if (r5 != 0) goto L_0x008e
            int r5 = A08(r4, r3, r2)
            long r2 = r4.A01
            long r13 = r2 >>> r17
            r0 = 1
            long r2 = r2 & r0
            long r0 = -r2
            long r0 = r0 ^ r13
            goto L_0x0292
        L_0x0111:
            if (r5 != 0) goto L_0x008e
            int r5 = A07(r4, r3, r2)
            int r2 = r4.A00
            java.lang.Object[] r1 = r6.A03
            int r0 = r9 / 3
            int r0 = r0 << 1
            int r0 = r0 + 1
            r0 = r1[r0]
            X.Axn r0 = (X.C22892Axn) r0
            if (r0 == 0) goto L_0x0146
            boolean r0 = r0.zza(r2)
            if (r0 != 0) goto L_0x0146
            X.9jt r1 = A0I(r10)
            java.lang.Long r0 = X.C36441kJ.A0y(r2)
            r1.A01(r12, r0)
            goto L_0x01e9
        L_0x013a:
            if (r5 != 0) goto L_0x008e
            int r5 = A07(r4, r3, r2)
            int r0 = r4.A00
            int r2 = X.C165597tg.A02(r0)
        L_0x0146:
            r11.putInt(r10, r7, r2)
            goto L_0x029d
        L_0x014b:
            r0 = 2
            if (r5 != r0) goto L_0x008e
            X.B3T r1 = r6.A0H(r9)
            r0 = r29
            int r5 = A02(r4, r1, r3, r2, r0)
        L_0x0158:
            r0 = r15 & r16
            if (r0 == 0) goto L_0x0174
            java.lang.Object r1 = r11.getObject(r10, r7)
            java.lang.Object r0 = r4.A02
            X.8EX r0 = X.C197089b7.A00(r1, r0)
            goto L_0x0176
        L_0x0167:
            r0 = 2
            if (r5 != r0) goto L_0x008e
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r19
            if (r0 != 0) goto L_0x017b
            int r5 = A09(r4, r3, r2)
        L_0x0174:
            java.lang.Object r0 = r4.A02
        L_0x0176:
            r11.putObject(r10, r7, r0)
            goto L_0x029d
        L_0x017b:
            int r5 = A0A(r4, r3, r2)
            goto L_0x0174
        L_0x0180:
            if (r5 != 0) goto L_0x008e
            int r5 = A08(r4, r3, r2)
            long r0 = r4.A01
            int r2 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r2)
            X.9Ye r0 = X.C203729od.A00
            r0.A0B(r10, r7, r1)
            goto L_0x029d
        L_0x0195:
            if (r5 != r0) goto L_0x008e
            int r0 = X.C165567td.A04(r3, r2)
            r11.putInt(r10, r7, r0)
            int r5 = r2 + 4
            goto L_0x029d
        L_0x01a2:
            r0 = 1
            if (r5 != r0) goto L_0x008e
            long r27 = X.C165567td.A0A(r3, r2)
            r24 = r10
            r23 = r11
            r25 = r7
            r23.putLong(r24, r25, r27)
            goto L_0x01e5
        L_0x01b3:
            if (r5 != 0) goto L_0x008e
            int r5 = A07(r4, r3, r2)
            int r0 = r4.A00
            r11.putInt(r10, r7, r0)
            goto L_0x01e7
        L_0x01bf:
            if (r5 != r0) goto L_0x008e
            int r0 = X.C165567td.A04(r3, r2)
            float r1 = java.lang.Float.intBitsToFloat(r0)
            X.9Ye r0 = X.C203729od.A00
            r0.A08(r10, r7, r1)
            int r5 = r2 + 4
            goto L_0x01e7
        L_0x01d1:
            r0 = 1
            if (r5 != r0) goto L_0x008e
            long r0 = X.C165567td.A0A(r3, r2)
            double r27 = java.lang.Double.longBitsToDouble(r0)
            X.9Ye r23 = X.C203729od.A00
            r24 = r10
            r25 = r7
            r23.A07(r24, r25, r27)
        L_0x01e5:
            int r5 = r2 + 8
        L_0x01e7:
            r15 = r15 | r16
        L_0x01e9:
            r1 = r22
            r13 = r18
            goto L_0x000b
        L_0x01ef:
            r18 = r13
            goto L_0x008a
        L_0x01f3:
            r0 = 27
            if (r14 != r0) goto L_0x022e
            r0 = 2
            if (r5 != r0) goto L_0x0090
            java.lang.Object r1 = r11.getObject(r10, r7)
            X.B6b r1 = (X.C23121B6b) r1
            r0 = r1
            X.AcA r0 = (X.C21884AcA) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0212
            int r0 = X.C165597tg.A07(r1)
            X.B6b r1 = r1.ByB(r0)
            r11.putObject(r10, r7, r1)
        L_0x0212:
            X.B3T r6 = r6.A0H(r9)
        L_0x0216:
            r0 = r29
            int r5 = A02(r4, r6, r3, r2, r0)
            java.lang.Object r0 = r4.A02
            r1.add(r0)
            r0 = r29
            if (r5 >= r0) goto L_0x02a1
            int r2 = A07(r4, r3, r5)
            int r0 = r4.A00
            if (r12 != r0) goto L_0x02a1
            goto L_0x0216
        L_0x022e:
            r0 = 49
            if (r14 > r0) goto L_0x025a
            r0 = r19
            long r0 = (long) r0
            r16 = r0
            r1 = r22
            r25 = r4
            r26 = r10
            r27 = r3
            r33 = r9
            r34 = r14
            r35 = r16
            r37 = r7
            r24 = r6
            r28 = r2
            r30 = r12
            r31 = r1
            r32 = r5
            int r5 = r24.A06(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37)
            if (r5 != r2) goto L_0x000b
        L_0x0257:
            r2 = r5
            goto L_0x0090
        L_0x025a:
            r0 = 50
            if (r14 != r0) goto L_0x026b
            r0 = 2
            if (r5 != r0) goto L_0x0090
            r11.getObject(r10, r7)
            java.lang.String r0 = "zzd"
            java.lang.NullPointerException r1 = X.AnonymousClass001.A0A(r0)
            throw r1
        L_0x026b:
            r25 = r4
            r26 = r10
            r27 = r3
            r33 = r19
            r34 = r14
            r35 = r9
            r36 = r7
            r24 = r6
            r28 = r2
            r30 = r12
            r31 = r22
            r32 = r5
            int r5 = r24.A05(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            if (r5 != r2) goto L_0x02a1
            goto L_0x0257
        L_0x028a:
            if (r5 != 0) goto L_0x008e
            int r5 = A08(r4, r3, r2)
            long r0 = r4.A01
        L_0x0292:
            r24 = r10
            r23 = r11
            r25 = r7
            r27 = r0
            r23.putLong(r24, r25, r27)
        L_0x029d:
            r15 = r15 | r16
            r13 = r18
        L_0x02a1:
            r1 = r22
            goto L_0x000b
        L_0x02a5:
            if (r0 >= r1) goto L_0x02ab
            int r7 = r16 + -1
            goto L_0x0040
        L_0x02ab:
            int r9 = r16 + 1
            goto L_0x0040
        L_0x02af:
            r9 = 0
            goto L_0x0090
        L_0x02b2:
            int r9 = r6.A00(r0)
            goto L_0x004f
        L_0x02b8:
            r0 = r29
            if (r45 != 0) goto L_0x02bf
            if (r5 != r0) goto L_0x02c6
            return r5
        L_0x02bf:
            if (r5 > r0) goto L_0x02c6
            r0 = r23
            if (r12 != r0) goto L_0x02c6
            return r5
        L_0x02c6:
            java.lang.String r0 = "Failed to parse the message."
            X.8xe r1 = new X.8xe
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A42.A0R(X.9cY, java.lang.Object, byte[], int, int, int):int");
    }

    public final Object ByC() {
        return ((AnonymousClass8EX) this.A09).A09(4);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b3, code lost:
        if (r3 == r0) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b5, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00db, code lost:
        if (r3 == r1) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean ByI(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            int[] r7 = r10.A02
            int r6 = r7.length
            r9 = 0
            r5 = 0
        L_0x0005:
            r2 = 1
            if (r5 >= r6) goto L_0x00b6
            int r0 = r5 + 1
            r4 = r7[r0]
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r4 & r3
            long r1 = (long) r0
            int r0 = X.C165587tf.A02(r4)
            switch(r0) {
                case 0: goto L_0x001c;
                case 1: goto L_0x004d;
                case 2: goto L_0x00c5;
                case 3: goto L_0x00c5;
                case 4: goto L_0x006a;
                case 5: goto L_0x00c5;
                case 6: goto L_0x006a;
                case 7: goto L_0x009f;
                case 8: goto L_0x007f;
                case 9: goto L_0x007f;
                case 10: goto L_0x007f;
                case 11: goto L_0x006a;
                case 12: goto L_0x006a;
                case 13: goto L_0x006a;
                case 14: goto L_0x00c5;
                case 15: goto L_0x006a;
                case 16: goto L_0x00c5;
                case 17: goto L_0x007f;
                case 18: goto L_0x0089;
                case 19: goto L_0x0089;
                case 20: goto L_0x0089;
                case 21: goto L_0x0089;
                case 22: goto L_0x0089;
                case 23: goto L_0x0089;
                case 24: goto L_0x0089;
                case 25: goto L_0x0089;
                case 26: goto L_0x0089;
                case 27: goto L_0x0089;
                case 28: goto L_0x0089;
                case 29: goto L_0x0089;
                case 30: goto L_0x0089;
                case 31: goto L_0x0089;
                case 32: goto L_0x0089;
                case 33: goto L_0x0089;
                case 34: goto L_0x0089;
                case 35: goto L_0x0089;
                case 36: goto L_0x0089;
                case 37: goto L_0x0089;
                case 38: goto L_0x0089;
                case 39: goto L_0x0089;
                case 40: goto L_0x0089;
                case 41: goto L_0x0089;
                case 42: goto L_0x0089;
                case 43: goto L_0x0089;
                case 44: goto L_0x0089;
                case 45: goto L_0x0089;
                case 46: goto L_0x0089;
                case 47: goto L_0x0089;
                case 48: goto L_0x0089;
                case 49: goto L_0x0089;
                case 50: goto L_0x0089;
                case 51: goto L_0x003a;
                case 52: goto L_0x003a;
                case 53: goto L_0x003a;
                case 54: goto L_0x003a;
                case 55: goto L_0x003a;
                case 56: goto L_0x003a;
                case 57: goto L_0x003a;
                case 58: goto L_0x003a;
                case 59: goto L_0x003a;
                case 60: goto L_0x003a;
                case 61: goto L_0x003a;
                case 62: goto L_0x003a;
                case 63: goto L_0x003a;
                case 64: goto L_0x003a;
                case 65: goto L_0x003a;
                case 66: goto L_0x003a;
                case 67: goto L_0x003a;
                case 68: goto L_0x003a;
                default: goto L_0x0019;
            }
        L_0x0019:
            int r5 = r5 + 3
            goto L_0x0005
        L_0x001c:
            boolean r3 = r10.A0P(r11, r5)
            boolean r0 = r10.A0P(r12, r5)
            if (r3 != r0) goto L_0x00dd
            X.9Ye r0 = X.C203729od.A00
            double r3 = r0.A02(r11, r1)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r0 = r0.A02(r12, r1)
            long r1 = java.lang.Double.doubleToLongBits(r0)
            goto L_0x00d9
        L_0x003a:
            int r0 = r5 + 2
            r0 = r7[r0]
            r0 = r0 & r3
            long r3 = (long) r0
            X.9Ye r0 = X.C203729od.A00
            int r8 = r0.A04(r11, r3)
            int r0 = r0.A04(r12, r3)
            if (r8 != r0) goto L_0x00dd
            goto L_0x0089
        L_0x004d:
            boolean r3 = r10.A0P(r11, r5)
            boolean r0 = r10.A0P(r12, r5)
            if (r3 != r0) goto L_0x00dd
            X.9Ye r4 = X.C203729od.A00
            float r0 = r4.A03(r11, r1)
            int r3 = java.lang.Float.floatToIntBits(r0)
            float r0 = r4.A03(r12, r1)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x00b3
        L_0x006a:
            boolean r3 = r10.A0P(r11, r5)
            boolean r0 = r10.A0P(r12, r5)
            if (r3 != r0) goto L_0x00dd
            X.9Ye r0 = X.C203729od.A00
            int r3 = r0.A04(r11, r1)
            int r0 = r0.A04(r12, r1)
            goto L_0x00b3
        L_0x007f:
            boolean r3 = r10.A0P(r11, r5)
            boolean r0 = r10.A0P(r12, r5)
            if (r3 != r0) goto L_0x00dd
        L_0x0089:
            java.lang.Object r3 = X.C203729od.A03(r11, r1)
            java.lang.Object r1 = X.C203729od.A03(r12, r1)
            java.lang.Class r0 = X.C203829ow.A03
            if (r3 == r1) goto L_0x0019
            if (r3 == 0) goto L_0x00dd
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L_0x00dd
            goto L_0x0019
        L_0x009f:
            boolean r3 = r10.A0P(r11, r5)
            boolean r0 = r10.A0P(r12, r5)
            if (r3 != r0) goto L_0x00dd
            X.9Ye r0 = X.C203729od.A00
            boolean r3 = r0.A0C(r11, r1)
            boolean r0 = r0.A0C(r12, r1)
        L_0x00b3:
            if (r3 == r0) goto L_0x0019
            return r9
        L_0x00b6:
            X.8EX r11 = (X.AnonymousClass8EX) r11
            X.9jt r1 = r11.zzb
            X.8EX r12 = (X.AnonymousClass8EX) r12
            X.9jt r0 = r12.zzb
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00dd
            return r2
        L_0x00c5:
            boolean r3 = r10.A0P(r11, r5)
            boolean r0 = r10.A0P(r12, r5)
            if (r3 != r0) goto L_0x00dd
            X.9Ye r0 = X.C203729od.A00
            long r3 = r0.A05(r11, r1)
            long r1 = r0.A05(r12, r1)
        L_0x00d9:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0019
        L_0x00dd:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A42.ByI(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x037f, code lost:
        X.AnonymousClass95R.A09(r6, r7, A0F(r5, (long) (r1 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0422, code lost:
        ((X.A44) r6).A00.A07(r7, X.AnonymousClass000.A0I(X.C203729od.A03(r5, (long) (r1 & 1048575))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0453, code lost:
        X.AnonymousClass95R.A08(r6, r7, A0F(r5, (long) (r1 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04db, code lost:
        r8 = r8 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x06b5, code lost:
        X.C203829ow.A0E(r6, (java.util.List) r9.getObject(r5, r0), r10[r8], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x06c3, code lost:
        X.C203829ow.A0F(r6, (java.util.List) r9.getObject(r5, r0), r10[r8], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x06d1, code lost:
        X.C203829ow.A0G(r6, (java.util.List) r9.getObject(r5, r0), r10[r8], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x06df, code lost:
        X.C203829ow.A0H(r6, (java.util.List) r9.getObject(r5, r0), r10[r8], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x06ed, code lost:
        X.C203829ow.A0L(r6, (java.util.List) r9.getObject(r5, r0), r10[r8], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x06fb, code lost:
        X.C203829ow.A0J(r6, (java.util.List) r9.getObject(r5, r0), r10[r8], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x07d9, code lost:
        X.AnonymousClass95R.A09(r6, r7, A0F(r5, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0873, code lost:
        ((X.A44) r6).A00.A07(r7, X.AnonymousClass000.A0I(X.C203729od.A03(r5, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x089e, code lost:
        X.AnonymousClass95R.A08(r6, r7, A0F(r5, r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ByK(X.B3O r21, java.lang.Object r22) {
        /*
            r20 = this;
            r5 = r22
            r17 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 1
            r3 = 0
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r20
            boolean r0 = r2.A0C
            r6 = r21
            if (r0 == 0) goto L_0x04a8
            int[] r9 = r2.A02
            int r10 = r9.length
            r8 = 0
        L_0x0015:
            if (r8 >= r10) goto L_0x08ed
            int r0 = r8 + 1
            r1 = r9[r0]
            r7 = r9[r8]
            r0 = r1 & r17
            int r0 = r0 >>> 20
            switch(r0) {
                case 0: goto L_0x0027;
                case 1: goto L_0x003a;
                case 2: goto L_0x004d;
                case 3: goto L_0x0060;
                case 4: goto L_0x0073;
                case 5: goto L_0x008b;
                case 6: goto L_0x009e;
                case 7: goto L_0x00b2;
                case 8: goto L_0x00c6;
                case 9: goto L_0x00d5;
                case 10: goto L_0x00e8;
                case 11: goto L_0x00fe;
                case 12: goto L_0x011c;
                case 13: goto L_0x0135;
                case 14: goto L_0x0149;
                case 15: goto L_0x015d;
                case 16: goto L_0x0171;
                case 17: goto L_0x0193;
                case 18: goto L_0x01a6;
                case 19: goto L_0x01b1;
                case 20: goto L_0x01bc;
                case 21: goto L_0x01c7;
                case 22: goto L_0x01d2;
                case 23: goto L_0x01dd;
                case 24: goto L_0x01e8;
                case 25: goto L_0x01f3;
                case 26: goto L_0x01fe;
                case 27: goto L_0x0209;
                case 28: goto L_0x0231;
                case 29: goto L_0x023c;
                case 30: goto L_0x0247;
                case 31: goto L_0x0252;
                case 32: goto L_0x025d;
                case 33: goto L_0x0268;
                case 34: goto L_0x0273;
                case 35: goto L_0x027e;
                case 36: goto L_0x0289;
                case 37: goto L_0x0294;
                case 38: goto L_0x029f;
                case 39: goto L_0x02aa;
                case 40: goto L_0x02b5;
                case 41: goto L_0x02c0;
                case 42: goto L_0x02cb;
                case 43: goto L_0x02d6;
                case 44: goto L_0x02e1;
                case 45: goto L_0x02ec;
                case 46: goto L_0x02f7;
                case 47: goto L_0x0302;
                case 48: goto L_0x030d;
                case 49: goto L_0x0318;
                case 50: goto L_0x0340;
                case 51: goto L_0x034c;
                case 52: goto L_0x035f;
                case 53: goto L_0x0372;
                case 54: goto L_0x0379;
                case 55: goto L_0x038b;
                case 56: goto L_0x0393;
                case 57: goto L_0x039b;
                case 58: goto L_0x03b1;
                case 59: goto L_0x03c4;
                case 60: goto L_0x03d3;
                case 61: goto L_0x03e6;
                case 62: goto L_0x03fc;
                case 63: goto L_0x041c;
                case 64: goto L_0x0437;
                case 65: goto L_0x044d;
                case 66: goto L_0x045f;
                case 67: goto L_0x0475;
                case 68: goto L_0x0495;
                default: goto L_0x0024;
            }
        L_0x0024:
            int r8 = r8 + 3
            goto L_0x0015
        L_0x0027:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.9Ye r11 = X.C203729od.A00
            double r0 = r11.A02(r5, r0)
            r6.ByE(r7, r0)
            goto L_0x0024
        L_0x003a:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.9Ye r11 = X.C203729od.A00
            float r0 = r11.A03(r5, r0)
            r6.ByF(r7, r0)
            goto L_0x0024
        L_0x004d:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.9Ye r11 = X.C203729od.A00
            long r0 = r11.A05(r5, r0)
            X.AnonymousClass95R.A09(r6, r7, r0)
            goto L_0x0024
        L_0x0060:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.9Ye r11 = X.C203729od.A00
            long r0 = r11.A05(r5, r0)
            X.AnonymousClass95R.A09(r6, r7, r0)
            goto L_0x0024
        L_0x0073:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.9Ye r11 = X.C203729od.A00
            int r1 = r11.A04(r5, r0)
            r0 = r6
            X.A44 r0 = (X.A44) r0
            X.8Dy r0 = r0.A00
            r0.A07(r7, r1)
            goto L_0x0024
        L_0x008b:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.9Ye r11 = X.C203729od.A00
            long r0 = r11.A05(r5, r0)
            X.AnonymousClass95R.A08(r6, r7, r0)
            goto L_0x0024
        L_0x009e:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.9Ye r11 = X.C203729od.A00
            int r0 = r11.A04(r5, r0)
            X.AnonymousClass95R.A07(r6, r7, r0)
            goto L_0x0024
        L_0x00b2:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.9Ye r11 = X.C203729od.A00
            boolean r0 = r11.A0C(r5, r0)
            A0O(r6, r7, r0)
            goto L_0x0024
        L_0x00c6:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = A0J(r5, r1)
            A0M(r6, r0, r7)
            goto L_0x0024
        L_0x00d5:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = A0J(r5, r1)
            X.B3T r0 = r2.A0H(r8)
            r6.ByO(r0, r1, r7)
            goto L_0x0024
        L_0x00e8:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = A0J(r5, r1)
            X.AUw r1 = (X.C21673AUw) r1
            r0 = r6
            X.A44 r0 = (X.A44) r0
            X.8Dy r0 = r0.A00
            r0.A0B(r1, r7)
            goto L_0x0024
        L_0x00fe:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.9Ye r11 = X.C203729od.A00
            int r11 = r11.A04(r5, r0)
            r0 = r6
            X.A44 r0 = (X.A44) r0
            X.8Dy r1 = r0.A00
            int r0 = r7 << 3
            r1.A05(r0)
            r1.A05(r11)
            goto L_0x0024
        L_0x011c:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.9Ye r11 = X.C203729od.A00
            int r1 = r11.A04(r5, r0)
            r0 = r6
            X.A44 r0 = (X.A44) r0
            X.8Dy r0 = r0.A00
            r0.A07(r7, r1)
            goto L_0x0024
        L_0x0135:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.9Ye r11 = X.C203729od.A00
            int r0 = r11.A04(r5, r0)
            X.AnonymousClass95R.A07(r6, r7, r0)
            goto L_0x0024
        L_0x0149:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.9Ye r11 = X.C203729od.A00
            long r0 = r11.A05(r5, r0)
            X.AnonymousClass95R.A08(r6, r7, r0)
            goto L_0x0024
        L_0x015d:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.9Ye r11 = X.C203729od.A00
            int r0 = r11.A04(r5, r0)
            A0N(r6, r0, r7)
            goto L_0x0024
        L_0x0171:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.9Ye r11 = X.C203729od.A00
            long r12 = r11.A05(r5, r0)
            r0 = r6
            X.A44 r0 = (X.A44) r0
            X.8Dy r11 = r0.A00
            long r0 = X.C165567td.A05(r12)
            int r7 = r7 << 3
            r11.A05(r7)
            r11.A09(r0)
            goto L_0x0024
        L_0x0193:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = A0J(r5, r1)
            X.B3T r0 = r2.A0H(r8)
            r6.ByZ(r0, r1, r7)
            goto L_0x0024
        L_0x01a6:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0E(r6, r0, r7, r3)
            goto L_0x0024
        L_0x01b1:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0F(r6, r0, r7, r3)
            goto L_0x0024
        L_0x01bc:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0G(r6, r0, r7, r3)
            goto L_0x0024
        L_0x01c7:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0H(r6, r0, r7, r3)
            goto L_0x0024
        L_0x01d2:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0L(r6, r0, r7, r3)
            goto L_0x0024
        L_0x01dd:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0J(r6, r0, r7, r3)
            goto L_0x0024
        L_0x01e8:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0O(r6, r0, r7, r3)
            goto L_0x0024
        L_0x01f3:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0R(r6, r0, r7, r3)
            goto L_0x0024
        L_0x01fe:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0C(r6, r0, r7)
            goto L_0x0024
        L_0x0209:
            r12 = r9[r8]
            java.util.List r13 = A0L(r1, r5)
            X.B3T r11 = r2.A0H(r8)
            java.lang.Class r0 = X.C203829ow.A03
            if (r13 == 0) goto L_0x0024
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0024
            r7 = r6
            X.A44 r7 = (X.A44) r7
            r1 = 0
        L_0x0221:
            int r0 = r13.size()
            if (r1 >= r0) goto L_0x0024
            java.lang.Object r0 = r13.get(r1)
            r7.ByO(r11, r0, r12)
            int r1 = r1 + 1
            goto L_0x0221
        L_0x0231:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0D(r6, r0, r7)
            goto L_0x0024
        L_0x023c:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0M(r6, r0, r7, r3)
            goto L_0x0024
        L_0x0247:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0Q(r6, r0, r7, r3)
            goto L_0x0024
        L_0x0252:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0P(r6, r0, r7, r3)
            goto L_0x0024
        L_0x025d:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0K(r6, r0, r7, r3)
            goto L_0x0024
        L_0x0268:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0N(r6, r0, r7, r3)
            goto L_0x0024
        L_0x0273:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0I(r6, r0, r7, r3)
            goto L_0x0024
        L_0x027e:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0E(r6, r0, r7, r4)
            goto L_0x0024
        L_0x0289:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0F(r6, r0, r7, r4)
            goto L_0x0024
        L_0x0294:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0G(r6, r0, r7, r4)
            goto L_0x0024
        L_0x029f:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0H(r6, r0, r7, r4)
            goto L_0x0024
        L_0x02aa:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0L(r6, r0, r7, r4)
            goto L_0x0024
        L_0x02b5:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0J(r6, r0, r7, r4)
            goto L_0x0024
        L_0x02c0:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0O(r6, r0, r7, r4)
            goto L_0x0024
        L_0x02cb:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0R(r6, r0, r7, r4)
            goto L_0x0024
        L_0x02d6:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0M(r6, r0, r7, r4)
            goto L_0x0024
        L_0x02e1:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0Q(r6, r0, r7, r4)
            goto L_0x0024
        L_0x02ec:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0P(r6, r0, r7, r4)
            goto L_0x0024
        L_0x02f7:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0K(r6, r0, r7, r4)
            goto L_0x0024
        L_0x0302:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0N(r6, r0, r7, r4)
            goto L_0x0024
        L_0x030d:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C203829ow.A0I(r6, r0, r7, r4)
            goto L_0x0024
        L_0x0318:
            r12 = r9[r8]
            java.util.List r13 = A0L(r1, r5)
            X.B3T r11 = r2.A0H(r8)
            java.lang.Class r0 = X.C203829ow.A03
            if (r13 == 0) goto L_0x0024
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0024
            r7 = r6
            X.A44 r7 = (X.A44) r7
            r1 = 0
        L_0x0330:
            int r0 = r13.size()
            if (r1 >= r0) goto L_0x0024
            java.lang.Object r0 = r13.get(r1)
            r7.ByZ(r11, r0, r12)
            int r1 = r1 + 1
            goto L_0x0330
        L_0x0340:
            java.lang.Object r0 = A0J(r5, r1)
            if (r0 == 0) goto L_0x0024
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x034c:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = A0J(r5, r1)
            double r0 = X.C90504aG.A01(r0)
            r6.ByE(r7, r0)
            goto L_0x0024
        L_0x035f:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = A0J(r5, r1)
            float r0 = X.C36441kJ.A03(r0)
            r6.ByF(r7, r0)
            goto L_0x0024
        L_0x0372:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            goto L_0x037f
        L_0x0379:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
        L_0x037f:
            r1 = r1 & r16
            long r0 = (long) r1
            long r0 = A0F(r5, r0)
            X.AnonymousClass95R.A09(r6, r7, r0)
            goto L_0x0024
        L_0x038b:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            goto L_0x0422
        L_0x0393:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            goto L_0x0453
        L_0x039b:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            java.lang.Object r0 = X.C203729od.A03(r5, r0)
            int r0 = X.AnonymousClass000.A0I(r0)
            X.AnonymousClass95R.A07(r6, r7, r0)
            goto L_0x0024
        L_0x03b1:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = A0J(r5, r1)
            boolean r0 = X.AnonymousClass000.A1X(r0)
            A0O(r6, r7, r0)
            goto L_0x0024
        L_0x03c4:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = A0J(r5, r1)
            A0M(r6, r0, r7)
            goto L_0x0024
        L_0x03d3:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = A0J(r5, r1)
            X.B3T r0 = r2.A0H(r8)
            r6.ByO(r0, r1, r7)
            goto L_0x0024
        L_0x03e6:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = A0J(r5, r1)
            X.AUw r1 = (X.C21673AUw) r1
            r0 = r6
            X.A44 r0 = (X.A44) r0
            X.8Dy r0 = r0.A00
            r0.A0B(r1, r7)
            goto L_0x0024
        L_0x03fc:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            java.lang.Object r0 = X.C203729od.A03(r5, r0)
            int r11 = X.AnonymousClass000.A0I(r0)
            r0 = r6
            X.A44 r0 = (X.A44) r0
            X.8Dy r1 = r0.A00
            int r0 = r7 << 3
            r1.A05(r0)
            r1.A05(r11)
            goto L_0x0024
        L_0x041c:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
        L_0x0422:
            r1 = r1 & r16
            long r0 = (long) r1
            java.lang.Object r0 = X.C203729od.A03(r5, r0)
            int r1 = X.AnonymousClass000.A0I(r0)
            r0 = r6
            X.A44 r0 = (X.A44) r0
            X.8Dy r0 = r0.A00
            r0.A07(r7, r1)
            goto L_0x0024
        L_0x0437:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            java.lang.Object r0 = X.C203729od.A03(r5, r0)
            int r0 = X.AnonymousClass000.A0I(r0)
            X.AnonymousClass95R.A07(r6, r7, r0)
            goto L_0x0024
        L_0x044d:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
        L_0x0453:
            r1 = r1 & r16
            long r0 = (long) r1
            long r0 = A0F(r5, r0)
            X.AnonymousClass95R.A08(r6, r7, r0)
            goto L_0x0024
        L_0x045f:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            java.lang.Object r0 = X.C203729od.A03(r5, r0)
            int r0 = X.AnonymousClass000.A0I(r0)
            A0N(r6, r0, r7)
            goto L_0x0024
        L_0x0475:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            long r12 = A0F(r5, r0)
            r0 = r6
            X.A44 r0 = (X.A44) r0
            X.8Dy r11 = r0.A00
            long r0 = X.C165567td.A05(r12)
            int r7 = r7 << 3
            r11.A05(r7)
            r11.A09(r0)
            goto L_0x0024
        L_0x0495:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = A0J(r5, r1)
            X.B3T r0 = r2.A0H(r8)
            r6.ByZ(r0, r1, r7)
            goto L_0x0024
        L_0x04a8:
            int[] r10 = r2.A02
            int r12 = r10.length
            sun.misc.Unsafe r9 = A0E
            r8 = 0
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r19 = 0
        L_0x04b3:
            if (r8 >= r12) goto L_0x08ed
            int r0 = r8 + 1
            r15 = r10[r0]
            r7 = r10[r8]
            r0 = r15 & r17
            int r13 = r0 >>> 20
            r0 = 17
            if (r13 > r0) goto L_0x08ea
            int r0 = r8 + 2
            r18 = r10[r0]
            r14 = r18 & r16
            if (r14 == r11) goto L_0x04d1
            long r0 = (long) r14
            int r19 = r9.getInt(r5, r0)
            r11 = r14
        L_0x04d1:
            int r0 = r18 >>> 20
            int r14 = r4 << r0
        L_0x04d5:
            r15 = r15 & r16
            long r0 = (long) r15
            switch(r13) {
                case 0: goto L_0x04de;
                case 1: goto L_0x04ec;
                case 2: goto L_0x04fa;
                case 3: goto L_0x0506;
                case 4: goto L_0x0512;
                case 5: goto L_0x0523;
                case 6: goto L_0x052f;
                case 7: goto L_0x053b;
                case 8: goto L_0x0549;
                case 9: goto L_0x0555;
                case 10: goto L_0x0566;
                case 11: goto L_0x057a;
                case 12: goto L_0x0591;
                case 13: goto L_0x05a3;
                case 14: goto L_0x05b0;
                case 15: goto L_0x05bd;
                case 16: goto L_0x05ca;
                case 17: goto L_0x05e5;
                case 18: goto L_0x05f6;
                case 19: goto L_0x05f9;
                case 20: goto L_0x05fc;
                case 21: goto L_0x05ff;
                case 22: goto L_0x0602;
                case 23: goto L_0x0605;
                case 24: goto L_0x0608;
                case 25: goto L_0x0615;
                case 26: goto L_0x0622;
                case 27: goto L_0x062f;
                case 28: goto L_0x0659;
                case 29: goto L_0x0666;
                case 30: goto L_0x0673;
                case 31: goto L_0x0680;
                case 32: goto L_0x068d;
                case 33: goto L_0x069a;
                case 34: goto L_0x06a7;
                case 35: goto L_0x06b4;
                case 36: goto L_0x06c2;
                case 37: goto L_0x06d0;
                case 38: goto L_0x06de;
                case 39: goto L_0x06ec;
                case 40: goto L_0x06fa;
                case 41: goto L_0x0708;
                case 42: goto L_0x0715;
                case 43: goto L_0x0722;
                case 44: goto L_0x072f;
                case 45: goto L_0x073c;
                case 46: goto L_0x0749;
                case 47: goto L_0x0756;
                case 48: goto L_0x0763;
                case 49: goto L_0x0770;
                case 50: goto L_0x079a;
                case 51: goto L_0x07a6;
                case 52: goto L_0x07b9;
                case 53: goto L_0x07cc;
                case 54: goto L_0x07d3;
                case 55: goto L_0x07e2;
                case 56: goto L_0x07ea;
                case 57: goto L_0x07f2;
                case 58: goto L_0x0805;
                case 59: goto L_0x0818;
                case 60: goto L_0x0827;
                case 61: goto L_0x083a;
                case 62: goto L_0x0850;
                case 63: goto L_0x086d;
                case 64: goto L_0x0885;
                case 65: goto L_0x0898;
                case 66: goto L_0x08a7;
                case 67: goto L_0x08ba;
                case 68: goto L_0x08d7;
                default: goto L_0x04db;
            }
        L_0x04db:
            int r8 = r8 + 3
            goto L_0x04b3
        L_0x04de:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            X.9Ye r13 = X.C203729od.A00
            double r0 = r13.A02(r5, r0)
            r6.ByE(r7, r0)
            goto L_0x04db
        L_0x04ec:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            X.9Ye r13 = X.C203729od.A00
            float r0 = r13.A03(r5, r0)
            r6.ByF(r7, r0)
            goto L_0x04db
        L_0x04fa:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            long r0 = r9.getLong(r5, r0)
            X.AnonymousClass95R.A09(r6, r7, r0)
            goto L_0x04db
        L_0x0506:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            long r0 = r9.getLong(r5, r0)
            X.AnonymousClass95R.A09(r6, r7, r0)
            goto L_0x04db
        L_0x0512:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            int r1 = r9.getInt(r5, r0)
            r0 = r6
            X.A44 r0 = (X.A44) r0
            X.8Dy r0 = r0.A00
            r0.A07(r7, r1)
            goto L_0x04db
        L_0x0523:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            long r0 = r9.getLong(r5, r0)
            X.AnonymousClass95R.A08(r6, r7, r0)
            goto L_0x04db
        L_0x052f:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            int r0 = r9.getInt(r5, r0)
            X.AnonymousClass95R.A07(r6, r7, r0)
            goto L_0x04db
        L_0x053b:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            X.9Ye r13 = X.C203729od.A00
            boolean r0 = r13.A0C(r5, r0)
            A0O(r6, r7, r0)
            goto L_0x04db
        L_0x0549:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            java.lang.Object r0 = r9.getObject(r5, r0)
            A0M(r6, r0, r7)
            goto L_0x04db
        L_0x0555:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            java.lang.Object r1 = r9.getObject(r5, r0)
            X.B3T r0 = r2.A0H(r8)
            r6.ByO(r0, r1, r7)
            goto L_0x04db
        L_0x0566:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            java.lang.Object r1 = r9.getObject(r5, r0)
            X.AUw r1 = (X.C21673AUw) r1
            r0 = r6
            X.A44 r0 = (X.A44) r0
            X.8Dy r0 = r0.A00
            r0.A0B(r1, r7)
            goto L_0x04db
        L_0x057a:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            int r13 = r9.getInt(r5, r0)
            r0 = r6
            X.A44 r0 = (X.A44) r0
            X.8Dy r1 = r0.A00
            int r0 = r7 << 3
            r1.A05(r0)
            r1.A05(r13)
            goto L_0x04db
        L_0x0591:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            int r1 = r9.getInt(r5, r0)
            r0 = r6
            X.A44 r0 = (X.A44) r0
            X.8Dy r0 = r0.A00
            r0.A07(r7, r1)
            goto L_0x04db
        L_0x05a3:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            int r0 = r9.getInt(r5, r0)
            X.AnonymousClass95R.A07(r6, r7, r0)
            goto L_0x04db
        L_0x05b0:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            long r0 = r9.getLong(r5, r0)
            X.AnonymousClass95R.A08(r6, r7, r0)
            goto L_0x04db
        L_0x05bd:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            int r0 = r9.getInt(r5, r0)
            A0N(r6, r0, r7)
            goto L_0x04db
        L_0x05ca:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            long r14 = r9.getLong(r5, r0)
            r0 = r6
            X.A44 r0 = (X.A44) r0
            X.8Dy r13 = r0.A00
            long r0 = X.C165567td.A05(r14)
            int r7 = r7 << 3
            r13.A05(r7)
            r13.A09(r0)
            goto L_0x04db
        L_0x05e5:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            java.lang.Object r1 = r9.getObject(r5, r0)
            X.B3T r0 = r2.A0H(r8)
            r6.ByZ(r0, r1, r7)
            goto L_0x04db
        L_0x05f6:
            r13 = 0
            goto L_0x06b5
        L_0x05f9:
            r13 = 0
            goto L_0x06c3
        L_0x05fc:
            r13 = 0
            goto L_0x06d1
        L_0x05ff:
            r13 = 0
            goto L_0x06df
        L_0x0602:
            r13 = 0
            goto L_0x06ed
        L_0x0605:
            r13 = 0
            goto L_0x06fb
        L_0x0608:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203829ow.A0O(r6, r0, r7, r3)
            goto L_0x04db
        L_0x0615:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203829ow.A0R(r6, r0, r7, r3)
            goto L_0x04db
        L_0x0622:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203829ow.A0C(r6, r0, r7)
            goto L_0x04db
        L_0x062f:
            r13 = r10[r8]
            java.lang.Object r15 = r9.getObject(r5, r0)
            java.util.List r15 = (java.util.List) r15
            X.B3T r14 = r2.A0H(r8)
            java.lang.Class r0 = X.C203829ow.A03
            if (r15 == 0) goto L_0x04db
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x04db
            r7 = r6
            X.A44 r7 = (X.A44) r7
            r1 = 0
        L_0x0649:
            int r0 = r15.size()
            if (r1 >= r0) goto L_0x04db
            java.lang.Object r0 = r15.get(r1)
            r7.ByO(r14, r0, r13)
            int r1 = r1 + 1
            goto L_0x0649
        L_0x0659:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203829ow.A0D(r6, r0, r7)
            goto L_0x04db
        L_0x0666:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203829ow.A0M(r6, r0, r7, r3)
            goto L_0x04db
        L_0x0673:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203829ow.A0Q(r6, r0, r7, r3)
            goto L_0x04db
        L_0x0680:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203829ow.A0P(r6, r0, r7, r3)
            goto L_0x04db
        L_0x068d:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203829ow.A0K(r6, r0, r7, r3)
            goto L_0x04db
        L_0x069a:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203829ow.A0N(r6, r0, r7, r3)
            goto L_0x04db
        L_0x06a7:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203829ow.A0I(r6, r0, r7, r3)
            goto L_0x04db
        L_0x06b4:
            r13 = 1
        L_0x06b5:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203829ow.A0E(r6, r0, r7, r13)
            goto L_0x04db
        L_0x06c2:
            r13 = 1
        L_0x06c3:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203829ow.A0F(r6, r0, r7, r13)
            goto L_0x04db
        L_0x06d0:
            r13 = 1
        L_0x06d1:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203829ow.A0G(r6, r0, r7, r13)
            goto L_0x04db
        L_0x06de:
            r13 = 1
        L_0x06df:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203829ow.A0H(r6, r0, r7, r13)
            goto L_0x04db
        L_0x06ec:
            r13 = 1
        L_0x06ed:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203829ow.A0L(r6, r0, r7, r13)
            goto L_0x04db
        L_0x06fa:
            r13 = 1
        L_0x06fb:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203829ow.A0J(r6, r0, r7, r13)
            goto L_0x04db
        L_0x0708:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203829ow.A0O(r6, r0, r7, r4)
            goto L_0x04db
        L_0x0715:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203829ow.A0R(r6, r0, r7, r4)
            goto L_0x04db
        L_0x0722:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203829ow.A0M(r6, r0, r7, r4)
            goto L_0x04db
        L_0x072f:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203829ow.A0Q(r6, r0, r7, r4)
            goto L_0x04db
        L_0x073c:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203829ow.A0P(r6, r0, r7, r4)
            goto L_0x04db
        L_0x0749:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203829ow.A0K(r6, r0, r7, r4)
            goto L_0x04db
        L_0x0756:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203829ow.A0N(r6, r0, r7, r4)
            goto L_0x04db
        L_0x0763:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203829ow.A0I(r6, r0, r7, r4)
            goto L_0x04db
        L_0x0770:
            r13 = r10[r8]
            java.lang.Object r15 = r9.getObject(r5, r0)
            java.util.List r15 = (java.util.List) r15
            X.B3T r14 = r2.A0H(r8)
            java.lang.Class r0 = X.C203829ow.A03
            if (r15 == 0) goto L_0x04db
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x04db
            r7 = r6
            X.A44 r7 = (X.A44) r7
            r1 = 0
        L_0x078a:
            int r0 = r15.size()
            if (r1 >= r0) goto L_0x04db
            java.lang.Object r0 = r15.get(r1)
            r7.ByZ(r14, r0, r13)
            int r1 = r1 + 1
            goto L_0x078a
        L_0x079a:
            java.lang.Object r0 = r9.getObject(r5, r0)
            if (r0 == 0) goto L_0x04db
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x07a6:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            java.lang.Object r0 = X.C203729od.A03(r5, r0)
            double r0 = X.C90504aG.A01(r0)
            r6.ByE(r7, r0)
            goto L_0x04db
        L_0x07b9:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            java.lang.Object r0 = X.C203729od.A03(r5, r0)
            float r0 = X.C36441kJ.A03(r0)
            r6.ByF(r7, r0)
            goto L_0x04db
        L_0x07cc:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            goto L_0x07d9
        L_0x07d3:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
        L_0x07d9:
            long r0 = A0F(r5, r0)
            X.AnonymousClass95R.A09(r6, r7, r0)
            goto L_0x04db
        L_0x07e2:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            goto L_0x0873
        L_0x07ea:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            goto L_0x089e
        L_0x07f2:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            java.lang.Object r0 = X.C203729od.A03(r5, r0)
            int r0 = X.AnonymousClass000.A0I(r0)
            X.AnonymousClass95R.A07(r6, r7, r0)
            goto L_0x04db
        L_0x0805:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            java.lang.Object r0 = X.C203729od.A03(r5, r0)
            boolean r0 = X.AnonymousClass000.A1X(r0)
            A0O(r6, r7, r0)
            goto L_0x04db
        L_0x0818:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            java.lang.Object r0 = r9.getObject(r5, r0)
            A0M(r6, r0, r7)
            goto L_0x04db
        L_0x0827:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            java.lang.Object r1 = r9.getObject(r5, r0)
            X.B3T r0 = r2.A0H(r8)
            r6.ByO(r0, r1, r7)
            goto L_0x04db
        L_0x083a:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            java.lang.Object r1 = r9.getObject(r5, r0)
            X.AUw r1 = (X.C21673AUw) r1
            r0 = r6
            X.A44 r0 = (X.A44) r0
            X.8Dy r0 = r0.A00
            r0.A0B(r1, r7)
            goto L_0x04db
        L_0x0850:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            java.lang.Object r0 = X.C203729od.A03(r5, r0)
            int r13 = X.AnonymousClass000.A0I(r0)
            r0 = r6
            X.A44 r0 = (X.A44) r0
            X.8Dy r1 = r0.A00
            int r0 = r7 << 3
            r1.A05(r0)
            r1.A05(r13)
            goto L_0x04db
        L_0x086d:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
        L_0x0873:
            java.lang.Object r0 = X.C203729od.A03(r5, r0)
            int r1 = X.AnonymousClass000.A0I(r0)
            r0 = r6
            X.A44 r0 = (X.A44) r0
            X.8Dy r0 = r0.A00
            r0.A07(r7, r1)
            goto L_0x04db
        L_0x0885:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            java.lang.Object r0 = X.C203729od.A03(r5, r0)
            int r0 = X.AnonymousClass000.A0I(r0)
            X.AnonymousClass95R.A07(r6, r7, r0)
            goto L_0x04db
        L_0x0898:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
        L_0x089e:
            long r0 = A0F(r5, r0)
            X.AnonymousClass95R.A08(r6, r7, r0)
            goto L_0x04db
        L_0x08a7:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            java.lang.Object r0 = X.C203729od.A03(r5, r0)
            int r0 = X.AnonymousClass000.A0I(r0)
            A0N(r6, r0, r7)
            goto L_0x04db
        L_0x08ba:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            long r14 = A0F(r5, r0)
            r0 = r6
            X.A44 r0 = (X.A44) r0
            X.8Dy r13 = r0.A00
            long r0 = X.C165567td.A05(r14)
            int r7 = r7 << 3
            r13.A05(r7)
            r13.A09(r0)
            goto L_0x04db
        L_0x08d7:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            java.lang.Object r1 = r9.getObject(r5, r0)
            X.B3T r0 = r2.A0H(r8)
            r6.ByZ(r0, r1, r7)
            goto L_0x04db
        L_0x08ea:
            r14 = 0
            goto L_0x04d5
        L_0x08ed:
            X.8EX r5 = (X.AnonymousClass8EX) r5
            X.9jt r0 = r5.zzb
            r0.A02(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A42.ByK(X.B3O, java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e8, code lost:
        r10.putInt(r8, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011d, code lost:
        r0 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x011f, code lost:
        r10.putObject(r8, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x015d, code lost:
        r10.putLong(r8, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0173, code lost:
        r7 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x018a, code lost:
        r7 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018c, code lost:
        r19 = r19 | r16;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ByL(X.C197899cY r38, java.lang.Object r39, byte[] r40, int r41, int r42) {
        /*
            r37 = this;
            r7 = r41
            r35 = r37
            r0 = r35
            boolean r0 = r0.A0C
            r6 = r38
            r8 = r39
            r5 = r40
            r36 = r42
            if (r0 == 0) goto L_0x0244
            sun.misc.Unsafe r10 = A0E
            r3 = -1
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = -1
            r9 = 0
            r19 = 0
            r18 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001f:
            r0 = r36
            if (r7 >= r0) goto L_0x022e
            int r4 = r7 + 1
            byte r12 = r40[r7]
            if (r12 >= 0) goto L_0x002f
            int r4 = A0C(r6, r5, r12, r4)
            int r12 = r6.A00
        L_0x002f:
            int r17 = r12 >>> 3
            r7 = r12 & 7
            r0 = r17
            if (r0 <= r2) goto L_0x0068
            int r2 = r9 / 3
            r0 = r35
            int r9 = r0.A00
            r0 = r17
            if (r0 < r9) goto L_0x022b
            r0 = r35
            int r9 = r0.A01
            r0 = r17
            if (r0 > r9) goto L_0x022b
            r0 = r35
            int[] r14 = r0.A02
            int r0 = r14.length
            int r0 = r0 / 3
            int r13 = r0 + -1
        L_0x0052:
            if (r2 > r13) goto L_0x022b
            int r0 = r13 + r2
            int r15 = r0 >>> 1
            int r9 = r15 * 3
            r11 = r14[r9]
            r0 = r17
            if (r0 == r11) goto L_0x006e
            if (r0 >= r11) goto L_0x0065
            int r13 = r15 + -1
            goto L_0x0052
        L_0x0065:
            int r2 = r15 + 1
            goto L_0x0052
        L_0x0068:
            r2 = r35
            int r9 = r2.A00(r0)
        L_0x006e:
            if (r9 == r3) goto L_0x022b
            r0 = r35
            int[] r0 = r0.A02
            r11 = r0
            int r0 = r9 + 1
            r13 = r11[r0]
            int r14 = X.C165587tf.A02(r13)
            r0 = r13 & r1
            long r2 = (long) r0
            r0 = 17
            if (r14 > r0) goto L_0x0190
            int r0 = r9 + 2
            r11 = r11[r0]
            int r0 = r11 >>> 20
            r16 = 1
            int r16 = r16 << r0
            r11 = r11 & r1
            r0 = r18
            if (r11 == r0) goto L_0x00a7
            if (r0 == r1) goto L_0x009b
            long r0 = (long) r0
            r15 = r19
            r10.putInt(r8, r0, r15)
        L_0x009b:
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r11 == r0) goto L_0x00a5
            long r0 = (long) r11
            int r19 = r10.getInt(r8, r0)
        L_0x00a5:
            r18 = r11
        L_0x00a7:
            r0 = 5
            switch(r14) {
                case 0: goto L_0x0176;
                case 1: goto L_0x0164;
                case 2: goto L_0x0155;
                case 3: goto L_0x0155;
                case 4: goto L_0x00e0;
                case 5: goto L_0x0148;
                case 6: goto L_0x013e;
                case 7: goto L_0x0128;
                case 8: goto L_0x0111;
                case 9: goto L_0x00f5;
                case 10: goto L_0x00ed;
                case 11: goto L_0x00e0;
                case 12: goto L_0x00e0;
                case 13: goto L_0x013e;
                case 14: goto L_0x0148;
                case 15: goto L_0x00d3;
                case 16: goto L_0x00c5;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            X.9jt r21 = A0I(r8)
            r20 = r6
            r22 = r5
            r23 = r12
            r24 = r4
            r25 = r36
            int r7 = A04(r20, r21, r22, r23, r24, r25)
        L_0x00bd:
            r2 = r17
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r3 = -1
            goto L_0x001f
        L_0x00c5:
            if (r7 != 0) goto L_0x00ab
            int r7 = A08(r6, r5, r4)
            long r0 = r6.A01
            long r0 = X.C165567td.A06(r0)
            goto L_0x015d
        L_0x00d3:
            if (r7 != 0) goto L_0x00ab
            int r7 = A07(r6, r5, r4)
            int r0 = r6.A00
            int r0 = X.C165597tg.A02(r0)
            goto L_0x00e8
        L_0x00e0:
            if (r7 != 0) goto L_0x00ab
            int r7 = A07(r6, r5, r4)
            int r0 = r6.A00
        L_0x00e8:
            r10.putInt(r8, r2, r0)
            goto L_0x018c
        L_0x00ed:
            r0 = 2
            if (r7 != r0) goto L_0x00ab
            int r7 = A0B(r6, r5, r4)
            goto L_0x011d
        L_0x00f5:
            r0 = 2
            if (r7 != r0) goto L_0x00ab
            r0 = r35
            X.B3T r1 = r0.A0H(r9)
            r0 = r36
            int r7 = A02(r6, r1, r5, r4, r0)
            java.lang.Object r1 = r10.getObject(r8, r2)
            if (r1 == 0) goto L_0x011d
            java.lang.Object r0 = r6.A02
            X.8EX r0 = X.C197089b7.A00(r1, r0)
            goto L_0x011f
        L_0x0111:
            r0 = 2
            if (r7 != r0) goto L_0x00ab
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r13 = r13 & r0
            if (r13 != 0) goto L_0x0123
            int r7 = A09(r6, r5, r4)
        L_0x011d:
            java.lang.Object r0 = r6.A02
        L_0x011f:
            r10.putObject(r8, r2, r0)
            goto L_0x018c
        L_0x0123:
            int r7 = A0A(r6, r5, r4)
            goto L_0x011d
        L_0x0128:
            if (r7 != 0) goto L_0x00ab
            int r7 = A08(r6, r5, r4)
            long r0 = r6.A01
            r11 = 0
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r4)
            X.9Ye r0 = X.C203729od.A00
            r0.A0B(r8, r2, r1)
            goto L_0x018c
        L_0x013e:
            if (r7 != r0) goto L_0x00ab
            int r0 = X.C165567td.A04(r5, r4)
            r10.putInt(r8, r2, r0)
            goto L_0x0173
        L_0x0148:
            r0 = 1
            if (r7 != r0) goto L_0x00ab
            long r14 = X.C165567td.A0A(r5, r4)
            r11 = r8
            r12 = r2
            r10.putLong(r11, r12, r14)
            goto L_0x018a
        L_0x0155:
            if (r7 != 0) goto L_0x00ab
            int r7 = A08(r6, r5, r4)
            long r0 = r6.A01
        L_0x015d:
            r11 = r8
            r12 = r2
            r14 = r0
            r10.putLong(r11, r12, r14)
            goto L_0x018c
        L_0x0164:
            if (r7 != r0) goto L_0x00ab
            int r0 = X.C165567td.A04(r5, r4)
            float r1 = java.lang.Float.intBitsToFloat(r0)
            X.9Ye r0 = X.C203729od.A00
            r0.A08(r8, r2, r1)
        L_0x0173:
            int r7 = r4 + 4
            goto L_0x018c
        L_0x0176:
            r0 = 1
            if (r7 != r0) goto L_0x00ab
            long r0 = X.C165567td.A0A(r5, r4)
            double r24 = java.lang.Double.longBitsToDouble(r0)
            X.9Ye r20 = X.C203729od.A00
            r21 = r8
            r22 = r2
            r20.A07(r21, r22, r24)
        L_0x018a:
            int r7 = r4 + 8
        L_0x018c:
            r19 = r19 | r16
            goto L_0x00bd
        L_0x0190:
            r0 = 27
            if (r14 != r0) goto L_0x01d3
            r0 = 2
            if (r7 != r0) goto L_0x00ab
            java.lang.Object r1 = r10.getObject(r8, r2)
            X.B6b r1 = (X.C23121B6b) r1
            r0 = r1
            X.AcA r0 = (X.C21884AcA) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x01af
            int r0 = X.C165597tg.A07(r1)
            X.B6b r1 = r1.ByB(r0)
            r10.putObject(r8, r2, r1)
        L_0x01af:
            r0 = r35
            X.B3T r3 = r0.A0H(r9)
            r0 = r36
            int r7 = A02(r6, r3, r5, r4, r0)
        L_0x01bb:
            java.lang.Object r0 = r6.A02
            r1.add(r0)
            r0 = r36
            if (r7 >= r0) goto L_0x00bd
            int r2 = A07(r6, r5, r7)
            int r0 = r6.A00
            if (r12 != r0) goto L_0x00bd
            r0 = r36
            int r7 = A02(r6, r3, r5, r2, r0)
            goto L_0x01bb
        L_0x01d3:
            r0 = 49
            if (r14 > r0) goto L_0x01fb
            long r0 = (long) r13
            r27 = r17
            r28 = r7
            r29 = r9
            r30 = r14
            r31 = r0
            r33 = r2
            r21 = r6
            r22 = r8
            r23 = r5
            r24 = r4
            r25 = r36
            r26 = r12
            r20 = r35
            int r7 = r20.A06(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33)
        L_0x01f6:
            if (r7 != r4) goto L_0x00bd
            r4 = r7
            goto L_0x00ab
        L_0x01fb:
            r0 = 50
            if (r14 != r0) goto L_0x020c
            r0 = 2
            if (r7 != r0) goto L_0x00ab
            r10.getObject(r8, r2)
            java.lang.String r0 = "zzd"
            java.lang.NullPointerException r1 = X.AnonymousClass001.A0A(r0)
            throw r1
        L_0x020c:
            r27 = r17
            r28 = r7
            r29 = r13
            r30 = r14
            r31 = r9
            r32 = r2
            r21 = r6
            r22 = r8
            r23 = r5
            r24 = r4
            r25 = r36
            r26 = r12
            r20 = r35
            int r7 = r20.A05(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x01f6
        L_0x022b:
            r9 = 0
            goto L_0x00ab
        L_0x022e:
            r0 = r18
            if (r0 == r1) goto L_0x0238
            long r1 = (long) r0
            r0 = r19
            r10.putInt(r8, r1, r0)
        L_0x0238:
            r0 = r36
            if (r7 == r0) goto L_0x0250
            java.lang.String r0 = "Failed to parse the message."
            X.8xe r1 = new X.8xe
            r1.<init>(r0)
            throw r1
        L_0x0244:
            r15 = 0
            r9 = r35
            r10 = r6
            r11 = r8
            r12 = r5
            r13 = r7
            r14 = r36
            r9.A0R(r10, r11, r12, r13, r14, r15)
        L_0x0250:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A42.ByL(X.9cY, java.lang.Object, byte[], int, int):void");
    }

    public final void Byd(Object obj) {
        Object unmodifiableList;
        C21884AcA acA;
        int i = this.A04;
        while (true) {
            int i2 = this.A05;
            if (i < i2) {
                if (C203729od.A03(obj, C165577te.A0G(this.A02, this.A0D[i])) != null) {
                    throw AnonymousClass001.A0A("zzc");
                }
                i++;
            } else {
                int[] iArr = this.A0D;
                int length = iArr.length;
                while (i2 < length) {
                    C199249ey r3 = this.A07;
                    long j = (long) iArr[i2];
                    if (r3 instanceof AnonymousClass8EZ) {
                        acA = (C21884AcA) ((C23121B6b) C203729od.A03(obj, j));
                    } else {
                        List A0d = C165617ti.A0d(obj, j);
                        if (A0d instanceof B6X) {
                            unmodifiableList = ((B6X) A0d).Bym();
                        } else {
                            if (!C165587tf.A1b(C170588Ea.A00, A0d)) {
                                if (!(A0d instanceof C16030oR) || !(A0d instanceof C23121B6b)) {
                                    unmodifiableList = Collections.unmodifiableList(A0d);
                                } else {
                                    acA = (C21884AcA) ((C23121B6b) A0d);
                                    if (!acA.A00) {
                                    }
                                }
                            }
                            i2++;
                        }
                        C203729od.A09(obj, j, unmodifiableList);
                        i2++;
                    }
                    acA.A00 = false;
                    i2++;
                }
                ((AnonymousClass8EX) obj).zzb.A02 = false;
                return;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d8, code lost:
        r0 = X.C197089b7.A00;
        r0 = X.C36341k9.A01(r1 ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e5, code lost:
        r6 = r6 * 53;
        r0 = ((java.lang.String) X.C203729od.A03(r10, r1)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        r3 = r3 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0122, code lost:
        r6 = r6 * 53;
        r0 = X.AnonymousClass000.A0I(X.C203729od.A03(r10, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0133, code lost:
        r6 = r6 * 53;
        r1 = A0F(r10, r1);
        r0 = X.C197089b7.A00;
        r0 = X.AnonymousClass000.A08(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0146, code lost:
        r6 = r6 * 53;
        r0 = X.C203729od.A03(r10, r1).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0150, code lost:
        r6 = r6 + r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(java.lang.Object r10) {
        /*
            r9 = this;
            int[] r5 = r9.A02
            int r4 = r5.length
            r3 = 0
            r6 = 0
        L_0x0005:
            if (r3 >= r4) goto L_0x0153
            int r0 = r3 + 1
            r7 = r5[r0]
            r8 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r7
            long r1 = (long) r0
            int r0 = X.C165587tf.A02(r7)
            r7 = 37
            switch(r0) {
                case 0: goto L_0x001e;
                case 1: goto L_0x0032;
                case 2: goto L_0x0040;
                case 3: goto L_0x0040;
                case 4: goto L_0x0050;
                case 5: goto L_0x0040;
                case 6: goto L_0x0050;
                case 7: goto L_0x005a;
                case 8: goto L_0x00e5;
                case 9: goto L_0x0063;
                case 10: goto L_0x0146;
                case 11: goto L_0x0050;
                case 12: goto L_0x0050;
                case 13: goto L_0x0050;
                case 14: goto L_0x0040;
                case 15: goto L_0x0050;
                case 16: goto L_0x0040;
                case 17: goto L_0x0063;
                case 18: goto L_0x0146;
                case 19: goto L_0x0146;
                case 20: goto L_0x0146;
                case 21: goto L_0x0146;
                case 22: goto L_0x0146;
                case 23: goto L_0x0146;
                case 24: goto L_0x0146;
                case 25: goto L_0x0146;
                case 26: goto L_0x0146;
                case 27: goto L_0x0146;
                case 28: goto L_0x0146;
                case 29: goto L_0x0146;
                case 30: goto L_0x0146;
                case 31: goto L_0x0146;
                case 32: goto L_0x0146;
                case 33: goto L_0x0146;
                case 34: goto L_0x0146;
                case 35: goto L_0x0146;
                case 36: goto L_0x0146;
                case 37: goto L_0x0146;
                case 38: goto L_0x0146;
                case 39: goto L_0x0146;
                case 40: goto L_0x0146;
                case 41: goto L_0x0146;
                case 42: goto L_0x0146;
                case 43: goto L_0x0146;
                case 44: goto L_0x0146;
                case 45: goto L_0x0146;
                case 46: goto L_0x0146;
                case 47: goto L_0x0146;
                case 48: goto L_0x0146;
                case 49: goto L_0x0146;
                case 50: goto L_0x0146;
                case 51: goto L_0x0071;
                case 52: goto L_0x008d;
                case 53: goto L_0x00a3;
                case 54: goto L_0x00ab;
                case 55: goto L_0x00b3;
                case 56: goto L_0x00ba;
                case 57: goto L_0x00c1;
                case 58: goto L_0x00c8;
                case 59: goto L_0x00df;
                case 60: goto L_0x00f2;
                case 61: goto L_0x00f9;
                case 62: goto L_0x0100;
                case 63: goto L_0x0107;
                case 64: goto L_0x010e;
                case 65: goto L_0x0115;
                case 66: goto L_0x011c;
                case 67: goto L_0x012d;
                case 68: goto L_0x0140;
                default: goto L_0x001b;
            }
        L_0x001b:
            int r3 = r3 + 3
            goto L_0x0005
        L_0x001e:
            int r6 = r6 * 53
            X.9Ye r0 = X.C203729od.A00
            double r0 = r0.A02(r10, r1)
            long r1 = java.lang.Double.doubleToLongBits(r0)
            java.nio.charset.Charset r0 = X.C197089b7.A00
            int r0 = X.AnonymousClass000.A08(r1)
            goto L_0x0150
        L_0x0032:
            int r6 = r6 * 53
            X.9Ye r0 = X.C203729od.A00
            float r0 = r0.A03(r10, r1)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x0150
        L_0x0040:
            int r6 = r6 * 53
            X.9Ye r0 = X.C203729od.A00
            long r1 = r0.A05(r10, r1)
            java.nio.charset.Charset r0 = X.C197089b7.A00
            int r0 = X.AnonymousClass000.A08(r1)
            goto L_0x0150
        L_0x0050:
            int r6 = r6 * 53
            X.9Ye r0 = X.C203729od.A00
            int r0 = r0.A04(r10, r1)
            goto L_0x0150
        L_0x005a:
            int r6 = r6 * 53
            X.9Ye r0 = X.C203729od.A00
            boolean r1 = r0.A0C(r10, r1)
            goto L_0x00d8
        L_0x0063:
            java.lang.Object r0 = X.C203729od.A03(r10, r1)
            if (r0 == 0) goto L_0x006d
            int r7 = r0.hashCode()
        L_0x006d:
            int r6 = r6 * 53
            int r6 = r6 + r7
            goto L_0x001b
        L_0x0071:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            int r6 = r6 * 53
            java.lang.Object r0 = X.C203729od.A03(r10, r1)
            double r0 = X.C90504aG.A01(r0)
            long r1 = java.lang.Double.doubleToLongBits(r0)
            java.nio.charset.Charset r0 = X.C197089b7.A00
            int r0 = X.AnonymousClass000.A08(r1)
            goto L_0x0150
        L_0x008d:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            int r6 = r6 * 53
            java.lang.Object r0 = X.C203729od.A03(r10, r1)
            float r0 = X.C36441kJ.A03(r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x0150
        L_0x00a3:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0133
        L_0x00ab:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0133
        L_0x00b3:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0122
        L_0x00ba:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0133
        L_0x00c1:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0122
        L_0x00c8:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            int r6 = r6 * 53
            java.lang.Object r0 = X.C203729od.A03(r10, r1)
            boolean r1 = X.AnonymousClass000.A1X(r0)
        L_0x00d8:
            java.nio.charset.Charset r0 = X.C197089b7.A00
            int r0 = X.C36341k9.A01(r1)
            goto L_0x0150
        L_0x00df:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x00e5:
            int r6 = r6 * 53
            java.lang.Object r0 = X.C203729od.A03(r10, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.hashCode()
            goto L_0x0150
        L_0x00f2:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0146
        L_0x00f9:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0146
        L_0x0100:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0122
        L_0x0107:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0122
        L_0x010e:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0122
        L_0x0115:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0133
        L_0x011c:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x0122:
            int r6 = r6 * 53
            java.lang.Object r0 = X.C203729od.A03(r10, r1)
            int r0 = X.AnonymousClass000.A0I(r0)
            goto L_0x0150
        L_0x012d:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x0133:
            int r6 = r6 * 53
            long r1 = A0F(r10, r1)
            java.nio.charset.Charset r0 = X.C197089b7.A00
            int r0 = X.AnonymousClass000.A08(r1)
            goto L_0x0150
        L_0x0140:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x0146:
            int r6 = r6 * 53
            java.lang.Object r0 = X.C203729od.A03(r10, r1)
            int r0 = r0.hashCode()
        L_0x0150:
            int r6 = r6 + r0
            goto L_0x001b
        L_0x0153:
            int r1 = r6 * 53
            X.8EX r10 = (X.AnonymousClass8EX) r10
            X.9jt r0 = r10.zzb
            int r0 = X.C36401kF.A02(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A42.zza(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02dd, code lost:
        r12 = (r12 + r0) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x030a, code lost:
        r12 = X.AnonymousClass95R.A04(r9) + X.C170568Dy.A02(A0F(r7, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x032b, code lost:
        if (r1 >= 0) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03cc, code lost:
        if (r1 >= 0) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03ce, code lost:
        r0 = X.C170568Dy.A05;
        r0 = X.C165567td.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03d4, code lost:
        r12 = r12 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03d7, code lost:
        r0 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0560, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
        if (r1 >= 0) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0692, code lost:
        if (r1 >= 0) goto L_0x0a8b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0837, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x099a, code lost:
        r1 = (r1 + r0) + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x09c7, code lost:
        r13 = X.AnonymousClass95R.A04(r8) + X.C170568Dy.A02(A0F(r7, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x09e8, code lost:
        if (r1 >= 0) goto L_0x0a8b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0a89, code lost:
        if (r1 >= 0) goto L_0x0a8b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0a8b, code lost:
        r0 = X.C170568Dy.A05;
        r0 = X.C165567td.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0a91, code lost:
        r13 = r13 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0a93, code lost:
        r0 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0aa2, code lost:
        r15 = r15 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0126, code lost:
        if (r1 >= 0) goto L_0x03ce;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(java.lang.Object r18) {
        /*
            r17 = this;
            r7 = r18
            r6 = r17
            boolean r0 = r6.A0C
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r11 = 1
            r5 = 0
            sun.misc.Unsafe r4 = A0E
            if (r0 == 0) goto L_0x0585
            r10 = 0
            r15 = 0
        L_0x0013:
            int[] r2 = r6.A02
            int r0 = r2.length
            if (r10 >= r0) goto L_0x0b0e
            int r0 = r10 + 1
            r1 = r2[r0]
            r0 = r1 & r3
            int r3 = r0 >>> 20
            r9 = r2[r10]
            r1 = r1 & r16
            long r0 = (long) r1
            X.8yF[] r2 = X.C187638yF.A00
            switch(r3) {
                case 0: goto L_0x002f;
                case 1: goto L_0x003d;
                case 2: goto L_0x004b;
                case 3: goto L_0x0062;
                case 4: goto L_0x0079;
                case 5: goto L_0x008d;
                case 6: goto L_0x009b;
                case 7: goto L_0x00a9;
                case 8: goto L_0x00b7;
                case 9: goto L_0x00c7;
                case 10: goto L_0x00eb;
                case 11: goto L_0x00fd;
                case 12: goto L_0x0116;
                case 13: goto L_0x012a;
                case 14: goto L_0x0138;
                case 15: goto L_0x0146;
                case 16: goto L_0x015c;
                case 17: goto L_0x0177;
                case 18: goto L_0x0446;
                case 19: goto L_0x0450;
                case 20: goto L_0x045a;
                case 21: goto L_0x0474;
                case 22: goto L_0x048a;
                case 23: goto L_0x04a0;
                case 24: goto L_0x04aa;
                case 25: goto L_0x04b4;
                case 26: goto L_0x04c7;
                case 27: goto L_0x04d0;
                case 28: goto L_0x04dd;
                case 29: goto L_0x04e6;
                case 30: goto L_0x04fb;
                case 31: goto L_0x0510;
                case 32: goto L_0x0519;
                case 33: goto L_0x0522;
                case 34: goto L_0x0537;
                case 35: goto L_0x0196;
                case 36: goto L_0x01ae;
                case 37: goto L_0x01c6;
                case 38: goto L_0x01de;
                case 39: goto L_0x01f6;
                case 40: goto L_0x020e;
                case 41: goto L_0x0226;
                case 42: goto L_0x023e;
                case 43: goto L_0x0254;
                case 44: goto L_0x026b;
                case 45: goto L_0x0282;
                case 46: goto L_0x0299;
                case 47: goto L_0x02b0;
                case 48: goto L_0x02c7;
                case 49: goto L_0x054e;
                case 50: goto L_0x057b;
                case 51: goto L_0x02e1;
                case 52: goto L_0x02ef;
                case 53: goto L_0x02fd;
                case 54: goto L_0x0304;
                case 55: goto L_0x0319;
                case 56: goto L_0x032f;
                case 57: goto L_0x033d;
                case 58: goto L_0x034b;
                case 59: goto L_0x0359;
                case 60: goto L_0x0369;
                case 61: goto L_0x038d;
                case 62: goto L_0x039f;
                case 63: goto L_0x03ba;
                case 64: goto L_0x03da;
                case 65: goto L_0x03e8;
                case 66: goto L_0x03f6;
                case 67: goto L_0x040e;
                case 68: goto L_0x0427;
                default: goto L_0x002a;
            }
        L_0x002a:
            int r10 = r10 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0013
        L_0x002f:
            boolean r0 = r6.A0P(r7, r10)
            if (r0 == 0) goto L_0x002a
            int r0 = X.AnonymousClass95R.A04(r9)
            int r12 = r0 + 8
            goto L_0x054b
        L_0x003d:
            boolean r0 = r6.A0P(r7, r10)
            if (r0 == 0) goto L_0x002a
            int r0 = X.AnonymousClass95R.A04(r9)
            int r12 = r0 + 4
            goto L_0x054b
        L_0x004b:
            boolean r2 = r6.A0P(r7, r10)
            if (r2 == 0) goto L_0x002a
            X.9Ye r2 = X.C203729od.A00
            long r0 = r2.A05(r7, r0)
            int r12 = X.AnonymousClass95R.A04(r9)
            int r0 = X.C170568Dy.A02(r0)
            int r12 = r12 + r0
            goto L_0x054b
        L_0x0062:
            boolean r2 = r6.A0P(r7, r10)
            if (r2 == 0) goto L_0x002a
            X.9Ye r2 = X.C203729od.A00
            long r0 = r2.A05(r7, r0)
            int r12 = X.AnonymousClass95R.A04(r9)
            int r0 = X.C170568Dy.A02(r0)
            int r12 = r12 + r0
            goto L_0x054b
        L_0x0079:
            boolean r2 = r6.A0P(r7, r10)
            if (r2 == 0) goto L_0x002a
            X.9Ye r2 = X.C203729od.A00
            int r1 = r2.A04(r7, r0)
            int r12 = X.AnonymousClass95R.A04(r9)
            if (r1 < 0) goto L_0x03d7
            goto L_0x03ce
        L_0x008d:
            boolean r0 = r6.A0P(r7, r10)
            if (r0 == 0) goto L_0x002a
            int r0 = X.AnonymousClass95R.A04(r9)
            int r12 = r0 + 8
            goto L_0x054b
        L_0x009b:
            boolean r0 = r6.A0P(r7, r10)
            if (r0 == 0) goto L_0x002a
            int r0 = X.AnonymousClass95R.A04(r9)
            int r12 = r0 + 4
            goto L_0x054b
        L_0x00a9:
            boolean r0 = r6.A0P(r7, r10)
            if (r0 == 0) goto L_0x002a
            int r0 = X.AnonymousClass95R.A04(r9)
            int r12 = r0 + 1
            goto L_0x054b
        L_0x00b7:
            boolean r2 = r6.A0P(r7, r10)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r0 = X.C203729od.A03(r7, r0)
            int r12 = A0E(r0, r9)
            goto L_0x054b
        L_0x00c7:
            boolean r2 = r6.A0P(r7, r10)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r2 = X.C203729od.A03(r7, r0)
            X.B3T r1 = r6.A0H(r10)
            java.lang.Class r0 = X.C203829ow.A03
            X.B5y r2 = (X.C23119B5y) r2
            boolean r0 = X.C170568Dy.A05
            int r12 = X.AnonymousClass95R.A04(r9)
            int r1 = X.AnonymousClass8EX.A00(r1, r2)
            int r0 = X.C165567td.A00(r1)
            int r0 = r0 + r1
            int r12 = r12 + r0
            goto L_0x054b
        L_0x00eb:
            boolean r2 = r6.A0P(r7, r10)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r0 = X.C203729od.A03(r7, r0)
            X.AUw r0 = (X.C21673AUw) r0
            int r12 = X.C170568Dy.A03(r0, r9)
            goto L_0x054b
        L_0x00fd:
            boolean r2 = r6.A0P(r7, r10)
            if (r2 == 0) goto L_0x002a
            X.9Ye r2 = X.C203729od.A00
            int r1 = r2.A04(r7, r0)
            int r12 = X.AnonymousClass95R.A04(r9)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r1)
            int r12 = r12 + r0
            goto L_0x054b
        L_0x0116:
            boolean r2 = r6.A0P(r7, r10)
            if (r2 == 0) goto L_0x002a
            X.9Ye r2 = X.C203729od.A00
            int r1 = r2.A04(r7, r0)
            int r12 = X.AnonymousClass95R.A04(r9)
            if (r1 < 0) goto L_0x03d7
            goto L_0x03ce
        L_0x012a:
            boolean r0 = r6.A0P(r7, r10)
            if (r0 == 0) goto L_0x002a
            int r0 = X.AnonymousClass95R.A04(r9)
            int r12 = r0 + 4
            goto L_0x054b
        L_0x0138:
            boolean r0 = r6.A0P(r7, r10)
            if (r0 == 0) goto L_0x002a
            int r0 = X.AnonymousClass95R.A04(r9)
            int r12 = r0 + 8
            goto L_0x054b
        L_0x0146:
            boolean r2 = r6.A0P(r7, r10)
            if (r2 == 0) goto L_0x002a
            X.9Ye r2 = X.C203729od.A00
            int r1 = r2.A04(r7, r0)
            int r0 = X.AnonymousClass95R.A04(r9)
            int r12 = X.AnonymousClass95R.A05(r1, r0)
            goto L_0x054b
        L_0x015c:
            boolean r2 = r6.A0P(r7, r10)
            if (r2 == 0) goto L_0x002a
            X.9Ye r2 = X.C203729od.A00
            long r0 = r2.A05(r7, r0)
            int r12 = X.AnonymousClass95R.A04(r9)
            long r0 = X.C165567td.A05(r0)
            int r0 = X.C170568Dy.A02(r0)
            int r12 = r12 + r0
            goto L_0x054b
        L_0x0177:
            boolean r2 = r6.A0P(r7, r10)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r2 = X.C203729od.A03(r7, r0)
            X.B5y r2 = (X.C23119B5y) r2
            X.B3T r1 = r6.A0H(r10)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.AnonymousClass95R.A04(r9)
            int r12 = r0 << 1
            int r0 = X.AnonymousClass8EX.A00(r1, r2)
            int r12 = r12 + r0
            goto L_0x054b
        L_0x0196:
            java.lang.Object r0 = r4.getObject(r7, r0)
            int r0 = A0D(r0)
            int r1 = r0 << 3
            if (r1 <= 0) goto L_0x002a
            int r12 = X.AnonymousClass95R.A04(r9)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r1)
            goto L_0x02dd
        L_0x01ae:
            java.lang.Object r0 = r4.getObject(r7, r0)
            int r0 = A0D(r0)
            int r1 = r0 << 2
            if (r1 <= 0) goto L_0x002a
            int r12 = X.AnonymousClass95R.A04(r9)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r1)
            goto L_0x02dd
        L_0x01c6:
            java.lang.Object r0 = r4.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C203829ow.A01(r0)
            if (r1 <= 0) goto L_0x002a
            int r12 = X.AnonymousClass95R.A04(r9)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r1)
            goto L_0x02dd
        L_0x01de:
            java.lang.Object r0 = r4.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C203829ow.A02(r0)
            if (r1 <= 0) goto L_0x002a
            int r12 = X.AnonymousClass95R.A04(r9)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r1)
            goto L_0x02dd
        L_0x01f6:
            java.lang.Object r0 = r4.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C203829ow.A05(r0)
            if (r1 <= 0) goto L_0x002a
            int r12 = X.AnonymousClass95R.A04(r9)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r1)
            goto L_0x02dd
        L_0x020e:
            java.lang.Object r0 = r4.getObject(r7, r0)
            int r0 = A0D(r0)
            int r1 = r0 << 3
            if (r1 <= 0) goto L_0x002a
            int r12 = X.AnonymousClass95R.A04(r9)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r1)
            goto L_0x02dd
        L_0x0226:
            java.lang.Object r0 = r4.getObject(r7, r0)
            int r0 = A0D(r0)
            int r1 = r0 << 2
            if (r1 <= 0) goto L_0x002a
            int r12 = X.AnonymousClass95R.A04(r9)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r1)
            goto L_0x02dd
        L_0x023e:
            java.lang.Object r0 = r4.getObject(r7, r0)
            int r1 = A0D(r0)
            if (r1 <= 0) goto L_0x002a
            int r12 = X.AnonymousClass95R.A04(r9)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r1)
            goto L_0x02dd
        L_0x0254:
            java.lang.Object r0 = r4.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C203829ow.A06(r0)
            if (r1 <= 0) goto L_0x002a
            int r12 = X.AnonymousClass95R.A04(r9)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r1)
            goto L_0x02dd
        L_0x026b:
            java.lang.Object r0 = r4.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C203829ow.A04(r0)
            if (r1 <= 0) goto L_0x002a
            int r12 = X.AnonymousClass95R.A04(r9)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r1)
            goto L_0x02dd
        L_0x0282:
            java.lang.Object r0 = r4.getObject(r7, r0)
            int r0 = A0D(r0)
            int r1 = r0 << 2
            if (r1 <= 0) goto L_0x002a
            int r12 = X.AnonymousClass95R.A04(r9)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r1)
            goto L_0x02dd
        L_0x0299:
            java.lang.Object r0 = r4.getObject(r7, r0)
            int r0 = A0D(r0)
            int r1 = r0 << 3
            if (r1 <= 0) goto L_0x002a
            int r12 = X.AnonymousClass95R.A04(r9)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r1)
            goto L_0x02dd
        L_0x02b0:
            java.lang.Object r0 = r4.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C203829ow.A07(r0)
            if (r1 <= 0) goto L_0x002a
            int r12 = X.AnonymousClass95R.A04(r9)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r1)
            goto L_0x02dd
        L_0x02c7:
            java.lang.Object r0 = r4.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C203829ow.A03(r0)
            if (r1 <= 0) goto L_0x002a
            int r12 = X.AnonymousClass95R.A04(r9)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r1)
        L_0x02dd:
            int r12 = r12 + r0
            int r12 = r12 + r1
            goto L_0x054b
        L_0x02e1:
            boolean r0 = r6.A0Q(r7, r9, r10)
            if (r0 == 0) goto L_0x002a
            int r0 = X.AnonymousClass95R.A04(r9)
            int r12 = r0 + 8
            goto L_0x054b
        L_0x02ef:
            boolean r0 = r6.A0Q(r7, r9, r10)
            if (r0 == 0) goto L_0x002a
            int r0 = X.AnonymousClass95R.A04(r9)
            int r12 = r0 + 4
            goto L_0x054b
        L_0x02fd:
            boolean r2 = r6.A0Q(r7, r9, r10)
            if (r2 == 0) goto L_0x002a
            goto L_0x030a
        L_0x0304:
            boolean r2 = r6.A0Q(r7, r9, r10)
            if (r2 == 0) goto L_0x002a
        L_0x030a:
            long r0 = A0F(r7, r0)
            int r12 = X.AnonymousClass95R.A04(r9)
            int r0 = X.C170568Dy.A02(r0)
            int r12 = r12 + r0
            goto L_0x054b
        L_0x0319:
            boolean r2 = r6.A0Q(r7, r9, r10)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r0 = X.C203729od.A03(r7, r0)
            int r1 = X.AnonymousClass000.A0I(r0)
            int r12 = X.AnonymousClass95R.A04(r9)
            if (r1 < 0) goto L_0x03d7
            goto L_0x03ce
        L_0x032f:
            boolean r0 = r6.A0Q(r7, r9, r10)
            if (r0 == 0) goto L_0x002a
            int r0 = X.AnonymousClass95R.A04(r9)
            int r12 = r0 + 8
            goto L_0x054b
        L_0x033d:
            boolean r0 = r6.A0Q(r7, r9, r10)
            if (r0 == 0) goto L_0x002a
            int r0 = X.AnonymousClass95R.A04(r9)
            int r12 = r0 + 4
            goto L_0x054b
        L_0x034b:
            boolean r0 = r6.A0Q(r7, r9, r10)
            if (r0 == 0) goto L_0x002a
            int r0 = X.AnonymousClass95R.A04(r9)
            int r12 = r0 + 1
            goto L_0x054b
        L_0x0359:
            boolean r2 = r6.A0Q(r7, r9, r10)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r0 = X.C203729od.A03(r7, r0)
            int r12 = A0E(r0, r9)
            goto L_0x054b
        L_0x0369:
            boolean r2 = r6.A0Q(r7, r9, r10)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r2 = X.C203729od.A03(r7, r0)
            X.B3T r1 = r6.A0H(r10)
            java.lang.Class r0 = X.C203829ow.A03
            X.B5y r2 = (X.C23119B5y) r2
            boolean r0 = X.C170568Dy.A05
            int r12 = X.AnonymousClass95R.A04(r9)
            int r1 = X.AnonymousClass8EX.A00(r1, r2)
            int r0 = X.C165567td.A00(r1)
            int r0 = r0 + r1
            int r12 = r12 + r0
            goto L_0x054b
        L_0x038d:
            boolean r2 = r6.A0Q(r7, r9, r10)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r0 = X.C203729od.A03(r7, r0)
            X.AUw r0 = (X.C21673AUw) r0
            int r12 = X.C170568Dy.A03(r0, r9)
            goto L_0x054b
        L_0x039f:
            boolean r2 = r6.A0Q(r7, r9, r10)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r0 = X.C203729od.A03(r7, r0)
            int r1 = X.AnonymousClass000.A0I(r0)
            int r12 = X.AnonymousClass95R.A04(r9)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r1)
            int r12 = r12 + r0
            goto L_0x054b
        L_0x03ba:
            boolean r2 = r6.A0Q(r7, r9, r10)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r0 = X.C203729od.A03(r7, r0)
            int r1 = X.AnonymousClass000.A0I(r0)
            int r12 = X.AnonymousClass95R.A04(r9)
            if (r1 < 0) goto L_0x03d7
        L_0x03ce:
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r1)
        L_0x03d4:
            int r12 = r12 + r0
            goto L_0x054b
        L_0x03d7:
            r0 = 10
            goto L_0x03d4
        L_0x03da:
            boolean r0 = r6.A0Q(r7, r9, r10)
            if (r0 == 0) goto L_0x002a
            int r0 = X.AnonymousClass95R.A04(r9)
            int r12 = r0 + 4
            goto L_0x054b
        L_0x03e8:
            boolean r0 = r6.A0Q(r7, r9, r10)
            if (r0 == 0) goto L_0x002a
            int r0 = X.AnonymousClass95R.A04(r9)
            int r12 = r0 + 8
            goto L_0x054b
        L_0x03f6:
            boolean r2 = r6.A0Q(r7, r9, r10)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r0 = X.C203729od.A03(r7, r0)
            int r1 = X.AnonymousClass000.A0I(r0)
            int r0 = X.AnonymousClass95R.A04(r9)
            int r12 = X.AnonymousClass95R.A05(r1, r0)
            goto L_0x054b
        L_0x040e:
            boolean r2 = r6.A0Q(r7, r9, r10)
            if (r2 == 0) goto L_0x002a
            long r0 = A0F(r7, r0)
            int r12 = X.AnonymousClass95R.A04(r9)
            long r0 = X.C165567td.A05(r0)
            int r0 = X.C170568Dy.A02(r0)
            int r12 = r12 + r0
            goto L_0x054b
        L_0x0427:
            boolean r2 = r6.A0Q(r7, r9, r10)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r2 = X.C203729od.A03(r7, r0)
            X.B5y r2 = (X.C23119B5y) r2
            X.B3T r1 = r6.A0H(r10)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.AnonymousClass95R.A04(r9)
            int r12 = r0 << 1
            int r0 = X.AnonymousClass8EX.A00(r1, r2)
            int r12 = r12 + r0
            goto L_0x054b
        L_0x0446:
            java.util.List r0 = X.C165617ti.A0d(r7, r0)
            int r12 = X.C203829ow.A0B(r0, r9)
            goto L_0x054b
        L_0x0450:
            java.util.List r0 = X.C165617ti.A0d(r7, r0)
            int r12 = X.C203829ow.A0A(r0, r9)
            goto L_0x054b
        L_0x045a:
            java.util.List r2 = X.C165617ti.A0d(r7, r0)
            java.lang.Class r0 = X.C203829ow.A03
            int r0 = r2.size()
            if (r0 == 0) goto L_0x0560
            int r1 = X.C203829ow.A01(r2)
            int r0 = r2.size()
            int r12 = A01(r9, r0, r1)
            goto L_0x054b
        L_0x0474:
            java.util.List r2 = X.C165617ti.A0d(r7, r0)
            java.lang.Class r0 = X.C203829ow.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0560
            int r0 = X.C203829ow.A02(r2)
            int r12 = A01(r9, r1, r0)
            goto L_0x054b
        L_0x048a:
            java.util.List r2 = X.C165617ti.A0d(r7, r0)
            java.lang.Class r0 = X.C203829ow.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0560
            int r0 = X.C203829ow.A05(r2)
            int r12 = A01(r9, r1, r0)
            goto L_0x054b
        L_0x04a0:
            java.util.List r0 = X.C165617ti.A0d(r7, r0)
            int r12 = X.C203829ow.A0B(r0, r9)
            goto L_0x054b
        L_0x04aa:
            java.util.List r0 = X.C165617ti.A0d(r7, r0)
            int r12 = X.C203829ow.A0A(r0, r9)
            goto L_0x054b
        L_0x04b4:
            java.lang.Object r0 = X.C203729od.A03(r7, r0)
            int r12 = A0D(r0)
            if (r12 == 0) goto L_0x0560
            int r0 = X.AnonymousClass95R.A04(r9)
            int r0 = r0 + 1
            int r12 = r12 * r0
            goto L_0x054b
        L_0x04c7:
            java.util.List r0 = X.C165617ti.A0d(r7, r0)
            int r12 = X.C203829ow.A08(r0, r9)
            goto L_0x054b
        L_0x04d0:
            java.util.List r1 = X.C165617ti.A0d(r7, r0)
            X.B3T r0 = r6.A0H(r10)
            int r12 = X.C203829ow.A00(r0, r1, r9)
            goto L_0x054b
        L_0x04dd:
            java.util.List r0 = X.C165617ti.A0d(r7, r0)
            int r12 = X.C203829ow.A09(r0, r9)
            goto L_0x054b
        L_0x04e6:
            java.util.List r2 = X.C165617ti.A0d(r7, r0)
            java.lang.Class r0 = X.C203829ow.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0560
            int r0 = X.C203829ow.A06(r2)
            int r12 = A01(r9, r1, r0)
            goto L_0x054b
        L_0x04fb:
            java.util.List r2 = X.C165617ti.A0d(r7, r0)
            java.lang.Class r0 = X.C203829ow.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0560
            int r0 = X.C203829ow.A04(r2)
            int r12 = A01(r9, r1, r0)
            goto L_0x054b
        L_0x0510:
            java.util.List r0 = X.C165617ti.A0d(r7, r0)
            int r12 = X.C203829ow.A0A(r0, r9)
            goto L_0x054b
        L_0x0519:
            java.util.List r0 = X.C165617ti.A0d(r7, r0)
            int r12 = X.C203829ow.A0B(r0, r9)
            goto L_0x054b
        L_0x0522:
            java.util.List r2 = X.C165617ti.A0d(r7, r0)
            java.lang.Class r0 = X.C203829ow.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0560
            int r0 = X.C203829ow.A07(r2)
            int r12 = A01(r9, r1, r0)
            goto L_0x054b
        L_0x0537:
            java.util.List r2 = X.C165617ti.A0d(r7, r0)
            java.lang.Class r0 = X.C203829ow.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0560
            int r0 = X.C203829ow.A03(r2)
            int r12 = A01(r9, r1, r0)
        L_0x054b:
            int r15 = r15 + r12
            goto L_0x002a
        L_0x054e:
            java.util.List r11 = X.C165617ti.A0d(r7, r0)
            X.B3T r8 = r6.A0H(r10)
            java.lang.Class r0 = X.C203829ow.A03
            int r5 = r11.size()
            r3 = 0
            r12 = 0
            if (r5 != 0) goto L_0x0562
        L_0x0560:
            r12 = 0
            goto L_0x054b
        L_0x0562:
            if (r3 >= r5) goto L_0x054b
            java.lang.Object r2 = r11.get(r3)
            X.B5y r2 = (X.C23119B5y) r2
            boolean r0 = X.C170568Dy.A05
            int r0 = X.AnonymousClass95R.A04(r9)
            int r1 = r0 << 1
            int r0 = X.AnonymousClass8EX.A00(r8, r2)
            int r1 = r1 + r0
            int r12 = r12 + r1
            int r3 = r3 + 1
            goto L_0x0562
        L_0x057b:
            X.C203729od.A03(r7, r0)
            java.lang.String r0 = "isEmpty"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0585:
            r15 = 0
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r14 = 0
        L_0x058a:
            int[] r1 = r6.A02
            int r0 = r1.length
            if (r5 >= r0) goto L_0x0b0e
            int r0 = r5 + 1
            r10 = r1[r0]
            r8 = r1[r5]
            int r9 = X.C165587tf.A02(r10)
            r0 = 17
            if (r9 > r0) goto L_0x0b01
            int r0 = r5 + 2
            r0 = r1[r0]
            r2 = r0 & r16
            int r0 = r0 >>> 20
            int r11 = r11 << r0
            if (r2 == r3) goto L_0x05ae
            long r0 = (long) r2
            int r14 = r4.getInt(r7, r0)
            r3 = r2
        L_0x05ae:
            r10 = r10 & r16
            long r1 = (long) r10
            switch(r9) {
                case 0: goto L_0x05c4;
                case 1: goto L_0x05b8;
                case 2: goto L_0x05d0;
                case 3: goto L_0x05e2;
                case 4: goto L_0x05f4;
                case 5: goto L_0x060d;
                case 6: goto L_0x0619;
                case 7: goto L_0x0625;
                case 8: goto L_0x0631;
                case 9: goto L_0x063f;
                case 10: goto L_0x0661;
                case 11: goto L_0x0671;
                case 12: goto L_0x0686;
                case 13: goto L_0x0696;
                case 14: goto L_0x06a2;
                case 15: goto L_0x06ae;
                case 16: goto L_0x06c0;
                case 17: goto L_0x06d7;
                case 18: goto L_0x06f4;
                case 19: goto L_0x0700;
                case 20: goto L_0x070c;
                case 21: goto L_0x0728;
                case 22: goto L_0x0740;
                case 23: goto L_0x0758;
                case 24: goto L_0x0764;
                case 25: goto L_0x0770;
                case 26: goto L_0x0783;
                case 27: goto L_0x078f;
                case 28: goto L_0x079f;
                case 29: goto L_0x07ab;
                case 30: goto L_0x07c3;
                case 31: goto L_0x07db;
                case 32: goto L_0x07e7;
                case 33: goto L_0x07f3;
                case 34: goto L_0x080b;
                case 35: goto L_0x0853;
                case 36: goto L_0x086b;
                case 37: goto L_0x0883;
                case 38: goto L_0x089b;
                case 39: goto L_0x08b3;
                case 40: goto L_0x08cb;
                case 41: goto L_0x08e3;
                case 42: goto L_0x08fb;
                case 43: goto L_0x0911;
                case 44: goto L_0x0928;
                case 45: goto L_0x093f;
                case 46: goto L_0x0956;
                case 47: goto L_0x096d;
                case 48: goto L_0x0984;
                case 49: goto L_0x0823;
                case 50: goto L_0x0b04;
                case 51: goto L_0x099e;
                case 52: goto L_0x09ac;
                case 53: goto L_0x09ba;
                case 54: goto L_0x09c1;
                case 55: goto L_0x09d6;
                case 56: goto L_0x09ec;
                case 57: goto L_0x09fa;
                case 58: goto L_0x0a08;
                case 59: goto L_0x0a16;
                case 60: goto L_0x0a26;
                case 61: goto L_0x0a4a;
                case 62: goto L_0x0a5c;
                case 63: goto L_0x0a77;
                case 64: goto L_0x0a96;
                case 65: goto L_0x0aa5;
                case 66: goto L_0x0ab2;
                case 67: goto L_0x0ac9;
                case 68: goto L_0x0ae1;
                default: goto L_0x05b4;
            }
        L_0x05b4:
            int r5 = r5 + 3
            r11 = 1
            goto L_0x058a
        L_0x05b8:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x05b4
            int r0 = X.AnonymousClass95R.A04(r8)
            int r13 = r0 + 4
            goto L_0x0afe
        L_0x05c4:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x05b4
            int r0 = X.AnonymousClass95R.A04(r8)
            int r13 = r0 + 8
            goto L_0x0afe
        L_0x05d0:
            r11 = r11 & r14
            if (r11 == 0) goto L_0x05b4
            long r9 = r4.getLong(r7, r1)
            int r1 = X.AnonymousClass95R.A04(r8)
            int r0 = X.C170568Dy.A02(r9)
            int r1 = r1 + r0
            goto L_0x0aa2
        L_0x05e2:
            r11 = r11 & r14
            if (r11 == 0) goto L_0x05b4
            long r9 = r4.getLong(r7, r1)
            int r1 = X.AnonymousClass95R.A04(r8)
            int r0 = X.C170568Dy.A02(r9)
            int r1 = r1 + r0
            goto L_0x0aa2
        L_0x05f4:
            r11 = r11 & r14
            if (r11 == 0) goto L_0x05b4
            int r2 = r4.getInt(r7, r1)
            int r1 = X.AnonymousClass95R.A04(r8)
            if (r2 < 0) goto L_0x060a
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r2)
        L_0x0607:
            int r1 = r1 + r0
            goto L_0x0aa2
        L_0x060a:
            r0 = 10
            goto L_0x0607
        L_0x060d:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x05b4
            int r0 = X.AnonymousClass95R.A04(r8)
            int r1 = r0 + 8
            goto L_0x0aa2
        L_0x0619:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x05b4
            int r0 = X.AnonymousClass95R.A04(r8)
            int r1 = r0 + 4
            goto L_0x0aa2
        L_0x0625:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x05b4
            int r0 = X.AnonymousClass95R.A04(r8)
            int r1 = r0 + 1
            goto L_0x0aa2
        L_0x0631:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x05b4
            java.lang.Object r0 = r4.getObject(r7, r1)
            int r13 = A0E(r0, r8)
            goto L_0x0afe
        L_0x063f:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x05b4
            java.lang.Object r2 = r4.getObject(r7, r1)
            X.B3T r1 = r6.A0H(r5)
            java.lang.Class r0 = X.C203829ow.A03
            X.B5y r2 = (X.C23119B5y) r2
            boolean r0 = X.C170568Dy.A05
            int r13 = X.AnonymousClass95R.A04(r8)
            int r1 = X.AnonymousClass8EX.A00(r1, r2)
            int r0 = X.C165567td.A00(r1)
            int r0 = r0 + r1
            int r13 = r13 + r0
            goto L_0x0afe
        L_0x0661:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x05b4
            java.lang.Object r0 = r4.getObject(r7, r1)
            X.AUw r0 = (X.C21673AUw) r0
            int r13 = X.C170568Dy.A03(r0, r8)
            goto L_0x0afe
        L_0x0671:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x05b4
            int r1 = r4.getInt(r7, r1)
            int r13 = X.AnonymousClass95R.A04(r8)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r1)
            int r13 = r13 + r0
            goto L_0x0afe
        L_0x0686:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x05b4
            int r1 = r4.getInt(r7, r1)
            int r13 = X.AnonymousClass95R.A04(r8)
            if (r1 < 0) goto L_0x0a93
            goto L_0x0a8b
        L_0x0696:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x05b4
            int r0 = X.AnonymousClass95R.A04(r8)
            int r1 = r0 + 4
            goto L_0x0aa2
        L_0x06a2:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x05b4
            int r0 = X.AnonymousClass95R.A04(r8)
            int r13 = r0 + 8
            goto L_0x0afe
        L_0x06ae:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x05b4
            int r1 = r4.getInt(r7, r1)
            int r0 = X.AnonymousClass95R.A04(r8)
            int r13 = X.AnonymousClass95R.A05(r1, r0)
            goto L_0x0afe
        L_0x06c0:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x05b4
            long r0 = r4.getLong(r7, r1)
            int r13 = X.AnonymousClass95R.A04(r8)
            long r0 = X.C165567td.A05(r0)
            int r0 = X.C170568Dy.A02(r0)
            int r13 = r13 + r0
            goto L_0x0afe
        L_0x06d7:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x05b4
            java.lang.Object r2 = r4.getObject(r7, r1)
            X.B5y r2 = (X.C23119B5y) r2
            X.B3T r1 = r6.A0H(r5)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.AnonymousClass95R.A04(r8)
            int r13 = r0 << 1
            int r0 = X.AnonymousClass8EX.A00(r1, r2)
            int r13 = r13 + r0
            goto L_0x0afe
        L_0x06f4:
            java.lang.Object r0 = r4.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C203829ow.A0B(r0, r8)
            goto L_0x0afe
        L_0x0700:
            java.lang.Object r0 = r4.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C203829ow.A0A(r0, r8)
            goto L_0x0afe
        L_0x070c:
            java.lang.Object r2 = r4.getObject(r7, r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C203829ow.A03
            int r0 = r2.size()
            if (r0 == 0) goto L_0x0837
            int r1 = X.C203829ow.A01(r2)
            int r0 = r2.size()
            int r13 = A01(r8, r0, r1)
            goto L_0x0afe
        L_0x0728:
            java.lang.Object r2 = r4.getObject(r7, r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C203829ow.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0837
            int r0 = X.C203829ow.A02(r2)
            int r13 = A01(r8, r1, r0)
            goto L_0x0afe
        L_0x0740:
            java.lang.Object r2 = r4.getObject(r7, r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C203829ow.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0837
            int r0 = X.C203829ow.A05(r2)
            int r13 = A01(r8, r1, r0)
            goto L_0x0afe
        L_0x0758:
            java.lang.Object r0 = r4.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C203829ow.A0B(r0, r8)
            goto L_0x0afe
        L_0x0764:
            java.lang.Object r0 = r4.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C203829ow.A0A(r0, r8)
            goto L_0x0afe
        L_0x0770:
            java.lang.Object r0 = r4.getObject(r7, r1)
            int r13 = A0D(r0)
            if (r13 == 0) goto L_0x0837
            int r0 = X.AnonymousClass95R.A04(r8)
            int r0 = r0 + 1
            int r13 = r13 * r0
            goto L_0x0afe
        L_0x0783:
            java.lang.Object r0 = r4.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C203829ow.A08(r0, r8)
            goto L_0x0afe
        L_0x078f:
            java.lang.Object r1 = r4.getObject(r7, r1)
            java.util.List r1 = (java.util.List) r1
            X.B3T r0 = r6.A0H(r5)
            int r13 = X.C203829ow.A00(r0, r1, r8)
            goto L_0x0afe
        L_0x079f:
            java.lang.Object r0 = r4.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C203829ow.A09(r0, r8)
            goto L_0x0afe
        L_0x07ab:
            java.lang.Object r2 = r4.getObject(r7, r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C203829ow.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0837
            int r0 = X.C203829ow.A06(r2)
            int r13 = A01(r8, r1, r0)
            goto L_0x0afe
        L_0x07c3:
            java.lang.Object r2 = r4.getObject(r7, r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C203829ow.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0837
            int r0 = X.C203829ow.A04(r2)
            int r13 = A01(r8, r1, r0)
            goto L_0x0afe
        L_0x07db:
            java.lang.Object r0 = r4.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C203829ow.A0A(r0, r8)
            goto L_0x0afe
        L_0x07e7:
            java.lang.Object r0 = r4.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C203829ow.A0B(r0, r8)
            goto L_0x0afe
        L_0x07f3:
            java.lang.Object r2 = r4.getObject(r7, r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C203829ow.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0837
            int r0 = X.C203829ow.A07(r2)
            int r13 = A01(r8, r1, r0)
            goto L_0x0afe
        L_0x080b:
            java.lang.Object r2 = r4.getObject(r7, r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C203829ow.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0837
            int r0 = X.C203829ow.A03(r2)
            int r13 = A01(r8, r1, r0)
            goto L_0x0afe
        L_0x0823:
            java.lang.Object r12 = r4.getObject(r7, r1)
            java.util.List r12 = (java.util.List) r12
            X.B3T r11 = r6.A0H(r5)
            java.lang.Class r0 = X.C203829ow.A03
            int r10 = r12.size()
            r9 = 0
            r13 = 0
            if (r10 != 0) goto L_0x083a
        L_0x0837:
            r13 = 0
            goto L_0x0afe
        L_0x083a:
            if (r9 >= r10) goto L_0x0afe
            java.lang.Object r2 = r12.get(r9)
            X.B5y r2 = (X.C23119B5y) r2
            boolean r0 = X.C170568Dy.A05
            int r0 = X.AnonymousClass95R.A04(r8)
            int r1 = r0 << 1
            int r0 = X.AnonymousClass8EX.A00(r11, r2)
            int r1 = r1 + r0
            int r13 = r13 + r1
            int r9 = r9 + 1
            goto L_0x083a
        L_0x0853:
            java.lang.Object r0 = r4.getObject(r7, r1)
            int r0 = A0D(r0)
            int r2 = r0 << 3
            if (r2 <= 0) goto L_0x05b4
            int r1 = X.AnonymousClass95R.A04(r8)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r2)
            goto L_0x099a
        L_0x086b:
            java.lang.Object r0 = r4.getObject(r7, r1)
            int r0 = A0D(r0)
            int r2 = r0 << 2
            if (r2 <= 0) goto L_0x05b4
            int r1 = X.AnonymousClass95R.A04(r8)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r2)
            goto L_0x099a
        L_0x0883:
            java.lang.Object r0 = r4.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C203829ow.A01(r0)
            if (r2 <= 0) goto L_0x05b4
            int r1 = X.AnonymousClass95R.A04(r8)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r2)
            goto L_0x099a
        L_0x089b:
            java.lang.Object r0 = r4.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C203829ow.A02(r0)
            if (r2 <= 0) goto L_0x05b4
            int r1 = X.AnonymousClass95R.A04(r8)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r2)
            goto L_0x099a
        L_0x08b3:
            java.lang.Object r0 = r4.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C203829ow.A05(r0)
            if (r2 <= 0) goto L_0x05b4
            int r1 = X.AnonymousClass95R.A04(r8)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r2)
            goto L_0x099a
        L_0x08cb:
            java.lang.Object r0 = r4.getObject(r7, r1)
            int r0 = A0D(r0)
            int r2 = r0 << 3
            if (r2 <= 0) goto L_0x05b4
            int r1 = X.AnonymousClass95R.A04(r8)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r2)
            goto L_0x099a
        L_0x08e3:
            java.lang.Object r0 = r4.getObject(r7, r1)
            int r0 = A0D(r0)
            int r2 = r0 << 2
            if (r2 <= 0) goto L_0x05b4
            int r1 = X.AnonymousClass95R.A04(r8)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r2)
            goto L_0x099a
        L_0x08fb:
            java.lang.Object r0 = r4.getObject(r7, r1)
            int r2 = A0D(r0)
            if (r2 <= 0) goto L_0x05b4
            int r1 = X.AnonymousClass95R.A04(r8)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r2)
            goto L_0x099a
        L_0x0911:
            java.lang.Object r0 = r4.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C203829ow.A06(r0)
            if (r2 <= 0) goto L_0x05b4
            int r1 = X.AnonymousClass95R.A04(r8)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r2)
            goto L_0x099a
        L_0x0928:
            java.lang.Object r0 = r4.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C203829ow.A04(r0)
            if (r2 <= 0) goto L_0x05b4
            int r1 = X.AnonymousClass95R.A04(r8)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r2)
            goto L_0x099a
        L_0x093f:
            java.lang.Object r0 = r4.getObject(r7, r1)
            int r0 = A0D(r0)
            int r2 = r0 << 2
            if (r2 <= 0) goto L_0x05b4
            int r1 = X.AnonymousClass95R.A04(r8)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r2)
            goto L_0x099a
        L_0x0956:
            java.lang.Object r0 = r4.getObject(r7, r1)
            int r0 = A0D(r0)
            int r2 = r0 << 3
            if (r2 <= 0) goto L_0x05b4
            int r1 = X.AnonymousClass95R.A04(r8)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r2)
            goto L_0x099a
        L_0x096d:
            java.lang.Object r0 = r4.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C203829ow.A07(r0)
            if (r2 <= 0) goto L_0x05b4
            int r1 = X.AnonymousClass95R.A04(r8)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r2)
            goto L_0x099a
        L_0x0984:
            java.lang.Object r0 = r4.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C203829ow.A03(r0)
            if (r2 <= 0) goto L_0x05b4
            int r1 = X.AnonymousClass95R.A04(r8)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r2)
        L_0x099a:
            int r1 = r1 + r0
            int r1 = r1 + r2
            goto L_0x0aa2
        L_0x099e:
            boolean r0 = r6.A0Q(r7, r8, r5)
            if (r0 == 0) goto L_0x05b4
            int r0 = X.AnonymousClass95R.A04(r8)
            int r13 = r0 + 8
            goto L_0x0afe
        L_0x09ac:
            boolean r0 = r6.A0Q(r7, r8, r5)
            if (r0 == 0) goto L_0x05b4
            int r0 = X.AnonymousClass95R.A04(r8)
            int r1 = r0 + 4
            goto L_0x0aa2
        L_0x09ba:
            boolean r0 = r6.A0Q(r7, r8, r5)
            if (r0 == 0) goto L_0x05b4
            goto L_0x09c7
        L_0x09c1:
            boolean r0 = r6.A0Q(r7, r8, r5)
            if (r0 == 0) goto L_0x05b4
        L_0x09c7:
            long r0 = A0F(r7, r1)
            int r13 = X.AnonymousClass95R.A04(r8)
            int r0 = X.C170568Dy.A02(r0)
            int r13 = r13 + r0
            goto L_0x0afe
        L_0x09d6:
            boolean r0 = r6.A0Q(r7, r8, r5)
            if (r0 == 0) goto L_0x05b4
            java.lang.Object r0 = X.C203729od.A03(r7, r1)
            int r1 = X.AnonymousClass000.A0I(r0)
            int r13 = X.AnonymousClass95R.A04(r8)
            if (r1 < 0) goto L_0x0a93
            goto L_0x0a8b
        L_0x09ec:
            boolean r0 = r6.A0Q(r7, r8, r5)
            if (r0 == 0) goto L_0x05b4
            int r0 = X.AnonymousClass95R.A04(r8)
            int r13 = r0 + 8
            goto L_0x0afe
        L_0x09fa:
            boolean r0 = r6.A0Q(r7, r8, r5)
            if (r0 == 0) goto L_0x05b4
            int r0 = X.AnonymousClass95R.A04(r8)
            int r1 = r0 + 4
            goto L_0x0aa2
        L_0x0a08:
            boolean r0 = r6.A0Q(r7, r8, r5)
            if (r0 == 0) goto L_0x05b4
            int r0 = X.AnonymousClass95R.A04(r8)
            int r1 = r0 + 1
            goto L_0x0aa2
        L_0x0a16:
            boolean r0 = r6.A0Q(r7, r8, r5)
            if (r0 == 0) goto L_0x05b4
            java.lang.Object r0 = r4.getObject(r7, r1)
            int r13 = A0E(r0, r8)
            goto L_0x0afe
        L_0x0a26:
            boolean r0 = r6.A0Q(r7, r8, r5)
            if (r0 == 0) goto L_0x05b4
            java.lang.Object r2 = r4.getObject(r7, r1)
            X.B3T r1 = r6.A0H(r5)
            java.lang.Class r0 = X.C203829ow.A03
            X.B5y r2 = (X.C23119B5y) r2
            boolean r0 = X.C170568Dy.A05
            int r13 = X.AnonymousClass95R.A04(r8)
            int r1 = X.AnonymousClass8EX.A00(r1, r2)
            int r0 = X.C165567td.A00(r1)
            int r0 = r0 + r1
            int r13 = r13 + r0
            goto L_0x0afe
        L_0x0a4a:
            boolean r0 = r6.A0Q(r7, r8, r5)
            if (r0 == 0) goto L_0x05b4
            java.lang.Object r0 = r4.getObject(r7, r1)
            X.AUw r0 = (X.C21673AUw) r0
            int r13 = X.C170568Dy.A03(r0, r8)
            goto L_0x0afe
        L_0x0a5c:
            boolean r0 = r6.A0Q(r7, r8, r5)
            if (r0 == 0) goto L_0x05b4
            java.lang.Object r0 = X.C203729od.A03(r7, r1)
            int r1 = X.AnonymousClass000.A0I(r0)
            int r13 = X.AnonymousClass95R.A04(r8)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r1)
            int r13 = r13 + r0
            goto L_0x0afe
        L_0x0a77:
            boolean r0 = r6.A0Q(r7, r8, r5)
            if (r0 == 0) goto L_0x05b4
            java.lang.Object r0 = X.C203729od.A03(r7, r1)
            int r1 = X.AnonymousClass000.A0I(r0)
            int r13 = X.AnonymousClass95R.A04(r8)
            if (r1 < 0) goto L_0x0a93
        L_0x0a8b:
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r1)
        L_0x0a91:
            int r13 = r13 + r0
            goto L_0x0afe
        L_0x0a93:
            r0 = 10
            goto L_0x0a91
        L_0x0a96:
            boolean r0 = r6.A0Q(r7, r8, r5)
            if (r0 == 0) goto L_0x05b4
            int r0 = X.AnonymousClass95R.A04(r8)
            int r1 = r0 + 4
        L_0x0aa2:
            int r15 = r15 + r1
            goto L_0x05b4
        L_0x0aa5:
            boolean r0 = r6.A0Q(r7, r8, r5)
            if (r0 == 0) goto L_0x05b4
            int r0 = X.AnonymousClass95R.A04(r8)
            int r13 = r0 + 8
            goto L_0x0afe
        L_0x0ab2:
            boolean r0 = r6.A0Q(r7, r8, r5)
            if (r0 == 0) goto L_0x05b4
            java.lang.Object r0 = X.C203729od.A03(r7, r1)
            int r1 = X.AnonymousClass000.A0I(r0)
            int r0 = X.AnonymousClass95R.A04(r8)
            int r13 = X.AnonymousClass95R.A05(r1, r0)
            goto L_0x0afe
        L_0x0ac9:
            boolean r0 = r6.A0Q(r7, r8, r5)
            if (r0 == 0) goto L_0x05b4
            long r0 = A0F(r7, r1)
            int r13 = X.AnonymousClass95R.A04(r8)
            long r0 = X.C165567td.A05(r0)
            int r0 = X.C170568Dy.A02(r0)
            int r13 = r13 + r0
            goto L_0x0afe
        L_0x0ae1:
            boolean r0 = r6.A0Q(r7, r8, r5)
            if (r0 == 0) goto L_0x05b4
            java.lang.Object r2 = r4.getObject(r7, r1)
            X.B5y r2 = (X.C23119B5y) r2
            X.B3T r1 = r6.A0H(r5)
            boolean r0 = X.C170568Dy.A05
            int r0 = X.AnonymousClass95R.A04(r8)
            int r13 = r0 << 1
            int r0 = X.AnonymousClass8EX.A00(r1, r2)
            int r13 = r13 + r0
        L_0x0afe:
            int r15 = r15 + r13
            goto L_0x05b4
        L_0x0b01:
            r11 = 0
            goto L_0x05ae
        L_0x0b04:
            r4.getObject(r7, r1)
            java.lang.String r0 = "isEmpty"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0b0e:
            X.8EX r7 = (X.AnonymousClass8EX) r7
            X.9jt r0 = r7.zzb
            int r0 = r0.A00()
            int r15 = r15 + r0
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A42.zzb(java.lang.Object):int");
    }

    public A42(AnonymousClass95S r1, C199249ey r2, C22806AwH awH, C23119B5y b5y, C22808AwJ awJ, AnonymousClass95U r6, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, int i3, int i4, boolean z) {
        this.A02 = iArr;
        this.A03 = objArr;
        this.A00 = i;
        this.A01 = i2;
        this.A0C = z;
        this.A0D = iArr2;
        this.A04 = i3;
        this.A05 = i4;
        this.A0A = awJ;
        this.A07 = r2;
        this.A0B = r6;
        this.A06 = r1;
        this.A09 = b5y;
        this.A08 = awH;
    }

    public static int A09(C197899cY r4, byte[] bArr, int i) {
        int A072 = A07(r4, bArr, i);
        int i2 = r4.A00;
        if (i2 < 0) {
            throw new C187318xe("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else if (i2 == 0) {
            r4.A02 = "";
            return A072;
        } else {
            r4.A02 = new String(bArr, A072, i2, C197089b7.A00);
            return A072 + i2;
        }
    }

    public static int A0B(C197899cY r4, byte[] bArr, int i) {
        int A072 = A07(r4, bArr, i);
        int i2 = r4.A00;
        if (i2 >= 0) {
            int length = bArr.length;
            if (i2 > length - A072) {
                throw new C187318xe("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            } else if (i2 == 0) {
                r4.A02 = C21673AUw.A00;
                return A072;
            } else {
                C21673AUw.A00(A072, A072 + i2, length);
                r4.A02 = new AnonymousClass8E0(C21673AUw.A01.ByJ(bArr, A072, i2));
                return A072 + i2;
            }
        } else {
            throw new C187318xe("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    public static long A0F(Object obj, long j) {
        return ((Number) C203729od.A03(obj, j)).longValue();
    }

    public static Object A0J(Object obj, int i) {
        return C203729od.A03(obj, (long) (i & 1048575));
    }

    public static Field A0K(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder A0i = C90464aC.A0i(arrays, C90474aD.A05(str) + 40 + C90474aD.A05(name));
            C165597tg.A1G(str, name, A0i);
            throw C90464aC.A0U(arrays, A0i);
        }
    }

    public static List A0L(int i, Object obj) {
        return (List) C203729od.A03(obj, (long) (i & 1048575));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
        X.C203729od.A09(r13, r8, X.C203729od.A03(r14, r8));
        X.C203729od.A00.A09(r13, X.C165577te.A0H(r3, r2), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01b4, code lost:
        r6 = r3[r2 + 2];
        r0 = (long) (1048575 & r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01c2, code lost:
        if (r0 == 1048575) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01c4, code lost:
        r4 = X.C203729od.A00;
        r4.A09(r13, r0, (1 << (r6 >>> 20)) | r4.A04(r13, r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ByW(java.lang.Object r13, java.lang.Object r14) {
        /*
            r12 = this;
            java.util.Objects.requireNonNull(r14)
            r2 = 0
        L_0x0004:
            int[] r3 = r12.A02
            int r0 = r3.length
            r7 = r13
            if (r2 >= r0) goto L_0x01e3
            int r0 = r2 + 1
            r1 = r3[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            long r8 = (long) r0
            r4 = r3[r2]
            int r0 = X.C165587tf.A02(r1)
            switch(r0) {
                case 0: goto L_0x01a5;
                case 1: goto L_0x0195;
                case 2: goto L_0x0185;
                case 3: goto L_0x0185;
                case 4: goto L_0x0175;
                case 5: goto L_0x0185;
                case 6: goto L_0x0175;
                case 7: goto L_0x0165;
                case 8: goto L_0x0157;
                case 9: goto L_0x0056;
                case 10: goto L_0x0157;
                case 11: goto L_0x0175;
                case 12: goto L_0x0175;
                case 13: goto L_0x0175;
                case 14: goto L_0x0185;
                case 15: goto L_0x0175;
                case 16: goto L_0x0185;
                case 17: goto L_0x0056;
                case 18: goto L_0x0096;
                case 19: goto L_0x0096;
                case 20: goto L_0x0096;
                case 21: goto L_0x0096;
                case 22: goto L_0x0096;
                case 23: goto L_0x0096;
                case 24: goto L_0x0096;
                case 25: goto L_0x0096;
                case 26: goto L_0x0096;
                case 27: goto L_0x0096;
                case 28: goto L_0x0096;
                case 29: goto L_0x0096;
                case 30: goto L_0x0096;
                case 31: goto L_0x0096;
                case 32: goto L_0x0096;
                case 33: goto L_0x0096;
                case 34: goto L_0x0096;
                case 35: goto L_0x0096;
                case 36: goto L_0x0096;
                case 37: goto L_0x0096;
                case 38: goto L_0x0096;
                case 39: goto L_0x0096;
                case 40: goto L_0x0096;
                case 41: goto L_0x0096;
                case 42: goto L_0x0096;
                case 43: goto L_0x0096;
                case 44: goto L_0x0096;
                case 45: goto L_0x0096;
                case 46: goto L_0x0096;
                case 47: goto L_0x0096;
                case 48: goto L_0x0096;
                case 49: goto L_0x0096;
                case 50: goto L_0x01d4;
                case 51: goto L_0x007f;
                case 52: goto L_0x007f;
                case 53: goto L_0x007f;
                case 54: goto L_0x007f;
                case 55: goto L_0x007f;
                case 56: goto L_0x007f;
                case 57: goto L_0x007f;
                case 58: goto L_0x007f;
                case 59: goto L_0x007f;
                case 60: goto L_0x001f;
                case 61: goto L_0x0078;
                case 62: goto L_0x0078;
                case 63: goto L_0x0078;
                case 64: goto L_0x0078;
                case 65: goto L_0x0078;
                case 66: goto L_0x0078;
                case 67: goto L_0x0078;
                case 68: goto L_0x001f;
                default: goto L_0x001c;
            }
        L_0x001c:
            int r2 = r2 + 3
            goto L_0x0004
        L_0x001f:
            int r0 = r2 + 1
            r0 = r3[r0]
            r6 = r3[r2]
            long r0 = X.C165597tg.A0D(r0)
            boolean r4 = r12.A0Q(r14, r6, r2)
            if (r4 == 0) goto L_0x001c
            r5 = 0
            boolean r4 = r12.A0Q(r13, r6, r2)
            if (r4 == 0) goto L_0x003a
            java.lang.Object r5 = X.C203729od.A03(r13, r0)
        L_0x003a:
            java.lang.Object r4 = X.C203729od.A03(r14, r0)
            if (r5 == 0) goto L_0x0053
            if (r4 == 0) goto L_0x001c
            X.8EX r4 = X.C197089b7.A00(r5, r4)
        L_0x0046:
            X.C203729od.A09(r13, r0, r4)
            long r0 = X.C165577te.A0H(r3, r2)
            X.9Ye r3 = X.C203729od.A00
            r3.A09(r13, r0, r6)
            goto L_0x001c
        L_0x0053:
            if (r4 == 0) goto L_0x001c
            goto L_0x0046
        L_0x0056:
            long r0 = X.C165577te.A0G(r3, r2)
            boolean r4 = r12.A0P(r14, r2)
            if (r4 == 0) goto L_0x001c
            java.lang.Object r5 = X.C203729od.A03(r13, r0)
            java.lang.Object r4 = X.C203729od.A03(r14, r0)
            if (r5 == 0) goto L_0x0075
            if (r4 == 0) goto L_0x001c
            X.8EX r4 = X.C197089b7.A00(r5, r4)
        L_0x0070:
            X.C203729od.A09(r13, r0, r4)
            goto L_0x01b4
        L_0x0075:
            if (r4 == 0) goto L_0x001c
            goto L_0x0070
        L_0x0078:
            boolean r0 = r12.A0Q(r14, r4, r2)
            if (r0 == 0) goto L_0x001c
            goto L_0x0085
        L_0x007f:
            boolean r0 = r12.A0Q(r14, r4, r2)
            if (r0 == 0) goto L_0x001c
        L_0x0085:
            java.lang.Object r0 = X.C203729od.A03(r14, r8)
            X.C203729od.A09(r13, r8, r0)
            long r0 = X.C165577te.A0H(r3, r2)
            X.9Ye r3 = X.C203729od.A00
            r3.A09(r13, r0, r4)
            goto L_0x001c
        L_0x0096:
            X.9ey r0 = r12.A07
            boolean r0 = r0 instanceof X.AnonymousClass8EZ
            if (r0 == 0) goto L_0x00c7
            java.lang.Object r5 = X.C203729od.A03(r13, r8)
            X.B6b r5 = (X.C23121B6b) r5
            java.util.List r4 = X.C165617ti.A0d(r14, r8)
            int r3 = r5.size()
            int r1 = r4.size()
            if (r3 <= 0) goto L_0x00c2
            if (r1 <= 0) goto L_0x00c1
            r0 = r5
            X.AcA r0 = (X.C21884AcA) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00be
            int r1 = r1 + r3
            X.B6b r5 = r5.ByB(r1)
        L_0x00be:
            r5.addAll(r4)
        L_0x00c1:
            r4 = r5
        L_0x00c2:
            X.C203729od.A09(r13, r8, r4)
            goto L_0x001c
        L_0x00c7:
            java.util.List r4 = X.C165617ti.A0d(r14, r8)
            int r5 = r4.size()
            java.util.List r3 = X.C165617ti.A0d(r13, r8)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0114
            boolean r0 = r3 instanceof X.B6X
            if (r0 == 0) goto L_0x0100
            X.8Dw r0 = X.C170548Dw.A01
            java.util.ArrayList r0 = X.C36441kJ.A14(r5)
            X.8Dw r3 = new X.8Dw
            r3.<init>(r0)
        L_0x00e8:
            X.C203729od.A09(r13, r8, r3)
        L_0x00eb:
            int r1 = r3.size()
            int r0 = r4.size()
            if (r1 <= 0) goto L_0x00fb
            if (r0 <= 0) goto L_0x00fa
            r3.addAll(r4)
        L_0x00fa:
            r4 = r3
        L_0x00fb:
            X.C203729od.A09(r13, r8, r4)
            goto L_0x001c
        L_0x0100:
            boolean r0 = r3 instanceof X.C16030oR
            if (r0 == 0) goto L_0x010f
            boolean r0 = r3 instanceof X.C23121B6b
            if (r0 == 0) goto L_0x010f
            X.B6b r3 = (X.C23121B6b) r3
            X.B6b r3 = r3.ByB(r5)
            goto L_0x00e8
        L_0x010f:
            java.util.ArrayList r3 = X.C36441kJ.A14(r5)
            goto L_0x00e8
        L_0x0114:
            java.lang.Class r0 = X.C170588Ea.A00
            boolean r0 = X.C165587tf.A1b(r0, r3)
            if (r0 == 0) goto L_0x0128
            java.util.ArrayList r1 = X.C165587tf.A0n(r3, r5)
        L_0x0120:
            r1.addAll(r3)
            X.C203729od.A09(r13, r8, r1)
            r3 = r1
            goto L_0x00eb
        L_0x0128:
            boolean r0 = r3 instanceof X.C21885AcB
            if (r0 == 0) goto L_0x0138
            X.8Dw r0 = X.C170548Dw.A01
            java.util.ArrayList r0 = X.C165587tf.A0n(r3, r5)
            X.8Dw r1 = new X.8Dw
            r1.<init>(r0)
            goto L_0x0120
        L_0x0138:
            boolean r0 = r3 instanceof X.C16030oR
            if (r0 == 0) goto L_0x00eb
            boolean r0 = r3 instanceof X.C23121B6b
            if (r0 == 0) goto L_0x00eb
            r1 = r3
            X.B6b r1 = (X.C23121B6b) r1
            r0 = r1
            X.AcA r0 = (X.C21884AcA) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00eb
            int r0 = r3.size()
            int r0 = r0 + r5
            X.B6b r3 = r1.ByB(r0)
            X.C203729od.A09(r13, r8, r3)
            goto L_0x00eb
        L_0x0157:
            boolean r0 = r12.A0P(r14, r2)
            if (r0 == 0) goto L_0x001c
            java.lang.Object r0 = X.C203729od.A03(r14, r8)
            X.C203729od.A09(r13, r8, r0)
            goto L_0x01b4
        L_0x0165:
            boolean r0 = r12.A0P(r14, r2)
            if (r0 == 0) goto L_0x001c
            X.9Ye r1 = X.C203729od.A00
            boolean r0 = r1.A0C(r14, r8)
            r1.A0B(r13, r8, r0)
            goto L_0x01b4
        L_0x0175:
            boolean r0 = r12.A0P(r14, r2)
            if (r0 == 0) goto L_0x001c
            X.9Ye r1 = X.C203729od.A00
            int r0 = r1.A04(r14, r8)
            r1.A09(r13, r8, r0)
            goto L_0x01b4
        L_0x0185:
            boolean r0 = r12.A0P(r14, r2)
            if (r0 == 0) goto L_0x001c
            X.9Ye r6 = X.C203729od.A00
            long r10 = r6.A05(r14, r8)
            r6.A0A(r7, r8, r10)
            goto L_0x01b4
        L_0x0195:
            boolean r0 = r12.A0P(r14, r2)
            if (r0 == 0) goto L_0x001c
            X.9Ye r1 = X.C203729od.A00
            float r0 = r1.A03(r14, r8)
            r1.A08(r13, r8, r0)
            goto L_0x01b4
        L_0x01a5:
            boolean r0 = r12.A0P(r14, r2)
            if (r0 == 0) goto L_0x001c
            X.9Ye r6 = X.C203729od.A00
            double r10 = r6.A02(r14, r8)
            r6.A07(r7, r8, r10)
        L_0x01b4:
            int r0 = r2 + 2
            r6 = r3[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r6
            long r0 = (long) r0
            r4 = 1048575(0xfffff, double:5.18065E-318)
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x001c
            r5 = 1
            int r3 = r6 >>> 20
            int r5 = r5 << r3
            X.9Ye r4 = X.C203729od.A00
            int r3 = r4.A04(r13, r0)
            r5 = r5 | r3
            r4.A09(r13, r0, r5)
            goto L_0x001c
        L_0x01d4:
            java.lang.Class r0 = X.C203829ow.A03
            X.C203729od.A03(r13, r8)
            X.C203729od.A03(r14, r8)
            java.lang.String r0 = "isEmpty"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x01e3:
            X.C203829ow.A0S(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A42.ByW(java.lang.Object, java.lang.Object):void");
    }

    public final boolean Byk(Object obj) {
        boolean z;
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.A04) {
            int i4 = this.A0D[i3];
            int[] iArr = this.A02;
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            int i7 = iArr[i4 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 == i) {
                i8 = i;
            } else if (i8 != 1048575) {
                i2 = A0E.getInt(obj, (long) i8);
            }
            if ((268435456 & i6) != 0) {
                if (i8 == 1048575) {
                    if (!A0P(obj, i4)) {
                        return false;
                    }
                } else if ((i2 & i9) == 0) {
                    return false;
                }
            }
            int i10 = (267386880 & i6) >>> 20;
            if (i10 != 9 && i10 != 17) {
                if (i10 != 27) {
                    if (i10 == 60 || i10 == 68) {
                        z = A0Q(obj, i5, i4);
                    } else if (i10 != 49) {
                        if (i10 == 50) {
                            C203729od.A03(obj, (long) (i6 & 1048575));
                            throw AnonymousClass001.A0A("isEmpty");
                        }
                        i3++;
                        i = i8;
                    }
                }
                List A0L = A0L(i6, obj);
                if (!A0L.isEmpty()) {
                    B3T A0H = A0H(i4);
                    for (int i11 = 0; i11 < A0L.size(); i11++) {
                        if (!A0H.Byk(A0L.get(i11))) {
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
                z = A0P(obj, i4);
            } else {
                z = i2 & i9;
            }
            if (z && !A0H(i4).Byk(A0J(obj, i6))) {
                return false;
            }
            i3++;
            i = i8;
        }
        return true;
    }
}
