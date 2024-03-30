package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8bJ  reason: invalid class name and case insensitive filesystem */
public class C175938bJ extends C175708av {
    public static final Parcelable.Creator CREATOR = new C23181B8p(1);
    public long A00;
    public C207079uW A01;
    public Boolean A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    public static final C207119ua A00(AnonymousClass16T r7, C203399nx r8) {
        if (r8 != null) {
            C199449fK r5 = new C199449fK();
            r5.A02 = AnonymousClass16W.A06;
            C207119ua A012 = r5.A01();
            C203399nx A0c = r8.A0c("money");
            if (A0c == null) {
                C36321k7.A1Z(AnonymousClass000.A0v("PAY: BrazilTransactionCountryData :: extractAmountFromNode"), " :: money node is null");
            } else {
                try {
                    String A0h = A0c.A0h("value");
                    String A0h2 = A0c.A0h("offset");
                    AnonymousClass16U A013 = r7.A01(A0c.A0h("currency"));
                    r5.A01 = Long.parseLong(A0h);
                    r5.A00 = Integer.parseInt(A0h2);
                    r5.A02 = A013;
                    return r5.A01();
                } catch (Exception e) {
                    C36321k7.A1W(" :: an error occurred while parsing the money node :: e = ", AnonymousClass000.A0v("PAY: BrazilTransactionCountryData :: extractAmountFromNode"), e);
                    return A012;
                }
            }
        }
        return null;
    }

    public String A05() {
        throw null;
    }

    public void A06(String str) {
        C207079uW r1;
        try {
            super.A06(str);
            JSONObject A1C = C36441kJ.A1C(str);
            this.A00 = A1C.optLong("expiryTs", this.A00);
            this.A05 = A1C.optString("nonce", this.A05);
            this.A04 = A1C.optString("deviceId", this.A04);
            this.A03 = A1C.optString("amount", this.A03);
            this.A07 = A1C.optString("sender-alias", this.A07);
            if (A1C.has("isFirstSend")) {
                this.A02 = Boolean.valueOf(A1C.optBoolean("isFirstSend", false));
            }
            if (A1C.has("pspTransactionId")) {
                this.A06 = A1C.optString("pspTransactionId", this.A06);
            }
            if (A1C.has("installment")) {
                JSONObject jSONObject = A1C.getJSONObject("installment");
                if (jSONObject == null) {
                    r1 = null;
                } else {
                    int i = jSONObject.getInt("max_count");
                    int i2 = jSONObject.getInt("selected_count");
                    JSONObject optJSONObject = jSONObject.optJSONObject("due_amount_obj");
                    C199449fK r0 = new C199449fK();
                    AnonymousClass16U r4 = AnonymousClass16W.A06;
                    C207119ua A002 = C199449fK.A00(r4, r0, optJSONObject);
                    AnonymousClass00C.A0E(A002, "null cannot be cast to non-null type com.whatsapp.data.payments.PaymentMoney");
                    C207119ua A003 = C199449fK.A00(r4, new C199449fK(), jSONObject.optJSONObject("interest_obj"));
                    AnonymousClass00C.A0E(A003, "null cannot be cast to non-null type com.whatsapp.data.payments.PaymentMoney");
                    r1 = new C207079uW(A002, A003, i, i2);
                }
                this.A01 = r1;
            }
        } catch (JSONException e) {
            Log.w("PAY: BrazilTransactionCountryData fromDBString threw: ", e);
        }
    }

    public void A0O(C175708av r6) {
        super.A0O(r6);
        C175938bJ r62 = (C175938bJ) r6;
        long j = r62.A00;
        if (j > 0) {
            this.A00 = j;
        }
        String str = r62.A05;
        if (str != null) {
            this.A05 = str;
        }
        String str2 = r62.A04;
        if (str2 != null) {
            this.A04 = str2;
        }
        String str3 = r62.A03;
        if (str3 != null) {
            this.A03 = str3;
        }
        String str4 = r62.A07;
        if (str4 != null) {
            this.A07 = str4;
        }
        Boolean bool = r62.A02;
        if (bool != null) {
            this.A02 = bool;
        }
        String str5 = r62.A06;
        if (str5 != null) {
            this.A06 = str5;
        }
        C207079uW r0 = r62.A01;
        if (r0 != null) {
            this.A01 = r0;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeSerializable(this.A02);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A01, 0);
    }
}
