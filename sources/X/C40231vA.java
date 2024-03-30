package X;

import java.util.List;

/* renamed from: X.1vA  reason: invalid class name and case insensitive filesystem */
public final class C40231vA extends C06730Uv {
    public final List A00;
    public final List A01;

    public C40231vA(List list, List list2) {
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
        return AnonymousClass00C.A0J(((C21667AUj) this.A01.get(i)).A06, ((C21667AUj) this.A00.get(i2)).A06);
    }

    public boolean A04(int i, int i2) {
        return AnonymousClass00C.A0J(this.A01.get(i), this.A00.get(i2));
    }
}
