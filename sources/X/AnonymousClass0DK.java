package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.0DK  reason: invalid class name */
public class AnonymousClass0DK extends AnimatorListenerAdapter {
    public final /* synthetic */ AnonymousClass063 A00;
    public final /* synthetic */ boolean A01;

    public AnonymousClass0DK(AnonymousClass063 r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public void onAnimationEnd(Animator animator) {
        AnonymousClass063 r2 = this.A00;
        int[] iArr = AnonymousClass063.A0R;
        r2.A04 = 0;
        r2.A07 = null;
    }

    public void onAnimationStart(Animator animator) {
        AnonymousClass063 r3 = this.A00;
        r3.A0I.A03(0, this.A01);
        r3.A04 = 2;
        r3.A07 = animator;
    }
}
