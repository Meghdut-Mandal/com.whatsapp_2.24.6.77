package X;

import android.view.View;

/* renamed from: X.4k7  reason: invalid class name and case insensitive filesystem */
public class C95144k7 extends C011705b {
    public final /* synthetic */ C118915ow[] A00;

    public C95144k7(C118915ow[] r1) {
        this.A00 = r1;
    }

    public void A0k(View view, C07650Ys r9) {
        String string;
        super.A0k(view, r9);
        for (C118915ow r3 : this.A00) {
            if (r3 instanceof C101054ws) {
                string = ((C101054ws) r3).A00;
            } else if (r3.A01 != 0) {
                string = view.getContext().getString(r3.A01);
            }
            if (string != null) {
                r9.A0A(new AnonymousClass0Yd(r3.A00, (CharSequence) string));
            }
        }
    }
}
