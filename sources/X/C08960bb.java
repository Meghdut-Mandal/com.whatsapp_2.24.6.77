package X;

import android.view.MenuItem;

/* renamed from: X.0bb  reason: invalid class name and case insensitive filesystem */
public class C08960bb implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener A00;
    public final /* synthetic */ AnonymousClass0FY A01;

    public C08960bb(MenuItem.OnActionExpandListener onActionExpandListener, AnonymousClass0FY r2) {
        this.A01 = r2;
        this.A00 = onActionExpandListener;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.A00.onMenuItemActionCollapse(this.A01.A00(menuItem));
    }

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.A00.onMenuItemActionExpand(this.A01.A00(menuItem));
    }
}
