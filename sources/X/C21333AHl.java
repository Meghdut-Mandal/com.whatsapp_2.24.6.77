package X;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* renamed from: X.AHl  reason: case insensitive filesystem */
public class C21333AHl implements B5M {
    public static final Parcelable.Creator CREATOR = new C23181B8p(15);
    public final String A00;
    public final String A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public C21333AHl(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public JSONObject Bvn() {
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("uri", this.A02);
        A1B.put("cancel_url", this.A00);
        A1B.put("success_url", this.A01);
        return A1B;
    }

    public C21333AHl(Parcel parcel) {
        this.A02 = C90514aH.A0u(parcel);
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
