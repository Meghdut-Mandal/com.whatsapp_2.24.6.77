package X;

import android.content.Context;
import java.util.concurrent.Callable;

public class B8W implements Callable {
    public Object A00;
    public String A01;
    public String A02;
    public final int A03;

    public B8W(Context context, String str, String str2, int i) {
        this.A03 = i;
        this.A00 = context;
        this.A01 = str;
        this.A02 = str2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:40|41|42|43|(9:45|46|(1:48)|49|(2:63|(1:65)(3:69|98|99))(2:57|(1:59)(3:68|98|99))|60|(2:62|(1:67))|98|99)|70|71|(4:73|93|98|99)|74|75|(3:76|77|(1:79)(7:80|81|82|83|93|98|99))) */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01db, code lost:
        if (r3 == null) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0074, code lost:
        if (r9.exists() != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        X.AnonymousClass6GP.A01("get error failed ", r1);
        r0 = r1.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01d1, code lost:
        if (r8 == null) goto L_0x01db;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x0156 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x0163 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:82:0x01aa */
    /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x01b6 */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0161 A[Catch:{ IOException -> 0x0163 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x019e A[Catch:{ all -> 0x01b2, IOException -> 0x01b7 }, LOOP:0: B:76:0x0198->B:79:0x019e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01a7 A[SYNTHETIC, Splitter:B:80:0x01a7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r11 = this;
            int r0 = r11.A03
            if (r0 == 0) goto L_0x022c
            java.lang.Object r7 = r11.A00
            android.content.Context r7 = (android.content.Context) r7
            java.lang.String r6 = r11.A01
            java.lang.String r3 = r11.A02
            X.9G8 r5 = X.C1892792y.A01
            if (r5 != 0) goto L_0x0048
            java.lang.Class<X.9G8> r8 = X.AnonymousClass9G8.class
            monitor-enter(r8)
            X.9G8 r5 = X.C1892792y.A01     // Catch:{ all -> 0x0045 }
            if (r5 != 0) goto L_0x0043
            android.content.Context r4 = r7.getApplicationContext()     // Catch:{ all -> 0x0045 }
            X.9ii r2 = X.C1892792y.A00     // Catch:{ all -> 0x0045 }
            if (r2 != 0) goto L_0x0037
            java.lang.Class<X.9ii> r1 = X.C201059ii.class
            monitor-enter(r1)     // Catch:{ all -> 0x0045 }
            X.9ii r2 = X.C1892792y.A00     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x0032
            X.9Bb r0 = new X.9Bb     // Catch:{ all -> 0x0034 }
            r0.<init>(r4)     // Catch:{ all -> 0x0034 }
            X.9ii r2 = new X.9ii     // Catch:{ all -> 0x0034 }
            r2.<init>(r0)     // Catch:{ all -> 0x0034 }
            X.C1892792y.A00 = r2     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r1)     // Catch:{ all -> 0x0034 }
            goto L_0x0037
        L_0x0034:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0034 }
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x0037:
            X.93W r0 = new X.93W     // Catch:{ all -> 0x0045 }
            r0.<init>()     // Catch:{ all -> 0x0045 }
            X.9G8 r5 = new X.9G8     // Catch:{ all -> 0x0045 }
            r5.<init>(r0, r2)     // Catch:{ all -> 0x0045 }
            X.C1892792y.A01 = r5     // Catch:{ all -> 0x0045 }
        L_0x0043:
            monitor-exit(r8)     // Catch:{ all -> 0x0045 }
            goto L_0x0048
        L_0x0045:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0045 }
            throw r0
        L_0x0048:
            r4 = 0
            if (r3 == 0) goto L_0x007d
            X.9ii r10 = r5.A00
            java.io.File r1 = X.C201059ii.A00(r10)     // Catch:{ FileNotFoundException -> 0x007d }
            X.8zt r8 = X.C188618zt.JSON     // Catch:{ FileNotFoundException -> 0x007d }
            r2 = 0
            java.lang.String r0 = X.C201059ii.A01(r8, r6, r2)     // Catch:{ FileNotFoundException -> 0x007d }
            java.io.File r9 = X.C36441kJ.A0w(r1, r0)     // Catch:{ FileNotFoundException -> 0x007d }
            boolean r0 = r9.exists()     // Catch:{ FileNotFoundException -> 0x007d }
            if (r0 != 0) goto L_0x0076
            java.io.File r1 = X.C201059ii.A00(r10)     // Catch:{ FileNotFoundException -> 0x007d }
            X.8zt r0 = X.C188618zt.ZIP     // Catch:{ FileNotFoundException -> 0x007d }
            java.lang.String r0 = X.C201059ii.A01(r0, r6, r2)     // Catch:{ FileNotFoundException -> 0x007d }
            java.io.File r9 = X.C36441kJ.A0w(r1, r0)     // Catch:{ FileNotFoundException -> 0x007d }
            boolean r0 = r9.exists()     // Catch:{ FileNotFoundException -> 0x007d }
            if (r0 == 0) goto L_0x007d
        L_0x0076:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x007d }
            r2.<init>(r9)     // Catch:{ FileNotFoundException -> 0x007d }
            goto L_0x01de
        L_0x007d:
            java.lang.String r2 = "LottieFetchResult close failed "
            r8 = 0
            java.net.URLConnection r1 = X.C90504aG.A0r(r6)     // Catch:{ Exception -> 0x01cb }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x01cb }
            java.lang.String r0 = "GET"
            r1.setRequestMethod(r0)     // Catch:{ Exception -> 0x01cb }
            r1.connect()     // Catch:{ Exception -> 0x01cb }
            X.ATn r0 = new X.ATn     // Catch:{ Exception -> 0x01cb }
            r0.<init>(r1)     // Catch:{ Exception -> 0x01cb }
            r8 = r0
            java.net.HttpURLConnection r9 = r0.A00     // Catch:{ IOException -> 0x0156 }
            int r0 = r9.getResponseCode()     // Catch:{ IOException -> 0x0156 }
            int r1 = r0 / 100
            r0 = 2
            if (r1 != r0) goto L_0x0156
            java.io.InputStream r10 = r9.getInputStream()     // Catch:{ Exception -> 0x01cb }
            java.lang.String r1 = r9.getContentType()     // Catch:{ Exception -> 0x01cb }
            if (r1 != 0) goto L_0x00ab
            java.lang.String r1 = "application/json"
        L_0x00ab:
            java.lang.String r0 = "application/zip"
            boolean r0 = r1.contains(r0)     // Catch:{ Exception -> 0x01cb }
            if (r0 != 0) goto L_0x0112
            java.lang.String r0 = "application/x-zip"
            boolean r0 = r1.contains(r0)     // Catch:{ Exception -> 0x01cb }
            if (r0 != 0) goto L_0x0112
            java.lang.String r0 = "application/x-zip-compressed"
            boolean r0 = r1.contains(r0)     // Catch:{ Exception -> 0x01cb }
            if (r0 != 0) goto L_0x0112
            java.lang.String r0 = "\\?"
            java.lang.String[] r0 = r6.split(r0)     // Catch:{ Exception -> 0x01cb }
            java.lang.String r1 = X.C165617ti.A0a(r0)     // Catch:{ Exception -> 0x01cb }
            java.lang.String r0 = ".lottie"
            boolean r0 = r1.endsWith(r0)     // Catch:{ Exception -> 0x01cb }
            if (r0 != 0) goto L_0x0112
            X.8zt r9 = X.C188618zt.JSON     // Catch:{ Exception -> 0x01cb }
            if (r3 == 0) goto L_0x0146
            X.9ii r5 = r5.A00     // Catch:{ Exception -> 0x01cb }
            java.io.File r0 = r5.A02(r9, r10, r6)     // Catch:{ Exception -> 0x01cb }
            java.lang.String r1 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x01cb }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x01cb }
            r0.<init>(r1)     // Catch:{ Exception -> 0x01cb }
            X.6Nn r4 = X.C203529oE.A04(r0, r6)     // Catch:{ Exception -> 0x01cb }
        L_0x00ec:
            java.lang.Object r0 = r4.A00     // Catch:{ Exception -> 0x01cb }
            if (r0 == 0) goto L_0x01d3
            r0 = 1
            java.lang.String r1 = X.C201059ii.A01(r9, r6, r0)     // Catch:{ Exception -> 0x01cb }
            java.io.File r0 = X.C201059ii.A00(r5)     // Catch:{ Exception -> 0x01cb }
            java.io.File r6 = X.C36441kJ.A0w(r0, r1)     // Catch:{ Exception -> 0x01cb }
            java.lang.String r5 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x01cb }
            java.lang.String r1 = ".temp"
            java.lang.String r0 = ""
            java.lang.String r0 = r5.replace(r1, r0)     // Catch:{ Exception -> 0x01cb }
            java.io.File r5 = X.C90524aI.A0S(r0)     // Catch:{ Exception -> 0x01cb }
            boolean r0 = r6.renameTo(r5)     // Catch:{ Exception -> 0x01cb }
            goto L_0x012b
        L_0x0112:
            X.8zt r9 = X.C188618zt.ZIP     // Catch:{ Exception -> 0x01cb }
            if (r3 == 0) goto L_0x014c
            X.9ii r5 = r5.A00     // Catch:{ Exception -> 0x01cb }
            java.io.File r0 = r5.A02(r9, r10, r6)     // Catch:{ Exception -> 0x01cb }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x01cb }
            r1.<init>(r0)     // Catch:{ Exception -> 0x01cb }
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x01cb }
            r0.<init>(r1)     // Catch:{ Exception -> 0x01cb }
            X.6Nn r4 = X.C203529oE.A02(r7, r6, r0)     // Catch:{ Exception -> 0x01cb }
            goto L_0x00ec
        L_0x012b:
            if (r0 != 0) goto L_0x01d3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x01cb }
            java.lang.String r0 = "Unable to rename cache file "
            X.C90464aC.A1A(r6, r0, r1)     // Catch:{ Exception -> 0x01cb }
            java.lang.String r0 = " to "
            X.C90464aC.A1A(r5, r0, r1)     // Catch:{ Exception -> 0x01cb }
            java.lang.String r0 = "."
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ Exception -> 0x01cb }
            X.AnonymousClass6GP.A00(r0)     // Catch:{ Exception -> 0x01cb }
            goto L_0x01d3
        L_0x0146:
            X.6Nn r4 = X.C203529oE.A04(r10, r4)     // Catch:{ Exception -> 0x01cb }
            goto L_0x01d3
        L_0x014c:
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x01cb }
            r0.<init>(r10)     // Catch:{ Exception -> 0x01cb }
            X.6Nn r4 = X.C203529oE.A02(r7, r4, r0)     // Catch:{ Exception -> 0x01cb }
            goto L_0x01d3
        L_0x0156:
            java.net.HttpURLConnection r0 = r8.A00     // Catch:{ IOException -> 0x0163 }
            int r0 = r0.getResponseCode()     // Catch:{ IOException -> 0x0163 }
            int r1 = r0 / 100
            r0 = 2
            if (r1 != r0) goto L_0x0163
            r0 = 0
            goto L_0x01c1
        L_0x0163:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x01b7 }
            java.lang.String r0 = "Unable to fetch "
            r5.append(r0)     // Catch:{ IOException -> 0x01b7 }
            java.net.HttpURLConnection r1 = r8.A00     // Catch:{ IOException -> 0x01b7 }
            java.net.URL r0 = r1.getURL()     // Catch:{ IOException -> 0x01b7 }
            r5.append(r0)     // Catch:{ IOException -> 0x01b7 }
            java.lang.String r0 = ". Failed with "
            r5.append(r0)     // Catch:{ IOException -> 0x01b7 }
            int r0 = r1.getResponseCode()     // Catch:{ IOException -> 0x01b7 }
            r5.append(r0)     // Catch:{ IOException -> 0x01b7 }
            java.lang.String r0 = "\n"
            r5.append(r0)     // Catch:{ IOException -> 0x01b7 }
            java.io.InputStream r1 = r1.getErrorStream()     // Catch:{ IOException -> 0x01b7 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x01b7 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01b7 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x01b7 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x01b7 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x01b7 }
        L_0x0198:
            java.lang.String r0 = r4.readLine()     // Catch:{ all -> 0x01b2 }
            if (r0 == 0) goto L_0x01a7
            r1.append(r0)     // Catch:{ all -> 0x01b2 }
            r0 = 10
            r1.append(r0)     // Catch:{ all -> 0x01b2 }
            goto L_0x0198
        L_0x01a7:
            r4.close()     // Catch:{ Exception -> 0x01aa }
        L_0x01aa:
            X.C36351kA.A1K(r1, r5)     // Catch:{ IOException -> 0x01b7 }
            java.lang.String r0 = r5.toString()     // Catch:{ IOException -> 0x01b7 }
            goto L_0x01c1
        L_0x01b2:
            r0 = move-exception
            r4.close()     // Catch:{ Exception -> 0x01b6 }
        L_0x01b6:
            throw r0     // Catch:{ IOException -> 0x01b7 }
        L_0x01b7:
            r1 = move-exception
            java.lang.String r0 = "get error failed "
            X.AnonymousClass6GP.A01(r0, r1)     // Catch:{ Exception -> 0x01cb }
            java.lang.String r0 = r1.getMessage()     // Catch:{ Exception -> 0x01cb }
        L_0x01c1:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ Exception -> 0x01cb }
            X.6Nn r4 = new X.6Nn     // Catch:{ Exception -> 0x01cb }
            r4.<init>((java.lang.Throwable) r0)     // Catch:{ Exception -> 0x01cb }
            goto L_0x01d3
        L_0x01cb:
            r0 = move-exception
            X.6Nn r4 = new X.6Nn     // Catch:{ all -> 0x0220 }
            r4.<init>((java.lang.Throwable) r0)     // Catch:{ all -> 0x0220 }
            if (r8 == 0) goto L_0x01db
        L_0x01d3:
            r8.close()     // Catch:{ IOException -> 0x01d7 }
            goto L_0x01db
        L_0x01d7:
            r0 = move-exception
            X.AnonymousClass6GP.A01(r2, r0)
        L_0x01db:
            if (r3 == 0) goto L_0x021a
            goto L_0x020f
        L_0x01de:
            java.lang.String r1 = r9.getAbsolutePath()
            java.lang.String r0 = ".zip"
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L_0x01ec
            X.8zt r8 = X.C188618zt.ZIP
        L_0x01ec:
            r9.getAbsolutePath()
            android.util.Pair r0 = X.C36441kJ.A0Q(r8, r2)
            java.lang.Object r2 = r0.first
            java.lang.Object r1 = r0.second
            java.io.InputStream r1 = (java.io.InputStream) r1
            X.8zt r0 = X.C188618zt.ZIP
            if (r2 != r0) goto L_0x021b
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream
            r0.<init>(r1)
            X.6Nn r0 = X.C203529oE.A02(r7, r3, r0)
        L_0x0206:
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x007d
            X.6Nn r4 = new X.6Nn
            r4.<init>((java.lang.Object) r0)
        L_0x020f:
            java.lang.Object r1 = r4.A00
            if (r1 == 0) goto L_0x021a
            X.9bR r0 = X.AnonymousClass9bR.A01
            X.00v r0 = r0.A00
            r0.A08(r3, r1)
        L_0x021a:
            return r4
        L_0x021b:
            X.6Nn r0 = X.C203529oE.A04(r1, r3)
            goto L_0x0206
        L_0x0220:
            r1 = move-exception
            if (r8 == 0) goto L_0x022b
            r8.close()     // Catch:{ IOException -> 0x0227 }
            throw r1
        L_0x0227:
            r0 = move-exception
            X.AnonymousClass6GP.A01(r2, r0)
        L_0x022b:
            throw r1
        L_0x022c:
            java.lang.Object r2 = r11.A00
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r1 = r11.A01
            java.lang.String r0 = r11.A02
            X.6Nn r4 = X.C203529oE.A01(r2, r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B8W.call():java.lang.Object");
    }
}
