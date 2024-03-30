package X;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.6oD  reason: invalid class name and case insensitive filesystem */
public class C142026oD implements AnonymousClass7fE {
    public SwipeRefreshLayout A00;
    public boolean A01;

    public boolean BqD(C1271967i r3, Object obj, int i) {
        if (i != 38) {
            return false;
        }
        boolean A012 = C129316Gk.A01(obj);
        this.A01 = A012;
        SwipeRefreshLayout swipeRefreshLayout = this.A00;
        if (swipeRefreshLayout == null) {
            return true;
        }
        swipeRefreshLayout.setRefreshing(A012);
        return true;
    }

    public C142026oD(boolean z) {
        this.A01 = z;
    }
}
