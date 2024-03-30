package X;

import android.os.SystemClock;

/* renamed from: X.3Qc  reason: invalid class name and case insensitive filesystem */
public class C64953Qc {
    public long A00;
    public AnonymousClass2RC A01;
    public final AnonymousClass17X A02;
    public final AnonymousClass1GX A03;
    public final C19970wo A04;
    public final C20810yC A05;
    public final C21010yW A06;

    public static void A00(C64953Qc r6) {
        AnonymousClass2RC r5 = r6.A01;
        C18740tg.A06(r5);
        long j = r6.A00;
        long j2 = 0;
        if (j != 0) {
            j2 = SystemClock.elapsedRealtime() - j;
        }
        r5.A05 = Long.valueOf(j2);
        r6.A00 = SystemClock.elapsedRealtime();
    }

    public void A01() {
        AnonymousClass2RC r1 = this.A01;
        C18740tg.A06(r1);
        this.A06.Bly(r1);
    }

    public void A02(int i) {
        AnonymousClass2RC r1 = this.A01;
        if (r1 != null && r1.A02.intValue() == i) {
            r1.A01 = C36371kC.A0n();
            A00(this);
            A01();
            if (this.A05.A0E(3223)) {
                this.A01.A02 = C36361kB.A0i();
                return;
            }
            this.A00 = 0;
            if (this.A01 != null) {
                this.A01 = null;
            }
        }
    }

    public void A03(int i) {
        AnonymousClass2RC r1 = this.A01;
        if (r1 != null && r1.A02.intValue() == i) {
            r1.A01 = C36361kB.A0j();
            A00(this);
            A01();
            this.A00 = 0;
            if (this.A01 != null) {
                this.A01 = null;
            }
        }
    }

    public void A04(AnonymousClass11F r4) {
        this.A00 = 0;
        if (this.A01 != null) {
            this.A01 = null;
        }
        AnonymousClass2RC r2 = new AnonymousClass2RC();
        this.A01 = r2;
        if (r4 != null) {
            boolean A0G = AnonymousClass143.A0G(r4);
            r2.A00 = Boolean.valueOf(A0G);
            if (A0G) {
                r2.A03 = Integer.valueOf(AnonymousClass3UK.A03(this.A02.A07.A0A((AnonymousClass144) r4)));
            }
        }
        A00(this);
        AnonymousClass2RC r1 = this.A01;
        Integer A0i = C36361kB.A0i();
        r1.A01 = A0i;
        r1.A02 = A0i;
        A01();
    }

    public C64953Qc(C19970wo r1, AnonymousClass17X r2, C20810yC r3, C21010yW r4, AnonymousClass1GX r5) {
        this.A04 = r1;
        this.A05 = r3;
        this.A06 = r4;
        this.A03 = r5;
        this.A02 = r2;
    }
}
