package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9u6  reason: invalid class name and case insensitive filesystem */
public final class C206849u6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(48);
    public int A00;
    public final boolean A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public C206849u6(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = AnonymousClass000.A1O(parcel.readInt());
    }

    public C206849u6() {
        this.A01 = false;
    }
}
