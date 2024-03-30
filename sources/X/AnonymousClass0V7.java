package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: X.0V7  reason: invalid class name */
public final class AnonymousClass0V7 {
    public final WeakReference A00;

    public void A00() {
        View A0Y = AnonymousClass000.A0Y(this.A00);
        if (A0Y != null) {
            A0Y.animate().cancel();
        }
    }

    public void A01() {
        View A0Y = AnonymousClass000.A0Y(this.A00);
        if (A0Y != null) {
            A0Y.animate().start();
        }
    }

    public void A02(float f) {
        View A0Y = AnonymousClass000.A0Y(this.A00);
        if (A0Y != null) {
            A0Y.animate().alpha(f);
        }
    }

    public void A03(float f) {
        View A0Y = AnonymousClass000.A0Y(this.A00);
        if (A0Y != null) {
            A0Y.animate().scaleX(f);
        }
    }

    public void A04(float f) {
        View A0Y = AnonymousClass000.A0Y(this.A00);
        if (A0Y != null) {
            A0Y.animate().scaleY(f);
        }
    }

    public void A05(float f) {
        View A0Y = AnonymousClass000.A0Y(this.A00);
        if (A0Y != null) {
            A0Y.animate().translationX(f);
        }
    }

    public void A06(float f) {
        View A0Y = AnonymousClass000.A0Y(this.A00);
        if (A0Y != null) {
            A0Y.animate().translationY(f);
        }
    }

    public void A07(long j) {
        View A0Y = AnonymousClass000.A0Y(this.A00);
        if (A0Y != null) {
            A0Y.animate().setDuration(j);
        }
    }

    public void A08(Interpolator interpolator) {
        View A0Y = AnonymousClass000.A0Y(this.A00);
        if (A0Y != null) {
            A0Y.animate().setInterpolator(interpolator);
        }
    }

    public void A09(C17190qs r5) {
        C18040sW r0;
        View A0Y = AnonymousClass000.A0Y(this.A00);
        if (A0Y != null) {
            ViewPropertyAnimator animate = A0Y.animate();
            if (r5 != null) {
                r0 = new C18040sW(A0Y, this, r5, 0);
            } else {
                r0 = null;
            }
            animate.setListener(r0);
        }
    }

    public AnonymousClass0V7(View view) {
        this.A00 = AnonymousClass001.A0F(view);
    }
}
