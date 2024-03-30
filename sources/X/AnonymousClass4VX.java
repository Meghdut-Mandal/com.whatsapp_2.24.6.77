package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.4VX  reason: invalid class name */
public class AnonymousClass4VX extends Animation {
    public int A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4VX(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i;
        int i2;
        Object obj;
        View view;
        switch (this.A02) {
            case 0:
                AnonymousClass3HK r3 = (AnonymousClass3HK) this.A01;
                ViewGroup.LayoutParams layoutParams = r3.A01.getLayoutParams();
                int i3 = this.A00;
                layoutParams.height = i3 - ((int) (((float) i3) * f));
                view = r3.A01;
                break;
            case 1:
                if (f < 1.0f) {
                    int i4 = this.A00;
                    i = i4 - ((int) (((float) i4) * f));
                } else {
                    i = 0;
                }
                obj = this.A01;
                break;
            default:
                if (f == 1.0f) {
                    i2 = this.A00;
                } else {
                    i2 = (int) (f * ((float) this.A00));
                }
                obj = ((C89924Yk) this.A01).A00;
                break;
        }
        view = (View) obj;
        C36411kG.A1A(view, i2);
        view.requestLayout();
    }

    public boolean willChangeBounds() {
        return true;
    }
}
