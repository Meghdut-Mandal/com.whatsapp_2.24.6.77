package X;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.10G  reason: invalid class name */
public class AnonymousClass10G extends AnonymousClass10F {
    public final File A00;
    public final int A01;
    public final List A02;

    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        com.facebook.soloader.Api18TraceUtils.A00();
        r1 = new java.lang.StringBuilder();
        r1.append("Loading ");
        r1.append(r2);
        r1.append("'s dependencies: ");
        r1.append(java.util.Arrays.toString(r10));
        android.util.Log.d("SoLoader", r1.toString());
        r9 = r10.length;
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e6, code lost:
        if (r8 >= r9) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e8, code lost:
        r7 = r10[r8];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f0, code lost:
        if (r7.startsWith("/") != false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f2, code lost:
        r2 = r7.substring(3, r7.indexOf(46));
        r1 = X.AnonymousClass10S.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0101, code lost:
        if (r1 != null) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0103, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0105, code lost:
        r7 = java.lang.System.mapLibraryName(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0109, code lost:
        com.facebook.soloader.SoLoader.A04(r14, r7, r2, r1, r17 | 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010e, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012d A[SYNTHETIC, Splitter:B:50:0x012d] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0137 A[Catch:{ UnsatisfiedLinkError -> 0x0146, all -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A04(android.os.StrictMode.ThreadPolicy r14, java.io.File r15, java.lang.String r16, int r17) {
        /*
            r13 = this;
            X.0zz r0 = com.facebook.soloader.SoLoader.A04
            if (r0 == 0) goto L_0x017e
            java.util.List r0 = r13.A02
            r2 = r16
            boolean r0 = r0.contains(r2)
            r7 = 0
            java.lang.String r4 = "SoLoader"
            if (r0 == 0) goto L_0x002d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r0 = " is on the denyList, skip loading from "
            r1.append(r0)
            java.lang.String r0 = r15.getCanonicalPath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r4, r0)
            return r7
        L_0x002d:
            java.io.File r0 = r13.A00
            java.io.File r6 = new java.io.File
            r6.<init>(r0, r2)
            boolean r0 = r6.exists()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r0 == 0) goto L_0x0167
            r1.append(r2)
            java.lang.String r0 = " found on "
            r1.append(r0)
            java.lang.String r0 = r15.getCanonicalPath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r4, r0)
            r5 = r17
            r0 = r17 & 1
            if (r0 == 0) goto L_0x0077
            int r0 = r13.A01
            r3 = 2
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0077
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r0 = " loaded implicitly"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r4, r0)
            return r3
        L_0x0077:
            r3 = 0
            int r0 = r13.A01
            r12 = 1
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0080
            r7 = 1
        L_0x0080:
            java.lang.String r0 = r6.getName()
            boolean r11 = r0.equals(r2)
            if (r7 != 0) goto L_0x008c
            if (r11 != 0) goto L_0x0117
        L_0x008c:
            X.10U r9 = new X.10U     // Catch:{ all -> 0x0160 }
            r9.<init>(r6)     // Catch:{ all -> 0x0160 }
            r3 = r9
            if (r7 == 0) goto L_0x0117
            java.lang.String r1 = "SoLoader.getElfDependencies["
            java.lang.String r0 = "]"
            com.facebook.soloader.Api18TraceUtils.A01(r1, r2, r0)     // Catch:{ all -> 0x0160 }
            r8 = 0
        L_0x009c:
            java.lang.String[] r10 = X.AnonymousClass10V.A02(r9)     // Catch:{ ClosedByInterruptException -> 0x00a1 }
            goto L_0x00c1
        L_0x00a1:
            r7 = move-exception
            int r8 = r8 + 1
            r0 = 4
            if (r8 > r0) goto L_0x0111
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0112 }
            java.lang.String r1 = "MinElf"
            java.lang.String r0 = "retrying extract_DT_NEEDED due to ClosedByInterruptException"
            android.util.Log.e(r1, r0, r7)     // Catch:{ all -> 0x0112 }
            java.io.File r1 = r9.A00     // Catch:{ all -> 0x0112 }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x0112 }
            r0.<init>(r1)     // Catch:{ all -> 0x0112 }
            r9.A01 = r0     // Catch:{ all -> 0x0112 }
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{ all -> 0x0112 }
            r9.A02 = r0     // Catch:{ all -> 0x0112 }
            goto L_0x009c
        L_0x00c1:
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ all -> 0x0160 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0160 }
            r1.<init>()     // Catch:{ all -> 0x0160 }
            java.lang.String r0 = "Loading "
            r1.append(r0)     // Catch:{ all -> 0x0160 }
            r1.append(r2)     // Catch:{ all -> 0x0160 }
            java.lang.String r0 = "'s dependencies: "
            r1.append(r0)     // Catch:{ all -> 0x0160 }
            java.lang.String r0 = java.util.Arrays.toString(r10)     // Catch:{ all -> 0x0160 }
            r1.append(r0)     // Catch:{ all -> 0x0160 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0160 }
            android.util.Log.d(r4, r0)     // Catch:{ all -> 0x0160 }
            int r9 = r10.length     // Catch:{ all -> 0x0160 }
            r8 = 0
        L_0x00e6:
            if (r8 >= r9) goto L_0x012b
            r7 = r10[r8]     // Catch:{ all -> 0x0160 }
            java.lang.String r0 = "/"
            boolean r0 = r7.startsWith(r0)     // Catch:{ all -> 0x0160 }
            if (r0 != 0) goto L_0x010e
            r0 = 46
            int r1 = r7.indexOf(r0)     // Catch:{ all -> 0x0160 }
            r0 = 3
            java.lang.String r2 = r7.substring(r0, r1)     // Catch:{ all -> 0x0160 }
            java.lang.String r1 = X.AnonymousClass10S.A00(r2)     // Catch:{ all -> 0x0160 }
            if (r1 != 0) goto L_0x0105
            r2 = 0
            goto L_0x0109
        L_0x0105:
            java.lang.String r7 = java.lang.System.mapLibraryName(r1)     // Catch:{ all -> 0x0160 }
        L_0x0109:
            r0 = r17 | 1
            com.facebook.soloader.SoLoader.A04(r14, r7, r2, r1, r0)     // Catch:{ all -> 0x0160 }
        L_0x010e:
            int r8 = r8 + 1
            goto L_0x00e6
        L_0x0111:
            throw r7     // Catch:{ all -> 0x0112 }
        L_0x0112:
            r0 = move-exception
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ all -> 0x0160 }
            throw r0     // Catch:{ all -> 0x0160 }
        L_0x0117:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0160 }
            r1.<init>()     // Catch:{ all -> 0x0160 }
            java.lang.String r0 = "Not resolving dependencies for "
            r1.append(r0)     // Catch:{ all -> 0x0160 }
            r1.append(r2)     // Catch:{ all -> 0x0160 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0160 }
            android.util.Log.d(r4, r0)     // Catch:{ all -> 0x0160 }
        L_0x012b:
            if (r11 == 0) goto L_0x0137
            X.0zz r1 = com.facebook.soloader.SoLoader.A04     // Catch:{ UnsatisfiedLinkError -> 0x0146 }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ UnsatisfiedLinkError -> 0x0146 }
            r1.BOF(r0, r5)     // Catch:{ UnsatisfiedLinkError -> 0x0146 }
            goto L_0x0140
        L_0x0137:
            X.0zz r1 = com.facebook.soloader.SoLoader.A04     // Catch:{ UnsatisfiedLinkError -> 0x0146 }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ UnsatisfiedLinkError -> 0x0146 }
            r1.BOJ(r3, r0, r5)     // Catch:{ UnsatisfiedLinkError -> 0x0146 }
        L_0x0140:
            if (r3 == 0) goto L_0x0145
            r3.close()
        L_0x0145:
            return r12
        L_0x0146:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x0160 }
            java.lang.String r0 = "bad ELF magic"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0160 }
            if (r0 == 0) goto L_0x015f
            java.lang.String r0 = "Corrupted lib file detected"
            android.util.Log.d(r4, r0)     // Catch:{ all -> 0x0160 }
            r0 = 3
            if (r3 == 0) goto L_0x015e
            r3.close()
        L_0x015e:
            return r0
        L_0x015f:
            throw r2     // Catch:{ all -> 0x0160 }
        L_0x0160:
            r1 = move-exception
            if (r3 == 0) goto L_0x0166
            r3.close()
        L_0x0166:
            throw r1
        L_0x0167:
            r1.append(r2)
            java.lang.String r0 = " not found on "
            r1.append(r0)
            java.lang.String r0 = r15.getCanonicalPath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r4, r0)
            return r7
        L_0x017e:
            java.lang.String r0 = "SoLoader.init() not yet called"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass10G.A04(android.os.StrictMode$ThreadPolicy, java.io.File, java.lang.String, int):int");
    }

    public String toString() {
        String str;
        try {
            str = String.valueOf(this.A00.getCanonicalPath());
        } catch (IOException unused) {
            str = this.A00.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[root = ");
        sb.append(str);
        sb.append(" flags = ");
        sb.append(this.A01);
        sb.append(']');
        return sb.toString();
    }

    public AnonymousClass10G(File file, String[] strArr, int i) {
        this.A00 = file;
        this.A01 = i;
        this.A02 = Arrays.asList(strArr);
    }
}
