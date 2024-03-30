package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8ay  reason: invalid class name and case insensitive filesystem */
public class C175738ay extends C175838b9 {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(49);

    public int describeContents() {
        return 0;
    }

    public void A06(String str) {
        if (str != null) {
            try {
                JSONObject A1C = C36441kJ.A1C(str);
                try {
                    Iterator<String> keys = A1C.keys();
                    while (keys.hasNext()) {
                        String A0C = AnonymousClass001.A0C(keys);
                        if ("method_type".equalsIgnoreCase(A0C)) {
                            this.A02 = A1C.getString(A0C);
                        }
                        this.A03.put(A0C, new C206859u7(A0C, A1C.getString(A0C)));
                    }
                } catch (JSONException e) {
                    C165577te.A1M("BrazilCustomPaymentMethodData", AnonymousClass000.A0l(e, "fromJSONObject threw: ", AnonymousClass000.A0u()));
                }
            } catch (JSONException e2) {
                C36321k7.A1J(e2, "BrazilCustomPaymentMethodData fromDBString threw: ", AnonymousClass000.A0u());
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A03.size());
        Iterator A10 = C36371kC.A10(this.A03);
        while (A10.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A10);
            parcel.writeString(C90494aF.A0f(A11));
            parcel.writeString(((C206859u7) A11.getValue()).A01);
        }
    }

    public C175738ay(String str, String str2, String str3, HashMap hashMap) {
        super(str, str2, str3, hashMap);
    }

    public String A05() {
        try {
            JSONObject A1B = C36441kJ.A1B();
            try {
                Iterator A10 = C36371kC.A10(this.A03);
                while (A10.hasNext()) {
                    Map.Entry A11 = AnonymousClass000.A11(A10);
                    A1B.put(C90494aF.A0f(A11), ((C206859u7) A11.getValue()).A01);
                }
                if (!TextUtils.isEmpty(this.A02)) {
                    A1B.put("method_type", this.A02);
                }
            } catch (Exception e) {
                C165577te.A1M("BrazilCustomPaymentMethodData", AnonymousClass000.A0l(e, "toJSONObject threw an exception : ", AnonymousClass000.A0u()));
            }
            return A1B.toString();
        } catch (Exception e2) {
            C36321k7.A1J(e2, "BrazilCustomPaymentMethodData: toDBString threw ", AnonymousClass000.A0u());
            return null;
        }
    }

    public C175738ay() {
        super("BR", "", "", AnonymousClass001.A0J());
    }
}
