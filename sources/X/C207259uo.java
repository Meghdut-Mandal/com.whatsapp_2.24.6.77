package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9uo  reason: invalid class name and case insensitive filesystem */
public class C207259uo implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(36);
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public C207259uo(long j, String str, String str2) {
        this(str, str2, (String) null, (String) null, (List) null, j);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A04);
        parcel.writeList(this.A05);
        parcel.writeString(this.A03);
    }

    public C207259uo(JSONObject jSONObject) {
        ArrayList arrayList;
        this.A01 = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        this.A02 = jSONObject.optString("message_id");
        this.A00 = jSONObject.optLong("expiry_ts");
        this.A04 = jSONObject.optString("payment_config_id");
        JSONArray optJSONArray = jSONObject.optJSONArray("beneficiaries");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            arrayList = null;
        } else {
            arrayList = AnonymousClass001.A0I();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = optJSONArray.get(i);
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject2 = (JSONObject) obj;
                String optString = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                String optString2 = jSONObject2.optString("address_line1");
                String optString3 = jSONObject2.optString("address_line2");
                String optString4 = jSONObject2.optString("city");
                String optString5 = jSONObject2.optString("state");
                String optString6 = jSONObject2.optString("country");
                String optString7 = jSONObject2.optString("postal_code");
                C90474aD.A1A(optString, optString2, optString3);
                C90474aD.A1A(optString4, optString5, optString6);
                AnonymousClass00C.A0B(optString7);
                arrayList.add(new C206319t7(optString, optString2, optString3, optString4, optString5, optString6, optString7));
            }
        }
        this.A05 = arrayList;
        this.A03 = jSONObject.optString("order-type");
    }

    public C207259uo(Parcel parcel) {
        this.A01 = C90514aH.A0u(parcel);
        this.A02 = C90514aH.A0u(parcel);
        this.A00 = parcel.readLong();
        this.A04 = parcel.readString();
        ArrayList A0I = AnonymousClass001.A0I();
        this.A05 = A0I;
        parcel.readList(A0I, C206319t7.class.getClassLoader());
        this.A03 = parcel.readString();
    }

    public C207259uo(String str, String str2, String str3, String str4, List list, long j) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = j;
        this.A04 = str3;
        this.A05 = list;
        this.A03 = str4;
    }
}
