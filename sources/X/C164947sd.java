package X;

/* renamed from: X.7sd  reason: invalid class name and case insensitive filesystem */
public class C164947sd implements C25711Hj {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C164947sd(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x012b, code lost:
        if ((r3.A08.A00() & 1) != 0) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0135, code lost:
        if (r1 != X.C25471Gl.A0d) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0137, code lost:
        r3 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.A03
            switch(r0) {
                case 0: goto L_0x00f2;
                case 1: goto L_0x0179;
                case 2: goto L_0x0023;
                case 3: goto L_0x01b2;
                case 4: goto L_0x00a5;
                case 5: goto L_0x00b7;
                case 6: goto L_0x00df;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r14.A00
            X.1Y4 r4 = (X.AnonymousClass1Y4) r4
            java.lang.Object r3 = r14.A01
            X.3SC r3 = (X.AnonymousClass3SC) r3
            java.util.concurrent.CopyOnWriteArrayList r2 = r3.A02
            r2.size()
            X.1Y6 r1 = r4.A0D
            r0 = 2
        L_0x0015:
            X.C164887sX.A00(r1, r3, r15, r0)
            X.16J r1 = r4.A06
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r0 = -1
            r1.A07(r2, r0)
        L_0x0022:
            return
        L_0x0023:
            java.lang.Object r0 = r14.A00
            X.1Y4 r0 = (X.AnonymousClass1Y4) r0
            java.lang.Object r6 = r14.A01
            X.3SC r6 = (X.AnonymousClass3SC) r6
            X.5vB r15 = (X.C122635vB) r15
            java.util.concurrent.CopyOnWriteArrayList r7 = r6.A02
            r7.size()
            X.1Y6 r2 = r0.A0D
            java.io.File r5 = r15.A01
            X.2bU r1 = r6.A01()
            monitor-enter(r1)
            X.2bU r0 = r6.A01()     // Catch:{ all -> 0x01f6 }
            X.3Qj r0 = X.AnonymousClass2bU.A00(r0)     // Catch:{ all -> 0x01f6 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x01f6 }
            java.io.File r9 = r0.A0I     // Catch:{ all -> 0x01f6 }
            monitor-exit(r1)     // Catch:{ all -> 0x01f6 }
            int r11 = r7.size()
            java.util.concurrent.atomic.AtomicInteger r0 = r15.A03
            r0.addAndGet(r11)
            boolean r0 = r5.equals(r9)
            if (r0 == 0) goto L_0x005f
            java.util.concurrent.atomic.AtomicBoolean r1 = r15.A02
            r0 = 1
            r1.set(r0)
            return
        L_0x005f:
            if (r11 == 0) goto L_0x0022
            X.1Av r8 = r2.A00
            java.util.concurrent.atomic.AtomicBoolean r1 = r15.A02
            r0 = 1
            boolean r0 = r1.getAndSet(r0)
            r8.A06(r5, r11, r0)
            long r1 = r15.A00
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0081
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "sendmediamessagemanager/applyMediaFileReference file size from reference is 0.  filesize computed from file is = "
            X.C90464aC.A19(r5, r0, r3)
            X.C90504aG.A1G(r3)
        L_0x0081:
            java.util.Iterator r4 = X.C90514aH.A12(r7)
        L_0x0085:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x009a
            X.2bU r3 = X.C36441kJ.A0r(r4)
            monitor-enter(r3)
            X.3Qj r0 = X.AnonymousClass2bU.A00(r3)     // Catch:{ all -> 0x01d2 }
            r0.A0I = r5     // Catch:{ all -> 0x01d2 }
            r3.A00 = r1     // Catch:{ all -> 0x01d2 }
            monitor-exit(r3)     // Catch:{ all -> 0x01d2 }
            goto L_0x0085
        L_0x009a:
            if (r9 == 0) goto L_0x0022
            X.2bU r0 = r6.A01()
            int r10 = r0.A1I
            r12 = 0
            goto L_0x01d5
        L_0x00a5:
            java.lang.Object r4 = r14.A00
            X.1Y4 r4 = (X.AnonymousClass1Y4) r4
            java.lang.Object r3 = r14.A01
            X.3SC r3 = (X.AnonymousClass3SC) r3
            java.util.concurrent.CopyOnWriteArrayList r2 = r3.A02
            r2.size()
            X.1Y6 r1 = r4.A0D
            r0 = 4
            goto L_0x0015
        L_0x00b7:
            java.lang.Object r4 = r14.A00
            X.1Y4 r4 = (X.AnonymousClass1Y4) r4
            java.lang.Object r3 = r14.A01
            X.3SC r3 = (X.AnonymousClass3SC) r3
            java.util.concurrent.CopyOnWriteArrayList r2 = r3.A02
            r2.size()
            X.1Y6 r1 = r4.A0D
            r0 = 5
            X.C164887sX.A00(r1, r3, r15, r0)
            java.util.Iterator r3 = X.C90514aH.A12(r2)
        L_0x00ce:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0022
            X.3T1 r2 = X.C36391kE.A0l(r3)
            X.0xM r1 = r4.A05
            r0 = -1
            r1.A0n(r2, r0)
            goto L_0x00ce
        L_0x00df:
            java.lang.Object r4 = r14.A00
            X.1Y4 r4 = (X.AnonymousClass1Y4) r4
            java.lang.Object r3 = r14.A01
            X.3SC r3 = (X.AnonymousClass3SC) r3
            java.util.concurrent.CopyOnWriteArrayList r2 = r3.A02
            r2.size()
            X.1Y6 r1 = r4.A0D
            r0 = 8
            goto L_0x0015
        L_0x00f2:
            java.lang.Object r5 = r14.A00
            X.1D0 r5 = (X.AnonymousClass1D0) r5
            java.lang.Object r4 = r14.A01
            X.6vi r4 = (X.C146506vi) r4
            java.lang.Object r2 = r14.A02
            X.5yE r2 = (X.C124465yE) r2
            X.5v9 r15 = (X.C122615v9) r15
            java.io.File r3 = r15.A00
            if (r3 == 0) goto L_0x010f
            r0 = 0
            X.5vB r1 = new X.5vB
            r1.<init>(r3, r0)
            X.1Hk r0 = r4.A0A
            r0.A04(r1)
        L_0x010f:
            X.1Hk r0 = r4.A0G
            r0.A04(r15)
            X.1GO r3 = r5.A08
            X.65P r0 = r4.A03()
            X.1Gl r1 = r0.A08
            boolean r0 = X.AnonymousClass6Y1.A04(r1)
            if (r0 == 0) goto L_0x0132
            X.1GU r0 = r3.A08
            int r0 = r0.A00()
            r3 = 1
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0137
        L_0x012d:
            X.6Wa r1 = r4.A0N
            monitor-enter(r1)
            r0 = 1
            goto L_0x0139
        L_0x0132:
            X.1Gl r0 = X.C25471Gl.A0d
            r3 = 1
            if (r1 == r0) goto L_0x012d
        L_0x0137:
            r3 = 0
            goto L_0x012d
        L_0x0139:
            r1.A0I = r0     // Catch:{ all -> 0x0176 }
            monitor-exit(r1)
            boolean r0 = r4.A08()
            if (r0 == 0) goto L_0x0172
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x0172
            if (r3 != 0) goto L_0x0172
            X.5zK r0 = new X.5zK
            r0.<init>()
            r1.A0B(r0)
            r0 = 14
            r4.A00 = r0
            X.1Hk r1 = r4.A0C
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A04(r0)
        L_0x015d:
            X.1Hk r0 = r2.A02
            r0.A01()
            X.1Hk r0 = r2.A03
            r0.A01()
            X.1Hk r0 = r2.A04
            r0.A01()
            X.1Hk r0 = r2.A01
            r0.A01()
            return
        L_0x0172:
            X.AnonymousClass1D0.A02(r5, r4, r15)
            goto L_0x015d
        L_0x0176:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0179:
            java.lang.Object r5 = r14.A00
            X.1Y4 r5 = (X.AnonymousClass1Y4) r5
            java.lang.Object r0 = r14.A01
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r3 = r14.A02
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            java.util.Iterator r2 = r0.iterator()
        L_0x0189:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01ae
            X.2bU r6 = X.C36441kJ.A0r(r2)
            r0 = 1
            boolean r0 = X.AnonymousClass1Y6.A01(r6, r0)
            if (r0 == 0) goto L_0x0189
            X.16J r1 = r5.A06
            r0 = -1
            r1.A05(r6, r0)
            r7 = 7
            r8 = 0
            X.0wU r0 = r5.A0P
            X.1iT r4 = new X.1iT
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r0.Boy(r4)
            goto L_0x0189
        L_0x01ae:
            r3.run()
            return
        L_0x01b2:
            java.lang.Object r4 = r14.A00
            X.1Y4 r4 = (X.AnonymousClass1Y4) r4
            java.lang.Object r3 = r14.A01
            X.3SC r3 = (X.AnonymousClass3SC) r3
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.A02
            r0.size()
            X.1Y6 r1 = r4.A0D
            r0 = 0
            X.C164887sX.A00(r1, r3, r15, r0)
            X.17Y r2 = r4.A01
            r1 = 48
            X.1j9 r0 = new X.1j9
            r0.<init>(r4, r3, r1)
            r2.A0H(r0)
            return
        L_0x01d2:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01d2 }
            throw r0
        L_0x01d5:
            X.0y0 r1 = r8.A00     // Catch:{ IOException -> 0x01eb }
            boolean r0 = r1.A0i(r9)     // Catch:{ IOException -> 0x01eb }
            if (r0 != 0) goto L_0x01e9
            boolean r0 = r1.A0h(r9)     // Catch:{ IOException -> 0x01eb }
            if (r0 == 0) goto L_0x01f1
            boolean r0 = r1.A0j(r9)     // Catch:{ IOException -> 0x01eb }
            if (r0 != 0) goto L_0x01f1
        L_0x01e9:
            r12 = 1
            goto L_0x01f1
        L_0x01eb:
            r1 = move-exception
            java.lang.String r0 = "ReferenceCountedFileManager/isPrivateManagedMediaFile "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x01f1:
            r13 = 0
            r8.A05(r9, r10, r11, r12, r13)
            return
        L_0x01f6:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01f6 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C164947sd.accept(java.lang.Object):void");
    }
}
