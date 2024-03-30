package X;

import androidx.fragment.app.DialogFragment;
import com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.95w  reason: invalid class name and case insensitive filesystem */
public class C1898595w implements C22935Ayl {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C1898595w(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public final void BR0(List list) {
        int i = this.A03;
        Object obj = this.A00;
        switch (i) {
            case 0:
                ((AnonymousClass8g5) obj).A0G.A00((C175798b4) this.A01, (C202059ky) null, (ArrayList) this.A02, false, false);
                return;
            case 1:
                ((AnonymousClass8g2) obj).A09.A00((C175798b4) this.A01, (C202059ky) null, (ArrayList) this.A02, false);
                return;
            default:
                DialogFragment dialogFragment = (DialogFragment) this.A02;
                BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = (BrazilConfirmReceivePaymentFragment) ((C23201B9j) obj).A00;
                brazilConfirmReceivePaymentFragment.A00.A02();
                brazilConfirmReceivePaymentFragment.A1C(brazilConfirmReceivePaymentFragment.A0G.A02(brazilConfirmReceivePaymentFragment.A0h(), (C175798b4) this.A01));
                if (dialogFragment != null) {
                    dialogFragment.A1b();
                    return;
                }
                return;
        }
    }
}
