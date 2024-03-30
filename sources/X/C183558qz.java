package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8qz  reason: invalid class name and case insensitive filesystem */
public class C183558qz extends C132446Tt {
    public final ArrayList A00;
    public final List A01;
    public final /* synthetic */ C173788Ta A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C183558qz(C173788Ta r2, List list, List list2) {
        super(r2, true);
        ArrayList arrayList;
        this.A02 = r2;
        if (list != null) {
            arrayList = C36441kJ.A15(list);
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        this.A01 = list2;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String A0v;
        C173788Ta r5 = this.A02;
        r5.A02 = null;
        C166357vb r2 = r5.A0O;
        r2.A00 = (List) obj;
        r2.notifyDataSetChanged();
        View findViewById = r5.findViewById(16908292);
        if (r2.isEmpty()) {
            findViewById.setVisibility(0);
            if (TextUtils.isEmpty(r5.A0G)) {
                A0v = r5.getString(R.string.f12nameremoved);
            } else {
                A0v = C36391kE.A0v(r5, r5.A0G, AnonymousClass001.A0L(), 0, R.string.f12nameremoved);
            }
            TextView A0Q = C36391kE.A0Q(r5, R.id.search_no_matches);
            A0Q.setText(A0v);
            A0Q.setVisibility(0);
            findViewById = r5.findViewById(R.id.init_contacts_progress);
        }
        findViewById.setVisibility(8);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass141 A0f = C36391kE.A0f(it);
            if (this.A02.A0A.A0h(A0f, this.A00, true)) {
                A0I.add(A0f);
            }
        }
        return A0I;
    }
}
