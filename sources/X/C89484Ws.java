package X;

/* renamed from: X.4Ws  reason: invalid class name and case insensitive filesystem */
public class C89484Ws implements C88734Tv {
    public Object A00;
    public final int A01;

    public C89484Ws(AnonymousClass3UB r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public int BDr() {
        int i = this.A01;
        AnonymousClass3UB r0 = (AnonymousClass3UB) this.A00;
        if (i == 0) {
            return r0.A0L;
        }
        C65083Qq r02 = r0.A09.A00;
        if (r02 != null) {
            return r02.A05();
        }
        return 0;
    }

    public C34831hi BHT() {
        if (this.A01 != 0) {
            return ((AnonymousClass3UB) this.A00).A0n;
        }
        return ((AnonymousClass3UB) this.A00).A0l;
    }

    public int getValue() {
        if (this.A01 != 0) {
            C65083Qq r0 = ((AnonymousClass3UB) this.A00).A09.A00;
            if (r0 != null) {
                return r0.A04();
            }
            return 0;
        }
        AnonymousClass3UB r3 = (AnonymousClass3UB) this.A00;
        long j = r3.A01;
        int i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
        int i2 = r3.A00;
        if (i != 0) {
            return (int) ((((long) i2) + System.currentTimeMillis()) - j);
        }
        return i2;
    }
}
