package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.1mx  reason: invalid class name and case insensitive filesystem */
public class C37631mx extends Animation {
    public final /* synthetic */ C64753Ph A00;

    public C37631mx(C64753Ph r1) {
        this.A00 = r1;
    }

    public void applyTransformation(float f, Transformation transformation) {
        C64753Ph r1 = this.A00;
        r1.A00 = 1.0f - f;
        r1.A0A.invalidate();
    }
}
