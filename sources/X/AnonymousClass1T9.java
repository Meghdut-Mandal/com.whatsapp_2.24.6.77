package X;

/* renamed from: X.1T9  reason: invalid class name */
public class AnonymousClass1T9 implements C20420xX {
    public AnonymousClass1TL A00;
    public AnonymousClass39K A01;
    public boolean A02;
    public boolean A03;
    public final C19970wo A04;
    public final AnonymousClass19J A05;
    public final C19770wU A06;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r13 == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A00(boolean r13) {
        /*
            r12 = this;
            r5 = r12
            monitor-enter(r5)
            r0 = 1
            r12.A02 = r0     // Catch:{ all -> 0x0048 }
            boolean r0 = r12.A03     // Catch:{ all -> 0x0048 }
            r12.A03 = r13     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x003c
            if (r13 != 0) goto L_0x0046
            X.1TL r0 = r12.A00     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x003e
            X.39K r0 = r12.A01     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x003e
            long r3 = r0.A00     // Catch:{ all -> 0x0048 }
            r0 = 20000(0x4e20, double:9.8813E-320)
            long r3 = r3 + r0
            X.0wo r0 = r12.A04     // Catch:{ all -> 0x0048 }
            long r1 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x0048 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003e
            X.1TL r7 = r12.A00     // Catch:{ all -> 0x0048 }
            X.39K r0 = r12.A01     // Catch:{ all -> 0x0048 }
            X.3Qa r8 = r0.A01     // Catch:{ all -> 0x0048 }
            boolean r10 = r0.A03     // Catch:{ all -> 0x0048 }
            boolean r11 = r0.A02     // Catch:{ all -> 0x0048 }
            X.1Si r0 = r7.A00     // Catch:{ all -> 0x0048 }
            X.0wU r0 = r0.A0G     // Catch:{ all -> 0x0048 }
            r9 = 3
            X.1iU r6 = new X.1iU     // Catch:{ all -> 0x0048 }
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0048 }
            r0.Boy(r6)     // Catch:{ all -> 0x0048 }
            goto L_0x003e
        L_0x003c:
            if (r13 != 0) goto L_0x0046
        L_0x003e:
            r0 = 0
            r12.A01 = r0     // Catch:{ all -> 0x0044 }
            r12.A00 = r0     // Catch:{ all -> 0x0044 }
            goto L_0x0046
        L_0x0044:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r5)
            return
        L_0x0048:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1T9.A00(boolean):void");
    }

    public void BYl() {
        boolean z;
        synchronized (this) {
            this.A02 = false;
            z = this.A03;
        }
        if (z) {
            this.A06.BpM(new C35711j8(this, 41), "PeerPresenceManager/onHandlerConnected", 10000);
        }
    }

    public /* synthetic */ void BYm() {
    }

    public /* synthetic */ void BYn() {
    }

    public /* synthetic */ void BYo() {
    }

    public /* synthetic */ void BYp() {
    }

    public AnonymousClass1T9(AnonymousClass19J r1, C19970wo r2, C19770wU r3) {
        this.A04 = r2;
        this.A06 = r3;
        this.A05 = r1;
    }
}
