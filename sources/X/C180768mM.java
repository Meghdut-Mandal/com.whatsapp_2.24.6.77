package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8mM  reason: invalid class name and case insensitive filesystem */
public final class C180768mM extends C206229sv {
    public static final Parcelable.Creator CREATOR = new C205999sY();
    public final String A00;

    public C180768mM(String str) {
        AnonymousClass00C.A0D(str, 1);
        this.A00 = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C180768mM) && AnonymousClass00C.A0J(this.A00, ((C180768mM) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Geosuspension(countryCode=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
