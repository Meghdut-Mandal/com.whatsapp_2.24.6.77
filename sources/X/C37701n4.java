package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.1n4  reason: invalid class name and case insensitive filesystem */
public class C37701n4 extends Animation {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C37991nX A03;

    public boolean willChangeBounds() {
        return true;
    }

    public C37701n4(View view, C37991nX r2, int i, int i2) {
        this.A03 = r2;
        this.A02 = view;
        this.A00 = i;
        this.A01 = i2;
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        View view = this.A02;
        if (i == 0) {
            C36421kH.A0t(view);
        } else {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i2 = this.A00;
            layoutParams.height = i2 + ((int) (((float) (this.A01 - i2)) * f));
        }
        view.requestLayout();
    }
}
