package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3LO  reason: invalid class name */
public abstract class AnonymousClass3LO {
    public static final String A00(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C80153uw r3 = (C80153uw) it.next();
            JSONObject A1B = C36441kJ.A1B();
            A1B.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r3.A01);
            A1B.put("description", r3.A00);
            jSONArray.put(A1B);
        }
        return C36381kD.A0y(jSONArray);
    }

    public static final ArrayList A01(String str) {
        ArrayList A0I = AnonymousClass001.A0I();
        if (str != null) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    AnonymousClass00C.A0B(jSONObject);
                    AnonymousClass00C.A0D(jSONObject, 1);
                    A0I.add(new C80153uw(C36411kG.A10(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jSONObject), C36411kG.A10("description", jSONObject)));
                }
            } catch (JSONException e) {
                Log.e("BotCommand/createCommands", e);
            }
        }
        return A0I;
    }
}
