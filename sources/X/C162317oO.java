package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.WaTextView;

/* renamed from: X.7oO  reason: invalid class name and case insensitive filesystem */
public class C162317oO extends AnimatorListenerAdapter {
    public Object A00;
    public Object A01;
    public final int A02;

    public C162317oO(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.A02) {
            case 0:
                C36411kG.A1O(this.A01);
                super.onAnimationEnd(animator);
                return;
            case 1:
                WaTextView waTextView = ((AnonymousClass6VH) this.A01).A03;
                waTextView.setAlpha(1.0f);
                waTextView.setVisibility(4);
                C146646vw r1 = (C146646vw) this.A00;
                r1.A06 = new AnonymousClass5LM(r1);
                r1.A0B = false;
                return;
            case 2:
                C92354df r2 = (C92354df) this.A00;
                if (r2.A09 < 0.15f) {
                    C92354df.A01(r2);
                }
                Runnable runnable = (Runnable) this.A01;
                if (runnable != null) {
                    r2.post(runnable);
                    return;
                }
                return;
            default:
                C92354df r12 = (C92354df) this.A00;
                r12.A03();
                r12.post((Runnable) this.A01);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        if (2 - this.A02 != 0) {
            super.onAnimationStart(animator);
            return;
        }
        C92354df r1 = (C92354df) this.A00;
        r1.setVisibility(0);
        r1.A0d = true;
    }
}
