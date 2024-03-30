package X;

import android.util.Pair;
import com.whatsapp.util.Log;
import com.whatsapp.util.NativeUtils;
import java.io.File;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6VO  reason: invalid class name */
public class AnonymousClass6VO {
    public long A00;
    public long A01;
    public Boolean A02;
    public String A03;
    public String A04;
    public final C20050ww A05;
    public final C160437l0 A06;
    public final C21080yd A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final List A0C = C90524aI.A0l();
    public final List A0D = C90524aI.A0l();
    public final List A0E = C90524aI.A0l();
    public final List A0F = C90524aI.A0l();
    public final AtomicBoolean A0G = new AtomicBoolean();
    public final AtomicReference A0H = new AtomicReference();
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public static String A01(URL url) {
        if (!(url == null || url.getHost() == null)) {
            try {
                return InetAddress.getByName(url.getHost()).getHostAddress();
            } catch (UnknownHostException unused) {
            }
        }
        return null;
    }

    private Pair A00() {
        boolean z;
        Socket socket = (Socket) this.A0H.get();
        int i = 0;
        if (socket != null) {
            try {
                i = NativeUtils.getFileDescriptorForSocket(socket);
                z = true;
            } catch (UnsatisfiedLinkError | UnsupportedOperationException e) {
                Log.w("httpsformpost/getSocketInfo", e);
            }
            return C36441kJ.A0Q(Integer.valueOf(i), Boolean.valueOf(z));
        }
        z = false;
        return C36441kJ.A0Q(Integer.valueOf(i), Boolean.valueOf(z));
    }

