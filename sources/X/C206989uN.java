package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.9uN  reason: invalid class name and case insensitive filesystem */
public final class C206989uN implements Parcelable {
    public static final C206989uN A03 = new C206989uN(new C206409tM[0]);
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(10);
    public int A00;
    public final int A01;
    public final C206409tM[] A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C206989uN r5 = (C206989uN) obj;
            if (this.A01 != r5.A01 || !Arrays.equals(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.A02);
        this.A00 = hashCode;
        return hashCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A01;
        parcel.writeInt(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            parcel.writeParcelable(this.A02[i3], 0);
        }
    }

    public C206989uN(Parcel parcel) {
        int readInt = parcel.readInt();
        this.A01 = readInt;
        this.A02 = new C206409tM[readInt];
        for (int i = 0; i < this.A01; i++) {
            this.A02[i] = C36411kG.A0H(parcel, C206409tM.class);
        }
    }

    public C206989uN(C206409tM... r2) {
        this.A02 = r2;
        this.A01 = 0;
    }
}
