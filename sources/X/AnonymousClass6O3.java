package X;

/* renamed from: X.6O3  reason: invalid class name */
public class AnonymousClass6O3 {
    public final int A00;
    public final C198299dE A01;
    public final C198019cl A02;

    public int A00(long j) {
        C198299dE r6 = this.A01;
        if (r6 != null) {
            int i = r6.A03;
            if (i != 2 && i != 1) {
                C198019cl r0 = this.A02;
                if (r0 != null && ((long) r0.A01) == r6.A05) {
                    return 2;
                }
                if (r6.A06 > j || j >= r6.A04) {
                    return 3;
                }
                return 1;
            } else if (r6.A06 > j || j >= r6.A04) {
                return 0;
            } else {
                return 4;
            }
        }
        return 0;
    }

    public AnonymousClass6O3(C198299dE r1, C198019cl r2, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("IncentiveResult{offerInfo=");
        A0u.append(this.A01);
        A0u.append(", accountIncentiveEligibility=");
        return C90464aC.A0X(this.A02, A0u);
    }

    public AnonymousClass6O3(C198299dE r2, C198019cl r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = 6;
    }
}
