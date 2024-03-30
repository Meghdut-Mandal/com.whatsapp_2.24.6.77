package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.1n1  reason: invalid class name and case insensitive filesystem */
public class C37671n1 extends Animation {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C70803fk A01;
    public final /* synthetic */ C36991ld A02;

    public boolean willChangeBounds() {
        return false;
    }

    public C37671n1(C70803fk r1, C36991ld r2, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = r2;
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i = (int) (((float) this.A00) * f);
        C36991ld r0 = this.A02;
        r0.A00 = i;
        r0.invalidateSelf();
    }
}
