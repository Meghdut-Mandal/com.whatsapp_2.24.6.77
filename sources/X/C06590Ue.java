package X;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: X.0Ue  reason: invalid class name and case insensitive filesystem */
public abstract class C06590Ue {
    public Animatable2.AnimationCallback A00;

    public void A01(Drawable drawable) {
    }

    public abstract void A02(Drawable drawable);

    public Animatable2.AnimationCallback A00() {
        Animatable2.AnimationCallback animationCallback = this.A00;
        if (animationCallback != null) {
            return animationCallback;
        }
        C03170Dl r0 = new C03170Dl(this);
        this.A00 = r0;
        return r0;
    }
}
