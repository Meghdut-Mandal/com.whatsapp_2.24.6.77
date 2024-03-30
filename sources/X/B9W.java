package X;

import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment;

public class B9W implements C22982AzY {
    public Object A00;
    public Object A01;
    public final int A02;

    public B9W(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BWg(C202059ky r4) {
        int i = this.A02;
        C179048iy r1 = (C179048iy) this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                C36431kI.A1N(obj);
                break;
            case 1:
                WaButtonWithLoader waButtonWithLoader = ((HybridPaymentMethodPickerFragment) obj).A01;
                if (waButtonWithLoader != null) {
                    waButtonWithLoader.A01();
                    break;
                }
                break;
            default:
                if (obj == null) {
                    r1.A4p(false);
                    break;
                }
                break;
        }
        r1.BO6(r1.A4q(r4));
    }
}
