package X;

import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity;
import com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment;

/* renamed from: X.AEu  reason: case insensitive filesystem */
public final class C21264AEu implements B1S {
    public final /* synthetic */ C225314u A00;
    public final /* synthetic */ C23034B1f A01;
    public final /* synthetic */ C194709Qv A02;

    public void BWg(C202059ky r6) {
        AnonymousClass00C.A0D(r6, 0);
        AnonymousClass9RT r0 = this.A02.A00;
        C225314u r2 = this.A00;
        if (r0.A00(r2, r6)) {
            return;
        }
        if (r6.A00 == 10755) {
            C65443Sb.A01(PaymentsUnavailableDialogFragment.A03(), r2.getSupportFragmentManager());
            return;
        }
        C179128jE r4 = (C179128jE) ((C23173B8h) this.A01).A00;
        C39001qm A002 = AnonymousClass3LW.A00(r4);
        A002.A0r(false);
        A002.A0c(R.string.f12nameremoved);
        A002.A0h(new B8F(r4, r4, 12), R.string.f12nameremoved);
        C36341k9.A11(A002);
    }

    public C21264AEu(C225314u r1, C23034B1f b1f, C194709Qv r3) {
        this.A01 = b1f;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void BVz(boolean z) {
        C23173B8h b8h = (C23173B8h) this.A01;
        if (b8h.A01 != 0) {
            IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity = (IndiaUpiDeviceBindStepActivity) b8h.A00;
            AnonymousClass8gK r4 = indiaUpiDeviceBindStepActivity.A0E;
            C175818b6 r3 = indiaUpiDeviceBindStepActivity.A09;
            boolean z2 = indiaUpiDeviceBindStepActivity.A0k;
            r4.A00(r3, new C23191B8z(indiaUpiDeviceBindStepActivity, 2), z2, z2);
            return;
        }
        IndiaUpiBankAccountPickerActivity.A10((IndiaUpiBankAccountPickerActivity) b8h.A00);
    }
}
