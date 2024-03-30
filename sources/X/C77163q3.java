package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.3q3  reason: invalid class name and case insensitive filesystem */
public class C77163q3 implements C161247mR {
    public final C29501Ww A00;

    public void BJc(String str, Map map) {
        C29501Ww r1 = this.A00;
        String A1A = C36431kI.A1A("registration_code", map);
        Log.i("RegistrationManager/handleRegistrationVerificationNotification");
        if (A1A == null) {
            Log.i("RegistrationManager/handleRegistrationVerificationNotification/registrationCode is null");
        } else {
            C36341k9.A0x(C19420v0.A00(r1.A0F), "registration_push_notif_code", A1A);
        }
    }

    public boolean BtD(C1267065d r2, Long l, String str) {
        return "RegistrationVerification".equalsIgnoreCase(str);
    }

    public C77163q3(C29501Ww r1) {
        this.A00 = r1;
    }
}
