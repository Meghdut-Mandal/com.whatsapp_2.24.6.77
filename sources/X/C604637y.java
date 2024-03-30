package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.37y  reason: invalid class name and case insensitive filesystem */
public final class C604637y {
    public int A00 = -1;
    public String A01;
    public String A02;
    public JSONArray A03;

    public C604637y(JSONObject jSONObject, int i) {
        if (jSONObject.has("bottom_sheet")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("bottom_sheet");
            optJSONObject = optJSONObject == null ? C36441kJ.A1B() : optJSONObject;
            int optInt = optJSONObject.optInt("in_thread_buttons_limit", i);
            this.A00 = optInt > i ? i : optInt;
            this.A03 = optJSONObject.optJSONArray("divider_indices");
            this.A01 = optJSONObject.optString("button_title", (String) null);
            this.A02 = optJSONObject.optString("list_title", (String) null);
            return;
        }
        this.A00 = i;
    }
}
