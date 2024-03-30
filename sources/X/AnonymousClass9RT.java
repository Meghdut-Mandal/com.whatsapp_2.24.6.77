package X;

import com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment;

/* renamed from: X.9RT  reason: invalid class name */
public class AnonymousClass9RT {
    public final AnonymousClass9F3 A00;
    public final AnonymousClass1M4 A01;
    public final C24611Dc A02 = C165607th.A0c("PaymentsDobManager", "infra");

    public boolean A00(C225314u r4, C202059ky r5) {
        C165567td.A16(this.A02, r5, "maybeHandleUnderageError: ", AnonymousClass000.A0u());
        if (r5.A00 != 2896001) {
            return false;
        }
        r4.Btm(PaymentsUnavailableDialogFragment.A05());
        return true;
    }

    public AnonymousClass9RT(AnonymousClass9F3 r3, AnonymousClass1M4 r4) {
        this.A01 = r4;
        this.A00 = r3;
    }
}
