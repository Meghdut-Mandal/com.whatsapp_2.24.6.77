package X;

/* renamed from: X.B8g  reason: case insensitive filesystem */
public class C23172B8g implements AnonymousClass4Q6 {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C23172B8g(Object obj, int i, int i2, Object obj2) {
        this.A03 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A02 = obj2;
    }

    public final void BU2(Object obj) {
        AnonymousClass3T1 r1;
        switch (this.A03) {
            case 0:
                C175228a3 r2 = (C175228a3) this.A01;
                int i = this.A00;
                C34211gd r0 = (C34211gd) this.A02;
                AnonymousClass9OK r6 = (AnonymousClass9OK) obj;
                if (r6 != null) {
                    C175228a3.A04(r6, r2, r0, i);
                    return;
                }
                return;
            case 1:
                C175228a3 r4 = (C175228a3) this.A01;
                int i2 = this.A00;
                C34211gd r22 = (C34211gd) this.A02;
                AnonymousClass9OK r62 = (AnonymousClass9OK) obj;
                if (r62 != null && (r1 = r62.A03) != null && AnonymousClass3TK.A03(r1, r62.A04)) {
                    C175228a3.A04(r62, r4, r22, i2);
                    return;
                }
                return;
            default:
                C175238a4 r3 = (C175238a4) this.A01;
                int i3 = this.A00;
                C34211gd r02 = (C34211gd) this.A02;
                C192469Hc r63 = (C192469Hc) obj;
                if (r63 != null) {
                    C193999Ns r23 = r63.A01;
                    boolean A0D = C175238a4.A0D(r23, r3, r02, i3);
                    if (r23.A02 != null) {
                        C175238a4.A06(r63.A00, r23, r3, A0D);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
