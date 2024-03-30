package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.whatsapp.mediacomposer.VideoComposerFragment;

/* renamed from: X.6cX  reason: invalid class name and case insensitive filesystem */
public final class C135336cX implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, C158447gw {
    public final /* synthetic */ VideoComposerFragment A00;

    public boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public C135336cX(VideoComposerFragment videoComposerFragment) {
        this.A00 = videoComposerFragment;
    }

    public boolean BTl() {
        VideoComposerFragment videoComposerFragment = this.A00;
        C65083Qq r0 = videoComposerFragment.A0L;
        if (r0 != null && r0.A0X()) {
            return false;
        }
        C28331Sf r02 = videoComposerFragment.A0J;
        if (r02 == null) {
            throw C36331k8.A0d("statusConfig");
        } else if (r02.A01()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean onDown(MotionEvent motionEvent) {
        VideoComposerFragment videoComposerFragment = this.A00;
        C28331Sf r0 = videoComposerFragment.A0J;
        if (r0 == null) {
            throw C36331k8.A0d("statusConfig");
        } else if (r0.A01()) {
            return false;
        } else {
            VideoComposerFragment.A0A(videoComposerFragment);
            return true;
        }
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        VideoComposerFragment videoComposerFragment = this.A00;
        C65083Qq r0 = videoComposerFragment.A0L;
        if (r0 != null && r0.A0X()) {
            C28331Sf r02 = videoComposerFragment.A0J;
            if (r02 == null) {
                throw C36331k8.A0d("statusConfig");
            } else if (r02.A01()) {
                VideoComposerFragment.A0A(videoComposerFragment);
                return true;
            }
        }
        return false;
    }
}
