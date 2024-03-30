package X;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.62i  reason: invalid class name and case insensitive filesystem */
public class C1260462i {
    public final Integer A00;
    public final List A01;
    public final boolean A02;

    public C1260462i(Integer num, List list, boolean z) {
        this.A01 = list;
        this.A00 = num;
        this.A02 = z;
    }

    public JSONObject A00() {
        JSONObject A1B = C36441kJ.A1B();
        if (this.A02) {
            A1B.put("has_catalog", 1);
        }
        Integer num = this.A00;
        if (num != null) {
            A1B.put("opening_hours", num);
        }
        List list = this.A01;
        if (list != null) {
            JSONArray A0u = C90524aI.A0u();
            for (int i = 0; i < list.size(); i++) {
                A0u.put(list.get(i));
            }
            A1B.put("subcategories", A0u);
        }
        if (A1B.length() == 0) {
            return null;
        }
        return A1B;
    }
}
