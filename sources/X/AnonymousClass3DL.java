package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3DL  reason: invalid class name */
public class AnonymousClass3DL {
    public int A00;
    public final String A01;

    public AnonymousClass3DL(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public JSONObject A00() {
        JSONObject A1B = C36441kJ.A1B();
        try {
            A1B.put("attempts", this.A00);
            String str = this.A01;
            if (str != null) {
                A1B.put("app_campaign_download_source", str);
            }
        } catch (JSONException unused) {
        }
        return A1B;
    }
}
