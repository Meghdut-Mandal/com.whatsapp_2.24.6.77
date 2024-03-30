package X;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;

/* renamed from: X.7Q9  reason: invalid class name */
public final class AnonymousClass7Q9 extends AnonymousClass00R implements AnonymousClass00S {
    public static final AnonymousClass7Q9 A00 = new AnonymousClass7Q9();

    public AnonymousClass7Q9() {
        super(0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.5f});
        ofFloat.setDuration(1000);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        return ofFloat;
    }
}
