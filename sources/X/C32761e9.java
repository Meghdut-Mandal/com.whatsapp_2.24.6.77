package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1e9  reason: invalid class name and case insensitive filesystem */
public final class C32761e9 {
    public final C20810yC A00;

    public C32761e9(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final void A00(String str, String str2) {
        List<AnonymousClass6C1> list;
        AnonymousClass00C.A0D(str, 0);
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(this.A00.A09(7502)).getJSONObject("businesses");
            Iterator<String> keys = jSONObject.keys();
            AnonymousClass00C.A08(keys);
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                Iterator<String> keys2 = jSONObject2.keys();
                AnonymousClass00C.A08(keys2);
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(next2);
                    String string = jSONObject3.getString("flow_id");
                    String string2 = jSONObject3.getString("flow_start_screen");
                    AnonymousClass00C.A0B(next);
                    AnonymousClass00C.A0B(next2);
                    AnonymousClass00C.A0B(string);
                    AnonymousClass00C.A0B(string2);
                    arrayList.add(new AnonymousClass6C1(next, next2, string, string2));
                }
            }
            list = arrayList;
        } catch (JSONException e) {
            Log.w("BotFlowsCommandUtil: failed to parse JSON", e);
            list = C023409w.A00;
        }
        for (AnonymousClass6C1 r1 : list) {
            if (AnonymousClass00C.A0J(r1.A01, str2)) {
                String str3 = r1.A00;
                String str4 = str;
                int A0C = AnonymousClass099.A0C(str, "@", 0, false);
                if (A0C != -1) {
                    str4 = str.substring(0, A0C);
                    AnonymousClass00C.A08(str4);
                }
                if (AnonymousClass00C.A0J(str3, str4)) {
                    return;
                }
            }
        }
    }
}
