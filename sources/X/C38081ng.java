package X;

import android.widget.Filter;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1ng  reason: invalid class name and case insensitive filesystem */
public final class C38081ng extends Filter {
    public final /* synthetic */ C38021na A00;

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        AnonymousClass00C.A0D(charSequence, 0);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (AnonymousClass099.A0D(charSequence).length() > 0) {
            ArrayList A0I = AnonymousClass001.A0I();
            String obj = charSequence.toString();
            C38021na r9 = this.A00;
            C18820ts r8 = r9.A09;
            ArrayList A03 = C202859mm.A03(r8, obj);
            AnonymousClass00C.A08(A03);
            String A06 = AnonymousClass14B.A06(charSequence);
            AnonymousClass00C.A08(A06);
            String A062 = AnonymousClass14B.A06(r9.A0B.getString(R.string.f12nameremoved));
            AnonymousClass00C.A08(A062);
            boolean A0O = AnonymousClass099.A0O(A06, A062, false);
            List list = r9.A0C;
            ArrayList<AnonymousClass2Y2> A0I2 = AnonymousClass001.A0I();
            for (Object next : list) {
                if (next instanceof AnonymousClass2Y2) {
                    A0I2.add(next);
                }
            }
            for (AnonymousClass2Y2 r3 : A0I2) {
                AnonymousClass141 r2 = r3.A00.A00;
                if (r9.A07.A0h(r2, A03, true) || C202859mm.A04(r8, r2.A0a, A03, true) || A0O) {
                    A0I.add(r3);
                }
            }
            boolean isEmpty = A0I.isEmpty();
            arrayList = A0I;
            if (isEmpty) {
                A0I.add(0, new AnonymousClass2Y5(charSequence.toString()));
                arrayList = A0I;
            }
        } else {
            arrayList = this.A00.A0C;
        }
        filterResults.values = arrayList;
        filterResults.count = arrayList.size();
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        List list;
        AnonymousClass00C.A0D(filterResults, 1);
        Object obj = filterResults.values;
        if (!(obj instanceof List) || (list = (List) obj) == null) {
            list = this.A00.A0C;
        }
        C38021na.A00(this.A00, list);
    }

    public C38081ng(C38021na r1) {
        this.A00 = r1;
    }
}
