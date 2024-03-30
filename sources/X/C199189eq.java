package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.9eq  reason: invalid class name and case insensitive filesystem */
public abstract class C199189eq {
    public static C199189eq A01(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new AnonymousClass83U(context);
        }
        AnonymousClass83V r1 = new AnonymousClass83V();
        if (r1.A03(new long[8])) {
            return r1;
        }
        return new AnonymousClass83W(context);
    }

    public boolean A02() {
        if (this instanceof AnonymousClass83W) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0089, code lost:
        if (X.AnonymousClass83V.A04.compareTo(r3) != 0) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(long[] r12) {
        /*
            r11 = this;
            boolean r0 = r11 instanceof X.AnonymousClass83W
            if (r0 == 0) goto L_0x001e
            r3 = r11
            X.83W r3 = (X.AnonymousClass83W) r3
            monitor-enter(r3)
            boolean r0 = r3.A02     // Catch:{ all -> 0x001b }
            r2 = 0
            if (r0 != 0) goto L_0x000f
            goto L_0x00e1
        L_0x000f:
            r3.A04()     // Catch:{ all -> 0x001b }
            long[] r1 = r3.A04     // Catch:{ all -> 0x001b }
            r0 = 8
            java.lang.System.arraycopy(r1, r2, r12, r2, r0)     // Catch:{ all -> 0x001b }
            goto L_0x00de
        L_0x001b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x001e:
            r8 = r11
            X.83V r8 = (X.AnonymousClass83V) r8
            X.105 r1 = r8.A00     // Catch:{ 0zp -> 0x00e4 }
            if (r1 != 0) goto L_0x002e
            java.lang.String r0 = "/proc/net/xt_qtaguid/stats"
            X.105 r1 = new X.105     // Catch:{ 0zp -> 0x00e4 }
            r1.<init>(r0)     // Catch:{ 0zp -> 0x00e4 }
            r8.A00 = r1     // Catch:{ 0zp -> 0x00e4 }
        L_0x002e:
            r1.A04()     // Catch:{ 0zp -> 0x00e4 }
            X.105 r1 = r8.A00     // Catch:{ 0zp -> 0x00e4 }
            boolean r0 = r1.A02     // Catch:{ 0zp -> 0x00e4 }
            if (r0 == 0) goto L_0x00e2
            boolean r0 = r1.A08()     // Catch:{ 0zp -> 0x00e4 }
            if (r0 == 0) goto L_0x00e2
            r1 = 0
            java.util.Arrays.fill(r12, r1)     // Catch:{ 0zp -> 0x00e4 }
            X.105 r0 = r8.A00     // Catch:{ 0zp -> 0x00e4 }
            r0.A05()     // Catch:{ 0zp -> 0x00e4 }
        L_0x0047:
            X.105 r0 = r8.A00     // Catch:{ 0zp -> 0x00e4 }
            boolean r0 = r0.A08()     // Catch:{ 0zp -> 0x00e4 }
            r5 = 1
            if (r0 == 0) goto L_0x00df
            X.105 r0 = r8.A00     // Catch:{ 0zp -> 0x00e4 }
            r0.A06()     // Catch:{ 0zp -> 0x00e4 }
            X.105 r0 = r8.A00     // Catch:{ 0zp -> 0x00e4 }
            java.nio.CharBuffer r3 = r8.A01     // Catch:{ 0zp -> 0x00e4 }
            r0.A07(r3)     // Catch:{ 0zp -> 0x00e4 }
            X.105 r0 = r8.A00     // Catch:{ 0zp -> 0x00e4 }
            r0.A06()     // Catch:{ 0zp -> 0x00e4 }
            X.105 r0 = r8.A00     // Catch:{ 0zp -> 0x00e4 }
            r0.A06()     // Catch:{ 0zp -> 0x00e4 }
            X.105 r0 = r8.A00     // Catch:{ 0zp -> 0x00e4 }
            long r9 = r0.A02()     // Catch:{ 0zp -> 0x00e4 }
            X.105 r0 = r8.A00     // Catch:{ 0zp -> 0x00e4 }
            r0.A06()     // Catch:{ 0zp -> 0x00e4 }
            java.nio.CharBuffer r0 = X.AnonymousClass83V.A05     // Catch:{ 0zp -> 0x00e4 }
            int r0 = r0.compareTo(r3)     // Catch:{ 0zp -> 0x00e4 }
            r6 = 1
            if (r0 == 0) goto L_0x00dc
            r6 = 0
            java.nio.CharBuffer r0 = X.AnonymousClass83V.A03     // Catch:{ 0zp -> 0x00e4 }
            int r0 = r0.compareTo(r3)     // Catch:{ 0zp -> 0x00e4 }
            if (r0 == 0) goto L_0x00dc
            java.nio.CharBuffer r0 = X.AnonymousClass83V.A04     // Catch:{ 0zp -> 0x00e4 }
            int r0 = r0.compareTo(r3)     // Catch:{ 0zp -> 0x00e4 }
            if (r0 == 0) goto L_0x00dc
        L_0x008b:
            long r3 = X.AnonymousClass83V.A02     // Catch:{ 0zp -> 0x00e4 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00d5
            if (r6 != 0) goto L_0x0096
            if (r5 != 0) goto L_0x0096
            goto L_0x00d5
        L_0x0096:
            X.105 r0 = r8.A00     // Catch:{ 0zp -> 0x00e4 }
            long r4 = r0.A02()     // Catch:{ 0zp -> 0x00e4 }
            X.105 r0 = r8.A00     // Catch:{ 0zp -> 0x00e4 }
            r0.A06()     // Catch:{ 0zp -> 0x00e4 }
            r7 = 2
            if (r6 == 0) goto L_0x00a5
            r7 = 0
        L_0x00a5:
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r0 = 0
            if (r3 != 0) goto L_0x00ab
            r0 = 4
        L_0x00ab:
            r7 = r7 | r0
            r5 = r12[r7]     // Catch:{ 0zp -> 0x00e4 }
            X.105 r0 = r8.A00     // Catch:{ 0zp -> 0x00e4 }
            long r3 = r0.A02()     // Catch:{ 0zp -> 0x00e4 }
            long r5 = r5 + r3
            r12[r7] = r5     // Catch:{ 0zp -> 0x00e4 }
            X.105 r0 = r8.A00     // Catch:{ 0zp -> 0x00e4 }
            r0.A06()     // Catch:{ 0zp -> 0x00e4 }
            X.105 r0 = r8.A00     // Catch:{ 0zp -> 0x00e4 }
            r0.A06()     // Catch:{ 0zp -> 0x00e4 }
            r7 = r7 | 1
            r5 = r12[r7]     // Catch:{ 0zp -> 0x00e4 }
            X.105 r0 = r8.A00     // Catch:{ 0zp -> 0x00e4 }
            long r3 = r0.A02()     // Catch:{ 0zp -> 0x00e4 }
            long r5 = r5 + r3
            r12[r7] = r5     // Catch:{ 0zp -> 0x00e4 }
            X.105 r0 = r8.A00     // Catch:{ 0zp -> 0x00e4 }
            r0.A05()     // Catch:{ 0zp -> 0x00e4 }
            goto L_0x0047
        L_0x00d5:
            X.105 r0 = r8.A00     // Catch:{ 0zp -> 0x00e4 }
            r0.A05()     // Catch:{ 0zp -> 0x00e4 }
            goto L_0x0047
        L_0x00dc:
            r5 = 0
            goto L_0x008b
        L_0x00de:
            monitor-exit(r3)
        L_0x00df:
            r0 = 1
            return r0
        L_0x00e1:
            monitor-exit(r3)
        L_0x00e2:
            r0 = 0
            return r0
        L_0x00e4:
            r2 = move-exception
            java.lang.String r1 = "QTagUidNetworkBytesCollector"
            java.lang.String r0 = "Unable to parse file"
            android.util.Log.e(r1, r0, r2)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199189eq.A03(long[]):boolean");
    }
}
