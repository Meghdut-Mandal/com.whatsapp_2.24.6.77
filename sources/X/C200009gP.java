package X;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: X.9gP  reason: invalid class name and case insensitive filesystem */
public abstract class C200009gP {
    public static final String A00(ByteBuffer byteBuffer, int i, int i2) {
        int i3;
        int i4;
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
            int i5 = i + i2;
            char[] cArr = new char[i2];
            int i6 = 0;
            while (r13 < i5) {
                byte b = byteBuffer.get(r13);
                if (b < 0) {
                    break;
                }
                i = r13 + 1;
                cArr[i3] = (char) b;
                i6 = i3 + 1;
            }
            while (r13 < i5) {
                int i7 = r13 + 1;
                byte b2 = byteBuffer.get(r13);
                if (b2 >= 0) {
                    int i8 = i3 + 1;
                    cArr[i3] = (char) b2;
                    while (i7 < i5) {
                        byte b3 = byteBuffer.get(i7);
                        if (b3 < 0) {
                            break;
                        }
                        i7++;
                        cArr[i8] = (char) b3;
                        i8++;
                    }
                    r13 = i7;
                    i3 = i8;
                } else {
                    if (b2 >= -32) {
                        if (b2 < -16) {
                            if (i7 < i5 - 1) {
                                int i9 = i7 + 1;
                                r13 = i9 + 1;
                                i4 = i3 + 1;
                                C200379hJ.A01(b2, byteBuffer.get(i7), byteBuffer.get(i9), cArr, i3);
                            }
                        } else if (i7 < i5 - 2) {
                            int i10 = i7 + 1;
                            int i11 = i10 + 1;
                            r13 = i11 + 1;
                            C200379hJ.A00(b2, byteBuffer.get(i7), byteBuffer.get(i10), byteBuffer.get(i11), cArr, i3);
                            i3 = i3 + 1 + 1;
                        }
                        throw C165617ti.A0L("Protocol message had invalid UTF-8.");
                    } else if (i7 < i5) {
                        r13 = i7 + 1;
                        byte b4 = byteBuffer.get(i7);
                        i4 = i3 + 1;
                        C200379hJ.A02(b2, b4, cArr, i3);
                    } else {
                        throw C165617ti.A0L("Protocol message had invalid UTF-8.");
                    }
                    i3 = i4;
                }
            }
            return new String(cArr, 0, i3);
        }
        Object[] A1Q = C36441kJ.A1Q();
        C36331k8.A1X(A1Q, byteBuffer.limit(), 0, i, 1);
        C36331k8.A1V(A1Q, i2);
        throw C165597tg.A0Z("buffer limit=%d, index=%d, limit=%d", A1Q);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (r12 < 2048) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0173, code lost:
        if (r3 < 2048) goto L_0x0175;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c A[LOOP:1: B:15:0x003c->B:21:0x004e, LOOP_START, PHI: r1 r2 r13 
      PHI: (r1v14 char) = (r1v13 char), (r1v19 char) binds: [B:12:0x0038, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r2v4 long) = (r2v3 long), (r2v19 long) binds: [B:12:0x0038, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r13v2 int) = (r13v1 int), (r13v8 int) binds: [B:12:0x0038, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(java.lang.CharSequence r21, byte[] r22, int r23, int r24) {
        /*
            r20 = this;
            r10 = r24
            r9 = r23
            r0 = r20
            boolean r0 = r0 instanceof X.C173598Sh
            r8 = r21
            r7 = r22
            if (r0 == 0) goto L_0x013d
            long r2 = (long) r9
            long r5 = (long) r10
            long r5 = r5 + r2
            int r4 = r8.length()
            java.lang.String r11 = " at index "
            java.lang.String r19 = "Failed writing "
            if (r4 > r10) goto L_0x0121
            int r0 = r7.length
            int r0 = r0 - r24
            if (r0 < r9) goto L_0x0121
            r13 = 0
        L_0x0021:
            r1 = 128(0x80, float:1.794E-43)
            r17 = 1
            if (r13 >= r4) goto L_0x0038
            char r0 = r8.charAt(r13)
            if (r0 >= r1) goto L_0x0038
            long r17 = r17 + r2
            byte r0 = (byte) r0
            com.google.protobuf.UnsafeUtil.A09(r7, r2, r0)
            int r13 = r13 + 1
            r2 = r17
            goto L_0x0021
        L_0x0038:
            if (r13 != r4) goto L_0x003c
        L_0x003a:
            int r0 = (int) r2
            return r0
        L_0x003c:
            if (r13 >= r4) goto L_0x003a
            char r12 = r8.charAt(r13)
            if (r12 >= r1) goto L_0x0054
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0058
            long r14 = r2 + r17
            byte r0 = (byte) r12
            com.google.protobuf.UnsafeUtil.A09(r7, r2, r0)
        L_0x004e:
            int r13 = r13 + 1
            r1 = 128(0x80, float:1.794E-43)
            r2 = r14
            goto L_0x003c
        L_0x0054:
            r0 = 2048(0x800, float:2.87E-42)
            if (r12 >= r0) goto L_0x0076
        L_0x0058:
            r0 = 2
            long r9 = r5 - r0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x0076
            long r0 = r2 + r17
            int r9 = r12 >>> 6
            r9 = r9 | 960(0x3c0, float:1.345E-42)
            byte r9 = (byte) r9
            com.google.protobuf.UnsafeUtil.A09(r7, r2, r9)
            long r14 = r0 + r17
            r3 = r12 & 63
            r2 = 128(0x80, float:1.794E-43)
            r3 = r3 | r2
            byte r2 = (byte) r3
        L_0x0072:
            com.google.protobuf.UnsafeUtil.A09(r7, r0, r2)
            goto L_0x004e
        L_0x0076:
            r14 = 57343(0xdfff, float:8.0355E-41)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r12 < r1) goto L_0x0080
            if (r14 >= r12) goto L_0x00a6
        L_0x0080:
            r15 = 3
            long r9 = r5 - r15
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00a6
            long r9 = r2 + r17
            int r0 = r12 >>> 12
            r0 = r0 | 480(0x1e0, float:6.73E-43)
            byte r0 = (byte) r0
            com.google.protobuf.UnsafeUtil.A09(r7, r2, r0)
            long r0 = r9 + r17
            int r2 = r12 >>> 6
            r2 = r2 & 63
            r3 = 128(0x80, float:1.794E-43)
            r2 = r2 | r3
            byte r2 = (byte) r2
            com.google.protobuf.UnsafeUtil.A09(r7, r9, r2)
            long r14 = r0 + r17
            r2 = r12 & 63
            r2 = r2 | r3
            byte r2 = (byte) r2
            goto L_0x0072
        L_0x00a6:
            r15 = 4
            long r9 = r5 - r15
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00f8
            int r9 = r13 + 1
            if (r9 == r4) goto L_0x00f0
            char r1 = r8.charAt(r9)
            boolean r0 = java.lang.Character.isSurrogatePair(r12, r1)
            if (r0 == 0) goto L_0x00ef
            int r13 = java.lang.Character.toCodePoint(r12, r1)
            long r0 = r2 + r17
            int r10 = r13 >>> 18
            r10 = r10 | 240(0xf0, float:3.36E-43)
            byte r10 = (byte) r10
            com.google.protobuf.UnsafeUtil.A09(r7, r2, r10)
            long r2 = r0 + r17
            int r10 = r13 >>> 12
            r10 = r10 & 63
            r12 = 128(0x80, float:1.794E-43)
            r10 = r10 | 128(0x80, float:1.794E-43)
            byte r10 = (byte) r10
            com.google.protobuf.UnsafeUtil.A09(r7, r0, r10)
            long r0 = r2 + r17
            int r10 = r13 >>> 6
            r10 = r10 & 63
            r10 = r10 | r12
            byte r10 = (byte) r10
            com.google.protobuf.UnsafeUtil.A09(r7, r2, r10)
            long r14 = r0 + r17
            r2 = r13 & 63
            r2 = r2 | r12
            byte r2 = (byte) r2
            com.google.protobuf.UnsafeUtil.A09(r7, r0, r2)
            r13 = r9
            goto L_0x004e
        L_0x00ef:
            r13 = r9
        L_0x00f0:
            int r1 = r13 + -1
            X.92L r0 = new X.92L
            r0.<init>(r1, r4)
            throw r0
        L_0x00f8:
            if (r1 > r12) goto L_0x0110
            if (r12 > r14) goto L_0x0110
            int r0 = r13 + 1
            if (r0 == r4) goto L_0x010a
            char r0 = r8.charAt(r0)
            boolean r0 = java.lang.Character.isSurrogatePair(r12, r0)
            if (r0 != 0) goto L_0x0110
        L_0x010a:
            X.92L r0 = new X.92L
            r0.<init>(r13, r4)
            throw r0
        L_0x0110:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0v(r19)
            r0.append(r12)
            java.lang.String r1 = X.C36381kD.A0z(r11, r0, r2)
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x0121:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r19)
            int r0 = r4 + -1
            char r0 = r8.charAt(r0)
            r1.append(r0)
            r1.append(r11)
            int r9 = r23 + r24
            java.lang.String r1 = X.C36381kD.A10(r1, r9)
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x013d:
            int r4 = r8.length()
            int r10 = r24 + r23
            r5 = 0
        L_0x0144:
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r4) goto L_0x0157
            int r1 = r5 + r23
            if (r1 >= r10) goto L_0x0157
            char r0 = r8.charAt(r5)
            if (r0 >= r6) goto L_0x0157
            int r5 = X.C165617ti.A02(r0, r7, r1, r5)
            goto L_0x0144
        L_0x0157:
            if (r5 != r4) goto L_0x015c
            int r9 = r23 + r4
        L_0x015b:
            return r9
        L_0x015c:
            int r9 = r23 + r5
        L_0x015e:
            if (r5 >= r4) goto L_0x015b
            char r3 = r8.charAt(r5)
            if (r3 >= r6) goto L_0x0171
            if (r9 >= r10) goto L_0x0175
            int r1 = r9 + 1
        L_0x016a:
            byte r0 = (byte) r3
            r22[r9] = r0
            r9 = r1
        L_0x016e:
            int r5 = r5 + 1
            goto L_0x015e
        L_0x0171:
            r0 = 2048(0x800, float:2.87E-42)
            if (r3 >= r0) goto L_0x0187
        L_0x0175:
            int r0 = r10 + -2
            if (r9 > r0) goto L_0x0187
            int r1 = r9 + 1
            int r0 = r3 >>> 6
            r0 = r0 | 960(0x3c0, float:1.345E-42)
            int r9 = X.C165617ti.A02(r0, r7, r9, r1)
            X.C165577te.A1S(r7, r3, r1)
            goto L_0x016e
        L_0x0187:
            r2 = 57343(0xdfff, float:8.0355E-41)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r1) goto L_0x0191
            if (r2 >= r3) goto L_0x01aa
        L_0x0191:
            int r0 = r10 + -3
            if (r9 > r0) goto L_0x01aa
            int r1 = r9 + 1
            int r0 = r3 >>> 12
            r0 = r0 | 480(0x1e0, float:6.73E-43)
            int r9 = X.C165617ti.A02(r0, r7, r9, r1)
            int r0 = r3 >>> 6
            X.C165577te.A1S(r7, r0, r1)
            int r1 = r9 + 1
            r3 = r3 & 63
            r3 = r3 | r6
            goto L_0x016a
        L_0x01aa:
            int r0 = r10 + -4
            if (r9 > r0) goto L_0x01cf
            int r2 = r5 + 1
            int r0 = r8.length()
            if (r2 == r0) goto L_0x01c7
            char r1 = r8.charAt(r2)
            boolean r0 = java.lang.Character.isSurrogatePair(r3, r1)
            if (r0 == 0) goto L_0x01c6
            int r9 = X.C165577te.A09(r7, r3, r1, r9)
            r5 = r2
            goto L_0x016e
        L_0x01c6:
            r5 = r2
        L_0x01c7:
            int r1 = r5 + -1
            X.92L r0 = new X.92L
            r0.<init>(r1, r4)
            throw r0
        L_0x01cf:
            if (r1 > r3) goto L_0x01eb
            if (r3 > r2) goto L_0x01eb
            int r1 = r5 + 1
            int r0 = r8.length()
            if (r1 == r0) goto L_0x01e5
            char r0 = r8.charAt(r1)
            boolean r0 = java.lang.Character.isSurrogatePair(r3, r0)
            if (r0 != 0) goto L_0x01eb
        L_0x01e5:
            X.92L r0 = new X.92L
            r0.<init>(r5, r4)
            throw r0
        L_0x01eb:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Failed writing "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " at index "
            java.lang.ArrayIndexOutOfBoundsException r0 = X.C165567td.A0M(r0, r1, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200009gP.A01(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:157:0x0137 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a4 A[LOOP:3: B:23:0x006d->B:39:0x00a4, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(byte[] r17, int r18, int r19) {
        /*
            r16 = this;
            r3 = r19
            r6 = r18
            r0 = r16
            boolean r0 = r0 instanceof X.C173598Sh
            r8 = r17
            if (r0 == 0) goto L_0x0150
            r1 = r18 | r19
            int r2 = r8.length
            int r0 = r2 - r19
            r1 = r1 | r0
            r0 = 0
            if (r1 < 0) goto L_0x013f
            long r4 = (long) r6
            long r0 = (long) r3
            long r0 = r0 - r4
            int r9 = (int) r0
            r14 = r4
            r3 = 0
            r0 = 16
            if (r9 < r0) goto L_0x006a
            int r0 = (int) r4
            r0 = r0 & 7
            int r6 = 8 - r0
        L_0x0024:
            r12 = 1
            if (r3 >= r6) goto L_0x0038
            long r12 = r12 + r14
            X.9Yj r2 = com.google.protobuf.UnsafeUtil.A02
            long r0 = com.google.protobuf.UnsafeUtil.A01
            long r0 = r0 + r14
            byte r0 = r2.A02(r8, r0)
            if (r0 < 0) goto L_0x006a
            int r3 = r3 + 1
            r14 = r12
            goto L_0x0024
        L_0x0038:
            int r6 = r3 + 8
            if (r6 > r9) goto L_0x0056
            long r0 = com.google.protobuf.UnsafeUtil.A01
            long r0 = r0 + r14
            X.9Yj r2 = com.google.protobuf.UnsafeUtil.A02
            long r10 = r2.A07(r8, r0)
            r0 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r0
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0056
            r0 = 8
            long r14 = r14 + r0
            r3 = r6
            goto L_0x0038
        L_0x0056:
            if (r3 >= r9) goto L_0x0069
            long r6 = r14 + r12
            X.9Yj r2 = com.google.protobuf.UnsafeUtil.A02
            long r0 = com.google.protobuf.UnsafeUtil.A01
            long r0 = r0 + r14
            byte r0 = r2.A02(r8, r0)
            if (r0 < 0) goto L_0x006a
            int r3 = r3 + 1
            r14 = r6
            goto L_0x0056
        L_0x0069:
            r3 = r9
        L_0x006a:
            int r9 = r9 - r3
            long r0 = (long) r3
            long r4 = r4 + r0
        L_0x006d:
            r7 = 0
        L_0x006e:
            r14 = 1
            if (r9 <= 0) goto L_0x0083
            long r10 = r4 + r14
            X.9Yj r2 = com.google.protobuf.UnsafeUtil.A02
            long r0 = com.google.protobuf.UnsafeUtil.A01
            long r0 = r0 + r4
            byte r7 = r2.A02(r8, r0)
            if (r7 < 0) goto L_0x0087
            int r9 = r9 + -1
            r4 = r10
            goto L_0x006e
        L_0x0083:
            if (r9 != 0) goto L_0x0088
            r7 = 0
        L_0x0086:
            return r7
        L_0x0087:
            r4 = r10
        L_0x0088:
            int r1 = r9 + -1
            r13 = -32
            r6 = -65
            if (r7 >= r13) goto L_0x00a6
            if (r1 == 0) goto L_0x0086
            int r9 = r1 + -1
            r0 = -62
            if (r7 < r0) goto L_0x0137
        L_0x0098:
            long r14 = r14 + r4
            X.9Yj r2 = com.google.protobuf.UnsafeUtil.A02
            long r0 = com.google.protobuf.UnsafeUtil.A01
            long r0 = r0 + r4
            byte r0 = r2.A02(r8, r0)
        L_0x00a2:
            if (r0 > r6) goto L_0x0137
            r4 = r14
            goto L_0x006d
        L_0x00a6:
            r0 = -16
            if (r7 >= r0) goto L_0x00d1
            r0 = 2
            if (r1 < r0) goto L_0x00f4
            int r9 = r1 + -2
            long r11 = r4 + r14
            X.9Yj r10 = com.google.protobuf.UnsafeUtil.A02
            long r2 = com.google.protobuf.UnsafeUtil.A01
            long r0 = r2 + r4
            byte r4 = r10.A02(r8, r0)
            if (r4 > r6) goto L_0x0137
            r1 = -96
            if (r7 != r13) goto L_0x00ca
            if (r4 < r1) goto L_0x0137
        L_0x00c3:
            long r14 = r14 + r11
            long r2 = r2 + r11
            byte r0 = r10.A02(r8, r2)
            goto L_0x00a2
        L_0x00ca:
            r0 = -19
            if (r7 != r0) goto L_0x00c3
            if (r4 >= r1) goto L_0x0137
            goto L_0x00c3
        L_0x00d1:
            r0 = 3
            if (r1 < r0) goto L_0x00f4
            int r9 = r1 + -3
            long r11 = r4 + r14
            X.9Yj r10 = com.google.protobuf.UnsafeUtil.A02
            long r2 = com.google.protobuf.UnsafeUtil.A01
            long r0 = r2 + r4
            byte r0 = r10.A02(r8, r0)
            if (r0 > r6) goto L_0x0137
            int r0 = X.C165607th.A02(r7, r0)
            if (r0 != 0) goto L_0x0137
            long r4 = r11 + r14
            long r2 = r2 + r11
            byte r0 = r10.A02(r8, r2)
            if (r0 > r6) goto L_0x0137
            goto L_0x0098
        L_0x00f4:
            if (r1 == 0) goto L_0x0131
            r0 = 1
            if (r1 == r0) goto L_0x011d
            r0 = 2
            if (r1 != r0) goto L_0x0139
            X.9Yj r9 = com.google.protobuf.UnsafeUtil.A02
            long r0 = com.google.protobuf.UnsafeUtil.A01
            long r2 = r0 + r4
            byte r2 = r9.A02(r8, r2)
            long r4 = r4 + r14
            long r0 = r0 + r4
            byte r1 = r9.A02(r8, r0)
            X.9gP r0 = X.C196659aK.A00
            r0 = -12
            if (r7 > r0) goto L_0x0137
            if (r2 > r6) goto L_0x0137
            if (r1 > r6) goto L_0x0137
            int r0 = r2 << 8
            r7 = r7 ^ r0
            int r0 = r1 << 16
        L_0x011b:
            r7 = r7 ^ r0
            return r7
        L_0x011d:
            X.9Yj r2 = com.google.protobuf.UnsafeUtil.A02
            long r0 = com.google.protobuf.UnsafeUtil.A01
            long r0 = r0 + r4
            byte r1 = r2.A02(r8, r0)
            X.9gP r0 = X.C196659aK.A00
            r0 = -12
            if (r7 > r0) goto L_0x0137
            if (r1 > r6) goto L_0x0137
            int r0 = r1 << 8
            goto L_0x011b
        L_0x0131:
            X.9gP r0 = X.C196659aK.A00
            r0 = -12
            if (r7 <= r0) goto L_0x0086
        L_0x0137:
            r7 = -1
            return r7
        L_0x0139:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x013f:
            java.lang.Object[] r1 = X.C36441kJ.A1Q()
            X.AnonymousClass000.A1L(r1, r2, r0)
            X.C165567td.A1X(r1, r6, r3)
            java.lang.String r0 = "Array length=%d, index=%d, limit=%d"
            java.lang.ArrayIndexOutOfBoundsException r0 = X.C165597tg.A0Z(r0, r1)
            throw r0
        L_0x0150:
            if (r6 >= r3) goto L_0x0159
            byte r0 = r17[r6]
            if (r0 < 0) goto L_0x0159
            int r6 = r6 + 1
            goto L_0x0150
        L_0x0159:
            if (r6 < r3) goto L_0x015d
        L_0x015b:
            r6 = 0
        L_0x015c:
            return r6
        L_0x015d:
            if (r6 >= r3) goto L_0x015b
            int r7 = r6 + 1
            byte r6 = r17[r6]
            if (r6 >= 0) goto L_0x01eb
            r9 = -32
            r5 = -65
            if (r6 >= r9) goto L_0x0179
            if (r7 >= r3) goto L_0x015c
            r0 = -62
            if (r6 < r0) goto L_0x0177
            int r6 = r7 + 1
            byte r0 = r17[r7]
        L_0x0175:
            if (r0 <= r5) goto L_0x015d
        L_0x0177:
            r6 = -1
            return r6
        L_0x0179:
            r0 = -16
            if (r6 >= r0) goto L_0x0199
            int r0 = r19 + -1
            if (r7 >= r0) goto L_0x01b6
            int r4 = r7 + 1
            byte r2 = r17[r7]
            if (r2 > r5) goto L_0x0177
            r1 = -96
            if (r6 != r9) goto L_0x0192
            if (r2 < r1) goto L_0x0177
        L_0x018d:
            int r6 = r4 + 1
            byte r0 = r17[r4]
            goto L_0x0175
        L_0x0192:
            r0 = -19
            if (r6 != r0) goto L_0x018d
            if (r2 >= r1) goto L_0x0177
            goto L_0x018d
        L_0x0199:
            int r0 = r19 + -2
            if (r7 >= r0) goto L_0x01b6
            int r2 = r7 + 1
            byte r0 = r17[r7]
            if (r0 > r5) goto L_0x0177
            int r0 = X.C165607th.A02(r6, r0)
            if (r0 != 0) goto L_0x0177
            int r1 = r2 + 1
            byte r0 = r17[r2]
            if (r0 > r5) goto L_0x0177
            int r7 = r1 + 1
            byte r0 = r17[r1]
            if (r0 <= r5) goto L_0x01eb
            goto L_0x0177
        L_0x01b6:
            X.9gP r0 = X.C196659aK.A00
            int r0 = r7 + -1
            byte r6 = r17[r0]
            int r3 = r19 - r7
            if (r3 == 0) goto L_0x01e6
            r0 = 1
            if (r3 == r0) goto L_0x01db
            r0 = 2
            if (r3 != r0) goto L_0x01ee
            byte r2 = r17[r7]
            int r0 = r7 + 1
            byte r1 = r17[r0]
            r0 = -12
            if (r6 > r0) goto L_0x0177
            if (r2 > r5) goto L_0x0177
            if (r1 > r5) goto L_0x0177
            int r0 = r2 << 8
            r6 = r6 ^ r0
            int r0 = r1 << 16
        L_0x01d9:
            r6 = r6 ^ r0
            return r6
        L_0x01db:
            byte r1 = r17[r7]
            r0 = -12
            if (r6 > r0) goto L_0x0177
            if (r1 > r5) goto L_0x0177
            int r0 = r1 << 8
            goto L_0x01d9
        L_0x01e6:
            r0 = -12
            if (r6 <= r0) goto L_0x015c
            goto L_0x0177
        L_0x01eb:
            r6 = r7
            goto L_0x015d
        L_0x01ee:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200009gP.A02(byte[], int, int):int");
    }

    public String A03(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        if (this instanceof C173598Sh) {
            Charset charset = AnonymousClass9BD.A04;
            String str = new String(bArr, i, i2, charset);
            if (!str.contains("�") || Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                return str;
            }
            throw C165617ti.A0L("Protocol message had invalid UTF-8.");
        }
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) >= 0) {
            int i5 = i + i2;
            char[] cArr = new char[i2];
            int i6 = 0;
            while (r14 < i5) {
                byte b = bArr[r14];
                if (b < 0) {
                    break;
                }
                i = r14 + 1;
                cArr[i3] = (char) b;
                i6 = i3 + 1;
            }
            while (r14 < i5) {
                int i7 = r14 + 1;
                byte b2 = bArr[r14];
                if (b2 >= 0) {
                    int i8 = i3 + 1;
                    cArr[i3] = (char) b2;
                    while (i7 < i5) {
                        byte b3 = bArr[i7];
                        if (b3 < 0) {
                            break;
                        }
                        i7++;
                        cArr[i8] = (char) b3;
                        i8++;
                    }
                    r14 = i7;
                    i3 = i8;
                } else {
                    if (b2 >= -32) {
                        if (b2 < -16) {
                            if (i7 < i5 - 1) {
                                int i9 = i7 + 1;
                                r14 = i9 + 1;
                                i4 = i3 + 1;
                                C200379hJ.A01(b2, bArr[i7], bArr[i9], cArr, i3);
                            }
                        } else if (i7 < i5 - 2) {
                            int i10 = i7 + 1;
                            int i11 = i10 + 1;
                            r14 = i11 + 1;
                            C200379hJ.A00(b2, bArr[i7], bArr[i10], bArr[i11], cArr, i3);
                            i3 = i3 + 1 + 1;
                        }
                        throw C165617ti.A0L("Protocol message had invalid UTF-8.");
                    } else if (i7 < i5) {
                        r14 = i7 + 1;
                        byte b4 = bArr[i7];
                        i4 = i3 + 1;
                        C200379hJ.A02(b2, b4, cArr, i3);
                    } else {
                        throw C165617ti.A0L("Protocol message had invalid UTF-8.");
                    }
                    i3 = i4;
                }
            }
            return new String(cArr, 0, i3);
        }
        Object[] A1Q = C36441kJ.A1Q();
        C36331k8.A1X(A1Q, length, 0, i, 1);
        C36331k8.A1V(A1Q, i2);
        throw C165597tg.A0Z("buffer length=%d, index=%d, size=%d", A1Q);
    }
}
