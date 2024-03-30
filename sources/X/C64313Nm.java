package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Nm  reason: invalid class name and case insensitive filesystem */
public class C64313Nm {
    public final List A00 = AnonymousClass001.A0I();
    public final List A01 = AnonymousClass001.A0I();
    public final boolean A02;
    public final List A03 = AnonymousClass001.A0I();

    public C64313Nm(C20810yC r5) {
        this.A02 = r5.A0E(5480);
        String A09 = r5.A09(5481);
        if (!TextUtils.isEmpty(A09)) {
            try {
                JSONObject A1C = C36441kJ.A1C(A09);
                ArrayList A002 = A00(A1C.optJSONArray("merchant_list"));
                Collections.sort(A002);
                Iterator it = A002.iterator();
                while (it.hasNext()) {
                    this.A00.add(((C80133uu) it.next()).A01);
                }
                ArrayList A003 = A00(A1C.optJSONArray("explore_merchants"));
                Collections.sort(A003);
                Iterator it2 = A003.iterator();
                while (it2.hasNext()) {
                    this.A03.add(((C80133uu) it2.next()).A01);
                }
                ArrayList A004 = A00(A1C.optJSONArray("chat_with_merchants"));
                Collections.sort(A004);
                Iterator it3 = A004.iterator();
                while (it3.hasNext()) {
                    this.A01.add(((C80133uu) it3.next()).A01);
                }
            } catch (JSONException unused) {
                Log.e("PaymentMerchantServerExperimentData/getServerMerchantList can't construct from abprops");
            }
        }
    }

    public static ArrayList A00(JSONArray jSONArray) {
        ArrayList A0I = AnonymousClass001.A0I();
        if (jSONArray != null) {
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    C80133uu r2 = new C80133uu();
                    String optString = jSONObject.optString("merchant_number");
                    r2.A01 = optString;
                    if (!TextUtils.isEmpty(optString)) {
                        r2.A00 = jSONObject.optInt("rank", -1);
                        A0I.add(r2);
                    }
                    i++;
                } catch (JSONException unused) {
                    Log.e("PaymentMerchantServerExperimentData/getServerMerchantList can't construct merchant list");
                }
            }
        }
        return A0I;
    }
}
