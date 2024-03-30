package X;

/* renamed from: X.6f2  reason: invalid class name and case insensitive filesystem */
public final class C136816f2 implements C161167mI {
    public final int A00;
    public final Object[] A01;
    public final C06700Us A02;

    public int BCd(Object obj) {
        C06700Us r0 = this.A02;
        int A03 = r0.A03(obj);
        if (A03 >= 0) {
            return r0.A02[A03];
        }
        return -1;
    }

    public C136816f2(C136786ez r10, C15020mZ r11) {
        C130786Mk r8 = r10.A00;
        int i = r11.A00;
        if (i >= 0) {
            int min = Math.min(r11.A01, r8.A00 - 1);
            if (min < i) {
                AnonymousClass0G9 r1 = AnonymousClass0RA.A00;
                AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
                this.A02 = r1;
                this.A01 = new Object[0];
                return;
            }
            int i2 = (min - i) + 1;
            this.A01 = new Object[i2];
            this.A00 = i;
            AnonymousClass0G9 r5 = new AnonymousClass0G9(i2);
            AnonymousClass7V0 r4 = new AnonymousClass7V0(r5, this, i, min);
            C130786Mk.A00(r8, i);
            C130786Mk.A00(r8, min);
            if (min >= i) {
                C1506776e r3 = r8.A02;
                int A002 = AnonymousClass5W1.A00(r3, i);
                int i3 = ((C120625ro) r3.A01[A002]).A01;
                while (i3 <= min) {
                    C120625ro r0 = (C120625ro) r3.A01[A002];
                    r4.invoke(r0);
                    i3 += r0.A00;
                    A002++;
                }
                this.A02 = r5;
                return;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("toIndex (");
            A0u.append(min);
            A0u.append(") should be not smaller than fromIndex (");
            throw AnonymousClass001.A08(C36321k7.A0G(A0u, i));
        }
        throw AnonymousClass001.A09("negative nearestRange.first");
    }
}
