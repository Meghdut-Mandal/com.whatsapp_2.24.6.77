package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.4Zx  reason: invalid class name and case insensitive filesystem */
public class C90314Zx implements C88824Ue {
    public Object A00;
    public final int A01;

    public C90314Zx(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Bdr() {
        if (this.A01 == 0) {
            C70803fk r1 = (C70803fk) this.A00;
            C70803fk.A17(r1, 0);
            C70803fk.A0n(r1);
            r1.A4l.A08();
        }
    }

    public boolean Bds(View view, MotionEvent motionEvent) {
        if (this.A01 != 0) {
            return false;
        }
        C70803fk r1 = (C70803fk) this.A00;
        C70803fk.A17(r1, 0);
        return r1.A4l.A0A(motionEvent);
    }
}
