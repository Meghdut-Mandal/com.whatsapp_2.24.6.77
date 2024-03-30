package X;

/* renamed from: X.74f  reason: invalid class name and case insensitive filesystem */
public class C1501674f implements Runnable {
    public Object A00;
    public final int A01;

    public C1501674f(AnonymousClass650 r2) {
        this.A01 = 27;
        this.A00 = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.5Mt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: X.5Lr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: X.5Mt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: X.5Mt} */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01cf, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r5 = r9.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01d2, code lost:
        if (r5 != null) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01d4, code lost:
        com.whatsapp.util.Log.e("PersistentStore/read-job-error:", r3);
        r5.A00.A01.A0E("jobmanager-job-read-error", r3.getMessage(), false);
        r2 = r20.rawQuery("SELECT count(1) from queue", (java.lang.String[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01f5, code lost:
        if (r2.moveToNext() != false) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01f7, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("PersistentStorage/read-jobs-error/numJobs:");
        X.C36351kA.A1R(r1, r2.getInt(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0215, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0218, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x03f6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x03f7, code lost:
        X.C05600Qi.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x03fa, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x040c, code lost:
        r0.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x040f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0586, code lost:
        X.C36391kE.A1Q(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0589, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0592, code lost:
        ((java.util.AbstractMap) r0.getValue()).clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x059b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x060c, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0115, code lost:
        if (r5 != 4) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0119, code lost:
        if (r6 == r23) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0134, code lost:
        r1 = new byte[r6];
        java.lang.System.arraycopy(r8, 0, r1, 0, r6);
        r8 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x013b, code lost:
        r1 = (org.whispersystems.jobqueue.Job) new java.io.ObjectInputStream(X.C90524aI.A0P(r8)).readObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r1.A08(r2);
        X.AnonymousClass6HV.A00(r9.A00, r1);
        r21.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x019a, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r6 = r9.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x019d, code lost:
        if (r6 != null) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x019f, code lost:
        com.whatsapp.util.Log.e("PersistentStore/read-job-error:", r7);
        r6.A00.A01.A0E("jobmanager-job-read-error", r7.getMessage(), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01b2, code lost:
        android.util.Log.w("PersistentStore", r7);
        r9.A00(r2);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01cf A[ExcHandler: SQLiteBlobTooBigException | IllegalStateException (r3v19 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:75:0x014a] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x00a3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r33 = this;
            r2 = r33
            int r0 = r2.A01
            switch(r0) {
                case 0: goto L_0x060e;
                case 1: goto L_0x05fd;
                case 2: goto L_0x05e0;
                case 3: goto L_0x05c3;
                case 4: goto L_0x05a8;
                case 5: goto L_0x059c;
                case 6: goto L_0x058a;
                case 7: goto L_0x0562;
                case 8: goto L_0x055a;
                case 9: goto L_0x04e6;
                case 10: goto L_0x04de;
                case 11: goto L_0x0467;
                case 12: goto L_0x0430;
                case 13: goto L_0x041a;
                case 14: goto L_0x0410;
                case 15: goto L_0x0406;
                case 16: goto L_0x03fe;
                case 17: goto L_0x0394;
                case 18: goto L_0x0370;
                case 19: goto L_0x0357;
                case 20: goto L_0x0321;
                case 21: goto L_0x0311;
                case 22: goto L_0x0309;
                case 23: goto L_0x0301;
                case 24: goto L_0x0278;
                case 25: goto L_0x0267;
                case 26: goto L_0x0254;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r10 = r2.A00
            X.650 r10 = (X.AnonymousClass650) r10
            X.6NH r9 = r10.A06
            r22 = 0
            java.lang.String r26 = "encrypted = 0"
            java.util.LinkedList r21 = X.C90524aI.A0l()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r9.A02     // Catch:{ all -> 0x0249 }
            r32 = r0
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r32.readLock()     // Catch:{ all -> 0x0249 }
            r0.lock()     // Catch:{ all -> 0x0249 }
            X.4bL r0 = r9.A03     // Catch:{ all -> 0x0249 }
            android.database.sqlite.SQLiteDatabase r20 = r0.getReadableDatabase()     // Catch:{ all -> 0x0249 }
            r19 = 1
            r18 = 0
        L_0x002a:
            java.lang.StringBuilder r2 = X.C90504aG.A0q(r18)     // Catch:{ all -> 0x0249 }
            java.lang.String r0 = ","
            r2.append(r0)     // Catch:{ all -> 0x0249 }
            r1 = 50
            java.lang.String r31 = X.C36381kD.A10(r2, r1)     // Catch:{ all -> 0x0249 }
            java.lang.String r24 = "queue"
            java.lang.String r30 = "_id ASC"
            r27 = r22
            r28 = r22
            r29 = r22
            r23 = r20
            r25 = r22
            android.database.Cursor r13 = r23.query(r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x0249 }
            int r0 = r13.getCount()     // Catch:{ all -> 0x023d }
            if (r0 != r1) goto L_0x0054
            int r18 = r18 + 50
            goto L_0x0056
        L_0x0054:
            r19 = 0
        L_0x0056:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x01bc
            java.lang.String r0 = "_id"
            long r2 = X.C36351kA.A07(r13, r0)     // Catch:{ all -> 0x023d }
            java.lang.String r0 = "item"
            java.lang.String r1 = X.C36341k9.A0f(r13, r0)     // Catch:{ all -> 0x023d }
            java.lang.String r0 = "encrypted"
            int r0 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x023d }
            r13.getInt(r0)     // Catch:{ all -> 0x023d }
            byte[] r12 = r1.getBytes()     // Catch:{ ClassNotFoundException -> 0x0160 }
            int r11 = r12.length     // Catch:{ ClassNotFoundException -> 0x0160 }
            int r0 = r11 * 3
            int r0 = r0 / 4
            r23 = r0
            byte[] r8 = new byte[r0]     // Catch:{ ClassNotFoundException -> 0x0160 }
            int[] r17 = X.C156797ay.A00     // Catch:{ ClassNotFoundException -> 0x0160 }
            r7 = 0
            r6 = 0
            r5 = 0
            r14 = 0
        L_0x0084:
            r15 = 4
            r4 = 2
            r1 = 1
            if (r14 >= r11) goto L_0x010e
            if (r5 != 0) goto L_0x00a4
        L_0x008b:
            int r16 = r14 + 4
            r0 = r16
            if (r0 > r11) goto L_0x00a1
            r0 = r17
            int r7 = X.C90504aG.A0D(r12, r0, r14)     // Catch:{ ClassNotFoundException -> 0x0160 }
            if (r7 < 0) goto L_0x00a1
            X.C90484aE.A1M(r8, r6, r7)     // Catch:{ ClassNotFoundException -> 0x0160 }
            int r6 = r6 + 3
            r14 = r16
            goto L_0x008b
        L_0x00a1:
            if (r14 < r11) goto L_0x00a4
            goto L_0x0117
        L_0x00a4:
            int r16 = r14 + 1
            byte r0 = r12[r14]     // Catch:{ ClassNotFoundException -> 0x0160 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r14 = r17[r0]     // Catch:{ ClassNotFoundException -> 0x0160 }
            r0 = -1
            if (r5 == 0) goto L_0x00fb
            if (r5 == r1) goto L_0x00f6
            r1 = -2
            if (r5 == r4) goto L_0x00e5
            r4 = 3
            if (r5 == r4) goto L_0x00c6
            if (r5 == r15) goto L_0x00c0
            r1 = 5
            if (r5 != r1) goto L_0x010a
            if (r14 == r0) goto L_0x010a
            goto L_0x0159
        L_0x00c0:
            if (r14 == r1) goto L_0x0109
            if (r14 == r0) goto L_0x010a
            goto L_0x0159
        L_0x00c6:
            if (r14 < 0) goto L_0x00d3
            int r0 = r7 << 6
            r14 = r14 | r0
            X.C90484aE.A1M(r8, r6, r14)     // Catch:{ ClassNotFoundException -> 0x0160 }
            int r6 = r6 + 3
            r7 = r14
            r5 = 0
            goto L_0x010a
        L_0x00d3:
            if (r14 != r1) goto L_0x00e2
            int r1 = r6 + 1
            int r0 = r7 >> 2
            byte r0 = (byte) r0     // Catch:{ ClassNotFoundException -> 0x0160 }
            r8[r1] = r0     // Catch:{ ClassNotFoundException -> 0x0160 }
            int r0 = r7 >> 10
            byte r0 = (byte) r0     // Catch:{ ClassNotFoundException -> 0x0160 }
            r8[r6] = r0     // Catch:{ ClassNotFoundException -> 0x0160 }
            goto L_0x0107
        L_0x00e2:
            if (r14 == r0) goto L_0x010a
            goto L_0x0159
        L_0x00e5:
            if (r14 >= 0) goto L_0x0100
            if (r14 != r1) goto L_0x00f3
            int r1 = r6 + 1
            int r0 = r7 >> 4
            byte r0 = (byte) r0     // Catch:{ ClassNotFoundException -> 0x0160 }
            r8[r6] = r0     // Catch:{ ClassNotFoundException -> 0x0160 }
            r6 = r1
            r5 = 4
            goto L_0x010a
        L_0x00f3:
            if (r14 == r0) goto L_0x010a
            goto L_0x0159
        L_0x00f6:
            if (r14 >= 0) goto L_0x0100
            if (r14 == r0) goto L_0x010a
            goto L_0x0159
        L_0x00fb:
            if (r14 >= 0) goto L_0x0103
            if (r14 == r0) goto L_0x010a
            goto L_0x0159
        L_0x0100:
            int r0 = r7 << 6
            r14 = r14 | r0
        L_0x0103:
            int r5 = r5 + 1
            r7 = r14
            goto L_0x010a
        L_0x0107:
            int r6 = r6 + 2
        L_0x0109:
            r5 = 5
        L_0x010a:
            r14 = r16
            goto L_0x0084
        L_0x010e:
            if (r5 == r1) goto L_0x0159
            if (r5 == r4) goto L_0x012b
            r0 = 3
            if (r5 == r0) goto L_0x011c
            if (r5 == r15) goto L_0x0159
        L_0x0117:
            r0 = r23
            if (r6 == r0) goto L_0x013b
            goto L_0x0134
        L_0x011c:
            int r1 = r6 + 1
            int r0 = r7 >> 10
            byte r0 = (byte) r0     // Catch:{ ClassNotFoundException -> 0x0160 }
            r8[r6] = r0     // Catch:{ ClassNotFoundException -> 0x0160 }
            int r6 = r1 + 1
            int r0 = r7 >> 2
            byte r0 = (byte) r0     // Catch:{ ClassNotFoundException -> 0x0160 }
            r8[r1] = r0     // Catch:{ ClassNotFoundException -> 0x0160 }
            goto L_0x0117
        L_0x012b:
            int r1 = r6 + 1
            int r0 = r7 >> 4
            byte r0 = (byte) r0     // Catch:{ ClassNotFoundException -> 0x0160 }
            r8[r6] = r0     // Catch:{ ClassNotFoundException -> 0x0160 }
            r6 = r1
            goto L_0x0117
        L_0x0134:
            byte[] r1 = new byte[r6]     // Catch:{ ClassNotFoundException -> 0x0160 }
            r0 = 0
            java.lang.System.arraycopy(r8, r0, r1, r0, r6)     // Catch:{ ClassNotFoundException -> 0x0160 }
            r8 = r1
        L_0x013b:
            java.io.ByteArrayInputStream r1 = X.C90524aI.A0P(r8)     // Catch:{ ClassNotFoundException -> 0x0160 }
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream     // Catch:{ ClassNotFoundException -> 0x0160 }
            r0.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x0160 }
            java.lang.Object r1 = r0.readObject()     // Catch:{ ClassNotFoundException -> 0x0160 }
            org.whispersystems.jobqueue.Job r1 = (org.whispersystems.jobqueue.Job) r1     // Catch:{ ClassNotFoundException -> 0x0160 }
            r1.A08(r2)     // Catch:{ IOException -> 0x019a, SQLiteBlobTooBigException | IllegalStateException -> 0x01cf, SQLiteBlobTooBigException | IllegalStateException -> 0x01cf }
            android.content.Context r0 = r9.A00     // Catch:{ IOException -> 0x019a, SQLiteBlobTooBigException | IllegalStateException -> 0x01cf, SQLiteBlobTooBigException | IllegalStateException -> 0x01cf }
            X.AnonymousClass6HV.A00(r0, r1)     // Catch:{ IOException -> 0x019a, SQLiteBlobTooBigException | IllegalStateException -> 0x01cf, SQLiteBlobTooBigException | IllegalStateException -> 0x01cf }
            r0 = r21
            r0.add(r1)     // Catch:{ IOException -> 0x019a, SQLiteBlobTooBigException | IllegalStateException -> 0x01cf, SQLiteBlobTooBigException | IllegalStateException -> 0x01cf }
            goto L_0x0056
        L_0x0159:
            java.lang.String r0 = "bad base-64"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ ClassNotFoundException -> 0x0160 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x0160 }
        L_0x0160:
            r5 = move-exception
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ RuntimeException -> 0x018a }
            r4.<init>()     // Catch:{ RuntimeException -> 0x018a }
            java.io.PrintWriter r0 = new java.io.PrintWriter     // Catch:{ RuntimeException -> 0x018a }
            r0.<init>(r4)     // Catch:{ RuntimeException -> 0x018a }
            r5.printStackTrace(r0)     // Catch:{ RuntimeException -> 0x018a }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ RuntimeException -> 0x018a }
            java.lang.String r0 = r5.getMessage()     // Catch:{ RuntimeException -> 0x018a }
            r1.append(r0)     // Catch:{ RuntimeException -> 0x018a }
            java.lang.String r0 = "\n"
            r1.append(r0)     // Catch:{ RuntimeException -> 0x018a }
            X.C36351kA.A1K(r4, r1)     // Catch:{ RuntimeException -> 0x018a }
            java.lang.String r0 = r1.toString()     // Catch:{ RuntimeException -> 0x018a }
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ RuntimeException -> 0x018a }
            throw r0     // Catch:{ RuntimeException -> 0x018a }
        L_0x018a:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()     // Catch:{ IOException -> 0x019a, SQLiteBlobTooBigException | IllegalStateException -> 0x01cf, SQLiteBlobTooBigException | IllegalStateException -> 0x01cf }
            boolean r0 = r0 instanceof java.lang.ClassNotFoundException     // Catch:{ IOException -> 0x019a, SQLiteBlobTooBigException | IllegalStateException -> 0x01cf, SQLiteBlobTooBigException | IllegalStateException -> 0x01cf }
            if (r0 == 0) goto L_0x0199
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x019a, SQLiteBlobTooBigException | IllegalStateException -> 0x01cf, SQLiteBlobTooBigException | IllegalStateException -> 0x01cf }
            r0.<init>(r1)     // Catch:{ IOException -> 0x019a, SQLiteBlobTooBigException | IllegalStateException -> 0x01cf, SQLiteBlobTooBigException | IllegalStateException -> 0x01cf }
            throw r0     // Catch:{ IOException -> 0x019a, SQLiteBlobTooBigException | IllegalStateException -> 0x01cf, SQLiteBlobTooBigException | IllegalStateException -> 0x01cf }
        L_0x0199:
            throw r1     // Catch:{ IOException -> 0x019a, SQLiteBlobTooBigException | IllegalStateException -> 0x01cf, SQLiteBlobTooBigException | IllegalStateException -> 0x01cf }
        L_0x019a:
            r7 = move-exception
            X.5kd r6 = r9.A01     // Catch:{ all -> 0x023d }
            if (r6 == 0) goto L_0x01b2
            java.lang.String r0 = "PersistentStore/read-job-error:"
            com.whatsapp.util.Log.e(r0, r7)     // Catch:{ all -> 0x023d }
            java.lang.String r5 = r7.getMessage()     // Catch:{ all -> 0x023d }
            java.lang.String r4 = "jobmanager-job-read-error"
            r1 = 0
            X.164 r0 = r6.A00     // Catch:{ all -> 0x023d }
            X.0wN r0 = r0.A01     // Catch:{ all -> 0x023d }
            r0.A0E(r4, r5, r1)     // Catch:{ all -> 0x023d }
        L_0x01b2:
            java.lang.String r0 = "PersistentStore"
            android.util.Log.w(r0, r7)     // Catch:{ all -> 0x023d }
            r9.A00(r2)     // Catch:{ all -> 0x023d }
            goto L_0x0056
        L_0x01bc:
            r13.close()     // Catch:{ all -> 0x0249 }
            if (r19 != 0) goto L_0x002a
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r32.readLock()
            r0.unlock()
            r21.size()
            X.6OM r2 = r10.A05
            monitor-enter(r2)
            goto L_0x0219
        L_0x01cf:
            r3 = move-exception
            X.5kd r5 = r9.A01     // Catch:{ all -> 0x023d }
            if (r5 == 0) goto L_0x0218
            java.lang.String r0 = "PersistentStore/read-job-error:"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x023d }
            java.lang.String r4 = r3.getMessage()     // Catch:{ all -> 0x023d }
            java.lang.String r2 = "jobmanager-job-read-error"
            r1 = 0
            X.164 r0 = r5.A00     // Catch:{ all -> 0x023d }
            X.0wN r0 = r0.A01     // Catch:{ all -> 0x023d }
            r0.A0E(r2, r4, r1)     // Catch:{ all -> 0x023d }
            java.lang.String r2 = "SELECT count(1) from queue"
            r1 = r20
            r0 = r22
            android.database.Cursor r2 = r1.rawQuery(r2, r0)     // Catch:{ all -> 0x023d }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0209 }
            if (r0 == 0) goto L_0x0215
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0209 }
            java.lang.String r0 = "PersistentStorage/read-jobs-error/numJobs:"
            r1.append(r0)     // Catch:{ all -> 0x0209 }
            r0 = 0
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0209 }
            X.C36351kA.A1R(r1, r0)     // Catch:{ all -> 0x0209 }
            goto L_0x0215
        L_0x0209:
            r1 = move-exception
            if (r2 == 0) goto L_0x0214
            r2.close()     // Catch:{ all -> 0x0210 }
            goto L_0x0214
        L_0x0210:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x023d }
        L_0x0214:
            throw r1     // Catch:{ all -> 0x023d }
        L_0x0215:
            r2.close()     // Catch:{ all -> 0x023d }
        L_0x0218:
            throw r3     // Catch:{ all -> 0x023d }
        L_0x0219:
            java.util.LinkedList r1 = r2.A01     // Catch:{ all -> 0x0264 }
            r0 = r21
            r1.addAll(r0)     // Catch:{ all -> 0x0264 }
            java.util.Iterator r1 = r21.iterator()     // Catch:{ all -> 0x0264 }
        L_0x0224:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0264 }
            if (r0 == 0) goto L_0x0234
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0264 }
            org.whispersystems.jobqueue.Job r0 = (org.whispersystems.jobqueue.Job) r0     // Catch:{ all -> 0x0264 }
            X.AnonymousClass6OM.A00(r0, r2)     // Catch:{ all -> 0x0264 }
            goto L_0x0224
        L_0x0234:
            X.78b r0 = r2.A05     // Catch:{ all -> 0x0264 }
            android.os.ConditionVariable r0 = r0.A00     // Catch:{ all -> 0x0264 }
            r0.open()     // Catch:{ all -> 0x0264 }
            goto L_0x060c
        L_0x023d:
            r1 = move-exception
            if (r13 == 0) goto L_0x0248
            r13.close()     // Catch:{ all -> 0x0244 }
            goto L_0x0248
        L_0x0244:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0249 }
        L_0x0248:
            throw r1     // Catch:{ all -> 0x0249 }
        L_0x0249:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r9.A02
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.unlock()
            throw r1
        L_0x0254:
            java.lang.Object r0 = r2.A00
            X.650 r0 = (X.AnonymousClass650) r0
            X.6OM r2 = r0.A05
            monitor-enter(r2)
            X.78b r0 = r2.A05     // Catch:{ all -> 0x0264 }
            android.os.ConditionVariable r0 = r0.A00     // Catch:{ all -> 0x0264 }
            r0.open()     // Catch:{ all -> 0x0264 }
            goto L_0x060c
        L_0x0264:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x0267:
            X.63A r1 = new X.63A
            r1.<init>()
            java.lang.String r0 = "SMS"
            r1.A01 = r0
            java.lang.Object r0 = r2.A00
            org.npci.upi.security.pinactivitycomponent.s r0 = (org.npci.upi.security.pinactivitycomponent.s) r0
            r0.A1a(r1)
            return
        L_0x0278:
            java.lang.Object r3 = r2.A00
            org.npci.upi.security.pinactivitycomponent.s r3 = (org.npci.upi.security.pinactivitycomponent.s) r3
            int r1 = r3.A00
            r0 = -1
            if (r1 == r0) goto L_0x060d
            java.util.ArrayList r4 = r3.A04
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x0289
            int r1 = r1 + -1
        L_0x0289:
            java.lang.Object r0 = r4.get(r1)
            boolean r0 = r0 instanceof X.C93104fl
            if (r0 == 0) goto L_0x060d
            android.view.View r0 = X.AnonymousClass000.A0Z(r4, r1)
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x02e5
            boolean r1 = r3.A06
            int r0 = r3.A00
            if (r1 == 0) goto L_0x02a3
            int r0 = r0 + -1
        L_0x02a3:
            X.4fl r4 = X.C90494aF.A0o(r4, r0)
            android.content.Context r0 = r3.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0
            X.65O r0 = r0.A0D
            boolean r0 = r0.A0G
            if (r0 == 0) goto L_0x02e8
            r4.A01()
            int r0 = r3.A01
            if (r0 <= 0) goto L_0x02e8
            java.lang.String r1 = r4.A0F
            java.lang.String r0 = "AADHAAR"
            boolean r1 = r1.equals(r0)
            r0 = 2131896283(0x7f1227db, float:1.9427423E38)
            if (r1 == 0) goto L_0x02c8
            r0 = 2131896282(0x7f1227da, float:1.942742E38)
        L_0x02c8:
            java.lang.String r7 = r3.A0n(r0)
            X.01I r1 = r3.A0h()
            r0 = 2131231832(0x7f080458, float:1.8079756E38)
            android.graphics.drawable.Drawable r5 = X.AnonymousClass00E.A00(r1, r0)
            r0 = 10
            X.6cn r6 = new X.6cn
            r6.<init>(r4, r2, r0)
            r8 = 0
            r9 = 1
            r10 = 1
            r4.Azo(r5, r6, r7, r8, r9, r10)
            return
        L_0x02e5:
            int r0 = r3.A00
            goto L_0x02a3
        L_0x02e8:
            java.lang.String r1 = r4.A0F
            java.lang.String r0 = "AADHAAR"
            boolean r1 = r1.equals(r0)
            r0 = 2131896338(0x7f122812, float:1.9427534E38)
            if (r1 == 0) goto L_0x02f8
            r0 = 2131896244(0x7f1227b4, float:1.9427344E38)
        L_0x02f8:
            java.lang.String r1 = r3.A0n(r0)
            r0 = 1
            r4.A02(r1, r0)
            return
        L_0x0301:
            java.lang.Object r1 = r2.A00
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            r0 = 0
            r1.A0G = r0
            return
        L_0x0309:
            java.lang.Object r0 = r2.A00
            X.35x r0 = (X.C599535x) r0
            X.17Y r0 = r0.A01
            goto L_0x040c
        L_0x0311:
            java.lang.Object r0 = r2.A00
            X.5Qb r0 = (X.C107585Qb) r0
            X.005 r0 = r0.A08
            java.lang.Object r0 = r0.get()
            X.66L r0 = (X.AnonymousClass66L) r0
            X.00T r0 = r0.A01
            goto L_0x0592
        L_0x0321:
            java.lang.Object r5 = r2.A00
            X.5Qb r5 = (X.C107585Qb) r5
            java.lang.String r0 = "CrosspostUnsentStatusManager/registerXmppListener network connected"
            r2 = 0
            X.AnonymousClass00C.A0D(r0, r2)
            X.1UM r1 = r5.A05
            X.1US r0 = X.AnonymousClass1US.CROSSPOST_UNSENT_STATUS_MANAGER
            boolean r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x060d
            java.lang.String r0 = "CrosspostUnsentStatusManager/scheduleSendUnsentCrosspostStatus started scheduling unsent crosspost statuses"
            X.AnonymousClass00C.A0D(r0, r2)
            java.lang.Runnable r1 = r5.A01
            if (r1 == 0) goto L_0x0343
            X.0wU r0 = r5.A04
            r0.Bnx(r1)
        L_0x0343:
            X.0wU r4 = r5.A04
            long r2 = X.C107585Qb.A0A
            r0 = 18
            X.74f r1 = new X.74f
            r1.<init>(r5, r0)
            java.lang.String r0 = "CrosspostUnsentStatusManager/scheduleSendUnsentCrosspostStatusRunnable"
            X.1jE r0 = r4.BpM(r1, r0, r2)
            r5.A01 = r0
            return
        L_0x0357:
            java.lang.Object r3 = r2.A00
            X.5Qb r3 = (X.C107585Qb) r3
            java.lang.String r0 = "CrosspostUnsentStatusManager/registerXmppListener network disconnected"
            r2 = 0
            X.AnonymousClass00C.A0D(r0, r2)
            java.lang.Runnable r1 = r3.A01
            if (r1 == 0) goto L_0x060d
            java.lang.String r0 = "CrosspostUnsentStatusManager/registerXmppListener cancelled"
            X.AnonymousClass00C.A0D(r0, r2)
            X.0wU r0 = r3.A04
            r0.Bnx(r1)
            return
        L_0x0370:
            java.lang.Object r2 = r2.A00
            X.5Qb r2 = (X.C107585Qb) r2
            java.lang.String r1 = "CrosspostUnsentStatusManager/sendUnsentCrosspostStatus called"
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.5Lr r0 = r2.A00
            X.C36331k8.A1E(r0)
            X.0wo r4 = r2.A03
            X.005 r5 = r2.A06
            X.005 r6 = r2.A09
            X.005 r7 = r2.A07
            X.005 r8 = r2.A08
            X.5Lr r3 = new X.5Lr
            r3.<init>(r4, r5, r6, r7, r8)
            r2.A00 = r3
            X.0wU r0 = r2.A04
            goto L_0x0586
        L_0x0394:
            java.lang.Object r0 = r2.A00
            X.2n9 r0 = (X.C51052n9) r0
            X.005 r0 = r0.A01
            java.lang.Object r8 = r0.get()
            X.6Tl r8 = (X.C132396Tl) r8
            X.1i6 r0 = r8.A01
            X.C35071i6.A00(r0)
            X.C35071i6.A00(r0)
            X.00i r7 = r0.A00
            monitor-enter(r7)
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x03fb }
            r5 = 0
            int r4 = r7.A00()     // Catch:{ all -> 0x03fb }
        L_0x03b4:
            if (r5 >= r4) goto L_0x03cb
            long r2 = r7.A02(r5)     // Catch:{ all -> 0x03fb }
            java.lang.Object r0 = r7.A04(r5)     // Catch:{ all -> 0x03fb }
            int r1 = X.AnonymousClass000.A0I(r0)     // Catch:{ all -> 0x03fb }
            r0 = 3
            if (r1 == r0) goto L_0x03c8
            X.C36391kE.A1W(r6, r2)     // Catch:{ all -> 0x03fb }
        L_0x03c8:
            int r5 = r5 + 1
            goto L_0x03b4
        L_0x03cb:
            java.util.Iterator r2 = r6.iterator()     // Catch:{ all -> 0x03fb }
        L_0x03cf:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x03fb }
            if (r0 == 0) goto L_0x03dd
            long r0 = X.C36391kE.A0D(r2)     // Catch:{ all -> 0x03fb }
            r7.A08(r0)     // Catch:{ all -> 0x03fb }
            goto L_0x03cf
        L_0x03dd:
            monitor-exit(r7)
            X.12P r0 = r8.A00
            X.1M0 r5 = r0.A05()
            X.14e r4 = r5.A02     // Catch:{ all -> 0x03f4 }
            java.lang.String r3 = "status_crossposting"
            java.lang.String r2 = "state <> 3"
            java.lang.String r1 = "XFamilyStatusCrosspostingStore/DELETE_ALL_NON_SUCCESS_RECORDS"
            r0 = 0
            r4.A03(r3, r2, r1, r0)     // Catch:{ all -> 0x03f4 }
            r5.close()
            return
        L_0x03f4:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x03f6 }
        L_0x03f6:
            r1 = move-exception
            X.C05600Qi.A00(r5, r0)
            throw r1
        L_0x03fb:
            r1 = move-exception
            monitor-exit(r7)
            throw r1
        L_0x03fe:
            java.lang.Object r1 = r2.A00
            com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity r1 = (com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity) r1
            r0 = 0
            r1.A00 = r0
            return
        L_0x0406:
            java.lang.Object r0 = r2.A00
            X.3GB r0 = (X.AnonymousClass3GB) r0
            X.17Y r0 = r0.A01
        L_0x040c:
            r0.A02()
            return
        L_0x0410:
            java.lang.Object r2 = r2.A00
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity r2 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity) r2
            r1 = 0
            r0 = 1
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity.A07(r2, r1, r1, r0)
            return
        L_0x041a:
            java.lang.Object r3 = r2.A00
            X.155 r3 = (X.AnonymousClass155) r3
            X.1Dv r2 = r3.A01
            X.1N3 r1 = r3.A04
            java.lang.String r0 = "https://www.facebook.com/privacy/policy"
            android.net.Uri r0 = r1.A00(r0)
            android.content.Intent r0 = X.C36391kE.A0G(r0)
            r2.A06(r3, r0)
            return
        L_0x0430:
            java.lang.Object r4 = r2.A00
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity r4 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity) r4
            X.1UZ r1 = r4.A07
            if (r1 == 0) goto L_0x0460
            java.lang.String r0 = "TAP_NATIVE_AUTH_DIFFERENT_ACCOUNT"
            r1.A04(r0)
            X.0v5 r0 = r4.A00
            if (r0 == 0) goto L_0x0459
            r0.A02()
            r3 = 0
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity"
            r2.setClassName(r1, r0)
            X.C05290Pd.A00(r4, r2, r3)
            r4.finish()
            return
        L_0x0459:
            java.lang.String r0 = "webAuthLauncher"
            java.lang.RuntimeException r1 = X.C36331k8.A0d(r0)
            throw r1
        L_0x0460:
            java.lang.String r0 = "xFamilyUserFlowLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0467:
            java.lang.Object r5 = r2.A00
            X.71g r5 = (X.C1494471g) r5
            r4 = 0
            X.AnonymousClass00C.A0D(r5, r4)
            java.util.concurrent.ConcurrentHashMap r1 = r5.A03
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            r1.clear()
            java.util.LinkedHashMap r9 = X.C36431kI.A1G()
            java.util.Iterator r8 = X.C36371kC.A10(r0)
        L_0x0481:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x04a0
            java.util.Map$Entry r3 = X.AnonymousClass000.A11(r8)
            java.lang.Object r0 = r3.getValue()
            X.AnonymousClass00C.A08(r0)
            long r6 = X.C36431kI.A09(r0)
            r1 = 60
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0481
            X.C36411kG.A1T(r9, r3)
            goto L_0x0481
        L_0x04a0:
            boolean r0 = r9.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x04cb
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FrequentWorkersAnomalyDetector/reportAnomalies too-frequent work detected: "
            X.C36321k7.A1L(r9, r0, r1)
            java.util.Iterator r3 = X.AnonymousClass000.A0y(r9)
        L_0x04b5:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x04cb
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r3)
            X.0wN r2 = r5.A00
            java.lang.String r1 = X.C90494aF.A0f(r0)
            java.lang.String r0 = "work-anomaly-FREQUENT_RUNNING_WORK"
            r2.A0E(r0, r1, r4)
            goto L_0x04b5
        L_0x04cb:
            X.0wU r4 = r5.A02
            r2 = 60000(0xea60, double:2.9644E-319)
            X.00T r0 = r5.A04
            java.lang.Object r1 = r0.getValue()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            java.lang.String r0 = "FrequentWorkersAnomalyDetector"
            r4.BpM(r1, r0, r2)
            return
        L_0x04de:
            java.lang.Object r0 = r2.A00
            com.facebook.shimmer.ShimmerFrameLayout r0 = (com.facebook.shimmer.ShimmerFrameLayout) r0
            r0.A02()
            return
        L_0x04e6:
            java.lang.Object r0 = r2.A00
            com.whatsapp.waffle.wfac.ui.WfacBanViewModel r0 = (com.whatsapp.waffle.wfac.ui.WfacBanViewModel) r0
            X.66X r2 = r0.A04
            X.61N r3 = new X.61N
            r3.<init>(r0)
            java.lang.String r0 = "WfacBanRepository/fetchBanStatus"
            X.AnonymousClass3TI.A01(r0)
            X.5rX r0 = r2.A00
            X.00T r0 = r0.A01
            android.content.SharedPreferences r1 = X.C36411kG.A0E(r0)
            java.lang.String r0 = "wfac_ban_status_token"
            java.lang.String r11 = X.C36371kC.A0t(r1, r0)
            if (r11 == 0) goto L_0x0555
            X.5rY r2 = r2.A01
            r1 = 1
            int r0 = r11.length()
            if (r0 == 0) goto L_0x0555
            X.0wD r0 = r2.A01
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x051b
            r3.A00(r1)
            return
        L_0x051b:
            X.19t r0 = r2.A00
            X.0w4 r0 = r0.A00
            X.0tq r0 = r0.A00
            X.0yC r7 = X.C36341k9.A0V(r0)
            X.0wt r9 = X.C90504aG.A0X(r0)
            X.0ww r5 = X.C36381kD.A0U(r0)
            X.0v0 r6 = X.C36351kA.A0Y(r0)
            X.005 r10 = X.C90514aH.A0i(r0)
            X.004 r12 = r0.A0f
            X.004 r13 = r0.A0e
            X.1WF r8 = X.C90484aE.A0Y(r0)
            X.5P7 r4 = new X.5P7
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = X.C224714l.A02()
            r0 = r0 ^ 1
            X.C18740tg.A0C(r0)
            r1 = 6
            X.6jd r0 = new X.6jd
            r0.<init>(r3, r2, r1)
            r4.Blp(r0)
            return
        L_0x0555:
            r0 = 3
            r3.A00(r0)
            return
        L_0x055a:
            java.lang.Object r0 = r2.A00
            X.6Md r0 = (X.C130716Md) r0
            X.C130716Md.A00(r0)
            return
        L_0x0562:
            java.lang.Object r2 = r2.A00
            X.6ow r2 = (X.C142476ow) r2
            java.lang.String r1 = "[WAFFLE]CrosspostUnsentStatusManager/sendUnsentCrosspostStatus called"
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.5Mt r0 = r2.A00
            X.C36331k8.A1E(r0)
            X.0wo r5 = r2.A02
            X.1A1 r8 = r2.A05
            com.whatsapp.bridge.wfal.WfalManager r4 = r2.A01
            X.6VF r6 = r2.A03
            X.1hw r9 = r2.A07
            X.66M r7 = r2.A04
            X.5Mt r3 = new X.5Mt
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2.A00 = r3
            X.0wU r0 = r2.A06
        L_0x0586:
            X.C36391kE.A1Q(r3, r0)
            return
        L_0x058a:
            java.lang.Object r0 = r2.A00
            X.6ow r0 = (X.C142476ow) r0
            X.66M r0 = r0.A04
            X.00T r0 = r0.A01
        L_0x0592:
            java.lang.Object r0 = r0.getValue()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            r0.clear()
            return
        L_0x059c:
            java.lang.Object r1 = r2.A00
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.run()
            return
        L_0x05a8:
            java.lang.Object r3 = r2.A00
            X.5xU r3 = (X.C124035xU) r3
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            X.005 r0 = r3.A05
            java.lang.Object r2 = r0.get()
            X.6Mw r2 = (X.AnonymousClass6Mw) r2
            X.6P0 r1 = X.C113435fX.A00
            X.6uB r0 = new X.6uB
            r0.<init>(r3)
            r2.A01(r1, r0)
            return
        L_0x05c3:
            java.lang.Object r3 = r2.A00
            X.6Ut r3 = (X.C132666Ut) r3
            r2 = 0
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x060d
            X.17Y r1 = r3.A01
            r0 = 2131896686(0x7f12296e, float:1.942824E38)
            r1.A05(r2, r0)
            X.50j r0 = r3.A05
            java.lang.String r3 = "SEE_AL_LOAD_PROGRESS"
            X.1UP r2 = r0.A00
            long r0 = r0.A00
            r2.flowMarkPoint(r0, r3)
            return
        L_0x05e0:
            java.lang.Object r0 = r2.A00
            android.content.Context r0 = (android.content.Context) r0
            r1 = 0
            X.1qm r2 = X.AnonymousClass3LW.A00(r0)
            r0 = 2131896685(0x7f12296d, float:1.9428238E38)
            r2.A0c(r0)
            r2.A0r(r1)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 0
            r2.A0h(r0, r1)
            X.C36341k9.A11(r2)
            return
        L_0x05fd:
            java.lang.Object r1 = r2.A00
            com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment r1 = (com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment) r1
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x060d
            r0 = 1
            r1.A0A = r0
            r1.A0q()
            return
        L_0x060c:
            monitor-exit(r2)
        L_0x060d:
            return
        L_0x060e:
            java.lang.Object r2 = r2.A00
            X.8rQ r2 = (X.C183828rQ) r2
            java.lang.Runnable r0 = r2.A04
            boolean r1 = X.AnonymousClass000.A1V(r0)
            java.lang.String r0 = "Camera Delayed Start Op should not be null if calling delayedStartOnCameraThread"
            X.C18740tg.A0D(r1, r0)
            r0 = 0
            r2.A04 = r0
            java.lang.String r0 = "voip/video/VoipCamera/ Trying to start camera again after delay."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.startOnCameraThread()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1501674f.run():void");
    }

    public C1501674f(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
