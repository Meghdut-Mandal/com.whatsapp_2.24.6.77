package X;

import org.json.JSONObject;

public final /* synthetic */ class AD4 implements C22946Ayw {
    public static final /* synthetic */ AD4 A00 = new AD4();

    public final Object Bw0(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject == null || !jSONObject.has("data") || jSONObject.isNull("data")) {
            return C36441kJ.A1B();
        }
        return jSONObject.getJSONObject("data");
    }
}
