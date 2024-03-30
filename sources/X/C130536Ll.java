package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6Ll  reason: invalid class name and case insensitive filesystem */
public final class C130536Ll {
    public long A00 = -1;
    public C157617dp A01;
    public C130596Lr A02;
    public boolean A03;
    public boolean A04;
    public final C1506776e A05 = C1506776e.A02(new C130596Lr[16]);
    public final AtomicReference A06 = C90514aH.A18();
    public final C006302t A07;
    public final C006302t A08 = new AnonymousClass7RF(this);
    public final C009003v A09 = new C155897Xw(this);

    public static void A00(AnonymousClass0GB r1, Object[] objArr, int i, int i2) {
        r1.A06(objArr[(i << 3) + i2]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0475, code lost:
        if (r0 != false) goto L_0x0477;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(X.C130536Ll r42) {
        /*
            r0 = r42
            X.76e r2 = r0.A05
            monitor-enter(r2)
            boolean r1 = r0.A04     // Catch:{ all -> 0x04bb }
            monitor-exit(r2)
            r0 = 0
            if (r1 == 0) goto L_0x000c
            return r0
        L_0x000c:
            r26 = 0
        L_0x000e:
            r0 = r42
            java.util.concurrent.atomic.AtomicReference r7 = r0.A06
            java.lang.Object r6 = r7.get()
            r5 = 0
            if (r6 == 0) goto L_0x04ba
            boolean r0 = r6 instanceof java.util.Set
            if (r0 == 0) goto L_0x0484
            r0 = r6
            java.util.Set r0 = (java.util.Set) r0
            r29 = r0
        L_0x0022:
            boolean r0 = r7.compareAndSet(r6, r5)
            if (r0 == 0) goto L_0x000e
            if (r29 == 0) goto L_0x04ba
            monitor-enter(r2)
            int r0 = r2.A00     // Catch:{ all -> 0x04bb }
            r30 = r0
            if (r0 <= 0) goto L_0x0481
            java.lang.Object[] r0 = r2.A01     // Catch:{ all -> 0x04bb }
            r28 = r0
            r27 = 0
        L_0x0037:
            r1 = r28[r27]     // Catch:{ all -> 0x04bb }
            X.6Lr r1 = (X.C130596Lr) r1     // Catch:{ all -> 0x04bb }
            X.68K r0 = r1.A08     // Catch:{ all -> 0x04bb }
            r41 = r0
            java.util.HashMap r0 = r1.A0A     // Catch:{ all -> 0x04bb }
            r40 = r0
            X.68K r3 = r1.A09     // Catch:{ all -> 0x04bb }
            X.0GB r6 = r1.A05     // Catch:{ all -> 0x04bb }
            r0 = r29
            boolean r0 = r0 instanceof X.C1506876f     // Catch:{ all -> 0x04bb }
            java.lang.String r32 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>"
            r14 = 7
            r13 = 2
            if (r0 == 0) goto L_0x0216
            r4 = r29
            X.76f r4 = (X.C1506876f) r4     // Catch:{ all -> 0x04bb }
            java.lang.Object[] r0 = r4.A01     // Catch:{ all -> 0x04bb }
            r39 = r0
            int r37 = r4.size()     // Catch:{ all -> 0x04bb }
            r11 = 0
            r31 = 0
        L_0x0060:
            r0 = r37
            if (r11 >= r0) goto L_0x03d3
            r0 = r39
            java.lang.Object r10 = X.C90524aI.A0d(r0, r11)     // Catch:{ all -> 0x04bb }
            boolean r0 = r10 instanceof X.C137226fn     // Catch:{ all -> 0x04bb }
            if (r0 == 0) goto L_0x007b
            r0 = r10
            X.6fn r0 = (X.C137226fn) r0     // Catch:{ all -> 0x04bb }
            X.79W r0 = r0.A00     // Catch:{ all -> 0x04bb }
            int r0 = r0.get()     // Catch:{ all -> 0x04bb }
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0210
        L_0x007b:
            r0 = r41
            X.0GA r4 = r0.A00     // Catch:{ all -> 0x04bb }
            boolean r0 = r4.A03(r10)     // Catch:{ all -> 0x04bb }
            if (r0 == 0) goto L_0x01bd
            java.lang.Object r4 = r4.A02(r10)     // Catch:{ all -> 0x04bb }
            if (r4 == 0) goto L_0x01bd
            boolean r0 = r4 instanceof X.AnonymousClass0GB     // Catch:{ all -> 0x04bb }
            if (r0 == 0) goto L_0x014d
            X.0GB r4 = (X.AnonymousClass0GB) r4     // Catch:{ all -> 0x04bb }
            java.lang.Object[] r0 = r4.A03     // Catch:{ all -> 0x04bb }
            r36 = r0
            long[] r0 = r4.A02     // Catch:{ all -> 0x04bb }
            r35 = r0
            int r12 = r0.length     // Catch:{ all -> 0x04bb }
            int r12 = r12 - r13
            if (r12 < 0) goto L_0x01bd
            r9 = 0
        L_0x009e:
            r4 = r35[r9]     // Catch:{ all -> 0x04bb }
            long r7 = ~r4     // Catch:{ all -> 0x04bb }
            long r7 = r7 << r14
            long r7 = r7 & r4
            r33 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r33
            int r0 = (r7 > r33 ? 1 : (r7 == r33 ? 0 : -1))
            if (r0 == 0) goto L_0x0146
            int r25 = X.C90484aE.A06(r9, r12)
            r7 = 0
        L_0x00b3:
            r0 = r25
            if (r7 >= r0) goto L_0x0142
            r23 = 255(0xff, double:1.26E-321)
            long r13 = r4 & r23
            r21 = 128(0x80, double:6.32E-322)
            int r0 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r0 >= 0) goto L_0x013b
            int r0 = r9 << 3
            int r0 = r0 + r7
            r8 = r36[r0]     // Catch:{ all -> 0x04bb }
            X.7n4 r8 = (X.C161537n4) r8     // Catch:{ all -> 0x04bb }
            r0 = r32
            X.AnonymousClass00C.A0E(r8, r0)     // Catch:{ all -> 0x04bb }
            r0 = r40
            java.lang.Object r14 = r0.get(r8)     // Catch:{ all -> 0x04bb }
            X.7dm r13 = X.C94014hV.A01(r8)     // Catch:{ all -> 0x04bb }
            X.4hb r0 = r8.BAf()     // Catch:{ all -> 0x04bb }
            java.lang.Object r0 = r0.A04     // Catch:{ all -> 0x04bb }
            boolean r0 = r13.B6k(r0, r14)     // Catch:{ all -> 0x04bb }
            if (r0 != 0) goto L_0x0133
            X.0GA r0 = r3.A00     // Catch:{ all -> 0x04bb }
            java.lang.Object r8 = r0.A02(r8)     // Catch:{ all -> 0x04bb }
            if (r8 == 0) goto L_0x013b
            boolean r0 = r8 instanceof X.AnonymousClass0GB     // Catch:{ all -> 0x04bb }
            if (r0 == 0) goto L_0x012f
            X.0GB r8 = (X.AnonymousClass0GB) r8     // Catch:{ all -> 0x04bb }
            java.lang.Object[] r0 = r8.A03     // Catch:{ all -> 0x04bb }
            r38 = r0
            long[] r0 = r8.A02     // Catch:{ all -> 0x04bb }
            r20 = r0
            int r14 = r0.length     // Catch:{ all -> 0x04bb }
            r0 = 2
            int r14 = r14 - r0
            if (r14 < 0) goto L_0x013b
            r13 = 0
        L_0x00ff:
            r18 = r20[r13]     // Catch:{ all -> 0x04bb }
            long r15 = X.AnonymousClass000.A0Q(r18)
            long r15 = r15 & r33
            int r0 = (r15 > r33 ? 1 : (r15 == r33 ? 0 : -1))
            if (r0 == 0) goto L_0x012a
            int r8 = X.C90484aE.A06(r13, r14)
            r15 = 0
        L_0x0110:
            if (r15 >= r8) goto L_0x0126
            long r16 = r18 & r23
            int r0 = (r16 > r21 ? 1 : (r16 == r21 ? 0 : -1))
            r16 = 8
            if (r0 >= 0) goto L_0x0121
            r0 = r38
            A00(r6, r0, r13, r15)     // Catch:{ all -> 0x04bb }
            r31 = 1
        L_0x0121:
            long r18 = r18 >> r16
            int r15 = r15 + 1
            goto L_0x0110
        L_0x0126:
            r0 = 8
            if (r8 != r0) goto L_0x013b
        L_0x012a:
            if (r13 == r14) goto L_0x013b
            int r13 = r13 + 1
            goto L_0x00ff
        L_0x012f:
            r6.A06(r8)     // Catch:{ all -> 0x04bb }
            goto L_0x0139
        L_0x0133:
            X.76e r0 = r1.A07     // Catch:{ all -> 0x04bb }
            r0.A0D(r8)     // Catch:{ all -> 0x04bb }
            goto L_0x013b
        L_0x0139:
            r31 = 1
        L_0x013b:
            r0 = 8
            long r4 = r4 >> r0
            int r7 = r7 + 1
            goto L_0x00b3
        L_0x0142:
            r4 = 8
            if (r0 != r4) goto L_0x01bd
        L_0x0146:
            if (r9 == r12) goto L_0x01bd
            int r9 = r9 + 1
            r14 = 7
            goto L_0x009e
        L_0x014d:
            X.7n4 r4 = (X.C161537n4) r4     // Catch:{ all -> 0x04bb }
            r0 = r40
            java.lang.Object r7 = r0.get(r4)     // Catch:{ all -> 0x04bb }
            X.7dm r5 = X.C94014hV.A01(r4)     // Catch:{ all -> 0x04bb }
            X.4hb r0 = r4.BAf()     // Catch:{ all -> 0x04bb }
            java.lang.Object r0 = r0.A04     // Catch:{ all -> 0x04bb }
            boolean r0 = r5.B6k(r0, r7)     // Catch:{ all -> 0x04bb }
            if (r0 != 0) goto L_0x01b8
            X.0GA r0 = r3.A00     // Catch:{ all -> 0x04bb }
            java.lang.Object r4 = r0.A02(r4)     // Catch:{ all -> 0x04bb }
            if (r4 == 0) goto L_0x01bd
            boolean r0 = r4 instanceof X.AnonymousClass0GB     // Catch:{ all -> 0x04bb }
            if (r0 == 0) goto L_0x01b2
            X.0GB r4 = (X.AnonymousClass0GB) r4     // Catch:{ all -> 0x04bb }
            java.lang.Object[] r9 = r4.A03     // Catch:{ all -> 0x04bb }
            long[] r8 = r4.A02     // Catch:{ all -> 0x04bb }
            int r7 = r8.length     // Catch:{ all -> 0x04bb }
            int r7 = r7 - r13
            if (r7 < 0) goto L_0x01bd
            r5 = 0
        L_0x017c:
            r18 = r8[r5]     // Catch:{ all -> 0x04bb }
            long r14 = X.AnonymousClass000.A0Q(r18)
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r12
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x01ad
            int r4 = X.C90484aE.A06(r5, r7)
            r0 = 0
        L_0x0191:
            if (r0 >= r4) goto L_0x01a9
            r12 = 255(0xff, double:1.26E-321)
            long r16 = r18 & r12
            r14 = 128(0x80, double:6.32E-322)
            int r13 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            r12 = 8
            if (r13 >= 0) goto L_0x01a4
            A00(r6, r9, r5, r0)     // Catch:{ all -> 0x04bb }
            r31 = 1
        L_0x01a4:
            long r18 = r18 >> r12
            int r0 = r0 + 1
            goto L_0x0191
        L_0x01a9:
            r0 = 8
            if (r4 != r0) goto L_0x01bd
        L_0x01ad:
            if (r5 == r7) goto L_0x01bd
            int r5 = r5 + 1
            goto L_0x017c
        L_0x01b2:
            r6.A06(r4)     // Catch:{ all -> 0x04bb }
            r31 = 1
            goto L_0x01bd
        L_0x01b8:
            X.76e r0 = r1.A07     // Catch:{ all -> 0x04bb }
            r0.A0D(r4)     // Catch:{ all -> 0x04bb }
        L_0x01bd:
            X.0GA r0 = r3.A00     // Catch:{ all -> 0x04bb }
            java.lang.Object r4 = r0.A02(r10)     // Catch:{ all -> 0x04bb }
            if (r4 == 0) goto L_0x0210
            boolean r0 = r4 instanceof X.AnonymousClass0GB     // Catch:{ all -> 0x04bb }
            if (r0 == 0) goto L_0x020b
            X.0GB r4 = (X.AnonymousClass0GB) r4     // Catch:{ all -> 0x04bb }
            java.lang.Object[] r14 = r4.A03     // Catch:{ all -> 0x04bb }
            long[] r13 = r4.A02     // Catch:{ all -> 0x04bb }
            int r12 = r13.length     // Catch:{ all -> 0x04bb }
            r0 = 2
            int r12 = r12 - r0
            if (r12 < 0) goto L_0x0210
            r10 = 0
        L_0x01d5:
            r17 = r13[r10]     // Catch:{ all -> 0x04bb }
            long r7 = X.AnonymousClass000.A0Q(r17)
            r4 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r4
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0206
            int r9 = X.C90484aE.A06(r10, r12)
            r5 = 0
        L_0x01ea:
            if (r5 >= r9) goto L_0x0202
            r7 = 255(0xff, double:1.26E-321)
            long r15 = r17 & r7
            r7 = 128(0x80, double:6.32E-322)
            int r4 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            r0 = 8
            if (r4 >= 0) goto L_0x01fd
            A00(r6, r14, r10, r5)     // Catch:{ all -> 0x04bb }
            r31 = 1
        L_0x01fd:
            long r17 = r17 >> r0
            int r5 = r5 + 1
            goto L_0x01ea
        L_0x0202:
            r0 = 8
            if (r9 != r0) goto L_0x0210
        L_0x0206:
            if (r10 == r12) goto L_0x0210
            int r10 = r10 + 1
            goto L_0x01d5
        L_0x020b:
            r6.A06(r4)     // Catch:{ all -> 0x04bb }
            r31 = 1
        L_0x0210:
            int r11 = r11 + 1
            r14 = 7
            r13 = 2
            goto L_0x0060
        L_0x0216:
            java.util.Iterator r25 = r29.iterator()     // Catch:{ all -> 0x04bb }
            r31 = 0
        L_0x021c:
            boolean r0 = r25.hasNext()     // Catch:{ all -> 0x04bb }
            if (r0 == 0) goto L_0x03d3
            java.lang.Object r4 = r25.next()     // Catch:{ all -> 0x04bb }
            boolean r0 = r4 instanceof X.C137226fn     // Catch:{ all -> 0x04bb }
            if (r0 == 0) goto L_0x0237
            r0 = r4
            X.6fn r0 = (X.C137226fn) r0     // Catch:{ all -> 0x04bb }
            r5 = 2
            X.79W r0 = r0.A00     // Catch:{ all -> 0x04bb }
            int r0 = r0.get()     // Catch:{ all -> 0x04bb }
            r5 = r5 & r0
            if (r5 == 0) goto L_0x021c
        L_0x0237:
            r0 = r41
            X.0GA r5 = r0.A00     // Catch:{ all -> 0x04bb }
            boolean r0 = r5.A03(r4)     // Catch:{ all -> 0x04bb }
            if (r0 == 0) goto L_0x037e
            java.lang.Object r8 = r5.A02(r4)     // Catch:{ all -> 0x04bb }
            if (r8 == 0) goto L_0x037e
            boolean r0 = r8 instanceof X.AnonymousClass0GB     // Catch:{ all -> 0x04bb }
            if (r0 == 0) goto L_0x030d
            X.0GB r8 = (X.AnonymousClass0GB) r8     // Catch:{ all -> 0x04bb }
            java.lang.Object[] r0 = r8.A03     // Catch:{ all -> 0x04bb }
            r24 = r0
            long[] r9 = r8.A02     // Catch:{ all -> 0x04bb }
            int r8 = r9.length     // Catch:{ all -> 0x04bb }
            r0 = 2
            int r8 = r8 - r0
            if (r8 < 0) goto L_0x037e
            r7 = 0
        L_0x0259:
            r22 = r9[r7]     // Catch:{ all -> 0x04bb }
            long r12 = X.AnonymousClass000.A0Q(r22)
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r10
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0307
            int r5 = X.C90484aE.A06(r7, r8)
            r10 = 0
        L_0x026e:
            if (r10 >= r5) goto L_0x0303
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r22 & r11
            r11 = 128(0x80, double:6.32E-322)
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x02fb
            int r0 = r7 << 3
            int r0 = r0 + r10
            r11 = r24[r0]     // Catch:{ all -> 0x04bb }
            X.7n4 r11 = (X.C161537n4) r11     // Catch:{ all -> 0x04bb }
            r0 = r32
            X.AnonymousClass00C.A0E(r11, r0)     // Catch:{ all -> 0x04bb }
            r0 = r40
            java.lang.Object r13 = r0.get(r11)     // Catch:{ all -> 0x04bb }
            X.7dm r12 = X.C94014hV.A01(r11)     // Catch:{ all -> 0x04bb }
            X.4hb r0 = r11.BAf()     // Catch:{ all -> 0x04bb }
            java.lang.Object r0 = r0.A04     // Catch:{ all -> 0x04bb }
            boolean r0 = r12.B6k(r0, r13)     // Catch:{ all -> 0x04bb }
            if (r0 != 0) goto L_0x02f3
            X.0GA r0 = r3.A00     // Catch:{ all -> 0x04bb }
            java.lang.Object r11 = r0.A02(r11)     // Catch:{ all -> 0x04bb }
            if (r11 == 0) goto L_0x02fb
            boolean r0 = r11 instanceof X.AnonymousClass0GB     // Catch:{ all -> 0x04bb }
            if (r0 == 0) goto L_0x02ef
            X.0GB r11 = (X.AnonymousClass0GB) r11     // Catch:{ all -> 0x04bb }
            java.lang.Object[] r0 = r11.A03     // Catch:{ all -> 0x04bb }
            r33 = r0
            long[] r14 = r11.A02     // Catch:{ all -> 0x04bb }
            int r13 = r14.length     // Catch:{ all -> 0x04bb }
            r0 = 2
            int r13 = r13 - r0
            if (r13 < 0) goto L_0x02fb
            r12 = 0
        L_0x02b6:
            r20 = r14[r12]     // Catch:{ all -> 0x04bb }
            long r17 = X.AnonymousClass000.A0Q(r20)
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r17 = r17 & r15
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x02ea
            int r11 = X.C90484aE.A06(r12, r13)
            r15 = 0
        L_0x02cc:
            if (r15 >= r11) goto L_0x02e6
            r16 = 255(0xff, double:1.26E-321)
            long r18 = r20 & r16
            r16 = 128(0x80, double:6.32E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            r16 = 8
            if (r0 >= 0) goto L_0x02e1
            r0 = r33
            A00(r6, r0, r12, r15)     // Catch:{ all -> 0x04bb }
            r31 = 1
        L_0x02e1:
            long r20 = r20 >> r16
            int r15 = r15 + 1
            goto L_0x02cc
        L_0x02e6:
            r0 = 8
            if (r11 != r0) goto L_0x02fb
        L_0x02ea:
            if (r12 == r13) goto L_0x02fb
            int r12 = r12 + 1
            goto L_0x02b6
        L_0x02ef:
            r6.A06(r11)     // Catch:{ all -> 0x04bb }
            goto L_0x02f9
        L_0x02f3:
            X.76e r0 = r1.A07     // Catch:{ all -> 0x04bb }
            r0.A0D(r11)     // Catch:{ all -> 0x04bb }
            goto L_0x02fb
        L_0x02f9:
            r31 = 1
        L_0x02fb:
            r0 = 8
            long r22 = r22 >> r0
            int r10 = r10 + 1
            goto L_0x026e
        L_0x0303:
            r0 = 8
            if (r5 != r0) goto L_0x037e
        L_0x0307:
            if (r7 == r8) goto L_0x037e
            int r7 = r7 + 1
            goto L_0x0259
        L_0x030d:
            X.7n4 r8 = (X.C161537n4) r8     // Catch:{ all -> 0x04bb }
            r0 = r40
            java.lang.Object r7 = r0.get(r8)     // Catch:{ all -> 0x04bb }
            X.7dm r5 = X.C94014hV.A01(r8)     // Catch:{ all -> 0x04bb }
            X.4hb r0 = r8.BAf()     // Catch:{ all -> 0x04bb }
            java.lang.Object r0 = r0.A04     // Catch:{ all -> 0x04bb }
            boolean r0 = r5.B6k(r0, r7)     // Catch:{ all -> 0x04bb }
            if (r0 != 0) goto L_0x0379
            X.0GA r0 = r3.A00     // Catch:{ all -> 0x04bb }
            java.lang.Object r5 = r0.A02(r8)     // Catch:{ all -> 0x04bb }
            if (r5 == 0) goto L_0x037e
            boolean r0 = r5 instanceof X.AnonymousClass0GB     // Catch:{ all -> 0x04bb }
            if (r0 == 0) goto L_0x0373
            X.0GB r5 = (X.AnonymousClass0GB) r5     // Catch:{ all -> 0x04bb }
            java.lang.Object[] r14 = r5.A03     // Catch:{ all -> 0x04bb }
            long[] r13 = r5.A02     // Catch:{ all -> 0x04bb }
            int r12 = r13.length     // Catch:{ all -> 0x04bb }
            r0 = 2
            int r12 = r12 - r0
            if (r12 < 0) goto L_0x037e
            r11 = 0
        L_0x033d:
            r17 = r13[r11]     // Catch:{ all -> 0x04bb }
            long r9 = X.AnonymousClass000.A0Q(r17)
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r7
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x036e
            int r10 = X.C90484aE.A06(r11, r12)
            r9 = 0
        L_0x0352:
            if (r9 >= r10) goto L_0x036a
            r7 = 255(0xff, double:1.26E-321)
            long r15 = r17 & r7
            r7 = 128(0x80, double:6.32E-322)
            int r5 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            r0 = 8
            if (r5 >= 0) goto L_0x0365
            A00(r6, r14, r11, r9)     // Catch:{ all -> 0x04bb }
            r31 = 1
        L_0x0365:
            long r17 = r17 >> r0
            int r9 = r9 + 1
            goto L_0x0352
        L_0x036a:
            r0 = 8
            if (r10 != r0) goto L_0x037e
        L_0x036e:
            if (r11 == r12) goto L_0x037e
            int r11 = r11 + 1
            goto L_0x033d
        L_0x0373:
            r6.A06(r5)     // Catch:{ all -> 0x04bb }
            r31 = 1
            goto L_0x037e
        L_0x0379:
            X.76e r0 = r1.A07     // Catch:{ all -> 0x04bb }
            r0.A0D(r8)     // Catch:{ all -> 0x04bb }
        L_0x037e:
            X.0GA r0 = r3.A00     // Catch:{ all -> 0x04bb }
            java.lang.Object r4 = r0.A02(r4)     // Catch:{ all -> 0x04bb }
            if (r4 == 0) goto L_0x021c
            boolean r0 = r4 instanceof X.AnonymousClass0GB     // Catch:{ all -> 0x04bb }
            if (r0 == 0) goto L_0x03cc
            X.0GB r4 = (X.AnonymousClass0GB) r4     // Catch:{ all -> 0x04bb }
            java.lang.Object[] r14 = r4.A03     // Catch:{ all -> 0x04bb }
            long[] r13 = r4.A02     // Catch:{ all -> 0x04bb }
            int r12 = r13.length     // Catch:{ all -> 0x04bb }
            r0 = 2
            int r12 = r12 - r0
            if (r12 < 0) goto L_0x021c
            r11 = 0
        L_0x0396:
            r16 = r13[r11]     // Catch:{ all -> 0x04bb }
            long r7 = X.AnonymousClass000.A0Q(r16)
            r4 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r4
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x03c7
            int r5 = X.C90484aE.A06(r11, r12)
            r15 = 0
        L_0x03ab:
            if (r15 >= r5) goto L_0x03c3
            r7 = 255(0xff, double:1.26E-321)
            long r9 = r16 & r7
            r7 = 128(0x80, double:6.32E-322)
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            r0 = 8
            if (r4 >= 0) goto L_0x03be
            A00(r6, r14, r11, r15)     // Catch:{ all -> 0x04bb }
            r31 = 1
        L_0x03be:
            long r16 = r16 >> r0
            int r15 = r15 + 1
            goto L_0x03ab
        L_0x03c3:
            r0 = 8
            if (r5 != r0) goto L_0x021c
        L_0x03c7:
            if (r11 == r12) goto L_0x021c
            int r11 = r11 + 1
            goto L_0x0396
        L_0x03cc:
            r6.A06(r4)     // Catch:{ all -> 0x04bb }
            r31 = 1
            goto L_0x021c
        L_0x03d3:
            X.76e r0 = r1.A07     // Catch:{ all -> 0x04bb }
            r23 = r0
            int r8 = r0.A00     // Catch:{ all -> 0x04bb }
            if (r8 == 0) goto L_0x046f
            if (r8 <= 0) goto L_0x046c
            java.lang.Object[] r0 = r0.A01     // Catch:{ all -> 0x04bb }
            r22 = r0
            r10 = 0
        L_0x03e2:
            r9 = r22[r10]     // Catch:{ all -> 0x04bb }
            X.7n4 r9 = (X.C161537n4) r9     // Catch:{ all -> 0x04bb }
            X.0GA r7 = r1.A04     // Catch:{ all -> 0x04bb }
            androidx.compose.runtime.snapshots.Snapshot r0 = X.AnonymousClass6YQ.A00()     // Catch:{ all -> 0x04bb }
            int r6 = r0.A04()     // Catch:{ all -> 0x04bb }
            X.0GA r0 = r3.A00     // Catch:{ all -> 0x04bb }
            java.lang.Object r5 = r0.A02(r9)     // Catch:{ all -> 0x04bb }
            if (r5 == 0) goto L_0x0468
            boolean r0 = r5 instanceof X.AnonymousClass0GB     // Catch:{ all -> 0x04bb }
            if (r0 == 0) goto L_0x0454
            X.0GB r5 = (X.AnonymousClass0GB) r5     // Catch:{ all -> 0x04bb }
            java.lang.Object[] r0 = r5.A03     // Catch:{ all -> 0x04bb }
            r21 = r0
            long[] r13 = r5.A02     // Catch:{ all -> 0x04bb }
            int r0 = r13.length     // Catch:{ all -> 0x04bb }
            int r12 = r0 + -2
            if (r12 < 0) goto L_0x0468
            r11 = 0
        L_0x040a:
            r19 = r13[r11]     // Catch:{ all -> 0x04bb }
            long r14 = X.AnonymousClass000.A0Q(r19)
            r4 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r4
            int r0 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x044f
            int r5 = X.C90484aE.A06(r11, r12)
            r14 = 0
        L_0x041f:
            if (r14 >= r5) goto L_0x044b
            r15 = 255(0xff, double:1.26E-321)
            long r17 = r19 & r15
            r15 = 128(0x80, double:6.32E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0444
            int r0 = r11 << 3
            int r0 = r0 + r14
            r15 = r21[r0]     // Catch:{ all -> 0x04bb }
            java.lang.Object r4 = r7.A02(r15)     // Catch:{ all -> 0x04bb }
            X.0G9 r4 = (X.AnonymousClass0G9) r4     // Catch:{ all -> 0x04bb }
            if (r4 != 0) goto L_0x0441
            X.0G9 r4 = new X.0G9     // Catch:{ all -> 0x04bb }
            r0 = 6
            r4.<init>(r0)     // Catch:{ all -> 0x04bb }
            r7.A08(r15, r4)     // Catch:{ all -> 0x04bb }
        L_0x0441:
            X.C130596Lr.A00(r4, r1, r9, r15, r6)     // Catch:{ all -> 0x04bb }
        L_0x0444:
            r0 = 8
            long r19 = r19 >> r0
            int r14 = r14 + 1
            goto L_0x041f
        L_0x044b:
            r0 = 8
            if (r5 != r0) goto L_0x0468
        L_0x044f:
            if (r11 == r12) goto L_0x0468
            int r11 = r11 + 1
            goto L_0x040a
        L_0x0454:
            java.lang.Object r4 = r7.A02(r5)     // Catch:{ all -> 0x04bb }
            X.0G9 r4 = (X.AnonymousClass0G9) r4     // Catch:{ all -> 0x04bb }
            if (r4 != 0) goto L_0x0465
            r0 = 6
            X.0G9 r4 = new X.0G9     // Catch:{ all -> 0x04bb }
            r4.<init>(r0)     // Catch:{ all -> 0x04bb }
            r7.A08(r5, r4)     // Catch:{ all -> 0x04bb }
        L_0x0465:
            X.C130596Lr.A00(r4, r1, r9, r5, r6)     // Catch:{ all -> 0x04bb }
        L_0x0468:
            int r10 = r10 + 1
            if (r10 < r8) goto L_0x03e2
        L_0x046c:
            r23.A06()     // Catch:{ all -> 0x04bb }
        L_0x046f:
            if (r31 != 0) goto L_0x0477
            r0 = r26
            r26 = 0
            if (r0 == 0) goto L_0x0479
        L_0x0477:
            r26 = 1
        L_0x0479:
            int r27 = r27 + 1
            r1 = r27
            r0 = r30
            if (r1 < r0) goto L_0x0037
        L_0x0481:
            monitor-exit(r2)
            goto L_0x000e
        L_0x0484:
            boolean r0 = r6 instanceof java.util.List
            if (r0 == 0) goto L_0x04b3
            r4 = r6
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r29 = X.C36391kE.A0t(r4)
            r0 = r29
            java.util.Set r0 = (java.util.Set) r0
            r29 = r0
            int r0 = r4.size()
            r3 = 1
            r1 = 2
            if (r0 != r1) goto L_0x04a3
            java.lang.Object r5 = r4.get(r3)
            goto L_0x0022
        L_0x04a3:
            int r0 = r4.size()
            if (r0 <= r1) goto L_0x0022
            int r0 = r4.size()
            java.util.List r5 = r4.subList(r3, r0)
            goto L_0x0022
        L_0x04b3:
            java.lang.String r0 = "Unexpected notification"
            java.lang.RuntimeException r0 = X.AnonymousClass6XJ.A01(r0)
            throw r0
        L_0x04ba:
            return r26
        L_0x04bb:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130536Ll.A01(X.6Ll):boolean");
    }

    public C130536Ll(C006302t r3) {
        this.A07 = r3;
    }
}
