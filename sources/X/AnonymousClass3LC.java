package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.3LC  reason: invalid class name */
public abstract class AnonymousClass3LC {
    public View A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Rect A06 = AnonymousClass001.A06();

    public void A06() {
        this.A01 = false;
        StringBuilder A0u = AnonymousClass000.A0u();
        C36331k8.A1O(this, "StatusPlaybackPage/onDestroy page=", A0u);
        C36321k7.A1N(((C47592fB) this).A0H.A01, A0u);
    }

    public void A07() {
        this.A03 = false;
        StringBuilder A0u = AnonymousClass000.A0u();
        C36331k8.A1O(this, "StatusPlaybackPage/onPause page=", A0u);
        C36321k7.A1N(((C47592fB) this).A0H.A01, A0u);
    }

    public void A08() {
        this.A03 = true;
        StringBuilder A0u = AnonymousClass000.A0u();
        C36331k8.A1O(this, "StatusPlaybackPage/onResume page=", A0u);
        C36321k7.A1N(((C47592fB) this).A0H.A01, A0u);
    }

    public void A09() {
        this.A04 = true;
        StringBuilder A0u = AnonymousClass000.A0u();
        C36331k8.A1O(this, "StatusPlaybackPage/onViewActive page=", A0u);
        C36321k7.A1N(((C47592fB) this).A0H.A01, A0u);
    }

    public void A0A() {
        this.A04 = false;
        StringBuilder A0u = AnonymousClass000.A0u();
        C36331k8.A1O(this, "StatusPlaybackPage/onViewInactive page=", A0u);
        C36321k7.A1N(((C47592fB) this).A0H.A01, A0u);
    }

    public void A0B(Rect rect) {
        this.A06.set(rect);
    }

    public void A05() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C36331k8.A1O(this, "StatusPlaybackPage/onConfigurationChanged page=", A0u);
        C36321k7.A1N(((C47592fB) this).A0H.A01, A0u);
    }
}
