package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.whatsapp.R;
import com.whatsapp.status.StatusesFragment;
import java.util.List;

/* renamed from: X.3rI  reason: invalid class name and case insensitive filesystem */
public class C77933rI implements C88134Rn {
    public View A00;
    public View A01;
    public final /* synthetic */ StatusesFragment A02;

    public C77933rI(StatusesFragment statusesFragment) {
        this.A02 = statusesFragment;
    }

    public static void A00(C77933rI r9, boolean z, boolean z2) {
        int measuredHeight = r9.A01.getMeasuredHeight();
        if (r9.A01.getVisibility() != 0) {
            C36351kA.A1B(r9.A01, r9.A00.getMeasuredWidth(), Integer.MIN_VALUE);
            measuredHeight = r9.A01.getMeasuredHeight();
        }
        StatusesFragment statusesFragment = r9.A02;
        AnimatorSet animatorSet = statusesFragment.A01;
        if (animatorSet == null || (!animatorSet.isRunning() && !statusesFragment.A01.isStarted())) {
            statusesFragment.A01 = C36441kJ.A0C();
            int i = 8;
            float f = 100.0f;
            float f2 = 0.0f;
            if (z) {
                i = 0;
                f2 = 100.0f;
                f = 0.0f;
            }
            int i2 = 1;
            if (z2) {
                i2 = 500;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f2, f});
            ofFloat.setDuration((long) i2);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new C53602ra(r9, measuredHeight, 1));
            ofFloat.addListener(new C36501kP(r9, i, z));
            statusesFragment.A01.playSequentially(new Animator[]{ofFloat});
            AnonymousClass4VL.A00(statusesFragment.A01, r9, 23);
            if (z) {
                statusesFragment.A01.setStartDelay(700);
            }
            statusesFragment.A01.start();
        }
    }

    public View BJ6(Context context, View view, ViewGroup viewGroup, AnonymousClass1RY r7, List list, List list2, List list3, List list4, boolean z) {
        if (view != null) {
            this.A00 = view;
            this.A01 = view.findViewById(R.id.status_sharing_row_view);
        } else {
            View A0E = C36361kB.A0E(LayoutInflater.from(context), viewGroup, R.layout.f9nameremoved);
            this.A00 = A0E;
            StatusesFragment statusesFragment = this.A02;
            C36421kH.A0z(A0E, statusesFragment, R.string.f12nameremoved);
            C33521fV.A03(this.A00, R.string.f12nameremoved);
            C67103Yn.A00(this.A00, this, 0);
            C67103Yn.A00(this.A00.findViewById(R.id.status_row_share_to_third_party_button), this, 1);
            this.A01 = this.A00.findViewById(R.id.status_sharing_row_view);
            AnonymousClass3P1 r1 = statusesFragment.A0u;
            r1.A00 = new C597435c(viewGroup, this);
            AnonymousClass3KF r0 = r1.A01;
            A00(this, r0.A03, r0.A02);
        }
        return this.A00;
    }
}
