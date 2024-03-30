package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.9tQ  reason: invalid class name and case insensitive filesystem */
public final class C206449tQ implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(8);
    public final B5L[] A00;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A00, ((C206449tQ) obj).A00);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(r3);
        for (B5L writeParcelable : this.A00) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public C206449tQ(Parcel parcel) {
        this.A00 = new B5L[parcel.readInt()];
        int i = 0;
        while (true) {
            B5L[] b5lArr = this.A00;
            if (i < b5lArr.length) {
                parcel.readParcelable(B5L.class.getClassLoader());
                b5lArr[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("entries=");
        C90514aH.A1T(A0u, this.A00);
        return A0u.toString();
    }
}
