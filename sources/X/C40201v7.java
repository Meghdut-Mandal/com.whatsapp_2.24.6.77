package X;

import java.util.List;

/* renamed from: X.1v7  reason: invalid class name and case insensitive filesystem */
public final class C40201v7 extends C06730Uv {
    public final List A00;
    public final List A01;

    public C40201v7(List list, List list2) {
        AnonymousClass00C.A0D(list, 1);
        this.A01 = list;
        this.A00 = list2;
    }

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        C62873Hw r3 = (C62873Hw) this.A01.get(i);
        C62873Hw r2 = (C62873Hw) this.A00.get(i2);
        if (r3.A00 != r2.A00 || !AnonymousClass00C.A0J(r3.A01, r2.A01)) {
            return false;
        }
        return true;
    }

    public boolean A04(int i, int i2) {
        return AnonymousClass00C.A0J(this.A01.get(i), this.A00.get(i2));
    }
}
