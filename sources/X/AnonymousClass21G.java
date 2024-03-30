package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;

/* renamed from: X.21G  reason: invalid class name */
public class AnonymousClass21G extends C06570Uc {
    public boolean A00;
    public final /* synthetic */ AnonymousClass3BK A01;
    public final /* synthetic */ C47592fB A02;

    public void A03(View view, int i) {
        if (i == 4) {
            AnonymousClass3JQ r2 = this.A02.A0H;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("StatusPlaybackBaseFragment/onPlaybackExit ");
            StatusPlaybackBaseFragment statusPlaybackBaseFragment = r2.A01;
            C36321k7.A1N(statusPlaybackBaseFragment, A0u);
            C88164Rq r1 = (C88164Rq) statusPlaybackBaseFragment.A0h();
            if (r1 != null) {
                StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) r1;
                statusPlaybackActivity.A07 = 1;
                C36351kA.A11(statusPlaybackActivity);
            }
        } else if (i == 3) {
            C47592fB r22 = this.A02;
            if (r22.A01.A0J != 3) {
                r22.A0D().A0I(false);
                this.A00 = false;
                r22.A0H();
            }
        }
    }

    public AnonymousClass21G(AnonymousClass3BK r1, C47592fB r2) {
        this.A02 = r2;
        this.A01 = r1;
    }

    public void A02(View view, float f) {
        int i = (f > 0.95f ? 1 : (f == 0.95f ? 0 : -1));
        C47592fB r2 = this.A02;
        if (i > 0) {
            C47592fB.A03(r2);
        } else {
            C47592fB.A04(r2, false, false);
        }
        View view2 = this.A01.A01;
        float f2 = 1.0f;
        if (f < 0.5f) {
            f2 = 2.0f * f;
        }
        view2.setAlpha(f2);
        C88164Rq r4 = (C88164Rq) r2.A0H.A01.A0h();
        if (r4 != null) {
            AnonymousClass01L r42 = (AnonymousClass01L) r4;
            float f3 = 0.0f;
            if (f >= 0.9f) {
                f3 = 1.0f - ((1.0f - f) * 10.0f);
            }
            View findViewById = r42.findViewById(R.id.video_playback_container_overlay);
            findViewById.setVisibility(0);
            findViewById.setBackgroundColor(((int) (f3 * 255.0f)) << 24);
            r42.findViewById(R.id.video_playback_container).setVisibility(4);
        }
        if (!this.A00) {
            r2.A0D().A0I(true);
            this.A00 = true;
        }
    }
}
