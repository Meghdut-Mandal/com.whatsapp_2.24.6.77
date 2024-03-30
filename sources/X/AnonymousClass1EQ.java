package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.1EQ  reason: invalid class name */
public final class AnonymousClass1EQ implements View.OnTouchListener {
    public long A00;
    public long A01;
    public final C19970wo A02;

    public AnonymousClass1EQ(C19970wo r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A02 = r2;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        AnonymousClass00C.A0D(motionEvent, 1);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.A01 = SystemClock.elapsedRealtime();
            return false;
        } else if (action != 1) {
            return false;
        } else {
            this.A00 = SystemClock.elapsedRealtime();
            return false;
        }
    }
}
