package X;

import android.content.Context;

/* renamed from: X.6t7  reason: invalid class name and case insensitive filesystem */
public final class C144956t7 implements AnonymousClass7gT {
    public final Context A00;
    public final C19600wD A01;
    public final C21060yb A02;
    public final C20830yE A03;
    public final C19420v0 A04;
    public final C18820ts A05;
    public final C20060wx A06;
    public final C20810yC A07;
    public final C21010yW A08;
    public final AnonymousClass6O2 A09;
    public final C19970wo A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ec, code lost:
        if (r5 == null) goto L_0x00f1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00d1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00d8 */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0419  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0562  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x058f  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x05a3  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x05b5  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x05fe  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x066d  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0689  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00fb A[SYNTHETIC, Splitter:B:71:0x00fb] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0100 A[SYNTHETIC, Splitter:B:75:0x0100] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bcw(X.AnonymousClass591 r20) {
        /*
            r19 = this;
            r1 = 0
            r3 = r20
            X.AnonymousClass00C.A0D(r3, r1)
            java.lang.Boolean r0 = X.C18750th.A01     // Catch:{ ClassNotFoundException -> 0x000e }
            java.lang.String r0 = "org.acra.ACRA"
            java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x000e }
            r1 = 1
        L_0x000e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r3.A0S = r0
            java.lang.String r1 = android.os.Environment.getExternalStorageState()     // Catch:{ Exception -> 0x0023 }
            java.lang.String r0 = "mounted"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x0023 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0023 }
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            r3.A00 = r0
            r1 = r19
            X.0yb r9 = r1.A02
            boolean r0 = X.C18750th.A0F(r9)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A0Q = r0
            java.lang.Boolean r0 = X.C18750th.A01
            if (r0 != 0) goto L_0x0055
            r2 = 0
            java.lang.String r0 = "/system/lib/libc_malloc_debug_qemu.so"
            boolean r0 = X.C90484aE.A1W(r0)     // Catch:{ Exception -> 0x004f }
            if (r0 == 0) goto L_0x0048
            java.lang.Boolean r0 = X.C36371kC.A0m()     // Catch:{ Exception -> 0x004f }
            X.C18750th.A01 = r0     // Catch:{ Exception -> 0x004f }
            goto L_0x0055
        L_0x0048:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x004f }
            X.C18750th.A01 = r0     // Catch:{ Exception -> 0x004f }
            goto L_0x0055
        L_0x004f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            X.C18750th.A01 = r0
        L_0x0055:
            boolean r0 = r0.booleanValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A0T = r0
            android.content.Context r8 = r1.A00
            java.lang.Boolean r0 = X.C18750th.A00
            if (r0 != 0) goto L_0x0077
            r6 = 0
            r5 = 1
            java.lang.String r0 = "/dev/com.genymotion.superuser.daemon"
            boolean r0 = X.C90484aE.A1W(r0)     // Catch:{ Exception -> 0x0084 }
            if (r0 == 0) goto L_0x0084
            r6 = 1
        L_0x0070:
            r5 = r6
        L_0x0071:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            X.C18750th.A00 = r0
        L_0x0077:
            boolean r0 = r0.booleanValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A0O = r0
            r7 = 0
            r6 = 0
            goto L_0x0090
        L_0x0084:
            android.content.pm.PackageManager r4 = r8.getPackageManager()
            java.lang.String r2 = "com.genymotion.superuser"
            r0 = 128(0x80, float:1.794E-43)
            r4.getPackageInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x0070 }
            goto L_0x0071
        L_0x0090:
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x00e4, all -> 0x00f7 }
            java.lang.String r0 = "ps"
            java.lang.Process r2 = r2.exec(r0)     // Catch:{ Exception -> 0x00e4, all -> 0x00f7 }
            java.io.InputStream r0 = r2.getInputStream()     // Catch:{ Exception -> 0x00e4, all -> 0x00f7 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00e4, all -> 0x00f7 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x00e4, all -> 0x00f7 }
            java.io.InputStream r0 = r2.getErrorStream()     // Catch:{ Exception -> 0x00e1, all -> 0x00de }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00e1, all -> 0x00de }
            r4.<init>(r0)     // Catch:{ Exception -> 0x00e1, all -> 0x00de }
            r2.waitFor()     // Catch:{ Exception -> 0x00dc }
            int r2 = r4.available()     // Catch:{ Exception -> 0x00dc }
            byte[] r0 = new byte[r2]     // Catch:{ Exception -> 0x00dc }
            r4.read(r0, r6, r2)     // Catch:{ Exception -> 0x00dc }
            int r2 = r5.available()     // Catch:{ Exception -> 0x00dc }
            byte[] r0 = new byte[r2]     // Catch:{ Exception -> 0x00dc }
            r5.read(r0, r6, r2)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x00dc }
            r2.<init>(r0)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r0 = "com.android.commands.monkey"
            boolean r0 = r2.contains(r0)     // Catch:{ Exception -> 0x00dc }
            if (r0 == 0) goto L_0x00d5
            r5.close()     // Catch:{ IOException -> 0x00d1 }
        L_0x00d1:
            r4.close()     // Catch:{ IOException -> 0x0105 }
            goto L_0x0105
        L_0x00d5:
            r5.close()     // Catch:{ IOException -> 0x00d8 }
        L_0x00d8:
            r4.close()     // Catch:{ IOException -> 0x0103 }
            goto L_0x0103
        L_0x00dc:
            r0 = move-exception
            goto L_0x00e7
        L_0x00de:
            r0 = move-exception
            r4 = r7
            goto L_0x00ee
        L_0x00e1:
            r0 = move-exception
            r4 = r7
            goto L_0x00e7
        L_0x00e4:
            r0 = move-exception
            r5 = r7
            r4 = r7
        L_0x00e7:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x00eb }
            goto L_0x00f9
        L_0x00eb:
            r0 = move-exception
            if (r5 == 0) goto L_0x00f1
        L_0x00ee:
            r5.close()     // Catch:{ IOException -> 0x00f1 }
        L_0x00f1:
            if (r4 == 0) goto L_0x00f8
            r4.close()     // Catch:{ IOException -> 0x00f8 }
            throw r0
        L_0x00f7:
            r0 = move-exception
        L_0x00f8:
            throw r0
        L_0x00f9:
            if (r5 == 0) goto L_0x00fe
            r5.close()     // Catch:{ IOException -> 0x00fe }
        L_0x00fe:
            if (r4 == 0) goto L_0x0103
            r4.close()     // Catch:{ IOException -> 0x0103 }
        L_0x0103:
            r0 = 0
            goto L_0x0106
        L_0x0105:
            r0 = 1
        L_0x0106:
            r5 = 1
            if (r0 == 0) goto L_0x010f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r3.A0P = r0
        L_0x010f:
            boolean r0 = X.C18750th.A0B()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A0R = r0
            android.accounts.AccountManager r4 = android.accounts.AccountManager.get(r8)
            r2 = -1
            if (r4 == 0) goto L_0x0127
            java.lang.String r0 = "com.google"
            android.accounts.Account[] r0 = r4.getAccountsByType(r0)     // Catch:{ Exception -> 0x0127 }
            int r2 = r0.length     // Catch:{ Exception -> 0x0127 }
        L_0x0127:
            java.lang.Long r0 = X.C36441kJ.A0y(r2)
            r3.A12 = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r3.A0n = r0
            java.lang.String r0 = android.os.Build.DISPLAY
            r3.A1d = r0
            java.lang.String r0 = X.C131896Re.A02()
            r3.A1W = r0
            boolean r0 = X.C19550w8.A04()
            if (r0 == 0) goto L_0x01a4
            java.lang.String r0 = "android.hardware.ram.low"
            boolean r0 = r9.A0P(r0)
            if (r0 == 0) goto L_0x01a4
        L_0x014d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r3.A04 = r0
            X.0ts r2 = r1.A05
            java.lang.String r0 = r2.A06()
            r3.A1a = r0
            java.lang.String r0 = r2.A05()
            r3.A1b = r0
            android.content.pm.PackageManager r4 = r8.getPackageManager()
            java.lang.String r0 = r8.getPackageName()
            java.lang.String r0 = r4.getInstallerPackageName(r0)
            r3.A1Y = r0
            java.lang.String r0 = r8.getPackageName()
            r3.A1e = r0
            X.135 r7 = new X.135
            r7.<init>()
            java.lang.String r0 = "apkhash"
            r7.A02 = r0
            long r5 = android.os.SystemClock.elapsedRealtime()
            android.content.pm.ApplicationInfo r0 = r8.getApplicationInfo()
            java.lang.String r0 = r0.sourceDir
            java.lang.String r4 = X.C18750th.A02(r0)
            java.lang.Long r0 = X.C90494aF.A0V(r5)
            r7.A00 = r0
            X.0yW r0 = r1.A08
            r0.Bly(r7)
            r3.A1U = r4
            android.content.pm.Signature[] r7 = X.AnonymousClass1L0.A04(r8)
            r4 = 0
            if (r7 == 0) goto L_0x01c9
            int r6 = r7.length
            if (r6 == 0) goto L_0x01c9
            goto L_0x01a6
        L_0x01a4:
            r5 = 0
            goto L_0x014d
        L_0x01a6:
            java.security.MessageDigest r5 = X.C90504aG.A0s()     // Catch:{ NoSuchAlgorithmException -> 0x01ab }
            goto L_0x01b0
        L_0x01ab:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            goto L_0x01c9
        L_0x01b0:
            r5.reset()
            r4 = 0
        L_0x01b4:
            r0 = r7[r4]
            byte[] r0 = r0.toByteArray()
            r5.update(r0)
            int r4 = r4 + 1
            if (r4 < r6) goto L_0x01b4
            byte[] r0 = r5.digest()
            java.lang.String r4 = X.C36441kJ.A13(r0)
        L_0x01c9:
            r3.A1g = r4
            int r0 = X.C131896Re.A00()
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r3.A1N = r0
            X.0v0 r7 = r1.A04
            X.005 r0 = r7.A00
            r18 = r0
            android.content.SharedPreferences r4 = X.C36391kE.A0H(r18)
            java.lang.String r0 = "phoneyid_id"
            java.lang.String r0 = X.C36371kC.A0t(r4, r0)
            r3.A1f = r0
            X.0yC r10 = r1.A07
            java.util.Set r0 = X.AnonymousClass6UT.A00
            r0 = 3663(0xe4f, float:5.133E-42)
            boolean r0 = r10.A0E(r0)
            r5 = 0
            if (r0 == 0) goto L_0x03f3
            java.util.HashSet r14 = X.C36441kJ.A16()
            r0 = 4
            java.lang.ClassLoader[] r6 = new java.lang.ClassLoader[r0]
            r4 = 0
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            r6[r4] = r0
            r4 = 1
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r6[r4] = r0
            r4 = 2
            java.lang.Class<X.6UT> r0 = X.AnonymousClass6UT.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r6[r4] = r0
            r4 = 3
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()
            r6[r4] = r0
            java.util.HashSet r0 = X.AnonymousClass6X9.newHashSet(r6)
            java.security.MessageDigest r6 = X.C90504aG.A0s()     // Catch:{ NoSuchAlgorithmException -> 0x03ea }
            java.util.LinkedList r13 = X.C90524aI.A0l()
            r13.addAll(r0)
        L_0x022e:
            int r0 = r13.size()
            if (r0 <= 0) goto L_0x02a1
            java.lang.Object r4 = r13.pop()
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4
            if (r4 == 0) goto L_0x022e
            java.lang.ClassLoader r0 = r4.getParent()
            if (r0 == 0) goto L_0x0256
            boolean r0 = r14.contains(r4)
            if (r0 != 0) goto L_0x0256
            java.lang.ClassLoader r0 = r4.getParent()
            r14.add(r0)
            java.lang.ClassLoader r0 = r4.getParent()
            r13.add(r0)
        L_0x0256:
            java.lang.String r0 = "pathList"
            java.lang.Object r4 = X.AnonymousClass6UT.A00(r4, r0)     // Catch:{ Exception -> 0x029c }
            java.lang.String r0 = "dexElements"
            java.lang.Object r15 = X.AnonymousClass6UT.A00(r4, r0)     // Catch:{ Exception -> 0x029c }
            java.lang.Object[] r15 = (java.lang.Object[]) r15     // Catch:{ Exception -> 0x029c }
            int r12 = r15.length     // Catch:{ Exception -> 0x029c }
            r11 = 0
        L_0x0266:
            if (r11 >= r12) goto L_0x022e
            r4 = r15[r11]     // Catch:{ Exception -> 0x029c }
            java.lang.String r0 = "dexFile"
            java.lang.Object r0 = X.AnonymousClass6UT.A00(r4, r0)     // Catch:{ Exception -> 0x029c }
            dalvik.system.DexFile r0 = (dalvik.system.DexFile) r0     // Catch:{ Exception -> 0x029c }
            java.util.Enumeration r16 = r0.entries()     // Catch:{ Exception -> 0x029c }
            if (r16 == 0) goto L_0x0299
        L_0x0278:
            boolean r0 = r16.hasMoreElements()     // Catch:{ Exception -> 0x029c }
            if (r0 == 0) goto L_0x0299
            java.lang.Object r5 = r16.nextElement()     // Catch:{ Exception -> 0x029c }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x029c }
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ Exception -> 0x029c }
            byte[] r0 = r5.getBytes(r0)     // Catch:{ Exception -> 0x029c }
            r6.update(r0)     // Catch:{ Exception -> 0x029c }
            java.util.Set r4 = X.AnonymousClass6UT.A00     // Catch:{ Exception -> 0x029c }
            boolean r0 = r4.contains(r5)     // Catch:{ Exception -> 0x029c }
            if (r0 == 0) goto L_0x0278
            r4.remove(r5)     // Catch:{ Exception -> 0x029c }
            goto L_0x0278
        L_0x0299:
            int r11 = r11 + 1
            goto L_0x0266
        L_0x029c:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            goto L_0x022e
        L_0x02a1:
            java.util.Set r11 = X.AnonymousClass6UT.A00
            monitor-enter(r11)
            java.util.Iterator r5 = r11.iterator()     // Catch:{ all -> 0x03e7 }
        L_0x02a8:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x03e7 }
            if (r0 == 0) goto L_0x02bc
            java.lang.String r4 = X.AnonymousClass001.A0C(r5)     // Catch:{ all -> 0x03e7 }
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x03e7 }
            byte[] r0 = r4.getBytes(r0)     // Catch:{ all -> 0x03e7 }
            r6.update(r0)     // Catch:{ all -> 0x03e7 }
            goto L_0x02a8
        L_0x02bc:
            monitor-exit(r11)     // Catch:{ all -> 0x03e7 }
            X.6MC r5 = X.AnonymousClass6MC.A00
            X.4tK r5 = (X.C99414tK) r5
            X.6MC r12 = r5.A02
            if (r12 != 0) goto L_0x032b
            X.6DS r12 = r5.A00
            char[] r14 = r12.A06
            int r13 = r14.length
            r11 = 0
        L_0x02cb:
            if (r11 >= r13) goto L_0x0313
            char r4 = r14[r11]
            r0 = 65
            if (r4 < r0) goto L_0x0307
            r0 = 90
            if (r4 > r0) goto L_0x0307
            r11 = 0
        L_0x02d8:
            if (r11 >= r13) goto L_0x0305
            char r4 = r14[r11]
            r0 = 97
            if (r4 < r0) goto L_0x0302
            r0 = 122(0x7a, float:1.71E-43)
            if (r4 > r0) goto L_0x0302
            r0 = 1
        L_0x02e5:
            r4 = r0 ^ 1
            java.lang.String r0 = "Cannot call lowerCase() on a mixed-case alphabet"
            if (r4 == 0) goto L_0x030a
            char[] r11 = new char[r13]
            r4 = 0
        L_0x02ee:
            if (r4 >= r13) goto L_0x0315
            char r15 = r14[r4]
            r0 = 65
            if (r15 < r0) goto L_0x02fd
            r0 = 90
            if (r15 > r0) goto L_0x02fd
            r0 = r15 ^ 32
            char r15 = (char) r0
        L_0x02fd:
            r11[r4] = r15
            int r4 = r4 + 1
            goto L_0x02ee
        L_0x0302:
            int r11 = r11 + 1
            goto L_0x02d8
        L_0x0305:
            r0 = 0
            goto L_0x02e5
        L_0x0307:
            int r11 = r11 + 1
            goto L_0x02cb
        L_0x030a:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0313:
            r4 = r12
            goto L_0x0326
        L_0x0315:
            java.lang.String r0 = r12.A04
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.String r0 = ".lowerCase()"
            java.lang.String r0 = r4.concat(r0)
            X.6DS r4 = new X.6DS
            r4.<init>(r0, r11)
        L_0x0326:
            if (r4 != r12) goto L_0x0348
            r12 = r5
        L_0x0329:
            r5.A02 = r12
        L_0x032b:
            byte[] r11 = r6.digest()
            int r6 = r11.length
            r15 = 0
            X.C20740y5.A03(r15, r6, r6)
            X.4tK r12 = (X.C99414tK) r12
            X.6DS r14 = r12.A00
            int r4 = r14.A03
            int r13 = r14.A02
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            int r0 = X.C109745Yy.A00(r6, r13, r0)
            int r4 = r4 * r0
            java.lang.StringBuilder r5 = X.C90524aI.A0h(r4)
            goto L_0x0352
        L_0x0348:
            boolean r0 = r5 instanceof X.C99404tJ
            if (r0 == 0) goto L_0x03e5
            X.4tJ r12 = new X.4tJ
            r12.<init>(r4)
            goto L_0x0329
        L_0x0352:
            boolean r0 = r12 instanceof X.C99394tI     // Catch:{ IOException -> 0x03df }
            if (r0 == 0) goto L_0x03a7
            r13 = r6
            r4 = 0
            java.util.Objects.requireNonNull(r5)     // Catch:{ IOException -> 0x03df }
            X.C20740y5.A03(r15, r6, r6)     // Catch:{ IOException -> 0x03df }
        L_0x035e:
            r0 = 3
            if (r13 < r0) goto L_0x03a0
            int r17 = r4 + 1
            byte r0 = r11[r4]     // Catch:{ IOException -> 0x03df }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r16 = r0 << 16
            int r15 = r17 + 1
            byte r0 = r11[r17]     // Catch:{ IOException -> 0x03df }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r16 = r16 | r0
            int r4 = r15 + 1
            byte r0 = r11[r15]     // Catch:{ IOException -> 0x03df }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r16 = r16 | r0
            int r0 = r16 >>> 18
            char[] r15 = r14.A06     // Catch:{ IOException -> 0x03df }
            char r0 = r15[r0]     // Catch:{ IOException -> 0x03df }
            r5.append(r0)     // Catch:{ IOException -> 0x03df }
            int r0 = r16 >>> 12
            r0 = r0 & 63
            char r0 = r15[r0]     // Catch:{ IOException -> 0x03df }
            r5.append(r0)     // Catch:{ IOException -> 0x03df }
            int r0 = r16 >>> 6
            r0 = r0 & 63
            char r0 = r15[r0]     // Catch:{ IOException -> 0x03df }
            r5.append(r0)     // Catch:{ IOException -> 0x03df }
            r0 = r16 & 63
            char r0 = r15[r0]     // Catch:{ IOException -> 0x03df }
            r5.append(r0)     // Catch:{ IOException -> 0x03df }
            int r13 = r13 + -3
            goto L_0x035e
        L_0x03a0:
            if (r4 >= r6) goto L_0x03ef
            int r6 = r6 - r4
            r12.A00(r5, r11, r4, r6)     // Catch:{ IOException -> 0x03df }
            goto L_0x03ef
        L_0x03a7:
            boolean r0 = r12 instanceof X.C99404tJ     // Catch:{ IOException -> 0x03df }
            if (r0 == 0) goto L_0x03cb
            X.4tJ r12 = (X.C99404tJ) r12     // Catch:{ IOException -> 0x03df }
            java.util.Objects.requireNonNull(r5)     // Catch:{ IOException -> 0x03df }
            X.C20740y5.A03(r15, r6, r6)     // Catch:{ IOException -> 0x03df }
            r13 = 0
        L_0x03b4:
            if (r13 >= r6) goto L_0x03ef
            byte r0 = r11[r13]     // Catch:{ IOException -> 0x03df }
            r14 = r0 & 255(0xff, float:3.57E-43)
            char[] r4 = r12.A00     // Catch:{ IOException -> 0x03df }
            char r0 = r4[r14]     // Catch:{ IOException -> 0x03df }
            r5.append(r0)     // Catch:{ IOException -> 0x03df }
            r0 = r14 | 256(0x100, float:3.59E-43)
            char r0 = r4[r0]     // Catch:{ IOException -> 0x03df }
            r5.append(r0)     // Catch:{ IOException -> 0x03df }
            int r13 = r13 + 1
            goto L_0x03b4
        L_0x03cb:
            java.util.Objects.requireNonNull(r5)     // Catch:{ IOException -> 0x03df }
            X.C20740y5.A03(r15, r6, r6)     // Catch:{ IOException -> 0x03df }
            r4 = 0
        L_0x03d2:
            if (r4 >= r6) goto L_0x03ef
            int r0 = r6 - r4
            int r0 = java.lang.Math.min(r13, r0)     // Catch:{ IOException -> 0x03df }
            r12.A00(r5, r11, r4, r0)     // Catch:{ IOException -> 0x03df }
            int r4 = r4 + r13
            goto L_0x03d2
        L_0x03df:
            r0 = move-exception
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)
            throw r0
        L_0x03e5:
            r0 = 0
            throw r0
        L_0x03e7:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x03e7 }
            throw r0
        L_0x03ea:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            goto L_0x03f3
        L_0x03ef:
            java.lang.String r5 = r5.toString()
        L_0x03f3:
            r3.A1V = r5
            X.0yE r6 = r1.A03
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            java.lang.Long r0 = A00(r6, r0)
            r3.A1H = r0
            java.lang.String r0 = "android.permission.WRITE_CONTACTS"
            java.lang.Long r0 = A00(r6, r0)
            r3.A1L = r0
            java.lang.String r0 = "android.permission.GET_ACCOUNTS"
            java.lang.Long r0 = A00(r6, r0)
            r3.A1G = r0
            boolean r0 = X.C19550w8.A01()
            java.lang.Long r11 = X.C36411kG.A0t()
            if (r0 == 0) goto L_0x05fe
            r0 = r11
        L_0x041a:
            r3.A1I = r0
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.Long r0 = A00(r6, r0)
            r3.A1M = r0
            boolean r0 = r6.A0C()
            if (r0 != 0) goto L_0x0430
            r4 = -1
            java.lang.Long r11 = java.lang.Long.valueOf(r4)
        L_0x0430:
            r3.A1K = r11
            java.lang.String r0 = "android.permission.CAMERA"
            java.lang.Long r0 = A00(r6, r0)
            r3.A1F = r0
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.Long r0 = A00(r6, r0)
            r3.A1D = r0
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.Long r0 = A00(r6, r0)
            r3.A1E = r0
            java.lang.String r0 = "android.permission.RECEIVE_SMS"
            java.lang.Long r0 = A00(r6, r0)
            r3.A1J = r0
            boolean r0 = X.C19550w8.A09()
            if (r0 == 0) goto L_0x046e
            X.2nw r0 = r6.A04()
            int r6 = r0.ordinal()
            r5 = 3
            r4 = 2
            r0 = 0
            if (r6 == r0) goto L_0x05fb
            if (r6 != r4) goto L_0x0468
            r5 = 2
        L_0x0468:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r3.A0i = r0
        L_0x046e:
            X.0wx r6 = r1.A06
            long r4 = r6.A02()
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r3.A1O = r0
            long r4 = r6.A04()
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r3.A1P = r0
            long r4 = r6.A01()
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r3.A0y = r0
            long r4 = r6.A03()
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r3.A0z = r0
            boolean r0 = X.C20060wx.A00()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A03 = r0
            int r5 = r7.A05()
            r0 = r5 & 2
            r4 = 0
            boolean r0 = X.AnonymousClass000.A1P(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A06 = r0
            r0 = r5 & 8
            boolean r0 = X.AnonymousClass000.A1P(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A09 = r0
            r0 = r5 & 1
            boolean r0 = X.AnonymousClass000.A1P(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A0C = r0
            r0 = r5 & 4
            boolean r0 = X.AnonymousClass000.A1P(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A0F = r0
            android.content.SharedPreferences r5 = X.C36391kE.A0H(r18)
            java.lang.String r0 = "autodownload_roaming_mask"
            int r5 = r5.getInt(r0, r4)
            r0 = r5 & 2
            boolean r0 = X.AnonymousClass000.A1P(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A07 = r0
            r0 = r5 & 8
            boolean r0 = X.AnonymousClass000.A1P(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A0A = r0
            r0 = r5 & 1
            boolean r0 = X.AnonymousClass000.A1P(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A0D = r0
            r0 = r5 & 4
            boolean r0 = X.AnonymousClass000.A1P(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A0G = r0
            android.content.SharedPreferences r6 = X.C36391kE.A0H(r18)
            java.lang.String r5 = "autodownload_wifi_mask"
            r0 = 15
            int r5 = r6.getInt(r5, r0)
            r0 = r5 & 2
            boolean r0 = X.AnonymousClass000.A1P(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A08 = r0
            r0 = r5 & 8
            boolean r0 = X.AnonymousClass000.A1P(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A0B = r0
            r0 = r5 & 1
            boolean r0 = X.AnonymousClass000.A1P(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A0E = r0
            r0 = r5 & 4
            if (r0 == 0) goto L_0x0546
            r4 = 1
        L_0x0546:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r3.A0H = r0
            long r6 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r18)
            java.lang.String r13 = "last_daily_event"
            r4 = 0
            long r14 = r0.getLong(r13, r4)
            r11 = 0
            int r0 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x056a
            long r11 = r6 - r14
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x056a
            r11 = 1
        L_0x056a:
            android.content.SharedPreferences$Editor r0 = X.C90464aC.A0C(r18)
            X.C36341k9.A0w(r0, r13, r6)
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            r3.A1Q = r0
            X.0wD r6 = r1.A01
            r5 = 1
            int r0 = r6.A03(r5)
            r4 = 3
            boolean r0 = X.AnonymousClass000.A1S(r0, r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A0W = r0
            boolean r0 = X.C19550w8.A02()
            if (r0 == 0) goto L_0x059b
            boolean r0 = r6.A0A()
            if (r0 == 0) goto L_0x05f6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
        L_0x0599:
            r3.A0g = r0
        L_0x059b:
            r0 = 3309(0xced, float:4.637E-42)
            boolean r0 = r10.A0E(r0)
            if (r0 == 0) goto L_0x05af
            android.telephony.TelephonyManager r0 = r9.A0K()
            if (r0 == 0) goto L_0x05f4
            java.lang.String r0 = r0.getNetworkOperatorName()
        L_0x05ad:
            r3.A1c = r0
        L_0x05af:
            boolean r0 = X.C19550w8.A05()
            if (r0 == 0) goto L_0x063a
            android.app.usage.UsageStatsManager r12 = r9.A08()
            if (r12 == 0) goto L_0x062a
            int r0 = r12.getAppStandbyBucket()
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r3.A0p = r0
            long r6 = java.lang.System.currentTimeMillis()
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r6 - r10
            android.app.usage.UsageEvents r7 = r12.queryEventsForSelf(r4, r6)
            X.AnonymousClass00C.A08(r7)
            android.app.usage.UsageEvents$Event r6 = new android.app.usage.UsageEvents$Event
            r6.<init>()
            r5 = 0
        L_0x05db:
            boolean r0 = r7.getNextEvent(r6)
            if (r0 == 0) goto L_0x0622
            int r4 = r6.getEventType()
            r0 = 11
            if (r4 != r0) goto L_0x05db
            int r0 = r6.getAppStandbyBucket()
            if (r0 <= r5) goto L_0x05db
            int r5 = r6.getAppStandbyBucket()
            goto L_0x05db
        L_0x05f4:
            r0 = 0
            goto L_0x05ad
        L_0x05f6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L_0x0599
        L_0x05fb:
            r5 = 1
            goto L_0x0468
        L_0x05fe:
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            boolean r0 = X.C19550w8.A09()
            if (r0 != 0) goto L_0x0613
            boolean r4 = X.C19550w8.A07()
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            if (r4 != 0) goto L_0x0613
            r5.add(r0)
        L_0x0613:
            r0 = 0
            java.lang.String[] r0 = X.C36371kC.A1b(r5, r0)
            int r0 = r6.A03(r0)
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            goto L_0x041a
        L_0x0622:
            if (r5 == 0) goto L_0x062a
            java.lang.Long r0 = X.C36441kJ.A0y(r5)
            r3.A19 = r0
        L_0x062a:
            android.app.ActivityManager r0 = r9.A04()
            if (r0 == 0) goto L_0x063a
            boolean r0 = r0.isBackgroundRestricted()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A0I = r0
        L_0x063a:
            X.03c r0 = new X.03c
            r0.<init>(r8)
            boolean r0 = r0.A01()
            int r0 = X.C36391kE.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0k = r0
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            java.lang.String r0 = r0.getLanguage()
            r3.A1X = r0
            boolean r0 = r2.A06
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A05 = r0
            X.6O2 r0 = r1.A09
            java.util.Locale r0 = r0.A01()
            if (r0 == 0) goto L_0x0689
            java.lang.String r2 = r0.getLanguage()
            if (r2 == 0) goto L_0x067b
            java.lang.String r0 = "[a-z]{2}"
            boolean r0 = java.util.regex.Pattern.matches(r0, r2)
            if (r0 != 0) goto L_0x0686
        L_0x067b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "KeyboardLanguageExtractor/getCurrentKeyboardLanguage/invalid-language "
            X.C36321k7.A1R(r0, r2, r1)
            java.lang.String r2 = "zz"
        L_0x0686:
            r3.A1Z = r2
            return
        L_0x0689:
            java.lang.String r2 = ""
            goto L_0x0686
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144956t7.Bcw(X.591):void");
    }

    public C144956t7(Context context, C19600wD r3, C21060yb r4, C19970wo r5, C20830yE r6, C19420v0 r7, C18820ts r8, C20060wx r9, C20810yC r10, C21010yW r11, AnonymousClass6O2 r12) {
        C36321k7.A19(r5, r10, r11, r9);
        C36321k7.A1C(r4, r8, r7, r6, r12);
        AnonymousClass00C.A0D(r3, 11);
        this.A00 = context;
        this.A0A = r5;
        this.A07 = r10;
        this.A08 = r11;
        this.A06 = r9;
        this.A02 = r4;
        this.A05 = r8;
        this.A04 = r7;
        this.A03 = r6;
        this.A09 = r12;
        this.A01 = r3;
    }

    public static Long A00(C20830yE r0, String str) {
        return Long.valueOf((long) r0.A02(str));
    }
}
