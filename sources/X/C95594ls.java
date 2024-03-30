package X;

import java.util.List;

/* renamed from: X.4ls  reason: invalid class name and case insensitive filesystem */
public final class C95594ls extends C06730Uv {
    public final List A00;
    public final List A01;

    public C95594ls(List list, List list2) {
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
        String str;
        String str2;
        C1267165e r5 = (C1267165e) this.A01.get(i);
        C1267165e r4 = (C1267165e) this.A00.get(i2);
        boolean z = r5 instanceof C106595Km;
        if (z) {
            str = ((C106595Km) r5).A01;
        } else {
            str = ((C106605Kn) r5).A03;
        }
        boolean z2 = r4 instanceof C106595Km;
        if (z2) {
            str2 = ((C106595Km) r4).A01;
        } else {
            str2 = ((C106605Kn) r4).A03;
        }
        if (!AnonymousClass00C.A0J(str, str2)) {
            return false;
        }
        if ((!(r5 instanceof C106605Kn) || !(r4 instanceof C106605Kn)) && (!z || !z2)) {
            return false;
        }
        return true;
    }
}
