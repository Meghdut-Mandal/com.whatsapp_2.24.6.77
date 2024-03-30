package X;

import java.util.List;

/* renamed from: X.7zO  reason: invalid class name and case insensitive filesystem */
public class C167907zO extends C06730Uv {
    public final List A00;
    public final List A01;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        return ((AnonymousClass9IV) this.A01.get(i)).A01.equals(((AnonymousClass9IV) this.A00.get(i2)).A01);
    }

    public boolean A04(int i, int i2) {
        return AnonymousClass000.A1S(((AnonymousClass9IV) this.A01.get(i)).A00, ((AnonymousClass9IV) this.A00.get(i2)).A00);
    }

    public C167907zO(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
