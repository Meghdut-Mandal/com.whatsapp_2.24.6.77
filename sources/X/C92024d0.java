package X;

import android.animation.Animator;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.4d0  reason: invalid class name and case insensitive filesystem */
public final class C92024d0 extends Transition {
    public int A00;
    public int A01;
    public final Rect A02 = AnonymousClass001.A06();
    public final boolean A03;
    public final int[] A04 = C36441kJ.A1O();
    public final Context A05;
    public final AnonymousClass3CG A06;

    public void captureEndValues(TransitionValues transitionValues) {
        View view;
        String str;
        if (transitionValues != null && (view = transitionValues.view) != null && !this.A03) {
            AnonymousClass3CG r3 = this.A06;
            String str2 = null;
            if (r3 != null) {
                str = r3.A02(R.string.f12nameremoved);
            } else {
                str = null;
            }
            if (AnonymousClass00C.A0J(str, C011004s.A03(view))) {
                int[] iArr = this.A04;
                view.getLocationOnScreen(iArr);
                this.A01 = iArr[1];
            }
            if (r3 != null) {
                str2 = r3.A02(R.string.f12nameremoved);
            }
            if (AnonymousClass00C.A0J(str2, C011004s.A03(view))) {
                int[] iArr2 = this.A04;
                view.getLocationOnScreen(iArr2);
                this.A00 = C36431kI.A04(view, iArr2[1]);
            }
        }
    }

    public void captureStartValues(TransitionValues transitionValues) {
        View view;
        String str;
        if (transitionValues != null && (view = transitionValues.view) != null && this.A03) {
            AnonymousClass3CG r3 = this.A06;
            String str2 = null;
            if (r3 != null) {
                str = r3.A02(R.string.f12nameremoved);
            } else {
                str = null;
            }
            if (AnonymousClass00C.A0J(str, C011004s.A03(view))) {
                int[] iArr = this.A04;
                view.getLocationOnScreen(iArr);
                this.A01 = iArr[1];
            }
            if (r3 != null) {
                str2 = r3.A02(R.string.f12nameremoved);
            }
            if (AnonymousClass00C.A0J(str2, C011004s.A03(view))) {
                int[] iArr2 = this.A04;
                view.getLocationOnScreen(iArr2);
                this.A00 = C36431kI.A04(view, iArr2[1]);
            }
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        FloatEvaluator floatEvaluator = new FloatEvaluator();
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = 0;
        A0M[1] = 1;
        ValueAnimator ofObject = ValueAnimator.ofObject(floatEvaluator, A0M);
        ofObject.addUpdateListener(new C110885bO(transitionValues2, this, 4));
        return ofObject;
    }

    public C92024d0(Context context, AnonymousClass3CG r3, boolean z) {
        this.A06 = r3;
        this.A03 = z;
        this.A05 = context;
    }
}
