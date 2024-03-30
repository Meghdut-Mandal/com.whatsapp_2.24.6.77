package X;

import android.view.View;

/* renamed from: X.6d4  reason: invalid class name and case insensitive filesystem */
public final class C135666d4 implements View.OnLayoutChangeListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;

    public C135666d4(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        float f = this.A00;
        view.setScaleX(f);
        view.setScaleY(f);
        view.setTranslationY(C36441kJ.A02(view) * this.A01 * f);
    }
}
