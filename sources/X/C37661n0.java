package X;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.1n0  reason: invalid class name and case insensitive filesystem */
public class C37661n0 extends Animation {
    public final int A00;
    public final ViewGroup A01;

    public boolean willChangeBounds() {
        return false;
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i = (int) (((float) this.A00) * f);
        Drawable background = this.A01.getBackground();
        if (background instanceof C36991ld) {
            C36991ld r1 = (C36991ld) background;
            r1.A00 = i;
            r1.invalidateSelf();
        }
    }

    public C37661n0(ViewGroup viewGroup, int i) {
        this.A01 = viewGroup;
        this.A00 = i;
    }
}
