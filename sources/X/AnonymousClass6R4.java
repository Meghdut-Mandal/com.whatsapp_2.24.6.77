package X;

import org.json.JSONObject;

/* renamed from: X.6R4  reason: invalid class name */
public abstract class AnonymousClass6R4 {
    public static JSONObject A02(Object obj) {
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("success", true);
        A1B.putOpt("result", obj);
        return A1B;
    }

    public static JSONObject A03(String str, int i) {
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("success", false);
        A1B.put("error_code", i);
        A1B.put("error_message", str);
        return A1B;
    }
}
