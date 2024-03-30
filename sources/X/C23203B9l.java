package X;

import com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment;

/* renamed from: X.B9l  reason: case insensitive filesystem */
public class C23203B9l implements C22977AzT {
    public Object A00;
    public final int A01;

    public C23203B9l(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BcQ(int i) {
        C193639Mg r0;
        if (this.A01 != 0) {
            HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment = (HybridPaymentMethodPickerFragment) this.A00;
            AnonymousClass9FW r1 = (AnonymousClass9FW) hybridPaymentMethodPickerFragment.A0O.get(i);
            if ((r1 instanceof C180218lO) && (r0 = hybridPaymentMethodPickerFragment.A0C) != null) {
                C207249un r2 = ((C180218lO) r1).A01;
                C179068j0 r4 = r0.A02;
                r4.BOo(r4.A0S.A05(r2, (C131606Ps) null), C36361kB.A0i(), 169, "payment_method_prompt");
                return;
            }
            return;
        }
        C168117zj r12 = (C168117zj) this.A00;
        int i2 = r12.A00;
        r12.A00 = i;
        r12.A07(i2);
        r12.A04.BcQ(i);
    }
}
