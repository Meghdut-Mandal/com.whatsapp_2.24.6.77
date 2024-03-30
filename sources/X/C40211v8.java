package X;

import java.util.List;

/* renamed from: X.1v8  reason: invalid class name and case insensitive filesystem */
public final class C40211v8 extends C06730Uv {
    public final List A00;
    public final List A01;

    public C40211v8(List list, List list2) {
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
        C588731j r4 = (C588731j) this.A01.get(i);
        C588731j r3 = (C588731j) this.A00.get(i2);
        if ((r4 instanceof AnonymousClass2MK) && (r3 instanceof AnonymousClass2MK)) {
            AnonymousClass2MK r42 = (AnonymousClass2MK) r4;
            AnonymousClass2MK r32 = (AnonymousClass2MK) r3;
            if (!AnonymousClass00C.A0J(r42.A01.A1J.A01, r32.A01.A1J.A01) || r42.A02 != r32.A02) {
                return false;
            }
            return true;
        } else if (!(r4 instanceof AnonymousClass2MJ) || !(r3 instanceof AnonymousClass2MJ)) {
            return false;
        } else {
            return AnonymousClass00C.A0J(((AnonymousClass2MJ) r4).A00, ((AnonymousClass2MJ) r3).A00);
        }
    }

    public boolean A04(int i, int i2) {
        return AnonymousClass00C.A0J(this.A01.get(i), this.A00.get(i2));
    }
}
