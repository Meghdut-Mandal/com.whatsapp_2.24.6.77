package X;

import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.whatsapp.R;
import com.whatsapp.profile.ProfileInfoActivity;

/* renamed from: X.4Vy  reason: invalid class name and case insensitive filesystem */
public class C89284Vy extends C135266cQ {
    public Object A00;
    public final int A01;

    public C89284Vy(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onTransitionEnd(Transition transition) {
        ViewGroup A0E;
        switch (this.A01) {
            case 0:
                AnonymousClass2Dr r3 = (AnonymousClass2Dr) this.A00;
                r3.A0Z = false;
                if (r3.A01 == null && (A0E = C36421kH.A0E(r3, R.id.call_notification_holder)) != null) {
                    View B4b = r3.A0F.B4b(r3, r3.A02, (AnonymousClass6BK) null, r3.A0D, (AnonymousClass11F) null);
                    r3.A01 = B4b;
                    C36401kF.A18(B4b, A0E);
                    r3.A0F.setVisibilityChangeListener(new C89744Xs(r3, 1));
                    return;
                }
                return;
            case 1:
                ((AnonymousClass4R6) this.A00).Bjb(false);
                return;
            case 2:
                ((ProfileInfoActivity) this.A00).A01.animate().scaleX(1.0f).scaleY(1.0f).setDuration(125);
                return;
            default:
                super.onTransitionEnd(transition);
                return;
        }
    }

    public void onTransitionStart(Transition transition) {
        float f;
        ViewPropertyAnimator viewPropertyAnimator;
        switch (this.A01) {
            case 0:
                ((AnonymousClass2Dr) this.A00).A0Z = true;
                return;
            case 3:
                ProfileInfoActivity profileInfoActivity = (ProfileInfoActivity) this.A00;
                profileInfoActivity.A01.setScaleX(1.0f);
                profileInfoActivity.A01.setScaleY(1.0f);
                viewPropertyAnimator = profileInfoActivity.A01.animate();
                f = 0.0f;
                break;
            case 4:
                ProfileInfoActivity profileInfoActivity2 = (ProfileInfoActivity) this.A00;
                profileInfoActivity2.A01.setScaleX(0.0f);
                profileInfoActivity2.A01.setScaleY(0.0f);
                viewPropertyAnimator = profileInfoActivity2.A01.animate();
                f = 1.0f;
                break;
            default:
                super.onTransitionStart(transition);
                return;
        }
        viewPropertyAnimator.scaleX(f).scaleY(f).setDuration(125);
    }
}
