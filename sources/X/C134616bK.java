package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6bK  reason: invalid class name and case insensitive filesystem */
public final class C134616bK implements Parcelable {
    public static final C134036aO CREATOR = new C134036aO();
    public final int A00;
    public final int A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134616bK) {
                C134616bK r5 = (C134616bK) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public C134616bK(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MapViewLayer(layerZoomLevelIndex=");
        A0u.append(this.A00);
        A0u.append(", regularPinCount=");
        return C36321k7.A0G(A0u, this.A01);
    }
}
