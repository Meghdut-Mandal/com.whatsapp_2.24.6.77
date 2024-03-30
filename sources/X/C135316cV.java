package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* renamed from: X.6cV  reason: invalid class name and case insensitive filesystem */
public class C135316cV implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    public float A00 = 1.0f;
    public boolean A01;
    public final ScaleGestureDetector A02;
    public final C06360Th A03;
    public final C160857lh A04;

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        this.A04.BW3(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.A01) {
            return false;
        }
        if (Math.abs(f) > Math.abs(f2)) {
            this.A04.BYx(f);
            return true;
        }
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        C160857lh r0 = this.A04;
        if (i < 0) {
            r0.BY7();
            return true;
        }
        r0.BY6();
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.A04.Bkq(this.A00);
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.A04.Bkr(this.A00);
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.A01) {
            return false;
        }
        if (f2 < 0.0f) {
            this.A04.BY6();
        }
        return true;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.A04.Bgn(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public C135316cV(Context context, C160857lh r3, boolean z) {
        this.A03 = new C06360Th(context, this);
        this.A02 = new ScaleGestureDetector(context, this);
        this.A01 = z;
        this.A04 = r3;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float f = this.A00 * scaleFactor * scaleFactor;
        this.A00 = f;
        if (f < 1.0f) {
            this.A00 = 1.0f;
            f = 1.0f;
        }
        this.A04.Bkp(f);
        return true;
    }
}
