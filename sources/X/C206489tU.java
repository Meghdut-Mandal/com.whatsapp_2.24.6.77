package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9tU  reason: invalid class name and case insensitive filesystem */
public final class C206489tU implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206039sc();
    public final List A00;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C206489tU) && AnonymousClass00C.A0J(this.A00, ((C206489tU) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        Iterator A0o = C90474aD.A0o(parcel, this.A00);
        while (A0o.hasNext()) {
            ((C207219uk) A0o.next()).writeToParcel(parcel, i);
        }
    }

    public C206489tU(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CarouselContent(cards=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
