package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.R;

/* renamed from: X.4tB  reason: invalid class name and case insensitive filesystem */
public class C99374tB extends C129176Fq {
    public AnimatorSet A00;
    public ValueAnimator A01;
    public EditText A02;
    public final int A03;
    public final int A04;
    public final TimeInterpolator A05;
    public final TimeInterpolator A06;
    public final View.OnClickListener A07 = new C66923Xv(this, 4);
    public final View.OnFocusChangeListener A08 = new C163347q3(this, 0);

    public static void A00(C99374tB r2, boolean z) {
        Animator animator;
        boolean A0B = r2.A02.A0B();
        boolean A1S = AnonymousClass000.A1S(A0B ? 1 : 0, z ? 1 : 0);
        AnimatorSet animatorSet = r2.A00;
        if (!z) {
            animatorSet.cancel();
            r2.A01.start();
            if (A1S) {
                animator = r2.A01;
            } else {
                return;
            }
        } else if (!animatorSet.isRunning()) {
            r2.A01.cancel();
            r2.A00.start();
            if (A1S) {
                animator = r2.A00;
            } else {
                return;
            }
        } else {
            return;
        }
        animator.end();
    }

    public static boolean A01(C99374tB r1) {
        EditText editText = r1.A02;
        if (editText == null || ((!editText.hasFocus() && !r1.A01.hasFocus()) || C36381kD.A06(r1.A02) <= 0)) {
            return false;
        }
        return true;
    }

    public C99374tB(C93014fP r4) {
        super(r4);
        this.A03 = C014506h.A00(r4.getContext(), R.attr.f4nameremoved, 100);
        this.A04 = C014506h.A00(r4.getContext(), R.attr.f4nameremoved, 150);
        this.A05 = C017807p.A01(AnonymousClass064.A03, r4.getContext(), R.attr.f4nameremoved);
        this.A06 = C017807p.A01(AnonymousClass064.A04, r4.getContext(), R.attr.f4nameremoved);
    }
}
