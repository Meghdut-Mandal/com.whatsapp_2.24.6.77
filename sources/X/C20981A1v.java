package X;

import java.util.Map;

/* renamed from: X.A1v  reason: case insensitive filesystem */
public class C20981A1v implements C23064B2n {
    public C128806Dr A00;
    public AnonymousClass6OG A01;
    public AnonymousClass9ST A02;
    public final C198549dl A03;

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        if (r7.A00() != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007e, code lost:
        if (r4.A00() != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fd, code lost:
        if (r4 == null) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0106, code lost:
        if (r9 != false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010f, code lost:
        if (r8 != false) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012b, code lost:
        if (r4 != false) goto L_0x012d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass9ST r23, X.AnonymousClass9NT r24, X.C23071B3a r25) {
        /*
            r22 = this;
            r12 = 1
            java.lang.String r0 = "GlCopyRenderer.renderFrame()"
            android.os.Trace.beginSection(r0)
            r6 = r25
            java.lang.Object r11 = r6.BDd()
            monitor-enter(r11)
            r3 = r22
            r2 = r23
            if (r23 != 0) goto L_0x0015
            goto L_0x0138
        L_0x0015:
            X.9ST r0 = r3.A02     // Catch:{ all -> 0x0144 }
            if (r2 == r0) goto L_0x0020
            X.9dl r1 = r3.A03     // Catch:{ all -> 0x0144 }
            X.8zK r0 = X.C188278zK.A03     // Catch:{ all -> 0x0144 }
            r1.A00(r0)     // Catch:{ all -> 0x0144 }
        L_0x0020:
            X.6OG r5 = r3.A01     // Catch:{ all -> 0x0144 }
            X.9Wt r7 = r2.A06     // Catch:{ all -> 0x0144 }
            X.9bn r0 = r7.A01     // Catch:{ all -> 0x0144 }
            X.94R r4 = X.C197489bn.A0C     // Catch:{ all -> 0x0144 }
            java.lang.Boolean r1 = X.C36381kD.A0j()     // Catch:{ all -> 0x0144 }
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x0144 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0144 }
            if (r0 == 0) goto L_0x0035
            r1 = r0
        L_0x0035:
            boolean r0 = X.AnonymousClass000.A1X(r1)     // Catch:{ all -> 0x0144 }
            if (r0 == 0) goto L_0x003d
            X.6OG r5 = r7.A02     // Catch:{ all -> 0x0144 }
        L_0x003d:
            if (r5 != 0) goto L_0x004b
            android.os.Trace.endSection()     // Catch:{ all -> 0x0144 }
            X.9dl r1 = r3.A03     // Catch:{ all -> 0x0144 }
            X.8zK r0 = X.C188278zK.A05     // Catch:{ all -> 0x0144 }
            r1.A00(r0)     // Catch:{ all -> 0x0144 }
            goto L_0x0142
        L_0x004b:
            r10 = r24
            X.67V r1 = r10.A04     // Catch:{ all -> 0x0144 }
            boolean r0 = r6.BLf(r10)     // Catch:{ all -> 0x0144 }
            r4 = r0 ^ 1
            if (r1 == 0) goto L_0x0124
            if (r4 != 0) goto L_0x012d
            java.lang.String r0 = "GlCopyRenderer.makeCurrent()"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x011c }
            java.lang.RuntimeException r0 = r6.BP0()     // Catch:{ all -> 0x011c }
            android.os.Trace.endSection()     // Catch:{ all -> 0x011c }
            if (r0 != 0) goto L_0x0118
            X.9Rm r4 = r6.Bwr(r10)     // Catch:{ all -> 0x011c }
            X.9Rm r7 = r10.A05     // Catch:{ all -> 0x011c }
            if (r7 == 0) goto L_0x0076
            boolean r0 = r7.A00()     // Catch:{ all -> 0x011c }
            r9 = 1
            if (r0 == 0) goto L_0x0077
        L_0x0076:
            r9 = 0
        L_0x0077:
            if (r4 == 0) goto L_0x0080
            boolean r0 = r4.A00()     // Catch:{ all -> 0x011c }
            r8 = 1
            if (r0 == 0) goto L_0x0081
        L_0x0080:
            r8 = 0
        L_0x0081:
            if (r7 == 0) goto L_0x00f6
            if (r4 == 0) goto L_0x00ff
            if (r9 != 0) goto L_0x0108
            if (r8 != 0) goto L_0x0111
            java.lang.String r0 = "GlCopyRenderer.draw()"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x011c }
            int r9 = r10.A00     // Catch:{ all -> 0x011c }
            java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x011c }
            X.6Dr r12 = r3.A00     // Catch:{ all -> 0x011c }
            if (r12 != 0) goto L_0x00cc
            int r18 = r6.BEo()     // Catch:{ all -> 0x011c }
            boolean r21 = r6.BMY()     // Catch:{ all -> 0x011c }
            int r8 = r4.A01     // Catch:{ all -> 0x011c }
            int r0 = r4.A00     // Catch:{ all -> 0x011c }
            float[] r13 = r7.A03     // Catch:{ all -> 0x011c }
            float[] r14 = r4.A03     // Catch:{ all -> 0x011c }
            float[] r15 = r7.A02     // Catch:{ all -> 0x011c }
            float[] r4 = r4.A02     // Catch:{ all -> 0x011c }
            X.6Dr r12 = new X.6Dr     // Catch:{ all -> 0x011c }
            r19 = r8
            r20 = r0
            r16 = r4
            r17 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x011c }
            r3.A00 = r12     // Catch:{ all -> 0x011c }
        L_0x00ba:
            r5.A01(r1, r12, r2)     // Catch:{ all -> 0x011c }
            android.os.Trace.endSection()     // Catch:{ all -> 0x011c }
            java.lang.String r0 = "GlCopyRenderer.swapBuffers()"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x011c }
            r6.BvO()     // Catch:{ all -> 0x011c }
            android.os.Trace.endSection()     // Catch:{ all -> 0x011c }
            goto L_0x0118
        L_0x00cc:
            r12.A00 = r9     // Catch:{ all -> 0x011c }
            int r0 = r6.BEo()     // Catch:{ all -> 0x011c }
            r12.A01 = r0     // Catch:{ all -> 0x011c }
            r0 = 1
            r12.A04 = r0     // Catch:{ all -> 0x011c }
            boolean r0 = r6.BMY()     // Catch:{ all -> 0x011c }
            r12.A05 = r0     // Catch:{ all -> 0x011c }
            int r0 = r4.A01     // Catch:{ all -> 0x011c }
            r12.A03 = r0     // Catch:{ all -> 0x011c }
            int r0 = r4.A00     // Catch:{ all -> 0x011c }
            r12.A02 = r0     // Catch:{ all -> 0x011c }
            float[] r0 = r7.A03     // Catch:{ all -> 0x011c }
            r12.A09 = r0     // Catch:{ all -> 0x011c }
            float[] r0 = r4.A03     // Catch:{ all -> 0x011c }
            r12.A07 = r0     // Catch:{ all -> 0x011c }
            float[] r0 = r7.A02     // Catch:{ all -> 0x011c }
            r12.A08 = r0     // Catch:{ all -> 0x011c }
            float[] r0 = r4.A02     // Catch:{ all -> 0x011c }
            r12.A06 = r0     // Catch:{ all -> 0x011c }
            goto L_0x00ba
        L_0x00f6:
            X.9dl r1 = r3.A03     // Catch:{ all -> 0x011c }
            X.8zK r0 = X.C188278zK.A07     // Catch:{ all -> 0x011c }
            r1.A00(r0)     // Catch:{ all -> 0x011c }
            if (r4 != 0) goto L_0x0106
        L_0x00ff:
            X.9dl r1 = r3.A03     // Catch:{ all -> 0x011c }
            X.8zK r0 = X.C188278zK.A06     // Catch:{ all -> 0x011c }
            r1.A00(r0)     // Catch:{ all -> 0x011c }
        L_0x0106:
            if (r9 == 0) goto L_0x010f
        L_0x0108:
            X.9dl r1 = r3.A03     // Catch:{ all -> 0x011c }
            X.8zK r0 = X.C188278zK.A0E     // Catch:{ all -> 0x011c }
            r1.A00(r0)     // Catch:{ all -> 0x011c }
        L_0x010f:
            if (r8 == 0) goto L_0x0118
        L_0x0111:
            X.9dl r1 = r3.A03     // Catch:{ all -> 0x011c }
            X.8zK r0 = X.C188278zK.A0D     // Catch:{ all -> 0x011c }
            r1.A00(r0)     // Catch:{ all -> 0x011c }
        L_0x0118:
            r2.A00()     // Catch:{ all -> 0x0144 }
            goto L_0x0134
        L_0x011c:
            r0 = move-exception
            r2.A00()     // Catch:{ all -> 0x0144 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x0144 }
            throw r0     // Catch:{ all -> 0x0144 }
        L_0x0124:
            X.9dl r1 = r3.A03     // Catch:{ all -> 0x0144 }
            X.8zK r0 = X.C188278zK.A09     // Catch:{ all -> 0x0144 }
            r1.A00(r0)     // Catch:{ all -> 0x0144 }
            if (r4 == 0) goto L_0x0134
        L_0x012d:
            X.9dl r1 = r3.A03     // Catch:{ all -> 0x0144 }
            X.8zK r0 = X.C188278zK.A0A     // Catch:{ all -> 0x0144 }
            r1.A00(r0)     // Catch:{ all -> 0x0144 }
        L_0x0134:
            android.os.Trace.endSection()     // Catch:{ all -> 0x0144 }
            goto L_0x0142
        L_0x0138:
            android.os.Trace.endSection()     // Catch:{ all -> 0x0144 }
            X.9dl r1 = r3.A03     // Catch:{ all -> 0x0144 }
            X.8zK r0 = X.C188278zK.A08     // Catch:{ all -> 0x0144 }
            r1.A00(r0)     // Catch:{ all -> 0x0144 }
        L_0x0142:
            monitor-exit(r11)     // Catch:{ all -> 0x0144 }
            return
        L_0x0144:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0144 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20981A1v.A00(X.9ST, X.9NT, X.B3a):void");
    }

    public void BKM(C201589jv r1) {
    }

    public void release() {
    }

    public void B1T(AnonymousClass9ST r6) {
        AnonymousClass9ST r0 = this.A02;
        if (!(r0 == null || r0 == r6)) {
            this.A03.A00(C188278zK.A02);
        }
        this.A02 = r6;
        C197489bn r4 = r6.A06.A01;
        AnonymousClass94R r02 = C197489bn.A0C;
        Object A0j = C36381kD.A0j();
        Map map = r4.A00;
        Object obj = map.get(r02);
        if (obj != null) {
            A0j = obj;
        }
        if (!AnonymousClass000.A1X(A0j) && this.A01 == null) {
            AnonymousClass6OG r2 = new AnonymousClass6OG(r4);
            AnonymousClass94R r03 = C197489bn.A07;
            Object A0j2 = C36381kD.A0j();
            Object obj2 = map.get(r03);
            if (obj2 != null) {
                A0j2 = obj2;
            }
            r2.A01 = AnonymousClass000.A1X(A0j2);
            this.A01 = r2;
        }
    }

    public void B5N() {
        AnonymousClass6OG r1 = this.A01;
        if (r1 != null) {
            r1.A00();
            this.A01 = null;
        }
        this.A02 = null;
    }

    public C20981A1v(C198549dl r1) {
        this.A03 = r1;
    }
}
