package X;

import org.json.JSONObject;

/* renamed from: X.5dF  reason: invalid class name and case insensitive filesystem */
public abstract class C112035dF {
    public static Integer A01(String str, JSONObject jSONObject) {
        return A00(jSONObject.optString(str, String.valueOf(2)));
    }

    public static Integer A00(String str) {
        if (str.equals("FXAccountItemEligibilityEligible")) {
            return C023109s.A00;
        }
        if (str.equals("FXAccountItemEligibilityIneligible")) {
            return C023109s.A01;
        }
        if (str.equals("FXAccountItemEligibilityNoData")) {
            return C023109s.A0C;
        }
        throw AnonymousClass001.A08(str);
    }
}
