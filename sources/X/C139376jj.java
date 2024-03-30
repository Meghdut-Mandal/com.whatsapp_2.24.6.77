package X;

/* renamed from: X.6jj  reason: invalid class name and case insensitive filesystem */
public class C139376jj implements AnonymousClass7eW {
    public final AnonymousClass682 A00;
    public final /* synthetic */ C133326Xw A01;

    public C139376jj(C133326Xw r1, AnonymousClass682 r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0017, code lost:
        if (r5.A01 != r5.A04) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x004b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00f6 A[Catch:{ all -> 0x013c }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0107 A[Catch:{ all -> 0x013c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel() {
        /*
            r14 = this;
            X.6Xw r4 = r14.A01
            java.lang.Object r2 = r4.A04
            monitor-enter(r2)
            X.682 r5 = r14.A00     // Catch:{ all -> 0x013f }
            monitor-enter(r5)     // Catch:{ all -> 0x013f }
            boolean r0 = r5.A03     // Catch:{ all -> 0x013c }
            monitor-exit(r5)     // Catch:{ all -> 0x013f }
            if (r0 != 0) goto L_0x0139
            monitor-enter(r5)     // Catch:{ all -> 0x013f }
            boolean r0 = r5.A03     // Catch:{ all -> 0x013c }
            if (r0 != 0) goto L_0x0019
            int r3 = r5.A01     // Catch:{ all -> 0x013c }
            int r1 = r5.A04     // Catch:{ all -> 0x013c }
            r0 = 1
            if (r3 == r1) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            monitor-exit(r5)     // Catch:{ all -> 0x013f }
            if (r0 != 0) goto L_0x0139
            X.6W8 r8 = r4.A01     // Catch:{ all -> 0x013f }
            monitor-enter(r5)     // Catch:{ all -> 0x013f }
            boolean r0 = r5.A03     // Catch:{ all -> 0x013c }
            monitor-exit(r5)     // Catch:{ all -> 0x013f }
            if (r0 != 0) goto L_0x0139
            monitor-enter(r5)     // Catch:{ all -> 0x013f }
            boolean r1 = r5.A03     // Catch:{ all -> 0x013c }
            r0 = 1
            if (r1 == 0) goto L_0x003c
            java.lang.String r6 = "ExternalLoadRequest"
            java.lang.String r4 = "Already finished: %s"
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ all -> 0x013c }
            r1 = 0
            X.6SG r0 = r5.A07     // Catch:{ all -> 0x013c }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x013c }
            r3[r1] = r0     // Catch:{ all -> 0x013c }
            X.AnonymousClass6YR.A0H(r6, r4, r3)     // Catch:{ all -> 0x013c }
            goto L_0x003e
        L_0x003c:
            r5.A03 = r0     // Catch:{ all -> 0x013c }
        L_0x003e:
            monitor-exit(r5)     // Catch:{ all -> 0x013f }
            java.util.Map r0 = r8.A04     // Catch:{ all -> 0x013f }
            java.util.List r0 = X.C90524aI.A0o(r5, r0)     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x012e
            java.util.Iterator r13 = X.C90474aD.A0r(r0)     // Catch:{ all -> 0x013f }
        L_0x004b:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x0129
            java.lang.Object r7 = r13.next()     // Catch:{ all -> 0x013f }
            X.679 r7 = (X.AnonymousClass679) r7     // Catch:{ all -> 0x013f }
            boolean r0 = r5.A00()     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x006a
            int r0 = r7.A01     // Catch:{ all -> 0x013f }
            int r1 = r0 + -1
            r7.A01 = r1     // Catch:{ all -> 0x013f }
            int r0 = r7.A00     // Catch:{ all -> 0x013f }
            if (r0 > 0) goto L_0x004b
            if (r1 <= 0) goto L_0x008b
            goto L_0x004b
        L_0x006a:
            int r0 = r7.A00     // Catch:{ all -> 0x013f }
            int r0 = r0 + -1
            r7.A00 = r0     // Catch:{ all -> 0x013f }
            if (r0 > 0) goto L_0x004b
            int r0 = r7.A01     // Catch:{ all -> 0x013f }
            if (r0 <= 0) goto L_0x008b
            java.util.Map r1 = r8.A02     // Catch:{ all -> 0x013f }
            X.6c3 r0 = r7.A03     // Catch:{ all -> 0x013f }
            X.6VA r0 = r0.A01     // Catch:{ all -> 0x013f }
            java.lang.String r0 = r0.A0A     // Catch:{ all -> 0x013f }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x013f }
            X.6MT r1 = (X.AnonymousClass6MT) r1     // Catch:{ all -> 0x013f }
            if (r1 == 0) goto L_0x004b
            r0 = 1
            r1.A01(r0)     // Catch:{ all -> 0x013f }
            goto L_0x004b
        L_0x008b:
            X.6c3 r0 = r7.A03     // Catch:{ all -> 0x013f }
            X.6VA r0 = r0.A01     // Catch:{ all -> 0x013f }
            java.lang.String r6 = r0.A0A     // Catch:{ all -> 0x013f }
            java.util.Map r1 = r8.A02     // Catch:{ all -> 0x013f }
            java.lang.Object r0 = r1.get(r6)     // Catch:{ all -> 0x013f }
            X.6MT r0 = (X.AnonymousClass6MT) r0     // Catch:{ all -> 0x013f }
            r12 = 1
            if (r0 != 0) goto L_0x00a4
            boolean r0 = r7.A02     // Catch:{ all -> 0x013f }
            if (r0 != 0) goto L_0x0102
            X.AnonymousClass6W8.A03(r7, r8)     // Catch:{ all -> 0x013f }
            goto L_0x00ff
        L_0x00a4:
            X.6Ug r9 = r0.A01     // Catch:{ all -> 0x013f }
            java.lang.Object r4 = r9.A03     // Catch:{ all -> 0x013f }
            monitor-enter(r4)     // Catch:{ all -> 0x013f }
            X.6NA r3 = r0.A00     // Catch:{ all -> 0x0126 }
            java.lang.Integer r11 = r3.A00     // Catch:{ all -> 0x0126 }
            java.lang.Integer r0 = X.C023109s.A0G     // Catch:{ all -> 0x0126 }
            if (r11 == r0) goto L_0x0101
            java.lang.Integer r10 = X.C023109s.A0R     // Catch:{ all -> 0x0126 }
            if (r11 == r10) goto L_0x0101
            X.6NA r0 = r9.A00     // Catch:{ all -> 0x0126 }
            if (r0 != r3) goto L_0x00e7
            java.util.Map r0 = r9.A05     // Catch:{ all -> 0x0126 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0126 }
            com.facebook.cameracore.ardelivery.listener.CancelableToken r0 = (com.facebook.cameracore.ardelivery.listener.CancelableToken) r0     // Catch:{ all -> 0x0126 }
            boolean r11 = r0.cancel()     // Catch:{ all -> 0x0126 }
            if (r11 == 0) goto L_0x00de
            r0 = 0
            r9.A00 = r0     // Catch:{ all -> 0x0126 }
        L_0x00ca:
            r3.A00(r10)     // Catch:{ all -> 0x0126 }
            java.util.Map r10 = r9.A06     // Catch:{ all -> 0x0126 }
            X.6c3 r0 = r3.A04     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = r0.A08     // Catch:{ all -> 0x0126 }
            java.lang.Object r0 = r10.remove(r0)     // Catch:{ all -> 0x0126 }
            if (r0 != r3) goto L_0x0120
            java.util.Map r0 = r9.A05     // Catch:{ all -> 0x0126 }
            r0.remove(r3)     // Catch:{ all -> 0x0126 }
        L_0x00de:
            X.C132556Ug.A01(r9)     // Catch:{ all -> 0x0126 }
            java.util.ArrayList r0 = X.C132556Ug.A00(r9)     // Catch:{ all -> 0x0126 }
            monitor-exit(r4)     // Catch:{ all -> 0x0126 }
            goto L_0x00f1
        L_0x00e7:
            java.util.Queue r0 = r9.A07     // Catch:{ all -> 0x0126 }
            boolean r0 = r0.remove(r3)     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x010c
            r11 = 1
            goto L_0x00ca
        L_0x00f1:
            X.C132556Ug.A02(r9, r0)     // Catch:{ all -> 0x013f }
            if (r11 == 0) goto L_0x0102
            r0 = 0
            r7.A02 = r0     // Catch:{ all -> 0x013f }
            X.AnonymousClass6W8.A03(r7, r8)     // Catch:{ all -> 0x013f }
            r1.remove(r6)     // Catch:{ all -> 0x013f }
        L_0x00ff:
            r12 = 0
            goto L_0x0102
        L_0x0101:
            monitor-exit(r4)     // Catch:{ all -> 0x0126 }
        L_0x0102:
            X.AnonymousClass6W8.A00(r7, r8)     // Catch:{ all -> 0x013f }
            if (r12 == 0) goto L_0x004b
            X.AnonymousClass6W8.A02(r7, r8)     // Catch:{ all -> 0x013f }
            goto L_0x004b
        L_0x010c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = "Cancelling download which is not current or queued: state="
            r1.append(r0)     // Catch:{ all -> 0x0126 }
            java.lang.Integer r0 = r3.A00     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = X.AnonymousClass5YB.A00(r0)     // Catch:{ all -> 0x0126 }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r0, r1)     // Catch:{ all -> 0x0126 }
            goto L_0x0125
        L_0x0120:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0126 }
            r0.<init>()     // Catch:{ all -> 0x0126 }
        L_0x0125:
            throw r0     // Catch:{ all -> 0x0126 }
        L_0x0126:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0126 }
            goto L_0x013e
        L_0x0129:
            r8.A04(r5)     // Catch:{ all -> 0x013f }
            r0 = 1
            goto L_0x013a
        L_0x012e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x013f }
            java.lang.String r0 = "ExternalLoadRequest not present in mExternalToInternalMap: "
            java.lang.IllegalArgumentException r0 = X.C90464aC.A0P(r5, r0, r1)     // Catch:{ all -> 0x013f }
            goto L_0x013e
        L_0x0139:
            r0 = 0
        L_0x013a:
            monitor-exit(r2)     // Catch:{ all -> 0x013f }
            return r0
        L_0x013c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x013f }
        L_0x013e:
            throw r0     // Catch:{ all -> 0x013f }
        L_0x013f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x013f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139376jj.cancel():boolean");
    }
}
