package X;

import java.util.List;

/* renamed from: X.1v9  reason: invalid class name and case insensitive filesystem */
public final class C40221v9 extends C06730Uv {
    public final List A00;
    public final List A01;

    public C40221v9(List list, List list2) {
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
        Object obj;
        AnonymousClass2bT r0;
        Object obj2;
        C588831k r4 = (C588831k) this.A01.get(i);
        C588831k r3 = (C588831k) this.A00.get(i2);
        if ((r4 instanceof AnonymousClass2MU) && (r3 instanceof AnonymousClass2MU)) {
            obj = ((AnonymousClass2MU) r4).A02;
            obj2 = ((AnonymousClass2MU) r3).A02;
        } else if (!(r4 instanceof AnonymousClass2MT) || !(r3 instanceof AnonymousClass2MT)) {
            if ((r4 instanceof AnonymousClass2MR) && (r3 instanceof AnonymousClass2MR)) {
                obj = ((AnonymousClass2MR) r4).A00.A1J.A01;
                r0 = ((AnonymousClass2MR) r3).A00;
            } else if (!(r4 instanceof AnonymousClass2MS) || !(r3 instanceof AnonymousClass2MS)) {
                return false;
            } else {
                obj = ((AnonymousClass2MS) r4).A00.A1J.A01;
                r0 = ((AnonymousClass2MS) r3).A00;
            }
            obj2 = r0.A1J.A01;
        } else {
            AnonymousClass2MT r42 = (AnonymousClass2MT) r4;
            AnonymousClass2MT r32 = (AnonymousClass2MT) r3;
            if (!AnonymousClass00C.A0J(r42.A01, r32.A01) || r42.A00 != r32.A00) {
                return false;
            }
            return true;
        }
        return AnonymousClass00C.A0J(obj, obj2);
    }

    public boolean A04(int i, int i2) {
        return AnonymousClass00C.A0J(this.A01.get(i), this.A00.get(i2));
    }
}
