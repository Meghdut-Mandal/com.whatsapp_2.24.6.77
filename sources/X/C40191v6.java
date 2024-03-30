package X;

import java.util.List;

/* renamed from: X.1v6  reason: invalid class name and case insensitive filesystem */
public final class C40191v6 extends C06730Uv {
    public final List A00;
    public final List A01;

    public C40191v6(List list, List list2) {
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
        return AnonymousClass000.A1S(((AnonymousClass3HQ) this.A01.get(i)).A00, ((AnonymousClass3HQ) this.A00.get(i2)).A00);
    }

    public boolean A04(int i, int i2) {
        return AnonymousClass000.A1S(((AnonymousClass3HQ) this.A01.get(i)).A00, ((AnonymousClass3HQ) this.A00.get(i2)).A00);
    }
}
