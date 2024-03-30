package X;

import java.util.List;

/* renamed from: X.4lp  reason: invalid class name and case insensitive filesystem */
public final class C95564lp extends C06730Uv {
    public List A00;
    public List A01;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        return this.A01.get(i).equals(this.A00.get(i2));
    }

    public boolean A04(int i, int i2) {
        return C129066Eu.A00((C129066Eu) this.A01.get(i), (C129066Eu) this.A00.get(i2));
    }

    public C95564lp(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
