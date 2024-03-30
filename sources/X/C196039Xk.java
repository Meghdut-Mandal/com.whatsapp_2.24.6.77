package X;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Xk  reason: invalid class name and case insensitive filesystem */
public class C196039Xk {
    public final C24601Db A00;
    public final C24611Dc A01 = C165607th.A0c("PaymentPinSharedPrefs", "infra");

    public synchronized long A00() {
        long j;
        JSONObject optJSONObject;
        j = 0;
        try {
            String A06 = this.A00.A06();
            if (!TextUtils.isEmpty(A06) && (optJSONObject = C36441kJ.A1C(A06).optJSONObject("pin")) != null) {
                j = optJSONObject.optLong("pin_next_retry_ts");
            }
        } catch (JSONException e) {
            C165567td.A15(this.A01, e, "getNextRetryTs threw: ", AnonymousClass000.A0u());
        }
        return j;
    }

    public synchronized void A01() {
        try {
            C24601Db r5 = this.A00;
            JSONObject A0h = C165567td.A0h(r5);
            JSONObject optJSONObject = A0h.optJSONObject("pin");
            if (optJSONObject == null) {
                optJSONObject = C36441kJ.A1B();
            }
            optJSONObject.put("v", "1");
            optJSONObject.put("pinSet", true);
            A0h.put("pin", optJSONObject);
            C165577te.A1B(r5, A0h);
        } catch (JSONException e) {
            C165567td.A15(this.A01, e, "setPinSet threw: ", AnonymousClass000.A0u());
        }
        return;
    }

    public synchronized void A02(long j) {
        try {
            C24601Db r5 = this.A00;
            JSONObject A0h = C165567td.A0h(r5);
            JSONObject optJSONObject = A0h.optJSONObject("pin");
            if (optJSONObject == null) {
                optJSONObject = C36441kJ.A1B();
            }
            optJSONObject.put("v", "1");
            optJSONObject.put("pin_next_retry_ts", j);
            A0h.put("pin", optJSONObject);
            C165577te.A1B(r5, A0h);
        } catch (JSONException e) {
            C165567td.A15(this.A01, e, "setPinSet threw: ", AnonymousClass000.A0u());
        }
        return;
    }

    public synchronized boolean A03() {
        boolean z;
        JSONObject optJSONObject;
        z = false;
        try {
            String A06 = this.A00.A06();
            if (!TextUtils.isEmpty(A06) && (optJSONObject = C36441kJ.A1C(A06).optJSONObject("pin")) != null) {
                z = optJSONObject.optBoolean("pinSet");
            }
        } catch (JSONException e) {
            C165567td.A15(this.A01, e, "isPinSet threw: ", AnonymousClass000.A0u());
        }
        return z;
    }

    public C196039Xk(C24601Db r3) {
        this.A00 = r3;
    }
}
