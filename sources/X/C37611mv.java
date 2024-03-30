package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.1mv  reason: invalid class name and case insensitive filesystem */
public class C37611mv extends Animation {
    public final /* synthetic */ C38111nj A00;

    public C37611mv(C38111nj r1) {
        this.A00 = r1;
    }

    public void applyTransformation(float f, Transformation transformation) {
        C38111nj r1 = this.A00;
        r1.A00 = 1.0f - f;
        r1.invalidate();
    }
}
