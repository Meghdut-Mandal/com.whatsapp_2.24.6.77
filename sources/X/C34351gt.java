package X;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: X.1gt  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C34351gt implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BitmapDrawable A00;
    public final /* synthetic */ BitmapDrawable A01;
    public final /* synthetic */ C34341gs A02;

    public /* synthetic */ C34351gt(BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2, C34341gs r3) {
        this.A02 = r3;
        this.A00 = bitmapDrawable;
        this.A01 = bitmapDrawable2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C34341gs r5 = this.A02;
        BitmapDrawable bitmapDrawable = this.A00;
        BitmapDrawable bitmapDrawable2 = this.A01;
        AnonymousClass00C.A0D(r5, 0);
        AnonymousClass00C.A0D(valueAnimator, 3);
        Object animatedValue = valueAnimator.getAnimatedValue();
        AnonymousClass00C.A0E(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        r5.A05.Boy(new C80463vR(bitmapDrawable, bitmapDrawable2, r5, ((Number) animatedValue).floatValue()));
    }
}
