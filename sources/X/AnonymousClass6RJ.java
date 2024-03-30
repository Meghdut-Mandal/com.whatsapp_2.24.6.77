package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.6RJ  reason: invalid class name */
public abstract class AnonymousClass6RJ {
    public static final Handler A00 = new C91584cH(Looper.getMainLooper());

    public static GradientDrawable A00(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof GradientDrawable) {
                return (GradientDrawable) drawable;
            }
            if (drawable instanceof ScaleDrawable) {
                return A00(((ScaleDrawable) drawable).getDrawable());
            }
            if ((drawable instanceof StateListDrawable) && drawable.getConstantState() != null) {
                DrawableContainer.DrawableContainerState drawableContainerState = (DrawableContainer.DrawableContainerState) drawable.getConstantState();
                for (int i = 0; i < drawableContainerState.getChildCount(); i++) {
                    GradientDrawable A002 = A00(drawableContainerState.getChild(i));
                    if (A002 != null) {
                        return A002;
                    }
                }
            }
        }
        return null;
    }

    public static void A01(C124975z6 r3, int i) {
        GradientDrawable gradientDrawable = r3.A09;
        if (gradientDrawable != null && r3.A0A != null && r3.A0B != null) {
            gradientDrawable.setSize(-1, i);
            r3.A0A.setSize(-1, i);
            r3.A0B.setSize(-1, i);
        }
    }
}
