package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.AHj  reason: case insensitive filesystem */
public class C21331AHj implements B5M {
    public static final Parcelable.Creator CREATOR = new C23181B8p(13);
    public C206839u5 A00;
    public String A01;
    public boolean A02;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public C21331AHj(C206839u5 r1, String str, boolean z) {
        this.A02 = z;
        this.A01 = str;
        this.A00 = r1;
    }

    public JSONObject Bvn() {
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("enabled", this.A02);
        String str = this.A01;
        if (!TextUtils.isEmpty(str)) {
            A1B.put("payment_configuration", str);
        }
        C206839u5 r0 = this.A00;
        if (r0 != null) {
            JSONObject A1B2 = C36441kJ.A1B();
            A1B2.put("max_installment_count", r0.A00);
            A1B.put("installment", A1B2);
        }
        return A1B;
    }

    public C21331AHj(Parcel parcel) {
        this.A02 = AnonymousClass000.A1O(parcel.readInt());
        this.A01 = parcel.readString();
        this.A00 = (C206839u5) C36411kG.A0H(parcel, C206839u5.class);
    }
}
