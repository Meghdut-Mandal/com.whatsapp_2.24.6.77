package X;

import android.view.View;
import android.view.animation.AlphaAnimation;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.VideoComposerFragment;

/* renamed from: X.7pG  reason: invalid class name and case insensitive filesystem */
public class C162857pG extends AnonymousClass6FL {
    public Object A00;
    public final int A01 = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C162857pG(ImageComposerFragment imageComposerFragment) {
        super(imageComposerFragment);
        this.A00 = imageComposerFragment;
    }

    public void A01() {
        if (this.A01 != 0) {
            super.A01();
            View view = ((VideoComposerFragment) this.A00).A08;
            AlphaAnimation A0L = C36371kC.A0L();
            A0L.setDuration(300);
            if (view != null) {
                view.startAnimation(A0L);
                view.setVisibility(4);
                return;
            }
            return;
        }
        C160827le A1a = ((MediaComposerFragment) this.A00).A1a();
        if (A1a != null) {
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) A1a;
            mediaComposerActivity.A0u.A04(mediaComposerActivity.A0s.A0C());
        }
    }

    public void A02() {
        C146806wC r0;
        if (this.A01 != 0) {
            super.A02();
            VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this.A00;
            View view = videoComposerFragment.A08;
            if (view == null || view.getVisibility() != 0) {
                VideoComposerFragment.A07(videoComposerFragment.A08, 300);
                return;
            }
            return;
        }
        ImageComposerFragment imageComposerFragment = (ImageComposerFragment) this.A00;
        C160827le A1a = imageComposerFragment.A1a();
        if (A1a != null) {
            A1a.BW2();
            C135346cY r02 = imageComposerFragment.A04.A02;
            if (r02.A04 <= r02.A01 && (r0 = imageComposerFragment.A0E) != null && r0.A0K.A03.getVisibility() != 0) {
                ImageComposerFragment.A0A(imageComposerFragment, true, false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r0.A0J != 3) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r5 = this;
            int r0 = r5.A01
            if (r0 == 0) goto L_0x0008
            super.A03()
        L_0x0007:
            return
        L_0x0008:
            java.lang.Object r4 = r5.A00
            com.whatsapp.mediacomposer.ImageComposerFragment r4 = (com.whatsapp.mediacomposer.ImageComposerFragment) r4
            X.6WR r3 = r4.A05
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.A07
            if (r0 == 0) goto L_0x0018
            int r2 = r0.A0J
            r0 = 3
            r1 = 1
            if (r2 == r0) goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            boolean r0 = X.AnonymousClass6WR.A03(r3)
            if (r1 == 0) goto L_0x0021
            if (r0 == 0) goto L_0x0027
        L_0x0021:
            r1 = r0 ^ 1
            r0 = 0
            com.whatsapp.mediacomposer.ImageComposerFragment.A0A(r4, r0, r1)
        L_0x0027:
            X.7le r2 = r4.A1a()
            if (r2 == 0) goto L_0x0007
            X.6WR r0 = r4.A05
            boolean r1 = r0.A0F
            com.whatsapp.mediacomposer.MediaComposerActivity r2 = (com.whatsapp.mediacomposer.MediaComposerActivity) r2
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L_0x0007
            r2.A1X = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162857pG.A03():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C162857pG(VideoComposerFragment videoComposerFragment) {
        super(videoComposerFragment);
        this.A00 = videoComposerFragment;
    }
}
