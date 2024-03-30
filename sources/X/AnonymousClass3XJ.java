package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XJ  reason: invalid class name */
public final class AnonymousClass3XJ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C66453Wa();
    public final String A00;
    public final String A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3XJ) {
                AnonymousClass3XJ r5 = (AnonymousClass3XJ) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
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
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }

    public int hashCode() {
        return C36381kD.A08(this.A02, C36421kH.A04(this.A00)) + this.A01.hashCode();
    }

    public AnonymousClass3XJ(String str, String str2, String str3) {
        C36321k7.A11(str, str2, str3);
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DeviceSimInfo{countryCode='");
        A0u.append(this.A00);
        A0u.append("', phoneNumber='");
        A0u.append(this.A02);
        A0u.append("', networkOperatorName='");
        A0u.append(this.A01);
        return AnonymousClass000.A0q("'}", A0u);
    }
}
