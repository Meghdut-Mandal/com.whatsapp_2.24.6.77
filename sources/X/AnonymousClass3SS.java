package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import com.whatsapp.ConversationFragment;

/* renamed from: X.3SS  reason: invalid class name */
public abstract class AnonymousClass3SS {
    public static AnimationSet A00(boolean z, boolean z2, boolean z3) {
        AlphaAnimation alphaAnimation;
        AnimationSet animationSet = new AnimationSet(true);
        float f = 1.0f;
        if (z3) {
            if (!z2) {
                alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            }
            alphaAnimation.setDuration(100);
            animationSet.addAnimation(alphaAnimation);
        }
        if (!z) {
            f = -1.0f;
        }
        float f2 = 0.0f;
        if (z2) {
            f2 = f;
            f = 0.0f;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, f2, 1, f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(100);
        animationSet.addAnimation(translateAnimation);
        animationSet.setDuration(100);
        return animationSet;
    }

    @Deprecated
    public static AnonymousClass4V7 A01(Context context) {
        Activity A00 = C18860tw.A00(context);
        if (A00 != null) {
            if (A00 instanceof AnonymousClass4V7) {
                return (AnonymousClass4V7) A00;
            }
            if (A00 instanceof AnonymousClass155) {
                AnonymousClass02E A0N = ((AnonymousClass01I) A00).getSupportFragmentManager().A0N("com.whatsapp.HomeActivity.ConversationFragment");
                if (A0N instanceof ConversationFragment) {
                    return ((ConversationFragment) A0N).A02;
                }
            }
        }
        return null;
    }

    public static AnonymousClass4V7 A02(View view) {
        return A01(view.getContext());
    }

    public static void A03(AnonymousClass1G5 r1, AnonymousClass11F r2) {
        AnonymousClass1G6 A00 = r1.A00();
        if (!A00.A01) {
            C88834Uf r12 = A00.A00;
            if (r12 != null && !r12.isFinishing()) {
                if (r2 == null || r2.equals(r12.getChatJid())) {
                    r12.BJO();
                }
            }
        } else if (r2 == null || r2.equals(A00.A00().getChatJid())) {
            A00.A00().BJO();
        }
    }
}
