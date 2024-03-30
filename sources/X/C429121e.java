package X;

import android.view.animation.Animation;

/* renamed from: X.21e  reason: invalid class name and case insensitive filesystem */
public class C429121e extends C67243Zb {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C89904Yi A01;

    public C429121e(C89904Yi r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public void onAnimationEnd(Animation animation) {
        AnonymousClass3HK r2 = (AnonymousClass3HK) this.A01.A01;
        r2.A02.setTranscriptMode(this.A00);
        r2.A0C = false;
    }

    public void onAnimationStart(Animation animation) {
        ((AnonymousClass3HK) this.A01.A01).A02.setTranscriptMode(2);
    }
}
