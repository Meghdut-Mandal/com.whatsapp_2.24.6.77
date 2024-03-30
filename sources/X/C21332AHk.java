package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.AHk  reason: case insensitive filesystem */
public class C21332AHk implements B5M {
    public static final Parcelable.Creator CREATOR = new C23181B8p(14);
    public final String A00;
    public final String A01;
    public final JSONObject A02;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        JSONObject jSONObject = this.A02;
        if (jSONObject != null) {
            str = jSONObject.toString();
        } else {
            str = "";
        }
        parcel.writeString(str);
    }

    public C21332AHk(String str, String str2, JSONObject jSONObject) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = jSONObject;
    }

    public JSONObject Bvn() {
        JSONObject A1B = C36441kJ.A1B();
        String str = this.A01;
        A1B.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        A1B.put("configuration_name", this.A00);
        A1B.put(str, this.A02);
        return A1B;
    }

    public C21332AHk(Parcel parcel) {
        this.A01 = C90514aH.A0u(parcel);
        this.A00 = C90514aH.A0u(parcel);
        String readString = parcel.readString();
        JSONObject jSONObject = null;
        if (!TextUtils.isEmpty(readString)) {
            try {
                jSONObject = C36441kJ.A1C(readString);
            } catch (JSONException unused) {
                Log.w("Error parsing json string");
            }
        }
        this.A02 = jSONObject;
    }
}
