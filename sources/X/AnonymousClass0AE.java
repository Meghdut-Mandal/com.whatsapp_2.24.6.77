package X;

/* renamed from: X.0AE  reason: invalid class name */
public abstract class AnonymousClass0AE {
    public static final AnonymousClass035 A00 = new AnonymousClass035("REUSABLE_CLAIMED");
    public static final AnonymousClass035 A01 = new AnonymousClass035("UNDEFINED");

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008c, code lost:
        if (r0.A12() != false) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(java.lang.Object r10, X.C023509x r11) {
        /*
            boolean r0 = r11 instanceof X.AnonymousClass0AD
            if (r0 == 0) goto L_0x00ae
            X.0AD r11 = (X.AnonymousClass0AD) r11
            r3 = r10
            java.lang.Throwable r0 = X.AnonymousClass0AK.A00(r10)
            if (r0 == 0) goto L_0x0012
            X.0AT r3 = new X.0AT
            r3.<init>(r0)
        L_0x0012:
            X.02l r1 = r11.A03
            X.09x r7 = r11.A02
            X.02h r0 = r7.getContext()
            boolean r0 = r1.A04(r0)
            r5 = 1
            if (r0 == 0) goto L_0x002d
            r11.A00 = r3
            r11.A00 = r5
            X.02h r0 = r7.getContext()
            r1.A03(r11, r0)
            return
        L_0x002d:
            X.03G r4 = X.AnonymousClass0AL.A00()
            long r0 = r4.A00
            r8 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x0044
            r11.A00 = r3
            r11.A00 = r5
            r4.A07(r11)
            return
        L_0x0044:
            long r0 = r0 + r8
            r4.A00 = r0
            r6 = 0
            X.02h r1 = r7.getContext()     // Catch:{ all -> 0x009e }
            X.03x r0 = X.C007403e.A00     // Catch:{ all -> 0x009e }
            X.02i r1 = r1.get(r0)     // Catch:{ all -> 0x009e }
            X.03e r1 = (X.C007403e) r1     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x006d
            boolean r0 = r1.BL7()     // Catch:{ all -> 0x009e }
            if (r0 != 0) goto L_0x006d
            java.util.concurrent.CancellationException r1 = r1.B9P()     // Catch:{ all -> 0x009e }
            X.03N r0 = new X.03N     // Catch:{ all -> 0x009e }
            r0.<init>(r1)     // Catch:{ all -> 0x009e }
            r11.resumeWith(r0)     // Catch:{ all -> 0x009e }
        L_0x0068:
            boolean r0 = r4.A09()     // Catch:{ all -> 0x009e }
            goto L_0x00a3
        L_0x006d:
            java.lang.Object r0 = r11.A01     // Catch:{ all -> 0x009e }
            X.02h r3 = r7.getContext()     // Catch:{ all -> 0x009e }
            java.lang.Object r2 = X.AnonymousClass0AF.A00(r0, r3)     // Catch:{ all -> 0x009e }
            X.035 r0 = X.AnonymousClass0AF.A01     // Catch:{ all -> 0x009e }
            if (r2 == r0) goto L_0x0080
            X.0nS r0 = X.AnonymousClass0A3.A02(r2, r7, r3)     // Catch:{ all -> 0x009e }
            goto L_0x0081
        L_0x0080:
            r0 = r6
        L_0x0081:
            r7.resumeWith(r10)     // Catch:{ all -> 0x0085 }
            goto L_0x0092
        L_0x0085:
            r1 = move-exception
            if (r0 == 0) goto L_0x008e
            boolean r0 = r0.A12()     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0091
        L_0x008e:
            X.AnonymousClass0AF.A01(r2, r3)     // Catch:{ all -> 0x009e }
        L_0x0091:
            throw r1     // Catch:{ all -> 0x009e }
        L_0x0092:
            if (r0 == 0) goto L_0x009a
            boolean r0 = r0.A12()     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0068
        L_0x009a:
            X.AnonymousClass0AF.A01(r2, r3)     // Catch:{ all -> 0x009e }
            goto L_0x0068
        L_0x009e:
            r0 = move-exception
            r11.A0A(r0, r6)     // Catch:{ all -> 0x00a9 }
            goto L_0x00a5
        L_0x00a3:
            if (r0 != 0) goto L_0x0068
        L_0x00a5:
            r4.A08(r5)
            return
        L_0x00a9:
            r0 = move-exception
            r4.A08(r5)
            throw r0
        L_0x00ae:
            r11.resumeWith(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AE.A00(java.lang.Object, X.09x):void");
    }
}
