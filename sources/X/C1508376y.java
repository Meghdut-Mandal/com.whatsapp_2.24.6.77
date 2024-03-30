package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.76y  reason: invalid class name and case insensitive filesystem */
public final class C1508376y implements Callable, C160117kU, C158367go {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public final C20050ww A04;
    public final C19970wo A05;
    public final AnonymousClass6Fk A06;
    public final C122625vA A07;
    public final C159537jW A08;
    public final AnonymousClass1BS A09;
    public final AnonymousClass1BV A0A;
    public final AnonymousClass64M A0B;
    public final CountDownLatch A0C = new CountDownLatch(1);
    public final FutureTask A0D = new FutureTask(this);
    public final AtomicInteger A0E = new AtomicInteger();
    public final boolean A0F;

    public C1508376y(C20050ww r3, C19970wo r4, AnonymousClass1BV r5, AnonymousClass6Fk r6, C122625vA r7, C159537jW r8, AnonymousClass1BS r9, AnonymousClass64M r10, boolean z) {
        AnonymousClass00C.A0D(r4, 1);
        C36321k7.A12(r3, r9, r5);
        this.A05 = r4;
        this.A04 = r3;
        this.A09 = r9;
        this.A0A = r5;
        this.A07 = r7;
        this.A08 = r8;
        this.A06 = r6;
        this.A0F = z;
        this.A0B = r10;
    }

    private final void A00() {
        if (this.A0D.isCancelled()) {
            throw new CancellationException("PlainDownloadTransfer/ cancelled");
        }
    }

