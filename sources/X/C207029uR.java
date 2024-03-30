package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.9uR  reason: invalid class name and case insensitive filesystem */
public final class C207029uR implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(22);
    public final long A00;
    public final B5K[] A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C207029uR r7 = (C207029uR) obj;
            if (!Arrays.equals(this.A01, r7.A01) || this.A00 != r7.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(this.A00, Arrays.hashCode(this.A01) * 31);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(r3);
        for (B5K writeParcelable : this.A01) {
            parcel.writeParcelable(writeParcelable, 0);
        }
        parcel.writeLong(this.A00);
    }

    public C207029uR(Parcel parcel) {
        this.A01 = new B5K[parcel.readInt()];
        int i = 0;
        while (true) {
            Object[] objArr = this.A01;
            if (i < objArr.length) {
                objArr[i] = C36411kG.A0H(parcel, B5K.class);
                i++;
            } else {
                this.A00 = parcel.readLong();
                return;
            }
        }
    }

    public String toString() {
        String A0z;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("entries=");
        C90514aH.A1T(A0u, this.A01);
        long j = this.A00;
        if (j == -9223372036854775807L) {
            A0z = "";
        } else {
            A0z = C36381kD.A0z(", presentationTimeUs=", AnonymousClass000.A0u(), j);
        }
        return AnonymousClass000.A0q(A0z, A0u);
    }

    public C207029uR(B5K... b5kArr) {
        this.A00 = -9223372036854775807L;
        this.A01 = b5kArr;
    }
}
