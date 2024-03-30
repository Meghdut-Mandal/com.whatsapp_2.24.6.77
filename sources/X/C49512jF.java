package X;

import android.text.TextUtils;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.group.GroupAdminPickerActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2jF  reason: invalid class name and case insensitive filesystem */
public class C49512jF extends C132446Tt {
    public final AnonymousClass171 A00;
    public final C18820ts A01;
    public final String A02;
    public final WeakReference A03;
    public final List A04;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String str = this.A02;
        if (TextUtils.isEmpty(str)) {
            return this.A04;
        }
        ArrayList A0I = AnonymousClass001.A0I();
        C18820ts r5 = this.A01;
        ArrayList A032 = C202859mm.A03(r5, str);
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            AnonymousClass141 A0f = C36391kE.A0f(it);
            if (this.A00.A0h(A0f, A032, true) || C202859mm.A04(r5, A0f.A0a, A032, true)) {
                A0I.add(A0f);
            }
        }
        return A0I;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        List list = (List) obj;
        GroupAdminPickerActivity groupAdminPickerActivity = (GroupAdminPickerActivity) this.A03.get();
        if (groupAdminPickerActivity != null && !groupAdminPickerActivity.BLh()) {
            C40581vm r2 = groupAdminPickerActivity.A0E;
            String str = groupAdminPickerActivity.A0I;
            r2.A01 = list;
            r2.A00 = C202859mm.A03(r2.A02.A0B, str);
            r2.A06();
            TextView A0Q = C36391kE.A0Q(groupAdminPickerActivity, R.id.search_no_matches);
            if (!list.isEmpty() || TextUtils.isEmpty(groupAdminPickerActivity.A0I)) {
                A0Q.setVisibility(8);
                return;
            }
            A0Q.setVisibility(0);
            Object[] A0L = AnonymousClass001.A0L();
            A0L[0] = groupAdminPickerActivity.A0I;
            C36341k9.A0s(groupAdminPickerActivity, A0Q, A0L, R.string.f12nameremoved);
        }
    }

    public C49512jF(AnonymousClass171 r3, C18820ts r4, GroupAdminPickerActivity groupAdminPickerActivity, String str, List list) {
        ArrayList A0I = AnonymousClass001.A0I();
        this.A04 = A0I;
        this.A00 = r3;
        this.A01 = r4;
        this.A03 = AnonymousClass001.A0F(groupAdminPickerActivity);
        A0I.addAll(list);
        this.A02 = str;
    }
}
