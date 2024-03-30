package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8b3  reason: invalid class name and case insensitive filesystem */
public class C175788b3 extends C207249un {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(34);
    public final String A00;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        super.writeToParcel(parcel, i);
    }

    public C175788b3(String str, String str2) {
        this.A00 = str;
        A0E(str2);
    }

    public C175788b3(Parcel parcel) {
        this.A00 = parcel.readString();
        A0D(parcel);
    }

    public C175788b3(C202159l8 r1, C175898bF r2, String str, String str2, String str3) {
        this.A00 = str;
        C18740tg.A06(r1);
        this.A07 = r1;
        this.A08 = r2;
        A0E(str3);
        this.A0A = str2;
    }
}
