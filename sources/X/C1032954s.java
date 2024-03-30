package X;

import java.io.File;
import java.util.HashMap;

/* renamed from: X.54s  reason: invalid class name and case insensitive filesystem */
public class C1032954s extends AnonymousClass1H3 {
    public final HashMap A00 = AnonymousClass001.A0J();

    public /* bridge */ /* synthetic */ Object A07() {
        HashMap A0H;
        synchronized (this) {
            A0H = A0H();
            if (A0H.isEmpty()) {
                A0H = null;
            }
        }
        return A0H;
    }

    public String A08() {
        return "filter";
    }

    public synchronized void A0D(String str) {
        this.A00.clear();
    }

    public boolean A0E(int i) {
        C18740tg.A0B(AnonymousClass000.A1S(i, -1));
        return A0J();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r2 = X.C36441kJ.A0w(r9.getFilesDir(), X.C36321k7.A0D("downloadable/filter_", r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a4, code lost:
        if (X.AnonymousClass6YY.A0R(r2) != false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
        r0 = "FilterManager/store/Could not prepare filters subdirectory";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a8, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ab, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b1, code lost:
        if (r4.renameTo(r2) != false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b3, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("FilterManager/store : rename failed, from ");
        X.C36351kA.A1K(r4, r1);
        r1.append(" to ");
        X.C36351kA.A1K(r2, r1);
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d6, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d7, code lost:
        r1 = th;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0F(X.C162167o8 r12, java.lang.String r13, int r14) {
        /*
            r11 = this;
            r7 = -1
            boolean r0 = X.AnonymousClass000.A1S(r14, r7)
            X.C18740tg.A0B(r0)
            r10 = r11
            X.C18740tg.A00()
            monitor-enter(r10)
            int r1 = r11.A05(r7)     // Catch:{ all -> 0x00f0 }
            monitor-exit(r10)
            r8 = 0
            r0 = 3
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            X.C18740tg.A0C(r0)
            X.0ww r2 = r11.A04     // Catch:{ IOException -> 0x00e8 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x00e8 }
            r0 = 21
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x00e8 }
            X.5RE r0 = r12.B8D(r2, r1, r0)     // Catch:{ IOException -> 0x00e8 }
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream     // Catch:{ IOException -> 0x00e8 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x00e8 }
            java.lang.String r6 = "downloadable/filter_"
            X.0wG r0 = r11.A07     // Catch:{ all -> 0x00de }
            android.content.Context r9 = r0.A00     // Catch:{ all -> 0x00de }
            java.io.File r2 = r9.getCacheDir()     // Catch:{ all -> 0x00de }
            java.lang.StringBuilder r1 = X.C36331k8.A0k(r6, r13)     // Catch:{ all -> 0x00de }
            java.lang.String r0 = "_tmp"
            java.io.File r4 = X.C90464aC.A0K(r2, r0, r1)     // Catch:{ all -> 0x00de }
            boolean r0 = X.AnonymousClass6YY.A0R(r4)     // Catch:{ all -> 0x00de }
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = "FilterManager/store/Could not prepare temporary cache subdirectory"
        L_0x004c:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00de }
            goto L_0x00cc
        L_0x0050:
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r5 = new byte[r0]     // Catch:{ all -> 0x00de }
        L_0x0054:
            java.util.zip.ZipEntry r2 = r3.getNextEntry()     // Catch:{ all -> 0x00de }
            if (r2 == 0) goto L_0x0093
            java.lang.String r1 = r4.getCanonicalPath()     // Catch:{ all -> 0x00de }
            java.lang.String r0 = r2.getName()     // Catch:{ all -> 0x00de }
            java.io.File r0 = X.AnonymousClass6YY.A05(r1, r0)     // Catch:{ all -> 0x00de }
            if (r0 != 0) goto L_0x007a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00de }
            java.lang.String r0 = "FilterManager/store/malicious zip file:"
            r1.append(r0)     // Catch:{ all -> 0x00de }
            java.lang.String r0 = r2.getName()     // Catch:{ all -> 0x00de }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x00de }
            goto L_0x004c
        L_0x007a:
            java.io.FileOutputStream r2 = X.C90524aI.A0W(r0)     // Catch:{ all -> 0x00de }
        L_0x007e:
            int r0 = r3.read(r5)     // Catch:{ all -> 0x008c }
            if (r0 == r7) goto L_0x0088
            r2.write(r5, r8, r0)     // Catch:{ all -> 0x008c }
            goto L_0x007e
        L_0x0088:
            r2.close()     // Catch:{ all -> 0x00de }
            goto L_0x0054
        L_0x008c:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0091 }
            goto L_0x00dd
        L_0x0091:
            r0 = move-exception
            goto L_0x00da
        L_0x0093:
            monitor-enter(r10)     // Catch:{ all -> 0x00de }
            java.io.File r1 = r9.getFilesDir()     // Catch:{ all -> 0x00d7 }
            java.lang.String r0 = X.C36321k7.A0D(r6, r13)     // Catch:{ all -> 0x00d7 }
            java.io.File r2 = X.C36441kJ.A0w(r1, r0)     // Catch:{ all -> 0x00d7 }
            boolean r0 = X.AnonymousClass6YY.A0R(r2)     // Catch:{ all -> 0x00d7 }
            if (r0 != 0) goto L_0x00ad
            java.lang.String r0 = "FilterManager/store/Could not prepare filters subdirectory"
        L_0x00a8:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00d7 }
            monitor-exit(r10)     // Catch:{ all -> 0x00d7 }
            goto L_0x00cc
        L_0x00ad:
            boolean r0 = r4.renameTo(r2)     // Catch:{ all -> 0x00d7 }
            if (r0 != 0) goto L_0x00d1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00d7 }
            java.lang.String r0 = "FilterManager/store : rename failed, from "
            r1.append(r0)     // Catch:{ all -> 0x00d7 }
            X.C36351kA.A1K(r4, r1)     // Catch:{ all -> 0x00d7 }
            java.lang.String r0 = " to "
            r1.append(r0)     // Catch:{ all -> 0x00d7 }
            X.C36351kA.A1K(r2, r1)     // Catch:{ all -> 0x00d7 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00d7 }
            goto L_0x00a8
        L_0x00cc:
            r3.close()     // Catch:{ IOException -> 0x00e8 }
            r0 = 0
            return r0
        L_0x00d1:
            monitor-exit(r10)     // Catch:{ all -> 0x00d7 }
            r3.close()     // Catch:{ IOException -> 0x00e8 }
            r0 = 1
            return r0
        L_0x00d7:
            r1 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00d7 }
            goto L_0x00dd
        L_0x00da:
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00de }
        L_0x00dd:
            throw r1     // Catch:{ all -> 0x00de }
        L_0x00de:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x00e3 }
            goto L_0x00e7
        L_0x00e3:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x00e8 }
        L_0x00e7:
            throw r1     // Catch:{ IOException -> 0x00e8 }
        L_0x00e8:
            r1 = move-exception
            java.lang.String r0 = "FilterManager/store/Failed!"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        L_0x00f0:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1032954s.A0F(X.7o8, java.lang.String, int):boolean");
    }

    public synchronized HashMap A0H() {
        HashMap hashMap;
        C131636Pw A06;
        String[] list;
        hashMap = this.A00;
        if (hashMap.isEmpty() && (A06 = A06()) != null) {
            File A0w = C36441kJ.A0w(C90514aH.A0j(this.A07), C36321k7.A0D("downloadable/filter_", A06.A01()));
            if (!A0w.exists() || (list = A0w.list()) == null) {
                A09();
            } else {
                String absolutePath = A0w.getAbsolutePath();
                for (String str : list) {
                    hashMap.put(str, C90524aI.A0T(absolutePath, str));
                }
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006f A[SYNTHETIC, Splitter:B:40:0x006f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A0I(X.C159437jM r6, int r7) {
        /*
            r5 = this;
            r4 = r5
            monitor-enter(r4)
            r0 = -1
            int r3 = r5.A05(r0)     // Catch:{ all -> 0x0081 }
            r1 = 5
            r2 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 == r2) goto L_0x002d
            r0 = 2
            if (r3 == r0) goto L_0x003d
            r0 = 3
            if (r3 == r0) goto L_0x002d
            r0 = 4
            if (r3 == r0) goto L_0x003d
            if (r3 == r1) goto L_0x006d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "FilterManager/getFilesAsync/Unexpected state "
            r1.append(r0)     // Catch:{ all -> 0x0081 }
            java.util.HashMap r0 = X.AnonymousClass1H3.A0J     // Catch:{ all -> 0x0081 }
            java.lang.Object r0 = X.C90484aE.A0j(r0, r3)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0081 }
            X.C36321k7.A1Z(r1, r0)     // Catch:{ all -> 0x0081 }
            goto L_0x0056
        L_0x002d:
            java.util.HashMap r1 = X.AnonymousClass1H3.A0J     // Catch:{ all -> 0x0081 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0081 }
            r1.get(r0)     // Catch:{ all -> 0x0081 }
            if (r6 == 0) goto L_0x007d
            r0 = -1
            r5.A0C(r6, r0)     // Catch:{ all -> 0x007f }
            goto L_0x007d
        L_0x003d:
            boolean r0 = r5.A0J()     // Catch:{ all -> 0x0081 }
            if (r0 != 0) goto L_0x0069
            if (r7 != 0) goto L_0x005c
            X.0v0 r1 = r5.A08     // Catch:{ all -> 0x0081 }
            X.0wD r0 = r5.A05     // Catch:{ all -> 0x0081 }
            int r0 = r0.A03(r2)     // Catch:{ all -> 0x0081 }
            int r0 = X.C54052sK.A00(r1, r0)     // Catch:{ all -> 0x0081 }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0056
            goto L_0x005c
        L_0x0056:
            if (r6 == 0) goto L_0x007d
            r6.BWY()     // Catch:{ all -> 0x0081 }
            goto L_0x007d
        L_0x005c:
            r0 = -1
            r5.A0B(r2, r0)     // Catch:{ all -> 0x007f }
            if (r6 == 0) goto L_0x0065
            r5.A0C(r6, r0)     // Catch:{ all -> 0x007f }
        L_0x0065:
            r5.A0A(r7, r0)     // Catch:{ all -> 0x0081 }
            goto L_0x007d
        L_0x0069:
            r0 = -1
            r5.A0B(r1, r0)     // Catch:{ all -> 0x007f }
        L_0x006d:
            if (r6 == 0) goto L_0x007d
            boolean r0 = r5.A0J()     // Catch:{ all -> 0x0081 }
            X.C18740tg.A0C(r0)     // Catch:{ all -> 0x0081 }
            java.util.HashMap r0 = r5.A0H()     // Catch:{ all -> 0x0081 }
            r6.BeC(r0)     // Catch:{ all -> 0x0081 }
        L_0x007d:
            monitor-exit(r4)
            return
        L_0x007f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1032954s.A0I(X.7jM, int):void");
    }

    public synchronized boolean A0J() {
        return !A0H().isEmpty();
    }

    public C1032954s(C19700wN r2, C20050ww r3, C19600wD r4, C19970wo r5, C19630wG r6, AnonymousClass17Z r7, C19420v0 r8, AnonymousClass1H5 r9, C20810yC r10, C21010yW r11, AnonymousClass13E r12, C24121Be r13, C21080yd r14, C19770wU r15) {
        super(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
    }
}
