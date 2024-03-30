package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.whatsapp.HomeActivity;

/* renamed from: X.15l  reason: invalid class name and case insensitive filesystem */
public class C227015l implements View.OnLayoutChangeListener {
    public final /* synthetic */ HomeActivity A00;

    public C227015l(HomeActivity homeActivity) {
        this.A00 = homeActivity;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        HomeActivity homeActivity = this.A00;
        int A0H = HomeActivity.A0H(homeActivity) + HomeActivity.A0I(homeActivity);
        if (homeActivity.A0A == null) {
            int i9 = i4 - A0H;
            int abs = Math.abs(i3 - i);
            int i10 = i4 - i2;
            double d = (double) i10;
            double sqrt = ((double) 500) / (Math.sqrt((double) ((abs * abs) + (i10 * i10))) / d);
            int i11 = (int) ((d / d) * sqrt);
            Pair pair = new Pair(Integer.valueOf(i11), Integer.valueOf((int) (sqrt - ((double) i11))));
            Animator animator = homeActivity.A09;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = homeActivity.A08;
            if (animator2 != null) {
                animator2.cancel();
            }
            ValueAnimator A0K = HomeActivity.A0K(homeActivity, i9);
            homeActivity.A09 = A0K;
            if (A0K == null) {
                homeActivity.A0I.removeOnLayoutChangeListener(homeActivity.A2H);
                return;
            }
            int height = homeActivity.A0D.getHeight();
            homeActivity.A0D.clearAnimation();
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{height, i4});
            ofInt.addUpdateListener(new C66163Ux(new FrameLayout.LayoutParams(-1, -2), new LinearLayout.LayoutParams(-1, 0, 1.0f), homeActivity, true));
            homeActivity.A08 = ofInt;
            AnimatorSet animatorSet = new AnimatorSet();
            homeActivity.A0A = animatorSet;
            animatorSet.setStartDelay((long) ((Number) pair.second).intValue());
            homeActivity.A0A.setDuration((long) ((Number) pair.first).intValue());
            homeActivity.A0A.setInterpolator(homeActivity.A2I);
            homeActivity.A0A.playTogether(new Animator[]{homeActivity.A08, homeActivity.A09});
            homeActivity.A0A.addListener(new AnonymousClass4VK(this, 0));
            homeActivity.A0A.start();
        }
    }
}
