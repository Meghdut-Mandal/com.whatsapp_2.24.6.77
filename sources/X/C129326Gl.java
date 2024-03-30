package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6Gl  reason: invalid class name and case insensitive filesystem */
public abstract class C129326Gl {
    public static final String A00(List list) {
        JSONArray A0u = C90524aI.A0u();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass69W r3 = (AnonymousClass69W) it.next();
            JSONObject A1B = C36441kJ.A1B();
            A1B.put("text", r3.A01);
            A1B.put("emoji", r3.A00);
            A0u.put(A1B);
        }
        return C36381kD.A0y(A0u);
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
                    A0I.add(new AnonymousClass69W(C36411kG.A10("text", jSONObject), C36411kG.A10("emoji", jSONObject)));
                }
            } catch (JSONException e) {
                Log.e("BotProfile/createPrompts", e);
            }
        }
        return A0I;
    }
}
