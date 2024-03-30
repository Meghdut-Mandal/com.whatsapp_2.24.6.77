package X;

import android.view.MenuItem;

/* renamed from: X.9ut  reason: invalid class name and case insensitive filesystem */
public class C207309ut implements MenuItem.OnActionExpandListener {
    public final /* synthetic */ C173788Ta A00;

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return true;
    }

    public C207309ut(C173788Ta r1) {
        this.A00 = r1;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        C173788Ta r1 = this.A00;
        r1.A0H = null;
        C173788Ta.A0v(r1);
        return true;
    }
}
