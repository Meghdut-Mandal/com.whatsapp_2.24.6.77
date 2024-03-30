package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.4dD  reason: invalid class name and case insensitive filesystem */
public class C92154dD extends ScaleGestureDetector {
    public final /* synthetic */ int A00;
    public final /* synthetic */ PhotoView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92154dD(Context context, ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener, PhotoView photoView, int i) {
        super(context, onScaleGestureListener);
        this.A01 = photoView;
        this.A00 = i;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        if (motionEvent.getPointerCount() > 1) {
            float f = 0.0f;
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i = 0; i < pointerCount; i++) {
                f2 += motionEvent.getX(i);
                f3 += motionEvent.getY(i);
            }
            float f4 = (float) pointerCount;
            float f5 = f2 / f4;
            float f6 = f3 / f4;
            float f7 = 0.0f;
            for (int i2 = 0; i2 < pointerCount; i2++) {
                f += C90494aF.A01(motionEvent.getX(i2), f5);
                f7 += C90494aF.A01(motionEvent.getY(i2), f6);
            }
            if (((float) Math.hypot((double) ((f / f4) * 2.0f), (double) ((f7 / f4) * 2.0f))) <= ((float) this.A00)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
