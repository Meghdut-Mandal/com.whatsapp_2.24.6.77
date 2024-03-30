package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.9tb  reason: invalid class name and case insensitive filesystem */
public final class C206559tb implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205889sN();
    public final String A00;
    public final String[] A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C206559tb) {
                C206559tb r5 = (C206559tb) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeStringArray(this.A01);
    }

    public int hashCode() {
        return C36421kH.A04(this.A00) + Arrays.hashCode(this.A01);
    }

    public C206559tb(String str, String[] strArr) {
        C36321k7.A0x(str, strArr);
        this.A00 = str;
        this.A01 = strArr;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PaymentPredefinedFilter(query=");
        A0u.append(this.A00);
        A0u.append(", params=");
        return C36321k7.A0E(Arrays.toString(this.A01), A0u);
    }
}
