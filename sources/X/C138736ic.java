package X;

import android.view.View;

/* renamed from: X.6ic  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C138736ic implements C16750q2 {
    public static final /* synthetic */ C138736ic A00 = new C138736ic();

    public final void Bw5(View view, float f) {
        if (f < 0.0f || f >= 1.0f) {
            view.setTranslationX(0.0f);
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            return;
        }
        view.setTranslationX((-f) * C36441kJ.A01(view));
        view.setAlpha(Math.max(0.0f, 1.0f - f));
        float max = Math.max(0.0f, 1.0f - (f * 0.3f));
        view.setScaleX(max);
        view.setScaleY(max);
    }
}
