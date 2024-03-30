package X;

import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView;

/* renamed from: X.0cE  reason: invalid class name and case insensitive filesystem */
public class C09350cE implements AnonymousClass02T {
    public final /* synthetic */ ActionMenuView A00;

    public C09350cE(ActionMenuView actionMenuView) {
        this.A00 = actionMenuView;
    }

    public boolean Baq(MenuItem menuItem, C016307a r4) {
        AnonymousClass07G r0;
        C012605m r02 = this.A00.A05;
        if (r02 == null || (r0 = ((C012705n) r02).A00.A0C) == null || !r0.onMenuItemClick(menuItem)) {
            return false;
        }
        return true;
    }

    public void Bar(C016307a r2) {
        AnonymousClass02T r0 = this.A00.A00;
        if (r0 != null) {
            r0.Bar(r2);
        }
    }
}
