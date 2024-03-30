package X;

import android.view.MenuItem;
import com.whatsapp.R;

/* renamed from: X.3a1  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67503a1 implements C16620po {
    public final /* synthetic */ C33541fX A00;
    public final /* synthetic */ C33541fX A01;
    public final /* synthetic */ C33541fX A02;

    public /* synthetic */ C67503a1(C33541fX r1, C33541fX r2, C33541fX r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C33541fX r5 = this.A00;
        C33541fX r4 = this.A01;
        C33541fX r3 = this.A02;
        AnonymousClass00C.A0D(r5, 0);
        C36321k7.A16(r4, r3, menuItem, 1);
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_delete) {
            r5.onClick(menuItem.getActionView());
        } else if (itemId == R.id.menuitem_forward) {
            r4.onClick(menuItem.getActionView());
            return true;
        } else if (itemId == R.id.menuitem_share_status_facebook) {
            r3.onClick(menuItem.getActionView());
            return true;
        }
        return true;
    }
}
