package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9tx  reason: invalid class name and case insensitive filesystem */
public final class C206779tx implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205529rn();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C206779tx) {
                C206779tx r5 = (C206779tx) obj;
                if (!AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
    }

    public int hashCode() {
        return (((((((((C36341k9.A09(this.A04) * 31) + C36341k9.A09(this.A05)) * 31) + C36341k9.A09(this.A02)) * 31) + C36341k9.A09(this.A00)) * 31) + C36341k9.A09(this.A03)) * 31) + C36421kH.A05(this.A01);
    }

    public C206779tx(String str, String str2, String str3, String str4, String str5, String str6) {
        this.A04 = str;
        this.A05 = str2;
        this.A02 = str3;
        this.A00 = str4;
        this.A03 = str5;
        this.A01 = str6;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ProductImportAddress(street1=");
        A0u.append(this.A04);
        A0u.append(", street2=");
        A0u.append(this.A05);
        A0u.append(", postalCode=");
        A0u.append(this.A02);
        A0u.append(", city=");
        A0u.append(this.A00);
        A0u.append(", region=");
        A0u.append(this.A03);
        A0u.append(", countryCode=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
