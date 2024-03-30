package X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: X.0bq  reason: invalid class name and case insensitive filesystem */
public class C09110bq implements View.OnTouchListener {
    public final /* synthetic */ C09470cQ A00;

    public C09110bq(C09470cQ r1) {
        this.A00 = r1;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0) {
            C09470cQ r2 = this.A00;
            PopupWindow popupWindow = r2.A0A;
            if (popupWindow == null || !popupWindow.isShowing() || x < 0 || x >= popupWindow.getWidth() || y < 0 || y >= popupWindow.getHeight()) {
                return false;
            }
            r2.A0J.postDelayed(r2.A0K, 250);
            return false;
        } else if (action != 1) {
            return false;
        } else {
            C09470cQ r0 = this.A00;
            r0.A0J.removeCallbacks(r0.A0K);
            return false;
        }
    }
}
