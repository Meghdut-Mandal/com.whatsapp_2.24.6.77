package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.6dF  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C135776dF implements View.OnTouchListener {
    public static final /* synthetic */ C135776dF A00 = new C135776dF();

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.getParent().getParent().requestDisallowInterceptTouchEvent(true);
        if ((motionEvent.getAction() & 255) == 1) {
            view.getParent().getParent().requestDisallowInterceptTouchEvent(false);
            view.performClick();
        }
        return false;
    }
}
