package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: X.83J  reason: invalid class name */
public class AnonymousClass83J extends A0K implements B5V {
    public static final AtomicReference A0E = new AtomicReference();
    public static final Pattern A0F = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public InputStream A04;
    public HttpURLConnection A05;
    public int A06;
    public C202189lD A07;
    public boolean A08;
    public final int A09;
    public final int A0A;
    public final AnonymousClass9GM A0B;
    public final AnonymousClass9GM A0C;
    public final String A0D;

    public AnonymousClass83J(AnonymousClass9GM r2, B2E b2e, String str, int i, int i2) {
        super(true);
        if (!TextUtils.isEmpty(str)) {
            this.A0D = str;
            this.A0C = new AnonymousClass9GM();
            this.A09 = i;
            this.A0A = i2;
            this.A0B = r2;
            if (b2e != null) {
                B0p(b2e);
                return;
            }
            return;
        }
        throw C165617ti.A0U();
    }

    public void close() {
        try {
            InputStream inputStream = this.A04;
            if (inputStream != null) {
                inputStream.close();
            }
            this.A04 = null;
            A00();
            if (this.A08) {
                this.A08 = false;
                A01();
            }
        } catch (IOException e) {
            throw new AnonymousClass83L(this.A07, e, 3);
        } catch (Throwable th) {
            this.A04 = null;
            A00();
            if (this.A08) {
                this.A08 = false;
                A01();
            }
            throw th;
        }
    }

