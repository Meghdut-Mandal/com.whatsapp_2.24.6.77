package X;

/* renamed from: X.657  reason: invalid class name */
public class AnonymousClass657 {
    public final C20050ww A00;
    public final C20810yC A01;
    public final AnonymousClass13E A02;
    public final AnonymousClass7hA A03;
    public final C131146Nx A04;
    public final C24121Be A05;
    public final C21080yd A06;
    public final C19700wN A07;
    public final C19630wG A08;
    public final String A09;
    public final String A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a4, code lost:
        r3.flush();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r3.close();
        r2 = X.C90524aI.A0S(X.AnonymousClass000.A0p("/", r10, X.AnonymousClass000.A0v(r12)));
        r0 = r2.getParentFile();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c2, code lost:
        if (r0 == null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c4, code lost:
        X.C90474aD.A15(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (r2.exists() == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ce, code lost:
        r6.A02(r7, 3);
        r4.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d9, code lost:
        if (r4.renameTo(r2) == false) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r6.A02(r7, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00de, code lost:
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e3, code lost:
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x013e, code lost:
        r6.A02(r7, 8);
        r4.delete();
        r1 = X.C90524aI.A0X("NetworkResourceDownload/file-rename-failed");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean A00() {
        /*
            r13 = this;
            X.0yC r5 = r13.A01
            r0 = 3005(0xbbd, float:4.211E-42)
            boolean r0 = r5.A0E(r0)
            if (r0 == 0) goto L_0x016f
            java.lang.String r7 = r13.A0A
            X.0wG r0 = r13.A08
            java.io.File r1 = X.C90514aH.A0j(r0)
            java.lang.String r0 = "NetworkResource"
            java.io.File r0 = X.C36441kJ.A0w(r1, r0)
            java.lang.String r12 = r0.getAbsolutePath()
            r0 = 21
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ IOException -> 0x014f }
            java.lang.String r10 = r13.A09     // Catch:{ IOException -> 0x014f }
            java.lang.String r1 = "downloading-"
            java.lang.String r0 = ".tmp"
            java.io.File r4 = java.io.File.createTempFile(r1, r0)     // Catch:{ all -> 0x014d }
            X.6Nx r6 = r13.A04     // Catch:{ all -> 0x014d }
            int r1 = r6.A01(r7)     // Catch:{ all -> 0x014d }
            r0 = 5
            if (r1 != r0) goto L_0x0038
            r0 = 2
            r6.A02(r7, r0)     // Catch:{ all -> 0x014d }
        L_0x0038:
            r0 = 1
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x014d }
            r3.<init>(r4, r0)     // Catch:{ all -> 0x014d }
            java.util.HashMap r2 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x0134 }
            java.lang.String r1 = "cat"
            java.lang.String r0 = "nw_media"
            r2.put(r1, r0)     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = "id"
            r2.put(r0, r7)     // Catch:{ all -> 0x0134 }
            X.1Be r1 = r13.A05     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = "/wa/static/network_resource"
            android.net.Uri$Builder r0 = X.AnonymousClass6XA.A00(r5, r1, r0)     // Catch:{ all -> 0x0134 }
            java.lang.String r5 = X.AnonymousClass6XA.A03(r0, r2)     // Catch:{ all -> 0x0134 }
            X.13E r2 = r13.A02     // Catch:{ all -> 0x0132 }
            X.0yd r1 = r13.A06     // Catch:{ all -> 0x0132 }
            r0 = 0
            X.6v1 r5 = r2.A02(r1, r5, r0)     // Catch:{ all -> 0x0132 }
            java.net.HttpURLConnection r8 = r5.A01     // Catch:{ all -> 0x0128 }
            int r9 = r8.getResponseCode()     // Catch:{ all -> 0x0128 }
            r0 = 200(0xc8, float:2.8E-43)
            r11 = 22
            r2 = 0
            if (r9 != r0) goto L_0x00e4
            X.0ww r8 = r13.A00     // Catch:{ all -> 0x0128 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0128 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0128 }
            X.5RE r8 = r5.B8D(r8, r1, r0)     // Catch:{ all -> 0x0128 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r9 = new byte[r0]     // Catch:{ all -> 0x011e }
        L_0x0082:
            int r1 = r8.read(r9)     // Catch:{ all -> 0x011e }
            r0 = -1
            if (r1 == r0) goto L_0x00a4
            X.7hA r0 = r13.A03     // Catch:{ all -> 0x011e }
            boolean r0 = r0.BLb()     // Catch:{ all -> 0x011e }
            if (r0 != 0) goto L_0x0095
            r3.write(r9, r2, r1)     // Catch:{ all -> 0x011e }
            goto L_0x0082
        L_0x0095:
            r0 = 7
            r6.A02(r7, r0)     // Catch:{ all -> 0x011e }
            r4.delete()     // Catch:{ all -> 0x011e }
            java.lang.String r1 = "NetworkResourceDownload/user-canceled"
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException     // Catch:{ all -> 0x011e }
            r0.<init>(r1)     // Catch:{ all -> 0x011e }
            goto L_0x011d
        L_0x00a4:
            r3.flush()     // Catch:{ all -> 0x011e }
            r8.close()     // Catch:{ all -> 0x0128 }
            r5.close()     // Catch:{ all -> 0x0132 }
            r3.close()     // Catch:{ all -> 0x014d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r12)     // Catch:{ all -> 0x014d }
            java.lang.String r0 = "/"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r10, r1)     // Catch:{ all -> 0x014d }
            java.io.File r2 = X.C90524aI.A0S(r0)     // Catch:{ all -> 0x014d }
            java.io.File r0 = r2.getParentFile()     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x00c7
            X.C90474aD.A15(r0)     // Catch:{ all -> 0x014d }
        L_0x00c7:
            boolean r0 = r2.exists()     // Catch:{ all -> 0x014d }
            r1 = 3
            if (r0 == 0) goto L_0x00d5
            r6.A02(r7, r1)     // Catch:{ all -> 0x014d }
            r4.delete()     // Catch:{ all -> 0x014d }
            goto L_0x00de
        L_0x00d5:
            boolean r0 = r4.renameTo(r2)     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x013e
            r6.A02(r7, r1)     // Catch:{ IOException -> 0x014f }
        L_0x00de:
            android.net.TrafficStats.clearThreadStatsTag()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x00e4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = "NetworkResourceDownload/ response code: "
            X.C36321k7.A1S(r0, r1, r9)     // Catch:{ all -> 0x0128 }
            X.0ww r4 = r13.A00     // Catch:{ all -> 0x0128 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0128 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0128 }
            java.io.InputStream r0 = r8.getErrorStream()     // Catch:{ all -> 0x0128 }
            X.5RE r8 = new X.5RE     // Catch:{ all -> 0x0128 }
            r8.<init>(r4, r0, r2, r1)     // Catch:{ all -> 0x0128 }
            r0 = 6
            r6.A02(r7, r0)     // Catch:{ all -> 0x011e }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x011e }
            java.lang.String r0 = "NetworkResourceDownload/responseCode:"
            r1.append(r0)     // Catch:{ all -> 0x011e }
            r1.append(r9)     // Catch:{ all -> 0x011e }
            java.lang.String r0 = "; error="
            r1.append(r0)     // Catch:{ all -> 0x011e }
            java.lang.String r0 = X.AnonymousClass14X.A00(r8)     // Catch:{ all -> 0x011e }
            java.io.IOException r0 = X.C90464aC.A0M(r0, r1)     // Catch:{ all -> 0x011e }
        L_0x011d:
            throw r0     // Catch:{ all -> 0x011e }
        L_0x011e:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0123 }
            goto L_0x0127
        L_0x0123:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0128 }
        L_0x0127:
            throw r1     // Catch:{ all -> 0x0128 }
        L_0x0128:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x012d }
            goto L_0x0131
        L_0x012d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0132 }
        L_0x0131:
            throw r1     // Catch:{ all -> 0x0132 }
        L_0x0132:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0139 }
            goto L_0x014c
        L_0x0139:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x014d }
            goto L_0x014c
        L_0x013e:
            r0 = 8
            r6.A02(r7, r0)     // Catch:{ all -> 0x014d }
            r4.delete()     // Catch:{ all -> 0x014d }
            java.lang.String r0 = "NetworkResourceDownload/file-rename-failed"
            java.io.IOException r1 = X.C90524aI.A0X(r0)     // Catch:{ all -> 0x014d }
        L_0x014c:
            throw r1     // Catch:{ all -> 0x014d }
        L_0x014d:
            r0 = move-exception
            throw r0     // Catch:{ IOException -> 0x014f }
        L_0x014f:
            r3 = move-exception
            X.0wN r2 = r13.A07     // Catch:{ all -> 0x016a }
            java.lang.String r1 = "NetworkResourceDownload/"
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x016a }
            r2.A0D(r1, r0, r3)     // Catch:{ all -> 0x016a }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x016a }
            java.lang.String r0 = "NetworkResourceDownload/IOException/"
            java.lang.String r0 = X.C36331k8.A0i(r0, r1, r3)     // Catch:{ all -> 0x016a }
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ all -> 0x016a }
            throw r0     // Catch:{ all -> 0x016a }
        L_0x016a:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x016f:
            java.lang.String r1 = "NetworkResourceDownload/ABProp disabled"
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass657.A00():java.lang.Boolean");
    }

    public AnonymousClass657(C19700wN r1, C20050ww r2, C19630wG r3, C20810yC r4, AnonymousClass13E r5, AnonymousClass7hA r6, C131146Nx r7, C24121Be r8, C21080yd r9, String str, String str2) {
        this.A0A = str;
        this.A04 = r7;
        this.A01 = r4;
        this.A08 = r3;
        this.A07 = r1;
        this.A09 = str2;
        this.A00 = r2;
        this.A02 = r5;
        this.A06 = r9;
        this.A05 = r8;
        this.A03 = r6;
    }
}
