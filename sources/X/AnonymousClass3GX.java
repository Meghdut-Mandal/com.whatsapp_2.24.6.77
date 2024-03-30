package X;

import java.util.List;

/* renamed from: X.3GX  reason: invalid class name */
public final class AnonymousClass3GX {
    public final AnonymousClass17X A00;
    public final C235518x A01;
    public final C21010yW A02;
    public final AnonymousClass17V A03;

    public final void A00(int i, int i2) {
        AnonymousClass2OM r1 = new AnonymousClass2OM();
        r1.A01 = Integer.valueOf(i);
        r1.A00 = Integer.valueOf(i2);
        this.A02.Bly(r1);
    }

    public final void A01(List list, int i, int i2, int i3, int i4, int i5) {
        long j;
        C45372Rc r3 = new C45372Rc();
        int i6 = 1;
        if (i5 == 1) {
            i6 = 0;
        } else if (i5 != 6) {
            i6 = 2;
        }
        r3.A00 = Integer.valueOf(i6);
        r3.A01 = Integer.valueOf(i);
        if (i2 == -1) {
            j = 0;
        } else {
            j = (long) i2;
        }
        r3.A03 = Long.valueOf(j);
        if (list != null) {
            r3.A02 = C36441kJ.A0y(list.size());
            int i7 = 0;
            for (Object obj : list) {
                if (obj instanceof AnonymousClass147) {
                    i7++;
                }
            }
            r3.A04 = C36441kJ.A0y(i7);
            r3.A06 = C36441kJ.A0y(i4);
            r3.A05 = C36441kJ.A0y(i3);
        }
        this.A02.Bly(r3);
    }

    public AnonymousClass3GX(AnonymousClass17X r1, C235518x r2, C21010yW r3, AnonymousClass17V r4) {
        C36321k7.A18(r3, r4, r1, r2);
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
    }
}
