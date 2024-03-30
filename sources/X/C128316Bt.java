package X;

import java.util.Arrays;

/* renamed from: X.6Bt  reason: invalid class name and case insensitive filesystem */
public final class C128316Bt {
    public long A00 = C133206Xf.A03;
    public long A01;
    public final AnonymousClass6O9 A02;
    public final AnonymousClass6O9 A03;

    public final long A00(long j) {
        long j2 = C133156Wz.A01;
        float A012 = C90464aC.A01(j);
        if (A012 > 0.0f) {
            float A002 = C90464aC.A00(j);
            if (A002 > 0.0f) {
                return C90464aC.A0B(this.A02.A00(A012), this.A03.A00(A002));
            }
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("maximumVelocity should be a positive value. You specified=");
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append('(');
        A0u2.append(C90464aC.A01(j));
        C90504aG.A1M(A0u2);
        A0u2.append(C90464aC.A00(j));
        throw AnonymousClass001.A09(AnonymousClass000.A0o(AnonymousClass000.A0q(") px/sec", A0u2), A0u));
    }

    public final void A01() {
        AnonymousClass6O9 r1 = this.A02;
        Arrays.fill(r1.A04, 0, 20, (Object) null);
        r1.A00 = 0;
        AnonymousClass6O9 r12 = this.A03;
        Arrays.fill(r12.A04, 0, 20, (Object) null);
        r12.A00 = 0;
        this.A01 = 0;
    }

    public final void A02(long j, long j2) {
        AnonymousClass6O9 r1 = this.A02;
        float A002 = C133206Xf.A00(j2);
        int i = (r1.A00 + 1) % 20;
        r1.A00 = i;
        AnonymousClass69E[] r12 = r1.A04;
        C161547n5 r0 = C129566Ho.A00;
        AnonymousClass69E r02 = r12[i];
        if (r02 == null) {
            r12[i] = new AnonymousClass69E(A002, j);
        } else {
            r02.A01 = j;
            r02.A00 = A002;
        }
        AnonymousClass6O9 r13 = this.A03;
        float A012 = C133206Xf.A01(j2);
        int i2 = (r13.A00 + 1) % 20;
        r13.A00 = i2;
        AnonymousClass69E[] r14 = r13.A04;
        AnonymousClass69E r03 = r14[i2];
        if (r03 == null) {
            r14[i2] = new AnonymousClass69E(A012, j);
            return;
        }
        r03.A01 = j;
        r03.A00 = A012;
    }

    public C128316Bt() {
        Integer num = C023109s.A00;
        this.A02 = new AnonymousClass6O9(num, false);
        this.A03 = new AnonymousClass6O9(num, false);
    }
}
