package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import com.whatsapp.profile.ProfileInfoActivity;
import com.whatsapp.util.FloatingChildLayout;

/* renamed from: X.4VF  reason: invalid class name */
public class AnonymousClass4VF extends AnimatorListenerAdapter {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03 = 0;

    public AnonymousClass4VF(FloatingChildLayout floatingChildLayout, Runnable runnable, boolean z) {
        this.A00 = floatingChildLayout;
        this.A02 = z;
        this.A01 = runnable;
    }

    public void onAnimationEnd(Animator animator) {
        int i;
        if (this.A03 != 0) {
            FloatingChildLayout floatingChildLayout = (FloatingChildLayout) this.A00;
            floatingChildLayout.A08.setLayerType(0, (Paint) null);
            boolean z = this.A02;
            int i2 = floatingChildLayout.A03;
            if (z) {
                if (i2 == 3) {
                    i = 4;
                } else {
                    return;
                }
            } else if (i2 == 1) {
                i = 2;
            } else {
                return;
            }
            floatingChildLayout.A03 = i;
        } else if (this.A02) {
            this.A02 = false;
            if (!((C225314u) this.A00).A0E) {
                return;
            }
        } else {
            return;
        }
        C36411kG.A1O(this.A01);
    }

    public AnonymousClass4VF(ProfileInfoActivity profileInfoActivity, Runnable runnable) {
        this.A00 = profileInfoActivity;
        this.A01 = runnable;
        this.A02 = true;
    }
}
