package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.6d1  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C135636d1 implements View.OnHoverListener {
    public final /* synthetic */ C1491570b A00;

    public /* synthetic */ C135636d1(C1491570b r1) {
        this.A00 = r1;
    }

    public final boolean onHover(View view, MotionEvent motionEvent) {
        C1491570b r2 = this.A00;
        if (!C90504aG.A1V(r2.A0O) || motionEvent.getActionMasked() != 10) {
            return false;
        }
        r2.A05.requestFocus();
        r2.A05.performClick();
        return true;
    }
}
