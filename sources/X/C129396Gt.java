package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6Gt  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C129396Gt {
    public static List A00(C159267j5 r4, JSONArray jSONArray) {
        AnonymousClass5X0 A02 = AnonymousClass5X0.A02(r4, 10);
        if (jSONArray == null) {
            return C023409w.A00;
        }
        C15020mZ A05 = C15040mb.A05(0, jSONArray.length());
        ArrayList<Object> A0I = AnonymousClass001.A0I();
        Iterator it = A05.iterator();
        while (it.hasNext()) {
            JSONObject optJSONObject = jSONArray.optJSONObject(((C12260hl) it).A00());
            if (optJSONObject != null) {
                A0I.add(optJSONObject);
            }
        }
        ArrayList A0I2 = AnonymousClass001.A0I();
        for (Object invoke : A0I) {
            Object invoke2 = A02.invoke(invoke);
            if (invoke2 != null) {
                A0I2.add(invoke2);
            }
        }
        return A0I2;
    }

    public static JSONArray A01(C159267j5 r4, List list) {
        if (list.isEmpty()) {
            return null;
        }
        AnonymousClass5X0 A02 = AnonymousClass5X0.A02(r4, 11);
        JSONArray A0u = C90524aI.A0u();
        ArrayList<Object> A0I = AnonymousClass001.A0I();
        for (Object invoke : list) {
            Object invoke2 = A02.invoke(invoke);
            if (invoke2 != null) {
                A0I.add(invoke2);
            }
        }
        for (Object put : A0I) {
            A0u.put(put);
        }
        return A0u;
    }
}
