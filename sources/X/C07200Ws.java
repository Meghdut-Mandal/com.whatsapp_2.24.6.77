package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.0Ws  reason: invalid class name and case insensitive filesystem */
public class C07200Ws {
    public C16610pn A00;
    public C16620po A01;
    public final Context A02;
    public final C016307a A03;
    public final C06710Ut A04;
    public final View A05;

    public void A00() {
        if (!this.A04.A03()) {
            throw AnonymousClass001.A09("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public C07200Ws(Context context, View view, int i, int i2, int i3) {
        this.A02 = context;
        this.A05 = view;
        C016307a r5 = new C016307a(context);
        this.A03 = r5;
        r5.A0C(new C09360cF(this));
        C06710Ut r2 = new C06710Ut(context, view, r5, i2, i3, false);
        this.A04 = r2;
        r2.A00 = i;
        r2.A02 = new C18460tC(this, 1);
    }
}
