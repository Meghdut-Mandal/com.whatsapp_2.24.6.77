package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageButton;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.3P6  reason: invalid class name */
public final class AnonymousClass3P6 {
    public AnimatorSet A00;
    public AnimatorSet A01;
    public ImageButton A02;
    public StickerView A03;
    public AnonymousClass1RJ A04;
    public final AnimatorSet A05 = C36441kJ.A0C();
    public final AnimatorSet A06 = C36441kJ.A0C();
    public final Handler A07 = C36341k9.A0H();
    public final AnonymousClass1HA A08;

    public AnonymousClass3P6(AnonymousClass1HA r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A08 = r2;
    }

    public static final AnimatorSet A00(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{0.4f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{0.4f, 1.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.2f, 1.0f});
        AnimatorSet A0C = C36441kJ.A0C();
        Animator[] animatorArr = new Animator[3];
        C36321k7.A1H(ofFloat, ofFloat2, ofFloat3, animatorArr);
        A0C.playTogether(animatorArr);
        A0C.setDuration(350);
        A0C.setInterpolator(new OvershootInterpolator(3.0f));
        return A0C;
    }

    public final void A01() {
        this.A07.removeCallbacksAndMessages((Object) null);
        AnimatorSet animatorSet = this.A06;
        animatorSet.removeAllListeners();
        animatorSet.end();
        AnimatorSet animatorSet2 = this.A05;
        animatorSet2.removeAllListeners();
        animatorSet2.end();
        AnimatorSet animatorSet3 = this.A01;
        if (animatorSet3 != null) {
            animatorSet3.removeAllListeners();
        }
        AnimatorSet animatorSet4 = this.A01;
        if (animatorSet4 != null) {
            animatorSet4.end();
        }
        AnimatorSet animatorSet5 = this.A00;
        if (animatorSet5 != null) {
            animatorSet5.removeAllListeners();
        }
        AnimatorSet animatorSet6 = this.A00;
        if (animatorSet6 != null) {
            animatorSet6.end();
        }
    }
}
