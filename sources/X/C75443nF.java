package X;

import com.whatsapp.infra.graphql.generated.autoconf.GetAutoConfConfidenceChallengeResponseImpl;
import com.whatsapp.infra.graphql.generated.autoconf.ValidateVerifierConfidenceMutationImpl$Builder;
import com.whatsapp.infra.graphql.generated.autoconf.ValidateVerifierConfidenceResponseImpl;
import com.whatsapp.util.Log;
import org.json.JSONArray;

/* renamed from: X.3nF  reason: invalid class name and case insensitive filesystem */
public final class C75443nF implements B6H {
    public AnonymousClass37L A00;
    public final C27591Ow A01;

    public void Bey(C177278dX r6) {
        AnonymousClass00C.A0D(r6, 0);
        JSONArray jSONArray = r6.A01;
        int i = 405;
        if (jSONArray.length() > 0) {
            Log.i("RequestConfidenceChallengeManager/onResponse/error");
            if (jSONArray.length() > 1) {
                C62963If A002 = C55242uJ.A00(jSONArray);
                i = A002.A00;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("RequestConfidenceChallengeManager/onResponse/errorCode=");
                A0u.append(i);
                A0u.append("/errorDescription=");
                C36321k7.A1Z(A0u, A002.A01);
            }
        } else {
            String A10 = C36411kG.A10("auth_challenge", r6.A00.A03(GetAutoConfConfidenceChallengeResponseImpl.Xwa2AutoconfRequestConfidenceChallenge.class, "xwa2_autoconf_request_confidence_challenge").A00);
            if (!AnonymousClass098.A06(A10)) {
                Log.i("RequestConfidenceChallengeManager/onResponse/valid authChallenge");
                AnonymousClass37L r2 = this.A00;
                if (r2 != null) {
                    Log.i("AutoConfConfidencePingManager/onRequestChallengeSuccess");
                    byte[] A02 = r2.A02.A02(A10);
                    if (A02 == null) {
                        Log.e("AutoConfConfidencePingManager/onRequestChallengeSuccess/failed to query authResponse from FEO2 client");
                        return;
                    }
                    Log.i("AutoConfConfidencePingManager/onRequestChallengeSuccess/successfully queried authResponse, validate verifier");
                    C75453nG r4 = new C75453nG(r2.A01);
                    String A13 = C36441kJ.A13(A02);
                    AnonymousClass00C.A08(A13);
                    r4.A00 = r2;
                    AnonymousClass9VA r3 = new ValidateVerifierConfidenceMutationImpl$Builder().A00;
                    r3.A02("authResponse", A13);
                    r4.A01.A00(new AnonymousClass9JF(r3, ValidateVerifierConfidenceResponseImpl.class, "ValidateVerifierConfidence"), r4).A00();
                    return;
                }
                throw C36331k8.A0d("callback");
            }
            Log.i("RequestConfidenceChallengeManager/onResponse/blank authChallenge");
        }
        AnonymousClass37L r22 = this.A00;
        if (r22 == null) {
            throw C36331k8.A0d("callback");
        } else if (i != 405) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("AutoConfConfidencePingManager/onRequestChallengeFailure/errorCode=");
            A0u2.append(i);
            C36321k7.A1Z(A0u2, "/stop confidence ping");
            C36331k8.A0w(C36331k8.A05(r22.A00), "resend_confidence_ping", false);
        }
    }

    public C75443nF(C27591Ow r1) {
        this.A01 = r1;
    }

    public void BXQ(Throwable th) {
        C36321k7.A1J(th, "RequestConfidenceChallengeManager/onFailure/MEX error: ", C36341k9.A0i(th));
    }
}
