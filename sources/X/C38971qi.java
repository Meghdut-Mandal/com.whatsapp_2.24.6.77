package X;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* renamed from: X.1qi  reason: invalid class name and case insensitive filesystem */
public final class C38971qi extends Scroller {
    public float A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38971qi(Context context, Interpolator interpolator) {
        super(context, interpolator);
        AnonymousClass00C.A0D(context, 1);
    }

    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        float f = this.A00;
        if (f != 0.0f) {
            i5 = (int) (f * ((float) i5));
        }
        super.startScroll(i, i2, i3, i4, i5);
    }
}
