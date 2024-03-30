package X;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8bE  reason: invalid class name and case insensitive filesystem */
public abstract class C175888bE extends C175898bF {
    public int A00;
    public int A01;
    public long A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public List A0D;
    public boolean A0E;
    public boolean A0F;

    public void A0B(JSONObject jSONObject) {
        this.A01 = jSONObject.optInt("state", 0);
        this.A09 = jSONObject.optString("merchantId", (String) null);
        this.A0C = jSONObject.optString("supportPhoneNumber", (String) null);
        this.A03 = jSONObject.optString("businessName", (String) null);
        String optString = jSONObject.optString("displayState", (String) null);
        if (TextUtils.isEmpty(optString)) {
            optString = "ACTIVE";
        }
        this.A07 = optString;
        this.A00 = jSONObject.optInt("maxInstallmentCount");
        this.A0A = jSONObject.optString("p2mReceive", "WAIT_ACTIVE");
    }

    public JSONObject A0A() {
        JSONObject A1B = C36441kJ.A1B();
        try {
            A1B.put("state", this.A01);
            if (!TextUtils.isEmpty(this.A09)) {
                A1B.put("merchantId", this.A09);
            }
            if (!TextUtils.isEmpty(this.A0C)) {
                A1B.put("supportPhoneNumber", this.A0C);
            }
            if (!TextUtils.isEmpty(this.A03)) {
                A1B.put("businessName", this.A03);
            }
            if (!TextUtils.isEmpty(this.A07)) {
                A1B.put("displayState", this.A07);
            }
            A1B.put("maxInstallmentCount", this.A00);
            try {
                A1B.put("p2mReceive", this.A0A);
                return A1B;
            } catch (JSONException e) {
                C36321k7.A1L(e, "PAY: PaymentMethodMerchantCountryData/addCapabilitiesToJson threw: ", AnonymousClass000.A0u());
                return A1B;
            }
        } catch (JSONException e2) {
            C36321k7.A1L(e2, "PAY: MerchantMethodData toDBJSONObject threw: ", AnonymousClass000.A0u());
            return A1B;
        }
    }
}
