package X;

import java.util.List;

/* renamed from: X.1vB  reason: invalid class name and case insensitive filesystem */
public final class C40241vB extends C06730Uv {
    public final List A00;
    public final List A01;

    public C40241vB(List list, List list2) {
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
        AnonymousClass3IS r3 = (AnonymousClass3IS) this.A01.get(i);
        AnonymousClass3IS r2 = (AnonymousClass3IS) this.A00.get(i2);
        if (r3.A00 != r2.A00 || !AnonymousClass00C.A0J(r3.A01, r2.A01)) {
            return false;
        }
        return true;
    }

    public boolean A04(int i, int i2) {
        return AnonymousClass00C.A0J(this.A01.get(i), this.A00.get(i2));
    }
}
