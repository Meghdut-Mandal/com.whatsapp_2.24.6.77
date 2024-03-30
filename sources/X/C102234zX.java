package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4zX  reason: invalid class name and case insensitive filesystem */
public final class C102234zX extends C134456b4 {
    public static final Parcelable.Creator CREATOR = new C133986aJ();
    public final String A00;

    public C102234zX(String str) {
        AnonymousClass00C.A0D(str, 1);
        this.A00 = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C102234zX) && AnonymousClass00C.A0J(this.A00, ((C102234zX) obj).A00));
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
        A0u.append("TextOption(value=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
