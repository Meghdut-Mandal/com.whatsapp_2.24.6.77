package X;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView;
import java.lang.ref.WeakReference;

/* renamed from: X.5MF  reason: invalid class name */
public final class AnonymousClass5MF extends C132446Tt {
    public final Matrix A00;
    public final Rect A01;
    public final Rect A02;
    public final WeakReference A03;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C157417cv r3 = (C157417cv) this.A03.get();
        if (r3 != null && bitmap != null) {
            ShapePickerView shapePickerView = (ShapePickerView) r3;
            shapePickerView.A01 = bitmap;
            ValueAnimator valueAnimator = shapePickerView.A00;
            if (valueAnimator == null) {
                int[] A1O = C36441kJ.A1O();
                // fill-array-data instruction
                A1O[0] = 0;
                A1O[1] = 255;
                ValueAnimator ofInt = ValueAnimator.ofInt(A1O);
                shapePickerView.A00 = ofInt;
                C90494aF.A0q(ofInt);
                shapePickerView.A00.setDuration(300);
                C111565cU.A00(shapePickerView.A00, shapePickerView, 23);
            } else {
                valueAnimator.cancel();
            }
            shapePickerView.A00.start();
        }
    }

    public AnonymousClass5MF(Matrix matrix, Rect rect, Rect rect2, C157417cv r5) {
        this.A02 = rect;
        this.A01 = rect2;
        this.A00 = matrix;
        this.A03 = AnonymousClass001.A0F(r5);
    }
}
