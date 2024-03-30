package X;

import java.util.ArrayList;

/* renamed from: X.B9n  reason: case insensitive filesystem */
public class C23205B9n implements C25711Hj {
    public int A00;
    public Object A01;
    public final int A02;

    public C23205B9n(AnonymousClass8UW r1, int i, int i2) {
        this.A02 = i2;
        this.A01 = r1;
        this.A00 = i;
    }

    public final void accept(Object obj) {
        ArrayList arrayList;
        C52852qH r1;
        int i = this.A02;
        AnonymousClass8UW r3 = (AnonymousClass8UW) this.A01;
        int i2 = this.A00;
        synchronized (r3) {
            if (i != 0) {
                r3.A02.set(i2, obj);
                r3.A01 = true;
                int i3 = r3.A00 - 1;
                r3.A00 = i3;
                if (i3 != 0) {
                    return;
                }
            } else {
                r3.A03.set(i2, obj);
                int i4 = r3.A00 - 1;
                r3.A00 = i4;
                if (i4 != 0) {
                    return;
                }
            }
            synchronized (r3) {
                arrayList = null;
                if (r3.A01) {
                    r1 = null;
                    arrayList = C36441kJ.A15(r3.A02);
                } else {
                    r1 = new C52852qH(r3.A03);
                }
            }
            if (arrayList != null) {
                r3.A0C(arrayList);
            } else {
                r3.A0D(r1);
            }
        }
    }
}
