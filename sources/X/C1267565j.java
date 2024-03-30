package X;

import android.view.View;

/* renamed from: X.65j  reason: invalid class name and case insensitive filesystem */
public class C1267565j {
    public final /* synthetic */ C90704aa A00;

    public C1267565j(C90704aa r1) {
        this.A00 = r1;
    }

    public void A01(AnonymousClass7eE r3) {
        C90704aa r1 = this.A00;
        r1.A08.A05.A08();
        if (r3 == C90704aa.A0I) {
            if (!r1.A0C) {
                r1.A04(C023109s.A00);
            }
            r1.A03();
        }
    }

    public void A00(View view, int i) {
        int height;
        float f;
        int top = view.getTop();
        C90704aa r3 = this.A00;
        if (r3.A0E) {
            height = i;
        } else {
            height = view.getHeight();
        }
        boolean z = r3.A09;
        if (!z || height == 0) {
            f = 1.0f;
        } else {
            f = ((float) (i - top)) / ((float) height);
        }
        r3.A00 = f;
        if (z) {
            C90704aa.A01(r3, f);
        }
    }
}
