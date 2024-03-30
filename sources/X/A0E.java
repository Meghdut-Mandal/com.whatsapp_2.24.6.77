package X;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

public final class A0E implements B2C {
    public long A00;
    public long A01;
    public C202189lD A02;
    public C187058xA A03;
    public File A04;
    public OutputStream A05;
    public final C23077B3i A06;
    public final boolean A07;
    public final int A08;
    public final long A09;
    public final long A0A;
    public final C21664AUg A0B;
    public final boolean A0C;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        if (r4.A00 <= 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0035, code lost:
        if (r3 != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void write(byte[] r14, int r15, int r16) {
        /*
            r13 = this;
            r5 = 0
            long r8 = r13.A09     // Catch:{ IOException -> 0x0065 }
            r11 = r8
            X.AUg r4 = r13.A0B     // Catch:{ IOException -> 0x0065 }
            boolean r10 = r13.A07     // Catch:{ IOException -> 0x0065 }
            if (r10 == 0) goto L_0x001a
            X.B3i r1 = r13.A06     // Catch:{ IOException -> 0x0065 }
            if (r1 == 0) goto L_0x001a
            if (r4 == 0) goto L_0x001a
            java.lang.String r0 = r4.A07     // Catch:{ IOException -> 0x0065 }
            boolean r0 = r1.BMG(r0)     // Catch:{ IOException -> 0x0065 }
            if (r0 == 0) goto L_0x001a
            long r8 = r13.A0A     // Catch:{ IOException -> 0x0065 }
        L_0x001a:
            r6 = r16
            if (r5 >= r6) goto L_0x0064
            if (r10 == 0) goto L_0x002b
            X.B3i r0 = r13.A06     // Catch:{ IOException -> 0x0065 }
            if (r0 == 0) goto L_0x002b
            if (r4 == 0) goto L_0x002b
            int r0 = r4.A00     // Catch:{ IOException -> 0x0065 }
            r3 = 1
            if (r0 > 0) goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            long r0 = r13.A01     // Catch:{ IOException -> 0x0065 }
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0035
            if (r3 == 0) goto L_0x0044
            goto L_0x0037
        L_0x0035:
            if (r3 == 0) goto L_0x003e
        L_0x0037:
            X.B3i r1 = r13.A06     // Catch:{ IOException -> 0x0065 }
            java.lang.String r0 = r4.A07     // Catch:{ IOException -> 0x0065 }
            r1.B0T(r0)     // Catch:{ IOException -> 0x0065 }
        L_0x003e:
            r13.A00()     // Catch:{ IOException -> 0x0065 }
            r13.A01()     // Catch:{ IOException -> 0x0065 }
        L_0x0044:
            int r0 = r16 - r5
            long r6 = (long) r0     // Catch:{ IOException -> 0x0065 }
            long r2 = r13.A01     // Catch:{ IOException -> 0x0065 }
            long r0 = r11 - r2
            long r0 = java.lang.Math.min(r6, r0)     // Catch:{ IOException -> 0x0065 }
            int r2 = (int) r0     // Catch:{ IOException -> 0x0065 }
            java.io.OutputStream r1 = r13.A05     // Catch:{ IOException -> 0x0065 }
            int r0 = r15 + r5
            r1.write(r14, r0, r2)     // Catch:{ IOException -> 0x0065 }
            int r5 = r5 + r2
            long r0 = r13.A01     // Catch:{ IOException -> 0x0065 }
            long r2 = (long) r2     // Catch:{ IOException -> 0x0065 }
            long r0 = r0 + r2
            r13.A01 = r0     // Catch:{ IOException -> 0x0065 }
            long r0 = r13.A00     // Catch:{ IOException -> 0x0065 }
            long r0 = r0 + r2
            r13.A00 = r0     // Catch:{ IOException -> 0x0065 }
            goto L_0x001a
        L_0x0064:
            return
        L_0x0065:
            r1 = move-exception
            X.8xS r0 = new X.8xS
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A0E.write(byte[], int, int):void");
    }

    private void A00() {
        if (this.A05 != null) {
            try {
                C196289Yq.A01("cacheDataSinkSync");
                this.A05.flush();
                C196289Yq.A00();
                OutputStream outputStream = this.A05;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused) {
                    }
                }
                this.A05 = null;
                File file = this.A04;
                this.A04 = null;
                this.A06.B38(file);
            } catch (Throwable th) {
                C196289Yq.A00();
                OutputStream outputStream2 = this.A05;
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
                this.A05 = null;
                File file2 = this.A04;
                this.A04 = null;
                file2.delete();
                throw th;
            }
        }
    }

    private void A01() {
        int i;
        C202189lD r6 = this.A02;
        long j = r6.A02;
        long j2 = this.A00;
        long j3 = this.A09;
        long min = Math.min(j - j2, j3);
        boolean z = this.A0C;
        if (z && this.A08 > 0 && j == -1) {
            min = j3;
        }
        File BuU = this.A06.BuU(r6.A06, j2 + r6.A01, min);
        this.A04 = BuU;
        OutputStream fileOutputStream = new FileOutputStream(BuU);
        this.A01 = 0;
        if (z && (i = this.A08) > 0) {
            C187058xA r0 = this.A03;
            if (r0 == null) {
                this.A03 = new C187058xA(fileOutputStream, i);
            } else {
                r0.A00(fileOutputStream);
            }
        }
        OutputStream outputStream = this.A03;
        if (outputStream != null) {
            fileOutputStream = outputStream;
        }
        this.A05 = fileOutputStream;
    }

    public void Bkt(C202189lD r6) {
        C187218xS r1;
        C200319h9.A02(AnonymousClass000.A1P((r6.A02 > -1 ? 1 : (r6.A02 == -1 ? 0 : -1))));
        try {
            C196289Yq.A01("exo-opencachedatasink");
            this.A02 = r6;
            this.A00 = 0;
            A01();
            C196289Yq.A00();
            return;
        } catch (FileNotFoundException e) {
            r1 = new C187218xS(e);
        } catch (C187148xL e2) {
            r1 = new C187218xS(e2);
        } catch (Throwable th) {
            C196289Yq.A00();
            throw th;
        }
        throw r1;
    }

    public A0E(C23077B3i b3i, C21664AUg aUg, int i, long j, long j2, boolean z, boolean z2) {
        Objects.requireNonNull(b3i);
        this.A06 = b3i;
        this.A09 = j;
        this.A0C = z;
        this.A08 = i;
        this.A0B = aUg;
        this.A07 = z2;
        this.A0A = j2;
    }

    public void close() {
        try {
            A00();
        } catch (IOException e) {
            throw new C187218xS(e);
        }
    }
}
