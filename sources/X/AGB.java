package X;

import org.json.JSONObject;

public final class AGB implements B1X {
    public B4W B4t(JSONObject jSONObject) {
        AnonymousClass00C.A0D(jSONObject, 0);
        JSONObject jSONObject2 = jSONObject.getJSONObject("not");
        AnonymousClass00C.A08(jSONObject2);
        B4W A00 = AnonymousClass976.A00(jSONObject2);
        if (A00 != null) {
            return new AFR(A00);
        }
        throw C165617ti.A0U();
    }

    public String BCX() {
        return "not";
    }
}