    private void A00() {
        HttpURLConnection httpURLConnection = this.A05;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.A05 = null;
        }
    }

    public Map BGn() {
        HttpURLConnection httpURLConnection = this.A05;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public Uri BIj() {
        HttpURLConnection httpURLConnection = this.A05;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long Bks(X.C202189lD r20) {
        /*
            r19 = this;
            java.lang.String r11 = "Unable to connect to "
            r10 = r19
            r4 = r20
            r10.A07 = r4
            r8 = 0
            r10.A00 = r8
            r10.A01 = r8
            r10.A02()
            X.9em r0 = r4.A05
            java.util.Map r0 = r0.A0N
            java.util.Iterator r5 = X.AnonymousClass000.A0y(r0)
        L_0x0019:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0041
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r5)
            java.lang.Object r3 = r0.getKey()
            java.lang.Object r2 = r0.getValue()
            java.util.Objects.requireNonNull(r3)
            java.util.Objects.requireNonNull(r2)
            X.9GM r1 = r10.A0C
            monitor-enter(r1)
            r0 = 0
            r1.A00 = r0     // Catch:{ all -> 0x003e }
            java.util.Map r0 = r1.A01     // Catch:{ all -> 0x003e }
            r0.put(r3, r2)     // Catch:{ all -> 0x003e }
            monitor-exit(r1)
            goto L_0x0019
        L_0x003e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0041:
            r7 = 1
            android.net.Uri r13 = r4.A04     // Catch:{ IOException -> 0x027f }
            java.lang.String r0 = r13.toString()     // Catch:{ IOException -> 0x027f }
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x027f }
            r1.<init>(r0)     // Catch:{ IOException -> 0x027f }
            byte[] r14 = r4.A08     // Catch:{ IOException -> 0x027f }
            long r2 = r4.A03     // Catch:{ IOException -> 0x027f }
            long r5 = r4.A02     // Catch:{ IOException -> 0x027f }
            r18 = 1
            int r0 = r4.A00     // Catch:{ IOException -> 0x027f }
            r12 = r0 & 1
            if (r12 == r7) goto L_0x005d
            r18 = 0
        L_0x005d:
            java.lang.String r0 = r1.getHost()     // Catch:{ IOException -> 0x027f }
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)     // Catch:{ IOException -> 0x027f }
            boolean r0 = r0.isLoopbackAddress()     // Catch:{ IOException -> 0x027f }
            if (r0 == 0) goto L_0x0087
            java.net.Proxy r0 = java.net.Proxy.NO_PROXY     // Catch:{ IOException -> 0x027f }
            java.net.URLConnection r1 = r1.openConnection(r0)     // Catch:{ IOException -> 0x027f }
        L_0x0071:
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ IOException -> 0x027f }
            r10.A05 = r1     // Catch:{ IOException -> 0x027f }
            int r0 = r10.A09     // Catch:{ IOException -> 0x027f }
            r1.setConnectTimeout(r0)     // Catch:{ IOException -> 0x027f }
            java.net.HttpURLConnection r1 = r10.A05     // Catch:{ IOException -> 0x027f }
            int r0 = r10.A0A     // Catch:{ IOException -> 0x027f }
            r1.setReadTimeout(r0)     // Catch:{ IOException -> 0x027f }
            X.9GM r1 = r10.A0B     // Catch:{ IOException -> 0x027f }
            if (r1 == 0) goto L_0x00ba
            monitor-enter(r1)     // Catch:{ IOException -> 0x027f }
            goto L_0x008c
        L_0x0087:
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ IOException -> 0x027f }
            goto L_0x0071
        L_0x008c:
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x027c }
            if (r0 != 0) goto L_0x009d
            java.util.Map r15 = r1.A01     // Catch:{ all -> 0x027c }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x027c }
            r0.<init>(r15)     // Catch:{ all -> 0x027c }
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ all -> 0x027c }
            r1.A00 = r0     // Catch:{ all -> 0x027c }
        L_0x009d:
            monitor-exit(r1)     // Catch:{ IOException -> 0x027f }
            java.util.Iterator r16 = X.AnonymousClass000.A0y(r0)     // Catch:{ IOException -> 0x027f }
        L_0x00a2:
            boolean r0 = r16.hasNext()     // Catch:{ IOException -> 0x027f }
            if (r0 == 0) goto L_0x00ba
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r16)     // Catch:{ IOException -> 0x027f }
            java.net.HttpURLConnection r15 = r10.A05     // Catch:{ IOException -> 0x027f }
            java.lang.String r1 = X.C90494aF.A0f(r0)     // Catch:{ IOException -> 0x027f }
            java.lang.String r0 = X.C90514aH.A10(r0)     // Catch:{ IOException -> 0x027f }
            r15.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x027f }
            goto L_0x00a2
        L_0x00ba:
            X.9GM r1 = r10.A0C     // Catch:{ IOException -> 0x027f }
            monitor-enter(r1)     // Catch:{ IOException -> 0x027f }
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x027c }
            if (r0 != 0) goto L_0x00ce
            java.util.Map r15 = r1.A01     // Catch:{ all -> 0x027c }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x027c }
            r0.<init>(r15)     // Catch:{ all -> 0x027c }
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ all -> 0x027c }
            r1.A00 = r0     // Catch:{ all -> 0x027c }
        L_0x00ce:
            monitor-exit(r1)     // Catch:{ IOException -> 0x027f }
            java.util.Iterator r16 = X.AnonymousClass000.A0y(r0)     // Catch:{ IOException -> 0x027f }
        L_0x00d3:
            boolean r0 = r16.hasNext()     // Catch:{ IOException -> 0x027f }
            if (r0 == 0) goto L_0x00eb
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r16)     // Catch:{ IOException -> 0x027f }
            java.net.HttpURLConnection r15 = r10.A05     // Catch:{ IOException -> 0x027f }
            java.lang.String r1 = X.C90494aF.A0f(r0)     // Catch:{ IOException -> 0x027f }
            java.lang.String r0 = X.C90514aH.A10(r0)     // Catch:{ IOException -> 0x027f }
            r15.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x027f }
            goto L_0x00d3
        L_0x00eb:
            r16 = -1
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x00f5
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0120
        L_0x00f5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x027f }
            java.lang.String r0 = "bytes="
            r1.append(r0)     // Catch:{ IOException -> 0x027f }
            r1.append(r2)     // Catch:{ IOException -> 0x027f }
            java.lang.String r0 = "-"
            java.lang.String r15 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ IOException -> 0x027f }
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0119
            java.lang.StringBuilder r15 = X.AnonymousClass000.A0v(r15)     // Catch:{ IOException -> 0x027f }
            long r0 = r2 + r5
            r16 = 1
            long r0 = r0 - r16
            java.lang.String r15 = X.C36411kG.A11(r15, r0)     // Catch:{ IOException -> 0x027f }
        L_0x0119:
            java.net.HttpURLConnection r1 = r10.A05     // Catch:{ IOException -> 0x027f }
            java.lang.String r0 = "Range"
            r1.setRequestProperty(r0, r15)     // Catch:{ IOException -> 0x027f }
        L_0x0120:
            java.net.HttpURLConnection r15 = r10.A05     // Catch:{ IOException -> 0x027f }
            java.lang.String r1 = r10.A0D     // Catch:{ IOException -> 0x027f }
            java.lang.String r0 = "User-Agent"
            r15.setRequestProperty(r0, r1)     // Catch:{ IOException -> 0x027f }
            if (r18 != 0) goto L_0x0134
            java.net.HttpURLConnection r15 = r10.A05     // Catch:{ IOException -> 0x027f }
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r0 = "identity"
            r15.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x027f }
        L_0x0134:
            java.net.HttpURLConnection r0 = r10.A05     // Catch:{ IOException -> 0x027f }
            r0.setInstanceFollowRedirects(r7)     // Catch:{ IOException -> 0x027f }
            java.net.HttpURLConnection r1 = r10.A05     // Catch:{ IOException -> 0x027f }
            boolean r0 = X.AnonymousClass000.A1V(r14)
            r1.setDoOutput(r0)     // Catch:{ IOException -> 0x027f }
            if (r14 == 0) goto L_0x0165
            java.net.HttpURLConnection r1 = r10.A05     // Catch:{ IOException -> 0x027f }
            java.lang.String r0 = "POST"
            r1.setRequestMethod(r0)     // Catch:{ IOException -> 0x027f }
            int r1 = r14.length     // Catch:{ IOException -> 0x027f }
            if (r1 == 0) goto L_0x0165
            java.net.HttpURLConnection r0 = r10.A05     // Catch:{ IOException -> 0x027f }
            r0.setFixedLengthStreamingMode(r1)     // Catch:{ IOException -> 0x027f }
            java.net.HttpURLConnection r0 = r10.A05     // Catch:{ IOException -> 0x027f }
            r0.connect()     // Catch:{ IOException -> 0x027f }
            java.net.HttpURLConnection r0 = r10.A05     // Catch:{ IOException -> 0x027f }
            java.io.OutputStream r0 = r0.getOutputStream()     // Catch:{ IOException -> 0x027f }
            r0.write(r14)     // Catch:{ IOException -> 0x027f }
            r0.close()     // Catch:{ IOException -> 0x027f }
            goto L_0x016a
        L_0x0165:
            java.net.HttpURLConnection r0 = r10.A05     // Catch:{ IOException -> 0x027f }
            r0.connect()     // Catch:{ IOException -> 0x027f }
        L_0x016a:
            java.net.HttpURLConnection r0 = r10.A05     // Catch:{ IOException -> 0x027f }
            r10.A05 = r0     // Catch:{ IOException -> 0x027f }
            int r14 = r0.getResponseCode()     // Catch:{ IOException -> 0x0265 }
            r10.A06 = r14     // Catch:{ IOException -> 0x0265 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r14 < r1) goto L_0x0246
            r0 = 299(0x12b, float:4.19E-43)
            if (r14 > r0) goto L_0x0246
            java.net.HttpURLConnection r0 = r10.A05
            r0.getContentType()
            int r0 = r10.A06
            if (r0 != r1) goto L_0x018a
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x018a
            r8 = r2
        L_0x018a:
            r10.A03 = r8
            if (r12 == r7) goto L_0x022a
            java.net.HttpURLConnection r8 = r10.A05
            java.lang.String r0 = "Content-Length"
            java.lang.String r14 = r8.getHeaderField(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            java.lang.String r12 = "]"
            java.lang.String r11 = "DefaultHttpDataSource"
            if (r0 != 0) goto L_0x01b5
            long r2 = java.lang.Long.parseLong(r14)     // Catch:{ NumberFormatException -> 0x01a5 }
            goto L_0x01b7
        L_0x01a5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unexpected Content-Length ["
            X.AnonymousClass000.A1D(r0, r14, r12, r1)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r11, r0)
        L_0x01b5:
            r2 = -1
        L_0x01b7:
            java.lang.String r0 = "Content-Range"
            java.lang.String r9 = r8.getHeaderField(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0219
            java.util.regex.Pattern r0 = A0F
            java.util.regex.Matcher r8 = r0.matcher(r9)
            boolean r0 = r8.find()
            if (r0 == 0) goto L_0x0219
            r0 = 2
            java.lang.String r0 = r8.group(r0)     // Catch:{ NumberFormatException -> 0x0209 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0209 }
            java.lang.String r8 = r8.group(r7)     // Catch:{ NumberFormatException -> 0x0209 }
            long r15 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x0209 }
            long r0 = r0 - r15
            r15 = 1
            long r0 = r0 + r15
            r15 = 0
            int r8 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r8 >= 0) goto L_0x01ec
            r2 = r0
            goto L_0x0219
        L_0x01ec:
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x0219
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0u()     // Catch:{ NumberFormatException -> 0x0209 }
            java.lang.String r8 = "Inconsistent headers ["
            r13.append(r8)     // Catch:{ NumberFormatException -> 0x0209 }
            r13.append(r14)     // Catch:{ NumberFormatException -> 0x0209 }
            java.lang.String r8 = "] ["
            X.AnonymousClass000.A1D(r8, r9, r12, r13)     // Catch:{ NumberFormatException -> 0x0209 }
            X.AnonymousClass000.A1A(r13, r11)     // Catch:{ NumberFormatException -> 0x0209 }
            long r2 = java.lang.Math.max(r2, r0)     // Catch:{ NumberFormatException -> 0x0209 }
            goto L_0x0219
        L_0x0209:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unexpected Content-Range ["
            X.AnonymousClass000.A1D(r0, r9, r12, r1)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r11, r0)
        L_0x0219:
            r0 = -1
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            int r8 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x022a
            if (r9 == 0) goto L_0x0227
            long r5 = r10.A03
            long r0 = r2 - r5
        L_0x0227:
            r10.A02 = r0
            goto L_0x022c
        L_0x022a:
            r10.A02 = r5
        L_0x022c:
            java.net.HttpURLConnection r0 = r10.A05     // Catch:{ IOException -> 0x023c }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x023c }
            r10.A04 = r0     // Catch:{ IOException -> 0x023c }
            r10.A08 = r7
            r10.A04(r4)
            long r0 = r10.A02
            return r0
        L_0x023c:
            r1 = move-exception
            r10.A00()
            X.83L r0 = new X.83L
            r0.<init>((X.C202189lD) r4, (java.io.IOException) r1, (int) r7)
            throw r0
        L_0x0246:
            java.net.HttpURLConnection r0 = r10.A05
            java.util.Map r1 = r0.getHeaderFields()
            r10.A00()
            int r0 = r10.A06
            X.83K r2 = new X.83K
            r2.<init>(r4, r1, r0)
            int r1 = r10.A06
            r0 = 416(0x1a0, float:5.83E-43)
            if (r1 != r0) goto L_0x0264
            X.8xm r0 = new X.8xm
            r0.<init>()
            r2.initCause(r0)
        L_0x0264:
            throw r2
        L_0x0265:
            r3 = move-exception
            r10.A00()
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            X.C165567td.A1M(r13, r11, r0)
            java.lang.String r2 = r0.toString()
            r1 = 2000(0x7d0, float:2.803E-42)
            X.83L r0 = new X.83L
            r0.<init>(r4, r3, r2, r1)
            throw r0
        L_0x027c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x027f }
            throw r0     // Catch:{ IOException -> 0x027f }
        L_0x027f:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r11)
            android.net.Uri r0 = r4.A04
            X.C36351kA.A1K(r0, r1)
            java.lang.String r2 = r1.toString()
            r1 = 2000(0x7d0, float:2.803E-42)
            X.83L r0 = new X.83L
            r0.<init>(r4, r3, r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass83J.Bks(X.9lD):long");
    }

    public int read(byte[] bArr, int i, int i2) {
        Throwable th;
        try {
            if (this.A01 != this.A03) {
                AtomicReference atomicReference = A0E;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet((Object) null);
                if (bArr2 == null) {
                    bArr2 = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
                }
                while (true) {
                    long j = this.A01;
                    long j2 = this.A03;
                    if (j == j2) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int read = this.A04.read(bArr2, 0, (int) Math.min(j2 - j, (long) bArr2.length));
                    if (!Thread.currentThread().isInterrupted()) {
                        if (read == -1) {
                            th = C165617ti.A0T();
                            break;
                        }
                        this.A01 += (long) read;
                        A03(read);
                    } else {
                        th = new InterruptedIOException();
                        break;
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.A02;
            if (j3 != -1) {
                long j4 = j3 - this.A00;
                if (j4 == 0) {
                    return -1;
                }
                i2 = (int) Math.min((long) i2, j4);
            }
            int read2 = this.A04.read(bArr, i, i2);
            if (read2 != -1) {
                this.A00 += (long) read2;
                A03(read2);
                return read2;
            } else if (this.A02 == -1) {
                return -1;
            } else {
                th = C165617ti.A0T();
                throw th;
            }
        } catch (IOException e) {
            throw new AnonymousClass83L(this.A07, e, 2);
        }
    }
}
