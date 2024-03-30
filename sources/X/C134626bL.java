package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6bL  reason: invalid class name and case insensitive filesystem */
public final class C134626bL implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134146aZ();
    public final float A00;
    public final int A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134626bL) {
                C134626bL r5 = (C134626bL) obj;
                if (!(this.A01 == r5.A01 && Float.compare(this.A00, r5.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
    }

    public int hashCode() {
        return C90514aH.A0C(this.A01 * 31, this.A00);
    }

    public C134626bL(int i, float f) {
        this.A01 = i;
        this.A00 = f;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ShapeStickerLayoutData(lineColor=");
        A0u.append(this.A01);
        A0u.append(", lineWidth=");
        return C90464aC.A0g(A0u, this.A00);
    }
}
