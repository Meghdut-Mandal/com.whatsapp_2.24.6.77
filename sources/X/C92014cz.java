package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Map;

/* renamed from: X.4cz  reason: invalid class name and case insensitive filesystem */
public final class C92014cz extends Fade {
    public final /* synthetic */ float A00;
    public final /* synthetic */ Window A01;
    public final /* synthetic */ AnonymousClass6CU A02;

    public void captureStartValues(TransitionValues transitionValues) {
        AnonymousClass00C.A0D(transitionValues, 0);
        super.captureStartValues(transitionValues);
        float f = this.A00;
        if (f != 0.0f) {
            Map map = transitionValues.values;
            AnonymousClass00C.A07(map);
            map.put("android:fade:transitionAlpha", Float.valueOf(f));
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        AnonymousClass00C.A0D(viewGroup, 0);
        C36321k7.A0x(transitionValues, transitionValues2);
        Animator createAnimator = super.createAnimator(viewGroup, transitionValues, transitionValues2);
        AnonymousClass00C.A0E(createAnimator, "null cannot be cast to non-null type android.animation.ObjectAnimator");
        ObjectAnimator objectAnimator = (ObjectAnimator) createAnimator;
        AnonymousClass6CU r3 = this.A02;
        if (r3.A03 != 0) {
            objectAnimator.addUpdateListener(new AnonymousClass6Yi(objectAnimator, this.A01, r3, this.A00));
        }
        return objectAnimator;
    }

    public C92014cz(Window window, AnonymousClass6CU r2, float f) {
        this.A00 = f;
        this.A02 = r2;
        this.A01 = window;
    }
}
