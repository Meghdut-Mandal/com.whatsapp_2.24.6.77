package X;

import android.transition.Transition;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.4x7  reason: invalid class name and case insensitive filesystem */
public final class C101174x7 extends C135266cQ {
    public final /* synthetic */ C225314u A00;
    public final /* synthetic */ AnonymousClass68G A01;

    public void onTransitionStart(Transition transition) {
        AnonymousClass00C.A0D(transition, 0);
        super.onTransitionStart(transition);
        C225314u r1 = this.A00;
        View findViewById = r1.findViewById(R.id.picture);
        View findViewById2 = r1.findViewById(R.id.picture_animation);
        findViewById.setVisibility(4);
        findViewById2.setVisibility(0);
    }

    public C101174x7(C225314u r1, AnonymousClass68G r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
