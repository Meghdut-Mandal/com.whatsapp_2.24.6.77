package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8at  reason: invalid class name and case insensitive filesystem */
public final class C175688at extends C175728ax {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(48);
    public int A00 = 1;

    public C175688at(Parcel parcel) {
        super(parcel);
    }

    public String A05() {
        JSONObject A1B;
        try {
            String A05 = super.A05();
            if (A05 != null) {
                A1B = C36441kJ.A1C(A05);
            } else {
                A1B = C36441kJ.A1B();
            }
            A1B.put("v", this.A00);
            long j = this.A01;
            if (j != -1) {
                A1B.put("nextSyncTimeMillis", j);
            }
            if (!TextUtils.isEmpty(this.A05)) {
                A1B.put("dataHash", this.A05);
            }
            return A1B.toString();
        } catch (JSONException e) {
            Log.w("PAY: BrazilContactData toDBString threw: ", e);
            return null;
        }
    }

    public void A06(String str) {
        super.A06(str);
        if (str != null) {
            try {
                JSONObject A1C = C36441kJ.A1C(str);
                int optInt = A1C.optInt("v", 1);
                this.A00 = optInt;
                if (optInt == 1) {
                    this.A01 = A1C.optLong("nextSyncTimeMillis", -1);
                }
                this.A05 = A1C.optString("dataHash");
            } catch (JSONException e) {
                Log.w("PAY: BrazilContactData fromDBString threw: ", e);
            }
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ ver: ");
        A0u.append(this.A00);
        A0u.append(" jid: ");
        A0u.append(this.A04);
        A0u.append(" isMerchant: ");
        A0u.append(this.A06);
        A0u.append(" defaultPaymentType: ");
        A0u.append(this.A00);
        return AnonymousClass000.A0q(" ]", A0u);
    }

    public C175688at() {
    }
}
