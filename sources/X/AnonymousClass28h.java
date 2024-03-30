package X;

import android.transition.Transition;
import android.view.animation.AlphaAnimation;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.28h  reason: invalid class name */
public class AnonymousClass28h extends C135266cQ {
    public final /* synthetic */ MediaViewBaseFragment A00;
    public final /* synthetic */ AnonymousClass4R6 A01;

    public AnonymousClass28h(MediaViewBaseFragment mediaViewBaseFragment, AnonymousClass4R6 r2) {
        this.A00 = mediaViewBaseFragment;
        this.A01 = r2;
    }

    public void onTransitionEnd(Transition transition) {
        MediaViewBaseFragment mediaViewBaseFragment = this.A00;
        AnonymousClass01I A0h = mediaViewBaseFragment.A0h();
        if (A0h != null && !mediaViewBaseFragment.A0i && !A0h.isFinishing()) {
            mediaViewBaseFragment.A02.setVisibility(0);
            AlphaAnimation A0D = C36351kA.A0D();
            A0D.setDuration(600);
            mediaViewBaseFragment.A02.startAnimation(A0D);
            mediaViewBaseFragment.A1o(true, true);
            PhotoView A1b = mediaViewBaseFragment.A1b(mediaViewBaseFragment.A1e(mediaViewBaseFragment.A08.getCurrentItem()));
            if (A1b != null) {
                PhotoView.A04(A1b, true);
            }
            this.A01.Bjb(true);
        }
    }
}
