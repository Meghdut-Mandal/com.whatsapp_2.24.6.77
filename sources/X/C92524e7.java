package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.4e7  reason: invalid class name and case insensitive filesystem */
public final class C92524e7 extends Animation {
    public final View A00;
    public final int A01;
    public final int A02;

    public void applyTransformation(float f, Transformation transformation) {
        int i = this.A02;
        int i2 = (int) (((float) i) + (((float) (this.A01 - i)) * f));
        View view = this.A00;
        C012005e.A0Q(view, i2 - view.getTop());
    }

    public C92524e7(View view, int i) {
        this.A01 = i;
        this.A02 = view.getTop();
        this.A00 = view;
        setDuration(300);
    }
}
