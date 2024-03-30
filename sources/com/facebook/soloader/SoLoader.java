package com.facebook.soloader;

import X.AnonymousClass10F;
import X.AnonymousClass10H;
import X.AnonymousClass10I;
import X.AnonymousClass10O;
import X.AnonymousClass10S;
import X.C21890zz;
import android.content.Context;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SoLoader {
    public static boolean A00 = true;
    public static int A01;
    public static int A02;
    public static AnonymousClass10H A03;
    public static C21890zz A04;
    public static AnonymousClass10I[] A05;
    public static final HashSet A06 = new HashSet();
    public static final AtomicInteger A07 = new AtomicInteger(0);
    public static final ReentrantReadWriteLock A08 = new ReentrantReadWriteLock();
    public static final String[] A09 = {System.mapLibraryName("breakpad")};
    public static final Map A0A = new HashMap();
    public static final Set A0B = Collections.newSetFromMap(new ConcurrentHashMap());
    public static volatile AnonymousClass10F[] A0C;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x009c A[LOOP:0: B:1:0x0001->B:21:0x009c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a6 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(android.os.StrictMode.ThreadPolicy r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, int r16) {
        /*
            r3 = 0
        L_0x0001:
            r0 = r16
            boolean r3 = A05(r12, r13, r14, r15, r0)     // Catch:{ UnsatisfiedLinkError -> 0x0008 }
            return r3
        L_0x0008:
            r11 = move-exception
            java.util.concurrent.atomic.AtomicInteger r10 = A07
            int r2 = r10.get()
            java.util.concurrent.locks.ReentrantReadWriteLock r9 = A08
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r9.writeLock()
            r0.lock()
            X.10H r7 = A03     // Catch:{ IOException -> 0x00a7 }
            if (r7 == 0) goto L_0x008c
            X.10G r0 = r7.A02     // Catch:{ IOException -> 0x00a7 }
            java.io.File r4 = r0.A00     // Catch:{ IOException -> 0x00a7 }
            android.content.Context r1 = r7.A01     // Catch:{ NameNotFoundException -> 0x009f }
            java.lang.String r0 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x009f }
            android.content.Context r6 = r1.createPackageContext(r0, r3)     // Catch:{ NameNotFoundException -> 0x009f }
            android.content.pm.ApplicationInfo r0 = r6.getApplicationInfo()     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r0 = r0.nativeLibraryDir     // Catch:{ IOException -> 0x00a7 }
            java.io.File r8 = new java.io.File     // Catch:{ IOException -> 0x00a7 }
            r8.<init>(r0)     // Catch:{ IOException -> 0x00a7 }
            boolean r0 = r4.equals(r8)     // Catch:{ IOException -> 0x00a7 }
            if (r0 != 0) goto L_0x008c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a7 }
            r1.<init>()     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r0 = "Native library directory updated from "
            r1.append(r0)     // Catch:{ IOException -> 0x00a7 }
            r1.append(r4)     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r0 = " to "
            r1.append(r0)     // Catch:{ IOException -> 0x00a7 }
            r1.append(r8)     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r5 = "SoLoader"
            android.util.Log.d(r5, r0)     // Catch:{ IOException -> 0x00a7 }
            int r0 = r7.A00     // Catch:{ IOException -> 0x00a7 }
            r4 = r0 | 1
            r7.A00 = r4     // Catch:{ IOException -> 0x00a7 }
            java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ IOException -> 0x00a7 }
            X.10G r1 = new X.10G     // Catch:{ IOException -> 0x00a7 }
            r1.<init>(r8, r0, r4)     // Catch:{ IOException -> 0x00a7 }
            r7.A02 = r1     // Catch:{ IOException -> 0x00a7 }
            int r0 = r7.A00     // Catch:{ IOException -> 0x00a7 }
            r1.A03(r0)     // Catch:{ IOException -> 0x00a7 }
            r7.A01 = r6     // Catch:{ IOException -> 0x00a7 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a7 }
            r1.<init>()     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r0 = "sApplicationSoSource updated during load: "
            r1.append(r0)     // Catch:{ IOException -> 0x00a7 }
            r1.append(r13)     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r0 = ", attempting load again."
            r1.append(r0)     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x00a7 }
            android.util.Log.w(r5, r0)     // Catch:{ IOException -> 0x00a7 }
            r10.getAndIncrement()     // Catch:{ IOException -> 0x00a7 }
            goto L_0x008e
        L_0x008c:
            r1 = 0
            goto L_0x008f
        L_0x008e:
            r1 = 1
        L_0x008f:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r9.writeLock()
            r0.unlock()
            int r0 = r10.get()
            if (r0 == r2) goto L_0x00a6
            if (r1 != 0) goto L_0x0001
            return r3
        L_0x009f:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ IOException -> 0x00a7 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00a7 }
            throw r0     // Catch:{ IOException -> 0x00a7 }
        L_0x00a6:
            throw r11
        L_0x00a7:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00ae }
            r0.<init>(r1)     // Catch:{ all -> 0x00ae }
            throw r0     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r9.writeLock()
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.A04(android.os.StrictMode$ThreadPolicy, java.lang.String, java.lang.String, java.lang.String, int):boolean");
    }

    public static int A00() {
        ReentrantReadWriteLock reentrantReadWriteLock = A08;
        reentrantReadWriteLock.writeLock().lock();
        try {
            int i = A02;
            int i2 = 0;
            if ((i & 2) != 0) {
                i2 = 1;
            }
            if ((i & 256) != 0) {
                i2 |= 4;
            }
            return i2;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01a1 A[Catch:{ Exception -> 0x014c, all -> 0x040c }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01d6 A[Catch:{ Exception -> 0x014c, all -> 0x040c }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03ad A[Catch:{ Exception -> 0x014c, all -> 0x040c }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03ef A[Catch:{ Exception -> 0x014c, all -> 0x040c }] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x03e2 A[EDGE_INSN: B:245:0x03e2->B:177:0x03e2 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.content.Context r19, X.C21890zz r20, java.lang.String[] r21, int r22) {
        /*
            r15 = r20
            r6 = r22
            boolean r0 = A03()
            if (r0 != 0) goto L_0x0487
            android.os.StrictMode$ThreadPolicy r14 = android.os.StrictMode.allowThreadDiskWrites()
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0482 }
            r3 = 1
            r0 = 23
            r4 = r19
            if (r1 < r0) goto L_0x0050
            r5 = 0
            java.lang.String r5 = r4.getPackageName()     // Catch:{ Exception -> 0x0034 }
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ Exception -> 0x0034 }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo(r5, r0)     // Catch:{ Exception -> 0x0034 }
            android.os.Bundle r1 = r0.metaData     // Catch:{ Exception -> 0x0034 }
            if (r1 == 0) goto L_0x0050
            java.lang.String r0 = "com.facebook.soloader.enabled"
            boolean r0 = r1.getBoolean(r0, r3)     // Catch:{ all -> 0x0482 }
            if (r0 != 0) goto L_0x0050
            r3 = 0
            goto L_0x0050
        L_0x0034:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0482 }
            r1.<init>()     // Catch:{ all -> 0x0482 }
            java.lang.String r0 = "Unexpected issue with package manager ("
            r1.append(r0)     // Catch:{ all -> 0x0482 }
            r1.append(r5)     // Catch:{ all -> 0x0482 }
            java.lang.String r0 = ")"
            r1.append(r0)     // Catch:{ all -> 0x0482 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0482 }
            java.lang.String r0 = "SoLoader"
            android.util.Log.w(r0, r1, r2)     // Catch:{ all -> 0x0482 }
        L_0x0050:
            A00 = r3     // Catch:{ all -> 0x0482 }
            java.lang.String r1 = "SoLoader"
            if (r3 == 0) goto L_0x0415
            int r3 = A01     // Catch:{ all -> 0x0482 }
            if (r3 != 0) goto L_0x0096
            r0 = r22 & 32
            r3 = 1
            if (r0 != 0) goto L_0x0096
            if (r19 == 0) goto L_0x0096
            android.content.pm.ApplicationInfo r7 = r4.getApplicationInfo()     // Catch:{ all -> 0x0482 }
            int r5 = r7.flags     // Catch:{ all -> 0x0482 }
            r0 = r5 & 1
            r2 = 3
            if (r0 == 0) goto L_0x0072
            r0 = r5 & 128(0x80, float:1.794E-43)
            r3 = 2
            if (r0 == 0) goto L_0x0072
            r3 = 3
        L_0x0072:
            boolean r0 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x0482 }
            if (r0 == 0) goto L_0x0096
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0482 }
            r2.<init>()     // Catch:{ all -> 0x0482 }
            java.lang.String r0 = "ApplicationInfo.flags is: "
            r2.append(r0)     // Catch:{ all -> 0x0482 }
            int r0 = r7.flags     // Catch:{ all -> 0x0482 }
            r2.append(r0)     // Catch:{ all -> 0x0482 }
            java.lang.String r0 = " appType is: "
            r2.append(r0)     // Catch:{ all -> 0x0482 }
            r2.append(r3)     // Catch:{ all -> 0x0482 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0482 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0482 }
        L_0x0096:
            A01 = r3     // Catch:{ all -> 0x0482 }
            r0 = r6 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00aa
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0482 }
            r0 = 23
            if (r2 < r0) goto L_0x00aa
            boolean r0 = com.facebook.soloader.SysUtil$MarshmallowSysdeps.A02(r4, r3)     // Catch:{ all -> 0x0482 }
            if (r0 == 0) goto L_0x00aa
            r6 = r22 | 72
        L_0x00aa:
            java.lang.Class<com.facebook.soloader.SoLoader> r11 = com.facebook.soloader.SoLoader.class
            monitor-enter(r11)     // Catch:{ all -> 0x0482 }
            if (r20 != 0) goto L_0x011e
            X.0zz r0 = A04     // Catch:{ all -> 0x047f }
            if (r0 != 0) goto L_0x0120
            java.lang.Runtime r16 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x047f }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x047f }
            r19 = 0
            r0 = 23
            if (r2 < r0) goto L_0x010d
            r0 = 27
            if (r2 > r0) goto L_0x010d
            java.lang.Class<java.lang.Runtime> r8 = java.lang.Runtime.class
            java.lang.String r7 = "nativeLoad"
            r0 = 3
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException | SecurityException -> 0x0107 }
            r0 = 0
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r5[r0] = r3     // Catch:{ NoSuchMethodException | SecurityException -> 0x0107 }
            java.lang.Class<java.lang.ClassLoader> r0 = java.lang.ClassLoader.class
            r2 = 1
            r5[r2] = r0     // Catch:{ NoSuchMethodException | SecurityException -> 0x0107 }
            r0 = 2
            r5[r0] = r3     // Catch:{ NoSuchMethodException | SecurityException -> 0x0107 }
            java.lang.reflect.Method r0 = r8.getDeclaredMethod(r7, r5)     // Catch:{ NoSuchMethodException | SecurityException -> 0x0107 }
            r0.setAccessible(r2)     // Catch:{ NoSuchMethodException | SecurityException -> 0x0107 }
            r19 = r0
            r20 = 1
            java.lang.String r9 = com.facebook.soloader.SysUtil$Api14Utils.A00()     // Catch:{ all -> 0x047f }
            if (r9 == 0) goto L_0x0110
            java.lang.String r10 = ":"
            java.lang.String[] r8 = r9.split(r10)     // Catch:{ all -> 0x047f }
            int r7 = r8.length     // Catch:{ all -> 0x047f }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x047f }
            r5.<init>(r7)     // Catch:{ all -> 0x047f }
            r3 = 0
        L_0x00f5:
            if (r3 >= r7) goto L_0x0113
            r2 = r8[r3]     // Catch:{ all -> 0x047f }
            java.lang.String r0 = "!"
            boolean r0 = r2.contains(r0)     // Catch:{ all -> 0x047f }
            if (r0 != 0) goto L_0x0104
            r5.add(r2)     // Catch:{ all -> 0x047f }
        L_0x0104:
            int r3 = r3 + 1
            goto L_0x00f5
        L_0x0107:
            r2 = move-exception
            java.lang.String r0 = "Cannot get nativeLoad method"
            android.util.Log.w(r1, r0, r2)     // Catch:{ all -> 0x047f }
        L_0x010d:
            r20 = 0
            r9 = 0
        L_0x0110:
            r18 = 0
            goto L_0x0117
        L_0x0113:
            java.lang.String r18 = android.text.TextUtils.join(r10, r5)     // Catch:{ all -> 0x047f }
        L_0x0117:
            X.10E r15 = new X.10E     // Catch:{ all -> 0x047f }
            r17 = r9
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x047f }
        L_0x011e:
            A04 = r15     // Catch:{ all -> 0x047f }
        L_0x0120:
            monitor-exit(r11)     // Catch:{ all -> 0x0482 }
            X.10F[] r0 = A0C     // Catch:{ all -> 0x0482 }
            if (r0 != 0) goto L_0x044e
            java.util.concurrent.locks.ReentrantReadWriteLock r13 = A08     // Catch:{ all -> 0x0482 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r13.writeLock()     // Catch:{ all -> 0x0482 }
            r0.lock()     // Catch:{ all -> 0x0482 }
            X.10F[] r0 = A0C     // Catch:{ all -> 0x040c }
            if (r0 != 0) goto L_0x0447
            A02 = r6     // Catch:{ all -> 0x040c }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x040c }
            r3.<init>()     // Catch:{ all -> 0x040c }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x040c }
            r7 = 0
            r0 = 23
            if (r2 < r0) goto L_0x0145
            boolean r0 = com.facebook.soloader.SysUtil$MarshmallowSysdeps.is64Bit()     // Catch:{ all -> 0x040c }
            goto L_0x0149
        L_0x0145:
            boolean r0 = com.facebook.soloader.SysUtil$LollipopSysdeps.is64Bit()     // Catch:{ Exception -> 0x014c }
        L_0x0149:
            if (r0 == 0) goto L_0x0161
            goto L_0x0164
        L_0x014c:
            r5 = move-exception
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x040c }
            java.lang.String r0 = r5.getMessage()     // Catch:{ all -> 0x040c }
            r2[r7] = r0     // Catch:{ all -> 0x040c }
            java.lang.String r0 = "Could not read /proc/self/exe. Err msg: %s"
            java.lang.String r2 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x040c }
            java.lang.String r0 = "SysUtil"
            android.util.Log.e(r0, r2)     // Catch:{ all -> 0x040c }
        L_0x0161:
            java.lang.String r7 = "/system/lib:/vendor/lib"
            goto L_0x0166
        L_0x0164:
            java.lang.String r7 = "/system/lib64:/vendor/lib64"
        L_0x0166:
            java.lang.String r0 = "LD_LIBRARY_PATH"
            java.lang.String r5 = java.lang.System.getenv(r0)     // Catch:{ all -> 0x040c }
            java.lang.String r2 = ":"
            if (r5 == 0) goto L_0x018a
            java.lang.String r0 = ""
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x040c }
            if (r0 != 0) goto L_0x018a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x040c }
            r0.<init>()     // Catch:{ all -> 0x040c }
            r0.append(r7)     // Catch:{ all -> 0x040c }
            r0.append(r2)     // Catch:{ all -> 0x040c }
            r0.append(r5)     // Catch:{ all -> 0x040c }
            java.lang.String r7 = r0.toString()     // Catch:{ all -> 0x040c }
        L_0x018a:
            java.lang.String[] r0 = r7.split(r2)     // Catch:{ all -> 0x040c }
            java.util.List r2 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x040c }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x040c }
            r0.<init>(r2)     // Catch:{ all -> 0x040c }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x040c }
        L_0x019b:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x040c }
            if (r0 == 0) goto L_0x01d3
            java.lang.Object r7 = r8.next()     // Catch:{ all -> 0x040c }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x040c }
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r1, r0)     // Catch:{ all -> 0x040c }
            if (r0 == 0) goto L_0x01c2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x040c }
            r2.<init>()     // Catch:{ all -> 0x040c }
            java.lang.String r0 = "adding system library source: "
            r2.append(r0)     // Catch:{ all -> 0x040c }
            r2.append(r7)     // Catch:{ all -> 0x040c }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x040c }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x040c }
        L_0x01c2:
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x040c }
            r5.<init>(r7)     // Catch:{ all -> 0x040c }
            r2 = 2
            X.10G r0 = new X.10G     // Catch:{ all -> 0x040c }
            r7 = r21
            r0.<init>(r5, r7, r2)     // Catch:{ all -> 0x040c }
            r3.add(r0)     // Catch:{ all -> 0x040c }
            goto L_0x019b
        L_0x01d3:
            r5 = 3
            if (r4 == 0) goto L_0x0398
            r0 = r6 & 1
            if (r0 == 0) goto L_0x01f1
            int r6 = A01     // Catch:{ all -> 0x040c }
            r2 = 1
            r0 = 0
            if (r6 == r2) goto L_0x037e
            r0 = 2
            if (r6 == r0) goto L_0x01ee
            if (r6 == r5) goto L_0x01ee
            java.lang.String r0 = "Unsupported app type, we should not reach here"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x040c }
            r1.<init>(r0)     // Catch:{ all -> 0x040c }
            goto L_0x0284
        L_0x01ee:
            r0 = 1
            goto L_0x037e
        L_0x01f1:
            r0 = r6 & 64
            if (r0 == 0) goto L_0x0272
            r7 = 0
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ all -> 0x040c }
            java.lang.String[] r0 = r0.splitSourceDirs     // Catch:{ all -> 0x040c }
            if (r0 == 0) goto L_0x0242
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ all -> 0x040c }
            java.lang.String[] r10 = r0.splitSourceDirs     // Catch:{ all -> 0x040c }
            int r9 = r10.length     // Catch:{ all -> 0x040c }
            r8 = 0
        L_0x0206:
            if (r8 >= r9) goto L_0x0242
            r2 = r10[r8]     // Catch:{ all -> 0x040c }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x040c }
            r0.<init>(r2)     // Catch:{ all -> 0x040c }
            X.4rO r6 = new X.4rO     // Catch:{ all -> 0x040c }
            r6.<init>((java.io.File) r0)     // Catch:{ all -> 0x040c }
            boolean r0 = android.util.Log.isLoggable(r1, r5)     // Catch:{ all -> 0x040c }
            if (r0 == 0) goto L_0x0232
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x040c }
            r2.<init>()     // Catch:{ all -> 0x040c }
            java.lang.String r0 = "validating/adding directApk source from splitApk: "
            r2.append(r0)     // Catch:{ all -> 0x040c }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x040c }
            r2.append(r0)     // Catch:{ all -> 0x040c }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x040c }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x040c }
        L_0x0232:
            java.util.Set r0 = r6.A02     // Catch:{ all -> 0x040c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x040c }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x023f
            r3.add(r7, r6)     // Catch:{ all -> 0x040c }
        L_0x023f:
            int r8 = r8 + 1
            goto L_0x0206
        L_0x0242:
            X.4rO r6 = new X.4rO     // Catch:{ all -> 0x040c }
            r6.<init>((android.content.Context) r4)     // Catch:{ all -> 0x040c }
            boolean r0 = android.util.Log.isLoggable(r1, r5)     // Catch:{ all -> 0x040c }
            if (r0 == 0) goto L_0x0265
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x040c }
            r2.<init>()     // Catch:{ all -> 0x040c }
            java.lang.String r0 = "validating/adding directApk source: "
            r2.append(r0)     // Catch:{ all -> 0x040c }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x040c }
            r2.append(r0)     // Catch:{ all -> 0x040c }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x040c }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x040c }
        L_0x0265:
            java.util.Set r0 = r6.A02     // Catch:{ all -> 0x040c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x040c }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0272
            r3.add(r7, r6)     // Catch:{ all -> 0x040c }
        L_0x0272:
            int r6 = A01     // Catch:{ all -> 0x040c }
            r2 = 1
            r0 = 0
            if (r6 == r2) goto L_0x0286
            r0 = 2
            if (r6 == r0) goto L_0x0285
            if (r6 == r5) goto L_0x0285
            java.lang.String r0 = "Unsupported app type, we should not reach here"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x040c }
            r1.<init>(r0)     // Catch:{ all -> 0x040c }
        L_0x0284:
            throw r1     // Catch:{ all -> 0x040c }
        L_0x0285:
            r0 = 1
        L_0x0286:
            A02(r4, r3, r0)     // Catch:{ all -> 0x040c }
            int r0 = A02     // Catch:{ all -> 0x040c }
            r0 = r0 & 8
            java.lang.String r8 = "lib-main"
            if (r0 == 0) goto L_0x02d3
            r0 = 0
            A05 = r0     // Catch:{ all -> 0x040c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x040c }
            r2.<init>()     // Catch:{ all -> 0x040c }
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ all -> 0x040c }
            java.lang.String r0 = r0.dataDir     // Catch:{ all -> 0x040c }
            r2.append(r0)     // Catch:{ all -> 0x040c }
            java.lang.String r0 = "/"
            r2.append(r0)     // Catch:{ all -> 0x040c }
            r2.append(r8)     // Catch:{ all -> 0x040c }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x040c }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x040c }
            r6.<init>(r0)     // Catch:{ all -> 0x040c }
            X.C131706Qe.A00(r6)     // Catch:{ IOException -> 0x02b8 }
            goto L_0x0398
        L_0x02b8:
            r4 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x040c }
            r2.<init>()     // Catch:{ all -> 0x040c }
            java.lang.String r0 = "Failed to delete "
            r2.append(r0)     // Catch:{ all -> 0x040c }
            java.lang.String r0 = r6.getCanonicalPath()     // Catch:{ all -> 0x040c }
            r2.append(r0)     // Catch:{ all -> 0x040c }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x040c }
            android.util.Log.w(r1, r0, r4)     // Catch:{ all -> 0x040c }
            goto L_0x0398
        L_0x02d3:
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ all -> 0x040c }
            java.lang.String r2 = r0.sourceDir     // Catch:{ all -> 0x040c }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x040c }
            r0.<init>(r2)     // Catch:{ all -> 0x040c }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x040c }
            r7.<init>()     // Catch:{ all -> 0x040c }
            X.10J r6 = new X.10J     // Catch:{ all -> 0x040c }
            r6.<init>(r4, r0, r8)     // Catch:{ all -> 0x040c }
            r7.add(r6)     // Catch:{ all -> 0x040c }
            boolean r0 = android.util.Log.isLoggable(r1, r5)     // Catch:{ all -> 0x040c }
            if (r0 == 0) goto L_0x0309
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x040c }
            r2.<init>()     // Catch:{ all -> 0x040c }
            java.lang.String r0 = "adding backup source from : "
            r2.append(r0)     // Catch:{ all -> 0x040c }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x040c }
            r2.append(r0)     // Catch:{ all -> 0x040c }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x040c }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x040c }
        L_0x0309:
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ all -> 0x040c }
            java.lang.String[] r0 = r0.splitSourceDirs     // Catch:{ all -> 0x040c }
            if (r0 == 0) goto L_0x036b
            boolean r0 = android.util.Log.isLoggable(r1, r5)     // Catch:{ all -> 0x040c }
            if (r0 == 0) goto L_0x031c
            java.lang.String r0 = "adding backup sources from split apks"
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x040c }
        L_0x031c:
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ all -> 0x040c }
            java.lang.String[] r11 = r0.splitSourceDirs     // Catch:{ all -> 0x040c }
            int r10 = r11.length     // Catch:{ all -> 0x040c }
            r9 = 0
            r6 = 0
        L_0x0325:
            if (r9 >= r10) goto L_0x036b
            r0 = r11[r9]     // Catch:{ all -> 0x040c }
            java.io.File r12 = new java.io.File     // Catch:{ all -> 0x040c }
            r12.<init>(r0)     // Catch:{ all -> 0x040c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x040c }
            r2.<init>()     // Catch:{ all -> 0x040c }
            java.lang.String r0 = "lib-"
            r2.append(r0)     // Catch:{ all -> 0x040c }
            int r8 = r6 + 1
            r2.append(r6)     // Catch:{ all -> 0x040c }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x040c }
            X.10J r6 = new X.10J     // Catch:{ all -> 0x040c }
            r6.<init>(r4, r12, r0)     // Catch:{ all -> 0x040c }
            boolean r0 = android.util.Log.isLoggable(r1, r5)     // Catch:{ all -> 0x040c }
            if (r0 == 0) goto L_0x0364
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x040c }
            r2.<init>()     // Catch:{ all -> 0x040c }
            java.lang.String r0 = "adding backup source: "
            r2.append(r0)     // Catch:{ all -> 0x040c }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x040c }
            r2.append(r0)     // Catch:{ all -> 0x040c }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x040c }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x040c }
        L_0x0364:
            r7.add(r6)     // Catch:{ all -> 0x040c }
            int r9 = r9 + 1
            r6 = r8
            goto L_0x0325
        L_0x036b:
            int r0 = r7.size()     // Catch:{ all -> 0x040c }
            X.10I[] r0 = new X.AnonymousClass10I[r0]     // Catch:{ all -> 0x040c }
            java.lang.Object[] r0 = r7.toArray(r0)     // Catch:{ all -> 0x040c }
            X.10I[] r0 = (X.AnonymousClass10I[]) r0     // Catch:{ all -> 0x040c }
            A05 = r0     // Catch:{ all -> 0x040c }
            r0 = 0
            r3.addAll(r0, r7)     // Catch:{ all -> 0x040c }
            goto L_0x0398
        L_0x037e:
            A02(r4, r3, r0)     // Catch:{ all -> 0x040c }
            r0 = 0
            A05 = r0     // Catch:{ all -> 0x040c }
            boolean r0 = android.util.Log.isLoggable(r1, r5)     // Catch:{ all -> 0x040c }
            if (r0 == 0) goto L_0x038f
            java.lang.String r0 = "adding exo package source: lib-main"
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x040c }
        L_0x038f:
            r2 = 0
            X.895 r0 = new X.895     // Catch:{ all -> 0x040c }
            r0.<init>(r4)     // Catch:{ all -> 0x040c }
            r3.add(r2, r0)     // Catch:{ all -> 0x040c }
        L_0x0398:
            int r0 = r3.size()     // Catch:{ all -> 0x040c }
            X.10F[] r0 = new X.AnonymousClass10F[r0]     // Catch:{ all -> 0x040c }
            java.lang.Object[] r6 = r3.toArray(r0)     // Catch:{ all -> 0x040c }
            X.10F[] r6 = (X.AnonymousClass10F[]) r6     // Catch:{ all -> 0x040c }
            int r4 = A00()     // Catch:{ all -> 0x040c }
            int r0 = r6.length     // Catch:{ all -> 0x040c }
        L_0x03a9:
            int r3 = r0 + -1
            if (r0 <= 0) goto L_0x03e2
            boolean r0 = android.util.Log.isLoggable(r1, r5)     // Catch:{ all -> 0x040c }
            if (r0 == 0) goto L_0x03c9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x040c }
            r2.<init>()     // Catch:{ all -> 0x040c }
            java.lang.String r0 = "Preparing SO source: "
            r2.append(r0)     // Catch:{ all -> 0x040c }
            r0 = r6[r3]     // Catch:{ all -> 0x040c }
            r2.append(r0)     // Catch:{ all -> 0x040c }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x040c }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x040c }
        L_0x03c9:
            java.lang.String r2 = "_"
            r0 = r6[r3]     // Catch:{ all -> 0x040c }
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x040c }
            java.lang.String r0 = r0.getSimpleName()     // Catch:{ all -> 0x040c }
            com.facebook.soloader.Api18TraceUtils.A01(r1, r2, r0)     // Catch:{ all -> 0x040c }
            r0 = r6[r3]     // Catch:{ all -> 0x040c }
            r0.A03(r4)     // Catch:{ all -> 0x040c }
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ all -> 0x040c }
            r0 = r3
            goto L_0x03a9
        L_0x03e2:
            A0C = r6     // Catch:{ all -> 0x040c }
            java.util.concurrent.atomic.AtomicInteger r0 = A07     // Catch:{ all -> 0x040c }
            r0.getAndIncrement()     // Catch:{ all -> 0x040c }
            boolean r0 = android.util.Log.isLoggable(r1, r5)     // Catch:{ all -> 0x040c }
            if (r0 == 0) goto L_0x0447
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x040c }
            r2.<init>()     // Catch:{ all -> 0x040c }
            java.lang.String r0 = "init finish: "
            r2.append(r0)     // Catch:{ all -> 0x040c }
            X.10F[] r0 = A0C     // Catch:{ all -> 0x040c }
            int r0 = r0.length     // Catch:{ all -> 0x040c }
            r2.append(r0)     // Catch:{ all -> 0x040c }
            java.lang.String r0 = " SO sources prepared"
            r2.append(r0)     // Catch:{ all -> 0x040c }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x040c }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x040c }
            goto L_0x0447
        L_0x040c:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r13.writeLock()     // Catch:{ all -> 0x0482 }
            r0.unlock()     // Catch:{ all -> 0x0482 }
            goto L_0x0434
        L_0x0415:
            X.10F[] r0 = A0C     // Catch:{ all -> 0x0482 }
            if (r0 != 0) goto L_0x043c
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = A08     // Catch:{ all -> 0x0482 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r2.writeLock()     // Catch:{ all -> 0x0482 }
            r0.lock()     // Catch:{ all -> 0x0482 }
            X.10F[] r0 = A0C     // Catch:{ all -> 0x042c }
            if (r0 != 0) goto L_0x0435
            r0 = 0
            X.10F[] r0 = new X.AnonymousClass10F[r0]     // Catch:{ all -> 0x042c }
            A0C = r0     // Catch:{ all -> 0x042c }
            goto L_0x0435
        L_0x042c:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r2.writeLock()     // Catch:{ all -> 0x0482 }
            r0.unlock()     // Catch:{ all -> 0x0482 }
        L_0x0434:
            throw r1     // Catch:{ all -> 0x0482 }
        L_0x0435:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r2.writeLock()     // Catch:{ all -> 0x0482 }
            r0.unlock()     // Catch:{ all -> 0x0482 }
        L_0x043c:
            java.lang.String r0 = "Init System Loader delegate"
            android.util.Log.v(r1, r0)     // Catch:{ all -> 0x0482 }
            X.A2b r3 = new X.A2b     // Catch:{ all -> 0x0482 }
            r3.<init>()     // Catch:{ all -> 0x0482 }
            goto L_0x0458
        L_0x0447:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r13.writeLock()     // Catch:{ all -> 0x0482 }
            r0.unlock()     // Catch:{ all -> 0x0482 }
        L_0x044e:
            java.lang.String r0 = "Init SoLoader delegate"
            android.util.Log.v(r1, r0)     // Catch:{ all -> 0x0482 }
            X.10N r3 = new X.10N     // Catch:{ all -> 0x0482 }
            r3.<init>()     // Catch:{ all -> 0x0482 }
        L_0x0458:
            java.lang.Class<X.10O> r2 = X.AnonymousClass10O.class
            monitor-enter(r2)     // Catch:{ all -> 0x0482 }
            X.10M r1 = X.AnonymousClass10O.A00     // Catch:{ all -> 0x047c }
            r0 = 0
            if (r1 == 0) goto L_0x0461
            r0 = 1
        L_0x0461:
            monitor-exit(r2)     // Catch:{ all -> 0x047c }
            if (r0 != 0) goto L_0x0478
            monitor-enter(r2)     // Catch:{ all -> 0x0482 }
            X.10M r0 = X.AnonymousClass10O.A00     // Catch:{ all -> 0x0475 }
            if (r0 != 0) goto L_0x046d
            X.AnonymousClass10O.A00 = r3     // Catch:{ all -> 0x0475 }
            monitor-exit(r2)     // Catch:{ all -> 0x0475 }
            goto L_0x0478
        L_0x046d:
            java.lang.String r1 = "Cannot re-initialize NativeLoader."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0475 }
            r0.<init>(r1)     // Catch:{ all -> 0x0475 }
            throw r0     // Catch:{ all -> 0x0475 }
        L_0x0475:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0475 }
            goto L_0x0481
        L_0x0478:
            android.os.StrictMode.setThreadPolicy(r14)
            return
        L_0x047c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x047c }
            goto L_0x0481
        L_0x047f:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0482 }
        L_0x0481:
            throw r0     // Catch:{ all -> 0x0482 }
        L_0x0482:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r14)
            throw r0
        L_0x0487:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.A01(android.content.Context, X.0zz, java.lang.String[], int):void");
    }

    public static void A02(Context context, ArrayList arrayList, int i) {
        A03 = new AnonymousClass10H(context, i);
        if (Log.isLoggable("SoLoader", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("adding application source: ");
            sb.append(A03.toString());
            Log.d("SoLoader", sb.toString());
        }
        arrayList.add(0, A03);
    }

    public static boolean A03() {
        boolean z = true;
        if (A0C != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = A08;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (A0C == null) {
                z = false;
            }
            return z;
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0126, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r18.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        com.facebook.soloader.Api18TraceUtils.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0136, code lost:
        if (r16 == false) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0138, code lost:
        android.os.StrictMode.setThreadPolicy(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x013b, code lost:
        if (r4 == 0) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x013d, code lost:
        if (r4 != 3) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x013f, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("couldn't find DSO to load: ");
        r2.append(r13);
        r18.readLock().lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0154, code lost:
        if (r5 >= A0C.length) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0156, code lost:
        r2.append("\n\tSoSource ");
        r2.append(r5);
        r2.append(": ");
        r2.append(A0C[r5].toString());
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0171, code lost:
        r0 = A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0173, code lost:
        if (r0 == null) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        r1 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0181, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0187, code lost:
        throw new java.lang.RuntimeException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0188, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0189, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x018b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x018c, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        r18.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0194, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0195, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        com.facebook.soloader.Api18TraceUtils.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0199, code lost:
        if (r16 != false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x019b, code lost:
        android.os.StrictMode.setThreadPolicy(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x019e, code lost:
        if (r5 != 0) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01a0, code lost:
        if (r5 == 3) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x01a7, code lost:
        if (android.util.Log.isLoggable("SoLoader", 3) != false) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x01a9, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Loaded: ");
        r1.append(r13);
        android.util.Log.d("SoLoader", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x01bd, code lost:
        monitor-enter(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        r10.add(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x01c4, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("couldn't find DSO to load: ");
        r3.append(r13);
        r1 = r2.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x01d7, code lost:
        if (r1 == null) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x01d9, code lost:
        r1 = r2.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x01dd, code lost:
        r3.append(" caused by: ");
        r3.append(r1);
        r2.printStackTrace();
        r3.append(" result: ");
        r3.append(r5);
        r0 = r3.toString();
        android.util.Log.e("SoLoader", r0);
        r1 = new java.lang.UnsatisfiedLinkError(r0);
        r1.initCause(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Could not load: ");
        r1.append(r13);
        r1.append(" because no SO source exists");
        android.util.Log.e("SoLoader", r1.toString());
        r0 = new java.lang.StringBuilder();
        r0.append("couldn't find DSO to load: ");
        r0.append(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x022d, code lost:
        throw new java.lang.UnsatisfiedLinkError(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x022e, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        r18.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0237, code lost:
        r1 = new java.io.File(r1.createPackageContext(r1.getPackageName(), 0).getApplicationInfo().nativeLibraryDir);
        r2.append("\n\tNative lib dir: ");
        r2.append(r1.getAbsolutePath());
        r2.append("\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0253, code lost:
        r18.readLock().unlock();
        r2.append(" result: ");
        r2.append(r4);
        r0 = r2.toString();
        android.util.Log.e("SoLoader", r0);
        r1 = new java.lang.UnsatisfiedLinkError(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x026e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x026f, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:?, code lost:
        r2 = r3.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x028b, code lost:
        throw new X.C1511578l(r2.substring(r2.lastIndexOf("unexpected e_machine:")), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x028c, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0292, code lost:
        if ((r24 & 16) == 0) goto L_0x0294;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x02a2, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x02a7, code lost:
        com.facebook.soloader.Api18TraceUtils.A01("MergedSoMapping.invokeJniOnload[", r12, "]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x02b4, code lost:
        if (android.util.Log.isLoggable("SoLoader", 3) != false) goto L_0x02b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x02b6, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("About to merge: ");
        r1.append(r12);
        r1.append(" / ");
        r1.append(r13);
        android.util.Log.d("SoLoader", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x02d6, code lost:
        switch(r12.hashCode()) {
            case -2132109298: goto L_0x05a3;
            case -2112908723: goto L_0x0596;
            case -2084134425: goto L_0x0589;
            case -1924924588: goto L_0x057c;
            case -1916805629: goto L_0x056f;
            case -1861793634: goto L_0x0562;
            case -1776425186: goto L_0x0555;
            case -1721640191: goto L_0x0548;
            case -1606294708: goto L_0x053b;
            case -1484045932: goto L_0x052e;
            case -1389936073: goto L_0x0520;
            case -1347925350: goto L_0x0512;
            case -1293854543: goto L_0x0504;
            case -1290530873: goto L_0x04f6;
            case -1148924054: goto L_0x04e8;
            case -1117731165: goto L_0x04da;
            case -1098209777: goto L_0x04cc;
            case -1059361352: goto L_0x04be;
            case -1053039321: goto L_0x04b0;
            case -902468257: goto L_0x04a2;
            case -747990041: goto L_0x0494;
            case -449618447: goto L_0x0486;
            case -439414708: goto L_0x0478;
            case -381653348: goto L_0x046a;
            case -378888163: goto L_0x045c;
            case -327000206: goto L_0x044e;
            case -253106228: goto L_0x0440;
            case -194623424: goto L_0x0432;
            case -120202075: goto L_0x0424;
            case -61423793: goto L_0x0416;
            case 101517: goto L_0x0408;
            case 64916380: goto L_0x03fa;
            case 92309290: goto L_0x03ec;
            case 322449263: goto L_0x03de;
            case 395167905: goto L_0x03d0;
            case 451661819: goto L_0x03c2;
            case 469371245: goto L_0x03b4;
            case 627805909: goto L_0x03a6;
            case 656562322: goto L_0x0398;
            case 681123117: goto L_0x038a;
            case 777959537: goto L_0x037c;
            case 1078126824: goto L_0x036e;
            case 1250385981: goto L_0x0360;
            case 1270408060: goto L_0x0352;
            case 1540136281: goto L_0x0344;
            case 1584936478: goto L_0x0336;
            case 1737184630: goto L_0x0328;
            case 1780520651: goto L_0x031a;
            case 1825980878: goto L_0x030c;
            case 1995804693: goto L_0x02fe;
            case 2045224032: goto L_0x02f0;
            default: goto L_0x02d9;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x02d9, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Unknown library: ");
        r1.append(r12);
        r1 = new java.lang.IllegalArgumentException(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x02ef, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x02f6, code lost:
        if (r12.equals("ard-android-async-asset-fetcher-listener") != false) goto L_0x02f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x02f8, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libard_android_async_asset_fetcher_listener_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0304, code lost:
        if (r12.equals("tar-brotli-archive-native") != false) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0306, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libtar_brotli_archive_native_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        r18 = A08;
        r18.readLock().lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0312, code lost:
        if (r12.equals("musiceffect-native") != false) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0314, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libmusiceffect_native_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0320, code lost:
        if (r12.equals("filters-native-android") != false) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0322, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfilters_native_android_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x032e, code lost:
        if (r12.equals("batch-box-cox-ops-xplat") != false) goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0330, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libbatch_box_cox_ops_xplat_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x033c, code lost:
        if (r12.equals("jniuserflow") != false) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x033e, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libjniuserflow_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x034a, code lost:
        if (r12.equals("xanalyticsadapter-jni") != false) goto L_0x034c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x034c, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxanalyticsadapter_jni_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0358, code lost:
        if (r12.equals("xplat_arfx_services_impl_avatars_avatarsAndroid") != false) goto L_0x035a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x035a, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxplat_arfx_services_impl_avatars_avatarsAndroid_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0366, code lost:
        if (r12.equals("gltfholdernew") != false) goto L_0x0368;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0368, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libgltfholdernew_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0374, code lost:
        if (r12.equals("xplat_ecos_ecosAndroid") != false) goto L_0x0376;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0376, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxplat_ecos_ecosAndroid_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0382, code lost:
        if (r12.equals("unet-106-ops-xplat") != false) goto L_0x0384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0384, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libunet_106_ops_xplat_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0390, code lost:
        if (r12.equals("single-model-cache-native-android") != false) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0392, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libsingle_model_cache_native_android_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        r21 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x039e, code lost:
        if (r12.equals("double-conversion") != false) goto L_0x03a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x03a0, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libdouble_conversion_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x03ac, code lost:
        if (r12.equals("avatarsdataprovider") != false) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x03ae, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libavatarsdataprovider_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x03ba, code lost:
        if (r12.equals("xplat_arfx_services_interfaces_interfacesAndroid") != false) goto L_0x03bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x03bc, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxplat_arfx_services_interfaces_interfacesAndroid_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x03c8, code lost:
        if (r12.equals("jniexecutors") != false) goto L_0x03ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        if (r19 != false) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x03ca, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libjniexecutors_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x03d6, code lost:
        if (r12.equals("ard-android-async-asset-fetcher") != false) goto L_0x03d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x03d8, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libard_android_async_asset_fetcher_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x03e4, code lost:
        if (r12.equals("camera-xplat-spars-jni") != false) goto L_0x03e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x03e6, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libcamera_xplat_spars_jni_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x03f2, code lost:
        if (r12.equals("ard-android-network-consent-manager-impl") != false) goto L_0x03f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x03f4, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libard_android_network_consent_manager_impl_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0400, code lost:
        if (r12.equals("maskrcnn-ops-xplat") != false) goto L_0x0402;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0402, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libmaskrcnn_ops_xplat_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x040e, code lost:
        if (r12.equals("fmt") != false) goto L_0x0410;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0410, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfmt_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x041c, code lost:
        if (r12.equals("asyncexecutor") != false) goto L_0x041e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x041e, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libasyncexecutor_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        monitor-enter(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x042a, code lost:
        if (r12.equals("xplat_hermes_lib_Platform_Unicode_UnicodeAndroid") != false) goto L_0x042c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x042c, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxplat_hermes_lib_Platform_Unicode_UnicodeAndroid_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0438, code lost:
        if (r12.equals("arengineservicesutils") != false) goto L_0x043a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x043a, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarengineservicesutils_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0446, code lost:
        if (r12.equals("profiloextapi") != false) goto L_0x0448;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0448, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libprofiloextapi_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0454, code lost:
        if (r12.equals("graphicsengine-whatsapp-native") != false) goto L_0x0456;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0456, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libgraphicsengine_whatsapp_native_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0462, code lost:
        if (r12.equals("target-recognition-android") != false) goto L_0x0464;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0464, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libtarget_recognition_android_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0470, code lost:
        if (r12.equals("fbacore-jni") != false) goto L_0x0472;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0472, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfbacore_jni_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x047e, code lost:
        if (r12.equals("audiograph-native") != false) goto L_0x0480;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0480, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libaudiograph_native_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x048c, code lost:
        if (r12.equals("gputimer-jni") != false) goto L_0x048e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x048e, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libgputimer_jni_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x049a, code lost:
        if (r12.equals("arclass") != false) goto L_0x049c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x049c, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarclass_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x04a8, code lost:
        if (r12.equals("sigmux") != false) goto L_0x04aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x04aa, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libsigmux_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0055, code lost:
        if (r10.contains(r13) == false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x04b6, code lost:
        if (r12.equals("arpersistenceservice") != false) goto L_0x04b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x04b8, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarpersistenceservice_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x04c4, code lost:
        if (r12.equals("featureconfig") != false) goto L_0x04c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x04c6, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfeatureconfig_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x04d2, code lost:
        if (r12.equals("yogacore") != false) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x04d4, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libyogacore_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x04e0, code lost:
        if (r12.equals("arfx-engine-plugin-touch_gestures") != false) goto L_0x04e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0057, code lost:
        if (r23 != null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x04e2, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarfx_engine_plugin_touch_gestures_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x04ee, code lost:
        if (r12.equals("hybridlogsinkjni") != false) goto L_0x04f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x04f0, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libhybridlogsinkjni_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x04fc, code lost:
        if (r12.equals("opus_mlow") != false) goto L_0x04fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x04fe, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libopus_mlow_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x050a, code lost:
        if (r12.equals("native_bridge") != false) goto L_0x050c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x050c, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libnative_bridge_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0059, code lost:
        monitor-exit(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0518, code lost:
        if (r12.equals("flatbuffers") != false) goto L_0x051a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x051a, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libflatbuffers_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0526, code lost:
        if (r12.equals("ardcache-stash") != false) goto L_0x0528;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0528, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libardcache_stash_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0534, code lost:
        if (r12.equals("ard-android-network-consent-manager-interf") != false) goto L_0x0536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0536, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libard_android_network_consent_manager_interf_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0541, code lost:
        if (r12.equals("dynamic_pytorch_impl") != false) goto L_0x0543;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0543, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libdynamic_pytorch_impl_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x054e, code lost:
        if (r12.equals("arfx-engine-plugin-avatars") != false) goto L_0x0550;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0550, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarfx_engine_plugin_avatars_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x055b, code lost:
        if (r12.equals("jniperflogger") != false) goto L_0x055d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x055d, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libjniperflogger_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0568, code lost:
        if (r12.equals("versioned-model-cache-native-android") != false) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x056a, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libversioned_model_cache_native_android_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0575, code lost:
        if (r12.equals("roi-align-ops-xplat") != false) goto L_0x0577;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0577, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libroi_align_ops_xplat_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0582, code lost:
        if (r12.equals("fbsystrace") != false) goto L_0x0584;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0584, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfbsystrace_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x058f, code lost:
        if (r12.equals("ardcache-jni") != false) goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0591, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libardcache_jni_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x059c, code lost:
        if (r12.equals("stash-jni") != false) goto L_0x059e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x059e, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libstash_jni_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x05a9, code lost:
        if (r12.equals("spark-qpluserflow-native") != false) goto L_0x05ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x05ab, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libspark_qpluserflow_native_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x05af, code lost:
        if (r0 != 0) goto L_0x05b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x05b2, code lost:
        r1 = new java.lang.UnsatisfiedLinkError("Failed to invoke native library JNI_OnLoad");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x05bb, code lost:
        A0B.add(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0062, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x05c1, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Failed to call JNI_OnLoad from '");
        r1.append(r12);
        r1.append("', which has been merged into '");
        r1.append(r13);
        r1.append("'.  See comment for details.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x05e5, code lost:
        throw new java.lang.RuntimeException(r1.toString(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x05e6, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:?, code lost:
        com.facebook.soloader.Api18TraceUtils.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x05ea, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x05eb, code lost:
        com.facebook.soloader.Api18TraceUtils.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x05ee, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0063, code lost:
        r19 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x05ef, code lost:
        r18.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x05f8, code lost:
        return !r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x05fc, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x05fd, code lost:
        r18.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0604, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        monitor-exit(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0066, code lost:
        if (r19 != false) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006e, code lost:
        if (android.util.Log.isLoggable("SoLoader", 3) == false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0070, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("About to load: ");
        r1.append(r13);
        android.util.Log.d("SoLoader", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0084, code lost:
        r18.readLock().lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0091, code lost:
        if (A0C == null) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r18.readLock().unlock();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009b, code lost:
        if (r14 != null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x009e, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a1, code lost:
        r14 = android.os.StrictMode.allowThreadDiskReads();
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a7, code lost:
        com.facebook.soloader.Api18TraceUtils.A01("SoLoader.loadLibrary[", r13, "]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r18.readLock().lock();
        r4 = 0;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ba, code lost:
        if (r2 >= A0C.length) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00bc, code lost:
        r4 = A0C[r2].A02(r14, r13, r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c6, code lost:
        if (r4 != 3) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ca, code lost:
        if (A05 == null) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00d0, code lost:
        if (android.util.Log.isLoggable("SoLoader", 3) == false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00d2, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Trying backup SoSource for ");
        r1.append(r13);
        android.util.Log.d("SoLoader", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e6, code lost:
        r15 = A05;
        r22 = r15.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ed, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00ef, code lost:
        if (r4 != 0) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00f4, code lost:
        if (r3 >= r22) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00f6, code lost:
        r2 = r15[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00f8, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r1 = r2.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00fb, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        r0 = r1.get(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0100, code lost:
        if (r0 != null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0102, code lost:
        r0 = new java.lang.Object();
        r1.put(r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x010a, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r2.A00 = r13;
        r2.A03(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0112, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x011b, code lost:
        if (r2.A02(r14, r13, r21) != 1) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x011e, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0121, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0123, code lost:
        r3 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:124:0x0175, B:138:0x0196] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x019b A[Catch:{ NameNotFoundException -> 0x0181, UnsatisfiedLinkError -> 0x026f }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01a0 A[Catch:{ NameNotFoundException -> 0x0181, UnsatisfiedLinkError -> 0x026f }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01d9 A[Catch:{ NameNotFoundException -> 0x0181, UnsatisfiedLinkError -> 0x026f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(android.os.StrictMode.ThreadPolicy r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, int r24) {
        /*
            r14 = r20
            java.lang.Class<com.facebook.soloader.SoLoader> r20 = com.facebook.soloader.SoLoader.class
            r12 = r22
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r11 = 0
            if (r0 != 0) goto L_0x0016
            java.util.Set r0 = A0B
            boolean r0 = r0.contains(r12)
            if (r0 == 0) goto L_0x0016
            return r11
        L_0x0016:
            monitor-enter(r20)
            java.util.HashSet r10 = A06     // Catch:{ all -> 0x0605 }
            r13 = r21
            boolean r0 = r10.contains(r13)     // Catch:{ all -> 0x0605 }
            if (r0 == 0) goto L_0x0028
            if (r23 != 0) goto L_0x0025
            monitor-exit(r20)     // Catch:{ all -> 0x0605 }
            return r11
        L_0x0025:
            r19 = 1
            goto L_0x002a
        L_0x0028:
            r19 = 0
        L_0x002a:
            java.util.Map r1 = A0A     // Catch:{ all -> 0x0605 }
            boolean r0 = r1.containsKey(r13)     // Catch:{ all -> 0x0605 }
            if (r0 == 0) goto L_0x0038
            java.lang.Object r9 = r1.get(r13)     // Catch:{ all -> 0x0605 }
        L_0x0036:
            monitor-exit(r20)     // Catch:{ all -> 0x0605 }
            goto L_0x0041
        L_0x0038:
            java.lang.Object r9 = new java.lang.Object     // Catch:{ all -> 0x0605 }
            r9.<init>()     // Catch:{ all -> 0x0605 }
            r1.put(r13, r9)     // Catch:{ all -> 0x0605 }
            goto L_0x0036
        L_0x0041:
            java.util.concurrent.locks.ReentrantReadWriteLock r18 = A08
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()
            r0.lock()
            monitor-enter(r9)     // Catch:{ all -> 0x05fc }
            r8 = 3
            r21 = r24
            if (r19 != 0) goto L_0x0290
            monitor-enter(r20)     // Catch:{ all -> 0x05f9 }
            boolean r0 = r10.contains(r13)     // Catch:{ all -> 0x028c }
            if (r0 == 0) goto L_0x0065
            if (r23 != 0) goto L_0x0063
            monitor-exit(r20)     // Catch:{ all -> 0x028c }
            monitor-exit(r9)     // Catch:{ all -> 0x05f9 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()
            r0.unlock()
            return r11
        L_0x0063:
            r19 = 1
        L_0x0065:
            monitor-exit(r20)     // Catch:{ all -> 0x028c }
            if (r19 != 0) goto L_0x0290
            java.lang.String r7 = "SoLoader"
            boolean r0 = android.util.Log.isLoggable(r7, r8)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            if (r0 == 0) goto L_0x0084
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r1.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.lang.String r0 = "About to load: "
            r1.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r1.append(r13)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.lang.String r0 = r1.toString()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            android.util.Log.d(r7, r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
        L_0x0084:
            java.lang.String r17 = " result: "
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r0.lock()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            X.10F[] r0 = A0C     // Catch:{ all -> 0x022e }
            java.lang.String r6 = "couldn't find DSO to load: "
            if (r0 == 0) goto L_0x0200
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r0.unlock()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r5 = 0
            if (r14 != 0) goto L_0x009e
            goto L_0x00a1
        L_0x009e:
            r16 = 0
            goto L_0x00a7
        L_0x00a1:
            android.os.StrictMode$ThreadPolicy r14 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r16 = 1
        L_0x00a7:
            java.lang.String r1 = "SoLoader.loadLibrary["
            java.lang.String r0 = "]"
            com.facebook.soloader.Api18TraceUtils.A01(r1, r13, r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()     // Catch:{ all -> 0x0195 }
            r0.lock()     // Catch:{ all -> 0x0195 }
            r4 = 0
            r2 = 0
        L_0x00b7:
            X.10F[] r0 = A0C     // Catch:{ all -> 0x018b }
            int r0 = r0.length     // Catch:{ all -> 0x018b }
            if (r2 >= r0) goto L_0x012c
            X.10F[] r0 = A0C     // Catch:{ all -> 0x018b }
            r1 = r0[r2]     // Catch:{ all -> 0x018b }
            r0 = r21
            int r4 = r1.A02(r14, r13, r0)     // Catch:{ all -> 0x018b }
            if (r4 != r8) goto L_0x00ed
            X.10I[] r0 = A05     // Catch:{ all -> 0x018b }
            if (r0 == 0) goto L_0x012c
            boolean r0 = android.util.Log.isLoggable(r7, r8)     // Catch:{ all -> 0x018b }
            if (r0 == 0) goto L_0x00e6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x018b }
            r1.<init>()     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "Trying backup SoSource for "
            r1.append(r0)     // Catch:{ all -> 0x018b }
            r1.append(r13)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x018b }
            android.util.Log.d(r7, r0)     // Catch:{ all -> 0x018b }
        L_0x00e6:
            X.10I[] r15 = A05     // Catch:{ all -> 0x018b }
            int r0 = r15.length     // Catch:{ all -> 0x018b }
            r22 = r0
            r3 = 0
            goto L_0x00f2
        L_0x00ed:
            int r2 = r2 + 1
            if (r4 != 0) goto L_0x012c
            goto L_0x00b7
        L_0x00f2:
            r0 = r22
            if (r3 >= r0) goto L_0x012c
            r2 = r15[r3]     // Catch:{ all -> 0x018b }
            monitor-enter(r2)     // Catch:{ all -> 0x018b }
            java.util.Map r1 = r2.A04     // Catch:{ all -> 0x0129 }
            monitor-enter(r1)     // Catch:{ all -> 0x0129 }
            java.lang.Object r0 = r1.get(r13)     // Catch:{ all -> 0x0126 }
            if (r0 != 0) goto L_0x010a
            java.lang.Object r0 = new java.lang.Object     // Catch:{ all -> 0x0126 }
            r0.<init>()     // Catch:{ all -> 0x0126 }
            r1.put(r13, r0)     // Catch:{ all -> 0x0126 }
        L_0x010a:
            monitor-exit(r1)     // Catch:{ all -> 0x0126 }
            monitor-enter(r0)     // Catch:{ all -> 0x0129 }
            r2.A00 = r13     // Catch:{ all -> 0x0123 }
            r1 = 2
            r2.A03(r1)     // Catch:{ all -> 0x0123 }
            monitor-exit(r0)     // Catch:{ all -> 0x0123 }
            monitor-exit(r2)     // Catch:{ all -> 0x018b }
            r0 = r21
            int r1 = r2.A02(r14, r13, r0)     // Catch:{ all -> 0x018b }
            r0 = 1
            if (r1 != r0) goto L_0x011e
            goto L_0x0121
        L_0x011e:
            int r3 = r3 + 1
            goto L_0x00f2
        L_0x0121:
            r4 = 1
            goto L_0x012c
        L_0x0123:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0123 }
            goto L_0x0128
        L_0x0126:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0126 }
        L_0x0128:
            throw r3     // Catch:{ all -> 0x0129 }
        L_0x0129:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x018b }
            throw r0     // Catch:{ all -> 0x018b }
        L_0x012c:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()     // Catch:{ all -> 0x0188 }
            r0.unlock()     // Catch:{ all -> 0x0188 }
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            if (r16 == 0) goto L_0x013b
            android.os.StrictMode.setThreadPolicy(r14)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
        L_0x013b:
            if (r4 == 0) goto L_0x013f
            if (r4 != r8) goto L_0x01a3
        L_0x013f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r2.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r2.append(r6)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r2.append(r13)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r0.lock()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
        L_0x0151:
            X.10F[] r0 = A0C     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            int r0 = r0.length     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            if (r5 >= r0) goto L_0x0171
            java.lang.String r0 = "\n\tSoSource "
            r2.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r2.append(r5)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.lang.String r0 = ": "
            r2.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            X.10F[] r0 = A0C     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r0 = r0[r5]     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.lang.String r0 = r0.toString()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r2.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            int r5 = r5 + 1
            goto L_0x0151
        L_0x0171:
            X.10H r0 = A03     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            if (r0 == 0) goto L_0x0253
            android.content.Context r1 = r0.A01     // Catch:{ NameNotFoundException -> 0x0181 }
            java.lang.String r0 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x0181 }
            android.content.Context r0 = r1.createPackageContext(r0, r11)     // Catch:{ NameNotFoundException -> 0x0181 }
            goto L_0x0237
        L_0x0181:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r0.<init>(r1)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            throw r0     // Catch:{ UnsatisfiedLinkError -> 0x026f }
        L_0x0188:
            r2 = move-exception
            r5 = r4
            goto L_0x0196
        L_0x018b:
            r1 = move-exception
            r5 = r4
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()     // Catch:{ all -> 0x0195 }
            r0.unlock()     // Catch:{ all -> 0x0195 }
            throw r1     // Catch:{ all -> 0x0195 }
        L_0x0195:
            r2 = move-exception
        L_0x0196:
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            if (r16 == 0) goto L_0x019e
            android.os.StrictMode.setThreadPolicy(r14)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
        L_0x019e:
            if (r5 == 0) goto L_0x01c8
            if (r5 != r8) goto L_0x01a3
            goto L_0x01c8
        L_0x01a3:
            boolean r0 = android.util.Log.isLoggable(r7, r8)     // Catch:{ all -> 0x05f9 }
            if (r0 == 0) goto L_0x01bd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05f9 }
            r1.<init>()     // Catch:{ all -> 0x05f9 }
            java.lang.String r0 = "Loaded: "
            r1.append(r0)     // Catch:{ all -> 0x05f9 }
            r1.append(r13)     // Catch:{ all -> 0x05f9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x05f9 }
            android.util.Log.d(r7, r0)     // Catch:{ all -> 0x05f9 }
        L_0x01bd:
            monitor-enter(r20)     // Catch:{ all -> 0x05f9 }
            r10.add(r13)     // Catch:{ all -> 0x01c4 }
            monitor-exit(r20)     // Catch:{ all -> 0x01c4 }
            goto L_0x0290
        L_0x01c4:
            r3 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x01c4 }
            goto L_0x05ea
        L_0x01c8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r3.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r3.append(r6)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r3.append(r13)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.lang.String r1 = r2.getMessage()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            if (r1 != 0) goto L_0x01dd
            java.lang.String r1 = r2.toString()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
        L_0x01dd:
            java.lang.String r0 = " caused by: "
            r3.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r3.append(r1)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r2.printStackTrace()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r0 = r17
            r3.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r3.append(r5)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.lang.String r0 = r3.toString()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            android.util.Log.e(r7, r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.lang.UnsatisfiedLinkError r1 = new java.lang.UnsatisfiedLinkError     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r1.<init>(r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r1.initCause(r2)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            goto L_0x026e
        L_0x0200:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x022e }
            r1.<init>()     // Catch:{ all -> 0x022e }
            java.lang.String r0 = "Could not load: "
            r1.append(r0)     // Catch:{ all -> 0x022e }
            r1.append(r13)     // Catch:{ all -> 0x022e }
            java.lang.String r0 = " because no SO source exists"
            r1.append(r0)     // Catch:{ all -> 0x022e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x022e }
            android.util.Log.e(r7, r0)     // Catch:{ all -> 0x022e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x022e }
            r0.<init>()     // Catch:{ all -> 0x022e }
            r0.append(r6)     // Catch:{ all -> 0x022e }
            r0.append(r13)     // Catch:{ all -> 0x022e }
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x022e }
            java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x022e }
            r0.<init>(r1)     // Catch:{ all -> 0x022e }
            throw r0     // Catch:{ all -> 0x022e }
        L_0x022e:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r0.unlock()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            goto L_0x026e
        L_0x0237:
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.lang.String r0 = r0.nativeLibraryDir     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.io.File r1 = new java.io.File     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r1.<init>(r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.lang.String r0 = "\n\tNative lib dir: "
            r2.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.lang.String r0 = r1.getAbsolutePath()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r2.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.lang.String r0 = "\n"
            r2.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
        L_0x0253:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r0.unlock()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r0 = r17
            r2.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r2.append(r4)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            android.util.Log.e(r7, r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            java.lang.UnsatisfiedLinkError r1 = new java.lang.UnsatisfiedLinkError     // Catch:{ UnsatisfiedLinkError -> 0x026f }
            r1.<init>(r0)     // Catch:{ UnsatisfiedLinkError -> 0x026f }
        L_0x026e:
            throw r1     // Catch:{ UnsatisfiedLinkError -> 0x026f }
        L_0x026f:
            r3 = move-exception
            java.lang.String r2 = r3.getMessage()     // Catch:{ all -> 0x05f9 }
            if (r2 == 0) goto L_0x05ea
            java.lang.String r1 = "unexpected e_machine:"
            boolean r0 = r2.contains(r1)     // Catch:{ all -> 0x05f9 }
            if (r0 == 0) goto L_0x05ea
            int r0 = r2.lastIndexOf(r1)     // Catch:{ all -> 0x05f9 }
            java.lang.String r1 = r2.substring(r0)     // Catch:{ all -> 0x05f9 }
            X.78l r0 = new X.78l     // Catch:{ all -> 0x05f9 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x05f9 }
            throw r0     // Catch:{ all -> 0x05f9 }
        L_0x028c:
            r3 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x028c }
            goto L_0x05ea
        L_0x0290:
            r0 = r24 & 16
            if (r0 != 0) goto L_0x05ee
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x05f9 }
            if (r0 != 0) goto L_0x02a3
            java.util.Set r0 = A0B     // Catch:{ all -> 0x05f9 }
            boolean r0 = r0.contains(r12)     // Catch:{ all -> 0x05f9 }
            if (r0 == 0) goto L_0x02a3
            r11 = 1
        L_0x02a3:
            if (r23 == 0) goto L_0x05ee
            if (r11 != 0) goto L_0x05ee
            java.lang.String r1 = "MergedSoMapping.invokeJniOnload["
            java.lang.String r0 = "]"
            com.facebook.soloader.Api18TraceUtils.A01(r1, r12, r0)     // Catch:{ all -> 0x05f9 }
            java.lang.String r2 = "SoLoader"
            boolean r0 = android.util.Log.isLoggable(r2, r8)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            r1.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            java.lang.String r0 = "About to merge: "
            r1.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            r1.append(r12)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            java.lang.String r0 = " / "
            r1.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            r1.append(r13)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            java.lang.String r0 = r1.toString()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            android.util.Log.d(r2, r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
        L_0x02d2:
            int r0 = r12.hashCode()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            switch(r0) {
                case -2132109298: goto L_0x05a3;
                case -2112908723: goto L_0x0596;
                case -2084134425: goto L_0x0589;
                case -1924924588: goto L_0x057c;
                case -1916805629: goto L_0x056f;
                case -1861793634: goto L_0x0562;
                case -1776425186: goto L_0x0555;
                case -1721640191: goto L_0x0548;
                case -1606294708: goto L_0x053b;
                case -1484045932: goto L_0x052e;
                case -1389936073: goto L_0x0520;
                case -1347925350: goto L_0x0512;
                case -1293854543: goto L_0x0504;
                case -1290530873: goto L_0x04f6;
                case -1148924054: goto L_0x04e8;
                case -1117731165: goto L_0x04da;
                case -1098209777: goto L_0x04cc;
                case -1059361352: goto L_0x04be;
                case -1053039321: goto L_0x04b0;
                case -902468257: goto L_0x04a2;
                case -747990041: goto L_0x0494;
                case -449618447: goto L_0x0486;
                case -439414708: goto L_0x0478;
                case -381653348: goto L_0x046a;
                case -378888163: goto L_0x045c;
                case -327000206: goto L_0x044e;
                case -253106228: goto L_0x0440;
                case -194623424: goto L_0x0432;
                case -120202075: goto L_0x0424;
                case -61423793: goto L_0x0416;
                case 101517: goto L_0x0408;
                case 64916380: goto L_0x03fa;
                case 92309290: goto L_0x03ec;
                case 322449263: goto L_0x03de;
                case 395167905: goto L_0x03d0;
                case 451661819: goto L_0x03c2;
                case 469371245: goto L_0x03b4;
                case 627805909: goto L_0x03a6;
                case 656562322: goto L_0x0398;
                case 681123117: goto L_0x038a;
                case 777959537: goto L_0x037c;
                case 1078126824: goto L_0x036e;
                case 1250385981: goto L_0x0360;
                case 1270408060: goto L_0x0352;
                case 1540136281: goto L_0x0344;
                case 1584936478: goto L_0x0336;
                case 1737184630: goto L_0x0328;
                case 1780520651: goto L_0x031a;
                case 1825980878: goto L_0x030c;
                case 1995804693: goto L_0x02fe;
                case 2045224032: goto L_0x02f0;
                default: goto L_0x02d9;
            }     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
        L_0x02d9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            r1.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            java.lang.String r0 = "Unknown library: "
            r1.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            r1.append(r12)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            java.lang.String r0 = r1.toString()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            r1.<init>(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
        L_0x02ef:
            throw r1     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
        L_0x02f0:
            java.lang.String r0 = "ard-android-async-asset-fetcher-listener"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libard_android_async_asset_fetcher_listener_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x02fe:
            java.lang.String r0 = "tar-brotli-archive-native"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libtar_brotli_archive_native_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x030c:
            java.lang.String r0 = "musiceffect-native"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libmusiceffect_native_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x031a:
            java.lang.String r0 = "filters-native-android"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfilters_native_android_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x0328:
            java.lang.String r0 = "batch-box-cox-ops-xplat"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libbatch_box_cox_ops_xplat_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x0336:
            java.lang.String r0 = "jniuserflow"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libjniuserflow_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x0344:
            java.lang.String r0 = "xanalyticsadapter-jni"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxanalyticsadapter_jni_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x0352:
            java.lang.String r0 = "xplat_arfx_services_impl_avatars_avatarsAndroid"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxplat_arfx_services_impl_avatars_avatarsAndroid_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x0360:
            java.lang.String r0 = "gltfholdernew"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libgltfholdernew_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x036e:
            java.lang.String r0 = "xplat_ecos_ecosAndroid"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxplat_ecos_ecosAndroid_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x037c:
            java.lang.String r0 = "unet-106-ops-xplat"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libunet_106_ops_xplat_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x038a:
            java.lang.String r0 = "single-model-cache-native-android"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libsingle_model_cache_native_android_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x0398:
            java.lang.String r0 = "double-conversion"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libdouble_conversion_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x03a6:
            java.lang.String r0 = "avatarsdataprovider"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libavatarsdataprovider_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x03b4:
            java.lang.String r0 = "xplat_arfx_services_interfaces_interfacesAndroid"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxplat_arfx_services_interfaces_interfacesAndroid_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x03c2:
            java.lang.String r0 = "jniexecutors"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libjniexecutors_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x03d0:
            java.lang.String r0 = "ard-android-async-asset-fetcher"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libard_android_async_asset_fetcher_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x03de:
            java.lang.String r0 = "camera-xplat-spars-jni"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libcamera_xplat_spars_jni_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x03ec:
            java.lang.String r0 = "ard-android-network-consent-manager-impl"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libard_android_network_consent_manager_impl_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x03fa:
            java.lang.String r0 = "maskrcnn-ops-xplat"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libmaskrcnn_ops_xplat_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x0408:
            java.lang.String r0 = "fmt"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfmt_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x0416:
            java.lang.String r0 = "asyncexecutor"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libasyncexecutor_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x0424:
            java.lang.String r0 = "xplat_hermes_lib_Platform_Unicode_UnicodeAndroid"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxplat_hermes_lib_Platform_Unicode_UnicodeAndroid_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x0432:
            java.lang.String r0 = "arengineservicesutils"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarengineservicesutils_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x0440:
            java.lang.String r0 = "profiloextapi"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libprofiloextapi_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x044e:
            java.lang.String r0 = "graphicsengine-whatsapp-native"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libgraphicsengine_whatsapp_native_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x045c:
            java.lang.String r0 = "target-recognition-android"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libtarget_recognition_android_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x046a:
            java.lang.String r0 = "fbacore-jni"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfbacore_jni_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x0478:
            java.lang.String r0 = "audiograph-native"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libaudiograph_native_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x0486:
            java.lang.String r0 = "gputimer-jni"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libgputimer_jni_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x0494:
            java.lang.String r0 = "arclass"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarclass_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x04a2:
            java.lang.String r0 = "sigmux"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libsigmux_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x04b0:
            java.lang.String r0 = "arpersistenceservice"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarpersistenceservice_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x04be:
            java.lang.String r0 = "featureconfig"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfeatureconfig_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x04cc:
            java.lang.String r0 = "yogacore"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libyogacore_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x04da:
            java.lang.String r0 = "arfx-engine-plugin-touch_gestures"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarfx_engine_plugin_touch_gestures_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x04e8:
            java.lang.String r0 = "hybridlogsinkjni"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libhybridlogsinkjni_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x04f6:
            java.lang.String r0 = "opus_mlow"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libopus_mlow_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x0504:
            java.lang.String r0 = "native_bridge"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libnative_bridge_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x0512:
            java.lang.String r0 = "flatbuffers"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libflatbuffers_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x0520:
            java.lang.String r0 = "ardcache-stash"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libardcache_stash_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x052e:
            java.lang.String r0 = "ard-android-network-consent-manager-interf"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libard_android_network_consent_manager_interf_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x053b:
            java.lang.String r0 = "dynamic_pytorch_impl"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libdynamic_pytorch_impl_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x0548:
            java.lang.String r0 = "arfx-engine-plugin-avatars"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarfx_engine_plugin_avatars_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x0555:
            java.lang.String r0 = "jniperflogger"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libjniperflogger_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x0562:
            java.lang.String r0 = "versioned-model-cache-native-android"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libversioned_model_cache_native_android_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x056f:
            java.lang.String r0 = "roi-align-ops-xplat"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libroi_align_ops_xplat_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x057c:
            java.lang.String r0 = "fbsystrace"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfbsystrace_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x0589:
            java.lang.String r0 = "ardcache-jni"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libardcache_jni_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x0596:
            java.lang.String r0 = "stash-jni"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libstash_jni_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05af
        L_0x05a3:
            java.lang.String r0 = "spark-qpluserflow-native"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            if (r0 == 0) goto L_0x02d9
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libspark_qpluserflow_native_so()     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
        L_0x05af:
            if (r0 != 0) goto L_0x05b2
            goto L_0x05bb
        L_0x05b2:
            java.lang.String r0 = "Failed to invoke native library JNI_OnLoad"
            java.lang.UnsatisfiedLinkError r1 = new java.lang.UnsatisfiedLinkError     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            r1.<init>(r0)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x02ef
        L_0x05bb:
            java.util.Set r0 = A0B     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            r0.add(r12)     // Catch:{ UnsatisfiedLinkError -> 0x05c1 }
            goto L_0x05eb
        L_0x05c1:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05e6 }
            r1.<init>()     // Catch:{ all -> 0x05e6 }
            java.lang.String r0 = "Failed to call JNI_OnLoad from '"
            r1.append(r0)     // Catch:{ all -> 0x05e6 }
            r1.append(r12)     // Catch:{ all -> 0x05e6 }
            java.lang.String r0 = "', which has been merged into '"
            r1.append(r0)     // Catch:{ all -> 0x05e6 }
            r1.append(r13)     // Catch:{ all -> 0x05e6 }
            java.lang.String r0 = "'.  See comment for details."
            r1.append(r0)     // Catch:{ all -> 0x05e6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x05e6 }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x05e6 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x05e6 }
            throw r0     // Catch:{ all -> 0x05e6 }
        L_0x05e6:
            r3 = move-exception
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ all -> 0x05f9 }
        L_0x05ea:
            throw r3     // Catch:{ all -> 0x05f9 }
        L_0x05eb:
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ all -> 0x05f9 }
        L_0x05ee:
            monitor-exit(r9)     // Catch:{ all -> 0x05f9 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()
            r0.unlock()
            r0 = r19 ^ 1
            return r0
        L_0x05f9:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x05f9 }
            throw r0     // Catch:{ all -> 0x05fc }
        L_0x05fc:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()
            r0.unlock()
            throw r1
        L_0x0605:
            r0 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x0605 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.A05(android.os.StrictMode$ThreadPolicy, java.lang.String, java.lang.String, java.lang.String, int):boolean");
    }

    public static boolean A06(String str) {
        if (A00) {
            return A07(str, 0);
        }
        return AnonymousClass10O.A00(str);
    }

    public static boolean A07(String str, int i) {
        boolean z;
        Boolean valueOf;
        if (A0C == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = A08;
            reentrantReadWriteLock.readLock().lock();
            try {
                if (A0C == null) {
                    if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                        synchronized (SoLoader.class) {
                            try {
                                z = !A06.contains(str);
                                if (z) {
                                    System.loadLibrary(str);
                                }
                                valueOf = Boolean.valueOf(z);
                            } catch (Throwable th) {
                                while (true) {
                                    th = th;
                                    break;
                                }
                            }
                        }
                        reentrantReadWriteLock.readLock().unlock();
                        if (valueOf != null) {
                            return z;
                        }
                    } else if (!A03()) {
                        th = new IllegalStateException("SoLoader.init() not yet called");
                    }
                    throw th;
                }
            } finally {
                reentrantReadWriteLock.readLock().unlock();
            }
        }
        if (!A00) {
            return AnonymousClass10O.A00(str);
        }
        String A002 = AnonymousClass10S.A00(str);
        String str2 = str;
        if (A002 != null) {
            str2 = A002;
        }
        return A04((StrictMode.ThreadPolicy) null, System.mapLibraryName(str2), str, A002, i);
    }

    public static void init(Context context, int i) {
        A01(context, (C21890zz) null, A09, i);
    }
}
