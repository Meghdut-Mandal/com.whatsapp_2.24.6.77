package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.9tK  reason: invalid class name and case insensitive filesystem */
public final class C206389tK implements Parcelable {
    public static final AnonymousClass7c0 CREATOR = AnonymousClass9z3.A00;
    public int A00;
    public final int A01;
    public final C207099uY[] A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && Arrays.equals(this.A02, ((C206389tK) obj).A02);
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
        parcel.writeParcelable(this.A02[0], 0);
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = 16337 + Arrays.hashCode(this.A02);
        this.A00 = hashCode;
        return hashCode;
    }

    public C206389tK(C207099uY... r4) {
        this.A02 = r4;
        int A012 = C203249nb.A01(r4[0].A0S);
        this.A01 = A012 == -1 ? C203249nb.A01(r4[0].A0P) : A012;
    }
}
