package X;

import android.widget.BaseAdapter;

/* renamed from: X.1nL  reason: invalid class name and case insensitive filesystem */
public abstract class C37871nL extends BaseAdapter {
    public long getItemId(int i) {
        return ((long) i) * 1024;
    }

    public int getViewTypeCount() {
        return 4;
    }

    public boolean hasStableIds() {
        return true;
    }

    public int getItemViewType(int i) {
        Object item = getItem(i);
        if (item instanceof C70213em) {
            return 1;
        }
        if ((item instanceof C70223en) || (item instanceof C70193ek)) {
            return 2;
        }
        if (item instanceof C70163eh) {
            return 3;
        }
        return 0;
    }
}
