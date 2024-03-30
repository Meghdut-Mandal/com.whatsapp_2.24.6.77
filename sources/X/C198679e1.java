package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9e1  reason: invalid class name and case insensitive filesystem */
public class C198679e1 {
    public C197939cd A00;
    public String A01;

    public C198679e1(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject A1C = C36441kJ.A1C(str);
                this.A01 = A1C.optString("invoice-number");
                if (A1C.has("fx-detail")) {
                    this.A00 = new C197939cd(A1C.optString("fx-detail"));
                }
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiTransactionComplaintData threw: ", e);
            }
        }
    }

    public String A00() {
        String str;
        try {
            JSONObject A1B = C36441kJ.A1B();
            String str2 = this.A01;
            if (str2 != null) {
                A1B.put("invoice-number", str2);
            }
            C197939cd r5 = this.A00;
            if (r5 != null) {
                try {
                    JSONObject A1B2 = C36441kJ.A1B();
                    C135086c7 r1 = r5.A00;
                    if (r1 != null) {
                        C165607th.A1D(r1, "base-amount", A1B2);
                    }
                    String str3 = r5.A01;
                    if (!TextUtils.isEmpty(str3)) {
                        A1B2.put("base-currency", str3);
                    }
                    BigDecimal bigDecimal = r5.A02;
                    if (bigDecimal != null) {
                        C90504aG.A1J(bigDecimal, "currency-fx", A1B2);
                    }
                    BigDecimal bigDecimal2 = r5.A03;
                    if (bigDecimal2 != null) {
                        C90504aG.A1J(bigDecimal2, "currency-markup", A1B2);
                    }
                    str = A1B2.toString();
                } catch (JSONException e) {
                    Log.w("PAY: IndiaUpiTransactionMetadata toDBString threw: ", e);
                    str = null;
                }
                A1B.put("fx-detail", str);
            }
            return A1B.toString();
        } catch (JSONException e2) {
            Log.w("PAY: IndiaUpiInternationalTransactionDetailData toDBString threw: ", e2);
            return null;
        }
    }

    public C198679e1(C203399nx r3) {
        String A0x = C36391kE.A0x(r3, "invoice-number");
        if (!TextUtils.isEmpty(A0x)) {
            this.A01 = A0x;
        }
        C203399nx A0c = r3.A0c("fx-detail");
        if (A0c != null) {
            this.A00 = new C197939cd(A0c);
        }
    }
}
