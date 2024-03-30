package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9tS  reason: invalid class name and case insensitive filesystem */
public final class C206469tS implements Parcelable {
    public static final Parcelable.Creator A01 = C23180B8o.A00(20);
    public String A00;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof C206469tS) && AnonymousClass00C.A0J(((C206469tS) obj).A00, this.A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A00);
    }

    public C206469tS(String str) {
        this.A00 = str;
    }

    public String toString() {
        return this.A00;
    }
}
