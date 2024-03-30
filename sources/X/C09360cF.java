package X;

import android.view.MenuItem;

/* renamed from: X.0cF  reason: invalid class name and case insensitive filesystem */
public class C09360cF implements AnonymousClass02T {
    public final /* synthetic */ C07200Ws A00;

    public void Bar(C016307a r1) {
    }

    public C09360cF(C07200Ws r1) {
        this.A00 = r1;
    }

    public boolean Baq(MenuItem menuItem, C016307a r3) {
        C16620po r0 = this.A00.A01;
        if (r0 != null) {
            return r0.onMenuItemClick(menuItem);
        }
        return false;
    }
}
