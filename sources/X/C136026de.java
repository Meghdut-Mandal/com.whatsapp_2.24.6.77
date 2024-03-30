package X;

import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;

/* renamed from: X.6de  reason: invalid class name and case insensitive filesystem */
public class C136026de implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C93174g3 A00;

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        long j2 = j;
        int i2 = i;
        View view2 = view;
        C93174g3 r1 = this.A00;
        if (i < 0) {
            C09470cQ r2 = r1.A06;
            if (!r2.A0A.isShowing()) {
                item = null;
            } else {
                item = r2.A0B.getSelectedItem();
            }
        } else {
            item = r1.getAdapter().getItem(i);
        }
        C93174g3.A01(r1, item);
        AdapterView.OnItemClickListener onItemClickListener = r1.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                C09470cQ r3 = r1.A06;
                PopupWindow popupWindow = r3.A0A;
                if (!popupWindow.isShowing()) {
                    view2 = null;
                } else {
                    view2 = r3.A0B.getSelectedView();
                }
                if (!popupWindow.isShowing()) {
                    i2 = -1;
                } else {
                    i2 = r3.A0B.getSelectedItemPosition();
                }
                if (!popupWindow.isShowing()) {
                    j2 = Long.MIN_VALUE;
                } else {
                    j2 = r3.A0B.getSelectedItemId();
                }
            }
            onItemClickListener.onItemClick(r1.A06.A0B, view2, i2, j2);
        }
        r1.A06.dismiss();
    }

    public C136026de(C93174g3 r1) {
        this.A00 = r1;
    }
}
