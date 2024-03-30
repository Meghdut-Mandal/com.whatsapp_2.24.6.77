package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.1mw  reason: invalid class name and case insensitive filesystem */
public class C37621mw extends Animation {
    public final /* synthetic */ AnonymousClass2IS A00;

    public C37621mw(AnonymousClass2IS r1) {
        this.A00 = r1;
    }

    public void applyTransformation(float f, Transformation transformation) {
        AnonymousClass2IS r1 = this.A00;
        r1.A00 = 1.0f - f;
        r1.invalidate();
    }
}
