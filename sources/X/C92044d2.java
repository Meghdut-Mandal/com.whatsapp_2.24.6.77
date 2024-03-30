package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.4d2  reason: invalid class name and case insensitive filesystem */
public class C92044d2 extends GestureDetector.SimpleOnGestureListener {
    public final C117055ld A00;

    public C92044d2(C117055ld r1) {
        this.A00 = r1;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (Math.abs(f) <= Math.abs(f2)) {
            return true;
        }
        this.A00.A00.A00(f);
        return true;
    }
}
