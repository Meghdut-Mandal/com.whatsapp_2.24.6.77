package X;

import android.net.Network;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;
import com.whatsapp.util.Log;

/* renamed from: X.3qK  reason: invalid class name and case insensitive filesystem */
public class C77333qK implements AnonymousClass4TZ {
    public final /* synthetic */ VerifyPhoneNumber A00;
    public final /* synthetic */ String A01;

    public C77333qK(VerifyPhoneNumber verifyPhoneNumber, String str) {
        this.A00 = verifyPhoneNumber;
        this.A01 = str;
    }

    public void BRf(Network network) {
        Log.i("VerifyPhoneNumber/onSilentAuthCodeSent/CellularNetworkAvailabilityCallback available");
        VerifyPhoneNumber verifyPhoneNumber = this.A00;
        C36421kH.A1G(verifyPhoneNumber.A04, verifyPhoneNumber, network, this.A01, 15);
    }

    public void Bjl() {
        Log.i("VerifyPhoneNumber/onSilentAuthCodeSent/CellularNetworkAvailabilityCallback unavailable");
        VerifyPhoneNumber verifyPhoneNumber = this.A00;
        verifyPhoneNumber.A0z.A0A(VerifyPhoneNumber.A0J(verifyPhoneNumber), "ipification_auth_failure", "cellular_not_available");
        VerifyPhoneNumber.A1E(verifyPhoneNumber, verifyPhoneNumber.A04);
    }
}
