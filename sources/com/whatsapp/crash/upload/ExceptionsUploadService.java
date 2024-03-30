package com.whatsapp.crash.upload;

import X.AnonymousClass6N6;
import X.AnonymousClass6Sj;
import X.C122475uu;
import X.C124205xl;
import X.C130226Kf;
import X.C132266Sw;
import X.C18700tb;
import X.C18800tq;
import X.C18830tt;
import X.C21860zv;
import X.C25781Hq;
import X.C31091bG;
import X.C31131bK;
import X.C31141bL;
import X.C36441kJ;
import X.C39171rR;

public class ExceptionsUploadService extends C39171rR implements C18700tb {
    public C132266Sw A00;
    public C21860zv A01;
    public AnonymousClass6Sj A02;
    public C124205xl A03;
    public C122475uu A04;
    public C130226Kf A05;
    public AnonymousClass6N6 A06;
    public C25781Hq A07;
    public boolean A08;
    public final Object A09;
    public volatile C31091bG A0A;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0298, code lost:
        if (r0 != false) goto L_0x029a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(android.content.Intent r27) {
        /*
            r26 = this;
            java.lang.String r0 = "app_version_changed"
            r1 = r27
            boolean r6 = X.C36421kH.A1T(r1, r0)
            r1 = r26
            X.5xl r8 = r1.A03
            X.0wG r7 = r8.A01
            android.content.Context r5 = r7.A00
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()
            java.io.File r2 = r5.getFilesDir()
            java.lang.String r0 = "crash_sentinel"
            java.io.File r2 = X.C36441kJ.A0w(r2, r0)
            r0 = 0
            X.C36361kB.A1O(r2, r0, r12)
            java.lang.String r2 = "account_switching"
            java.lang.String r0 = "unknown_process_name"
            java.lang.String[] r11 = new java.lang.String[]{r2, r0}
            r10 = 2
            r9 = 0
        L_0x002c:
            r4 = r11[r9]
            java.io.File r3 = r5.getFilesDir()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "crash_sentinel_"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r4, r2)
            java.io.File r0 = X.C36441kJ.A0w(r3, r0)
            X.C36361kB.A1O(r0, r4, r12)
            int r9 = r9 + 1
            if (r9 < r10) goto L_0x002c
            java.util.Iterator r16 = r12.iterator()
            r4 = 1
            r17 = 0
        L_0x004e:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01bd
            java.lang.Object r0 = r16.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r2 = r0.first
            java.io.File r2 = (java.io.File) r2
            boolean r2 = r2.exists()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r0.first
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r3 = r0.second
            java.lang.String r3 = (java.lang.String) r3
            byte[] r9 = X.AnonymousClass14R.A00(r2)     // Catch:{ Exception -> 0x01ae }
            java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x01ae }
            r2.<init>(r9)     // Catch:{ Exception -> 0x01ae }
            org.json.JSONObject r9 = X.C36441kJ.A1C(r2)     // Catch:{ Exception -> 0x01ae }
            java.lang.String r2 = "isOom"
            boolean r25 = r9.getBoolean(r2)     // Catch:{ Exception -> 0x01ae }
            java.lang.String r2 = "deepestThrowable"
            java.lang.String r19 = r9.getString(r2)     // Catch:{ Exception -> 0x01ae }
            java.lang.String r2 = "versionName"
            java.lang.String r20 = r9.getString(r2)     // Catch:{ Exception -> 0x01ae }
            java.lang.String r2 = "mobileBuildId"
            long r23 = r9.getLong(r2)     // Catch:{ Exception -> 0x01ae }
            java.lang.String r2 = "stacktrace"
            java.lang.String r21 = r9.getString(r2)     // Catch:{ Exception -> 0x01ae }
            java.lang.String r2 = "sessionId"
            java.lang.String r22 = r9.getString(r2)     // Catch:{ Exception -> 0x01ae }
            X.5x4 r2 = new X.5x4     // Catch:{ Exception -> 0x01ae }
            r18 = r2
            r18.<init>(r19, r20, r21, r22, r23, r25)     // Catch:{ Exception -> 0x01ae }
            X.0zv r9 = r8.A04
            r17 = r9
            java.util.Map r12 = r17.A01()
            X.58Y r10 = new X.58Y
            r10.<init>()
            boolean r9 = r2.A05
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10.A01 = r9
            java.lang.Long r9 = X.C90474aD.A0Y()
            r10.A02 = r9
            java.lang.String r9 = r2.A01
            r10.A07 = r9
            java.lang.String r11 = r2.A03
            r10.A06 = r11
            r10.A0A = r3
            java.lang.String r9 = r2.A02
            boolean r3 = r9.isEmpty()
            if (r3 != 0) goto L_0x0101
            X.0z6 r3 = r8.A03
            X.00T r3 = r3.A01
            android.content.SharedPreferences r14 = X.C36411kG.A0E(r3)
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0u()
            java.lang.String r3 = "running_tasks_"
            java.lang.String r3 = X.AnonymousClass000.A0p(r3, r9, r13)
            java.lang.String r3 = X.C36371kC.A0t(r14, r3)
            r10.A09 = r3
            java.lang.Object r3 = r12.get(r9)
            java.io.File r3 = (java.io.File) r3
            if (r3 == 0) goto L_0x0101
            X.5tI r12 = X.C21860zv.A00(r3)
            java.lang.String r3 = r12.A02
            r10.A03 = r3
            java.lang.String r3 = r12.A01
            r10.A08 = r3
            java.lang.Integer r3 = r12.A00
            r10.A00 = r3
        L_0x0101:
            java.lang.String r14 = r2.A04
            r10.A04 = r14
            X.0yW r3 = r8.A06
            r3.Blv(r10)
            java.io.File r10 = X.C90524aI.A0R(r7)
            java.lang.String r3 = "java_stack_trace"
            java.io.File r10 = X.C36441kJ.A0w(r10, r3)
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0u()
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0u()
            long r2 = r2.A00
            java.lang.StringBuilder r15 = X.AnonymousClass000.A0v(r14)
            java.lang.String r14 = "("
            r15.append(r14)
            r15.append(r2)
            java.lang.String r14 = X.C90474aD.A0f(r15)
            int r2 = com.whatsapp.util.Log.level
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "### begin stack trace "
            r3.append(r2)
            r3.append(r14)
            java.lang.String r2 = "\n"
            java.lang.String r2 = X.AnonymousClass000.A0q(r2, r3)
            java.lang.String r2 = X.AnonymousClass000.A0p(r2, r11, r13)
            r12.append(r2)
            java.lang.String r2 = "### end stack trace"
            r12.append(r2)
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch:{ IOException -> 0x016d }
            r2.<init>(r10)     // Catch:{ IOException -> 0x016d }
            java.io.BufferedWriter r11 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x016d }
            r11.<init>(r2)     // Catch:{ IOException -> 0x016d }
            java.lang.String r2 = r12.toString()     // Catch:{ all -> 0x0163 }
            r11.write(r2)     // Catch:{ all -> 0x0163 }
            r11.close()     // Catch:{ IOException -> 0x016d }
            goto L_0x0177
        L_0x0163:
            r3 = move-exception
            r11.close()     // Catch:{ all -> 0x0168 }
            goto L_0x016c
        L_0x0168:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch:{ IOException -> 0x016d }
        L_0x016c:
            throw r3     // Catch:{ IOException -> 0x016d }
        L_0x016d:
            r11 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "JavaExceptionsUploadHelper/file write failed: "
            X.C36321k7.A1J(r11, r2, r3)
        L_0x0177:
            java.util.HashMap r11 = X.AnonymousClass001.A0J()
            java.lang.String r2 = "attachment"
            java.lang.String r3 = "JavaExceptionsUpload"
            boolean r2 = X.AnonymousClass6Sj.A01(r5, r10, r2, r3, r11)
            if (r2 == 0) goto L_0x019b
            java.util.Map r2 = r17.A01()
            X.AnonymousClass6Sj.A00(r5, r9, r3, r2, r11)
            X.6Sj r3 = r8.A05
            java.lang.String r2 = "java"
            java.util.List r2 = java.util.Collections.singletonList(r2)
            java.util.HashSet r2 = X.C90524aI.A0k(r2)
            r3.A02(r2, r11, r4)
        L_0x019b:
            java.lang.Object r0 = r0.first
            java.io.File r0 = (java.io.File) r0
            r0.delete()
            r10.delete()
            X.0z6 r0 = r8.A03
            r0.A00(r9)
            r17 = 1
            goto L_0x004e
        L_0x01ae:
            r3 = move-exception
            java.lang.String r2 = "javacrash/deserializeCrashData: could not deserialize stored crash data"
            com.whatsapp.util.Log.w(r2, r3)
            java.lang.Object r0 = r0.first
            java.io.File r0 = (java.io.File) r0
            r0.delete()
            goto L_0x004e
        L_0x01bd:
            X.6Sj r0 = r1.A02
            X.0wG r0 = r0.A00
            java.io.File r2 = X.C90524aI.A0R(r0)
            java.lang.String r0 = "crash_upload"
            java.io.File r2 = X.C36441kJ.A0w(r2, r0)
            boolean r0 = r2.exists()     // Catch:{ SecurityException -> 0x01de }
            if (r0 == 0) goto L_0x01d8
            boolean r0 = r2.isDirectory()     // Catch:{ SecurityException -> 0x01de }
            if (r0 == 0) goto L_0x01d8
            goto L_0x01de
        L_0x01d8:
            r2.delete()     // Catch:{ SecurityException -> 0x01de }
            r2.mkdirs()     // Catch:{ SecurityException -> 0x01de }
        L_0x01de:
            X.0zv r0 = r1.A01
            r0.A01()
            X.5xl r3 = r1.A03
            X.0wG r0 = r3.A01
            java.io.File r2 = X.C90514aH.A0j(r0)
            java.lang.String r0 = "crash_in_video_sentinel"
            java.io.File r7 = X.C36441kJ.A0w(r2, r0)
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x023d
            if (r17 != 0) goto L_0x023a
            if (r6 != 0) goto L_0x023a
            java.io.BufferedReader r0 = X.C90504aG.A0Z(r7)     // Catch:{ IOException -> 0x0211 }
            java.lang.String r5 = r0.readLine()     // Catch:{ all -> 0x0207 }
            r0.close()     // Catch:{ IOException -> 0x0211 }
            goto L_0x0216
        L_0x0207:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x020c }
            goto L_0x0210
        L_0x020c:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ IOException -> 0x0211 }
        L_0x0210:
            throw r2     // Catch:{ IOException -> 0x0211 }
        L_0x0211:
            r0 = move-exception
            java.lang.String r5 = r0.toString()
        L_0x0216:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x021e
            java.lang.String r5 = "process killed"
        L_0x021e:
            X.6Sj r4 = r3.A05
            r0 = 5
            r3 = 1
            X.58Y r2 = new X.58Y
            r2.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A01 = r0
            r2.A07 = r5
            java.lang.Long r0 = X.C36441kJ.A0y(r3)
            r2.A02 = r0
            X.0yW r0 = r4.A01
            r0.Blv(r2)
        L_0x023a:
            r7.delete()
        L_0x023d:
            X.6Kf r8 = r1.A05
            X.0wG r12 = r8.A00
            android.content.Context r0 = r12.A00
            java.io.File r2 = X.AnonymousClass11Y.A00(r0)
            X.728 r0 = X.AnonymousClass728.A00
            java.io.File[] r10 = r2.listFiles(r0)
            r7 = 0
            if (r10 == 0) goto L_0x028a
            int r9 = r10.length
            if (r9 == 0) goto L_0x028a
            X.760 r0 = X.AnonymousClass760.A00
            java.util.Arrays.sort(r10, r0)
            X.0zv r0 = r8.A01
            java.util.Map r4 = r0.A01()
            r0 = 10
            r3 = 1
            boolean r14 = X.C36371kC.A1T(r9, r0)
            r2 = 1
            r11 = 0
            r5 = 0
        L_0x0268:
            if (r2 >= r9) goto L_0x028c
            r13 = r10[r2]
            boolean r0 = r13.delete()
            if (r0 != 0) goto L_0x0278
            boolean r0 = r13.exists()
            if (r0 != 0) goto L_0x0282
        L_0x0278:
            int r11 = r11 + 1
            if (r14 != 0) goto L_0x0282
            r0 = r10[r2]
            X.C130226Kf.A00(r8, r0, r4)
            r5 = 1
        L_0x0282:
            r0 = r10[r2]
            r0.getPath()
            int r2 = r2 + 1
            goto L_0x0268
        L_0x028a:
            r5 = 0
            goto L_0x02b1
        L_0x028c:
            java.lang.String r16 = "native"
            if (r14 == 0) goto L_0x029b
            X.6Sj r9 = r8.A02
            if (r11 >= r3) goto L_0x0379
            r0 = 0
        L_0x0295:
            if (r5 != 0) goto L_0x029a
            r5 = 0
            if (r0 == 0) goto L_0x029b
        L_0x029a:
            r5 = 1
        L_0x029b:
            r9 = r10[r7]
            if (r6 == 0) goto L_0x0326
            boolean r0 = r9.delete()
            if (r0 != 0) goto L_0x02ab
            boolean r0 = r9.exists()
            if (r0 != 0) goto L_0x0376
        L_0x02ab:
            r0 = r10[r7]
            X.C130226Kf.A00(r8, r0, r4)
        L_0x02b0:
            r5 = r3
        L_0x02b1:
            X.6Sw r0 = r1.A00
            boolean r3 = r0.A02(r6)
            X.6N6 r2 = r1.A06
            r0 = r17
            r2.A01(r6, r0, r5, r3)
            X.5uu r11 = r1.A04
            java.lang.String r2 = "android_hprof"
            X.6Rt r4 = r11.A03
            android.content.Context r6 = r4.A00
            java.io.File r0 = r6.getCacheDir()
            java.lang.String r0 = r0.getPath()
            java.io.File r3 = X.C90524aI.A0S(r0)
            X.721 r0 = new X.721
            r0.<init>(r4)
            java.io.File[] r5 = r3.listFiles(r0)
            if (r5 == 0) goto L_0x0537
            int r4 = r5.length
            if (r4 == 0) goto L_0x0537
            X.0wD r9 = r11.A01
            r8 = 1
            int r0 = r9.A03(r8)
            if (r0 == r8) goto L_0x0396
            r3 = 0
        L_0x02ea:
            r0 = r5[r3]
            r0.delete()
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.io.File r0 = r6.getCacheDir()
            java.lang.String r0 = r0.getPath()
            r2[r7] = r0
            java.lang.String r0 = "%s/dump.gz"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            java.io.File r0 = X.C90524aI.A0S(r0)
            X.C90464aC.A18(r0)
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.io.File r0 = r6.getCacheDir()
            java.lang.String r0 = r0.getPath()
            r2[r7] = r0
            java.lang.String r0 = "%s/dump.clean"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            java.io.File r0 = X.C90524aI.A0S(r0)
            X.C90464aC.A18(r0)
            int r3 = r3 + 1
            if (r3 >= r4) goto L_0x0537
            goto L_0x02ea
        L_0x0326:
            java.util.HashMap r11 = X.AnonymousClass001.A0J()
            android.content.Context r15 = r12.A00
            java.lang.String r14 = "upload_file_minidump"
            java.lang.String r13 = "NativeExceptionUploadHelper"
            boolean r0 = X.AnonymousClass6Sj.A01(r15, r9, r14, r13, r11)
            if (r0 == 0) goto L_0x0352
            java.lang.String r12 = r9.getName()
            java.lang.String r0 = "_"
            int r2 = r12.indexOf(r0)
            int r10 = r2 + 1
            r2 = 0
            if (r10 <= r3) goto L_0x034f
            int r0 = r12.indexOf(r0, r10)
            if (r0 < 0) goto L_0x034f
            java.lang.String r2 = r12.substring(r10, r0)
        L_0x034f:
            X.AnonymousClass6Sj.A00(r15, r2, r13, r4, r11)
        L_0x0352:
            boolean r0 = r11.containsKey(r14)
            if (r0 == 0) goto L_0x02b1
            X.6Sj r2 = r8.A02
            java.util.List r0 = java.util.Collections.singletonList(r16)
            java.util.HashSet r0 = X.C90524aI.A0k(r0)
            r2.A02(r0, r11, r7)
            boolean r0 = r9.delete()
            if (r0 != 0) goto L_0x0371
            boolean r0 = r9.exists()
            if (r0 != 0) goto L_0x0376
        L_0x0371:
            X.C130226Kf.A00(r8, r9, r4)
            goto L_0x02b0
        L_0x0376:
            r3 = r5
            goto L_0x02b0
        L_0x0379:
            X.58Y r2 = new X.58Y
            r2.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r2.A01 = r0
            r0 = r16
            r2.A07 = r0
            java.lang.Long r0 = X.C36441kJ.A0y(r11)
            r2.A02 = r0
            X.0yW r0 = r9.A01
            r0.Blv(r2)
            r0 = 1
            goto L_0x0295
        L_0x0396:
            r3 = 1
        L_0x0397:
            if (r3 >= r4) goto L_0x03a6
            r0 = r5[r3]
            r0.delete()
            r0 = r5[r3]
            r0.getPath()
            int r3 = r3 + 1
            goto L_0x0397
        L_0x03a6:
            r4 = r5[r7]
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.io.File r0 = r6.getCacheDir()
            java.lang.String r0 = r0.getPath()
            r3[r7] = r0
            java.lang.String r0 = "%s/dump.clean"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            java.io.File r5 = X.C90524aI.A0S(r0)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "HprofPersonalInfoCleaner/run/file "
            r3.append(r0)
            java.lang.String r0 = r4.getPath()
            X.C36321k7.A1a(r3, r0)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            java.lang.String r0 = "HprofPersonalInfoCleaner/pass1/starting on file "
            r3.append(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            java.lang.String r0 = r4.getPath()     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            X.C36321k7.A1a(r3, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            X.6wF r0 = new X.6wF     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            r0.<init>(r4)     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            X.8eJ r7 = new X.8eJ     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            r7.<init>(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            r7.A02()     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            r0.close()     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            java.lang.String r0 = "HprofPersonalInfoCleaner/pass1/finished on file "
            r3.append(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            java.lang.String r0 = r4.getPath()     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            X.C36321k7.A1a(r3, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            X.9Em r10 = r7.A00     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            java.lang.String r0 = "HprofPersonalInfoCleaner/pass2/starting on file "
            r3.append(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            java.lang.String r0 = r4.getPath()     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            X.C36321k7.A1a(r3, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            X.6wF r7 = new X.6wF     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            r7.<init>(r4)     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            java.io.BufferedOutputStream r3 = X.C90504aG.A0Y(r5)     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            java.io.DataOutputStream r0 = new java.io.DataOutputStream     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            r0.<init>(r3)     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            X.ADb r3 = new X.ADb     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            r3.<init>(r7, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            X.8eK r0 = new X.8eK     // Catch:{ all -> 0x0516 }
            r0.<init>(r10, r3)     // Catch:{ all -> 0x0516 }
            r0.A02()     // Catch:{ all -> 0x0516 }
            r3.close()     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            java.lang.String r0 = "HprofPersonalInfoCleaner/pass2/finished on file "
            r3.append(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            java.lang.String r0 = r4.getPath()     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            X.C36321k7.A1a(r3, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            java.lang.String r0 = "HprofPersonalInfoCleaner/pass2/Written clean copy to "
            r3.append(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            java.lang.String r0 = r5.getPath()     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            X.C36321k7.A1a(r3, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            java.lang.String r0 = "HprofPersonalInfoCleaner/run/Successfully cleaned"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r9.A03(r8)
            if (r0 != r8) goto L_0x0521
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.io.File r0 = r6.getCacheDir()
            java.lang.String r0 = r0.getPath()
            r13 = 0
            r3[r13] = r0
            java.lang.String r0 = "%s/dump.gz"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            java.io.File r3 = X.C90524aI.A0S(r0)
            X.0wN r6 = r11.A00     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            java.lang.String r0 = r6.A0A()     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            java.lang.String r7 = r6.A0C(r0, r2, r8)     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            java.lang.String r0 = "no_upload"
            boolean r0 = r0.equals(r7)     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            if (r0 == 0) goto L_0x048d
            r4.delete()     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            r3.delete()     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            r5.delete()     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            goto L_0x0537
        L_0x048d:
            java.io.FileInputStream r10 = X.C90524aI.A0U(r5)     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            java.io.FileOutputStream r9 = X.C90524aI.A0W(r3)     // Catch:{ all -> 0x0511 }
            java.util.zip.GZIPOutputStream r12 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x050c }
            r12.<init>(r9)     // Catch:{ all -> 0x050c }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r8 = new byte[r0]     // Catch:{ all -> 0x0507 }
        L_0x049e:
            int r7 = r10.read(r8)     // Catch:{ all -> 0x0507 }
            r0 = -1
            if (r7 == r0) goto L_0x04a9
            r12.write(r8, r13, r7)     // Catch:{ all -> 0x0507 }
            goto L_0x049e
        L_0x04a9:
            r12.flush()     // Catch:{ all -> 0x0507 }
            r12.close()     // Catch:{ all -> 0x050c }
            r9.close()     // Catch:{ all -> 0x0511 }
            r10.close()     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            X.6v4 r9 = new X.6v4     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            r9.<init>(r11, r4, r3, r5)     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            X.1GE r8 = r11.A02     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            java.lang.String r10 = "https://crashlogs.whatsapp.net/wa_clb_data"
            r12 = 11
            r11 = 0
            X.6VO r8 = r8.A00(r9, r10, r11, r12, r13)     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            java.lang.String r7 = "access_token"
            java.lang.String r0 = "1063127757113399|745146ffa34413f9dbb5469f5370b7af"
            r8.A07(r7, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            java.io.FileInputStream r0 = X.C90524aI.A0U(r3)     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            X.AnonymousClass6VO.A03(r8, r3, r0, r2)     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            java.lang.String r10 = "agent"
            r0 = r6
            X.0wP r0 = (X.C19720wP) r0     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            X.0wt r9 = r0.A0B     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            X.0wG r7 = r0.A07     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            java.lang.String r0 = X.C18930u3.A01()     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            java.lang.String r0 = X.C20020wt.A00(r7, r9, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            r8.A07(r10, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            java.lang.String r0 = "type"
            r8.A07(r0, r2)     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            java.lang.String r2 = "android_hprof_extras"
            java.lang.String r0 = "java.lang.OutOfMemoryError"
            java.lang.String r0 = r6.A0B(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            r8.A07(r2, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            java.lang.String r2 = "build_id"
            r6 = 581200649(0x22a46b09, double:2.87151274E-315)
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            r8.A07(r2, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            r8.A04(r11)     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            goto L_0x0537
        L_0x0507:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x050c }
            throw r0     // Catch:{ all -> 0x050c }
        L_0x050c:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0511 }
            throw r0     // Catch:{ all -> 0x0511 }
        L_0x0511:
            r0 = move-exception
            r10.close()     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
            throw r0     // Catch:{ Exception | OutOfMemoryError -> 0x0528 }
        L_0x0516:
            r0 = move-exception
            r3.close()     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
            throw r0     // Catch:{ Exception | OutOfMemoryError -> 0x051b }
        L_0x051b:
            r2 = move-exception
            java.lang.String r0 = "HprofPersonalInfoCleaner/run/error"
            com.whatsapp.util.Log.e(r0, r2)
        L_0x0521:
            r4.delete()
            r5.delete()
            goto L_0x0537
        L_0x0528:
            r2 = move-exception
            java.lang.String r0 = "MemoryExceptionsUploadHelper/Error Uploading file"
            com.whatsapp.util.Log.w(r0, r2)
            r4.delete()
            r5.delete()
            r3.delete()
        L_0x0537:
            X.0zv r4 = r1.A01
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x055f
            r3 = 0
        L_0x053e:
            java.lang.String r2 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r4.A05
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0557
            java.io.File r2 = r4.A04
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.io.File r0 = X.C36441kJ.A0w(r2, r0)
            r0.delete()
        L_0x0557:
            int r3 = r3 + 1
            r0 = 5
            if (r3 < r0) goto L_0x053e
            r0 = 0
            r4.A02 = r0
        L_0x055f:
            X.5xl r2 = r1.A03
            X.0v0 r0 = r2.A02
            X.005 r6 = r0.A00
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r6)
            java.lang.String r5 = "crash_state_manager:system_exit"
            java.lang.String r4 = X.C36371kC.A0t(r0, r5)
            if (r4 == 0) goto L_0x0583
            X.0wN r3 = r2.A00
            r2 = 0
            java.lang.String r0 = "system_exit"
            r3.A0E(r0, r4, r2)
            android.content.SharedPreferences$Editor r0 = X.C90464aC.A0C(r6)
            r0.remove(r5)
            r0.apply()
        L_0x0583:
            X.1Hq r2 = r1.A07
            r0 = 0
            r2.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.crash.upload.ExceptionsUploadService.A0A(android.content.Intent):void");
    }

    public final Object generatedComponent() {
        if (this.A0A == null) {
            synchronized (this.A09) {
                if (this.A0A == null) {
                    this.A0A = new C31091bG(this);
                }
            }
        }
        return this.A0A.generatedComponent();
    }

    public void onCreate() {
        if (!this.A08) {
            this.A08 = true;
            C18800tq r2 = ((C31141bL) ((C31131bK) generatedComponent())).A05;
            C18830tt r1 = r2.A00;
            this.A02 = (AnonymousClass6Sj) r1.A7F.get();
            this.A03 = (C124205xl) r1.A9J.get();
            this.A00 = (C132266Sw) r1.A4U.get();
            this.A05 = (C130226Kf) r1.AA3.get();
            this.A04 = (C122475uu) r1.A9j.get();
            this.A01 = (C21860zv) r1.A4A.get();
            this.A07 = (C25781Hq) r2.A3V.get();
            this.A06 = (AnonymousClass6N6) r1.ACx.get();
        }
        super.onCreate();
    }

    public ExceptionsUploadService(int i) {
        this.A09 = C36441kJ.A11();
        this.A08 = false;
    }

    public ExceptionsUploadService() {
        this(0);
    }
}
