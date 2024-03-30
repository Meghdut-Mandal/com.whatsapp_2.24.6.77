package X;

import java.math.BigDecimal;
import org.json.JSONObject;

/* renamed from: X.9fK  reason: invalid class name and case insensitive filesystem */
public final class C199449fK {
    public int A00;
    public long A01;
    public AnonymousClass16U A02;

    public static C207119ua A00(AnonymousClass16U r0, C199449fK r1, JSONObject jSONObject) {
        r1.A02 = r0;
        r1.A01();
        return new C199449fK(jSONObject).A01();
    }

    public C207119ua A01() {
        int i = this.A00;
        long j = this.A01;
        if (i <= 0) {
            return new C207119ua(this.A02, 1, j);
        }
        return new C207119ua(this.A02, i, j);
    }

    public void A02(AnonymousClass16X r7) {
        BigDecimal bigDecimal = r7.A00;
        int pow = (int) Math.pow(10.0d, (double) bigDecimal.scale());
        this.A01 = (long) (bigDecimal.doubleValue() * ((double) pow));
        this.A00 = pow;
    }

    public C199449fK(JSONObject jSONObject) {
        AnonymousClass16U r0;
        if (jSONObject != null) {
            this.A01 = jSONObject.optLong("value", -1);
            this.A00 = jSONObject.optInt("offset", -1);
            jSONObject.optInt("currencyType", -1);
            JSONObject optJSONObject = jSONObject.optJSONObject("currency");
            AnonymousClass16U[] r02 = AnonymousClass16T.A01;
            if (optJSONObject != null) {
                r0 = new AnonymousClass16W(optJSONObject);
            } else {
                r0 = AnonymousClass16W.A06;
            }
            this.A02 = r0;
        }
    }

    public C199449fK() {
    }
}
