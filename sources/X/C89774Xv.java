package X;

/* renamed from: X.4Xv  reason: invalid class name and case insensitive filesystem */
public class C89774Xv implements AnonymousClass4SL {
    public Object A00;
    public final int A01;

    public C89774Xv(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BU7(C65083Qq r10) {
        String str;
        int i;
        if (this.A01 != 0) {
            C47552ex r3 = (C47552ex) this.A00;
            if (r10.A04() != 0) {
                r3.A04++;
            }
            r3.A01++;
            if (r3.A03 == 0) {
                C65083Qq r0 = r3.A02;
                if (r0 != null) {
                    i = r0.A05();
                } else {
                    i = 0;
                }
                r3.A03 = i;
                if (i > 1) {
                    r3.A02 = C47552ex.A08(r3, (long) i);
                } else {
                    r3.A03 = 0;
                }
            }
            int i2 = r3.A04;
            int i3 = r3.A02;
            if (i2 >= i3 || r3.A01 >= i3 * 4) {
                r3.A05.A00();
                return;
            }
            r3.A00 = 0.0f;
            r10.A0L(0);
            r10.A0C();
            return;
        }
        AnonymousClass38P r2 = (AnonymousClass38P) this.A00;
        AnonymousClass00C.A0D(r2, 0);
        AnonymousClass9SQ r32 = r2.A02;
        C65083Qq r1 = r2.A03;
        int A04 = r1.A04();
        int A05 = r1.A05();
        if (r1.A0b()) {
            str = "on";
        } else {
            str = "off";
        }
        r32.A00(Integer.valueOf(r1.A04() - r2.A00), str, 5, A04, A05);
    }
}
