package X;

import com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment;
import com.whatsapp.util.Log;
import java.util.AbstractMap;
import java.util.HashMap;

/* renamed from: X.AEv  reason: case insensitive filesystem */
public class C21265AEv implements B1S {
    public final /* synthetic */ AnonymousClass6C8 A00;
    public final /* synthetic */ C179158jJ A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C21265AEv(AnonymousClass6C8 r1, C179158jJ r2, String str, String str2) {
        this.A01 = r2;
        this.A03 = str;
        this.A00 = r1;
        this.A02 = str2;
    }

    public void BVz(boolean z) {
        String A0l;
        C179158jJ r3 = this.A01;
        if (!r3.A0D.A0E(2928) || !"p2m_context".equals(this.A03)) {
            this.A00.A00("on_success");
            return;
        }
        HashMap A0J = AnonymousClass001.A0J();
        A0J.put("account_compliance_status", "COMPLETED");
        AbstractMap A0h = C179158jJ.A0h(r3);
        if (A0h == null || (A0l = C90504aG.A0l("fds_resource_id", A0h)) == null) {
            Log.e("PayBloksActivity/onDobCheckComplete resource id is null");
            return;
        }
        r3.A3l(this.A00);
        r3.A3n(A0l, this.A02, A0J);
    }

    public void BWg(C202059ky r5) {
        C179158jJ r3 = this.A01;
        if (r3.A0I.A00(r3, r5)) {
            this.A00.A00("on_failure");
            return;
        }
        int i = r5.A00;
        if (i == 10755) {
            this.A00.A00("on_failure");
            r3.Btm(PaymentsUnavailableDialogFragment.A03());
            return;
        }
        HashMap A0J = AnonymousClass001.A0J();
        C165597tg.A1M(A0J, i);
        this.A00.A01("on_exception", A0J);
    }
}
