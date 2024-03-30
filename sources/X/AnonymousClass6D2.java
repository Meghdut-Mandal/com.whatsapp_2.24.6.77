package X;

import android.os.Handler;
import android.widget.FrameLayout;
import com.whatsapp.videoplayback.ExoPlayerErrorFrame;

/* renamed from: X.6D2  reason: invalid class name */
public final class AnonymousClass6D2 {
    public C1503274v A00;
    public final Handler A01 = new Handler();
    public final ExoPlayerErrorFrame A02;
    public final AnonymousClass5NI A03;
    public final boolean A04;

    public final void A00() {
        ExoPlayerErrorFrame exoPlayerErrorFrame = this.A02;
        exoPlayerErrorFrame.setLoadingViewVisibility(8);
        C1503274v r1 = this.A00;
        if (r1 != null) {
            this.A01.removeCallbacks(r1);
        }
        if (exoPlayerErrorFrame.getErrorScreenVisibility() == 0) {
            AnonymousClass5NI r12 = this.A03;
            if (r12 != null) {
                r12.setPlayControlVisibility(0);
            }
            FrameLayout frameLayout = exoPlayerErrorFrame.A02;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        }
    }

    public final void A01() {
        ExoPlayerErrorFrame exoPlayerErrorFrame = this.A02;
        exoPlayerErrorFrame.setLoadingViewVisibility(0);
        C36331k8.A0y(exoPlayerErrorFrame.A02);
    }

    public final void A02(String str) {
        this.A02.setLoadingViewVisibility(0);
        if (this.A04) {
            C1503274v r1 = this.A00;
            if (r1 != null) {
                this.A01.removeCallbacks(r1);
            } else {
                this.A00 = new C1503274v(33, str, this);
            }
            C1503274v r3 = this.A00;
            if (r3 != null) {
                this.A01.postDelayed(r3, 5000);
            }
        }
    }

    public AnonymousClass6D2(ExoPlayerErrorFrame exoPlayerErrorFrame, AnonymousClass5NI r3, boolean z) {
        this.A02 = exoPlayerErrorFrame;
        this.A03 = r3;
        this.A04 = z;
    }
}
