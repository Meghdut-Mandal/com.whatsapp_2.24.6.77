package X;

import android.view.MenuItem;

/* renamed from: X.0bc  reason: invalid class name and case insensitive filesystem */
public class C08970bc implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener A00;
    public final /* synthetic */ AnonymousClass0FY A01;

    public C08970bc(MenuItem.OnMenuItemClickListener onMenuItemClickListener, AnonymousClass0FY r2) {
        this.A01 = r2;
        this.A00 = onMenuItemClickListener;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        return this.A00.onMenuItemClick(this.A01.A00(menuItem));
    }
}
