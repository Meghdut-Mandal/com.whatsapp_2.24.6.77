package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.AbstractCollection;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.544  reason: invalid class name */
public class AnonymousClass544 extends C134986bw {
    public static final Parcelable.Creator CREATOR = new C163937r0(26);
    public String A00;
    public boolean A01;
    public final String A02;
    public final String A03;

    public static AnonymousClass544 A00(JSONObject jSONObject) {
        String string = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C18740tg.A05(string);
        String string2 = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        C18740tg.A05(string2);
        return new AnonymousClass544(string, string2, jSONObject.optString("icon_url", ""), jSONObject.optString("bg_color"), jSONObject.optString("parent_name"), jSONObject.optBoolean("is_root", false));
    }

    public AnonymousClass544(Parcel parcel) {
        super(parcel);
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public static void A01(AbstractCollection abstractCollection, JSONArray jSONArray, int i) {
        abstractCollection.add(A00(jSONArray.getJSONObject(i)));
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
    }

    public AnonymousClass544(String str, String str2) {
        super(str, str2);
        this.A03 = "";
        this.A02 = null;
    }

    public AnonymousClass544(String str, String str2, String str3, String str4, String str5, boolean z) {
        super(str, str2);
        this.A03 = str3;
        this.A00 = str5;
        this.A01 = z;
        this.A02 = str4;
    }
}
