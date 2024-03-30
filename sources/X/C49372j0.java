package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2j0  reason: invalid class name and case insensitive filesystem */
public class C49372j0 extends C132446Tt {
    public final C18820ts A00;
    public final WeakReference A01;
    public final ArrayList A02;
    public final List A03;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.A02;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            arrayList = this.A03;
        } else {
            ArrayList A0I = AnonymousClass001.A0I();
            for (C62583Gs r3 : this.A03) {
                if (C202859mm.A04(this.A00, r3.A06, arrayList2, true)) {
                    A0I.add(r3);
                }
            }
            arrayList = A0I;
        }
        Collections.sort(arrayList, new C81393ww(this.A00));
        return arrayList;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Collection collection = (Collection) obj;
        PhoneContactsSelector phoneContactsSelector = (PhoneContactsSelector) this.A01.get();
        if (phoneContactsSelector != null && !phoneContactsSelector.BLh()) {
            phoneContactsSelector.A0J = null;
            ArrayList arrayList = phoneContactsSelector.A0g;
            arrayList.clear();
            arrayList.addAll(collection);
            phoneContactsSelector.A0I.notifyDataSetChanged();
            View findViewById = phoneContactsSelector.findViewById(R.id.contacts_empty_permission_denied);
            View findViewById2 = phoneContactsSelector.findViewById(R.id.contacts_empty);
            View findViewById3 = phoneContactsSelector.findViewById(R.id.search_no_matches);
            View findViewById4 = phoneContactsSelector.findViewById(R.id.init_contacts_progress);
            if (!phoneContactsSelector.A09.A00()) {
                findViewById4.setVisibility(8);
                findViewById.setVisibility(0);
                findViewById2.setVisibility(8);
                findViewById3.setVisibility(8);
                phoneContactsSelector.A02.setVisibility(8);
                return;
            }
            if (phoneContactsSelector.A0K != null) {
                findViewById4.setVisibility(0);
                findViewById.setVisibility(8);
                findViewById2.setVisibility(8);
            } else {
                boolean isEmpty = TextUtils.isEmpty(phoneContactsSelector.A0X);
                findViewById4.setVisibility(8);
                if (!isEmpty) {
                    findViewById.setVisibility(8);
                    findViewById2.setVisibility(8);
                    findViewById3.setVisibility(0);
                    Object[] A0L = AnonymousClass001.A0L();
                    A0L[0] = phoneContactsSelector.A0X;
                    C36341k9.A0s(phoneContactsSelector, (TextView) findViewById3, A0L, R.string.f12nameremoved);
                    return;
                }
                findViewById.setVisibility(8);
                findViewById2.setVisibility(0);
            }
            findViewById3.setVisibility(8);
        }
    }

    public C49372j0(PhoneContactsSelector phoneContactsSelector, C18820ts r3, List list, List list2) {
        ArrayList arrayList;
        this.A00 = r3;
        this.A01 = AnonymousClass001.A0F(phoneContactsSelector);
        if (list != null) {
            arrayList = C36441kJ.A15(list);
        } else {
            arrayList = null;
        }
        this.A02 = arrayList;
        this.A03 = C36441kJ.A15(list2);
    }
}
