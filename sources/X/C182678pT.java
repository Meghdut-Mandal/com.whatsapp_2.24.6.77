package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.8pT  reason: invalid class name and case insensitive filesystem */
public class C182678pT extends C182588pK {
    public C32731e6 A00;
    public AnonymousClass1DU A01;
    public AnonymousClass2dT A02;
    public boolean A03;

    public void A0A(AnonymousClass2bV r7, List list) {
        super.A09(r7, list);
        Context context = getContext();
        AnonymousClass1DU r2 = this.A01;
        if (C64373Ns.A00(context, this.A00, r2, r7, 0, false).A00.A01 != null) {
            this.A02.setVisibility(0);
            this.A02.setMessage(r7, list);
            return;
        }
        this.A02.setVisibility(8);
    }

    public C182678pT(Context context, C33301f4 r2) {
        super(context, r2);
        A04();
    }
}
