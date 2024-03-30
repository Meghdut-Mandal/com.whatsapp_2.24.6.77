package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4nI  reason: invalid class name and case insensitive filesystem */
public class C96414nI extends AnonymousClass0UE {
    public final C1271967i A00;
    public final C140456lc A01;
    public final C160377ku A02;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C96414nI)) {
            return false;
        }
        C96414nI r6 = (C96414nI) obj;
        return r6.A02 == this.A02 && r6.A01.A0T(53, 0) == this.A01.A0T(53, 0);
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        String str;
        C140456lc r3 = this.A01;
        int A0T = r3.A0T(53, 0);
        if (A0T != 0) {
            if (recyclerView.canScrollVertically(A0T)) {
                str = "can_scroll";
            } else {
                str = "cannot_scroll";
            }
            C1273868b A002 = C1273868b.A00();
            A002.A0A(str, 0);
            C1271967i r2 = this.A00;
            C131756Qk.A02(r2, r3, C1273868b.A04(A002, r2, 1), this.A02);
        }
    }

    public C96414nI(C1271967i r1, C140456lc r2, C160377ku r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
