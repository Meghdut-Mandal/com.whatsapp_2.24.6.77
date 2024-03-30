package X;

/* renamed from: X.4hb  reason: invalid class name and case insensitive filesystem */
public final class C94074hb extends AnonymousClass666 {
    public static final Object A05 = C36441kJ.A11();
    public int A00;
    public int A01;
    public int A02;
    public C06700Us A03;
    public Object A04 = A05;

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c7, code lost:
        r12 = r16;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02(X.C161537n4 r20, androidx.compose.runtime.snapshots.Snapshot r21) {
        /*
            r19 = this;
            java.lang.Object r1 = X.AnonymousClass6YQ.A07
            monitor-enter(r1)
            r0 = r19
            X.0Us r4 = r0.A03     // Catch:{ all -> 0x00dc }
            monitor-exit(r1)
            int r0 = r4.A01
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r12 = 7
            if (r0 == 0) goto L_0x00db
            X.76e r6 = X.C129756Ii.A00()
            int r3 = r6.A00
            r5 = r20
            if (r3 <= 0) goto L_0x0029
            java.lang.Object[] r2 = r6.A01
            r1 = 0
        L_0x001e:
            r0 = r2[r1]
            X.7iE r0 = (X.C158787iE) r0
            r0.BuK(r5)
            int r1 = r1 + 1
            if (r1 < r3) goto L_0x001e
        L_0x0029:
            java.lang.Object[] r11 = r4.A04     // Catch:{ all -> 0x00b2 }
            int[] r10 = r4.A02     // Catch:{ all -> 0x00b2 }
            long[] r9 = r4.A03     // Catch:{ all -> 0x00b2 }
            int r0 = r9.length     // Catch:{ all -> 0x00b2 }
            int r8 = r0 + -2
            if (r8 < 0) goto L_0x00c9
            r7 = 0
            r16 = 7
        L_0x0037:
            r1 = r9[r7]     // Catch:{ all -> 0x00b2 }
            long r3 = ~r1     // Catch:{ all -> 0x00b2 }
            long r3 = r3 << r12
            long r3 = r3 & r1
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r12
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x00a5
            int r4 = X.C90484aE.A06(r7, r8)
            r12 = 0
        L_0x004b:
            if (r12 >= r4) goto L_0x00a1
            r13 = 255(0xff, double:1.26E-321)
            long r17 = r1 & r13
            r13 = 128(0x80, double:6.32E-322)
            int r0 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x009b
            int r0 = r7 << 3
            int r0 = r0 + r12
            r15 = r11[r0]     // Catch:{ all -> 0x00b2 }
            r3 = r10[r0]     // Catch:{ all -> 0x00b2 }
            X.7k2 r15 = (X.C159857k2) r15     // Catch:{ all -> 0x00b2 }
            r0 = 1
            if (r3 != r0) goto L_0x009b
            boolean r0 = r15 instanceof X.C94014hV     // Catch:{ all -> 0x00b2 }
            r14 = r21
            if (r0 == 0) goto L_0x008a
            X.4hV r15 = (X.C94014hV) r15     // Catch:{ all -> 0x00b2 }
            X.4hb r0 = r15.A00     // Catch:{ all -> 0x00b2 }
            X.666 r13 = androidx.compose.runtime.snapshots.Snapshot.A02(r14, r0)     // Catch:{ all -> 0x00b2 }
            if (r13 == 0) goto L_0x00ab
            X.4hb r13 = (X.C94074hb) r13     // Catch:{ all -> 0x00b2 }
            X.00S r3 = r15.A02     // Catch:{ all -> 0x00b2 }
            r0 = 0
            X.4hb r13 = X.C94014hV.A00(r13, r15, r14, r3, r0)     // Catch:{ all -> 0x00b2 }
        L_0x007c:
            int r3 = r16 * 31
            int r0 = java.lang.System.identityHashCode(r13)     // Catch:{ all -> 0x00b2 }
            int r3 = r3 + r0
            int r16 = r3 * 31
            int r0 = r13.A00     // Catch:{ all -> 0x00b2 }
            int r16 = r16 + r0
            goto L_0x009b
        L_0x008a:
            X.666 r0 = r15.BBv()     // Catch:{ all -> 0x00b2 }
            X.666 r13 = androidx.compose.runtime.snapshots.Snapshot.A02(r14, r0)     // Catch:{ all -> 0x00b2 }
            if (r13 != 0) goto L_0x007c
            java.lang.String r0 = "Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x00b2 }
            goto L_0x00b1
        L_0x009b:
            r0 = 8
            long r1 = r1 >> r0
            int r12 = r12 + 1
            goto L_0x004b
        L_0x00a1:
            r0 = 8
            if (r4 != r0) goto L_0x00c7
        L_0x00a5:
            if (r7 == r8) goto L_0x00c7
            int r7 = r7 + 1
            r12 = 7
            goto L_0x0037
        L_0x00ab:
            java.lang.String r0 = "Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x00b2 }
        L_0x00b1:
            throw r0     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r4 = move-exception
            int r3 = r6.A00
            if (r3 <= 0) goto L_0x00c6
            java.lang.Object[] r2 = r6.A01
            r1 = 0
        L_0x00ba:
            r0 = r2[r1]
            X.7iE r0 = (X.C158787iE) r0
            r0.B5s(r5)
            int r1 = r1 + 1
            if (r1 >= r3) goto L_0x00c6
            goto L_0x00ba
        L_0x00c6:
            throw r4
        L_0x00c7:
            r12 = r16
        L_0x00c9:
            int r3 = r6.A00
            if (r3 <= 0) goto L_0x00db
            java.lang.Object[] r2 = r6.A01
            r1 = 0
        L_0x00d0:
            r0 = r2[r1]
            X.7iE r0 = (X.C158787iE) r0
            r0.B5s(r5)
            int r1 = r1 + 1
            if (r1 < r3) goto L_0x00d0
        L_0x00db:
            return r12
        L_0x00dc:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94074hb.A02(X.7n4, androidx.compose.runtime.snapshots.Snapshot):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r5.A02 != r7.A05()) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(X.C161537n4 r6, androidx.compose.runtime.snapshots.Snapshot r7) {
        /*
            r5 = this;
            java.lang.Object r4 = X.AnonymousClass6YQ.A07
            monitor-enter(r4)
            int r1 = r5.A01     // Catch:{ all -> 0x0039 }
            int r0 = r7.A04()     // Catch:{ all -> 0x0039 }
            r3 = 0
            if (r1 != r0) goto L_0x0015
            int r1 = r5.A02     // Catch:{ all -> 0x0039 }
            int r0 = r7.A05()     // Catch:{ all -> 0x0039 }
            r2 = 0
            if (r1 == r0) goto L_0x0016
        L_0x0015:
            r2 = 1
        L_0x0016:
            monitor-exit(r4)
            java.lang.Object r1 = r5.A04
            java.lang.Object r0 = A05
            if (r1 == r0) goto L_0x0038
            if (r2 == 0) goto L_0x0027
            int r1 = r5.A00
            int r0 = r5.A02(r6, r7)
            if (r1 != r0) goto L_0x0038
        L_0x0027:
            r3 = 1
            if (r2 == 0) goto L_0x0038
            monitor-enter(r4)
            int r0 = r7.A04()     // Catch:{ all -> 0x0039 }
            r5.A01 = r0     // Catch:{ all -> 0x0039 }
            int r0 = r7.A05()     // Catch:{ all -> 0x0039 }
            r5.A02 = r0     // Catch:{ all -> 0x0039 }
            monitor-exit(r4)
        L_0x0038:
            return r3
        L_0x0039:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94074hb.A03(X.7n4, androidx.compose.runtime.snapshots.Snapshot):boolean");
    }

    public C94074hb() {
        AnonymousClass0G9 r1 = AnonymousClass0RA.A00;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.A03 = r1;
    }
}
