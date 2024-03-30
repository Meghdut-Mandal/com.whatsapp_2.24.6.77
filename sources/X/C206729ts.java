package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9ts  reason: invalid class name and case insensitive filesystem */
public final class C206729ts implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206149sn();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C206729ts) {
                C206729ts r5 = (C206729ts) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
    }

    public int hashCode() {
        return C36381kD.A08(this.A03, (C36421kH.A04(this.A02) + C36341k9.A09(this.A01)) * 31) + C36421kH.A05(this.A00);
    }

    public C206729ts(String str, String str2, String str3, String str4) {
        C36321k7.A0y(str, str3);
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A00 = str4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SingleSelectListSectionItem(id=");
        A0u.append(this.A02);
        A0u.append(", header=");
        A0u.append(this.A01);
        A0u.append(", title=");
        A0u.append(this.A03);
        A0u.append(", description=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
