package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XF  reason: invalid class name */
public final class AnonymousClass3XF implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C66463Wb();
    public final int A00;
    public final int A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3XF) {
                AnonymousClass3XF r5 = (AnonymousClass3XF) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public AnonymousClass3XF(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BackwardCompatibilityEvent(reason=");
        A0u.append(this.A01);
        A0u.append(", feature=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
