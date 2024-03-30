package X;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.4VW  reason: invalid class name */
public class AnonymousClass4VW extends Animation {
    public int A00;
    public int A01;
    public Object A02;
    public final int A03;

    public AnonymousClass4VW(Object obj, int i, int i2, int i3) {
        this.A03 = i3;
        this.A02 = obj;
        this.A01 = i;
        this.A00 = i2;
    }

    public void applyTransformation(float f, Transformation transformation) {
        AnonymousClass3HK r3;
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        if (this.A03 != 0) {
            if (i == 0) {
                r3 = (AnonymousClass3HK) ((C89904Yi) this.A02).A01;
                r3.A01.getLayoutParams().height = this.A01;
            } else {
                C89904Yi r1 = (C89904Yi) this.A02;
                r3 = (AnonymousClass3HK) r1.A01;
                ViewGroup.LayoutParams layoutParams = r3.A01.getLayoutParams();
                int i2 = r1.A00;
                layoutParams.height = i2 + ((int) (((float) (this.A00 - i2)) * f));
            }
            r3.A01.requestLayout();
        } else if (i != 0) {
            C36961la r2 = (C36961la) this.A02;
            int i3 = this.A01;
            r2.A00 = i3 + ((int) (((float) (this.A00 - i3)) * f));
            r2.invalidateSelf();
        }
    }

    public boolean willChangeBounds() {
        if (1 - this.A03 != 0) {
            return super.willChangeBounds();
        }
        return true;
    }
}
