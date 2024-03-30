package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.0DM  reason: invalid class name */
public class AnonymousClass0DM extends AnimatorListenerAdapter {
    public boolean A00;
    public final /* synthetic */ AnonymousClass063 A01;
    public final /* synthetic */ boolean A02;

    public void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    public AnonymousClass0DM(AnonymousClass063 r1, boolean z) {
        this.A01 = r1;
        this.A02 = z;
    }

    public void onAnimationEnd(Animator animator) {
        AnonymousClass063 r2 = this.A01;
        int[] iArr = AnonymousClass063.A0R;
        r2.A04 = 0;
        r2.A07 = null;
        if (!this.A00) {
            AnonymousClass060 r22 = r2.A0I;
            boolean z = this.A02;
            int i = 4;
            if (z) {
                i = 8;
            }
            r22.A03(i, z);
        }
    }

    public void onAnimationStart(Animator animator) {
        AnonymousClass063 r3 = this.A01;
        r3.A0I.A03(0, this.A02);
        r3.A04 = 1;
        r3.A07 = animator;
        this.A00 = false;
    }
}
