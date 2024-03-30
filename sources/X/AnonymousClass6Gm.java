package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6Gm  reason: invalid class name */
public class AnonymousClass6Gm {
    public static boolean A00(C118035nE r12, String str, String str2) {
        JSONObject A1B;
        try {
            JSONObject A1C = C36441kJ.A1C(str2);
            JSONArray jSONArray = A1C.getJSONArray("url");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("regex");
                HashMap A0J = AnonymousClass001.A0J();
                Matcher matcher = Pattern.compile(string, 2).matcher(str);
                if (matcher.find()) {
                    int groupCount = matcher.groupCount();
                    if (groupCount >= 1) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("param");
                        int i2 = 0;
                        while (true) {
                            i2++;
                            A0J.put(jSONArray2.getJSONObject(i2).getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), matcher.group(i2));
                            if (i2 >= groupCount) {
                                break;
                            }
                        }
                    }
                    if (A1C.has("opts")) {
                        A1B = A1C.getJSONObject("opts");
                    } else {
                        A1B = C36441kJ.A1B();
                    }
                    if (jSONObject.has("opts")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("opts");
                        Iterator<String> keys = jSONObject2.keys();
                        while (keys.hasNext()) {
                            String A0C = AnonymousClass001.A0C(keys);
                            A1B.put(A0C, jSONObject2.get(A0C));
                        }
                    }
                    r12.A00 = new JSONObject(A0J);
                    return true;
                }
            }
        } catch (JSONException e) {
            Log.e((Throwable) e);
        }
        return false;
    }
}
