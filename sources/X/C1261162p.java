package X;

/* renamed from: X.62p  reason: invalid class name and case insensitive filesystem */
public class C1261162p {
    public final long A00;
    public final C121555tK A01;
    public final byte[] A02;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(java.io.InputStream r21, java.io.OutputStream r22, int r23, long r24, long r26) {
        /*
            r20 = this;
            r11 = 0
            r3 = 0
            r4 = r24
            int r0 = (r24 > r11 ? 1 : (r24 == r11 ? 0 : -1))
            r14 = r20
            r19 = r21
            if (r0 != 0) goto L_0x0097
            X.5tK r1 = r14.A01
            byte[] r2 = r1.A01
        L_0x0011:
            byte[] r0 = r1.A02
            javax.crypto.Mac r17 = X.AnonymousClass6R1.A02(r2, r0)
            long r6 = r14.A00
            int r0 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0075
            r9 = 0
        L_0x001e:
            r8 = 0
        L_0x001f:
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r10 = new byte[r0]
            r2 = r26
        L_0x0025:
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            r18 = r22
            if (r0 <= 0) goto L_0x00b3
            r0 = 8192(0x2000, double:4.0474E-320)
            long r0 = java.lang.Math.min(r2, r0)
            int r11 = (int) r0
            long r0 = (long) r11
            long r2 = r2 - r0
            r13 = 0
        L_0x0035:
            if (r13 >= r11) goto L_0x0044
            int r15 = r11 - r13
            r12 = r19
            int r12 = r12.read(r10, r13, r15)
            r15 = -1
            if (r12 == r15) goto L_0x00ac
            int r13 = r13 + r12
            goto L_0x0035
        L_0x0044:
            r13 = 0
            r12 = r17
            r12.update(r10, r13, r11)
            long r12 = r26 - r2
            long r15 = r24 + r12
            int r12 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r12 <= 0) goto L_0x0055
            long r15 = r15 - r6
            long r0 = r0 - r15
            int r11 = (int) r0
        L_0x0055:
            if (r11 <= 0) goto L_0x0069
            java.lang.String r0 = "cipher should not be null"
            X.C18740tg.A07(r9, r0)
            r12 = 0
            byte[] r11 = r9.update(r10, r12, r11)
            if (r11 == 0) goto L_0x006c
            int r1 = r11.length
            r0 = r18
            r0.write(r11, r12, r1)
        L_0x0069:
            r11 = 0
            goto L_0x0025
        L_0x006c:
            if (r8 != 0) goto L_0x0069
            java.lang.String r0 = "decryption failed"
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        L_0x0075:
            long r8 = r24 + r26
            r3 = 2
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            byte[] r1 = r1.A00
            if (r0 < 0) goto L_0x0084
            javax.crypto.Cipher r9 = X.AnonymousClass6R1.A01(r2, r1, r3)
            r8 = 1
            goto L_0x001f
        L_0x0084:
            java.lang.String r0 = "AES/CBC/NoPadding"
            javax.crypto.Cipher r9 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x010f }
            javax.crypto.spec.SecretKeySpec r1 = X.C90494aF.A0m(r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x010f }
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x010f }
            r0.<init>(r2)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x010f }
            r9.init(r3, r1, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x010f }
            goto L_0x001e
        L_0x0097:
            r1 = 16
            byte[] r2 = new byte[r1]
            r0 = r19
            int r0 = r0.read(r2, r3, r1)
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            X.C18740tg.A0C(r0)
            X.5tK r1 = r14.A01
            goto L_0x0011
        L_0x00ac:
            java.lang.String r0 = "Stream unexpectedly closed!"
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        L_0x00b3:
            if (r8 == 0) goto L_0x00d7
            if (r9 == 0) goto L_0x00d7
            byte[] r1 = r9.doFinal()     // Catch:{ IllegalBlockSizeException -> 0x00cc, BadPaddingException -> 0x00c1 }
            r0 = r18
            r0.write(r1)     // Catch:{ IllegalBlockSizeException -> 0x00cc, BadPaddingException -> 0x00c1 }
            goto L_0x00d7
        L_0x00c1:
            r0 = move-exception
            com.whatsapp.util.Log.w((java.lang.Throwable) r0)
            java.lang.String r0 = "Bad padding!"
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        L_0x00cc:
            r0 = move-exception
            com.whatsapp.util.Log.w((java.lang.Throwable) r0)
            java.lang.String r0 = "Bad block size!"
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        L_0x00d7:
            byte[] r3 = r17.doFinal()
            r1 = 10
            byte[] r2 = new byte[r1]
            r0 = 0
            java.lang.System.arraycopy(r3, r0, r2, r0, r1)
            byte[] r1 = r14.A02
            r3 = r23
            int r0 = r23 + 10
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
            boolean r0 = java.security.MessageDigest.isEqual(r0, r2)
            if (r0 == 0) goto L_0x00f4
            return
        L_0x00f4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ChunkCipherDecrypter/match failed at byte_offset="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", end_of_payload="
            java.lang.String r0 = X.C36371kC.A0z(r0, r1, r8)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1GY r0 = new X.1GY
            r0.<init>()
            throw r0
        L_0x010f:
            r0 = move-exception
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1261162p.A00(java.io.InputStream, java.io.OutputStream, int, long, long):void");
    }

    public C1261162p(C121555tK r3, byte[] bArr, long j) {
        this.A01 = r3;
        this.A02 = bArr;
        this.A00 = j - 10;
    }
}
