package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.6dG  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C135786dG implements View.OnTouchListener {
    public static final /* synthetic */ C135786dG A00 = new C135786dG();

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 1 || motionEvent.getY() >= 0.0f) {
            return false;
        }
        return true;
    }
}
