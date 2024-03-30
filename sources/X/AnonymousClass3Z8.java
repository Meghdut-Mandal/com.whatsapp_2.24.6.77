package X;

import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.util.Log;

/* renamed from: X.3Z8  reason: invalid class name */
public class AnonymousClass3Z8 implements View.OnTouchListener {
    public float A00;
    public float A01;
    public float A02;
    public float A03;

    public AnonymousClass3Z8(float f, float f2, float f3, float f4) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ReducedAreaOnTouchListener/ignored_ratio -- left: ");
        A0u.append(f);
        A0u.append(", right: ");
        A0u.append(f3);
        A0u.append(", top: ");
        A0u.append(f2);
        A0u.append(", bottom: ");
        A0u.append(f4);
        C36411kG.A1P(A0u);
        if (f < 0.0f || f > 1.0f || f3 < 0.0f || f3 > 1.0f || f2 < 0.0f || f2 > 1.0f || f4 < 0.0f || f4 > 1.0f) {
            throw new RuntimeException("invalid input parameters");
        }
        this.A01 = f;
        this.A02 = f3;
        this.A03 = f2;
        this.A00 = f4;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("ReducedAreaOnTouchListener/onTouch ");
            A0u.append(motionEvent);
            A0u.append(", view width:");
            A0u.append(width);
            A0u.append(", view height:");
            A0u.append(height);
            A0u.append(", pointer count: ");
            C36321k7.A1Y(A0u, motionEvent.getPointerCount());
        }
        if (motionEvent.getAction() != 0) {
            return false;
        }
        float f = (float) width;
        if (motionEvent.getX() >= this.A01 * f) {
            float f2 = (float) height;
            if (motionEvent.getY() >= this.A03 * f2 && motionEvent.getX() <= (1.0f - this.A02) * f && motionEvent.getY() <= (1.0f - this.A00) * f2) {
                return false;
            }
        }
        Log.i("ReducedAreaOnTouchListener/ignore this touch event");
        return true;
    }
}
