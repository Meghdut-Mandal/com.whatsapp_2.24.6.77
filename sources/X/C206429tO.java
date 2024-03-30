package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: X.9tO  reason: invalid class name and case insensitive filesystem */
public final class C206429tO implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(7);
    public int A00;
    public final String A01;
    public final String A02;
    public final UUID A03;
    public final byte[] A04;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C206429tO)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C206429tO r4 = (C206429tO) obj;
        if (!C197059b4.A00(this.A01, r4.A01) || !C197059b4.A00(this.A02, r4.A02) || !C197059b4.A00(this.A03, r4.A03) || !Arrays.equals(this.A04, r4.A04)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int A08 = C36381kD.A08(this.A02, (C36391kE.A0A(this.A03) + C36341k9.A09(this.A01)) * 31) + Arrays.hashCode(this.A04);
        this.A00 = A08;
        return A08;
    }

    public void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.A03;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeByteArray(this.A04);
    }

    public C206429tO(Parcel parcel) {
        this.A03 = new UUID(parcel.readLong(), parcel.readLong());
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.createByteArray();
    }
}
