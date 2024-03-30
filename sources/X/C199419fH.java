package X;

import android.util.Log;
import java.nio.ByteOrder;

/* renamed from: X.9fH  reason: invalid class name and case insensitive filesystem */
public class C199419fH {
    public final int A00;
    public final int A01;
    public final byte[] A02;

    /* JADX WARNING: Removed duplicated region for block: B:156:0x022b A[SYNTHETIC, Splitter:B:156:0x022b] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0239 A[SYNTHETIC, Splitter:B:165:0x0239] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A00(X.C199419fH r22, java.nio.ByteOrder r23) {
        /*
            java.lang.String r14 = "IOException occurred while closing InputStream"
            r21 = 0
            r1 = r22
            byte[] r8 = r1.A02     // Catch:{ IOException -> 0x021d, all -> 0x021b }
            java.io.ByteArrayInputStream r0 = X.C90524aI.A0P(r8)     // Catch:{ IOException -> 0x021d, all -> 0x021b }
            X.ATv r5 = new X.ATv     // Catch:{ IOException -> 0x021d, all -> 0x021b }
            r5.<init>(r0)     // Catch:{ IOException -> 0x021d, all -> 0x021b }
            r0 = r23
            r5.A02 = r0     // Catch:{ IOException -> 0x0219 }
            int r0 = r1.A00     // Catch:{ IOException -> 0x0219 }
            r9 = 1
            r4 = 0
            switch(r0) {
                case 1: goto L_0x0026;
                case 2: goto L_0x01d6;
                case 3: goto L_0x01bd;
                case 4: goto L_0x01a0;
                case 5: goto L_0x0175;
                case 6: goto L_0x0026;
                case 7: goto L_0x01d6;
                case 8: goto L_0x015c;
                case 9: goto L_0x0143;
                case 10: goto L_0x0129;
                case 11: goto L_0x010b;
                case 12: goto L_0x0058;
                default: goto L_0x001c;
            }     // Catch:{ IOException -> 0x0219 }
        L_0x001c:
            r5.close()     // Catch:{ IOException -> 0x0020 }
            goto L_0x0025
        L_0x0020:
            r0 = move-exception
            A01(r0)
            return r21
        L_0x0025:
            return r21
        L_0x0026:
            int r0 = r8.length     // Catch:{ IOException -> 0x0219 }
            if (r0 != r9) goto L_0x0045
            byte r0 = r8[r4]     // Catch:{ IOException -> 0x0219 }
            if (r0 < 0) goto L_0x0045
            if (r0 > r9) goto L_0x0045
            char[] r2 = new char[r9]     // Catch:{ IOException -> 0x0219 }
            int r0 = r0 + 48
            char r0 = (char) r0     // Catch:{ IOException -> 0x0219 }
            r2[r4] = r0     // Catch:{ IOException -> 0x0219 }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x0219 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0219 }
            r5.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x0044
        L_0x003f:
            r0 = move-exception
            A01(r0)
            return r1
        L_0x0044:
            return r1
        L_0x0045:
            java.nio.charset.Charset r0 = X.C201349jN.A07     // Catch:{ IOException -> 0x0219 }
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x0219 }
            r2.<init>(r8, r0)     // Catch:{ IOException -> 0x0219 }
            r5.close()     // Catch:{ IOException -> 0x0050 }
            goto L_0x0057
        L_0x0050:
            r1 = move-exception
            java.lang.String r0 = "ExifReader"
            android.util.Log.e(r0, r14, r1)
            return r2
        L_0x0057:
            return r2
        L_0x0058:
            int r0 = r1.A01     // Catch:{ IOException -> 0x0219 }
            r22 = r0
            double[] r15 = new double[r0]     // Catch:{ IOException -> 0x0219 }
        L_0x005e:
            r0 = r22
            if (r4 >= r0) goto L_0x0101
            int r0 = r5.A00     // Catch:{ IOException -> 0x0219 }
            int r1 = r0 + 8
            r5.A00 = r1     // Catch:{ IOException -> 0x0219 }
            int r0 = r5.A03     // Catch:{ IOException -> 0x0219 }
            if (r1 > r0) goto L_0x00f7
            java.io.DataInputStream r0 = r5.A01     // Catch:{ IOException -> 0x0219 }
            int r11 = r0.read()     // Catch:{ IOException -> 0x0219 }
            int r10 = r0.read()     // Catch:{ IOException -> 0x0219 }
            int r13 = r0.read()     // Catch:{ IOException -> 0x0219 }
            int r12 = r0.read()     // Catch:{ IOException -> 0x0219 }
            int r7 = r0.read()     // Catch:{ IOException -> 0x0219 }
            int r6 = r0.read()     // Catch:{ IOException -> 0x0219 }
            int r9 = r0.read()     // Catch:{ IOException -> 0x0219 }
            int r8 = r0.read()     // Catch:{ IOException -> 0x0219 }
            r0 = r11 | r10
            r0 = r0 | r13
            r0 = r0 | r12
            r0 = r0 | r7
            r0 = r0 | r6
            r0 = r0 | r9
            r0 = r0 | r8
            if (r0 < 0) goto L_0x00fc
            java.nio.ByteOrder r2 = r5.A02     // Catch:{ IOException -> 0x0219 }
            java.nio.ByteOrder r0 = X.C21654ATv.A05     // Catch:{ IOException -> 0x0219 }
            r20 = 16
            r19 = 24
            r18 = 32
            r17 = 40
            r16 = 48
            r1 = 56
            if (r2 != r0) goto L_0x00c7
            long r2 = (long) r8     // Catch:{ IOException -> 0x0219 }
            long r2 = r2 << r1
            long r0 = (long) r9     // Catch:{ IOException -> 0x0219 }
            long r0 = r0 << r16
            long r2 = r2 + r0
            long r0 = (long) r6     // Catch:{ IOException -> 0x0219 }
            long r0 = r0 << r17
            long r2 = r2 + r0
            long r0 = (long) r7     // Catch:{ IOException -> 0x0219 }
            long r0 = r0 << r18
            long r2 = r2 + r0
            long r0 = (long) r12     // Catch:{ IOException -> 0x0219 }
            long r0 = r0 << r19
            long r2 = r2 + r0
            long r0 = (long) r13     // Catch:{ IOException -> 0x0219 }
            long r0 = r0 << r20
            long r2 = r2 + r0
            long r0 = (long) r10     // Catch:{ IOException -> 0x0219 }
            r6 = 8
            long r0 = r0 << r6
            long r2 = r2 + r0
            long r0 = (long) r11     // Catch:{ IOException -> 0x0219 }
            goto L_0x00e7
        L_0x00c7:
            java.nio.ByteOrder r0 = X.C21654ATv.A04     // Catch:{ IOException -> 0x0219 }
            if (r2 != r0) goto L_0x00f2
            long r2 = (long) r11     // Catch:{ IOException -> 0x0219 }
            long r2 = r2 << r1
            long r0 = (long) r10     // Catch:{ IOException -> 0x0219 }
            long r0 = r0 << r16
            long r2 = r2 + r0
            long r0 = (long) r13     // Catch:{ IOException -> 0x0219 }
            long r0 = r0 << r17
            long r2 = r2 + r0
            long r0 = (long) r12     // Catch:{ IOException -> 0x0219 }
            long r0 = r0 << r18
            long r2 = r2 + r0
            long r0 = (long) r7     // Catch:{ IOException -> 0x0219 }
            long r0 = r0 << r19
            long r2 = r2 + r0
            long r0 = (long) r6     // Catch:{ IOException -> 0x0219 }
            long r0 = r0 << r20
            long r2 = r2 + r0
            long r0 = (long) r9     // Catch:{ IOException -> 0x0219 }
            r6 = 8
            long r0 = r0 << r6
            long r2 = r2 + r0
            long r0 = (long) r8     // Catch:{ IOException -> 0x0219 }
        L_0x00e7:
            long r2 = r2 + r0
            double r0 = java.lang.Double.longBitsToDouble(r2)     // Catch:{ IOException -> 0x0219 }
            r15[r4] = r0     // Catch:{ IOException -> 0x0219 }
            int r4 = r4 + 1
            goto L_0x005e
        L_0x00f2:
            java.io.IOException r0 = X.C165567td.A0L(r2)     // Catch:{ IOException -> 0x0219 }
            goto L_0x0100
        L_0x00f7:
            java.io.EOFException r0 = X.C165617ti.A0T()     // Catch:{ IOException -> 0x0219 }
            goto L_0x0100
        L_0x00fc:
            java.io.EOFException r0 = X.C165617ti.A0T()     // Catch:{ IOException -> 0x0219 }
        L_0x0100:
            throw r0     // Catch:{ IOException -> 0x0219 }
        L_0x0101:
            r5.close()     // Catch:{ IOException -> 0x0105 }
            goto L_0x010a
        L_0x0105:
            r0 = move-exception
            A01(r0)
            return r15
        L_0x010a:
            return r15
        L_0x010b:
            int r3 = r1.A01     // Catch:{ IOException -> 0x0219 }
            double[] r2 = new double[r3]     // Catch:{ IOException -> 0x0219 }
        L_0x010f:
            if (r4 >= r3) goto L_0x011f
            int r0 = r5.A01()     // Catch:{ IOException -> 0x0219 }
            float r0 = java.lang.Float.intBitsToFloat(r0)     // Catch:{ IOException -> 0x0219 }
            double r0 = (double) r0     // Catch:{ IOException -> 0x0219 }
            r2[r4] = r0     // Catch:{ IOException -> 0x0219 }
            int r4 = r4 + 1
            goto L_0x010f
        L_0x011f:
            r5.close()     // Catch:{ IOException -> 0x0123 }
            goto L_0x0128
        L_0x0123:
            r0 = move-exception
            A01(r0)
            return r2
        L_0x0128:
            return r2
        L_0x0129:
            int r8 = r1.A01     // Catch:{ IOException -> 0x0219 }
            X.9QQ[] r7 = new X.AnonymousClass9QQ[r8]     // Catch:{ IOException -> 0x0219 }
        L_0x012d:
            if (r4 >= r8) goto L_0x0196
            int r0 = r5.A01()     // Catch:{ IOException -> 0x0219 }
            long r2 = (long) r0     // Catch:{ IOException -> 0x0219 }
            int r0 = r5.A01()     // Catch:{ IOException -> 0x0219 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0219 }
            X.9QQ r6 = new X.9QQ     // Catch:{ IOException -> 0x0219 }
            r6.<init>(r2, r0)     // Catch:{ IOException -> 0x0219 }
            r7[r4] = r6     // Catch:{ IOException -> 0x0219 }
            int r4 = r4 + 1
            goto L_0x012d
        L_0x0143:
            int r2 = r1.A01     // Catch:{ IOException -> 0x0219 }
            int[] r1 = new int[r2]     // Catch:{ IOException -> 0x0219 }
        L_0x0147:
            if (r4 >= r2) goto L_0x0152
            int r0 = r5.A01()     // Catch:{ IOException -> 0x0219 }
            r1[r4] = r0     // Catch:{ IOException -> 0x0219 }
            int r4 = r4 + 1
            goto L_0x0147
        L_0x0152:
            r5.close()     // Catch:{ IOException -> 0x0156 }
            goto L_0x015b
        L_0x0156:
            r0 = move-exception
            A01(r0)
            return r1
        L_0x015b:
            return r1
        L_0x015c:
            int r2 = r1.A01     // Catch:{ IOException -> 0x0219 }
            int[] r1 = new int[r2]     // Catch:{ IOException -> 0x0219 }
        L_0x0160:
            if (r4 >= r2) goto L_0x016b
            short r0 = r5.A04()     // Catch:{ IOException -> 0x0219 }
            r1[r4] = r0     // Catch:{ IOException -> 0x0219 }
            int r4 = r4 + 1
            goto L_0x0160
        L_0x016b:
            r5.close()     // Catch:{ IOException -> 0x016f }
            goto L_0x0174
        L_0x016f:
            r0 = move-exception
            A01(r0)
            return r1
        L_0x0174:
            return r1
        L_0x0175:
            int r10 = r1.A01     // Catch:{ IOException -> 0x0219 }
            X.9QQ[] r7 = new X.AnonymousClass9QQ[r10]     // Catch:{ IOException -> 0x0219 }
        L_0x0179:
            if (r4 >= r10) goto L_0x0196
            int r0 = r5.A01()     // Catch:{ IOException -> 0x0219 }
            long r2 = (long) r0     // Catch:{ IOException -> 0x0219 }
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r8
            int r0 = r5.A01()     // Catch:{ IOException -> 0x0219 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0219 }
            long r0 = r0 & r8
            X.9QQ r6 = new X.9QQ     // Catch:{ IOException -> 0x0219 }
            r6.<init>(r2, r0)     // Catch:{ IOException -> 0x0219 }
            r7[r4] = r6     // Catch:{ IOException -> 0x0219 }
            int r4 = r4 + 1
            goto L_0x0179
        L_0x0196:
            r5.close()     // Catch:{ IOException -> 0x019a }
            goto L_0x019f
        L_0x019a:
            r0 = move-exception
            A01(r0)
            return r7
        L_0x019f:
            return r7
        L_0x01a0:
            int r3 = r1.A01     // Catch:{ IOException -> 0x0219 }
            long[] r2 = new long[r3]     // Catch:{ IOException -> 0x0219 }
        L_0x01a4:
            if (r4 >= r3) goto L_0x01b3
            int r0 = r5.A01()     // Catch:{ IOException -> 0x0219 }
            long r0 = X.C165597tg.A0C(r0)     // Catch:{ IOException -> 0x0219 }
            r2[r4] = r0     // Catch:{ IOException -> 0x0219 }
            int r4 = r4 + 1
            goto L_0x01a4
        L_0x01b3:
            r5.close()     // Catch:{ IOException -> 0x01b7 }
            goto L_0x01bc
        L_0x01b7:
            r0 = move-exception
            A01(r0)
            return r2
        L_0x01bc:
            return r2
        L_0x01bd:
            int r2 = r1.A01     // Catch:{ IOException -> 0x0219 }
            int[] r1 = new int[r2]     // Catch:{ IOException -> 0x0219 }
        L_0x01c1:
            if (r4 >= r2) goto L_0x01cc
            int r0 = r5.A02()     // Catch:{ IOException -> 0x0219 }
            r1[r4] = r0     // Catch:{ IOException -> 0x0219 }
            int r4 = r4 + 1
            goto L_0x01c1
        L_0x01cc:
            r5.close()     // Catch:{ IOException -> 0x01d0 }
            goto L_0x01d5
        L_0x01d0:
            r0 = move-exception
            A01(r0)
            return r1
        L_0x01d5:
            return r1
        L_0x01d6:
            int r7 = r1.A01     // Catch:{ IOException -> 0x0219 }
            byte[] r6 = X.C201349jN.A09     // Catch:{ IOException -> 0x0219 }
            r0 = 8
            r3 = 8
            if (r7 < r0) goto L_0x01f2
            r2 = 0
        L_0x01e1:
            if (r2 >= r3) goto L_0x01ee
            byte r1 = r8[r2]     // Catch:{ IOException -> 0x0219 }
            byte r0 = r6[r2]     // Catch:{ IOException -> 0x0219 }
            if (r1 == r0) goto L_0x01ea
            goto L_0x01ed
        L_0x01ea:
            int r2 = r2 + 1
            goto L_0x01e1
        L_0x01ed:
            r9 = 0
        L_0x01ee:
            if (r9 == 0) goto L_0x01f2
            r4 = 8
        L_0x01f2:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0219 }
        L_0x01f6:
            if (r4 >= r7) goto L_0x0209
            byte r2 = r8[r4]     // Catch:{ IOException -> 0x0219 }
            if (r2 == 0) goto L_0x0209
            r1 = 32
            r0 = 63
            if (r2 < r1) goto L_0x0203
            char r0 = (char) r2     // Catch:{ IOException -> 0x0219 }
        L_0x0203:
            r3.append(r0)     // Catch:{ IOException -> 0x0219 }
            int r4 = r4 + 1
            goto L_0x01f6
        L_0x0209:
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x0219 }
            r5.close()     // Catch:{ IOException -> 0x0211 }
            goto L_0x0218
        L_0x0211:
            r1 = move-exception
            java.lang.String r0 = "ExifReader"
            android.util.Log.e(r0, r14, r1)
            return r2
        L_0x0218:
            return r2
        L_0x0219:
            r2 = move-exception
            goto L_0x0220
        L_0x021b:
            r1 = move-exception
            goto L_0x0237
        L_0x021d:
            r2 = move-exception
            r5 = r21
        L_0x0220:
            boolean r0 = X.C201349jN.A08     // Catch:{ all -> 0x0234 }
            java.lang.String r1 = "ExifReader"
            java.lang.String r0 = "IOException occurred during reading a value"
            android.util.Log.w(r1, r0, r2)     // Catch:{ all -> 0x0234 }
            if (r5 == 0) goto L_0x0233
            r5.close()     // Catch:{ IOException -> 0x022f }
            return r21
        L_0x022f:
            r0 = move-exception
            android.util.Log.e(r1, r14, r0)
        L_0x0233:
            return r21
        L_0x0234:
            r1 = move-exception
            r21 = r5
        L_0x0237:
            if (r21 == 0) goto L_0x0241
            r21.close()     // Catch:{ IOException -> 0x023d }
            throw r1
        L_0x023d:
            r0 = move-exception
            A01(r0)
        L_0x0241:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199419fH.A00(X.9fH, java.nio.ByteOrder):java.lang.Object");
    }

    public static void A01(Throwable th) {
        boolean z = C201349jN.A08;
        Log.e("ExifReader", "IOException occurred while closing InputStream", th);
    }

    public C199419fH(byte[] bArr, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = bArr;
    }

    public String A02(ByteOrder byteOrder) {
        Object A002 = A00(this, byteOrder);
        if (A002 != null) {
            if (A002 instanceof String) {
                return (String) A002;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            int i = 0;
            if (!(A002 instanceof long[])) {
                if (!(A002 instanceof int[])) {
                    if (!(A002 instanceof double[])) {
                        if (A002 instanceof AnonymousClass9QQ[]) {
                            AnonymousClass9QQ[] r7 = (AnonymousClass9QQ[]) A002;
                            while (true) {
                                int length = r7.length;
                                if (i >= length) {
                                    break;
                                }
                                AnonymousClass9QQ r2 = r7[i];
                                A0u.append(r2.A01);
                                A0u.append('/');
                                A0u.append(r2.A00);
                                i++;
                                if (i != length) {
                                    A0u.append(",");
                                }
                            }
                        }
                    } else {
                        double[] dArr = (double[]) A002;
                        while (true) {
                            int length2 = dArr.length;
                            if (i >= length2) {
                                break;
                            }
                            A0u.append(dArr[i]);
                            i++;
                            if (i != length2) {
                                A0u.append(",");
                            }
                        }
                    }
                } else {
                    int[] iArr = (int[]) A002;
                    while (true) {
                        int length3 = iArr.length;
                        if (i >= length3) {
                            break;
                        }
                        A0u.append(iArr[i]);
                        i++;
                        if (i != length3) {
                            A0u.append(",");
                        }
                    }
                }
            } else {
                long[] jArr = (long[]) A002;
                while (true) {
                    int length4 = jArr.length;
                    if (i >= length4) {
                        break;
                    }
                    A0u.append(jArr[i]);
                    i++;
                    if (i != length4) {
                        A0u.append(",");
                    }
                }
            }
            return A0u.toString();
        }
        return null;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("(");
        C165617ti.A0g(A0u, C201349jN.A05, this.A00);
        A0u.append(", data length:");
        A0u.append(this.A02.length);
        return C90474aD.A0f(A0u);
    }
}
