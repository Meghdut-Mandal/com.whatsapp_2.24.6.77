package X;

import android.os.Build;
import android.view.View;

/* renamed from: X.6RT  reason: invalid class name */
public abstract class AnonymousClass6RT {
    public static final float A00 = ((float) Math.sqrt(5.0d));

    public static void A00(View view, C1271967i r6, C140456lc r7) {
        C142046oF r4 = (C142046oF) C133266Xn.A05(r6, r7);
        if (r4 == null) {
            AnonymousClass6RS.A01("ViewTransformsExtensionBinderUtils", "Null controller while binding ViewTransformsExtension");
            return;
        }
        r4.A0D = false;
        view.getViewTreeObserver().removeOnPreDrawListener(r4.A0C);
        r4.A0B = null;
        view.setAlpha(1.0f);
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        float A002 = C36341k9.A00(r6.A00);
        view.setCameraDistance(A002 * A002 * (-1280.0f) * A00);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        if (!r4.A0E) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            view.resetPivot();
            return;
        }
        view.setPivotX((C36441kJ.A01(view) * 50.0f) / 100.0f);
        view.setPivotY((C36441kJ.A02(view) * 50.0f) / 100.0f);
    }
}
