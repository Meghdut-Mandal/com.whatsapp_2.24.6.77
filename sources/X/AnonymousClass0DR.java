package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0DR  reason: invalid class name */
public class AnonymousClass0DR extends AnimatorListenerAdapter implements C17290r2 {
    public boolean A00 = false;
    public boolean A01;
    public final int A02;
    public final View A03;
    public final ViewGroup A04;
    public final boolean A05;

    public AnonymousClass0DR(View view, int i) {
        this.A03 = view;
        this.A02 = i;
        this.A04 = (ViewGroup) view.getParent();
        this.A05 = true;
        A00(true);
    }

    public void Bjc(AnonymousClass054 r1) {
    }

    public void Bje(AnonymousClass054 r2) {
        A00(false);
    }

    public void Bjf(AnonymousClass054 r2) {
        A00(true);
    }

    public void Bjg(AnonymousClass054 r1) {
    }

    public void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    private void A00(boolean z) {
        ViewGroup viewGroup;
        if (this.A05 && this.A01 != z && (viewGroup = this.A04) != null) {
            this.A01 = z;
            AnonymousClass0W4.A01(viewGroup, z);
        }
    }

    public void Bjd(AnonymousClass054 r4) {
        if (!this.A00) {
            AnonymousClass0W5.A02.A05(this.A03, this.A02);
            ViewGroup viewGroup = this.A04;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        A00(false);
        r4.A0B(this);
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.A00) {
            AnonymousClass0W5.A02.A05(this.A03, this.A02);
            ViewGroup viewGroup = this.A04;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        A00(false);
    }

    public void onAnimationPause(Animator animator) {
        if (!this.A00) {
            AnonymousClass0W5.A02.A05(this.A03, this.A02);
        }
    }

    public void onAnimationResume(Animator animator) {
        if (!this.A00) {
            AnonymousClass0W5.A02.A05(this.A03, 0);
        }
    }
}
