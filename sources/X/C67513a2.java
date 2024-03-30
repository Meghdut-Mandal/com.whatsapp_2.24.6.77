package X;

import android.view.MenuItem;
import com.whatsapp.R;

/* renamed from: X.3a2  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67513a2 implements C16620po {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C95824mL A01;
    public final /* synthetic */ C134936bq A02;
    public final /* synthetic */ C135066c4 A03;

    public /* synthetic */ C67513a2(C95824mL r1, C134936bq r2, C135066c4 r3, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
        this.A03 = r3;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C95824mL r7 = this.A01;
        C134936bq r6 = this.A02;
        int i = this.A00;
        C135066c4 r4 = this.A03;
        if (menuItem == null) {
            return false;
        }
        int itemId = menuItem.getItemId();
        if (Integer.valueOf(itemId) == null) {
            return false;
        }
        if (itemId == R.id.fun_stickers_send) {
            r7.A0D.BKt(r6, Integer.valueOf(i), r4);
            return true;
        } else if (itemId == R.id.fun_stickers_favorite) {
            r7.A0C.invoke(r6, r4);
            return true;
        } else if (itemId != R.id.fun_stickers_report) {
            return false;
        } else {
            r7.A0B.invoke(r6);
            return true;
        }
    }
}
