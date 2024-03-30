package X;

import com.whatsapp.util.Log;

/* renamed from: X.ADp  reason: case insensitive filesystem */
public class C21233ADp implements B2W {
    public void BYW() {
        C165577te.A1M("IndiaUpiDeviceBindActivity", "onGetChallengeFailure");
    }

    public void BYc(C202059ky r3, boolean z) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("onToken success: ");
        A0u.append(z);
        Log.i(C24611Dc.A01("IndiaUpiDeviceBindActivity", AnonymousClass000.A0l(r3, " error: ", A0u)));
    }

    public void BeN(boolean z) {
        Log.i(C24611Dc.A01("IndiaUpiDeviceBindActivity", C36371kC.A0z("/onRegisterApp registered: ", AnonymousClass000.A0u(), z)));
    }
}
