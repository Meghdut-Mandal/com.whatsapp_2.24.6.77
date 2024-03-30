package X;

import android.view.View;
import com.whatsapp.R;

/* renamed from: X.60f  reason: invalid class name and case insensitive filesystem */
public final class C1255260f {
    public C99304t3 A00;

    public final void A00(View view, int i) {
        AnonymousClass00C.A0D(view, 0);
        int i2 = R.string.f12nameremoved;
        if (i == 2) {
            i2 = R.string.f12nameremoved;
        }
        String A0s = C36381kD.A0s(view.getResources(), i2);
        C99304t3 r1 = this.A00;
        if (r1 != null) {
            r1.A0R(3);
        }
        C99304t3 A02 = C99304t3.A02(view, A0s, -1);
        A02.A0J.setElevation(1000.0f);
        A02.A0V(new C162617os(this, 0));
        this.A00 = A02;
        A02.A0P();
    }
}
