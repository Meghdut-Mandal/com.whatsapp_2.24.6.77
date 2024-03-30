package X;

import com.whatsapp.util.Log;

/* renamed from: X.3wg  reason: invalid class name and case insensitive filesystem */
public class C81233wg implements Runnable {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public final int A04 = 0;

    public C81233wg(C608439o r2, C70083eZ r3, int i, long j) {
        this.A02 = r3;
        this.A03 = r2;
        this.A00 = i;
        this.A01 = j;
    }

    public final void run() {
        AnonymousClass3I3 A06;
        Boolean bool;
        C64933Qa r0;
        if (this.A04 != 0) {
            AnonymousClass3PQ r4 = (AnonymousClass3PQ) this.A02;
            int i = this.A00;
            AnonymousClass3T1 r6 = (AnonymousClass3T1) this.A03;
            long j = this.A01;
            C63613Ks r3 = new C63613Ks(r4.A01, i, 40);
            r3.A02 = AnonymousClass3O7.A00(r3.A08);
            AnonymousClass11F r02 = r6.A1J.A00;
            r3.A01(r02);
            r3.A02(r02);
            r3.A03(r6);
            r3.A01 = Long.valueOf(j);
            AnonymousClass5J2 r03 = r6.A1V;
            if (r03 == null || (r0 = r03.A1J) == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(r0.A02);
            }
            r3.A00 = bool;
            r4.A00.Blx(r3.A00(), AnonymousClass3PQ.A03);
            return;
        }
        C70083eZ r5 = (C70083eZ) this.A02;
        C608439o r10 = (C608439o) this.A03;
        int i2 = this.A00;
        long j2 = this.A01;
        if (r10 == null || (A06 = r5.A03.A06(r10.A00, r10.A03)) == null) {
            Log.e("CompanionRegistrationLogger/no session id");
            return;
        }
        AnonymousClass2S7 r2 = new AnonymousClass2S7();
        r2.A08 = A06.A01;
        r2.A07 = A06.A00;
        long A09 = C36371kC.A09(r5.A04);
        r2.A06 = Long.valueOf(A09);
        r2.A04 = Long.valueOf(A09 - r5.A01);
        r5.A01 = A09;
        r2.A01 = Integer.valueOf(i2);
        r2.A05 = Long.valueOf(j2);
        r2.A00 = r10.A02;
        r2.A03 = Integer.valueOf(r5.A00);
        if (r5.A05.A0E(6500)) {
            r2.A02 = C36361kB.A0i();
        }
        r5.A06.Bly(r2);
    }

    public C81233wg(AnonymousClass3PQ r2, AnonymousClass3T1 r3, int i, long j) {
        this.A02 = r2;
        this.A00 = i;
        this.A03 = r3;
        this.A01 = j;
    }
}
