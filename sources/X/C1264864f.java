package X;

/* renamed from: X.64f  reason: invalid class name and case insensitive filesystem */
public final class C1264864f {
    public final C130536Ll A00;
    public final C006302t A01 = C155487Wg.A00;
    public final C006302t A02 = C155497Wh.A00;
    public final C006302t A03 = C155507Wi.A00;
    public final C006302t A04 = C155517Wj.A00;
    public final C006302t A05 = C155527Wk.A00;
    public final C006302t A06 = C155537Wl.A00;
    public final C006302t A07 = C155547Wm.A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass7e1 r27, X.AnonymousClass00S r28, X.C006302t r29) {
        /*
            r26 = this;
            r0 = r26
            X.6Ll r9 = r0.A00
            X.76e r5 = r9.A05
            monitor-enter(r5)
            int r4 = r5.A00     // Catch:{ all -> 0x0168 }
            r3 = 1
            r6 = r29
            if (r4 <= 0) goto L_0x001e
            java.lang.Object[] r2 = r5.A01     // Catch:{ all -> 0x0168 }
            r1 = 0
        L_0x0011:
            r11 = r2[r1]     // Catch:{ all -> 0x0168 }
            r0 = r11
            X.6Lr r0 = (X.C130596Lr) r0     // Catch:{ all -> 0x0168 }
            X.02t r0 = r0.A0B     // Catch:{ all -> 0x0168 }
            if (r0 == r6) goto L_0x001f
            int r1 = r1 + 1
            if (r1 < r4) goto L_0x0011
        L_0x001e:
            r11 = 0
        L_0x001f:
            X.6Lr r11 = (X.C130596Lr) r11     // Catch:{ all -> 0x0168 }
            if (r11 != 0) goto L_0x0033
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>"
            X.AnonymousClass00C.A0E(r6, r0)     // Catch:{ all -> 0x0168 }
            X.C07710Yz.A03(r6, r3)     // Catch:{ all -> 0x0168 }
            X.6Lr r11 = new X.6Lr     // Catch:{ all -> 0x0168 }
            r11.<init>(r6)     // Catch:{ all -> 0x0168 }
            r5.A0D(r11)     // Catch:{ all -> 0x0168 }
        L_0x0033:
            monitor-exit(r5)
            boolean r0 = r9.A03
            r25 = r0
            X.6Lr r12 = r9.A02
            long r1 = r9.A00
            r3 = -1
            r6 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x007a
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            long r3 = r5.getId()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x007a
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Detected multithreaded access to SnapshotStateObserver: previousThreadId="
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "), currentThread={id="
            r3.append(r0)
            long r0 = r5.getId()
            r3.append(r0)
            java.lang.String r0 = ", name="
            r3.append(r0)
            java.lang.String r0 = r5.getName()
            r3.append(r0)
            java.lang.String r0 = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread."
            java.lang.IllegalArgumentException r3 = X.AnonymousClass000.A0c(r0, r3)
            throw r3
        L_0x007a:
            r9.A03 = r6     // Catch:{ all -> 0x015e }
            r9.A02 = r11     // Catch:{ all -> 0x015e }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x015e }
            long r3 = r0.getId()     // Catch:{ all -> 0x015e }
            r9.A00 = r3     // Catch:{ all -> 0x015e }
            X.02t r5 = r9.A08     // Catch:{ all -> 0x015e }
            java.lang.Object r0 = r11.A03     // Catch:{ all -> 0x015e }
            r24 = r0
            X.0G9 r0 = r11.A02     // Catch:{ all -> 0x015e }
            r23 = r0
            int r0 = r11.A00     // Catch:{ all -> 0x015e }
            r22 = r0
            r3 = r27
            r11.A03 = r3     // Catch:{ all -> 0x015e }
            X.0GA r0 = r11.A04     // Catch:{ all -> 0x015e }
            java.lang.Object r0 = r0.A02(r3)     // Catch:{ all -> 0x015e }
            X.0G9 r0 = (X.AnonymousClass0G9) r0     // Catch:{ all -> 0x015e }
            r11.A02 = r0     // Catch:{ all -> 0x015e }
            int r3 = r11.A00     // Catch:{ all -> 0x015e }
            r0 = -1
            if (r3 != r0) goto L_0x00b3
            androidx.compose.runtime.snapshots.Snapshot r0 = X.AnonymousClass6YQ.A00()     // Catch:{ all -> 0x015e }
            int r0 = r0.A04()     // Catch:{ all -> 0x015e }
            r11.A00 = r0     // Catch:{ all -> 0x015e }
        L_0x00b3:
            X.7iE r0 = r11.A06     // Catch:{ all -> 0x015e }
            X.76e r4 = X.C129756Ii.A00()     // Catch:{ all -> 0x015e }
            r4.A0D(r0)     // Catch:{ all -> 0x0155 }
            r0 = r28
            X.AnonymousClass6VV.A03(r0, r5)     // Catch:{ all -> 0x0155 }
            int r0 = r4.A00     // Catch:{ all -> 0x015e }
            int r0 = r0 + -1
            r4.A04(r0)     // Catch:{ all -> 0x015e }
            java.lang.Object r0 = r11.A03     // Catch:{ all -> 0x015e }
            r21 = r0
            X.AnonymousClass00C.A0B(r21)     // Catch:{ all -> 0x015e }
            int r0 = r11.A00     // Catch:{ all -> 0x015e }
            r20 = r0
            X.0G9 r15 = r11.A02     // Catch:{ all -> 0x015e }
            if (r15 == 0) goto L_0x0140
            long[] r14 = r15.A03     // Catch:{ all -> 0x015e }
            int r0 = r14.length     // Catch:{ all -> 0x015e }
            int r13 = r0 + -2
            if (r13 < 0) goto L_0x0140
            r10 = 0
        L_0x00df:
            r18 = r14[r10]     // Catch:{ all -> 0x015e }
            long r5 = X.AnonymousClass000.A0Q(r18)
            r3 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r3
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x013b
            int r0 = r10 - r13
            int r0 = ~r0
            int r0 = r0 >>> 31
            r8 = 8
            int r7 = 8 - r0
            r6 = 0
        L_0x00f9:
            if (r6 >= r7) goto L_0x0139
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r16 & r18
            r3 = 128(0x80, double:6.32E-322)
            int r0 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0134
            int r5 = r10 << 3
            int r5 = r5 + r6
            java.lang.Object[] r0 = r15.A04     // Catch:{ all -> 0x015e }
            r4 = r0[r5]     // Catch:{ all -> 0x015e }
            int[] r0 = r15.A02     // Catch:{ all -> 0x015e }
            r3 = r0[r5]     // Catch:{ all -> 0x015e }
            r0 = r20
            if (r3 == r0) goto L_0x0134
            X.68K r3 = r11.A09     // Catch:{ all -> 0x015e }
            r0 = r21
            r3.A02(r4, r0)     // Catch:{ all -> 0x015e }
            boolean r0 = r4 instanceof X.C161537n4     // Catch:{ all -> 0x015e }
            if (r0 == 0) goto L_0x0131
            X.0GA r0 = r3.A00     // Catch:{ all -> 0x015e }
            boolean r0 = r0.A03(r4)     // Catch:{ all -> 0x015e }
            if (r0 != 0) goto L_0x0131
            X.68K r0 = r11.A08     // Catch:{ all -> 0x015e }
            r0.A00(r4)     // Catch:{ all -> 0x015e }
            java.util.HashMap r0 = r11.A0A     // Catch:{ all -> 0x015e }
            r0.remove(r4)     // Catch:{ all -> 0x015e }
        L_0x0131:
            r15.A04(r5)     // Catch:{ all -> 0x015e }
        L_0x0134:
            long r18 = r18 >> r8
            int r6 = r6 + 1
            goto L_0x00f9
        L_0x0139:
            if (r7 != r8) goto L_0x0140
        L_0x013b:
            if (r10 == r13) goto L_0x0140
            int r10 = r10 + 1
            goto L_0x00df
        L_0x0140:
            r0 = r24
            r11.A03 = r0     // Catch:{ all -> 0x015e }
            r0 = r23
            r11.A02 = r0     // Catch:{ all -> 0x015e }
            r0 = r22
            r11.A00 = r0     // Catch:{ all -> 0x015e }
            r9.A02 = r12
            r0 = r25
            r9.A03 = r0
            r9.A00 = r1
            return
        L_0x0155:
            r3 = move-exception
            int r0 = r4.A00     // Catch:{ all -> 0x015e }
            int r0 = r0 + -1
            r4.A04(r0)     // Catch:{ all -> 0x015e }
            throw r3     // Catch:{ all -> 0x015e }
        L_0x015e:
            r3 = move-exception
            r9.A02 = r12
            r0 = r25
            r9.A03 = r0
            r9.A00 = r1
            throw r3
        L_0x0168:
            r3 = move-exception
            monitor-exit(r5)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1264864f.A00(X.7e1, X.00S, X.02t):void");
    }

    public C1264864f(C006302t r2) {
        this.A00 = new C130536Ll(r2);
    }
}
