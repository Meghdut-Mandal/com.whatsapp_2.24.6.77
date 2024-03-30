package X;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* renamed from: X.AHm  reason: case insensitive filesystem */
public class C21334AHm implements B5M {
    public static final Parcelable.Creator CREATOR = new C23181B8p(17);
    public final C21333AHl A00;
    public final String A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public C21334AHm(C21333AHl aHl, String str, String str2) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = aHl;
    }

    public JSONObject Bvn() {
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("tr", this.A02);
        A1B.put("configuration_name", this.A01);
        C21333AHl aHl = this.A00;
        if (aHl != null) {
            A1B.put("payment_link", aHl.Bvn());
        }
        return A1B;
    }

    public C21334AHm(Parcel parcel) {
        this.A02 = C90514aH.A0u(parcel);
        this.A01 = C90514aH.A0u(parcel);
        this.A00 = (C21333AHl) C36411kG.A0H(parcel, C21333AHl.class);
    }
}
