package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.0Fd  reason: invalid class name */
public class AnonymousClass0Fd extends C06710Ut {
    public final /* synthetic */ C09460cP A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0Fd(Context context, View view, AnonymousClass0FZ r12, C09460cP r13) {
        super(context, view, r12, R.attr.f4nameremoved, 0, false);
        this.A00 = r13;
        if ((((C018707z) r12.getItem()).A02 & 32) != 32) {
            View view2 = r13.A0E;
            this.A01 = view2 == null ? (View) r13.A0A : view2;
        }
        C09400cJ r1 = r13.A0M;
        this.A04 = r1;
        C09450cO r0 = this.A03;
        if (r0 != null) {
            r0.BqL(r1);
        }
    }

    public void A02() {
        C09460cP r1 = this.A00;
        r1.A0B = null;
        r1.A00 = 0;
        super.A02();
    }
}
