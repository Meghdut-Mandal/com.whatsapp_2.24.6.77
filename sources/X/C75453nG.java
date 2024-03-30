package X;

import com.whatsapp.util.Log;
import org.json.JSONArray;

/* renamed from: X.3nG  reason: invalid class name and case insensitive filesystem */
public final class C75453nG implements B6H {
    public AnonymousClass37L A00;
    public final C27591Ow A01;

    public void Bey(C177278dX r4) {
        AnonymousClass00C.A0D(r4, 0);
        JSONArray jSONArray = r4.A01;
        if (jSONArray.length() > 0) {
            Log.i("ValidateVerifierConfidenceManager/onResponse/error");
            if (jSONArray.length() > 1) {
                C62963If A002 = C55242uJ.A00(jSONArray);
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("ValidateVerifierConfidenceManager/onResponse/errorCode=");
                A0u.append(A002.A00);
                A0u.append("/errorDescription=");
                C36321k7.A1Z(A0u, A002.A01);
            }
        } else if (r4.A00.A00.optBoolean("xwa2_autoconf_validate_confidence")) {
            Log.i("ValidateVerifierConfidenceManager/onResponse/success");
            return;
        } else {
            Log.i("ValidateVerifierConfidenceManager/onResponse/failure");
        }
        AnonymousClass37L r1 = this.A00;
        if (r1 != null) {
            Log.e("AutoConfConfidencePingManager/onValidateVerifierFailure/stop confidence ping");
            C36331k8.A0w(C36331k8.A05(r1.A00), "resend_confidence_ping", false);
            return;
        }
        throw C36331k8.A0d("callback");
    }

    public C75453nG(C27591Ow r1) {
        this.A01 = r1;
    }

    public void BXQ(Throwable th) {
        C36321k7.A1J(th, "ValidateVerifierConfidenceManager/onFailure/MEX error: ", C36341k9.A0i(th));
    }
}
