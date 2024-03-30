package com.whatsapp.quicklog;

import X.C124565yP;
import X.C36371kC;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class QplUploadScheduler$QPLUploadWorker extends Worker {
    public final C124565yP A00;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00fa, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r1.A04.B6o(r5.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01bb, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r1.A04.B6o(r3.getMessage());
        r1.A00 = false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01bb A[ExcHandler: Exception | OutOfMemoryError (r3v9 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:27:0x0097] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C109385Xj A09() {
        /*
            r26 = this;
            r0 = r26
            X.5yP r1 = r0.A00
            X.0zT r2 = r1.A02
            java.util.concurrent.Semaphore r0 = r2.A04     // Catch:{ InterruptedException -> 0x020b }
            r25 = r0
            r4 = 5
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x020b }
            boolean r0 = r0.tryAcquire(r4, r3)     // Catch:{ InterruptedException -> 0x020b }
            if (r0 == 0) goto L_0x020b
            r0 = 0
            r1.A00 = r0     // Catch:{ all -> 0x0206 }
            java.lang.String r10 = ".txt"
            java.io.File[] r9 = X.C21580zT.A00(r2, r10)     // Catch:{ all -> 0x0206 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0206 }
            long r3 = X.C21580zT.A07     // Catch:{ all -> 0x0206 }
            long r7 = r7 - r3
            r6 = 0
        L_0x0025:
            int r3 = r9.length     // Catch:{ all -> 0x0206 }
            if (r6 >= r3) goto L_0x003a
            r3 = r9[r6]     // Catch:{ all -> 0x0206 }
            long r4 = r3.lastModified()     // Catch:{ all -> 0x0206 }
            int r3 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x0037
            r3 = r9[r6]     // Catch:{ all -> 0x0206 }
            r2.A01(r3)     // Catch:{ all -> 0x0206 }
        L_0x0037:
            int r6 = r6 + 1
            goto L_0x0025
        L_0x003a:
            java.io.File[] r9 = X.C21580zT.A00(r2, r10)     // Catch:{ all -> 0x0206 }
            X.0wG r3 = r2.A00     // Catch:{ all -> 0x0206 }
            java.io.File r4 = X.C90524aI.A0R(r3)     // Catch:{ all -> 0x0206 }
            java.lang.String r3 = "qpl"
            java.io.File r7 = X.C36441kJ.A0w(r4, r3)     // Catch:{ all -> 0x0206 }
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0206 }
            int r12 = r9.length     // Catch:{ all -> 0x0206 }
            r5 = 0
        L_0x0050:
            if (r5 >= r12) goto L_0x006f
            r4 = r9[r5]     // Catch:{ all -> 0x0206 }
            java.lang.String r3 = r4.getName()     // Catch:{ IOException -> 0x0062 }
            java.io.File r3 = X.AnonymousClass6YY.A04(r4, r7, r3)     // Catch:{ IOException -> 0x0062 }
            if (r3 == 0) goto L_0x006c
            r6.add(r3)     // Catch:{ IOException -> 0x0062 }
            goto L_0x006c
        L_0x0062:
            r3 = move-exception
            X.0zI r4 = r2.A03     // Catch:{ all -> 0x0206 }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x0206 }
            r4.B6l(r3)     // Catch:{ all -> 0x0206 }
        L_0x006c:
            int r5 = r5 + 1
            goto L_0x0050
        L_0x006f:
            java.io.File[] r3 = new java.io.File[r0]     // Catch:{ all -> 0x0206 }
            java.lang.Object[] r6 = r6.toArray(r3)     // Catch:{ all -> 0x0206 }
            java.io.File[] r6 = (java.io.File[]) r6     // Catch:{ all -> 0x0206 }
            int r8 = r6.length     // Catch:{ all -> 0x0206 }
            if (r8 != 0) goto L_0x0097
            X.0zG r0 = r1.A05     // Catch:{ all -> 0x0206 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0206 }
            X.005 r0 = r0.A00     // Catch:{ all -> 0x0206 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0206 }
            X.0v0 r0 = (X.C19420v0) r0     // Catch:{ all -> 0x0206 }
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)     // Catch:{ all -> 0x0206 }
            java.lang.String r0 = "qpl_last_upload_ts"
            X.C36341k9.A0w(r1, r0, r2)     // Catch:{ all -> 0x0206 }
            X.4ox r0 = X.C97344ox.A00()     // Catch:{ all -> 0x0206 }
            goto L_0x0202
        L_0x0097:
            android.os.ConditionVariable r11 = new android.os.ConditionVariable     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            r11.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            r3 = 4
            X.7sR r4 = new X.7sR     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            r4.<init>(r11, r1, r3)     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            r3 = 17
            android.net.TrafficStats.setThreadStatsTag(r3)     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            X.0yd r7 = r1.A06     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            X.0wt r3 = r1.A07     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            java.lang.String r19 = r3.A02()     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            X.0ww r5 = r1.A01     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            java.lang.String r18 = "https://graph.whatsapp.net/wa_qpl_data"
            r21 = 8
            r13 = 0
            X.6VO r3 = new X.6VO     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            r22 = 0
            r23 = 0
            r24 = 0
            r15 = r5
            r16 = r4
            r17 = r7
            r20 = r13
            r14 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            java.lang.String r5 = "access_token"
            java.lang.String r4 = "1063127757113399|745146ffa34413f9dbb5469f5370b7af"
            r3.A06(r5, r4)     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            X.0zL r7 = r1.A03     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            java.lang.String r5 = X.AnonymousClass6JD.A0C     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            java.lang.String r4 = "app_id"
            r3.A06(r4, r5)     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            r4 = 0
        L_0x00da:
            r5 = r6[r4]     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            java.io.FileInputStream r15 = X.C90524aI.A0U(r5)     // Catch:{ FileNotFoundException -> 0x00fa, Exception | OutOfMemoryError -> 0x01bb }
            java.lang.String r16 = "batches[]"
            java.lang.String r17 = r5.getName()     // Catch:{ FileNotFoundException -> 0x00fa, Exception | OutOfMemoryError -> 0x01bb }
            long r21 = r5.length()     // Catch:{ FileNotFoundException -> 0x00fa, Exception | OutOfMemoryError -> 0x01bb }
            r19 = 0
            java.util.List r10 = r3.A0C     // Catch:{ FileNotFoundException -> 0x00fa, Exception | OutOfMemoryError -> 0x01bb }
            X.5x9 r5 = new X.5x9     // Catch:{ FileNotFoundException -> 0x00fa, Exception | OutOfMemoryError -> 0x01bb }
            r18 = 0
            r14 = r5
            r14.<init>(r15, r16, r17, r18, r19, r21)     // Catch:{ FileNotFoundException -> 0x00fa, Exception | OutOfMemoryError -> 0x01bb }
            r10.add(r5)     // Catch:{ FileNotFoundException -> 0x00fa, Exception | OutOfMemoryError -> 0x01bb }
            goto L_0x0104
        L_0x00fa:
            r5 = move-exception
            X.0zI r10 = r1.A04     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            java.lang.String r5 = r5.getMessage()     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            r10.B6o(r5)     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
        L_0x0104:
            int r4 = r4 + 1
            if (r4 < r8) goto L_0x00da
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            java.lang.String r4 = "upload_time"
            r3.A06(r4, r5)     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            X.0zG r4 = r7.A05     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            long r4 = r4.A00()     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            java.lang.String r4 = "user_id"
            r3.A06(r4, r5)     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            org.json.JSONObject r14 = X.C36441kJ.A1B()     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            X.0yb r10 = r7.A00     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            android.telephony.TelephonyManager r15 = r10.A0K()     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            if (r15 == 0) goto L_0x0142
            java.lang.String r5 = "carrier"
            java.lang.String r4 = r15.getNetworkOperatorName()     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            r14.put(r5, r4)     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            java.lang.String r5 = "country"
            java.lang.String r4 = r15.getSimCountryIso()     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            r14.put(r5, r4)     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
        L_0x0142:
            java.lang.String r15 = "device_name"
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            java.lang.String r5 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            r4.append(r5)     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            java.lang.String r5 = "-"
            r4.append(r5)     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            java.lang.String r5 = android.os.Build.MODEL     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            java.lang.String r4 = X.AnonymousClass000.A0q(r5, r4)     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            r14.put(r15, r4)     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            java.lang.String r15 = "device_code_name"
            java.lang.String r4 = android.os.Build.DEVICE     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            r14.put(r15, r4)     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            java.lang.String r15 = "device_manufacturer"
            java.lang.String r4 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            r14.put(r15, r4)     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            java.lang.String r4 = "device_model"
            r14.put(r4, r5)     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            java.lang.String r5 = "year_class"
            X.0wg r4 = r7.A03     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            int r4 = X.AnonymousClass1K2.A02(r10, r4)     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            r14.put(r5, r4)     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            java.lang.String r5 = "mem_class"
            int r4 = X.C26391Jz.A00(r10)     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            r14.put(r5, r4)     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            java.lang.String r5 = "device_os_version"
            java.lang.String r4 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            r14.put(r5, r4)     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            java.lang.String r4 = "is_employee"
            r14.put(r4, r0)     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            java.lang.String r10 = "oc_version"
            X.0wG r4 = r7.A01     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            android.content.Context r4 = r4.A00     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            long r4 = X.C26651Kz.A00(r4)     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            r14.put(r10, r4)     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            java.lang.String r5 = r14.toString()     // Catch:{ Exception -> 0x01a0, Exception | OutOfMemoryError -> 0x01bb }
            goto L_0x01ac
        L_0x01a0:
            r4 = move-exception
            X.0zI r7 = r7.A04     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            r5 = -1
            java.lang.String r4 = r4.getMessage()     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            r7.BNs(r5, r4)     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            r5 = 0
        L_0x01ac:
            java.lang.String r4 = "batch_info"
            r3.A06(r4, r5)     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            r3.A04(r13)     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            r3 = 100000(0x186a0, double:4.94066E-319)
            r11.block(r3)     // Catch:{ Exception | OutOfMemoryError -> 0x01bb }
            goto L_0x01c7
        L_0x01bb:
            r3 = move-exception
            X.0zI r4 = r1.A04     // Catch:{ all -> 0x0206 }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x0206 }
            r4.B6o(r3)     // Catch:{ all -> 0x0206 }
            r1.A00 = r0     // Catch:{ all -> 0x0206 }
        L_0x01c7:
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ all -> 0x0206 }
            r4 = 0
        L_0x01cb:
            r3 = r6[r4]     // Catch:{ all -> 0x0206 }
            r2.A01(r3)     // Catch:{ all -> 0x0206 }
            int r4 = r4 + 1
            if (r4 < r8) goto L_0x01cb
            boolean r3 = r1.A00     // Catch:{ all -> 0x0206 }
            if (r3 != 0) goto L_0x01dd
            X.4ov r0 = X.C97324ov.A00()     // Catch:{ all -> 0x0206 }
            goto L_0x0202
        L_0x01dd:
            if (r0 >= r12) goto L_0x01e7
            r3 = r9[r0]     // Catch:{ all -> 0x0206 }
            r2.A01(r3)     // Catch:{ all -> 0x0206 }
            int r0 = r0 + 1
            goto L_0x01dd
        L_0x01e7:
            X.0zG r0 = r1.A05     // Catch:{ all -> 0x0206 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0206 }
            X.005 r0 = r0.A00     // Catch:{ all -> 0x0206 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0206 }
            X.0v0 r0 = (X.C19420v0) r0     // Catch:{ all -> 0x0206 }
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)     // Catch:{ all -> 0x0206 }
            java.lang.String r0 = "qpl_last_upload_ts"
            X.C36341k9.A0w(r1, r0, r2)     // Catch:{ all -> 0x0206 }
            X.4ox r0 = X.C97344ox.A00()     // Catch:{ all -> 0x0206 }
        L_0x0202:
            r25.release()
            return r0
        L_0x0206:
            r0 = move-exception
            r25.release()
            throw r0
        L_0x020b:
            X.4ov r0 = X.C97324ov.A00()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.quicklog.QplUploadScheduler$QPLUploadWorker.A09():X.5Xj");
    }

    public QplUploadScheduler$QPLUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A00 = (C124565yP) C36371kC.A0P(context).AfI.A00.A3W.get();
    }
}
