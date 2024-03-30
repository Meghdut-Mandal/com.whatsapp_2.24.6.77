package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.4e8  reason: invalid class name and case insensitive filesystem */
public class C92534e8 extends Animation {
    public final int A00;
    public final int A01;
    public final /* synthetic */ C1262062y A02;

    public boolean willChangeBounds() {
        return true;
    }

    public C92534e8(View view, C1262062y r3, int i) {
        this.A02 = r3;
        this.A01 = i;
        this.A00 = view.getHeight();
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i = this.A00;
        int i2 = i + ((int) (((float) (this.A01 - i)) * f));
        C1262062y r1 = this.A02;
        View view = r1.A01;
        C36411kG.A1A(view, i2);
        view.requestLayout();
        r1.A00((float) i2);
    }
}
