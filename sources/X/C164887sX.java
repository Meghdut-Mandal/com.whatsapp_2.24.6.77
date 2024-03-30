package X;

/* renamed from: X.7sX  reason: invalid class name and case insensitive filesystem */
public class C164887sX implements C158357gn {
    public Object A00;
    public final int A01;

    public C164887sX(AnonymousClass1Y6 r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public static void A00(AnonymousClass1Y6 r1, AnonymousClass3SC r2, Object obj, int i) {
        AnonymousClass1Y6.A00(new C164887sX(r1, i), r2, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x021f, code lost:
        if (r0 != false) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0235, code lost:
        if (r0 != false) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (X.AnonymousClass6Y1.A07(r1) != false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean B1E(X.C65013Qj r8, X.AnonymousClass2bU r9, java.lang.Object r10) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x001c;
                case 1: goto L_0x007d;
                case 2: goto L_0x0084;
                case 3: goto L_0x008a;
                case 4: goto L_0x00b0;
                case 5: goto L_0x00cb;
                case 6: goto L_0x01a5;
                case 7: goto L_0x01f0;
                case 8: goto L_0x0270;
                case 9: goto L_0x027d;
                case 10: goto L_0x0288;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Number r10 = (java.lang.Number) r10
            int r1 = r9.A1I
            r5 = 0
            r0 = 1
            if (r1 == r0) goto L_0x001b
            long r3 = r8.A0E
            int r0 = r10.intValue()
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0019
            r5 = 1
        L_0x0019:
            r8.A0E = r1
        L_0x001b:
            return r5
        L_0x001c:
            java.lang.Object r4 = r7.A00
            X.1Y6 r4 = (X.AnonymousClass1Y6) r4
            X.5v5 r10 = (X.C122585v5) r10
            X.1Gl r1 = X.AnonymousClass6Y1.A02(r9)
            X.3Kz r0 = r9.A0V()
            if (r0 == 0) goto L_0x0046
            byte[] r2 = r10.A02
            if (r2 == 0) goto L_0x0046
            X.1EJ r0 = r4.A02
            r0.A00(r9)
            boolean r0 = X.AnonymousClass1Ax.A04(r1)
            if (r0 != 0) goto L_0x0042
            boolean r1 = X.AnonymousClass6Y1.A07(r1)
            r0 = 0
            if (r1 == 0) goto L_0x0043
        L_0x0042:
            r0 = 1
        L_0x0043:
            r9.A1D(r2, r0)
        L_0x0046:
            android.util.Pair r1 = r10.A01
            if (r1 == 0) goto L_0x0056
            int r0 = X.C36381kD.A04(r1)
            r8.A0A = r0
            int r0 = X.C36381kD.A03(r1)
            r8.A06 = r0
        L_0x0056:
            android.util.Pair r1 = r10.A00
            if (r1 == 0) goto L_0x0066
            int r0 = X.C36381kD.A04(r1)
            r8.A02 = r0
            int r0 = X.C36381kD.A03(r1)
            r8.A03 = r0
        L_0x0066:
            byte[] r3 = r10.A03
            if (r3 == 0) goto L_0x0294
            boolean r0 = r9 instanceof X.C46962bx
            if (r0 == 0) goto L_0x0294
            r2 = r9
            X.2bx r2 = (X.C46962bx) r2
            X.1Ap r1 = r4.A04
            java.lang.String r0 = r9.A05
            X.3S2 r0 = r1.A03(r0, r3)
            r2.A05 = r0
            goto L_0x0294
        L_0x007d:
            int r0 = X.AnonymousClass000.A0I(r10)
            long r0 = (long) r0
            goto L_0x0285
        L_0x0084:
            java.lang.String r10 = (java.lang.String) r10
            r8.A0L = r10
            goto L_0x0294
        L_0x008a:
            X.5v5 r10 = (X.C122585v5) r10
            X.3L1 r0 = r9.A0a
            if (r0 != 0) goto L_0x0098
            X.3L1 r0 = new X.3L1
            r0.<init>()
            r9.A12(r0)
        L_0x0098:
            X.3L1 r2 = r9.A0a
            byte[] r0 = r10.A02
            r2.A0B = r0
            android.util.Pair r1 = r10.A01
            if (r1 == 0) goto L_0x0294
            int r0 = X.C36381kD.A04(r1)
            r2.A01 = r0
            int r0 = X.C36381kD.A03(r1)
            r2.A00 = r0
            goto L_0x0294
        L_0x00b0:
            X.5v7 r10 = (X.AnonymousClass5v7) r10
            java.io.File r0 = r10.A01
            r8.A0I = r0
            java.lang.String r0 = r10.A02
            r9.A06 = r0
            long r0 = r10.A00
            r9.A00 = r0
            X.3Kz r0 = r9.A0V()
            if (r0 == 0) goto L_0x0294
            byte[] r0 = r10.A03
            r9.A1C(r0)
            goto L_0x0294
        L_0x00cb:
            java.lang.Object r3 = r7.A00
            X.1Y6 r3 = (X.AnonymousClass1Y6) r3
            X.5v9 r10 = (X.C122615v9) r10
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x0199
            java.lang.String r0 = r9.A1b()
            r2 = 0
            if (r0 == 0) goto L_0x00ec
            android.net.Uri r1 = android.net.Uri.parse(r0)
            if (r1 == 0) goto L_0x00ec
            boolean r0 = r1.isAbsolute()
            if (r0 == 0) goto L_0x00ec
            java.io.File r2 = X.AnonymousClass6YY.A03(r1)
        L_0x00ec:
            java.io.File r4 = r10.A00
            X.C18740tg.A06(r4)
            boolean r0 = r10 instanceof X.AnonymousClass5Bb
            if (r0 != 0) goto L_0x00fb
            java.lang.String r0 = r4.getName()
            r9.A06 = r0
        L_0x00fb:
            long r0 = r4.length()
            r8.A0C = r0
            r9.A00 = r0
            r8.A0I = r4
            X.3Kz r0 = r9.A0V()
            if (r0 == 0) goto L_0x0117
            byte[] r0 = r10.A03
            if (r0 == 0) goto L_0x0117
            r9.A1C(r0)
            X.1SV r0 = r3.A06
            r0.A0H(r9)
        L_0x0117:
            r6 = 1
            r8.A0U = r6
            r8.A0Q = r6
            boolean r0 = r10 instanceof X.AnonymousClass5Bf
            if (r0 == 0) goto L_0x014c
            r1 = r10
            X.5Bf r1 = (X.AnonymousClass5Bf) r1
            int r0 = r1.A02
            r8.A06 = r0
            int r0 = r1.A03
            r8.A0A = r0
            int r0 = r1.A00
            r8.A02 = r0
            int r0 = r1.A01
            r8.A03 = r0
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0186
            int[] r5 = r1.A06
            int r0 = r5.length
            if (r0 <= 0) goto L_0x0186
            X.6Q6 r1 = r9.A1Y()
            X.C18740tg.A06(r1)
            monitor-enter(r1)
            r1.A02 = r5     // Catch:{ all -> 0x0149 }
            r1.A01 = r6     // Catch:{ all -> 0x0149 }
            goto L_0x0185
        L_0x0149:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x014c:
            boolean r0 = r10 instanceof X.AnonymousClass5Bd
            if (r0 == 0) goto L_0x0163
            r1 = r10
            X.5Bd r1 = (X.AnonymousClass5Bd) r1
            int r0 = r1.A00
            r9.A0B = r0
            boolean r1 = r1.A01
            r0 = 0
            if (r1 == 0) goto L_0x0160
            r9.A04 = r0
            r9.A03 = r0
        L_0x0160:
            r8.A0K = r0
            goto L_0x0186
        L_0x0163:
            boolean r0 = r10 instanceof X.AnonymousClass5Be
            if (r0 == 0) goto L_0x0186
            r1 = r10
            X.5Be r1 = (X.AnonymousClass5Be) r1
            java.lang.String r0 = r1.A02
            r9.A04 = r0
            r0 = 0
            r9.A03 = r0
            int r0 = r1.A00
            if (r0 <= 0) goto L_0x0177
            r8.A04 = r0
        L_0x0177:
            java.lang.Boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0186
            r1 = r9
            X.2bx r1 = (X.C46962bx) r1
            boolean r0 = r0.booleanValue()
            r1.A03 = r0
            goto L_0x0186
        L_0x0185:
            monitor-exit(r1)
        L_0x0186:
            java.lang.String r0 = r10.A01
            r9.A09 = r0
            if (r2 == 0) goto L_0x0294
            boolean r0 = r2.equals(r4)
            if (r0 != 0) goto L_0x0294
            X.1GX r0 = r3.A05
            r0.A0l(r2)
            goto L_0x0294
        L_0x0199:
            r0 = 0
            r8.A0f = r0
            r9.A0g()
            r8.A0Q = r0
            r8.A0U = r0
            goto L_0x0294
        L_0x01a5:
            java.lang.Object r2 = r7.A00
            X.1Y6 r2 = (X.AnonymousClass1Y6) r2
            X.5xD r10 = (X.C123865xD) r10
            X.6Fj r1 = r10.A02
            r2.A02(r8, r1, r9)
            int r3 = r10.A00
            if (r3 != 0) goto L_0x01de
            java.lang.String r0 = r1.A07()
            if (r0 == 0) goto L_0x01c0
            java.lang.String r0 = r1.A07()
            r9.A07 = r0
        L_0x01c0:
            java.lang.String r0 = r1.A03()
            if (r0 == 0) goto L_0x01d3
            X.1D8 r2 = r2.A03
            java.lang.String r1 = r1.A03()
            r0 = 1
            java.lang.String r0 = r2.A00(r1, r0)
            r8.A0J = r0
        L_0x01d3:
            boolean r0 = X.AnonymousClass6H7.A01(r3)
            if (r0 != 0) goto L_0x0294
            r0 = 0
            r8.A0Q = r0
            goto L_0x0294
        L_0x01de:
            r0 = 12
            if (r3 != r0) goto L_0x01d3
            X.6Q6 r0 = r9.A1Y()
            if (r0 == 0) goto L_0x01d3
            X.6Q6 r0 = r9.A1Y()
            r0.A01()
            goto L_0x01d3
        L_0x01f0:
            java.lang.Object r6 = r7.A00
            X.1Y6 r6 = (X.AnonymousClass1Y6) r6
            X.5xD r10 = (X.C123865xD) r10
            X.0yC r4 = r6.A01
            X.3Qa r0 = r9.A1J
            X.11F r0 = r0.A00
            boolean r0 = r0 instanceof X.C177528dw
            boolean r0 = X.AnonymousClass3T2.A03(r4, r9, r0)
            r5 = 1
            if (r0 == 0) goto L_0x0294
            X.6Fj r3 = r10.A02
            X.3L1 r0 = r9.A0a
            if (r0 != 0) goto L_0x0213
            X.3L1 r0 = new X.3L1
            r0.<init>()
            r9.A12(r0)
        L_0x0213:
            X.3L1 r2 = r9.A0a
            java.lang.String r0 = r3.A05()
            if (r0 != 0) goto L_0x0221
            monitor-enter(r3)
            boolean r0 = r3.A0G     // Catch:{ all -> 0x0231 }
            monitor-exit(r3)
            if (r0 == 0) goto L_0x0227
        L_0x0221:
            java.lang.String r0 = r3.A05()
            r2.A05 = r0
        L_0x0227:
            java.lang.String r0 = r3.A06()
            if (r0 != 0) goto L_0x0237
            monitor-enter(r3)
            boolean r0 = r3.A0H     // Catch:{ all -> 0x0231 }
            goto L_0x0234
        L_0x0231:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0234:
            monitor-exit(r3)
            if (r0 == 0) goto L_0x023d
        L_0x0237:
            java.lang.String r0 = r3.A06()
            r2.A08 = r0
        L_0x023d:
            X.6Rx r0 = r3.A00()
            if (r0 == 0) goto L_0x0253
            X.6Rx r0 = r3.A00()
            byte[] r0 = r0.A01
            r2.A0A = r0
            X.6Rx r0 = r3.A00()
            long r0 = r0.A00
            r2.A02 = r0
        L_0x0253:
            int r0 = r10.A00
            if (r0 != 0) goto L_0x0269
            java.lang.String r0 = r3.A03()
            if (r0 == 0) goto L_0x0269
            X.1D8 r1 = r6.A03
            java.lang.String r0 = r3.A03()
            java.lang.String r0 = r1.A00(r0, r5)
            r2.A04 = r0
        L_0x0269:
            boolean r0 = X.AnonymousClass3T2.A02(r4, r9)
            r2.A0C = r0
            goto L_0x0294
        L_0x0270:
            r2 = 1
            r9.A0n(r2)
            r8.A0f = r2
            r0 = 0
            r8.A0E = r0
            r8.A0Q = r2
            goto L_0x0294
        L_0x027d:
            r0 = 1
            r9.A0n(r0)
            r8.A0f = r0
            r0 = 0
        L_0x0285:
            r8.A0E = r0
            goto L_0x0294
        L_0x0288:
            int r1 = X.AnonymousClass000.A0I(r10)
            r0 = 0
            r8.A0f = r0
            r0 = 1
            if (r1 != 0) goto L_0x0294
            r8.A0V = r0
        L_0x0294:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C164887sX.B1E(X.3Qj, X.2bU, java.lang.Object):boolean");
    }
}
