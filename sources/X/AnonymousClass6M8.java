package X;

/* renamed from: X.6M8  reason: invalid class name */
public final class AnonymousClass6M8 {
    public static final AnonymousClass6M8 A00 = new AnonymousClass6M8();

    public static long A00(byte[] bArr, int i, int i2) {
        return ((long) ((short) (bArr[i] & 255))) << i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00c5, code lost:
        r0 = r0 ^ r8;
        r8 = A00(r11, r10 + 12, 32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00d3, code lost:
        r0 = r0 ^ r8;
        r8 = A00(r11, r10 + 11, 24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00e1, code lost:
        r0 = r0 ^ r8;
        r16 = 16;
        r8 = ((long) ((short) (r20[r10 + 10] & 255))) << 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00fb, code lost:
        r4 = r4 ^ (java.lang.Long.rotateLeft((((r0 ^ r8) ^ A00(r11, r10 + 9, 8)) ^ A00(r11, r10 + 8, 0)) * 5545529020109919103L, 33) * -8663945395140668459L);
        r2 = ((((A00(r11, r10 + 7, 56) ^ 0) ^ A00(r11, r10 + 6, 48)) ^ A00(r11, r10 + 5, 40)) ^ A00(r11, r10 + 4, 32)) ^ A00(r11, r10 + 3, 24);
        r0 = A00(r11, r10 + 2, r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0168, code lost:
        r4 = r4 ^ (java.lang.Long.rotateLeft((r0 ^ r8) * 5545529020109919103L, 33) * -8663945395140668459L);
        r2 = A00(r11, r10 + 7, 56);
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x018a, code lost:
        r2 = r2 ^ r8;
        r8 = A00(r11, r10 + 6, 48);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x019c, code lost:
        r2 = r2 ^ r8;
        r8 = A00(r11, r10 + 5, 40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x01ae, code lost:
        r2 = r2 ^ r8;
        r8 = A00(r11, r10 + 4, 32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x01bc, code lost:
        r2 = r2 ^ r8;
        r8 = A00(r11, r10 + 3, 24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x01ca, code lost:
        r2 = r2 ^ r8;
        r0 = ((long) ((short) (r20[r10 + 2] & 255))) << 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01e4, code lost:
        r2 = r2 ^ r0;
        r8 = A00(r11, r10 + 1, 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01f6, code lost:
        r2 = (r2 ^ r8) ^ A00(r11, r10, 0);
        r14 = -8663945395140668459L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x020e, code lost:
        r6 = r6 ^ (java.lang.Long.rotateLeft(r2 * r14, 31) * 5545529020109919103L);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A01(byte[] r20) {
        /*
            r19 = this;
            r11 = r20
            int r0 = r11.length
            r18 = r0
            r0 = 16
            int r0 = r18 - r0
            int r3 = r0 + 1
            r6 = 0
            r4 = 0
            r10 = 0
        L_0x0010:
            r12 = 5545529020109919103(0x4cf5ad432745937f, double:5.573325460219186E62)
            r16 = -8663945395140668459(0x87c37b91114253d5, double:-2.8811287363897357E-271)
            if (r10 >= r3) goto L_0x0069
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r11)
            java.nio.ByteOrder r9 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r0 = r0.order(r9)
            long r0 = r0.getLong(r10)
            int r8 = r10 + 8
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r11)
            java.nio.ByteBuffer r2 = r2.order(r9)
            long r14 = r2.getLong(r8)
            int r10 = r8 + 8
            long r0 = r0 * r16
            r2 = 31
            long r0 = java.lang.Long.rotateLeft(r0, r2)
            long r0 = r0 * r12
            long r6 = r6 ^ r0
            r0 = 27
            long r6 = java.lang.Long.rotateLeft(r6, r0)
            long r6 = r6 + r4
            r0 = 5
            long r0 = (long) r0
            long r6 = r6 * r0
            r8 = 1390208809(0x52dce729, double:6.86854413E-315)
            long r6 = r6 + r8
            long r12 = r12 * r14
            r2 = 33
            long r8 = java.lang.Long.rotateLeft(r12, r2)
            long r8 = r8 * r16
            long r4 = r4 ^ r8
            r2 = 31
            long r4 = java.lang.Long.rotateLeft(r4, r2)
            long r4 = r4 + r6
            long r4 = r4 * r0
            r0 = 944331445(0x38495ab5, double:4.665617253E-315)
            long r4 = r4 + r0
            goto L_0x0010
        L_0x0069:
            r8 = 0
            r1 = r18 & 15
            r17 = 40
            r15 = 32
            r14 = 24
            switch(r1) {
                case 1: goto L_0x0203;
                case 2: goto L_0x01ee;
                case 3: goto L_0x01d7;
                case 4: goto L_0x01c4;
                case 5: goto L_0x01b6;
                case 6: goto L_0x01a6;
                case 7: goto L_0x0194;
                case 8: goto L_0x0182;
                case 9: goto L_0x0161;
                case 10: goto L_0x0150;
                case 11: goto L_0x00ef;
                case 12: goto L_0x00db;
                case 13: goto L_0x00cd;
                case 14: goto L_0x00bd;
                case 15: goto L_0x00ab;
                default: goto L_0x0076;
            }
        L_0x0076:
            r0 = r18
            long r2 = (long) r0
            long r6 = r6 ^ r2
            long r2 = r2 ^ r4
            long r6 = r6 + r2
            long r2 = r2 + r6
            r4 = 33
            long r0 = r6 >>> r4
            long r6 = r6 ^ r0
            r0 = -49064778989728563(0xff51afd7ed558ccd, double:-1.9406492979739223E305)
            long r6 = r6 * r0
            long r0 = r6 >>> r4
            long r6 = r6 ^ r0
            r0 = -4265267296055464877(0xc4ceb9fe1a85ec53, double:-2.902039044684214E23)
            long r6 = r6 * r0
            long r0 = r6 >>> r4
            long r6 = r6 ^ r0
            long r0 = r2 >>> r4
            long r2 = r2 ^ r0
            r0 = -49064778989728563(0xff51afd7ed558ccd, double:-1.9406492979739223E305)
            long r2 = r2 * r0
            long r0 = r2 >>> r4
            long r2 = r2 ^ r0
            r0 = -4265267296055464877(0xc4ceb9fe1a85ec53, double:-2.902039044684214E23)
            long r2 = r2 * r0
            long r0 = r2 >>> r4
            long r2 = r2 ^ r0
            long r6 = r6 + r2
            return r6
        L_0x00ab:
            int r1 = r10 + 14
            r0 = 48
            long r0 = A00(r11, r1, r0)
            long r0 = r0 ^ r8
            int r3 = r10 + 13
            r2 = r17
            long r8 = A00(r11, r3, r2)
            goto L_0x00c5
        L_0x00bd:
            int r1 = r10 + 13
            r0 = r17
            long r0 = A00(r11, r1, r0)
        L_0x00c5:
            long r0 = r0 ^ r8
            int r2 = r10 + 12
            long r8 = A00(r11, r2, r15)
            goto L_0x00d3
        L_0x00cd:
            int r0 = r10 + 12
            long r0 = A00(r11, r0, r15)
        L_0x00d3:
            long r0 = r0 ^ r8
            int r2 = r10 + 11
            long r8 = A00(r11, r2, r14)
            goto L_0x00e1
        L_0x00db:
            int r0 = r10 + 11
            long r0 = A00(r11, r0, r14)
        L_0x00e1:
            long r0 = r0 ^ r8
            int r2 = r10 + 10
            byte r2 = r20[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            short r2 = (short) r2
            long r8 = (long) r2
            r16 = 16
            long r8 = r8 << r16
            goto L_0x00fb
        L_0x00ef:
            int r0 = r10 + 10
            byte r0 = r20[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
            long r0 = (long) r0
            r16 = 16
            long r0 = r0 << r16
        L_0x00fb:
            long r0 = r0 ^ r8
            int r3 = r10 + 9
            r2 = 8
            long r2 = A00(r11, r3, r2)
            long r0 = r0 ^ r2
            int r3 = r10 + 8
            r2 = 0
            long r2 = A00(r11, r3, r2)
            long r0 = r0 ^ r2
            long r0 = r0 * r12
            r2 = 33
            long r2 = java.lang.Long.rotateLeft(r0, r2)
            r0 = -8663945395140668459(0x87c37b91114253d5, double:-2.8811287363897357E-271)
            long r2 = r2 * r0
            long r4 = r4 ^ r2
            int r1 = r10 + 7
            r0 = 56
            long r2 = A00(r11, r1, r0)
            r0 = 0
            long r2 = r2 ^ r0
            int r1 = r10 + 6
            r0 = 48
            long r0 = A00(r11, r1, r0)
            long r2 = r2 ^ r0
            int r1 = r10 + 5
            r0 = r17
            long r0 = A00(r11, r1, r0)
            long r2 = r2 ^ r0
            int r0 = r10 + 4
            long r0 = A00(r11, r0, r15)
            long r2 = r2 ^ r0
            int r0 = r10 + 3
            long r0 = A00(r11, r0, r14)
            long r2 = r2 ^ r0
            int r1 = r10 + 2
            r0 = r16
            long r0 = A00(r11, r1, r0)
            goto L_0x01e4
        L_0x0150:
            int r1 = r10 + 9
            r0 = 8
            long r0 = A00(r11, r1, r0)
            long r0 = r0 ^ r8
            int r3 = r10 + 8
            r2 = 0
            long r8 = A00(r11, r3, r2)
            goto L_0x0168
        L_0x0161:
            int r1 = r10 + 8
            r0 = 0
            long r0 = A00(r11, r1, r0)
        L_0x0168:
            long r0 = r0 ^ r8
            long r0 = r0 * r12
            r2 = 33
            long r2 = java.lang.Long.rotateLeft(r0, r2)
            r0 = -8663945395140668459(0x87c37b91114253d5, double:-2.8811287363897357E-271)
            long r2 = r2 * r0
            long r4 = r4 ^ r2
            int r1 = r10 + 7
            r0 = 56
            long r2 = A00(r11, r1, r0)
            r8 = 0
            goto L_0x018a
        L_0x0182:
            int r1 = r10 + 7
            r0 = 56
            long r2 = A00(r11, r1, r0)
        L_0x018a:
            long r2 = r2 ^ r8
            int r1 = r10 + 6
            r0 = 48
            long r8 = A00(r11, r1, r0)
            goto L_0x019c
        L_0x0194:
            int r1 = r10 + 6
            r0 = 48
            long r2 = A00(r11, r1, r0)
        L_0x019c:
            long r2 = r2 ^ r8
            int r1 = r10 + 5
            r0 = r17
            long r8 = A00(r11, r1, r0)
            goto L_0x01ae
        L_0x01a6:
            int r1 = r10 + 5
            r0 = r17
            long r2 = A00(r11, r1, r0)
        L_0x01ae:
            long r2 = r2 ^ r8
            int r0 = r10 + 4
            long r8 = A00(r11, r0, r15)
            goto L_0x01bc
        L_0x01b6:
            int r0 = r10 + 4
            long r2 = A00(r11, r0, r15)
        L_0x01bc:
            long r2 = r2 ^ r8
            int r0 = r10 + 3
            long r8 = A00(r11, r0, r14)
            goto L_0x01ca
        L_0x01c4:
            int r0 = r10 + 3
            long r2 = A00(r11, r0, r14)
        L_0x01ca:
            long r2 = r2 ^ r8
            int r0 = r10 + 2
            byte r0 = r20[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
            long r0 = (long) r0
            r8 = 16
            long r0 = r0 << r8
            goto L_0x01e4
        L_0x01d7:
            int r0 = r10 + 2
            byte r0 = r20[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
            long r2 = (long) r0
            r0 = 16
            long r2 = r2 << r0
            r0 = 0
        L_0x01e4:
            long r2 = r2 ^ r0
            int r1 = r10 + 1
            r0 = 8
            long r8 = A00(r11, r1, r0)
            goto L_0x01f6
        L_0x01ee:
            int r1 = r10 + 1
            r0 = 8
            long r2 = A00(r11, r1, r0)
        L_0x01f6:
            long r2 = r2 ^ r8
            r0 = 0
            long r0 = A00(r11, r10, r0)
            long r2 = r2 ^ r0
            r14 = -8663945395140668459(0x87c37b91114253d5, double:-2.8811287363897357E-271)
            goto L_0x020e
        L_0x0203:
            r14 = -8663945395140668459(0x87c37b91114253d5, double:-2.8811287363897357E-271)
            r0 = 0
            long r2 = A00(r11, r10, r0)
            long r2 = r2 ^ r8
        L_0x020e:
            long r2 = r2 * r14
            r0 = 31
            long r0 = java.lang.Long.rotateLeft(r2, r0)
            long r0 = r0 * r12
            long r6 = r6 ^ r0
            goto L_0x0076
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6M8.A01(byte[]):long");
    }
}
