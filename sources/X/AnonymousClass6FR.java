package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.6FR  reason: invalid class name */
public final class AnonymousClass6FR {
    public File A00;
    public final C128486Cl A01;
    public final File A02;
    public final String A03;
    public final C24431Ck A04;
    public final C24341Cb A05;
    public final Object A06 = C36441kJ.A11();
    public final byte[] A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass6FR r5 = (AnonymousClass6FR) obj;
            if (!this.A02.equals(r5.A02) || !C1901797e.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public long A00() {
        if (!this.A04.A03.A2I() || this.A07 == null) {
            return this.A02.length();
        }
        return this.A02.length() + 16;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0098, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        com.whatsapp.util.Log.w("encb/EncBackupManager/encrypt media failed", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0098 A[ExcHandler: InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException (r0v14 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:14:0x0057] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File A01() {
        /*
            r10 = this;
            X.1Ck r3 = r10.A04
            X.0v0 r0 = r3.A03
            boolean r0 = r0.A2I()
            if (r0 == 0) goto L_0x00a3
            byte[] r2 = r10.A07
            if (r2 == 0) goto L_0x00a3
            java.lang.Object r4 = r10.A06
            monitor-enter(r4)
            java.io.File r0 = r10.A00     // Catch:{ all -> 0x00a0 }
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.exists()     // Catch:{ all -> 0x00a0 }
            if (r0 != 0) goto L_0x009c
        L_0x001b:
            X.1Cb r0 = r10.A05     // Catch:{ all -> 0x00a0 }
            X.0yG r0 = r0.A00()     // Catch:{ all -> 0x00a0 }
            X.C20850yG.A00(r0)     // Catch:{ all -> 0x00a0 }
            java.io.File r1 = r0.A03     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = r10.A03     // Catch:{ all -> 0x00a0 }
            java.io.File r0 = X.C90524aI.A0S(r0)     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x00a0 }
            java.io.File r8 = X.C36441kJ.A0w(r1, r0)     // Catch:{ all -> 0x00a0 }
            r10.A00 = r8     // Catch:{ all -> 0x00a0 }
            java.io.File r9 = r10.A02     // Catch:{ all -> 0x00a0 }
            java.lang.String r5 = "encb/EncBackupManager/encrypt media failed"
            X.1Ci r0 = r3.A01     // Catch:{ all -> 0x00a0 }
            byte[] r1 = r0.A03()     // Catch:{ all -> 0x00a0 }
            r7 = 0
            if (r1 == 0) goto L_0x009c
            r0 = 48
            byte[] r6 = X.AnonymousClass6R0.A00(r1, r2, r0)     // Catch:{ all -> 0x00a0 }
            r3 = 32
            byte[] r2 = new byte[r3]     // Catch:{ all -> 0x00a0 }
            java.lang.System.arraycopy(r6, r7, r2, r7, r3)     // Catch:{ all -> 0x00a0 }
            r1 = 16
            byte[] r0 = new byte[r1]     // Catch:{ all -> 0x00a0 }
            java.lang.System.arraycopy(r6, r3, r0, r7, r1)     // Catch:{ all -> 0x00a0 }
            javax.crypto.Cipher r3 = X.C90514aH.A19()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0098 }
            javax.crypto.spec.SecretKeySpec r2 = X.C90494aF.A0m(r2)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0098 }
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0098 }
            r1.<init>(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0098 }
            r0 = 1
            r3.init(r0, r2, r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0098 }
            java.io.FileInputStream r2 = X.C90524aI.A0U(r9)     // Catch:{ IOException -> 0x0093, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0098, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0098, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0098 }
            java.io.FileOutputStream r1 = X.C90524aI.A0W(r8)     // Catch:{ all -> 0x0089 }
            javax.crypto.CipherOutputStream r0 = new javax.crypto.CipherOutputStream     // Catch:{ all -> 0x0089 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x0089 }
            X.AnonymousClass6YY.A0J(r2, r0)     // Catch:{ all -> 0x007f }
            r0.close()     // Catch:{ all -> 0x0089 }
            r2.close()     // Catch:{ IOException -> 0x0093, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0098, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0098, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0098 }
            goto L_0x009c
        L_0x007f:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0084 }
            goto L_0x0088
        L_0x0084:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0089 }
        L_0x0088:
            throw r1     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x008e }
            goto L_0x0092
        L_0x008e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0093, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0098, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0098, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0098 }
        L_0x0092:
            throw r1     // Catch:{ IOException -> 0x0093, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0098, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0098, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0098 }
        L_0x0093:
            r0 = move-exception
            com.whatsapp.util.Log.w(r5, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0098 }
            goto L_0x009c
        L_0x0098:
            r0 = move-exception
            com.whatsapp.util.Log.w(r5, r0)     // Catch:{ all -> 0x00a0 }
        L_0x009c:
            java.io.File r0 = r10.A00     // Catch:{ all -> 0x00a0 }
            monitor-exit(r4)     // Catch:{ all -> 0x00a0 }
            return r0
        L_0x00a0:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00a0 }
            throw r0
        L_0x00a3:
            java.io.File r0 = r10.A02
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6FR.A01():java.io.File");
    }

    public void A02() {
        synchronized (this.A06) {
            File file = this.A00;
            if (file != null && file.exists() && !this.A00.delete()) {
                Log.w("local-file/cleanup/failed to delete a file");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0077, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0078, code lost:
        com.whatsapp.util.Log.e("encb/EncBackupManager/getMediaDecryptionHash failed", r1);
        r0 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0077 A[ExcHandler: InvalidKeyException | NoSuchAlgorithmException (r1v4 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:8:0x004f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6FR(X.C20690y0 r14, X.C24431Ck r15, X.C1273267v r16, X.AnonymousClass179 r17, X.C24341Cb r18, X.C20830yE r19, java.io.File r20, java.lang.String r21, java.lang.String r22) {
        /*
            r13 = this;
            r13.<init>()
            java.lang.Object r0 = X.C36441kJ.A11()
            r13.A06 = r0
            r2 = r20
            r13.A02 = r2
            r6 = r15
            r13.A04 = r15
            r0 = r18
            r13.A05 = r0
            X.0v0 r0 = r15.A03
            boolean r0 = r0.A2I()
            r7 = r22
            if (r0 == 0) goto L_0x00b4
            r0 = r21
            r1 = r16
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x00b4
            long r0 = r2.length()     // Catch:{ 4yP -> 0x00ae }
            r3 = r17
            r4 = r19
            java.lang.String r8 = X.C34191gb.A04(r3, r4, r2, r0)     // Catch:{ 4yP -> 0x00ae }
            if (r8 == 0) goto L_0x00b4
            long r9 = r2.length()
            long r11 = r2.lastModified()
            X.6Cl r5 = new X.6Cl
            r5.<init>(r6, r7, r8, r9, r11)
            r13.A01 = r5
            java.lang.String r5 = r5.A03
            java.lang.String r4 = "HmacSHA256"
            X.1Ci r0 = r15.A01
            byte[] r1 = r0.A03()
            javax.crypto.Mac r2 = javax.crypto.Mac.getInstance(r4)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x0077 }
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x0077 }
            r0.<init>(r1, r4)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x0077 }
            r2.init(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x0077 }
            byte[] r1 = r7.getBytes()     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x0077 }
            java.lang.String r0 = "SHA-256"
            byte[] r0 = X.C90504aG.A1a(r1, r0)     // Catch:{ NoSuchAlgorithmException -> 0x0071, InvalidKeyException | NoSuchAlgorithmException -> 0x0077 }
            r2.update(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x0077 }
            byte[] r0 = X.AnonymousClass14B.A0H(r5)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x0077 }
            byte[] r0 = r2.doFinal(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x0077 }
            goto L_0x007e
        L_0x0071:
            r0 = move-exception
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x0077 }
            throw r0     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x0077 }
        L_0x0077:
            r1 = move-exception
            java.lang.String r0 = "encb/EncBackupManager/getMediaDecryptionHash failed"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
        L_0x007e:
            r13.A07 = r0
            if (r0 == 0) goto L_0x00a7
            java.io.File r2 = r14.A0H()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = X.C18750th.A06(r0)
            r1.append(r0)
            java.lang.String r0 = ".mcrypt1"
            java.io.File r0 = X.C90464aC.A0K(r2, r0, r1)
            java.lang.String r0 = X.C34191gb.A05(r3, r0)
            if (r0 == 0) goto L_0x00a0
            r13.A03 = r0
            return
        L_0x00a0:
            java.lang.String r0 = "Filed to get a new uploadPath"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x00a7:
            java.lang.String r0 = "Filed to get media decryption hash"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x00ae:
            r1 = move-exception
            java.lang.String r0 = "gdrive/local-file/calcMd5() failed"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x00b4:
            r13.A03 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6FR.<init>(X.0y0, X.1Ck, X.67v, X.179, X.1Cb, X.0yE, java.io.File, java.lang.String, java.lang.String):void");
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A02;
        return AnonymousClass000.A0L(this.A01, A0M);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LocalFile{file=");
        A0u.append(this.A02);
        A0u.append(", metadata=");
        return C90464aC.A0X(this.A01, A0u);
    }
}
