package X;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class AGA implements B1X {
    public B4W B4t(JSONObject jSONObject) {
        AnonymousClass00C.A0D(jSONObject, 0);
        JSONArray jSONArray = jSONObject.getJSONArray("and");
        int length = jSONArray.length();
        B4W[] b4wArr = new B4W[length];
        boolean z = false;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            AnonymousClass00C.A08(jSONObject2);
            b4wArr[i] = AnonymousClass976.A00(jSONObject2);
        }
        List A0C = AnonymousClass02R.A0C(b4wArr);
        if (A0C.size() > 1) {
            z = true;
        }
        C18740tg.A0D(z, "expected 2 or more rules in input");
        return new AFQ(A0C);
    }

    public String BCX() {
        return "and";
    }
}
