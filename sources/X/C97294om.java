package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiQrTabActivity;

/* renamed from: X.4om  reason: invalid class name and case insensitive filesystem */
public class C97294om extends AnonymousClass02H {
    public final /* synthetic */ IndiaUpiQrTabActivity A00;

    public C97294om(IndiaUpiQrTabActivity indiaUpiQrTabActivity) {
        this.A00 = indiaUpiQrTabActivity;
    }

    public void BcB(int i, float f, int i2) {
        IndiaUpiQrTabActivity indiaUpiQrTabActivity = this.A00;
        boolean z = false;
        if (i == (!C36351kA.A1Y(indiaUpiQrTabActivity.A00)) || f != 0.0f) {
            z = true;
        }
        if (indiaUpiQrTabActivity.A0C != z) {
            indiaUpiQrTabActivity.A0C = z;
            if (z) {
                View currentFocus = indiaUpiQrTabActivity.getCurrentFocus();
                if (currentFocus != null) {
                    indiaUpiQrTabActivity.A0C.A01(currentFocus);
                }
                indiaUpiQrTabActivity.A3i();
            }
        }
    }

    public void BcC(int i) {
        IndiaUpiQrTabActivity indiaUpiQrTabActivity = this.A00;
        indiaUpiQrTabActivity.A1o();
        C95294kW r4 = indiaUpiQrTabActivity.A08;
        for (int i2 = 0; i2 < r4.A00; i2++) {
            ((AnonymousClass35O) r4.A01.get(i2)).A00.setSelected(AnonymousClass000.A1S(i2, i));
        }
        if (i == 0) {
            View currentFocus = indiaUpiQrTabActivity.getCurrentFocus();
            if (currentFocus != null) {
                indiaUpiQrTabActivity.A0C.A01(currentFocus);
            }
            if (!indiaUpiQrTabActivity.A0C) {
                indiaUpiQrTabActivity.A0C = true;
                indiaUpiQrTabActivity.A3i();
            }
            if (!indiaUpiQrTabActivity.A07.A09()) {
                indiaUpiQrTabActivity.A05.A06(R.string.f12nameremoved, 1);
            }
        } else if (i == 1) {
            indiaUpiQrTabActivity.A09.A1a();
        }
    }
}