    public C117395mC B5u() {
        int i = 1;
        try {
            FutureTask futureTask = this.A0D;
            futureTask.run();
            C117395mC r1 = (C117395mC) futureTask.get();
            this.A0C.countDown();
            AnonymousClass00C.A0B(r1);
            return r1;
        } catch (InterruptedException | ExecutionException e) {
            Log.e("PlainDownloadTransfer/ exception ", e);
            this.A0C.countDown();
            return new C117395mC(new C133136Wx(i));
        } catch (CancellationException e2) {
            Log.e("PlainDownloadTransfer/ exception ", e2);
            this.A0C.countDown();
            i = 13;
            return new C117395mC(new C133136Wx(i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x017e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        X.C05600Qi.A00(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0182, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0185, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        X.C05600Qi.A00(r7, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0189, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x018c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        X.C05600Qi.A00(r9, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0190, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass6XL Bos(X.C1265864p r20) {
        /*
            r19 = this;
            java.lang.String r6 = "PlainDownloadTransfer/ error downloading from mms, url: "
            java.lang.String r8 = "PlainDownloadTransfer/ download fail: "
            r5 = 0
            r4 = r19
            java.util.concurrent.FutureTask r0 = r4.A0D
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto L_0x001a
            r0 = 13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.6XL r7 = X.AnonymousClass6XL.A01(r0)
        L_0x0019:
            return r7
        L_0x001a:
            X.5vA r2 = r4.A07     // Catch:{ MalformedURLException -> 0x0258 }
            X.7hT r0 = r2.A01     // Catch:{ MalformedURLException -> 0x0258 }
            r11 = r20
            java.lang.String r0 = r0.B7t(r11, r5)     // Catch:{ MalformedURLException -> 0x0258 }
            java.net.URL r13 = X.C90524aI.A0j(r0)     // Catch:{ MalformedURLException -> 0x0258 }
            X.6Fk r0 = r4.A06
            if (r0 == 0) goto L_0x0050
            r0.A0Z = r13
            X.1BV r3 = r4.A0A
            boolean r1 = r4.A0F
            int r1 = r3.A01(r11, r1)
            r0.A02 = r1
            int r1 = r11.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.A0M = r1
            java.lang.String r1 = r11.A04
            r0.A0U = r1
            java.lang.Integer r1 = X.C36361kB.A0j()
            r0.A0L = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            r0.A0I = r1
        L_0x0050:
            r1 = 7
            android.net.TrafficStats.setThreadStatsTag(r1)
            X.7kV r7 = r2.A00
            r7.Bwp()
            long r14 = r7.BEc()
            boolean r3 = r2.A03
            if (r3 == 0) goto L_0x0071
            r16 = 262143(0x3ffff, double:1.29516E-318)
            int r1 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r1 <= 0) goto L_0x0073
            java.lang.Integer r0 = X.C36401kF.A0k()
            X.6XL r7 = X.AnonymousClass6XL.A02(r0)
            return r7
        L_0x0071:
            r16 = -1
        L_0x0073:
            X.64M r2 = r4.A0B     // Catch:{ 5BM -> 0x01ef, 5BN -> 0x01d9, IOException -> 0x01c3, 5V9 -> 0x01a3, Exception -> 0x0191 }
            r12 = 0
            if (r2 == 0) goto L_0x0088
            java.util.concurrent.atomic.AtomicInteger r1 = r4.A0E     // Catch:{ 5BM -> 0x01ef, 5BN -> 0x01d9, IOException -> 0x01c3, 5V9 -> 0x01a3, Exception -> 0x0191 }
            int r1 = r1.getAndIncrement()     // Catch:{ 5BM -> 0x01ef, 5BN -> 0x01d9, IOException -> 0x01c3, 5V9 -> 0x01a3, Exception -> 0x0191 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ 5BM -> 0x01ef, 5BN -> 0x01d9, IOException -> 0x01c3, 5V9 -> 0x01a3, Exception -> 0x0191 }
            r2.A00 = r1     // Catch:{ 5BM -> 0x01ef, 5BN -> 0x01d9, IOException -> 0x01c3, 5V9 -> 0x01a3, Exception -> 0x0191 }
            java.lang.String r12 = r2.A00()     // Catch:{ 5BM -> 0x01ef, 5BN -> 0x01d9, IOException -> 0x01c3, 5V9 -> 0x01a3, Exception -> 0x0191 }
        L_0x0088:
            X.1BV r10 = r4.A0A     // Catch:{ 5BM -> 0x01ef, 5BN -> 0x01d9, IOException -> 0x01c3, 5V9 -> 0x01a3, Exception -> 0x0191 }
            boolean r1 = r4.A0F     // Catch:{ 5BM -> 0x01ef, 5BN -> 0x01d9, IOException -> 0x01c3, 5V9 -> 0x01a3, Exception -> 0x0191 }
            r18 = r1
            X.6v1 r9 = r10.A02(r11, r12, r13, r14, r16, r18)     // Catch:{ 5BM -> 0x01ef, 5BN -> 0x01d9, IOException -> 0x01c3, 5V9 -> 0x01a3, Exception -> 0x0191 }
            X.AnonymousClass00C.A0B(r9)     // Catch:{ all -> 0x018a }
            if (r0 == 0) goto L_0x00bc
            r0.A07()     // Catch:{ all -> 0x018a }
            java.lang.Boolean r1 = r9.A00     // Catch:{ all -> 0x018a }
            r0.A0H = r1     // Catch:{ all -> 0x018a }
            java.net.HttpURLConnection r2 = r9.A01     // Catch:{ all -> 0x018a }
            int r1 = r2.getResponseCode()     // Catch:{ all -> 0x018a }
            java.lang.Long r1 = X.C36441kJ.A0y(r1)     // Catch:{ all -> 0x018a }
            r0.A0R = r1     // Catch:{ all -> 0x018a }
            java.lang.String r1 = "x-fb-application-protocol"
            java.lang.String r1 = r2.getHeaderField(r1)     // Catch:{ all -> 0x018a }
            r0.A0X = r1     // Catch:{ all -> 0x018a }
            int r1 = r2.getContentLength()     // Catch:{ all -> 0x018a }
            java.lang.Long r1 = X.C36441kJ.A0y(r1)     // Catch:{ all -> 0x018a }
            r0.A0Q = r1     // Catch:{ all -> 0x018a }
        L_0x00bc:
            r1 = 2
            java.lang.Integer[] r2 = new java.lang.Integer[r1]     // Catch:{ all -> 0x018a }
            r1 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x018a }
            r12 = 0
            r2[r5] = r1     // Catch:{ all -> 0x018a }
            r1 = 206(0xce, float:2.89E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x018a }
            r11 = 1
            r2[r11] = r1     // Catch:{ all -> 0x018a }
            java.net.HttpURLConnection r10 = r9.A01     // Catch:{ all -> 0x018a }
            int r1 = r10.getResponseCode()     // Catch:{ all -> 0x018a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x018a }
            boolean r1 = X.AnonymousClass02R.A0F(r1, r2)     // Catch:{ all -> 0x018a }
            if (r1 != 0) goto L_0x011c
            int r2 = r10.getResponseCode()     // Catch:{ all -> 0x018a }
            r1 = 416(0x1a0, float:5.83E-43)
            if (r2 != r1) goto L_0x0151
            java.lang.String r1 = "Content-Range"
            java.lang.String r3 = r10.getHeaderField(r1)     // Catch:{ all -> 0x018a }
            if (r3 == 0) goto L_0x0151
            java.lang.String r1 = "*/"
            boolean r1 = X.AnonymousClass099.A0O(r3, r1, r5)     // Catch:{ all -> 0x018a }
            if (r1 != r11) goto L_0x0151
            r2 = 47
            int r1 = r3.length()     // Catch:{ all -> 0x018a }
            int r1 = r1 + -1
            int r1 = X.AnonymousClass099.A08(r3, r2, r1)     // Catch:{ all -> 0x018a }
            int r1 = r1 + 1
            java.lang.String r1 = X.C90494aF.A0d(r3, r1)     // Catch:{ all -> 0x018a }
            long r2 = java.lang.Long.parseLong(r1)     // Catch:{ all -> 0x018a }
            int r1 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r1 != 0) goto L_0x0151
        L_0x0113:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x018a }
            X.6XL r7 = X.AnonymousClass6XL.A02(r1)     // Catch:{ all -> 0x018a }
            goto L_0x0177
        L_0x011c:
            int r1 = r10.getContentLength()     // Catch:{ all -> 0x018a }
            long r1 = (long) r1     // Catch:{ all -> 0x018a }
            long r1 = r1 + r14
            r4.A02 = r1     // Catch:{ all -> 0x018a }
            if (r0 == 0) goto L_0x012b
            r1 = 0
            r0.A0A(r14, r1)     // Catch:{ all -> 0x018a }
        L_0x012b:
            java.io.OutputStream r7 = r7.Bl9(r9)     // Catch:{ all -> 0x018a }
            X.AnonymousClass00C.A0B(r7)     // Catch:{ all -> 0x0183 }
            X.0ww r2 = r4.A04     // Catch:{ all -> 0x0183 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0183 }
            X.5RE r5 = r9.B8D(r2, r1, r1)     // Catch:{ all -> 0x0183 }
            r2 = 10
            X.7sg r1 = new X.7sg     // Catch:{ all -> 0x017c }
            r1.<init>(r4, r2)     // Catch:{ all -> 0x017c }
            X.AnonymousClass6YY.A0D(r1, r5, r7)     // Catch:{ all -> 0x017c }
            r5.close()     // Catch:{ all -> 0x0183 }
            r7.close()     // Catch:{ all -> 0x018a }
            if (r3 == 0) goto L_0x0113
            r12 = 14
            goto L_0x0113
        L_0x0151:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x018a }
            java.lang.String r1 = "PlainDownloadTransfer/ http connection error/code: "
            r2.append(r1)     // Catch:{ all -> 0x018a }
            int r1 = r10.getResponseCode()     // Catch:{ all -> 0x018a }
            X.C36351kA.A1R(r2, r1)     // Catch:{ all -> 0x018a }
            int r2 = r10.getResponseCode()     // Catch:{ all -> 0x018a }
            r1 = 507(0x1fb, float:7.1E-43)
            if (r2 != r1) goto L_0x016b
            r11 = 12
        L_0x016b:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x018a }
            int r1 = r10.getResponseCode()     // Catch:{ all -> 0x018a }
            X.6XL r7 = X.AnonymousClass6XL.A04(r2, r1, r5)     // Catch:{ all -> 0x018a }
        L_0x0177:
            r9.close()     // Catch:{ 5BM -> 0x01ef, 5BN -> 0x01d9, IOException -> 0x01c3, 5V9 -> 0x01a3, Exception -> 0x0191 }
            goto L_0x021f
        L_0x017c:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x017e }
        L_0x017e:
            r1 = move-exception
            X.C05600Qi.A00(r5, r2)     // Catch:{ all -> 0x0183 }
            throw r1     // Catch:{ all -> 0x0183 }
        L_0x0183:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0185 }
        L_0x0185:
            r1 = move-exception
            X.C05600Qi.A00(r7, r2)     // Catch:{ all -> 0x018a }
            throw r1     // Catch:{ all -> 0x018a }
        L_0x018a:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x018c }
        L_0x018c:
            r1 = move-exception
            X.C05600Qi.A00(r9, r2)     // Catch:{ 5BM -> 0x01ef, 5BN -> 0x01d9, IOException -> 0x01c3, 5V9 -> 0x01a3, Exception -> 0x0191 }
            throw r1     // Catch:{ 5BM -> 0x01ef, 5BN -> 0x01d9, IOException -> 0x01c3, 5V9 -> 0x01a3, Exception -> 0x0191 }
        L_0x0191:
            r1 = move-exception
            if (r0 == 0) goto L_0x0197
            X.AnonymousClass6Fk.A00(r0, r1, r13)     // Catch:{ all -> 0x023b }
        L_0x0197:
            com.whatsapp.util.Log.e(r8, r1)     // Catch:{ all -> 0x023b }
            java.lang.Integer r1 = X.C36361kB.A0i()     // Catch:{ all -> 0x023b }
            X.6XL r7 = X.AnonymousClass6XL.A01(r1)     // Catch:{ all -> 0x023b }
            goto L_0x021f
        L_0x01a3:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0v(r8)     // Catch:{ all -> 0x023b }
            r2.append(r3)     // Catch:{ all -> 0x023b }
            java.lang.String r1 = ", url: "
            X.C36321k7.A1J(r13, r1, r2)     // Catch:{ all -> 0x023b }
            int r1 = r3.downloadStatus     // Catch:{ all -> 0x023b }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x023b }
            boolean r12 = X.C133136Wx.A02(r1)     // Catch:{ all -> 0x023b }
            r9 = -1
            X.6XL r7 = new X.6XL     // Catch:{ all -> 0x023b }
            r10 = 0
            r11 = 0
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x023b }
            goto L_0x021f
        L_0x01c3:
            r2 = move-exception
            if (r0 == 0) goto L_0x01d0
            X.AnonymousClass6Fk.A00(r0, r2, r13)     // Catch:{ all -> 0x023b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x023b }
            X.C36321k7.A1M(r13, r6, r1, r2)     // Catch:{ all -> 0x023b }
        L_0x01d0:
            java.lang.Integer r1 = X.C36401kF.A0i()     // Catch:{ all -> 0x023b }
            X.6XL r7 = X.AnonymousClass6XL.A00(r1)     // Catch:{ all -> 0x023b }
            goto L_0x021f
        L_0x01d9:
            r2 = move-exception
            if (r0 == 0) goto L_0x01e6
            X.AnonymousClass6Fk.A00(r0, r2, r13)     // Catch:{ all -> 0x023b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x023b }
            X.C36321k7.A1M(r13, r6, r1, r2)     // Catch:{ all -> 0x023b }
        L_0x01e6:
            java.lang.Integer r1 = X.C36421kH.A0U()     // Catch:{ all -> 0x023b }
            X.6XL r7 = X.AnonymousClass6XL.A00(r1)     // Catch:{ all -> 0x023b }
            goto L_0x021f
        L_0x01ef:
            r3 = move-exception
            if (r0 == 0) goto L_0x0200
            r0.A07()     // Catch:{ all -> 0x023b }
            X.AnonymousClass6Fk.A00(r0, r3, r13)     // Catch:{ all -> 0x023b }
            int r1 = r3.responseCode     // Catch:{ all -> 0x023b }
            java.lang.Long r1 = X.C36441kJ.A0y(r1)     // Catch:{ all -> 0x023b }
            r0.A0R = r1     // Catch:{ all -> 0x023b }
        L_0x0200:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x023b }
            java.lang.String r1 = "PlainDownloadTransfer/ http error "
            r2.append(r1)     // Catch:{ all -> 0x023b }
            int r1 = r3.responseCode     // Catch:{ all -> 0x023b }
            r2.append(r1)     // Catch:{ all -> 0x023b }
            java.lang.String r1 = " downloading from mms, url: "
            X.C36321k7.A1M(r13, r1, r2, r3)     // Catch:{ all -> 0x023b }
            int r1 = r3.downloadStatus     // Catch:{ all -> 0x023b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x023b }
            int r1 = r3.responseCode     // Catch:{ all -> 0x023b }
            X.6XL r7 = X.AnonymousClass6XL.A03(r2, r1)     // Catch:{ all -> 0x023b }
        L_0x021f:
            android.net.TrafficStats.clearThreadStatsTag()
            if (r0 == 0) goto L_0x0019
            boolean r1 = r0.A0C()
            if (r1 != 0) goto L_0x022d
            r0.A07()
        L_0x022d:
            long r4 = r0.A02()
            r2 = -1
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0019
            r0.A09()
            return r7
        L_0x023b:
            r6 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            if (r0 == 0) goto L_0x0257
            boolean r1 = r0.A0C()
            if (r1 != 0) goto L_0x024a
            r0.A07()
        L_0x024a:
            long r4 = r0.A02()
            r2 = -1
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0257
            r0.A09()
        L_0x0257:
            throw r6
        L_0x0258:
            java.lang.Integer r0 = X.C36391kE.A0r()
            X.6XL r0 = X.AnonymousClass6XL.A01(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1508376y.Bos(X.64p):X.6XL");
    }

    public /* bridge */ /* synthetic */ Object call() {
        int i;
        int i2;
        String str;
        Long A0h;
        String str2;
        AnonymousClass6Fk r7 = this.A06;
        if (r7 != null) {
            r7.A08 = SystemClock.elapsedRealtime();
            r7.A03 = 0;
        }
        C19970wo r4 = this.A05;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AnonymousClass1BS r9 = this.A09;
        r9.A0D();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        C122625vA r8 = this.A07;
        long BEc = r8.A00.BEc();
        this.A01 = BEc;
        this.A03 = BEc;
        if (r7 != null) {
            r7.A0S = C90504aG.A0h(elapsedRealtime2, elapsedRealtime);
            r7.A07 = BEc;
        }
        A00();
        AnonymousClass620 A0A2 = r9.A0A(r8.A01, 2);
        A00();
        Number number = (Number) A0A2.A00(this);
        if (r7 != null) {
            r7.A0D = (long) A0A2.A01.get();
        }
        A00();
        if (number != null) {
            i = number.intValue();
        } else {
            i = 11;
        }
        C133136Wx r2 = new C133136Wx(i, r8.A02, false);
        A00();
        if (r7 != null) {
            r7.A0G = r2;
            r7.A05 = SystemClock.elapsedRealtime();
            r7.A03 = 4;
            r7.A06 = C19970wo.A00(r4);
        }
        C117395mC r6 = new C117395mC(r2);
        if (r7 != null) {
            C133136Wx r5 = r6.A00;
            C1042858z r42 = new C1042858z();
            C133136Wx r0 = r7.A0G;
            if (r0 != null) {
                i2 = r0.A01;
            } else {
                i2 = -1;
            }
            int A002 = AnonymousClass6UH.A00(i2);
            r42.A0B = r7.A0M;
            if (!(A002 == 1 || A002 == 15)) {
                r42.A0e = r7.A0V;
                r42.A0f = r7.A0Y;
                URL url = r7.A0Z;
                if (url != null) {
                    str2 = url.toString();
                } else {
                    str2 = null;
                }
                r42.A0g = str2;
            }
            r42.A07 = C90524aI.A0Z(r7.A0F);
            r42.A0M = Long.valueOf(r7.A01());
            r42.A0N = r7.A0R;
            r42.A00 = r7.A0H;
            r42.A01 = C36381kD.A0j();
            r42.A0O = Long.valueOf(r7.A02());
            r42.A0E = Integer.valueOf(r7.A02);
            r42.A0b = Long.valueOf(r7.A0D);
            r42.A0F = r7.A0L;
            Long l = r7.A0S;
            if (l != null) {
                r42.A0W = l;
            }
            r42.A0h = r7.A0U;
            r42.A0X = Long.valueOf(r7.A04());
            URL url2 = r7.A0Z;
            if (url2 != null) {
                str = url2.getHost();
            } else {
                str = null;
            }
            r42.A0i = str;
            r42.A0I = Integer.valueOf(A002);
            r42.A05 = r7.A0I;
            Long l2 = r7.A0Q;
            if (l2 == null) {
                l2 = Long.valueOf(r7.A0F);
            }
            AnonymousClass00C.A0E(l2, "null cannot be cast to non-null type kotlin.Long");
            r42.A0A = C90524aI.A0Z(l2.longValue());
            long j = r7.A08;
            if (j == -1) {
                A0h = null;
            } else {
                A0h = C90504aG.A0h(j, r7.A0f);
            }
            r42.A0a = A0h;
            r42.A0c = Long.valueOf(r7.A04());
            long j2 = r7.A07;
            if (j2 == -1) {
                j2 = 0;
            }
            r42.A0P = Long.valueOf(j2);
            r42.A0Q = Long.valueOf(r7.A03());
            Float f = r7.A0K;
            if (f != null) {
                float floatValue = f.floatValue();
                if (C90494aF.A01(-1.0f, floatValue) > Float.MIN_VALUE) {
                    r42.A08 = Double.valueOf((double) floatValue);
                }
            }
            r42.A0Y = r7.A0P;
            r42.A02 = Boolean.valueOf(r7.A0a);
            r42.A09 = C90524aI.A0Z(r7.A09);
            r42.A0R = Long.valueOf(r7.A0A);
            r42.A0D = C132976Wa.A01(r7.A0X);
            r42.A0H = r7.A0N;
            r42.A0J = r7.A0O;
            r5.A00 = r42;
        }
        return r6;
    }

    public void cancel() {
        this.A0D.cancel(true);
    }

    public void B2V() {
        try {
            cancel();
            this.A0C.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            Log.e("PlainDownloadTransfer/ waitCancelFinish Cannot fully cancel after 3 seconds");
        }
    }
}
