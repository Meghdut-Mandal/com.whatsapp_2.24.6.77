package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3DI  reason: invalid class name */
public class AnonymousClass3DI {
    public JSONObject A00;
    public final C20810yC A01;

    public String A00(String str, String str2, boolean z) {
        C20810yC r1 = this.A01;
        if (!r1.A0E(1955)) {
            return null;
        }
        int A07 = r1.A07(1956);
        Integer valueOf = Integer.valueOf(A07);
        String str3 = "";
        String str4 = str3;
        if (r1.A0E(1955)) {
            if (str != null) {
                if (str2 != null) {
                    Object[] A0M = AnonymousClass001.A0M();
                    C36331k8.A1N(str, str2, A0M);
                    str3 = String.format("%s,%s", A0M);
                } else {
                    str3 = str;
                }
            }
            try {
                JSONObject jSONObject = this.A00;
                if (jSONObject == null || jSONObject.get(str3) == null) {
                    str3 = str4;
                } else {
                    str3 = jSONObject.get(str3).toString();
                }
            } catch (JSONException unused) {
                str3 = null;
            }
            if (AnonymousClass14B.A0F(str3)) {
                try {
                    JSONObject jSONObject2 = this.A00;
                    if (jSONObject2 == null || jSONObject2.get(str) == null) {
                        str3 = str4;
                    } else {
                        str3 = jSONObject2.get(str).toString();
                    }
                } catch (JSONException unused2) {
                    str3 = null;
                }
            }
        }
        if (!AnonymousClass14B.A0F(str3)) {
            return str3;
        }
        if (!z || valueOf == null || A07 == 0) {
            return null;
        }
        return valueOf.toString();
    }

    public AnonymousClass3DI(C20810yC r3) {
        this.A01 = r3;
        if (r3.A0E(1955)) {
            String A09 = r3.A09(2659);
            if (!TextUtils.isEmpty(A09)) {
                try {
                    this.A00 = C36441kJ.A1C(A09);
                } catch (JSONException e) {
                    Log.e("Fail to fetch merchantCodePurposeCodeMaxAmountMap ", e);
                }
            }
        }
    }
}
