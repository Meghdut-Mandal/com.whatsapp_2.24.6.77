package X;

import android.net.Uri;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.contact.picker.ContactPickerFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3Zw  reason: invalid class name and case insensitive filesystem */
public class C67453Zw implements C021809f {
    public final /* synthetic */ ContactPickerFragment A00;

    public boolean BdJ(Menu menu, AnonymousClass0V9 r3) {
        return false;
    }

    public C67453Zw(ContactPickerFragment contactPickerFragment) {
        this.A00 = contactPickerFragment;
    }

    public boolean BUq(Menu menu, AnonymousClass0V9 r7) {
        ContactPickerFragment contactPickerFragment = this.A00;
        if (contactPickerFragment.A34 || contactPickerFragment.A3A || contactPickerFragment.A38 || contactPickerFragment.A3B) {
            menu.add(0, R.id.menuitem_share, 0, R.string.f12nameremoved).setIcon(R.drawable.input_send).setShowAsAction(2);
            return true;
        }
        if (!contactPickerFragment.A0R.A0L()) {
            contactPickerFragment.A1g.A0E(5968);
            menu.add(0, R.id.menuitem_new_broadcast, 0, R.string.f12nameremoved).setShowAsAction(1);
        }
        menu.add(0, R.id.menuitem_new_group, 0, R.string.f12nameremoved).setShowAsAction(1);
        return true;
    }

    public void BVS(AnonymousClass0V9 r7) {
        ContactPickerFragment contactPickerFragment = this.A00;
        Set set = contactPickerFragment.A3q;
        set.clear();
        Map map = contactPickerFragment.A3o;
        set.addAll(map.keySet());
        Handler handler = contactPickerFragment.A3h;
        Runnable runnable = contactPickerFragment.A3k;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 200);
        map.clear();
        contactPickerFragment.A1g();
        contactPickerFragment.A0E = null;
    }

    public boolean BQg(MenuItem menuItem, AnonymousClass0V9 r10) {
        C68733cN r0;
        int i;
        if (menuItem.getItemId() == R.id.menuitem_new_broadcast) {
            ContactPickerFragment contactPickerFragment = this.A00;
            int A04 = contactPickerFragment.A0T.A04(C21100yf.A1s);
            if (A04 <= 0 || contactPickerFragment.A3o.size() <= A04) {
                contactPickerFragment.A1C(AnonymousClass190.A1P(contactPickerFragment.A1D(), contactPickerFragment.A3o.keySet()));
            } else {
                contactPickerFragment.A0w.BO6(C36331k8.A0g(contactPickerFragment.A1D, A04, 0, R.plurals.f10nameremoved));
            }
            r0 = contactPickerFragment.A0w;
        } else if (menuItem.getItemId() == R.id.menuitem_new_group) {
            ContactPickerFragment contactPickerFragment2 = this.A00;
            int A01 = contactPickerFragment2.A1Q.A01((AnonymousClass147) null) - 1;
            if (A01 <= 0 || contactPickerFragment2.A3o.size() <= (i = A01 - 1)) {
                contactPickerFragment2.A1m.A00(4);
                AnonymousClass01I A0i = contactPickerFragment2.A0i();
                A0i.startActivity(AnonymousClass190.A1O(A0i, AnonymousClass143.A07(contactPickerFragment2.A3o.keySet()), 4));
                if (contactPickerFragment2.A18.A01.A0E(5288)) {
                    contactPickerFragment2.A18.A00();
                }
            } else {
                contactPickerFragment2.A0w.BO6(C36331k8.A0g(contactPickerFragment2.A1D, i, 0, R.plurals.f10nameremoved));
            }
            r0 = contactPickerFragment2.A0w;
        } else {
            if (menuItem.getItemId() == R.id.menuitem_share) {
                ContactPickerFragment contactPickerFragment3 = this.A00;
                boolean z = contactPickerFragment3.A1Z().getBoolean("skip_preview", false);
                ArrayList arrayList = contactPickerFragment3.A2j;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (contactPickerFragment3.A1q.A00((Uri) it.next()) != 1) {
                            break;
                        }
                    }
                }
                if (!z) {
                    ContactPickerFragment.A0I(contactPickerFragment3, (AnonymousClass141) null);
                    return false;
                }
                AnonymousClass3SJ.A01(contactPickerFragment3.A0h(), 1);
                return false;
            }
            return false;
        }
        r0.A02();
        return false;
    }
}
