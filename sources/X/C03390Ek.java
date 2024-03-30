package X;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: X.0Ek  reason: invalid class name and case insensitive filesystem */
public class C03390Ek extends Filter {
    public C17200qt A00;

    public CharSequence convertResultToString(Object obj) {
        return this.A00.B3g((Cursor) obj);
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor Bp5 = this.A00.Bp5(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (Bp5 != null) {
            filterResults.count = Bp5.getCount();
        } else {
            filterResults.count = 0;
            Bp5 = null;
        }
        filterResults.values = Bp5;
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        C17200qt r2 = this.A00;
        Cursor cursor = ((C03370Eh) r2).A02;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            r2.B2b((Cursor) obj);
        }
    }

    public C03390Ek(C17200qt r1) {
        this.A00 = r1;
    }
}
