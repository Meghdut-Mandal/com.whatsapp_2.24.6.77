package X;

/* renamed from: X.1CY  reason: invalid class name */
public class AnonymousClass1CY {
    public final AnonymousClass1CZ A00;
    public final C24331Ca A01;

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078 A[SYNTHETIC, Splitter:B:33:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(java.lang.Runnable r15, java.util.List r16) {
        /*
            r14 = this;
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r7 = r16.iterator()
        L_0x0009:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0110
            java.lang.Object r6 = r7.next()
            java.io.File r6 = (java.io.File) r6
            r6.getPath()
            java.lang.String r0 = r6.getName()
            X.5U6 r2 = X.C110565as.A00(r0)
            X.5U6 r0 = X.AnonymousClass5U6.CRYPT12
            if (r2 != r0) goto L_0x0081
            java.lang.String r3 = "backupcipher/db/get/ioerror "
            boolean r2 = r6.exists()
            r0 = 0
            if (r2 != 0) goto L_0x0038
            java.lang.String r0 = "backupkey/db/getparams/does-not-exist"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0032:
            java.lang.String r0 = "backupencryption/getkeysforbackups/no-cipher/skip"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0009
        L_0x0038:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ 0tz -> 0x006f, FileNotFoundException -> 0x0054, IOException -> 0x004c, all -> 0x010e }
            r5.<init>(r6)     // Catch:{ 0tz -> 0x006f, FileNotFoundException -> 0x0054, IOException -> 0x004c, all -> 0x010e }
            X.63x r8 = X.AnonymousClass6YO.A03(r5)     // Catch:{ 0tz -> 0x004a, FileNotFoundException -> 0x0048, IOException -> 0x0046 }
            r5.close()     // Catch:{ Exception -> 0x00d3 }
            goto L_0x00d7
        L_0x0046:
            r2 = move-exception
            goto L_0x004e
        L_0x0048:
            r4 = move-exception
            goto L_0x0056
        L_0x004a:
            r2 = move-exception
            goto L_0x0071
        L_0x004c:
            r2 = move-exception
            r5 = r0
        L_0x004e:
            java.lang.String r0 = "backupcipher/db/get/error "
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0102 }
            goto L_0x0076
        L_0x0054:
            r4 = move-exception
            r5 = r0
        L_0x0056:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0102 }
            r2.<init>()     // Catch:{ all -> 0x0102 }
            java.lang.String r0 = "backupcipher/db/get/can't find "
            r2.append(r0)     // Catch:{ all -> 0x0102 }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ all -> 0x0102 }
            r2.append(r0)     // Catch:{ all -> 0x0102 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0102 }
            com.whatsapp.util.Log.e(r0, r4)     // Catch:{ all -> 0x0102 }
            goto L_0x0076
        L_0x006f:
            r2 = move-exception
            r5 = r0
        L_0x0071:
            java.lang.String r0 = "backupcipher/header-mismatch"
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x0102 }
        L_0x0076:
            if (r5 == 0) goto L_0x0032
            r5.close()     // Catch:{ Exception -> 0x007c }
            goto L_0x0032
        L_0x007c:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            goto L_0x0032
        L_0x0081:
            X.5U6 r0 = X.AnonymousClass5U6.CRYPT14
            if (r2 != r0) goto L_0x0032
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00fa }
            r3.<init>(r6)     // Catch:{ IOException -> 0x00fa }
            X.4uC r0 = X.C99934uC.DEFAULT_INSTANCE     // Catch:{ all -> 0x00f0 }
            X.8Hz r4 = X.C170918Hz.A06(r0, r3)     // Catch:{ all -> 0x00f0 }
            X.4uC r4 = (X.C99934uC) r4     // Catch:{ all -> 0x00f0 }
            if (r4 == 0) goto L_0x00ce
            int r2 = r4.keyType_     // Catch:{ all -> 0x00f0 }
            if (r2 == 0) goto L_0x009f
            r0 = 1
            if (r2 == r0) goto L_0x009c
            goto L_0x00a2
        L_0x009c:
            X.5U9 r2 = X.AnonymousClass5U9.HSM_CONTROLLED     // Catch:{ all -> 0x00f0 }
            goto L_0x00a4
        L_0x009f:
            X.5U9 r2 = X.AnonymousClass5U9.WA_PROVIDED     // Catch:{ all -> 0x00f0 }
            goto L_0x00a4
        L_0x00a2:
            X.5U9 r2 = X.AnonymousClass5U9.WA_PROVIDED     // Catch:{ all -> 0x00f0 }
        L_0x00a4:
            X.5U9 r0 = X.AnonymousClass5U9.WA_PROVIDED     // Catch:{ all -> 0x00f0 }
            if (r2 != r0) goto L_0x00ce
            X.4uG r2 = r4.waProvidedKeyData_     // Catch:{ all -> 0x00f0 }
            if (r2 != 0) goto L_0x00ae
            X.4uG r2 = X.C99974uG.DEFAULT_INSTANCE     // Catch:{ all -> 0x00f0 }
        L_0x00ae:
            X.AUx r0 = r2.backupCipherHeader_     // Catch:{ all -> 0x00f0 }
            byte[] r10 = r0.A06()     // Catch:{ all -> 0x00f0 }
            java.lang.String r9 = r2.keyVersion_     // Catch:{ all -> 0x00f0 }
            X.AUx r0 = r2.serverSalt_     // Catch:{ all -> 0x00f0 }
            byte[] r11 = r0.A06()     // Catch:{ all -> 0x00f0 }
            X.AUx r0 = r2.googleIdSalt_     // Catch:{ all -> 0x00f0 }
            byte[] r12 = r0.A06()     // Catch:{ all -> 0x00f0 }
            X.AUx r0 = r2.encryptionIv_     // Catch:{ all -> 0x00f0 }
            byte[] r13 = r0.A06()     // Catch:{ all -> 0x00f0 }
            X.63x r8 = new X.63x     // Catch:{ all -> 0x00f0 }
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00f0 }
            goto L_0x00cf
        L_0x00ce:
            r8 = 0
        L_0x00cf:
            r3.close()     // Catch:{ IOException -> 0x00fa }
            goto L_0x00d7
        L_0x00d3:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
        L_0x00d7:
            if (r8 == 0) goto L_0x0032
            byte[] r0 = r8.A02
            byte[] r4 = X.AnonymousClass6YO.A0G(r0)
            java.lang.String r3 = r8.A00
            byte[] r2 = r8.A04
            X.3GK r0 = new X.3GK
            r0.<init>(r3, r2, r4)
            r1.contains(r0)
            r1.add(r0)
            goto L_0x0009
        L_0x00f0:
            r2 = move-exception
            r3.close()     // Catch:{ all -> 0x00f5 }
            goto L_0x00f9
        L_0x00f5:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ IOException -> 0x00fa }
        L_0x00f9:
            throw r2     // Catch:{ IOException -> 0x00fa }
        L_0x00fa:
            r2 = move-exception
            java.lang.String r0 = "readProtobufBackupCipher/failed"
            com.whatsapp.util.Log.w(r0, r2)
            goto L_0x0032
        L_0x0102:
            r1 = move-exception
            if (r5 == 0) goto L_0x010f
            r5.close()     // Catch:{ Exception -> 0x0109 }
            throw r1
        L_0x0109:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            throw r1
        L_0x010e:
            r1 = move-exception
        L_0x010f:
            throw r1
        L_0x0110:
            int r7 = r1.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "backupencryption/getkeys/size "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = " (backups="
            r2.append(r0)
            int r0 = r16.size()
            r2.append(r0)
            java.lang.String r0 = ")"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1CZ r0 = r14.A00
            java.util.Map r0 = r0.A00
            r0.clear()
            java.util.Iterator r6 = r1.iterator()
        L_0x0144:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x017d
            java.lang.Object r2 = r6.next()
            X.3GK r2 = (X.AnonymousClass3GK) r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "backupencryption/getkeysforencryptedbackups/v="
            r1.append(r0)
            java.lang.String r5 = r2.A00
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            byte[] r4 = r2.A02
            java.util.Arrays.toString(r4)
            byte[] r3 = r2.A01
            java.util.Arrays.toString(r3)
            X.1Ca r2 = r14.A01
            r1 = 15
            X.1iP r0 = new X.1iP
            r0.<init>((java.lang.Object) r14, (int) r7, (int) r1, (java.lang.Object) r15)
            r2.A00(r0, r5, r4, r3)
            goto L_0x0144
        L_0x017d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CY.A00(java.lang.Runnable, java.util.List):int");
    }

    public AnonymousClass1CY(C24331Ca r1, AnonymousClass1CZ r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
