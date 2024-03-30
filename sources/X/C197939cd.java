package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9cd  reason: invalid class name and case insensitive filesystem */
public final class C197939cd {
    public C135086c7 A00;
    public String A01;
    public BigDecimal A02;
    public BigDecimal A03;

    public C197939cd(String str) {
        Object obj;
        BigDecimal bigDecimal;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject A1C = C36441kJ.A1C(str);
                C146356vT A002 = C146356vT.A00();
                Class<String> cls = String.class;
                C135086c7 r0 = this.A00;
                if (r0 == null) {
                    obj = null;
                } else {
                    obj = r0.A00;
                }
                this.A00 = C165617ti.A0P(A002, cls, A1C.optString("base-amount", (String) obj), "moneyStringValue");
                this.A01 = A1C.optString("base-currency");
                BigDecimal bigDecimal2 = null;
                if (A1C.has("currency-fx")) {
                    bigDecimal = C165617ti.A0b(A1C.optString("currency-fx"));
                } else {
                    bigDecimal = null;
                }
                this.A02 = bigDecimal;
                this.A03 = A1C.has("currency-markup") ? C165617ti.A0b(A1C.optString("currency-markup")) : bigDecimal2;
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiInternationalTransactionDetailData:FxDetail threw: ", e);
            }
        }
    }

    public C197939cd(C203399nx r6) {
        String A0i = r6.A0i("base-currency", (String) null);
        if (!TextUtils.isEmpty(A0i)) {
            this.A01 = A0i;
        }
        String A0i2 = r6.A0i("base-amount", (String) null);
        if (!TextUtils.isEmpty(A0i2)) {
            this.A00 = C165617ti.A0P(C146356vT.A00(), String.class, A0i2, "moneyStringValue");
        }
        String A0i3 = r6.A0i("currency-fx", (String) null);
        if (!TextUtils.isEmpty(A0i3)) {
            this.A02 = C165617ti.A0b(A0i3);
        }
        String A0i4 = r6.A0i("currency-markup", (String) null);
        if (!TextUtils.isEmpty(A0i4)) {
            this.A03 = C165617ti.A0b(A0i4);
        }
    }
}
