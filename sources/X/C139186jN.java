package X;

import android.net.Uri;

/* renamed from: X.6jN  reason: invalid class name and case insensitive filesystem */
public class C139186jN implements B39 {
    public boolean A00;
    public final C225314u A01;
    public final C19680wL A02 = new C144346s2(this);
    public final C19600wD A03;
    public final AnonymousClass6Fc A04;
    public final AnonymousClass61H A05;
    public final AnonymousClass17Y A06;
    public final AnonymousClass171 A07;
    public final C139196jO A08;

    public void B0p(B2E b2e) {
    }

    public /* synthetic */ void cancel() {
        throw null;
    }

    public Uri BIj() {
        return this.A08.BIj();
    }

    public long Bks(C202189lD r3) {
        C1497472p.A00(this.A06, this, 28);
        return this.A08.Bks(r3);
    }

    public void close() {
        C1497472p.A00(this.A06, this, 27);
        this.A08.close();
    }

    public int read(byte[] bArr, int i, int i2) {
        return this.A08.read(bArr, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c8, code lost:
        if (r1 == false) goto L_0x00ca;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C139186jN(X.C225314u r14, X.AnonymousClass17Y r15, X.AnonymousClass1X4 r16, X.C19600wD r17, X.AnonymousClass171 r18, X.C19630wG r19, X.C20060wx r20, X.AnonymousClass1A5 r21, X.AnonymousClass1SU r22, X.AnonymousClass1ST r23, X.C46932bu r24, X.AnonymousClass5NM r25, X.AnonymousClass61H r26) {
        /*
            r13 = this;
            r13.<init>()
            r12 = r26
            r13.A05 = r12
            X.6s2 r0 = new X.6s2
            r0.<init>(r13)
            r13.A02 = r0
            r13.A06 = r15
            r6 = r18
            r13.A07 = r6
            r0 = r17
            r13.A03 = r0
            r13.A01 = r14
            r10 = r24
            X.3Qj r1 = X.AnonymousClass2bU.A00(r10)
            r2 = r22
            X.4xN r0 = r2.A00(r1)
            if (r0 != 0) goto L_0x002e
            r0 = 0
            r3 = r16
            r3.A0G(r14, r10, r0)
        L_0x002e:
            X.4xN r1 = r2.A00(r1)
            if (r1 == 0) goto L_0x011c
            X.6Fc r11 = r1.A0q
            if (r11 == 0) goto L_0x011c
            r13.A04 = r11
            r0 = 1
            r11.A0D = r0
            r11.A0E = r0
            X.6Fk r2 = r1.A0j
            r3 = r25
            X.6Fk r0 = r3.A04
            if (r0 != 0) goto L_0x004d
            long r0 = r2.A06()
            r3.A02 = r0
        L_0x004d:
            r3.A04 = r2
            X.6jO r5 = new X.6jO
            r7 = r19
            r8 = r20
            r9 = r21
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r13.A08 = r5
            int r1 = r11.A00()
            r0 = 4
            if (r1 != r0) goto L_0x0077
            java.lang.String r3 = X.C111835cv.A00(r14, r6, r9, r10, r11)
            boolean r2 = r11.A08()
            r1 = 1
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            X.61H r0 = r13.A05
            if (r0 == 0) goto L_0x0077
            r0.A00(r3, r2, r1)
        L_0x0077:
            X.3Qj r0 = X.AnonymousClass2bU.A00(r10)
            r7 = r23
            X.1SU r5 = r7.A0E
            X.4xN r1 = r5.A00(r0)
            if (r1 == 0) goto L_0x011b
            boolean r0 = X.AnonymousClass1ST.A07(r7, r10)
            if (r0 == 0) goto L_0x011b
            r6 = 1
            r1.A15 = r6
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            X.1TS r3 = r7.A0F
            monitor-enter(r3)
            android.os.ConditionVariable r0 = r7.A01     // Catch:{ all -> 0x0118 }
            r0.close()     // Catch:{ all -> 0x0118 }
            java.util.ArrayList r0 = r7.A0B()     // Catch:{ all -> 0x0118 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0118 }
        L_0x00a2:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0118 }
            if (r0 == 0) goto L_0x00d8
            X.2bU r8 = X.C36441kJ.A0r(r9)     // Catch:{ all -> 0x0118 }
            X.3Qj r0 = r8.A01     // Catch:{ all -> 0x0118 }
            if (r0 == 0) goto L_0x00a2
            X.3Qa r0 = r8.A1J     // Catch:{ all -> 0x0118 }
            X.11F r0 = r0.A00     // Catch:{ all -> 0x0118 }
            boolean r0 = r0 instanceof X.C28981Uw     // Catch:{ all -> 0x0118 }
            if (r0 == 0) goto L_0x00d2
            X.1TR r2 = r7.A0I     // Catch:{ all -> 0x0118 }
        L_0x00ba:
            monitor-enter(r2)     // Catch:{ all -> 0x0118 }
            java.util.Map r0 = r2.A01     // Catch:{ all -> 0x00d5 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x00d5 }
            X.75K r0 = (X.AnonymousClass75K) r0     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x00ca
            boolean r1 = r0.A03     // Catch:{ all -> 0x00d5 }
            r0 = 1
            if (r1 != 0) goto L_0x00cb
        L_0x00ca:
            r0 = 0
        L_0x00cb:
            monitor-exit(r2)     // Catch:{ all -> 0x0118 }
            if (r0 == 0) goto L_0x00a2
            r4.add(r8)     // Catch:{ all -> 0x0118 }
            goto L_0x00a2
        L_0x00d2:
            X.1TQ r2 = r7.A0H     // Catch:{ all -> 0x0118 }
            goto L_0x00ba
        L_0x00d5:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0118 }
            throw r0     // Catch:{ all -> 0x0118 }
        L_0x00d8:
            monitor-exit(r3)     // Catch:{ all -> 0x0118 }
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x010c
            java.util.Iterator r4 = r4.iterator()
        L_0x00e3:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x010c
            X.2bU r3 = X.C36441kJ.A0r(r4)
            X.4xN r1 = r7.A0A(r3)
            if (r1 == 0) goto L_0x00e3
            boolean r0 = r1.A15
            if (r0 != 0) goto L_0x00e3
            int r0 = r1.A14
            if (r0 != r6) goto L_0x00e3
            java.util.HashMap r2 = r7.A0P
            monitor-enter(r2)
            long r0 = r1.A08     // Catch:{ all -> 0x0109 }
            X.C36421kH.A1K(r3, r2, r0)     // Catch:{ all -> 0x0109 }
            monitor-exit(r2)     // Catch:{ all -> 0x0109 }
            r0 = 0
            X.AnonymousClass1ST.A06(r7, r3, r0, r0)
            goto L_0x00e3
        L_0x0109:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0109 }
            throw r0
        L_0x010c:
            X.0wU r1 = r7.A0O
            X.3Qj r0 = r10.A01
            X.4xN r0 = r5.A00(r0)
            r1.Boy(r0)
            return
        L_0x0118:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0118 }
            throw r0
        L_0x011b:
            return
        L_0x011c:
            java.lang.String r0 = "download file is null"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139186jN.<init>(X.14u, X.17Y, X.1X4, X.0wD, X.171, X.0wG, X.0wx, X.1A5, X.1SU, X.1ST, X.2bu, X.5NM, X.61H):void");
    }
}
