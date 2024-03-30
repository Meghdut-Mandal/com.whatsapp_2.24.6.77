package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;

/* renamed from: X.6HR  reason: invalid class name */
public class AnonymousClass6HR implements View.OnTouchListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass6HR(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ScaleGestureDetector scaleGestureDetector;
        switch (this.A02) {
            case 0:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) this.A01).onTouchEvent(motionEvent);
                }
                return false;
            case 1:
                AnonymousClass52X r2 = (AnonymousClass52X) this.A00;
                C129066Eu r1 = (C129066Eu) this.A01;
                if (!r1.A0H || (scaleGestureDetector = r2.A01) == null || !scaleGestureDetector.onTouchEvent(motionEvent)) {
                    if (!r1.A0P && !r1.A0Q) {
                        return false;
                    }
                    r2.A0E(motionEvent, r2.A0C);
                    return false;
                } else if (r1.A0P || r1.A0Q) {
                    return false;
                }
                break;
            case 2:
                ViewGroup viewGroup = (ViewGroup) this.A01;
                ((C06360Th) this.A00).A00(motionEvent);
                if ((motionEvent.getAction() & 255) != 1) {
                    return false;
                }
                viewGroup.requestDisallowInterceptTouchEvent(false);
                return false;
            default:
                ((C06360Th) this.A01).A00(motionEvent);
                break;
        }
        return true;
    }
}
