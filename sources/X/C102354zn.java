package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.whatsapp.R;

/* renamed from: X.4zn  reason: invalid class name and case insensitive filesystem */
public class C102354zn extends AnonymousClass80I {
    public void A0B() {
        this.A0H.clearAnimation();
    }

    public void A0D() {
        View view = this.A0H;
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.f1nameremoved);
        loadAnimation.setStartOffset((loadAnimation.getDuration() / 4) * (((long) A04()) % 4));
        view.startAnimation(loadAnimation);
    }

    public C102354zn(View view) {
        super(view);
    }

    public /* bridge */ /* synthetic */ void A0C(AnonymousClass9EL r1) {
        A0D();
    }
}
