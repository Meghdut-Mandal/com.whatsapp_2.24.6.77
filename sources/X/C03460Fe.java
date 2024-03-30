package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.0Fe  reason: invalid class name and case insensitive filesystem */
public class C03460Fe extends C06710Ut {
    public final /* synthetic */ C09460cP A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C03460Fe(Context context, View view, C016307a r12, C09460cP r13) {
        super(context, view, r12, R.attr.f4nameremoved, 0, true);
        this.A00 = r13;
        this.A00 = 8388613;
        C09400cJ r1 = r13.A0M;
        this.A04 = r1;
        C09450cO r0 = this.A03;
        if (r0 != null) {
            r0.BqL(r1);
        }
    }

    public void A02() {
        C09460cP r1 = this.A00;
        C016307a r0 = r1.A08;
        if (r0 != null) {
            r0.close();
        }
        r1.A0F = null;
        super.A02();
    }
}
