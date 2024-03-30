package com.facebook.profilo.provider.stacktrace;

import com.facebook.profilo.logger.MultiBufferLogger;
import com.facebook.soloader.SoLoader;

public class CPUProfiler {
    public static volatile int sAvailableTracers;
    public static volatile boolean sInitialized;

    public static native boolean nativeInitialize(MultiBufferLogger multiBufferLogger, int i, boolean z, int i2, int i3, boolean z2);

    public static native void nativeLoggerLoop();

    public static native void nativeResetFrameworkNamesSet();

    public static native boolean nativeStartProfiling(int i, int i2, int i3, boolean z, boolean z2);

    public static native void nativeStopProfiling();

    static {
        SoLoader.A06("profilo_stacktrace");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        r0 = r1.equals(r0);
        r2 = androidx.core.view.inputmethod.EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        r0 = r1.equals(r0);
        r2 = androidx.core.view.inputmethod.EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        r0 = r1.equals(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        r0 = r1.equals(r0);
        r2 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0084, code lost:
        r0 = r1.equals(r0);
        r2 = 16384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        if (r0 != false) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean init(android.content.Context r5, com.facebook.profilo.logger.MultiBufferLogger r6, boolean r7, int r8, int r9, boolean r10) {
        /*
            java.lang.Class<com.facebook.profilo.provider.stacktrace.CPUProfiler> r3 = com.facebook.profilo.provider.stacktrace.CPUProfiler.class
            monitor-enter(r3)
            boolean r0 = sInitialized     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x0009
            goto L_0x00a9
        L_0x0009:
            r2 = 16
            boolean r0 = com.facebook.profilo.provider.stacktrace.ArtCompatibility.isCompatible(r5)     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x008c
            java.lang.String r1 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x00ac }
            int r0 = r1.hashCode()     // Catch:{ all -> 0x00ac }
            switch(r0) {
                case 57: goto L_0x001b;
                case 52407: goto L_0x001e;
                case 52408: goto L_0x0021;
                case 53368: goto L_0x0024;
                case 54329: goto L_0x0027;
                case 54330: goto L_0x0030;
                case 56251: goto L_0x0033;
                case 50364602: goto L_0x0036;
                case 50364603: goto L_0x0039;
                case 50365562: goto L_0x0042;
                case 50365563: goto L_0x0045;
                case 51288123: goto L_0x004e;
                case 52212604: goto L_0x0055;
                case 52212605: goto L_0x005e;
                case 52212606: goto L_0x0067;
                case 53135164: goto L_0x0070;
                case 53136125: goto L_0x0079;
                case 54058685: goto L_0x0082;
                default: goto L_0x001a;
            }     // Catch:{ all -> 0x00ac }
        L_0x001a:
            goto L_0x008c
        L_0x001b:
            java.lang.String r0 = "9"
            goto L_0x0084
        L_0x001e:
            java.lang.String r0 = "5.0"
            goto L_0x003b
        L_0x0021:
            java.lang.String r0 = "5.1"
            goto L_0x0047
        L_0x0024:
            java.lang.String r0 = "6.0"
            goto L_0x0050
        L_0x0027:
            java.lang.String r0 = "7.0"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00ac }
            r2 = 32
            goto L_0x008a
        L_0x0030:
            java.lang.String r0 = "7.1"
            goto L_0x0057
        L_0x0033:
            java.lang.String r0 = "9.0"
            goto L_0x0084
        L_0x0036:
            java.lang.String r0 = "5.0.1"
            goto L_0x003b
        L_0x0039:
            java.lang.String r0 = "5.0.2"
        L_0x003b:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00ac }
            r2 = 1024(0x400, float:1.435E-42)
            goto L_0x008a
        L_0x0042:
            java.lang.String r0 = "5.1.0"
            goto L_0x0047
        L_0x0045:
            java.lang.String r0 = "5.1.1"
        L_0x0047:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00ac }
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x008a
        L_0x004e:
            java.lang.String r0 = "6.0.1"
        L_0x0050:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00ac }
            goto L_0x008a
        L_0x0055:
            java.lang.String r0 = "7.1.0"
        L_0x0057:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00ac }
            r2 = 64
            goto L_0x008a
        L_0x005e:
            java.lang.String r0 = "7.1.1"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00ac }
            r2 = 128(0x80, float:1.794E-43)
            goto L_0x008a
        L_0x0067:
            java.lang.String r0 = "7.1.2"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00ac }
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x008a
        L_0x0070:
            java.lang.String r0 = "8.0.0"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00ac }
            r2 = 4096(0x1000, float:5.74E-42)
            goto L_0x008a
        L_0x0079:
            java.lang.String r0 = "8.1.0"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00ac }
            r2 = 8192(0x2000, float:1.14794E-41)
            goto L_0x008a
        L_0x0082:
            java.lang.String r0 = "9.0.0"
        L_0x0084:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00ac }
            r2 = 16384(0x4000, float:2.2959E-41)
        L_0x008a:
            if (r0 != 0) goto L_0x008d
        L_0x008c:
            r2 = 0
        L_0x008d:
            r2 = r2 | 512(0x200, float:7.175E-43)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00ac }
            r0 = 26
            if (r1 < r0) goto L_0x0097
            r2 = r2 | 4
        L_0x0097:
            sAvailableTracers = r2     // Catch:{ all -> 0x00ac }
            int r5 = sAvailableTracers     // Catch:{ all -> 0x00ac }
            r4 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            boolean r0 = nativeInitialize(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00ac }
            sInitialized = r0     // Catch:{ all -> 0x00ac }
            boolean r0 = sInitialized     // Catch:{ all -> 0x00ac }
            goto L_0x00aa
        L_0x00a9:
            r0 = 1
        L_0x00aa:
            monitor-exit(r3)
            return r0
        L_0x00ac:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.CPUProfiler.init(android.content.Context, com.facebook.profilo.logger.MultiBufferLogger, boolean, int, int, boolean):boolean");
    }
}
