package X;

import android.animation.ValueAnimator;
import com.whatsapp.glasses.layouts.SupToggle;

/* renamed from: X.3Ut  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C66123Ut implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ValueAnimator A00;
    public final /* synthetic */ SupToggle A01;

    public /* synthetic */ C66123Ut(ValueAnimator valueAnimator, SupToggle supToggle) {
        this.A01 = supToggle;
        this.A00 = valueAnimator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        SupToggle.setTrackHeight$lambda$3$lambda$2(this.A01, this.A00, valueAnimator);
    }
}
