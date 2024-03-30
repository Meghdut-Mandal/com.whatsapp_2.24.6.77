package X;

import android.os.SystemClock;
import com.facebook.android.exoplayer2.util.Util;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9zB  reason: invalid class name and case insensitive filesystem */
public class C208929zB implements B3Y {
    public int A00;
    public int A01;
    public long A02 = -9223372036854775807L;
    public long A03;
    public long A04;
    public long A05 = -9223372036854775807L;
    public long A06 = -1;
    public long A07 = -1;
    public long A08 = -9223372036854775807L;
    public AnonymousClass9S3 A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public int A0D;
    public boolean A0E;
    public final C202509m3 A0F;
    public final AtomicBoolean A0G;
    public final boolean A0H;
    public final int A0I;
    public final C195899Ws A0J;
    public final AnonymousClass94B A0K;
    public final C198969eU A0L;
    public final AnonymousClass9D1 A0M;
    public final AtomicBoolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public volatile long A0T = -9223372036854775807L;
    public volatile long A0U = -9223372036854775807L;

    private void A02(boolean z) {
        this.A0D = 0;
        this.A0E = false;
        if (z) {
            C195899Ws r1 = this.A0J;
            synchronized (r1) {
                r1.A02(0);
            }
        }
        this.A0T = -9223372036854775807L;
        this.A05 = -9223372036854775807L;
        A01();
    }

    public long B8i() {
        return 0;
    }

    public void BdN() {
        A02(false);
    }

    public void BeW() {
        A02(true);
    }

    public void Bhv() {
        A02(true);
    }

    public boolean Bon() {
        return false;
    }

    private long A00() {
        C202509m3 r2;
        long j = this.A0T;
        long j2 = this.A0U;
        if (j == -9223372036854775807L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = this.A05;
            if (j3 == -9223372036854775807L) {
                this.A05 = elapsedRealtime;
            } else if (elapsedRealtime - j3 > j2) {
                this.A0T = -9223372036854775807L;
                this.A05 = -9223372036854775807L;
            }
        }
        long j4 = this.A0T;
        if (j4 != -9223372036854775807L) {
            UUID uuid = AnonymousClass9B7.A04;
            return Util.A04(j4);
        } else if (!this.A0B || (r2 = this.A0F) == null) {
            return this.A03;
        } else {
            int i = 3;
            if (this.A0A) {
                i = 7;
            }
            return (long) (C202509m3.A00(r2, i) * 1000);
        }
    }

    private void A01() {
        this.A07 = -1;
        this.A06 = -1;
        this.A08 = -9223372036854775807L;
        this.A02 = -9223372036854775807L;
    }

