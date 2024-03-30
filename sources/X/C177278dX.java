package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8dX  reason: invalid class name and case insensitive filesystem */
public final class C177278dX extends C195629Ve {
    public final AnonymousClass9Y8 A00;
    public final JSONArray A01;
    public final boolean A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C177278dX(AnonymousClass9Y8 r3, JSONArray jSONArray) {
        super(r3, jSONArray);
        C36321k7.A0x(r3, jSONArray);
        this.A00 = r3;
        this.A01 = jSONArray;
        boolean z = true;
        this.A02 = AnonymousClass000.A1R(r3.A00.length());
        this.A03 = this.A01.length() <= 0 ? false : z;
    }

    public String toString() {
        String jSONObject;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MexResponse(data=");
        JSONObject jSONObject2 = this.A00.A00;
        if (jSONObject2 == null) {
            jSONObject = "";
        } else {
            jSONObject = jSONObject2.toString(2);
            AnonymousClass00C.A08(jSONObject);
        }
        A0u.append(jSONObject);
        A0u.append(", errors=");
        return C36321k7.A0E(this.A01.toString(2), A0u);
    }
}
