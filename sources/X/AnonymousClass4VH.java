package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.identity.IdentityVerificationActivity;

/* renamed from: X.4VH  reason: invalid class name */
public class AnonymousClass4VH extends AnimatorListenerAdapter {
    public Object A00;
    public String A01;
    public String A02;
    public final int A03;

    public AnonymousClass4VH(IdentityVerificationActivity identityVerificationActivity, String str, String str2, int i) {
        this.A03 = i;
        this.A00 = identityVerificationActivity;
        this.A02 = str;
        this.A01 = str2;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A03 != 0) {
            IdentityVerificationActivity identityVerificationActivity = (IdentityVerificationActivity) this.A00;
            identityVerificationActivity.A0J.A04.setText(this.A02);
            identityVerificationActivity.A0J.A03.setText(this.A01);
            C36351kA.A15(identityVerificationActivity.getResources(), identityVerificationActivity.A0J.A04, C36391kE.A04(identityVerificationActivity.A0J.A04.getContext()));
            identityVerificationActivity.A0J.A04.animate().alpha(1.0f).setDuration(150).setListener((Animator.AnimatorListener) null);
            identityVerificationActivity.A0J.A03.setAlpha(0.0f);
            identityVerificationActivity.A0J.A03.animate().alpha(1.0f).setDuration(150).setListener((Animator.AnimatorListener) null);
            return;
        }
        IdentityVerificationActivity.A0K((IdentityVerificationActivity) this.A00, this.A02, this.A01);
    }
}
