package X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.83H  reason: invalid class name */
public final class AnonymousClass83H extends A0K implements B39 {
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public InputStream A03;
    public boolean A04;
    public final Resources A05;

    public AnonymousClass83H(Context context) {
        super(false);
        this.A05 = context.getResources();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        if (r4.A04 == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x004d, code lost:
        if (r4.A04 == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0054, code lost:
        if (r4.A04 == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0056, code lost:
        r4.A04 = false;
        A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x005b, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r4 = this;
            r3 = 0
            r4.A02 = r3
            r2 = 0
            java.io.InputStream r0 = r4.A03     // Catch:{ IOException -> 0x002f }
            if (r0 == 0) goto L_0x000b
            r0.close()     // Catch:{ IOException -> 0x002f }
        L_0x000b:
            r4.A03 = r3
            android.content.res.AssetFileDescriptor r0 = r4.A01     // Catch:{ IOException -> 0x0020 }
            if (r0 == 0) goto L_0x0014
            r0.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0014:
            r4.A01 = r3
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x001f
            r4.A04 = r2
            r4.A01()
        L_0x001f:
            return
        L_0x0020:
            r1 = move-exception
            X.8xf r0 = new X.8xf     // Catch:{ all -> 0x0027 }
            r0.<init>((java.io.IOException) r1)     // Catch:{ all -> 0x0027 }
            throw r0     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r1 = move-exception
            r4.A01 = r3
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x005b
            goto L_0x0056
        L_0x002f:
            r1 = move-exception
            X.8xf r0 = new X.8xf     // Catch:{ all -> 0x0036 }
            r0.<init>((java.io.IOException) r1)     // Catch:{ all -> 0x0036 }
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r1 = move-exception
            r4.A03 = r3
            android.content.res.AssetFileDescriptor r0 = r4.A01     // Catch:{ IOException -> 0x0041 }
            if (r0 == 0) goto L_0x0050
            r0.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0050
        L_0x0041:
            r1 = move-exception
            X.8xf r0 = new X.8xf     // Catch:{ all -> 0x0048 }
            r0.<init>((java.io.IOException) r1)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r1 = move-exception
            r4.A01 = r3
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x005b
            goto L_0x0056
        L_0x0050:
            r4.A01 = r3
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x005b
        L_0x0056:
            r4.A04 = r2
            r4.A01()
        L_0x005b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass83H.close():void");
    }

    public long Bks(C202189lD r8) {
        Throwable th;
        try {
            Uri uri = r8.A04;
            this.A02 = uri;
            if (TextUtils.equals("rawresource", uri.getScheme())) {
                try {
                    int parseInt = Integer.parseInt(this.A02.getLastPathSegment());
                    A02();
                    AssetFileDescriptor openRawResourceFd = this.A05.openRawResourceFd(parseInt);
                    this.A01 = openRawResourceFd;
                    FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                    this.A03 = fileInputStream;
                    fileInputStream.skip(this.A01.getStartOffset());
                    InputStream inputStream = this.A03;
                    long j = r8.A03;
                    if (inputStream.skip(j) >= j) {
                        long j2 = r8.A02;
                        long j3 = -1;
                        if (j2 != -1) {
                            this.A00 = j2;
                        } else {
                            long length = this.A01.getLength();
                            if (length != -1) {
                                j3 = length - j;
                            }
                            this.A00 = j3;
                        }
                        this.A04 = true;
                        A04(r8);
                        return this.A00;
                    }
                    th = C165617ti.A0T();
                } catch (NumberFormatException unused) {
                    th = new C187328xf("Resource identifier must be an integer.");
                }
            } else {
                th = new C187328xf("URI must use scheme rawresource");
            }
            throw th;
        } catch (IOException e) {
            throw new C187328xf(e);
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, (long) i2);
                } catch (IOException e) {
                    throw new C187328xf(e);
                }
            }
            int read = this.A03.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.A00;
                if (j2 != -1) {
                    this.A00 = j2 - ((long) read);
                }
                A03(read);
                return read;
            } else if (this.A00 != -1) {
                throw new C187328xf((IOException) C165617ti.A0T());
            }
        }
        return -1;
    }

    public Uri BIj() {
        return this.A02;
    }
}
