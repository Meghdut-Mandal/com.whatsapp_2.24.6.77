package X;

import java.util.List;

/* renamed from: X.1v5  reason: invalid class name and case insensitive filesystem */
public final class C40181v5 extends C06730Uv {
    public final List A00;
    public final List A01;

    public C40181v5(List list, List list2) {
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
        return AnonymousClass00C.A0J(this.A01.get(i), this.A00.get(i2));
    }

    public boolean A04(int i, int i2) {
        return C36361kB.A1a(this.A01.get(i), this.A00.get(i2));
    }
}
