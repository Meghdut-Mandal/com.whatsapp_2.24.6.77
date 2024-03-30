package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8bA  reason: invalid class name and case insensitive filesystem */
public abstract class C175848bA extends C175898bF {
    public long A00;
    public C135086c7 A01;
    public C135086c7 A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public byte[] A09;

    public JSONObject A0A() {
        JSONObject A1B = C36441kJ.A1B();
        try {
            String str = this.A03;
            if (str != null) {
                A1B.put("bankImageURL", str);
            }
            String str2 = this.A04;
            if (str2 != null) {
                A1B.put("bankPhoneNumber", str2);
                return A1B;
            }
        } catch (JSONException e) {
            Log.w("PAY: PaymentMethodBankAccountCountryData toJSONObject threw: ", e);
        }
        return A1B;
    }
}
