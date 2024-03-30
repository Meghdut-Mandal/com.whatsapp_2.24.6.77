package X;

/* renamed from: X.4Wt  reason: invalid class name and case insensitive filesystem */
public class C89494Wt implements AnonymousClass4UP {
    public Object A00;
    public final int A01;

    public C89494Wt(AnonymousClass3UB r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public C34831hi BD0() {
        if (this.A01 != 0) {
            return ((AnonymousClass3UB) this.A00).A0n;
        }
        return ((AnonymousClass3UB) this.A00).A0l;
    }

    public C001600r BEL() {
        if (this.A01 != 0) {
            return ((AnonymousClass3UB) this.A00).A0m;
        }
        return C36441kJ.A0s(C36381kD.A0m());
    }

    public int getCurrentPosition() {
        if (this.A01 != 0) {
            C65083Qq r0 = ((AnonymousClass3UB) this.A00).A09.A00;
            if (r0 != null) {
                return r0.A04();
            }
            return 0;
        }
        AnonymousClass3UB r6 = (AnonymousClass3UB) this.A00;
        long j = r6.A01;
        int i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
        long j2 = (long) r6.A00;
        if (i != 0) {
            j2 = (j2 + System.currentTimeMillis()) - j;
        }
        if (C36351kA.A1W(r6.A0l) && j2 > ((long) r6.A0L)) {
            AnonymousClass3UB.A05(r6, new C81133wW((Object) r6, 14));
        }
        return (int) j2;
    }

    public int getDuration() {
        if (this.A01 == 0) {
            return getCurrentPosition();
        }
        C65083Qq r0 = ((AnonymousClass3UB) this.A00).A09.A00;
        if (r0 != null) {
            return r0.A05();
        }
        return 0;
    }
}
