package X;

import android.view.View;

/* renamed from: X.0Gw  reason: invalid class name */
public class AnonymousClass0Gw extends C09770cu {
    public int A00 = 0;
    public boolean A01 = false;
    public final /* synthetic */ AnonymousClass0UU A02;

    public AnonymousClass0Gw(AnonymousClass0UU r2) {
        this.A02 = r2;
    }

    public void BR7(View view) {
        int i = this.A00 + 1;
        this.A00 = i;
        AnonymousClass0UU r2 = this.A02;
        if (i == r2.A04.size()) {
            C17190qs r1 = r2.A02;
            if (r1 != null) {
                r1.BR7((View) null);
            }
            this.A00 = 0;
            this.A01 = false;
            r2.A03 = false;
        }
    }

    public void BR9(View view) {
        if (!this.A01) {
            this.A01 = true;
            C17190qs r1 = this.A02.A02;
            if (r1 != null) {
                r1.BR9((View) null);
            }
        }
    }
}
