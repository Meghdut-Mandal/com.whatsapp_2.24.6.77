package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: X.0cO  reason: invalid class name and case insensitive filesystem */
public abstract class C09450cO implements AnonymousClass07X, C17250qy, AdapterView.OnItemClickListener {
    public Rect A00;

    public static int A01(Context context, ListAdapter listAdapter, int i) {
        FrameLayout frameLayout = null;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public abstract void A02(int i);

    public abstract void A03(int i);

    public abstract void A04(int i);

    public abstract void A05(View view);

    public abstract void A06(PopupWindow.OnDismissListener onDismissListener);

    public abstract void A07(C016307a r1);

    public abstract void A08(boolean z);

    public abstract void A09(boolean z);

    public boolean A0A() {
        return true;
    }

    public boolean B35(C016307a r2, C018707z r3) {
        return false;
    }

    public boolean B77(C016307a r2, C018707z r3) {
        return false;
    }

    public void BKa(Context context, C016307a r2) {
    }

    public int getId() {
        return 0;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        ListAdapter listAdapter2 = listAdapter;
        if (listAdapter instanceof HeaderViewListAdapter) {
            listAdapter2 = ((HeaderViewListAdapter) listAdapter2).getWrappedAdapter();
        }
        C016307a r3 = ((C03340Ee) listAdapter2).A00;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        int i2 = 4;
        if (A0A()) {
            i2 = 0;
        }
        r3.A0K(menuItem, this, i2);
    }
}
