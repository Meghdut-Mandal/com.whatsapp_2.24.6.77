package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2Z4  reason: invalid class name */
public final class AnonymousClass2Z4 extends AnonymousClass3X8 {
    public static final Parcelable.Creator CREATOR = new C66683Wx();
    public final C28981Uw A00;
    public final String A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2Z4) {
                AnonymousClass2Z4 r5 = (AnonymousClass2Z4) obj;
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
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    public int hashCode() {
        return C36391kE.A0A(this.A00) + this.A01.hashCode();
    }

    public AnonymousClass2Z4(C28981Uw r1, String str) {
        C36321k7.A0x(r1, str);
        this.A00 = r1;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Geosuspension(newsletterJid=");
        A0u.append(this.A00);
        A0u.append(", countryCode=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
