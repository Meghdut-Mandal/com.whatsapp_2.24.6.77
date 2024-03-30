package X;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: X.0Dl  reason: invalid class name and case insensitive filesystem */
public class C03170Dl extends Animatable2.AnimationCallback {
    public final /* synthetic */ C06590Ue A00;

    public C03170Dl(C06590Ue r1) {
        this.A00 = r1;
    }

    public void onAnimationEnd(Drawable drawable) {
        this.A00.A02(drawable);
    }

    public void onAnimationStart(Drawable drawable) {
        this.A00.A01(drawable);
    }
}
