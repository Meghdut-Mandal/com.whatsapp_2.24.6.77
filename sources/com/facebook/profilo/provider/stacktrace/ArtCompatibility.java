package com.facebook.profilo.provider.stacktrace;

import com.facebook.soloader.SoLoader;
import java.util.concurrent.atomic.AtomicReference;

public class ArtCompatibility {
    public static final AtomicReference sIsCompatible = new AtomicReference((Object) null);

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e0, code lost:
        if (r2.equals("7.1") != false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e2, code lost:
        r4 = nativeCheck(64);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ef, code lost:
        if (r2.equals("7.0") != false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f1, code lost:
        r4 = nativeCheck(32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fe, code lost:
        if (r2.equals("6.0") != false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0100, code lost:
        r4 = nativeCheck(16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x010b, code lost:
        if (r2.equals("5.1") != false) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010d, code lost:
        r4 = nativeCheck(androidx.core.view.inputmethod.EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011a, code lost:
        if (r2.equals("5.0") != false) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x011c, code lost:
        r4 = nativeCheck(androidx.core.view.inputmethod.EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0129, code lost:
        if (r2.equals("9") != false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x012b, code lost:
        r4 = nativeCheck(16384);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0131, code lost:
        r2 = new java.io.FileOutputStream(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0139, code lost:
        r0 = 48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x013b, code lost:
        if (r4 == false) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x013d, code lost:
        r0 = 49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r2.write(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x015e, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0167, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isCompatible(android.content.Context r6) {
        /*
            r5 = 0
            java.util.concurrent.atomic.AtomicReference r3 = sIsCompatible
            java.lang.Object r0 = r3.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0010
            boolean r4 = r0.booleanValue()
        L_0x000f:
            return r4
        L_0x0010:
            java.io.File r4 = r6.getFilesDir()     // Catch:{ IOException -> 0x0168 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0168 }
            java.lang.String r0 = "ProfiloArtUnwindcCompat_"
            r1.append(r0)     // Catch:{ IOException -> 0x0168 }
            java.lang.String r2 = android.os.Build.VERSION.RELEASE     // Catch:{ IOException -> 0x0168 }
            java.io.File r1 = X.C90464aC.A0K(r4, r2, r1)     // Catch:{ IOException -> 0x0168 }
            boolean r0 = r1.exists()     // Catch:{ IOException -> 0x0168 }
            if (r0 == 0) goto L_0x003d
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0168 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0168 }
            int r1 = r2.read()     // Catch:{ all -> 0x0159 }
            r0 = 49
            boolean r4 = X.AnonymousClass000.A1S(r1, r0)
            r2.close()     // Catch:{ IOException -> 0x0168 }
            goto L_0x0145
        L_0x003d:
            int r0 = r2.hashCode()     // Catch:{ IOException -> 0x0168 }
            r4 = 16
            switch(r0) {
                case 57: goto L_0x0123;
                case 52407: goto L_0x0114;
                case 52408: goto L_0x0105;
                case 53368: goto L_0x00f8;
                case 54329: goto L_0x00e9;
                case 54330: goto L_0x00da;
                case 56251: goto L_0x00d1;
                case 50364602: goto L_0x00c8;
                case 50364603: goto L_0x00bf;
                case 50365562: goto L_0x00b6;
                case 50365563: goto L_0x00ad;
                case 51288123: goto L_0x00a4;
                case 52211643: goto L_0x009b;
                case 52212604: goto L_0x0092;
                case 52212605: goto L_0x0082;
                case 52212606: goto L_0x0072;
                case 53135164: goto L_0x0062;
                case 53136125: goto L_0x0052;
                case 54058685: goto L_0x0048;
                default: goto L_0x0046;
            }     // Catch:{ IOException -> 0x0168 }
        L_0x0046:
            goto L_0x0137
        L_0x0048:
            java.lang.String r0 = "9.0.0"
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x0168 }
            if (r0 == 0) goto L_0x0137
            goto L_0x012b
        L_0x0052:
            java.lang.String r0 = "8.1.0"
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x0168 }
            if (r0 == 0) goto L_0x0137
            r0 = 8192(0x2000, float:1.14794E-41)
            boolean r4 = nativeCheck(r0)     // Catch:{ IOException -> 0x0168 }
            goto L_0x0131
        L_0x0062:
            java.lang.String r0 = "8.0.0"
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x0168 }
            if (r0 == 0) goto L_0x0137
            r0 = 4096(0x1000, float:5.74E-42)
            boolean r4 = nativeCheck(r0)     // Catch:{ IOException -> 0x0168 }
            goto L_0x0131
        L_0x0072:
            java.lang.String r0 = "7.1.2"
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x0168 }
            if (r0 == 0) goto L_0x0137
            r0 = 256(0x100, float:3.59E-43)
            boolean r4 = nativeCheck(r0)     // Catch:{ IOException -> 0x0168 }
            goto L_0x0131
        L_0x0082:
            java.lang.String r0 = "7.1.1"
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x0168 }
            if (r0 == 0) goto L_0x0137
            r0 = 128(0x80, float:1.794E-43)
            boolean r4 = nativeCheck(r0)     // Catch:{ IOException -> 0x0168 }
            goto L_0x0131
        L_0x0092:
            java.lang.String r0 = "7.1.0"
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x0168 }
            if (r0 == 0) goto L_0x0137
            goto L_0x00e2
        L_0x009b:
            java.lang.String r0 = "7.0.0"
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x0168 }
            if (r0 == 0) goto L_0x0137
            goto L_0x00f1
        L_0x00a4:
            java.lang.String r0 = "6.0.1"
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x0168 }
            if (r0 == 0) goto L_0x0137
            goto L_0x0100
        L_0x00ad:
            java.lang.String r0 = "5.1.1"
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x0168 }
            if (r0 == 0) goto L_0x0137
            goto L_0x010d
        L_0x00b6:
            java.lang.String r0 = "5.1.0"
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x0168 }
            if (r0 == 0) goto L_0x0137
            goto L_0x010d
        L_0x00bf:
            java.lang.String r0 = "5.0.2"
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x0168 }
            if (r0 == 0) goto L_0x0137
            goto L_0x011c
        L_0x00c8:
            java.lang.String r0 = "5.0.1"
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x0168 }
            if (r0 == 0) goto L_0x0137
            goto L_0x011c
        L_0x00d1:
            java.lang.String r0 = "9.0"
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x0168 }
            if (r0 == 0) goto L_0x0137
            goto L_0x012b
        L_0x00da:
            java.lang.String r0 = "7.1"
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x0168 }
            if (r0 == 0) goto L_0x0137
        L_0x00e2:
            r0 = 64
            boolean r4 = nativeCheck(r0)     // Catch:{ IOException -> 0x0168 }
            goto L_0x0131
        L_0x00e9:
            java.lang.String r0 = "7.0"
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x0168 }
            if (r0 == 0) goto L_0x0137
        L_0x00f1:
            r0 = 32
            boolean r4 = nativeCheck(r0)     // Catch:{ IOException -> 0x0168 }
            goto L_0x0131
        L_0x00f8:
            java.lang.String r0 = "6.0"
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x0168 }
            if (r0 == 0) goto L_0x0137
        L_0x0100:
            boolean r4 = nativeCheck(r4)     // Catch:{ IOException -> 0x0168 }
            goto L_0x0131
        L_0x0105:
            java.lang.String r0 = "5.1"
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x0168 }
            if (r0 == 0) goto L_0x0137
        L_0x010d:
            r0 = 2048(0x800, float:2.87E-42)
            boolean r4 = nativeCheck(r0)     // Catch:{ IOException -> 0x0168 }
            goto L_0x0131
        L_0x0114:
            java.lang.String r0 = "5.0"
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x0168 }
            if (r0 == 0) goto L_0x0137
        L_0x011c:
            r0 = 1024(0x400, float:1.435E-42)
            boolean r4 = nativeCheck(r0)     // Catch:{ IOException -> 0x0168 }
            goto L_0x0131
        L_0x0123:
            java.lang.String r0 = "9"
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x0168 }
            if (r0 == 0) goto L_0x0137
        L_0x012b:
            r0 = 16384(0x4000, float:2.2959E-41)
            boolean r4 = nativeCheck(r0)     // Catch:{ IOException -> 0x0168 }
        L_0x0131:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0168 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0168 }
            goto L_0x0139
        L_0x0137:
            r4 = 0
            goto L_0x0131
        L_0x0139:
            r0 = 48
            if (r4 == 0) goto L_0x013f
            r0 = 49
        L_0x013f:
            r2.write(r0)     // Catch:{ all -> 0x015e }
            r2.close()     // Catch:{ IOException -> 0x0168 }
        L_0x0145:
            r1 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ IOException -> 0x0168 }
            boolean r0 = r3.compareAndSet(r1, r0)     // Catch:{ IOException -> 0x0168 }
            if (r0 != 0) goto L_0x000f
            java.lang.Object r0 = r3.get()     // Catch:{ IOException -> 0x0168 }
            boolean r4 = X.AnonymousClass000.A1X(r0)     // Catch:{ IOException -> 0x0168 }
            return r4
        L_0x0159:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0163 }
            goto L_0x0167
        L_0x015e:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0163 }
            goto L_0x0167
        L_0x0163:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0168 }
        L_0x0167:
            throw r1     // Catch:{ IOException -> 0x0168 }
        L_0x0168:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.ArtCompatibility.isCompatible(android.content.Context):boolean");
    }

    public static native boolean nativeCheck(int i);

    static {
        SoLoader.A06("profilo_stacktrace");
    }
}
