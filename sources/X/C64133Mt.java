package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.3Mt  reason: invalid class name and case insensitive filesystem */
public abstract class C64133Mt {
    public static final HashMap A00 = AnonymousClass001.A0J();
    public static final HashMap A01 = AnonymousClass001.A0J();

    public static JSONObject A00(HashMap hashMap) {
        JSONObject A1B = C36441kJ.A1B();
        Iterator A10 = C36371kC.A10(hashMap);
        while (A10.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A10);
            A1B.put(Integer.toString(AnonymousClass000.A0I(A11.getKey())), Long.toString(C36431kI.A09(A11.getValue())));
        }
        return A1B;
    }
}
