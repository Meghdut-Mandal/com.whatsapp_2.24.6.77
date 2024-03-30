package X;

import android.view.View;
import java.util.List;

/* renamed from: X.1re  reason: invalid class name and case insensitive filesystem */
public final class C39291re extends C06650Um implements C010904r {
    public View A00;
    public AnonymousClass09H A01;
    public boolean A02;

    public C39291re() {
        super(1);
    }

    public AnonymousClass09H A01(AnonymousClass09H r1, List list) {
        return r1;
    }

    public void A03(C07460Xt r3) {
        View view;
        if (this.A02 && (r3.A00.A06() & 8) != 0) {
            this.A02 = false;
            AnonymousClass09H r1 = this.A01;
            if (r1 != null && (view = this.A00) != null) {
                C012005e.A0A(view, r1);
            }
        }
    }

    public void A02(C07460Xt r2) {
        if ((r2.A00.A06() & 8) != 0) {
            this.A02 = true;
        }
    }

    public AnonymousClass09H BRE(View view, AnonymousClass09H r6) {
        C36321k7.A0w(view, r6);
        this.A00 = view;
        this.A01 = r6;
        int i = 7;
        if (!this.A02) {
            i = 15;
        }
        AnonymousClass09T A0C = r6.A00.A0C(i);
        AnonymousClass00C.A08(A0C);
        view.setPadding(A0C.A01, A0C.A03, A0C.A02, A0C.A00);
        AnonymousClass09H r0 = AnonymousClass09H.A01;
        AnonymousClass00C.A09(r0);
        return r0;
    }
}
