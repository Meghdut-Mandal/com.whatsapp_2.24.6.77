package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.transformation.FabTransformationBehavior;

/* renamed from: X.7oM  reason: invalid class name and case insensitive filesystem */
public class C162297oM extends AnimatorListenerAdapter {
    public Object A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public final int A04 = 0;

    public C162297oM(C1271967i r2, C100674vP r3, C160377ku r4) {
        this.A00 = r2;
        this.A01 = r4;
        this.A02 = r3;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.A04 != 0) {
            super.onAnimationCancel(animator);
        } else {
            this.A03 = true;
        }
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A04 == 0) {
            AnonymousClass00C.A0D(animator, 0);
            C1273868b A022 = C1273868b.A02(animator);
            A022.A09(C36441kJ.A0x(this.A03), 1);
            AnonymousClass6JI.A00((C100674vP) this.A02, C1273868b.A05(A022, this.A00, 2), (C160377ku) this.A01);
            this.A03 = false;
        } else if (!this.A03) {
            ((View) this.A01).setVisibility(4);
            View view = (View) this.A02;
            view.setAlpha(1.0f);
            view.setVisibility(0);
        }
    }

    public void onAnimationStart(Animator animator) {
        if (1 - this.A04 != 0) {
            super.onAnimationStart(animator);
        } else if (this.A03) {
            ((View) this.A01).setVisibility(0);
            View view = (View) this.A02;
            view.setAlpha(0.0f);
            view.setVisibility(4);
        }
    }

    public C162297oM(View view, View view2, FabTransformationBehavior fabTransformationBehavior, boolean z) {
        this.A00 = fabTransformationBehavior;
        this.A03 = z;
        this.A01 = view;
        this.A02 = view2;
    }
}
