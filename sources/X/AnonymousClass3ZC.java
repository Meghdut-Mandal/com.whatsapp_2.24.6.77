package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.3ZC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3ZC implements View.OnTouchListener {
    public static final /* synthetic */ AnonymousClass3ZC A00 = new AnonymousClass3ZC();

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        if ((motionEvent.getAction() & 255) == 1) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }
}
