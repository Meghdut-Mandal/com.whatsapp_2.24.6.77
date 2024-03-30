package X;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.0Vt  reason: invalid class name and case insensitive filesystem */
public abstract class C06950Vt {
    public static final int[] A00 = {16843848};

    public static void A00(View view, float f) {
        int integer = view.getResources().getInteger(R.integer.f8nameremoved);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842910, R.attr.f4nameremoved, -R.attr.f4nameremoved}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }
}
