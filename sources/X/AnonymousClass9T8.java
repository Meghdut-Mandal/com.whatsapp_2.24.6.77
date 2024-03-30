package X;

/* renamed from: X.9T8  reason: invalid class name */
public abstract class AnonymousClass9T8 {
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ca, code lost:
        if (r5.A02 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cc, code lost:
        r5.A01.countDown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(java.lang.Exception r8) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C1692288g
            if (r0 == 0) goto L_0x0022
            r5 = r7
            X.88g r5 = (X.C1692288g) r5
            X.9T8 r0 = r5.A01
            r0.A00(r8)
            X.9St r0 = r5.A02
            X.9gr r4 = r0.A0A
            android.hardware.camera2.CaptureRequest$Builder r3 = r5.A00
            X.A2F r1 = r5.A03
            boolean r0 = r5.A04
            X.AYh r2 = new X.AYh
            r2.<init>(r3, r5, r1, r0)
            java.lang.String r1 = "restart_preview_video_recording_failed"
            r0 = 0
            r4.A00(r0, r1, r2)
        L_0x0021:
            return
        L_0x0022:
            boolean r0 = r7 instanceof X.C1692188f
            if (r0 == 0) goto L_0x005e
            r5 = r7
            X.88f r5 = (X.C1692188f) r5
            X.C202389lj.A00()
            X.A29 r6 = r5.A01
            X.9gr r4 = r6.A0S
            X.9jb r0 = r6.A0R
            java.util.UUID r3 = r0.A03
            X.61X r2 = r5.A00
            r1 = 46
            X.75C r0 = new X.75C
            r0.<init>((java.lang.Object) r2, (java.lang.Object) r8, (int) r1)
            r4.A05(r0, r3)
            java.util.HashSet r0 = X.C197019az.A00
            boolean r0 = X.C200349hC.A02(r0)
            if (r0 == 0) goto L_0x0050
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.A0T
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0021
        L_0x0050:
            X.9e8 r2 = r5.A02
            r0 = 7
            X.B8X r1 = new X.B8X
            r1.<init>(r2, r5, r0)
            java.lang.String r0 = "take_photo_exception_restart_preview"
            r4.A07(r0, r1)
            return
        L_0x005e:
            boolean r0 = r7 instanceof X.C1691988d
            if (r0 != 0) goto L_0x0021
            boolean r0 = r7 instanceof X.B6y
            if (r0 == 0) goto L_0x0086
            r1 = r7
            X.B6y r1 = (X.B6y) r1
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x00fa;
                case 1: goto L_0x00f2;
                case 2: goto L_0x0021;
                case 3: goto L_0x006e;
                case 4: goto L_0x006e;
                case 5: goto L_0x00e3;
                case 6: goto L_0x00df;
                case 7: goto L_0x00d2;
                default: goto L_0x006e;
            }
        L_0x006e:
            java.lang.Object r2 = r1.A00
            X.A0j r2 = (X.C20952A0j) r2
            boolean r0 = r2.A0H
            if (r0 != 0) goto L_0x0021
            java.lang.Object[] r1 = X.AnonymousClass001.A0M()
            X.9VB r0 = r2.A0Q
            java.util.List r0 = r0.A00
            X.C90494aF.A1H(r0, r8, r1)
            r0 = 3
            X.C20952A0j.A04(r2, r1, r0)
            return
        L_0x0086:
            boolean r0 = r7 instanceof X.C23138B6x
            if (r0 == 0) goto L_0x00a3
            r2 = r7
            X.B6x r2 = (X.C23138B6x) r2
            int r0 = r2.A02
            java.lang.Object r1 = r2.A00
            if (r0 == 0) goto L_0x0120
            X.9fa r1 = (X.C199599fa) r1
            r0 = 0
            r1.A0F = r0
            X.C202389lj.A00()
            java.lang.Object r0 = r2.A01
            X.61X r0 = (X.AnonymousClass61X) r0
            r1.A03(r0, r8)
            return
        L_0x00a3:
            r5 = r7
            X.88e r5 = (X.C1692088e) r5
            X.A0j r4 = r5.A00
            java.lang.Object r3 = r4.A0R
            monitor-enter(r3)
            boolean r0 = r4.A0b     // Catch:{ all -> 0x012e }
            if (r0 != 0) goto L_0x00b1
            monitor-exit(r3)     // Catch:{ all -> 0x012e }
            goto L_0x012d
        L_0x00b1:
            r0 = 0
            r4.A0b = r0     // Catch:{ all -> 0x012e }
            X.9EN r2 = r4.A0a     // Catch:{ all -> 0x012e }
            r0 = 0
            r4.A0a = r0     // Catch:{ all -> 0x012e }
            if (r2 == 0) goto L_0x00c7
            java.lang.Object[] r1 = X.AnonymousClass001.A0M()     // Catch:{ all -> 0x012e }
            X.C90494aF.A1H(r2, r8, r1)     // Catch:{ all -> 0x012e }
            r0 = 10
            X.C20952A0j.A04(r4, r1, r0)     // Catch:{ all -> 0x012e }
        L_0x00c7:
            monitor-exit(r3)     // Catch:{ all -> 0x012e }
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0021
            java.util.concurrent.CountDownLatch r0 = r5.A01
            r0.countDown()
            return
        L_0x00d2:
            java.lang.Object r0 = r1.A00
            X.A28 r0 = (X.A28) r0
            X.9YE r2 = r0.A0P
            java.lang.Integer r1 = X.C023109s.A0S
            r0 = 0
            r2.A04(r1, r0)
            return
        L_0x00df:
            X.C202389lj.A01(r8)
            return
        L_0x00e3:
            java.lang.Object r0 = r1.A00
            X.A29 r0 = (X.A29) r0
            X.9eX r3 = r0.A0J
            java.lang.Integer r2 = X.C023109s.A0S
            r1 = 0
            X.7eh r0 = r3.A02
            X.C198999eX.A00(r1, r0, r3, r2)
            return
        L_0x00f2:
            java.lang.Object r1 = r1.A00
            X.A0j r1 = (X.C20952A0j) r1
            r0 = 0
            r1.A0D = r0
            return
        L_0x00fa:
            java.lang.Object r4 = r1.A00
            X.A0j r4 = (X.C20952A0j) r4
            java.lang.Object r3 = r4.A0R
            monitor-enter(r3)
            boolean r0 = r4.A0b     // Catch:{ all -> 0x011d }
            if (r0 == 0) goto L_0x011b
            r0 = 0
            r4.A0b = r0     // Catch:{ all -> 0x011d }
            X.9EN r2 = r4.A0a     // Catch:{ all -> 0x011d }
            r0 = 0
            r4.A0a = r0     // Catch:{ all -> 0x011d }
            if (r2 == 0) goto L_0x011b
            java.lang.Object[] r1 = X.AnonymousClass001.A0M()     // Catch:{ all -> 0x011d }
            X.C90494aF.A1H(r2, r8, r1)     // Catch:{ all -> 0x011d }
            r0 = 10
            X.C20952A0j.A04(r4, r1, r0)     // Catch:{ all -> 0x011d }
        L_0x011b:
            monitor-exit(r3)     // Catch:{ all -> 0x011d }
            return
        L_0x011d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x011d }
            throw r0
        L_0x0120:
            X.A29 r1 = (X.A29) r1
            r0 = 0
            r1.A0e = r0
            java.lang.Object r0 = r2.A01
            X.9T8 r0 = (X.AnonymousClass9T8) r0
            r0.A00(r8)
            return
        L_0x012d:
            return
        L_0x012e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x012e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9T8.A00(java.lang.Exception):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ce, code lost:
        if (r5.A02 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d0, code lost:
        r5.A01.countDown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C1692288g
            if (r0 == 0) goto L_0x0015
            r3 = r6
            X.88g r3 = (X.C1692288g) r3
            X.9St r2 = r3.A02
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.A00 = r0
            X.9T8 r0 = r3.A01
        L_0x0011:
            r0.A01(r7)
        L_0x0014:
            return
        L_0x0015:
            boolean r0 = r6 instanceof X.C1692188f
            if (r0 != 0) goto L_0x0014
            boolean r0 = r6 instanceof X.C1691988d
            if (r0 != 0) goto L_0x0014
            boolean r0 = r6 instanceof X.B6y
            if (r0 == 0) goto L_0x008e
            r2 = r6
            X.B6y r2 = (X.B6y) r2
            int r0 = r2.A01
            switch(r0) {
                case 0: goto L_0x00fd;
                case 1: goto L_0x00f5;
                case 2: goto L_0x00d6;
                case 3: goto L_0x0063;
                case 4: goto L_0x002a;
                default: goto L_0x0029;
            }
        L_0x0029:
            return
        L_0x002a:
            X.9JP r7 = (X.AnonymousClass9JP) r7
            java.lang.Object r3 = r2.A00
            X.A0j r3 = (X.C20952A0j) r3
            r3.A0D = r7
            boolean r0 = r3.A0H
            if (r0 != 0) goto L_0x0014
            X.C20952A0j.A02(r3, r7)
            X.B3p r1 = r3.A0L
            if (r1 == 0) goto L_0x0014
            boolean r0 = r1.isConnected()
            if (r0 == 0) goto L_0x0014
            int r2 = r1.B9I()
            r0 = 0
            if (r2 == 0) goto L_0x0058
            r0 = 1
            if (r0 == r2) goto L_0x0058
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Could not convert camera facing from optic: "
            java.lang.RuntimeException r0 = X.C165567td.A0U(r0, r1, r2)
            throw r0
        L_0x0058:
            r3.A00 = r0
            X.C20952A0j.A03(r3, r7)
            X.9VB r0 = r3.A0Q
            java.util.List r1 = r0.A00
            r0 = 2
            goto L_0x008a
        L_0x0063:
            X.9JP r7 = (X.AnonymousClass9JP) r7
            java.lang.Object r3 = r2.A00
            X.A0j r3 = (X.C20952A0j) r3
            r3.A0D = r7
            boolean r0 = r3.A0H
            if (r0 != 0) goto L_0x0014
            X.C20952A0j.A02(r3, r7)
            X.C20952A0j.A03(r3, r7)
            X.B3p r1 = r3.A0L
            X.9Bw r0 = r3.A0J
            r1.BrN(r0)
            X.7eb r0 = r3.A0A
            if (r0 == 0) goto L_0x0085
            X.AxY r0 = r3.A0N
            r1.B0b(r0)
        L_0x0085:
            X.9VB r0 = r3.A0Q
            java.util.List r1 = r0.A00
            r0 = 1
        L_0x008a:
            X.C20952A0j.A04(r3, r1, r0)
            return
        L_0x008e:
            boolean r0 = r6 instanceof X.C23138B6x
            if (r0 == 0) goto L_0x00a7
            r1 = r6
            X.B6x r1 = (X.C23138B6x) r1
            int r0 = r1.A02
            if (r0 == 0) goto L_0x00a1
            java.lang.Object r1 = r1.A00
            X.9fa r1 = (X.C199599fa) r1
            r0 = 0
            r1.A0F = r0
            return
        L_0x00a1:
            java.lang.Object r0 = r1.A01
            X.9T8 r0 = (X.AnonymousClass9T8) r0
            goto L_0x0011
        L_0x00a7:
            r5 = r6
            X.88e r5 = (X.C1692088e) r5
            X.A0j r4 = r5.A00
            java.lang.Object r3 = r4.A0R
            monitor-enter(r3)
            boolean r0 = r4.A0b     // Catch:{ all -> 0x011e }
            if (r0 != 0) goto L_0x00b5
            monitor-exit(r3)     // Catch:{ all -> 0x011e }
            goto L_0x011d
        L_0x00b5:
            r0 = 0
            r4.A0b = r0     // Catch:{ all -> 0x011e }
            X.9EN r2 = r4.A0a     // Catch:{ all -> 0x011e }
            r0 = 0
            r4.A0a = r0     // Catch:{ all -> 0x011e }
            if (r2 == 0) goto L_0x00cb
            java.lang.Object[] r1 = X.AnonymousClass001.A0M()     // Catch:{ all -> 0x011e }
            X.C90494aF.A1H(r2, r7, r1)     // Catch:{ all -> 0x011e }
            r0 = 9
            X.C20952A0j.A04(r4, r1, r0)     // Catch:{ all -> 0x011e }
        L_0x00cb:
            monitor-exit(r3)     // Catch:{ all -> 0x011e }
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0014
            java.util.concurrent.CountDownLatch r0 = r5.A01
            r0.countDown()
            return
        L_0x00d6:
            r0 = 4
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.Object r2 = r2.A00
            X.A0j r2 = (X.C20952A0j) r2
            r0 = 0
            r3[r0] = r2
            X.9JP r1 = r2.A0D
            r0 = 1
            r3[r0] = r1
            int r0 = r2.A08
            X.C36331k8.A1V(r3, r0)
            int r0 = r2.A06
            X.C36341k9.A1T(r3, r0)
            r0 = 15
            X.C20952A0j.A04(r2, r3, r0)
            return
        L_0x00f5:
            r1 = 0
            java.lang.Object r0 = r2.A00
            X.A0j r0 = (X.C20952A0j) r0
            r0.A0D = r1
            return
        L_0x00fd:
            java.lang.Object r3 = r2.A00
            X.A0j r3 = (X.C20952A0j) r3
            java.lang.Object r2 = r3.A0R
            monitor-enter(r2)
            boolean r0 = r3.A0b     // Catch:{ all -> 0x011a }
            if (r0 == 0) goto L_0x0118
            X.9EN r0 = r3.A0a     // Catch:{ all -> 0x011a }
            if (r0 == 0) goto L_0x0118
            java.lang.Object[] r1 = X.AnonymousClass001.A0M()     // Catch:{ all -> 0x011a }
            X.C36331k8.A1N(r0, r7, r1)     // Catch:{ all -> 0x011a }
            r0 = 8
            X.C20952A0j.A04(r3, r1, r0)     // Catch:{ all -> 0x011a }
        L_0x0118:
            monitor-exit(r2)     // Catch:{ all -> 0x011a }
            return
        L_0x011a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x011a }
            throw r0
        L_0x011d:
            return
        L_0x011e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x011e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9T8.A01(java.lang.Object):void");
    }
}
