package X;

/* renamed from: X.641  reason: invalid class name */
public final class AnonymousClass641 {
    public long A00;
    public AnonymousClass4V2 A01;
    public int A02 = -1;
    public final int A03;
    public final C88924Uo A04;

    public AnonymousClass641(C88924Uo r2, int i) {
        AnonymousClass00C.A0D(r2, 1);
        this.A04 = r2;
        this.A03 = i;
    }

    public final boolean A00() {
        int i = this.A02;
        C88924Uo r1 = this.A04;
        if (i >= r1.getCount() - 1) {
            return false;
        }
        int i2 = this.A02 + 1;
        this.A02 = i2;
        AnonymousClass4V2 BDy = r1.BDy(i2);
        this.A01 = BDy;
        if (BDy != null) {
            this.A00 = BDy.BAn();
        }
        return true;
    }
}
