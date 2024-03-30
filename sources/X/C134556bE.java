package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6bE  reason: invalid class name and case insensitive filesystem */
public final class C134556bE implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134136aY();
    public final List A00;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C134556bE) && AnonymousClass00C.A0J(this.A00, ((C134556bE) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        Iterator A0o = C90474aD.A0o(parcel, this.A00);
        while (A0o.hasNext()) {
            ((C134776ba) A0o.next()).writeToParcel(parcel, i);
        }
    }

    public C134556bE(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MetaAISearchSuggestions(suggestions=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
