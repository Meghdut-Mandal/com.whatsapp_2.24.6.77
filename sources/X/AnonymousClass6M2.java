package X;

/* renamed from: X.6M2  reason: invalid class name */
public final class AnonymousClass6M2 {
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0187, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x018b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A01(android.content.Context r12, java.lang.String r13) {
        /*
            r11 = this;
            r6 = 0
            X.C36331k8.A1I(r12, r13)
            java.lang.Boolean r0 = X.C18750th.A01
            java.io.ByteArrayOutputStream r3 = X.C90524aI.A0Q()
            java.lang.String r1 = r12.getPackageName()
            java.lang.String r0 = "com.whatsapp"
            if (r1 == 0) goto L_0x019a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x019a
            java.lang.String r4 = X.C19430v1.A0B     // Catch:{ IOException -> 0x0198 }
            X.AnonymousClass00C.A09(r4)     // Catch:{ IOException -> 0x0198 }
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r4)     // Catch:{ IOException -> 0x0198 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ IOException -> 0x0198 }
            byte[] r0 = X.C36371kC.A1Z(r1, r0)     // Catch:{ IOException -> 0x0198 }
            r3.write(r0)     // Catch:{ IOException -> 0x0198 }
            java.lang.Class<X.2wI> r1 = X.C56442wI.class
            java.lang.String r0 = "/res/drawable-hdpi/about_logo.png"
            java.io.InputStream r7 = r1.getResourceAsStream(r0)
            if (r7 != 0) goto L_0x003b
            java.lang.String r0 = "/res/drawable-hdpi-v4/about_logo.png"
            java.io.InputStream r7 = r1.getResourceAsStream(r0)
        L_0x003b:
            if (r7 != 0) goto L_0x0043
            java.lang.String r0 = "/res/drawable-xxhdpi-v4/about_logo.png"
            java.io.InputStream r7 = r1.getResourceAsStream(r0)
        L_0x0043:
            if (r7 != 0) goto L_0x0076
            android.content.res.Resources r7 = r12.getResources()
            android.util.DisplayMetrics r5 = new android.util.DisplayMetrics
            r5.<init>()
            r5.setToDefaults()
            r0 = 1069547520(0x3fc00000, float:1.5)
            r5.density = r0
            r1 = 1069547520(0x3fc00000, float:1.5)
            r0 = 240(0xf0, float:3.36E-43)
            r5.densityDpi = r0
            r5.scaledDensity = r1
            float r0 = (float) r0
            r5.xdpi = r0
            r5.ydpi = r0
            android.content.res.AssetManager r2 = r7.getAssets()
            android.content.res.Configuration r0 = r7.getConfiguration()
            android.content.res.Resources r1 = new android.content.res.Resources
            r1.<init>(r2, r5, r0)
            r0 = 2131230977(0x7f080101, float:1.8078022E38)
            java.io.InputStream r7 = r1.openRawResource(r0)
        L_0x0076:
            if (r7 == 0) goto L_0x0192
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r0]
            int r1 = r7.read(r2)     // Catch:{ all -> 0x0185 }
        L_0x0080:
            r0 = -1
            r5 = 0
            if (r1 == r0) goto L_0x008c
            r3.write(r2, r6, r1)     // Catch:{ all -> 0x0185 }
            int r1 = r7.read(r2)     // Catch:{ all -> 0x0185 }
            goto L_0x0080
        L_0x008c:
            r7.close()     // Catch:{ IOException -> 0x018c }
            byte[] r10 = r3.toByteArray()
            byte[] r9 = X.C113375fR.A00
            r8 = 128(0x80, float:1.794E-43)
            r7 = 512(0x200, float:7.175E-43)
            java.lang.String r6 = "PBKDF2WithHmacSHA1And8BIT"
            int r3 = r10.length
            char[] r2 = new char[r3]
            r1 = 0
        L_0x009f:
            if (r1 >= r3) goto L_0x00a9
            byte r0 = r10[r1]
            char r0 = (char) r0
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x009f
        L_0x00a9:
            javax.crypto.SecretKey r1 = X.C18750th.A08(r6, r9, r2, r8, r7)
            byte[] r0 = r1.getEncoded()
            A00(r0)
            java.lang.String r0 = "HMACSHA1"
            javax.crypto.Mac r3 = javax.crypto.Mac.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x017f, InvalidKeyException -> 0x0179 }
            X.AnonymousClass00C.A08(r3)     // Catch:{ NoSuchAlgorithmException -> 0x017f, InvalidKeyException -> 0x0179 }
            r3.init(r1)     // Catch:{ NoSuchAlgorithmException -> 0x017f, InvalidKeyException -> 0x0179 }
            android.content.pm.Signature[] r2 = X.AnonymousClass1L0.A04(r12)
            r1 = 1
            if (r2 == 0) goto L_0x00cf
            int r0 = r2.length
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            if (r0 != 0) goto L_0x00cf
            r1 = 0
        L_0x00cf:
            if (r1 != 0) goto L_0x0173
            X.AnonymousClass00C.A0B(r2)
            int r1 = r2.length
        L_0x00d5:
            if (r5 >= r1) goto L_0x00e6
            r0 = r2[r5]
            byte[] r0 = r0.toByteArray()
            A00(r0)
            r3.update(r0)
            int r5 = r5 + 1
            goto L_0x00d5
        L_0x00e6:
            java.lang.String r0 = r12.getPackageCodePath()     // Catch:{ Exception -> 0x012f }
            java.util.zip.ZipFile r7 = new java.util.zip.ZipFile     // Catch:{ Exception -> 0x012f }
            r7.<init>(r0)     // Catch:{ Exception -> 0x012f }
            java.lang.String r0 = "classes.dex"
            java.util.zip.ZipEntry r0 = r7.getEntry(r0)     // Catch:{ all -> 0x0125 }
            java.io.InputStream r6 = r7.getInputStream(r0)     // Catch:{ all -> 0x0125 }
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r0)     // Catch:{ all -> 0x0119 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x0119 }
        L_0x0103:
            int r1 = r6.read(r2)     // Catch:{ all -> 0x0119 }
            if (r1 <= 0) goto L_0x010e
            r0 = 0
            r5.update(r2, r0, r1)     // Catch:{ all -> 0x0119 }
            goto L_0x0103
        L_0x010e:
            byte[] r0 = r5.digest()     // Catch:{ all -> 0x0119 }
            r6.close()     // Catch:{ all -> 0x0125 }
            r7.close()     // Catch:{ Exception -> 0x012f }
            goto L_0x013b
        L_0x0119:
            r1 = move-exception
            if (r6 == 0) goto L_0x0124
            r6.close()     // Catch:{ all -> 0x0120 }
            goto L_0x0124
        L_0x0120:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0125 }
        L_0x0124:
            throw r1     // Catch:{ all -> 0x0125 }
        L_0x0125:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x012a }
            goto L_0x012e
        L_0x012a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x012f }
        L_0x012e:
            throw r1     // Catch:{ Exception -> 0x012f }
        L_0x012f:
            r1 = move-exception
            java.lang.String r0 = "app/md5/bytes/error "
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r0 = "null"
            byte[] r0 = r0.getBytes(r4)     // Catch:{ UnsupportedEncodingException -> 0x016c }
        L_0x013b:
            X.AnonymousClass00C.A0B(r0)
            A00(r0)
            r3.update(r0)
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r4)     // Catch:{ UnsupportedEncodingException -> 0x0166 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ UnsupportedEncodingException -> 0x0166 }
            byte[] r0 = X.C36371kC.A1Z(r13, r0)     // Catch:{ UnsupportedEncodingException -> 0x0166 }
            A00(r0)
            r3.update(r0)
            byte[] r1 = r3.doFinal()
            X.AnonymousClass00C.A08(r1)
            android.os.ConditionVariable r0 = X.C18740tg.A00
            java.lang.String r0 = X.C36441kJ.A13(r1)
            X.AnonymousClass00C.A08(r0)
            return r0
        L_0x0166:
            r0 = move-exception
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)
            throw r0
        L_0x016c:
            r1 = move-exception
            java.lang.Error r0 = new java.lang.Error
            r0.<init>(r1)
            throw r0
        L_0x0173:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0179:
            r0 = move-exception
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)
            throw r0
        L_0x017f:
            r0 = move-exception
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)
            throw r0
        L_0x0185:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0187 }
        L_0x0187:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ IOException -> 0x018c }
            throw r0     // Catch:{ IOException -> 0x018c }
        L_0x018c:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0192:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0198:
            r0 = move-exception
            throw r0
        L_0x019a:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6M2.A01(android.content.Context, java.lang.String):java.lang.String");
    }

    public static final void A00(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            int i = 0;
            if (length != 0) {
                StringBuilder A0h = C90524aI.A0h(length * 2);
                do {
                    byte b = bArr[i];
                    char c = (char) ((b >>> 4) & 15);
                    char c2 = (char) (b & 15);
                    char c3 = 'W';
                    char c4 = '0';
                    if (c >= 10) {
                        c4 = 'W';
                    }
                    char c5 = (char) (c + c4);
                    if (c2 < 10) {
                        c3 = '0';
                    }
                    A0h.append(c5);
                    A0h.append((char) (c2 + c3));
                    i++;
                } while (i < length);
                AnonymousClass00C.A08(A0h.toString());
            }
        }
    }
}
