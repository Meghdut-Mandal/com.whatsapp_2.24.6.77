package X;

import android.content.res.Resources;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.documentpicker.DocumentPickerActivity;
import java.util.List;

/* renamed from: X.3Zx  reason: invalid class name and case insensitive filesystem */
public class C67463Zx implements C021809f {
    public MenuItem A00;
    public final /* synthetic */ DocumentPickerActivity A01;

    public C67463Zx(DocumentPickerActivity documentPickerActivity) {
        this.A01 = documentPickerActivity;
    }

    public void BVS(AnonymousClass0V9 r3) {
        DocumentPickerActivity documentPickerActivity = this.A01;
        documentPickerActivity.A0Y.clear();
        documentPickerActivity.A03 = null;
        documentPickerActivity.A0F.notifyDataSetChanged();
    }

    public boolean BdJ(Menu menu, AnonymousClass0V9 r10) {
        DocumentPickerActivity documentPickerActivity = this.A01;
        List list = documentPickerActivity.A0Y;
        if (list.isEmpty()) {
            r10.A08(R.string.f12nameremoved);
        } else {
            Resources resources = documentPickerActivity.getResources();
            int size = list.size();
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, list.size(), 0);
            r10.A0B(resources.getQuantityString(R.plurals.f10nameremoved, size, objArr));
        }
        this.A00.setVisible(C36401kF.A1a(list));
        return true;
    }

    public boolean BQg(MenuItem menuItem, AnonymousClass0V9 r5) {
        if (menuItem.getItemId() != R.id.menuitem_share) {
            return false;
        }
        DocumentPickerActivity documentPickerActivity = this.A01;
        List list = documentPickerActivity.A0Y;
        if (list.isEmpty()) {
            return false;
        }
        DocumentPickerActivity.A10(documentPickerActivity, list);
        return false;
    }

    public boolean BUq(Menu menu, AnonymousClass0V9 r5) {
        MenuItem add = menu.add(0, R.id.menuitem_share, 0, R.string.f12nameremoved);
        this.A00 = add;
        add.setShowAsAction(2);
        return true;
    }
}