    public void BjQ(C206419tN r8, B5Q[] b5qArr, B5T[] b5tArr) {
        int i = this.A0I;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < b5qArr.length; i2++) {
                if (b5tArr[i2] != null) {
                    int i3 = b5qArr[i2].A0B;
                    boolean z = this.A0C;
                    int i4 = C132986Wc.A0F;
                    if (z) {
                        if (i3 == 1) {
                            i4 = this.A00;
                        } else if (i3 == 2) {
                            i4 = this.A01;
                        }
                    } else if (i3 == 1) {
                        i4 = 3538944;
                    } else if (i3 == 2) {
                        i4 = 13107200;
                    }
                    i += i4;
                }
            }
        }
        this.A0D = i;
        this.A0J.A02(i);
    }

    public void BrV(long j, long j2) {
        this.A06 = j;
        this.A07 = j2;
        if (j == -1 || j2 == -1) {
            A01();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0169, code lost:
        if ((com.facebook.android.exoplayer2.util.Util.A05(r26) - r7) < r5) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0183, code lost:
        if ((r5 - r1) < r7) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0094, code lost:
        if (r2 > 0) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Bt2(float r25, long r26, long r28, boolean r30) {
        /*
            r24 = this;
            java.lang.String r0 = "shouldContinueLoading"
            X.C196289Yq.A01(r0)     // Catch:{ all -> 0x018f }
            r1 = 1
            r4 = r24
            java.util.concurrent.atomic.AtomicBoolean r8 = r4.A0G     // Catch:{ all -> 0x018f }
            if (r8 == 0) goto L_0x0013
            boolean r0 = r8.get()     // Catch:{ all -> 0x018f }
            if (r0 == 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            r3 = 0
            if (r1 != 0) goto L_0x002d
            long r1 = r4.A06     // Catch:{ all -> 0x018f }
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0026
            long r1 = r4.A07     // Catch:{ all -> 0x018f }
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0026
            goto L_0x002d
        L_0x0026:
            boolean r0 = r4.A0H     // Catch:{ all -> 0x018f }
            if (r0 == 0) goto L_0x002d
            if (r30 != 0) goto L_0x002d
            r3 = 1
        L_0x002d:
            r7 = 0
            if (r3 == 0) goto L_0x0049
            boolean r0 = r4.A0R     // Catch:{ all -> 0x018f }
            if (r0 == 0) goto L_0x0045
            java.lang.Integer r9 = X.C023109s.A01     // Catch:{ all -> 0x018f }
            r10 = -1
            X.9S3 r8 = new X.9S3     // Catch:{ all -> 0x018f }
            r12 = -1
            r14 = -1
            r16 = -1
            r8.<init>(r9, r10, r12, r14, r16)     // Catch:{ all -> 0x018f }
            r4.A09 = r8     // Catch:{ all -> 0x018f }
        L_0x0045:
            X.C196289Yq.A00()
            return r7
        L_0x0049:
            X.9Ws r11 = r4.A0J     // Catch:{ all -> 0x018f }
            int r1 = r11.A00()     // Catch:{ all -> 0x018f }
            int r0 = r4.A0D     // Catch:{ all -> 0x018f }
            boolean r14 = X.C36371kC.A1T(r1, r0)
            X.9eU r9 = r4.A0L     // Catch:{ all -> 0x018f }
            r12 = 0
            java.util.concurrent.atomic.AtomicBoolean r3 = r9.A06     // Catch:{ all -> 0x018f }
            boolean r0 = r3.get()     // Catch:{ all -> 0x018f }
            r5 = r28
            if (r0 == 0) goto L_0x009a
            long r0 = r9.A02     // Catch:{ all -> 0x018f }
        L_0x0065:
            boolean r2 = r3.get()     // Catch:{ all -> 0x018f }
            if (r2 == 0) goto L_0x0076
            long r2 = r9.A02     // Catch:{ all -> 0x018f }
        L_0x006d:
            boolean r5 = r4.A0P     // Catch:{ all -> 0x018f }
            if (r5 == 0) goto L_0x00cc
            boolean r5 = r4.A0O     // Catch:{ all -> 0x018f }
            if (r5 == 0) goto L_0x00b7
            goto L_0x00ae
        L_0x0076:
            if (r30 != 0) goto L_0x007f
            long r2 = r9.A03     // Catch:{ all -> 0x018f }
            int r10 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x007f
            goto L_0x006d
        L_0x007f:
            X.AUI r2 = r9.A04     // Catch:{ all -> 0x018f }
            if (r2 == 0) goto L_0x0097
            int r10 = r2.cellHighWaterMarkDeltaMs     // Catch:{ all -> 0x018f }
            long r2 = r9.A00(r5)     // Catch:{ all -> 0x018f }
            int r5 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x0097
            long r5 = X.C36371kC.A07(r10)
            long r2 = r2 + r5
            int r5 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x0097
            goto L_0x006d
        L_0x0097:
            long r2 = r9.A00     // Catch:{ all -> 0x018f }
            goto L_0x006d
        L_0x009a:
            if (r30 != 0) goto L_0x00a3
            long r0 = r9.A03     // Catch:{ all -> 0x018f }
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x00a3
            goto L_0x0065
        L_0x00a3:
            long r0 = r9.A00(r5)     // Catch:{ all -> 0x018f }
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 > 0) goto L_0x0065
            long r0 = r9.A01     // Catch:{ all -> 0x018f }
            goto L_0x0065
        L_0x00ae:
            if (r8 == 0) goto L_0x00b7
            boolean r5 = r8.get()     // Catch:{ all -> 0x018f }
            if (r5 == 0) goto L_0x00b7
            goto L_0x00cc
        L_0x00b7:
            long r9 = r2 - r0
            long r5 = r4.A00()     // Catch:{ all -> 0x018f }
            long r0 = java.lang.Math.max(r5, r0)     // Catch:{ all -> 0x018f }
            boolean r5 = r4.A0S     // Catch:{ all -> 0x018f }
            if (r5 == 0) goto L_0x00ca
            long r2 = java.lang.Math.max(r0, r2)     // Catch:{ all -> 0x018f }
            goto L_0x00cc
        L_0x00ca:
            long r2 = r0 + r9
        L_0x00cc:
            r5 = 1065353216(0x3f800000, float:1.0)
            r9 = r25
            int r5 = (r25 > r5 ? 1 : (r25 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x00e5
            r5 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r25 > r5 ? 1 : (r25 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x00e1
            double r5 = (double) r0     // Catch:{ all -> 0x018f }
            double r0 = (double) r9     // Catch:{ all -> 0x018f }
            double r5 = r5 * r0
            long r0 = java.lang.Math.round(r5)     // Catch:{ all -> 0x018f }
        L_0x00e1:
            long r0 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x018f }
        L_0x00e5:
            java.lang.Integer r15 = X.C023109s.A00     // Catch:{ all -> 0x018f }
            int r5 = (r26 > r0 ? 1 : (r26 == r0 ? 0 : -1))
            if (r5 >= 0) goto L_0x00f9
            boolean r5 = r4.A0Q     // Catch:{ all -> 0x018f }
            if (r5 != 0) goto L_0x00f1
            if (r14 != 0) goto L_0x00f2
        L_0x00f1:
            r7 = 1
        L_0x00f2:
            r4.A0E = r7     // Catch:{ all -> 0x018f }
            if (r7 != 0) goto L_0x010b
            java.lang.Integer r15 = X.C023109s.A0R     // Catch:{ all -> 0x018f }
            goto L_0x010b
        L_0x00f9:
            int r5 = (r26 > r2 ? 1 : (r26 == r2 ? 0 : -1))
            if (r5 > 0) goto L_0x0100
            if (r14 != 0) goto L_0x0100
            goto L_0x0105
        L_0x0100:
            java.lang.Integer r15 = X.C023109s.A0G     // Catch:{ all -> 0x018f }
            r4.A0E = r7     // Catch:{ all -> 0x018f }
            goto L_0x010b
        L_0x0105:
            boolean r7 = r4.A0E     // Catch:{ all -> 0x018f }
            if (r7 != 0) goto L_0x010b
            java.lang.Integer r15 = X.C023109s.A0C     // Catch:{ all -> 0x018f }
        L_0x010b:
            boolean r5 = r4.A0R     // Catch:{ all -> 0x018f }
            if (r5 == 0) goto L_0x0128
            if (r7 != 0) goto L_0x0128
            int r5 = r4.A0D     // Catch:{ all -> 0x018f }
            long r9 = (long) r5     // Catch:{ all -> 0x018f }
            int r5 = r11.A00()     // Catch:{ all -> 0x018f }
            long r5 = (long) r5     // Catch:{ all -> 0x018f }
            X.9S3 r14 = new X.9S3     // Catch:{ all -> 0x018f }
            r16 = r9
            r18 = r5
            r20 = r0
            r22 = r2
            r14.<init>(r15, r16, r18, r20, r22)     // Catch:{ all -> 0x018f }
            r4.A09 = r14     // Catch:{ all -> 0x018f }
        L_0x0128:
            long r1 = r4.A06     // Catch:{ all -> 0x018f }
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0140
            long r1 = r4.A07     // Catch:{ all -> 0x018f }
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0140
            boolean r0 = r4.A0E     // Catch:{ all -> 0x018f }
            if (r0 == 0) goto L_0x0140
            if (r8 == 0) goto L_0x0143
            boolean r0 = r8.get()     // Catch:{ all -> 0x018f }
            if (r0 == 0) goto L_0x0143
        L_0x0140:
            boolean r9 = r4.A0E     // Catch:{ all -> 0x018f }
            goto L_0x018b
        L_0x0143:
            if (r30 != 0) goto L_0x0140
            long r5 = r4.A06     // Catch:{ all -> 0x018f }
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 0
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x016b
            long r7 = r4.A02     // Catch:{ all -> 0x018f }
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x015f
            java.util.UUID r0 = X.AnonymousClass9B7.A04     // Catch:{ all -> 0x018f }
            long r7 = com.facebook.android.exoplayer2.util.Util.A05(r26)     // Catch:{ all -> 0x018f }
            r4.A02 = r7     // Catch:{ all -> 0x018f }
        L_0x015f:
            java.util.UUID r0 = X.AnonymousClass9B7.A04     // Catch:{ all -> 0x018f }
            long r1 = com.facebook.android.exoplayer2.util.Util.A05(r26)     // Catch:{ all -> 0x018f }
            long r1 = r1 - r7
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r3 = 0
            if (r0 >= 0) goto L_0x016c
        L_0x016b:
            r3 = 1
        L_0x016c:
            long r7 = r4.A07     // Catch:{ all -> 0x018f }
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0185
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x018f }
            long r1 = r4.A08     // Catch:{ all -> 0x018f }
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x017f
            r4.A08 = r5     // Catch:{ all -> 0x018f }
            r1 = r5
        L_0x017f:
            long r5 = r5 - r1
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r0 = 0
            if (r1 >= 0) goto L_0x0186
        L_0x0185:
            r0 = 1
        L_0x0186:
            if (r3 == 0) goto L_0x018b
            if (r0 == 0) goto L_0x018b
            r9 = 1
        L_0x018b:
            X.C196289Yq.A00()
            return r9
        L_0x018f:
            r0 = move-exception
            X.C196289Yq.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208929zB.Bt2(float, long, long, boolean):boolean");
    }

    public boolean BtX(float f, long j, boolean z, boolean z2) {
        long j2;
        long j3;
        C202509m3 r2;
        if (f != 1.0f) {
            j = Math.round(((double) j) / ((double) f));
        }
        if (!z) {
            if (!this.A0B || (r2 = this.A0F) == null) {
                j2 = this.A04;
            } else {
                int i = 2;
                if (this.A0A) {
                    i = 6;
                }
                j2 = (long) (C202509m3.A00(r2, i) * 1000);
            }
            j3 = (long) (((float) j2) * 1.0f);
        } else if (z2) {
            j3 = (long) (C202509m3.A00(this.A0F, 9) * 1000);
        } else {
            j3 = A00();
        }
        if (j3 > 0 && j < j3 && (this.A0Q || this.A0J.A00() < this.A0D)) {
            return false;
        }
        this.A0T = -9223372036854775807L;
        this.A05 = -9223372036854775807L;
        A01();
        return true;
    }

    public C208929zB(C195899Ws r6, AnonymousClass94B r7, C198969eU r8, AnonymousClass9D1 r9, C202509m3 r10, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        boolean A1T = C36371kC.A1T(i, 0);
        String A0p = AnonymousClass000.A0p(" cannot be less than ", "0", AnonymousClass000.A0v("mBufferForPlaybackMs"));
        if (A1T) {
            boolean A1T2 = C36371kC.A1T(i2, 0);
            String A0p2 = AnonymousClass000.A0p(" cannot be less than ", "0", AnonymousClass000.A0v("mBufferForPlaybackAfterRebufferMs"));
            if (A1T2) {
                this.A0J = r6;
                this.A04 = ((long) i) * 1000;
                this.A03 = ((long) i2) * 1000;
                this.A0F = r10;
                this.A0I = i3;
                this.A01 = i4;
                this.A00 = i5;
                this.A0C = z;
                this.A0Q = z2;
                this.A0H = z3;
                this.A0L = r8;
                this.A0K = r7;
                this.A0M = r9;
                this.A0G = atomicBoolean;
                this.A0N = atomicBoolean2;
                this.A0A = z4;
                this.A0B = z5;
                this.A0R = z6;
                this.A0P = z7;
                this.A0S = z8;
                this.A0O = z9;
                return;
            }
            throw AnonymousClass001.A08(String.valueOf(A0p2));
        }
        throw AnonymousClass001.A08(String.valueOf(A0p));
    }

    public C195899Ws B8a() {
        return this.A0J;
    }
}
