package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.2ID  reason: invalid class name */
public abstract class AnonymousClass2ID extends AnonymousClass2IR {
    public int A2D(int i) {
        int A01;
        Context context = getContext();
        Context context2 = getContext();
        if (i == 0) {
            A01 = C224514j.A00(context2, R.attr.f4nameremoved, R.color.f6nameremoved);
        } else {
            A01 = C224314h.A01(context2, R.attr.f4nameremoved);
        }
        return AnonymousClass00F.A00(context, A01);
    }

    public void A2E(AnonymousClass1RJ r4, int i) {
        int A2D = A2D(i);
        StringBuilder A0u = AnonymousClass000.A0u();
        AnonymousClass000.A1C(this, A0u);
        r4.A08(new C79383td(A2D), AnonymousClass000.A0q("#updateProgressBarColor", A0u));
    }

    public AnonymousClass2ID(Context context, C89004Uw r2, AnonymousClass3T1 r3) {
        super(context, r2, r3);
    }
}
