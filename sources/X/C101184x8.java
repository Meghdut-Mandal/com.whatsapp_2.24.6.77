package X;

import android.transition.Transition;
import android.view.View;
import android.view.Window;
import com.whatsapp.R;

/* renamed from: X.4x8  reason: invalid class name and case insensitive filesystem */
public final class C101184x8 extends C135266cQ {
    public final /* synthetic */ Window A00;
    public final /* synthetic */ C225314u A01;
    public final /* synthetic */ AnonymousClass68G A02;

    public void onTransitionEnd(Transition transition) {
        AnonymousClass00C.A0D(transition, 0);
        super.onTransitionEnd(transition);
        C225314u r1 = this.A01;
        View findViewById = r1.findViewById(R.id.picture);
        View findViewById2 = r1.findViewById(R.id.picture_animation);
        findViewById.setVisibility(0);
        findViewById2.setVisibility(4);
        this.A00.setStatusBarColor(-16777216);
    }

    public C101184x8(Window window, C225314u r2, AnonymousClass68G r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = window;
    }
}
