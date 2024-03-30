package X;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6Ps  reason: invalid class name and case insensitive filesystem */
public class C131606Ps {
    public final String A00;
    public final JSONObject A01;

    public C131606Ps(C131606Ps... r2) {
        this((String) null, r2);
    }

    public void A01(C131606Ps r6) {
        try {
            String str = r6.A00;
            if (str == null) {
                JSONObject jSONObject = r6.A01;
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String A0C = AnonymousClass001.A0C(keys);
                    this.A01.put(A0C, jSONObject.get(A0C));
                }
                return;
            }
            this.A01.put(str, r6.A01);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void A02(String str, int i) {
        try {
            this.A01.put(str, i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void A03(String str, String str2) {
        try {
            this.A01.put(str, str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void A04(String str, boolean z) {
        try {
            this.A01.put(str, z);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        JSONObject A1B = C36441kJ.A1B();
        try {
            String str = this.A00;
            if (str != null) {
                A1B.put(str, this.A01);
            } else {
                A1B = this.A01;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return A1B.toString();
    }

    public C131606Ps(String str, C131606Ps... r4) {
        this.A01 = C36441kJ.A1B();
        this.A00 = str;
        int length = r4.length;
        for (int i = 0; i < length; i = 1) {
            A01(r4[i]);
        }
    }
}
