package X;

import android.text.TextUtils;
import android.widget.Filter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.4VY  reason: invalid class name */
public class AnonymousClass4VY extends Filter {
    public Object A00;
    public final int A01;

    public AnonymousClass4VY(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList A0I;
        if (this.A01 != 0) {
            C41081wa r6 = (C41081wa) this.A00;
            if (C36371kC.A0y(String.valueOf(charSequence)).length() == 0) {
                A0I = C36361kB.A0q(r6.A01);
            } else {
                A0I = AnonymousClass001.A0I();
                String A0y = C36371kC.A0y(String.valueOf(charSequence));
                Locale locale = Locale.ROOT;
                String A1D = C36431kI.A1D(locale, A0y);
                List list = r6.A01;
                ArrayList<Object> A0I2 = AnonymousClass001.A0I();
                for (Object next : list) {
                    C601936v r3 = (C601936v) next;
                    if (AnonymousClass099.A0O(C36431kI.A1D(locale, r3.A01), A1D, false) || AnonymousClass099.A0O(C36431kI.A1D(locale, r3.A02), A1D, false)) {
                        A0I2.add(next);
                    }
                }
                for (Object add : A0I2) {
                    A0I.add(add);
                }
            }
            AnonymousClass00C.A0D(A0I, 0);
            r6.A00 = A0I;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = r6.A00;
            return filterResults;
        }
        ArrayList A0I3 = AnonymousClass001.A0I();
        if (TextUtils.isEmpty(charSequence)) {
            A0I3.addAll(((C40451vZ) this.A00).A02);
        } else {
            String trim = charSequence.toString().toLowerCase(Locale.ROOT).trim();
            for (AnonymousClass36Z r2 : ((C40451vZ) this.A00).A02) {
                if (r2.A01.toLowerCase(Locale.ROOT).contains(trim)) {
                    A0I3.add(r2);
                }
            }
        }
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        filterResults2.values = A0I3;
        return filterResults2;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (this.A01 != 0) {
            if (filterResults != null && filterResults.count > 0) {
                Object obj = filterResults.values;
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.whatsapp.inappbugreporting.data.BugCategoryFactory.BugCategory>");
                List A012 = C07710Yz.A01(obj);
                AnonymousClass00C.A0D(A012, 0);
                ((C41081wa) this.A00).A00 = A012;
            }
            ((AnonymousClass0CZ) this.A00).A06();
        } else if (filterResults != null) {
            C40451vZ r1 = (C40451vZ) this.A00;
            List list = (List) filterResults.values;
            r1.A01 = list;
            r1.A0M(list);
        }
    }
}
