package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.6qV  reason: invalid class name and case insensitive filesystem */
public final class C143416qV implements C159267j5 {
    public static final C143416qV A00 = new C143416qV();

    public /* bridge */ /* synthetic */ Object B7i(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        String optString2 = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        List A002 = C129396Gt.A00(C143406qU.A00, jSONObject.optJSONArray("bots"));
        if (optString == null || optString2 == null) {
            return null;
        }
        return new AnonymousClass6BC(optString, optString2, A002);
    }

    public /* bridge */ /* synthetic */ JSONObject Bvo(Object obj) {
        AnonymousClass6BC r4 = (AnonymousClass6BC) obj;
        JSONObject A0q = C90464aC.A0q(r4);
        A0q.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r4.A00);
        A0q.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r4.A01);
        A0q.put("bots", C129396Gt.A01(C143406qU.A00, r4.A02));
        return A0q;
    }
}
