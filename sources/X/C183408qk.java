package X;

import com.whatsapp.payments.ui.IndiaUpiChangePinActivity;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8qk  reason: invalid class name and case insensitive filesystem */
public class C183408qk extends C132446Tt {
    public final /* synthetic */ IndiaUpiChangePinActivity A00;

    public C183408qk(IndiaUpiChangePinActivity indiaUpiChangePinActivity) {
        this.A00 = indiaUpiChangePinActivity;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return C165577te.A0o(this.A00.A0P);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C207249un r1;
        List list = (List) obj;
        if (list != null && list.size() == 1) {
            IndiaUpiChangePinActivity indiaUpiChangePinActivity = this.A00;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    r1 = null;
                    break;
                }
                r1 = C165607th.A0S(it);
                if (r1.A09() == 2) {
                    break;
                }
            }
            indiaUpiChangePinActivity.A02 = (C175748az) r1;
        }
        IndiaUpiChangePinActivity indiaUpiChangePinActivity2 = this.A00;
        indiaUpiChangePinActivity2.A04.A00("pin-entry-ui");
        if (indiaUpiChangePinActivity2.A02 != null) {
            indiaUpiChangePinActivity2.A08.A02();
            return;
        }
        indiaUpiChangePinActivity2.A05.A06("could not find bank account; showErrorAndFinish");
        indiaUpiChangePinActivity2.A4D();
    }
}
