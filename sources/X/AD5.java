package X;

import org.json.JSONObject;

public final /* synthetic */ class AD5 implements C22946Ayw {
    public static final /* synthetic */ AD5 A00 = new AD5();

    public final Object Bw0(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject == null || !jSONObject.has("errors") || jSONObject.isNull("errors")) {
            return C90524aI.A0u();
        }
        return jSONObject.getJSONArray("errors");
    }
}
