package X;

/* renamed from: X.6G3  reason: invalid class name */
public abstract class AnonymousClass6G3 {
    public static final void A00(C128976Ek r4, int i, int i2) {
        int i3 = 1 << i;
        int i4 = r4.A03;
        if ((i4 & i3) == 0) {
            r4.A03 = i4 | i3;
            int[] iArr = r4.A05;
            int i5 = r4.A00;
            AnonymousClass6EM r0 = r4.A06[r4.A02 - 1];
            AnonymousClass00C.A0B(r0);
            iArr[(i5 - r0.A00) + i] = i2;
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Already pushed argument ");
        AnonymousClass6EM r02 = r4.A06[r4.A02 - 1];
        AnonymousClass00C.A0B(r02);
        throw AnonymousClass000.A0g(r02.A02(i), A0u);
    }

    public static final void A01(C128976Ek r4, Object obj, int i) {
        int i2 = 1 << i;
        int i3 = r4.A04;
        if ((i3 & i2) == 0) {
            r4.A04 = i3 | i2;
            Object[] objArr = r4.A07;
            int i4 = r4.A01;
            AnonymousClass6EM r0 = r4.A06[r4.A02 - 1];
            AnonymousClass00C.A0B(r0);
            objArr[(i4 - r0.A01) + i] = obj;
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Already pushed argument ");
        AnonymousClass6EM r02 = r4.A06[r4.A02 - 1];
        AnonymousClass00C.A0B(r02);
        throw AnonymousClass000.A0g(r02.A03(i), A0u);
    }
}
