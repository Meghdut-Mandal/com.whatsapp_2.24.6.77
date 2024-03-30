package X;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6EQ  reason: invalid class name */
public class AnonymousClass6EQ {
    public final SharedPreferences A00;
    public final String A01;

    public void A01(String str) {
        C36341k9.A0u(this.A00.edit(), C36381kD.A10(AnonymousClass000.A0v(this.A01), str.hashCode()));
    }

    public void A02(String str, JSONObject jSONObject) {
        try {
            jSONObject.put("path", str);
        } catch (JSONException unused) {
        }
        C36341k9.A0x(this.A00.edit(), C36381kD.A10(AnonymousClass000.A0v(this.A01), str.hashCode()), jSONObject.toString());
    }

    public AnonymousClass6EQ(SharedPreferences sharedPreferences, String str) {
        this.A01 = AnonymousClass000.A0q("/", AnonymousClass000.A0v(str));
        this.A00 = sharedPreferences;
    }

    public HashMap A00() {
        JSONObject jSONObject;
        HashMap A0J = AnonymousClass001.A0J();
        Iterator A0y = AnonymousClass000.A0y(this.A00.getAll());
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            if (C90494aF.A0f(A11).startsWith(this.A01)) {
                try {
                    jSONObject = C36441kJ.A1C((String) A11.getValue());
                } catch (JSONException unused) {
                    jSONObject = C36441kJ.A1B();
                }
                if (jSONObject.length() > 0) {
                    String optString = jSONObject.optString("path", "");
                    if (!optString.isEmpty()) {
                        A0J.put(optString, jSONObject);
                    }
                }
            }
        }
        return A0J;
    }
}
