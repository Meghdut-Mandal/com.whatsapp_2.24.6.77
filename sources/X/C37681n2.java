package X;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.1n2  reason: invalid class name and case insensitive filesystem */
public class C37681n2 extends Animation {
    public final int A00;
    public final Drawable A01;
    public final ViewGroup A02;

    public boolean willChangeBounds() {
        return false;
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i = this.A00;
        int i2 = i - ((int) (((float) i) * f));
        ViewGroup viewGroup = this.A02;
        Drawable background = viewGroup.getBackground();
        if (!(background instanceof C36991ld)) {
            return;
        }
        if (f == 1.0f) {
            C36991ld.A00(this.A01, viewGroup);
            return;
        }
        C36991ld r1 = (C36991ld) background;
        r1.A00 = i2;
        r1.invalidateSelf();
    }

    public C37681n2(Drawable drawable, ViewGroup viewGroup, int i) {
        this.A02 = viewGroup;
        this.A00 = i;
        this.A01 = drawable;
    }
}
