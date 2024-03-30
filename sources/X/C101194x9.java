package X;

import android.transition.Transition;
import android.view.animation.AlphaAnimation;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.MediaComposerFragment;

/* renamed from: X.4x9  reason: invalid class name and case insensitive filesystem */
public class C101194x9 extends C135266cQ {
    public final /* synthetic */ MediaComposerActivity A00;

    public C101194x9(MediaComposerActivity mediaComposerActivity) {
        this.A00 = mediaComposerActivity;
    }

    public void onTransitionEnd(Transition transition) {
        MediaComposerActivity mediaComposerActivity = this.A00;
        if (mediaComposerActivity.A03.getVisibility() != 8) {
            mediaComposerActivity.A03.setVisibility(8);
            AlphaAnimation A0L = C36371kC.A0L();
            A0L.setDuration(200);
            mediaComposerActivity.A03.startAnimation(A0L);
        }
        MediaComposerFragment A0F = MediaComposerActivity.A0F(mediaComposerActivity);
        if (A0F != null) {
            A0F.A1b();
        }
    }

    public void onTransitionStart(Transition transition) {
        MediaComposerFragment A0F = MediaComposerActivity.A0F(this.A00);
        if (A0F != null) {
            A0F.A1c();
        }
    }
}
