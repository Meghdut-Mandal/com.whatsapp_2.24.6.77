package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6SY  reason: invalid class name */
public final class AnonymousClass6SY {
    public final AnonymousClass6PG A02(JSONObject jSONObject) {
        return new AnonymousClass6PG(A00(jSONObject.optJSONArray("welj")), A00(jSONObject.optJSONArray("data_channel")), A00(jSONObject.optJSONArray("flow_message")));
    }

    private final LinkedHashMap A00(JSONArray jSONArray) {
        String A01;
        LinkedHashMap A1G = C36431kI.A1G();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String A012 = AnonymousClass6HO.A01("version", (String) null, optJSONObject);
                    JSONArray optJSONArray = optJSONObject.optJSONArray("android");
                    if (!(A012 == null || optJSONArray == null)) {
                        LinkedHashMap A1G2 = C36431kI.A1G();
                        int length2 = optJSONArray.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                            if (!(optJSONObject2 == null || (A01 = AnonymousClass6HO.A01("env", (String) null, optJSONObject2)) == null)) {
                                A1G2.put(A01, new AnonymousClass6AG(AnonymousClass6HO.A01("min_version", (String) null, optJSONObject2), AnonymousClass6HO.A01("max_version", (String) null, optJSONObject2)));
                            }
                        }
                        A1G.put(A012, A1G2);
                    }
                }
            }
        }
        return A1G;
    }

    public static final JSONArray A01(Map map) {
        JSONArray A0u = C90524aI.A0u();
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            JSONObject A1B = C36441kJ.A1B();
            JSONArray A0u2 = C90524aI.A0u();
            Iterator A0y2 = AnonymousClass000.A0y((Map) A11.getValue());
            while (A0y2.hasNext()) {
                Map.Entry A112 = AnonymousClass000.A11(A0y2);
                AnonymousClass6AG r3 = (AnonymousClass6AG) A112.getValue();
                JSONObject A0q = C90464aC.A0q(r3);
                A0q.put("min_version", r3.A01);
                A0q.put("max_version", r3.A00);
                A0q.put("env", A112.getKey());
                A0u2.put(A0q);
            }
            A1B.put("version", A11.getKey());
            A1B.put("android", A0u2);
            A0u.put(A1B);
        }
        return A0u;
    }
}
