package X;

import android.view.MenuItem;
import java.lang.ref.WeakReference;

/* renamed from: X.3Xs  reason: invalid class name and case insensitive filesystem */
public class C66893Xs implements MenuItem.OnMenuItemClickListener {
    public WeakReference A00;

    public boolean onMenuItemClick(MenuItem menuItem) {
        WeakReference weakReference = this.A00;
        if (weakReference.get() == null || menuItem == null) {
            return false;
        }
        int itemId = menuItem.getItemId();
        C70803fk r0 = ((C43472Ht) weakReference.get()).A04;
        if (itemId == 7) {
            r0.A2b();
            return true;
        }
        for (C88684Tq Bbx : r0.A7C) {
            if (Bbx.Bbx(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public C66893Xs(C43472Ht r2) {
        this.A00 = AnonymousClass001.A0F(r2);
    }
}
