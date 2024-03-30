package X;

import com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment;
import java.util.HashMap;

/* renamed from: X.AEy  reason: case insensitive filesystem */
public class C21268AEy implements B1T {
    public final /* synthetic */ AnonymousClass6C8 A00;
    public final /* synthetic */ C179158jJ A01;

    public C21268AEy(AnonymousClass6C8 r1, C179158jJ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BWg(C202059ky r4) {
        int i = r4.A00;
        if (i == 10756) {
            this.A00.A00("on_failure");
        } else if (i == 10755) {
            this.A01.Btm(PaymentsUnavailableDialogFragment.A03());
        } else {
            HashMap A0J = AnonymousClass001.A0J();
            C165597tg.A1M(A0J, i);
            this.A00.A01("on_exception", A0J);
        }
    }

    public void BbK(boolean z) {
        this.A00.A00("on_success");
    }
}
