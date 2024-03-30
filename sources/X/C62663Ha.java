package X;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.3Ha  reason: invalid class name and case insensitive filesystem */
public final class C62663Ha {
    public final AnonymousClass1ZP A00;

    public C62663Ha(AnonymousClass1ZP r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final AnonymousClass3HZ A00(C28981Uw r5) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("geosuspension_");
        try {
            String A002 = this.A00.A00(AnonymousClass000.A0q(r5.getRawString(), A0u));
            if (A002 == null || A002.length() == 0) {
                return new AnonymousClass3HZ(C36441kJ.A17());
            }
            JSONObject A1C = C36441kJ.A1C(A002);
            LinkedHashSet A17 = C36441kJ.A17();
            JSONArray jSONArray = A1C.getJSONArray("countries");
            AnonymousClass00C.A08(jSONArray);
            C12320hr A01 = C63893Lv.A01(jSONArray);
            while (A01.hasNext()) {
                JSONObject jSONObject = (JSONObject) A01.next();
                AnonymousClass00C.A0D(jSONObject, 0);
                String string = jSONObject.getString("iso_code");
                AnonymousClass00C.A0B(string);
                A17.add(new AnonymousClass3HY(string));
            }
            return new AnonymousClass3HZ(A17);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void A01(C28981Uw r8, AnonymousClass3HZ r9) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("geosuspension_");
        String A0q = AnonymousClass000.A0q(r8.getRawString(), A0u);
        try {
            JSONObject A1B = C36441kJ.A1B();
            Set<AnonymousClass3HY> set = r9.A00;
            ArrayList A0J = C36321k7.A0J(set);
            for (AnonymousClass3HY r1 : set) {
                AnonymousClass00C.A0D(r1, 0);
                JSONObject A1B2 = C36441kJ.A1B();
                A1B2.put("iso_code", r1.A00);
                A0J.add(A1B2);
            }
            A1B.put("countries", new JSONArray(A0J));
            this.A00.A02(A0q, C36381kD.A0y(A1B));
        } catch (Throwable th) {
            new AnonymousClass03N(th);
        }
    }
}