    private void A02(Pair pair, C123825x9 r9, OutputStream outputStream, AtomicLong atomicLong) {
        long j = r9.A02;
        long j2 = j;
        while (j > 0) {
            j -= r9.A03.skip(j);
        }
        byte[] bArr = new byte[16384];
        do {
            int read = r9.A03.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
                j2 += (long) read;
                int A042 = C36381kD.A04(pair);
                int i = 0;
                if (AnonymousClass000.A1X(pair.second)) {
                    try {
                        i = NativeUtils.getBytesInSocketOutputQueue(A042);
                    } catch (UnsupportedOperationException unused) {
                    }
                }
                long j3 = j2 - ((long) i);
                C160437l0 r4 = this.A06;
                if (r4 != null) {
                    r4.BVA(j3);
                }
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
            } else {
                atomicLong.set(j2);
                return;
            }
        } while (!this.A0G.getAndSet(false));
        throw new AnonymousClass5R3();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02f7, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("failure during latePostParam call; name=");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x030e, code lost:
        throw new java.io.IOException(X.AnonymousClass000.A0q((java.lang.String) r15.first, r1), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03a6, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:48:0x014f, B:117:0x02e7] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x038f A[LOOP:4: B:152:0x0389->B:154:0x038f, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A04(X.C1265864p r24) {
        /*
            r23 = this;
            r5 = r23
            r6 = r24
            if (r24 == 0) goto L_0x0013
            java.util.List r2 = r5.A0F
            java.lang.String r1 = r6.A01
            java.lang.String r0 = "auth"
            android.util.Pair r0 = X.C36441kJ.A0Q(r0, r1)
            r2.add(r0)
        L_0x0013:
            java.lang.String r11 = X.C36361kB.A0l()     // Catch:{ all -> 0x03d8 }
            java.lang.String r9 = r5.A09     // Catch:{ all -> 0x03d8 }
            android.net.Uri$Builder r3 = X.C90504aG.A0I(r9)     // Catch:{ all -> 0x03d8 }
            java.util.List r0 = r5.A0F     // Catch:{ all -> 0x03d8 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x03d8 }
        L_0x0023:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x03d8 }
            if (r0 == 0) goto L_0x003b
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x03d8 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x03d8 }
            java.lang.Object r1 = r0.first     // Catch:{ all -> 0x03d8 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x03d8 }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x03d8 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x03d8 }
            r3.appendQueryParameter(r1, r0)     // Catch:{ all -> 0x03d8 }
            goto L_0x0023
        L_0x003b:
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x03d8 }
            java.net.URLConnection r4 = X.C90504aG.A0r(r0)     // Catch:{ all -> 0x03d8 }
            javax.net.ssl.HttpsURLConnection r4 = (javax.net.ssl.HttpsURLConnection) r4     // Catch:{ all -> 0x03d8 }
            boolean r0 = r5.A0J     // Catch:{ IllegalArgumentException -> 0x03cc }
            if (r0 == 0) goto L_0x0055
            r1 = 1
            X.0yd r0 = r5.A07     // Catch:{ IllegalArgumentException -> 0x03cc }
            X.Aco r15 = r0.A01(r1)     // Catch:{ IllegalArgumentException -> 0x03cc }
        L_0x0050:
            boolean r0 = r5.A0K     // Catch:{ IllegalArgumentException -> 0x03cc }
            if (r0 == 0) goto L_0x006c
            goto L_0x005c
        L_0x0055:
            X.0yd r0 = r5.A07     // Catch:{ IllegalArgumentException -> 0x03cc }
            X.8qR r15 = r0.A02()     // Catch:{ IllegalArgumentException -> 0x03cc }
            goto L_0x0050
        L_0x005c:
            if (r24 == 0) goto L_0x006c
            java.lang.String r2 = r6.A06     // Catch:{ IllegalArgumentException -> 0x03cc }
            javax.net.ssl.HostnameVerifier r1 = javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier()     // Catch:{ IllegalArgumentException -> 0x03cc }
            X.77d r0 = new X.77d     // Catch:{ IllegalArgumentException -> 0x03cc }
            r0.<init>(r2, r1)     // Catch:{ IllegalArgumentException -> 0x03cc }
            r4.setHostnameVerifier(r0)     // Catch:{ IllegalArgumentException -> 0x03cc }
        L_0x006c:
            int r8 = r15.BA4()     // Catch:{ IllegalArgumentException -> 0x03cc }
            r0 = r15
            javax.net.ssl.SSLSocketFactory r0 = (javax.net.ssl.SSLSocketFactory) r0     // Catch:{ IllegalArgumentException -> 0x03cc }
            r4.setSSLSocketFactory(r0)     // Catch:{ IllegalArgumentException -> 0x03cc }
            r0 = 15000(0x3a98, float:2.102E-41)
            r4.setConnectTimeout(r0)     // Catch:{ IllegalArgumentException -> 0x03cc }
            r0 = 60000(0xea60, float:8.4078E-41)
            r4.setReadTimeout(r0)     // Catch:{ IllegalArgumentException -> 0x03cc }
            java.lang.String r1 = "User-Agent"
            java.lang.String r0 = r5.A0A     // Catch:{ IllegalArgumentException -> 0x03cc }
            r4.setRequestProperty(r1, r0)     // Catch:{ IllegalArgumentException -> 0x03cc }
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r0 = "identity"
            r4.setRequestProperty(r1, r0)     // Catch:{ IllegalArgumentException -> 0x03cc }
            java.lang.String r1 = r5.A0B     // Catch:{ IllegalArgumentException -> 0x03cc }
            if (r1 == 0) goto L_0x0098
            java.lang.String r0 = "X-FB-Request-Analytics-Tags"
            r4.setRequestProperty(r0, r1)     // Catch:{ IllegalArgumentException -> 0x03cc }
        L_0x0098:
            r7 = 0
            if (r24 == 0) goto L_0x009c
            goto L_0x00ac
        L_0x009c:
            java.lang.String r2 = "Content-Type"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IllegalArgumentException -> 0x03cc }
            java.lang.String r0 = "multipart/form-data; boundary="
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r11, r1)     // Catch:{ IllegalArgumentException -> 0x03cc }
            r4.setRequestProperty(r2, r0)     // Catch:{ IllegalArgumentException -> 0x03cc }
            goto L_0x00f0
        L_0x00ac:
            java.lang.String r1 = "Host"
            java.lang.String r0 = r6.A06     // Catch:{ IllegalArgumentException -> 0x03cc }
            r4.setRequestProperty(r1, r0)     // Catch:{ IllegalArgumentException -> 0x03cc }
            java.util.List r12 = r5.A0C     // Catch:{ IllegalArgumentException -> 0x03cc }
            boolean r0 = r12.isEmpty()     // Catch:{ IllegalArgumentException -> 0x03cc }
            if (r0 != 0) goto L_0x00f0
            java.lang.Object r0 = r12.get(r7)     // Catch:{ IllegalArgumentException -> 0x03cc }
            X.5x9 r0 = (X.C123825x9) r0     // Catch:{ IllegalArgumentException -> 0x03cc }
            long r2 = r0.A01     // Catch:{ IllegalArgumentException -> 0x03cc }
            java.lang.Object r0 = r12.get(r7)     // Catch:{ IllegalArgumentException -> 0x03cc }
            X.5x9 r0 = (X.C123825x9) r0     // Catch:{ IllegalArgumentException -> 0x03cc }
            long r0 = r0.A02     // Catch:{ IllegalArgumentException -> 0x03cc }
            r13 = 0
            int r10 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r10 <= 0) goto L_0x00fc
            java.lang.String r3 = "Content-Range"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ IllegalArgumentException -> 0x03cc }
            java.lang.String r0 = "bytes "
            r2.append(r0)     // Catch:{ IllegalArgumentException -> 0x03cc }
            java.lang.Object r0 = r12.get(r7)     // Catch:{ IllegalArgumentException -> 0x03cc }
            X.5x9 r0 = (X.C123825x9) r0     // Catch:{ IllegalArgumentException -> 0x03cc }
            long r0 = r0.A02     // Catch:{ IllegalArgumentException -> 0x03cc }
            r2.append(r0)     // Catch:{ IllegalArgumentException -> 0x03cc }
            java.lang.String r0 = "-*/*"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r2)     // Catch:{ IllegalArgumentException -> 0x03cc }
            r4.setRequestProperty(r3, r0)     // Catch:{ IllegalArgumentException -> 0x03cc }
        L_0x00f0:
            r0 = 1
            r4.setDoOutput(r0)     // Catch:{ IllegalArgumentException -> 0x03cc }
            r4.setChunkedStreamingMode(r7)     // Catch:{ IllegalArgumentException -> 0x03cc }
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ IllegalArgumentException -> 0x03cc }
            goto L_0x010e
        L_0x00fc:
            boolean r0 = r5.A0I     // Catch:{ IllegalArgumentException -> 0x03cc }
            if (r0 == 0) goto L_0x00f0
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f0
            java.lang.String r1 = "Content-Length"
            java.lang.String r0 = java.lang.Long.toString(r2)     // Catch:{ IllegalArgumentException -> 0x03cc }
            r4.setRequestProperty(r1, r0)     // Catch:{ IllegalArgumentException -> 0x03cc }
            goto L_0x00f0
        L_0x010e:
            r4.connect()     // Catch:{ all -> 0x03b0 }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ IllegalArgumentException -> 0x03cc }
            long r0 = r0 - r12
            r5.A00 = r0     // Catch:{ IllegalArgumentException -> 0x03cc }
            java.net.URL r0 = r4.getURL()     // Catch:{ IllegalArgumentException -> 0x03cc }
            java.lang.String r0 = A01(r0)     // Catch:{ IllegalArgumentException -> 0x03cc }
            r5.A04 = r0     // Catch:{ IllegalArgumentException -> 0x03cc }
            X.7l0 r3 = r5.A06     // Catch:{ IllegalArgumentException -> 0x03cc }
            if (r3 == 0) goto L_0x0129
            r3.BUJ(r9)     // Catch:{ IllegalArgumentException -> 0x03cc }
        L_0x0129:
            int r0 = r15.BA4()     // Catch:{ IllegalArgumentException -> 0x03cc }
            if (r0 != r8) goto L_0x0130
            r7 = 1
        L_0x0130:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)     // Catch:{ IllegalArgumentException -> 0x03cc }
            r5.A02 = r0     // Catch:{ IllegalArgumentException -> 0x03cc }
            X.0ww r0 = r5.A05     // Catch:{ IllegalArgumentException -> 0x03cc }
            r22 = r0
            java.lang.Integer r0 = r5.A08     // Catch:{ IllegalArgumentException -> 0x03cc }
            r21 = r0
            r19 = 0
            r2 = r22
            r1 = r19
            X.5RL r0 = X.C132776Vf.A01(r2, r1, r0, r4)     // Catch:{ IllegalArgumentException -> 0x03cc }
            java.io.BufferedOutputStream r8 = new java.io.BufferedOutputStream     // Catch:{ IllegalArgumentException -> 0x03cc }
            r8.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x03cc }
            if (r24 == 0) goto L_0x018a
            java.util.List r0 = r5.A0C     // Catch:{ all -> 0x03a6 }
            r20 = r0
            int r0 = r20.size()     // Catch:{ all -> 0x03a6 }
            if (r0 == 0) goto L_0x0321
            int r0 = r20.size()     // Catch:{ all -> 0x03a6 }
            r7 = 0
            boolean r6 = X.AnonymousClass000.A1O(r0)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x03a6 }
            java.lang.String r1 = "MMS4 upload only supports a single file; we have been given "
            r0 = r20
            X.C36371kC.A1R(r1, r2, r0)     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x03a6 }
            X.C18740tg.A0D(r6, r0)     // Catch:{ all -> 0x03a6 }
            r0 = r20
            java.lang.Object r2 = r0.get(r7)     // Catch:{ all -> 0x03a6 }
            X.5x9 r2 = (X.C123825x9) r2     // Catch:{ all -> 0x03a6 }
            java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x03a6 }
            r1.<init>()     // Catch:{ all -> 0x03a6 }
            android.util.Pair r0 = r5.A00()     // Catch:{ all -> 0x03a6 }
            r5.A02(r0, r2, r8, r1)     // Catch:{ all -> 0x03a6 }
            goto L_0x0321
        L_0x018a:
            android.util.Pair r17 = r5.A00()     // Catch:{ all -> 0x03a6 }
            r0 = 2
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x03a6 }
            r10 = {13, 10} // fill-array     // Catch:{ all -> 0x03a6 }
            java.util.List r0 = r5.A0C     // Catch:{ all -> 0x03a6 }
            r20 = r0
            java.util.Iterator r16 = r20.iterator()     // Catch:{ all -> 0x03a6 }
            r18 = 0
        L_0x019e:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x03a6 }
            java.lang.String r14 = "\r\n"
            java.lang.String r13 = "Content-Disposition: form-data; name=\""
            java.lang.String r12 = "\\\""
            java.lang.String r9 = "\""
            java.lang.String r7 = "\\\\"
            java.lang.String r6 = "\\"
            java.lang.String r2 = "--"
            if (r0 == 0) goto L_0x0275
            java.lang.Object r15 = r16.next()     // Catch:{ all -> 0x03a6 }
            X.5x9 r15 = (X.C123825x9) r15     // Catch:{ all -> 0x03a6 }
            if (r18 == 0) goto L_0x01bd
            r8.write(r10)     // Catch:{ all -> 0x03a6 }
        L_0x01bd:
            java.lang.String r0 = X.C90464aC.A0e(r2, r11, r14)     // Catch:{ all -> 0x03a6 }
            X.C90474aD.A1I(r0, r8)     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = r15.A05     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = r0.replace(r6, r7)     // Catch:{ all -> 0x03a6 }
            java.lang.String r1 = r0.replace(r9, r12)     // Catch:{ all -> 0x03a6 }
            java.lang.String r2 = r15.A04     // Catch:{ all -> 0x03a6 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x03a6 }
            java.lang.String r14 = "\"\r\n"
            if (r0 != 0) goto L_0x026f
            java.lang.String r0 = r2.replace(r6, r7)     // Catch:{ all -> 0x03a6 }
            java.lang.String r2 = r0.replace(r9, r12)     // Catch:{ all -> 0x03a6 }
            java.lang.StringBuilder r1 = X.C36331k8.A0k(r13, r1)     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = "\"; filename=\""
            X.AnonymousClass000.A1D(r0, r2, r14, r1)     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x03a6 }
        L_0x01ed:
            X.C90474aD.A1I(r0, r8)     // Catch:{ all -> 0x03a6 }
            int r1 = r15.A00     // Catch:{ all -> 0x03a6 }
            if (r1 != 0) goto L_0x022c
            java.lang.String r0 = "Content-Type: application/x-gzip\r\n"
            X.C90474aD.A1I(r0, r8)     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = "Content-Encoding: gzip\r\n"
        L_0x01fb:
            X.C90474aD.A1I(r0, r8)     // Catch:{ all -> 0x03a6 }
            long r0 = r15.A02     // Catch:{ all -> 0x03a6 }
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x021b
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x03a6 }
            java.lang.String r2 = "Content-Range: bytes "
            r6.append(r2)     // Catch:{ all -> 0x03a6 }
            r6.append(r0)     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = "-*/*\r\n"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r6)     // Catch:{ all -> 0x03a6 }
            X.C90474aD.A1I(r0, r8)     // Catch:{ all -> 0x03a6 }
        L_0x021b:
            r8.write(r10)     // Catch:{ all -> 0x03a6 }
            java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x03a6 }
            r1.<init>()     // Catch:{ all -> 0x03a6 }
            r0 = r17
            r5.A02(r0, r15, r8, r1)     // Catch:{ all -> 0x03a6 }
            r18 = 1
            goto L_0x019e
        L_0x022c:
            r0 = 1
            if (r1 != r0) goto L_0x0232
            java.lang.String r0 = "Content-Type: application/zip\r\n"
            goto L_0x01fb
        L_0x0232:
            r0 = 3
            if (r1 != r0) goto L_0x0238
            java.lang.String r0 = "Content-Type: image/jpeg\r\n"
            goto L_0x01fb
        L_0x0238:
            r0 = 6
            if (r1 != r0) goto L_0x023e
            java.lang.String r0 = "Content-Type: image/png\r\n"
            goto L_0x01fb
        L_0x023e:
            r0 = 7
            if (r1 != r0) goto L_0x0244
            java.lang.String r0 = "Content-Type: image/tiff\r\n"
            goto L_0x01fb
        L_0x0244:
            r0 = 4
            if (r1 != r0) goto L_0x024a
            java.lang.String r0 = "Content-Type: image/gif\r\n"
            goto L_0x01fb
        L_0x024a:
            r0 = 5
            if (r1 != r0) goto L_0x0250
            java.lang.String r0 = "Content-Type: image/bmp\r\n"
            goto L_0x01fb
        L_0x0250:
            r0 = 8
            if (r1 != r0) goto L_0x0257
            java.lang.String r0 = "Content-Type: image/webp\r\n"
            goto L_0x01fb
        L_0x0257:
            r0 = 9
            if (r1 != r0) goto L_0x025e
            java.lang.String r0 = "Content-Type: image/heic\r\n"
            goto L_0x01fb
        L_0x025e:
            r0 = 10
            if (r1 != r0) goto L_0x0265
            java.lang.String r0 = "Content-Type: application/pdf\r\n"
            goto L_0x01fb
        L_0x0265:
            r0 = 11
            if (r1 != r0) goto L_0x026c
            java.lang.String r0 = "Content-Type: video/mp4\r\n"
            goto L_0x01fb
        L_0x026c:
            java.lang.String r0 = "Content-Type: application/octet-stream\r\n"
            goto L_0x01fb
        L_0x026f:
            java.lang.String r0 = X.C90464aC.A0e(r13, r1, r14)     // Catch:{ all -> 0x03a6 }
            goto L_0x01ed
        L_0x0275:
            java.util.List r0 = r5.A0E     // Catch:{ all -> 0x03a6 }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x03a6 }
        L_0x027b:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x03a6 }
            java.lang.String r17 = "\"\r\n\r\n"
            if (r0 == 0) goto L_0x02b4
            java.lang.Object r15 = r16.next()     // Catch:{ all -> 0x03a6 }
            android.util.Pair r15 = (android.util.Pair) r15     // Catch:{ all -> 0x03a6 }
            java.lang.Object r0 = r15.first     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = r0.replace(r6, r7)     // Catch:{ all -> 0x03a6 }
            java.lang.String r1 = r0.replace(r9, r12)     // Catch:{ all -> 0x03a6 }
            if (r18 == 0) goto L_0x029a
            r8.write(r10)     // Catch:{ all -> 0x03a6 }
        L_0x029a:
            java.lang.String r0 = X.C90464aC.A0e(r2, r11, r14)     // Catch:{ all -> 0x03a6 }
            X.C90474aD.A1I(r0, r8)     // Catch:{ all -> 0x03a6 }
            r0 = r17
            java.lang.String r0 = X.C90464aC.A0e(r13, r1, r0)     // Catch:{ all -> 0x03a6 }
            X.C90474aD.A1I(r0, r8)     // Catch:{ all -> 0x03a6 }
            java.lang.Object r0 = r15.second     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x03a6 }
            X.C90474aD.A1I(r0, r8)     // Catch:{ all -> 0x03a6 }
            r18 = 1
            goto L_0x027b
        L_0x02b4:
            java.util.List r0 = r5.A0D     // Catch:{ all -> 0x03a6 }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x03a6 }
        L_0x02ba:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x03a6 }
            if (r0 == 0) goto L_0x030f
            java.lang.Object r15 = r16.next()     // Catch:{ all -> 0x03a6 }
            android.util.Pair r15 = (android.util.Pair) r15     // Catch:{ all -> 0x03a6 }
            java.lang.Object r0 = r15.first     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = r0.replace(r6, r7)     // Catch:{ all -> 0x03a6 }
            java.lang.String r1 = r0.replace(r9, r12)     // Catch:{ all -> 0x03a6 }
            if (r18 == 0) goto L_0x02d7
            r8.write(r10)     // Catch:{ all -> 0x03a6 }
        L_0x02d7:
            java.lang.String r0 = X.C90464aC.A0e(r2, r11, r14)     // Catch:{ all -> 0x03a6 }
            X.C90474aD.A1I(r0, r8)     // Catch:{ all -> 0x03a6 }
            r0 = r17
            java.lang.String r0 = X.C90464aC.A0e(r13, r1, r0)     // Catch:{ all -> 0x03a6 }
            X.C90474aD.A1I(r0, r8)     // Catch:{ all -> 0x03a6 }
            java.lang.Object r0 = r15.second     // Catch:{ Exception -> 0x02f7 }
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0     // Catch:{ Exception -> 0x02f7 }
            java.lang.Object r0 = r0.call()     // Catch:{ Exception -> 0x02f7 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x02f7 }
            X.C90474aD.A1I(r0, r8)     // Catch:{ Exception -> 0x02f7 }
            r18 = 1
            goto L_0x02ba
        L_0x02f7:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = "failure during latePostParam call; name="
            r1.append(r0)     // Catch:{ all -> 0x03a6 }
            java.lang.Object r0 = r15.first     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x03a6 }
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x03a6 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x03a6 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x03a6 }
            throw r0     // Catch:{ all -> 0x03a6 }
        L_0x030f:
            if (r18 == 0) goto L_0x0314
            r8.write(r10)     // Catch:{ all -> 0x03a6 }
        L_0x0314:
            java.lang.StringBuilder r1 = X.C36331k8.A0k(r2, r11)     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = "--\r\n"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x03a6 }
            X.C90474aD.A1I(r0, r8)     // Catch:{ all -> 0x03a6 }
        L_0x0321:
            r8.close()     // Catch:{ IllegalArgumentException -> 0x03cc }
            long r7 = android.os.SystemClock.uptimeMillis()     // Catch:{ IllegalArgumentException -> 0x03cc }
            int r6 = r4.getResponseCode()     // Catch:{ all -> 0x03c3 }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ IllegalArgumentException -> 0x03cc }
            long r0 = r0 - r7
            r5.A01 = r0     // Catch:{ IllegalArgumentException -> 0x03cc }
            java.lang.String r0 = "x-fb-application-protocol"
            java.lang.String r0 = r4.getHeaderField(r0)     // Catch:{ IllegalArgumentException -> 0x03cc }
            r5.A03 = r0     // Catch:{ IllegalArgumentException -> 0x03cc }
            r0 = 400(0x190, float:5.6E-43)
            if (r6 < r0) goto L_0x0363
            java.io.InputStream r0 = r4.getErrorStream()     // Catch:{ IllegalArgumentException -> 0x03cc }
            if (r0 == 0) goto L_0x0382
            java.io.InputStream r8 = r4.getErrorStream()     // Catch:{ IllegalArgumentException -> 0x03cc }
            X.5RE r7 = new X.5RE     // Catch:{ IllegalArgumentException -> 0x03cc }
            r2 = r22
            r1 = r19
            r0 = r21
            r7.<init>(r2, r8, r1, r0)     // Catch:{ IllegalArgumentException -> 0x03cc }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IllegalArgumentException -> 0x03cc }
            r2.<init>(r7)     // Catch:{ IllegalArgumentException -> 0x03cc }
            java.lang.String r0 = X.AnonymousClass14X.A00(r2)     // Catch:{ all -> 0x039c }
            if (r3 == 0) goto L_0x037f
            r3.BWo(r0)     // Catch:{ all -> 0x039c }
            goto L_0x037f
        L_0x0363:
            r2 = r22
            r1 = r19
            r0 = r21
            X.5RE r0 = X.C132776Vf.A00(r2, r1, r0, r4)     // Catch:{ IllegalArgumentException -> 0x03cc }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IllegalArgumentException -> 0x03cc }
            r2.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x03cc }
            java.lang.String r1 = X.AnonymousClass14X.A00(r2)     // Catch:{ all -> 0x039c }
            if (r3 == 0) goto L_0x037f
            java.util.Map r0 = r4.getHeaderFields()     // Catch:{ all -> 0x039c }
            r3.Bez(r1, r0)     // Catch:{ all -> 0x039c }
        L_0x037f:
            r2.close()     // Catch:{ IllegalArgumentException -> 0x03cc }
        L_0x0382:
            r4.disconnect()     // Catch:{ all -> 0x03d8 }
            java.util.Iterator r1 = r20.iterator()
        L_0x0389:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x039b
            java.lang.Object r0 = r1.next()
            X.5x9 r0 = (X.C123825x9) r0
            java.io.InputStream r0 = r0.A03
            X.AnonymousClass14X.A02(r0)
            goto L_0x0389
        L_0x039b:
            return r6
        L_0x039c:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x03a1 }
            goto L_0x03a5
        L_0x03a1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalArgumentException -> 0x03cc }
        L_0x03a5:
            throw r1     // Catch:{ IllegalArgumentException -> 0x03cc }
        L_0x03a6:
            r2 = move-exception
            r8.close()     // Catch:{ all -> 0x03ab }
            goto L_0x03cb
        L_0x03ab:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ IllegalArgumentException -> 0x03cc }
            goto L_0x03cb
        L_0x03b0:
            r2 = move-exception
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ IllegalArgumentException -> 0x03cc }
            long r0 = r0 - r12
            r5.A00 = r0     // Catch:{ IllegalArgumentException -> 0x03cc }
            java.net.URL r0 = r4.getURL()     // Catch:{ IllegalArgumentException -> 0x03cc }
            java.lang.String r0 = A01(r0)     // Catch:{ IllegalArgumentException -> 0x03cc }
            r5.A04 = r0     // Catch:{ IllegalArgumentException -> 0x03cc }
            goto L_0x03cb
        L_0x03c3:
            r2 = move-exception
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ IllegalArgumentException -> 0x03cc }
            long r0 = r0 - r7
            r5.A01 = r0     // Catch:{ IllegalArgumentException -> 0x03cc }
        L_0x03cb:
            throw r2     // Catch:{ IllegalArgumentException -> 0x03cc }
        L_0x03cc:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x03d3 }
            r0.<init>(r1)     // Catch:{ all -> 0x03d3 }
            throw r0     // Catch:{ all -> 0x03d3 }
        L_0x03d3:
            r0 = move-exception
            r4.disconnect()     // Catch:{ all -> 0x03d8 }
            throw r0     // Catch:{ all -> 0x03d8 }
        L_0x03d8:
            r2 = move-exception
            java.util.List r0 = r5.A0C
            java.util.Iterator r1 = r0.iterator()
        L_0x03df:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03f1
            java.lang.Object r0 = r1.next()
            X.5x9 r0 = (X.C123825x9) r0
            java.io.InputStream r0 = r0.A03
            X.AnonymousClass14X.A02(r0)
            goto L_0x03df
        L_0x03f1:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VO.A04(X.64p):int");
    }

    public void A05(InputStream inputStream, String str, String str2, long j, long j2) {
        this.A0C.add(new C123825x9(inputStream, str, str2, 2, j, j2));
    }

    public void A06(String str, String str2) {
        this.A0E.add(Pair.create(str, str2));
    }

    public void A07(String str, String str2) {
        this.A0F.add(Pair.create(str, str2));
    }

    public AnonymousClass6VO(C20050ww r2, C160437l0 r3, C21080yd r4, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3) {
        this.A07 = r4;
        this.A09 = str;
        this.A0A = str2;
        this.A06 = r3;
        this.A0J = z;
        this.A0K = z2;
        this.A05 = r2;
        this.A08 = Integer.valueOf(i);
        this.A0I = z3;
        this.A0B = str3;
    }

    public static void A03(AnonymousClass6VO r8, File file, InputStream inputStream, String str) {
        r8.A05(inputStream, str, file.getName(), 0, file.length());
    }
}
