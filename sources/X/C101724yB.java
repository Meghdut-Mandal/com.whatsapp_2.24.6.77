package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4yB  reason: invalid class name and case insensitive filesystem */
public class C101724yB extends C33131el {
    public boolean A00 = true;
    public boolean A01 = true;
    public boolean A02 = true;
    public boolean A03 = true;
    public final C33101ei A04;
    public final Object A05 = C36441kJ.A11();
    public final AnonymousClass6FS A06;
    public final C33171eq A07;

    public String toString() {
        return "backup-condition";
    }

    public boolean A00() {
        C33101ei r7 = this.A04;
        AtomicBoolean atomicBoolean = r7.A0Q;
        if (atomicBoolean.get()) {
            boolean A1S = C90484aE.A1S(r7, this.A07, this.A06.A00());
            synchronized (this.A05) {
                boolean z = false;
                if (r7.A0H.A04 == 2) {
                    z = true;
                }
                this.A03 = z;
                this.A02 = r7.A09;
                this.A00 = r7.A05;
                this.A01 = r7.A0U.get();
            }
            if (!A1S || !atomicBoolean.get()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean A01() {
        boolean z;
        synchronized (this.A05) {
            z = this.A00;
        }
        return z;
    }

    public boolean A02() {
        boolean z;
        synchronized (this.A05) {
            z = this.A01;
        }
        return z;
    }

    public boolean A03() {
        boolean z;
        synchronized (this.A05) {
            z = this.A02;
        }
        return z;
    }

    public boolean A04() {
        boolean z;
        synchronized (this.A05) {
            z = this.A03;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        if (r3.A00 == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A05
            monitor-enter(r2)
            boolean r0 = r3.A02     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0014
            boolean r0 = r3.A01     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0014
            boolean r0 = r3.A03     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0014
            boolean r1 = r3.A00     // Catch:{ all -> 0x0017 }
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            return r0
        L_0x0017:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101724yB.A05():boolean");
    }

    public C101724yB(C33101ei r2, AnonymousClass6FS r3, C33171eq r4) {
        this.A06 = r3;
        this.A04 = r2;
        this.A07 = r4;
    }
}
