package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9tT  reason: invalid class name and case insensitive filesystem */
public final class C206479tT implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205969sV();
    public final boolean A00;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C206479tT) && this.A00 == ((C206479tT) obj).A00);
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public int hashCode() {
        return C36341k9.A01(this.A00 ? 1 : 0);
    }

    public C206479tT(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MerchantAccountSettings(buyerInitiatedPaymentEnabled=");
        return C36321k7.A0H(A0u, this.A00);
    }
}
