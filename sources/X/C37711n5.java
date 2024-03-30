package X;

import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.1n5  reason: invalid class name and case insensitive filesystem */
public class C37711n5 extends Animation {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Drawable A01;
    public final /* synthetic */ AnonymousClass3ZP A02;
    public final /* synthetic */ C36991ld A03;

    public boolean willChangeBounds() {
        return false;
    }

    public C37711n5(Drawable drawable, AnonymousClass3ZP r2, C36991ld r3, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = drawable;
        this.A03 = r3;
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i = this.A00;
        int i2 = i - ((int) (((float) i) * f));
        if (f == 1.0f) {
            C36991ld.A00(this.A01, this.A02.A04.A2R.A02);
            return;
        }
        C36991ld r0 = this.A03;
        r0.A00 = i2;
        r0.invalidateSelf();
    }
}
