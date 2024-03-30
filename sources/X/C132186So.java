package X;

/* renamed from: X.6So  reason: invalid class name and case insensitive filesystem */
public class C132186So {
    public double A00 = -1.0d;
    public long A01;
    public final long A02 = Math.max(0, 300);
    public final /* synthetic */ C130246Kh A03;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if ((r5 - r9.A01) >= r9.A02) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A00(double r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0085
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0085
            double r1 = r9.A00     // Catch:{ all -> 0x0082 }
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0085
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0082 }
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r10 - r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x002b
            r1 = 4532020583610935537(0x3ee4f8b588e368f1, double:1.0E-5)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x002b
            goto L_0x0035
        L_0x002b:
            long r0 = r9.A01     // Catch:{ all -> 0x0082 }
            long r3 = r5 - r0
            long r1 = r9.A02     // Catch:{ all -> 0x0082 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0085
        L_0x0035:
            r9.A00 = r10     // Catch:{ all -> 0x0082 }
            r9.A01 = r5     // Catch:{ all -> 0x0082 }
            X.6Kh r8 = r9.A03     // Catch:{ all -> 0x0082 }
            if (r8 == 0) goto L_0x0085
            int r4 = r8.A00     // Catch:{ all -> 0x0082 }
            r7 = 1
            int r0 = r4 - r7
            double r0 = (double) r0     // Catch:{ all -> 0x0082 }
            double r0 = r0 + r10
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r2
            int r3 = r8.A01     // Catch:{ all -> 0x0082 }
            double r5 = (double) r3     // Catch:{ all -> 0x0082 }
            double r0 = r0 / r5
            int r2 = (int) r0     // Catch:{ all -> 0x0082 }
            X.6vk r1 = r8.A03     // Catch:{ all -> 0x0082 }
            X.7gq r0 = r1.A05     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x0085
            boolean r0 = r1.A0Y     // Catch:{ all -> 0x0082 }
            if (r0 != 0) goto L_0x005f
            X.7gq r0 = r1.A05     // Catch:{ all -> 0x0082 }
            boolean r0 = r0.Bdi(r2)     // Catch:{ all -> 0x0082 }
            if (r0 != 0) goto L_0x005f
            r7 = 0
        L_0x005f:
            r1.A0Y = r7     // Catch:{ all -> 0x0082 }
            r0 = 5
            if (r2 < r0) goto L_0x0068
            int r0 = r2 % 5
            if (r0 != 0) goto L_0x0085
        L_0x0068:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "videotranscoder/transcode/progress "
            r1.append(r0)     // Catch:{ all -> 0x0082 }
            r1.append(r4)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ all -> 0x0082 }
            r1.append(r3)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = " "
            X.C36321k7.A1T(r0, r1, r2)     // Catch:{ all -> 0x0082 }
            goto L_0x0085
        L_0x0082:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x0085:
            monitor-exit(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132186So.A00(double):void");
    }

    public C132186So(C130246Kh r5) {
        this.A03 = r5;
    }

    public C132186So() {
    }
}
