package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;

/* renamed from: X.1kK  reason: invalid class name and case insensitive filesystem */
public final class C36451kK extends AnimatorListenerAdapter {
    public final /* synthetic */ C43842Ka A00;
    public final /* synthetic */ boolean A01;

    public C36451kK(C43842Ka r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public void onAnimationStart(Animator animator) {
        int i;
        int i2;
        C43842Ka r7 = this.A00;
        int childCount = r7.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = r7.getChildAt(i3);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.width = r7.A0G[i3];
            childAt.setLayoutParams(layoutParams);
        }
        for (int i4 = 0; i4 < r7.getChildCount(); i4++) {
            r7.getChildAt(i4).setVisibility(0);
        }
        boolean z = this.A01;
        int childCount2 = r7.getChildCount();
        int i5 = -1;
        if (z == C36351kA.A1Y(r7.getWhatsAppLocale())) {
            i = r7.getChildCount() - 1;
            i2 = -1;
        } else {
            i5 = childCount2;
            i = 0;
            i2 = 1;
        }
        int i6 = 0;
        while (i != i5) {
            View childAt2 = r7.getChildAt(i);
            AnonymousClass00C.A08(childAt2);
            if (!(childAt2 instanceof AnonymousClass4UC)) {
                C18740tg.A0D(false, "Given view is not ReactionTrayItem.");
            }
            View childAt3 = r7.getChildAt(i);
            AnonymousClass00C.A0E(childAt3, "null cannot be cast to non-null type com.whatsapp.reactions.ReactionTrayItem");
            AnonymousClass4UC r9 = (AnonymousClass4UC) childAt3;
            r9.setForegroundScale(0.0f);
            AnimatorSet A0C = C36441kJ.A0C();
            r7.getSystemFeatures();
            float f = 0.1f + 1.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r9, "foregroundScale", new float[]{0.0f, f});
            AnonymousClass00C.A08(ofFloat);
            ofFloat.setDuration(160);
            Interpolator interpolator = C56812wv.A02;
            ofFloat.setInterpolator(interpolator);
            ObjectAnimator duration = ObjectAnimator.ofFloat(r9, "foregroundAlpha", new float[]{0.0f, 1.0f}).setDuration(120);
            AnonymousClass00C.A08(duration);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(r9, "foregroundScale", new float[]{f, 1.0f});
            AnonymousClass00C.A08(ofFloat2);
            ofFloat2.setDuration(160);
            ofFloat2.setInterpolator(interpolator);
            A0C.playSequentially(new Animator[]{ofFloat, ofFloat2});
            r9.setBackgroundAlpha(0.0f);
            Animator[] A1P = C36441kJ.A1P(ofFloat, duration, 3);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(r9, "backgroundAlpha", new float[]{0.0f, 1.0f});
            ofFloat3.setInterpolator(C56812wv.A00);
            ofFloat3.setDuration(320);
            A1P[2] = ofFloat3;
            A0C.playTogether(A1P);
            A0C.setStartDelay(((long) i6) * 35);
            A0C.start();
            i += i2;
            i6++;
        }
    }
}
