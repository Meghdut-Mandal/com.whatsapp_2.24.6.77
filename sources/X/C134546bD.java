package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6bD  reason: invalid class name and case insensitive filesystem */
public final class C134546bD implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C133916aC();
    public final List A00;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C134546bD) && AnonymousClass00C.A0J(this.A00, ((C134546bD) obj).A00));
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        List list = this.A00;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        Iterator A0o = C90474aD.A0o(parcel, list);
        while (A0o.hasNext()) {
            ((C134656bO) A0o.next()).writeToParcel(parcel, i);
        }
    }

    public int hashCode() {
        return AnonymousClass000.A0H(this.A00);
    }

    public C134546bD(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ProductVariantAvailability(listings=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
