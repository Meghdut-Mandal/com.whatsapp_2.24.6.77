package X;

import org.json.JSONObject;

/* renamed from: X.9bz  reason: invalid class name and case insensitive filesystem */
public class C197609bz {
    public final int A00;
    public final boolean A01;

    public C197609bz(String str, Long l) {
        int intValue;
        if (l == null) {
            intValue = -1;
        } else {
            intValue = l.intValue();
        }
        this.A00 = intValue;
        this.A01 = "1".equals(str);
    }

    public C197609bz(String str) {
        JSONObject A1C = C36441kJ.A1C(str);
        this.A00 = A1C.getInt("max_from_sender");
        this.A01 = A1C.getBoolean("usync_pay_eligible_offers_includes_current_offer_id");
    }
}
