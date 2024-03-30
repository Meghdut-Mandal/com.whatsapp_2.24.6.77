package X;

import android.net.Network;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;
import com.whatsapp.util.Log;

/* renamed from: X.3qJ  reason: invalid class name and case insensitive filesystem */
public class C77323qJ implements AnonymousClass4TZ {
    public final /* synthetic */ VerifyPhoneNumber A00;

    public C77323qJ(VerifyPhoneNumber verifyPhoneNumber) {
        this.A00 = verifyPhoneNumber;
    }

    public void BRf(Network network) {
        Log.i("VerifyPhoneNumber/requestSilentAuth/CellularNetworkAvailabilityCallback available");
        VerifyPhoneNumber.A0o(network, this.A00);
    }

    public void Bjl() {
        Log.i("VerifyPhoneNumber/requestSilentAuth/CellularNetworkAvailabilityCallback unavailable");
        VerifyPhoneNumber verifyPhoneNumber = this.A00;
        verifyPhoneNumber.A0z.A0A(VerifyPhoneNumber.A0J(verifyPhoneNumber), "ipification_coverage_failure", "cellular_not_available");
        VerifyPhoneNumber.A1E(verifyPhoneNumber, verifyPhoneNumber.A04);
    }
}
