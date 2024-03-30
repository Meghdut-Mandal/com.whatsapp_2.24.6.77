package X;

import android.animation.Animator;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.4d4  reason: invalid class name and case insensitive filesystem */
public final class C92064d4 extends GestureDetector.SimpleOnGestureListener {
    public final C92764ea A00;

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C92764ea r3 = this.A00;
        if (r3.getContext() == null) {
            return false;
        }
        float translationY = r3.getTranslationY();
        if (f2 > 0.0f) {
            r3.A02((int) Math.abs(((C36441kJ.A02(r3) - translationY) / f2) * 1000.0f));
        } else {
            r3.A03((Animator.AnimatorListener) null, (int) Math.abs((translationY / (-f2)) * 1000.0f));
        }
        r3.A08 = true;
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C92764ea r3 = this.A00;
        if (r3.getTranslationY() <= 0.0f && f2 > 0.0f) {
            return false;
        }
        r3.A08 = false;
        return true;
    }

    public C92064d4(C92764ea r1) {
        this.A00 = r1;
    }
}
