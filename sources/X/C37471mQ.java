package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import com.whatsapp.crop.CropImage;

/* renamed from: X.1mQ  reason: invalid class name and case insensitive filesystem */
public class C37471mQ extends TouchDelegate {
    public final /* synthetic */ CropImage A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37471mQ(Rect rect, View view, CropImage cropImage) {
        super(rect, view);
        this.A00 = cropImage;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        CropImage cropImage = this.A00;
        float f = 0.0f;
        if (x < ((float) cropImage.A0L.getLeft())) {
            x = 0.0f;
        } else if (x > ((float) cropImage.A0L.getRight())) {
            x = C36441kJ.A01(cropImage.A0L);
        }
        float y = motionEvent.getY();
        if (y >= ((float) cropImage.A0L.getTop())) {
            if (y > ((float) cropImage.A0L.getBottom())) {
                f = C36441kJ.A02(cropImage.A0L);
            } else {
                f = y;
            }
        }
        motionEvent.setLocation(x, f);
        cropImage.A0L.dispatchTouchEvent(motionEvent);
        return true;
    }
}
