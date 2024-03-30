package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.0Th  reason: invalid class name and case insensitive filesystem */
public final class C06360Th {
    public final C15740nu A00;

    public boolean A00(MotionEvent motionEvent) {
        return ((C09740cr) this.A00).A00.onTouchEvent(motionEvent);
    }

    public C06360Th(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.A00 = new C09740cr(context, onGestureListener);
    }
}
