package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4nH  reason: invalid class name and case insensitive filesystem */
public class C96404nH extends AnonymousClass0UE {
    public final C1271967i A00;
    public final C140456lc A01;
    public final C160377ku A02;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C96404nH)) {
            return false;
        }
        C96404nH r4 = (C96404nH) obj;
        return r4.A02 == this.A02 && r4.A01 == this.A01;
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        if (i != 0 || i2 != 0) {
            C140456lc r3 = this.A01;
            C160377ku r2 = this.A02;
            C131756Qk.A02(this.A00, r3, C1273868b.A04(C1273868b.A00(), r3, 0), r2);
        }
    }

    public C96404nH(C1271967i r1, C140456lc r2, C160377ku r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
