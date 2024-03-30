package X;

import com.whatsapp.status.playback.widget.StatusPlaybackProgressView;

/* renamed from: X.3G7  reason: invalid class name */
public final class AnonymousClass3G7 {
    public final /* synthetic */ C47582fA A00;
    public final /* synthetic */ C47592fB A01;

    public AnonymousClass3G7(C47582fA r1) {
        this.A00 = r1;
        this.A01 = r1;
    }

    public void A00() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C36331k8.A1O(this, "playbackPage/onPlaybackContentFinished page=", A0u);
        C47592fB r3 = this.A01;
        C36321k7.A1N(r3.A0H.A01, A0u);
        StatusPlaybackProgressView statusPlaybackProgressView = r3.A03;
        C87294Of r1 = r3.A0I;
        AnonymousClass00C.A0D(r1, 0);
        if (statusPlaybackProgressView.A00 == r1) {
            statusPlaybackProgressView.A00 = null;
        }
        statusPlaybackProgressView.invalidate();
        if (!r3.A05) {
            C81173wa.A00(r3.A0A, this, 43);
        }
    }

    public void A01() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C36331k8.A1O(this, "playbackPage/onPlaybackContentStarted page=", A0u);
        C47592fB r1 = this.A01;
        C36321k7.A1N(r1.A0H.A01, A0u);
        r1.A0F();
    }
}
