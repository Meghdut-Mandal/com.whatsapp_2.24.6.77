package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9tR  reason: invalid class name and case insensitive filesystem */
public final class C206459tR implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205549rp();
    public final String A00;

    public C206459tR(String str) {
        AnonymousClass00C.A0D(str, 1);
        this.A00 = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C206459tR) && AnonymousClass00C.A0J(this.A00, ((C206459tR) obj).A00));
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
        A0u.append("FlowsCatalogResponseData(rawResponse=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
