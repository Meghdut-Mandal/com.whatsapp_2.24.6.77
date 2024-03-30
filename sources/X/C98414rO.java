package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.soloader.SysUtil$Api14Utils;
import java.io.File;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.4rO  reason: invalid class name and case insensitive filesystem */
public class C98414rO extends AnonymousClass10F {
    public final File A00;
    public final Map A01 = AnonymousClass001.A0J();
    public final Set A02;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        r12 = new X.C140856mH(r2, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        com.facebook.soloader.Api18TraceUtils.A01("SoLoader.getElfDependencies[", r8, "]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r13 = X.AnonymousClass10V.A02(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        com.facebook.soloader.Api18TraceUtils.A00();
        r11 = r13.length;
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0070, code lost:
        if (r9 >= r11) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        r2 = r13[r9];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        if (r2.startsWith("/") != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        com.facebook.soloader.SoLoader.A05(r18, r2, (java.lang.String) null, (java.lang.String) null, r6 | 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        com.facebook.soloader.Api18TraceUtils.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00be, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c7, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(android.os.StrictMode.ThreadPolicy r18, java.lang.String r19, int r20) {
        /*
            r17 = this;
            r6 = r20
            X.0zz r0 = com.facebook.soloader.SoLoader.A04
            if (r0 == 0) goto L_0x00df
            r5 = r17
            java.util.Set r0 = r5.A02
            java.util.Iterator r16 = r0.iterator()
        L_0x000e:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00dd
            java.lang.String r4 = X.AnonymousClass001.A0C(r16)
            java.util.Map r0 = r5.A01
            java.util.Set r1 = X.C90524aI.A0r(r4, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r7 = " not found on "
            java.lang.String r3 = "SoLoader"
            r8 = r19
            if (r0 != 0) goto L_0x00b0
            if (r1 == 0) goto L_0x00b0
            boolean r0 = r1.contains(r8)
            if (r0 == 0) goto L_0x00b0
            java.lang.String r14 = "/"
            java.io.File r0 = r5.A00
            java.util.zip.ZipFile r10 = new java.util.zip.ZipFile
            r10.<init>(r0)
            java.util.Enumeration r9 = r10.entries()     // Catch:{ all -> 0x00d3 }
        L_0x003f:
            boolean r0 = r9.hasMoreElements()     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x0088
            java.lang.Object r2 = r9.nextElement()     // Catch:{ all -> 0x00d3 }
            java.util.zip.ZipEntry r2 = (java.util.zip.ZipEntry) r2     // Catch:{ all -> 0x00d3 }
            if (r2 == 0) goto L_0x003f
            java.lang.String r1 = r2.getName()     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = X.C36321k7.A0D(r14, r8)     // Catch:{ all -> 0x00d3 }
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x003f
            X.6mH r12 = new X.6mH     // Catch:{ all -> 0x00d3 }
            r12.<init>(r2, r10)     // Catch:{ all -> 0x00d3 }
            java.lang.String r1 = "SoLoader.getElfDependencies["
            java.lang.String r0 = "]"
            com.facebook.soloader.Api18TraceUtils.A01(r1, r8, r0)     // Catch:{ all -> 0x00be }
            java.lang.String[] r13 = X.AnonymousClass10V.A02(r12)     // Catch:{ all -> 0x00b9 }
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ all -> 0x00be }
            int r11 = r13.length     // Catch:{ all -> 0x00be }
            r9 = 0
        L_0x0070:
            if (r9 >= r11) goto L_0x0085
            r2 = r13[r9]     // Catch:{ all -> 0x00be }
            boolean r0 = r2.startsWith(r14)     // Catch:{ all -> 0x00be }
            if (r0 != 0) goto L_0x0082
            r1 = r6 | 1
            r0 = 0
            r15 = r18
            com.facebook.soloader.SoLoader.A05(r15, r2, r0, r0, r1)     // Catch:{ all -> 0x00be }
        L_0x0082:
            int r9 = r9 + 1
            goto L_0x0070
        L_0x0085:
            r12.close()     // Catch:{ all -> 0x00d3 }
        L_0x0088:
            r10.close()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r4)     // Catch:{ UnsatisfiedLinkError -> 0x009d }
            java.lang.String r0 = java.io.File.separator     // Catch:{ UnsatisfiedLinkError -> 0x009d }
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r8, r1)     // Catch:{ UnsatisfiedLinkError -> 0x009d }
            r6 = r6 | 4
            X.0zz r0 = com.facebook.soloader.SoLoader.A04     // Catch:{ UnsatisfiedLinkError -> 0x009d }
            r0.BOF(r1, r6)     // Catch:{ UnsatisfiedLinkError -> 0x009d }
            goto L_0x00c8
        L_0x009d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            X.AnonymousClass000.A1D(r8, r7, r4, r1)
            java.lang.String r0 = " flag: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r6)
            android.util.Log.w(r3, r0, r2)
            goto L_0x000e
        L_0x00b0:
            java.lang.String r0 = X.C90464aC.A0e(r8, r7, r4)
            android.util.Log.v(r3, r0)
            goto L_0x000e
        L_0x00b9:
            r0 = move-exception
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ all -> 0x00be }
            throw r0     // Catch:{ all -> 0x00be }
        L_0x00be:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x00c3 }
            goto L_0x00c7
        L_0x00c3:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00d3 }
        L_0x00c7:
            throw r1     // Catch:{ all -> 0x00d3 }
        L_0x00c8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r8)
            java.lang.String r0 = " found on "
            X.C90464aC.A1G(r0, r4, r3, r1)
            r0 = 1
            return r0
        L_0x00d3:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x00d8 }
            throw r1
        L_0x00d8:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x00dd:
            r0 = 0
            return r0
        L_0x00df:
            java.lang.String r0 = "SoLoader.init() not yet called"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98414rO.A02(android.os.StrictMode$ThreadPolicy, java.lang.String, int):int");
    }

    public void A03(int i) {
        int indexOf;
        int i2;
        Iterator it = this.A02.iterator();
        String str = null;
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            if (!TextUtils.isEmpty(A0C) && (indexOf = A0C.indexOf(33)) >= 0 && (i2 = indexOf + 2) < A0C.length()) {
                str = A0C.substring(i2);
            }
            if (!TextUtils.isEmpty(str)) {
                ZipFile zipFile = new ZipFile(this.A00);
                try {
                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                    while (entries.hasMoreElements()) {
                        ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                        if (zipEntry != null && zipEntry.getName().startsWith(str) && zipEntry.getName().endsWith(".so") && zipEntry.getMethod() == 0) {
                            String substring = zipEntry.getName().substring(str.length() + 1);
                            synchronized (this) {
                                Map map = this.A01;
                                if (!map.containsKey(A0C)) {
                                    map.put(A0C, C36441kJ.A16());
                                }
                                C90524aI.A0r(A0C, map).add(substring);
                            }
                        }
                    }
                    zipFile.close();
                } catch (Throwable th) {
                    try {
                        zipFile.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
        }
    }

    public C98414rO(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        this.A02 = A00(lastIndexOf > 0 ? C90514aH.A0z(name, lastIndexOf) : name, file.getAbsolutePath());
        this.A00 = file;
    }

    public static HashSet A00(String str, String str2) {
        HashSet A16 = C36441kJ.A16();
        String A002 = SysUtil$Api14Utils.A00();
        if (A002 != null) {
            for (String str3 : A002.split(":")) {
                if (str3.contains(AnonymousClass000.A0q(".apk!/", AnonymousClass000.A0v(str)))) {
                    A16.add(str3);
                }
            }
        }
        if (A16.isEmpty()) {
            String[] A022 = C131706Qe.A02();
            if (!TextUtils.isEmpty(str2) && A022.length > 0) {
                StringBuilder A0v = AnonymousClass000.A0v(str2);
                A0v.append("!/lib/");
                String A0q = AnonymousClass000.A0q(A022[0], A0v);
                if (A0q != null) {
                    A16.add(A0q);
                }
            }
        }
        return A16;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(AnonymousClass000.A0k(this));
        A0u.append("[root = ");
        C36351kA.A1K(this.A02, A0u);
        return AnonymousClass000.A0t(A0u, ']');
    }

    public C98414rO(Context context) {
        String str = context.getApplicationInfo().sourceDir;
        this.A02 = A00("", str);
        this.A00 = C90524aI.A0S(str);
    }
}
