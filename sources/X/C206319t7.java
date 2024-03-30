package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9t7  reason: invalid class name and case insensitive filesystem */
public class C206319t7 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205649rz();
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A06);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
    }

    public static void A00(C206319t7 r2, JSONArray jSONArray, JSONObject jSONObject) {
        jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r2.A04);
        jSONObject.put("address_line1", r2.A00);
        jSONObject.put("address_line2", r2.A01);
        jSONObject.put("city", r2.A02);
        jSONObject.put("state", r2.A06);
        jSONObject.put("country", r2.A03);
        jSONObject.put("postal_code", r2.A05);
        jSONArray.put(jSONObject);
    }

    public C206319t7(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C36321k7.A1B(str, str2, str3, str4, str5);
        C36321k7.A10(str6, str7);
        this.A04 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A02 = str4;
        this.A06 = str5;
        this.A03 = str6;
        this.A05 = str7;
    }
}
