package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.AHn  reason: case insensitive filesystem */
public class C21335AHn implements B5M {
    public static final Parcelable.Creator CREATOR = new C23181B8p(16);
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
    }

    public C21335AHn(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A01 = str4;
    }

    public JSONObject Bvn() {
        JSONObject A1B = C36441kJ.A1B();
        String str = this.A00;
        if (!TextUtils.isEmpty(str)) {
            A1B.put("code", str);
        }
        A1B.put("merchant_name", this.A01);
        A1B.put("key", this.A02);
        A1B.put("key_type", this.A03);
        return A1B;
    }

    public C21335AHn(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
