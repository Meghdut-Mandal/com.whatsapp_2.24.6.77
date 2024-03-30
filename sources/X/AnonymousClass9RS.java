package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.9RS  reason: invalid class name */
public class AnonymousClass9RS {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C196129Xv A01;
    public final /* synthetic */ C22952Az4 A02;

    public AnonymousClass9RS(Activity activity, C196129Xv r2, C22952Az4 az4) {
        this.A01 = r2;
        this.A00 = activity;
        this.A02 = az4;
    }

    public void A00(C202059ky r7, boolean z) {
        String A0e;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PAY: IndiaUpiBlockListManager/on-error blocked: ");
        A0u.append(z);
        C36321k7.A1J(r7, " error: ", A0u);
        C196129Xv r2 = this.A01;
        AnonymousClass17Y r5 = r2.A01;
        Activity activity = this.A00;
        r5.A09((C225014r) activity);
        if (!activity.isFinishing()) {
            Context context = r2.A03.A00;
            if (z) {
                A0e = context.getString(R.string.f12nameremoved);
            } else {
                A0e = C36341k9.A0e(context, AnonymousClass001.A0L(), R.string.f12nameremoved, 0, R.string.f12nameremoved);
            }
            r5.A0K(A0e, 0);
        }
        this.A02.Bf8(r7);
    }
}
