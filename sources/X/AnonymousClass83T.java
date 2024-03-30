package X;

import android.content.Context;

/* renamed from: X.83T  reason: invalid class name */
public class AnonymousClass83T extends C21780zn {
    public boolean A00 = true;
    public final C199189eq A01;
    public final long[] A02;
    public final long[] A03;

    public static void A00(AnonymousClass83N r4, long[] jArr, int i) {
        r4.mobileBytesTx += jArr[i | 3];
        r4.mobileBytesRx += jArr[i | 2];
        r4.wifiBytesTx += jArr[i | 1];
        r4.wifiBytesRx += jArr[i];
    }

    public /* bridge */ /* synthetic */ AnonymousClass103 A01() {
        return new AnonymousClass83N();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ boolean A02(X.AnonymousClass103 r12) {
        /*
            r11 = this;
            X.83N r12 = (X.AnonymousClass83N) r12
            r10 = r11
            monitor-enter(r10)
            boolean r0 = r11.A00     // Catch:{ all -> 0x0070 }
            r4 = 0
            if (r0 == 0) goto L_0x006d
            X.9eq r5 = r11.A01     // Catch:{ all -> 0x0070 }
            long[] r3 = r11.A02     // Catch:{ all -> 0x0070 }
            boolean r0 = r5.A03(r3)     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x006d
            long[] r9 = r11.A03     // Catch:{ all -> 0x0070 }
            r8 = 0
        L_0x0016:
            r6 = r3[r8]     // Catch:{ all -> 0x0070 }
            r1 = r9[r8]     // Catch:{ all -> 0x0070 }
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0042
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = "Network Bytes decreased from "
            r1.append(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = java.util.Arrays.toString(r9)     // Catch:{ all -> 0x0070 }
            r1.append(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = " to "
            r1.append(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = java.util.Arrays.toString(r3)     // Catch:{ all -> 0x0070 }
            java.lang.String r2 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x0070 }
            java.lang.String r1 = "NetworkMetricsCollector"
            r0 = 0
            android.util.Log.e(r1, r2, r0)     // Catch:{ all -> 0x0070 }
            goto L_0x0049
        L_0x0042:
            int r8 = r8 + 1
            r0 = 8
            if (r8 < r0) goto L_0x0016
            goto L_0x004b
        L_0x0049:
            r0 = 0
            goto L_0x004f
        L_0x004b:
            java.lang.System.arraycopy(r3, r4, r9, r4, r0)     // Catch:{ all -> 0x0070 }
            r0 = 1
        L_0x004f:
            r11.A00 = r0     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x006d
            boolean r2 = r5.A02()     // Catch:{ all -> 0x0070 }
            r0 = 0
            r12.mobileBytesTx = r0     // Catch:{ all -> 0x0070 }
            r12.mobileBytesRx = r0     // Catch:{ all -> 0x0070 }
            r12.wifiBytesTx = r0     // Catch:{ all -> 0x0070 }
            r12.wifiBytesRx = r0     // Catch:{ all -> 0x0070 }
            A00(r12, r3, r4)     // Catch:{ all -> 0x0070 }
            if (r2 == 0) goto L_0x006a
            r0 = 4
            A00(r12, r3, r0)     // Catch:{ all -> 0x0070 }
        L_0x006a:
            monitor-exit(r10)
            r0 = 1
            return r0
        L_0x006d:
            monitor-exit(r10)
            r0 = 0
            return r0
        L_0x0070:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass83T.A02(X.103):boolean");
    }

    public AnonymousClass83T(Context context) {
        this.A01 = C199189eq.A01(context);
        this.A02 = new long[8];
        this.A03 = new long[8];
    }
}
