package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.4e9  reason: invalid class name and case insensitive filesystem */
public class C92544e9 extends Animation {
    public final int A00;
    public final int A01;
    public final View A02;
    public final /* synthetic */ C142466ov A03;

    public boolean willChangeBounds() {
        return true;
    }

    public C92544e9(View view, C142466ov r3, int i) {
        this.A03 = r3;
        this.A02 = view;
        this.A01 = i;
        this.A00 = view.getHeight();
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i = this.A00;
        int i2 = i + ((int) (((float) (this.A01 - i)) * f));
        View view = this.A02;
        C36411kG.A1A(view, i2);
        view.requestLayout();
        C142466ov r2 = this.A03;
        C142466ov.A09(r2, (float) C36431kI.A04(r2.A0A, i2), false);
    }
}
