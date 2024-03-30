package X;

import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.R;

/* renamed from: X.3SZ  reason: invalid class name */
public class AnonymousClass3SZ implements C88334Sh {
    public Object A00;
    public final int A01;

    public AnonymousClass3SZ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onError(int i) {
        if (this.A01 != 0) {
            AnonymousClass3P9 A03 = LegacyMessageDialogFragment.A03(new Object[0], R.string.f12nameremoved);
            A03.A05 = R.string.f12nameremoved;
            A03.A0B = new Object[0];
            LegacyMessageDialogFragment A02 = A03.A02();
            C225314u r0 = (C225314u) this.A00;
            C36331k8.A12(A02, r0);
            r0.Bnv();
            return;
        }
        C36321k7.A1U("DeviceConfirmationRegAlertDialogFragment/ Error when sending Do Not Allow IQ with error: ", AnonymousClass000.A0u(), i);
    }
}
