package X;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.PopupWindow;

/* renamed from: X.0c3  reason: invalid class name and case insensitive filesystem */
public class C09240c3 implements AbsListView.OnScrollListener {
    public final /* synthetic */ C09470cQ A00;

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            C09470cQ r3 = this.A00;
            PopupWindow popupWindow = r3.A0A;
            if (popupWindow.getInputMethodMode() != 2 && popupWindow.getContentView() != null) {
                Handler handler = r3.A0J;
                C11130fm r0 = r3.A0K;
                handler.removeCallbacks(r0);
                r0.run();
            }
        }
    }

    public C09240c3(C09470cQ r1) {
        this.A00 = r1;
    }
}
