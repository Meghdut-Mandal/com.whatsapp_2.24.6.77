package X;

/* renamed from: X.7sh  reason: invalid class name and case insensitive filesystem */
public class C164987sh implements C25711Hj {
    public Object A00;
    public Object A01;
    public final int A02;

    public C164987sh(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00dd, code lost:
        r5 = X.AnonymousClass6Y8.A09(new X.C130396Kx((android.graphics.BitmapFactory.Options) null, (java.lang.Long) null, 96, 96, true), r3.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0121, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0122, code lost:
        com.whatsapp.util.Log.e("MediaJobManager/enqueueThumbnailUpload, exception when creating thumbnail file", r1);
        r2.A05 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0129, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void accept(java.lang.Object r17) {
        /*
            r16 = this;
            r5 = r17
            r2 = r16
            int r0 = r2.A02
            switch(r0) {
                case 0: goto L_0x01ae;
                case 1: goto L_0x0018;
                case 2: goto L_0x0031;
                case 3: goto L_0x012a;
                case 4: goto L_0x0144;
                case 5: goto L_0x0166;
                case 6: goto L_0x0176;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r2.A00
            X.1OC r0 = (X.AnonymousClass1OC) r0
            java.util.HashMap r1 = r0.A0A
            monitor-enter(r1)
            r1.remove(r5)     // Catch:{ all -> 0x0015 }
            monitor-exit(r1)     // Catch:{ all -> 0x0015 }
            return
        L_0x0015:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0015 }
            throw r0
        L_0x0018:
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            java.lang.Object r0 = r2.A00
            X.3ty r0 = (X.C79593ty) r0
            r0.A0E()
            java.lang.Object r1 = r2.A01
            X.09x r1 = (X.C023509x) r1
            X.03N r0 = X.C90524aI.A0t(r5)
            r1.resumeWith(r0)
            return
        L_0x0031:
            java.lang.Object r6 = r2.A00
            X.1D0 r6 = (X.AnonymousClass1D0) r6
            java.lang.Object r2 = r2.A01
            X.6vi r2 = (X.C146506vi) r2
            X.5qQ r5 = (X.C119765qQ) r5
            X.65P r0 = r2.A03()
            X.1Gl r3 = r0.A08
            X.3Rg r0 = r2.A0O
            X.3Ot r8 = r0.A03
            boolean r1 = r8.A02
            X.5z9 r0 = r2.A02()
            int[] r0 = r0.A0H
            boolean r0 = r6.A0G(r3, r0, r1)
            r11 = 0
            if (r0 != 0) goto L_0x0057
            r2.A05 = r11
            return
        L_0x0057:
            byte[] r3 = r2.A05
            if (r3 == 0) goto L_0x01c0
            X.0yF r0 = r6.A05     // Catch:{ IOException -> 0x0121 }
            X.0yG r1 = r0.A00     // Catch:{ IOException -> 0x0121 }
            java.lang.String r0 = ""
            java.io.File r7 = r1.A01(r0)     // Catch:{ IOException -> 0x0121 }
            X.AnonymousClass6YY.A0I(r7, r3)     // Catch:{ IOException -> 0x0121 }
            r7.getAbsolutePath()     // Catch:{ IOException -> 0x0121 }
            X.65P r0 = r2.A03()     // Catch:{ IOException -> 0x0121 }
            X.1Gl r0 = r0.A08     // Catch:{ IOException -> 0x0121 }
            int r1 = r0.A00     // Catch:{ IOException -> 0x0121 }
            X.65P r0 = r2.A03()     // Catch:{ IOException -> 0x0121 }
            X.1Gl r0 = r0.A08     // Catch:{ IOException -> 0x0121 }
            boolean r0 = X.AnonymousClass6Y1.A06(r0)     // Catch:{ IOException -> 0x0121 }
            X.1Gl r1 = X.AnonymousClass6Y1.A00(r1, r0)     // Catch:{ IOException -> 0x0121 }
            int r0 = r2.A01     // Catch:{ IOException -> 0x0121 }
            X.5z9 r5 = X.AnonymousClass3M4.A01(r5, r1, r7, r0)     // Catch:{ IOException -> 0x0121 }
            X.1D5 r10 = r6.A06     // Catch:{ IOException -> 0x0121 }
            X.65P r0 = r2.A03()     // Catch:{ IOException -> 0x0121 }
            X.1Gl r0 = r0.A08     // Catch:{ IOException -> 0x0121 }
            int r9 = r0.A00     // Catch:{ IOException -> 0x0121 }
            X.65P r0 = r2.A03()     // Catch:{ IOException -> 0x0121 }
            int r4 = r0.A01     // Catch:{ IOException -> 0x0121 }
            X.6Wa r3 = r2.A0N     // Catch:{ IOException -> 0x0121 }
            monitor-enter(r3)     // Catch:{ IOException -> 0x0121 }
            boolean r1 = r3.A0M     // Catch:{ all -> 0x011e }
            monitor-exit(r3)     // Catch:{ IOException -> 0x0121 }
            X.5z2 r0 = r2.A0M     // Catch:{ IOException -> 0x0121 }
            java.lang.String r0 = r0.A0D     // Catch:{ IOException -> 0x0121 }
            X.6vh r4 = r10.A02(r0, r9, r4, r1)     // Catch:{ IOException -> 0x0121 }
            X.5z2 r1 = r4.A00     // Catch:{ IOException -> 0x0121 }
            X.7jL r0 = X.AnonymousClass1D0.A00(r5)     // Catch:{ IOException -> 0x0121 }
            X.6Pj r3 = new X.6Pj     // Catch:{ IOException -> 0x0121 }
            r3.<init>(r0, r1, r5, r8)     // Catch:{ IOException -> 0x0121 }
            X.6Wa r1 = r4.A01     // Catch:{ IOException -> 0x0121 }
            X.5zK r0 = r3.A04     // Catch:{ IOException -> 0x0121 }
            r1.A0B(r0)     // Catch:{ IOException -> 0x0121 }
            r2.A02 = r4     // Catch:{ IOException -> 0x0121 }
            X.1GN r0 = r6.A0D     // Catch:{ IOException -> 0x0121 }
            X.4xL r4 = r0.A0A(r4, r3)     // Catch:{ IOException -> 0x0121 }
            java.util.Objects.requireNonNull(r2)     // Catch:{ IOException -> 0x0121 }
            r0 = 3
            X.7sg r3 = new X.7sg     // Catch:{ IOException -> 0x0121 }
            r3.<init>(r2, r0)     // Catch:{ IOException -> 0x0121 }
            java.util.concurrent.Executor r1 = r6.A0G     // Catch:{ IOException -> 0x0121 }
            X.1Hk r0 = r4.A0H     // Catch:{ IOException -> 0x0121 }
            r0.A03(r3, r1)     // Catch:{ IOException -> 0x0121 }
            X.1Gl r0 = r5.A06     // Catch:{ IOException -> 0x0121 }
            r6 = 0
            X.5v4 r3 = new X.5v4     // Catch:{ IOException -> 0x0121 }
            r3.<init>(r0, r7, r11, r6)     // Catch:{ IOException -> 0x0121 }
            X.1Gl r1 = r3.A00     // Catch:{ IOException -> 0x0121 }
            X.1Gl r0 = X.C25471Gl.A0B     // Catch:{ IOException -> 0x0121 }
            if (r1 != r0) goto L_0x01c0
            r13 = 96
            r15 = 1
            X.6Kx r10 = new X.6Kx     // Catch:{ IOException -> 0x0121 }
            r14 = 96
            r12 = r11
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ IOException -> 0x0121 }
            java.io.File r0 = r3.A01     // Catch:{ IOException -> 0x0121 }
            X.5sn r5 = X.AnonymousClass6Y8.A09(r10, r0)     // Catch:{ IOException -> 0x0121 }
            android.graphics.Bitmap r0 = r5.A02     // Catch:{ IOException -> 0x0121 }
            if (r0 == 0) goto L_0x01c0
            android.graphics.Bitmap r4 = X.AnonymousClass1GW.A08(r0, r11, r13, r13)     // Catch:{ IOException -> 0x0121 }
            X.AnonymousClass00C.A08(r4)     // Catch:{ IOException -> 0x0121 }
            r0 = 48
            byte[] r3 = X.AnonymousClass6IR.A00(r4, r0, r6, r6)     // Catch:{ IOException -> 0x0121 }
            if (r3 == 0) goto L_0x01c0
            int r0 = r5.A01     // Catch:{ IOException -> 0x0121 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0121 }
            int r0 = r5.A00     // Catch:{ IOException -> 0x0121 }
            android.util.Pair r0 = X.C36341k9.A0I(r1, r0)     // Catch:{ IOException -> 0x0121 }
            r4.getWidth()     // Catch:{ IOException -> 0x0121 }
            r4.getHeight()     // Catch:{ IOException -> 0x0121 }
            X.5v5 r1 = new X.5v5     // Catch:{ IOException -> 0x0121 }
            r1.<init>(r0, r11, r3, r11)     // Catch:{ IOException -> 0x0121 }
            X.1Hk r0 = r2.A06     // Catch:{ IOException -> 0x0121 }
            r0.A04(r1)     // Catch:{ IOException -> 0x0121 }
            return
        L_0x011e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ IOException -> 0x0121 }
            throw r0     // Catch:{ IOException -> 0x0121 }
        L_0x0121:
            r1 = move-exception
            java.lang.String r0 = "MediaJobManager/enqueueThumbnailUpload, exception when creating thumbnail file"
            com.whatsapp.util.Log.e(r0, r1)
            r2.A05 = r11
            return
        L_0x012a:
            java.lang.Object r1 = r2.A00
            X.1D0 r1 = (X.AnonymousClass1D0) r1
            java.lang.Object r0 = r2.A01
            X.6vi r0 = (X.C146506vi) r0
            java.lang.Number r5 = (java.lang.Number) r5
            boolean r0 = r0.A08()
            if (r0 != 0) goto L_0x01c0
            X.17Y r1 = r1.A01
            int r0 = r5.intValue()
            r1.A03(r0)
            return
        L_0x0144:
            java.lang.Object r3 = r2.A00
            X.1Y4 r3 = (X.AnonymousClass1Y4) r3
            java.lang.Object r4 = r2.A01
            X.2bU r4 = (X.AnonymousClass2bU) r4
            r0 = 0
            boolean r0 = X.AnonymousClass1Y6.A01(r4, r0)
            if (r0 == 0) goto L_0x01c0
            X.0xM r0 = r3.A05
            r0.A0k(r4)
            r5 = 6
            r7 = 1
            X.0wU r0 = r3.A0P
            r6 = 0
            X.1iT r2 = new X.1iT
            r2.<init>(r3, r4, r5, r6, r7)
            r0.Boy(r2)
            return
        L_0x0166:
            java.lang.Object r0 = r2.A01
            X.3SC r0 = (X.AnonymousClass3SC) r0
            java.util.concurrent.atomic.AtomicInteger r5 = (java.util.concurrent.atomic.AtomicInteger) r5
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A02
            int r0 = r0.size()
            r5.addAndGet(r0)
            return
        L_0x0176:
            java.lang.Object r4 = r2.A00
            X.1ST r4 = (X.AnonymousClass1ST) r4
            java.lang.Object r3 = r2.A01
            X.2bU r3 = (X.AnonymousClass2bU) r3
            X.6AL r5 = (X.AnonymousClass6AL) r5
            X.6Fp r0 = r5.A00
            java.io.File r2 = r0.A03()
            if (r2 == 0) goto L_0x019e
            monitor-enter(r3)
            X.3Qj r0 = X.AnonymousClass2bU.A00(r3)     // Catch:{ all -> 0x019b }
            r0.A0I = r2     // Catch:{ all -> 0x019b }
            X.C18740tg.A06(r2)     // Catch:{ all -> 0x019b }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x019b }
            r2.setLastModified(r0)     // Catch:{ all -> 0x019b }
            monitor-exit(r3)     // Catch:{ all -> 0x019b }
            goto L_0x019e
        L_0x019b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x019b }
            throw r0
        L_0x019e:
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x01c0
            java.util.concurrent.Executor r2 = r4.A0T
            r1 = 3
            X.1jB r0 = new X.1jB
            r0.<init>(r4, r3, r1)
            r2.execute(r0)
            return
        L_0x01ae:
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            java.lang.Object r0 = r2.A00
            X.3ty r0 = (X.C79593ty) r0
            r0.A0E()
            java.lang.Object r0 = r2.A01
            X.09x r0 = (X.C023509x) r0
            r0.resumeWith(r5)
        L_0x01c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C164987sh.accept(java.lang.Object):void");
    }
}
