package X;

import android.view.Choreographer;
import android.view.Display;
import android.view.View;

/* renamed from: X.75F  reason: invalid class name */
public final class AnonymousClass75F implements Runnable, C159847k1, Choreographer.FrameCallback, AnonymousClass7bF {
    public static long A0A;
    public boolean A00;
    public long A01;
    public long A02;
    public boolean A03;
    public final View A04;
    public final C1506776e A05 = C1506776e.A02(new C136836f4[16]);
    public final Choreographer A06 = Choreographer.getInstance();
    public final C1268966b A07;
    public final C114265gw A08;
    public final AnonymousClass6SD A09;

    public void BQW() {
    }

    public void BYM() {
        this.A03 = false;
        this.A08.A00 = null;
        this.A04.removeCallbacks(this);
        this.A06.removeFrameCallback(this);
    }

    public void BeY() {
        this.A08.A00 = this;
        this.A03 = true;
    }

    public void doFrame(long j) {
        if (this.A03) {
            this.A04.post(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        r0 = ((X.C136776ey) r13).A01.A00.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ff, code lost:
        if (r14 != false) goto L_0x0101;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            r9 = r18
            X.76e r8 = r9.A05
            int r0 = r8.A00
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            r10 = 0
            if (r0 != 0) goto L_0x0107
            boolean r0 = r9.A00
            if (r0 == 0) goto L_0x0107
            boolean r0 = r9.A03
            if (r0 == 0) goto L_0x0107
            android.view.View r1 = r9.A04
            int r0 = r1.getWindowVisibility()
            if (r0 != 0) goto L_0x0107
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r1.getDrawingTime()
            long r16 = r2.toNanos(r0)
            long r0 = A0A
            long r16 = r16 + r0
            long r1 = java.lang.System.nanoTime()
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            boolean r15 = X.AnonymousClass000.A1R(r0)
            r14 = 0
        L_0x0036:
            int r0 = r8.A00
            if (r0 == 0) goto L_0x00ff
            if (r14 != 0) goto L_0x0101
            java.lang.Object[] r0 = r8.A01
            r5 = r0[r10]
            X.6f4 r5 = (X.C136836f4) r5
            X.66b r7 = r9.A07
            X.00S r0 = r7.A01
            java.lang.Object r13 = r0.invoke()
            X.7jz r13 = (X.C159827jz) r13
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x00ee
            r0 = r13
            X.6ey r0 = (X.C136776ey) r0
            X.6ez r0 = r0.A01
            X.6Mk r0 = r0.A00
            int r0 = r0.A00
            int r6 = r5.A02
            if (r6 >= r0) goto L_0x00ee
            X.7k4 r0 = r5.A00
            if (r0 != 0) goto L_0x00a4
            java.lang.String r0 = "compose:lazylist:prefetch:compose"
            android.os.Trace.beginSection(r0)
            long r11 = java.lang.System.nanoTime()     // Catch:{ all -> 0x00fa }
            long r3 = r9.A01     // Catch:{ all -> 0x00fa }
            long r1 = r11 + r3
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x0074
            if (r15 == 0) goto L_0x00b8
        L_0x0074:
            java.lang.Object r2 = r13.BDL(r6)     // Catch:{ all -> 0x00fa }
            java.lang.Object r0 = r13.BA9(r6)     // Catch:{ all -> 0x00fa }
            X.03v r1 = r7.A01(r2, r0, r6)     // Catch:{ all -> 0x00fa }
            X.6SD r0 = r9.A09     // Catch:{ all -> 0x00fa }
            X.6fE r0 = r0.A00     // Catch:{ all -> 0x00fa }
            if (r0 == 0) goto L_0x00f3
            X.7k4 r0 = r0.A03(r2, r1)     // Catch:{ all -> 0x00fa }
            r5.A00 = r0     // Catch:{ all -> 0x00fa }
            long r6 = java.lang.System.nanoTime()     // Catch:{ all -> 0x00fa }
            long r6 = r6 - r11
            long r4 = r9.A01     // Catch:{ all -> 0x00fa }
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00a1
            r0 = 4
            long r2 = (long) r0     // Catch:{ all -> 0x00fa }
            long r4 = r4 / r2
            r0 = 3
            long r0 = (long) r0     // Catch:{ all -> 0x00fa }
            long r4 = r4 * r0
            long r6 = r6 / r2
            long r6 = r6 + r4
        L_0x00a1:
            r9.A01 = r6     // Catch:{ all -> 0x00fa }
            goto L_0x00e8
        L_0x00a4:
            java.lang.String r0 = "compose:lazylist:prefetch:measure"
            android.os.Trace.beginSection(r0)
            long r11 = java.lang.System.nanoTime()     // Catch:{ all -> 0x00fa }
            long r3 = r9.A02     // Catch:{ all -> 0x00fa }
            long r1 = r11 + r3
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x00ba
            if (r15 == 0) goto L_0x00b8
            goto L_0x00ba
        L_0x00b8:
            r14 = 1
            goto L_0x00e9
        L_0x00ba:
            X.7k4 r4 = r5.A00     // Catch:{ all -> 0x00fa }
            X.AnonymousClass00C.A0B(r4)     // Catch:{ all -> 0x00fa }
            int r3 = r4.BFx()     // Catch:{ all -> 0x00fa }
            r2 = 0
        L_0x00c4:
            if (r2 >= r3) goto L_0x00ce
            long r0 = r5.A03     // Catch:{ all -> 0x00fa }
            r4.Bm3(r2, r0)     // Catch:{ all -> 0x00fa }
            int r2 = r2 + 1
            goto L_0x00c4
        L_0x00ce:
            long r6 = java.lang.System.nanoTime()     // Catch:{ all -> 0x00fa }
            long r6 = r6 - r11
            long r4 = r9.A02     // Catch:{ all -> 0x00fa }
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00e3
            r0 = 4
            long r2 = (long) r0     // Catch:{ all -> 0x00fa }
            long r4 = r4 / r2
            r0 = 3
            long r0 = (long) r0     // Catch:{ all -> 0x00fa }
            long r4 = r4 * r0
            long r6 = r6 / r2
            long r6 = r6 + r4
        L_0x00e3:
            r9.A02 = r6     // Catch:{ all -> 0x00fa }
            r8.A04(r10)     // Catch:{ all -> 0x00fa }
        L_0x00e8:
            r15 = 0
        L_0x00e9:
            android.os.Trace.endSection()
            goto L_0x0036
        L_0x00ee:
            r8.A04(r10)
            goto L_0x0036
        L_0x00f3:
            java.lang.String r0 = "SubcomposeLayoutState is not attached to SubcomposeLayout"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ all -> 0x00fa }
            throw r0     // Catch:{ all -> 0x00fa }
        L_0x00fa:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L_0x00ff:
            if (r14 == 0) goto L_0x0107
        L_0x0101:
            android.view.Choreographer r0 = r9.A06
            r0.postFrameCallback(r9)
            return
        L_0x0107:
            r9.A00 = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass75F.run():void");
    }

    public AnonymousClass75F(View view, C1268966b r7, C114265gw r8, AnonymousClass6SD r9) {
        this.A08 = r8;
        this.A09 = r9;
        this.A07 = r7;
        this.A04 = view;
        if (A0A == 0) {
            Display display = view.getDisplay();
            float f = 60.0f;
            if (!view.isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            A0A = (long) (((float) 1000000000) / f);
        }
    }
}
