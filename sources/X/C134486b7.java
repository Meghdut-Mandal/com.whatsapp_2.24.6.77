package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6b7  reason: invalid class name and case insensitive filesystem */
public final class C134486b7 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134356au();
    public final String A00;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A00);
    }

    public C134486b7(String str) {
        this.A00 = str;
    }
}
