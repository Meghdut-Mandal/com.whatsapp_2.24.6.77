package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.3ez  reason: invalid class name and case insensitive filesystem */
public class C70333ez implements C88824Ue {
    public final /* synthetic */ C70803fk A00;

    public C70333ez(C70803fk r1) {
        this.A00 = r1;
    }

    public void Bdr() {
        C70803fk r1 = this.A00;
        C70803fk.A17(r1, 1);
        C70803fk.A0n(r1);
        r1.A4l.A08();
    }

    public boolean Bds(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            C39501sW r0 = this.A00.A0m;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            C34831hi r1 = r0.A00;
            r1.A04();
            r1.A0D(new C64823Po(x, y));
        }
        AnonymousClass3UB r02 = this.A00.A4l;
        if (r02 == null) {
            return false;
        }
        return r02.A0A(motionEvent);
    }
}
