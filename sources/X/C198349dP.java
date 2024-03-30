package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9dP  reason: invalid class name and case insensitive filesystem */
public final class C198349dP {
    public final JSONArray A00(List list) {
        JSONArray A0u = C90524aI.A0u();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C206519tX r0 = (C206519tX) it.next();
                JSONObject A0q = C90464aC.A0q(r0);
                A0q.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r0.A00);
                A0u.put(A0q);
            }
            return A0u;
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiTransactionOfferData/toJsonArray threw: ", e);
            return A0u;
        }
    }
}
