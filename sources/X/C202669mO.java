package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.9mO  reason: invalid class name and case insensitive filesystem */
public class C202669mO {
    public final int A00;
    public final int A01;
    public final long A02;
    public final byte[] A03;

    public static C202669mO A01(ByteOrder byteOrder, int[] iArr) {
        int i = C203859oz.A0m[3];
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(i * r5)]);
        wrap.order(byteOrder);
        for (int i2 : iArr) {
            wrap.putShort((short) i2);
        }
        return new C202669mO(-1, wrap.array(), 3, r5);
    }

    public static C202669mO A02(ByteOrder byteOrder, long[] jArr) {
        int i = C203859oz.A0m[4];
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(i * r6)]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new C202669mO(-1, wrap.array(), 4, r6);
    }

    public static C202669mO A03(ByteOrder byteOrder, AnonymousClass9Q9[] r9) {
        int i = C203859oz.A0m[5];
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(i * r7)]);
        wrap.order(byteOrder);
        for (AnonymousClass9Q9 r3 : r9) {
            wrap.putInt((int) r3.A01);
            wrap.putInt((int) r3.A00);
        }
        return new C202669mO(-1, wrap.array(), 5, r7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0130, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0131, code lost:
        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0134, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0135, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0107, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0108, code lost:
        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x010b, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x010c, code lost:
        return r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0171 A[SYNTHETIC, Splitter:B:133:0x0171] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0180 A[SYNTHETIC, Splitter:B:143:0x0180] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A04(java.nio.ByteOrder r15) {
        /*
            r14 = this;
            java.lang.String r5 = "IOException occurred while closing InputStream"
            java.lang.String r4 = "ExifInterface"
            r13 = 0
            byte[] r8 = r14.A03     // Catch:{ IOException -> 0x0168, all -> 0x017d }
            X.8xw r6 = new X.8xw     // Catch:{ IOException -> 0x0168, all -> 0x017d }
            r6.<init>(r8)     // Catch:{ IOException -> 0x0168, all -> 0x017d }
            r6.A01 = r15     // Catch:{ IOException -> 0x0166 }
            int r0 = r14.A00     // Catch:{ IOException -> 0x0166 }
            r11 = 1
            r7 = 0
            switch(r0) {
                case 1: goto L_0x0136;
                case 2: goto L_0x001f;
                case 3: goto L_0x0060;
                case 4: goto L_0x0079;
                case 5: goto L_0x0096;
                case 6: goto L_0x0136;
                case 7: goto L_0x001f;
                case 8: goto L_0x00b7;
                case 9: goto L_0x00d0;
                case 10: goto L_0x00e9;
                case 11: goto L_0x010d;
                case 12: goto L_0x011d;
                default: goto L_0x0015;
            }     // Catch:{ IOException -> 0x0166 }
        L_0x0015:
            r6.close()     // Catch:{ IOException -> 0x0019 }
            goto L_0x001e
        L_0x0019:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r13
        L_0x001e:
            return r13
        L_0x001f:
            int r9 = r14.A01     // Catch:{ IOException -> 0x0166 }
            byte[] r10 = X.C203859oz.A0L     // Catch:{ IOException -> 0x0166 }
            r0 = 8
            r3 = 8
            if (r9 < r0) goto L_0x003b
            r2 = 0
        L_0x002a:
            if (r2 >= r3) goto L_0x0037
            byte r1 = r8[r2]     // Catch:{ IOException -> 0x0166 }
            byte r0 = r10[r2]     // Catch:{ IOException -> 0x0166 }
            if (r1 == r0) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            int r2 = r2 + 1
            goto L_0x002a
        L_0x0036:
            r11 = 0
        L_0x0037:
            if (r11 == 0) goto L_0x003b
            r7 = 8
        L_0x003b:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0166 }
        L_0x003f:
            if (r7 >= r9) goto L_0x0052
            byte r2 = r8[r7]     // Catch:{ IOException -> 0x0166 }
            if (r2 == 0) goto L_0x0052
            r1 = 32
            r0 = 63
            if (r2 < r1) goto L_0x004c
            char r0 = (char) r2     // Catch:{ IOException -> 0x0166 }
        L_0x004c:
            r3.append(r0)     // Catch:{ IOException -> 0x0166 }
            int r7 = r7 + 1
            goto L_0x003f
        L_0x0052:
            java.lang.String r1 = r3.toString()     // Catch:{ IOException -> 0x0166 }
            r6.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x005f
        L_0x005a:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x005f:
            return r1
        L_0x0060:
            int r2 = r14.A01     // Catch:{ IOException -> 0x0166 }
            int[] r1 = new int[r2]     // Catch:{ IOException -> 0x0166 }
        L_0x0064:
            if (r7 >= r2) goto L_0x006f
            int r0 = r6.readUnsignedShort()     // Catch:{ IOException -> 0x0166 }
            r1[r7] = r0     // Catch:{ IOException -> 0x0166 }
            int r7 = r7 + 1
            goto L_0x0064
        L_0x006f:
            r6.close()     // Catch:{ IOException -> 0x0073 }
            goto L_0x0078
        L_0x0073:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x0078:
            return r1
        L_0x0079:
            int r3 = r14.A01     // Catch:{ IOException -> 0x0166 }
            long[] r2 = new long[r3]     // Catch:{ IOException -> 0x0166 }
        L_0x007d:
            if (r7 >= r3) goto L_0x008c
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x0166 }
            long r0 = X.C165597tg.A0C(r0)     // Catch:{ IOException -> 0x0166 }
            r2[r7] = r0     // Catch:{ IOException -> 0x0166 }
            int r7 = r7 + 1
            goto L_0x007d
        L_0x008c:
            r6.close()     // Catch:{ IOException -> 0x0090 }
            goto L_0x0095
        L_0x0090:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r2
        L_0x0095:
            return r2
        L_0x0096:
            int r12 = r14.A01     // Catch:{ IOException -> 0x0166 }
            X.9Q9[] r9 = new X.AnonymousClass9Q9[r12]     // Catch:{ IOException -> 0x0166 }
        L_0x009a:
            if (r7 >= r12) goto L_0x0103
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x0166 }
            long r2 = (long) r0     // Catch:{ IOException -> 0x0166 }
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r10
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x0166 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0166 }
            long r0 = r0 & r10
            X.9Q9 r8 = new X.9Q9     // Catch:{ IOException -> 0x0166 }
            r8.<init>(r2, r0)     // Catch:{ IOException -> 0x0166 }
            r9[r7] = r8     // Catch:{ IOException -> 0x0166 }
            int r7 = r7 + 1
            goto L_0x009a
        L_0x00b7:
            int r2 = r14.A01     // Catch:{ IOException -> 0x0166 }
            int[] r1 = new int[r2]     // Catch:{ IOException -> 0x0166 }
        L_0x00bb:
            if (r7 >= r2) goto L_0x00c6
            short r0 = r6.readShort()     // Catch:{ IOException -> 0x0166 }
            r1[r7] = r0     // Catch:{ IOException -> 0x0166 }
            int r7 = r7 + 1
            goto L_0x00bb
        L_0x00c6:
            r6.close()     // Catch:{ IOException -> 0x00ca }
            goto L_0x00cf
        L_0x00ca:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x00cf:
            return r1
        L_0x00d0:
            int r2 = r14.A01     // Catch:{ IOException -> 0x0166 }
            int[] r1 = new int[r2]     // Catch:{ IOException -> 0x0166 }
        L_0x00d4:
            if (r7 >= r2) goto L_0x00df
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x0166 }
            r1[r7] = r0     // Catch:{ IOException -> 0x0166 }
            int r7 = r7 + 1
            goto L_0x00d4
        L_0x00df:
            r6.close()     // Catch:{ IOException -> 0x00e3 }
            goto L_0x00e8
        L_0x00e3:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x00e8:
            return r1
        L_0x00e9:
            int r10 = r14.A01     // Catch:{ IOException -> 0x0166 }
            X.9Q9[] r9 = new X.AnonymousClass9Q9[r10]     // Catch:{ IOException -> 0x0166 }
        L_0x00ed:
            if (r7 >= r10) goto L_0x0103
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x0166 }
            long r2 = (long) r0     // Catch:{ IOException -> 0x0166 }
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x0166 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0166 }
            X.9Q9 r8 = new X.9Q9     // Catch:{ IOException -> 0x0166 }
            r8.<init>(r2, r0)     // Catch:{ IOException -> 0x0166 }
            r9[r7] = r8     // Catch:{ IOException -> 0x0166 }
            int r7 = r7 + 1
            goto L_0x00ed
        L_0x0103:
            r6.close()     // Catch:{ IOException -> 0x0107 }
            goto L_0x010c
        L_0x0107:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r9
        L_0x010c:
            return r9
        L_0x010d:
            int r2 = r14.A01     // Catch:{ IOException -> 0x0166 }
            double[] r3 = new double[r2]     // Catch:{ IOException -> 0x0166 }
        L_0x0111:
            if (r7 >= r2) goto L_0x012c
            float r0 = r6.readFloat()     // Catch:{ IOException -> 0x0166 }
            double r0 = (double) r0     // Catch:{ IOException -> 0x0166 }
            r3[r7] = r0     // Catch:{ IOException -> 0x0166 }
            int r7 = r7 + 1
            goto L_0x0111
        L_0x011d:
            int r2 = r14.A01     // Catch:{ IOException -> 0x0166 }
            double[] r3 = new double[r2]     // Catch:{ IOException -> 0x0166 }
        L_0x0121:
            if (r7 >= r2) goto L_0x012c
            double r0 = r6.readDouble()     // Catch:{ IOException -> 0x0166 }
            r3[r7] = r0     // Catch:{ IOException -> 0x0166 }
            int r7 = r7 + 1
            goto L_0x0121
        L_0x012c:
            r6.close()     // Catch:{ IOException -> 0x0130 }
            goto L_0x0135
        L_0x0130:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r3
        L_0x0135:
            return r3
        L_0x0136:
            int r0 = r8.length     // Catch:{ IOException -> 0x0166 }
            if (r0 != r11) goto L_0x0155
            byte r0 = r8[r7]     // Catch:{ IOException -> 0x0166 }
            if (r0 < 0) goto L_0x0155
            if (r0 > r11) goto L_0x0155
            char[] r2 = new char[r11]     // Catch:{ IOException -> 0x0166 }
            int r0 = r0 + 48
            char r0 = (char) r0     // Catch:{ IOException -> 0x0166 }
            r2[r7] = r0     // Catch:{ IOException -> 0x0166 }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x0166 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0166 }
            r6.close()     // Catch:{ IOException -> 0x014f }
            goto L_0x0154
        L_0x014f:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x0154:
            return r1
        L_0x0155:
            java.nio.charset.Charset r0 = X.C203859oz.A0O     // Catch:{ IOException -> 0x0166 }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x0166 }
            r1.<init>(r8, r0)     // Catch:{ IOException -> 0x0166 }
            r6.close()     // Catch:{ IOException -> 0x0160 }
            goto L_0x0165
        L_0x0160:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x0165:
            return r1
        L_0x0166:
            r1 = move-exception
            goto L_0x016a
        L_0x0168:
            r1 = move-exception
            r6 = r13
        L_0x016a:
            java.lang.String r0 = "IOException occurred during reading a value"
            android.util.Log.w(r4, r0, r1)     // Catch:{ all -> 0x017a }
            if (r6 == 0) goto L_0x0179
            r6.close()     // Catch:{ IOException -> 0x0175 }
            return r13
        L_0x0175:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
        L_0x0179:
            return r13
        L_0x017a:
            r1 = move-exception
            r13 = r6
            goto L_0x017e
        L_0x017d:
            r1 = move-exception
        L_0x017e:
            if (r13 == 0) goto L_0x0188
            r13.close()     // Catch:{ IOException -> 0x0184 }
            throw r1
        L_0x0184:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
        L_0x0188:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202669mO.A04(java.nio.ByteOrder):java.lang.Object");
    }

    public C202669mO(long j, byte[] bArr, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A03 = bArr;
    }

    public static C202669mO A00(String str) {
        byte[] bytes = AnonymousClass000.A0t(AnonymousClass000.A0v(str), 0).getBytes(C203859oz.A0O);
        return new C202669mO(-1, bytes, 2, bytes.length);
    }

    public String A05(ByteOrder byteOrder) {
        Object A04 = A04(byteOrder);
        if (A04 != null) {
            if (A04 instanceof String) {
                return (String) A04;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            int i = 0;
            if (!(A04 instanceof long[])) {
                if (!(A04 instanceof int[])) {
                    if (!(A04 instanceof double[])) {
                        if (A04 instanceof AnonymousClass9Q9[]) {
                            AnonymousClass9Q9[] r7 = (AnonymousClass9Q9[]) A04;
                            while (true) {
                                int length = r7.length;
                                if (i >= length) {
                                    break;
                                }
                                AnonymousClass9Q9 r2 = r7[i];
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
                        double[] dArr = (double[]) A04;
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
                    int[] iArr = (int[]) A04;
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
                long[] jArr = (long[]) A04;
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
        C165617ti.A0g(A0u, C203859oz.A0M, this.A00);
        A0u.append(", data length:");
        A0u.append(this.A03.length);
        return C90474aD.A0f(A0u);
    }
}
