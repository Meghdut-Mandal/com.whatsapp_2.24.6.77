package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.6iK  reason: invalid class name and case insensitive filesystem */
public final class C138566iK implements C02860Ce {
    public int A00 = -1;
    public final RecyclerView A01;
    public final C168177zp A02;

    public void BTI(Object obj, int i, int i2) {
        this.A02.A01.A04(obj, i, i2);
    }

    public void BZE(int i, int i2) {
        int i3 = this.A00;
        if (i3 == -1 || i3 > i) {
            this.A00 = i;
            this.A01.A0h(0);
        }
        this.A02.A01.A02(i, i2);
    }

    public void BbD(int i, int i2) {
        this.A02.A01.A01(i, i2);
    }

    public void Beb(int i, int i2) {
        this.A02.A01.A03(i, i2);
    }

    public C138566iK(RecyclerView recyclerView, C168177zp r3) {
        this.A02 = r3;
        this.A01 = recyclerView;
    }
}
