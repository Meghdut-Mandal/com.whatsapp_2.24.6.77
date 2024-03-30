package X;

import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

/* renamed from: X.2tr  reason: invalid class name and case insensitive filesystem */
public abstract class C54972tr {
    public static void A00(ListView listView) {
        ListAdapter adapter = listView.getAdapter();
        if (adapter != null) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), 1073741824);
            int i = 0;
            for (int i2 = 0; i2 < adapter.getCount(); i2++) {
                View view = adapter.getView(i2, (View) null, listView);
                view.measure(makeMeasureSpec, 0);
                i += view.getMeasuredHeight();
            }
            listView.getLayoutParams().height = i + (listView.getDividerHeight() * (adapter.getCount() - 1));
            listView.requestLayout();
        }
    }
}
