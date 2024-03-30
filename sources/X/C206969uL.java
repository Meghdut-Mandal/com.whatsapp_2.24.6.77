package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: X.9uL  reason: invalid class name and case insensitive filesystem */
public class C206969uL implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C23181B8p(20);
    public final String A00;
    public final String A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C206969uL r4 = (C206969uL) obj;
            if (this.A00.equals(r4.A00)) {
                return Objects.equals(this.A01, r4.A01);
            }
        }
        return false;
    }

    public int hashCode() {
        return C36421kH.A04(this.A00) + C165577te.A06(this.A01);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public C206969uL(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public C206969uL(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
