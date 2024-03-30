package X;

/* renamed from: X.6XX  reason: invalid class name */
public class AnonymousClass6XX implements AnonymousClass7gU {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass6XX(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02ea, code lost:
        if (X.AnonymousClass000.A1X(r4.get(32000, java.util.concurrent.TimeUnit.MILLISECONDS)) != false) goto L_0x02ec;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C131006Ni Boj() {
        /*
            r13 = this;
            int r0 = r13.A02
            if (r0 == 0) goto L_0x0041
            java.lang.Object r7 = r13.A00
            X.1Q9 r7 = (X.AnonymousClass1Q9) r7
            java.lang.Object r6 = r13.A01
            X.7hk r6 = (X.C158587hk) r6
            X.1QN r0 = r7.A0L
            r0.A00()
            X.12s r0 = r7.A0J
            r0.A02()
            r5 = 100
            java.io.File r1 = r7.A0H()
            X.5U6 r0 = X.AnonymousClass5U6.A01()
            java.util.ArrayList r0 = X.AnonymousClass6YO.A06(r0)
            java.util.ArrayList r4 = X.AnonymousClass6YO.A08(r1, r0)
            java.io.File r0 = r7.A0H()
            X.AnonymousClass6YO.A0E(r0, r4)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x01e7
            java.lang.String r0 = "MessageStoreBackup/restore/backupfiles/none-found"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            X.6Ni r4 = new X.6Ni
            r4.<init>(r0)
        L_0x0040:
            return r4
        L_0x0041:
            java.lang.Object r0 = r13.A00
            X.0xD r0 = (X.C20220xD) r0
            java.lang.Object r1 = r13.A01
            X.32v r1 = (X.C591532v) r1
            X.1Q9 r3 = r0.A09
            java.lang.String r0 = "MessageStoreBackup/restoreFromMigration"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2dM r0 = r1.A00
            X.4c6 r7 = r0.A02
            boolean r0 = r7.isCancelled()
            java.lang.String r12 = "MessageStoreBackup/restoreFromMigration/canceled"
            if (r0 != 0) goto L_0x0308
            X.1QN r0 = r3.A0L
            r0.A00()
            X.12s r0 = r3.A0J
            r0.A02()
            X.1Ch r2 = r3.A0V
            java.lang.String r0 = "MigrateFileDirectlyHelper/migrateMsgStoreFile/filePath=msg_store"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0v0 r9 = r2.A03
            java.lang.String r6 = r9.A0f()
            java.lang.String r1 = r9.A0h()
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MigrateFileDirectlyHelper/migrateMsgStoreFile/registered cc is "
            r4.append(r0)
            r4.append(r6)
            java.lang.String r0 = " phone number"
            r4.append(r0)
            r0 = 42
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            java.lang.String r0 = X.AnonymousClass14B.A09(r0, r1)
            X.C36321k7.A1a(r4, r0)
            r5 = 0
            X.0yb r10 = r2.A01     // Catch:{ IOException -> 0x0130, SecurityException -> 0x0132 }
            X.0ya r4 = r10.A0O()     // Catch:{ IOException -> 0x0130, SecurityException -> 0x0132 }
            java.lang.String r8 = "msg_store"
            android.net.Uri r1 = X.C24401Ch.A01(r8, r6, r1)     // Catch:{ IOException -> 0x0130, SecurityException -> 0x0132 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r6 = r4.A05(r1, r0)     // Catch:{ IOException -> 0x0130, SecurityException -> 0x0132 }
            if (r6 == 0) goto L_0x010d
            java.io.FileDescriptor r0 = r6.getFileDescriptor()     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x010d
            X.0ya r4 = r10.A0O()     // Catch:{ all -> 0x0124 }
            java.lang.String r1 = r9.A0f()     // Catch:{ all -> 0x0124 }
            java.lang.String r0 = r9.A0h()     // Catch:{ all -> 0x0124 }
            android.net.Uri r1 = X.C24401Ch.A01(r8, r1, r0)     // Catch:{ all -> 0x0124 }
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)     // Catch:{ all -> 0x0124 }
            android.content.ContentResolver r0 = X.C21050ya.A00(r4)     // Catch:{ all -> 0x0124 }
            java.lang.String r1 = r0.getType(r1)     // Catch:{ all -> 0x0124 }
            X.0wG r0 = r2.A02     // Catch:{ all -> 0x0124 }
            java.io.File r0 = X.C90514aH.A0j(r0)     // Catch:{ all -> 0x0124 }
            java.io.File r4 = X.C36441kJ.A0w(r0, r1)     // Catch:{ all -> 0x0124 }
            boolean r0 = r4.exists()     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x00f7
            boolean r0 = r4.delete()     // Catch:{ all -> 0x0124 }
            if (r0 != 0) goto L_0x00f7
            java.lang.String r0 = "MigrateFileDirectlyHelper/migrateMsgStoreFile/failed-to-delete"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0124 }
            r1 = 15
            X.54f r0 = new X.54f     // Catch:{ all -> 0x0124 }
            r0.<init>(r1)     // Catch:{ all -> 0x0124 }
            android.util.Pair r0 = X.C36441kJ.A0Q(r0, r5)     // Catch:{ all -> 0x0124 }
            r6.close()     // Catch:{ IOException -> 0x0130, SecurityException -> 0x0132 }
            goto L_0x01be
        L_0x00f7:
            java.io.FileDescriptor r0 = r6.getFileDescriptor()     // Catch:{ all -> 0x0124 }
            int r1 = X.C24401Ch.A00(r2, r4, r0)     // Catch:{ all -> 0x0124 }
            X.54f r0 = new X.54f     // Catch:{ all -> 0x0124 }
            r0.<init>(r1)     // Catch:{ all -> 0x0124 }
            android.util.Pair r0 = X.C36441kJ.A0Q(r0, r4)     // Catch:{ all -> 0x0124 }
            r6.close()     // Catch:{ IOException -> 0x0130, SecurityException -> 0x0132 }
            goto L_0x01be
        L_0x010d:
            java.lang.String r0 = "MigrateFileDirectlyHelper/migrateMsgStoreFile/consumer file is null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0124 }
            r1 = 15
            X.54f r0 = new X.54f     // Catch:{ all -> 0x0124 }
            r0.<init>(r1)     // Catch:{ all -> 0x0124 }
            android.util.Pair r0 = X.C36441kJ.A0Q(r0, r5)     // Catch:{ all -> 0x0124 }
            if (r6 == 0) goto L_0x01be
            r6.close()     // Catch:{ IOException -> 0x0130, SecurityException -> 0x0132 }
            goto L_0x01be
        L_0x0124:
            r1 = move-exception
            if (r6 == 0) goto L_0x012f
            r6.close()     // Catch:{ all -> 0x012b }
            goto L_0x012f
        L_0x012b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0130, SecurityException -> 0x0132 }
        L_0x012f:
            throw r1     // Catch:{ IOException -> 0x0130, SecurityException -> 0x0132 }
        L_0x0130:
            r0 = move-exception
            goto L_0x0133
        L_0x0132:
            r0 = move-exception
        L_0x0133:
            java.lang.String r6 = r0.toString()
            java.lang.String r4 = "MigrateFileDirectlyHelper/parseErrorCodeIfPossible/"
            java.lang.String r0 = ":\\s"
            java.lang.String[] r8 = r6.split(r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            int r1 = r8.length     // Catch:{ NumberFormatException -> 0x01a8 }
            r0 = 2
            if (r1 != r0) goto L_0x01ac
            r0 = 1
            r0 = r8[r0]     // Catch:{ NumberFormatException -> 0x01a8 }
            int r8 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ NumberFormatException -> 0x01a8 }
            java.lang.String r0 = "MigrateFileDirectlyHelper/parseErrorCodeIfPossible/error while fetching msg store: error is = "
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            switch(r8) {
                case 0: goto L_0x019d;
                case 1: goto L_0x019a;
                case 2: goto L_0x0197;
                case 3: goto L_0x0194;
                case 4: goto L_0x0191;
                case 5: goto L_0x018e;
                case 6: goto L_0x018b;
                case 7: goto L_0x0188;
                case 8: goto L_0x0185;
                case 9: goto L_0x0182;
                case 10: goto L_0x017f;
                case 11: goto L_0x017c;
                case 12: goto L_0x0179;
                case 13: goto L_0x0176;
                case 14: goto L_0x0173;
                case 15: goto L_0x0170;
                case 16: goto L_0x016d;
                case 17: goto L_0x016a;
                case 18: goto L_0x0167;
                case 19: goto L_0x0164;
                case 20: goto L_0x0161;
                default: goto L_0x0156;
            }     // Catch:{ NumberFormatException -> 0x01a8 }
        L_0x0156:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ NumberFormatException -> 0x01a8 }
            java.lang.String r0 = "state is not recognized = "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r8)     // Catch:{ NumberFormatException -> 0x01a8 }
            throw r0     // Catch:{ NumberFormatException -> 0x01a8 }
        L_0x0161:
            java.lang.String r0 = "FAILED_DECRYPTION_KEY_MISSING"
            goto L_0x019f
        L_0x0164:
            java.lang.String r0 = "SUCCESS_TRANSFER_DB_FILE"
            goto L_0x019f
        L_0x0167:
            java.lang.String r0 = "BACKUP_FAILED_INVALID"
            goto L_0x019f
        L_0x016a:
            java.lang.String r0 = "BACKUP_FAILED_OUT_OF_SPACE"
            goto L_0x019f
        L_0x016d:
            java.lang.String r0 = "BACKUP_FAILED_GENERIC"
            goto L_0x019f
        L_0x0170:
            java.lang.String r0 = "FAILED_TO_GET_BACKUP_FILE"
            goto L_0x019f
        L_0x0173:
            java.lang.String r0 = "MSG_DB_DOES_NOT_EXIST"
            goto L_0x019f
        L_0x0176:
            java.lang.String r0 = "PHONE_NUMBER_MISMATCH"
            goto L_0x019f
        L_0x0179:
            java.lang.String r0 = "INCORRECT_FILE_MODE"
            goto L_0x019f
        L_0x017c:
            java.lang.String r0 = "REQUESTER_APP_VERSION_INCORRECT"
            goto L_0x019f
        L_0x017f:
            java.lang.String r0 = "INCORRECT_CALLER_PACKAGE_NAME"
            goto L_0x019f
        L_0x0182:
            java.lang.String r0 = "APP_SIGNATURE_MISMATCH"
            goto L_0x019f
        L_0x0185:
            java.lang.String r0 = "PROVIDER_SERVER_PROP_NOT_ENABLED"
            goto L_0x019f
        L_0x0188:
            java.lang.String r0 = "FAILED_CANCELED"
            goto L_0x019f
        L_0x018b:
            java.lang.String r0 = "FAILED_MSG_STORE_ALREADY_EXISTS"
            goto L_0x019f
        L_0x018e:
            java.lang.String r0 = "FAILED_OUT_OF_SPACE"
            goto L_0x019f
        L_0x0191:
            java.lang.String r0 = "FAILED_FILE_INTEGRITY_CHECK"
            goto L_0x019f
        L_0x0194:
            java.lang.String r0 = "FAILED_JID_MISMATCH"
            goto L_0x019f
        L_0x0197:
            java.lang.String r0 = "SUCCESS_CREATED"
            goto L_0x019f
        L_0x019a:
            java.lang.String r0 = "SUCCESS_RESTORED"
            goto L_0x019f
        L_0x019d:
            java.lang.String r0 = "FAILED"
        L_0x019f:
            X.C36321k7.A1Z(r1, r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            X.54f r1 = new X.54f     // Catch:{ NumberFormatException -> 0x01a8 }
            r1.<init>(r8)     // Catch:{ NumberFormatException -> 0x01a8 }
            goto L_0x01ba
        L_0x01a8:
            r0 = move-exception
            com.whatsapp.util.Log.e(r4, r0)
        L_0x01ac:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            X.C36321k7.A1P(r4, r6, r0)
            r0 = 15
            X.54f r1 = new X.54f
            r1.<init>(r0)
        L_0x01ba:
            android.util.Pair r0 = X.C36441kJ.A0Q(r1, r5)
        L_0x01be:
            java.lang.Object r4 = r0.first
            X.6Ni r4 = (X.C131006Ni) r4
            java.lang.Object r5 = r0.second
            java.io.File r5 = (java.io.File) r5
            boolean r0 = r7.isCancelled()
            if (r0 != 0) goto L_0x0308
            r1 = 19
            int r0 = r4.A00
            if (r1 != r0) goto L_0x0040
            if (r5 == 0) goto L_0x0040
            java.lang.String r0 = "MessageStoreBackup/restoreFromMigration/received-file-decrypting"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = r5.getName()
            X.5U6 r1 = X.C110565as.A00(r0)
            X.5U6 r0 = X.AnonymousClass5U6.CRYPT15
            if (r1 != r0) goto L_0x02c1
            r8 = 0
            goto L_0x0223
        L_0x01e7:
            java.util.Iterator r3 = r4.iterator()
        L_0x01eb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0209
            java.io.File r2 = X.C90504aG.A0a(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MessageStoreBackup/restore/backupfiles "
            X.C90474aD.A16(r2, r0, r1)
            java.lang.String r0 = " ("
            X.C90464aC.A19(r2, r0, r1)
            java.lang.String r0 = ")"
            X.C36321k7.A1a(r1, r0)
            goto L_0x01eb
        L_0x0209:
            X.12P r2 = r7.A0K
            r2.A06()
            java.io.File r1 = r2.A03
            java.lang.String r0 = "restore"
            boolean r0 = X.AnonymousClass1Q9.A0A(r1, r0)
            if (r0 == 0) goto L_0x021e
            r2.A06()
            X.AnonymousClass6YY.A0P(r1)
        L_0x021e:
            X.6Ni r4 = X.AnonymousClass1Q9.A01(r7, r6, r4, r5)
            return r4
        L_0x0223:
            java.lang.String r0 = "RSA"
            java.security.KeyPairGenerator r1 = java.security.KeyPairGenerator.getInstance(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            r0 = 2024(0x7e8, float:2.836E-42)
            r1.initialize(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            java.security.KeyPair r11 = r1.generateKeyPair()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            android.os.Bundle r10 = X.AnonymousClass001.A07()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            java.lang.String r1 = "query_param_country_code"
            java.lang.String r0 = r9.A0f()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            r10.putString(r1, r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            java.lang.String r1 = "query_param_phone_number"
            java.lang.String r0 = r9.A0h()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            r10.putString(r1, r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            java.lang.String r1 = "pk"
            java.security.PublicKey r0 = r11.getPublic()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            byte[] r0 = r0.getEncoded()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            r10.putByteArray(r1, r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            X.0yb r0 = r2.A01     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            X.0ya r6 = r0.A0O()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            java.lang.String r4 = ""
            java.lang.String r1 = r9.A0f()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            java.lang.String r0 = r9.A0h()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            android.net.Uri r1 = X.C24401Ch.A01(r4, r1, r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            java.lang.String r0 = "retrieve_rk"
            android.os.Bundle r10 = r6.A04(r1, r10, r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            if (r10 != 0) goto L_0x0278
            java.lang.String r0 = "MigrateFileDirectlyHelper/migrateBackupEncryptionKey null returned"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            goto L_0x0313
        L_0x0278:
            java.security.PrivateKey r0 = r11.getPrivate()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            byte[] r1 = r0.getEncoded()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            java.lang.String r0 = "erk"
            byte[] r0 = X.C24401Ch.A02(r10, r0, r1)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            if (r0 != 0) goto L_0x028f
            java.lang.String r0 = "MigrateFileDirectlyHelper/migrateBackupEncryptionKey root key is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            goto L_0x0313
        L_0x028f:
            X.1Ci r6 = r2.A00     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            r6.A02(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            java.lang.String r0 = "ph"
            byte[] r4 = X.C24401Ch.A02(r10, r0, r1)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            java.lang.String r0 = "ps"
            byte[] r2 = X.C24401Ch.A02(r10, r0, r1)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            java.lang.String r1 = "ic"
            r0 = 100000(0x186a0, float:1.4013E-40)
            int r1 = r10.getInt(r1, r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            r0 = 1
            r9.A1z(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            if (r4 == 0) goto L_0x02bd
            if (r2 == 0) goto L_0x02bd
            X.5sm r0 = new X.5sm     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            r0.<init>(r4, r2, r1)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            r6.A01(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            r9.A20(r8)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            goto L_0x02ec
        L_0x02bd:
            r9.A20(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x030d }
            goto L_0x02ec
        L_0x02c1:
            X.1CY r6 = r3.A0G
            X.777 r4 = new X.777
            r4.<init>()
            java.util.List r2 = java.util.Collections.singletonList(r5)
            r1 = 26
            X.1j5 r0 = new X.1j5
            r0.<init>(r6, r4, r1)
            r6.A00(r0, r2)
            java.lang.String r0 = "MessageStoreBackup/restoreFromMigration/try to get cipher key"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0304 }
            r0 = 3
            r3.A00 = r0     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0304 }
            r1 = 32000(0x7d00, double:1.581E-319)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0304 }
            java.lang.Object r0 = r4.get(r1, r0)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0304 }
            boolean r0 = X.AnonymousClass000.A1X(r0)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0304 }
            if (r0 == 0) goto L_0x0313
        L_0x02ec:
            boolean r0 = r7.isCancelled()
            if (r0 != 0) goto L_0x0308
            java.lang.String r0 = "MessageStoreBackup/restoreFromMigration/restore-db-from-backup-now"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.List r2 = java.util.Collections.singletonList(r5)
            r1 = 1
            r0 = 0
            X.6Ni r0 = X.AnonymousClass1Q9.A01(r3, r0, r2, r1)
            int r0 = r0.A00
            goto L_0x0315
        L_0x0304:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/restoreFromMigration/exception"
            goto L_0x0310
        L_0x0308:
            com.whatsapp.util.Log.i((java.lang.String) r12)
            r0 = 7
            goto L_0x0315
        L_0x030d:
            r1 = move-exception
            java.lang.String r0 = "MigrateFileDirectlyHelper/migrateBackupEncryptionKey failed"
        L_0x0310:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0313:
            r0 = 20
        L_0x0315:
            X.54f r4 = new X.54f
            r4.<init>(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6XX.Boj():X.6Ni");
    }
}
