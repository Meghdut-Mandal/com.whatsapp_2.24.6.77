package X;

import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.MediaComposerFragment;

/* renamed from: X.6FL  reason: invalid class name */
public class AnonymousClass6FL {
    public final /* synthetic */ MediaComposerFragment A00;

    public AnonymousClass6FL(MediaComposerFragment mediaComposerFragment) {
        this.A00 = mediaComposerFragment;
    }

    public void A00() {
        if (this instanceof C162857pG) {
            C162857pG r1 = (C162857pG) this;
            if (r1.A01 == 0) {
                ImageComposerFragment imageComposerFragment = (ImageComposerFragment) r1.A00;
                C135346cY r0 = imageComposerFragment.A04.A02;
                if (r0.A04 <= r0.A01) {
                    ImageComposerFragment.A0A(imageComposerFragment, true, false);
                }
            }
        }
    }

    public void A01() {
        C160827le A1a = this.A00.A1a();
        if (A1a != null) {
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) A1a;
            mediaComposerActivity.A0u.A04(mediaComposerActivity.A0s.A0C());
        }
    }

    public void A02() {
        C160827le A1a = this.A00.A1a();
        if (A1a != null) {
            A1a.BW2();
        }
    }

    public void A03() {
        C160827le A1a;
        MediaComposerFragment mediaComposerFragment = this.A00;
        AnonymousClass01I A0h = mediaComposerFragment.A0h();
        if (A0h != null && !A0h.isFinishing() && (A1a = mediaComposerFragment.A1a()) != null) {
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) A1a;
            if (!mediaComposerActivity.isFinishing()) {
                mediaComposerActivity.A1X = false;
            }
        }
    }
}
