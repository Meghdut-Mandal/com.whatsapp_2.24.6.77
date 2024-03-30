package X;

import java.io.File;
import java.util.Map;

/* renamed from: X.6Nw  reason: invalid class name and case insensitive filesystem */
public final class C131136Nw {
    public final C19630wG A00;
    public final Map A01 = C36431kI.A1G();

    public C131136Nw(C19630wG r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        X.C05600Qi.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(java.io.InputStream r9, java.lang.String r10) {
        /*
            r8 = 0
            X.AnonymousClass00C.A0D(r9, r8)
            r7 = 1
            boolean r0 = r9 instanceof java.io.BufferedInputStream
            if (r0 != 0) goto L_0x0011
            r1 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r0.<init>(r9, r1)
            r9 = r0
        L_0x0011:
            java.security.MessageDigest r2 = X.C90504aG.A0s()     // Catch:{ all -> 0x0055 }
        L_0x0015:
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x0055 }
            int r0 = r9.read(r1)     // Catch:{ all -> 0x0055 }
            if (r0 < 0) goto L_0x0023
            r2.update(r1, r8, r0)     // Catch:{ all -> 0x0055 }
            goto L_0x0015
        L_0x0023:
            byte[] r6 = r2.digest()     // Catch:{ all -> 0x0055 }
            X.AnonymousClass00C.A08(r6)     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = ""
            int r5 = r6.length     // Catch:{ all -> 0x0055 }
            r4 = 0
        L_0x002e:
            if (r4 >= r5) goto L_0x004d
            byte r0 = r6[r4]     // Catch:{ all -> 0x0055 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0v(r1)     // Catch:{ all -> 0x0055 }
            java.lang.String r2 = "%02x"
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ all -> 0x0055 }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x0055 }
            java.lang.Object[] r0 = X.C90524aI.A0x(r0, r1, r8, r7)     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = X.C90504aG.A0m(r2, r0)     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r3)     // Catch:{ all -> 0x0055 }
            int r4 = r4 + 1
            goto L_0x002e
        L_0x004d:
            r9.close()
            boolean r0 = r10.equalsIgnoreCase(r1)
            return r0
        L_0x0055:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            X.C05600Qi.A00(r9, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131136Nw.A00(java.io.InputStream, java.lang.String):boolean");
    }

    public final File A01(String str, int i) {
        File A0T = C90524aI.A0T(AnonymousClass000.A0q("/ML_MODEL", AnonymousClass000.A0v(C90514aH.A0j(this.A00).getCanonicalPath())), str);
        StringBuilder A0v = AnonymousClass000.A0v(str);
        A0v.append('_');
        return C36441kJ.A0w(A0T, C36381kD.A10(A0v, i));
    }
}
