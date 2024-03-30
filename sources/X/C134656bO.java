package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6bO  reason: invalid class name and case insensitive filesystem */
public final class C134656bO implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C133926aD();
    public final String A00;
    public final List A01;
    public final boolean A02;

    public C134656bO(String str, List list, boolean z) {
        AnonymousClass00C.A0D(str, 2);
        this.A02 = z;
        this.A00 = str;
        this.A01 = list;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134656bO) {
                C134656bO r5 = (C134656bO) obj;
                if (this.A02 != r5.A02 || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
        parcel.writeString(this.A00);
        List list = this.A01;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        Iterator A0o = C90474aD.A0o(parcel, list);
        while (A0o.hasNext()) {
            ((C134606bJ) A0o.next()).writeToParcel(parcel, i);
        }
    }

    public int hashCode() {
        return C36381kD.A08(this.A00, C36341k9.A01(this.A02 ? 1 : 0) * 31) + AnonymousClass000.A0H(this.A01);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ProductVariantAvailabilityListing(isAvailable=");
        A0u.append(this.A02);
        A0u.append(", productId=");
        A0u.append(this.A00);
        A0u.append(", options=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
