package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.transformation.FabTransformationScrimBehavior;

/* renamed from: X.4aR  reason: invalid class name and case insensitive filesystem */
public class C90614aR extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ FabTransformationScrimBehavior A01;
    public final /* synthetic */ boolean A02;

    public C90614aR(View view, FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z) {
        this.A01 = fabTransformationScrimBehavior;
        this.A02 = z;
        this.A00 = view;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.A02) {
            this.A00.setVisibility(4);
        }
    }

    public void onAnimationStart(Animator animator) {
        if (this.A02) {
            this.A00.setVisibility(0);
        }
    }
}
